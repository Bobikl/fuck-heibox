package com.max.xiaoheihe.bean.game;

import androidx.annotation.p0;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class AllRecommendGameHeaderObj {
    public static final String HEADER_STYLE_PLATFORMS_SALES = "特惠模块";
    public static final String HEADER_STYLE_PROTOCOL = "协议";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ADReportItem ad_report;
    private RecommendGameListItemObj header_content;
    private String header_style;
    private transient String isReported;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14619, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllRecommendGameHeaderObj)) {
            return false;
        }
        AllRecommendGameHeaderObj allRecommendGameHeaderObj = (AllRecommendGameHeaderObj) obj;
        return Objects.equals(getHeader_content(), allRecommendGameHeaderObj.getHeader_content()) && Objects.equals(getHeader_style(), allRecommendGameHeaderObj.getHeader_style()) && Objects.equals(getIsReported(), allRecommendGameHeaderObj.getIsReported());
    }

    @p0
    public ADReportItem getAd_report() {
        return this.ad_report;
    }

    public RecommendGameListItemObj getHeader_content() {
        return this.header_content;
    }

    public String getHeader_style() {
        return this.header_style;
    }

    public String getIsReported() {
        return this.isReported;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14620, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getHeader_content(), getHeader_style(), getIsReported());
    }

    public void setAd_report(@p0 ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public void setHeader_content(RecommendGameListItemObj recommendGameListItemObj) {
        this.header_content = recommendGameListItemObj;
    }

    public void setHeader_style(String str) {
        this.header_style = str;
    }

    public void setIsReported(String str) {
        this.isReported = str;
    }
}
