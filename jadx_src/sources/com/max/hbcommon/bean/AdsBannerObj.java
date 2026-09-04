package com.max.hbcommon.bean;

import androidx.annotation.p0;
import bb.c;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.max.hbutils.utils.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AdsBannerObj implements Serializable {
    public static final String LABEL_ADVERTISE = "advertise";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3218749573165378184L;
    private ADReportItem ad_report;
    private String bottom_text;
    private String duration;
    private String image_url;
    private String img;
    private String img_gif;
    private String intranet_only;
    private transient String isReported;
    private String label;
    private String nav_id;
    private String protocol;
    private TripleBannerPicObj split_imgs;
    private String text;
    private String title;
    private String topic_id;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31674z3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k.f(this, obj);
    }

    @p0
    public ADReportItem getAd_report() {
        return this.ad_report;
    }

    public String getBottom_text() {
        return this.bottom_text;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getImage_url() {
        return this.image_url;
    }

    public String getImg() {
        return this.img;
    }

    public String getImg_gif() {
        return this.img_gif;
    }

    public String getIntranet_only() {
        return this.intranet_only;
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

    public TripleBannerPicObj getSplit_imgs() {
        return this.split_imgs;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTopic_id() {
        return this.topic_id;
    }

    public int intDuration() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31652y3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return (int) (Float.parseFloat(getDuration() == null ? "2.5" : getDuration()) * 1000.0f);
    }

    public void setAd_report(@p0 ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public void setBottom_text(String str) {
        this.bottom_text = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setImage_url(String str) {
        this.image_url = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setImg_gif(String str) {
        this.img_gif = str;
    }

    public void setIntranet_only(String str) {
        this.intranet_only = str;
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

    public void setSplit_imgs(TripleBannerPicObj tripleBannerPicObj) {
        this.split_imgs = tripleBannerPicObj;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopic_id(String str) {
        this.topic_id = str;
    }
}
