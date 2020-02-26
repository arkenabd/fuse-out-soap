package com.netty.fuse;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.tempuri.SendEmailRev1;
import org.tempuri.SendEmailRev1Response;
import org.tempuri.Service1;
import org.tempuri.Service1Soap;

import com.netty.fuse.util.Email;
import com.netty.fuse.util.FixLengthConf;
import com.netty.fuse.util.FixLengthMessageIn;
import com.netty.fuse.util.FixLengthMessageOut;
import com.netty.fuse.util.ISOUtil;

@Service
public class EchoService {

	public String sayHello(String inputVal) throws ISOException {
		// 1. Unpack FL Message
		// String word = "00000673020200120hnbnid-dSWDK000000658100192.168.87.32
		// AABBCCDDEEFFTHOSHOS00000QA20200120151650480 HOS_0024EAS00050 R10EN
		// _HLIHDLST_SWDKWSCONS9999
		// 2020012015165500658100000000658100PDFMAIL|didik.haryadi@kebhana.co.id
		// |5473010100|460221******9999 |123456|DIDIK HARYADI |Kartu Debit VISA IDR |
		// VISA IDR Debit Card |@@";
//		String word = inputVal;
//		String guess = "|";
//		word = "|" + word;
//		int index = word.indexOf(guess);
//		List<String> al = new ArrayList<String>();// creating new generic arraylist
//		List<String> paramInputList = new ArrayList<String>();
//		while (index >= 0) {
//			index = word.indexOf(guess, index + 1);
//
//			if (index != -1) {
//				System.out.println(index);
//				al.add(String.valueOf(index));
//			}
//
//		}
//		System.out.println("==========");
//		ISOUtil isoUtil = new ISOUtil();
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//			int val = isoUtil.ordinalIndexOf(word, "|", i + 3);
//			System.out.println("-->> " + val);
//			if (val == -1) {
//
//			} else {
//				System.out.println("---->> " + word.substring(Integer.parseInt(al.get(i)) + 1, val));
//				paramInputList.add(word.substring(Integer.parseInt(al.get(i)) + 1, val));
//			}
//		}
		List<FixLengthMessageIn> flconfList = new ArrayList<FixLengthMessageIn>();
		FixLengthConf conf = new FixLengthConf();
		flconfList = conf.getConf();
		String email = "";
		String id = "";
		String id2 = "";
		String id3 = "";
		String name = "";
		String cardtype = "";
		String cardtype2 = "";
		System.out.println("========Fix Length Config BEFORE========");
		for (int i = 0; i < flconfList.size(); i++) {

			System.out.println("field name :" + flconfList.get(i).getFieldName());
			System.out.println("start :" + flconfList.get(i).getIndexStart());
			System.out.println("end :" + flconfList.get(i).getIndexEnd());
			String fieldName = flconfList.get(i).getFieldName().toString();
			int start = Integer.parseInt(flconfList.get(i).getIndexStart().toString());
			int end = Integer.parseInt(flconfList.get(i).getIndexEnd().toString());
			System.out.println("=====================================");
			String value = inputVal.substring(start - 1, end);
			flconfList.set(i,
					new FixLengthMessageIn(fieldName, String.valueOf(start), String.valueOf(end), value.trim()));
			if (fieldName.equals("email")) {
				email = value;
			}
			if (fieldName.equals("id")) {
				id = value;
			}
			if (fieldName.equals("id2")) {
				id2 = value;
			}
			if (fieldName.equals("id3")) {
				id3 = value;
			}
			if (fieldName.equals("name")) {
				name = value;
			}
			if (fieldName.equals("cardtype")) {
				cardtype = value;
			}
			if (fieldName.equals("cardtype2")) {
				cardtype2 = value;
			}
		}
		System.out.println("========Fix Length Config AFTER========");

		System.out.println("email :" + email);
		System.out.println("id :" + id);
		System.out.println("id2 :" + id2);
		System.out.println("id3 :" + id3);
		System.out.println("name :" + name);
		System.out.println("cardtype :" + cardtype);
		System.out.println("cardtype2 :" + cardtype2);
		System.out.println("=====================================");

		// 2. Use the unpacked values as input to client services

		SendEmailRev1 sendEmail = new SendEmailRev1();
		SendEmailRev1Response emailResponse = new SendEmailRev1Response();
		Service1 service1 = new Service1();
		Service1Soap service1Soap = service1.getService1Soap();
		String sendEmailResponse = "";
		sendEmailResponse = service1Soap.sendEmailRev1(email, id, id2, id3, name, cardtype, cardtype2);
		// 3.If the response is 'Mail Sent!' then pack ISO8583
		System.out.println("Response soap send email : " + sendEmailResponse);
		// String result = "Mail Sent !!";
		if (sendEmailResponse.equals("Mail Sent !!")) {
			System.out.println("SOAP Response : " + sendEmailResponse);
		} else {
			// result = "no response";
			System.out.println("SOAP Response : " + sendEmailResponse);
		}
		System.out.println("Generate response...");
		GenerateFixLength flout = new GenerateFixLength();
		return flout.generate();
	}
}