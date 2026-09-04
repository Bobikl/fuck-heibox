package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TripleBannerPicObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TripleBannerPicObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String img_back;

    @e
    private String img_front;

    @e
    private String img_mid;

    public TripleBannerPicObj(@e String str, @e String str2, @e String str3) {
        this.img_mid = str;
        this.img_front = str2;
        this.img_back = str3;
    }

    public static /* synthetic */ TripleBannerPicObj copy$default(TripleBannerPicObj tripleBannerPicObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tripleBannerPicObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.C4, new Class[]{TripleBannerPicObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, TripleBannerPicObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TripleBannerPicObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = tripleBannerPicObj.img_mid;
        }
        if ((i10 & 2) != 0) {
            str2 = tripleBannerPicObj.img_front;
        }
        if ((i10 & 4) != 0) {
            str3 = tripleBannerPicObj.img_back;
        }
        return tripleBannerPicObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.img_mid;
    }

    @e
    public final String component2() {
        return this.img_front;
    }

    @e
    public final String component3() {
        return this.img_back;
    }

    @d
    public final TripleBannerPicObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.d.B4, new Class[]{String.class, String.class, String.class}, TripleBannerPicObj.class);
        return patchProxyResultProxy.isSupported ? (TripleBannerPicObj) patchProxyResultProxy.result : new TripleBannerPicObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.A4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.g(TripleBannerPicObj.class, obj.getClass())) {
            return false;
        }
        TripleBannerPicObj tripleBannerPicObj = (TripleBannerPicObj) obj;
        return f0.g(this.img_mid, tripleBannerPicObj.img_mid) && f0.g(this.img_front, tripleBannerPicObj.img_front) && f0.g(this.img_back, tripleBannerPicObj.img_back);
    }

    @e
    public final String getImg_back() {
        return this.img_back;
    }

    @e
    public final String getImg_front() {
        return this.img_front;
    }

    @e
    public final String getImg_mid() {
        return this.img_mid;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.E4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img_mid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.img_front;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.img_back;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setImg_back(@e String str) {
        this.img_back = str;
    }

    public final void setImg_front(@e String str) {
        this.img_front = str;
    }

    public final void setImg_mid(@e String str) {
        this.img_mid = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.D4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TripleBannerPicObj(img_mid=" + this.img_mid + ", img_front=" + this.img_front + ", img_back=" + this.img_back + ')';
    }
}
