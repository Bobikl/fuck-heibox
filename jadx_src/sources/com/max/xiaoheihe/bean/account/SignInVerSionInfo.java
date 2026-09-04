package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SignInVerSionInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class SignInVerSionInfo implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String today_signed;

    @e
    private String version;

    public SignInVerSionInfo(@e String str, @e String str2) {
        this.version = str;
        this.today_signed = str2;
    }

    public static /* synthetic */ SignInVerSionInfo copy$default(SignInVerSionInfo signInVerSionInfo, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{signInVerSionInfo, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 13966, new Class[]{SignInVerSionInfo.class, String.class, String.class, Integer.TYPE, Object.class}, SignInVerSionInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (SignInVerSionInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = signInVerSionInfo.version;
        }
        if ((i10 & 2) != 0) {
            str2 = signInVerSionInfo.today_signed;
        }
        return signInVerSionInfo.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.version;
    }

    @e
    public final String component2() {
        return this.today_signed;
    }

    @d
    public final SignInVerSionInfo copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 13965, new Class[]{String.class, String.class}, SignInVerSionInfo.class);
        return patchProxyResultProxy.isSupported ? (SignInVerSionInfo) patchProxyResultProxy.result : new SignInVerSionInfo(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13969, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInVerSionInfo)) {
            return false;
        }
        SignInVerSionInfo signInVerSionInfo = (SignInVerSionInfo) obj;
        return f0.g(this.version, signInVerSionInfo.version) && f0.g(this.today_signed, signInVerSionInfo.today_signed);
    }

    @e
    public final String getToday_signed() {
        return this.today_signed;
    }

    @e
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13968, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.today_signed;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setToday_signed(@e String str) {
        this.today_signed = str;
    }

    public final void setVersion(@e String str) {
        this.version = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13967, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "SignInVerSionInfo(version=" + this.version + ", today_signed=" + this.today_signed + ')';
    }
}
