package com.max.xiaoheihe.bean.bbs;

import androidx.annotation.p0;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TopicNavObj implements Serializable {
    public static final String LABEL_ADVERTISE = "advertise";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5166523338107257417L;
    private ADReportItem ad_report;
    private String img;
    private String isReported;
    private String label;
    private String nav_id;
    private String protocol;
    private String text;
    private String topic_id;

    @p0
    public ADReportItem getAd_report() {
        return this.ad_report;
    }

    public String getImg() {
        return this.img;
    }

    public String getIsReported() {
        return this.isReported;
    }

    public String getLabel() {
        return this.label;
    }

    public String getNav_id() {
        return this.nav_id;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getText() {
        return this.text;
    }

    public String getTopic_id() {
        return this.topic_id;
    }

    public void setAd_report(@p0 ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setIsReported(String str) {
        this.isReported = str;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setNav_id(String str) {
        this.nav_id = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTopic_id(String str) {
        this.topic_id = str;
    }
}
