package com.max.xiaoheihe.module.game;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcommon.network.ApiException;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponGuideObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.game.CoffeeDialogDataObj;
import com.max.xiaoheihe.bean.game.CoffeeDialogProgressObj;
import com.max.xiaoheihe.bean.game.GamePurchaseParamObj;
import com.max.xiaoheihe.bean.game.GamePurchaseParamValueObj;
import com.max.xiaoheihe.bean.game.GamePurchaseParamsObj;
import com.max.xiaoheihe.bean.game.GamePurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallOrderParamObj;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.bean.mall.MallSteamOrderObj;
import com.max.xiaoheihe.bean.mall.PayLinkObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.mall.SteamRedeemWalletCodeLoginActivity;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.module.mall.direct_purchace.PaymentSelectionConfig;
import com.max.xiaoheihe.module.mall.direct_purchace.SteamDirectPurchaseTool;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class v0 extends com.max.hbcommon.base.d implements com.max.hbwallet.utils.c {
    public static final int U = 3;
    public static final int V = 4;
    private static final String W = "h_src";
    private static final String X = "app_id";
    private static final String Y = "platf";
    private static final String Z = "cart_id";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f88399a0 = "buy_type";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f88400b0 = "package_id";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f88401c0 = "sku_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f88402p1 = 1;
    private String A;
    private GamePurchaseParamsObj B;
    private boolean C;
    private String G;
    private ViewGroup I;
    private ProgressDialog J;
    private io.reactivex.disposables.a O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f88403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScrollView f88404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RelativeLayout f88405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f88406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f88407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f88408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f88409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f88410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f88411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f88412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewGroup f88413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinearLayout f88414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f88415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f88416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f88417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f88418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private BottomButtonLeftItemView f88419r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f88420s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f88421t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f88422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f88423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f88424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f88425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f88426y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f88427z;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private int H = 1;
    private com.max.hbcommon.view.a K = null;
    private com.max.hbcommon.view.a L = null;
    private boolean M = true;
    private final AtomicBoolean N = new AtomicBoolean(false);
    private String P = null;
    private String Q = null;
    private String R = null;
    private List<KeyDescObj> S = null;
    private final Handler T = new k(Looper.getMainLooper());

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f88428b;

        a(TextView textView) {
            this.f88428b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34292, new Class[]{View.class}, Void.TYPE).isSupported && v0.this.H > 1) {
                v0.i4(v0.this);
                this.f88428b.setText(String.valueOf(v0.this.H));
            }
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class a0 extends com.max.hbcommon.network.d<Result<GamePurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ GamePurchaseResultObj f88431a;

            a(GamePurchaseResultObj gamePurchaseResultObj) {
                this.f88431a = gamePurchaseResultObj;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34352, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f88431a.getOrder_id())) {
                    return;
                }
                v0 v0Var = v0.this;
                v0Var.startActivity(GameStoreOrderDetailActivity.y4(v0Var.getContext(), this.f88431a.getOrder_id()));
            }
        }

        a0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34349, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                if (!(th2 instanceof ApiException) || TextUtils.isEmpty(th2.getMessage())) {
                    super.onError(th2);
                } else {
                    com.max.xiaoheihe.module.mall.o.v((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, th2.getMessage());
                }
                v0.this.f88415n.setVisibility(8);
                v0.R3(v0.this);
            }
        }

        public void onNext(Result<GamePurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34350, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                v0.this.f88415n.setVisibility(8);
                GamePurchaseResultObj result2 = result.getResult();
                if (result2 != null && "1".equals(result2.getNot_finish_order())) {
                    v0.L4(v0.this, new a(result2));
                    return;
                }
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getOrder_id())) {
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(v0.this.getString(R.string.fail));
                    } else {
                        com.max.xiaoheihe.module.mall.o.v((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, result.getMsg());
                    }
                    v0.R3(v0.this);
                    return;
                }
                Context context = v0.this.getContext();
                if (context != null) {
                    Intent intent = new Intent(lb.a.A);
                    intent.putExtra(lb.a.f130996l0, lb.a.f131044t0);
                    context.sendBroadcast(intent);
                    MallCartUtils.f90196a.C(OrderEvent.REGISTER, result2.getAppid(), v0.this.A, v0.this.f88427z, result2.getOrder_id(), v0.this.f88421t);
                    v0.this.startActivity(GameStoreOrderDetailActivity.y4(context, result2.getOrder_id()));
                }
                v0.R3(v0.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34351, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCouponGuideObj f88433b;

        b(MallCouponGuideObj mallCouponGuideObj) {
            this.f88433b = mallCouponGuideObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34293, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.l0.f95687b.C(((com.max.hbcommon.base.d) v0.this).mContext, null, com.max.xiaoheihe.utils.l0.A(String.format(lb.a.f130999l3, this.f88433b.getPrimary_id()), null, true, true, true, false), null);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class b0 implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34353, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            v0.S3(v0.this);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34294, new Class[]{View.class}, Void.TYPE).isSupported || v0.this.B == null || v0.this.B.getParams() == null) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) v0.this).mContext, (Class<?>) WebActionActivity.class);
            v0 v0Var = v0.this;
            intent.putExtra("pageurl", v0.m4(v0Var, v0Var.B.getParams()).getBuy_type().getGuide_url());
            intent.putExtra("title", "常见问题");
            ((com.max.hbcommon.base.d) v0.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class c0 extends com.max.hbcommon.network.d<Result<MallPurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f88437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88438c;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseResultObj f88440a;

            a(MallPurchaseResultObj mallPurchaseResultObj) {
                this.f88440a = mallPurchaseResultObj;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34357, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f88440a.getOrder_id())) {
                    return;
                }
                if ("cart".equals(this.f88440a.getOrder_src())) {
                    com.max.xiaoheihe.base.router.b.D(((com.max.hbcommon.base.d) v0.this).mContext, this.f88440a.getOrder_id()).A();
                } else {
                    com.max.xiaoheihe.base.router.b.R(((com.max.hbcommon.base.d) v0.this).mContext, this.f88440a.getOrder_id(), true).A();
                }
            }
        }

        c0(boolean z10, String str) {
            this.f88437b = z10;
            this.f88438c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34354, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                v0.this.f88415n.setVisibility(8);
                v0.R3(v0.this);
            }
        }

        public void onNext(Result<MallPurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34355, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                v0.this.f88415n.setVisibility(8);
                MallPurchaseResultObj result2 = result.getResult();
                if (result2 != null && "1".equals(result2.getNot_finish_order())) {
                    v0.L4(v0.this, new a(result2));
                    return;
                }
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getOrder_id())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(v0.this.getString(R.string.fail));
                    v0.R3(v0.this);
                    return;
                }
                Context context = v0.this.getContext();
                if (context != null) {
                    Intent intent = new Intent(lb.a.A);
                    intent.putExtra(lb.a.f130996l0, lb.a.f131044t0);
                    context.sendBroadcast(intent);
                    if (this.f88437b) {
                        MallCartUtils.f90196a.u(OrderEvent.REGISTER, v0.this.f88422u, v0.this.A, this.f88438c, result2.getOrder_id(), v0.this.f88421t);
                        com.max.xiaoheihe.base.router.b.D(((com.max.hbcommon.base.d) v0.this).mContext, result2.getOrder_id()).A();
                    } else {
                        MallCartUtils.f90196a.x(OrderEvent.REGISTER, v0.this.f88422u, v0.this.A, this.f88438c, result2.getOrder_id(), v0.this.f88421t);
                        com.max.xiaoheihe.base.router.b.R(((com.max.hbcommon.base.d) v0.this).mContext, result2.getOrder_id(), true).A();
                    }
                }
                v0.R3(v0.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34356, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GamePurchaseParamValueObj f88442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f88443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ GamePurchaseParamObj f88444d;

        d(GamePurchaseParamValueObj gamePurchaseParamValueObj, int i10, GamePurchaseParamObj gamePurchaseParamObj) {
            this.f88442b = gamePurchaseParamValueObj;
            this.f88443c = i10;
            this.f88444d = gamePurchaseParamObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34295, new Class[]{View.class}, Void.TYPE).isSupported || this.f88442b.isChecked()) {
                return;
            }
            if (this.f88443c != 0) {
                v0.o4(v0.this, this.f88444d, this.f88442b);
                v0.q4(v0.this);
                v0.s4(v0.this);
                v0.t4(v0.this);
                v0.u4(v0.this);
                return;
            }
            v0.o4(v0.this, this.f88444d, this.f88442b);
            v0.q4(v0.this);
            v0 v0Var = v0.this;
            v0.r4(v0Var, v0.m4(v0Var, this.f88444d).getBuy_type(), 1);
            v0.s4(v0.this);
            v0.t4(v0.this);
            v0.u4(v0.this);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class d0 extends com.max.hbcommon.network.d<Result<HomeDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        public void onNext(Result<HomeDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34358, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                User userI = com.max.xiaoheihe.utils.i0.i();
                userI.setGameAccountInfo(result.getResult());
                com.max.xiaoheihe.utils.i0.z(userI);
                GamePurchaseParamValueObj gamePurchaseParamValueObjY3 = v0.Y3(v0.this);
                String key = gamePurchaseParamValueObjY3 != null ? gamePurchaseParamValueObjY3.getKey() : null;
                if (!com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.i0.m()) && "market_balance".equalsIgnoreCase(key)) {
                    v0.Z3(v0.this, 0);
                }
                Context context = v0.this.getContext();
                if (context != null) {
                    com.max.xiaoheihe.utils.d.x1(context);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34359, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HomeDataObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88449d;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements com.max.xiaoheihe.utils.l0.h<CartDetailObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public /* bridge */ /* synthetic */ void a(CartDetailObj cartDetailObj) {
                if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 34299, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                d(cartDetailObj);
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public /* bridge */ /* synthetic */ void b(CartDetailObj cartDetailObj) {
                if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 34298, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                c(cartDetailObj);
            }

            public void c(CartDetailObj cartDetailObj) {
            }

            public void d(CartDetailObj cartDetailObj) {
                if (!PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 34297, new Class[]{CartDetailObj.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("添加成功");
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    mallCartUtils.D(com.max.hbutils.utils.n.q(cartDetailObj.getCart_count()));
                    mallCartUtils.m(((com.max.hbcommon.base.d) v0.this).mContext, v0.this.f88420s, false);
                }
            }
        }

        e(String str, String str2, String str3) {
            this.f88447b = str;
            this.f88448c = str2;
            this.f88449d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34296, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils.f90196a.f(v0.this.getCompositeDisposable(), this.f88447b, "" + v0.this.H, this.f88448c, this.f88449d, new a());
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class e0 implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34360, new Class[0], Void.TYPE).isSupported && v0.this.isActive()) {
                ViewUtils.V(v0.this.f88404c);
                ViewUtils.J(((com.max.hbcommon.base.d) v0.this).mContext);
                ViewUtils.f(((com.max.hbcommon.base.d) v0.this).mContext, 300.0f);
                if (v0.this.f88416o.getVisibility() == 0) {
                    ViewUtils.f(((com.max.hbcommon.base.d) v0.this).mContext, 90.0f);
                }
            }
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f88454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f88456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f88457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f88459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f88460i;

        f(String str, boolean z10, String str2, boolean z11, String str3, String str4, String str5, String str6) {
            this.f88453b = str;
            this.f88454c = z10;
            this.f88455d = str2;
            this.f88456e = z11;
            this.f88457f = str3;
            this.f88458g = str4;
            this.f88459h = str5;
            this.f88460i = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34300, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.x4(v0.this, this.f88453b, this.f88454c, this.f88455d, this.f88456e, this.f88457f, this.f88458g, this.f88459h, this.f88460i);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f88462b;

        f0(TextView textView) {
            this.f88462b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34361, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GamePurchaseParamValueObj gamePurchaseParamValueObjY3 = v0.Y3(v0.this);
            if (v0.this.H < com.max.hbutils.utils.n.q(gamePurchaseParamValueObjY3 != null ? gamePurchaseParamValueObjY3.getBulk_count() : null)) {
                v0.h4(v0.this);
                this.f88462b.setText(String.valueOf(v0.this.H));
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("超出限购数量");
            }
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88464b;

        g(String str) {
            this.f88464b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34301, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.y4(v0.this, "1", this.f88464b);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88466b;

        h(String str) {
            this.f88466b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34302, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.y4(v0.this, "0", this.f88466b);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f88469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f88471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f88472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f88474h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f88475i;

        i(String str, boolean z10, String str2, boolean z11, String str3, String str4, String str5, String str6) {
            this.f88468b = str;
            this.f88469c = z10;
            this.f88470d = str2;
            this.f88471e = z11;
            this.f88472f = str3;
            this.f88473g = str4;
            this.f88474h = str5;
            this.f88475i = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34303, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.x4(v0.this, this.f88468b, this.f88469c, this.f88470d, this.f88471e, this.f88472f, this.f88473g, this.f88474h, this.f88475i);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88479d;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34305, new Class[0], Void.TYPE).isSupported && v0.this.isActive()) {
                    if (v0.this.getParentFragment() instanceof com.max.xiaoheihe.module.mall.i) {
                        ((com.max.xiaoheihe.module.mall.i) v0.this.getParentFragment()).e4();
                    }
                    v0.R3(v0.this);
                }
            }
        }

        j(String str, String str2, String str3) {
            this.f88477b = str;
            this.f88478c = str2;
            this.f88479d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34304, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils.f90196a.g(v0.this.getCompositeDisposable(), this.f88477b, this.f88478c, this.f88479d, v0.this.f88424w, new a());
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class k extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.n0 Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 34291, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            boolean z10 = message.arg2 == 1;
            if (message.what == 1) {
                v0.Q3(v0.this, message.arg1, z10, message.obj.toString());
            }
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class l implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f88483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f88487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f88488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f88489g;

        l(boolean z10, String str, String str2, String str3, String str4, boolean z11, String str5) {
            this.f88483a = z10;
            this.f88484b = str;
            this.f88485c = str2;
            this.f88486d = str3;
            this.f88487e = str4;
            this.f88488f = z11;
            this.f88489g = str5;
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34307, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (!this.f88483a) {
                if (this.f88488f) {
                    v0.H4(v0.this);
                    return;
                }
                if ("bundle".equals(this.f88489g)) {
                    if ("steam".equals(this.f88484b)) {
                        v0.H4(v0.this);
                        return;
                    } else {
                        v0.R3(v0.this);
                        return;
                    }
                }
                if (!com.max.hbcommon.utils.c.u(com.max.xiaoheihe.utils.i0.m()) || "cdkey".equalsIgnoreCase(this.f88484b) || "cdkey_coupon".equalsIgnoreCase(this.f88484b) || GamePurchaseParamsObj.BUY_TYPE_GIFT_COUPON.equalsIgnoreCase(this.f88484b)) {
                    return;
                }
                v0.I4(v0.this);
                return;
            }
            if ("market_balance".equalsIgnoreCase(this.f88484b) || com.max.xiaoheihe.module.mall.o.g(this.f88485c)) {
                if ("1".equals(com.max.hbcache.c.j("market_balance_tutorial"))) {
                    v0.Z3(v0.this, 0);
                    return;
                }
                com.max.hbcache.c.z("market_balance_tutorial", "1");
                Intent intent = new Intent(((com.max.hbcommon.base.d) v0.this).mContext, (Class<?>) WebActionActivity.class);
                intent.putExtra("pageurl", lb.a.f130946c4);
                intent.putExtra("title", "引导");
                ((com.max.hbcommon.base.d) v0.this).mContext.startActivity(intent);
                return;
            }
            if (!"steam_purchase".equalsIgnoreCase(this.f88484b)) {
                v0.G4(v0.this);
                return;
            }
            v0.this.Q = this.f88486d;
            v0.this.R = this.f88487e;
            com.max.hbcommon.analytics.l.f66572a.r(SteamDirectPurchaseTool.f90630b);
            v0.F4(v0.this, this.f88486d, this.f88487e, 0);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34308, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f88492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f88493c;

        n(boolean z10, Activity activity) {
            this.f88492b = z10;
            this.f88493c = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34309, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!this.f88492b) {
                com.max.hbcommon.analytics.l.f66572a.r(SteamDirectPurchaseTool.f90635g);
            }
            com.max.xiaoheihe.module.account.utils.l.D(v0.this.getCompositeDisposable(), this.f88493c, false, true, 0);
            v0.this.C = this.f88492b;
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34310, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.utils.l0.g f88496b;

        p(com.max.xiaoheihe.utils.l0.g gVar) {
            this.f88496b = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34311, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.l0.g gVar = this.f88496b;
            if (gVar != null) {
                gVar.a();
            }
            dialogInterface.dismiss();
            v0.R3(v0.this);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class q extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88498b;

        q(String str) {
            this.f88498b = str;
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34312, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.Y3(v0.this).setEnable_notify("1".equals(this.f88498b) ? "2" : "1");
            if ("1".equals(this.f88498b)) {
                new com.max.hbcommon.view.a.f(((com.max.hbcommon.base.d) v0.this).mContext).y("预约成功").l("补货后会发送通知").d().show();
            }
            v0.s4(v0.this);
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34313, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class r extends com.max.hbcommon.network.d<Result<MallPrepareStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f88500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f88502d;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34319, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbcommon.analytics.l.f66572a.r(SteamDirectPurchaseTool.f90637i);
                v0.Q4(v0.this, true);
            }
        }

        r(int i10, String str, String str2) {
            this.f88500b = i10;
            this.f88501c = str;
            this.f88502d = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(SteamDirectPurchaseTool.PayType payType) {
            if (PatchProxy.proxy(new Object[]{payType}, this, changeQuickRedirect, false, 34318, new Class[]{SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.U4(v0.this, payType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ kotlin.b2 d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34317, new Class[0], kotlin.b2.class);
            if (patchProxyResultProxy.isSupported) {
                return (kotlin.b2) patchProxyResultProxy.result;
            }
            v0.T4(v0.this, SteamDirectPurchaseTool.PayType.AliPay, "1");
            return null;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34314, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                v0.this.f88415n.setVisibility(8);
                v0.this.D = false;
                v0.R3(v0.this);
            }
        }

        public void onNext(Result<MallPrepareStateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34315, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive() && v0.this.M) {
                super.onNext(result);
                MallPrepareStateObj result2 = result.getResult();
                if ("1".equals(result2.getPrepare_state())) {
                    v0.this.f88415n.setVisibility(8);
                    v0.this.D = false;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Integer.valueOf(SteamDirectPurchaseTool.PayType.AliPay.ordinal()));
                    if (com.max.hbcommon.utils.c.x(result2.getBalance_available())) {
                        arrayList.add(Integer.valueOf(SteamDirectPurchaseTool.PayType.SteamBalance.ordinal()));
                    }
                    PaymentSelectionConfig paymentSelectionConfig = new PaymentSelectionConfig(result2.getDesc_desc(), result2.getDesc_title(), result2.getTitle(), result2.getUser_balance(), arrayList, result2.getGame_info(), result2.getSteam_id_info());
                    com.max.hbcommon.analytics.l.f66572a.u(SteamDirectPurchaseTool.f90631c);
                    SteamDirectPurchaseTool.b(paymentSelectionConfig, v0.this.requireActivity().getSupportFragmentManager(), new com.max.xiaoheihe.module.mall.direct_purchace.a.b() { // from class: com.max.xiaoheihe.module.game.w0
                        @Override // com.max.xiaoheihe.module.mall.direct_purchace.a.b
                        public final void a(SteamDirectPurchaseTool.PayType payType) {
                            this.f88527a.c(payType);
                        }
                    });
                    return;
                }
                if ("2".equals(result2.getPrepare_state())) {
                    v0.this.f88415n.setVisibility(8);
                    v0.this.D = false;
                    com.max.hbcommon.analytics.l.f66572a.t(SteamDirectPurchaseTool.f90634f);
                    v0.O4(v0.this, false);
                    return;
                }
                if ("3".equals(result2.getPrepare_state())) {
                    v0.this.D = false;
                    com.max.hbcommon.analytics.l.f66572a.t(SteamDirectPurchaseTool.f90636h);
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, "登录Steam账号", com.max.hbcommon.utils.l.e(R.string.purchase_login_steam_tips), null, new a());
                    return;
                }
                if ("4".equals(result2.getPrepare_state())) {
                    int i10 = this.f88500b;
                    if (i10 <= 10) {
                        v0.F4(v0.this, this.f88501c, this.f88502d, i10 + 1);
                        return;
                    }
                    v0.this.D = false;
                    v0.this.f88415n.setVisibility(8);
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("检测超时请稍后再试");
                    return;
                }
                if ("5".equals(result2.getPrepare_state())) {
                    v0.this.D = false;
                    v0.this.f88415n.setVisibility(8);
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, null, result2.getMsg(), null, null);
                } else if (!"6".equals(result2.getPrepare_state())) {
                    v0.this.D = false;
                    v0.this.f88415n.setVisibility(8);
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, null, "检测异常", null, null);
                } else {
                    com.max.hbcommon.analytics.l.f66572a.u(SteamDirectPurchaseTool.f90638j);
                    v0.this.D = false;
                    v0.this.f88415n.setVisibility(8);
                    SteamDirectPurchaseTool.c(result2, v0.this.requireActivity().getSupportFragmentManager(), new yh.a() { // from class: com.max.xiaoheihe.module.game.x0
                        @Override // yh.a
                        public final Object invoke() {
                            return this.f88531b.d();
                        }
                    });
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34316, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPrepareStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class s extends com.max.hbcommon.network.d<Result<MallSteamOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SteamDirectPurchaseTool.PayType f88505b;

        s(SteamDirectPurchaseTool.PayType payType) {
            this.f88505b = payType;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34320, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                if (v0.this.J != null) {
                    v0.this.J.dismiss();
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(v0.this.getString(R.string.fail));
                v0.R3(v0.this);
            }
        }

        public void onNext(Result<MallSteamOrderObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34321, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                if (v0.this.J != null) {
                    v0.this.J.dismiss();
                }
                MallSteamOrderObj result2 = result.getResult();
                if (result2 == null || TextUtils.isEmpty(result2.getOrder_id())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(v0.this.getString(R.string.fail));
                    v0.R3(v0.this);
                    return;
                }
                v0.this.P = result2.getOrder_id();
                com.max.xiaoheihe.view.l.A(new CoffeeDialogDataObj(v0.this.getString(R.string.dialog_cafe_stp_title), new ArrayList(), "0", null, null, false, null, null));
                if (this.f88505b != SteamDirectPurchaseTool.PayType.AliPay) {
                    v0.this.S = new ArrayList();
                    v0.b5(v0.this, 0, false);
                } else if (v0.this.M) {
                    v0.Y4(v0.this, result2.getOrder_id(), 0);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34322, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSteamOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class t extends com.max.hbcommon.network.d<Result<PayLinkObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f88507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f88508c;

        t(String str, int i10) {
            this.f88507b = str;
            this.f88508c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(String str, int i10) {
            if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 34330, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            v0.Y4(v0.this, str, i10 + 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(String str, int i10) {
            if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 34329, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            v0.Y4(v0.this, str, i10 + 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(Result result, String str) {
            if (PatchProxy.proxy(new Object[]{result, str}, this, changeQuickRedirect, false, 34328, new Class[]{Result.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.l.f66572a.u(SteamDirectPurchaseTool.f90633e);
            com.max.xiaoheihe.view.l.m();
            v0.this.S = null;
            String pay_link = ((PayLinkObj) result.getResult()).getPay_link();
            if (TextUtils.isEmpty(pay_link)) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) v0.this).mContext, str);
            } else {
                try {
                    ((com.max.hbcommon.base.d) v0.this).mContext.startActivity(Intent.parseUri(pay_link, 1));
                } catch (Exception unused) {
                    com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) v0.this).mContext, str);
                }
            }
            v0.b5(v0.this, 0, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34327, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.R3(v0.this);
            com.max.xiaoheihe.view.l.m();
            v0.this.S = null;
            if (TextUtils.isEmpty(((PayLinkObj) result.getResult()).getMsg())) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d(((PayLinkObj) result.getResult()).getMsg());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i10) {
            if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 34326, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            v0.Y4(v0.this, str, i10 + 1);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34323, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                v0.c5(v0.this);
            }
        }

        public void onNext(final Result<PayLinkObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34324, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                if (result.getResult() == null || result.getResult().getState() == null) {
                    Handler handler = v0.this.T;
                    final String str = this.f88507b;
                    final int i10 = this.f88508c;
                    handler.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.c1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f86543b.m(str, i10);
                        }
                    }, 1500L);
                    return;
                }
                String state = result.getResult().getState();
                List<KeyDescObj> notice = result.getResult().getNotice();
                if (notice != null) {
                    v0.this.S = notice;
                    v0 v0Var = v0.this;
                    v0.d5(v0Var, v0Var.S, "1".equals(state));
                }
                if ("0".equals(state)) {
                    Handler handler2 = v0.this.T;
                    final String str2 = this.f88507b;
                    final int i11 = this.f88508c;
                    handler2.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f88573b.g(str2, i11);
                        }
                    }, 1500L);
                    return;
                }
                if (!"1".equals(state)) {
                    v0.this.T.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f86536b.k(result);
                        }
                    }, 1000L);
                    return;
                }
                final String pay_url = result.getResult().getPay_url();
                if (!TextUtils.isEmpty(pay_url)) {
                    v0.this.T.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f85529b.j(result, pay_url);
                        }
                    }, 500L);
                    return;
                }
                Handler handler3 = v0.this.T;
                final String str3 = this.f88507b;
                final int i12 = this.f88508c;
                handler3.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f88583b.h(str3, i12);
                    }
                }, 1500L);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34325, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayLinkObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class u extends com.max.hbcommon.network.d<Result<MallSteamOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f88510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f88511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f88512d;

        u(int i10, String str, int i11) {
            this.f88510b = i10;
            this.f88511c = str;
            this.f88512d = i11;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34331, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                if (v0.this.J != null) {
                    v0.this.J.dismiss();
                }
                v0.this.N.set(false);
            }
        }

        public void onNext(Result<MallSteamOrderObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34332, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                v0.this.N.set(false);
                if (result.getResult() == null || result.getResult().getState() == null) {
                    v0.this.T.removeMessages(1);
                    v0.this.T.sendMessageDelayed(v0.this.T.obtainMessage(1, this.f88510b + 1, 1, this.f88511c), this.f88512d);
                    return;
                }
                String state = result.getResult().getState();
                List<KeyDescObj> notice = result.getResult().getNotice();
                if (notice != null) {
                    v0.this.S = notice;
                    v0 v0Var = v0.this;
                    v0.d5(v0Var, v0Var.S, "1".equals(state));
                }
                if ("0".equals(state)) {
                    v0.this.T.removeMessages(1);
                    v0.this.T.sendMessageDelayed(v0.this.T.obtainMessage(1, this.f88510b + 1, 1, this.f88511c), this.f88512d);
                    return;
                }
                if ("3".equals(state)) {
                    if (v0.this.J != null) {
                        v0.this.J.dismiss();
                    }
                    if (v0.this.S != null) {
                        com.max.xiaoheihe.view.l.m();
                        v0.this.S = null;
                    }
                    v0.k5(v0.this);
                    return;
                }
                if (v0.this.J != null) {
                    v0.this.J.dismiss();
                }
                if (v0.this.S != null) {
                    com.max.xiaoheihe.view.l.m();
                    v0.this.S = null;
                }
                if (TextUtils.isEmpty(result.getResult().getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.d("支付失败");
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.d(result.getResult().getMsg());
                }
                v0.this.P = null;
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34333, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSteamOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34306, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            v0.R3(v0.this);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class w extends com.max.hbcommon.network.d<Result<MallPrepareStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f88515b;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34340, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                v0.Q4(v0.this, false);
            }
        }

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class b implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            b() {
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34341, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                v0.o5(v0.this);
            }
        }

        w(int i10) {
            this.f88515b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34337, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                v0.this.f88415n.setVisibility(8);
                v0.this.D = false;
                v0.R3(v0.this);
            }
        }

        public void onNext(Result<MallPrepareStateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34338, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                MallPrepareStateObj result2 = result.getResult();
                if ("1".equals(result2.getPrepare_state())) {
                    v0.this.D = false;
                    v0.G4(v0.this);
                    return;
                }
                if ("2".equals(result2.getPrepare_state())) {
                    v0.this.f88415n.setVisibility(8);
                    v0.this.D = false;
                    v0.I4(v0.this);
                    return;
                }
                if ("3".equals(result2.getPrepare_state())) {
                    v0.this.D = false;
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, "登录Steam账号", com.max.hbcommon.utils.l.e(R.string.purchase_login_steam_tips), null, new a());
                    return;
                }
                if ("4".equals(result2.getPrepare_state())) {
                    int i10 = this.f88515b;
                    if (i10 <= 10) {
                        v0.Z3(v0.this, i10 + 1);
                        return;
                    }
                    v0.this.D = false;
                    v0.this.f88415n.setVisibility(8);
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f("检测超时请稍后再试");
                    return;
                }
                if (!"5".equals(result2.getPrepare_state())) {
                    v0.this.D = false;
                    v0.this.f88415n.setVisibility(8);
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, null, "检测异常", null, null);
                    return;
                }
                v0.this.D = false;
                v0.this.f88415n.setVisibility(8);
                if (Boolean.valueOf(result2.getExtra() != null).booleanValue()) {
                    com.max.xiaoheihe.module.mall.o.t((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, result2.getExtra());
                } else if (com.max.hbcommon.utils.c.w(result2.getInfos())) {
                    com.max.xiaoheihe.module.mall.o.w((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, null, result2.getMsg(), result2.getFaq(), null);
                } else {
                    com.max.xiaoheihe.module.mall.o.s((BaseActivity) ((com.max.hbcommon.base.d) v0.this).mContext, result2, new b());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34339, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPrepareStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class x extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34342, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                v0.Z3(v0.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34343, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class y extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f88520b;

        /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
        public class a implements yh.a<kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f88522b;

            a(Result result) {
                this.f88522b = result;
            }

            public kotlin.b2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34347, new Class[0], kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                if (!v0.this.isActive()) {
                    return null;
                }
                v0 v0Var = v0.this;
                v0Var.startActivityForResult(SteamRedeemWalletCodeLoginActivity.f2(((com.max.hbcommon.base.d) v0Var).mContext, (SteamWalletJsObj) this.f88522b.getResult()), 3);
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34348, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        y(boolean z10) {
            this.f88520b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34344, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                v0.this.f88415n.setVisibility(8);
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34345, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                v0.this.f88415n.setVisibility(8);
                if (this.f88520b) {
                    com.max.xiaoheihe.accelworld.p.c(((com.max.hbcommon.base.d) v0.this).mContext, result.getResult(), 4);
                } else {
                    MagicUtil.f89378a.c(((com.max.hbcommon.base.d) v0.this).mContext, result.getResult(), new a(result));
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34346, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GameStorePurchaseDialogFragment.java */
    public class z extends com.max.hbcommon.network.d<Result<GamePurchaseParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34334, new Class[]{Throwable.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onError(th2);
                v0.this.f88415n.setVisibility(8);
            }
        }

        public void onNext(Result<GamePurchaseParamsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34335, new Class[]{Result.class}, Void.TYPE).isSupported && v0.this.isActive()) {
                super.onNext(result);
                v0.this.f88415n.setVisibility(8);
                v0.p4(v0.this, result.getResult());
                if (result.getResult() == null || com.max.hbcommon.utils.c.u(result.getResult().getToast_msg())) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.d(result.getResult().getToast_msg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34336, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseParamsObj>) obj);
        }
    }

    private void A5(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34252, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            if (this.D) {
                return;
            } else {
                this.D = true;
            }
        }
        this.f88415n.setVisibility(0);
        long j10 = 0;
        if (i10 > 4) {
            j10 = 2;
        } else if (i10 > 0) {
            j10 = 1;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u8().I5(io.reactivex.schedulers.b.d()).C1(j10, TimeUnit.SECONDS).a4(io.reactivex.android.schedulers.a.c()).J5(new w(i10)));
    }

    private void B5(String str, String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10)}, this, changeQuickRedirect, false, 34239, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported || str == null) {
            return;
        }
        if (i10 == 0) {
            if (this.D) {
                return;
            } else {
                this.D = true;
            }
        }
        this.f88415n.setVisibility(0);
        long j10 = 0;
        if (i10 > 4) {
            j10 = 2;
        } else if (i10 > 0) {
            j10 = 1;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v1(str, str2).I5(io.reactivex.schedulers.b.d()).C1(j10, TimeUnit.SECONDS).a4(io.reactivex.android.schedulers.a.c()).J5(new r(i10, str, str2)));
    }

    private GamePurchaseParamValueObj C5(GamePurchaseParamObj gamePurchaseParamObj) {
        List<GamePurchaseParamValueObj> values;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePurchaseParamObj}, this, changeQuickRedirect, false, 34227, new Class[]{GamePurchaseParamObj.class}, GamePurchaseParamValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePurchaseParamValueObj) patchProxyResultProxy.result;
        }
        if (gamePurchaseParamObj == null || (values = gamePurchaseParamObj.getValues()) == null) {
            return null;
        }
        for (GamePurchaseParamValueObj gamePurchaseParamValueObj : values) {
            if (gamePurchaseParamValueObj.isChecked()) {
                return gamePurchaseParamValueObj;
            }
        }
        return null;
    }

    private void D5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34205, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88415n.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R0(this.f88422u, this.f88423v, this.f88421t, this.A).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new z()));
    }

    @SuppressLint({"AutoDispose"})
    private void E5(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34254, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7(z10 ? "steam_purchase" : "steam_balance").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new y(z10)));
    }

    static /* synthetic */ void F4(v0 v0Var, String str, String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{v0Var, str, str2, new Integer(i10)}, null, changeQuickRedirect, true, 34277, new Class[]{v0.class, String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.B5(str, str2, i10);
    }

    private String F5(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 34207, new Class[]{String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.B == null) {
            return null;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        if (com.max.xiaoheihe.module.mall.o.g(str)) {
            mallRegisterOrderObj.setSource("game");
            mallRegisterOrderObj.setSteam_id(com.max.xiaoheihe.utils.i0.m());
            mallRegisterOrderObj.setGame_price(H5().getPrice().getCost_rmb());
        }
        mallRegisterOrderObj.setSession(com.max.hbutils.utils.n.r(this.B.getSession()));
        mallRegisterOrderObj.setParams(new ArrayList());
        MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
        mallOrderParamObj.setCount(this.H);
        mallOrderParamObj.setCat_value(com.max.hbutils.utils.n.r(str));
        mallOrderParamObj.setBuy_type(str2);
        mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(str3));
        mallRegisterOrderObj.getParams().add(mallOrderParamObj);
        return com.max.hbutils.utils.k.p(mallRegisterOrderObj);
    }

    static /* synthetic */ void G4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34278, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.W5();
    }

    private String G5(String str, String str2, String str3, String str4, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34229, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.B == null) {
            return null;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        if ("market_balance".equalsIgnoreCase(str2) || com.max.xiaoheihe.module.mall.o.g(str3)) {
            mallRegisterOrderObj.setSource("game");
            mallRegisterOrderObj.setSteam_id(com.max.xiaoheihe.utils.i0.m());
            mallRegisterOrderObj.setGame_price(H5().getPrice().getCost_rmb());
        }
        mallRegisterOrderObj.setPackage_id(str);
        mallRegisterOrderObj.setBuy_type(str2);
        mallRegisterOrderObj.setSession(com.max.hbutils.utils.n.r(this.B.getSession()));
        mallRegisterOrderObj.setParams(new ArrayList());
        MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
        mallOrderParamObj.setCount(1);
        mallOrderParamObj.setCat_value(com.max.hbutils.utils.n.r(str3));
        mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(str4));
        mallRegisterOrderObj.getParams().add(mallOrderParamObj);
        mallRegisterOrderObj.setAppid(this.f88422u);
        if (z10) {
            mallRegisterOrderObj.setSale_state("2");
        }
        return com.max.hbutils.utils.k.p(mallRegisterOrderObj);
    }

    static /* synthetic */ void H4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34279, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.v6();
    }

    private GamePurchaseParamValueObj H5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34231, new Class[0], GamePurchaseParamValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePurchaseParamValueObj) patchProxyResultProxy.result;
        }
        GamePurchaseParamValueObj gamePurchaseParamValueObjI5 = I5();
        if (gamePurchaseParamValueObjI5 != null) {
            return C5(gamePurchaseParamValueObjI5.getBuy_type());
        }
        return null;
    }

    static /* synthetic */ void I4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34280, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.j6();
    }

    private GamePurchaseParamValueObj I5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34230, new Class[0], GamePurchaseParamValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePurchaseParamValueObj) patchProxyResultProxy.result;
        }
        GamePurchaseParamsObj gamePurchaseParamsObj = this.B;
        if (gamePurchaseParamsObj == null || gamePurchaseParamsObj.getParams() == null) {
            return null;
        }
        return C5(this.B.getParams());
    }

    private HashMap<String, String> J5() {
        GamePurchaseParamValueObj gamePurchaseParamValueObjC5;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34228, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>(16);
        GamePurchaseParamsObj gamePurchaseParamsObj = this.B;
        if (gamePurchaseParamsObj != null && gamePurchaseParamsObj.getParams() != null && (gamePurchaseParamValueObjC5 = C5(this.B.getParams())) != null) {
            map.put(this.B.getParams().getKey(), gamePurchaseParamValueObjC5.getKey());
            GamePurchaseParamValueObj gamePurchaseParamValueObjC6 = C5(gamePurchaseParamValueObjC5.getBuy_type());
            if (gamePurchaseParamValueObjC6 != null) {
                map.put(gamePurchaseParamValueObjC5.getBuy_type().getKey(), gamePurchaseParamValueObjC6.getKey());
            }
        }
        if (!com.max.hbcommon.utils.c.u(this.f88421t)) {
            map.put("h_src", this.f88421t);
        }
        return map;
    }

    private boolean K5(GamePurchaseParamObj gamePurchaseParamObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePurchaseParamObj}, this, changeQuickRedirect, false, 34217, new Class[]{GamePurchaseParamObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (gamePurchaseParamObj == null || gamePurchaseParamObj.getValues() == null) {
            return false;
        }
        int size = gamePurchaseParamObj.getValues().size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            GamePurchaseParamValueObj gamePurchaseParamValueObj = gamePurchaseParamObj.getValues().get(i10);
            if ("1".equals(gamePurchaseParamValueObj.getEnable())) {
                if (z10 || com.max.hbcommon.utils.c.u(this.f88426y) || !this.f88426y.equals(gamePurchaseParamValueObj.getKey())) {
                    gamePurchaseParamValueObj.setChecked(false);
                } else {
                    gamePurchaseParamValueObj.setChecked(true);
                    z10 = true;
                }
                if (gamePurchaseParamValueObj.getBuy_type() != null && gamePurchaseParamValueObj.getBuy_type().getValues() != null) {
                    int size2 = gamePurchaseParamValueObj.getBuy_type().getValues().size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        GamePurchaseParamValueObj gamePurchaseParamValueObj2 = gamePurchaseParamValueObj.getBuy_type().getValues().get(i11);
                        if (!"1".equals(gamePurchaseParamValueObj2.getEnable())) {
                            gamePurchaseParamValueObj2.setChecked(false);
                        } else if (z11 || com.max.hbcommon.utils.c.u(this.f88425x) || !this.f88425x.equals(gamePurchaseParamValueObj2.getKey())) {
                            gamePurchaseParamValueObj2.setChecked(false);
                        } else {
                            gamePurchaseParamValueObj2.setChecked(true);
                            z11 = true;
                        }
                    }
                }
            } else {
                gamePurchaseParamValueObj.setChecked(false);
            }
        }
        return z10 && z11;
    }

    static /* synthetic */ void L4(v0 v0Var, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{v0Var, gVar}, null, changeQuickRedirect, true, 34264, new Class[]{v0.class, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.n6(gVar);
    }

    private void L5(GamePurchaseParamObj gamePurchaseParamObj) {
        if (PatchProxy.proxy(new Object[]{gamePurchaseParamObj}, this, changeQuickRedirect, false, 34214, new Class[]{GamePurchaseParamObj.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zN5 = N5(gamePurchaseParamObj);
        if (!zN5) {
            zN5 = K5(gamePurchaseParamObj);
        }
        if (!zN5) {
            M5(gamePurchaseParamObj);
        }
        z5(gamePurchaseParamObj);
    }

    private boolean M5(GamePurchaseParamObj gamePurchaseParamObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePurchaseParamObj}, this, changeQuickRedirect, false, 34216, new Class[]{GamePurchaseParamObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (gamePurchaseParamObj == null || gamePurchaseParamObj.getValues() == null) {
            return false;
        }
        int size = gamePurchaseParamObj.getValues().size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            GamePurchaseParamValueObj gamePurchaseParamValueObj = gamePurchaseParamObj.getValues().get(i10);
            if ("1".equals(gamePurchaseParamValueObj.getEnable())) {
                if (z10 || !"1".equals(gamePurchaseParamValueObj.getSelected())) {
                    gamePurchaseParamValueObj.setChecked(false);
                } else {
                    gamePurchaseParamValueObj.setChecked(true);
                    z10 = true;
                }
                if (gamePurchaseParamValueObj.getBuy_type() != null && gamePurchaseParamValueObj.getBuy_type().getValues() != null) {
                    int size2 = gamePurchaseParamValueObj.getBuy_type().getValues().size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        GamePurchaseParamValueObj gamePurchaseParamValueObj2 = gamePurchaseParamValueObj.getBuy_type().getValues().get(i11);
                        if (!"1".equals(gamePurchaseParamValueObj2.getEnable())) {
                            gamePurchaseParamValueObj2.setChecked(false);
                        } else if (z11 || !"1".equals(gamePurchaseParamValueObj2.getSelected())) {
                            gamePurchaseParamValueObj2.setChecked(false);
                        } else {
                            gamePurchaseParamValueObj2.setChecked(true);
                            z11 = true;
                        }
                    }
                }
            } else {
                gamePurchaseParamValueObj.setChecked(false);
            }
        }
        return z10 && z11;
    }

    private boolean N5(GamePurchaseParamObj gamePurchaseParamObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gamePurchaseParamObj}, this, changeQuickRedirect, false, 34218, new Class[]{GamePurchaseParamObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(this.A) || gamePurchaseParamObj == null || gamePurchaseParamObj.getValues() == null) {
            return false;
        }
        int size = gamePurchaseParamObj.getValues().size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            GamePurchaseParamValueObj gamePurchaseParamValueObj = gamePurchaseParamObj.getValues().get(i10);
            if (!"1".equals(gamePurchaseParamValueObj.getEnable())) {
                gamePurchaseParamValueObj.setChecked(false);
            } else if (gamePurchaseParamValueObj.getBuy_type() != null && gamePurchaseParamValueObj.getBuy_type().getValues() != null) {
                int size2 = gamePurchaseParamValueObj.getBuy_type().getValues().size();
                for (int i11 = 0; i11 < size2; i11++) {
                    GamePurchaseParamValueObj gamePurchaseParamValueObj2 = gamePurchaseParamValueObj.getBuy_type().getValues().get(i11);
                    if (!"1".equals(gamePurchaseParamValueObj2.getEnable())) {
                        gamePurchaseParamValueObj2.setChecked(false);
                    } else if (z11 || !this.A.equals(gamePurchaseParamValueObj2.getSku_id())) {
                        gamePurchaseParamValueObj2.setChecked(false);
                    } else {
                        gamePurchaseParamValueObj2.setChecked(true);
                        z11 = true;
                    }
                }
                if (!z11 || z10) {
                    gamePurchaseParamValueObj.setChecked(false);
                } else {
                    gamePurchaseParamValueObj.setChecked(true);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    static /* synthetic */ void O4(v0 v0Var, boolean z10) {
        if (PatchProxy.proxy(new Object[]{v0Var, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34281, new Class[]{v0.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.k6(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34260, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        dismiss();
        com.max.xiaoheihe.view.l.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34259, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.a0(this.mContext, this.P).A();
        this.P = null;
    }

    static /* synthetic */ void Q3(v0 v0Var, int i10, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{v0Var, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str}, null, changeQuickRedirect, true, 34261, new Class[]{v0.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.U5(i10, z10, str);
    }

    static /* synthetic */ void Q4(v0 v0Var, boolean z10) {
        if (PatchProxy.proxy(new Object[]{v0Var, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34282, new Class[]{v0.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.E5(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q5(View view) {
        this.P = null;
    }

    static /* synthetic */ void R3(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34262, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R5(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34258, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
        this.T.removeMessages(1);
        Handler handler = this.T;
        handler.sendMessage(handler.obtainMessage(1, 28, 0, "1"));
    }

    static /* synthetic */ void S3(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34265, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.V5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S5(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34257, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
        this.P = null;
    }

    static /* synthetic */ void T4(v0 v0Var, SteamDirectPurchaseTool.PayType payType, String str) {
        if (PatchProxy.proxy(new Object[]{v0Var, payType, str}, null, changeQuickRedirect, true, 34283, new Class[]{v0.class, SteamDirectPurchaseTool.PayType.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.s6(payType, str);
    }

    private void T5(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34248, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        U5(i10, z10, "0");
    }

    static /* synthetic */ void U4(v0 v0Var, SteamDirectPurchaseTool.PayType payType) {
        if (PatchProxy.proxy(new Object[]{v0Var, payType}, null, changeQuickRedirect, true, 34284, new Class[]{v0.class, SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.r6(payType);
    }

    private void U5(int i10, boolean z10, String str) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 34249, new Class[]{Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE).isSupported || this.N.get()) {
            return;
        }
        int i11 = z10 ? 2000 : 1000;
        if (i10 >= 30 || this.P == null) {
            ProgressDialog progressDialog = this.J;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            List<KeyDescObj> list = this.S;
            if (list != null) {
                m6(list);
            } else {
                com.max.xiaoheihe.view.l.m();
            }
            p6();
            return;
        }
        this.N.set(true);
        if (this.S == null) {
            this.J.setMessage("正在检测订单状态...");
            if (!this.J.isShowing() && !z10) {
                this.J.show();
            }
        }
        if (this.O == null) {
            this.O = new io.reactivex.disposables.a();
        }
        this.O.c((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().A1(this.P, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new u(i10, str, i11)));
    }

    private void V5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GamePurchaseParamValueObj gamePurchaseParamValueObjI5 = I5();
        GamePurchaseParamValueObj gamePurchaseParamValueObjH5 = H5();
        String key = gamePurchaseParamValueObjI5 != null ? gamePurchaseParamValueObjI5.getKey() : null;
        String key2 = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getKey() : null;
        String cat_value = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getCat_value() : null;
        String sku_id = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getSku_id() : null;
        boolean z10 = gamePurchaseParamValueObjH5 != null && "2".equals(gamePurchaseParamValueObjH5.getSale_state());
        com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, mallRegisterOrder, mAppId = " + this.f88422u + ", skuId = " + sku_id + ", mSelectSkuId = " + this.f88427z);
        this.f88415n.setVisibility(0);
        boolean zX = com.max.hbcommon.utils.c.x(gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getCart_enable() : null);
        addDisposable((io.reactivex.disposables.b) (!zX ? com.max.xiaoheihe.network.i.a().Nb(G5(key, key2, cat_value, sku_id, z10), this.f88421t) : com.max.xiaoheihe.network.i.a().v8(F5(cat_value, key2, sku_id), this.f88421t)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c0(zX, sku_id)));
    }

    private void W5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34208, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.B.getCoupon_info() == null || this.B.getCoupon_info().getParams() == null) {
            V5();
        } else {
            com.max.xiaoheihe.module.mall.o.b(com.max.xiaoheihe.utils.d.n(this.B.getCoupon_info().getParams()), new b0());
        }
    }

    public static v0 X5(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7}, null, changeQuickRedirect, true, 34200, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, v0.class);
        if (patchProxyResultProxy.isSupported) {
            return (v0) patchProxyResultProxy.result;
        }
        v0 v0Var = new v0();
        Bundle bundle = new Bundle();
        bundle.putString("h_src", str);
        bundle.putString("app_id", str2);
        bundle.putString("platf", str3);
        bundle.putString("cart_id", str4);
        bundle.putString("buy_type", str5);
        bundle.putString("package_id", str6);
        bundle.putString("sku_id", str7);
        v0Var.setArguments(bundle);
        return v0Var;
    }

    static /* synthetic */ GamePurchaseParamValueObj Y3(v0 v0Var) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34266, new Class[]{v0.class}, GamePurchaseParamValueObj.class);
        return patchProxyResultProxy.isSupported ? (GamePurchaseParamValueObj) patchProxyResultProxy.result : v0Var.H5();
    }

    static /* synthetic */ void Y4(v0 v0Var, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{v0Var, str, new Integer(i10)}, null, changeQuickRedirect, true, 34285, new Class[]{v0.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.i6(str, i10);
    }

    private void Y5(GamePurchaseParamsObj gamePurchaseParamsObj) {
        if (PatchProxy.proxy(new Object[]{gamePurchaseParamsObj}, this, changeQuickRedirect, false, 34211, new Class[]{GamePurchaseParamsObj.class}, Void.TYPE).isSupported || gamePurchaseParamsObj == null) {
            return;
        }
        this.B = gamePurchaseParamsObj;
        MallCartUtils.f90196a.D(com.max.hbutils.utils.n.q(gamePurchaseParamsObj.getCart_count()));
        if (this.B.isIs_steam() && "1".equals(com.max.hbcache.c.o("show_steamcards_purchase", "0"))) {
            z6(this.B.getSteam_card_discount());
        }
        com.max.hbimage.b.L(this.B.getGame_img(), this.f88403b, R.drawable.common_default_placeholder_375x210);
        this.f88414m.removeAllViews();
        GamePurchaseParamObj params = gamePurchaseParamsObj.getParams();
        L5(params);
        if (params != null) {
            f6(params, 0);
            f6(C5(params).getBuy_type(), 1);
        }
        w5();
        e6();
        d6();
        b6();
        c6();
        this.f88404c.postDelayed(new e0(), 100L);
    }

    static /* synthetic */ void Z3(v0 v0Var, int i10) {
        if (PatchProxy.proxy(new Object[]{v0Var, new Integer(i10)}, null, changeQuickRedirect, true, 34267, new Class[]{v0.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.A5(i10);
    }

    private void Z5(String str, boolean z10, String str2, boolean z11, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, new Byte(z10 ? (byte) 1 : (byte) 0), str2, new Byte(z11 ? (byte) 1 : (byte) 0), str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34224, new Class[]{String.class, cls, String.class, cls, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        h6();
        com.max.xiaoheihe.module.mall.o.c(this.mContext, new l(z10, str, str2, str6, str4, z11, str3));
    }

    private void a6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34253, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l0().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new x()));
    }

    static /* synthetic */ void b5(v0 v0Var, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{v0Var, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34286, new Class[]{v0.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.T5(i10, z10);
    }

    private void b6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34221, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.H = 1;
        if (this.I != null) {
            GamePurchaseParamValueObj gamePurchaseParamValueObjH5 = H5();
            boolean zX = com.max.hbcommon.utils.c.x(gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getBulk_count_enable() : null);
            if (this.f88424w != null || !zX) {
                this.I.setVisibility(8);
            } else {
                this.I.setVisibility(0);
                ((TextView) this.I.findViewById(R.id.tv_cnt)).setText(String.valueOf(this.H));
            }
        }
    }

    static /* synthetic */ void c5(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34287, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.l6();
    }

    private void c6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34222, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GamePurchaseParamValueObj gamePurchaseParamValueObjI5 = I5();
        GamePurchaseParamValueObj gamePurchaseParamValueObjH5 = H5();
        String key = gamePurchaseParamValueObjI5 != null ? gamePurchaseParamValueObjI5.getKey() : null;
        String key2 = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getKey() : null;
        String type = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getType() : null;
        String cat_value = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getCat_value() : null;
        String spu_id = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getSpu_id() : null;
        String sku_id = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getSku_id() : null;
        boolean zEquals = GamePurchaseParamsObj.PRODUCT_TYPE_PRESELL.equals(type);
        if (gamePurchaseParamValueObjI5 != null) {
            gamePurchaseParamValueObjI5.isBalance_enable();
        }
        boolean z10 = (com.max.hbcommon.utils.c.u(key) || com.max.hbcommon.utils.c.u(key2)) ? false : true;
        if (this.B.isIs_steam()) {
            com.max.hbcommon.utils.c.u(key);
        }
        boolean zEquals2 = "mall".equals(gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getApi_type() : null);
        boolean z11 = gamePurchaseParamValueObjH5 != null && "2".equals(gamePurchaseParamValueObjH5.getSale_state());
        boolean zX = com.max.hbcommon.utils.c.x(gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getCart_enable() : null);
        String cost_coin = gamePurchaseParamValueObjH5 != null ? gamePurchaseParamValueObjH5.getPrice().getCost_coin() : null;
        this.f88419r.setShowLeftButton(false);
        this.f88419r.setShowRightButton(false);
        this.E = false;
        this.F = false;
        if (this.f88424w != null) {
            x5("确定", zX ? BaseBottomButton.BaseBottomButtonStyle.BlackWhite : BaseBottomButton.BaseBottomButtonStyle.GrayWhite, zX, new j(sku_id, cat_value, key2));
            return;
        }
        if (gamePurchaseParamValueObjH5 != null && "1".equals(gamePurchaseParamValueObjH5.getEnable())) {
            View view = this.f88420s;
            if (view == null) {
                View viewH = MallCartUtils.f90196a.h(this.mContext);
                this.f88420s = viewH;
                this.f88419r.b(viewH);
            } else {
                MallCartUtils.f90196a.m(this.mContext, view, false);
            }
            if (zX) {
                x5("加入购物车", BaseBottomButton.BaseBottomButtonStyle.GrayBlack, true, new e(sku_id, cat_value, key2));
            }
            x5(getString(this.B.getCoupon_info() != null && this.B.getCoupon_info().getParams() != null ? R.string.buy_with_coupon : R.string.buy_now), BaseBottomButton.BaseBottomButtonStyle.BlackWhite, z10, new f(key2, zEquals2, cat_value, zEquals, type, key, spu_id, cost_coin));
            return;
        }
        if (gamePurchaseParamValueObjH5 != null && "1".equals(gamePurchaseParamValueObjH5.getEnable_notify())) {
            x5("预约补货提醒", BaseBottomButton.BaseBottomButtonStyle.GrayBlack, true, new g(sku_id));
        } else if (gamePurchaseParamValueObjH5 == null || !"2".equals(gamePurchaseParamValueObjH5.getEnable_notify())) {
            x5("暂时缺货", BaseBottomButton.BaseBottomButtonStyle.BlackWhite, false, null);
        } else {
            x5("已预约提醒", BaseBottomButton.BaseBottomButtonStyle.WhiteGray, true, new h(sku_id));
        }
        if (z11) {
            x5(getString(R.string.pre_purchase), BaseBottomButton.BaseBottomButtonStyle.BlackWhite, z10, new i(key2, zEquals2, cat_value, zEquals, type, key, spu_id, cost_coin));
        }
    }

    static /* synthetic */ void d5(v0 v0Var, List list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{v0Var, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34288, new Class[]{v0.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.w6(list, z10);
    }

    private void d6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34213, new Class[0], Void.TYPE).isSupported || this.f88416o == null) {
            return;
        }
        GamePurchaseParamsObj gamePurchaseParamsObj = this.B;
        if (gamePurchaseParamsObj == null || gamePurchaseParamsObj.getCoupon_info() == null || com.max.hbutils.utils.n.q(this.B.getCoupon_info().getAvailable_coupon_num()) <= 0) {
            this.f88416o.setVisibility(8);
            return;
        }
        this.f88416o.setVisibility(0);
        MallCouponGuideObj coupon_info = this.B.getCoupon_info();
        this.f88417p.setText(coupon_info.getTitle());
        this.f88418q.setText(coupon_info.getSub_title());
        this.f88416o.setOnClickListener(new b(coupon_info));
        this.G = coupon_info.getPrimary_id();
    }

    private void dismiss() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34235, new Class[0], Void.TYPE).isSupported && (getParentFragment() instanceof com.max.hbcommon.base.c)) {
            ((com.max.hbcommon.base.c) getParentFragment()).dismiss();
        }
    }

    private void e6() {
        List<GamePurchaseParamValueObj> values;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34220, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GamePurchaseParamValueObj gamePurchaseParamValueObjI5 = I5();
        GamePurchaseParamValueObj gamePurchaseParamValueObjH5 = H5();
        if (gamePurchaseParamValueObjH5 == null && gamePurchaseParamValueObjI5 != null && gamePurchaseParamValueObjI5.getBuy_type() != null && (values = gamePurchaseParamValueObjI5.getBuy_type().getValues()) != null && values.size() > 0) {
            gamePurchaseParamValueObjH5 = values.get(0);
        }
        if (gamePurchaseParamValueObjI5 == null || gamePurchaseParamValueObjH5 == null) {
            return;
        }
        MallPriceObj price = gamePurchaseParamValueObjH5.getPrice();
        if (price != null) {
            this.f88407f.setVisibility(0);
            this.f88408g.setVisibility(0);
            this.f88409h.setVisibility(8);
            r1.k1(this.f88406e, price.getCost_rmb(), price.getInitial_price(), GamePurchaseParamsObj.PRODUCT_TYPE_PRESELL.equals(gamePurchaseParamValueObjH5.getType()) ? getString(R.string.pre_order) : null);
            bb.d.d(this.f88408g, 2);
            if ("heybox".equals(price.getType())) {
                this.f88407f.setVisibility(0);
                this.f88408g.setText(price.getCost_rmb());
                this.f88409h.setText(String.format(getString(R.string.coin_divider_format), price.getCost_coin()));
            } else if (MallPriceObj.TYPE_ORIGINAL.equals(price.getType())) {
                this.f88407f.setVisibility(8);
                this.f88408g.setText(price.getValue());
                this.f88409h.setText(price.getDesc());
            }
            if (com.max.hbcommon.utils.c.u(price.getCurrent_price())) {
                this.f88410i.setVisibility(8);
            } else {
                this.f88410i.setVisibility(0);
                String strJ = r1.J(price.getCurrent_price());
                SpannableString spannableString = new SpannableString(String.format(getString(this.B.isIs_steam() ? R.string.steam_reference_price_format : R.string.reference_price_format), strJ));
                spannableString.setSpan(new StrikethroughSpan(), (spannableString.length() - strJ.length()) - 1, spannableString.length(), 33);
                this.f88410i.setText(spannableString);
            }
        } else {
            this.f88406e.setVisibility(8);
            this.f88407f.setVisibility(8);
            this.f88408g.setVisibility(8);
            this.f88409h.setVisibility(8);
            this.f88410i.setVisibility(8);
        }
        this.f88411j.setText(com.max.hbcommon.utils.c.u(gamePurchaseParamValueObjH5.getInventory()) ? null : String.format(getString(R.string.remain_num_format), gamePurchaseParamValueObjH5.getInventory()));
        if (com.max.hbcommon.utils.c.u(gamePurchaseParamValueObjH5.getDesc())) {
            this.f88413l.setVisibility(8);
        } else {
            this.f88413l.setVisibility(0);
            this.f88412k.setText(gamePurchaseParamValueObjH5.getDesc());
        }
        if (com.max.hbcommon.utils.c.u(gamePurchaseParamValueObjI5.getHead_img())) {
            com.max.hbimage.b.L(this.B.getGame_img(), this.f88403b, R.drawable.common_default_placeholder_375x210);
        } else {
            com.max.hbimage.b.L(gamePurchaseParamValueObjI5.getHead_img(), this.f88403b, R.drawable.common_default_placeholder_375x210);
        }
    }

    private void f6(GamePurchaseParamObj gamePurchaseParamObj, int i10) {
        ViewGroup viewGroup;
        boolean z10;
        byte b10;
        int iS;
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[]{gamePurchaseParamObj, new Integer(i10)}, this, changeQuickRedirect, false, 34219, new Class[]{GamePurchaseParamObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        if (gamePurchaseParamObj.getValues() == null || gamePurchaseParamObj.getValues().size() <= 0 || context == null) {
            return;
        }
        if (this.f88414m.getChildCount() > i10) {
            this.f88414m.removeViewAt(i10);
        }
        ViewGroup viewGroup2 = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.item_purchase_param, (ViewGroup) this.f88414m, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.tv_option);
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.tv_faq);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (this.f88414m.getChildCount() == 0) {
            layoutParams.setMargins(0, 0, 0, 0);
        } else {
            layoutParams.setMargins(0, ViewUtils.f(context, 20.0f), 0, 0);
        }
        viewGroup2.setLayoutParams(layoutParams);
        textView.setText(gamePurchaseParamObj.getTitle());
        if (i10 == 0) {
            textView2.setVisibility(0);
            textView2.setOnClickListener(new c());
        } else {
            textView2.setVisibility(8);
        }
        int size = gamePurchaseParamObj.getValues().size();
        com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, optionCount = " + size);
        int iL = ViewUtils.L(context) - ViewUtils.f(context, 24.0f);
        int iF = ViewUtils.f(context, 12.0f);
        int iF2 = ViewUtils.f(context, 8.0f);
        int iF3 = ViewUtils.f(context, 3.0f);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(iF, iF2, iF, 0);
        linearLayout2.setLayoutParams(layoutParams2);
        viewGroup2.addView(linearLayout2);
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            GamePurchaseParamValueObj gamePurchaseParamValueObj = gamePurchaseParamObj.getValues().get(i11);
            String value = gamePurchaseParamValueObj.getValue();
            com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, gamePurchaseParamValueObj text = " + value + ", checked = " + gamePurchaseParamValueObj.isChecked());
            int i13 = size;
            LinearLayout linearLayout3 = linearLayout2;
            View viewInflate = this.mInflater.inflate(R.layout.item_purchase_option, (ViewGroup) null, false);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_out_of_stock);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_text);
            ViewGroup viewGroup3 = viewGroup2;
            if (gamePurchaseParamValueObj.getEnable_notify() == null || "0".equals(gamePurchaseParamValueObj.getEnable_notify())) {
                textView3.setVisibility(4);
            } else {
                textView3.setVisibility(0);
            }
            textView4.setTag(gamePurchaseParamValueObj);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            if (i11 == 0) {
                layoutParams3.setMargins(0, 0, 0, 0);
            } else {
                layoutParams3.setMargins(iF3, 0, 0, 0);
            }
            viewInflate.setLayoutParams(layoutParams3);
            int iF4 = ViewUtils.f(context, 12.0f);
            int iF5 = ViewUtils.f(context, 7.0f);
            int i14 = iF3;
            int iF6 = ViewUtils.f(context, 5.0f);
            textView4.setPadding(iF4, iF5, iF4, iF5);
            textView4.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView4.setIncludeFontPadding(false);
            textView4.setLineSpacing(ViewUtils.f(context, 2.0f), 1.0f);
            textView4.setText(value);
            if ("1".equals(gamePurchaseParamValueObj.getEnable()) || !(gamePurchaseParamValueObj.getEnable_notify() == null || "0".equals(gamePurchaseParamValueObj.getEnable_notify()))) {
                textView4.setOnClickListener(new d(gamePurchaseParamValueObj, i10, gamePurchaseParamObj));
            } else {
                textView4.setClickable(false);
            }
            float f10 = iF4 * 2;
            float f11 = iF6;
            int iS2 = (int) (((double) (ViewUtils.S(textView4.getPaint(), value) + f10 + f11)) + 0.5d);
            if (i11 != 0) {
                iS2 += iF2;
            }
            int i15 = i12 + iS2;
            if (i15 >= iL) {
                linearLayout = new LinearLayout(context);
                z10 = false;
                linearLayout.setOrientation(0);
                b10 = -1;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(iF, iF2, iF, 0);
                linearLayout.setLayoutParams(layoutParams4);
                viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(viewInflate);
                viewGroup = viewGroup3;
                viewGroup.addView(linearLayout);
                iS = (int) (((double) (ViewUtils.S(textView4.getPaint(), value) + f10 + f11)) + 0.5d);
            } else {
                viewGroup = viewGroup3;
                z10 = false;
                b10 = -1;
                linearLayout3.addView(viewInflate);
                iS = i15;
                linearLayout = linearLayout3;
            }
            i11++;
            size = i13;
            linearLayout2 = linearLayout;
            viewGroup2 = viewGroup;
            iF3 = i14;
            i12 = iS;
            context = context;
        }
        this.f88414m.addView(viewGroup2, i10);
        y6();
    }

    private void g6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34206, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, registerOrder, mAppId = " + this.f88422u + ", mSelectSkuId = " + this.f88427z);
        this.f88415n.setVisibility(0);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V0(this.f88422u, this.B.getSession(), J5()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a0()));
    }

    static /* synthetic */ int h4(v0 v0Var) {
        int i10 = v0Var.H;
        v0Var.H = i10 + 1;
        return i10;
    }

    private void h6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34256, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("sku_id", this.f88427z);
        jsonObject.addProperty("app_id", this.f88422u);
        jsonObject.addProperty("h_src", this.f88421t);
        com.max.hbcommon.analytics.d.d("4", lb.d.f131193k2, null, jsonObject);
    }

    static /* synthetic */ int i4(v0 v0Var) {
        int i10 = v0Var.H;
        v0Var.H = i10 - 1;
        return i10;
    }

    private void i6(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 34247, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 20) {
            addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Y1(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t(str, i10)));
        } else {
            m6(this.S);
        }
    }

    private void j6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34232, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k6(true);
    }

    static /* synthetic */ void k5(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34289, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.o6();
    }

    private void k6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34233, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (!isActive() || activity == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y(getString(R.string.bind_steam_tips_title)).l(getString(R.string.bind_steam_tips_message)).u(getString(R.string.confirm), new n(z10, activity)).o(getString(R.string.cancel), new m()).F();
    }

    private void l6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        m6(null);
    }

    static /* synthetic */ GamePurchaseParamValueObj m4(v0 v0Var, GamePurchaseParamObj gamePurchaseParamObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v0Var, gamePurchaseParamObj}, null, changeQuickRedirect, true, 34268, new Class[]{v0.class, GamePurchaseParamObj.class}, GamePurchaseParamValueObj.class);
        return patchProxyResultProxy.isSupported ? (GamePurchaseParamValueObj) patchProxyResultProxy.result : v0Var.C5(gamePurchaseParamObj);
    }

    private void m6(List<KeyDescObj> list) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 34245, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i11 = 0;
            for (KeyDescObj keyDescObj : list) {
                arrayList.add(new CoffeeDialogProgressObj(keyDescObj.getKey(), String.valueOf(com.max.hbutils.utils.n.q(keyDescObj.getValue()) + 1), null));
                if ("0".equals(keyDescObj.getValue())) {
                    i10 = i11;
                }
                i11++;
            }
            if (i10 < arrayList.size()) {
                ((CoffeeDialogProgressObj) arrayList.get(i10)).setState("3");
            }
        }
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj(getString(R.string.dialog_cafe_stp_title), arrayList, "0", null, null, false, null, null));
        this.S = null;
        this.T.postDelayed(new Runnable() { // from class: com.max.xiaoheihe.module.game.q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88208b.O5();
            }
        }, 1000L);
    }

    private void n6(com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 34234, new Class[]{com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (!isActive() || activity == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(activity).y(getString(R.string.fail)).l(getString(R.string.has_not_finish_order)).u(getString(R.string.to_handle), new p(gVar)).o(getString(R.string.cancel), new o()).F();
    }

    static /* synthetic */ void o4(v0 v0Var, GamePurchaseParamObj gamePurchaseParamObj, GamePurchaseParamValueObj gamePurchaseParamValueObj) {
        if (PatchProxy.proxy(new Object[]{v0Var, gamePurchaseParamObj, gamePurchaseParamValueObj}, null, changeQuickRedirect, true, 34269, new Class[]{v0.class, GamePurchaseParamObj.class, GamePurchaseParamValueObj.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.x6(gamePurchaseParamObj, gamePurchaseParamValueObj);
    }

    static /* synthetic */ void o5(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34290, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.a6();
    }

    private void o6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34250, new Class[0], Void.TYPE).isSupported && this.M) {
            try {
                new com.max.hbcommon.component.bottomsheet.a().z("游戏购买成功").h(R.drawable.bottom_sheets_key_correct_green_28x28).n(R.drawable.bottom_sheets_broken_steam_80x80).k(true).x(false).l(new SpannableString("请前往Steam游戏库查看，后续订单问题请联系Steam客服")).v("查看订单", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.r0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88211b.P5(view);
                    }
                }).p("确认", true, new View.OnClickListener() { // from class: com.max.xiaoheihe.module.game.s0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f88334b.Q5(view);
                    }
                }).a().M3(requireActivity().getSupportFragmentManager(), "purchase_success_bottom_sheets");
            } catch (IllegalStateException e10) {
                com.max.heybox.hblog.g.F(e10);
            }
        }
    }

    static /* synthetic */ void p4(v0 v0Var, GamePurchaseParamsObj gamePurchaseParamsObj) {
        if (PatchProxy.proxy(new Object[]{v0Var, gamePurchaseParamsObj}, null, changeQuickRedirect, true, 34263, new Class[]{v0.class, GamePurchaseParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.Y5(gamePurchaseParamsObj);
    }

    private void p6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34251, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.K;
        if ((aVar == null || !aVar.isShowing()) && this.M) {
            this.K = new com.max.hbcommon.view.a.f(this.mContext).l("您是否已经完成了支付").u("已支付", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.game.t0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f88336b.R5(dialogInterface, i10);
                }
            }).o("未支付", new DialogInterface.OnClickListener() { // from class: com.max.xiaoheihe.module.game.u0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f88397b.S5(dialogInterface, i10);
                }
            }).F();
        }
    }

    static /* synthetic */ void q4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34270, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.y6();
    }

    private void q6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34243, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CoffeeDialogProgressObj(getString(R.string.order_generate), "2", null));
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj(getString(R.string.dialog_cafe_stp_title), arrayList, "0", null, null, false, null, null));
    }

    static /* synthetic */ void r4(v0 v0Var, GamePurchaseParamObj gamePurchaseParamObj, int i10) {
        if (PatchProxy.proxy(new Object[]{v0Var, gamePurchaseParamObj, new Integer(i10)}, null, changeQuickRedirect, true, 34271, new Class[]{v0.class, GamePurchaseParamObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.f6(gamePurchaseParamObj, i10);
    }

    private void r6(SteamDirectPurchaseTool.PayType payType) {
        if (PatchProxy.proxy(new Object[]{payType}, this, changeQuickRedirect, false, 34241, new Class[]{SteamDirectPurchaseTool.PayType.class}, Void.TYPE).isSupported) {
            return;
        }
        s6(payType, "0");
    }

    static /* synthetic */ void s4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34272, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.c6();
    }

    private void s6(SteamDirectPurchaseTool.PayType payType, String str) {
        if (PatchProxy.proxy(new Object[]{payType, str}, this, changeQuickRedirect, false, 34242, new Class[]{SteamDirectPurchaseTool.PayType.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        GamePurchaseParamValueObj gamePurchaseParamValueObjI5 = I5();
        String key = gamePurchaseParamValueObjI5 != null ? gamePurchaseParamValueObjI5.getKey() : null;
        String str2 = payType == SteamDirectPurchaseTool.PayType.SteamBalance ? "steamaccount" : PaymentManager.f71422u;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pay_method", str2);
        com.max.hbcommon.analytics.l.f66572a.s(SteamDirectPurchaseTool.f90632d, jsonObject);
        this.J.setMessage("正在生成订单...");
        if (!this.J.isShowing()) {
            this.J.show();
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().D2(key, str2, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s(payType)));
    }

    static /* synthetic */ void t4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34273, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.b6();
    }

    private void t6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.J.dismiss();
        }
        io.reactivex.disposables.a aVar = this.O;
        if (aVar != null) {
            aVar.f();
        }
        this.T.removeMessages(1);
        this.N.set(false);
    }

    static /* synthetic */ void u4(v0 v0Var) {
        if (PatchProxy.proxy(new Object[]{v0Var}, null, changeQuickRedirect, true, 34274, new Class[]{v0.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.e6();
    }

    private void u6(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34238, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f1(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q(str)));
    }

    private void v6() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34237, new Class[0], Void.TYPE).isSupported && (getParentFragment() instanceof com.max.xiaoheihe.module.mall.i)) {
            ((com.max.xiaoheihe.module.mall.i) getParentFragment()).j4();
        }
    }

    private void w5() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34212, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.item_mall_batch_cnt, (ViewGroup) this.f88414m, false);
        this.I = viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        int iF = ViewUtils.f(this.mContext, 12.0f);
        marginLayoutParams.rightMargin = iF;
        marginLayoutParams.leftMargin = iF;
        marginLayoutParams.topMargin = ViewUtils.f(this.mContext, 20.0f);
        this.I.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) this.I.findViewById(R.id.tv_cnt);
        ImageView imageView = (ImageView) this.I.findViewById(R.id.iv_add);
        ImageView imageView2 = (ImageView) this.I.findViewById(R.id.iv_sub);
        textView.setText(String.valueOf(this.H));
        imageView.setOnClickListener(new f0(textView));
        imageView2.setOnClickListener(new a(textView));
        this.f88414m.addView(this.I);
    }

    private void w6(List<KeyDescObj> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34246, new Class[]{List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (KeyDescObj keyDescObj : list) {
            arrayList.add(new CoffeeDialogProgressObj(keyDescObj.getKey(), String.valueOf(com.max.hbutils.utils.n.q(keyDescObj.getValue()) + 1), null));
        }
        com.max.xiaoheihe.view.l.w(new CoffeeDialogDataObj(getString(R.string.dialog_cafe_stp_title), arrayList, z10 ? "0" : "1", null, null, false, null, null));
    }

    static /* synthetic */ void x4(v0 v0Var, String str, boolean z10, String str2, boolean z11, String str3, String str4, String str5, String str6) {
        Object[] objArr = {v0Var, str, new Byte(z10 ? (byte) 1 : (byte) 0), str2, new Byte(z11 ? (byte) 1 : (byte) 0), str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34275, new Class[]{v0.class, String.class, cls, String.class, cls, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.Z5(str, z10, str2, z11, str3, str4, str5, str6);
    }

    private boolean x5(String str, BaseBottomButton.BaseBottomButtonStyle baseBottomButtonStyle, boolean z10, View.OnClickListener onClickListener) {
        Object[] objArr = {str, baseBottomButtonStyle, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34223, new Class[]{String.class, BaseBottomButton.BaseBottomButtonStyle.class, cls, View.OnClickListener.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.E) {
            this.f88419r.setLeftText(str);
            this.f88419r.setLeftButtonStyle(baseBottomButtonStyle);
            this.f88419r.setLeftButtonEnabled(z10);
            this.f88419r.setLeftClickListener(onClickListener);
            this.f88419r.setShowLeftButton(true);
            this.E = true;
            return true;
        }
        if (this.F) {
            return false;
        }
        this.f88419r.setRightText(str);
        this.f88419r.setRightButtonStyle(baseBottomButtonStyle);
        this.f88419r.setRightButtonEnabled(z10);
        this.f88419r.setRightClickListener(onClickListener);
        this.f88419r.setShowRightButton(true);
        this.F = true;
        return true;
    }

    private void x6(GamePurchaseParamObj gamePurchaseParamObj, GamePurchaseParamValueObj gamePurchaseParamValueObj) {
        List<GamePurchaseParamValueObj> values;
        if (PatchProxy.proxy(new Object[]{gamePurchaseParamObj, gamePurchaseParamValueObj}, this, changeQuickRedirect, false, 34226, new Class[]{GamePurchaseParamObj.class, GamePurchaseParamValueObj.class}, Void.TYPE).isSupported || gamePurchaseParamObj == null || gamePurchaseParamValueObj == null || (values = gamePurchaseParamObj.getValues()) == null) {
            return;
        }
        for (GamePurchaseParamValueObj gamePurchaseParamValueObj2 : values) {
            com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, updateCheckedOptions, obj = " + gamePurchaseParamValueObj2.getSku_id() + ", valueObj = " + gamePurchaseParamValueObj.getSku_id() + " " + gamePurchaseParamValueObj2.equals(gamePurchaseParamValueObj));
            if (gamePurchaseParamValueObj2.equals(gamePurchaseParamValueObj)) {
                gamePurchaseParamValueObj2.setChecked(true);
                GamePurchaseParamObj buy_type = gamePurchaseParamValueObj2.getBuy_type();
                if (gamePurchaseParamValueObj2.getSku_id() != null) {
                    this.f88427z = gamePurchaseParamValueObj2.getSku_id();
                } else if (buy_type != null && !com.max.hbcommon.utils.c.w(buy_type.getValues())) {
                    for (GamePurchaseParamValueObj gamePurchaseParamValueObj3 : buy_type.getValues()) {
                        com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, updateCheckedOptions, obj2 = " + gamePurchaseParamValueObj3.getSku_id());
                        if (gamePurchaseParamValueObj3.isChecked()) {
                            this.f88427z = gamePurchaseParamValueObj3.getSku_id();
                        }
                    }
                }
            } else {
                gamePurchaseParamValueObj2.setChecked(false);
            }
        }
        com.max.heybox.hblog.g.x("GameStorePurchaseDialogFragment, updateCheckedOptions, mSelectSkuId = " + this.f88427z);
    }

    static /* synthetic */ void y4(v0 v0Var, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{v0Var, str, str2}, null, changeQuickRedirect, true, 34276, new Class[]{v0.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        v0Var.u6(str, str2);
    }

    private void y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34210, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().i5().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d0()));
    }

    private void y6() {
        LinearLayout linearLayout;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34225, new Class[0], Void.TYPE).isSupported || (linearLayout = this.f88414m) == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f88414m.getChildAt(i11);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) childAt;
                if (linearLayout2.getChildCount() > 1) {
                    for (int i12 = 1; i12 < linearLayout2.getChildCount(); i12++) {
                        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.getChildAt(i12);
                        int childCount2 = linearLayout3.getChildCount();
                        for (int i13 = i10; i13 < childCount2; i13++) {
                            View childAt2 = linearLayout3.getChildAt(i13);
                            if (childAt2 instanceof ConstraintLayout) {
                                TextView textView = (TextView) childAt2.findViewById(R.id.tv_text);
                                GamePurchaseParamValueObj gamePurchaseParamValueObj = (GamePurchaseParamValueObj) textView.getTag();
                                Context context = getContext();
                                if (gamePurchaseParamValueObj != null && context != null) {
                                    View viewFindViewById = childAt2.findViewById(R.id.tv_out_of_stock);
                                    if (!"1".equals(gamePurchaseParamValueObj.getEnable()) && (gamePurchaseParamValueObj.getEnable_notify() == null || "0".equals(gamePurchaseParamValueObj.getEnable_notify()))) {
                                        textView.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
                                        textView.setTextColor(context.getResources().getColor(R.color.text_secondary_2_color));
                                    } else if (gamePurchaseParamValueObj.isChecked()) {
                                        if (("1".equals(gamePurchaseParamValueObj.getEnable_notify()) || "2".equals(gamePurchaseParamValueObj.getEnable_notify())) && viewFindViewById != null) {
                                            viewFindViewById.setVisibility(0);
                                            viewFindViewById.setBackgroundResource(R.drawable.text_primary_1dp);
                                        }
                                        textView.setBackgroundResource(R.drawable.btn_divider_bg_primary_border_2dp);
                                        textView.setTextColor(context.getResources().getColor(R.color.text_primary_1_color));
                                    } else {
                                        if (("1".equals(gamePurchaseParamValueObj.getEnable_notify()) || "2".equals(gamePurchaseParamValueObj.getEnable_notify())) && viewFindViewById != null) {
                                            i10 = 0;
                                            viewFindViewById.setVisibility(0);
                                            viewFindViewById.setBackgroundResource(R.drawable.text_hint_1dp);
                                        } else {
                                            i10 = 0;
                                        }
                                        textView.setBackgroundResource(R.drawable.btn_divider_bg_2dp);
                                        textView.setTextColor(context.getResources().getColor(R.color.text_primary_2_color));
                                    }
                                    i10 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void z5(GamePurchaseParamObj gamePurchaseParamObj) {
        if (PatchProxy.proxy(new Object[]{gamePurchaseParamObj}, this, changeQuickRedirect, false, 34215, new Class[]{GamePurchaseParamObj.class}, Void.TYPE).isSupported || gamePurchaseParamObj == null || gamePurchaseParamObj.getValues() == null) {
            return;
        }
        int size = gamePurchaseParamObj.getValues().size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            GamePurchaseParamValueObj gamePurchaseParamValueObj = gamePurchaseParamObj.getValues().get(i11);
            if (gamePurchaseParamValueObj.isChecked()) {
                i10++;
            }
            if (gamePurchaseParamValueObj.getBuy_type() != null && gamePurchaseParamValueObj.getBuy_type().getValues() != null) {
                int size2 = gamePurchaseParamValueObj.getBuy_type().getValues().size();
                int i12 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    if (gamePurchaseParamValueObj.getBuy_type().getValues().get(i13).isChecked()) {
                        i12++;
                    }
                }
                if (i12 != 1) {
                    boolean z10 = false;
                    for (int i14 = 0; i14 < size2; i14++) {
                        GamePurchaseParamValueObj gamePurchaseParamValueObj2 = gamePurchaseParamValueObj.getBuy_type().getValues().get(i14);
                        if (z10) {
                            gamePurchaseParamValueObj2.setChecked(false);
                        } else {
                            gamePurchaseParamValueObj2.setChecked(true);
                            z10 = true;
                        }
                    }
                }
            }
        }
        if (i10 != 1) {
            boolean z11 = false;
            for (int i15 = 0; i15 < size; i15++) {
                GamePurchaseParamValueObj gamePurchaseParamValueObj3 = gamePurchaseParamObj.getValues().get(i15);
                if (!"1".equals(gamePurchaseParamValueObj3.getEnable())) {
                    gamePurchaseParamValueObj3.setChecked(false);
                } else if (z11) {
                    gamePurchaseParamValueObj3.setChecked(false);
                } else {
                    gamePurchaseParamValueObj3.setChecked(true);
                    z11 = true;
                }
            }
        }
    }

    private void z6(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34236, new Class[]{String.class}, Void.TYPE).isSupported && (getParentFragment() instanceof com.max.xiaoheihe.module.mall.i)) {
            ((com.max.xiaoheihe.module.mall.i) getParentFragment()).g4(str);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34201, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_purchase_game_dialog);
        if (getArguments() != null) {
            this.f88421t = getArguments().getString("h_src");
            this.f88422u = getArguments().getString("app_id");
            this.f88423v = getArguments().getString("platf");
            this.f88424w = getArguments().getString("cart_id");
            this.f88425x = getArguments().getString("buy_type");
            this.f88426y = getArguments().getString("package_id");
            String string = getArguments().getString("sku_id");
            this.A = string;
            this.f88427z = string;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_close);
        this.f88403b = (ImageView) view.findViewById(R.id.iv_game_img);
        this.f88404c = (ScrollView) view.findViewById(R.id.sv_content);
        this.f88405d = (RelativeLayout) view.findViewById(R.id.rl_content);
        this.f88406e = (TextView) view.findViewById(R.id.tv_discount);
        this.f88407f = (TextView) view.findViewById(R.id.tv_cost_rmb_symbol);
        this.f88408g = (TextView) view.findViewById(R.id.tv_cost_rmb);
        this.f88409h = (TextView) view.findViewById(R.id.tv_cost_coin);
        this.f88410i = (TextView) view.findViewById(R.id.tv_reference_price);
        this.f88411j = (TextView) view.findViewById(R.id.tv_inventory);
        this.f88412k = (TextView) view.findViewById(R.id.tv_desc);
        this.f88413l = (ViewGroup) view.findViewById(R.id.ll_faq);
        this.f88414m = (LinearLayout) view.findViewById(R.id.ll_choose_options);
        this.f88419r = (BottomButtonLeftItemView) view.findViewById(R.id.bottom_button);
        this.f88415n = view.findViewById(R.id.vg_progress);
        View viewFindViewById = view.findViewById(R.id.vg_get_coupon);
        this.f88416o = viewFindViewById;
        this.f88417p = (TextView) viewFindViewById.findViewById(R.id.tv_coupon_title);
        this.f88418q = (TextView) this.f88416o.findViewById(R.id.tv_coupon_desc);
        ProgressDialog progressDialog = new ProgressDialog(this.mContext);
        this.J = progressDialog;
        progressDialog.setIndeterminate(true);
        this.J.setCancelable(false);
        imageView.setOnClickListener(new v());
        D5();
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    @Override // com.max.hbwallet.utils.c
    public String j2() {
        return this.G;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34255, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 3) {
            if (i11 == -1) {
                A5(0);
            }
        } else if (i10 == 4 && i11 == -1) {
            B5(this.Q, this.R, 0);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34204, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        t6();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34202, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        this.M = false;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34203, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.C) {
            this.C = false;
            y5();
        }
        this.M = true;
        if (com.max.hbcommon.utils.c.u(this.P)) {
            return;
        }
        if (this.N.get()) {
            t6();
        }
        this.T.removeMessages(1);
        Handler handler = this.T;
        handler.sendMessage(handler.obtainMessage(1, 28, 0, "0"));
    }
}
