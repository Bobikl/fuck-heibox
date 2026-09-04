package com.max.xiaoheihe.bean.search;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RelevantSearchListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class RelevantSearchListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String head_text;

    @e
    private List<RelevantSearchObj> items;

    public RelevantSearchListObj(@e String str, @e List<RelevantSearchObj> list) {
        this.head_text = str;
        this.items = list;
    }

    public static /* synthetic */ RelevantSearchListObj copy$default(RelevantSearchListObj relevantSearchListObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{relevantSearchListObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15822, new Class[]{RelevantSearchListObj.class, String.class, List.class, Integer.TYPE, Object.class}, RelevantSearchListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelevantSearchListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = relevantSearchListObj.head_text;
        }
        if ((i10 & 2) != 0) {
            list = relevantSearchListObj.items;
        }
        return relevantSearchListObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.head_text;
    }

    @e
    public final List<RelevantSearchObj> component2() {
        return this.items;
    }

    @d
    public final RelevantSearchListObj copy(@e String str, @e List<RelevantSearchObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 15821, new Class[]{String.class, List.class}, RelevantSearchListObj.class);
        return patchProxyResultProxy.isSupported ? (RelevantSearchListObj) patchProxyResultProxy.result : new RelevantSearchListObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15825, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelevantSearchListObj)) {
            return false;
        }
        RelevantSearchListObj relevantSearchListObj = (RelevantSearchListObj) obj;
        return f0.g(this.head_text, relevantSearchListObj.head_text) && f0.g(this.items, relevantSearchListObj.items);
    }

    @e
    public final String getHead_text() {
        return this.head_text;
    }

    @e
    public final List<RelevantSearchObj> getItems() {
        return this.items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15824, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.head_text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RelevantSearchObj> list = this.items;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setHead_text(@e String str) {
        this.head_text = str;
    }

    public final void setItems(@e List<RelevantSearchObj> list) {
        this.items = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15823, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RelevantSearchListObj(head_text=" + this.head_text + ", items=" + this.items + ')';
    }
}
