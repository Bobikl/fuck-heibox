package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FollowNotifierResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FollowNotifierResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String protocol;

    public FollowNotifierResult(@e String str) {
        this.protocol = str;
    }

    public static /* synthetic */ FollowNotifierResult copy$default(FollowNotifierResult followNotifierResult, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{followNotifierResult, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 14673, new Class[]{FollowNotifierResult.class, String.class, Integer.TYPE, Object.class}, FollowNotifierResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowNotifierResult) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = followNotifierResult.protocol;
        }
        return followNotifierResult.copy(str);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @d
    public final FollowNotifierResult copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14672, new Class[]{String.class}, FollowNotifierResult.class);
        return patchProxyResultProxy.isSupported ? (FollowNotifierResult) patchProxyResultProxy.result : new FollowNotifierResult(str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14676, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowNotifierResult) && f0.g(this.protocol, ((FollowNotifierResult) obj).protocol);
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14675, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14674, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FollowNotifierResult(protocol=" + this.protocol + ')';
    }
}
