package com.max.xiaoheihe.bean.trade;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AliCertifyResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AliCertifyResult implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String certify_id;

    @e
    private String op;

    @e
    private String toast_msg;

    @e
    private String url;

    public AliCertifyResult(@e String str, @e String str2, @e String str3, @e String str4) {
        this.op = str;
        this.certify_id = str2;
        this.url = str3;
        this.toast_msg = str4;
    }

    public static /* synthetic */ AliCertifyResult copy$default(AliCertifyResult aliCertifyResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aliCertifyResult, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15993, new Class[]{AliCertifyResult.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AliCertifyResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (AliCertifyResult) patchProxyResultProxy.result;
        }
        return aliCertifyResult.copy((i10 & 1) != 0 ? aliCertifyResult.op : str, (i10 & 2) != 0 ? aliCertifyResult.certify_id : str2, (i10 & 4) != 0 ? aliCertifyResult.url : str3, (i10 & 8) != 0 ? aliCertifyResult.toast_msg : str4);
    }

    @e
    public final String component1() {
        return this.op;
    }

    @e
    public final String component2() {
        return this.certify_id;
    }

    @e
    public final String component3() {
        return this.url;
    }

    @e
    public final String component4() {
        return this.toast_msg;
    }

    @d
    public final AliCertifyResult copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 15992, new Class[]{String.class, String.class, String.class, String.class}, AliCertifyResult.class);
        return patchProxyResultProxy.isSupported ? (AliCertifyResult) patchProxyResultProxy.result : new AliCertifyResult(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15996, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliCertifyResult)) {
            return false;
        }
        AliCertifyResult aliCertifyResult = (AliCertifyResult) obj;
        return f0.g(this.op, aliCertifyResult.op) && f0.g(this.certify_id, aliCertifyResult.certify_id) && f0.g(this.url, aliCertifyResult.url) && f0.g(this.toast_msg, aliCertifyResult.toast_msg);
    }

    @e
    public final String getCertify_id() {
        return this.certify_id;
    }

    @e
    public final String getOp() {
        return this.op;
    }

    @e
    public final String getToast_msg() {
        return this.toast_msg;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15995, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.op;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.certify_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toast_msg;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCertify_id(@e String str) {
        this.certify_id = str;
    }

    public final void setOp(@e String str) {
        this.op = str;
    }

    public final void setToast_msg(@e String str) {
        this.toast_msg = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15994, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AliCertifyResult(op=" + this.op + ", certify_id=" + this.certify_id + ", url=" + this.url + ", toast_msg=" + this.toast_msg + ')';
    }
}
