package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PayPwdConfigObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PayPwdConfigObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean pay_without_pwd;

    @e
    private String restriction_tip;
    private boolean set_pay_password;

    public PayPwdConfigObj(boolean z10, boolean z11, @e String str) {
        this.pay_without_pwd = z10;
        this.set_pay_password = z11;
        this.restriction_tip = str;
    }

    public /* synthetic */ PayPwdConfigObj(boolean z10, boolean z11, String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, str);
    }

    public static /* synthetic */ PayPwdConfigObj copy$default(PayPwdConfigObj payPwdConfigObj, boolean z10, boolean z11, String str, int i10, Object obj) {
        Object[] objArr = {payPwdConfigObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 13900, new Class[]{PayPwdConfigObj.class, cls, cls, String.class, Integer.TYPE, Object.class}, PayPwdConfigObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PayPwdConfigObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z10 = payPwdConfigObj.pay_without_pwd;
        }
        if ((i10 & 2) != 0) {
            z11 = payPwdConfigObj.set_pay_password;
        }
        if ((i10 & 4) != 0) {
            str = payPwdConfigObj.restriction_tip;
        }
        return payPwdConfigObj.copy(z10, z11, str);
    }

    public final boolean component1() {
        return this.pay_without_pwd;
    }

    public final boolean component2() {
        return this.set_pay_password;
    }

    @e
    public final String component3() {
        return this.restriction_tip;
    }

    @d
    public final PayPwdConfigObj copy(boolean z10, boolean z11, @e String str) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 13899, new Class[]{cls, cls, String.class}, PayPwdConfigObj.class);
        return patchProxyResultProxy.isSupported ? (PayPwdConfigObj) patchProxyResultProxy.result : new PayPwdConfigObj(z10, z11, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13903, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPwdConfigObj)) {
            return false;
        }
        PayPwdConfigObj payPwdConfigObj = (PayPwdConfigObj) obj;
        return this.pay_without_pwd == payPwdConfigObj.pay_without_pwd && this.set_pay_password == payPwdConfigObj.set_pay_password && f0.g(this.restriction_tip, payPwdConfigObj.restriction_tip);
    }

    public final boolean getPay_without_pwd() {
        return this.pay_without_pwd;
    }

    @e
    public final String getRestriction_tip() {
        return this.restriction_tip;
    }

    public final boolean getSet_pay_password() {
        return this.set_pay_password;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13902, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.pay_without_pwd;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = r10 * 31;
        boolean z11 = this.set_pay_password;
        int i11 = (i10 + (z11 ? 1 : z11)) * 31;
        String str = this.restriction_tip;
        return i11 + (str != null ? str.hashCode() : 0);
    }

    public final void setPay_without_pwd(boolean z10) {
        this.pay_without_pwd = z10;
    }

    public final void setRestriction_tip(@e String str) {
        this.restriction_tip = str;
    }

    public final void setSet_pay_password(boolean z10) {
        this.set_pay_password = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13901, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PayPwdConfigObj(pay_without_pwd=" + this.pay_without_pwd + ", set_pay_password=" + this.set_pay_password + ", restriction_tip=" + this.restriction_tip + ')';
    }
}
