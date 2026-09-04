package com.max.hbwallet.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: WithdrawResult.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WithdrawResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String certify_id;

    @e
    private String error_msg;

    @e
    private String need_certify;

    @e
    private String need_query;

    @e
    private String success;

    @e
    private String success_msg;

    public WithdrawResult(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.success = str;
        this.error_msg = str2;
        this.need_certify = str3;
        this.need_query = str4;
        this.certify_id = str5;
        this.success_msg = str6;
    }

    public static /* synthetic */ WithdrawResult copy$default(WithdrawResult withdrawResult, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{withdrawResult, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, c.l.f34037b4, new Class[]{WithdrawResult.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, WithdrawResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (WithdrawResult) patchProxyResultProxy.result;
        }
        return withdrawResult.copy((i10 & 1) != 0 ? withdrawResult.success : str, (i10 & 2) != 0 ? withdrawResult.error_msg : str2, (i10 & 4) != 0 ? withdrawResult.need_certify : str3, (i10 & 8) != 0 ? withdrawResult.need_query : str4, (i10 & 16) != 0 ? withdrawResult.certify_id : str5, (i10 & 32) != 0 ? withdrawResult.success_msg : str6);
    }

    @e
    public final String component1() {
        return this.success;
    }

    @e
    public final String component2() {
        return this.error_msg;
    }

    @e
    public final String component3() {
        return this.need_certify;
    }

    @e
    public final String component4() {
        return this.need_query;
    }

    @e
    public final String component5() {
        return this.certify_id;
    }

    @e
    public final String component6() {
        return this.success_msg;
    }

    @d
    public final WithdrawResult copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, c.l.f34014a4, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, WithdrawResult.class);
        return patchProxyResultProxy.isSupported ? (WithdrawResult) patchProxyResultProxy.result : new WithdrawResult(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.f34106e4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawResult)) {
            return false;
        }
        WithdrawResult withdrawResult = (WithdrawResult) obj;
        return f0.g(this.success, withdrawResult.success) && f0.g(this.error_msg, withdrawResult.error_msg) && f0.g(this.need_certify, withdrawResult.need_certify) && f0.g(this.need_query, withdrawResult.need_query) && f0.g(this.certify_id, withdrawResult.certify_id) && f0.g(this.success_msg, withdrawResult.success_msg);
    }

    @e
    public final String getCertify_id() {
        return this.certify_id;
    }

    @e
    public final String getError_msg() {
        return this.error_msg;
    }

    @e
    public final String getNeed_certify() {
        return this.need_certify;
    }

    @e
    public final String getNeed_query() {
        return this.need_query;
    }

    @e
    public final String getSuccess() {
        return this.success;
    }

    @e
    public final String getSuccess_msg() {
        return this.success_msg;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34083d4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.success;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error_msg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.need_certify;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.need_query;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.certify_id;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.success_msg;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCertify_id(@e String str) {
        this.certify_id = str;
    }

    public final void setError_msg(@e String str) {
        this.error_msg = str;
    }

    public final void setNeed_certify(@e String str) {
        this.need_certify = str;
    }

    public final void setNeed_query(@e String str) {
        this.need_query = str;
    }

    public final void setSuccess(@e String str) {
        this.success = str;
    }

    public final void setSuccess_msg(@e String str) {
        this.success_msg = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.f34060c4, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "WithdrawResult(success=" + this.success + ", error_msg=" + this.error_msg + ", need_certify=" + this.need_certify + ", need_query=" + this.need_query + ", certify_id=" + this.certify_id + ", success_msg=" + this.success_msg + ')';
    }
}
