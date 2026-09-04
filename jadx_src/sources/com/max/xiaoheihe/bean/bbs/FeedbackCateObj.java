package com.max.xiaoheihe.bean.bbs;

import com.max.xiaoheihe.bean.news.FeedbackReasonObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedbackCateObj implements Serializable {
    public static final String CATE_FAVOUR = "favour";
    public static final String CATE_REPORT = "report";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1300547229922857294L;
    private String cate;
    private String col_count;
    private List<FeedbackReasonObj> options;
    private String text;

    public String getCate() {
        return this.cate;
    }

    public String getCol_count() {
        return this.col_count;
    }

    public List<FeedbackReasonObj> getOptions() {
        return this.options;
    }

    public String getText() {
        return this.text;
    }

    public void setCate(String str) {
        this.cate = str;
    }

    public void setCol_count(String str) {
        this.col_count = str;
    }

    public void setOptions(List<FeedbackReasonObj> list) {
        this.options = list;
    }

    public void setText(String str) {
        this.text = str;
    }
}
