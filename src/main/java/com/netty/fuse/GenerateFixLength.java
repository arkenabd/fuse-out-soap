package com.netty.fuse;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GenerateFixLength {
	public String randomNumeric(int n) {
		return RandomStringUtils.randomNumeric(n);
	}

	public String randomAlphabetic(int n) {
		return RandomStringUtils.randomAlphabetic(n);
	}

	public String randomAlphanumeric(int n) {
		return RandomStringUtils.randomAlphanumeric(n);
	}

	public String generate() throws ISOException {
		System.out.println("INSIDE METHOD GENERATE FL ");

		String component1 = StringUtils.rightPad(randomNumeric(17), 17, " ");
		String component2 = StringUtils.rightPad("hliapp", 6, " ");
		String component3 = StringUtils.rightPad(randomAlphanumeric(5), 5, " ");
		String component4 = StringUtils.rightPad("___", 3, " ");
		String component5 = StringUtils.rightPad(randomAlphanumeric(10), 10, " ");
		String component6 = StringUtils.rightPad("192.168.87.61", 39, " ");
		String component7 = StringUtils.rightPad(
				randomNumeric(2) + "-" + randomNumeric(2) + "-" + randomNumeric(2) + "-" + randomNumeric(2), 12, " ");
		String component8 = StringUtils.rightPad("TEXTEXT00000SA" + randomNumeric(20) + "655000", 64, " ");
		String component9 = StringUtils.rightPad("0024HOS_EAR0000120200120151655280100", 48, " ");
		String component10 = StringUtils.rightPad("R10KRXTN", 24, " ");
		String component11 = StringUtils.rightPad("0024EB1", 62, " ");
		String component12 = StringUtils.rightPad("1000000085SWDKWSCONS9999", 54, " ");
		String component13 = StringUtils.rightPad("2020012015165500658100000000" + randomNumeric(6) + "PDFMAIL@@", 43,
				" ");

		StringBuilder str = new StringBuilder(component1);
		str.append(component2);
		str.append(component3);
		str.append(component4);
		str.append(component5);
		str.append(component6);
		str.append(component7);
		str.append(component8);
		str.append(component9);
		str.append(component10);
		str.append(component11);
		str.append(component12);
		str.append(component13);

		return str.toString();
	}

}