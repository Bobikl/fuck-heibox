package com.max.xiaoheihe.module.mall.cart.viewmodel;

import androidx.compose.runtime.internal.o;
import androidx.lifecycle.w0;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hbpay.PaymentManager;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallCartOrderDetailViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class b extends w0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f90511k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private MallCouponObj f90512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private MallCouponObj f90513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private KeyDescObj f90514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private String f90515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private String f90516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private String f90517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private AddressInfoObj f90518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    private String f90519i = PaymentManager.A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f90520j;

    @d
    public final String c() {
        return this.f90519i;
    }

    public final boolean e() {
        return this.f90520j;
    }

    @e
    public final String f() {
        return this.f90517g;
    }

    @e
    public final AddressInfoObj g() {
        return this.f90518h;
    }

    @e
    public final MallCouponObj h() {
        return this.f90512b;
    }

    @e
    public final String i() {
        return this.f90515e;
    }

    @e
    public final KeyDescObj k() {
        return this.f90514d;
    }

    @e
    public final MallCouponObj m() {
        return this.f90513c;
    }

    @e
    public final String n() {
        return this.f90516f;
    }

    public final void o(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41825, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f90519i = str;
    }

    public final void p(boolean z10) {
        this.f90520j = z10;
    }

    public final void r(@e String str) {
        this.f90517g = str;
    }

    public final void s(@e AddressInfoObj addressInfoObj) {
        this.f90518h = addressInfoObj;
    }

    public final void t(@e MallCouponObj mallCouponObj) {
        this.f90512b = mallCouponObj;
    }

    public final void u(@e String str) {
        this.f90515e = str;
    }

    public final void v(@e KeyDescObj keyDescObj) {
        this.f90514d = keyDescObj;
    }

    public final void w(@e MallCouponObj mallCouponObj) {
        this.f90513c = mallCouponObj;
    }

    public final void x(@e String str) {
        this.f90516f = str;
    }
}
