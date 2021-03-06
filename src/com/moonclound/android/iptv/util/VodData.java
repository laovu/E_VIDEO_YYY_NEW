package com.moonclound.android.iptv.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class VodData implements Serializable {
	private List<VodCategory> cat;
	private List<VodProgram> subcat;
	private Map<String, List<VodVideo>> video;

	
	public Map<String, List<VodVideo>> getVideo() {
		return video;
	}

	public void setVideo(Map<String, List<VodVideo>> video) {
		this.video = video;
	}

	public List<VodCategory> getCat() {
		return this.cat;
	}

	public List<VodProgram> getSubcat() {
		return this.subcat;
	}

	public void setCat(List<VodCategory> paramList) {
		this.cat = paramList;
	}

	public void setSubcat(List<VodProgram> paramList) {
		this.subcat = paramList;
	}

}
