package com.max.xiaoheihe.bean;

import android.net.Uri;
import androidx.annotation.p0;
import bb.c;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AdsInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6211673003730127009L;
    private ADReportItem ad_report;
    private String ad_url;
    private String ads_id;
    private String btn_color;
    private ADDisplayContentInfo display_content;
    private String end_time;
    private String game_type;
    private String img_md5;
    private String img_url;
    private InnerAdsInfoObj inner_ads;
    private String key;
    private String launch_show_interval;
    private String open_screen_ads_text;
    private String protocol;
    private String show_interval;
    private String show_open_screen_ads_text;
    private String show_time;
    private String start_time;
    private String title;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.gL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdsInfoObj adsInfoObj = (AdsInfoObj) obj;
        ADDisplayContentInfo aDDisplayContentInfo = this.display_content;
        if (aDDisplayContentInfo != null && adsInfoObj.display_content != null && (aDDisplayContentInfo.getType().equals(adsInfoObj.display_content.getType()) || this.display_content.getUrl().equals(adsInfoObj.display_content.getUrl()))) {
            return false;
        }
        String str = this.ad_url;
        if (str == null ? adsInfoObj.ad_url != null : !str.equals(adsInfoObj.ad_url)) {
            return false;
        }
        String str2 = this.end_time;
        if (str2 == null ? adsInfoObj.end_time != null : !str2.equals(adsInfoObj.end_time)) {
            return false;
        }
        String str3 = this.game_type;
        if (str3 == null ? adsInfoObj.game_type != null : !str3.equals(adsInfoObj.game_type)) {
            return false;
        }
        if (!this.key.equals(adsInfoObj.key)) {
            return false;
        }
        String str4 = this.show_time;
        if (str4 == null ? adsInfoObj.show_time != null : !str4.equals(adsInfoObj.show_time)) {
            return false;
        }
        String str5 = this.start_time;
        if (str5 == null ? adsInfoObj.start_time != null : !str5.equals(adsInfoObj.start_time)) {
            return false;
        }
        InnerAdsInfoObj innerAdsInfoObj = this.inner_ads;
        if (innerAdsInfoObj == null ? adsInfoObj.inner_ads != null : !innerAdsInfoObj.equals(adsInfoObj.inner_ads)) {
            return false;
        }
        String str6 = this.ads_id;
        if (str6 == null ? adsInfoObj.ads_id != null : !str6.equals(adsInfoObj.ads_id)) {
            return false;
        }
        String str7 = this.show_interval;
        if (str7 == null ? adsInfoObj.show_interval != null : !str7.equals(adsInfoObj.show_interval)) {
            return false;
        }
        String str8 = this.launch_show_interval;
        if (str8 == null ? adsInfoObj.launch_show_interval != null : !str8.equals(adsInfoObj.launch_show_interval)) {
            return false;
        }
        String str9 = this.show_open_screen_ads_text;
        if (str9 == null ? adsInfoObj.show_open_screen_ads_text != null : !str9.equals(adsInfoObj.show_open_screen_ads_text)) {
            return false;
        }
        String str10 = this.open_screen_ads_text;
        if (str10 == null ? adsInfoObj.open_screen_ads_text != null : !str10.equals(adsInfoObj.open_screen_ads_text)) {
            return false;
        }
        String str11 = this.title;
        String str12 = adsInfoObj.title;
        if (str11 != null) {
            return str11.equals(str12);
        }
        return str12 == null;
    }

    @p0
    public ADReportItem getAd_report() {
        return this.ad_report;
    }

    public String getAd_url() {
        return this.ad_url;
    }

    public String getAds_id() {
        return this.ads_id;
    }

    public String getBtn_color() {
        return this.btn_color;
    }

    public ADDisplayContentInfo getDisplay_content() {
        return this.display_content;
    }

    public String getEnd_time() {
        return this.end_time;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getImg_md5() {
        return this.img_md5;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public InnerAdsInfoObj getInner_ads() {
        return this.inner_ads;
    }

    public String getKey() {
        return this.key;
    }

    public String getLaunch_show_interval() {
        return this.launch_show_interval;
    }

    public String getOpen_screen_ads_text() {
        return this.open_screen_ads_text;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getShow_interval() {
        return this.show_interval;
    }

    public String getShow_open_screen_ads_text() {
        return this.show_open_screen_ads_text;
    }

    public String getShow_time() {
        return this.show_time;
    }

    public String getSourceUrlKey() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.hL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String url = getDisplay_content() != null ? getDisplay_content().getUrl() : getImg_url();
        if (com.max.hbcommon.utils.c.u(url)) {
            return null;
        }
        return "video".equals(getDisplay_content().getType()) ? Uri.parse(url).getPath() : url;
    }

    public String getStart_time() {
        return this.start_time;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAd_report(@p0 ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public void setAd_url(String str) {
        this.ad_url = str;
    }

    public void setAds_id(String str) {
        this.ads_id = str;
    }

    public void setBtn_color(String str) {
        this.btn_color = str;
    }

    public void setDisplay_content(ADDisplayContentInfo aDDisplayContentInfo) {
        this.display_content = aDDisplayContentInfo;
    }

    public void setEnd_time(String str) {
        this.end_time = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setImg_md5(String str) {
        this.img_md5 = str;
    }

    public void setImg_url(String str) {
        this.img_url = str;
    }

    public void setInner_ads(InnerAdsInfoObj innerAdsInfoObj) {
        this.inner_ads = innerAdsInfoObj;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLaunch_show_interval(String str) {
        this.launch_show_interval = str;
    }

    public void setOpen_screen_ads_text(String str) {
        this.open_screen_ads_text = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setShow_interval(String str) {
        this.show_interval = str;
    }

    public void setShow_open_screen_ads_text(String str) {
        this.show_open_screen_ads_text = str;
    }

    public void setShow_time(String str) {
        this.show_time = str;
    }

    public void setStart_time(String str) {
        this.start_time = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
