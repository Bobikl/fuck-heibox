package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsLoginInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsLoginInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String mode_img;

    public FeedsLoginInfoObj(@e String str) {
        this.mode_img = str;
    }

    public static /* synthetic */ FeedsLoginInfoObj copy$default(FeedsLoginInfoObj feedsLoginInfoObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsLoginInfoObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15761, new Class[]{FeedsLoginInfoObj.class, String.class, Integer.TYPE, Object.class}, FeedsLoginInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsLoginInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = feedsLoginInfoObj.mode_img;
        }
        return feedsLoginInfoObj.copy(str);
    }

    @e
    public final String component1() {
        return this.mode_img;
    }

    @d
    public final FeedsLoginInfoObj copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15760, new Class[]{String.class}, FeedsLoginInfoObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsLoginInfoObj) patchProxyResultProxy.result : new FeedsLoginInfoObj(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15764, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedsLoginInfoObj) && f0.g(this.mode_img, ((FeedsLoginInfoObj) obj).mode_img);
    }

    @e
    public final String getMode_img() {
        return this.mode_img;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15763, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.mode_img;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setMode_img(@e String str) {
        this.mode_img = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15762, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsLoginInfoObj(mode_img=" + this.mode_img + ')';
    }
}
