package org.aolin.com.common.msgType.resp;

import org.aolin.com.common.base.resp.BaseManage;
/**
 * 
 * @author aolin
 * @description 响应音乐消息
 * @date 2014-5-28上午09:39:10
 */
public class MusicMessage extends BaseManage {
	/*
	 * 音乐
	 */
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}
