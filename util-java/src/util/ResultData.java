package util;

import java.io.Serializable;
import java.util.Date;



public class ResultData implements Serializable
{
	private static final long serialVersionUID = 5105652949759178422L;

	private boolean success;
	private Object data;
	private Object error;
	private int code = ResultDataCode.Server.SUCESS_CODE;
	private Long timestamp = (new Date()).getTime();

	public ResultData()
	{
		
	}
	
	/**
	 * 执行成功时设置的数据
	 * @param data 成功时返回的字符串, JSONObject或者JSONArray对象
	 */
	public ResultData(Object data)
	{
		this.success = true;
		this.data = data;
	}
	
	/**
	 * 执行成功时设置的数据
	 * @param data 成功时返回的字符串, JSONObject或者JSONArray对象
	 */
	public ResultData(Object data, String errorMessage)
	{
		this.success = true;
		this.data = data;
		this.error = errorMessage;
	}
	
	/**
	 * 失败时返回的数据
	 * @param code 执行失败时代码
	 * @param error 失败时给出的错误提示信息
	 */
	public ResultData(int code, Object error)
	{
		this.success = false;
		this.code = code;
		this.error = error;
	}
	
	/**
	 * 执行是否成功
	 * @return
	 */
	public boolean isSuccess()
	{
		return success;
	}

	/**
	 * 执行是否成功
	 * @param success
	 */
	public void setSuccess(boolean success)
	{
		this.success = success;
	}

	/**
	 * 成功时返回的字符串, JSONObject或者JSONArray对象
	 * @return
	 */
	public Object getData()
	{
		return data;
	}

	/**
	 * 成功时返回的字符串, JSONObject或者JSONArray对象
	 * @param data
	 */
	public void setData(Object data)
	{
		this.data = data;
	}

	/**
	 * 失败时给出的错误提示信息
	 * @return
	 */
	public Object getError()
	{
		return error;
	}

	/**
	 * 失败时给出的错误提示信息
	 * @param error
	 */
	public void setError(String error)
	{
		this.error = error;
	}

	/**
	 * 执行结果代码，对应于ResultDataCode类中的值
	 * @return
	 */
	public int getCode()
	{
		return code;
	}

	/**
	 * 执行结果代码，对应于ResultDataCode类中的值
	 *
	 * @return
	 */
	public void setCode(int code)
	{
		this.code = code;
	}
	
	/**
	 * 返回结果时的服务器时间
	 * @return
	 */
	public Long getTimestamp()
	{
		return timestamp;
	}

	/**
	 * 返回结果时的服务器时间
	 * @return
	 */
	public void setTimestamp(Long timestamp)
	{
		this.timestamp = timestamp;
	}

	@Override
	public String toString()
	{
		StringBuilder resultSB = new StringBuilder();
		resultSB.append("<sucess>" + success + "</sucess>");
		resultSB.append("<code>  => " + code + "</code>");
		resultSB.append("<data> => " + data + "</data>");
		resultSB.append("<error> => " + error + "</error>");
		resultSB.append("<timestamp>" + timestamp+"</timestamp>");
		return resultSB.toString();
	}
}

/*
*$Log: av-env.bat,v $
*/