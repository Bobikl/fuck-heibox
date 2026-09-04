package com.starlightc.ucropplus.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextTypefaceInfoList.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextTypefaceInfoList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private List<TextTypefaceInfo> typeface_list;

    public TextTypefaceInfoList(@d List<TextTypefaceInfo> typeface_list) {
        f0.p(typeface_list, "typeface_list");
        this.typeface_list = typeface_list;
    }

    public static /* synthetic */ TextTypefaceInfoList copy$default(TextTypefaceInfoList textTypefaceInfoList, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textTypefaceInfoList, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 50140, new Class[]{TextTypefaceInfoList.class, List.class, Integer.TYPE, Object.class}, TextTypefaceInfoList.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextTypefaceInfoList) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = textTypefaceInfoList.typeface_list;
        }
        return textTypefaceInfoList.copy(list);
    }

    @d
    public final List<TextTypefaceInfo> component1() {
        return this.typeface_list;
    }

    @d
    public final TextTypefaceInfoList copy(@d List<TextTypefaceInfo> typeface_list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{typeface_list}, this, changeQuickRedirect, false, 50139, new Class[]{List.class}, TextTypefaceInfoList.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextTypefaceInfoList) patchProxyResultProxy.result;
        }
        f0.p(typeface_list, "typeface_list");
        return new TextTypefaceInfoList(typeface_list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50143, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextTypefaceInfoList) && f0.g(this.typeface_list, ((TextTypefaceInfoList) obj).typeface_list);
    }

    @d
    public final List<TextTypefaceInfo> getTypeface_list() {
        return this.typeface_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50142, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.typeface_list.hashCode();
    }

    public final void setTypeface_list(@d List<TextTypefaceInfo> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 50138, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.typeface_list = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50141, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TextTypefaceInfoList(typeface_list=" + this.typeface_list + ')';
    }
}
