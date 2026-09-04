package com.max.xiaoheihe.bean.news;

import androidx.annotation.p0;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentBaseObj implements Serializable {
    public static final String WRAPPER_TYPE_SEARCH_TIPS = "search_tips";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8524858112982101602L;
    private ADReportItem ad_report;
    private String content_extra_desc;
    private String content_type;
    private String custom_index;
    private String custom_previous_tips;
    private String custom_suggested_from;
    private List<FeedsContentBaseObj> events;
    private String index;
    private boolean isExpend;
    private boolean isHideTracked;
    private transient String isReported;
    private boolean isShowTracked;
    private String is_top_link;
    private String is_update;
    private String maxjia;
    private String report_id;
    private boolean showDivider = true;
    private RichStackModelObj sub_rich_text;
    private String view_limit;
    private String wrapper_type;

    @p0
    public ADReportItem getAd_report() {
        return this.ad_report;
    }

    public String getContent_extra_desc() {
        return this.content_extra_desc;
    }

    public String getContent_type() {
        return this.content_type;
    }

    public String getCustom_index() {
        return this.custom_index;
    }

    public String getCustom_previous_tips() {
        return this.custom_previous_tips;
    }

    public String getCustom_suggested_from() {
        return this.custom_suggested_from;
    }

    public List<FeedsContentBaseObj> getEvents() {
        return this.events;
    }

    public String getIndex() {
        return this.index;
    }

    public String getIsReported() {
        return this.isReported;
    }

    public String getIs_top_link() {
        return this.is_top_link;
    }

    public String getIs_update() {
        return this.is_update;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    @p0
    public String getReport_id() {
        return this.report_id;
    }

    public RichStackModelObj getSub_rich_text() {
        return this.sub_rich_text;
    }

    public String getView_limit() {
        return this.view_limit;
    }

    public String getWrapper_type() {
        return this.wrapper_type;
    }

    public boolean isExpend() {
        return this.isExpend;
    }

    public boolean isHideTracked() {
        return this.isHideTracked;
    }

    public boolean isShowDivider() {
        return this.showDivider;
    }

    public boolean isShowTracked() {
        return this.isShowTracked;
    }

    public boolean isZhiHuNewsFeedsLink() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15739, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return BBSLinkObj.CONTENT_TYPE_NEWS_LINK_V2.equals(this.content_type) || BBSLinkObj.CONTENT_TYPE_NEWS_LINK_V3.equals(this.content_type) || BBSLinkObj.CONTENT_TYPE_NEWS_LINK_V4.equals(this.content_type) || BBSLinkObj.CONTENT_TYPE_NEWS_V2.equals(this.content_type) || BBSLinkObj.CONTENT_TYPE_NEWS_V3.equals(this.content_type) || BBSLinkObj.CONTENT_TYPE_NEWS_V4.equals(this.content_type) || BBSLinkObj.CONTENT_TYPE_NEWS_CONFIG.equals(this.content_type);
    }

    public void setAd_report(@p0 ADReportItem aDReportItem) {
        this.ad_report = aDReportItem;
    }

    public void setContent_extra_desc(String str) {
        this.content_extra_desc = str;
    }

    public void setContent_type(String str) {
        this.content_type = str;
    }

    public void setCustom_index(String str) {
        this.custom_index = str;
    }

    public void setCustom_previous_tips(String str) {
        this.custom_previous_tips = str;
    }

    public void setCustom_suggested_from(String str) {
        this.custom_suggested_from = str;
    }

    public void setEvents(List<FeedsContentBaseObj> list) {
        this.events = list;
    }

    public void setExpend(boolean z10) {
        this.isExpend = z10;
    }

    public void setHideTracked(boolean z10) {
        this.isHideTracked = z10;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setIsReported(String str) {
        this.isReported = str;
    }

    public void setIs_top_link(String str) {
        this.is_top_link = str;
    }

    public void setIs_update(String str) {
        this.is_update = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setReport_id(@p0 String str) {
        this.report_id = str;
    }

    public void setShowDivider(boolean z10) {
        this.showDivider = z10;
    }

    public void setShowTracked(boolean z10) {
        this.isShowTracked = z10;
    }

    public void setSub_rich_text(RichStackModelObj richStackModelObj) {
        this.sub_rich_text = richStackModelObj;
    }

    public void setView_limit(String str) {
        this.view_limit = str;
    }

    public void setWrapper_type(String str) {
        this.wrapper_type = str;
    }
}
