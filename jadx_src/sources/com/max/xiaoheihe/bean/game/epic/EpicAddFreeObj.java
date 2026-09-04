package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicAddFreeObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicAddFreeObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private EpicAddFreeLicense addfreelicense_epic;

    public EpicAddFreeObj(@e EpicAddFreeLicense epicAddFreeLicense) {
        this.addfreelicense_epic = epicAddFreeLicense;
    }

    public static /* synthetic */ EpicAddFreeObj copy$default(EpicAddFreeObj epicAddFreeObj, EpicAddFreeLicense epicAddFreeLicense, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicAddFreeObj, epicAddFreeLicense, new Integer(i10), obj}, null, changeQuickRedirect, true, 15157, new Class[]{EpicAddFreeObj.class, EpicAddFreeLicense.class, Integer.TYPE, Object.class}, EpicAddFreeObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicAddFreeObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            epicAddFreeLicense = epicAddFreeObj.addfreelicense_epic;
        }
        return epicAddFreeObj.copy(epicAddFreeLicense);
    }

    @e
    public final EpicAddFreeLicense component1() {
        return this.addfreelicense_epic;
    }

    @d
    public final EpicAddFreeObj copy(@e EpicAddFreeLicense epicAddFreeLicense) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{epicAddFreeLicense}, this, changeQuickRedirect, false, 15156, new Class[]{EpicAddFreeLicense.class}, EpicAddFreeObj.class);
        return patchProxyResultProxy.isSupported ? (EpicAddFreeObj) patchProxyResultProxy.result : new EpicAddFreeObj(epicAddFreeLicense);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15160, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof EpicAddFreeObj) && f0.g(this.addfreelicense_epic, ((EpicAddFreeObj) obj).addfreelicense_epic);
    }

    @e
    public final EpicAddFreeLicense getAddfreelicense_epic() {
        return this.addfreelicense_epic;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15159, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        EpicAddFreeLicense epicAddFreeLicense = this.addfreelicense_epic;
        if (epicAddFreeLicense == null) {
            return 0;
        }
        return epicAddFreeLicense.hashCode();
    }

    public final void setAddfreelicense_epic(@e EpicAddFreeLicense epicAddFreeLicense) {
        this.addfreelicense_epic = epicAddFreeLicense;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15158, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicAddFreeObj(addfreelicense_epic=" + this.addfreelicense_epic + ')';
    }
}
