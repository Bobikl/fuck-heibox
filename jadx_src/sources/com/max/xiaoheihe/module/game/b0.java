package com.max.xiaoheihe.module.game;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ProxyObj;
import com.max.xiaoheihe.bean.game.AutoAcceptGameParamsObj;
import com.max.xiaoheihe.bean.game.GamePurchaseOrderProgressObj;
import com.max.xiaoheihe.bean.game.GamePurchaseResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class b0 extends com.max.hbcommon.base.c {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f86512h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86513i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f86514j = "coupon_id";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f86515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f86516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private ProgressBar f86517g;

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final b0 a(@dl.d String linkId) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linkId}, this, changeQuickRedirect, false, 33104, new Class[]{String.class}, b0.class);
            if (patchProxyResultProxy.isSupported) {
                return (b0) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(linkId, "linkId");
            b0 b0Var = new b0();
            Bundle bundle = new Bundle();
            bundle.putString(b0.f86514j, linkId);
            b0Var.setArguments(bundle);
            return b0Var;
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<GamePurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33105, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (b0.this.isActive()) {
                super.onError(e10);
                b0.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<GamePurchaseResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33106, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (b0.this.isActive()) {
                super.onNext(result);
                GamePurchaseResultObj result2 = result.getResult();
                if (result2 == null) {
                    b0.this.dismiss();
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        return;
                    }
                    com.max.hbutils.utils.c.f(result.getMsg());
                    return;
                }
                String orderId = result2.getOrder_id();
                if (kotlin.jvm.internal.f0.g("1", result2.getNot_finish_order())) {
                    b0.Q3(b0.this);
                    b0 b0Var = b0.this;
                    kotlin.jvm.internal.f0.o(orderId, "orderId");
                    b0.V3(b0Var, orderId);
                    return;
                }
                if (kotlin.jvm.internal.f0.g("0", result2.getValid())) {
                    b0.Q3(b0.this);
                    b0.T3(b0.this);
                    return;
                }
                b0.R3(b0.this, result2);
                if (b0.this.getActivity() instanceof com.max.hbwallet.t) {
                    LayoutInflater.Factory activity = b0.this.getActivity();
                    kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.hbwallet.GameExchangeListener");
                    ((com.max.hbwallet.t) activity).z();
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33107, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<AutoAcceptGameParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f86521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f86522e;

        /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f86523b;

            a(b0 b0Var) {
                this.f86523b = b0Var;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33111, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                this.f86523b.dismiss();
            }
        }

        c(String str, boolean z10, boolean z11) {
            this.f86520c = str;
            this.f86521d = z10;
            this.f86522e = z11;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33108, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            b0.this.f86516f++;
            if (b0.this.isActive()) {
                super.onError(e10);
                b0.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<AutoAcceptGameParamsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33109, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            b0.this.f86516f++;
            if (b0.this.isActive()) {
                super.onNext(result);
                AutoAcceptGameParamsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                ProxyObj android_proxy = result2.getAndroid_proxy();
                if (android_proxy != null && kotlin.jvm.internal.f0.g("1", android_proxy.getBanned())) {
                    com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(b0.this.getActivity());
                    fVar.l(android_proxy.getMsg()).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a(b0.this));
                    fVar.F();
                } else {
                    if (!kotlin.jvm.internal.f0.g("1", result2.getNo_bot())) {
                        b0.this.dismiss();
                        b0 b0Var = b0.this;
                        b0Var.startActivity(GameStoreSteamTradingActivity.I2(b0Var.getActivity(), this.f86520c, "gift", result2, this.f86521d, this.f86522e && kotlin.jvm.internal.f0.g("1", result2.getAuto_accept())));
                        return;
                    }
                    b0.this.f86516f++;
                    if (b0.this.f86516f <= 15) {
                        b0.N3(b0.this, this.f86520c, 2000L, this.f86521d, this.f86522e);
                    } else {
                        b0.this.dismiss();
                        com.max.hbutils.utils.c.f(b0.this.getString(R.string.purchase_timeout));
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33110, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AutoAcceptGameParamsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<GamePurchaseOrderProgressObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f86526d;

        d(String str, boolean z10) {
            this.f86525c = str;
            this.f86526d = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 33112, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (b0.this.isActive()) {
                super.onError(e10);
                b0.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<GamePurchaseOrderProgressObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 33113, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (b0.this.isActive()) {
                super.onNext(result);
                GamePurchaseOrderProgressObj result2 = result.getResult();
                b0.N3(b0.this, this.f86525c, 0L, result2 != null && kotlin.jvm.internal.f0.g("1", result2.getFriend()), this.f86526d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33114, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseOrderProgressObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class e implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33115, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(b0.this.getCompositeDisposable(), b0.this.getActivity(), false, true, 0);
            dialogInterface.dismiss();
            b0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class f implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33116, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            b0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86530c;

        g(String str) {
            this.f86530c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33117, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            b0.U3(b0.this);
            b0.P3(b0.this, this.f86530c, false);
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33118, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            b0.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f86533c;

        i(String str) {
            this.f86533c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33119, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            b0.this.dismiss();
            FragmentActivity activity = b0.this.getActivity();
            if (activity != null) {
                activity.startActivity(GameStoreSteamTradingActivity.I2(b0.this.getActivity(), this.f86533c, "cdkey", null, false, false));
            }
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33120, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            b0.this.dismiss();
            FragmentActivity activity = b0.this.getActivity();
            if (activity != null) {
                com.max.xiaoheihe.base.router.b.i0(activity, lb.d.W1);
            }
        }
    }

    /* JADX INFO: compiled from: GameExchangeDialogFragment.kt */
    public static final class k implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 33121, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            b0.this.dismiss();
        }
    }

    public static final /* synthetic */ void N3(b0 b0Var, String str, long j10, boolean z10, boolean z11) {
        Object[] objArr = {b0Var, str, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 33103, new Class[]{b0.class, String.class, Long.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.X3(str, j10, z10, z11);
    }

    public static final /* synthetic */ void P3(b0 b0Var, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{b0Var, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 33102, new Class[]{b0.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.Y3(str, z10);
    }

    public static final /* synthetic */ void Q3(b0 b0Var) {
        if (PatchProxy.proxy(new Object[]{b0Var}, null, changeQuickRedirect, true, 33097, new Class[]{b0.class}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.Z3();
    }

    public static final /* synthetic */ void R3(b0 b0Var, GamePurchaseResultObj gamePurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{b0Var, gamePurchaseResultObj}, null, changeQuickRedirect, true, 33099, new Class[]{b0.class, GamePurchaseResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.a4(gamePurchaseResultObj);
    }

    public static final /* synthetic */ void T3(b0 b0Var) {
        if (PatchProxy.proxy(new Object[]{b0Var}, null, changeQuickRedirect, true, 33100, new Class[]{b0.class}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.b4();
    }

    public static final /* synthetic */ void U3(b0 b0Var) {
        if (PatchProxy.proxy(new Object[]{b0Var}, null, changeQuickRedirect, true, 33101, new Class[]{b0.class}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.c4();
    }

    public static final /* synthetic */ void V3(b0 b0Var, String str) {
        if (PatchProxy.proxy(new Object[]{b0Var, str}, null, changeQuickRedirect, true, 33098, new Class[]{b0.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        b0Var.d4(str);
    }

    private final void W3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33089, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c4();
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f86515e;
        if (str == null) {
            kotlin.jvm.internal.f0.S(f86514j);
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.z9(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void X3(String str, long j10, boolean z10, boolean z11) {
        Object[] objArr = {str, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33096, new Class[]{String.class, Long.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P6(str).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(str, z10, z11)));
    }

    private final void Y3(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33095, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X5(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str, z10)));
    }

    private final void Z3() {
        ProgressBar progressBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33088, new Class[0], Void.TYPE).isSupported || (progressBar = this.f86517g) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    private final void a4(GamePurchaseResultObj gamePurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{gamePurchaseResultObj}, this, changeQuickRedirect, false, 33091, new Class[]{GamePurchaseResultObj.class}, Void.TYPE).isSupported || !isActive() || gamePurchaseResultObj == null) {
            return;
        }
        String buy_type = gamePurchaseResultObj.getBuy_type();
        if (kotlin.text.u.L1("cdkey", buy_type, true)) {
            Z3();
            com.max.xiaoheihe.utils.d.o(getContext(), gamePurchaseResultObj.getCdkey());
            String order_id = gamePurchaseResultObj.getOrder_id();
            kotlin.jvm.internal.f0.o(order_id, "gamePurchaseResultObj.order_id");
            e4(order_id);
            return;
        }
        if (kotlin.text.u.L1("gift", buy_type, true)) {
            String order_id2 = gamePurchaseResultObj.getOrder_id();
            kotlin.jvm.internal.f0.o(order_id2, "gamePurchaseResultObj.order_id");
            Y3(order_id2, true);
            return;
        }
        Z3();
        String title = gamePurchaseResultObj.getTitle();
        String msg = gamePurchaseResultObj.getMsg();
        if (com.max.hbcommon.utils.c.u(title) && com.max.hbcommon.utils.c.u(msg)) {
            title = getString(R.string.purchase_succeed);
        }
        f4(title, msg);
    }

    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33090, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(getActivity()).y(getString(R.string.bind_steam_tips_title)).l(getString(R.string.bind_steam_tips_message)).u(getString(R.string.confirm), new e()).o(getString(R.string.cancel), new f()).F();
    }

    private final void c4() {
        ProgressBar progressBar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33087, new Class[0], Void.TYPE).isSupported || (progressBar = this.f86517g) == null) {
            return;
        }
        progressBar.setVisibility(0);
    }

    private final void d4(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33094, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            FragmentActivity activity = getActivity();
            if (activity != null && activity.isFinishing()) {
                return;
            }
            new com.max.hbcommon.view.a.f(getActivity()).y(getString(R.string.purchase_failed)).l(getString(R.string.purchase_failed_by_has_order)).u(getString(R.string.to_handle), new g(str)).o(getString(R.string.cancel), new h()).g(false).F();
        }
    }

    private final void e4(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33093, new Class[]{String.class}, Void.TYPE).isSupported && isActive()) {
            FragmentActivity activity = getActivity();
            if (activity != null && activity.isFinishing()) {
                return;
            }
            new com.max.hbcommon.view.a.f(getActivity()).y(getString(R.string.purchase_succeed)).l("CDKEY已复制成功，再次查看请前往“我的订单”").u("去Steam激活", new i(str)).o("我的订单", new j()).g(false).F();
        }
    }

    private final void f4(String str, String str2) {
        boolean z10 = false;
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 33092, new Class[]{String.class, String.class}, Void.TYPE).isSupported && isActive()) {
            FragmentActivity activity = getActivity();
            if (activity != null && activity.isFinishing()) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            new com.max.hbcommon.view.a.f(getActivity()).y(str).l(str2).u(getString(R.string.confirm), new k()).F();
        }
    }

    @Override // com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 33084, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        if (getArguments() != null) {
            String string = requireArguments().getString(f86514j);
            kotlin.jvm.internal.f0.m(string);
            this.f86515e = string;
        }
        return inflater.inflate(R.layout.fragment_forbid_reason, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33086, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        W3();
    }

    @Override // com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 33085, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tv_please_choose_reason);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(getString(R.string.loading));
        this.f86517g = (ProgressBar) view.findViewById(R.id.progress);
    }
}
