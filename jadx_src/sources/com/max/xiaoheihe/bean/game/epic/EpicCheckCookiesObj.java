package com.max.xiaoheihe.bean.game.epic;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: EpicCheckCookiesObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class EpicCheckCookiesObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isAccountVerified;
    private boolean isSuccess;

    public EpicCheckCookiesObj(boolean z10, boolean z11) {
        this.isSuccess = z10;
        this.isAccountVerified = z11;
    }

    public static /* synthetic */ EpicCheckCookiesObj copy$default(EpicCheckCookiesObj epicCheckCookiesObj, boolean z10, boolean z11, int i10, Object obj) {
        Object[] objArr = {epicCheckCookiesObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15162, new Class[]{EpicCheckCookiesObj.class, cls, cls, Integer.TYPE, Object.class}, EpicCheckCookiesObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (EpicCheckCookiesObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = epicCheckCookiesObj.isSuccess;
        }
        if ((i10 & 2) != 0) {
            z11 = epicCheckCookiesObj.isAccountVerified;
        }
        return epicCheckCookiesObj.copy(z10, z11);
    }

    public final boolean component1() {
        return this.isSuccess;
    }

    public final boolean component2() {
        return this.isAccountVerified;
    }

    @d
    public final EpicCheckCookiesObj copy(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15161, new Class[]{cls, cls}, EpicCheckCookiesObj.class);
        return patchProxyResultProxy.isSupported ? (EpicCheckCookiesObj) patchProxyResultProxy.result : new EpicCheckCookiesObj(z10, z11);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpicCheckCookiesObj)) {
            return false;
        }
        EpicCheckCookiesObj epicCheckCookiesObj = (EpicCheckCookiesObj) obj;
        return this.isSuccess == epicCheckCookiesObj.isSuccess && this.isAccountVerified == epicCheckCookiesObj.isAccountVerified;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z10 = this.isSuccess;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.isAccountVerified;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean isAccountVerified() {
        return this.isAccountVerified;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setAccountVerified(boolean z10) {
        this.isAccountVerified = z10;
    }

    public final void setSuccess(boolean z10) {
        this.isSuccess = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15163, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "EpicCheckCookiesObj(isSuccess=" + this.isSuccess + ", isAccountVerified=" + this.isAccountVerified + ')';
    }
}
