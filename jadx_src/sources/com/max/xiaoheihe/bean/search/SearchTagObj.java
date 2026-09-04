package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchTagObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SearchTagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String custom_index;

    @e
    private String name;

    @e
    private String report_id;

    @e
    private String tag;

    public SearchTagObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.name = str;
        this.tag = str2;
        this.report_id = str3;
        this.custom_index = str4;
    }

    public static /* synthetic */ SearchTagObj copy$default(SearchTagObj searchTagObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{searchTagObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15879, new Class[]{SearchTagObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, SearchTagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchTagObj) patchProxyResultProxy.result;
        }
        return searchTagObj.copy((i10 & 1) != 0 ? searchTagObj.name : str, (i10 & 2) != 0 ? searchTagObj.tag : str2, (i10 & 4) != 0 ? searchTagObj.report_id : str3, (i10 & 8) != 0 ? searchTagObj.custom_index : str4);
    }

    @e
    public final String component1() {
        return this.name;
    }

    @e
    public final String component2() {
        return this.tag;
    }

    @e
    public final String component3() {
        return this.report_id;
    }

    @e
    public final String component4() {
        return this.custom_index;
    }

    @d
    public final SearchTagObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15878, new Class[]{String.class, String.class, String.class, String.class}, SearchTagObj.class);
        return patchProxyResultProxy.isSupported ? (SearchTagObj) patchProxyResultProxy.result : new SearchTagObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15877, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(SearchTagObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.search.SearchTagObj");
        SearchTagObj searchTagObj = (SearchTagObj) obj;
        return f0.g(this.tag, searchTagObj.tag) && f0.g(this.name, searchTagObj.name);
    }

    @e
    public final String getCustom_index() {
        return this.custom_index;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    @e
    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15881, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.report_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.custom_index;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCustom_index(@e String str) {
        this.custom_index = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    public final void setTag(@e String str) {
        this.tag = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15880, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SearchTagObj(name=" + this.name + ", tag=" + this.tag + ", report_id=" + this.report_id + ", custom_index=" + this.custom_index + ')';
    }
}
