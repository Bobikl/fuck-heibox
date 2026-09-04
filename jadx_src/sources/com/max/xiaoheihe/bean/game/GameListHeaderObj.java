package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameListHeaderObj implements Serializable {
    public static final String KEY_COMPILATION = "compilation";
    public static final String KEY_STORE = "store";
    public static final String TYPE_H5 = "h5";
    public static final String TYPE_NATIVE = "native";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6587151857631388692L;
    private String bg_img;
    private String compilation_id;
    private String count;
    private String desc;
    private String key;
    private String link_id;
    private String title;
    private String type;
    private String url;

    public String getBg_img() {
        return this.bg_img;
    }

    public String getCompilation_id() {
        return this.compilation_id;
    }

    public String getCount() {
        return this.count;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getKey() {
        return this.key;
    }

    public String getLink_id() {
        return this.link_id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setBg_img(String str) {
        this.bg_img = str;
    }

    public void setCompilation_id(String str) {
        this.compilation_id = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLink_id(String str) {
        this.link_id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
