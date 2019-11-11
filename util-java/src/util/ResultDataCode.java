package util;


public class ResultDataCode
{
	/**
	 * 服务器相关代码
	 */
	public static class Server
	{
		/**
		 * 请求成功
		 */
		public static final int SUCESS_CODE = 2000;
		
		/**
		 * 服务器代码内部运行错误
		 */
		public static final int SERVER_ERROR_CODE = 3000;
	}
	
	
	/**
	 * 安全相关的代号
	 */
	public static class Security
	{
		/**
		 * 请求Token已过期
		 */
		public static final int TOKEN_OVERTIME_ERROR_CODE = 5000;
		
		/**
		 * 非法请求Token
		 */
		public static final int TOKEN_ILLEGAL_ERROR_CODE = 5001;
		
		/**
		 * 用户ID不存在
		 */
		public static final int ID_NOT_EXIST_ERROR_CODE = 5002;
		
		/**
		 * 用户密码不正确
		 */
		public static final int PASSWORD_ERROR_CODE = 5003;
		
		/**
		 * 用户帐号已被注销
		 */
		public static final int USER_ACCOUNT_HAS_BEEN_CLOSED = 5004;
		
		/**
		 * 用户未登录
		 */
		public static final int USER_NOT_LOGIN_ERROR_CODE = 5005;
		
		/**
		 * 用户无操作权限
		 */
		public static final int USER_HAS_NO_OPERATOR_PERMISSION_ERROR_CODE = 5006;
		
		/**
		 * 用户无数据权限
		 */
		public static final int USER_HAS_NO_DATA_PERMISSION_ERROR_CODE = 5007;
		
		/**
		 * 用户微信未绑定
		 */
		public static final int USER_WECHAT_NOT_BINDING_ERROR_CODE = 5008;
		
		/**
		 * 用户企鹅未绑定
		 */
		public static final int USER_QQ_NOT_BINDING_ERROR_CODE = 5009;
		
		/**
		 * 发送请求服务器与本服务器时间相差达到1分钟以上
		 */
		public static final int REQUEST_SERVER_TIME_OUT_SYNC = 5010;
		
		/**
		 * 用户密码没有设定
		 */
		public static final int USER_PASSWORD_NOT_SET = 5011;
		
		/**
		 * 客户微信未绑定
		 */
		public static final int CONTACT_WECHAT_NOT_BINDING_ERROR_CODE = 5012;

		/**
		 * 用户密码已失效过期
		 */
		public static final int PWD_EXPIRED_ERROR_CODE = 5013;
		
		/**
		 * 用户账号因超过尝试密码次数被锁定
		 */
		public static final int PWD_WRONGTIMES_ERROR_CODE = 5014;

        /**
         * 用户帐号已在另外手机登陆
         */
        public static final int USER_REMOTE_LOGIN_ERROR_CODE = 5015;
	}
	
	
	/**
	 * 参数相关代码
	 */
	public static class Param
	{
		/**
		 * 请求参数为空错误
		 */
		public static final int PARAM_EMPTY_ERROR_CODE = 5100;
		
		/**
		 * 请求参数不匹配错误
		 */
		public static final int PARAM_ILLEGAL_ERROR_CODE = 5101;
		
		/**
		 * 请求参数多余
		 */
		public static final int PARAM_SUPERFLUOUS_ERROR_CODE = 5102;
	}
	
	

	/**
	 * 数据相关的代号
	 */
	public static class Data
	{
		/**
		 * 数据验证失败
		 */
		public static final int DATA_VALIDATE_ERROR_CODE = 5200;
		
		/**
		 * 数据重复错误
		 */
		public static final int DATA_EXISTS_ERROR_CODE = 5201;
		
		/**
		 * 数据不存在数据库中
		 */
		public static final int DATA_NOT_EXISTS_ERROR_CODE = 5202;
		
		/**
		 * 数据与理想数据不匹配
		 */
		public static final int DATA_NOT_MATCH_ERROR_CODE = 5203;
	}
}