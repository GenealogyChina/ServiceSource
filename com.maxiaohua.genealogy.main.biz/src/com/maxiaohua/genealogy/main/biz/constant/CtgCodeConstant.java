/* CIS
* (C) Copyright IBM Japan, Ltd. 2013, All Rights Reserved.
*/
package com.maxiaohua.genealogy.main.biz.constant;

/**
 * 类别管理class
 *
 * 変更履歴
 * REV.         変更日付           変更者              変更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2014/04/29         GD                  新規作成
 *
 */
public interface CtgCodeConstant {
//	/**
//	* SEX 性别
//	*/
//	public static enum SEX {
//		/**
//		* 0:其他
//		*/
//		OTHER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},
//		/**
//		* 1:女
//		*/
//		FEMALE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//		/**
//		* 2:男
//		*/
//		MALE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		}
//	}
//	
//	/**
//	* SEX 性别
//	*/
//	public static enum STREAMTYPE {
//		/**
//		* 0:图片
//		*/
//		PICTURE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},
//		/**
//		* 1:视频
//		*/
//		VIDEO {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		}
//	}
//	
//	/**
//	* APP_SOFTWARE_TYPE 终端类型
//	*/
//	public static enum APP_SOFTWARE_TYPE {
//		/**
//		* 6:TopID
//		*/
//		OWNER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "6";
//			}
//		},
//		/**
//		* 1:Android客户端
//		*/
//		ANDROID_CLIENT {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//		/**
//		* 2:IOS客户端
//		*/
//		IOS_CLIENT {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		},
//		/**
//		* 3:Android工作端
//		*/
//		ANDROID_WOKER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "3";
//			}
//		}		
//	}
//	
//	/**
//	* ORDER_STATUS 订单状态
//	*/
//	public static enum ORDER_STATUS {
//		/**
//		* 8:TopID
//		*/
//		OWNER {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "8";
//			}
//		},
//		/**
//		* 0:已取消
//		*/
//		CANCEL {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		},		
//		/**
//		* 1:待支付
//		*/
//		CREATEED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		},
//		/**
//		* 2:已付款
//		*/
//		PAID {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		},
//		/**
//		* 3:处理中
//		*/
//		PROCESSING {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "3";
//			}
//		},
//		/**
//		* 4:已完成
//		*/
//		COMPLETED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "4";
//			}
//		},
//		/**
//		* 5:已评论
//		*/
//		COMMENTED {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "5";
//			}
//		}
//	}
	
	/**
	* ALL_DEL_FLG 删除区分
	*/
	public static enum ALL_DEL_FLG {
		/**
		* 0:未删除
		*/
		NO_DELETED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},		
		/**
		* 1:删除
		*/
		DELETED {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
	}
	
	/**
	* M02_SYSTEM_VERSION_IS_FORCE 更新区分
	*/
	public static enum M02_SYSTEM_VERSION_IS_FORCE {
		/**
		* 0:非强制
		*/
		FALSE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "0";
			}
		},		
		/**
		* 1:强制
		*/
		TRUE {
			/* (non-Javadoc)
			 * @see java.lang.Enum#toString()
			 */
			@Override
			public String toString() {
				return "1";
			}
		},
	}
	
//	/**
//	* LOGIN_STATUS 登陆状态
//	*/
//	public static enum LOGIN_STATUS {
//		
//		/**
//		* 1:在线
//		*/		
//		ONLINE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//			
//		},
//		/**
//		* 0:离线
//		*/
//		OFFLINE {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//		}
//		 
//	}
//	
//	/**
//	* 识别码：
//	* 0：Android
//	* 1：Ios
//	* 2：Windows Phone
//	* 3：其他
//	*/
//	public static enum IMSI_TYPE {
//		
//		/**
//		* 0:  
//		*/		
//		ANDROID {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "0";
//			}
//			
//		},
//		IOS
//		/**
//		* 1 
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "1";
//			}
//		} 	 ,
//		WP
//		/**
//		* 2: 
//		*/
//		 {
//			/* (non-Javadoc)
//			 * @see java.lang.Enum#toString()
//			 */
//			@Override
//			public String toString() {
//				return "2";
//			}
//		} 
//	}
}
