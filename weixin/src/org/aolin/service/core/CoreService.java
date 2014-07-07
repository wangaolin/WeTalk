package org.aolin.service.core;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aolin.com.common.msgType.resp.TextMessage;
import org.aolin.util.Constant;
import org.aolin.util.ParsingXML;
import org.aolin.util.ResposeManageToXML;
import org.springframework.stereotype.Service;
/**
 * @author aolin
 * @description 核心请求、响应类,负责分配请求
 * @date 2014-5-28下午07:50:58
 */

@Service
public class CoreService {
	/*
	 * 处理微信发来的请求
	 */
	public static String processRequest(HttpServletRequest request) throws Exception{
		String resMessage = null;
		// 默认响应文本内容
		String respContent = "拼命加载中...";
		
		//1、先解析 微信发来的请求--->  因为请求是以xml 的形式发送的，内容都在xml中
		Map<String, String> requestMap = ParsingXML.parseXML(request);
		
		// 获取发送者账号
		String fromUserName = requestMap.get("FromUserName");
		//开发者微信号 
		String toUserName = requestMap.get("ToUserName");
		//请求类型
		String msgType = requestMap.get("MsgType");
		
		//默认回复文本信息
		TextMessage textMessage = new TextMessage();
		textMessage.setFromUserName(fromUserName);
		textMessage.setToUserName(toUserName);
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(Constant.REQ_MESSAGE_TYPE_TEXT);
		
		if(msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)){
			respContent = "您发的是文本消息";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_IMAGE)) {
			respContent = "您发的是图片";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_LINK)) {
			respContent = "您发的是连接";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_LOCATION)) {
			respContent = "您发的是地理位置";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_VIDEO)) {
			respContent = "您发的是声音";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_VOICE)) {
			respContent = "您发的是视频";
		}
		textMessage.setContent(respContent);
		resMessage = ResposeManageToXML.textManageToXML(textMessage);
			return resMessage;
	}
}
