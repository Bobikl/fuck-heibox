package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.AdsBannerObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicBannerResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AdsBannerObj> ads_banner;
    private BBSLinkListHeaderObj topic_banner;

    public List<AdsBannerObj> getAds_banner() {
        return this.ads_banner;
    }

    public BBSLinkListHeaderObj getTopic_banner() {
        return this.topic_banner;
    }

    public void setAds_banner(List<AdsBannerObj> list) {
        this.ads_banner = list;
    }

    public void setTopic_banner(BBSLinkListHeaderObj bBSLinkListHeaderObj) {
        this.topic_banner = bBSLinkListHeaderObj;
    }
}
