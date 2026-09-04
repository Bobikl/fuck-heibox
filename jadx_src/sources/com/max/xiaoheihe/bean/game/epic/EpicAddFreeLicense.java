package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicAddFreeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicAddFreeLicense implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<EpicAddFreeAssets> assets;

    public EpicAddFreeLicense(@e List<EpicAddFreeAssets> list) {
        this.assets = list;
    }

    public static /* synthetic */ EpicAddFreeLicense copy$default(EpicAddFreeLicense epicAddFreeLicense, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicAddFreeLicense, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 15152, new Class[]{EpicAddFreeLicense.class, List.class, Integer.TYPE, Object.class}, EpicAddFreeLicense.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicAddFreeLicense) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = epicAddFreeLicense.assets;
        }
        return epicAddFreeLicense.copy(list);
    }

    @e
    public final List<EpicAddFreeAssets> component1() {
        return this.assets;
    }

    @d
    public final EpicAddFreeLicense copy(@e List<EpicAddFreeAssets> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 15151, new Class[]{List.class}, EpicAddFreeLicense.class);
        return patchProxyResultProxy.isSupported ? (EpicAddFreeLicense) patchProxyResultProxy.result : new EpicAddFreeLicense(list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15155, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpicAddFreeLicense) && f0.g(this.assets, ((EpicAddFreeLicense) obj).assets);
    }

    @e
    public final List<EpicAddFreeAssets> getAssets() {
        return this.assets;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15154, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<EpicAddFreeAssets> list = this.assets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setAssets(@e List<EpicAddFreeAssets> list) {
        this.assets = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15153, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicAddFreeLicense(assets=" + this.assets + ')';
    }
}
