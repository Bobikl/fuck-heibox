package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BindFailedInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BindFailedInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ConflictUserInfo user;

    public BindFailedInfoObj(@e ConflictUserInfo conflictUserInfo) {
        this.user = conflictUserInfo;
    }

    public static /* synthetic */ BindFailedInfoObj copy$default(BindFailedInfoObj bindFailedInfoObj, ConflictUserInfo conflictUserInfo, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bindFailedInfoObj, conflictUserInfo, new Integer(i10), obj}, null, changeQuickRedirect, true, 16008, new Class[]{BindFailedInfoObj.class, ConflictUserInfo.class, Integer.TYPE, Object.class}, BindFailedInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BindFailedInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            conflictUserInfo = bindFailedInfoObj.user;
        }
        return bindFailedInfoObj.copy(conflictUserInfo);
    }

    @e
    public final ConflictUserInfo component1() {
        return this.user;
    }

    @d
    public final BindFailedInfoObj copy(@e ConflictUserInfo conflictUserInfo) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{conflictUserInfo}, this, changeQuickRedirect, false, 16007, new Class[]{ConflictUserInfo.class}, BindFailedInfoObj.class);
        return patchProxyResultProxy.isSupported ? (BindFailedInfoObj) patchProxyResultProxy.result : new BindFailedInfoObj(conflictUserInfo);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16011, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindFailedInfoObj) && f0.g(this.user, ((BindFailedInfoObj) obj).user);
    }

    @e
    public final ConflictUserInfo getUser() {
        return this.user;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16010, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ConflictUserInfo conflictUserInfo = this.user;
        if (conflictUserInfo == null) {
            return 0;
        }
        return conflictUserInfo.hashCode();
    }

    public final void setUser(@e ConflictUserInfo conflictUserInfo) {
        this.user = conflictUserInfo;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16009, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BindFailedInfoObj(user=" + this.user + ')';
    }
}
