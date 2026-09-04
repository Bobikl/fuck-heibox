package com.max.xiaoheihe.module.mall;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponGuideObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.mall.MallCatObj;
import com.max.xiaoheihe.bean.mall.MallOrderParamObj;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseParamObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseParamsObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.bean.mall.MallSkuObj;
import com.max.xiaoheihe.bean.mall.MallSpecButtonObj;
import com.max.xiaoheihe.bean.mall.MallSpecsObj;
import com.max.xiaoheihe.bean.mall.MallValidObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class n extends com.max.hbcommon.base.d implements com.max.hbwallet.utils.c {
    private static final int E = 3;
    private static final String F = "sku_id";
    private static final String G = "address_id";
    private static final String H = "mode";
    private static final String I = "h_src";
    private static final String J = "cart_id";
    public static String K = "select";
    public static String L = "purchase";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;
    private String C;
    private ViewGroup D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f90810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScrollView f90811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f90812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f90813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f90814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f90815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f90816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f90817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f90818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BottomButtonLeftItemView f90819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f90820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f90821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f90822n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f90823o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f90824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f90825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f90826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f90827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f90828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f90829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f90830v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f90831w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MallPurchaseParamsObj f90832x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f90834z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f90833y = 1;
    private boolean B = false;

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCatObj f90835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f90836c;

        a(MallCatObj mallCatObj, TextView textView) {
            this.f90835b = mallCatObj;
            this.f90836c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40728, new Class[]{View.class}, Void.TYPE).isSupported || !n.I4(n.this, this.f90835b) || this.f90835b.isChecked()) {
                return;
            }
            n.c4(n.this, this.f90836c);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f90838b;

        b(TextView textView) {
            this.f90838b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40729, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallValidObj mallValidObjD4 = n.d4(n.this);
            if (n.this.f90833y < com.max.hbutils.utils.n.q(mallValidObjD4 != null ? mallValidObjD4.getBulk_count() : null)) {
                n.f4(n.this);
                this.f90838b.setText(String.valueOf(n.this.f90833y));
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("超出限购数量");
            }
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f90840b;

        c(TextView textView) {
            this.f90840b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40730, new Class[]{View.class}, Void.TYPE).isSupported && n.this.f90833y > 1) {
                n.g4(n.this);
                this.f90840b.setText(String.valueOf(n.this.f90833y));
            }
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallRegisterOrderObj f90842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f90843c;

        /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
        public class a implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40732, new Class[0], Void.TYPE).isSupported && n.this.isActive()) {
                    if (n.this.getParentFragment() instanceof com.max.xiaoheihe.module.mall.i) {
                        ((com.max.xiaoheihe.module.mall.i) n.this.getParentFragment()).e4();
                    }
                    n.L3(n.this);
                }
            }
        }

        /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
        public class b implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
            public class a implements l0.g {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ MallRegisterOrderObj f90847a;

                a(MallRegisterOrderObj mallRegisterOrderObj) {
                    this.f90847a = mallRegisterOrderObj;
                }

                @Override // com.max.xiaoheihe.utils.l0.g
                public void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40734, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    n.p4(n.this, this.f90847a);
                }
            }

            b() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                MallRegisterOrderObj mallRegisterOrderObjV4;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40733, new Class[0], Void.TYPE).isSupported || (mallRegisterOrderObjV4 = n.this.V4()) == null) {
                    return;
                }
                if (!com.max.xiaoheihe.module.mall.o.g(String.valueOf(mallRegisterOrderObjV4.getParams().get(0).getCat_value()))) {
                    d dVar = d.this;
                    if (dVar.f90843c) {
                        com.max.xiaoheihe.module.mall.o.b(com.max.xiaoheihe.utils.d.n(n.this.f90832x.getPrice().getCoupon_info().getParams()), new a(mallRegisterOrderObjV4));
                        return;
                    } else {
                        n.p4(n.this, mallRegisterOrderObjV4);
                        return;
                    }
                }
                if ("1".equals(com.max.hbcache.c.j("market_balance_tutorial"))) {
                    n.o4(n.this, 0);
                    return;
                }
                com.max.hbcache.c.z("market_balance_tutorial", "1");
                Intent intent = new Intent(((com.max.hbcommon.base.d) n.this).mContext, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", lb.a.f130946c4);
                intent.putExtra("title", "引导");
                ((com.max.hbcommon.base.d) n.this).mContext.startActivity(intent);
            }
        }

        d(MallRegisterOrderObj mallRegisterOrderObj, boolean z10) {
            this.f90842b = mallRegisterOrderObj;
            this.f90843c = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40731, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (n.this.f90831w != null) {
                MallCartUtils.f90196a.g(n.this.getCompositeDisposable(), n.this.f90826r, String.valueOf(this.f90842b.getParams().get(0).getCat_value()), null, n.this.f90831w, new a());
            } else {
                n.i4(n.this);
                com.max.xiaoheihe.module.mall.o.c(((com.max.hbcommon.base.d) n.this).mContext, new b());
            }
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallRegisterOrderObj f90849b;

        /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
        public class a implements l0.h<CartDetailObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public /* bridge */ /* synthetic */ void a(CartDetailObj cartDetailObj) {
                if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 40738, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                d(cartDetailObj);
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public /* bridge */ /* synthetic */ void b(CartDetailObj cartDetailObj) {
                if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 40737, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                c(cartDetailObj);
            }

            public void c(CartDetailObj cartDetailObj) {
            }

            public void d(CartDetailObj cartDetailObj) {
                if (!PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 40736, new Class[]{CartDetailObj.class}, Void.TYPE).isSupported && n.this.isActive()) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("添加成功");
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    mallCartUtils.D(com.max.hbutils.utils.n.q(cartDetailObj.getCart_count()));
                    mallCartUtils.m(((com.max.hbcommon.base.d) n.this).mContext, n.this.f90824p, false);
                }
            }
        }

        e(MallRegisterOrderObj mallRegisterOrderObj) {
            this.f90849b = mallRegisterOrderObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40735, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils.f90196a.f(n.this.getCompositeDisposable(), n.this.f90826r, String.valueOf(n.this.f90833y), String.valueOf(this.f90849b.getParams().get(0).getCat_value()), null, new a());
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class f implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40739, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallPurchaseResultObj f90853b;

        g(MallPurchaseResultObj mallPurchaseResultObj) {
            this.f90853b = mallPurchaseResultObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40740, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(this.f90853b.getOrder_id())) {
                if ("cart".equals(this.f90853b.getOrder_src())) {
                    com.max.xiaoheihe.base.router.b.D(((com.max.hbcommon.base.d) n.this).mContext, this.f90853b.getOrder_id()).A();
                } else {
                    com.max.xiaoheihe.base.router.b.R(((com.max.hbcommon.base.d) n.this).mContext, this.f90853b.getOrder_id(), true).A();
                }
            }
            dialogInterface.dismiss();
            n.L3(n.this);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class h extends com.max.hbcommon.network.d<Result<MallPrepareStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90855b;

        /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
        public class a implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40744, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                n.y4(n.this);
            }
        }

        /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
        public class b implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40745, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                n.C4(n.this);
            }
        }

        h(int i10) {
            this.f90855b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40741, new Class[]{Throwable.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onError(th2);
                n.this.f90820l.setVisibility(8);
                n.this.B = false;
                n.L3(n.this);
            }
        }

        public void onNext(Result<MallPrepareStateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40742, new Class[]{Result.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onNext(result);
                MallPrepareStateObj result2 = result.getResult();
                if ("1".equals(result2.getPrepare_state())) {
                    n.this.B = false;
                    n nVar = n.this;
                    n.p4(nVar, nVar.V4());
                    return;
                }
                if ("2".equals(result2.getPrepare_state())) {
                    n.this.f90820l.setVisibility(8);
                    n.this.B = false;
                    n.v4(n.this);
                    return;
                }
                if ("3".equals(result2.getPrepare_state())) {
                    n.this.B = false;
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) n.this).mContext, "登录Steam账号", com.max.hbcommon.utils.l.e(R.string.purchase_login_steam_tips), null, new a());
                    return;
                }
                if ("4".equals(result2.getPrepare_state())) {
                    int i10 = this.f90855b;
                    if (i10 <= 10) {
                        n.o4(n.this, i10 + 1);
                        return;
                    }
                    n.this.B = false;
                    n.this.f90820l.setVisibility(8);
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("检测超时请稍后再试");
                    return;
                }
                if (!"5".equals(result2.getPrepare_state())) {
                    n.this.B = false;
                    n.this.f90820l.setVisibility(8);
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) n.this).mContext, null, "检测异常", null, null);
                    return;
                }
                n.this.B = false;
                n.this.f90820l.setVisibility(8);
                if (Boolean.valueOf(result2.getExtra() != null).booleanValue()) {
                    com.max.xiaoheihe.module.mall.o.t((BaseActivity) ((com.max.hbcommon.base.d) n.this).mContext, result2.getExtra());
                } else if (com.max.hbcommon.utils.c.w(result2.getInfos())) {
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) n.this).mContext, null, result2.getMsg(), result2.getFaq(), null);
                } else {
                    com.max.xiaoheihe.module.mall.o.s((BaseActivity) ((com.max.hbcommon.base.d) n.this).mContext, result2, new b());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40743, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPrepareStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class i extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40746, new Class[]{Result.class}, Void.TYPE).isSupported && n.this.isActive()) {
                n.o4(n.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40747, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class j extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40748, new Class[]{Throwable.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onError(th2);
                n.this.f90820l.setVisibility(8);
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40749, new Class[]{Result.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onNext(result);
                n.this.f90820l.setVisibility(8);
                SteamWalletJsObj result2 = result.getResult();
                result2.setSteamBalance(true);
                com.max.xiaoheihe.accelworld.p.b(((com.max.hbcommon.base.d) n.this).mContext, result2);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40750, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40727, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n.L3(n.this);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class l implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40751, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f90863b;

        m(Activity activity) {
            this.f90863b = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40752, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(n.this.getCompositeDisposable(), this.f90863b, false, true, 0);
            n.this.A = true;
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.n$n, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class C0838n extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0838n() {
        }

        public void onNext(Result<HomeDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40753, new Class[]{Result.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onNext(result);
                User userI = i0.i();
                userI.setGameAccountInfo(result.getResult());
                i0.z(userI);
                boolean zG = com.max.xiaoheihe.module.mall.o.g(String.valueOf(n.this.V4().getParams().get(0).getCat_value()));
                if (!com.max.hbcommon.utils.c.u(i0.m()) && zG) {
                    n.o4(n.this, 0);
                }
                Context context = n.this.getContext();
                if (context != null) {
                    com.max.xiaoheihe.utils.d.x1(context);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40754, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class p extends com.max.hbcommon.network.d<Result<MallPurchaseParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f90867b;

        p(String str) {
            this.f90867b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40755, new Class[]{Throwable.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onError(th2);
                n.this.f90820l.setVisibility(8);
            }
        }

        public void onNext(Result<MallPurchaseParamsObj> result) {
            boolean z10;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40756, new Class[]{Result.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onNext(result);
                n.this.f90826r = this.f90867b;
                n.this.f90832x = result.getResult();
                MallCartUtils.f90196a.D(com.max.hbutils.utils.n.q(n.this.f90832x.getCart_count()));
                if (result.getResult() != null && result.getResult().getSkus() != null && result.getResult().getSkus().size() > 0) {
                    Iterator<MallSkuObj> it = result.getResult().getSkus().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getSku_id().equals(n.this.f90826r)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        n.this.f90826r = result.getResult().getSkus().get(0).getSku_id();
                        n nVar = n.this;
                        nVar.f90829u = nVar.f90826r;
                        n nVar2 = n.this;
                        n.H4(nVar2, nVar2.f90826r);
                        return;
                    }
                }
                n nVar3 = n.this;
                nVar3.f90829u = nVar3.f90826r;
                if (result.getResult() != null && result.getResult().getParams() != null && result.getResult().getParams().size() > 0) {
                    for (MallPurchaseParamObj mallPurchaseParamObj : result.getResult().getParams()) {
                        int size = mallPurchaseParamObj.getCat() != null ? mallPurchaseParamObj.getCat().size() : 0;
                        if (size > 0) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    i10 = -1;
                                    break;
                                } else if (n.I4(n.this, mallPurchaseParamObj.getCat().get(i10))) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            if (i10 != -1) {
                                mallPurchaseParamObj.getCat().get(i10).setChecked(true);
                            }
                        }
                    }
                }
                n.this.f90820l.setVisibility(8);
                n.J4(n.this);
                if (result.getResult() == null || com.max.hbcommon.utils.c.u(result.getResult().getToast_msg())) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d(result.getResult().getToast_msg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40757, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPurchaseParamsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class q extends com.max.hbcommon.network.d<Result<MallPurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f90869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallRegisterOrderObj f90870c;

        q(boolean z10, MallRegisterOrderObj mallRegisterOrderObj) {
            this.f90869b = z10;
            this.f90870c = mallRegisterOrderObj;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40758, new Class[]{Throwable.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onError(th2);
                n.this.f90820l.setVisibility(8);
                n.L3(n.this);
            }
        }

        public void onNext(Result<MallPurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40759, new Class[]{Result.class}, Void.TYPE).isSupported && n.this.isActive()) {
                super.onNext(result);
                n.this.f90820l.setVisibility(8);
                MallPurchaseResultObj result2 = result.getResult();
                if (result2 != null && "1".equals(result2.getNot_finish_order())) {
                    n.K4(n.this, result2);
                    return;
                }
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getOrder_id())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(n.this.getString(R.string.fail));
                    n.L3(n.this);
                } else {
                    if (this.f90869b) {
                        MallCartUtils.f90196a.u(OrderEvent.REGISTER, this.f90870c.getAppid(), n.this.f90827s, n.this.f90826r, result2.getOrder_id(), n.this.f90830v);
                        com.max.xiaoheihe.base.router.b.D(((com.max.hbcommon.base.d) n.this).mContext, result2.getOrder_id()).A();
                    } else {
                        MallCartUtils.f90196a.x(OrderEvent.REGISTER, this.f90870c.getAppid(), n.this.f90827s, n.this.f90826r, result2.getOrder_id(), n.this.f90830v);
                        com.max.xiaoheihe.base.router.b.R(((com.max.hbcommon.base.d) n.this).mContext, result2.getOrder_id(), true).A();
                    }
                    n.L3(n.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40760, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class r implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40761, new Class[0], Void.TYPE).isSupported && n.this.isActive()) {
                int iV = ViewUtils.V(n.this.f90811c);
                int iJ = ViewUtils.J(((com.max.hbcommon.base.d) n.this).mContext) - ViewUtils.f(((com.max.hbcommon.base.d) n.this).mContext, 300.0f);
                if (n.this.f90821m.getVisibility() == 0) {
                    iJ -= ViewUtils.f(((com.max.hbcommon.base.d) n.this).mContext, 90.0f);
                }
                if (iV > iJ) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) n.this.f90811c.getLayoutParams();
                    layoutParams.height = iJ;
                    n.this.f90811c.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCouponGuideObj f90873b;

        s(MallCouponGuideObj mallCouponGuideObj) {
            this.f90873b = mallCouponGuideObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40762, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            l0.f95687b.C(((com.max.hbcommon.base.d) n.this).mContext, null, l0.A(String.format(lb.a.f131005m3, this.f90873b.getPrimary_id(), n.this.f90829u), null, true, true, true, false), null);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40763, new Class[]{View.class}, Void.TYPE).isSupported || n.this.f90832x == null || com.max.hbcommon.utils.c.w(n.this.f90832x.getParams()) || n.this.f90832x.getParams().get(0) == null || com.max.hbcommon.utils.c.u(n.this.f90832x.getParams().get(0).getFaq())) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) n.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", n.this.f90832x.getParams().get(0).getFaq());
            intent.putExtra("title", "常见问题");
            ((com.max.hbcommon.base.d) n.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallSpecsObj f90876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f90877c;

        u(MallSpecsObj mallSpecsObj, int i10) {
            this.f90876b = mallSpecsObj;
            this.f90877c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40764, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            n.a4(n.this, this.f90876b, this.f90877c);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallSkuObj f90879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f90880c;

        v(MallSkuObj mallSkuObj, TextView textView) {
            this.f90879b = mallSkuObj;
            this.f90880c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40765, new Class[]{View.class}, Void.TYPE).isSupported || this.f90879b.getSku_id().equals(n.this.f90826r)) {
                return;
            }
            n.b4(n.this, this.f90880c);
        }
    }

    /* JADX INFO: compiled from: MallRegisterOrderDialogFragment.java */
    public interface w {
        void o(MallRegisterOrderObj mallRegisterOrderObj);
    }

    static /* synthetic */ void C4(n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40726, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.i5();
    }

    static /* synthetic */ void H4(n nVar, String str) {
        if (PatchProxy.proxy(new Object[]{nVar, str}, null, changeQuickRedirect, true, 40713, new Class[]{n.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.U4(str);
    }

    static /* synthetic */ boolean I4(n nVar, MallCatObj mallCatObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nVar, mallCatObj}, null, changeQuickRedirect, true, 40714, new Class[]{n.class, MallCatObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : nVar.Y4(mallCatObj);
    }

    static /* synthetic */ void J4(n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40715, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.f5();
    }

    static /* synthetic */ void K4(n nVar, MallPurchaseResultObj mallPurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{nVar, mallPurchaseResultObj}, null, changeQuickRedirect, true, 40716, new Class[]{n.class, MallPurchaseResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.q5(mallPurchaseResultObj);
    }

    static /* synthetic */ void L3(n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40712, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.dismiss();
    }

    private void M4() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40688, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.item_mall_batch_cnt, (ViewGroup) this.f90818j, false);
        this.D = viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        int iF = ViewUtils.f(this.mContext, 12.0f);
        marginLayoutParams.rightMargin = iF;
        marginLayoutParams.leftMargin = iF;
        marginLayoutParams.topMargin = ViewUtils.f(this.mContext, 20.0f);
        this.D.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) this.D.findViewById(R.id.tv_cnt);
        ImageView imageView = (ImageView) this.D.findViewById(R.id.iv_add);
        ImageView imageView2 = (ImageView) this.D.findViewById(R.id.iv_sub);
        textView.setText(String.valueOf(this.f90833y));
        imageView.setOnClickListener(new b(textView));
        imageView2.setOnClickListener(new c(textView));
        this.f90818j.addView(this.D);
    }

    private void N4(List<MallPurchaseParamObj> list) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        byte b10;
        boolean z11 = false;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40687, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (list == null || list.size() <= 0 || context == null) {
            return;
        }
        int i13 = 0;
        while (i13 < list.size()) {
            MallPurchaseParamObj mallPurchaseParamObj = list.get(i13);
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.item_purchase_param, this.f90818j, z11);
            TextView textView = (TextView) linearLayout.findViewById(R.id.tv_option);
            int i14 = -2;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(z11 ? 1 : 0, ViewUtils.f(context, 20.0f), z11 ? 1 : 0, z11 ? 1 : 0);
            linearLayout.setLayoutParams(layoutParams);
            textView.setText(mallPurchaseParamObj.getTitle());
            int size = mallPurchaseParamObj.getCat() != null ? mallPurchaseParamObj.getCat().size() : z11 ? 1 : 0;
            int iL = ViewUtils.L(context) - ViewUtils.f(context, 24.0f);
            int iF = ViewUtils.f(context, 12.0f);
            int iF2 = ViewUtils.f(context, 8.0f);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(z11 ? 1 : 0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(iF, iF2, iF, z11 ? 1 : 0);
            linearLayout2.setLayoutParams(layoutParams2);
            linearLayout.addView(linearLayout2);
            int i15 = z11 ? 1 : 0;
            int i16 = i15;
            LinearLayout linearLayout3 = linearLayout2;
            while (i15 < size) {
                MallCatObj mallCatObj = mallPurchaseParamObj.getCat().get(i15);
                String cat_value = mallCatObj.getCat_value();
                TextView textView2 = new TextView(context);
                textView2.setTag(mallCatObj);
                MallPurchaseParamObj mallPurchaseParamObj2 = mallPurchaseParamObj;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i14, i14);
                int i17 = size;
                if (i15 == 0) {
                    i11 = 0;
                    i10 = 0;
                } else {
                    i10 = iF2;
                    i11 = 0;
                }
                layoutParams3.setMargins(i10, i11, i11, i11);
                textView2.setLayoutParams(layoutParams3);
                int iF3 = ViewUtils.f(context, 12.0f);
                int iF4 = ViewUtils.f(context, 7.0f);
                textView2.setPadding(iF3, iF4, iF3, iF4);
                textView2.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                textView2.setIncludeFontPadding(false);
                textView2.setLineSpacing(ViewUtils.f(context, 2.0f), 1.0f);
                textView2.setText(cat_value);
                r5(textView2, Y4(mallCatObj), mallCatObj.isChecked());
                textView2.setOnClickListener(new a(mallCatObj, textView2));
                float f10 = iF3 * 2;
                int i18 = i13;
                int iS = (int) (((double) (ViewUtils.S(textView2.getPaint(), cat_value) + f10)) + 0.5d);
                if (i15 != 0) {
                    iS += iF2;
                }
                int iS2 = i16 + iS;
                if (iS2 > iL) {
                    LinearLayout linearLayout4 = new LinearLayout(context);
                    z10 = false;
                    linearLayout4.setOrientation(0);
                    i12 = -2;
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams4.setMargins(iF, iF2, iF, 0);
                    linearLayout4.setLayoutParams(layoutParams4);
                    textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    linearLayout4.addView(textView2);
                    linearLayout.addView(linearLayout4);
                    linearLayout3 = linearLayout4;
                    iS2 = (int) (((double) (ViewUtils.S(textView2.getPaint(), cat_value) + f10)) + 0.5d);
                    b10 = -1;
                } else {
                    i12 = -2;
                    z10 = false;
                    b10 = -1;
                    linearLayout3.addView(textView2);
                }
                i15++;
                i14 = i12;
                z11 = z10;
                context = context;
                mallPurchaseParamObj = mallPurchaseParamObj2;
                i16 = iS2;
                i13 = i18;
                size = i17 == true ? 1 : 0;
                linearLayout3 = linearLayout3;
            }
            boolean z12 = z11 ? 1 : 0;
            this.f90818j.addView(linearLayout);
            i13++;
            context = context;
        }
    }

    private void O4(List<MallSkuObj> list) {
        int i10;
        int i11;
        int i12;
        byte b10;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40686, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (list == null || list.size() <= 0 || context == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.item_purchase_param, (ViewGroup) this.f90818j, false);
        ((TextView) linearLayout.findViewById(R.id.tv_option)).setText(getString(R.string.choose_product_version));
        int size = list.size();
        int iL = ViewUtils.L(context) - ViewUtils.f(context, 24.0f);
        int iF = ViewUtils.f(context, 12.0f);
        int iF2 = ViewUtils.f(context, 8.0f);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int i13 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(iF, iF2, iF, 0);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout.addView(linearLayout2);
        int i14 = 0;
        int iS = 0;
        while (i14 < size) {
            MallSkuObj mallSkuObj = list.get(i14);
            String name = mallSkuObj.getName();
            TextView textView = new TextView(context);
            textView.setTag(mallSkuObj);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i13, i13);
            int i15 = size;
            if (i14 == 0) {
                i11 = 0;
                i10 = 0;
            } else {
                i10 = iF2;
                i11 = 0;
            }
            layoutParams2.setMargins(i10, i11, i11, i11);
            textView.setLayoutParams(layoutParams2);
            int iF3 = ViewUtils.f(context, 12.0f);
            int iF4 = ViewUtils.f(context, 7.0f);
            textView.setPadding(iF3, iF4, iF3, iF4);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setIncludeFontPadding(false);
            textView.setLineSpacing(ViewUtils.f(context, 2.0f), 1.0f);
            textView.setText(name);
            r5(textView, true, mallSkuObj.getSku_id().equals(this.f90826r));
            textView.setOnClickListener(new v(mallSkuObj, textView));
            float f10 = iF3 * 2;
            LinearLayout linearLayout3 = linearLayout2;
            int iS2 = (int) (((double) (ViewUtils.S(textView.getPaint(), name) + f10)) + 0.5d);
            if (i14 != 0) {
                iS2 += iF2;
            }
            iS += iS2;
            if (iS > iL) {
                LinearLayout linearLayout4 = new LinearLayout(context);
                linearLayout4.setOrientation(0);
                b10 = -1;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(iF, iF2, iF, 0);
                linearLayout4.setLayoutParams(layoutParams3);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout4.addView(textView);
                linearLayout.addView(linearLayout4);
                linearLayout2 = linearLayout4;
                i12 = -2;
                iS = (int) (((double) (ViewUtils.S(textView.getPaint(), name) + f10)) + 0.5d);
            } else {
                linearLayout2 = linearLayout3;
                i12 = -2;
                b10 = -1;
                linearLayout2.addView(textView);
            }
            i14++;
            i13 = i12;
            size = i15;
        }
        this.f90818j.addView(linearLayout);
    }

    private void P4(MallSpecsObj mallSpecsObj, int i10) {
        int i11;
        int i12;
        n nVar = this;
        MallSpecsObj mallSpecsObj2 = mallSpecsObj;
        if (PatchProxy.proxy(new Object[]{mallSpecsObj2, new Integer(i10)}, this, changeQuickRedirect, false, 40682, new Class[]{MallSpecsObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (mallSpecsObj2 == null || com.max.hbcommon.utils.c.w(mallSpecsObj.getButtons()) || context == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.item_purchase_param, (ViewGroup) nVar.f90818j, false);
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_option);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.tv_faq);
        textView.setText(mallSpecsObj.getTitle());
        if (i10 == 0) {
            textView2.setVisibility(0);
            textView2.setOnClickListener(nVar.new t());
        } else {
            textView2.setVisibility(8);
        }
        int size = mallSpecsObj.getButtons().size();
        int iL = ViewUtils.L(context) - ViewUtils.f(context, 24.0f);
        int iF = ViewUtils.f(context, 12.0f);
        int iF2 = ViewUtils.f(context, 8.0f);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int i13 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(iF, iF2, iF, 0);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout.addView(linearLayout2);
        linearLayout.setTag(mallSpecsObj2);
        int i14 = 0;
        int iS = 0;
        while (i14 < size) {
            MallSpecButtonObj mallSpecButtonObj = mallSpecsObj.getButtons().get(i14);
            String text = mallSpecButtonObj.getText();
            TextView textView3 = new TextView(context);
            textView3.setTag(mallSpecButtonObj);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i13, i13);
            int i15 = size;
            if (i14 == 0) {
                i12 = 0;
                i11 = 0;
            } else {
                i11 = iF2;
                i12 = 0;
            }
            layoutParams2.setMargins(i11, i12, i12, i12);
            textView3.setLayoutParams(layoutParams2);
            int iF3 = ViewUtils.f(context, 12.0f);
            int iF4 = ViewUtils.f(context, 7.0f);
            textView3.setPadding(iF3, iF4, iF3, iF4);
            textView3.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView3.setIncludeFontPadding(false);
            textView3.setLineSpacing(ViewUtils.f(context, 2.0f), 1.0f);
            textView3.setText(text);
            boolean zB5 = nVar.b5(mallSpecsObj.getTitle(), mallSpecButtonObj.getSku_list());
            nVar.r5(textView3, zB5, mallSpecsObj.getCheckedItem() == i14);
            textView3.setEnabled(zB5);
            textView3.setOnClickListener(nVar.new u(mallSpecsObj2, i14));
            float f10 = iF3 * 2;
            int iS2 = (int) (((double) (ViewUtils.S(textView3.getPaint(), text) + f10)) + 0.5d);
            if (i14 != 0) {
                iS2 += iF2;
            }
            iS += iS2;
            if (iS > iL) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(iF, iF2, iF, 0);
                linearLayout3.setLayoutParams(layoutParams3);
                textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout3.addView(textView3);
                linearLayout.addView(linearLayout3);
                linearLayout2 = linearLayout3;
                iS = (int) (((double) (ViewUtils.S(textView3.getPaint(), text) + f10)) + 0.5d);
            } else {
                linearLayout2.addView(textView3);
            }
            i14++;
            mallSpecsObj2 = mallSpecsObj;
            size = i15;
            i13 = -2;
            nVar = this;
        }
        n nVar2 = nVar;
        if (nVar2.f90818j.getChildCount() > 0) {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(0, ViewUtils.f(context, 10.0f), 0, 0);
            linearLayout.setLayoutParams(layoutParams4);
        }
        nVar2.f90818j.addView(linearLayout);
    }

    private void Q4(List<MallSpecsObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40684, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (com.max.hbcommon.utils.c.w(list) || context == null) {
            return;
        }
        s5(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            P4(list.get(i10), i10);
        }
    }

    private void R4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40708, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0838n()));
    }

    @SuppressLint({"AutoDispose"})
    private void S4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40704, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            if (this.B) {
                return;
            } else {
                this.B = true;
            }
        }
        this.f90820l.setVisibility(0);
        long j10 = 0;
        if (i10 > 4) {
            j10 = 2;
        } else if (i10 > 0) {
            j10 = 1;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u8().I5(io.reactivex.schedulers.b.d()).C1(j10, TimeUnit.SECONDS).a4(io.reactivex.android.schedulers.a.c()).J5(new h(i10)));
    }

    private MallValidObj T4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40700, new Class[0], MallValidObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallValidObj) patchProxyResultProxy.result;
        }
        MallPurchaseParamsObj mallPurchaseParamsObj = this.f90832x;
        if (mallPurchaseParamsObj == null) {
            return null;
        }
        for (MallPurchaseParamObj mallPurchaseParamObj : mallPurchaseParamsObj.getParams()) {
            if (mallPurchaseParamObj.getCat() != null && mallPurchaseParamObj.getCat().size() > 0) {
                for (MallCatObj mallCatObj : mallPurchaseParamObj.getCat()) {
                    if (mallCatObj.isChecked()) {
                        return t5(mallCatObj);
                    }
                }
            }
        }
        return null;
    }

    private void U4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40677, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90820l.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().b1(str, this.f90830v).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p(str)));
    }

    private String W4() {
        MallPurchaseParamsObj mallPurchaseParamsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40699, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(this.f90826r) || (mallPurchaseParamsObj = this.f90832x) == null || mallPurchaseParamsObj.getSkus() == null) {
            return null;
        }
        for (MallSkuObj mallSkuObj : this.f90832x.getSkus()) {
            if (this.f90826r.equals(mallSkuObj.getSku_id())) {
                return mallSkuObj.getSale_prefix();
            }
        }
        return null;
    }

    @SuppressLint({"AutoDispose"})
    private void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40706, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7("steam_balance").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private boolean Y4(MallCatObj mallCatObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCatObj}, this, changeQuickRedirect, false, 40695, new Class[]{MallCatObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        MallValidObj mallValidObjT5 = t5(mallCatObj);
        return mallValidObjT5 != null && "1".equals(mallValidObjT5.getValid());
    }

    private boolean Z4() {
        MallPurchaseParamsObj mallPurchaseParamsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40698, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(this.f90826r) || (mallPurchaseParamsObj = this.f90832x) == null || mallPurchaseParamsObj.getSkus() == null) {
            return false;
        }
        for (MallSkuObj mallSkuObj : this.f90832x.getSkus()) {
            if (this.f90826r.equals(mallSkuObj.getSku_id()) && "1".equals(mallSkuObj.getSale_state())) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ void a4(n nVar, MallSpecsObj mallSpecsObj, int i10) {
        if (PatchProxy.proxy(new Object[]{nVar, mallSpecsObj, new Integer(i10)}, null, changeQuickRedirect, true, 40717, new Class[]{n.class, MallSpecsObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        nVar.h5(mallSpecsObj, i10);
    }

    private String a5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40690, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        MallPurchaseParamsObj mallPurchaseParamsObj = this.f90832x;
        if (mallPurchaseParamsObj == null || com.max.hbcommon.utils.c.w(mallPurchaseParamsObj.getSpecs()) || com.max.hbcommon.utils.c.w(this.f90832x.getSkus())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MallSkuObj> it = this.f90832x.getSkus().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSku_id());
        }
        for (MallSpecsObj mallSpecsObj : this.f90832x.getSpecs()) {
            if (mallSpecsObj.getCheckedItem() == -1) {
                return null;
            }
            arrayList.retainAll(mallSpecsObj.getButtons().get(mallSpecsObj.getCheckedItem()).getSku_list());
        }
        if (arrayList.size() != 1) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    static /* synthetic */ void b4(n nVar, TextView textView) {
        if (PatchProxy.proxy(new Object[]{nVar, textView}, null, changeQuickRedirect, true, 40718, new Class[]{n.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.g5(textView);
    }

    private boolean b5(String str, List<String> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 40683, new Class[]{String.class, List.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (MallSpecsObj mallSpecsObj : this.f90832x.getSpecs()) {
            if (!mallSpecsObj.getTitle().equals(str) && mallSpecsObj.getCheckedItem() != -1) {
                arrayList.retainAll(mallSpecsObj.getButtons().get(mallSpecsObj.getCheckedItem()).getSku_list());
            }
        }
        return !com.max.hbcommon.utils.c.w(arrayList);
    }

    static /* synthetic */ void c4(n nVar, TextView textView) {
        if (PatchProxy.proxy(new Object[]{nVar, textView}, null, changeQuickRedirect, true, 40719, new Class[]{n.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.e5(textView);
    }

    public static n c5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40672, new Class[]{String.class}, n.class);
        return patchProxyResultProxy.isSupported ? (n) patchProxyResultProxy.result : d5(null, L, str, null, null);
    }

    static /* synthetic */ MallValidObj d4(n nVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40720, new Class[]{n.class}, MallValidObj.class);
        return patchProxyResultProxy.isSupported ? (MallValidObj) patchProxyResultProxy.result : nVar.T4();
    }

    public static n d5(String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 40673, new Class[]{String.class, String.class, String.class, String.class, String.class}, n.class);
        if (patchProxyResultProxy.isSupported) {
            return (n) patchProxyResultProxy.result;
        }
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", str);
        bundle.putString("mode", str2);
        bundle.putString("sku_id", str3);
        bundle.putString("address_id", str4);
        bundle.putString("cart_id", str5);
        nVar.setArguments(bundle);
        return nVar;
    }

    private void dismiss() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40703, new Class[0], Void.TYPE).isSupported && (getParentFragment() instanceof com.max.hbcommon.base.c)) {
            ((com.max.hbcommon.base.c) getParentFragment()).dismiss();
        }
    }

    private void e5(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 40692, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) ((LinearLayout) textView.getParent()).getParent();
        MallCatObj mallCatObj = (MallCatObj) textView.getTag();
        int childCount = linearLayout.getChildCount();
        for (int i10 = 1; i10 < childCount; i10++) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i10);
            int childCount2 = linearLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                TextView textView2 = (TextView) linearLayout2.getChildAt(i11);
                MallCatObj mallCatObj2 = (MallCatObj) textView2.getTag();
                mallCatObj2.setChecked(mallCatObj2.getCat_id().equals(mallCatObj.getCat_id()));
                r5(textView2, Y4(mallCatObj2), mallCatObj2.isChecked());
            }
        }
        m5();
        j5();
        k5();
    }

    static /* synthetic */ int f4(n nVar) {
        int i10 = nVar.f90833y;
        nVar.f90833y = i10 + 1;
        return i10;
    }

    private void f5() {
        MallPurchaseParamsObj mallPurchaseParamsObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40679, new Class[0], Void.TYPE).isSupported || (mallPurchaseParamsObj = this.f90832x) == null) {
            return;
        }
        com.max.hbimage.b.L(mallPurchaseParamsObj.getHead_img(), this.f90810b, R.drawable.common_default_placeholder_375x210);
        m5();
        this.f90818j.removeAllViews();
        Q4(this.f90832x.getSpecs());
        N4(this.f90832x.getParams());
        M4();
        l5();
        j5();
        k5();
        this.f90811c.postDelayed(new r(), 100L);
    }

    static /* synthetic */ int g4(n nVar) {
        int i10 = nVar.f90833y;
        nVar.f90833y = i10 - 1;
        return i10;
    }

    private void g5(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 40691, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) ((LinearLayout) textView.getParent()).getParent();
        MallSkuObj mallSkuObj = (MallSkuObj) textView.getTag();
        int childCount = linearLayout.getChildCount();
        for (int i10 = 1; i10 < childCount; i10++) {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i10);
            int childCount2 = linearLayout2.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                TextView textView2 = (TextView) linearLayout2.getChildAt(i11);
                r5(textView2, true, mallSkuObj.getSku_id().equals(((MallSkuObj) textView2.getTag()).getSku_id()));
            }
        }
        k5();
        U4(mallSkuObj.getSku_id());
    }

    private void h5(MallSpecsObj mallSpecsObj, int i10) {
        if (PatchProxy.proxy(new Object[]{mallSpecsObj, new Integer(i10)}, this, changeQuickRedirect, false, 40689, new Class[]{MallSpecsObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = -1;
        if (mallSpecsObj.getCheckedItem() == i10) {
            mallSpecsObj.setCheckedItem(-1);
        } else {
            mallSpecsObj.setCheckedItem(i10);
        }
        int i12 = 0;
        while (i12 < this.f90818j.getChildCount()) {
            View childAt = this.f90818j.getChildAt(i12);
            if ((childAt instanceof LinearLayout) && (childAt.getTag() instanceof MallSpecsObj)) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                MallSpecsObj mallSpecsObj2 = (MallSpecsObj) childAt.getTag();
                int childCount = linearLayout.getChildCount();
                int i13 = i11;
                for (int i14 = 1; i14 < childCount; i14++) {
                    LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(i14);
                    int childCount2 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount2; i15++) {
                        TextView textView = (TextView) linearLayout2.getChildAt(i15);
                        i13++;
                        MallSpecButtonObj mallSpecButtonObj = (MallSpecButtonObj) textView.getTag();
                        boolean zB5 = b5(mallSpecsObj2.getTitle(), mallSpecButtonObj.getSku_list());
                        r5(textView, b5(mallSpecsObj2.getTitle(), mallSpecButtonObj.getSku_list()), mallSpecsObj2.getCheckedItem() == i13);
                        textView.setEnabled(zB5);
                    }
                }
            }
            i12++;
            i11 = -1;
        }
        String strA5 = a5();
        this.f90826r = strA5;
        if (!com.max.hbcommon.utils.c.u(strA5)) {
            this.f90829u = this.f90826r;
        }
        k5();
        if (com.max.hbcommon.utils.c.u(this.f90826r)) {
            return;
        }
        U4(this.f90826r);
    }

    static /* synthetic */ void i4(n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40721, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.o5();
    }

    @SuppressLint({"AutoDispose"})
    private void i5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40705, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l0().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40680, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f90833y = 1;
        if (this.D != null) {
            MallValidObj mallValidObjT4 = T4();
            if (mallValidObjT4 == null || !com.max.hbcommon.utils.c.x(mallValidObjT4.getBulk_count_enable()) || this.f90831w != null) {
                this.D.setVisibility(8);
            } else {
                this.D.setVisibility(0);
                ((TextView) this.D.findViewById(R.id.tv_cnt)).setText(String.valueOf(this.f90833y));
            }
        }
    }

    private void k5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40697, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallRegisterOrderObj mallRegisterOrderObjV4 = V4();
        boolean z10 = mallRegisterOrderObjV4 != null;
        boolean z11 = mallRegisterOrderObjV4 != null && "2".equals(mallRegisterOrderObjV4.getSale_state());
        if (this.f90831w != null) {
            this.f90819k.setRightButtonEnabled(z10 && com.max.hbcommon.utils.c.x(T4().getCart_enable()));
        } else {
            this.f90819k.setRightButtonEnabled(z10);
        }
        this.f90819k.setLeftButtonEnabled(z10);
        boolean z12 = (this.f90832x.getPrice() == null || this.f90832x.getPrice().getCoupon_info() == null || this.f90832x.getPrice().getCoupon_info().getParams() == null) ? false : true;
        if (z11) {
            this.f90819k.setRightText(this.mContext.getResources().getString(R.string.pre_purchase));
        } else if (this.f90831w != null) {
            this.f90819k.setRightText("确定");
        } else {
            this.f90819k.setRightText(this.mContext.getResources().getString(z12 ? R.string.buy_with_coupon : R.string.buy_now));
        }
        if (z10) {
            this.f90819k.setRightClickListener(new d(mallRegisterOrderObjV4, z12));
            this.f90819k.setLeftClickListener(new e(mallRegisterOrderObjV4));
        } else {
            this.f90819k.setRightButtonClickable(false);
            this.f90819k.setLeftButtonClickable(false);
        }
        if (this.f90831w != null) {
            this.f90819k.setShowLeftButton(false);
            this.f90819k.h();
            return;
        }
        MallValidObj mallValidObjT4 = T4();
        if (mallValidObjT4 == null || !com.max.hbcommon.utils.c.x(mallValidObjT4.getCart_enable())) {
            this.f90819k.setShowLeftButton(false);
        } else {
            this.f90819k.setShowLeftButton(true);
        }
        View view = this.f90824p;
        if (view != null) {
            MallCartUtils.f90196a.m(this.mContext, view, false);
            return;
        }
        View viewH = MallCartUtils.f90196a.h(this.mContext);
        this.f90824p = viewH;
        this.f90819k.b(viewH);
    }

    private void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40681, new Class[0], Void.TYPE).isSupported || this.f90821m == null) {
            return;
        }
        MallPurchaseParamsObj mallPurchaseParamsObj = this.f90832x;
        if (mallPurchaseParamsObj == null || mallPurchaseParamsObj.getPrice() == null || this.f90832x.getPrice().getCoupon_info() == null || com.max.hbutils.utils.n.q(this.f90832x.getPrice().getCoupon_info().getAvailable_coupon_num()) <= 0) {
            this.f90821m.setVisibility(8);
            return;
        }
        MallCouponGuideObj coupon_info = this.f90832x.getPrice().getCoupon_info();
        this.f90821m.setVisibility(0);
        this.f90822n.setText(coupon_info.getTitle());
        this.f90823o.setText(coupon_info.getSub_title());
        this.f90821m.setOnClickListener(new s(coupon_info));
        this.C = coupon_info.getPrimary_id();
    }

    private void m5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40694, new Class[0], Void.TYPE).isSupported || this.f90832x == null) {
            return;
        }
        MallValidObj mallValidObjT4 = T4();
        String inventory = mallValidObjT4 != null ? mallValidObjT4.getInventory() : null;
        MallPriceObj price = this.f90832x.getPrice();
        if (price != null) {
            this.f90813e.setVisibility(0);
            this.f90814f.setVisibility(0);
            this.f90815g.setVisibility(8);
            r1.j1(this.f90812d, price, W4());
            bb.d.d(this.f90814f, 2);
            this.f90813e.setVisibility(0);
            this.f90814f.setText(r1.F(price.getFinal_price()));
            this.f90815g.setText(String.format(getString(R.string.coin_divider_format), price.getFinal_price()));
            if (com.max.hbcommon.utils.c.u(price.getInitial_price())) {
                this.f90816h.setVisibility(8);
            } else {
                this.f90816h.setVisibility(0);
                this.f90816h.setText(String.format(getString(R.string.reference_price_format), r1.F(price.getInitial_price())));
            }
        } else {
            this.f90812d.setVisibility(8);
            this.f90813e.setVisibility(8);
            this.f90814f.setVisibility(8);
            this.f90815g.setVisibility(8);
            this.f90816h.setVisibility(8);
        }
        this.f90817i.setText(com.max.hbcommon.utils.c.u(inventory) ? null : String.format(getString(R.string.remain_num_format), inventory));
    }

    private void n5(MallRegisterOrderObj mallRegisterOrderObj) {
        if (PatchProxy.proxy(new Object[]{mallRegisterOrderObj}, this, changeQuickRedirect, false, 40678, new Class[]{MallRegisterOrderObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("MallRegisterOrderDialogFragment, registerOrder, mSkuId = " + this.f90826r + ", getAppid = " + mallRegisterOrderObj.getAppid());
        this.f90820l.setVisibility(0);
        MallValidObj mallValidObjT4 = T4();
        boolean z10 = mallValidObjT4 != null && com.max.hbcommon.utils.c.x(mallValidObjT4.getCart_enable());
        addDisposable((io.reactivex.disposables.b) (z10 ? com.max.xiaoheihe.network.i.a().v8(com.max.hbutils.utils.k.p(mallRegisterOrderObj), this.f90830v) : com.max.xiaoheihe.network.i.a().Nb(com.max.hbutils.utils.k.p(mallRegisterOrderObj), this.f90830v)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q(z10, mallRegisterOrderObj)));
    }

    static /* synthetic */ void o4(n nVar, int i10) {
        if (PatchProxy.proxy(new Object[]{nVar, new Integer(i10)}, null, changeQuickRedirect, true, 40722, new Class[]{n.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        nVar.S4(i10);
    }

    private void o5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40711, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("sku_id", this.f90826r);
        jsonObject.addProperty("h_src", this.f90830v);
        com.max.hbcommon.analytics.d.d("4", lb.d.f131193k2, null, jsonObject);
    }

    static /* synthetic */ void p4(n nVar, MallRegisterOrderObj mallRegisterOrderObj) {
        if (PatchProxy.proxy(new Object[]{nVar, mallRegisterOrderObj}, null, changeQuickRedirect, true, 40723, new Class[]{n.class, MallRegisterOrderObj.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.n5(mallRegisterOrderObj);
    }

    private void p5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40707, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (!isActive() || activity == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y(getString(R.string.bind_steam_tips_title)).l(getString(R.string.bind_steam_tips_message)).u(getString(R.string.confirm), new m(activity)).o(getString(R.string.cancel), new l()).F();
    }

    private void q5(MallPurchaseResultObj mallPurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseResultObj}, this, changeQuickRedirect, false, 40702, new Class[]{MallPurchaseResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (!isActive() || activity == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y(getString(R.string.fail)).l(getString(R.string.has_not_finish_order)).u(getString(R.string.to_handle), new g(mallPurchaseResultObj)).o(getString(R.string.cancel), new f()).F();
    }

    private void r5(TextView textView, boolean z10, boolean z11) {
        Object[] objArr = {textView, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40693, new Class[]{TextView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Context context = textView.getContext();
        if (!z10) {
            textView.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
            textView.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
        } else if (z11) {
            textView.setBackgroundResource(R.drawable.btn_divider_bg_primary_border_2dp);
            textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
        } else {
            textView.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
            textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
        }
    }

    private void s5(List<MallSpecsObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40685, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        for (MallSpecsObj mallSpecsObj : list) {
            for (int i10 = 0; i10 < mallSpecsObj.getButtons().size(); i10++) {
                if (mallSpecsObj.getButtons().get(i10).getSku_list().contains(this.f90826r)) {
                    mallSpecsObj.setCheckedItem(i10);
                    break;
                }
            }
        }
    }

    private MallValidObj t5(MallCatObj mallCatObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCatObj}, this, changeQuickRedirect, false, 40696, new Class[]{MallCatObj.class}, MallValidObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallValidObj) patchProxyResultProxy.result;
        }
        MallPurchaseParamsObj mallPurchaseParamsObj = this.f90832x;
        if (mallPurchaseParamsObj == null || mallPurchaseParamsObj.getValid() == null) {
            return null;
        }
        for (MallValidObj mallValidObj : this.f90832x.getValid()) {
            if (mallValidObj.getCat_value().equals(mallCatObj.getCat_id())) {
                mallValidObj.setCart_enable(mallCatObj.getCart_enable());
                mallValidObj.setBulk_count(mallCatObj.getBulk_count());
                mallValidObj.setBulk_count_enable(mallCatObj.getBulk_count_enable());
                return mallValidObj;
            }
        }
        return null;
    }

    static /* synthetic */ void v4(n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40724, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.p5();
    }

    static /* synthetic */ void y4(n nVar) {
        if (PatchProxy.proxy(new Object[]{nVar}, null, changeQuickRedirect, true, 40725, new Class[]{n.class}, Void.TYPE).isSupported) {
            return;
        }
        nVar.X4();
    }

    public MallRegisterOrderObj V4() {
        MallPurchaseParamsObj mallPurchaseParamsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40701, new Class[0], MallRegisterOrderObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallRegisterOrderObj) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(this.f90826r) || (mallPurchaseParamsObj = this.f90832x) == null || mallPurchaseParamsObj.getParams() == null) {
            return null;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        mallRegisterOrderObj.setSession(com.max.hbutils.utils.n.r(this.f90832x.getSession()));
        if (!com.max.hbcommon.utils.c.u(this.f90828t)) {
            mallRegisterOrderObj.setAddress_id(this.f90828t);
        }
        boolean z10 = false;
        for (MallPurchaseParamObj mallPurchaseParamObj : this.f90832x.getParams()) {
            if (mallPurchaseParamObj.getCat() != null && mallPurchaseParamObj.getCat().size() > 0) {
                for (MallCatObj mallCatObj : mallPurchaseParamObj.getCat()) {
                    if (mallCatObj.isChecked()) {
                        if (mallRegisterOrderObj.getParams() == null) {
                            mallRegisterOrderObj.setParams(new ArrayList());
                        }
                        MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
                        mallOrderParamObj.setCount(this.f90833y);
                        mallOrderParamObj.setCat_value(com.max.hbutils.utils.n.r(mallCatObj.getCat_id()));
                        mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(this.f90826r));
                        mallRegisterOrderObj.getParams().add(mallOrderParamObj);
                        z10 = true;
                        break;
                    }
                }
            }
        }
        if (!com.max.hbcommon.utils.c.w(this.f90832x.getSkus())) {
            for (MallSkuObj mallSkuObj : this.f90832x.getSkus()) {
                String str = this.f90826r;
                if (str != null && str.equals(mallSkuObj.getSku_id())) {
                    mallRegisterOrderObj.setSale_state(mallSkuObj.getSale_state());
                    break;
                }
            }
        }
        if (z10) {
            return mallRegisterOrderObj;
        }
        return null;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40676, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_mall_register_order_dialog);
        if (getArguments() != null) {
            this.f90825q = getArguments().getString("mode");
            this.f90826r = getArguments().getString("sku_id");
            this.f90827s = getArguments().getString("sku_id");
            this.f90828t = getArguments().getString("address_id");
            this.f90830v = getArguments().getString("h_src");
            this.f90831w = getArguments().getString("cart_id");
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_close);
        View viewFindViewById = view.findViewById(R.id.vg_root);
        this.f90810b = (ImageView) view.findViewById(R.id.iv_game_img);
        this.f90812d = (TextView) view.findViewById(R.id.tv_discount);
        this.f90813e = (TextView) view.findViewById(R.id.tv_cost_rmb_symbol);
        this.f90814f = (TextView) view.findViewById(R.id.tv_cost_rmb);
        this.f90811c = (ScrollView) view.findViewById(R.id.sv_content);
        this.f90815g = (TextView) view.findViewById(R.id.tv_cost_coin);
        this.f90816h = (TextView) view.findViewById(R.id.tv_reference_price);
        this.f90817i = (TextView) view.findViewById(R.id.tv_inventory);
        this.f90818j = (LinearLayout) view.findViewById(R.id.ll_choose_options);
        this.f90819k = (BottomButtonLeftItemView) view.findViewById(R.id.bottom_button);
        this.f90820l = view.findViewById(R.id.vg_progress);
        View viewFindViewById2 = view.findViewById(R.id.vg_get_coupon);
        this.f90821m = viewFindViewById2;
        this.f90822n = (TextView) viewFindViewById2.findViewById(R.id.tv_coupon_title);
        this.f90823o = (TextView) this.f90821m.findViewById(R.id.tv_coupon_desc);
        imageView.setOnClickListener(new k());
        viewFindViewById.setOnClickListener(new o());
        U4(this.f90826r);
    }

    @Override // com.max.hbwallet.utils.c
    public String j2() {
        return this.C;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40710, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 3 && i11 == -1) {
            S4(0);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 40674, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof w) {
            this.f90834z = (w) getParentFragment();
            return;
        }
        if (context instanceof w) {
            this.f90834z = (w) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement FragmentListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40675, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f90834z = null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40709, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.A) {
            this.A = false;
            R4();
        }
    }
}
