package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class RecommendSettingsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5396866418889385620L;
    private String news_list_group;
    private String news_list_type;

    public String getNews_list_group() {
        return this.news_list_group;
    }

    public String getNews_list_type() {
        return this.news_list_type;
    }

    public void setNews_list_group(String str) {
        this.news_list_group = str;
    }

    public void setNews_list_type(String str) {
        this.news_list_type = str;
    }
}
