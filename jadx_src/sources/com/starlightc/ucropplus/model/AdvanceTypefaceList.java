package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AdvanceTypefaceList.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdvanceTypefaceList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<RemoteTextRenderInfo> advance_typeface_list;

    public AdvanceTypefaceList(@e ArrayList<RemoteTextRenderInfo> arrayList) {
        this.advance_typeface_list = arrayList;
    }

    public static /* synthetic */ AdvanceTypefaceList copy$default(AdvanceTypefaceList advanceTypefaceList, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{advanceTypefaceList, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, 50038, new Class[]{AdvanceTypefaceList.class, ArrayList.class, Integer.TYPE, Object.class}, AdvanceTypefaceList.class);
        if (patchProxyResultProxy.isSupported) {
            return (AdvanceTypefaceList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = advanceTypefaceList.advance_typeface_list;
        }
        return advanceTypefaceList.copy(arrayList);
    }

    @e
    public final ArrayList<RemoteTextRenderInfo> component1() {
        return this.advance_typeface_list;
    }

    @d
    public final AdvanceTypefaceList copy(@e ArrayList<RemoteTextRenderInfo> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50037, new Class[]{ArrayList.class}, AdvanceTypefaceList.class);
        return patchProxyResultProxy.isSupported ? (AdvanceTypefaceList) patchProxyResultProxy.result : new AdvanceTypefaceList(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50041, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdvanceTypefaceList) && f0.g(this.advance_typeface_list, ((AdvanceTypefaceList) obj).advance_typeface_list);
    }

    @e
    public final ArrayList<RemoteTextRenderInfo> getAdvance_typeface_list() {
        return this.advance_typeface_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50040, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<RemoteTextRenderInfo> arrayList = this.advance_typeface_list;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setAdvance_typeface_list(@e ArrayList<RemoteTextRenderInfo> arrayList) {
        this.advance_typeface_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50039, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AdvanceTypefaceList(advance_typeface_list=" + this.advance_typeface_list + ')';
    }
}
