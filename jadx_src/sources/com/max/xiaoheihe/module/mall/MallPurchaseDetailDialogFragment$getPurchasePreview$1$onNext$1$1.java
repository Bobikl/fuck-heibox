package com.max.xiaoheihe.module.mall;

import com.max.xiaoheihe.bean.mall.cart.SuggestDiscountInfo;
import com.max.xiaoheihe.bean.mall.purchase.PurchasePreviewResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1", f = "MallPurchaseDetailDialogFragment.kt", i = {}, l = {bb.c.b.f31011w5}, m = "invokeSuspend", n = {}, s = {})
public final class MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f89740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MallPurchaseDetailDialogFragment f89741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PurchasePreviewResultObj f89742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, PurchasePreviewResultObj purchasePreviewResultObj, kotlin.coroutines.c<? super MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1> cVar) {
        super(2, cVar);
        this.f89741c = mallPurchaseDetailDialogFragment;
        this.f89742d = purchasePreviewResultObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 40531, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1(this.f89741c, this.f89742d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40533, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40532, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40530, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f89740b;
        if (i10 == 0) {
            t0.n(obj);
            long jCurrentTimeMillis = ((long) bb.c.b.M3) - (System.currentTimeMillis() - this.f89741c.Y);
            this.f89740b = 1;
            if (DelayKt.b(jCurrentTimeMillis, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        if (this.f89741c.isActive()) {
            MallPurchaseDetailDialogFragment.J4(this.f89741c, this.f89742d);
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89741c;
            SuggestDiscountInfo choose_discount_info = this.f89742d.getChoose_discount_info();
            MallPurchaseDetailDialogFragment.B4(mallPurchaseDetailDialogFragment, choose_discount_info != null ? choose_discount_info.getCoupon_id() : null, 0L);
        }
        return b2.f124493a;
    }
}
