package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSPostArticleAlertObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3344886794096243627L;
    private String show_add_topic_guide_alert;
    private String text;
    private String title;

    public String getShow_add_topic_guide_alert() {
        return this.show_add_topic_guide_alert;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public void setShow_add_topic_guide_alert(String str) {
        this.show_add_topic_guide_alert = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
