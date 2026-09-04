package com.max.xiaoheihe.module.mall;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.transition.AutoTransition;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbcustomview.swipebacklayout.SwipeBackLayout;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.OrderCouponListActivity;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallOrderParamObj;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallRegisterOrderObj;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.bean.mall.cart.SuggestDiscountInfo;
import com.max.xiaoheihe.bean.mall.purchase.BulkPayObj;
import com.max.xiaoheihe.bean.mall.purchase.BuyTypeObj;
import com.max.xiaoheihe.bean.mall.purchase.BuyTypeValueObj;
import com.max.xiaoheihe.bean.mall.purchase.DeductInfoObj;
import com.max.xiaoheihe.bean.mall.purchase.GroupBuyInfoObj;
import com.max.xiaoheihe.bean.mall.purchase.GroupBuyUserInfoObj;
import com.max.xiaoheihe.bean.mall.purchase.PayPriceResultObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseBaseInfoObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseCheckObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseCouponInfoObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseParamObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseParamResultObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchasePreviewResultObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchasePriceObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseValueObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseWalletObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.module.mall.component.AvatarBannerView;
import com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import df.ao;
import df.g5;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.text.Regex;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.jvm.internal.t0({"SMAP\nMallPurchaseDetailDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallPurchaseDetailDialogFragment.kt\ncom/max/xiaoheihe/module/mall/MallPurchaseDetailDialogFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,2472:1\n262#2,2:2473\n262#2,2:2475\n177#2,2:2477\n262#2,2:2479\n262#2,2:2481\n*S KotlinDebug\n*F\n+ 1 MallPurchaseDetailDialogFragment.kt\ncom/max/xiaoheihe/module/mall/MallPurchaseDetailDialogFragment\n*L\n967#1:2473,2\n970#1:2475,2\n986#1:2477,2\n1647#1:2479,2\n1661#1:2481,2\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class MallPurchaseDetailDialogFragment extends com.max.hbcommon.base.swipeback.a implements PaymentManager.g {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    public static final String f89680x1 = "group_id";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    public static final String f89681y1 = "group";
    private boolean A;
    private boolean B;

    @dl.e
    private String D;

    @dl.e
    private PurchasePreviewResultObj E;

    @dl.e
    private PayPriceResultObj F;

    @dl.e
    private MallPriceObj H;

    @dl.e
    private String I;

    @dl.e
    private String J;
    private boolean K;

    @dl.e
    private LoadingDialog L;

    @dl.e
    private b M;

    @dl.e
    private com.max.hbcommon.view.a O;
    private androidx.activity.result.g<Intent> P;
    private PaymentManager Q;
    private ProgressDialog R;
    private androidx.activity.result.g<Intent> T;
    private boolean U;
    private long X;
    private long Y;

    @dl.e
    private SteamPurchaseManager Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private View f89682a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private d2 f89683b0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g5 f89687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private ViewGroup f89688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private View f89689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private String f89690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f89691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private String f89692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private String f89693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.e
    private String f89694t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.e
    private String f89695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f89696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private PurchaseParamResultObj f89697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private MallCouponObj f89698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private String f89699y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private String f89700z;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    public static final a f89678c0 = new a(null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f89679p1 = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final String f89684j = "order_id";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final String f89685k = "cart_enable";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final String f89686l = "PurchaseDetailDialog";
    private int C = 1;
    private boolean G = true;

    @dl.d
    private final AtomicBoolean N = new AtomicBoolean(false);

    @dl.d
    private io.reactivex.disposables.a S = new io.reactivex.disposables.a();

    @dl.d
    private String V = "-1";
    private final long W = 150;

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @xh.m
        public final MallPurchaseDetailDialogFragment a(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40497, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, MallPurchaseDetailDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (MallPurchaseDetailDialogFragment) patchProxyResultProxy.result;
            }
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = new MallPurchaseDetailDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("h_src", str);
            bundle.putString("app_id", str2);
            bundle.putString(com.max.xiaoheihe.module.mall.i.G, str3);
            bundle.putString("sku_id", str4);
            bundle.putString(MallPurchaseDetailDialogFragment.f89680x1, str5);
            bundle.putBoolean(MallPurchaseDetailDialogFragment.f89681y1, z10);
            mallPurchaseDetailDialogFragment.setArguments(bundle);
            return mallPurchaseDetailDialogFragment;
        }

        @dl.d
        @xh.m
        public final MallPurchaseDetailDialogFragment b(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 40498, new Class[]{String.class, String.class, String.class, String.class, String.class}, MallPurchaseDetailDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (MallPurchaseDetailDialogFragment) patchProxyResultProxy.result;
            }
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = new MallPurchaseDetailDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("h_src", str);
            bundle.putString("app_id", str2);
            bundle.putString(com.max.xiaoheihe.module.mall.i.G, str3);
            bundle.putString("sku_id", str4);
            bundle.putString(com.max.xiaoheihe.module.mall.i.H, str5);
            mallPurchaseDetailDialogFragment.setArguments(bundle);
            return mallPurchaseDetailDialogFragment;
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40575, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.M4(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class a1 extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89703c;

        a1(String str) {
            this.f89703c = str;
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40617, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
                BuyTypeValueObj selectedBuyTypeValue = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
                if (selectedBuyTypeValue != null) {
                    selectedBuyTypeValue.setEnable_notify(kotlin.jvm.internal.f0.g("1", this.f89703c) ? "2" : "1");
                }
                if (kotlin.jvm.internal.f0.g("1", this.f89703c)) {
                    new com.max.hbcommon.view.a.f(MallPurchaseDetailDialogFragment.this.getContext()).y("预约成功").l("补货后会发送通知").d().show();
                }
                MallPurchaseDetailDialogFragment.P4(MallPurchaseDetailDialogFragment.this);
                super.onNext(result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40618, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f89706e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f89707f = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final MallPurchaseDetailDialogFragment f89708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final WeakReference<MallPurchaseDetailDialogFragment> f89709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        public static final a f89704c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f89705d = 8;

        /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                this();
            }
        }

        public b(@dl.d MallPurchaseDetailDialogFragment fragment) {
            kotlin.jvm.internal.f0.p(fragment, "fragment");
            this.f89708a = fragment;
            this.f89709b = new WeakReference<>(fragment);
        }

        @dl.d
        public final MallPurchaseDetailDialogFragment a() {
            return this.f89708a;
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 40499, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89709b.get();
            if (mallPurchaseDetailDialogFragment != null && mallPurchaseDetailDialogFragment.isActive()) {
                z10 = true;
            }
            if (z10) {
                int i10 = msg.what;
                if (i10 == 0) {
                    mallPurchaseDetailDialogFragment.r6();
                } else {
                    if (i10 != 1) {
                        return;
                    }
                    mallPurchaseDetailDialogFragment.O5();
                }
            }
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BuyTypeValueObj f89711c;

        /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
        public static final class a implements SteamPurchaseManager.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseDetailDialogFragment f89712a;

            a(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
                this.f89712a = mallPurchaseDetailDialogFragment;
            }

            @Override // com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager.a
            @dl.d
            public AtomicBoolean a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40581, new Class[0], AtomicBoolean.class);
                return patchProxyResultProxy.isSupported ? (AtomicBoolean) patchProxyResultProxy.result : this.f89712a.N;
            }

            @Override // com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager.a
            public boolean b() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40580, new Class[0], Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                if (this.f89712a.isActive()) {
                    return this.f89712a.G;
                }
                return false;
            }

            @Override // com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager.a
            public void c(boolean z10) {
                if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40577, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && this.f89712a.isActive()) {
                    if (z10) {
                        MallPurchaseDetailDialogFragment.m5(this.f89712a);
                    } else {
                        this.f89712a.r6();
                    }
                }
            }

            @Override // com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager.a
            public void d() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40578, new Class[0], Void.TYPE).isSupported && this.f89712a.isActive()) {
                    MallPurchaseDetailDialogFragment.W3(this.f89712a);
                }
            }

            @Override // com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager.a
            public boolean isActive() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40582, new Class[0], Boolean.TYPE);
                return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f89712a.isActive();
            }

            @Override // com.max.xiaoheihe.module.mall.direct_purchace.SteamPurchaseManager.a
            public void onError() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40579, new Class[0], Void.TYPE).isSupported && this.f89712a.isActive()) {
                    this.f89712a.dismiss();
                }
            }
        }

        b0(BuyTypeValueObj buyTypeValueObj) {
            this.f89711c = buyTypeValueObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40576, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
            FragmentActivity activity = MallPurchaseDetailDialogFragment.this.getActivity();
            kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            mallPurchaseDetailDialogFragment.Z = new SteamPurchaseManager((AppCompatActivity) activity, this.f89711c, new a(MallPurchaseDetailDialogFragment.this));
            SteamPurchaseManager steamPurchaseManager = MallPurchaseDetailDialogFragment.this.Z;
            if (steamPurchaseManager != null) {
                steamPurchaseManager.F();
            }
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f89714c;

        c(TextView textView) {
            this.f89714c = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BulkPayObj bulk_pay;
            int count = 0;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40500, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
            BuyTypeValueObj selectedBuyTypeValue = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
            if (selectedBuyTypeValue != null && (bulk_pay = selectedBuyTypeValue.getBulk_pay()) != null) {
                count = bulk_pay.getCount();
            }
            if (MallPurchaseDetailDialogFragment.this.C >= count) {
                com.max.hbutils.utils.c.f("已到达购买上限");
                return;
            }
            MallPurchaseDetailDialogFragment.this.C++;
            this.f89714c.setText(String.valueOf(MallPurchaseDetailDialogFragment.this.C));
            MallPurchaseDetailDialogFragment.m5(MallPurchaseDetailDialogFragment.this);
            MallPurchaseDetailDialogFragment.C4(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89716c;

        c0(String str) {
            this.f89716c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40583, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.k5(MallPurchaseDetailDialogFragment.this, "1", this.f89716c);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f89723c;

        d(TextView textView) {
            this.f89723c = textView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40501, new Class[]{View.class}, Void.TYPE).isSupported && MallPurchaseDetailDialogFragment.this.C > 1) {
                MallPurchaseDetailDialogFragment.this.C--;
                this.f89723c.setText(String.valueOf(MallPurchaseDetailDialogFragment.this.C));
                MallPurchaseDetailDialogFragment.m5(MallPurchaseDetailDialogFragment.this);
                MallPurchaseDetailDialogFragment.C4(MallPurchaseDetailDialogFragment.this);
            }
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89725c;

        d0(String str) {
            this.f89725c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40584, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.k5(MallPurchaseDetailDialogFragment.this, "0", this.f89725c);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class e implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImageView f89727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f89728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ImageView f89729e;

        e(ImageView imageView, Context context, ImageView imageView2) {
            this.f89727c = imageView;
            this.f89728d = context;
            this.f89729e = imageView2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            BulkPayObj bulk_pay;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 40502, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
            BuyTypeValueObj selectedBuyTypeValue = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
            int count = (selectedBuyTypeValue == null || (bulk_pay = selectedBuyTypeValue.getBulk_pay()) == null) ? 0 : bulk_pay.getCount();
            if (MallPurchaseDetailDialogFragment.this.C == 1) {
                this.f89727c.setClickable(false);
                this.f89727c.setColorFilter(androidx.core.content.d.f(this.f89728d, R.color.text_secondary_2_color), PorterDuff.Mode.SRC_ATOP);
            } else {
                this.f89727c.setClickable(true);
                this.f89727c.setColorFilter(R.color.text_primary_1_color);
            }
            if (MallPurchaseDetailDialogFragment.this.C == count) {
                this.f89729e.setColorFilter(androidx.core.content.d.f(this.f89728d, R.color.text_secondary_2_color), PorterDuff.Mode.SRC_ATOP);
            } else {
                this.f89729e.setColorFilter(R.color.text_primary_1_color);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40585, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.M4(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40507, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onError(e10);
                MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                MallPurchaseDetailDialogFragment.N5(MallPurchaseDetailDialogFragment.this, false, false, 3, null);
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40508, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                if (result.getResult() != null) {
                    MallPurchaseDetailDialogFragment.Z3(MallPurchaseDetailDialogFragment.this);
                } else if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(MallPurchaseDetailDialogFragment.this.getString(R.string.fail));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40509, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f89735e;

        /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
        public static final class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseDetailDialogFragment f89736a;

            a(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
                this.f89736a = mallPurchaseDetailDialogFragment;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40587, new Class[0], Void.TYPE).isSupported && this.f89736a.isActive()) {
                    if (this.f89736a.getParentFragment() instanceof com.max.xiaoheihe.module.mall.cart.ui.d) {
                        androidx.activity.result.b parentFragment = this.f89736a.getParentFragment();
                        kotlin.jvm.internal.f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.mall.cart.ui.OnChangeGood");
                        ((com.max.xiaoheihe.module.mall.cart.ui.d) parentFragment).u0();
                    }
                    this.f89736a.dismiss();
                }
            }
        }

        f0(String str, String str2, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str3) {
            this.f89732b = str;
            this.f89733c = str2;
            this.f89734d = mallPurchaseDetailDialogFragment;
            this.f89735e = str3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40586, new Class[]{View.class}, Void.TYPE).isSupported || this.f89732b == null || this.f89733c == null) {
                return;
            }
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            io.reactivex.disposables.a compositeDisposable = this.f89734d.getCompositeDisposable();
            kotlin.jvm.internal.f0.o(compositeDisposable, "compositeDisposable");
            String str = this.f89732b;
            String str2 = this.f89733c;
            String str3 = this.f89735e;
            String str4 = this.f89734d.f89694t;
            kotlin.jvm.internal.f0.m(str4);
            mallCartUtils.g(compositeDisposable, str, str2, str3, str4, new a(this.f89734d));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class g implements com.max.xiaoheihe.utils.l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public final void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40510, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.this.U = true;
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            BuyTypeValueObj selectedBuyTypeValue;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40588, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String item_id = null;
            if (MallPurchaseDetailDialogFragment.this.f89698x != null) {
                arrayList = new ArrayList();
                MallCouponObj mallCouponObj = MallPurchaseDetailDialogFragment.this.f89698x;
                kotlin.jvm.internal.f0.m(mallCouponObj);
                arrayList.add(mallCouponObj);
            } else {
                arrayList = null;
            }
            androidx.activity.result.g gVar = MallPurchaseDetailDialogFragment.this.T;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("couponLauncher");
                gVar = null;
            }
            FragmentActivity activity = MallPurchaseDetailDialogFragment.this.getActivity();
            PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
            if (purchaseParamResultObj != null && (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) != null) {
                item_id = selectedBuyTypeValue.getItem_id();
            }
            gVar.b(OrderCouponListActivity.W1(activity, item_id, MallPurchaseDetailDialogFragment.this.C, arrayList));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<MallPriceObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40515, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onError(e10);
                MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                MallPurchaseDetailDialogFragment.N5(MallPurchaseDetailDialogFragment.this, false, false, 3, null);
            }
        }

        public void onNext(@dl.d Result<MallPriceObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40516, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                MallPurchaseDetailDialogFragment.this.H = result.getResult();
                MallPurchaseDetailDialogFragment.X3(MallPurchaseDetailDialogFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40517, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPriceObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            BuyTypeValueObj selectedBuyTypeValue;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40589, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String item_id = null;
            if (MallPurchaseDetailDialogFragment.this.f89698x != null) {
                arrayList = new ArrayList();
                MallCouponObj mallCouponObj = MallPurchaseDetailDialogFragment.this.f89698x;
                kotlin.jvm.internal.f0.m(mallCouponObj);
                arrayList.add(mallCouponObj);
            } else {
                arrayList = null;
            }
            androidx.activity.result.g gVar = MallPurchaseDetailDialogFragment.this.T;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("couponLauncher");
                gVar = null;
            }
            FragmentActivity activity = MallPurchaseDetailDialogFragment.this.getActivity();
            PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
            if (purchaseParamResultObj != null && (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) != null) {
                item_id = selectedBuyTypeValue.getItem_id();
            }
            gVar.b(OrderCouponListActivity.W1(activity, item_id, MallPurchaseDetailDialogFragment.this.C, arrayList));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40518, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40519, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                MallPurchaseDetailDialogFragment.L4(MallPurchaseDetailDialogFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40520, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class i0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PurchaseCouponInfoObj coupon_info;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40590, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity = MallPurchaseDetailDialogFragment.this.requireActivity();
            kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
            PayPriceResultObj payPriceResultObj = MallPurchaseDetailDialogFragment.this.F;
            com.max.xiaoheihe.base.router.b.k0(fragmentActivityRequireActivity, (payPriceResultObj == null || (coupon_info = payPriceResultObj.getCoupon_info()) == null) ? null : coupon_info.getCoupon_center_protocol());
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<PayPriceResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40521, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            super.onError(e10);
            MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
            MallPurchaseDetailDialogFragment.this.dismiss();
        }

        public void onNext(@dl.d Result<PayPriceResultObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 40522, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onNext(t10);
                MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                MallPurchaseDetailDialogFragment.H4(MallPurchaseDetailDialogFragment.this, t10.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40523, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayPriceResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class j0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BuyTypeValueObj selectedBuyTypeValue;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40591, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            androidx.activity.result.g gVar = MallPurchaseDetailDialogFragment.this.T;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("couponLauncher");
                gVar = null;
            }
            FragmentActivity activity = MallPurchaseDetailDialogFragment.this.getActivity();
            PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
            gVar.b(OrderCouponListActivity.W1(activity, (purchaseParamResultObj == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getItem_id(), MallPurchaseDetailDialogFragment.this.C, null));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class k extends com.max.hbcommon.network.d<Result<PurchaseParamResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40524, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onError(e10);
                MallPurchaseDetailDialogFragment.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<PurchaseParamResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40525, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onNext(result);
                MallPurchaseDetailDialogFragment.I4(MallPurchaseDetailDialogFragment.this, result.getResult());
                PurchaseParamResultObj result2 = result.getResult();
                if (com.max.hbcommon.utils.c.u(result2 != null ? result2.getToast_msg() : null)) {
                    return;
                }
                PurchaseParamResultObj result3 = result.getResult();
                com.max.hbutils.utils.c.d(result3 != null ? result3.getToast_msg() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40526, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PurchaseParamResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class k0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40592, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.g5(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nMallPurchaseDetailDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallPurchaseDetailDialogFragment.kt\ncom/max/xiaoheihe/module/mall/MallPurchaseDetailDialogFragment$onGetPayPriceCompleted$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,2472:1\n260#2:2473\n260#2:2474\n*S KotlinDebug\n*F\n+ 1 MallPurchaseDetailDialogFragment.kt\ncom/max/xiaoheihe/module/mall/MallPurchaseDetailDialogFragment$onGetPayPriceCompleted$1$1\n*L\n1238#1:2473\n1239#1:2474\n*E\n"})
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PayPriceResultObj f89751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89752c;

        l(PayPriceResultObj payPriceResultObj, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
            this.f89751b = payPriceResultObj;
            this.f89752c = mallPurchaseDetailDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40534, new Class[]{View.class}, Void.TYPE).isSupported && kotlin.jvm.internal.f0.g(this.f89751b.getOnly_hcoin(), Boolean.TRUE)) {
                MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89752c;
                g5 g5Var = mallPurchaseDetailDialogFragment.f89687m;
                g5 g5Var2 = null;
                if (g5Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var = null;
                }
                LinearLayout linearLayout = g5Var.E;
                kotlin.jvm.internal.f0.o(linearLayout, "binding.vgPurchaseDetail");
                MallPurchaseDetailDialogFragment.f5(mallPurchaseDetailDialogFragment, !(linearLayout.getVisibility() == 0));
                g5 g5Var3 = this.f89752c.f89687m;
                if (g5Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    g5Var2 = g5Var3;
                }
                LinearLayout linearLayout2 = g5Var2.E;
                kotlin.jvm.internal.f0.o(linearLayout2, "binding.vgPurchaseDetail");
                if (linearLayout2.getVisibility() == 0) {
                    MallPurchaseDetailDialogFragment.g5(this.f89752c);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class l0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40593, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.g5(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40535, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
            MallAgreementActivity.a aVar = MallAgreementActivity.M;
            FragmentActivity fragmentActivityRequireActivity = mallPurchaseDetailDialogFragment.requireActivity();
            PurchasePreviewResultObj purchasePreviewResultObj = MallPurchaseDetailDialogFragment.this.E;
            mallPurchaseDetailDialogFragment.startActivity(aVar.a(fragmentActivityRequireActivity, purchasePreviewResultObj != null ? purchasePreviewResultObj.getAgreement_title() : null, false));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class m0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PurchaseParamObj f89756c;

        m0(PurchaseParamObj purchaseParamObj) {
            this.f89756c = purchaseParamObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FragmentActivity activity;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40594, new Class[]{View.class}, Void.TYPE).isSupported || (activity = MallPurchaseDetailDialogFragment.this.getActivity()) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(activity, this.f89756c.getBtn_protocol());
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PurchasePreviewResultObj f89758c;

        n(PurchasePreviewResultObj purchasePreviewResultObj) {
            this.f89758c = purchasePreviewResultObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40536, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context contextRequireContext = MallPurchaseDetailDialogFragment.this.requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
            KeyDescObj pay_protocol = this.f89758c.getPay_protocol();
            com.max.xiaoheihe.base.router.b.k0(contextRequireContext, pay_protocol != null ? pay_protocol.getProtocol() : null);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class n0 implements PurchaseCheckedAdapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PurchaseParamObj f89760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<PurchaseValueObj> f89761c;

        n0(PurchaseParamObj purchaseParamObj, List<PurchaseValueObj> list) {
            this.f89760b = purchaseParamObj;
            this.f89761c = list;
        }

        @Override // com.max.xiaoheihe.module.mall.PurchaseCheckedAdapter.a
        public void a(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40595, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.V3(MallPurchaseDetailDialogFragment.this);
            this.f89760b.setChecked(this.f89761c.get(i10));
            MallPurchaseDetailDialogFragment.O4(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class o implements PurchaseCheckedAdapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<PurchaseCheckObj> f89763b;

        o(ArrayList<PurchaseCheckObj> arrayList) {
            this.f89763b = arrayList;
        }

        @Override // com.max.xiaoheihe.module.mall.PurchaseCheckedAdapter.a
        public void a(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40537, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.this.D = this.f89763b.get(i10).getKey();
            MallPurchaseDetailDialogFragment.Y3(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BuyTypeValueObj f89765c;

        o0(BuyTypeValueObj buyTypeValueObj) {
            this.f89765c = buyTypeValueObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FragmentActivity activity;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40596, new Class[]{View.class}, Void.TYPE).isSupported || (activity = MallPurchaseDetailDialogFragment.this.getActivity()) == null) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(activity, this.f89765c.getDesc_prot());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$onResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$onResume$1", f = "MallPurchaseDetailDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f89766b;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$onResume$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$onResume$1$1", f = "MallPurchaseDetailDialogFragment.kt", i = {}, l = {bb.c.b.B3}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08191 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f89768b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MallPurchaseDetailDialogFragment f89769c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C08191(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, kotlin.coroutines.c<? super C08191> cVar) {
                super(2, cVar);
                this.f89769c = mallPurchaseDetailDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 40545, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C08191(this.f89769c, cVar);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40547, new Class[]{Object.class, Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
            }

            @dl.e
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40546, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C08191) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40544, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f89768b;
                if (i10 == 0) {
                    kotlin.t0.n(obj);
                    this.f89768b = 1;
                    if (DelayKt.b(200L, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                if (this.f89769c.K) {
                    MallPurchaseDetailDialogFragment.j5(this.f89769c);
                }
                MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89769c;
                MallPurchaseDetailDialogFragment.N4(mallPurchaseDetailDialogFragment, mallPurchaseDetailDialogFragment.J, MallPurchaseDetailDialogFragment.D4(this.f89769c), 0, true);
                return b2.f124493a;
            }
        }

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 40541, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : MallPurchaseDetailDialogFragment.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40543, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40542, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            BuyTypeValueObj selectedBuyTypeValue;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40540, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            kotlin.coroutines.intrinsics.b.h();
            if (this.f89766b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            if (!com.max.hbcommon.utils.c.u(MallPurchaseDetailDialogFragment.this.J)) {
                MallPurchaseDetailDialogFragment.this.f89683b0 = kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.e()), null, null, new C08191(MallPurchaseDetailDialogFragment.this, null), 3, null);
            } else if (MallPurchaseDetailDialogFragment.this.U) {
                PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
                if (purchaseParamResultObj != null && (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) != null) {
                    MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
                    if (kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCategory(), "mall") && selectedBuyTypeValue.canBuy()) {
                        MallPurchaseDetailDialogFragment.C4(mallPurchaseDetailDialogFragment);
                    }
                }
            } else {
                SteamPurchaseManager steamPurchaseManager = MallPurchaseDetailDialogFragment.this.Z;
                if (steamPurchaseManager != null) {
                    MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment2 = MallPurchaseDetailDialogFragment.this;
                    if (!com.max.hbcommon.utils.c.u(steamPurchaseManager.A())) {
                        MallPurchaseDetailDialogFragment.W3(mallPurchaseDetailDialogFragment2);
                        MallPurchaseDetailDialogFragment.m5(mallPurchaseDetailDialogFragment2);
                        if (mallPurchaseDetailDialogFragment2.N.get()) {
                            steamPurchaseManager.T();
                        }
                        steamPurchaseManager.G();
                    }
                }
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nMallPurchaseDetailDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallPurchaseDetailDialogFragment.kt\ncom/max/xiaoheihe/module/mall/MallPurchaseDetailDialogFragment$onGetPurchasePreviewCompleted$1$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,2472:1\n260#2:2473\n*S KotlinDebug\n*F\n+ 1 MallPurchaseDetailDialogFragment.kt\ncom/max/xiaoheihe/module/mall/MallPurchaseDetailDialogFragment$onGetPurchasePreviewCompleted$1$4\n*L\n1185#1:2473\n*E\n"})
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40538, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
            g5 g5Var = mallPurchaseDetailDialogFragment.f89687m;
            if (g5Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var = null;
            }
            LinearLayout linearLayout = g5Var.E;
            kotlin.jvm.internal.f0.o(linearLayout, "binding.vgPurchaseDetail");
            MallPurchaseDetailDialogFragment.f5(mallPurchaseDetailDialogFragment, true ^ (linearLayout.getVisibility() == 0));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class p0 implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 40598, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            List list;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 40597, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == 10) {
                if (activityResult.a() != null) {
                    Intent intentA = activityResult.a();
                    kotlin.jvm.internal.f0.m(intentA);
                    Serializable serializableExtra = intentA.getSerializableExtra("coupon_list");
                    kotlin.jvm.internal.f0.n(serializableExtra, "null cannot be cast to non-null type kotlin.collections.List<com.max.hbwallet.bean.MallCouponObj>");
                    list = (List) serializableExtra;
                } else {
                    list = null;
                }
                if (list == null || list.size() <= 0) {
                    MallPurchaseDetailDialogFragment.this.f89698x = null;
                } else {
                    MallPurchaseDetailDialogFragment.this.f89698x = (MallCouponObj) list.get(0);
                }
                MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
                MallPurchaseDetailDialogFragment.B4(mallPurchaseDetailDialogFragment, MallPurchaseDetailDialogFragment.n4(mallPurchaseDetailDialogFragment), com.max.hbutils.utils.n.r(MallPurchaseDetailDialogFragment.this.f89699y));
            }
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40539, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.f5(MallPurchaseDetailDialogFragment.this, false);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class q0 implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f89778b;

        q0(TextView textView) {
            this.f89778b = textView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 40605, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 6) {
                this.f89778b.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40548, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
            MallPurchaseDetailDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class r0 implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f89781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f89782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f89783e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f89784f;

        r0(long j10, TextView textView, TextView textView2, TextView textView3, String str) {
            this.f89780b = j10;
            this.f89781c = textView;
            this.f89782d = textView2;
            this.f89783e = textView3;
            this.f89784f = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 40608, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            if (com.max.hbutils.utils.n.q(s10.toString()) > this.f89780b) {
                this.f89781c.setText("输入金额超出上限");
                this.f89781c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                this.f89782d.setVisibility(8);
                this.f89783e.setEnabled(false);
                return;
            }
            this.f89781c.setText(this.f89784f);
            this.f89781c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.f89782d.setVisibility(0);
            this.f89783e.setEnabled(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40606, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40607, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class s implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f89788b = new s();
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class s0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f89790c;

        s0(long j10, EditText editText) {
            this.f89789b = j10;
            this.f89790c = editText;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40609, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f89790c.setText(String.valueOf(this.f89789b));
            EditText editText = this.f89790c;
            editText.setSelection(editText.getText().length());
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class t extends com.max.hbcommon.network.d<Result<MallPurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f89792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f89793d;

        /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
        public static final class a implements com.max.xiaoheihe.utils.l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseResultObj f89794a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallPurchaseDetailDialogFragment f89795b;

            a(MallPurchaseResultObj mallPurchaseResultObj, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
                this.f89794a = mallPurchaseResultObj;
                this.f89795b = mallPurchaseDetailDialogFragment;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40552, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f89794a.getOrder_id())) {
                    return;
                }
                if (kotlin.jvm.internal.f0.g("cart", this.f89794a.getOrder_src())) {
                    FragmentActivity fragmentActivityRequireActivity = this.f89795b.requireActivity();
                    kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
                    String order_id = this.f89794a.getOrder_id();
                    kotlin.jvm.internal.f0.o(order_id, "purchaseResultObj.order_id");
                    com.max.xiaoheihe.base.router.b.D(fragmentActivityRequireActivity, order_id).A();
                    return;
                }
                FragmentActivity fragmentActivityRequireActivity2 = this.f89795b.requireActivity();
                kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity2, "requireActivity()");
                String order_id2 = this.f89794a.getOrder_id();
                kotlin.jvm.internal.f0.o(order_id2, "purchaseResultObj.order_id");
                com.max.xiaoheihe.base.router.b.R(fragmentActivityRequireActivity2, order_id2, true).A();
            }
        }

        t(boolean z10, boolean z11) {
            this.f89792c = z10;
            this.f89793d = z11;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40549, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onError(e10);
                MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                MallPurchaseDetailDialogFragment.this.dismiss();
            }
        }

        public void onNext(@dl.d Result<MallPurchaseResultObj> result) {
            BuyTypeValueObj selectedBuyTypeValue;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40550, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onNext(result);
                MallPurchaseResultObj result2 = result.getResult();
                String item_id = null;
                if (kotlin.jvm.internal.f0.g("1", result2 != null ? result2.getNot_finish_order() : null)) {
                    MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                    MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
                    MallPurchaseDetailDialogFragment.h5(mallPurchaseDetailDialogFragment, new a(result2, mallPurchaseDetailDialogFragment));
                    return;
                }
                if (com.max.hbcommon.utils.c.u(result2 != null ? result2.getOrder_id() : null)) {
                    MallPurchaseDetailDialogFragment.W3(MallPurchaseDetailDialogFragment.this);
                    com.max.hbutils.utils.c.f(MallPurchaseDetailDialogFragment.this.getString(R.string.fail));
                    MallPurchaseDetailDialogFragment.this.dismiss();
                    return;
                }
                MallPurchaseDetailDialogFragment.this.I = result2 != null ? result2.getOrder_id() : null;
                if (this.f89792c) {
                    MallPurchaseDetailDialogFragment.N5(MallPurchaseDetailDialogFragment.this, true, false, 2, null);
                    return;
                }
                MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment2 = MallPurchaseDetailDialogFragment.this;
                String order_id = result2 != null ? result2.getOrder_id() : null;
                kotlin.jvm.internal.f0.m(order_id);
                MallPurchaseDetailDialogFragment.e4(mallPurchaseDetailDialogFragment2, order_id);
                if (MallPurchaseDetailDialogFragment.this.getContext() != null) {
                    Intent intent = new Intent(lb.a.A);
                    intent.putExtra(lb.a.f130996l0, lb.a.f131044t0);
                    Context context = MallPurchaseDetailDialogFragment.this.getContext();
                    kotlin.jvm.internal.f0.m(context);
                    context.sendBroadcast(intent);
                    PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
                    if (purchaseParamResultObj != null && (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) != null) {
                        item_id = selectedBuyTypeValue.getItem_id();
                    }
                    String str = item_id;
                    if (this.f89793d) {
                        MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                        OrderEvent orderEvent = OrderEvent.REGISTER;
                        String str2 = MallPurchaseDetailDialogFragment.this.f89691q;
                        String str3 = MallPurchaseDetailDialogFragment.this.f89693s;
                        String order_id2 = result2.getOrder_id();
                        String str4 = MallPurchaseDetailDialogFragment.this.f89690p;
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("is_grouping", Boolean.valueOf(MallPurchaseDetailDialogFragment.this.f89696v));
                        b2 b2Var = b2.f124493a;
                        mallCartUtils.v(orderEvent, str2, str3, str, order_id2, str4, jsonObject);
                        return;
                    }
                    MallCartUtils mallCartUtils2 = MallCartUtils.f90196a;
                    OrderEvent orderEvent2 = OrderEvent.REGISTER;
                    String str5 = MallPurchaseDetailDialogFragment.this.f89691q;
                    String str6 = MallPurchaseDetailDialogFragment.this.f89693s;
                    String order_id3 = result2.getOrder_id();
                    String str7 = MallPurchaseDetailDialogFragment.this.f89690p;
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("is_grouping", Boolean.valueOf(MallPurchaseDetailDialogFragment.this.f89696v));
                    b2 b2Var2 = b2.f124493a;
                    mallCartUtils2.y(orderEvent2, str5, str6, str, order_id3, str7, jsonObject2);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40551, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPurchaseResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class t0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f89796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f89798d;

        t0(EditText editText, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, com.max.hbcommon.component.i iVar) {
            this.f89796b = editText;
            this.f89797c = mallPurchaseDetailDialogFragment;
            this.f89798d = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40610, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(this.f89796b.getText().toString())) {
                this.f89797c.f89699y = null;
            } else {
                this.f89797c.f89699y = this.f89796b.getText().toString();
                String str = this.f89797c.f89699y;
                kotlin.jvm.internal.f0.m(str);
                if (!kotlin.text.u.K1(str, "0", false, 2, null)) {
                    StringBuilder sb2 = new StringBuilder(this.f89797c.f89699y);
                    String str2 = this.f89797c.f89699y;
                    kotlin.jvm.internal.f0.m(str2);
                    int length = str2.length() - 1;
                    String str3 = this.f89797c.f89699y;
                    kotlin.jvm.internal.f0.m(str3);
                    sb2.replace(length, str3.length(), "0");
                    this.f89797c.f89699y = sb2.toString();
                }
            }
            this.f89798d.dismiss();
            MallPurchaseDetailDialogFragment.Q4(this.f89797c);
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89797c;
            MallPurchaseDetailDialogFragment.B4(mallPurchaseDetailDialogFragment, MallPurchaseDetailDialogFragment.n4(mallPurchaseDetailDialogFragment), com.max.hbutils.utils.n.r(this.f89797c.f89699y));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class u extends com.max.hbcommon.network.d<Result<WeixinQueryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f89800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f89801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f89802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f89803f;

        u(boolean z10, int i10, String str, String str2) {
            this.f89800c = z10;
            this.f89801d = i10;
            this.f89802e = str;
            this.f89803f = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40563, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                super.onError(e10);
                if (MallPurchaseDetailDialogFragment.this.R == null) {
                    kotlin.jvm.internal.f0.S("payLoadingDialog");
                }
                ProgressDialog progressDialog = MallPurchaseDetailDialogFragment.this.R;
                if (progressDialog == null) {
                    kotlin.jvm.internal.f0.S("payLoadingDialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                MallPurchaseDetailDialogFragment.this.K = false;
            }
        }

        public void onNext(@dl.d Result<WeixinQueryObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40564, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallPurchaseDetailDialogFragment.this.isActive()) {
                MallPurchaseDetailDialogFragment.this.K = false;
                if (result.getResult() != null) {
                    String state = result.getResult().getState();
                    com.max.hbcommon.utils.d.b("zzzzmalltest", "queryOutOrder state==" + state);
                    if (!"6".equals(state)) {
                        if ("1".equals(state)) {
                            MallPurchaseDetailDialogFragment.a4(MallPurchaseDetailDialogFragment.this);
                            MallPurchaseDetailDialogFragment.L4(MallPurchaseDetailDialogFragment.this);
                            return;
                        } else {
                            MallPurchaseDetailDialogFragment.a4(MallPurchaseDetailDialogFragment.this);
                            com.max.hbutils.utils.c.d("支付失败");
                            return;
                        }
                    }
                    if (this.f89800c) {
                        MallPurchaseDetailDialogFragment.a4(MallPurchaseDetailDialogFragment.this);
                        MallPurchaseDetailDialogFragment.i5(MallPurchaseDetailDialogFragment.this);
                        return;
                    }
                    int i10 = this.f89801d;
                    if (i10 < 30) {
                        MallPurchaseDetailDialogFragment.N4(MallPurchaseDetailDialogFragment.this, this.f89802e, this.f89803f, i10 + 1, false);
                    } else {
                        MallPurchaseDetailDialogFragment.a4(MallPurchaseDetailDialogFragment.this);
                        MallPurchaseDetailDialogFragment.i5(MallPurchaseDetailDialogFragment.this);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40565, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WeixinQueryObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class u0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40611, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(MallPurchaseDetailDialogFragment.this.requireActivity(), (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131029q3);
            intent.putExtra("title", "使用规则");
            MallPurchaseDetailDialogFragment.this.requireActivity().startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BuyTypeValueObj f89805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89806c;

        v(BuyTypeValueObj buyTypeValueObj, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
            this.f89805b = buyTypeValueObj;
            this.f89806c = mallPurchaseDetailDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            KeyDescObj faq_protocol;
            String protocol;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40566, new Class[]{View.class}, Void.TYPE).isSupported || (faq_protocol = this.f89805b.getFaq_protocol()) == null || (protocol = faq_protocol.getProtocol()) == null) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity = this.f89806c.requireActivity();
            kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
            com.max.xiaoheihe.base.router.b.k0(fragmentActivityRequireActivity, protocol);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class v0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f89807b;

        v0(com.max.hbcommon.component.i iVar) {
            this.f89807b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40612, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f89807b) == null || !iVar.isShowing()) {
                return;
            }
            this.f89807b.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class w implements PurchaseCheckedAdapter.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BuyTypeObj f89808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<BuyTypeValueObj> f89809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89810c;

        w(BuyTypeObj buyTypeObj, List<BuyTypeValueObj> list, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
            this.f89808a = buyTypeObj;
            this.f89809b = list;
            this.f89810c = mallPurchaseDetailDialogFragment;
        }

        @Override // com.max.xiaoheihe.module.mall.PurchaseCheckedAdapter.a
        public void a(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40567, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f89808a.setChecked(this.f89809b.get(i10));
            MallPurchaseDetailDialogFragment.R4(this.f89810c);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class w0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.xiaoheihe.utils.l0.g f89811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89812c;

        w0(com.max.xiaoheihe.utils.l0.g gVar, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
            this.f89811b = gVar;
            this.f89812c = mallPurchaseDetailDialogFragment;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40613, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.l0.g gVar = this.f89811b;
            if (gVar != null) {
                gVar.a();
            }
            dialogInterface.dismiss();
            this.f89812c.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f89814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f89815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f89816e;

        /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
        public static final class a implements com.max.xiaoheihe.utils.l0.h<CartDetailObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallPurchaseDetailDialogFragment f89817a;

            a(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
                this.f89817a = mallPurchaseDetailDialogFragment;
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public /* bridge */ /* synthetic */ void a(CartDetailObj cartDetailObj) {
                if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 40571, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                d(cartDetailObj);
            }

            @Override // com.max.xiaoheihe.utils.l0.h
            public /* bridge */ /* synthetic */ void b(CartDetailObj cartDetailObj) {
                if (PatchProxy.proxy(new Object[]{cartDetailObj}, this, changeQuickRedirect, false, 40572, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                c(cartDetailObj);
            }

            public void c(@dl.d CartDetailObj param) {
                if (PatchProxy.proxy(new Object[]{param}, this, changeQuickRedirect, false, 40570, new Class[]{CartDetailObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(param, "param");
            }

            public void d(@dl.d CartDetailObj param) {
                if (PatchProxy.proxy(new Object[]{param}, this, changeQuickRedirect, false, 40569, new Class[]{CartDetailObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(param, "param");
                if (this.f89817a.isActive()) {
                    com.max.hbutils.utils.c.f("添加成功");
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    mallCartUtils.D(com.max.hbutils.utils.n.q(param.getCart_count()));
                    Context context = this.f89817a.getContext();
                    kotlin.jvm.internal.f0.m(context);
                    View view = this.f89817a.f89689o;
                    kotlin.jvm.internal.f0.m(view);
                    mallCartUtils.m(context, view, false);
                }
            }
        }

        x(String str, String str2, String str3) {
            this.f89814c = str;
            this.f89815d = str2;
            this.f89816e = str3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40568, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            io.reactivex.disposables.a compositeDisposable = MallPurchaseDetailDialogFragment.this.getCompositeDisposable();
            kotlin.jvm.internal.f0.o(compositeDisposable, "compositeDisposable");
            String str = this.f89814c;
            kotlin.jvm.internal.f0.m(str);
            String str2 = "" + MallPurchaseDetailDialogFragment.this.C;
            String str3 = this.f89815d;
            kotlin.jvm.internal.f0.m(str3);
            mallCartUtils.f(compositeDisposable, str, str2, str3, this.f89816e, new a(MallPurchaseDetailDialogFragment.this));
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class x0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x0 f89818b = new x0();
        public static ChangeQuickRedirect changeQuickRedirect;

        x0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40614, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40573, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallPurchaseDetailDialogFragment.M4(MallPurchaseDetailDialogFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class y0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface dialog, int i10) {
            BuyTypeValueObj selectedBuyTypeValue;
            if (PatchProxy.proxy(new Object[]{dialog, new Integer(i10)}, this, changeQuickRedirect, false, 40615, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
            PurchaseParamResultObj purchaseParamResultObj = MallPurchaseDetailDialogFragment.this.f89697w;
            if (kotlin.jvm.internal.f0.g((purchaseParamResultObj == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getCategory(), "mall")) {
                MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = MallPurchaseDetailDialogFragment.this;
                MallPurchaseDetailDialogFragment.N4(mallPurchaseDetailDialogFragment, mallPurchaseDetailDialogFragment.J, MallPurchaseDetailDialogFragment.D4(MallPurchaseDetailDialogFragment.this), 0, true);
            }
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BuyTypeValueObj f89821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPurchaseDetailDialogFragment f89822c;

        z(BuyTypeValueObj buyTypeValueObj, MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
            this.f89821b = buyTypeValueObj;
            this.f89822c = mallPurchaseDetailDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FragmentActivity activity;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40574, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f89821b.getProtocol()) || (activity = this.f89822c.getActivity()) == null) {
                return;
            }
            BuyTypeValueObj buyTypeValueObj = this.f89821b;
            MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment = this.f89822c;
            com.max.xiaoheihe.base.router.b.k0(activity, buyTypeValueObj.getProtocol());
            mallPurchaseDetailDialogFragment.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
    public static final class z0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@dl.d DialogInterface dialog, int i10) {
            if (PatchProxy.proxy(new Object[]{dialog, new Integer(i10)}, this, changeQuickRedirect, false, 40616, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(dialog, "dialog");
            dialog.dismiss();
            MallPurchaseDetailDialogFragment.N5(MallPurchaseDetailDialogFragment.this, false, false, 3, null);
        }
    }

    @SuppressLint({"AutoDispose"})
    private final void A5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40403, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j6(str, D5(), null, this.f89699y, new HashMap()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    public static final /* synthetic */ void B4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str, long j10) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, str, new Long(j10)}, null, changeQuickRedirect, true, 40466, new Class[]{MallPurchaseDetailDialogFragment.class, String.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.H5(str, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.max.xiaoheihe.module.mall.component.AvatarBannerView] */
    private final View B5(List<String> list) {
        ?? linearLayout;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40439, new Class[]{List.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (this.f89682a0 == null) {
            if (list.size() > 3) {
                linearLayout = new AvatarBannerView(getContext());
                linearLayout.setImages(list);
            } else {
                linearLayout = new LinearLayout(getContext());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    linearLayout.addView(z5(i10, list.get(i10)));
                }
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            Context context = linearLayout.getContext();
            kotlin.jvm.internal.f0.o(context, "context");
            marginLayoutParams.rightMargin = com.max.xiaoheihe.accelworld.l.c(4.0f, context);
            linearLayout.setLayoutParams(marginLayoutParams);
            this.f89682a0 = linearLayout;
        }
        View view = this.f89682a0;
        kotlin.jvm.internal.f0.m(view);
        return view;
    }

    public static final /* synthetic */ void C4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40472, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.K5();
    }

    @SuppressLint({"AutoDispose"})
    private final void C5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40406, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K1(PaymentManager.A, G5(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    public static final /* synthetic */ String D4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40471, new Class[]{MallPurchaseDetailDialogFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : mallPurchaseDetailDialogFragment.L5();
    }

    private final String D5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40389, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        MallCouponObj mallCouponObj = this.f89698x;
        if (mallCouponObj != null) {
            return mallCouponObj.getCoupon_id();
        }
        return null;
    }

    private final String E5(String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 40400, new Class[]{String.class, String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f89697w == null) {
            return null;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        mallRegisterOrderObj.setSession(com.max.hbutils.utils.n.r(purchaseParamResultObj != null ? purchaseParamResultObj.getSession() : null));
        mallRegisterOrderObj.setParams(new ArrayList());
        MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
        mallOrderParamObj.setCount(this.C);
        mallOrderParamObj.setCat_value(com.max.hbutils.utils.n.r(str));
        mallOrderParamObj.setBuy_type(str2);
        mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(str3));
        mallRegisterOrderObj.getParams().add(mallOrderParamObj);
        return com.max.hbutils.utils.k.p(mallRegisterOrderObj);
    }

    private final String F5(String str, String str2, String str3, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40399, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f89697w == null) {
            return null;
        }
        MallRegisterOrderObj mallRegisterOrderObj = new MallRegisterOrderObj();
        mallRegisterOrderObj.setBuy_type(str);
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        mallRegisterOrderObj.setSession(com.max.hbutils.utils.n.r(purchaseParamResultObj != null ? purchaseParamResultObj.getSession() : null));
        mallRegisterOrderObj.setParams(new ArrayList());
        MallOrderParamObj mallOrderParamObj = new MallOrderParamObj();
        mallOrderParamObj.setCount(1);
        mallOrderParamObj.setCat_value(com.max.hbutils.utils.n.r(str2));
        mallOrderParamObj.setSku_id(com.max.hbutils.utils.n.r(str3));
        mallRegisterOrderObj.getParams().add(mallOrderParamObj);
        mallRegisterOrderObj.setAppid(this.f89691q);
        if (z10) {
            mallRegisterOrderObj.setSale_state("2");
        }
        return com.max.hbutils.utils.k.p(mallRegisterOrderObj);
    }

    private final Map<String, String> G5(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40411, new Class[]{String.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        String str2 = this.I;
        kotlin.jvm.internal.f0.m(str2);
        map.put("order_id", str2);
        map.put("order_type", "mall");
        if (str != null) {
            map.put("pay_price", str);
        }
        String strD5 = D5();
        if (strD5 != null) {
            map.put("coupon_id", strD5);
        }
        String str3 = this.f89699y;
        if (str3 != null) {
            map.put("deduct_coin", str3);
        }
        return map;
    }

    public static final /* synthetic */ void H4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, PayPriceResultObj payPriceResultObj) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, payPriceResultObj}, null, changeQuickRedirect, true, 40476, new Class[]{MallPurchaseDetailDialogFragment.class, PayPriceResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.U5(payPriceResultObj);
    }

    @SuppressLint({"AutoDispose"})
    private final void H5(String str, long j10) {
        BuyTypeValueObj selectedBuyTypeValue;
        if (PatchProxy.proxy(new Object[]{str, new Long(j10)}, this, changeQuickRedirect, false, 40398, new Class[]{String.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        MallCouponObj mallCouponObj = new MallCouponObj();
        this.f89698x = mallCouponObj;
        mallCouponObj.setCoupon_id(str);
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        BuyTypeValueObj selectedBuyTypeValue2 = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().u9(selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getItem_id() : null, selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getCat_value() : null, this.C, str, j10, this.f89696v, this.f89695u, !com.max.hbcommon.utils.c.u((purchaseParamResultObj2 == null || (selectedBuyTypeValue = purchaseParamResultObj2.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getGroup_purchase_desc())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    public static final /* synthetic */ void I4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, PurchaseParamResultObj purchaseParamResultObj) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, purchaseParamResultObj}, null, changeQuickRedirect, true, 40474, new Class[]{MallPurchaseDetailDialogFragment.class, PurchaseParamResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.V5(purchaseParamResultObj);
    }

    private final long[] I5() {
        PurchaseWalletObj wallet;
        DeductInfoObj deduct_info;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40427, new Class[0], long[].class);
        if (patchProxyResultProxy.isSupported) {
            return (long[]) patchProxyResultProxy.result;
        }
        long[] jArr = new long[2];
        PayPriceResultObj payPriceResultObj = this.F;
        String hcoin = null;
        String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(payPriceResultObj != null ? payPriceResultObj.getPay_price() : null) + com.max.hbutils.utils.n.r(this.f89699y));
        PurchasePreviewResultObj purchasePreviewResultObj = this.E;
        long jR = com.max.hbutils.utils.n.r((purchasePreviewResultObj == null || (deduct_info = purchasePreviewResultObj.getDeduct_info()) == null) ? null : deduct_info.getMax_deduct_coin());
        if (jR < 0) {
            jArr[0] = com.max.hbutils.utils.n.r(strValueOf);
        } else {
            jArr[0] = Math.min(com.max.hbutils.utils.n.r(strValueOf), jR);
        }
        PurchasePreviewResultObj purchasePreviewResultObj2 = this.E;
        if (purchasePreviewResultObj2 != null && (wallet = purchasePreviewResultObj2.getWallet()) != null) {
            hcoin = wallet.getHcoin();
        }
        jArr[1] = Math.min(com.max.hbutils.utils.n.r(hcoin), jArr[0]);
        return jArr;
    }

    public static final /* synthetic */ void J4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, PurchasePreviewResultObj purchasePreviewResultObj) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, purchasePreviewResultObj}, null, changeQuickRedirect, true, 40475, new Class[]{MallPurchaseDetailDialogFragment.class, PurchasePreviewResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.W5(purchasePreviewResultObj);
    }

    @SuppressLint({"AutoDispose"})
    private final void J5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40396, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J3(this.f89691q, this.f89693s, this.f89692r, this.f89696v, this.f89695u).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k()));
    }

    public static final /* synthetic */ void K4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40468, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.X5();
    }

    @SuppressLint({"AutoDispose"})
    private final void K5() {
        BuyTypeValueObj selectedBuyTypeValue;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40397, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        BuyTypeValueObj selectedBuyTypeValue2 = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().E0(selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getItem_id() : null, selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getCat_value() : null, this.C, this.f89696v, this.f89695u, !com.max.hbcommon.utils.c.u((purchaseParamResultObj2 == null || (selectedBuyTypeValue = purchaseParamResultObj2.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getGroup_purchase_desc())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<PurchasePreviewResultObj>>() { // from class: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$getPurchasePreview$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40527, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89739b.isActive()) {
                    super.onError(e10);
                    MallPurchaseDetailDialogFragment.W3(this.f89739b);
                }
            }

            public void onNext(@dl.d Result<PurchasePreviewResultObj> t10) {
                if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 40528, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(t10, "t");
                if (this.f89739b.isActive()) {
                    super.onNext(t10);
                    PurchasePreviewResultObj result = t10.getResult();
                    if (result != null) {
                        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new MallPurchaseDetailDialogFragment$getPurchasePreview$1$onNext$1$1(this.f89739b, result, null), 3, null);
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40529, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<PurchasePreviewResultObj>) obj);
            }
        }));
    }

    public static final /* synthetic */ void L4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40482, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.Y5();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final String L5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40408, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.D;
        if (str != null) {
            switch (str.hashCode()) {
                case -1414960566:
                    if (str.equals(PaymentManager.f71422u)) {
                        return PaymentManager.f71427z;
                    }
                    break;
                case -791770330:
                    if (str.equals("wechat")) {
                        return PaymentManager.f71426y;
                    }
                    break;
                case -339185956:
                    if (str.equals("balance")) {
                        return PaymentManager.A;
                    }
                    break;
                case 825497556:
                    if (str.equals("lianlian")) {
                        return "lianlian";
                    }
                    break;
            }
        }
        return null;
    }

    public static final /* synthetic */ void M4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40487, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.Z5();
    }

    private final void M5(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40409, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        r5();
        dismiss();
        try {
            if (!z10) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
                String str = this.I;
                kotlin.jvm.internal.f0.m(str);
                com.max.xiaoheihe.base.router.b.R(fragmentActivityRequireActivity, str, true).A();
            } else if (z11) {
                FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity2, "requireActivity()");
                String str2 = this.I;
                kotlin.jvm.internal.f0.m(str2);
                com.max.xiaoheihe.base.router.b.E(fragmentActivityRequireActivity2, str2).A();
            } else {
                FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
                kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity3, "requireActivity()");
                String str3 = this.I;
                kotlin.jvm.internal.f0.m(str3);
                com.max.xiaoheihe.base.router.b.D(fragmentActivityRequireActivity3, str3).A();
            }
        } catch (Throwable unused) {
        }
    }

    public static final /* synthetic */ void N4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str, String str2, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40470, new Class[]{MallPurchaseDetailDialogFragment.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.a6(str, str2, i10, z10);
    }

    static /* synthetic */ void N5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, boolean z10, boolean z11, int i10, Object obj) {
        BuyTypeValueObj selectedBuyTypeValue;
        Object[] objArr = {mallPurchaseDetailDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 40410, new Class[]{MallPurchaseDetailDialogFragment.class, cls, cls, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            PurchaseParamResultObj purchaseParamResultObj = mallPurchaseDetailDialogFragment.f89697w;
            z10 = (purchaseParamResultObj == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) ? false : kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCart_enable(), Boolean.TRUE);
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        mallPurchaseDetailDialogFragment.M5(z10, z11);
    }

    public static final /* synthetic */ void O4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40495, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.c6();
    }

    public static final /* synthetic */ void P4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40492, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.d6();
    }

    private final void P5(List<GroupBuyInfoObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 40416, new Class[]{List.class}, Void.TYPE).isSupported || getContext() == null) {
            return;
        }
        g5 g5Var = this.f89687m;
        g5 g5Var2 = null;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        g5Var.f110807u.removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            return;
        }
        for (GroupBuyInfoObj groupBuyInfoObj : list) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
            ao aoVarC = ao.c(kb.c.d(contextRequireContext));
            kotlin.jvm.internal.f0.o(aoVarC, "inflate(requireContext().layoutInflater())");
            List<GroupBuyUserInfoObj> user_info = groupBuyInfoObj.getUser_info();
            if (user_info != null) {
                int size = user_info.size();
                String str = "";
                for (int i10 = 0; i10 < size; i10++) {
                    aoVarC.f108599b.addView(z5(i10, user_info.get(i10).getUser_image()));
                    if (i10 > 0) {
                        str = str + (char) 65292;
                    }
                    str = str + user_info.get(i10).getUser_name();
                }
                aoVarC.f108599b.addView(Q5(this, str));
            }
            aoVarC.f108601d.setText(groupBuyInfoObj.getPast_group_time_desc());
            if (!com.max.hbcommon.utils.c.u(groupBuyInfoObj.getPast_group_game_desc())) {
                aoVarC.f108600c.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
                aoVarC.f108600c.setText(groupBuyInfoObj.getPast_group_game_desc());
            }
            aoVarC.b().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            g5 g5Var3 = this.f89687m;
            if (g5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var3 = null;
            }
            g5Var3.f110807u.addView(aoVarC.b());
        }
        if (list.size() > 1) {
            g5 g5Var4 = this.f89687m;
            if (g5Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var4 = null;
            }
            g5Var4.f110807u.setScrollBarFadeDuration(500);
            g5 g5Var5 = this.f89687m;
            if (g5Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var5 = null;
            }
            g5Var5.f110807u.setFlipInterval(1500);
            g5 g5Var6 = this.f89687m;
            if (g5Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var2 = g5Var6;
            }
            g5Var2.f110807u.startFlipping();
        }
    }

    public static final /* synthetic */ void Q4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40484, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.f6();
    }

    private static final TextView Q5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, str}, null, changeQuickRedirect, true, 40462, new Class[]{MallPurchaseDetailDialogFragment.class, String.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(mallPurchaseDetailDialogFragment.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context = textView.getContext();
        kotlin.jvm.internal.f0.o(context, "context");
        layoutParams.setMarginStart(com.max.xiaoheihe.accelworld.l.c(6.0f, context));
        textView.setLayoutParams(layoutParams);
        textView.setText(str);
        textView.setMaxLines(1);
        textView.setTextSize(1, 12.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        Context context2 = textView.getContext();
        kotlin.jvm.internal.f0.o(context2, "context");
        textView.setMaxWidth(com.max.xiaoheihe.accelworld.l.c(120.0f, context2));
        return textView;
    }

    public static final /* synthetic */ void R4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40496, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.k6();
    }

    private final boolean R5() {
        return this.f89694t != null;
    }

    public static final /* synthetic */ void S4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40490, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.o6();
    }

    @dl.d
    @xh.m
    public static final MallPurchaseDetailDialogFragment S5(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40463, new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.TYPE}, MallPurchaseDetailDialogFragment.class);
        return patchProxyResultProxy.isSupported ? (MallPurchaseDetailDialogFragment) patchProxyResultProxy.result : f89678c0.a(str, str2, str3, str4, str5, z10);
    }

    @dl.d
    @xh.m
    public static final MallPurchaseDetailDialogFragment T5(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 40464, new Class[]{String.class, String.class, String.class, String.class, String.class}, MallPurchaseDetailDialogFragment.class);
        return patchProxyResultProxy.isSupported ? (MallPurchaseDetailDialogFragment) patchProxyResultProxy.result : f89678c0.b(str, str2, str3, str4, str5);
    }

    private final void U5(PayPriceResultObj payPriceResultObj) {
        if (PatchProxy.proxy(new Object[]{payPriceResultObj}, this, changeQuickRedirect, false, 40421, new Class[]{PayPriceResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.F = payPriceResultObj;
        if (payPriceResultObj != null) {
            g5 g5Var = this.f89687m;
            g5 g5Var2 = null;
            if (g5Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var = null;
            }
            g5Var.f110806t.setData(payPriceResultObj.getPay_price_rmb(), com.max.xiaoheihe.module.mall.o.f(com.max.hbutils.utils.n.r(payPriceResultObj.getDiscount_total()), true), payPriceResultObj.getDiscount_desc());
            g5 g5Var3 = this.f89687m;
            if (g5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var3 = null;
            }
            g5Var3.f110806t.getTvCouponDesc().setOnClickListener(new l(payPriceResultObj, this));
            g5 g5Var4 = this.f89687m;
            if (g5Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var4 = null;
            }
            TextView textView = g5Var4.C.f116698l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((char) 65509);
            PayPriceResultObj payPriceResultObj2 = this.F;
            long jR = com.max.hbutils.utils.n.r(payPriceResultObj2 != null ? payPriceResultObj2.getPay_price() : null);
            PayPriceResultObj payPriceResultObj3 = this.F;
            sb2.append(com.max.xiaoheihe.module.mall.o.f(jR + com.max.hbutils.utils.n.r(payPriceResultObj3 != null ? payPriceResultObj3.getDiscount_total() : null), true));
            textView.setText(sb2.toString());
            g5 g5Var5 = this.f89687m;
            if (g5Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var2 = g5Var5;
            }
            g5Var2.C.f116693g.setPrice(payPriceResultObj.getPay_price_rmb());
            q5();
            d6();
            e6();
            f6();
        }
    }

    public static final /* synthetic */ void V3(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40494, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.q5();
    }

    private final void V5(PurchaseParamResultObj purchaseParamResultObj) {
        PurchaseBaseInfoObj base_info;
        PurchaseParamObj params;
        if (PatchProxy.proxy(new Object[]{purchaseParamResultObj}, this, changeQuickRedirect, false, 40413, new Class[]{PurchaseParamResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List[] listArr = new List[1];
        g5 g5Var = null;
        listArr[0] = (purchaseParamResultObj == null || (base_info = purchaseParamResultObj.getBase_info()) == null || (params = base_info.getParams()) == null) ? null : params.getValues();
        if (com.max.hbcommon.utils.c.w(listArr)) {
            r5();
            dismiss();
            return;
        }
        if (purchaseParamResultObj != null) {
            this.f89697w = purchaseParamResultObj;
            j6();
            PurchaseValueObj selectedParam = purchaseParamResultObj.getSelectedParam();
            if (selectedParam != null) {
                this.Y = System.currentTimeMillis();
                g5 g5Var2 = this.f89687m;
                if (g5Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var2 = null;
                }
                ViewGroup.LayoutParams layoutParams = g5Var2.f110789c.b().getLayoutParams();
                g5 g5Var3 = this.f89687m;
                if (g5Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var3 = null;
                }
                ViewGroup.LayoutParams layoutParams2 = g5Var3.f110789c.f112451c.getLayoutParams();
                if (kotlin.jvm.internal.f0.g("game", selectedParam.getCategory())) {
                    layoutParams.width = ViewUtils.f(getContext(), 160.0f);
                    layoutParams.height = ViewUtils.f(getContext(), 80.0f);
                    layoutParams2.width = ViewUtils.f(getContext(), 160.0f);
                    layoutParams2.height = ViewUtils.f(getContext(), 80.0f);
                } else {
                    layoutParams.width = ViewUtils.f(getContext(), 80.0f);
                    layoutParams.height = ViewUtils.f(getContext(), 80.0f);
                    layoutParams2.width = ViewUtils.f(getContext(), 80.0f);
                    layoutParams2.height = ViewUtils.f(getContext(), 80.0f);
                }
                g5 g5Var4 = this.f89687m;
                if (g5Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var4 = null;
                }
                g5Var4.f110789c.b().setLayoutParams(layoutParams);
                g5 g5Var5 = this.f89687m;
                if (g5Var5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var5 = null;
                }
                g5Var5.f110789c.f112451c.setLayoutParams(layoutParams2);
                g5 g5Var6 = this.f89687m;
                if (g5Var6 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    g5Var = g5Var6;
                }
                g5Var.f110789c.f112451c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                q5();
                l6();
                g6();
            }
        }
    }

    public static final /* synthetic */ void W3(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40465, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.r5();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void W5(PurchasePreviewResultObj purchasePreviewResultObj) {
        String string;
        String title;
        int iIndexOf = 0;
        if (PatchProxy.proxy(new Object[]{purchasePreviewResultObj}, this, changeQuickRedirect, false, 40418, new Class[]{PurchasePreviewResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        q5();
        h6();
        b6();
        this.E = purchasePreviewResultObj;
        if (purchasePreviewResultObj != null) {
            if (com.max.hbcommon.utils.c.u(purchasePreviewResultObj != null ? purchasePreviewResultObj.getAgreement_title() : null)) {
                g5 g5Var = this.f89687m;
                if (g5Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var = null;
                }
                g5Var.f110804r.setVisibility(8);
            } else {
                g5 g5Var2 = this.f89687m;
                if (g5Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var2 = null;
                }
                g5Var2.f110804r.setVisibility(0);
                g5 g5Var3 = this.f89687m;
                if (g5Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var3 = null;
                }
                TextView textView = g5Var3.f110804r;
                PurchasePreviewResultObj purchasePreviewResultObj2 = this.E;
                textView.setText(purchasePreviewResultObj2 != null ? purchasePreviewResultObj2.getAgreement_title() : null);
                g5 g5Var4 = this.f89687m;
                if (g5Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var4 = null;
                }
                g5Var4.f110804r.setOnClickListener(new m());
            }
            g5 g5Var5 = this.f89687m;
            if (g5Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var5 = null;
            }
            g5Var5.f110806t.setVisibility(0);
            g5 g5Var6 = this.f89687m;
            if (g5Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var6 = null;
            }
            g5Var6.A.setVisibility(0);
            g5 g5Var7 = this.f89687m;
            if (g5Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var7 = null;
            }
            g5Var7.B.f113529c.setText("选择支付方式");
            if (purchasePreviewResultObj.getPay_protocol() != null) {
                g5 g5Var8 = this.f89687m;
                if (g5Var8 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var8 = null;
                }
                TextView textView2 = g5Var8.B.f113528b;
                KeyDescObj pay_protocol = purchasePreviewResultObj.getPay_protocol();
                if (pay_protocol == null || (title = pay_protocol.getTitle()) == null) {
                    title = "支付须知";
                }
                textView2.setText(title);
                g5 g5Var9 = this.f89687m;
                if (g5Var9 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var9 = null;
                }
                g5Var9.B.f113528b.setVisibility(0);
                g5 g5Var10 = this.f89687m;
                if (g5Var10 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var10 = null;
                }
                g5Var10.B.f113528b.setOnClickListener(new n(purchasePreviewResultObj));
            } else {
                g5 g5Var11 = this.f89687m;
                if (g5Var11 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var11 = null;
                }
                g5Var11.B.f113528b.setVisibility(8);
            }
            List<PayTypeInfoObj> payment_list = purchasePreviewResultObj.getPayment_list();
            if (payment_list != null) {
                if (com.max.hbcommon.utils.c.u(this.D) || !purchasePreviewResultObj.hasPaymentType(this.D)) {
                    SuggestDiscountInfo choose_discount_info = purchasePreviewResultObj.getChoose_discount_info();
                    this.D = choose_discount_info != null ? choose_discount_info.getPayment() : null;
                }
                u5();
                g5 g5Var12 = this.f89687m;
                if (g5Var12 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var12 = null;
                }
                g5Var12.f110797k.setLayoutManager(new FlexboxLayoutManager(getContext()));
                ArrayList arrayList = new ArrayList();
                for (PayTypeInfoObj payTypeInfoObj : payment_list) {
                    String pay_type = payTypeInfoObj.getPay_type();
                    if (pay_type != null) {
                        switch (pay_type.hashCode()) {
                            case -1414960566:
                                if (pay_type.equals(PaymentManager.f71422u)) {
                                    arrayList.add(new PurchaseCheckObj("支付宝", Integer.valueOf(R.drawable.common_alipay_38x38), Boolean.TRUE, Boolean.valueOf(kotlin.jvm.internal.f0.g(this.D, payTypeInfoObj.getPay_type())), null, payTypeInfoObj.getPay_type(), null, null, null, bb.c.b.G5, null));
                                }
                                break;
                            case -791770330:
                                if (pay_type.equals("wechat")) {
                                    arrayList.add(new PurchaseCheckObj("微信", Integer.valueOf(R.drawable.weixinpay), Boolean.TRUE, Boolean.valueOf(kotlin.jvm.internal.f0.g(this.D, payTypeInfoObj.getPay_type())), null, payTypeInfoObj.getPay_type(), null, null, null, bb.c.b.G5, null));
                                    if (kotlin.jvm.internal.f0.g(this.D, payTypeInfoObj.getPay_type())) {
                                        iIndexOf = payment_list.indexOf(payTypeInfoObj);
                                    }
                                }
                                break;
                            case -339185956:
                                if (pay_type.equals("balance")) {
                                    PurchaseWalletObj wallet = purchasePreviewResultObj.getWallet();
                                    if (com.max.hbutils.utils.n.q(wallet != null ? wallet.getHbalance() : null) > 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("黑盒余额 ￥");
                                        PurchaseWalletObj wallet2 = purchasePreviewResultObj.getWallet();
                                        sb2.append(com.max.hbutils.utils.n.q(wallet2 != null ? wallet2.getHbalance() : null) / 100.0f);
                                        string = sb2.toString();
                                    } else {
                                        string = "黑盒余额";
                                    }
                                    arrayList.add(new PurchaseCheckObj(string, Integer.valueOf(R.drawable.common_heybox_logo_black_16x16), Boolean.TRUE, Boolean.valueOf(kotlin.jvm.internal.f0.g(this.D, payTypeInfoObj.getPay_type())), null, payTypeInfoObj.getPay_type(), null, null, null, bb.c.b.G5, null));
                                }
                                break;
                            case 825497556:
                                if (pay_type.equals("lianlian")) {
                                    arrayList.add(new PurchaseCheckObj("连连", Integer.valueOf(R.drawable.mall_pay_lianlian_50x50), Boolean.TRUE, Boolean.valueOf(kotlin.jvm.internal.f0.g(this.D, payTypeInfoObj.getPay_type())), null, payTypeInfoObj.getPay_type(), null, null, null, bb.c.b.G5, null));
                                }
                                break;
                        }
                    }
                }
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
                PurchaseCheckedAdapter purchaseCheckedAdapter = new PurchaseCheckedAdapter(fragmentActivityRequireActivity, arrayList, new o(arrayList));
                purchaseCheckedAdapter.q(iIndexOf);
                g5 g5Var13 = this.f89687m;
                if (g5Var13 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var13 = null;
                }
                g5Var13.f110797k.setAdapter(purchaseCheckedAdapter);
                purchaseCheckedAdapter.notifyDataSetChanged();
            }
            g5 g5Var14 = this.f89687m;
            if (g5Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var14 = null;
            }
            g5Var14.f110806t.setOnClickListener(new p());
            g5 g5Var15 = this.f89687m;
            if (g5Var15 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var15 = null;
            }
            g5Var15.E.setOnClickListener(new q());
            g5 g5Var16 = this.f89687m;
            if (g5Var16 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var16 = null;
            }
            g5Var16.D.setOnClickListener(null);
        }
    }

    public static final /* synthetic */ void X3(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40479, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.t5();
    }

    @SuppressLint({"AutoDispose"})
    private final void X5() {
        io.reactivex.z<Result<MallPurchaseResultObj>> zVarW1;
        KeyDescObj type;
        KeyDescObj type2;
        BuyTypeValueObj selectedBuyTypeValue;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r6();
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        BuyTypeValueObj selectedBuyTypeValue2 = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
        boolean zG = kotlin.jvm.internal.f0.g(selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getCategory() : null, BuyTypeValueObj.CATEGORY_PHYSICAL_MALL_TYPE);
        boolean zG2 = selectedBuyTypeValue2 != null ? kotlin.jvm.internal.f0.g(selectedBuyTypeValue2.getCart_enable(), Boolean.TRUE) : false;
        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
        boolean z10 = !com.max.hbcommon.utils.c.u((purchaseParamResultObj2 == null || (selectedBuyTypeValue = purchaseParamResultObj2.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getGroup_purchase_desc());
        if (zG2 || zG) {
            zVarW1 = com.max.xiaoheihe.network.i.a().W1(E5(selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getCat_value() : null, (selectedBuyTypeValue2 == null || (type = selectedBuyTypeValue2.getType()) == null) ? null : type.getKey(), selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getItem_id() : null), this.f89690p, this.f89696v, this.f89695u, z10);
            kotlin.jvm.internal.f0.o(zVarW1, "{\n            ServiceGen…              )\n        }");
        } else {
            zVarW1 = com.max.xiaoheihe.network.i.a().Nb(F5((selectedBuyTypeValue2 == null || (type2 = selectedBuyTypeValue2.getType()) == null) ? null : type2.getKey(), selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getCat_value() : null, selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getItem_id() : null, kotlin.jvm.internal.f0.g("2", selectedBuyTypeValue2 != null ? selectedBuyTypeValue2.getSale_state() : null)), this.f89690p);
            kotlin.jvm.internal.f0.o(zVarW1, "{\n            val isPreP…              )\n        }");
        }
        addDisposable((io.reactivex.disposables.b) zVarW1.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t(zG, zG2)));
    }

    public static final /* synthetic */ boolean Y3(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40489, new Class[]{MallPurchaseDetailDialogFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallPurchaseDetailDialogFragment.u5();
    }

    @SuppressLint({"AutoDispose"})
    private final void Y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40407, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        y6();
        String str = !com.max.hbcommon.utils.c.u(this.J) ? this.J : null;
        MallPriceObj mallPriceObj = this.H;
        String pay_price = mallPriceObj != null ? mallPriceObj.getPay_price() : null;
        kotlin.jvm.internal.f0.m(pay_price);
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Rb(this.I, D5(), null, pay_price, this.f89699y, str, com.max.hbutils.utils.n.q(pay_price) == 0 ? PaymentManager.A : L5(), new HashMap()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<MallOrderDetailObj>>() { // from class: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$pay$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40553, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89772b.isActive()) {
                    super.onError(e10);
                    this.f89772b.J = null;
                    MallPurchaseDetailDialogFragment.N5(this.f89772b, false, false, 3, null);
                }
            }

            public void onNext(@dl.d Result<MallOrderDetailObj> result) {
                BuyTypeValueObj selectedBuyTypeValue;
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40554, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89772b.isActive()) {
                    super.onNext(result);
                    this.f89772b.J = null;
                    MallOrderDetailObj result2 = result.getResult();
                    Intent intent = new Intent(lb.a.A);
                    intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                    FragmentActivity activity = this.f89772b.getActivity();
                    if (activity != null) {
                        activity.sendBroadcast(intent);
                    }
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    OrderEvent orderEvent = OrderEvent.SUCCESS;
                    String str2 = this.f89772b.f89691q;
                    String str3 = this.f89772b.f89693s;
                    PurchaseParamResultObj purchaseParamResultObj = this.f89772b.f89697w;
                    String item_id = (purchaseParamResultObj == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getItem_id();
                    String str4 = this.f89772b.I;
                    String str5 = this.f89772b.f89690p;
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("is_grouping", Boolean.valueOf(this.f89772b.f89696v));
                    b2 b2Var = b2.f124493a;
                    mallCartUtils.v(orderEvent, str2, str3, item_id, str4, str5, jsonObject);
                    if (com.max.hbcommon.utils.c.x(result2 != null ? result2.getFirst_order_pay_pass() : null)) {
                        com.max.xiaoheihe.module.account.paysetting.a aVar = com.max.xiaoheihe.module.account.paysetting.a.f79140a;
                        FragmentActivity fragmentActivityRequireActivity = this.f89772b.requireActivity();
                        f0.o(fragmentActivityRequireActivity, "requireActivity()");
                        aVar.e(fragmentActivityRequireActivity, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$pay$1$onNext$2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40557, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40556, new Class[0], Void.TYPE).isSupported) {
                                    return;
                                }
                                com.max.xiaoheihe.module.account.paysetting.a.f79140a.c();
                            }
                        });
                    }
                    MallPurchaseDetailDialogFragment.N5(this.f89772b, false, true, 1, null);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40555, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<MallOrderDetailObj>) obj);
            }
        }));
    }

    public static final /* synthetic */ void Z3(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40480, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.v5();
    }

    private final void Z5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40441, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.mall.o.c(getActivity(), new com.max.xiaoheihe.utils.l0.g() { // from class: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$purchase$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$purchase$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: MallPurchaseDetailDialogFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$purchase$1$1", f = "MallPurchaseDetailDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f89775b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MallPurchaseDetailDialogFragment f89776c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f89776c = mallPurchaseDetailDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 40560, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f89776c, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40562, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 40561, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40559, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f89775b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                    MallPurchaseDetailDialogFragment.l5(this.f89776c);
                    return b2.f124493a;
                }
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public final void a() {
                BuyTypeValueObj selectedBuyTypeValue;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40558, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                PurchaseParamResultObj purchaseParamResultObj = this.f89774a.f89697w;
                boolean zG = f0.g((purchaseParamResultObj == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) ? null : selectedBuyTypeValue.getCategory(), BuyTypeValueObj.CATEGORY_PHYSICAL_MALL_TYPE);
                if (this.f89774a.D == null && !zG) {
                    com.max.hbutils.utils.c.d(this.f89774a.getString(R.string.dialog_stp_menu_title));
                } else if (MallPurchaseDetailDialogFragment.Y3(this.f89774a)) {
                    MallPurchaseDetailDialogFragment.S4(this.f89774a);
                    kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new AnonymousClass1(this.f89774a, null), 3, null);
                }
            }
        });
    }

    public static final /* synthetic */ void a4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40485, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.y5();
    }

    private final void a6(String str, String str2, int i10, boolean z10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40428, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(this.f89686l + "   queryOutOrder  out_trade_no: " + str + "   mInQuery: " + this.K);
        if (str == null || this.K) {
            return;
        }
        this.K = true;
        ProgressDialog progressDialog = this.R;
        PaymentManager paymentManager = null;
        if (progressDialog == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
            progressDialog = null;
        }
        progressDialog.setMessage("正在检测订单状态...");
        ProgressDialog progressDialog2 = this.R;
        if (progressDialog2 == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
            progressDialog2 = null;
        }
        if (!progressDialog2.isShowing() && z10) {
            ProgressDialog progressDialog3 = this.R;
            if (progressDialog3 == null) {
                kotlin.jvm.internal.f0.S("payLoadingDialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
        }
        PaymentManager paymentManager2 = this.Q;
        if (paymentManager2 == null) {
            kotlin.jvm.internal.f0.S("mPaymentManager");
        } else {
            paymentManager = paymentManager2;
        }
        io.reactivex.z<Result<WeixinQueryObj>> zVarC = paymentManager.C(str2, str, z10 ? "1" : "0");
        if (z10) {
            j10 = 0;
        } else {
            j10 = i10 < 10 ? 2L : 4L;
        }
        this.S.c((io.reactivex.disposables.b) zVarC.C1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new u(z10, i10, str, str2)));
    }

    private final void b6() {
        ViewGroup viewGroup;
        BulkPayObj bulk_pay;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40436, new Class[0], Void.TYPE).isSupported || (viewGroup = this.f89688n) == null) {
            return;
        }
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        BuyTypeValueObj selectedBuyTypeValue = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
        if (!R5()) {
            if ((selectedBuyTypeValue == null || (bulk_pay = selectedBuyTypeValue.getBulk_pay()) == null) ? false : kotlin.jvm.internal.f0.g(bulk_pay.getEnable(), Boolean.TRUE)) {
                viewGroup.setVisibility(0);
                ((TextView) viewGroup.findViewById(R.id.tv_cnt)).setText(String.valueOf(this.C));
                View viewFindViewById = viewGroup.findViewById(R.id.tv_desc);
                kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById;
                BulkPayObj bulk_pay2 = selectedBuyTypeValue.getBulk_pay();
                textView.setText(bulk_pay2 != null ? bulk_pay2.getDesc() : null);
                return;
            }
        }
        viewGroup.setVisibility(8);
    }

    private final void c6() {
        PurchaseParamResultObj purchaseParamResultObj;
        PurchaseValueObj selectedParam;
        BuyTypeObj buy_types;
        int iIndexOf = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40431, new Class[0], Void.TYPE).isSupported || (purchaseParamResultObj = this.f89697w) == null || (selectedParam = purchaseParamResultObj.getSelectedParam()) == null || (buy_types = selectedParam.getBuy_types()) == null) {
            return;
        }
        BuyTypeValueObj selected = buy_types.getSelected();
        if (selected != null) {
            if (selected.getFaq_protocol() != null) {
                g5 g5Var = this.f89687m;
                if (g5Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var = null;
                }
                g5Var.f110811y.f113528b.setVisibility(0);
                g5 g5Var2 = this.f89687m;
                if (g5Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var2 = null;
                }
                TextView textView = g5Var2.f110811y.f113528b;
                KeyDescObj faq_protocol = selected.getFaq_protocol();
                textView.setText(faq_protocol != null ? faq_protocol.getTitle() : null);
                g5 g5Var3 = this.f89687m;
                if (g5Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var3 = null;
                }
                g5Var3.f110811y.f113528b.setOnClickListener(new v(selected, this));
            } else {
                g5 g5Var4 = this.f89687m;
                if (g5Var4 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var4 = null;
                }
                g5Var4.f110811y.f113528b.setVisibility(8);
            }
        }
        g5 g5Var5 = this.f89687m;
        if (g5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var5 = null;
        }
        g5Var5.f110809w.f113529c.setText(buy_types.getTitle());
        g5 g5Var6 = this.f89687m;
        if (g5Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var6 = null;
        }
        g5Var6.f110809w.f113528b.setVisibility(8);
        List<BuyTypeValueObj> values = buy_types.getValues();
        if (values != null) {
            g5 g5Var7 = this.f89687m;
            if (g5Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var7 = null;
            }
            g5Var7.f110795i.setLayoutManager(new FlexboxLayoutManager(getContext()));
            ArrayList arrayList = new ArrayList();
            for (BuyTypeValueObj buyTypeValueObj : values) {
                if (kotlin.jvm.internal.f0.g(buyTypeValueObj.getSelected(), Boolean.TRUE)) {
                    iIndexOf = values.indexOf(buyTypeValueObj);
                }
                arrayList.add(new PurchaseCheckObj(buyTypeValueObj.getName(), null, buyTypeValueObj.getEnable(), buyTypeValueObj.getSelected(), buyTypeValueObj.getEnable_notify(), null, null, null, null, 480, null));
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
            PurchaseCheckedAdapter purchaseCheckedAdapter = new PurchaseCheckedAdapter(fragmentActivityRequireActivity, arrayList, new w(buy_types, values, this));
            purchaseCheckedAdapter.q(iIndexOf);
            g5 g5Var8 = this.f89687m;
            if (g5Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var8 = null;
            }
            g5Var8.f110795i.setAdapter(purchaseCheckedAdapter);
            purchaseCheckedAdapter.notifyDataSetChanged();
        }
        k6();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d6  */
    private final void d6() {
        boolean z10;
        g5 g5Var;
        String pay_price_rmb;
        String str;
        int i10;
        String str2;
        String str3;
        String pay_price_rmb2;
        View viewB5;
        List<String> group_button_user_image;
        KeyDescObj type;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40440, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g5 g5Var2 = this.f89687m;
        if (g5Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var2 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = g5Var2.f110788b;
        kotlin.jvm.internal.f0.o(bottomButtonLeftItemView, "binding.bottomButton");
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        BuyTypeValueObj selectedBuyTypeValue = purchaseParamResultObj != null ? purchaseParamResultObj.getSelectedBuyTypeValue() : null;
        String item_id = selectedBuyTypeValue != null ? selectedBuyTypeValue.getItem_id() : null;
        String key = (selectedBuyTypeValue == null || (type = selectedBuyTypeValue.getType()) == null) ? null : type.getKey();
        String cat_value = selectedBuyTypeValue != null ? selectedBuyTypeValue.getCat_value() : null;
        boolean z11 = (com.max.hbcommon.utils.c.u(item_id) || com.max.hbcommon.utils.c.u(key)) ? false : true;
        boolean zG = kotlin.jvm.internal.f0.g("2", selectedBuyTypeValue != null ? selectedBuyTypeValue.getSale_state() : null);
        if (selectedBuyTypeValue != null ? kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCart_enable(), Boolean.TRUE) : false) {
            if (selectedBuyTypeValue != null ? kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getBan_add_cart(), Boolean.TRUE) : false) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        bottomButtonLeftItemView.setShowLeftButton(false);
        bottomButtonLeftItemView.setShowRightButton(false);
        this.A = false;
        this.B = false;
        if (R5()) {
            p5(this, "确定", z10 ? BaseBottomButton.BaseBottomButtonStyle.BlackWhite : BaseBottomButton.BaseBottomButtonStyle.GrayWhite, z10, new f0(item_id, cat_value, this, key), null, false, 48, null);
        } else {
            if (selectedBuyTypeValue != null ? kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getEnable(), Boolean.TRUE) : false) {
                if (this.f89689o == null) {
                    MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
                    View viewH = mallCartUtils.h(fragmentActivityRequireActivity);
                    this.f89689o = viewH;
                    kotlin.jvm.internal.f0.m(viewH);
                    bottomButtonLeftItemView.b(viewH);
                } else {
                    MallCartUtils mallCartUtils2 = MallCartUtils.f90196a;
                    FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                    View view = this.f89689o;
                    kotlin.jvm.internal.f0.m(view);
                    mallCartUtils2.m(fragmentActivityRequireActivity2, view, false);
                }
                if (z10) {
                    BaseBottomButton.BaseBottomButtonStyle baseBottomButtonStyle = BaseBottomButton.BaseBottomButtonStyle.GrayBlack;
                    x xVar = new x(item_id, cat_value, key);
                    str = "预付 ￥";
                    i10 = R.dimen.text_size_17;
                    p5(this, "加入购物车", baseBottomButtonStyle, true, xVar, null, false, 48, null);
                } else {
                    str = "预付 ￥";
                    i10 = R.dimen.text_size_17;
                }
                if (kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCategory(), "mall")) {
                    boolean z12 = !com.max.hbcommon.utils.c.u(selectedBuyTypeValue.getGroup_purchase_desc());
                    if (z12) {
                        str2 = "￥";
                    } else {
                        str2 = !zG ? "支付 ￥" : str;
                    }
                    if (com.max.hbcommon.utils.c.u(selectedBuyTypeValue.getGroup_purchase_desc())) {
                        str3 = "";
                    } else {
                        str3 = ' ' + selectedBuyTypeValue.getGroup_purchase_desc();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    PayPriceResultObj payPriceResultObj = this.F;
                    if (payPriceResultObj == null || (pay_price_rmb2 = payPriceResultObj.getPay_price_rmb()) == null) {
                        pay_price_rmb2 = "";
                    }
                    sb2.append(pay_price_rmb2);
                    sb2.append(str3);
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    spannableString.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(1)), str2.length(), spannableString.length(), 33);
                    spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(i10)), str2.length(), spannableString.length() - str3.length(), 33);
                    if (z12) {
                        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
                        if (((purchaseParamResultObj2 == null || (group_button_user_image = purchaseParamResultObj2.getGroup_button_user_image()) == null) ? 0 : group_button_user_image.size()) > 0) {
                            PurchaseParamResultObj purchaseParamResultObj3 = this.f89697w;
                            List<String> group_button_user_image2 = purchaseParamResultObj3 != null ? purchaseParamResultObj3.getGroup_button_user_image() : null;
                            kotlin.jvm.internal.f0.m(group_button_user_image2);
                            viewB5 = B5(group_button_user_image2);
                        } else {
                            viewB5 = null;
                        }
                    } else {
                        viewB5 = null;
                    }
                    o5(spannableString, BaseBottomButton.BaseBottomButtonStyle.BlackWhite, z11, new y(), viewB5, z12);
                } else if (kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCategory(), BuyTypeValueObj.CATEGORYL_MALL_PROTOCOL_TYPE)) {
                    String btn_desc = selectedBuyTypeValue.getBtn_desc();
                    if (btn_desc == null) {
                        btn_desc = getString(R.string.buy_now);
                        kotlin.jvm.internal.f0.o(btn_desc, "getString(R.string.buy_now)");
                    }
                    p5(this, btn_desc, BaseBottomButton.BaseBottomButtonStyle.BlackWhite, !com.max.hbcommon.utils.c.u(selectedBuyTypeValue.getProtocol()), new z(selectedBuyTypeValue, this), null, false, 48, null);
                } else if (kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCategory(), BuyTypeValueObj.CATEGORY_PHYSICAL_MALL_TYPE)) {
                    String string = getString(R.string.buy_now);
                    kotlin.jvm.internal.f0.o(string, "getString(R.string.buy_now)");
                    p5(this, string, BaseBottomButton.BaseBottomButtonStyle.BlackWhite, z11, new a0(), null, false, 48, null);
                } else {
                    String string2 = getString(R.string.buy_now);
                    kotlin.jvm.internal.f0.o(string2, "getString(R.string.buy_now)");
                    p5(this, string2, BaseBottomButton.BaseBottomButtonStyle.BlackWhite, z11, new b0(selectedBuyTypeValue), null, false, 48, null);
                }
            } else {
                String enable_notify = selectedBuyTypeValue != null ? selectedBuyTypeValue.getEnable_notify() : null;
                if (kotlin.jvm.internal.f0.g(enable_notify, "1")) {
                    p5(this, "预约补货提醒", BaseBottomButton.BaseBottomButtonStyle.GrayBlack, true, new c0(item_id), null, false, 48, null);
                } else if (kotlin.jvm.internal.f0.g(enable_notify, "2")) {
                    p5(this, "已预约提醒", BaseBottomButton.BaseBottomButtonStyle.WhiteGray, true, new d0(item_id), null, false, 48, null);
                } else {
                    p5(this, "暂时缺货", BaseBottomButton.BaseBottomButtonStyle.BlackWhite, false, null, null, false, 48, null);
                }
                if (zG) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("预付 ￥");
                    PayPriceResultObj payPriceResultObj2 = this.F;
                    if (payPriceResultObj2 == null || (pay_price_rmb = payPriceResultObj2.getPay_price_rmb()) == null) {
                        pay_price_rmb = "";
                    }
                    sb3.append(pay_price_rmb);
                    SpannableString spannableString2 = new SpannableString(sb3.toString());
                    spannableString2.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(5)), 4, spannableString2.length(), 33);
                    spannableString2.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(R.dimen.text_size_17)), 4, spannableString2.length(), 33);
                    p5(this, spannableString2, BaseBottomButton.BaseBottomButtonStyle.BlackWhite, z11, new e0(), null, false, 48, null);
                }
            }
        }
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        } else {
            g5Var = g5Var3;
        }
        g5Var.f110788b.setVisibility(0);
    }

    public static final /* synthetic */ void e4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, str}, null, changeQuickRedirect, true, 40478, new Class[]{MallPurchaseDetailDialogFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.A5(str);
    }

    private final void e6() {
        PurchaseCouponInfoObj coupon_info;
        PurchaseCouponInfoObj coupon_info2;
        PurchaseCouponInfoObj coupon_info3;
        PurchaseCouponInfoObj coupon_info4;
        PurchaseCouponInfoObj coupon_info5;
        String coupon_value;
        PurchaseCouponInfoObj coupon_info6;
        String coupon_value2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40422, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g5 g5Var = null;
        strL2 = null;
        String strL2 = null;
        String string = null;
        g5 g5Var2 = null;
        g5 g5Var3 = null;
        g5 g5Var4 = null;
        g5 g5Var5 = null;
        if (!com.max.hbcommon.utils.c.u(this.J)) {
            if (D5() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("- ¥");
                PayPriceResultObj payPriceResultObj = this.F;
                if (payPriceResultObj != null && (coupon_value2 = payPriceResultObj.getCoupon_value()) != null) {
                    strL2 = kotlin.text.u.l2(coupon_value2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null);
                }
                sb2.append(r1.I(strL2));
                string = sb2.toString();
            }
            w5(string);
            return;
        }
        g5 g5Var6 = this.f89687m;
        if (g5Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var6 = null;
        }
        g5Var6.C.f116700n.setVisibility(0);
        g5 g5Var7 = this.f89687m;
        if (g5Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var7 = null;
        }
        g5Var7.C.f116689c.setArrowColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        PayPriceResultObj payPriceResultObj2 = this.F;
        if ("1".equals((payPriceResultObj2 == null || (coupon_info6 = payPriceResultObj2.getCoupon_info()) == null) ? null : coupon_info6.getDisable())) {
            g5 g5Var8 = this.f89687m;
            if (g5Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var8 = null;
            }
            g5Var8.C.f116689c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            g5 g5Var9 = this.f89687m;
            if (g5Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var9 = null;
            }
            g5Var9.C.f116689c.setTextVisible(true);
            g5 g5Var10 = this.f89687m;
            if (g5Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var10 = null;
            }
            g5Var10.C.f116689c.setArrowVisible(false);
            g5 g5Var11 = this.f89687m;
            if (g5Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var11 = null;
            }
            g5Var11.C.f116694h.setVisibility(8);
            g5 g5Var12 = this.f89687m;
            if (g5Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var12 = null;
            }
            g5Var12.C.f116689c.setTextFontBold(false);
            g5 g5Var13 = this.f89687m;
            if (g5Var13 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var2 = g5Var13;
            }
            MoreButton moreButton = g5Var2.C.f116689c;
            PayPriceResultObj payPriceResultObj3 = this.F;
            kotlin.jvm.internal.f0.m(payPriceResultObj3);
            PurchaseCouponInfoObj coupon_info7 = payPriceResultObj3.getCoupon_info();
            kotlin.jvm.internal.f0.m(coupon_info7);
            moreButton.setText(coupon_info7.getDisable_desc());
            return;
        }
        if (!com.max.hbcommon.utils.c.u(D5())) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("- ¥");
            PayPriceResultObj payPriceResultObj4 = this.F;
            sb3.append(r1.I((payPriceResultObj4 == null || (coupon_value = payPriceResultObj4.getCoupon_value()) == null) ? null : kotlin.text.u.l2(coupon_value, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
            String string2 = sb3.toString();
            g5 g5Var14 = this.f89687m;
            if (g5Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var14 = null;
            }
            g5Var14.C.f116689c.setTextFontBold(false);
            g5 g5Var15 = this.f89687m;
            if (g5Var15 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var15 = null;
            }
            g5Var15.C.f116689c.setText(string2);
            g5 g5Var16 = this.f89687m;
            if (g5Var16 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var16 = null;
            }
            g5Var16.C.f116689c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.gold_light));
            g5 g5Var17 = this.f89687m;
            if (g5Var17 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var17 = null;
            }
            g5Var17.C.f116689c.setTextVisible(true);
            g5 g5Var18 = this.f89687m;
            if (g5Var18 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var18 = null;
            }
            g5Var18.C.f116694h.setVisibility(8);
            g5 g5Var19 = this.f89687m;
            if (g5Var19 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var3 = g5Var19;
            }
            g5Var3.C.f116700n.setOnClickListener(new g0());
            return;
        }
        PayPriceResultObj payPriceResultObj5 = this.F;
        if (com.max.hbutils.utils.n.q((payPriceResultObj5 == null || (coupon_info5 = payPriceResultObj5.getCoupon_info()) == null) ? null : coupon_info5.getCoupon_count()) > 0) {
            g5 g5Var20 = this.f89687m;
            if (g5Var20 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var20 = null;
            }
            g5Var20.C.f116689c.setTextVisible(false);
            g5 g5Var21 = this.f89687m;
            if (g5Var21 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var21 = null;
            }
            g5Var21.C.f116694h.setVisibility(0);
            g5 g5Var22 = this.f89687m;
            if (g5Var22 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var22 = null;
            }
            TextView textView = g5Var22.C.f116694h;
            StringBuilder sb4 = new StringBuilder();
            PayPriceResultObj payPriceResultObj6 = this.F;
            sb4.append((payPriceResultObj6 == null || (coupon_info4 = payPriceResultObj6.getCoupon_info()) == null) ? null : coupon_info4.getCoupon_count());
            sb4.append("张可用");
            textView.setText(sb4.toString());
            g5 g5Var23 = this.f89687m;
            if (g5Var23 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var4 = g5Var23;
            }
            g5Var4.C.f116700n.setOnClickListener(new h0());
            return;
        }
        PayPriceResultObj payPriceResultObj7 = this.F;
        if (!com.max.hbcommon.utils.c.u((payPriceResultObj7 == null || (coupon_info3 = payPriceResultObj7.getCoupon_info()) == null) ? null : coupon_info3.getAvailable_coupon_max_deduce())) {
            PayPriceResultObj payPriceResultObj8 = this.F;
            if (!com.max.hbcommon.utils.c.u((payPriceResultObj8 == null || (coupon_info2 = payPriceResultObj8.getCoupon_info()) == null) ? null : coupon_info2.getCoupon_center_protocol())) {
                g5 g5Var24 = this.f89687m;
                if (g5Var24 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var24 = null;
                }
                g5Var24.C.f116689c.setTextVisible(false);
                g5 g5Var25 = this.f89687m;
                if (g5Var25 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var25 = null;
                }
                g5Var25.C.f116694h.setVisibility(0);
                g5 g5Var26 = this.f89687m;
                if (g5Var26 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    g5Var26 = null;
                }
                TextView textView2 = g5Var26.C.f116694h;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("未领券 领券减");
                PayPriceResultObj payPriceResultObj9 = this.F;
                sb5.append(r1.I((payPriceResultObj9 == null || (coupon_info = payPriceResultObj9.getCoupon_info()) == null) ? null : coupon_info.getAvailable_coupon_max_deduce()));
                sb5.append((char) 20803);
                textView2.setText(sb5.toString());
                g5 g5Var27 = this.f89687m;
                if (g5Var27 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    g5Var5 = g5Var27;
                }
                g5Var5.C.f116700n.setOnClickListener(new i0());
                return;
            }
        }
        g5 g5Var28 = this.f89687m;
        if (g5Var28 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var28 = null;
        }
        g5Var28.C.f116689c.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        g5 g5Var29 = this.f89687m;
        if (g5Var29 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var29 = null;
        }
        g5Var29.C.f116689c.setTextVisible(true);
        g5 g5Var30 = this.f89687m;
        if (g5Var30 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var30 = null;
        }
        g5Var30.C.f116694h.setVisibility(8);
        g5 g5Var31 = this.f89687m;
        if (g5Var31 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var31 = null;
        }
        g5Var31.C.f116689c.setTextFontBold(false);
        g5 g5Var32 = this.f89687m;
        if (g5Var32 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var32 = null;
        }
        g5Var32.C.f116689c.setText(getString(R.string.not_available_for_use));
        g5 g5Var33 = this.f89687m;
        if (g5Var33 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var = g5Var33;
        }
        g5Var.C.f116700n.setOnClickListener(new j0());
    }

    public static final /* synthetic */ void f5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40493, new Class[]{MallPurchaseDetailDialogFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.q6(z10);
    }

    private final void f6() {
        PurchaseWalletObj wallet;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40424, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g5 g5Var = null;
        String str = null;
        g5 g5Var2 = null;
        if (!com.max.hbcommon.utils.c.u(this.J)) {
            if (!com.max.hbcommon.utils.c.u(this.f89699y)) {
                str = "- ¥" + com.max.xiaoheihe.module.mall.o.f(com.max.hbutils.utils.n.r(this.f89699y), false);
            }
            x5(str);
            return;
        }
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        g5Var3.C.f116701o.setVisibility(0);
        g5 g5Var4 = this.f89687m;
        if (g5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var4 = null;
        }
        g5Var4.C.f116690d.setArrowVisible(true);
        g5 g5Var5 = this.f89687m;
        if (g5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var5 = null;
        }
        g5Var5.C.f116690d.setArrowColor(getResources().getColor(R.color.text_secondary_1_color));
        if (!com.max.hbcommon.utils.c.u(this.f89699y)) {
            g5 g5Var6 = this.f89687m;
            if (g5Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var6 = null;
            }
            g5Var6.C.f116690d.setTextColor(getResources().getColor(R.color.click_blue));
            g5 g5Var7 = this.f89687m;
            if (g5Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var7 = null;
            }
            g5Var7.C.f116690d.setTextFontBold(false);
            g5 g5Var8 = this.f89687m;
            if (g5Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var8 = null;
            }
            g5Var8.C.f116690d.setText("- ¥" + com.max.xiaoheihe.module.mall.o.f(com.max.hbutils.utils.n.r(this.f89699y), false));
            g5 g5Var9 = this.f89687m;
            if (g5Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var2 = g5Var9;
            }
            g5Var2.C.f116701o.setOnClickListener(new k0());
            return;
        }
        PurchasePreviewResultObj purchasePreviewResultObj = this.E;
        if (com.max.hbutils.utils.n.r((purchasePreviewResultObj == null || (wallet = purchasePreviewResultObj.getWallet()) == null) ? null : wallet.getHcoin()) <= 0) {
            g5 g5Var10 = this.f89687m;
            if (g5Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var10 = null;
            }
            g5Var10.C.f116690d.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
            g5 g5Var11 = this.f89687m;
            if (g5Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var11 = null;
            }
            g5Var11.C.f116690d.setTextFontBold(false);
            g5 g5Var12 = this.f89687m;
            if (g5Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var12 = null;
            }
            g5Var12.C.f116690d.setText("无可用H币");
            g5 g5Var13 = this.f89687m;
            if (g5Var13 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var13 = null;
            }
            g5Var13.C.f116701o.setOnClickListener(null);
            return;
        }
        String str2 = "可抵¥" + com.max.xiaoheihe.module.mall.o.f(I5()[1], false);
        g5 g5Var14 = this.f89687m;
        if (g5Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var14 = null;
        }
        g5Var14.C.f116690d.setTextColor(getResources().getColor(R.color.click_blue));
        g5 g5Var15 = this.f89687m;
        if (g5Var15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var15 = null;
        }
        g5Var15.C.f116690d.setTextFontBold(false);
        g5 g5Var16 = this.f89687m;
        if (g5Var16 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var16 = null;
        }
        g5Var16.C.f116690d.setText(str2);
        g5 g5Var17 = this.f89687m;
        if (g5Var17 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var = g5Var17;
        }
        g5Var.C.f116701o.setOnClickListener(new l0());
    }

    public static final /* synthetic */ com.max.hbcommon.component.i g5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40483, new Class[]{MallPurchaseDetailDialogFragment.class}, com.max.hbcommon.component.i.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.component.i) patchProxyResultProxy.result : mallPurchaseDetailDialogFragment.s6();
    }

    private final void g6() {
        PurchaseParamResultObj purchaseParamResultObj;
        PurchaseBaseInfoObj base_info;
        PurchaseParamObj params;
        int iIndexOf = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40430, new Class[0], Void.TYPE).isSupported || (purchaseParamResultObj = this.f89697w) == null || (base_info = purchaseParamResultObj.getBase_info()) == null || (params = base_info.getParams()) == null) {
            return;
        }
        g5 g5Var = this.f89687m;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        g5Var.f110811y.f113529c.setText(params.getTitle());
        if (com.max.hbcommon.utils.c.u(params.getBtn_desc())) {
            g5 g5Var2 = this.f89687m;
            if (g5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var2 = null;
            }
            TextView textView = g5Var2.f110811y.f113530d;
            kotlin.jvm.internal.f0.o(textView, "binding.vgGoodsTitle.tvOptionDesc");
            textView.setVisibility(8);
        } else {
            g5 g5Var3 = this.f89687m;
            if (g5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var3 = null;
            }
            TextView refreshGamePurchaseParamsView$lambda$19$lambda$16 = g5Var3.f110811y.f113530d;
            kotlin.jvm.internal.f0.o(refreshGamePurchaseParamsView$lambda$19$lambda$16, "refreshGamePurchaseParamsView$lambda$19$lambda$16");
            refreshGamePurchaseParamsView$lambda$19$lambda$16.setVisibility(0);
            if (com.max.hbcommon.utils.c.u(params.getBtn_protocol())) {
                refreshGamePurchaseParamsView$lambda$19$lambda$16.setText(params.getBtn_desc());
            } else {
                refreshGamePurchaseParamsView$lambda$19$lambda$16.setText(params.getBtn_desc() + " \uf0da");
                refreshGamePurchaseParamsView$lambda$19$lambda$16.setTypeface(bb.d.a().b(0));
                refreshGamePurchaseParamsView$lambda$19$lambda$16.setOnClickListener(new m0(params));
            }
        }
        List<PurchaseValueObj> values = params.getValues();
        if (values != null) {
            g5 g5Var4 = this.f89687m;
            if (g5Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var4 = null;
            }
            g5Var4.f110796j.setLayoutManager(new FlexboxLayoutManager(getContext()));
            ArrayList arrayList = new ArrayList();
            for (PurchaseValueObj purchaseValueObj : values) {
                if (kotlin.jvm.internal.f0.g(purchaseValueObj.getSelected(), Boolean.TRUE)) {
                    iIndexOf = values.indexOf(purchaseValueObj);
                }
                arrayList.add(new PurchaseCheckObj(purchaseValueObj.getName(), null, purchaseValueObj.getEnable(), purchaseValueObj.getSelected(), null, null, purchaseValueObj.getRec_desc(), purchaseValueObj.getRec_desc_start_color(), purchaseValueObj.getRec_desc_end_color()));
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            kotlin.jvm.internal.f0.o(fragmentActivityRequireActivity, "requireActivity()");
            PurchaseCheckedAdapter purchaseCheckedAdapter = new PurchaseCheckedAdapter(fragmentActivityRequireActivity, arrayList, new n0(params, values));
            purchaseCheckedAdapter.q(iIndexOf);
            g5 g5Var5 = this.f89687m;
            if (g5Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var5 = null;
            }
            g5Var5.f110796j.setAdapter(purchaseCheckedAdapter);
            purchaseCheckedAdapter.notifyDataSetChanged();
            c6();
        }
    }

    public static final /* synthetic */ void h5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, gVar}, null, changeQuickRedirect, true, 40477, new Class[]{MallPurchaseDetailDialogFragment.class, com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.t6(gVar);
    }

    private final void h6() {
        PurchaseParamResultObj purchaseParamResultObj;
        BuyTypeValueObj selectedBuyTypeValue;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40433, new Class[0], Void.TYPE).isSupported || (purchaseParamResultObj = this.f89697w) == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) {
            return;
        }
        g5 g5Var = null;
        if (com.max.hbcommon.utils.c.u(selectedBuyTypeValue.getDescription())) {
            g5 g5Var2 = this.f89687m;
            if (g5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var = g5Var2;
            }
            g5Var.f110793g.setVisibility(8);
            return;
        }
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        g5Var3.f110793g.setVisibility(0);
        if (com.max.hbcommon.utils.c.u(selectedBuyTypeValue.getDesc_prot())) {
            g5 g5Var4 = this.f89687m;
            if (g5Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var4 = null;
            }
            g5Var4.f110802p.setText(selectedBuyTypeValue.getDescription());
            g5 g5Var5 = this.f89687m;
            if (g5Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var = g5Var5;
            }
            g5Var.f110802p.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            return;
        }
        int iE = com.max.xiaoheihe.utils.d.E(R.color.click_blue);
        SpannableString spannableString = new SpannableString(selectedBuyTypeValue.getDescription() + "  ");
        Drawable drawableX = com.max.xiaoheihe.utils.d.X(R.drawable.common_help_line_24x24_click_blue);
        int iF = ViewUtils.f(getContext(), 12.0f);
        if (drawableX != null) {
            drawableX.setBounds(0, 0, iF, iF);
        }
        spannableString.setSpan(Build.VERSION.SDK_INT >= 29 ? new ImageSpan(drawableX, 2) : new com.max.hbcustomview.spans.a(drawableX), spannableString.length() - 1, spannableString.length(), 33);
        g5 g5Var6 = this.f89687m;
        if (g5Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var6 = null;
        }
        g5Var6.f110802p.setText(spannableString);
        g5 g5Var7 = this.f89687m;
        if (g5Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var7 = null;
        }
        g5Var7.f110802p.setTextColor(iE);
        g5 g5Var8 = this.f89687m;
        if (g5Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var = g5Var8;
        }
        g5Var.f110793g.setOnClickListener(new o0(selectedBuyTypeValue));
    }

    public static final /* synthetic */ void i4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, str}, null, changeQuickRedirect, true, 40481, new Class[]{MallPurchaseDetailDialogFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.C5(str);
    }

    public static final /* synthetic */ void i5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40486, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.u6();
    }

    private final void i6(BuyTypeValueObj buyTypeValueObj) {
        String str;
        PurchaseBaseInfoObj base_info;
        String reference_price_text;
        PurchaseBaseInfoObj base_info2;
        int length = 0;
        if (PatchProxy.proxy(new Object[]{buyTypeValueObj}, this, changeQuickRedirect, false, 40437, new Class[]{BuyTypeValueObj.class}, Void.TYPE).isSupported || buyTypeValueObj == null) {
            return;
        }
        g5 g5Var = this.f89687m;
        g5 g5Var2 = null;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        TextView textView = g5Var.f110799m;
        PurchasePriceObj price = buyTypeValueObj.getPrice();
        textView.setText(price != null ? price.getCurrent_price() : null);
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        TextView textView2 = g5Var3.f110803q;
        if (com.max.hbcommon.utils.c.u(buyTypeValueObj.getInventory())) {
            str = null;
        } else {
            kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
            String string = getString(R.string.remain_num_format);
            kotlin.jvm.internal.f0.o(string, "getString(R.string.remain_num_format)");
            str = String.format(string, Arrays.copyOf(new Object[]{buyTypeValueObj.getInventory()}, 1));
            kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        }
        textView2.setText(str);
        StringBuilder sb2 = new StringBuilder();
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        sb2.append((purchaseParamResultObj == null || (base_info2 = purchaseParamResultObj.getBase_info()) == null) ? null : base_info2.getReference_price_text());
        sb2.append(" ￥");
        PurchasePriceObj price2 = buyTypeValueObj.getPrice();
        sb2.append(price2 != null ? price2.getInitial_price() : null);
        SpannableString spannableString = new SpannableString(sb2.toString());
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
        if (purchaseParamResultObj2 != null && (base_info = purchaseParamResultObj2.getBase_info()) != null && (reference_price_text = base_info.getReference_price_text()) != null) {
            length = reference_price_text.length();
        }
        spannableString.setSpan(strikethroughSpan, length, spannableString.length(), 33);
        g5 g5Var4 = this.f89687m;
        if (g5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var2 = g5Var4;
        }
        g5Var2.f110805s.setText(spannableString);
    }

    public static final /* synthetic */ void j5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40469, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.v6();
    }

    private final void j6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40414, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List[] listArr = new List[1];
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        g5 g5Var = null;
        listArr[0] = purchaseParamResultObj != null ? purchaseParamResultObj.getGroup_info() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            g5 g5Var2 = this.f89687m;
            if (g5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var = g5Var2;
            }
            RelativeLayout relativeLayout = g5Var.f110812z;
            kotlin.jvm.internal.f0.o(relativeLayout, "binding.vgGroupBuyUser");
            relativeLayout.setVisibility(8);
            return;
        }
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        RelativeLayout relativeLayout2 = g5Var3.f110812z;
        kotlin.jvm.internal.f0.o(relativeLayout2, "binding.vgGroupBuyUser");
        relativeLayout2.setVisibility(0);
        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
        List<GroupBuyInfoObj> group_info = purchaseParamResultObj2 != null ? purchaseParamResultObj2.getGroup_info() : null;
        kotlin.jvm.internal.f0.m(group_info);
        P5(group_info);
    }

    public static final /* synthetic */ void k5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment, str, str2}, null, changeQuickRedirect, true, 40488, new Class[]{MallPurchaseDetailDialogFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.w6(str, str2);
    }

    private final void k6() {
        BuyTypeValueObj selectedBuyTypeValue;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40432, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g5 g5Var = null;
        this.Z = null;
        this.f89699y = null;
        this.F = null;
        this.C = 1;
        l6();
        PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
        if (purchaseParamResultObj == null || (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) == null) {
            return;
        }
        i6(selectedBuyTypeValue);
        this.f89700z = selectedBuyTypeValue.getCat_value();
        if (!R5() && kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCategory(), "mall") && selectedBuyTypeValue.canBuy()) {
            y6();
            K5();
            return;
        }
        q5();
        h6();
        b6();
        r5();
        d6();
        g5 g5Var2 = this.f89687m;
        if (g5Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var2 = null;
        }
        g5Var2.f110806t.setVisibility(8);
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var = g5Var3;
        }
        g5Var.A.setVisibility(8);
    }

    public static final /* synthetic */ void l5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40491, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.x6();
    }

    private final void l6() {
        PurchaseParamResultObj purchaseParamResultObj;
        PurchaseValueObj selectedParam;
        BuyTypeValueObj selectedBuyTypeValue;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40417, new Class[0], Void.TYPE).isSupported || (purchaseParamResultObj = this.f89697w) == null || (selectedParam = purchaseParamResultObj.getSelectedParam()) == null) {
            return;
        }
        String image = selectedParam.getImage();
        g5 g5Var = this.f89687m;
        String discount = null;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        com.max.hbimage.b.L(image, g5Var.f110789c.f112451c, R.drawable.common_default_placeholder_375x210);
        g5 g5Var2 = this.f89687m;
        if (g5Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var2 = null;
        }
        TextView textView = (TextView) g5Var2.f110789c.b().findViewById(R.id.tv_discount);
        PurchaseParamResultObj purchaseParamResultObj2 = this.f89697w;
        if (purchaseParamResultObj2 != null && (selectedBuyTypeValue = purchaseParamResultObj2.getSelectedBuyTypeValue()) != null) {
            discount = selectedBuyTypeValue.getDiscount();
        }
        if (com.max.hbcommon.utils.c.u(discount)) {
            textView.setVisibility(8);
        } else {
            textView.setText(discount);
            textView.setVisibility(0);
        }
    }

    public static final /* synthetic */ void m5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        if (PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40473, new Class[]{MallPurchaseDetailDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallPurchaseDetailDialogFragment.y6();
    }

    private final void m6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40392, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new p0());
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult, "private fun registerLaun…    }\n            }\n    }");
        this.T = gVarRegisterForActivityResult;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult2 = registerForActivityResult(new z.b.m(), new androidx.activity.result.a<ActivityResult>() { // from class: com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment$registerLauncher$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // androidx.activity.result.a
            public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
                if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 40600, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                b(activityResult);
            }

            public final void b(ActivityResult activityResult) {
                if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 40599, new Class[]{ActivityResult.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (activityResult.b() == 2) {
                    com.max.hbcache.c.L(true);
                } else if (activityResult.b() == 1) {
                    com.max.hbcache.c.L(false);
                }
                MallPurchaseDetailDialogFragment.W3(this.f89785a);
                if (activityResult.b() == 2) {
                    kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new MallPurchaseDetailDialogFragment$registerLauncher$2$onActivityResult$1(this.f89785a, null), 3, null);
                }
            }
        });
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult2, "private fun registerLaun…    }\n            }\n    }");
        this.P = gVarRegisterForActivityResult2;
    }

    public static final /* synthetic */ String n4(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPurchaseDetailDialogFragment}, null, changeQuickRedirect, true, 40467, new Class[]{MallPurchaseDetailDialogFragment.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : mallPurchaseDetailDialogFragment.D5();
    }

    private final void n5() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40435, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        g5 g5Var = this.f89687m;
        g5 g5Var2 = null;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_mall_batch_cnt, (ViewGroup) g5Var.f110792f, false);
        kotlin.jvm.internal.f0.n(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.f89688n = viewGroup;
        kotlin.jvm.internal.f0.m(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iF = ViewUtils.f(context, 12.0f);
        marginLayoutParams.rightMargin = iF;
        marginLayoutParams.leftMargin = iF;
        marginLayoutParams.topMargin = ViewUtils.f(context, 20.0f);
        ViewGroup viewGroup2 = this.f89688n;
        kotlin.jvm.internal.f0.m(viewGroup2);
        viewGroup2.setLayoutParams(marginLayoutParams);
        ViewGroup viewGroup3 = this.f89688n;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
        ViewGroup viewGroup4 = this.f89688n;
        kotlin.jvm.internal.f0.m(viewGroup4);
        View viewFindViewById = viewGroup4.findViewById(R.id.tv_cnt);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        ViewGroup viewGroup5 = this.f89688n;
        kotlin.jvm.internal.f0.m(viewGroup5);
        View viewFindViewById2 = viewGroup5.findViewById(R.id.iv_add);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById2;
        ViewGroup viewGroup6 = this.f89688n;
        kotlin.jvm.internal.f0.m(viewGroup6);
        View viewFindViewById3 = viewGroup6.findViewById(R.id.iv_sub);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) viewFindViewById3;
        imageView.setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, 3.0f));
        imageView2.setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, 3.0f));
        textView.setBackground(com.max.hbutils.utils.q.o(context, R.color.background_card_1_color, 3.0f));
        imageView.setOnClickListener(new c(textView));
        imageView2.setOnClickListener(new d(textView));
        textView.addTextChangedListener(new e(imageView2, context, imageView));
        textView.setText(String.valueOf(this.C));
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var2 = g5Var3;
        }
        g5Var2.f110792f.addView(this.f89688n);
    }

    private final void n6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40460, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("order_id", this.I);
        jsonObject.addProperty("h_src", this.f89690p);
        jsonObject.addProperty("is_grouping", Boolean.valueOf(this.f89696v));
        com.max.hbcommon.analytics.d.d("4", lb.d.f131151e2, null, jsonObject);
    }

    private final boolean o5(CharSequence charSequence, BaseBottomButton.BaseBottomButtonStyle baseBottomButtonStyle, boolean z10, View.OnClickListener onClickListener, View view, boolean z11) {
        Object[] objArr = {charSequence, baseBottomButtonStyle, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, view, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40442, new Class[]{CharSequence.class, BaseBottomButton.BaseBottomButtonStyle.class, cls, View.OnClickListener.class, View.class, cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        g5 g5Var = this.f89687m;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = g5Var.f110788b;
        kotlin.jvm.internal.f0.o(bottomButtonLeftItemView, "binding.bottomButton");
        if (!this.A) {
            bottomButtonLeftItemView.setLeftText(charSequence);
            bottomButtonLeftItemView.setLeftButtonStyle(baseBottomButtonStyle);
            bottomButtonLeftItemView.setLeftButtonEnabled(z10);
            bottomButtonLeftItemView.setLeftClickListener(onClickListener);
            bottomButtonLeftItemView.setShowLeftButton(true);
            BaseBottomButton leftButton = bottomButtonLeftItemView.getLeftButton();
            if (leftButton != null) {
                leftButton.h(view);
                if (z11) {
                    p6(leftButton);
                }
            }
            this.A = true;
            return true;
        }
        if (this.B) {
            return false;
        }
        bottomButtonLeftItemView.setRightText(charSequence);
        bottomButtonLeftItemView.setRightButtonStyle(baseBottomButtonStyle);
        bottomButtonLeftItemView.setRightButtonEnabled(z10);
        bottomButtonLeftItemView.setRightClickListener(onClickListener);
        bottomButtonLeftItemView.setShowRightButton(true);
        BaseBottomButton rightbutton = bottomButtonLeftItemView.getRightbutton();
        if (rightbutton != null) {
            rightbutton.h(view);
            if (view != null) {
                p6(rightbutton);
            }
        }
        this.B = true;
        return true;
    }

    private final void o6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40459, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("sku_id", this.f89693s);
        jsonObject.addProperty("app_id", this.f89691q);
        jsonObject.addProperty("h_src", this.f89690p);
        jsonObject.addProperty("is_grouping", Boolean.valueOf(this.f89696v));
        com.max.hbcommon.analytics.d.d("4", lb.d.f131193k2, null, jsonObject);
    }

    static /* synthetic */ boolean p5(MallPurchaseDetailDialogFragment mallPurchaseDetailDialogFragment, CharSequence charSequence, BaseBottomButton.BaseBottomButtonStyle baseBottomButtonStyle, boolean z10, View.OnClickListener onClickListener, View view, boolean z11, int i10, Object obj) {
        Object[] objArr = {mallPurchaseDetailDialogFragment, charSequence, baseBottomButtonStyle, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, view, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 40443, new Class[]{MallPurchaseDetailDialogFragment.class, CharSequence.class, BaseBottomButton.BaseBottomButtonStyle.class, cls, View.OnClickListener.class, View.class, cls, Integer.TYPE, Object.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return mallPurchaseDetailDialogFragment.o5(charSequence, baseBottomButtonStyle, z10, onClickListener, (i10 & 16) != 0 ? null : view, (i10 & 32) != 0 ? false : z11 ? 1 : 0);
    }

    private final void p6(BaseBottomButton baseBottomButton) {
        if (PatchProxy.proxy(new Object[]{baseBottomButton}, this, changeQuickRedirect, false, 40444, new Class[]{BaseBottomButton.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup vg_button = baseBottomButton.getVg_button();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
        vg_button.setBackground(ViewUtils.x(com.max.xiaoheihe.accelworld.l.c(5.0f, contextRequireContext), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_start_color), com.max.xiaoheihe.utils.d.E(R.color.store_gradient_free_lottery_end_color)));
    }

    private final void q5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40434, new Class[0], Void.TYPE).isSupported && System.currentTimeMillis() - this.X >= this.W) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.w0(this.W);
            g5 g5Var = this.f89687m;
            g5 g5Var2 = null;
            if (g5Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var = null;
            }
            autoTransition.u(g5Var.f110796j, true);
            g5 g5Var3 = this.f89687m;
            if (g5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var3 = null;
            }
            autoTransition.u(g5Var3.f110795i, true);
            g5 g5Var4 = this.f89687m;
            if (g5Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var4 = null;
            }
            autoTransition.u(g5Var4.f110797k, true);
            g5 g5Var5 = this.f89687m;
            if (g5Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var5 = null;
            }
            BaseBottomButton leftButton = g5Var5.f110788b.getLeftButton();
            kotlin.jvm.internal.f0.m(leftButton);
            autoTransition.z(leftButton.getTv_button(), true);
            g5 g5Var6 = this.f89687m;
            if (g5Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var6 = null;
            }
            BaseBottomButton rightbutton = g5Var6.f110788b.getRightbutton();
            kotlin.jvm.internal.f0.m(rightbutton);
            autoTransition.z(rightbutton.getTv_button(), true);
            g5 g5Var7 = this.f89687m;
            if (g5Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var7 = null;
            }
            autoTransition.u(g5Var7.f110811y.b(), true);
            g5 g5Var8 = this.f89687m;
            if (g5Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var8 = null;
            }
            autoTransition.u(g5Var8.f110809w.b(), true);
            g5 g5Var9 = this.f89687m;
            if (g5Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var9 = null;
            }
            autoTransition.u(g5Var9.B.b(), true);
            g5 g5Var10 = this.f89687m;
            if (g5Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var10 = null;
            }
            autoTransition.u(g5Var10.f110792f, true);
            g5 g5Var11 = this.f89687m;
            if (g5Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var11 = null;
            }
            autoTransition.u(g5Var11.f110789c.b(), true);
            g5 g5Var12 = this.f89687m;
            if (g5Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var12 = null;
            }
            autoTransition.z(g5Var12.f110789c.b(), true);
            g5 g5Var13 = this.f89687m;
            if (g5Var13 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var13 = null;
            }
            autoTransition.u(g5Var13.f110810x, true);
            g5 g5Var14 = this.f89687m;
            if (g5Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var2 = g5Var14;
            }
            androidx.transition.v.b(g5Var2.b(), autoTransition);
        }
    }

    private final void q6(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40420, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        q5();
        U3(!z10);
        g5 g5Var = null;
        if (z10) {
            g5 g5Var2 = this.f89687m;
            if (g5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                g5Var2 = null;
            }
            g5Var2.E.setVisibility(0);
            g5 g5Var3 = this.f89687m;
            if (g5Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var = g5Var3;
            }
            g5Var.f110806t.b(true);
            return;
        }
        g5 g5Var4 = this.f89687m;
        if (g5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var4 = null;
        }
        g5Var4.E.setVisibility(8);
        g5 g5Var5 = this.f89687m;
        if (g5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var = g5Var5;
        }
        g5Var.f110806t.b(false);
    }

    private final void r5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40456, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.e()), null, null, new MallPurchaseDetailDialogFragment$cancelDialog$1(this, null), 3, null);
    }

    private final boolean s5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40412, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcache.c.t()) {
            return true;
        }
        androidx.activity.result.g<Intent> gVar = this.P;
        if (gVar == null) {
            kotlin.jvm.internal.f0.S("agreeLauncher");
            gVar = null;
        }
        gVar.b(MallAgreementActivity.M.a(requireActivity(), "", true));
        return false;
    }

    private final com.max.hbcommon.component.i s6() {
        PurchaseWalletObj wallet;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40425, new Class[0], com.max.hbcommon.component.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.component.i) patchProxyResultProxy.result;
        }
        if (!isActive()) {
            return null;
        }
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_hcoin_deduction, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(requireActivity(), 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) requireActivity(), true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bottom_bar);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_order_price);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_faq);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.vg_bg);
        kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iv_close);
        kotlin.jvm.internal.f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById5;
        bb.d.d(textView, 4);
        PayPriceResultObj payPriceResultObj = this.F;
        String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(payPriceResultObj != null ? payPriceResultObj.getPay_price() : null) + com.max.hbutils.utils.n.r(this.f89699y));
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 165);
        sb2.append(com.max.hbutils.utils.n.t(new Regex(Constants.ACCEPT_TIME_SEPARATOR_SP).m(String.valueOf(com.max.hbutils.utils.n.p(strValueOf) / 1000.0f), ".")));
        textView.setText(sb2.toString());
        viewGroup.setBackground(com.max.hbutils.utils.q.E(requireActivity(), R.color.divider_color, 8.0f));
        View viewFindViewById6 = viewInflate.findViewById(R.id.et_hcoin);
        kotlin.jvm.internal.f0.n(viewFindViewById6, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.tv_info);
        kotlin.jvm.internal.f0.n(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.tv_use_all);
        kotlin.jvm.internal.f0.n(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.tv_confirm);
        kotlin.jvm.internal.f0.n(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById9;
        long j10 = I5()[1];
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.current_h_coin));
        sb3.append(": ");
        PurchasePreviewResultObj purchasePreviewResultObj = this.E;
        sb3.append((purchasePreviewResultObj == null || (wallet = purchasePreviewResultObj.getWallet()) == null) ? null : wallet.getHcoin());
        sb3.append("，可抵现");
        sb3.append(j10);
        String string = sb3.toString();
        textView3.setText(string);
        if (!com.max.hbcommon.utils.c.u(this.f89699y)) {
            editText.setText(this.f89699y);
            String str = this.f89699y;
            kotlin.jvm.internal.f0.m(str);
            editText.setSelection(str.length());
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(j10)});
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new q0(textView5));
        editText.addTextChangedListener(new r0(j10, textView3, textView4, textView5, string));
        textView4.setOnClickListener(new s0(j10, editText));
        textView5.setOnClickListener(new t0(editText, this, iVar));
        textView2.setOnClickListener(new u0());
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        v0 v0Var = new v0(iVar);
        imageView.setOnClickListener(v0Var);
        viewGroup2.setOnClickListener(v0Var);
        iVar.show();
        return iVar;
    }

    @SuppressLint({"AutoDispose"})
    private final void t5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40404, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.I;
        String strD5 = D5();
        MallPriceObj mallPriceObj = this.H;
        addDisposable((io.reactivex.disposables.b) eVarA.Fb(str, strD5, null, mallPriceObj != null ? mallPriceObj.getPay_price() : null, null, this.f89699y, new HashMap()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void t6(com.max.xiaoheihe.utils.l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 40438, new Class[]{com.max.xiaoheihe.utils.l0.g.class}, Void.TYPE).isSupported || !isActive() || getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(getActivity()).y(getString(R.string.fail)).l(getString(R.string.has_not_finish_order)).u(getString(R.string.to_handle), new w0(gVar, this)).o(getString(R.string.cancel), x0.f89818b).F();
    }

    private final boolean u5() {
        PurchaseWalletObj wallet;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40419, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!kotlin.jvm.internal.f0.g(this.D, "balance")) {
            return true;
        }
        PurchasePreviewResultObj purchasePreviewResultObj = this.E;
        long jR = com.max.hbutils.utils.n.r((purchasePreviewResultObj == null || (wallet = purchasePreviewResultObj.getWallet()) == null) ? null : wallet.getHbalance()) * ((long) 10);
        PayPriceResultObj payPriceResultObj = this.F;
        long jR2 = jR - com.max.hbutils.utils.n.r(payPriceResultObj != null ? payPriceResultObj.getPay_price() : null);
        if (jR2 >= 0) {
            return true;
        }
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
        com.max.xiaoheihe.module.mall.o.r((BaseActivity) activity, String.valueOf(jR2 / ((long) 1000)), new g());
        return false;
    }

    private final void u6() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40454, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            r5();
            v6();
            com.max.hbcommon.view.a aVar = this.O;
            if (aVar != null && aVar.isShowing()) {
                z10 = true;
            }
            if (!z10 && this.G && isActive()) {
                this.O = new com.max.hbcommon.view.a.f(getActivity()).l("您是否已经完成了支付").u("已支付", new y0()).o("未支付", new z0()).F();
            }
        } catch (Throwable unused) {
        }
    }

    private final void v5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40405, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        n6();
        MallPriceObj mallPriceObj = this.H;
        String pay_price = mallPriceObj != null ? mallPriceObj.getPay_price() : null;
        kotlin.jvm.internal.f0.m(pay_price);
        if (com.max.hbutils.utils.n.q(pay_price) == 0) {
            C5("0");
        } else {
            kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.e()), null, null, new MallPurchaseDetailDialogFragment$checkPayType$1(this, pay_price, null), 3, null);
        }
    }

    private final void v6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40447, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
        }
        ProgressDialog progressDialog = this.R;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this.R;
            if (progressDialog3 == null) {
                kotlin.jvm.internal.f0.S("payLoadingDialog");
            } else {
                progressDialog2 = progressDialog3;
            }
            progressDialog2.dismiss();
        }
        r5();
        io.reactivex.disposables.a aVar = this.S;
        if (aVar != null) {
            aVar.f();
        }
        this.K = false;
    }

    private final void w5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40423, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        g5 g5Var = null;
        if (com.max.hbcommon.utils.c.u(str)) {
            g5 g5Var2 = this.f89687m;
            if (g5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var = g5Var2;
            }
            g5Var.C.f116700n.setVisibility(8);
            return;
        }
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        g5Var3.C.f116700n.setVisibility(0);
        g5 g5Var4 = this.f89687m;
        if (g5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var4 = null;
        }
        g5Var4.C.f116689c.setArrowVisible(false);
        g5 g5Var5 = this.f89687m;
        if (g5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var5 = null;
        }
        g5Var5.C.f116689c.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        g5 g5Var6 = this.f89687m;
        if (g5Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var6 = null;
        }
        g5Var6.C.f116689c.setTextFontBold(false);
        g5 g5Var7 = this.f89687m;
        if (g5Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var7 = null;
        }
        g5Var7.C.f116689c.setText(str);
        g5 g5Var8 = this.f89687m;
        if (g5Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var8 = null;
        }
        g5Var8.C.f116694h.setVisibility(8);
        g5 g5Var9 = this.f89687m;
        if (g5Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var9 = null;
        }
        g5Var9.C.f116700n.setOnClickListener(null);
    }

    private final void w6(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 40445, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f1(str, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a1(str)));
    }

    private final void x5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40426, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        g5 g5Var = null;
        if (com.max.hbcommon.utils.c.u(str)) {
            g5 g5Var2 = this.f89687m;
            if (g5Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                g5Var = g5Var2;
            }
            g5Var.C.f116701o.setVisibility(8);
            return;
        }
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        g5Var3.C.f116701o.setVisibility(0);
        g5 g5Var4 = this.f89687m;
        if (g5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var4 = null;
        }
        g5Var4.C.f116690d.setArrowVisible(false);
        g5 g5Var5 = this.f89687m;
        if (g5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var5 = null;
        }
        g5Var5.C.f116690d.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        g5 g5Var6 = this.f89687m;
        if (g5Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var6 = null;
        }
        g5Var6.C.f116690d.setTextFontBold(false);
        g5 g5Var7 = this.f89687m;
        if (g5Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var7 = null;
        }
        g5Var7.C.f116690d.setText(str);
        g5 g5Var8 = this.f89687m;
        if (g5Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var8 = null;
        }
        g5Var8.C.f116701o.setOnClickListener(null);
    }

    private final void x6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40401, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (s5()) {
            X5();
        } else {
            r5();
        }
    }

    private final void y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40429, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
        }
        ProgressDialog progressDialog = this.R;
        if (progressDialog == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
    }

    private final void y6() {
        b bVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40455, new Class[0], Void.TYPE).isSupported || (bVar = this.M) == null) {
            return;
        }
        bVar.sendMessageDelayed(bVar.obtainMessage(0), 200L);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void E3(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40452, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.J = str;
        com.max.heybox.hblog.g.f74531b.M(this.f89686l + "   onGetOutTradeNo   out_trade_no: " + str + "  currentPayType: " + L5());
        v6();
        a6(str, L5(), 0, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    public final void O5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40458, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.L;
        if (loadingDialog != null) {
            loadingDialog.c();
        }
        ProgressDialog progressDialog = this.R;
        if (progressDialog != null) {
            if (progressDialog == null) {
                kotlin.jvm.internal.f0.S("payLoadingDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
        }
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void S1() {
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void U2(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40453, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.q(this.f89686l + "   resetOutOrderInfo   paytype: " + str + "  currentPayType: " + L5());
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void Y0(@dl.e WeixinQueryObj weixinQueryObj) {
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> j3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40449, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarK1 = com.max.xiaoheihe.network.i.a().K1(PaymentManager.f71427z, G5(str));
        kotlin.jvm.internal.f0.o(zVarK1, "createHeyBoxService().ge…erParams(price)\n        )");
        return zVarK1;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void o1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40451, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        N5(this, false, false, 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        SteamPurchaseManager steamPurchaseManager;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40446, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 4 && i11 == -1 && isActive() && (steamPurchaseManager = this.Z) != null) {
            steamPurchaseManager.u(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 40390, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        g5 g5VarC = g5.c(inflater);
        kotlin.jvm.internal.f0.o(g5VarC, "inflate(inflater)");
        this.f89687m = g5VarC;
        this.M = new b(this);
        g5 g5Var = this.f89687m;
        if (g5Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var = null;
        }
        return g5Var.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40395, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        r5();
        this.f89683b0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40394, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        d2 d2Var = this.f89683b0;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        this.G = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40393, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        com.max.heybox.hblog.g.f74531b.M(this.f89686l + "   onResume  out_trade_no: " + this.J + "   chargeHCoin: " + this.U);
        this.G = true;
        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(e1.e()), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@dl.d Bundle outState) {
        BuyTypeValueObj selectedBuyTypeValue;
        boolean zG = false;
        if (PatchProxy.proxy(new Object[]{outState}, this, changeQuickRedirect, false, 40461, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        String str = this.I;
        if (str != null) {
            outState.putString(this.f89684j, str);
            String str2 = this.f89685k;
            PurchaseParamResultObj purchaseParamResultObj = this.f89697w;
            if (purchaseParamResultObj != null && (selectedBuyTypeValue = purchaseParamResultObj.getSelectedBuyTypeValue()) != null) {
                zG = kotlin.jvm.internal.f0.g(selectedBuyTypeValue.getCart_enable(), Boolean.TRUE);
            }
            outState.putString(str2, zG ? "1" : "0");
        }
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 40391, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f89690p = arguments.getString("h_src");
            this.f89691q = arguments.getString("app_id");
            this.f89692r = arguments.getString(com.max.xiaoheihe.module.mall.i.G);
            this.f89693s = arguments.getString("sku_id");
            this.f89694t = arguments.getString(com.max.xiaoheihe.module.mall.i.H);
            this.f89695u = arguments.getString(f89680x1);
            this.f89696v = arguments.getBoolean(f89681y1, false);
        }
        g5 g5Var = null;
        if (bundle != null) {
            this.I = bundle.getString(this.f89684j, null);
            String string = bundle.getString(this.f89685k, "-1");
            kotlin.jvm.internal.f0.o(string, "getString(STATE_CART_ENABLE, \"-1\")");
            this.V = string;
        }
        m6();
        FragmentActivity activity = getActivity();
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
        PaymentManager paymentManager = new PaymentManager(this, (BaseActivity) activity);
        this.Q = paymentManager;
        paymentManager.U(false);
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        this.R = progressDialog;
        progressDialog.setIndeterminate(true);
        ProgressDialog progressDialog2 = this.R;
        if (progressDialog2 == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        PaymentManager paymentManager2 = this.Q;
        if (paymentManager2 == null) {
            kotlin.jvm.internal.f0.S("mPaymentManager");
            paymentManager2 = null;
        }
        ProgressDialog progressDialog3 = this.R;
        if (progressDialog3 == null) {
            kotlin.jvm.internal.f0.S("payLoadingDialog");
            progressDialog3 = null;
        }
        paymentManager2.Q(progressDialog3);
        if (!com.max.hbcommon.utils.c.u(this.I)) {
            N5(this, com.max.hbcommon.utils.c.x(this.V), false, 2, null);
            dismiss();
            return;
        }
        g5 g5Var2 = this.f89687m;
        if (g5Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var2 = null;
        }
        g5Var2.C.f116704r.setVisibility(8);
        g5 g5Var3 = this.f89687m;
        if (g5Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var3 = null;
        }
        g5Var3.C.f116706t.setVisibility(8);
        g5 g5Var4 = this.f89687m;
        if (g5Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var4 = null;
        }
        g5Var4.C.f116703q.setVisibility(8);
        g5 g5Var5 = this.f89687m;
        if (g5Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var5 = null;
        }
        g5Var5.C.f116702p.setVisibility(8);
        g5 g5Var6 = this.f89687m;
        if (g5Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var6 = null;
        }
        g5Var6.C.f116699m.setVisibility(8);
        g5 g5Var7 = this.f89687m;
        if (g5Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var7 = null;
        }
        g5Var7.C.f116705s.setVisibility(8);
        g5 g5Var8 = this.f89687m;
        if (g5Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var8 = null;
        }
        g5Var8.b().setOnClickListener(new r());
        g5 g5Var9 = this.f89687m;
        if (g5Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var9 = null;
        }
        g5Var9.f110794h.setOnClickListener(s.f89788b);
        n5();
        SwipeBackLayout swipeBackLayout = this.f66927e;
        g5 g5Var10 = this.f89687m;
        if (g5Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            g5Var10 = null;
        }
        swipeBackLayout.f69555k = g5Var10.f110796j;
        y6();
        g5 g5Var11 = this.f89687m;
        if (g5Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            g5Var = g5Var11;
        }
        g5Var.f110788b.setVisibility(4);
        J5();
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> q0(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40448, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarK1 = com.max.xiaoheihe.network.i.a().K1(PaymentManager.f71426y, G5(str));
        kotlin.jvm.internal.f0.o(zVarK1, "createHeyBoxService().ge…erParams(price)\n        )");
        return zVarK1;
    }

    public final void r6() {
        Context context;
        LoadingDialog loadingDialog;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40457, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        if (this.L == null) {
            this.L = new LoadingDialog(context, "");
        }
        LoadingDialog loadingDialog2 = this.L;
        if (loadingDialog2 != null && !loadingDialog2.i()) {
            z10 = true;
        }
        if (!z10 || (loadingDialog = this.L) == null) {
            return;
        }
        loadingDialog.r();
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> z3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40450, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarK1 = com.max.xiaoheihe.network.i.a().K1("lianlian", G5(str));
        kotlin.jvm.internal.f0.o(zVarK1, "createHeyBoxService().ge…erParams(price)\n        )");
        return zVarK1;
    }

    @dl.d
    public final ImageView z5(int i10, @dl.e String str) {
        int i11 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, 40415, new Class[]{Integer.TYPE, String.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
        int iC = com.max.xiaoheihe.accelworld.l.c(21.0f, contextRequireContext);
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iC, iC);
        if (i10 != 0) {
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.f0.o(contextRequireContext2, "requireContext()");
            i11 = -com.max.xiaoheihe.accelworld.l.c(4.0f, contextRequireContext2);
        }
        layoutParams.setMarginStart(i11);
        imageView.setLayoutParams(layoutParams);
        com.max.hbimage.b.H(str, imageView);
        imageView.setElevation(10 - i10);
        Context context = imageView.getContext();
        kotlin.jvm.internal.f0.o(context, "context");
        int iC2 = com.max.xiaoheihe.accelworld.l.c(0.5f, context);
        imageView.setPadding(iC2, iC2, iC2, iC2);
        imageView.setBackground(com.max.hbutils.utils.q.o(imageView.getContext(), R.color.white_alpha50, 11.0f));
        return imageView;
    }
}
