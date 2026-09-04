package com.max.xiaoheihe.module.mall;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.FreshmanDiscountGameObj;
import com.max.xiaoheihe.bean.game.FreshmanDiscountObj;
import com.max.xiaoheihe.bean.mall.MallOrderParamObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.f5;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class q extends com.max.hbcommon.base.swipeback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final a f91007n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f91008o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final String f91009p = "appid";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f91010q = "mHSrc";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f5 f91011j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f91012k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f91013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private LoadingDialog f91014m;

    /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final q a(@dl.e String str, @dl.e String str2) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 40859, new Class[]{String.class, String.class}, q.class);
            if (patchProxyResultProxy.isSupported) {
                return (q) patchProxyResultProxy.result;
            }
            q qVar = new q();
            Bundle bundle = new Bundle();
            bundle.putString("appid", str);
            bundle.putString(q.f91010q, str2);
            qVar.setArguments(bundle);
            return qVar;
        }
    }

    /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<FreshmanDiscountObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40861, new Class[0], Void.TYPE).isSupported && q.this.isActive()) {
                super.onComplete();
                q.V3(q.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40860, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (q.this.isActive()) {
                super.onError(e10);
                q.V3(q.this);
            }
        }

        public void onNext(@dl.d Result<FreshmanDiscountObj> r10) {
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 40862, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(r10, "r");
            if (q.this.isActive()) {
                super.onNext(r10);
                q.Y3(q.this, r10.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40863, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<FreshmanDiscountObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FreshmanDiscountObj f91017c;

        c(FreshmanDiscountObj freshmanDiscountObj) {
            this.f91017c = freshmanDiscountObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40864, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            q.Z3(q.this, this.f91017c);
            q.a4(q.this, false);
        }
    }

    /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<MallPurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FreshmanDiscountObj f91019c;

        /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
        public static final class a implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseResultObj f91020a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f91021b;

            a(MallPurchaseResultObj mallPurchaseResultObj, q qVar) {
                this.f91020a = mallPurchaseResultObj;
                this.f91021b = qVar;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                FragmentActivity activity;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40868, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f91020a.getOrder_id()) || (activity = this.f91021b.getActivity()) == null) {
                    return;
                }
                MallPurchaseResultObj mallPurchaseResultObj = this.f91020a;
                if (f0.g("cart", mallPurchaseResultObj.getOrder_src())) {
                    String order_id = mallPurchaseResultObj.getOrder_id();
                    f0.o(order_id, "purchaseResultObj.order_id");
                    com.max.xiaoheihe.base.router.b.D(activity, order_id).A();
                } else {
                    String order_id2 = mallPurchaseResultObj.getOrder_id();
                    f0.o(order_id2, "purchaseResultObj.order_id");
                    com.max.xiaoheihe.base.router.b.R(activity, order_id2, true).A();
                }
            }
        }

        d(FreshmanDiscountObj freshmanDiscountObj) {
            this.f91019c = freshmanDiscountObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40865, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (q.this.isActive()) {
                super.onError(e10);
                q.V3(q.this);
                q.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<MallPurchaseResultObj> result) {
            FreshmanDiscountGameObj game_info;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40866, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (q.this.isActive()) {
                super.onNext(result);
                MallPurchaseResultObj result2 = result.getResult();
                String sku_id = null;
                if (f0.g("1", result2 != null ? result2.getNot_finish_order() : null)) {
                    q qVar = q.this;
                    q.b4(qVar, new a(result2, qVar));
                    return;
                }
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getOrder_id())) {
                    com.max.hbutils.utils.c.f(q.this.getString(R.string.fail));
                    q.this.dismiss();
                    return;
                }
                FragmentActivity activity = q.this.getActivity();
                if (activity != null) {
                    q qVar2 = q.this;
                    FreshmanDiscountObj freshmanDiscountObj = this.f91019c;
                    Intent intent = new Intent(lb.a.A);
                    intent.putExtra(lb.a.f130996l0, lb.a.f131044t0);
                    activity.sendBroadcast(intent);
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    OrderEvent orderEvent = OrderEvent.REGISTER;
                    String str = qVar2.f91012k;
                    if (freshmanDiscountObj != null && (game_info = freshmanDiscountObj.getGame_info()) != null) {
                        sku_id = game_info.getSku_id();
                    }
                    MallCartUtils.w(mallCartUtils, orderEvent, str, null, sku_id, result2.getOrder_id(), qVar2.f91013l, null, 64, null);
                    String order_id = result2.getOrder_id();
                    f0.o(order_id, "purchaseResultObj.order_id");
                    com.max.xiaoheihe.base.router.b.D(activity, order_id).A();
                }
                q.this.dismiss();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40867, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
    public static final class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f91022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f91023c;

        e(l0.g gVar, q qVar) {
            this.f91022b = gVar;
            this.f91023c = qVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40869, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            l0.g gVar = this.f91022b;
            if (gVar != null) {
                gVar.a();
            }
            dialogInterface.dismiss();
            this.f91023c.dismiss();
        }
    }

    /* JADX INFO: compiled from: NewComerDiscountDialogFragment.kt */
    public static final class f implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f91024b = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40870, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public static final /* synthetic */ void V3(q qVar) {
        if (PatchProxy.proxy(new Object[]{qVar}, null, changeQuickRedirect, true, 40854, new Class[]{q.class}, Void.TYPE).isSupported) {
            return;
        }
        qVar.c4();
    }

    public static final /* synthetic */ void Y3(q qVar, FreshmanDiscountObj freshmanDiscountObj) {
        if (PatchProxy.proxy(new Object[]{qVar, freshmanDiscountObj}, null, changeQuickRedirect, true, 40855, new Class[]{q.class, FreshmanDiscountObj.class}, Void.TYPE).isSupported) {
            return;
        }
        qVar.h4(freshmanDiscountObj);
    }

    public static final /* synthetic */ void Z3(q qVar, FreshmanDiscountObj freshmanDiscountObj) {
        if (PatchProxy.proxy(new Object[]{qVar, freshmanDiscountObj}, null, changeQuickRedirect, true, 40857, new Class[]{q.class, FreshmanDiscountObj.class}, Void.TYPE).isSupported) {
            return;
        }
        qVar.i4(freshmanDiscountObj);
    }

    public static final /* synthetic */ void a4(q qVar, boolean z10) {
        if (PatchProxy.proxy(new Object[]{qVar, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40858, new Class[]{q.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        qVar.j4(z10);
    }

    public static final /* synthetic */ void b4(q qVar, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{qVar, gVar}, null, changeQuickRedirect, true, 40856, new Class[]{q.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        qVar.m4(gVar);
    }

    private final void c4() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40851, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.f91014m) == null) {
            return;
        }
        loadingDialog.c();
    }

    private final String e4(String str, String str2, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 40848, new Class[]{String.class, String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        mallRegisterOrderObj.setSession(com.max.hbutils.utils.n.r(str4));
        mallRegisterOrderObj.setTry_use_hcoin("1");
        mallRegisterOrderObj.setParams(new ArrayList());
        MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
        mallOrderParamObj.setCount(1);
        mallOrderParamObj.setCat_value(com.max.hbutils.utils.n.r(str));
        mallOrderParamObj.setBuy_type(str2);
        mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(str3));
        mallRegisterOrderObj.getParams().add(mallOrderParamObj);
        return com.max.hbutils.utils.k.p(mallRegisterOrderObj);
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40844, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        l4();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n2(this.f91012k).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    @dl.d
    @xh.m
    public static final q g4(@dl.e String str, @dl.e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 40853, new Class[]{String.class, String.class}, q.class);
        return patchProxyResultProxy.isSupported ? (q) patchProxyResultProxy.result : f91007n.a(str, str2);
    }

    private final void h4(FreshmanDiscountObj freshmanDiscountObj) {
        if (PatchProxy.proxy(new Object[]{freshmanDiscountObj}, this, changeQuickRedirect, false, 40845, new Class[]{FreshmanDiscountObj.class}, Void.TYPE).isSupported || freshmanDiscountObj == null) {
            return;
        }
        com.max.hbimage.b.K(freshmanDiscountObj.getTop_img(), d4().f110414d);
        FreshmanDiscountGameObj game_info = freshmanDiscountObj.getGame_info();
        com.max.hbimage.b.K(game_info != null ? game_info.getGame_img() : null, d4().f110412b);
        FreshmanDiscountGameObj game_info2 = freshmanDiscountObj.getGame_info();
        if (com.max.hbcommon.utils.c.u(game_info2 != null ? game_info2.getDiscount_limit_desc() : null)) {
            d4().f110415e.setVisibility(8);
        } else {
            TextView textView = d4().f110415e;
            FreshmanDiscountGameObj game_info3 = freshmanDiscountObj.getGame_info();
            textView.setText(game_info3 != null ? game_info3.getDiscount_limit_desc() : null);
            d4().f110415e.setVisibility(0);
        }
        TextView textView2 = d4().f110418h;
        FreshmanDiscountGameObj game_info4 = freshmanDiscountObj.getGame_info();
        textView2.setText(game_info4 != null ? game_info4.getGame_name() : null);
        TextView textView3 = d4().f110416f;
        FreshmanDiscountGameObj game_info5 = freshmanDiscountObj.getGame_info();
        textView3.setText(game_info5 != null ? game_info5.getCurrent_price() : null);
        TextView textView4 = d4().f110420j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("原价￥");
        FreshmanDiscountGameObj game_info6 = freshmanDiscountObj.getGame_info();
        sb2.append(game_info6 != null ? game_info6.getOrigin_price() : null);
        textView4.setText(sb2.toString());
        textView4.getPaint().setFlags(16);
        TextView textView5 = d4().f110419i;
        FreshmanDiscountGameObj game_info7 = freshmanDiscountObj.getGame_info();
        textView5.setText(game_info7 != null ? game_info7.getMiddle_title() : null);
        d4().f110417g.setColors(com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color));
        GradientTextView gradientTextView = d4().f110417g;
        FreshmanDiscountGameObj game_info8 = freshmanDiscountObj.getGame_info();
        gradientTextView.setText(game_info8 != null ? game_info8.getDiscount_desc() : null);
        d4().f110421k.setOnClickListener(new c(freshmanDiscountObj));
    }

    private final void i4(FreshmanDiscountObj freshmanDiscountObj) {
        FreshmanDiscountGameObj game_info;
        FreshmanDiscountGameObj game_info2;
        FreshmanDiscountGameObj game_info3;
        if (PatchProxy.proxy(new Object[]{freshmanDiscountObj}, this, changeQuickRedirect, false, 40847, new Class[]{FreshmanDiscountObj.class}, Void.TYPE).isSupported) {
            return;
        }
        l4();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v8(e4((freshmanDiscountObj == null || (game_info3 = freshmanDiscountObj.getGame_info()) == null) ? null : game_info3.getCat_value(), (freshmanDiscountObj == null || (game_info2 = freshmanDiscountObj.getGame_info()) == null) ? null : game_info2.getBuy_type(), (freshmanDiscountObj == null || (game_info = freshmanDiscountObj.getGame_info()) == null) ? null : game_info.getSku_id(), freshmanDiscountObj != null ? freshmanDiscountObj.getSession() : null), this.f91013l).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(freshmanDiscountObj)));
    }

    private final void j4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40846, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", this.f91012k);
        com.max.hbcommon.analytics.d.e("4", z10 ? lb.d.f131278w3 : lb.d.f131285x3, null, null, jsonObject, null, false);
    }

    private final void l4() {
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40850, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f91014m == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            f0.o(fragmentActivityRequireActivity, "requireActivity()");
            this.f91014m = new LoadingDialog(fragmentActivityRequireActivity, "");
        }
        LoadingDialog loadingDialog2 = this.f91014m;
        if (loadingDialog2 != null && !loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.f91014m) == null) {
            return;
        }
        loadingDialog.r();
    }

    private final void m4(l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 40849, new Class[]{l0.g.class}, Void.TYPE).isSupported || !isActive() || getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(getActivity()).y(getString(R.string.fail)).l(getString(R.string.has_not_finish_order)).u(getString(R.string.to_handle), new e(gVar, this)).o(getString(R.string.cancel), f.f91024b).F();
    }

    @dl.d
    public final f5 d4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40840, new Class[0], f5.class);
        if (patchProxyResultProxy.isSupported) {
            return (f5) patchProxyResultProxy.result;
        }
        f5 f5Var = this.f91011j;
        if (f5Var != null) {
            return f5Var;
        }
        f0.S("binding");
        return null;
    }

    public final void k4(@dl.d f5 f5Var) {
        if (PatchProxy.proxy(new Object[]{f5Var}, this, changeQuickRedirect, false, 40841, new Class[]{f5.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(f5Var, "<set-?>");
        this.f91011j = f5Var;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 40842, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        f5 f5VarC = f5.c(inflater);
        f0.o(f5VarC, "inflate(inflater)");
        k4(f5VarC);
        Bundle arguments = getArguments();
        this.f91012k = arguments != null ? arguments.getString("appid") : null;
        Bundle arguments2 = getArguments();
        this.f91013l = arguments2 != null ? arguments2.getString(f91010q) : null;
        return d4().b();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@dl.d DialogInterface dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 40852, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dialog, "dialog");
        super.onDismiss(dialog);
        c4();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 40843, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        d4().f110421k.setBackground(ViewUtils.i(ViewUtils.f(getContext(), 5.0f), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color)));
        d4().f110421k.getTv_button().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
        d4().f110421k.getTv_button().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        d4().f110421k.getTv_button().setTextSize(1, 14.0f);
        d4().f110415e.setBackground(com.max.hbutils.utils.q.k(getContext(), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color), GradientDrawable.Orientation.BL_TR, new float[]{3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f, 0.0f, 0.0f}));
        d4().f110414d.getLayoutParams().height = (ViewUtils.L(getContext()) * 100) / 375;
        j4(true);
        f4();
    }
}
