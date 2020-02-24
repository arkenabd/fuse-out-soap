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
		String word = inputVal;
		String guess = "|";
		word = "|" + word;
		int index = word.indexOf(guess);
		List<String> al = new ArrayList<String>();// creating new generic arraylist
		List<String> paramInputList = new ArrayList<String>();
		while (index >= 0) {
			index = word.indexOf(guess, index + 1);

			if (index != -1) {
				System.out.println(index);
				al.add(String.valueOf(index));
			}

		}
		System.out.println("==========");
		ISOUtil isoUtil = new ISOUtil();
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			int val = isoUtil.ordinalIndexOf(word, "|", i + 3);
			System.out.println("-->> " + val);
			if (val == -1) {

			} else {
				System.out.println("---->> " + word.substring(Integer.parseInt(al.get(i)) + 1, val));
				paramInputList.add(word.substring(Integer.parseInt(al.get(i)) + 1, val));
			}
		}
		// 2. Use the unpacked values as input to client services

		SendEmailRev1 sendEmail = new SendEmailRev1();
		SendEmailRev1Response emailResponse = new SendEmailRev1Response();
		Service1 service1 = new Service1();
		Service1Soap service1Soap = service1.getService1Soap();
		String sendEmailResponse = "";
		sendEmailResponse = service1Soap.sendEmailRev1(paramInputList.get(0).toString(),
				paramInputList.get(0).toString(), paramInputList.get(0).toString(), paramInputList.get(0).toString(),
				paramInputList.get(0).toString(), paramInputList.get(0).toString(), paramInputList.get(0).toString());
		// 3.If the response is 'Mail Sent!' then pack ISO8583
		String result = "Mail Sent !!";
		if (sendEmailResponse.equals("Mail Sent !!")) {

		} else {
			result = "no response";
		}
		System.out.println("Generate response...");
		return "00000379020200120hliapp01E31___AAAAAFGi01192.168.87.61                          11-22-33-44 TEXTEXT00000SA20200120151655280151655000                        0024HOS_EAR0000120200120151655280100            R10KRXTN                0024EB1                                                       1000000085SWDKWSCONS9999                              2020012015165500658100000000658191PDFMAIL@@";
	}
}