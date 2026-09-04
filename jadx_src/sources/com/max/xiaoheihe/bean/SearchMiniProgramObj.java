package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.max.hbminiprogram.bean.MiniProgramObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchMiniProgramObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchMiniProgramObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MiniProgramObj> app_list;

    @e
    private String bg_img;

    public SearchMiniProgramObj(@e List<MiniProgramObj> list, @e String str) {
        this.app_list = list;
        this.bg_img = str;
    }

    public static /* synthetic */ SearchMiniProgramObj copy$default(SearchMiniProgramObj searchMiniProgramObj, List list, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchMiniProgramObj, list, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.RM, new Class[]{SearchMiniProgramObj.class, List.class, String.class, Integer.TYPE, Object.class}, SearchMiniProgramObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchMiniProgramObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = searchMiniProgramObj.app_list;
        }
        if ((i10 & 2) != 0) {
            str = searchMiniProgramObj.bg_img;
        }
        return searchMiniProgramObj.copy(list, str);
    }

    @e
    public final List<MiniProgramObj> component1() {
        return this.app_list;
    }

    @e
    public final String component2() {
        return this.bg_img;
    }

    @d
    public final SearchMiniProgramObj copy(@e List<MiniProgramObj> list, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, c.m.QM, new Class[]{List.class, String.class}, SearchMiniProgramObj.class);
        return patchProxyResultProxy.isSupported ? (SearchMiniProgramObj) patchProxyResultProxy.result : new SearchMiniProgramObj(list, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.UM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMiniProgramObj)) {
            return false;
        }
        SearchMiniProgramObj searchMiniProgramObj = (SearchMiniProgramObj) obj;
        return f0.g(this.app_list, searchMiniProgramObj.app_list) && f0.g(this.bg_img, searchMiniProgramObj.bg_img);
    }

    @e
    public final List<MiniProgramObj> getApp_list() {
        return this.app_list;
    }

    @e
    public final String getBg_img() {
        return this.bg_img;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.TM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<MiniProgramObj> list = this.app_list;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.bg_img;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setApp_list(@e List<MiniProgramObj> list) {
        this.app_list = list;
    }

    public final void setBg_img(@e String str) {
        this.bg_img = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.SM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchMiniProgramObj(app_list=" + this.app_list + ", bg_img=" + this.bg_img + ')';
    }
}
