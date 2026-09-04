package com.max.xiaoheihe.bean;

import androidx.annotation.p0;
import bb.c;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class InnerAdsInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2497912216438219149L;
    private ADReportItem ad_report;
    private String ads_id;
    private String btn_text;
    private String desc;
    private String end_time;
    private String protocol;
    private String show_interval;
    private String start_time;
    private String title;
    private String type;
    private String url;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.qM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InnerAdsInfoObj innerAdsInfoObj = (InnerAdsInfoObj) obj;
        String str = this.btn_text;
        if (str == null ? innerAdsInfoObj.btn_text != null : !str.equals(innerAdsInfoObj.btn_text)) {
            return false;
        }
        String str2 = this.desc;
        if (str2 == null ? innerAdsInfoObj.desc != null : !str2.equals(innerAdsInfoObj.desc)) {
            return false;
        }
        String str3 = this.end_time;
        if (str3 == null ? innerAdsInfoObj.end_time != null : !str3.equals(innerAdsInfoObj.end_time)) {
            return false;
        }
        String str4 = this.protocol;
        if (str4 == null ? innerAdsInfoObj.protocol != null : !str4.equals(innerAdsInfoObj.protocol)) {
            return false;
        }
        String str5 = this.show_interval;
        if (str5 == null ? innerAdsInfoObj.show_interval != null : !str5.equals(innerAdsInfoObj.show_interval)) {
            return false;
        }
        String str6 = this.start_time;
        if (str6 == null ? innerAdsInfoObj.start_time != null : !str6.equals(innerAdsInfoObj.start_time)) {
            return false;
        }
        String str7 = this.title;
        if (str7 == null ? innerAdsInfoObj.title != null : !str7.equals(innerAdsInfoObj.title)) {
            return false;
        }
        String str8 = this.type;
        if (str8 == null ? innerAdsInfoObj.type != null : !str8.equals(innerAdsInfoObj.type)) {
            return false;
        }
        String str9 = this.url;
        String str10 = innerAdsInfoObj.url;
        if (str9 != null) {
            return str9.equals(str10);
        }
        return str10 == null;
    }

    @p0
    public ADReportItem getAd_report() {
        return this.ad_report;
    }

    public String getAds_id() {
        return this.ads_id;
    }

    public String getBtn_text() {
        return this.btn_text;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnd_time() {
        return this.end_time;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getShow_interval() {
        return this.show_interval;
    }

    public String getStart_time() {
        return this.start_time;
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

    public void setAd_report(@p0 ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public void setAds_id(String str) {
        this.ads_id = str;
    }

    public void setBtn_text(String str) {
        this.btn_text = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnd_time(String str) {
        this.end_time = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setShow_interval(String str) {
        this.show_interval = str;
    }

    public void setStart_time(String str) {
        this.start_time = str;
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
