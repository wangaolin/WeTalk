package org.aolin.com.common.msgType.req;

import org.aolin.com.common.base.req.BaseManage;
/**
 * 接受消息的地理位置
 * @author aolin
 *
 */
public class LocationMessage extends BaseManage {
	/*
	 * 地理位置纬度
	 */
	private String Location_X;
	/*
	 * 地理位置经度
	 */
	private String Location_Y;
	/*
	 * 地图缩放大小
	 */
	private String Scale;
	/*
	 * 地理位置信息
	 */
	private String Label;
	
	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String locationX) {
		Location_X = locationX;
	}
	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String locationY) {
		Location_Y = locationY;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
	
}
