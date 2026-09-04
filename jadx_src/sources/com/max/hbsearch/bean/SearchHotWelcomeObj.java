package com.max.hbsearch.bean;

import bb.c;
import com.max.hbcommon.bean.AdsBannerObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHotWelcomObj.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SearchHotWelcomeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<WelcomePageList> Lists;

    @e
    private List<? extends AdsBannerObj> ads_banner;

    @e
    private String default_q;

    public SearchHotWelcomeObj(@e List<WelcomePageList> list, @e List<? extends AdsBannerObj> list2, @e String str) {
        this.Lists = list;
        this.ads_banner = list2;
        this.default_q = str;
    }

    public static /* synthetic */ SearchHotWelcomeObj copy$default(SearchHotWelcomeObj searchHotWelcomeObj, List list, List list2, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchHotWelcomeObj, list, list2, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.C7, new Class[]{SearchHotWelcomeObj.class, List.class, List.class, String.class, Integer.TYPE, Object.class}, SearchHotWelcomeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchHotWelcomeObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = searchHotWelcomeObj.Lists;
        }
        if ((i10 & 2) != 0) {
            list2 = searchHotWelcomeObj.ads_banner;
        }
        if ((i10 & 4) != 0) {
            str = searchHotWelcomeObj.default_q;
        }
        return searchHotWelcomeObj.copy(list, list2, str);
    }

    @e
    public final List<WelcomePageList> component1() {
        return this.Lists;
    }

    @e
    public final List<AdsBannerObj> component2() {
        return this.ads_banner;
    }

    @e
    public final String component3() {
        return this.default_q;
    }

    @d
    public final SearchHotWelcomeObj copy(@e List<WelcomePageList> list, @e List<? extends AdsBannerObj> list2, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, list2, str}, this, changeQuickRedirect, false, c.k.B7, new Class[]{List.class, List.class, String.class}, SearchHotWelcomeObj.class);
        return patchProxyResultProxy.isSupported ? (SearchHotWelcomeObj) patchProxyResultProxy.result : new SearchHotWelcomeObj(list, list2, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.F7, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHotWelcomeObj)) {
            return false;
        }
        SearchHotWelcomeObj searchHotWelcomeObj = (SearchHotWelcomeObj) obj;
        return f0.g(this.Lists, searchHotWelcomeObj.Lists) && f0.g(this.ads_banner, searchHotWelcomeObj.ads_banner) && f0.g(this.default_q, searchHotWelcomeObj.default_q);
    }

    @e
    public final List<AdsBannerObj> getAds_banner() {
        return this.ads_banner;
    }

    @e
    public final String getDefault_q() {
        return this.default_q;
    }

    @e
    public final List<WelcomePageList> getLists() {
        return this.Lists;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.E7, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<WelcomePageList> list = this.Lists;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<? extends AdsBannerObj> list2 = this.ads_banner;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.default_q;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setAds_banner(@e List<? extends AdsBannerObj> list) {
        this.ads_banner = list;
    }

    public final void setDefault_q(@e String str) {
        this.default_q = str;
    }

    public final void setLists(@e List<WelcomePageList> list) {
        this.Lists = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.D7, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchHotWelcomeObj(Lists=" + this.Lists + ", ads_banner=" + this.ads_banner + ", default_q=" + this.default_q + ')';
    }
}
