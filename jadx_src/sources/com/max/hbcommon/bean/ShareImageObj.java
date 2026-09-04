package com.max.hbcommon.bean;

import android.graphics.Bitmap;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShareImageObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ShareImageObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Bitmap bitmap;

    @e
    private String share_info;

    @e
    private String style_info;

    public ShareImageObj() {
        this(null, null, null);
    }

    public ShareImageObj(@e Bitmap bitmap, @e String str, @e String str2) {
        this.bitmap = bitmap;
        this.share_info = str;
        this.style_info = str2;
    }

    public static /* synthetic */ ShareImageObj copy$default(ShareImageObj shareImageObj, Bitmap bitmap, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareImageObj, bitmap, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.f31587v4, new Class[]{ShareImageObj.class, Bitmap.class, String.class, String.class, Integer.TYPE, Object.class}, ShareImageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareImageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bitmap = shareImageObj.bitmap;
        }
        if ((i10 & 2) != 0) {
            str = shareImageObj.share_info;
        }
        if ((i10 & 4) != 0) {
            str2 = shareImageObj.style_info;
        }
        return shareImageObj.copy(bitmap, str, str2);
    }

    @e
    public final Bitmap component1() {
        return this.bitmap;
    }

    @e
    public final String component2() {
        return this.share_info;
    }

    @e
    public final String component3() {
        return this.style_info;
    }

    @d
    public final ShareImageObj copy(@e Bitmap bitmap, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap, str, str2}, this, changeQuickRedirect, false, c.d.f31565u4, new Class[]{Bitmap.class, String.class, String.class}, ShareImageObj.class);
        return patchProxyResultProxy.isSupported ? (ShareImageObj) patchProxyResultProxy.result : new ShareImageObj(bitmap, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.f31653y4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareImageObj)) {
            return false;
        }
        ShareImageObj shareImageObj = (ShareImageObj) obj;
        return f0.g(this.bitmap, shareImageObj.bitmap) && f0.g(this.share_info, shareImageObj.share_info) && f0.g(this.style_info, shareImageObj.style_info);
    }

    @e
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @e
    public final String getShare_info() {
        return this.share_info;
    }

    @e
    public final String getStyle_info() {
        return this.style_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31631x4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Bitmap bitmap = this.bitmap;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        String str = this.share_info;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style_info;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setBitmap(@e Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setShare_info(@e String str) {
        this.share_info = str;
    }

    public final void setStyle_info(@e String str) {
        this.style_info = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31609w4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ShareImageObj(bitmap=" + this.bitmap + ", share_info=" + this.share_info + ", style_info=" + this.style_info + ')';
    }
}
