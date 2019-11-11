package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * <pre>
 * 
 *  Bosum ERP
 *  File: UUIDGenerater.java
 * 
 *  Ascender, Inc.
 *  Copyright (C): 2015
 * 
 *  Description:
 *  TODO
 * 
 *  Notes:
 * 	$Id: UUIDGenerater.java 00000 2015年4月8日 下午5:13:35 ASCENDER\徐微 $ 
 * 
 *  Revision History
 *  &lt;Date&gt;,			&lt;Who&gt;,			&lt;What&gt;
 *  2015年4月8日					徐微					Initial.
 *  
 * </pre>
 */
public class UUIDGenerater
{
	
	/**
	 * generate the UUID value for primary key
	 *
	 * @return
	 */
	public static final synchronized String generateUUID()
	{
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	public static String feeOrderNo() {
		String timeStr = new Date().getTime()+"";
		String subTimeStr = timeStr.substring((timeStr.length()-8),timeStr.length());
		long trandNo =Math.round((Math.random()+ 1) * Integer.valueOf(subTimeStr));
		String sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		String orderNo = "F"+sdf+trandNo;
		return orderNo.substring(0,20);
	}

	public static String resOrderNo() {
		String timeStr = new Date().getTime()+"";
		String subTimeStr = timeStr.substring((timeStr.length()-8),timeStr.length());
		long trandNo =Math.round((Math.random()+ 1) * Integer.valueOf(subTimeStr));
		String sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
		String orderNo = "R"+sdf+trandNo;
		return orderNo.substring(0,20);
	}

}

/*
*$Log: av-env.bat,v $
*/