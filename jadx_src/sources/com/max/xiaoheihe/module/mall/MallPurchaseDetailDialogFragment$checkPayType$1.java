package com.max.xiaoheihe.module.mall;

import android.app.ProgressDialog;
import com.max.hbpay.PaymentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$checkPayType$1", f = "MallPurchaseDetailDialogFragment.kt", i = {}, l = {bb.c.b.f30929sb}, m = "invokeSuspend", n = {}, s = {})
public final class MallPurchaseDetailDialogFragment$checkPayType$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MallPurchaseDetailDialogFragment f89720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f89721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MallPurchaseDetailDialogFragment$checkPayType$1(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str, kotlin.coroutines.c<? super MallPurchaseDetailDialogFragment$checkPayType$1> cVar) {
        super(2, cVar);
        this.f89720c = mallPurchaseDetailDialogFragment;
        this.f89721d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 40512, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MallPurchaseDetailDialogFragment$checkPayType$1(this.f89720c, this.f89721d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40514, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40513, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MallPurchaseDetailDialogFragment$checkPayType$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40511, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89719b;
        if (i10 == 0) {
            t0.n(obj);
            this.f89719b = 1;
            if (DelayKt.b(500L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        if (this.f89720c.isActive()) {
            if (f0.g("balance", this.f89720c.D)) {
                MallPurchaseDetailDialogFragment.i4(this.f89720c, this.f89721d);
            } else {
                PaymentManager paymentManager = null;
                if (f0.g(PaymentManager.f71422u, this.f89720c.D)) {
                    MallPurchaseDetailDialogFragment.W3(this.f89720c);
                    MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89720c;
                    PaymentManager paymentManager2 = mallPurchaseDetailDialogFragment.Q;
                    if (paymentManager2 == null) {
                        f0.S("mPaymentManager");
                    } else {
                        paymentManager = paymentManager2;
                    }
                    ProgressDialog progressDialogM = paymentManager.M(2, this.f89721d);
                    f0.o(progressDialogM, "mPaymentManager.requestPay(PAY_TYPE_ALI, payPrice)");
                    mallPurchaseDetailDialogFragment.R = progressDialogM;
                } else if (f0.g("lianlian", this.f89720c.D)) {
                    MallPurchaseDetailDialogFragment.W3(this.f89720c);
                    MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment2 = this.f89720c;
                    PaymentManager paymentManager3 = mallPurchaseDetailDialogFragment2.Q;
                    if (paymentManager3 == null) {
                        f0.S("mPaymentManager");
                    } else {
                        paymentManager = paymentManager3;
                    }
                    ProgressDialog progressDialogM2 = paymentManager.M(4, this.f89721d);
                    f0.o(progressDialogM2, "mPaymentManager.requestP…_TYPE_LIANLIAN, payPrice)");
                    mallPurchaseDetailDialogFragment2.R = progressDialogM2;
                } else {
                    MallPurchaseDetailDialogFragment.W3(this.f89720c);
                    MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment3 = this.f89720c;
                    PaymentManager paymentManager4 = mallPurchaseDetailDialogFragment3.Q;
                    if (paymentManager4 == null) {
                        f0.S("mPaymentManager");
                    } else {
                        paymentManager = paymentManager4;
                    }
                    ProgressDialog progressDialogM3 = paymentManager.M(1, this.f89721d);
                    f0.o(progressDialogM3, "mPaymentManager.requestP…AY_TYPE_WEIXIN, payPrice)");
                    mallPurchaseDetailDialogFragment3.R = progressDialogM3;
                }
            }
        }
        return b2.f124493a;
    }
}
