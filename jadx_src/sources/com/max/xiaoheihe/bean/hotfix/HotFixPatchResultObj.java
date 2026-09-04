package com.max.xiaoheihe.bean.hotfix;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: HotFixPatchResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class HotFixPatchResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private HotFixPatchObj patch_bit;

    public HotFixPatchResultObj(@e HotFixPatchObj hotFixPatchObj) {
        this.patch_bit = hotFixPatchObj;
    }

    public static /* synthetic */ HotFixPatchResultObj copy$default(HotFixPatchResultObj hotFixPatchResultObj, HotFixPatchObj hotFixPatchObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotFixPatchResultObj, hotFixPatchObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15474, new Class[]{HotFixPatchResultObj.class, HotFixPatchObj.class, Integer.TYPE, Object.class}, HotFixPatchResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (HotFixPatchResultObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            hotFixPatchObj = hotFixPatchResultObj.patch_bit;
        }
        return hotFixPatchResultObj.copy(hotFixPatchObj);
    }

    @e
    public final HotFixPatchObj component1() {
        return this.patch_bit;
    }

    @d
    public final HotFixPatchResultObj copy(@e HotFixPatchObj hotFixPatchObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hotFixPatchObj}, this, changeQuickRedirect, false, 15473, new Class[]{HotFixPatchObj.class}, HotFixPatchResultObj.class);
        return patchProxyResultProxy.isSupported ? (HotFixPatchResultObj) patchProxyResultProxy.result : new HotFixPatchResultObj(hotFixPatchObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15477, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof HotFixPatchResultObj) && f0.g(this.patch_bit, ((HotFixPatchResultObj) obj).patch_bit);
    }

    @e
    public final HotFixPatchObj getPatch_bit() {
        return this.patch_bit;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15476, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        HotFixPatchObj hotFixPatchObj = this.patch_bit;
        if (hotFixPatchObj == null) {
            return 0;
        }
        return hotFixPatchObj.hashCode();
    }

    public final void setPatch_bit(@e HotFixPatchObj hotFixPatchObj) {
        this.patch_bit = hotFixPatchObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15475, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HotFixPatchResultObj(patch_bit=" + this.patch_bit + ')';
    }
}
