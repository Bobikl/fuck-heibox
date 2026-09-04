package com.starlightc.ucropplus.model;

import androidx.compose.foundation.b0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TextTypefaceInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextTypefaceInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @e
    private Integer f98066id;
    private boolean isOnline;
    private boolean isReady;

    @e
    private String name;

    @e
    private String typeface;

    @e
    private String typeface_demo;

    public TextTypefaceInfo(boolean z10, boolean z11, @e String str, @e Integer num, @e String str2, @e String str3) {
        this.isReady = z10;
        this.isOnline = z11;
        this.name = str;
        this.f98066id = num;
        this.typeface = str2;
        this.typeface_demo = str3;
    }

    public /* synthetic */ TextTypefaceInfo(boolean z10, boolean z11, String str, Integer num, String str2, String str3, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, str, num, str2, (i10 & 32) != 0 ? null : str3);
    }

    public static /* synthetic */ TextTypefaceInfo copy$default(TextTypefaceInfo textTypefaceInfo, boolean z10, boolean z11, String str, Integer num, String str2, String str3, int i10, Object obj) {
        boolean z12 = z10;
        boolean z13 = z11;
        Object[] objArr = {textTypefaceInfo, new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), str, num, str2, str3, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50134, new Class[]{TextTypefaceInfo.class, cls, cls, String.class, Integer.class, String.class, String.class, Integer.TYPE, Object.class}, TextTypefaceInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextTypefaceInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z12 = textTypefaceInfo.isReady;
        }
        if ((i10 & 2) != 0) {
            z13 = textTypefaceInfo.isOnline;
        }
        return textTypefaceInfo.copy(z12, z13, (i10 & 4) != 0 ? textTypefaceInfo.name : str, (i10 & 8) != 0 ? textTypefaceInfo.f98066id : num, (i10 & 16) != 0 ? textTypefaceInfo.typeface : str2, (i10 & 32) != 0 ? textTypefaceInfo.typeface_demo : str3);
    }

    public final boolean component1() {
        return this.isReady;
    }

    public final boolean component2() {
        return this.isOnline;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final Integer component4() {
        return this.f98066id;
    }

    @e
    public final String component5() {
        return this.typeface;
    }

    @e
    public final String component6() {
        return this.typeface_demo;
    }

    @d
    public final TextTypefaceInfo copy(boolean z10, boolean z11, @e String str, @e Integer num, @e String str2, @e String str3) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, num, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50133, new Class[]{cls, cls, String.class, Integer.class, String.class, String.class}, TextTypefaceInfo.class);
        return patchProxyResultProxy.isSupported ? (TextTypefaceInfo) patchProxyResultProxy.result : new TextTypefaceInfo(z10, z11, str, num, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50137, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextTypefaceInfo)) {
            return false;
        }
        TextTypefaceInfo textTypefaceInfo = (TextTypefaceInfo) obj;
        return this.isReady == textTypefaceInfo.isReady && this.isOnline == textTypefaceInfo.isOnline && f0.g(this.name, textTypefaceInfo.name) && f0.g(this.f98066id, textTypefaceInfo.f98066id) && f0.g(this.typeface, textTypefaceInfo.typeface) && f0.g(this.typeface_demo, textTypefaceInfo.typeface_demo);
    }

    @e
    public final Integer getId() {
        return this.f98066id;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getTypeface() {
        return this.typeface;
    }

    @e
    public final String getTypeface_demo() {
        return this.typeface_demo;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50136, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iA = ((b0.a(this.isReady) * 31) + b0.a(this.isOnline)) * 31;
        String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f98066id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.typeface;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.typeface_demo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public final void setId(@e Integer num) {
        this.f98066id = num;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setOnline(boolean z10) {
        this.isOnline = z10;
    }

    public final void setReady(boolean z10) {
        this.isReady = z10;
    }

    public final void setTypeface(@e String str) {
        this.typeface = str;
    }

    public final void setTypeface_demo(@e String str) {
        this.typeface_demo = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50135, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TextTypefaceInfo(isReady=" + this.isReady + ", isOnline=" + this.isOnline + ", name=" + this.name + ", id=" + this.f98066id + ", typeface=" + this.typeface + ", typeface_demo=" + this.typeface_demo + ')';
    }
}
