package com.max.basebbs.bean.video;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class VideoInfoResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8510818711375680816L;
    private Map<String, String> url_info;
    private String video_thumb;
    private String video_url;

    public Map<String, String> getUrl_info() {
        return this.url_info;
    }

    public String getVideo_thumb() {
        return this.video_thumb;
    }

    public String getVideo_url() {
        return this.video_url;
    }

    public void setUrl_info(Map<String, String> map) {
        this.url_info = map;
    }

    public void setVideo_thumb(String str) {
        this.video_thumb = str;
    }

    public void setVideo_url(String str) {
        this.video_url = str;
    }
}
