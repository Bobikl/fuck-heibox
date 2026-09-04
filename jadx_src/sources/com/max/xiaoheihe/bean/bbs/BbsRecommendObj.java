package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BbsRecommendObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BbsRecommendObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<? extends AdsBannerObj> banner;

    @e
    private String lastval;

    @e
    private List<FeedsContentBaseObj> links;

    @e
    private List<KeyDescObj> sort_filter;

    @e
    private List<BBSTopicObj> topics;

    public BbsRecommendObj(@e String str, @e List<FeedsContentBaseObj> list, @e List<BBSTopicObj> list2, @e List<KeyDescObj> list3, @e List<? extends AdsBannerObj> list4) {
        this.lastval = str;
        this.links = list;
        this.topics = list2;
        this.sort_filter = list3;
        this.banner = list4;
    }

    public /* synthetic */ BbsRecommendObj(String str, List list, List list2, List list3, List list4, int i10, u uVar) {
        this(str, list, list2, list3, (i10 & 16) != 0 ? null : list4);
    }

    public static /* synthetic */ BbsRecommendObj copy$default(BbsRecommendObj bbsRecommendObj, String str, List list, List list2, List list3, List list4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bbsRecommendObj, str, list, list2, list3, list4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14208, new Class[]{BbsRecommendObj.class, String.class, List.class, List.class, List.class, List.class, Integer.TYPE, Object.class}, BbsRecommendObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BbsRecommendObj) patchProxyResultProxy.result;
        }
        return bbsRecommendObj.copy((i10 & 1) != 0 ? bbsRecommendObj.lastval : str, (i10 & 2) != 0 ? bbsRecommendObj.links : list, (i10 & 4) != 0 ? bbsRecommendObj.topics : list2, (i10 & 8) != 0 ? bbsRecommendObj.sort_filter : list3, (i10 & 16) != 0 ? bbsRecommendObj.banner : list4);
    }

    @e
    public final String component1() {
        return this.lastval;
    }

    @e
    public final List<FeedsContentBaseObj> component2() {
        return this.links;
    }

    @e
    public final List<BBSTopicObj> component3() {
        return this.topics;
    }

    @e
    public final List<KeyDescObj> component4() {
        return this.sort_filter;
    }

    @e
    public final List<AdsBannerObj> component5() {
        return this.banner;
    }

    @d
    public final BbsRecommendObj copy(@e String str, @e List<FeedsContentBaseObj> list, @e List<BBSTopicObj> list2, @e List<KeyDescObj> list3, @e List<? extends AdsBannerObj> list4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list, list2, list3, list4}, this, changeQuickRedirect, false, 14207, new Class[]{String.class, List.class, List.class, List.class, List.class}, BbsRecommendObj.class);
        return patchProxyResultProxy.isSupported ? (BbsRecommendObj) patchProxyResultProxy.result : new BbsRecommendObj(str, list, list2, list3, list4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14211, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BbsRecommendObj)) {
            return false;
        }
        BbsRecommendObj bbsRecommendObj = (BbsRecommendObj) obj;
        return f0.g(this.lastval, bbsRecommendObj.lastval) && f0.g(this.links, bbsRecommendObj.links) && f0.g(this.topics, bbsRecommendObj.topics) && f0.g(this.sort_filter, bbsRecommendObj.sort_filter) && f0.g(this.banner, bbsRecommendObj.banner);
    }

    @e
    public final List<AdsBannerObj> getBanner() {
        return this.banner;
    }

    @e
    public final String getLastval() {
        return this.lastval;
    }

    @e
    public final List<FeedsContentBaseObj> getLinks() {
        return this.links;
    }

    @e
    public final List<KeyDescObj> getSort_filter() {
        return this.sort_filter;
    }

    @e
    public final List<BBSTopicObj> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14210, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.lastval;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<FeedsContentBaseObj> list = this.links;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BBSTopicObj> list2 = this.topics;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<KeyDescObj> list3 = this.sort_filter;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<? extends AdsBannerObj> list4 = this.banner;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final void setBanner(@e List<? extends AdsBannerObj> list) {
        this.banner = list;
    }

    public final void setLastval(@e String str) {
        this.lastval = str;
    }

    public final void setLinks(@e List<FeedsContentBaseObj> list) {
        this.links = list;
    }

    public final void setSort_filter(@e List<KeyDescObj> list) {
        this.sort_filter = list;
    }

    public final void setTopics(@e List<BBSTopicObj> list) {
        this.topics = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14209, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BbsRecommendObj(lastval=" + this.lastval + ", links=" + this.links + ", topics=" + this.topics + ", sort_filter=" + this.sort_filter + ", banner=" + this.banner + ')';
    }
}
