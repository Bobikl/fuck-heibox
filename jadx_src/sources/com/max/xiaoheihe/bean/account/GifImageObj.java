package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GifImageObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GifImageObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String repeat_count;

    @e
    private String url;

    public GifImageObj(@e String str, @e String str2) {
        this.url = str;
        this.repeat_count = str2;
    }

    public static /* synthetic */ GifImageObj copy$default(GifImageObj gifImageObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gifImageObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.iP, new Class[]{GifImageObj.class, String.class, String.class, Integer.TYPE, Object.class}, GifImageObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GifImageObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = gifImageObj.url;
        }
        if ((i10 & 2) != 0) {
            str2 = gifImageObj.repeat_count;
        }
        return gifImageObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.url;
    }

    @e
    public final String component2() {
        return this.repeat_count;
    }

    @d
    public final GifImageObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.m.hP, new Class[]{String.class, String.class}, GifImageObj.class);
        return patchProxyResultProxy.isSupported ? (GifImageObj) patchProxyResultProxy.result : new GifImageObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.lP, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifImageObj)) {
            return false;
        }
        GifImageObj gifImageObj = (GifImageObj) obj;
        return f0.g(this.url, gifImageObj.url) && f0.g(this.repeat_count, gifImageObj.repeat_count);
    }

    @e
    public final String getRepeat_count() {
        return this.repeat_count;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.kP, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.repeat_count;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRepeat_count(@e String str) {
        this.repeat_count = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.jP, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "GifImageObj(url=" + this.url + ", repeat_count=" + this.repeat_count + ')';
    }
}
