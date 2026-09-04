package com.max.hbimage.bean.common;

import androidx.annotation.w0;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HBLocalThumbModel.kt */
/* JADX INFO: loaded from: classes10.dex */
@w0(29)
public final class HBLocalThumbModel {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String localMediaUrl;

    public HBLocalThumbModel(@e String str) {
        this.localMediaUrl = str;
    }

    public static /* synthetic */ HBLocalThumbModel copy$default(HBLocalThumbModel hBLocalThumbModel, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBLocalThumbModel, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.g.B6, new Class[]{HBLocalThumbModel.class, String.class, Integer.TYPE, Object.class}, HBLocalThumbModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBLocalThumbModel) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = hBLocalThumbModel.localMediaUrl;
        }
        return hBLocalThumbModel.copy(str);
    }

    @e
    public final String component1() {
        return this.localMediaUrl;
    }

    @d
    public final HBLocalThumbModel copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.g.A6, new Class[]{String.class}, HBLocalThumbModel.class);
        return patchProxyResultProxy.isSupported ? (HBLocalThumbModel) patchProxyResultProxy.result : new HBLocalThumbModel(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.g.E6, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof HBLocalThumbModel) && f0.g(this.localMediaUrl, ((HBLocalThumbModel) obj).localMediaUrl);
    }

    @e
    public final String getLocalMediaUrl() {
        return this.localMediaUrl;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.D6, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.localMediaUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.C6, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HBLocalThumbModel(localMediaUrl=" + this.localMediaUrl + ')';
    }
}
