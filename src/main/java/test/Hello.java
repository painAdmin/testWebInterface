package test;


import java.util.Scanner;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;
import cn.com.webxml.QqOnlineWebService;
import cn.com.webxml.QqOnlineWebServiceSoap;


public class Hello {

	public static void main(String[] args){
//		MobileCodeWS mobileCodeWS=new MobileCodeWS();
//		
//		MobileCodeWSSoap mobile=mobileCodeWS.getMobileCodeWSSoap();
//		String mobileCode="13146276487";
//        String info= mobile.getMobileCodeInfo(mobileCode, null);
//        System.out.println(info);
		QqOnlineWebService service=new QqOnlineWebService();
		QqOnlineWebServiceSoap isOnline=service.getQqOnlineWebServiceSoap();

		String info=isOnline.qqCheckOnline("835");
		String msg="";
		if("Y".equals(info)){
			msg="在线";
		}else if("N".equals(info)){
			msg="离线";
		}else if("E".equals(info)){
			msg="QQ号码错误";
		}else if("A".equals(info)){
			msg="商业用户验证失败";
		}else if("V".equals(info)){
			msg="免费用户超过数量";
		}else{
			msg="未知错误";
		}
		System.out.println(msg);
	}
}
