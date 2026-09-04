package com.max.basebbs.bean.video;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class VideoInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8346379362321663829L;
    private String bilibili_id;
    private String duration;
    private HashMap<String, String> headers;
    private int height;
    private String is_manual;
    private String link_id;
    private List<VideoOptionUrlsObj> option_urls;
    private String play_times;
    private String rec_reason;
    private String source_site;
    private String thumb;
    private String url;
    private HashMap<String, String> url_info;
    private String vid;
    private String video_time;
    private String video_url;
    private List<VideoUrlsObj> video_urls;
    private int width;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Uf, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoObj)) {
            return false;
        }
        VideoInfoObj videoInfoObj = (VideoInfoObj) obj;
        return Objects.equals(getBilibili_id(), videoInfoObj.getBilibili_id()) && Objects.equals(getHeaders(), videoInfoObj.getHeaders()) && Objects.equals(getIs_manual(), videoInfoObj.getIs_manual()) && Objects.equals(getOption_urls(), videoInfoObj.getOption_urls()) && Objects.equals(getPlay_times(), videoInfoObj.getPlay_times()) && Objects.equals(getSource_site(), videoInfoObj.getSource_site()) && Objects.equals(getThumb(), videoInfoObj.getThumb()) && Objects.equals(getUrl(), videoInfoObj.getUrl()) && Objects.equals(getUrl_info(), videoInfoObj.getUrl_info()) && Objects.equals(getVid(), videoInfoObj.getVid()) && Objects.equals(getVideo_time(), videoInfoObj.getVideo_time()) && Objects.equals(getVideo_url(), videoInfoObj.getVideo_url()) && Objects.equals(getVideo_urls(), videoInfoObj.getVideo_urls()) && Objects.equals(getRec_reason(), videoInfoObj.getRec_reason()) && Objects.equals(getDuration(), videoInfoObj.getDuration());
    }

    public String getBilibili_id() {
        return this.bilibili_id;
    }

    public String getDuration() {
        return this.duration;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public int getHeight() {
        return this.height;
    }

    public String getIs_manual() {
        return this.is_manual;
    }

    public String getLink_id() {
        return this.link_id;
    }

    public List<VideoOptionUrlsObj> getOption_urls() {
        return this.option_urls;
    }

    public String getPlay_times() {
        return this.play_times;
    }

    public String getRec_reason() {
        return this.rec_reason;
    }

    public String getSource_site() {
        return this.source_site;
    }

    public String getThumb() {
        return this.thumb;
    }

    public String getUrl() {
        return this.url;
    }

    public HashMap<String, String> getUrl_info() {
        return this.url_info;
    }

    public String getVid() {
        return this.vid;
    }

    public String getVideo_time() {
        return this.video_time;
    }

    public String getVideo_url() {
        return this.video_url;
    }

    public List<VideoUrlsObj> getVideo_urls() {
        return this.video_urls;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Vf, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getBilibili_id(), getHeaders(), getIs_manual(), getOption_urls(), getPlay_times(), getSource_site(), getThumb(), getUrl(), getUrl_info(), getVid(), getVideo_time(), getVideo_url(), getVideo_urls(), getRec_reason(), getDuration());
    }

    public void setBilibili_id(String str) {
        this.bilibili_id = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setIs_manual(String str) {
        this.is_manual = str;
    }

    public void setLink_id(String str) {
        this.link_id = str;
    }

    public void setOption_urls(List<VideoOptionUrlsObj> list) {
        this.option_urls = list;
    }

    public void setPlay_times(String str) {
        this.play_times = str;
    }

    public void setRec_reason(String str) {
        this.rec_reason = str;
    }

    public void setSource_site(String str) {
        this.source_site = str;
    }

    public void setThumb(String str) {
        this.thumb = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrl_info(HashMap<String, String> map) {
        this.url_info = map;
    }

    public void setVid(String str) {
        this.vid = str;
    }

    public void setVideo_time(String str) {
        this.video_time = str;
    }

    public void setVideo_url(String str) {
        this.video_url = str;
    }

    public void setVideo_urls(List<VideoUrlsObj> list) {
        this.video_urls = list;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }
}
