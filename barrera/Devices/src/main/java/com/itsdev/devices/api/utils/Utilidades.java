package com.itsdev.devices.api.utils;

import java.io.StringWriter;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Utilidades {

	
	
	public static String format(String xml) {
		String resultado = "";
		
		try {
			Document e = DocumentHelper.parseText(xml);
			StringWriter sw = new StringWriter();
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter xw = new XMLWriter(sw,format);
			xw.write(e);
			resultado = sw.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			resultado = "";
		}
		return resultado;
		
	}
	
}
