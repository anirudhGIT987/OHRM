package com.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogUtility {

	public static Logger log = Logger.getLogger("LogUtility");
	
	public static void info(String message)
	{
		PropertyConfigurator.configure("D:\\Jaava\\Eclipse Workspace\\OrangeHrMWebApplicationPOMTesting\\Log4j.properties");
		log.info(message);
	}
	
	
}
