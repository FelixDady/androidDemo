package com.linsen.h5.domain;

/**
 * 一个页面
 * 
 * @author linsen
 * 
 */
public class Page {
	private int tempId;// 模版id
	private String medias;// json数据 该页面的图片 文字等信息

	public int getTempId() {
		return tempId;
	}

	public void setTempId(int tempId) {
		this.tempId = tempId;
	}

	public String getMedias() {
		return medias;
	}

	public void setMedias(String medias) {
		this.medias = medias;
	}

}
