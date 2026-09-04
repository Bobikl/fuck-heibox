package com.max.hbcommon.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiniProgramShortCutObj.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MiniProgramShortCutObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_img;

    @e
    private String name;

    @e
    private String protocol;

    public MiniProgramShortCutObj(@e String str, @e String str2, @e String str3) {
        this.bg_img = str;
        this.protocol = str2;
        this.name = str3;
    }

    public static /* synthetic */ MiniProgramShortCutObj copy$default(MiniProgramShortCutObj miniProgramShortCutObj, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{miniProgramShortCutObj, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, c.d.R3, new Class[]{MiniProgramShortCutObj.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, MiniProgramShortCutObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MiniProgramShortCutObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = miniProgramShortCutObj.bg_img;
        }
        if ((i10 & 2) != 0) {
            str2 = miniProgramShortCutObj.protocol;
        }
        if ((i10 & 4) != 0) {
            str3 = miniProgramShortCutObj.name;
        }
        return miniProgramShortCutObj.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.bg_img;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @d
    public final MiniProgramShortCutObj copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, c.d.Q3, new Class[]{String.class, String.class, String.class}, MiniProgramShortCutObj.class);
        return patchProxyResultProxy.isSupported ? (MiniProgramShortCutObj) patchProxyResultProxy.result : new MiniProgramShortCutObj(str, str2, str3);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.U3, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniProgramShortCutObj)) {
            return false;
        }
        MiniProgramShortCutObj miniProgramShortCutObj = (MiniProgramShortCutObj) obj;
        return f0.g(this.bg_img, miniProgramShortCutObj.bg_img) && f0.g(this.protocol, miniProgramShortCutObj.protocol) && f0.g(this.name, miniProgramShortCutObj.name);
    }

    @e
    public final String getBg_img() {
        return this.bg_img;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.T3, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.bg_img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setBg_img(@e String str) {
        this.bg_img = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.S3, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MiniProgramShortCutObj(bg_img=" + this.bg_img + ", protocol=" + this.protocol + ", name=" + this.name + ')';
    }
}
