package com.max.xiaoheihe.module.mall.cart;

import androidx.fragment.app.FragmentManager;
import com.max.hbutils.bean.Result;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.mall.purchase.UseBuyPurchaseDialogObj;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.max.xiaoheihe.module.mall.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: MallCartUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "com.max.xiaoheihe.module.mall.cart.MallCartUtils$showPurchaseDialog$1$onNext$1", f = "MallCartUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MallCartUtils$showPurchaseDialog$1$onNext$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f90247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ FragmentManager f90248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Result<UseBuyPurchaseDialogObj> f90249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f90250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f90251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f90252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f90253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f90254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ Boolean f90255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f90256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ String f90257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f90258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f90259n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f90260o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ String f90261p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ String f90262q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MallCartUtils$showPurchaseDialog$1$onNext$1(FragmentManager fragmentManager, Result<UseBuyPurchaseDialogObj> result, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, String str12, c<? super MallCartUtils$showPurchaseDialog$1$onNext$1> cVar) {
        super(2, cVar);
        this.f90248c = fragmentManager;
        this.f90249d = result;
        this.f90250e = str;
        this.f90251f = str2;
        this.f90252g = str3;
        this.f90253h = str4;
        this.f90254i = str5;
        this.f90255j = bool;
        this.f90256k = str6;
        this.f90257l = str7;
        this.f90258m = str8;
        this.f90259n = str9;
        this.f90260o = str10;
        this.f90261p = str11;
        this.f90262q = str12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41410, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new MallCartUtils$showPurchaseDialog$1$onNext$1(this.f90248c, this.f90249d, this.f90250e, this.f90251f, this.f90252g, this.f90253h, this.f90254i, this.f90255j, this.f90256k, this.f90257l, this.f90258m, this.f90259n, this.f90260o, this.f90261p, this.f90262q, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41412, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41411, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((MallCartUtils$showPurchaseDialog$1$onNext$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41409, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f90247b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        try {
            if (this.f90248c != null) {
                UseBuyPurchaseDialogObj result = this.f90249d.getResult();
                if (result != null ? f0.g(result.getNew_cashier(), a.a(true)) : false) {
                    MallPurchaseDetailDialogFragment.a aVar = MallPurchaseDetailDialogFragment.f89678c0;
                    String str = this.f90250e;
                    String str2 = this.f90251f;
                    String str3 = this.f90252g;
                    String str4 = this.f90253h;
                    String str5 = this.f90254i;
                    Boolean bool = this.f90255j;
                    aVar.a(str, str2, str3, str4, str5, bool != null ? bool.booleanValue() : false).show(this.f90248c, this.f90256k);
                } else {
                    i.b4(this.f90250e, this.f90251f, this.f90252g, this.f90257l, this.f90258m, this.f90259n, this.f90253h, this.f90260o, this.f90261p, this.f90262q).show(this.f90248c, this.f90256k);
                }
                final Result<UseBuyPurchaseDialogObj> result2 = this.f90249d;
                com.max.hbmmkv.c.a("mall", new l<com.max.hbmmkv.b, b2>() { // from class: com.max.xiaoheihe.module.mall.cart.MallCartUtils$showPurchaseDialog$1$onNext$1.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d com.max.hbmmkv.b withMMKV) {
                        if (PatchProxy.proxy(new Object[]{withMMKV}, this, changeQuickRedirect, false, 41413, new Class[]{com.max.hbmmkv.b.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        f0.p(withMMKV, "$this$withMMKV");
                        UseBuyPurchaseDialogObj result3 = result2.getResult();
                        withMMKV.i(ad.d.f1247b, com.max.hbcommon.utils.c.x(result3 != null ? result3.getMall_purcahse_dialog_style_v2() : null), true);
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(com.max.hbmmkv.b bVar) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, 41414, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return patchProxyResultProxy2.result;
                        }
                        a(bVar);
                        return b2.f124493a;
                    }
                });
            }
        } catch (Throwable th2) {
            g.f74531b.v("showPurchaseDialog  onNext  " + th2.getMessage());
        }
        return b2.f124493a;
    }
}
