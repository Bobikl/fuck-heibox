package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallTaskNotifyObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MallTaskNotifyObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private KeyDescObj notify;

    public MallTaskNotifyObj(@e KeyDescObj keyDescObj) {
        this.notify = keyDescObj;
    }

    public static /* synthetic */ MallTaskNotifyObj copy$default(MallTaskNotifyObj mallTaskNotifyObj, KeyDescObj keyDescObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallTaskNotifyObj, keyDescObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15512, new Class[]{MallTaskNotifyObj.class, KeyDescObj.class, Integer.TYPE, Object.class}, MallTaskNotifyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallTaskNotifyObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            keyDescObj = mallTaskNotifyObj.notify;
        }
        return mallTaskNotifyObj.copy(keyDescObj);
    }

    @e
    public final KeyDescObj component1() {
        return this.notify;
    }

    @d
    public final MallTaskNotifyObj copy(@e KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 15511, new Class[]{KeyDescObj.class}, MallTaskNotifyObj.class);
        return patchProxyResultProxy.isSupported ? (MallTaskNotifyObj) patchProxyResultProxy.result : new MallTaskNotifyObj(keyDescObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15515, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof MallTaskNotifyObj) && f0.g(this.notify, ((MallTaskNotifyObj) obj).notify);
    }

    @e
    public final KeyDescObj getNotify() {
        return this.notify;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15514, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        KeyDescObj keyDescObj = this.notify;
        if (keyDescObj == null) {
            return 0;
        }
        return keyDescObj.hashCode();
    }

    public final void setNotify(@e KeyDescObj keyDescObj) {
        this.notify = keyDescObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15513, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MallTaskNotifyObj(notify=" + this.notify + ')';
    }
}
