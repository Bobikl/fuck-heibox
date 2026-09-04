package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FollowNotifierObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FollowNotifierObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private PushBtnInfoObj cancel_msg;

    @e
    private PushBtnInfoObj confirm;

    @e
    private String notify_msg;

    public FollowNotifierObj(@e String str, @e PushBtnInfoObj pushBtnInfoObj, @e PushBtnInfoObj pushBtnInfoObj2) {
        this.notify_msg = str;
        this.cancel_msg = pushBtnInfoObj;
        this.confirm = pushBtnInfoObj2;
    }

    public static /* synthetic */ FollowNotifierObj copy$default(FollowNotifierObj followNotifierObj, String str, PushBtnInfoObj pushBtnInfoObj, PushBtnInfoObj pushBtnInfoObj2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{followNotifierObj, str, pushBtnInfoObj, pushBtnInfoObj2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14668, new Class[]{FollowNotifierObj.class, String.class, PushBtnInfoObj.class, PushBtnInfoObj.class, Integer.TYPE, Object.class}, FollowNotifierObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowNotifierObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = followNotifierObj.notify_msg;
        }
        if ((i10 & 2) != 0) {
            pushBtnInfoObj = followNotifierObj.cancel_msg;
        }
        if ((i10 & 4) != 0) {
            pushBtnInfoObj2 = followNotifierObj.confirm;
        }
        return followNotifierObj.copy(str, pushBtnInfoObj, pushBtnInfoObj2);
    }

    @e
    public final String component1() {
        return this.notify_msg;
    }

    @e
    public final PushBtnInfoObj component2() {
        return this.cancel_msg;
    }

    @e
    public final PushBtnInfoObj component3() {
        return this.confirm;
    }

    @d
    public final FollowNotifierObj copy(@e String str, @e PushBtnInfoObj pushBtnInfoObj, @e PushBtnInfoObj pushBtnInfoObj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, pushBtnInfoObj, pushBtnInfoObj2}, this, changeQuickRedirect, false, 14667, new Class[]{String.class, PushBtnInfoObj.class, PushBtnInfoObj.class}, FollowNotifierObj.class);
        return patchProxyResultProxy.isSupported ? (FollowNotifierObj) patchProxyResultProxy.result : new FollowNotifierObj(str, pushBtnInfoObj, pushBtnInfoObj2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14671, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowNotifierObj)) {
            return false;
        }
        FollowNotifierObj followNotifierObj = (FollowNotifierObj) obj;
        return f0.g(this.notify_msg, followNotifierObj.notify_msg) && f0.g(this.cancel_msg, followNotifierObj.cancel_msg) && f0.g(this.confirm, followNotifierObj.confirm);
    }

    @e
    public final PushBtnInfoObj getCancel_msg() {
        return this.cancel_msg;
    }

    @e
    public final PushBtnInfoObj getConfirm() {
        return this.confirm;
    }

    @e
    public final String getNotify_msg() {
        return this.notify_msg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14670, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.notify_msg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PushBtnInfoObj pushBtnInfoObj = this.cancel_msg;
        int iHashCode2 = (iHashCode + (pushBtnInfoObj == null ? 0 : pushBtnInfoObj.hashCode())) * 31;
        PushBtnInfoObj pushBtnInfoObj2 = this.confirm;
        return iHashCode2 + (pushBtnInfoObj2 != null ? pushBtnInfoObj2.hashCode() : 0);
    }

    public final void setCancel_msg(@e PushBtnInfoObj pushBtnInfoObj) {
        this.cancel_msg = pushBtnInfoObj;
    }

    public final void setConfirm(@e PushBtnInfoObj pushBtnInfoObj) {
        this.confirm = pushBtnInfoObj;
    }

    public final void setNotify_msg(@e String str) {
        this.notify_msg = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14669, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FollowNotifierObj(notify_msg=" + this.notify_msg + ", cancel_msg=" + this.cancel_msg + ", confirm=" + this.confirm + ')';
    }
}
