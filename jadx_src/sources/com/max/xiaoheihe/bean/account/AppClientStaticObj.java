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

/* JADX INFO: compiled from: AppClientStaticObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AppClientStaticObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ImageConfigObj image_config;

    public AppClientStaticObj(@e ImageConfigObj imageConfigObj) {
        this.image_config = imageConfigObj;
    }

    public static /* synthetic */ AppClientStaticObj copy$default(AppClientStaticObj appClientStaticObj, ImageConfigObj imageConfigObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{appClientStaticObj, imageConfigObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.sO, new Class[]{AppClientStaticObj.class, ImageConfigObj.class, Integer.TYPE, Object.class}, AppClientStaticObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AppClientStaticObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            imageConfigObj = appClientStaticObj.image_config;
        }
        return appClientStaticObj.copy(imageConfigObj);
    }

    @e
    public final ImageConfigObj component1() {
        return this.image_config;
    }

    @d
    public final AppClientStaticObj copy(@e ImageConfigObj imageConfigObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageConfigObj}, this, changeQuickRedirect, false, c.m.rO, new Class[]{ImageConfigObj.class}, AppClientStaticObj.class);
        return patchProxyResultProxy.isSupported ? (AppClientStaticObj) patchProxyResultProxy.result : new AppClientStaticObj(imageConfigObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.vO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppClientStaticObj) && f0.g(this.image_config, ((AppClientStaticObj) obj).image_config);
    }

    @e
    public final ImageConfigObj getImage_config() {
        return this.image_config;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.uO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ImageConfigObj imageConfigObj = this.image_config;
        if (imageConfigObj == null) {
            return 0;
        }
        return imageConfigObj.hashCode();
    }

    public final void setImage_config(@e ImageConfigObj imageConfigObj) {
        this.image_config = imageConfigObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.tO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AppClientStaticObj(image_config=" + this.image_config + ')';
    }
}
