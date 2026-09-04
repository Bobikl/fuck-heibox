package com.max.xiaoheihe.bean.mall.cart;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RelatedRecommend implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<MallProductObj> items;

    @e
    private String proto;

    @e
    private String report_path;

    @e
    private String title;

    public RelatedRecommend(@e String str, @e String str2, @e String str3, @e List<MallProductObj> list) {
        this.report_path = str;
        this.title = str2;
        this.proto = str3;
        this.items = list;
    }

    public static /* synthetic */ RelatedRecommend copy$default(RelatedRecommend relatedRecommend, String str, String str2, String str3, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{relatedRecommend, str, str2, str3, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15622, new Class[]{RelatedRecommend.class, String.class, String.class, String.class, List.class, Integer.TYPE, Object.class}, RelatedRecommend.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelatedRecommend) patchProxyResultProxy.result;
        }
        return relatedRecommend.copy((i10 & 1) != 0 ? relatedRecommend.report_path : str, (i10 & 2) != 0 ? relatedRecommend.title : str2, (i10 & 4) != 0 ? relatedRecommend.proto : str3, (i10 & 8) != 0 ? relatedRecommend.items : list);
    }

    @e
    public final String component1() {
        return this.report_path;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.proto;
    }

    @e
    public final List<MallProductObj> component4() {
        return this.items;
    }

    @d
    public final RelatedRecommend copy(@e String str, @e String str2, @e String str3, @e List<MallProductObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, list}, this, changeQuickRedirect, false, 15621, new Class[]{String.class, String.class, String.class, List.class}, RelatedRecommend.class);
        return patchProxyResultProxy.isSupported ? (RelatedRecommend) patchProxyResultProxy.result : new RelatedRecommend(str, str2, str3, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15625, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedRecommend)) {
            return false;
        }
        RelatedRecommend relatedRecommend = (RelatedRecommend) obj;
        return f0.g(this.report_path, relatedRecommend.report_path) && f0.g(this.title, relatedRecommend.title) && f0.g(this.proto, relatedRecommend.proto) && f0.g(this.items, relatedRecommend.items);
    }

    @e
    public final List<MallProductObj> getItems() {
        return this.items;
    }

    @e
    public final String getProto() {
        return this.proto;
    }

    @e
    public final String getReport_path() {
        return this.report_path;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15624, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.report_path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.proto;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<MallProductObj> list = this.items;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setItems(@e List<MallProductObj> list) {
        this.items = list;
    }

    public final void setProto(@e String str) {
        this.proto = str;
    }

    public final void setReport_path(@e String str) {
        this.report_path = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15623, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RelatedRecommend(report_path=" + this.report_path + ", title=" + this.title + ", proto=" + this.proto + ", items=" + this.items + ')';
    }
}
