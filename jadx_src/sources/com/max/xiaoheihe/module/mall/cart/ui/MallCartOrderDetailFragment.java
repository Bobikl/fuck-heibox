package com.max.xiaoheihe.module.mall.cart.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.commentimagepainter.sharecard.bean.CardObj;
import com.max.commentimagepainter.sharecard.bean.CardObjV2;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.MoreButton;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.GradientTextView;
import com.max.hbcustomview.MallPriceCamelView;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hblogistics.AddAddressActivity;
import com.max.hblogistics.AddressListActivity;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MyHcashActivity;
import com.max.hbwallet.OrderCouponListActivity;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.hbwallet.bean.MallOrderStackCouponObj;
import com.max.hbwallet.bean.MallOrderSuggestCoupon;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.HBDialogManagerKt;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.bean.mall.MallOrderBottomBtnObj;
import com.max.xiaoheihe.bean.mall.MallOrderCancelTipObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallPayExtraInfo;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.mall.MallPayPurchaseParams;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.OrderDetailActivityObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemObj;
import com.max.xiaoheihe.bean.mall.cart.MallCartOrderDetailObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderGroupInfo;
import com.max.xiaoheihe.bean.mall.cart.MallProductActionObj;
import com.max.xiaoheihe.bean.mall.cart.SuggestDiscountInfo;
import com.max.xiaoheihe.module.mall.MallAgreementActivity;
import com.max.xiaoheihe.module.mall.cardshare.fragment.actions.MallCartOrderShowCardShareKt;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import df.as;
import df.kc0;
import df.lc0;
import df.mc0;
import df.re;
import df.u5;
import df.u9;
import df.v5;
import df.wp;
import df.yp;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.jvm.internal.t0({"SMAP\nMallCartOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallCartOrderDetailFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartOrderDetailFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3252:1\n13579#2,2:3253\n262#3,2:3255\n262#3,2:3257\n304#3,2:3264\n1855#4,2:3259\n1726#4,3:3261\n1855#4,2:3266\n*S KotlinDebug\n*F\n+ 1 MallCartOrderDetailFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartOrderDetailFragment\n*L\n743#1:3253,2\n863#1:3255,2\n891#1:3257,2\n2774#1:3264,2\n1277#1:3259,2\n2577#1:3261,3\n3236#1:3266,2\n*E\n"})
@com.max.hbcommon.analytics.m(path = lb.d.Y1)
@androidx.compose.runtime.internal.o(parameters = 0)
public final class MallCartOrderDetailFragment extends com.max.hbcommon.base.i implements PaymentManager.g, cf.a {

    @dl.d
    public static final a H = new a(null);
    public static final int I = 8;

    @dl.d
    private static final String J = "order_id";

    @dl.d
    private static final String K = "share_when_succeed";
    private static final int L = 8;

    @dl.d
    private static final String M = "1";

    @dl.d
    private static final String N = "2";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean B;
    private boolean C;
    private int D;

    @dl.e
    private kotlinx.coroutines.d2 E;

    @dl.d
    private d2 F;

    @dl.d
    private final com.max.hbshare.c.b G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u9 f90345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private re f90346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private CountDownTimer f90347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RefreshBroadcastReceiver f90348f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.activity.result.g<Intent> f90349g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private androidx.activity.result.g<Intent> f90350h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.activity.result.g<Intent> f90351i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.activity.result.g<Intent> f90352j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f90353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MallCartOrderDetailObj f90354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private String f90355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f90356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private MallPriceObj f90357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private MallOrderCancelTipObj f90358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f90359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f90360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PaymentManager f90361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ProgressDialog f90362t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f90364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.view.a f90365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f90366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f90367y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.z f90344b = kotlin.b0.c(new yh.a<com.max.xiaoheihe.module.mall.cart.viewmodel.b>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$viewModel$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final com.max.xiaoheihe.module.mall.cart.viewmodel.b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41815, new Class[0], com.max.xiaoheihe.module.mall.cart.viewmodel.b.class);
            return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.cart.viewmodel.b) patchProxyResultProxy.result : (com.max.xiaoheihe.module.mall.cart.viewmodel.b) new y0(this.f90473b).a(com.max.xiaoheihe.module.mall.cart.viewmodel.b.class);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.mall.cart.viewmodel.b, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ com.max.xiaoheihe.module.mall.cart.viewmodel.b invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41816, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f90363u = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private io.reactivex.disposables.a f90368z = new io.reactivex.disposables.a();
    private boolean A = true;

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public final class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public RefreshBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 41684, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(intent, "intent");
            if (kotlin.jvm.internal.f0.g(lb.a.A, intent.getAction())) {
                MallCartOrderDetailFragment.this.onRefresh();
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public enum TYPE_CODE {
        CANCELED,
        FAILED,
        WAITING_FOR_PAY,
        PAID,
        FINISH,
        CANCEL_ALERT_PAID,
        NEED_CHECK_STEAM_INFO,
        CANCELABLE_PAID;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static TYPE_CODE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 41686, new Class[]{String.class}, TYPE_CODE.class);
            return (TYPE_CODE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TYPE_CODE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TYPE_CODE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41685, new Class[0], TYPE_CODE[].class);
            return (TYPE_CODE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
        public static final class ViewOnClickListenerC0827a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderDetailActivityObj f90370b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f90371c;

            ViewOnClickListenerC0827a(OrderDetailActivityObj orderDetailActivityObj, Activity activity) {
                this.f90370b = orderDetailActivityObj;
                this.f90371c = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String protocol;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41683, new Class[]{View.class}, Void.TYPE).isSupported || (protocol = this.f90370b.getProtocol()) == null) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(this.f90371c, protocol);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.e
        public final View a(@dl.d Activity mContext, @dl.e OrderDetailActivityObj orderDetailActivityObj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mContext, orderDetailActivityObj}, this, changeQuickRedirect, false, 41682, new Class[]{Activity.class, OrderDetailActivityObj.class}, View.class);
            if (patchProxyResultProxy.isSupported) {
                return (View) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(mContext, "mContext");
            if (orderDetailActivityObj == null) {
                return null;
            }
            View viewInflate = mContext.getLayoutInflater().inflate(R.layout.item_order_detail_act, (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
            MoreButton moreButton = (MoreButton) viewInflate.findViewById(R.id.v_more_button);
            int iH = !com.max.hbcommon.utils.c.u(orderDetailActivityObj.getTitle_color()) ? com.max.xiaoheihe.utils.d.H(mContext, orderDetailActivityObj.getTitle_color()) : mContext.getResources().getColor(R.color.text_secondary_1_color);
            int iH2 = !com.max.hbcommon.utils.c.u(orderDetailActivityObj.getContent_color()) ? com.max.xiaoheihe.utils.d.H(mContext, orderDetailActivityObj.getContent_color()) : mContext.getResources().getColor(R.color.text_primary_1_color);
            textView.setText(orderDetailActivityObj.getTitle());
            textView.setTextColor(iH);
            moreButton.setText(orderDetailActivityObj.getContent());
            moreButton.setArrowVisible(true);
            moreButton.setColor(iH2);
            viewInflate.setOnClickListener(new ViewOnClickListenerC0827a(orderDetailActivityObj, mContext));
            return viewInflate;
        }

        @dl.d
        public final MallCartOrderDetailFragment b(@dl.e Bundle bundle) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 41681, new Class[]{Bundle.class}, MallCartOrderDetailFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (MallCartOrderDetailFragment) patchProxyResultProxy.result;
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = new MallCartOrderDetailFragment();
            if (bundle != null) {
                mallCartOrderDetailFragment.setArguments(bundle);
            }
            return mallCartOrderDetailFragment;
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallCartOrderDetailObj f90373c;

        a0(MallCartOrderDetailObj mallCartOrderDetailObj) {
            this.f90373c = mallCartOrderDetailObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41731, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.H4(MallCartOrderDetailFragment.this, this.f90373c.getOrder_items().get(0).getItems());
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class a1 extends com.max.hbcommon.base.adapter.s<MallProductActionObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCartOrderDetailFragment f90374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(List<MallProductActionObj> list, MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity) {
            super(activity, list, R.layout.mall_component_order_action);
            this.f90374b = mallCartOrderDetailFragment;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MallProductActionObj data) {
            String str;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 41777, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallProductActionObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            kc0 kc0VarA = kc0.a(viewHolder.b());
            kotlin.jvm.internal.f0.o(kc0VarA, "bind(viewHolder.getItemView())");
            kc0VarA.b().setBackgroundResource(R.drawable.white_4dp);
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            Activity mContext = ((com.max.hbcommon.base.d) this.f90374b).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90374b.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            String order_type = mallCartOrderDetailObj.getOrder_type();
            MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90374b.f90354l;
            if (mallCartOrderDetailObj2 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj2 = null;
            }
            String active_type = mallCartOrderDetailObj2.getActive_type();
            String str2 = this.f90374b.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
                str = null;
            } else {
                str = str2;
            }
            mallCartUtils.q(mContext, kc0VarA, data, order_type, active_type, str);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MallProductActionObj mallProductActionObj) {
            if (PatchProxy.proxy(new Object[]{eVar, mallProductActionObj}, this, changeQuickRedirect, false, 41778, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, mallProductActionObj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class a2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f90376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f90377d;

        a2(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f90376c = hBShareData;
            this.f90377d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41810, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.D(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, this.f90376c);
            this.f90377d.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class b extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41687, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            String str;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41688, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131050u0);
                MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                OrderEvent orderEvent = OrderEvent.CANCEL;
                String str2 = MallCartOrderDetailFragment.this.f90353k;
                if (str2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderId");
                    str = null;
                } else {
                    str = str2;
                }
                MallCartUtils.w(mallCartUtils, orderEvent, null, null, null, str, MallCartOrderDetailFragment.this.f90355m, null, 64, null);
                ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41689, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CartItemObj f90380c;

        b0(CartItemObj cartItemObj) {
            this.f90380c = cartItemObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41732, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.Q4(MallCartOrderDetailFragment.this, this.f90380c.getProduct().getStack_coupons(), false);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class b1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90381b;

        b1(com.max.hbcommon.component.i iVar) {
            this.f90381b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41779, new Class[]{View.class}, Void.TYPE).isSupported && this.f90381b.isShowing()) {
                this.f90381b.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class b2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f90383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f90384d;

        b2(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f90383c = hBShareData;
            this.f90384d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41811, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.C(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, this.f90383c);
            this.f90384d.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41690, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41691, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
                if (result.getResult() != null) {
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).x(result.getResult().getPay_price());
                    MallCartOrderDetailFragment.T3(MallCartOrderDetailFragment.this);
                } else if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(MallCartOrderDetailFragment.this.getString(R.string.fail));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41692, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class c0 extends com.max.hbcommon.network.d<Result<WeixinQueryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f90387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f90388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f90389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f90390f;

        c0(boolean z10, int i10, String str, String str2) {
            this.f90387c = z10;
            this.f90388d = i10;
            this.f90389e = str;
            this.f90390f = str2;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41742, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
                if (MallCartOrderDetailFragment.this.f90362t == null) {
                    kotlin.jvm.internal.f0.S("loadingDialog");
                }
                ProgressDialog progressDialog = MallCartOrderDetailFragment.this.f90362t;
                if (progressDialog == null) {
                    kotlin.jvm.internal.f0.S("loadingDialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                MallCartOrderDetailFragment.this.f90366x = false;
            }
        }

        public void onNext(@dl.d Result<WeixinQueryObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41743, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                MallCartOrderDetailFragment.this.f90366x = false;
                if (result.getResult() != null) {
                    String state = result.getResult().getState();
                    com.max.hbcommon.utils.d.b("zzzzmalltest", "queryOutOrder state==" + state);
                    if (!"6".equals(state)) {
                        if ("1".equals(state)) {
                            MallCartOrderDetailFragment.W3(MallCartOrderDetailFragment.this);
                            MallCartOrderDetailFragment.r4(MallCartOrderDetailFragment.this);
                            return;
                        } else {
                            MallCartOrderDetailFragment.W3(MallCartOrderDetailFragment.this);
                            com.max.hbutils.utils.c.d("支付失败");
                            return;
                        }
                    }
                    if (this.f90387c) {
                        MallCartOrderDetailFragment.W3(MallCartOrderDetailFragment.this);
                        MallCartOrderDetailFragment.O4(MallCartOrderDetailFragment.this);
                        return;
                    }
                    int i10 = this.f90388d;
                    if (i10 < 30) {
                        MallCartOrderDetailFragment.s4(MallCartOrderDetailFragment.this, this.f90389e, this.f90390f, i10 + 1, false);
                    } else {
                        MallCartOrderDetailFragment.W3(MallCartOrderDetailFragment.this);
                        MallCartOrderDetailFragment.O4(MallCartOrderDetailFragment.this);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41744, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WeixinQueryObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class c1 extends com.max.hbcommon.base.adapter.s<CartItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCartOrderDetailFragment f90391b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c1(List<CartItemObj> list, MallCartOrderDetailFragment mallCartOrderDetailFragment, Activity activity) {
            super(activity, list, R.layout.item_mall_order_product_info);
            this.f90391b = mallCartOrderDetailFragment;
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d CartItemObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 41780, new Class[]{com.max.hbcommon.base.adapter.s.e.class, CartItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            yp ypVarA = yp.a(viewHolder.b());
            kotlin.jvm.internal.f0.o(ypVarA, "bind(viewHolder.getItemView())");
            ypVarA.b().setBackgroundResource(R.drawable.white_4dp);
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            Activity mContext = ((com.max.hbcommon.base.d) this.f90391b).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            mallCartUtils.o(mContext, ypVarA, data);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, CartItemObj cartItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, cartItemObj}, this, changeQuickRedirect, false, 41781, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, cartItemObj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class c2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HBShareData f90393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f90394d;

        c2(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f90393c = hBShareData;
            this.f90394d = qVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41812, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.z(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, this.f90393c);
            this.f90394d.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90396c;

        d(String str) {
            this.f90396c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41693, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41694, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onNext(result);
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
                KeyDescObj result2 = result.getResult();
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getDesc())) {
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).v(null);
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c.f(MallCartOrderDetailFragment.this.getString(R.string.invalid_coupon_code));
                    } else {
                        com.max.hbutils.utils.c.f(result.getMsg());
                    }
                } else {
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).v(new KeyDescObj());
                    KeyDescObj keyDescObjK = MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k();
                    kotlin.jvm.internal.f0.m(keyDescObjK);
                    keyDescObjK.setKey(this.f90396c);
                    KeyDescObj keyDescObjK2 = MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k();
                    kotlin.jvm.internal.f0.m(keyDescObjK2);
                    keyDescObjK2.setDesc(result2.getDesc());
                }
                MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).u("");
                MallCartOrderDetailFragment.k5(MallCartOrderDetailFragment.this, false, 1, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41695, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41745, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.V3(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class d1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90398b;

        d1(com.max.hbcommon.component.i iVar) {
            this.f90398b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41782, new Class[]{View.class}, Void.TYPE).isSupported && this.f90398b.isShowing()) {
                this.f90398b.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class d2 implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d2() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 41814, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(MallCartOrderDetailFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 41813, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(MallCartOrderDetailFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<MallPriceObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41696, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<MallPriceObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41697, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116290b0.setVisibility(8);
                MallCartOrderDetailFragment.this.f90357o = result.getResult();
                MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).x(result.getResult().getPay_price());
                MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).r(result.getResult().getBase_pay_price());
                MallCartOrderDetailFragment.v4(MallCartOrderDetailFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41698, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPriceObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41746, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.V3(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class e1 extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e1() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41783, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41784, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            MallCartOrderDetailFragment.this.f90356n = true;
            MallCartOrderDetailFragment.this.f90360r = 0;
            MallCartOrderDetailFragment.R4(MallCartOrderDetailFragment.this);
            MallCartOrderDetailFragment.h4(MallCartOrderDetailFragment.this);
            MallCartOrderDetailFragment.g4(MallCartOrderDetailFragment.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41785, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41699, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41700, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                MallCartOrderDetailFragment.r4(MallCartOrderDetailFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41701, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41747, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.p4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class f1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f1 f90405b = new f1();
        public static ChangeQuickRedirect changeQuickRedirect;

        f1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41786, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<MallOrderCancelTipObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41702, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
        }

        public void onNext(@dl.d Result<MallOrderCancelTipObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41703, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                MallCartOrderDetailFragment.this.f90358p = result.getResult();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41704, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderCancelTipObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class g0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41748, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.p4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class g1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41787, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallCartOrderDetailFragment.Q3(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<MallCartOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f90410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f90411d;

        h(boolean z10, boolean z11) {
            this.f90410c = z10;
            this.f90411d = z11;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41706, new Class[0], Void.TYPE).isSupported && MallCartOrderDetailFragment.this.isActive()) {
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                u9 u9Var2 = null;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116308s.A(0);
                u9 u9Var3 = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    u9Var2 = u9Var3;
                }
                u9Var2.f116308s.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41705, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onError(e10);
                MallCartOrderDetailFragment.L4(MallCartOrderDetailFragment.this);
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                u9 u9Var2 = null;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116308s.A(0);
                u9 u9Var3 = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    u9Var2 = u9Var3;
                }
                u9Var2.f116308s.p(0);
            }
        }

        public void onNext(@dl.d Result<MallCartOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41707, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onNext(result);
                MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
                MallCartOrderDetailObj result2 = result.getResult();
                kotlin.jvm.internal.f0.o(result2, "result.result");
                mallCartOrderDetailFragment.f90354l = result2;
                MallCartOrderDetailFragment.q4(MallCartOrderDetailFragment.this, this.f90410c, this.f90411d);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41708, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallCartOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class h0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            String key;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41749, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = null;
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).h() != null) {
                arrayList = new ArrayList();
                arrayList.add(MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).h());
            } else {
                arrayList = null;
            }
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k() != null) {
                KeyDescObj keyDescObjK = MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k();
                kotlin.jvm.internal.f0.m(keyDescObjK);
                key = keyDescObjK.getKey();
            } else {
                key = null;
            }
            androidx.activity.result.g gVar = MallCartOrderDetailFragment.this.f90349g;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("couponLauncher");
                gVar = null;
            }
            Activity activity = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            String str2 = MallCartOrderDetailFragment.this.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
            } else {
                str = str2;
            }
            gVar.b(OrderCouponListActivity.Y1(activity, "mall", str, arrayList, key));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class h1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h1 f90413b = new h1();
        public static ChangeQuickRedirect changeQuickRedirect;

        h1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41788, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41709, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.l.f66572a.q(MallCartOrderDetailFragment.this.getPagePath(), MallCartOrderDetailFragment.this.getPageAdditional());
            if (MallCartOrderDetailFragment.R3(MallCartOrderDetailFragment.this)) {
                if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).g() != null) {
                    MallCartOrderDetailFragment.K4(MallCartOrderDetailFragment.this);
                } else {
                    MallCartOrderDetailFragment.S3(MallCartOrderDetailFragment.this);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class i0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41750, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            MallCartOrderDetailObj mallCartOrderDetailObj = MallCartOrderDetailFragment.this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            com.max.xiaoheihe.base.router.b.k0(mContext, mallCartOrderDetailObj.getCoupon_center_protocol());
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class i1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41789, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallCartOrderDetailFragment.Q3(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41710, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.this.S2();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class j0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            String key;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41751, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = null;
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).h() != null) {
                arrayList = new ArrayList();
                arrayList.add(MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).h());
            } else {
                arrayList = null;
            }
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k() != null) {
                KeyDescObj keyDescObjK = MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k();
                kotlin.jvm.internal.f0.m(keyDescObjK);
                key = keyDescObjK.getKey();
            } else {
                key = null;
            }
            androidx.activity.result.g gVar = MallCartOrderDetailFragment.this.f90349g;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("couponLauncher");
                gVar = null;
            }
            Activity activity = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            String str2 = MallCartOrderDetailFragment.this.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
            } else {
                str = str2;
            }
            gVar.b(OrderCouponListActivity.Y1(activity, "mall", str, arrayList, key));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class j1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j1 f90419b = new j1();
        public static ChangeQuickRedirect changeQuickRedirect;

        j1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41790, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41711, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.i0(mContext, lb.d.f131195k4);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class k0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41752, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.M4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class k1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41791, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallCartOrderDetailFragment.Q3(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class l implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 41712, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            MallCartOrderDetailFragment.this.f90360r = 0;
            MallCartOrderDetailFragment.R4(MallCartOrderDetailFragment.this);
            MallCartOrderDetailFragment.i4(MallCartOrderDetailFragment.this, true, true);
            MallCartOrderDetailFragment.g4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class l0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41753, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.M4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class l1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41792, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.S3(MallCartOrderDetailFragment.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class m implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f90426b = new m();
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41713, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class m0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41754, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            MallCartOrderDetailObj mallCartOrderDetailObj = MallCartOrderDetailFragment.this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            com.max.xiaoheihe.utils.d.o(activity, mallCartOrderDetailObj.getOrder_info().getOrder_id());
            com.max.hbutils.utils.c.f(MallCartOrderDetailFragment.this.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class m1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41793, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.V3(MallCartOrderDetailFragment.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41714, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.finish();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class n0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41755, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.N4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class n1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f90432c;

        n1(String str) {
            this.f90432c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41794, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.n4(MallCartOrderDetailFragment.this, this.f90432c);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class o extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41715, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                super.onNext((Result) result);
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41716, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41756, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.m4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class o1 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o1 f90435b = new o1();
        public static ChangeQuickRedirect changeQuickRedirect;

        o1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41795, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$onResume$1, reason: invalid class name */
    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$onResume$1", f = "MallCartOrderDetailFragment.kt", i = {}, l = {bb.c.b.f30989v5}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super kotlin.b2>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f90436b;

        AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 41734, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : MallCartOrderDetailFragment.this.new AnonymousClass1(cVar);
        }

        @Override // yh.p
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41736, new Class[]{Object.class, Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
        }

        @dl.e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 41735, new Class[]{kotlinx.coroutines.q0.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41733, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f90436b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                this.f90436b = 1;
                if (DelayKt.b(200L, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            if (MallCartOrderDetailFragment.this.f90366x) {
                MallCartOrderDetailFragment.R4(MallCartOrderDetailFragment.this);
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallCartOrderDetailFragment.s4(mallCartOrderDetailFragment, mallCartOrderDetailFragment.f90364v, MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).c(), 0, true);
            return kotlin.b2.f124493a;
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class p extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41717, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (MallCartOrderDetailFragment.this.isActive()) {
                MallCartOrderDetailFragment.h4(MallCartOrderDetailFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41718, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class p0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41757, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailObj mallCartOrderDetailObj = MallCartOrderDetailFragment.this.f90354l;
            MallCartOrderDetailObj mallCartOrderDetailObj2 = null;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj.getStack_coupons();
            if (stack_coupons != null ? kotlin.jvm.internal.f0.g(stack_coupons.getSelected(), Boolean.TRUE) : false) {
                return;
            }
            MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).p(true ^ MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).e());
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).e()) {
                u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var = null;
                }
                u9Var.f116293d.setImageResource(R.drawable.common_select_filled_24x24);
                if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).m() == null) {
                    MallCartOrderDetailObj mallCartOrderDetailObj3 = MallCartOrderDetailFragment.this.f90354l;
                    if (mallCartOrderDetailObj3 == null) {
                        kotlin.jvm.internal.f0.S("mOrderDetailObj");
                        mallCartOrderDetailObj3 = null;
                    }
                    MallOrderStackCouponObj stack_coupons2 = mallCartOrderDetailObj3.getStack_coupons();
                    kotlin.jvm.internal.f0.m(stack_coupons2);
                    for (MallCouponObj mallCouponObj : stack_coupons2.getCoupons()) {
                        String coupon_pool_id = mallCouponObj.getCoupon_pool_id();
                        MallCartOrderDetailObj mallCartOrderDetailObj4 = MallCartOrderDetailFragment.this.f90354l;
                        if (mallCartOrderDetailObj4 == null) {
                            kotlin.jvm.internal.f0.S("mOrderDetailObj");
                            mallCartOrderDetailObj4 = null;
                        }
                        MallOrderStackCouponObj stack_coupons3 = mallCartOrderDetailObj4.getStack_coupons();
                        kotlin.jvm.internal.f0.m(stack_coupons3);
                        MallOrderSuggestCoupon suggest_coupon = stack_coupons3.getSuggest_coupon();
                        if (kotlin.jvm.internal.f0.g(coupon_pool_id, suggest_coupon != null ? suggest_coupon.getCoupon_id() : null)) {
                            MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).w(mallCouponObj);
                            break;
                        }
                    }
                }
            } else {
                MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).w(null);
                u9 u9Var2 = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var2 = null;
                }
                u9Var2.f116293d.setImageResource(R.drawable.unchecked_gray_icon_16x16);
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallCartOrderDetailObj mallCartOrderDetailObj5 = mallCartOrderDetailFragment.f90354l;
            if (mallCartOrderDetailObj5 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
            } else {
                mallCartOrderDetailObj2 = mallCartOrderDetailObj5;
            }
            MallCartOrderDetailFragment.w4(mallCartOrderDetailFragment, mallCartOrderDetailObj2);
            MallCartOrderDetailFragment.Z3(MallCartOrderDetailFragment.this, false);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class p1 implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f90440b;

        p1(TextView textView) {
            this.f90440b = textView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 41796, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 6) {
                this.f90440b.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41719, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallAgreementActivity.a aVar = MallAgreementActivity.M;
            Activity activity = ((com.max.hbcommon.base.d) mallCartOrderDetailFragment).mContext;
            MallCartOrderDetailObj mallCartOrderDetailObj = MallCartOrderDetailFragment.this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            mallCartOrderDetailFragment.startActivity(aVar.a(activity, mallCartOrderDetailObj.getAgreement_title(), false));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class q0 extends com.max.hbcommon.base.adapter.s<MallCouponObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ MallCartOrderDetailFragment f90445b;

            a(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
                this.f90445b = mallCartOrderDetailFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41760, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                MallCartOrderDetailFragment mallCartOrderDetailFragment = this.f90445b;
                MallCartOrderDetailObj mallCartOrderDetailObj = mallCartOrderDetailFragment.f90354l;
                if (mallCartOrderDetailObj == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj = null;
                }
                MallCartOrderDetailFragment.p6(mallCartOrderDetailFragment, mallCartOrderDetailObj.getStack_coupons(), false, 2, null);
            }
        }

        q0(Activity activity, ArrayList<MallCouponObj> arrayList) {
            super(activity, arrayList, R.layout.hbwallet_item_stack_coupon);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MallCouponObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 41758, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            viewHolder.itemView.setBackground(com.max.hbutils.utils.q.o(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, R.color.gold_light_alpha8, 5.0f));
            TextView textView = (TextView) viewHolder.i(R.id.tv_coin);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_num);
            ((TextView) viewHolder.i(R.id.tv_desc)).setText(data.getShort_description());
            textView.setText(data.getValue());
            textView2.setText(data.getNum());
            viewHolder.itemView.setOnClickListener(new a(MallCartOrderDetailFragment.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MallCouponObj mallCouponObj) {
            if (PatchProxy.proxy(new Object[]{eVar, mallCouponObj}, this, changeQuickRedirect, false, 41759, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, mallCouponObj);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class q1 implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f90446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f90447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f90448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f90449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f90450f;

        q1(long j10, TextView textView, TextView textView2, TextView textView3, String str) {
            this.f90446b = j10;
            this.f90447c = textView;
            this.f90448d = textView2;
            this.f90449e = textView3;
            this.f90450f = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 41799, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
            if (com.max.hbutils.utils.n.q(s10.toString()) > this.f90446b) {
                this.f90447c.setText("输入金额超出上限");
                this.f90447c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                this.f90448d.setVisibility(8);
                this.f90449e.setEnabled(false);
                return;
            }
            this.f90447c.setText(this.f90450f);
            this.f90447c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.f90448d.setVisibility(0);
            this.f90449e.setEnabled(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41797, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41798, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    @kotlin.jvm.internal.t0({"SMAP\nMallCartOrderDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MallCartOrderDetailFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartOrderDetailFragment$onRefreshDisplayItem$1$2\n+ 2 SpannableString.kt\nandroidx/core/text/SpannableStringKt\n*L\n1#1,3252:1\n30#2:3253\n30#2:3254\n30#2:3255\n*S KotlinDebug\n*F\n+ 1 MallCartOrderDetailFragment.kt\ncom/max/xiaoheihe/module/mall/cart/ui/MallCartOrderDetailFragment$onRefreshDisplayItem$1$2\n*L\n2618#1:3253\n2629#1:3254\n2630#1:3255\n*E\n"})
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
        public static final class a implements com.max.xiaoheihe.view.m {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MallCartOrderDetailFragment f90452a;

            a(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
                this.f90452a = mallCartOrderDetailFragment;
            }

            @Override // com.max.xiaoheihe.view.m
            public void a(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 41722, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                dialog.dismiss();
                MallCartOrderDetailFragment.I4(this.f90452a);
            }

            @Override // com.max.xiaoheihe.view.m
            public void b(@dl.d Dialog dialog) {
                if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, 41721, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(dialog, "dialog");
                dialog.dismiss();
            }
        }

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41720, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            String strN0 = com.max.xiaoheihe.utils.d.n0(R.string.prompt);
            kotlin.jvm.internal.f0.o(strN0, "getString(string.prompt)");
            SpannableString spannableStringValueOf = SpannableString.valueOf(strN0);
            kotlin.jvm.internal.f0.o(spannableStringValueOf, "valueOf(this)");
            Spannable spannableE = com.max.xiaoheihe.accelworld.l.e(new com.max.xiaoheihe.accelworld.t("查看CDKEY后", com.max.xiaoheihe.accelworld.l.h(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, R.color.text_secondary_2_color)), new com.max.xiaoheihe.accelworld.t("无法退款", com.max.xiaoheihe.accelworld.l.h(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, R.color.text_primary_1_color)));
            String strN1 = com.max.xiaoheihe.utils.d.n0(R.string.ensure_view);
            kotlin.jvm.internal.f0.o(strN1, "getString(string.ensure_view)");
            SpannableString spannableStringValueOf2 = SpannableString.valueOf(strN1);
            kotlin.jvm.internal.f0.o(spannableStringValueOf2, "valueOf(this)");
            String strN2 = com.max.xiaoheihe.utils.d.n0(R.string.cancel);
            kotlin.jvm.internal.f0.o(strN2, "getString(string.cancel)");
            SpannableString spannableStringValueOf3 = SpannableString.valueOf(strN2);
            kotlin.jvm.internal.f0.o(spannableStringValueOf3, "valueOf(this)");
            HBDialogManagerKt.d(mContext, spannableStringValueOf, spannableE, spannableStringValueOf2, spannableStringValueOf3, new a(MallCartOrderDetailFragment.this));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class r0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41761, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallCartOrderDetailObj mallCartOrderDetailObj = mallCartOrderDetailFragment.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallCartOrderDetailFragment.p6(mallCartOrderDetailFragment, mallCartOrderDetailObj.getStack_coupons(), false, 2, null);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class r1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f90454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f90455c;

        r1(long j10, EditText editText) {
            this.f90454b = j10;
            this.f90455c = editText;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41800, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f90455c.setText(String.valueOf(this.f90454b));
            EditText editText = this.f90455c;
            editText.setSelection(editText.getText().length());
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41723, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallCartOrderDetailObj mallCartOrderDetailObj = mallCartOrderDetailFragment.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            List<MallProductActionObj> display_items = mallCartOrderDetailObj.getDisplay_items();
            kotlin.jvm.internal.f0.m(display_items);
            MallCartOrderDetailFragment.G4(mallCartOrderDetailFragment, display_items);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class s0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            String key;
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41762, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).m() != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).m());
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k() != null) {
                KeyDescObj keyDescObjK = MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k();
                kotlin.jvm.internal.f0.m(keyDescObjK);
                key = keyDescObjK.getKey();
            } else {
                key = null;
            }
            androidx.activity.result.g gVar = MallCartOrderDetailFragment.this.f90350h;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("stackcouponLauncher");
                gVar = null;
            }
            Activity activity = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            String str2 = MallCartOrderDetailFragment.this.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
                str = null;
            } else {
                str = str2;
            }
            gVar.b(OrderCouponListActivity.Z1(activity, "mall", str, arrayList, key, null));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class s1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f90458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallCartOrderDetailFragment f90459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90460d;

        s1(EditText editText, MallCartOrderDetailFragment mallCartOrderDetailFragment, com.max.hbcommon.component.i iVar) {
            this.f90458b = editText;
            this.f90459c = mallCartOrderDetailFragment;
            this.f90460d = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41801, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(this.f90458b.getText().toString())) {
                MallCartOrderDetailFragment.l4(this.f90459c).u(null);
            } else {
                MallCartOrderDetailFragment.l4(this.f90459c).u(this.f90458b.getText().toString());
                String strI = MallCartOrderDetailFragment.l4(this.f90459c).i();
                kotlin.jvm.internal.f0.m(strI);
                if (!kotlin.text.u.K1(strI, "0", false, 2, null)) {
                    StringBuilder sb2 = new StringBuilder(MallCartOrderDetailFragment.l4(this.f90459c).i());
                    String strI2 = MallCartOrderDetailFragment.l4(this.f90459c).i();
                    kotlin.jvm.internal.f0.m(strI2);
                    int length = strI2.length() - 1;
                    String strI3 = MallCartOrderDetailFragment.l4(this.f90459c).i();
                    kotlin.jvm.internal.f0.m(strI3);
                    sb2.replace(length, strI3.length(), "0");
                    MallCartOrderDetailFragment.l4(this.f90459c).u(sb2.toString());
                }
            }
            this.f90460d.dismiss();
            MallCartOrderDetailFragment.u4(this.f90459c);
            MallCartOrderDetailFragment.k5(this.f90459c, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PayTypeInfoObj f90462c;

        t(PayTypeInfoObj payTypeInfoObj) {
            this.f90462c = payTypeInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41724, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, this.f90462c.getPay_url());
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class t0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ArrayList arrayList;
            String key;
            String str;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41763, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String coupon_sku_id = null;
            MallCartOrderDetailObj mallCartOrderDetailObj = null;
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).m() != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).m());
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k() != null) {
                KeyDescObj keyDescObjK = MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).k();
                kotlin.jvm.internal.f0.m(keyDescObjK);
                key = keyDescObjK.getKey();
            } else {
                key = null;
            }
            androidx.activity.result.g gVar = MallCartOrderDetailFragment.this.f90350h;
            if (gVar == null) {
                kotlin.jvm.internal.f0.S("stackcouponLauncher");
                gVar = null;
            }
            Activity activity = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            String str2 = MallCartOrderDetailFragment.this.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
                str = null;
            } else {
                str = str2;
            }
            if (MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).e()) {
                MallCartOrderDetailObj mallCartOrderDetailObj2 = MallCartOrderDetailFragment.this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                } else {
                    mallCartOrderDetailObj = mallCartOrderDetailObj2;
                }
                MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj.getStack_coupons();
                kotlin.jvm.internal.f0.m(stack_coupons);
                coupon_sku_id = stack_coupons.getCoupon_sku_id();
            }
            gVar.b(OrderCouponListActivity.Z1(activity, "mall", str, arrayList, key, coupon_sku_id));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class t1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41802, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131029q3);
            intent.putExtra("title", "使用规则");
            ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41725, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.startActivity(MyHcashActivity.n2(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext));
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class u0 implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        u0() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41765, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            List list;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41764, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == 10) {
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
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).t(null);
                } else {
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).t((MallCouponObj) list.get(0));
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).u("");
                }
                if (MallCartOrderDetailFragment.this.f90354l == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                }
                MallCartOrderDetailFragment.k5(MallCartOrderDetailFragment.this, false, 1, null);
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class u1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f90467b;

        u1(com.max.hbcommon.component.i iVar) {
            this.f90467b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41803, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f90467b) == null || !iVar.isShowing()) {
                return;
            }
            this.f90467b.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41726, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130988j4);
            intent.putExtra("title", "帮助");
            ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class v0 implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        v0() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41767, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            List list;
            if (!PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41766, new Class[]{ActivityResult.class}, Void.TYPE).isSupported && activityResult.b() == 10) {
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
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).w(null);
                } else {
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).w((MallCouponObj) list.get(0));
                }
                MallCartOrderDetailFragment.k5(MallCartOrderDetailFragment.this, false, 1, null);
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class v1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v5 f90470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallCartOrderDetailFragment f90471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<com.max.hbcommon.component.i> f90472d;

        v1(v5 v5Var, MallCartOrderDetailFragment mallCartOrderDetailFragment, Ref.ObjectRef<com.max.hbcommon.component.i> objectRef) {
            this.f90470b = v5Var;
            this.f90471c = mallCartOrderDetailFragment;
            this.f90472d = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41804, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f90470b.f116635c.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                MallCartOrderDetailFragment.l4(this.f90471c).v(null);
                MallCartOrderDetailFragment.x4(this.f90471c);
                MallCartOrderDetailFragment.l4(this.f90471c).u("");
                MallCartOrderDetailFragment.u4(this.f90471c);
                MallCartOrderDetailFragment.k5(this.f90471c, false, 1, null);
            } else {
                MallCartOrderDetailFragment.U3(this.f90471c, string);
            }
            this.f90472d.f124891b.dismiss();
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41727, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130982i4);
            intent.putExtra("title", "帮助");
            ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class w0 implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        w0() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41769, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41768, new Class[]{ActivityResult.class}, Void.TYPE).isSupported) {
                return;
            }
            if (activityResult.b() == 2) {
                com.max.hbcache.c.L(true);
                MallCartOrderDetailFragment.S3(MallCartOrderDetailFragment.this);
            } else if (activityResult.b() == 1) {
                com.max.hbcache.c.L(false);
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class w1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<com.max.hbcommon.component.i> f90476b;

        w1(Ref.ObjectRef<com.max.hbcommon.component.i> objectRef) {
            this.f90476b = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41805, new Class[]{View.class}, Void.TYPE).isSupported && this.f90476b.f124891b.isShowing()) {
                this.f90476b.f124891b.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41728, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130994k4);
            intent.putExtra("title", "帮助");
            ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class x0 implements androidx.activity.result.a<ActivityResult> {
        public static ChangeQuickRedirect changeQuickRedirect;

        x0() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(ActivityResult activityResult) {
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41771, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(activityResult);
        }

        public final void b(ActivityResult activityResult) {
            Intent intentA;
            Serializable serializableExtra;
            if (PatchProxy.proxy(new Object[]{activityResult}, this, changeQuickRedirect, false, 41770, new Class[]{ActivityResult.class}, Void.TYPE).isSupported || activityResult.b() != -1 || activityResult.a() == null || (intentA = activityResult.a()) == null || (serializableExtra = intentA.getSerializableExtra(AddAddressActivity.Q)) == null) {
                return;
            }
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallCartOrderDetailFragment.l4(mallCartOrderDetailFragment).s((AddressInfoObj) serializableExtra);
            MallCartOrderDetailFragment.t4(mallCartOrderDetailFragment, MallCartOrderDetailFragment.l4(mallCartOrderDetailFragment).g());
            MallCartOrderDetailFragment.o4(mallCartOrderDetailFragment);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class x1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41806, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallCartOrderDetailFragment mallCartOrderDetailFragment = MallCartOrderDetailFragment.this;
            MallCartOrderDetailFragment.s4(mallCartOrderDetailFragment, mallCartOrderDetailFragment.f90364v, MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).c(), 0, true);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41729, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            int id2 = view.getId();
            u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
            u9 u9Var2 = null;
            if (u9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var = null;
            }
            if (id2 == u9Var.U.f116248h.getId()) {
                MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).o(PaymentManager.A);
            } else {
                u9 u9Var3 = MallCartOrderDetailFragment.this.f90345c;
                if (u9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var3 = null;
                }
                if (id2 == u9Var3.U.f116250j.getId()) {
                    MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).o(PaymentManager.f71426y);
                } else {
                    u9 u9Var4 = MallCartOrderDetailFragment.this.f90345c;
                    if (u9Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var4 = null;
                    }
                    if (id2 == u9Var4.U.f116246f.getId()) {
                        MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).o(PaymentManager.f71427z);
                    } else {
                        u9 u9Var5 = MallCartOrderDetailFragment.this.f90345c;
                        if (u9Var5 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                        } else {
                            u9Var2 = u9Var5;
                        }
                        if (id2 == u9Var2.U.f116249i.getId()) {
                            MallCartOrderDetailFragment.l4(MallCartOrderDetailFragment.this).o("lianlian");
                        }
                    }
                }
            }
            MallCartOrderDetailFragment.S4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class y0 implements com.max.xiaoheihe.module.mall.cart.ui.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        y0() {
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41774, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : MallCartOrderDetailFragment.P3(MallCartOrderDetailFragment.this);
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public void b() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41773, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.J4(MallCartOrderDetailFragment.this);
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public void c() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41772, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MallCartOrderDetailFragment.Q3(MallCartOrderDetailFragment.this);
        }

        @Override // com.max.xiaoheihe.module.mall.cart.ui.c
        public boolean d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41775, new Class[0], Boolean.TYPE);
            return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : MallCartOrderDetailFragment.P4(MallCartOrderDetailFragment.this);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class y1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 41807, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallCartOrderDetailFragment.this.f90364v = null;
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CartItemObj f90484c;

        z(CartItemObj cartItemObj) {
            this.f90484c = cartItemObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41730, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            Activity mContext = ((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            mallCartUtils.l(mContext, this.f90484c);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class z0 extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        z0(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 41776, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            SpannableString spannableString = new SpannableString("支付订单 " + simpleDateFormat.format(new Date(j10)));
            spannableString.setSpan(new ForegroundColorSpan(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.getResources().getColor(R.color.text_secondary_1_color)), 5, spannableString.length(), 33);
            spannableString.setSpan(new AbsoluteSizeSpan(((com.max.hbcommon.base.d) MallCartOrderDetailFragment.this).mContext.getResources().getDimensionPixelSize(R.dimen.text_size_14)), 5, spannableString.length(), 33);
            spannableString.setSpan(new com.max.hbcustomview.spans.g(bb.d.a().b(4)), 5, spannableString.length(), 33);
            u9 u9Var = MallCartOrderDetailFragment.this.f90345c;
            if (u9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var = null;
            }
            u9Var.I.setRightText(spannableString);
        }
    }

    /* JADX INFO: compiled from: MallCartOrderDetailFragment.kt */
    public static final class z1 extends com.max.hbwallet.h1 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z1(Activity mContext, ArrayList<MallCouponObj> arrayList) {
            super(mContext, arrayList);
            kotlin.jvm.internal.f0.o(mContext, "mContext");
        }

        @Override // com.max.hbwallet.h1, com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, MallCouponObj mallCouponObj) {
            if (PatchProxy.proxy(new Object[]{eVar, mallCouponObj}, this, changeQuickRedirect, false, 41809, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            w(eVar, mallCouponObj);
        }

        @Override // com.max.hbwallet.h1
        public void w(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d MallCouponObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 41808, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(viewHolder, "viewHolder");
            kotlin.jvm.internal.f0.p(data, "data");
            super.w(viewHolder, data);
            ((TextView) viewHolder.i(R.id.tv_action)).setVisibility(8);
        }
    }

    public MallCartOrderDetailFragment() {
        d2 d2Var = new d2();
        this.F = d2Var;
        this.G = new com.max.hbshare.c.b(com.max.hbshare.c.f72545a, d2Var, (JsonObject) com.max.hbutils.utils.k.a(getPageAdditional(), JsonObject.class));
    }

    private final void A5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41590, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ha(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    private final void B5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41565, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90353k;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        }
        AddressInfoObj addressInfoObjG = u5().g();
        addDisposable((io.reactivex.disposables.b) eVarA.V7(str, addressInfoObjG != null ? addressInfoObjG.getId() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p()));
    }

    private final void C5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41585, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        String str = null;
        MallCartOrderDetailObj mallCartOrderDetailObj2 = null;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        if (mallCartOrderDetailObj.getBottom_button() == null) {
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
        if (mallCartOrderDetailObj3 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj3 = null;
        }
        MallOrderBottomBtnObj bottom_button = mallCartOrderDetailObj3.getBottom_button();
        kotlin.jvm.internal.f0.m(bottom_button);
        if (kotlin.jvm.internal.f0.g("share", bottom_button.getType())) {
            MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
            if (mallCartOrderDetailObj4 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj4 = null;
            }
            if (mallCartOrderDetailObj4.getShare_info() != null) {
                MallCartOrderDetailObj mallCartOrderDetailObj5 = this.f90354l;
                if (mallCartOrderDetailObj5 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                } else {
                    mallCartOrderDetailObj2 = mallCartOrderDetailObj5;
                }
                q6(mallCartOrderDetailObj2);
                return;
            }
        }
        if (kotlin.jvm.internal.f0.g("open_web", bottom_button.getType())) {
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.k0(mContext, bottom_button.getUrl());
        } else if (!kotlin.jvm.internal.f0.g("comfirm_receipt", bottom_button.getType())) {
            if (kotlin.jvm.internal.f0.g("refund", bottom_button.getType())) {
                V4();
            }
        } else {
            String str2 = this.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
            } else {
                str = str2;
            }
            j6(str);
        }
    }

    private final void D5(boolean z10, boolean z11) {
        int i10;
        u9 u9Var;
        int i11 = 2;
        char c10 = 1;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41571, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f90354l == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
        }
        t6();
        u9 u9Var2 = this.f90345c;
        if (u9Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var2 = null;
        }
        u9Var2.W.f116688b.removeAllViews();
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        this.f90355m = mallCartOrderDetailObj.getOrder_info().getH_src();
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj2 = null;
        }
        List<OrderDetailActivityObj> activity_list = mallCartOrderDetailObj2.getActivity_list();
        if (activity_list != null) {
            for (OrderDetailActivityObj orderDetailActivityObj : activity_list) {
                a aVar = H;
                Activity mContext = this.mContext;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                View viewA = aVar.a(mContext, orderDetailActivityObj);
                if (viewA != null) {
                    u9 u9Var3 = this.f90345c;
                    if (u9Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var3 = null;
                    }
                    u9Var3.W.f116688b.addView(viewA);
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                }
            }
            kotlin.b2 b2Var2 = kotlin.b2.f124493a;
        }
        if (com.max.hbcommon.utils.c.u(u5().n())) {
            MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
            if (mallCartOrderDetailObj3 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj3 = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj3.getDiscount_params_v2();
            if (com.max.hbcommon.utils.c.u(discount_params_v2 != null ? discount_params_v2.getPay_price() : null)) {
                com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU5 = u5();
                MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
                if (mallCartOrderDetailObj4 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj4 = null;
                }
                bVarU5.x(mallCartOrderDetailObj4.getCurrent_price());
            } else {
                com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU6 = u5();
                MallCartOrderDetailObj mallCartOrderDetailObj5 = this.f90354l;
                if (mallCartOrderDetailObj5 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj5 = null;
                }
                MallPriceObj discount_params_v3 = mallCartOrderDetailObj5.getDiscount_params_v2();
                bVarU6.x(discount_params_v3 != null ? discount_params_v3.getPay_price() : null);
            }
        }
        if (Y4() == TYPE_CODE.WAITING_FOR_PAY) {
            this.mTitleBar.setTitle("确认订单");
            u9 u9Var4 = this.f90345c;
            if (u9Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var4 = null;
            }
            u9Var4.I.setVisibility(0);
            MallCartOrderDetailObj mallCartOrderDetailObj6 = this.f90354l;
            if (mallCartOrderDetailObj6 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj6 = null;
            }
            String time_remaining = mallCartOrderDetailObj6.getOrder_info().getTime_remaining();
            if (time_remaining != null) {
                d6(time_remaining);
                kotlin.b2 b2Var3 = kotlin.b2.f124493a;
            }
            MallCartOrderDetailObj mallCartOrderDetailObj7 = this.f90354l;
            if (mallCartOrderDetailObj7 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj7 = null;
            }
            MallPayPurchaseParams purchase_params = mallCartOrderDetailObj7.getPurchase_params();
            if (purchase_params != null) {
                com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU7 = u5();
                String pay_type = purchase_params.getPay_type();
                kotlin.jvm.internal.f0.o(pay_type, "it.pay_type");
                bVarU7.o(pay_type);
                kotlin.b2 b2Var4 = kotlin.b2.f124493a;
            }
            MallCartOrderDetailObj mallCartOrderDetailObj8 = this.f90354l;
            if (mallCartOrderDetailObj8 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj8 = null;
            }
            F5(mallCartOrderDetailObj8);
            u9 u9Var5 = this.f90345c;
            if (u9Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var5 = null;
            }
            u9Var5.S.setVisibility(8);
            u9 u9Var6 = this.f90345c;
            if (u9Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var6 = null;
            }
            u9Var6.f116304o.setVisibility(8);
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var7 = null;
            }
            u9Var7.T.b().setVisibility(8);
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var8 = null;
            }
            u9Var8.f116305p.setVisibility(8);
            MallCartOrderDetailObj mallCartOrderDetailObj9 = this.f90354l;
            if (mallCartOrderDetailObj9 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj9 = null;
            }
            if (mallCartOrderDetailObj9.getNotify_message() == null) {
                u9 u9Var9 = this.f90345c;
                if (u9Var9 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var9 = null;
                }
                u9Var9.E.setVisibility(0);
            } else {
                u9 u9Var10 = this.f90345c;
                if (u9Var10 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var10 = null;
                }
                u9Var10.E.setVisibility(8);
            }
            i10 = 1;
        } else {
            this.mTitleBar.setTitle("订单详情");
            u9 u9Var11 = this.f90345c;
            if (u9Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var11 = null;
            }
            u9Var11.I.setVisibility(8);
            u9 u9Var12 = this.f90345c;
            if (u9Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var12 = null;
            }
            u9Var12.V.setVisibility(8);
            u9 u9Var13 = this.f90345c;
            if (u9Var13 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var13 = null;
            }
            u9Var13.f116306q.setVisibility(8);
            u9 u9Var14 = this.f90345c;
            if (u9Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var14 = null;
            }
            u9Var14.T.b().setVisibility(0);
            u9 u9Var15 = this.f90345c;
            if (u9Var15 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var15 = null;
            }
            TextView textView = u9Var15.T.f113801c;
            MallCartOrderDetailObj mallCartOrderDetailObj10 = this.f90354l;
            if (mallCartOrderDetailObj10 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj10 = null;
            }
            textView.setText(mallCartOrderDetailObj10.getTitle());
            MallCartOrderDetailObj mallCartOrderDetailObj11 = this.f90354l;
            if (mallCartOrderDetailObj11 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj11 = null;
            }
            String msg = mallCartOrderDetailObj11.getMsg();
            if (msg != null) {
                SpannableString spannableString = new SpannableString(msg);
                MallCartOrderDetailObj mallCartOrderDetailObj12 = this.f90354l;
                if (mallCartOrderDetailObj12 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj12 = null;
                }
                Integer[][] msg_hl = mallCartOrderDetailObj12.getMsg_hl();
                if (msg_hl != null) {
                    int length = msg_hl.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Integer[] numArr = msg_hl[i12];
                        if (numArr.length == i11) {
                            int iIntValue = numArr[0].intValue();
                            int iIntValue2 = numArr[c10].intValue();
                            if (((iIntValue < 0 || iIntValue >= msg.length()) ? (char) 0 : c10) != 0) {
                                if (((iIntValue2 < 0 || iIntValue2 >= msg.length()) ? (char) 0 : c10) != 0) {
                                    spannableString.setSpan(new ForegroundColorSpan(-1), iIntValue, iIntValue2, 33);
                                }
                            }
                        }
                        i12++;
                        i11 = 2;
                        c10 = 1;
                    }
                    kotlin.b2 b2Var5 = kotlin.b2.f124493a;
                }
                u9 u9Var16 = this.f90345c;
                if (u9Var16 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var16 = null;
                }
                u9Var16.T.f113800b.setText(spannableString);
                kotlin.b2 b2Var6 = kotlin.b2.f124493a;
            }
            u9 u9Var17 = this.f90345c;
            if (u9Var17 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var17 = null;
            }
            u9Var17.f116305p.setVisibility(0);
            u9 u9Var18 = this.f90345c;
            if (u9Var18 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var18 = null;
            }
            u9Var18.E.setVisibility(8);
            S5();
            i10 = 1;
        }
        K5(this, null, i10, null);
        b6();
        com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU8 = u5();
        MallCartOrderDetailObj mallCartOrderDetailObj13 = this.f90354l;
        if (mallCartOrderDetailObj13 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj13 = null;
        }
        bVarU8.s(mallCartOrderDetailObj13.getAddress());
        Y4();
        MallCartOrderDetailObj mallCartOrderDetailObj14 = this.f90354l;
        if (mallCartOrderDetailObj14 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj14 = null;
        }
        if (com.max.hbcommon.utils.c.u(mallCartOrderDetailObj14.getService_agreement())) {
            u9 u9Var19 = this.f90345c;
            if (u9Var19 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var19 = null;
            }
            u9Var19.f116315z.setVisibility(8);
        } else {
            u9 u9Var20 = this.f90345c;
            if (u9Var20 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var20 = null;
            }
            u9Var20.f116315z.setVisibility(0);
            u9 u9Var21 = this.f90345c;
            if (u9Var21 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var21 = null;
            }
            TextView textView2 = u9Var21.f116315z;
            MallCartOrderDetailObj mallCartOrderDetailObj15 = this.f90354l;
            if (mallCartOrderDetailObj15 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj15 = null;
            }
            textView2.setText(mallCartOrderDetailObj15.getAgreement_title());
            u9 u9Var22 = this.f90345c;
            if (u9Var22 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var22 = null;
            }
            u9Var22.f116315z.setOnClickListener(new q());
        }
        MallCartUtils mallCartUtils = MallCartUtils.f90196a;
        u9 u9Var23 = this.f90345c;
        if (u9Var23 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var23 = null;
        }
        LinearLayout linearLayoutB = u9Var23.R.b();
        MallCartOrderDetailObj mallCartOrderDetailObj16 = this.f90354l;
        if (mallCartOrderDetailObj16 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj16 = null;
        }
        mallCartUtils.s(linearLayoutB, mallCartOrderDetailObj16.getNotify_message());
        u9 u9Var24 = this.f90345c;
        if (u9Var24 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var24 = null;
        }
        TextView textView3 = u9Var24.W.f116698l;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 65509);
        MallCartOrderDetailObj mallCartOrderDetailObj17 = this.f90354l;
        if (mallCartOrderDetailObj17 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj17 = null;
        }
        sb2.append(com.max.xiaoheihe.module.game.r1.I(mallCartOrderDetailObj17.getCurrent_price()));
        textView3.setText(sb2.toString());
        Q5();
        E5();
        MallCartOrderDetailObj mallCartOrderDetailObj18 = this.f90354l;
        if (mallCartOrderDetailObj18 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj18 = null;
        }
        G5(mallCartOrderDetailObj18);
        if (Y4() == TYPE_CODE.WAITING_FOR_PAY) {
            MallCartOrderDetailObj mallCartOrderDetailObj19 = this.f90354l;
            if (mallCartOrderDetailObj19 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj19 = null;
            }
            SuggestDiscountInfo choose_discount_info = mallCartOrderDetailObj19.getChoose_discount_info();
            if (choose_discount_info != null ? kotlin.jvm.internal.f0.g(choose_discount_info.getShow_help(), Boolean.FALSE) : false) {
                u9 u9Var25 = this.f90345c;
                if (u9Var25 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var25 = null;
                }
                u9Var25.Q.setVisibility(8);
            } else {
                u9 u9Var26 = this.f90345c;
                if (u9Var26 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var26 = null;
                }
                u9Var26.Q.setVisibility(0);
            }
            MallCartOrderDetailObj mallCartOrderDetailObj20 = this.f90354l;
            if (mallCartOrderDetailObj20 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj20 = null;
            }
            MallPayPurchaseParams purchase_params2 = mallCartOrderDetailObj20.getPurchase_params();
            if (purchase_params2 != null) {
                com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU9 = u5();
                String pay_type2 = purchase_params2.getPay_type();
                kotlin.jvm.internal.f0.o(pay_type2, "it.pay_type");
                bVarU9.o(pay_type2);
                this.f90364v = purchase_params2.getOut_order_id();
                u5().u(purchase_params2.getDeduct_coin());
                if (!com.max.hbcommon.utils.c.u(purchase_params2.getCoupon_id())) {
                    u5().t(new MallCouponObj());
                    MallCouponObj mallCouponObjH = u5().h();
                    kotlin.jvm.internal.f0.m(mallCouponObjH);
                    mallCouponObjH.setCoupon_id(purchase_params2.getCoupon_id());
                }
                if (!com.max.hbcommon.utils.c.u(purchase_params2.getStack_coupon_id())) {
                    u5().w(new MallCouponObj());
                    MallCouponObj mallCouponObjM = u5().m();
                    kotlin.jvm.internal.f0.m(mallCouponObjM);
                    mallCouponObjM.setCoupon_id(purchase_params2.getStack_coupon_id());
                }
                if (!com.max.hbcommon.utils.c.u(purchase_params2.getStack_coupon_pool_id())) {
                    u5().w(new MallCouponObj());
                    MallCouponObj mallCouponObjM2 = u5().m();
                    kotlin.jvm.internal.f0.m(mallCouponObjM2);
                    mallCouponObjM2.setCoupon_pool_id(purchase_params2.getStack_coupon_pool_id());
                }
                MallCartOrderDetailObj mallCartOrderDetailObj21 = this.f90354l;
                if (mallCartOrderDetailObj21 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj21 = null;
                }
                MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj21.getStack_coupons();
                if (stack_coupons != null ? kotlin.jvm.internal.f0.g(stack_coupons.getSelected(), Boolean.TRUE) : false) {
                    u5().p(true);
                }
                if (!com.max.hbcommon.utils.c.u(purchase_params2.getPurchase_code())) {
                    u5().v(new KeyDescObj());
                    KeyDescObj keyDescObjK = u5().k();
                    kotlin.jvm.internal.f0.m(keyDescObjK);
                    keyDescObjK.setKey(purchase_params2.getPurchase_code());
                }
                if (z10) {
                    I5(this.f90364v, u5().c(), 0, z11);
                }
                kotlin.b2 b2Var7 = kotlin.b2.f124493a;
            }
            MallCartOrderDetailObj mallCartOrderDetailObj22 = this.f90354l;
            if (mallCartOrderDetailObj22 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj22 = null;
            }
            if (mallCartOrderDetailObj22.getPurchase_params() == null && !this.B) {
                MallCartOrderDetailObj mallCartOrderDetailObj23 = this.f90354l;
                if (mallCartOrderDetailObj23 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj23 = null;
                }
                SuggestDiscountInfo choose_discount_info2 = mallCartOrderDetailObj23.getChoose_discount_info();
                if (choose_discount_info2 != null) {
                    this.B = true;
                    u5().u(choose_discount_info2.getHcoin());
                    if (!com.max.hbcommon.utils.c.u(choose_discount_info2.getCoupon_id())) {
                        u5().t(new MallCouponObj());
                        MallCouponObj mallCouponObjH2 = u5().h();
                        kotlin.jvm.internal.f0.m(mallCouponObjH2);
                        mallCouponObjH2.setCoupon_id(choose_discount_info2.getCoupon_id());
                    }
                    if (!com.max.hbcommon.utils.c.u(choose_discount_info2.getStack_coupon_id())) {
                        u5().w(new MallCouponObj());
                        MallCouponObj mallCouponObjM3 = u5().m();
                        kotlin.jvm.internal.f0.m(mallCouponObjM3);
                        mallCouponObjM3.setCoupon_id(choose_discount_info2.getStack_coupon_id());
                    }
                    kotlin.b2 b2Var8 = kotlin.b2.f124493a;
                }
            }
            k5(this, false, 1, null);
        } else {
            u9 u9Var27 = this.f90345c;
            if (u9Var27 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var = null;
            } else {
                u9Var = u9Var27;
            }
            u9Var.Q.setVisibility(0);
        }
        P5();
        Y5();
        M5();
        L5();
        b5();
    }

    private final void E5() {
        boolean z10;
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41615, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        u9 u9Var = null;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        List<MallProductActionObj> display_items = mallCartOrderDetailObj.getDisplay_items();
        if (display_items == null || display_items.isEmpty()) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            u9Var2.N.setVisibility(8);
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var3;
            }
            u9Var.f116301l.setVisibility(8);
            return;
        }
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.N.setVisibility(0);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.f116301l.setVisibility(0);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.N.removeAllViews();
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj2 = null;
        }
        List<MallProductActionObj> display_items2 = mallCartOrderDetailObj2.getDisplay_items();
        kotlin.jvm.internal.f0.m(display_items2);
        int iMin = Math.min(display_items2.size(), 3);
        for (int i10 = 0; i10 < iMin; i10++) {
            MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
            if (mallCartOrderDetailObj3 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj3 = null;
            }
            List<MallProductActionObj> display_items3 = mallCartOrderDetailObj3.getDisplay_items();
            kotlin.jvm.internal.f0.m(display_items3);
            MallProductActionObj mallProductActionObj = display_items3.get(i10);
            LayoutInflater layoutInflater = getLayoutInflater();
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var7 = null;
            }
            kc0 kc0VarD = kc0.d(layoutInflater, u9Var7.N, false);
            kotlin.jvm.internal.f0.o(kc0VarD, "inflate(\n               …lse\n                    )");
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
            if (mallCartOrderDetailObj4 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj4 = null;
            }
            String order_type = mallCartOrderDetailObj4.getOrder_type();
            MallCartOrderDetailObj mallCartOrderDetailObj5 = this.f90354l;
            if (mallCartOrderDetailObj5 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj5 = null;
            }
            String active_type = mallCartOrderDetailObj5.getActive_type();
            String str2 = this.f90353k;
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
                str = null;
            } else {
                str = str2;
            }
            mallCartUtils.q(mContext, kc0VarD, mallProductActionObj, order_type, active_type, str);
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var8 = null;
            }
            if (u9Var8.N.getChildCount() > 0) {
                View view = new View(this.mContext);
                view.setBackgroundResource(R.color.divider_secondary_1_color);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(this.mContext, 0.5f));
                layoutParams.leftMargin = ViewUtils.f(this.mContext, 12.0f);
                layoutParams.rightMargin = ViewUtils.f(this.mContext, 12.0f);
                u9 u9Var9 = this.f90345c;
                if (u9Var9 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var9 = null;
                }
                u9Var9.N.addView(view, layoutParams);
            }
            u9 u9Var10 = this.f90345c;
            if (u9Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var10 = null;
            }
            u9Var10.N.addView(kc0VarD.b());
        }
        MallCartOrderDetailObj mallCartOrderDetailObj6 = this.f90354l;
        if (mallCartOrderDetailObj6 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj6 = null;
        }
        List<MallProductActionObj> display_items4 = mallCartOrderDetailObj6.getDisplay_items();
        if (display_items4 != null) {
            if (display_items4.isEmpty()) {
                z10 = true;
                break;
            }
            Iterator<T> it = display_items4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                String cdkey = ((MallProductActionObj) it.next()).getCdkey();
                if (!(cdkey == null || kotlin.text.u.V1(cdkey))) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                MallCartOrderDetailObj mallCartOrderDetailObj7 = this.f90354l;
                if (mallCartOrderDetailObj7 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj7 = null;
                }
                if (kotlin.jvm.internal.f0.g(mallCartOrderDetailObj7.getAllow_show(), Boolean.TRUE)) {
                    LinearLayout linearLayout = new LinearLayout(getContext());
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.setOrientation(0);
                    TextView textView = new TextView(getContext());
                    Context context = textView.getContext();
                    kotlin.jvm.internal.f0.o(context, "context");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, com.max.xiaoheihe.accelworld.l.d(36, context));
                    Context context2 = textView.getContext();
                    kotlin.jvm.internal.f0.o(context2, "context");
                    layoutParams2.bottomMargin = com.max.xiaoheihe.accelworld.l.d(8, context2);
                    Context context3 = textView.getContext();
                    kotlin.jvm.internal.f0.o(context3, "context");
                    layoutParams2.bottomMargin = com.max.xiaoheihe.accelworld.l.d(12, context3);
                    Context context4 = textView.getContext();
                    kotlin.jvm.internal.f0.o(context4, "context");
                    layoutParams2.setMarginStart(com.max.xiaoheihe.accelworld.l.d(12, context4));
                    Context context5 = textView.getContext();
                    kotlin.jvm.internal.f0.o(context5, "context");
                    layoutParams2.setMarginEnd(com.max.xiaoheihe.accelworld.l.d(12, context5));
                    textView.setLayoutParams(layoutParams2);
                    textView.setGravity(17);
                    textView.setVisibility(0);
                    com.max.xiaoheihe.accelworld.l.q(textView, R.color.divider_secondary_1_color, 5.0f);
                    textView.setTextColor(androidx.core.content.d.f(textView.getContext(), R.color.text_clickable_color));
                    if (display_items4.size() > 1) {
                        textView.setText("立即查看全部CDKEY");
                        textView.setTypeface(null, 1);
                    } else if (!display_items4.isEmpty()) {
                        textView.setText("立即查看CDKEY");
                        textView.setTypeface(null, 1);
                    } else {
                        textView.setVisibility(8);
                    }
                    textView.setOnClickListener(new r());
                    linearLayout.addView(textView);
                    u9 u9Var11 = this.f90345c;
                    if (u9Var11 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        u9Var = u9Var11;
                    }
                    u9Var.N.addView(linearLayout);
                    return;
                }
            }
            MallCartOrderDetailObj mallCartOrderDetailObj8 = this.f90354l;
            if (mallCartOrderDetailObj8 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj8 = null;
            }
            List<MallProductActionObj> display_items5 = mallCartOrderDetailObj8.getDisplay_items();
            kotlin.jvm.internal.f0.m(display_items5);
            if (display_items5.size() > 3) {
                LinearLayout linearLayout2 = new LinearLayout(this.mContext);
                linearLayout2.setGravity(17);
                TextView textView2 = new TextView(this.mContext);
                textView2.setIncludeFontPadding(false);
                textView2.setTextSize(1, 12.0f);
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("查看全部");
                MallCartOrderDetailObj mallCartOrderDetailObj9 = this.f90354l;
                if (mallCartOrderDetailObj9 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj9 = null;
                }
                List<MallProductActionObj> display_items6 = mallCartOrderDetailObj9.getDisplay_items();
                kotlin.jvm.internal.f0.m(display_items6);
                sb2.append(display_items6.size());
                sb2.append((char) 20010);
                textView2.setText(sb2.toString());
                linearLayout2.addView(textView2);
                ImageView imageView = new ImageView(this.mContext);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 14.0f), ViewUtils.f(this.mContext, 14.0f));
                layoutParams3.leftMargin = ViewUtils.f(this.mContext, 2.0f);
                imageView.setImageResource(R.drawable.special_right_small_line_24x24);
                linearLayout2.addView(imageView, layoutParams3);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, ViewUtils.f(this.mContext, 44.5f));
                linearLayout2.setOnClickListener(new s());
                u9 u9Var12 = this.f90345c;
                if (u9Var12 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    u9Var = u9Var12;
                }
                u9Var.N.addView(linearLayout2, layoutParams4);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void F5(MallCartOrderDetailObj mallCartOrderDetailObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailObj}, this, changeQuickRedirect, false, 41611, new Class[]{MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = this.f90345c;
        u9 u9Var2 = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        u9Var.V.setVisibility(0);
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.f116306q.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.U.f116258r.setText("余额：¥" + (com.max.hbutils.utils.n.p(mallCartOrderDetailObj.getTotal_hbalance()) / 100));
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.U.f116250j.setImageResource(R.drawable.common_select_single_filled_16x16);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        TextView textView = u9Var6.U.f116256p;
        MallPayExtraInfo pay_info = mallCartOrderDetailObj.getPay_info();
        textView.setText(pay_info != null ? pay_info.getAlipay_msg() : null);
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        TextView textView2 = u9Var7.U.f116260t;
        MallPayExtraInfo pay_info2 = mallCartOrderDetailObj.getPay_info();
        textView2.setText(pay_info2 != null ? pay_info2.getWeixin_msg() : null);
        u9 u9Var8 = this.f90345c;
        if (u9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var8 = null;
        }
        TextView textView3 = u9Var8.U.f116259s;
        MallPayExtraInfo pay_info3 = mallCartOrderDetailObj.getPay_info();
        textView3.setText(pay_info3 != null ? pay_info3.getLianlian_msg() : null);
        List<PayTypeInfoObj> payment_list = mallCartOrderDetailObj.getPayment_list();
        if (payment_list != null && !payment_list.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            u9 u9Var9 = this.f90345c;
            if (u9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var9 = null;
            }
            u9Var9.U.f116265y.setVisibility(8);
        } else {
            PayTypeInfoObj payTypeInfoObjB = PaymentManager.B(mallCartOrderDetailObj.getPayment_list());
            if (payTypeInfoObjB != null) {
                u9 u9Var10 = this.f90345c;
                if (u9Var10 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var10 = null;
                }
                u9Var10.U.f116265y.setOnClickListener(new t(payTypeInfoObjB));
                String icon = payTypeInfoObjB.getIcon();
                u9 u9Var11 = this.f90345c;
                if (u9Var11 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var11 = null;
                }
                com.max.hbimage.b.K(icon, u9Var11.U.f116252l);
                u9 u9Var12 = this.f90345c;
                if (u9Var12 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var12 = null;
                }
                u9Var12.U.f116257q.setText(payTypeInfoObjB.getName());
                u9 u9Var13 = this.f90345c;
                if (u9Var13 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var13 = null;
                }
                u9Var13.U.f116265y.setVisibility(0);
            }
            u9 u9Var14 = this.f90345c;
            if (u9Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var14 = null;
            }
            u9Var14.U.b().removeAllViews();
            List<PayTypeInfoObj> payment_list2 = mallCartOrderDetailObj.getPayment_list();
            kotlin.jvm.internal.f0.m(payment_list2);
            Iterator<PayTypeInfoObj> it = payment_list2.iterator();
            while (it.hasNext()) {
                String pay_type = it.next().getPay_type();
                if (pay_type != null) {
                    switch (pay_type.hashCode()) {
                        case -1414960566:
                            if (pay_type.equals(PaymentManager.f71422u)) {
                                u9 u9Var15 = this.f90345c;
                                if (u9Var15 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var15 = null;
                                }
                                LinearLayout linearLayoutB = u9Var15.U.b();
                                u9 u9Var16 = this.f90345c;
                                if (u9Var16 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var16 = null;
                                }
                                linearLayoutB.addView(u9Var16.U.f116264x);
                            }
                            break;
                        case -791770330:
                            if (pay_type.equals("wechat")) {
                                u9 u9Var17 = this.f90345c;
                                if (u9Var17 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var17 = null;
                                }
                                LinearLayout linearLayoutB2 = u9Var17.U.b();
                                u9 u9Var18 = this.f90345c;
                                if (u9Var18 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var18 = null;
                                }
                                linearLayoutB2.addView(u9Var18.U.B);
                            }
                            break;
                        case -339185956:
                            if (pay_type.equals("balance")) {
                                u9 u9Var19 = this.f90345c;
                                if (u9Var19 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var19 = null;
                                }
                                LinearLayout linearLayoutB3 = u9Var19.U.b();
                                u9 u9Var20 = this.f90345c;
                                if (u9Var20 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var20 = null;
                                }
                                linearLayoutB3.addView(u9Var20.U.f116266z);
                            }
                            break;
                        case bb.c.d.an /* 3277 */:
                            if (pay_type.equals("h5")) {
                                u9 u9Var21 = this.f90345c;
                                if (u9Var21 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var21 = null;
                                }
                                LinearLayout linearLayoutB4 = u9Var21.U.b();
                                u9 u9Var22 = this.f90345c;
                                if (u9Var22 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var22 = null;
                                }
                                linearLayoutB4.addView(u9Var22.U.f116265y);
                            }
                            break;
                        case 825497556:
                            if (pay_type.equals("lianlian")) {
                                u9 u9Var23 = this.f90345c;
                                if (u9Var23 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var23 = null;
                                }
                                LinearLayout linearLayoutB5 = u9Var23.U.b();
                                u9 u9Var24 = this.f90345c;
                                if (u9Var24 == null) {
                                    kotlin.jvm.internal.f0.S("binding");
                                    u9Var24 = null;
                                }
                                linearLayoutB5.addView(u9Var24.U.A);
                            }
                            break;
                    }
                }
            }
            T4(mallCartOrderDetailObj.getPayment_list());
        }
        s6();
        u9 u9Var25 = this.f90345c;
        if (u9Var25 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var25 = null;
        }
        u9Var25.U.f116262v.setOnClickListener(new u());
        y yVar = new y();
        u9 u9Var26 = this.f90345c;
        if (u9Var26 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var26 = null;
        }
        u9Var26.U.f116248h.setOnClickListener(yVar);
        u9 u9Var27 = this.f90345c;
        if (u9Var27 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var27 = null;
        }
        u9Var27.U.f116250j.setOnClickListener(yVar);
        u9 u9Var28 = this.f90345c;
        if (u9Var28 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var28 = null;
        }
        u9Var28.U.f116246f.setOnClickListener(yVar);
        u9 u9Var29 = this.f90345c;
        if (u9Var29 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var29 = null;
        }
        u9Var29.U.f116249i.setOnClickListener(yVar);
        u9 u9Var30 = this.f90345c;
        if (u9Var30 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var30 = null;
        }
        u9Var30.U.C.setOnClickListener(new v());
        u9 u9Var31 = this.f90345c;
        if (u9Var31 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var31 = null;
        }
        u9Var31.U.f116261u.setOnClickListener(new w());
        u9 u9Var32 = this.f90345c;
        if (u9Var32 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var2 = u9Var32;
        }
        u9Var2.U.f116263w.setOnClickListener(new x());
    }

    public static final /* synthetic */ void G4(MallCartOrderDetailFragment mallCartOrderDetailFragment, List list) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, list}, null, changeQuickRedirect, true, 41680, new Class[]{MallCartOrderDetailFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.e6(list);
    }

    private final void G5(MallCartOrderDetailObj mallCartOrderDetailObj) {
        u9 u9Var;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailObj}, this, changeQuickRedirect, false, 41617, new Class[]{MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (Y4() == TYPE_CODE.WAITING_FOR_PAY) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            u9Var2.C.setText(mallCartOrderDetailObj.getOrder_items().get(0).getTitle());
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var3 = null;
            }
            u9Var3.f116288a0.setVisibility(0);
        } else {
            u9 u9Var4 = this.f90345c;
            if (u9Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var4 = null;
            }
            u9Var4.f116288a0.setVisibility(8);
        }
        V5(mallCartOrderDetailObj);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.Z.removeAllViews();
        int size = mallCartOrderDetailObj.getOrder_items().get(0).getItems().size();
        if (size > 3) {
            LayoutInflater layoutInflater = getLayoutInflater();
            u9 u9Var6 = this.f90345c;
            if (u9Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var6 = null;
            }
            wp wpVarD = wp.d(layoutInflater, u9Var6.Z, false);
            kotlin.jvm.internal.f0.o(wpVarD, "inflate(\n               …  false\n                )");
            for (CartItemObj cartItemObj : mallCartOrderDetailObj.getOrder_items().get(0).getItems()) {
                FrameLayout frameLayout = new FrameLayout(this.mContext);
                QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(this.mContext);
                ImageView imageView = new ImageView(this.mContext);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(this.mContext, 84.0f), ViewUtils.f(this.mContext, 84.0f));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(this.mContext, 68.0f), ViewUtils.f(this.mContext, 34.0f));
                layoutParams2.gravity = 17;
                frameLayout.addView(qMUIRadiusImageView, layoutParams);
                frameLayout.addView(imageView, layoutParams2);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 84.0f), ViewUtils.f(this.mContext, 84.0f));
                if (wpVarD.f117233f.getChildCount() > 0) {
                    layoutParams3.leftMargin = ViewUtils.f(this.mContext, 4.0f);
                }
                qMUIRadiusImageView.setBorderColor(com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color));
                qMUIRadiusImageView.setBorderWidth(ViewUtils.f(this.mContext, 0.5f));
                qMUIRadiusImageView.setCornerRadius(ViewUtils.f(this.mContext, 4.0f));
                if (com.max.hbcommon.utils.c.A(cartItemObj.getProduct().getShow_default_background_img())) {
                    imageView.setVisibility(0);
                    com.max.hbimage.b.d0(cartItemObj.getProduct().getHead_image(), imageView, ViewUtils.f(getContext(), 1.0f));
                    qMUIRadiusImageView.setImageResource(R.drawable.sku_background_empty);
                } else {
                    com.max.hbimage.b.K(cartItemObj.getProduct().getHead_image(), qMUIRadiusImageView);
                    imageView.setVisibility(8);
                }
                frameLayout.setOnClickListener(new z(cartItemObj));
                wpVarD.f117233f.addView(frameLayout, layoutParams3);
            }
            wpVarD.f117229b.setText(String.valueOf(size));
            wpVarD.f117232e.setOnClickListener(new a0(mallCartOrderDetailObj));
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var = null;
            } else {
                u9Var = u9Var7;
            }
            u9Var.Z.addView(wpVarD.b());
            return;
        }
        for (CartItemObj cartItemObj2 : mallCartOrderDetailObj.getOrder_items().get(0).getItems()) {
            LayoutInflater layoutInflater2 = getLayoutInflater();
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var8 = null;
            }
            yp ypVarD = yp.d(layoutInflater2, u9Var8.Z, false);
            kotlin.jvm.internal.f0.o(ypVarD, "inflate(\n               …lse\n                    )");
            MallCartUtils mallCartUtils = MallCartUtils.f90196a;
            Activity mContext = this.mContext;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            mallCartUtils.o(mContext, ypVarD, cartItemObj2);
            MallPriceCamelView mallPriceCamelView = ypVarD.f118019i;
            kotlin.jvm.internal.f0.o(mallPriceCamelView, "itemBinding.vgPrice");
            mallPriceCamelView.setVisibility(kotlin.jvm.internal.f0.g(mallCartOrderDetailObj.getHide_price_detail(), Boolean.TRUE) ? 8 : 0);
            if (cartItemObj2.getProduct().getStack_coupons() != null) {
                ypVarD.b().setOnClickListener(new b0(cartItemObj2));
            }
            u9 u9Var9 = this.f90345c;
            if (u9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var9 = null;
            }
            if (u9Var9.Z.getChildCount() > 0) {
                View view = new View(this.mContext);
                view.setBackgroundResource(R.color.divider_secondary_1_color);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, ViewUtils.f(this.mContext, 0.5f));
                layoutParams4.topMargin = ViewUtils.f(this.mContext, 8.0f);
                layoutParams4.bottomMargin = ViewUtils.f(this.mContext, 8.5f);
                layoutParams4.leftMargin = ViewUtils.f(this.mContext, 108.0f);
                u9 u9Var10 = this.f90345c;
                if (u9Var10 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var10 = null;
                }
                u9Var10.Z.addView(view, layoutParams4);
            }
            u9 u9Var11 = this.f90345c;
            if (u9Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var11 = null;
            }
            u9Var11.Z.addView(ypVarD.b());
        }
    }

    public static final /* synthetic */ void H4(MallCartOrderDetailFragment mallCartOrderDetailFragment, List list) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, list}, null, changeQuickRedirect, true, 41671, new Class[]{MallCartOrderDetailFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.f6(list);
    }

    private final void H5() {
        String strN;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41606, new Class[0], Void.TYPE).isSupported && Y4() == TYPE_CODE.WAITING_FOR_PAY) {
            u9 u9Var = this.f90345c;
            if (u9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var = null;
            }
            u9Var.f116290b0.setVisibility(0);
            String str2 = !com.max.hbcommon.utils.c.u(this.f90364v) ? this.f90364v : null;
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            if (mallCartOrderDetailObj.getPurchase_params() != null) {
                MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj2 = null;
                }
                MallPayPurchaseParams purchase_params = mallCartOrderDetailObj2.getPurchase_params();
                kotlin.jvm.internal.f0.m(purchase_params);
                strN = purchase_params.getPay_price();
                kotlin.jvm.internal.f0.o(strN, "{\n            mOrderDeta…ams!!.pay_price\n        }");
            } else {
                strN = u5().n();
                kotlin.jvm.internal.f0.m(strN);
            }
            String str3 = strN;
            String strC = com.max.hbutils.utils.n.q(str3) == 0 ? PaymentManager.A : u5().c();
            com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
            String str4 = this.f90353k;
            if (str4 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
                str = null;
            } else {
                str = str4;
            }
            MallCouponObj mallCouponObjH = u5().h();
            String coupon_id = mallCouponObjH != null ? mallCouponObjH.getCoupon_id() : null;
            KeyDescObj keyDescObjK = u5().k();
            addDisposable((io.reactivex.disposables.b) eVarA.Rb(str, coupon_id, keyDescObjK != null ? keyDescObjK.getKey() : null, str3, u5().i(), str2, strC, t5()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<MallOrderDetailObj>>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$pay$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public void onError(@dl.d Throwable e10) {
                    if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 41737, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(e10, "e");
                    if (this.f90441b.isActive()) {
                        super.onError(e10);
                        u9 u9Var2 = this.f90441b.f90345c;
                        if (u9Var2 == null) {
                            f0.S("binding");
                            u9Var2 = null;
                        }
                        u9Var2.f116290b0.setVisibility(8);
                    }
                }

                public void onNext(@dl.d Result<MallOrderDetailObj> result) {
                    String str5;
                    if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 41738, new Class[]{Result.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(result, "result");
                    if (this.f90441b.isActive()) {
                        super.onNext(result);
                        u9 u9Var2 = this.f90441b.f90345c;
                        if (u9Var2 == null) {
                            f0.S("binding");
                            u9Var2 = null;
                        }
                        u9Var2.f116290b0.setVisibility(8);
                        this.f90441b.f90359q = true;
                        MallOrderDetailObj result2 = result.getResult();
                        Intent intent = new Intent(lb.a.A);
                        intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                        ((com.max.hbcommon.base.d) this.f90441b).mContext.sendBroadcast(intent);
                        MallCartUtils mallCartUtils = MallCartUtils.f90196a;
                        OrderEvent orderEvent = OrderEvent.SUCCESS;
                        String str6 = this.f90441b.f90353k;
                        if (str6 == null) {
                            f0.S("mOrderId");
                            str5 = null;
                        } else {
                            str5 = str6;
                        }
                        MallCartUtils.w(mallCartUtils, orderEvent, null, null, null, str5, this.f90441b.f90355m, null, 64, null);
                        if (!com.max.hbcommon.utils.c.x(result2 != null ? result2.getFirst_order_pay_pass() : null)) {
                            this.f90441b.f90356n = true;
                            return;
                        }
                        com.max.xiaoheihe.module.account.paysetting.a aVar = com.max.xiaoheihe.module.account.paysetting.a.f79140a;
                        Activity mContext = ((com.max.hbcommon.base.d) this.f90441b).mContext;
                        f0.o(mContext, "mContext");
                        aVar.e(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$pay$1$onNext$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41741, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41740, new Class[0], Void.TYPE).isSupported) {
                                    return;
                                }
                                com.max.xiaoheihe.module.account.paysetting.a.f79140a.c();
                            }
                        });
                    }
                }

                @Override // com.max.hbcommon.network.d, io.reactivex.g0
                public /* bridge */ /* synthetic */ void onNext(Object obj) {
                    if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 41739, new Class[]{Object.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    onNext((Result<MallOrderDetailObj>) obj);
                }
            }));
        }
    }

    public static final /* synthetic */ void I4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41679, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.g6();
    }

    private final void I5(String str, String str2, int i10, boolean z10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41604, new Class[]{String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || this.f90366x) {
            return;
        }
        this.f90366x = true;
        ProgressDialog progressDialog = this.f90362t;
        PaymentManager paymentManager = null;
        if (progressDialog == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
            progressDialog = null;
        }
        progressDialog.setMessage("正在检测订单状态...");
        ProgressDialog progressDialog2 = this.f90362t;
        if (progressDialog2 == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
            progressDialog2 = null;
        }
        if (!progressDialog2.isShowing() && z10) {
            ProgressDialog progressDialog3 = this.f90362t;
            if (progressDialog3 == null) {
                kotlin.jvm.internal.f0.S("loadingDialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
        }
        PaymentManager paymentManager2 = this.f90361s;
        if (paymentManager2 == null) {
            kotlin.jvm.internal.f0.S("mPaymentManager");
        } else {
            paymentManager = paymentManager2;
        }
        io.reactivex.z<Result<WeixinQueryObj>> zVarC = paymentManager.C(str2, str, z10 ? "1" : "0");
        if (i10 == 0) {
            j10 = 0;
        } else {
            j10 = i10 < 10 ? 2L : 4L;
        }
        this.f90368z.c((io.reactivex.disposables.b) zVarC.C1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c0(z10, i10, str, str2)));
    }

    public static final /* synthetic */ void J4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41655, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.h6();
    }

    private final void J5(AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{addressInfoObj}, this, changeQuickRedirect, false, 41608, new Class[]{AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (addressInfoObj == null) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            addressInfoObj = mallCartOrderDetailObj.getAddress();
        }
        if (addressInfoObj != null) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            u9Var2.G.setVisibility(0);
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var3 = null;
            }
            u9Var3.f116299j.setVisibility(0);
            u9 u9Var4 = this.f90345c;
            if (u9Var4 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var4 = null;
            }
            u9Var4.G.removeAllViews();
            LayoutInflater layoutInflater = getLayoutInflater();
            u9 u9Var5 = this.f90345c;
            if (u9Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var5 = null;
            }
            mc0 mc0VarD = mc0.d(layoutInflater, u9Var5.G, false);
            kotlin.jvm.internal.f0.o(mc0VarD, "inflate(\n               …  false\n                )");
            if (Y4() == TYPE_CODE.WAITING_FOR_PAY) {
                mc0VarD.f113395b.setVisibility(0);
                mc0VarD.b().setOnClickListener(new d0());
            } else {
                mc0VarD.f113395b.setVisibility(8);
            }
            mc0VarD.f113398e.setText(addressInfoObj.getName());
            mc0VarD.f113399f.setText(com.max.xiaoheihe.utils.d.w(addressInfoObj.getPhone()));
            TextView textView = mc0VarD.f113397d;
            kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
            String str = String.format("%s%s%s%s", Arrays.copyOf(new Object[]{addressInfoObj.getProvince(), addressInfoObj.getCity(), addressInfoObj.getDistrict(), addressInfoObj.getDetail()}, 4));
            kotlin.jvm.internal.f0.o(str, "format(format, *args)");
            textView.setText(str);
            u9 u9Var6 = this.f90345c;
            if (u9Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var6;
            }
            u9Var.G.addView(mc0VarD.b());
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj2 = null;
        }
        if (!com.max.hbcommon.utils.c.x(mallCartOrderDetailObj2.getNeed_choose_address())) {
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var7 = null;
            }
            u9Var7.G.setVisibility(8);
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var8;
            }
            u9Var.f116299j.setVisibility(8);
            return;
        }
        u9 u9Var9 = this.f90345c;
        if (u9Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var9 = null;
        }
        u9Var9.G.setVisibility(0);
        u9 u9Var10 = this.f90345c;
        if (u9Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var10 = null;
        }
        u9Var10.f116299j.setVisibility(0);
        u9 u9Var11 = this.f90345c;
        if (u9Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var11 = null;
        }
        u9Var11.G.removeAllViews();
        LayoutInflater layoutInflater2 = getLayoutInflater();
        u9 u9Var12 = this.f90345c;
        if (u9Var12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var12 = null;
        }
        lc0 lc0VarD = lc0.d(layoutInflater2, u9Var12.G, false);
        kotlin.jvm.internal.f0.o(lc0VarD, "inflate(\n               …  false\n                )");
        lc0VarD.b().setOnClickListener(new e0());
        u9 u9Var13 = this.f90345c;
        if (u9Var13 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var13;
        }
        u9Var.G.addView(lc0VarD.b());
    }

    public static final /* synthetic */ void K4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41674, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.i6();
    }

    static /* synthetic */ void K5(MallCartOrderDetailFragment mallCartOrderDetailFragment, AddressInfoObj addressInfoObj, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, addressInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 41609, new Class[]{MallCartOrderDetailFragment.class, AddressInfoObj.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            addressInfoObj = null;
        }
        mallCartOrderDetailFragment.J5(addressInfoObj);
    }

    public static final /* synthetic */ void L4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41653, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.showError();
    }

    private final void L5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41582, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List[] listArr = new List[1];
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        u9 u9Var = null;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        listArr[0] = mallCartOrderDetailObj.getOrder_award();
        if (com.max.hbcommon.utils.c.w(listArr)) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            u9Var2.H.setVisibility(8);
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var3;
            }
            u9Var.f116303n.setVisibility(8);
            return;
        }
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.H.setVisibility(0);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.f116303n.setVisibility(0);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.f116295f.removeAllViews();
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj2 = null;
        }
        List<KeyDescObj> order_award = mallCartOrderDetailObj2.getOrder_award();
        if (order_award != null) {
            for (KeyDescObj keyDescObj : order_award) {
                LayoutInflater layoutInflater = this.mInflater;
                u9 u9Var7 = this.f90345c;
                if (u9Var7 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var7 = null;
                }
                as asVarD = as.d(layoutInflater, u9Var7.f116295f, false);
                kotlin.jvm.internal.f0.o(asVarD, "inflate(mInflater, binding.llAwardCard, false)");
                asVarD.f108623c.setText(keyDescObj.getTitle());
                asVarD.f108624d.setText('+' + keyDescObj.getValue());
                if (kotlin.jvm.internal.f0.g("hcoin", keyDescObj.getType())) {
                    asVarD.f108622b.setVisibility(0);
                } else {
                    asVarD.f108622b.setVisibility(8);
                }
                u9 u9Var8 = this.f90345c;
                if (u9Var8 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var8 = null;
                }
                u9Var8.f116295f.addView(asVarD.b());
            }
        }
    }

    public static final /* synthetic */ com.max.hbcommon.component.i M4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41661, new Class[]{MallCartOrderDetailFragment.class}, com.max.hbcommon.component.i.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.component.i) patchProxyResultProxy.result : mallCartOrderDetailFragment.k6();
    }

    private final void M5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41583, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        u9 u9Var = null;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        MallOrderBottomBtnObj bottom_button = mallCartOrderDetailObj.getBottom_button();
        if (bottom_button == null || bottom_button.isHidden() || Y4() == TYPE_CODE.WAITING_FOR_PAY) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            u9Var2.F.setVisibility(8);
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var3;
            }
            u9Var.f116309t.setVisibility(8);
            return;
        }
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = u9Var4.F;
        bottomButtonLeftItemView.setVisibility(0);
        if (kotlin.jvm.internal.f0.g(bottom_button.getStyle(), "1")) {
            bottomButtonLeftItemView.setShowLeftButton(false);
            bottomButtonLeftItemView.setShowRightButton(true);
            bottomButtonLeftItemView.setRightText(bottom_button.getDesc());
            bottomButtonLeftItemView.setRightClickListener(new f0());
        } else if (kotlin.jvm.internal.f0.g(bottom_button.getStyle(), "2")) {
            bottomButtonLeftItemView.setShowLeftButton(true);
            bottomButtonLeftItemView.setShowRightButton(false);
            bottomButtonLeftItemView.setLeftTextColor(androidx.core.content.d.f(bottomButtonLeftItemView.getContext(), R.color.lib_permission_text_primary_1_color));
            bottomButtonLeftItemView.setLeftBackground(new ColorDrawable(androidx.core.content.d.f(bottomButtonLeftItemView.getContext(), R.color.divider_secondary_1_color)));
            bottomButtonLeftItemView.setLeftText(bottom_button.getDesc());
            bottomButtonLeftItemView.setLeftClickListener(new g0());
        }
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        TextView textView = u9Var5.f116309t;
        if (com.max.hbcommon.utils.c.u(bottom_button.getTips())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(bottom_button.getTips());
        Activity activity = this.mContext;
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var6;
        }
        textView.setBackgroundDrawable(ViewUtils.x(ViewUtils.o(activity, u9Var.f116309t), textView.getResources().getColor(R.color.orange_start), textView.getResources().getColor(R.color.orange_end)));
        textView.setVisibility(0);
    }

    public static final /* synthetic */ void N4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41660, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.l6();
    }

    private final void N5() {
        String coupon_value;
        String coupon_value2;
        String coupon_value3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41591, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String string = null;
        strL2 = null;
        String strL2 = null;
        String string2 = null;
        u9 u9Var = null;
        u9 u9Var2 = null;
        u9 u9Var3 = null;
        u9 u9Var4 = null;
        strL2 = null;
        String strL3 = null;
        if (Y4() != TYPE_CODE.WAITING_FOR_PAY) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj.getDiscount_params_v2();
            String coupon_value4 = discount_params_v2 != null ? discount_params_v2.getCoupon_value() : null;
            if (!(coupon_value4 == null || coupon_value4.length() == 0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("- ¥");
                MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj2 = null;
                }
                MallPriceObj discount_params_v3 = mallCartOrderDetailObj2.getDiscount_params_v2();
                if (discount_params_v3 != null && (coupon_value = discount_params_v3.getCoupon_value()) != null) {
                    strL3 = kotlin.text.u.l2(coupon_value, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null);
                }
                sb2.append(com.max.xiaoheihe.module.game.r1.I(strL3));
                string = sb2.toString();
            }
            d5(string);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f90364v)) {
            if (u5().h() != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("- ¥");
                MallPriceObj mallPriceObj = this.f90357o;
                if (mallPriceObj != null && (coupon_value3 = mallPriceObj.getCoupon_value()) != null) {
                    strL2 = kotlin.text.u.l2(coupon_value3, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null);
                }
                sb3.append(com.max.xiaoheihe.module.game.r1.I(strL2));
                string2 = sb3.toString();
            }
            d5(string2);
            return;
        }
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.W.f116700n.setVisibility(0);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.W.f116689c.setArrowColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        MallPriceObj mallPriceObj2 = this.f90357o;
        if ("1".equals(mallPriceObj2 != null ? mallPriceObj2.getCoupon_disable() : null)) {
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var7 = null;
            }
            u9Var7.W.f116689c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var8 = null;
            }
            u9Var8.W.f116689c.setTextVisible(true);
            u9 u9Var9 = this.f90345c;
            if (u9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var9 = null;
            }
            u9Var9.W.f116689c.setArrowVisible(false);
            u9 u9Var10 = this.f90345c;
            if (u9Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var10 = null;
            }
            u9Var10.W.f116694h.setVisibility(8);
            u9 u9Var11 = this.f90345c;
            if (u9Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var11 = null;
            }
            u9Var11.W.f116689c.setTextFontBold(false);
            u9 u9Var12 = this.f90345c;
            if (u9Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var12;
            }
            MoreButton moreButton = u9Var.W.f116689c;
            MallPriceObj mallPriceObj3 = this.f90357o;
            kotlin.jvm.internal.f0.m(mallPriceObj3);
            moreButton.setText(mallPriceObj3.getCoupon_disable_desc());
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
        if (mallCartOrderDetailObj3 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj3 = null;
        }
        if (com.max.hbutils.utils.n.q(mallCartOrderDetailObj3.getCoupon_count()) > 0) {
            if (u5().h() != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("- ¥");
                MallPriceObj mallPriceObj4 = this.f90357o;
                sb4.append(com.max.xiaoheihe.module.game.r1.I((mallPriceObj4 == null || (coupon_value2 = mallPriceObj4.getCoupon_value()) == null) ? null : kotlin.text.u.l2(coupon_value2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
                String string3 = sb4.toString();
                u9 u9Var13 = this.f90345c;
                if (u9Var13 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var13 = null;
                }
                u9Var13.W.f116689c.setTextFontBold(false);
                u9 u9Var14 = this.f90345c;
                if (u9Var14 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var14 = null;
                }
                u9Var14.W.f116689c.setText(string3);
                u9 u9Var15 = this.f90345c;
                if (u9Var15 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var15 = null;
                }
                u9Var15.W.f116689c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.gold_light));
                u9 u9Var16 = this.f90345c;
                if (u9Var16 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var16 = null;
                }
                u9Var16.W.f116689c.setTextVisible(true);
                u9 u9Var17 = this.f90345c;
                if (u9Var17 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var17 = null;
                }
                u9Var17.W.f116694h.setVisibility(8);
            } else {
                u9 u9Var18 = this.f90345c;
                if (u9Var18 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var18 = null;
                }
                u9Var18.W.f116689c.setTextVisible(false);
                u9 u9Var19 = this.f90345c;
                if (u9Var19 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var19 = null;
                }
                u9Var19.W.f116694h.setVisibility(0);
                u9 u9Var20 = this.f90345c;
                if (u9Var20 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var20 = null;
                }
                TextView textView = u9Var20.W.f116694h;
                StringBuilder sb5 = new StringBuilder();
                MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
                if (mallCartOrderDetailObj4 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj4 = null;
                }
                sb5.append(mallCartOrderDetailObj4.getCoupon_count());
                sb5.append("张可用");
                textView.setText(sb5.toString());
            }
            u9 u9Var21 = this.f90345c;
            if (u9Var21 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var2 = u9Var21;
            }
            u9Var2.W.f116700n.setOnClickListener(new h0());
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj5 = this.f90354l;
        if (mallCartOrderDetailObj5 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj5 = null;
        }
        if (!com.max.hbcommon.utils.c.u(mallCartOrderDetailObj5.getAvailable_coupon_max_deduce())) {
            MallCartOrderDetailObj mallCartOrderDetailObj6 = this.f90354l;
            if (mallCartOrderDetailObj6 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj6 = null;
            }
            if (!com.max.hbcommon.utils.c.u(mallCartOrderDetailObj6.getCoupon_center_protocol())) {
                u9 u9Var22 = this.f90345c;
                if (u9Var22 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var22 = null;
                }
                u9Var22.W.f116689c.setTextVisible(false);
                u9 u9Var23 = this.f90345c;
                if (u9Var23 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var23 = null;
                }
                u9Var23.W.f116694h.setVisibility(0);
                u9 u9Var24 = this.f90345c;
                if (u9Var24 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var24 = null;
                }
                TextView textView2 = u9Var24.W.f116694h;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("未领券 领券减");
                MallCartOrderDetailObj mallCartOrderDetailObj7 = this.f90354l;
                if (mallCartOrderDetailObj7 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj7 = null;
                }
                sb6.append(com.max.xiaoheihe.module.game.r1.I(mallCartOrderDetailObj7.getAvailable_coupon_max_deduce()));
                sb6.append((char) 20803);
                textView2.setText(sb6.toString());
                u9 u9Var25 = this.f90345c;
                if (u9Var25 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                } else {
                    u9Var3 = u9Var25;
                }
                u9Var3.W.f116700n.setOnClickListener(new i0());
                return;
            }
        }
        u9 u9Var26 = this.f90345c;
        if (u9Var26 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var26 = null;
        }
        u9Var26.W.f116689c.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
        u9 u9Var27 = this.f90345c;
        if (u9Var27 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var27 = null;
        }
        u9Var27.W.f116689c.setTextVisible(true);
        u9 u9Var28 = this.f90345c;
        if (u9Var28 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var28 = null;
        }
        u9Var28.W.f116694h.setVisibility(8);
        u9 u9Var29 = this.f90345c;
        if (u9Var29 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var29 = null;
        }
        u9Var29.W.f116689c.setTextFontBold(false);
        u9 u9Var30 = this.f90345c;
        if (u9Var30 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var30 = null;
        }
        u9Var30.W.f116689c.setText(getString(R.string.not_available_for_use));
        u9 u9Var31 = this.f90345c;
        if (u9Var31 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var4 = u9Var31;
        }
        u9Var4.W.f116700n.setOnClickListener(new j0());
    }

    public static final /* synthetic */ void O4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41667, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.m6();
    }

    private final void O5() {
        String deduct_coin;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41595, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String string = null;
        String str = null;
        u9 u9Var = null;
        u9 u9Var2 = null;
        strL2 = null;
        String strL2 = null;
        if (Y4() != TYPE_CODE.WAITING_FOR_PAY) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj.getDiscount_params_v2();
            if (!com.max.hbcommon.utils.c.u(discount_params_v2 != null ? discount_params_v2.getDeduct_coin() : null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("- ¥");
                MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj2 = null;
                }
                MallPriceObj discount_params_v3 = mallCartOrderDetailObj2.getDiscount_params_v2();
                if (discount_params_v3 != null && (deduct_coin = discount_params_v3.getDeduct_coin()) != null) {
                    strL2 = kotlin.text.u.l2(deduct_coin, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null);
                }
                sb2.append(com.max.xiaoheihe.module.game.r1.I(strL2));
                string = sb2.toString();
            }
            e5(string);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f90364v)) {
            if (!com.max.hbcommon.utils.c.u(u5().i())) {
                str = "- ¥" + (com.max.hbutils.utils.n.p(u5().i()) / 1000.0f);
            }
            e5(str);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116701o.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116690d.setArrowVisible(true);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.W.f116690d.setArrowColor(getResources().getColor(R.color.text_secondary_1_color));
        if (!com.max.hbcommon.utils.c.u(u5().i())) {
            u9 u9Var6 = this.f90345c;
            if (u9Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var6 = null;
            }
            u9Var6.W.f116690d.setTextColor(getResources().getColor(R.color.click_blue));
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var7 = null;
            }
            u9Var7.W.f116690d.setTextFontBold(false);
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var8 = null;
            }
            u9Var8.W.f116690d.setText("- ¥" + (com.max.hbutils.utils.n.p(u5().i()) / 1000.0f));
            u9 u9Var9 = this.f90345c;
            if (u9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var9;
            }
            u9Var.W.f116701o.setOnClickListener(new k0());
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
        if (mallCartOrderDetailObj3 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj3 = null;
        }
        if (com.max.hbutils.utils.n.r(mallCartOrderDetailObj3.getTotal_coin()) <= 0) {
            u9 u9Var10 = this.f90345c;
            if (u9Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var10 = null;
            }
            u9Var10.W.f116690d.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
            u9 u9Var11 = this.f90345c;
            if (u9Var11 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var11 = null;
            }
            u9Var11.W.f116690d.setTextFontBold(false);
            u9 u9Var12 = this.f90345c;
            if (u9Var12 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var12 = null;
            }
            u9Var12.W.f116690d.setText("无可用H币");
            u9 u9Var13 = this.f90345c;
            if (u9Var13 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var13 = null;
            }
            u9Var13.W.f116701o.setOnClickListener(null);
            return;
        }
        String str2 = "可抵¥" + com.max.xiaoheihe.module.mall.o.f(s5()[1], false);
        u9 u9Var14 = this.f90345c;
        if (u9Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var14 = null;
        }
        u9Var14.W.f116690d.setTextColor(getResources().getColor(R.color.click_blue));
        u9 u9Var15 = this.f90345c;
        if (u9Var15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var15 = null;
        }
        u9Var15.W.f116690d.setTextFontBold(false);
        u9 u9Var16 = this.f90345c;
        if (u9Var16 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var16 = null;
        }
        u9Var16.W.f116690d.setText(str2);
        u9 u9Var17 = this.f90345c;
        if (u9Var17 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var2 = u9Var17;
        }
        u9Var2.W.f116701o.setOnClickListener(new l0());
    }

    public static final /* synthetic */ boolean P3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41656, new Class[]{MallCartOrderDetailFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallCartOrderDetailFragment.U4();
    }

    public static final /* synthetic */ boolean P4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41657, new Class[]{MallCartOrderDetailFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallCartOrderDetailFragment.n6();
    }

    private final void P5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41576, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (Y4() == TYPE_CODE.CANCELED) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            u9Var2.X.setVisibility(8);
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var3;
            }
            u9Var.f116307r.setVisibility(8);
            return;
        }
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        LinearLayout linearLayout = u9Var4.X;
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        linearLayout.setVisibility(kotlin.jvm.internal.f0.g(mallCartOrderDetailObj.getHide_price_detail(), Boolean.TRUE) ? 8 : 0);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.f116307r.setVisibility(0);
        re reVar = this.f90346d;
        if (reVar == null) {
            kotlin.jvm.internal.f0.S("mPriceBinding");
            reVar = null;
        }
        reVar.f115206c.setPrice(com.max.xiaoheihe.module.game.r1.I(u5().n()));
        if (u5().f() != null) {
            u9 u9Var6 = this.f90345c;
            if (u9Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var6;
            }
            u9Var.W.f116693g.setPrice(com.max.xiaoheihe.module.game.r1.I(u5().f()));
        } else {
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var7;
            }
            u9Var.W.f116693g.setPrice(com.max.xiaoheihe.module.game.r1.I(u5().n()));
        }
        N5();
        W5();
        O5();
        Z5();
        U5();
        T5();
        X5();
    }

    public static final /* synthetic */ void Q3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41646, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.V4();
    }

    public static final /* synthetic */ void Q4(MallCartOrderDetailFragment mallCartOrderDetailFragment, MallOrderStackCouponObj mallOrderStackCouponObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, mallOrderStackCouponObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 41672, new Class[]{MallCartOrderDetailFragment.class, MallOrderStackCouponObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.o6(mallOrderStackCouponObj, z10);
    }

    private final void Q5() {
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41572, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = this.f90345c;
        MallCartOrderDetailObj mallCartOrderDetailObj = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        FrameLayout frameLayout = u9Var.O;
        kotlin.jvm.internal.f0.o(frameLayout, "binding.vgGroupPurchase");
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj2 = null;
        }
        if (mallCartOrderDetailObj2.getGrouping_info() != null) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var2 = null;
            }
            GradientTextView gradientTextView = u9Var2.f116314y;
            gradientTextView.setColors(com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_start_color), com.max.xiaoheihe.utils.d.E(R.color.level_gradient_red_end_color));
            MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
            if (mallCartOrderDetailObj3 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj3 = null;
            }
            MallOrderGroupInfo grouping_info = mallCartOrderDetailObj3.getGrouping_info();
            gradientTextView.setText(grouping_info != null ? Integer.valueOf(grouping_info.getNum()).toString() : null);
            u9 u9Var3 = this.f90345c;
            if (u9Var3 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var3 = null;
            }
            LinearLayout linearLayout = u9Var3.f116296g;
            linearLayout.removeAllViews();
            List[] listArr = new List[1];
            MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
            if (mallCartOrderDetailObj4 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj4 = null;
            }
            MallOrderGroupInfo grouping_info2 = mallCartOrderDetailObj4.getGrouping_info();
            listArr[0] = grouping_info2 != null ? grouping_info2.getGrouping_user_images() : null;
            if (!com.max.hbcommon.utils.c.w(listArr)) {
                MallCartOrderDetailObj mallCartOrderDetailObj5 = this.f90354l;
                if (mallCartOrderDetailObj5 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj5 = null;
                }
                MallOrderGroupInfo grouping_info3 = mallCartOrderDetailObj5.getGrouping_info();
                List<String> grouping_user_images = grouping_info3 != null ? grouping_info3.getGrouping_user_images() : null;
                kotlin.jvm.internal.f0.m(grouping_user_images);
                Iterator<String> it = grouping_user_images.iterator();
                while (it.hasNext()) {
                    linearLayout.addView(R5(linearLayout, it.next()));
                }
            }
            z10 = true;
        } else {
            z10 = false;
        }
        frameLayout.setVisibility(z10 ? 0 : 8);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        Space space = u9Var4.f116302m;
        kotlin.jvm.internal.f0.o(space, "binding.spaceGroupingPurchase");
        MallCartOrderDetailObj mallCartOrderDetailObj6 = this.f90354l;
        if (mallCartOrderDetailObj6 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
        } else {
            mallCartOrderDetailObj = mallCartOrderDetailObj6;
        }
        space.setVisibility(mallCartOrderDetailObj.getGrouping_info() != null ? 0 : 8);
    }

    public static final /* synthetic */ boolean R3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41673, new Class[]{MallCartOrderDetailFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallCartOrderDetailFragment.W4();
    }

    public static final /* synthetic */ void R4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41643, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.r6();
    }

    private static final ImageView R5(LinearLayout linearLayout, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{linearLayout, str}, null, changeQuickRedirect, true, 41641, new Class[]{LinearLayout.class, String.class}, ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = new ImageView(linearLayout.getContext());
        Context context = imageView.getContext();
        kotlin.jvm.internal.f0.o(context, "context");
        int iC = com.max.xiaoheihe.accelworld.l.c(20.0f, context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iC, iC);
        Context context2 = imageView.getContext();
        kotlin.jvm.internal.f0.o(context2, "context");
        marginLayoutParams.setMarginStart(com.max.xiaoheihe.accelworld.l.c(4.0f, context2));
        imageView.setLayoutParams(marginLayoutParams);
        com.max.hbimage.b.H(str, imageView);
        return imageView;
    }

    public static final /* synthetic */ void S3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41649, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.X4();
    }

    public static final /* synthetic */ void S4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41670, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.s6();
    }

    private final void S5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41610, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = this.f90345c;
        MallCartOrderDetailObj mallCartOrderDetailObj = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        u9Var.S.setVisibility(0);
        u9 u9Var2 = this.f90345c;
        if (u9Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var2 = null;
        }
        u9Var2.f116304o.setVisibility(0);
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        TextView textView = u9Var3.A;
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj2 = null;
        }
        textView.setText(mallCartOrderDetailObj2.getOrder_info().getOrder_id());
        m0 m0Var = new m0();
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.A.setOnClickListener(m0Var);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.f116294e.setOnClickListener(m0Var);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        TextView textView2 = u9Var6.f116313x;
        MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
        if (mallCartOrderDetailObj3 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj3 = null;
        }
        textView2.setText(mallCartOrderDetailObj3.getOrder_info().getCreate_time());
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        TextView textView3 = u9Var7.B;
        MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
        if (mallCartOrderDetailObj4 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
        } else {
            mallCartOrderDetailObj = mallCartOrderDetailObj4;
        }
        textView3.setText(mallCartOrderDetailObj.getOrder_info().getPay_time());
    }

    public static final /* synthetic */ void T3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41675, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.Z4();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    private final void T4(List<? extends PayTypeInfoObj> list) {
        boolean zE;
        String payment;
        String str;
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 41612, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        MallCartOrderDetailObj mallCartOrderDetailObj2 = null;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        MallPayPurchaseParams purchase_params = mallCartOrderDetailObj.getPurchase_params();
        String str2 = PaymentManager.A;
        if (purchase_params == null && !this.C) {
            MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
            if (mallCartOrderDetailObj3 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
            } else {
                mallCartOrderDetailObj2 = mallCartOrderDetailObj3;
            }
            SuggestDiscountInfo choose_discount_info = mallCartOrderDetailObj2.getChoose_discount_info();
            if (choose_discount_info != null && (payment = choose_discount_info.getPayment()) != null) {
                this.C = true;
                com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU5 = u5();
                int iHashCode = payment.hashCode();
                if (iHashCode != -1414960566) {
                    if (iHashCode != -791770330) {
                        if (iHashCode == 825497556 && payment.equals("lianlian")) {
                            str = "lianlian";
                        } else {
                            str = PaymentManager.A;
                        }
                    } else if (payment.equals("wechat")) {
                        str = PaymentManager.f71426y;
                    } else {
                        str = PaymentManager.A;
                    }
                } else if (payment.equals(PaymentManager.f71422u)) {
                    str = PaymentManager.f71427z;
                } else {
                    str = PaymentManager.A;
                }
                bVarU5.o(str);
            }
        }
        switch (u5().c()) {
            case "aliapp":
                zE = PaymentManager.E(list, PaymentManager.f71422u);
                break;
            case "wxapp":
                zE = PaymentManager.E(list, "wechat");
                break;
            case "hbalance":
                zE = PaymentManager.E(list, "balance");
                break;
            case "lianlian":
                zE = PaymentManager.E(list, "lianlian");
                break;
            default:
                zE = true;
                break;
        }
        if (zE) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        com.max.xiaoheihe.module.mall.cart.viewmodel.b bVarU6 = u5();
        String pay_type = list.get(0).getPay_type();
        if (pay_type != null) {
            int iHashCode2 = pay_type.hashCode();
            if (iHashCode2 != -1414960566) {
                if (iHashCode2 != -791770330) {
                    if (iHashCode2 == 825497556 && pay_type.equals("lianlian")) {
                        str2 = "lianlian";
                    }
                } else if (pay_type.equals("wechat")) {
                    str2 = PaymentManager.f71426y;
                }
            } else if (pay_type.equals(PaymentManager.f71422u)) {
                str2 = PaymentManager.f71427z;
            }
        }
        bVarU6.o(str2);
    }

    private final void T5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41600, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (Y4() != TYPE_CODE.WAITING_FOR_PAY) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj.getDiscount_params_v2();
            if (!com.max.hbcommon.utils.c.u(discount_params_v2 != null ? discount_params_v2.getPayment() : null)) {
                u9 u9Var2 = this.f90345c;
                if (u9Var2 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var2 = null;
                }
                u9Var2.W.f116702p.setVisibility(0);
                u9 u9Var3 = this.f90345c;
                if (u9Var3 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var3 = null;
                }
                TextView textView = u9Var3.W.f116695i;
                MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj2 = null;
                }
                MallPriceObj discount_params_v3 = mallCartOrderDetailObj2.getDiscount_params_v2();
                textView.setText(discount_params_v3 != null ? discount_params_v3.getPayment() : null);
                return;
            }
        }
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var4;
        }
        u9Var.W.f116702p.setVisibility(8);
    }

    public static final /* synthetic */ void U3(MallCartOrderDetailFragment mallCartOrderDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, str}, null, changeQuickRedirect, true, 41664, new Class[]{MallCartOrderDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.a5(str);
    }

    private final boolean U4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41631, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return Y4() == TYPE_CODE.WAITING_FOR_PAY;
    }

    private final void U5() {
        String postage_value;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41599, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallPriceObj mallPriceObj = this.f90357o;
        u9 u9Var = null;
        if (mallPriceObj == null || (postage_value = mallPriceObj.getPostage_value()) == null) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj.getDiscount_params_v2();
            postage_value = discount_params_v2 != null ? discount_params_v2.getPostage_value() : null;
        }
        if (com.max.hbcommon.utils.c.u(postage_value)) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var2;
            }
            u9Var.W.f116703q.setVisibility(8);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116703q.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var4;
        }
        u9Var.W.f116696j.setText((char) 165 + com.max.xiaoheihe.module.game.r1.I(postage_value));
    }

    public static final /* synthetic */ void V3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41669, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.c5();
    }

    private final void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41563, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = this.f90345c;
        String str = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        u9Var.f116290b0.setVisibility(0);
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str2 = this.f90353k;
        if (str2 == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
        } else {
            str = str2;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.X3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void V5(MallCartOrderDetailObj mallCartOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailObj}, this, changeQuickRedirect, false, 41616, new Class[]{MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        int size = mallCartOrderDetailObj.getOrder_items().get(0).getItems().size();
        if (u5().e() && mallCartOrderDetailObj.getStack_coupons() != null) {
            size++;
        }
        re reVar = this.f90346d;
        if (reVar == null) {
            kotlin.jvm.internal.f0.S("mPriceBinding");
            reVar = null;
        }
        TextView textView = reVar.f115205b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 20849);
        sb2.append(size);
        sb2.append((char) 20214);
        textView.setText(sb2.toString());
    }

    public static final /* synthetic */ void W3(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41666, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.h5();
    }

    private final boolean W4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41628, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcache.c.t()) {
            return true;
        }
        androidx.activity.result.g<Intent> gVar = this.f90351i;
        MallCartOrderDetailObj mallCartOrderDetailObj = null;
        if (gVar == null) {
            kotlin.jvm.internal.f0.S("agreeLauncher");
            gVar = null;
        }
        MallAgreementActivity.a aVar = MallAgreementActivity.M;
        Activity activity = this.mContext;
        MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
        if (mallCartOrderDetailObj2 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
        } else {
            mallCartOrderDetailObj = mallCartOrderDetailObj2;
        }
        gVar.b(aVar.a(activity, mallCartOrderDetailObj.getAgreement_title(), true));
        return false;
    }

    private final void W5() {
        String purchase_code_value;
        String purchase_code_value2;
        String purchase_code_value3;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41593, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String string = null;
        String string2 = null;
        u9 u9Var = null;
        if (Y4() != TYPE_CODE.WAITING_FOR_PAY) {
            String[] strArr = new String[2];
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj.getDiscount_params_v2();
            strArr[0] = discount_params_v2 != null ? discount_params_v2.getPurchase_code_value() : null;
            MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
            if (mallCartOrderDetailObj2 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj2 = null;
            }
            MallPriceObj discount_params_v3 = mallCartOrderDetailObj2.getDiscount_params_v2();
            strArr[1] = discount_params_v3 != null ? discount_params_v3.getPurchase_code_desc() : null;
            if (!com.max.hbcommon.utils.c.v(strArr)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("- ¥");
                MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
                if (mallCartOrderDetailObj3 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj3 = null;
                }
                MallPriceObj discount_params_v4 = mallCartOrderDetailObj3.getDiscount_params_v2();
                sb2.append(com.max.xiaoheihe.module.game.r1.I((discount_params_v4 == null || (purchase_code_value = discount_params_v4.getPurchase_code_value()) == null) ? null : kotlin.text.u.l2(purchase_code_value, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
                sb2.append('(');
                MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
                if (mallCartOrderDetailObj4 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj4 = null;
                }
                MallPriceObj discount_params_v5 = mallCartOrderDetailObj4.getDiscount_params_v2();
                sb2.append(discount_params_v5 != null ? discount_params_v5.getPurchase_code_desc() : null);
                sb2.append(')');
                string = sb2.toString();
            }
            f5(string);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f90364v)) {
            if (u5().k() != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("- ¥");
                MallPriceObj mallPriceObj = this.f90357o;
                sb3.append(com.max.xiaoheihe.module.game.r1.I((mallPriceObj == null || (purchase_code_value3 = mallPriceObj.getPurchase_code_value()) == null) ? null : kotlin.text.u.l2(purchase_code_value3, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
                sb3.append('(');
                MallPriceObj mallPriceObj2 = this.f90357o;
                sb3.append(mallPriceObj2 != null ? mallPriceObj2.getPurchase_code_desc() : null);
                sb3.append(')');
                string2 = sb3.toString();
            }
            f5(string2);
            return;
        }
        u9 u9Var2 = this.f90345c;
        if (u9Var2 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var2 = null;
        }
        u9Var2.W.f116704r.setVisibility(0);
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116691e.setArrowVisible(true);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116691e.setArrowColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        if (u5().k() != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("- ¥");
            MallPriceObj mallPriceObj3 = this.f90357o;
            sb4.append(com.max.xiaoheihe.module.game.r1.I((mallPriceObj3 == null || (purchase_code_value2 = mallPriceObj3.getPurchase_code_value()) == null) ? null : kotlin.text.u.l2(purchase_code_value2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
            sb4.append('(');
            MallPriceObj mallPriceObj4 = this.f90357o;
            sb4.append(mallPriceObj4 != null ? mallPriceObj4.getPurchase_code_desc() : null);
            sb4.append(')');
            String string3 = sb4.toString();
            u9 u9Var5 = this.f90345c;
            if (u9Var5 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var5 = null;
            }
            u9Var5.W.f116691e.setTextFontBold(false);
            u9 u9Var6 = this.f90345c;
            if (u9Var6 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var6 = null;
            }
            u9Var6.W.f116691e.setText(string3);
            u9 u9Var7 = this.f90345c;
            if (u9Var7 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var7 = null;
            }
            u9Var7.W.f116691e.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else {
            u9 u9Var8 = this.f90345c;
            if (u9Var8 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var8 = null;
            }
            u9Var8.W.f116691e.setTextFontBold(false);
            u9 u9Var9 = this.f90345c;
            if (u9Var9 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var9 = null;
            }
            u9Var9.W.f116691e.setText("请输入");
            u9 u9Var10 = this.f90345c;
            if (u9Var10 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var10 = null;
            }
            u9Var10.W.f116691e.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        }
        u9 u9Var11 = this.f90345c;
        if (u9Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var11;
        }
        u9Var.W.f116704r.setOnClickListener(new n0());
    }

    private final void X4() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41623, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = this.f90345c;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        u9Var.f116290b0.setVisibility(0);
        MallCouponObj mallCouponObjH = u5().h();
        String coupon_id = mallCouponObjH != null ? mallCouponObjH.getCoupon_id() : null;
        KeyDescObj keyDescObjK = u5().k();
        String key = keyDescObjK != null ? keyDescObjK.getKey() : null;
        AddressInfoObj addressInfoObjG = u5().g();
        String id2 = addressInfoObjG != null ? addressInfoObjG.getId() : null;
        String strI = !com.max.hbcommon.utils.c.u(u5().i()) ? u5().i() : null;
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str2 = this.f90353k;
        if (str2 == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        } else {
            str = str2;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.Fb(str, coupon_id, key, u5().n(), id2, strI, t5()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void X5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41601, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (!n6()) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var2;
            }
            u9Var.W.f116705s.setVisibility(8);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116705s.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var4;
        }
        u9Var.W.f116705s.setOnClickListener(new o0());
    }

    private final void Y5() {
        String coupon_value;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41579, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (Y4() != TYPE_CODE.CANCELED) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            if (mallCartOrderDetailObj.getStack_coupons() != null) {
                MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj2 = null;
                }
                MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj2.getStack_coupons();
                if (stack_coupons != null) {
                    u9 u9Var2 = this.f90345c;
                    if (u9Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var2 = null;
                    }
                    u9Var2.K.setVisibility(0);
                    u9 u9Var3 = this.f90345c;
                    if (u9Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var3 = null;
                    }
                    u9Var3.f116300k.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("总价值 " + stack_coupons.getTotal_value() + " 元，本单可用 ");
                    MallOrderSuggestCoupon suggest_coupon = stack_coupons.getSuggest_coupon();
                    if (suggest_coupon == null || (coupon_value = suggest_coupon.getCoupon_value()) == null) {
                        coupon_value = "0";
                    }
                    spannableStringBuilder.append((CharSequence) coupon_value);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(com.max.hbcommon.utils.l.a(R.color.coupon_orange)), spannableStringBuilder.length() - coupon_value.length(), spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) " 元");
                    u9 u9Var4 = this.f90345c;
                    if (u9Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var4 = null;
                    }
                    u9Var4.f116310u.setText(stack_coupons.getTip());
                    u9 u9Var5 = this.f90345c;
                    if (u9Var5 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var5 = null;
                    }
                    u9Var5.f116312w.setText(spannableStringBuilder);
                    u9 u9Var6 = this.f90345c;
                    if (u9Var6 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var6 = null;
                    }
                    MallPriceCamelView mallPriceCamelView = u9Var6.f116297h;
                    String final_price = stack_coupons.getPrice().getFinal_price();
                    kotlin.jvm.internal.f0.m(final_price);
                    mallPriceCamelView.setPrice(com.max.xiaoheihe.module.game.r1.I(final_price));
                    u9 u9Var7 = this.f90345c;
                    if (u9Var7 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var7 = null;
                    }
                    u9Var7.f116297h.setPriceFeeScale(true);
                    String initial_price = stack_coupons.getPrice().getInitial_price();
                    kotlin.jvm.internal.f0.m(initial_price);
                    SpannableString spannableString = new SpannableString(com.max.xiaoheihe.module.game.r1.G(initial_price));
                    spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                    u9 u9Var8 = this.f90345c;
                    if (u9Var8 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var8 = null;
                    }
                    u9Var8.f116311v.setText(spannableString);
                    if (u5().e()) {
                        u9 u9Var9 = this.f90345c;
                        if (u9Var9 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            u9Var9 = null;
                        }
                        u9Var9.f116293d.setImageResource(R.drawable.common_select_filled_24x24);
                    } else {
                        u9 u9Var10 = this.f90345c;
                        if (u9Var10 == null) {
                            kotlin.jvm.internal.f0.S("binding");
                            u9Var10 = null;
                        }
                        u9Var10.f116293d.setImageResource(R.drawable.unchecked_gray_icon_16x16);
                    }
                    u9 u9Var11 = this.f90345c;
                    if (u9Var11 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var11 = null;
                    }
                    u9Var11.J.setOnClickListener(new p0());
                    u9 u9Var12 = this.f90345c;
                    if (u9Var12 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var12 = null;
                    }
                    u9Var12.f116298i.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                    u9 u9Var13 = this.f90345c;
                    if (u9Var13 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var13 = null;
                    }
                    u9Var13.f116298i.setAdapter(new q0(this.mContext, stack_coupons.getCoupons()));
                    u9 u9Var14 = this.f90345c;
                    if (u9Var14 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        u9Var = u9Var14;
                    }
                    u9Var.f116298i.setOnClickListener(new r0());
                    return;
                }
                return;
            }
        }
        u9 u9Var15 = this.f90345c;
        if (u9Var15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var15 = null;
        }
        u9Var15.K.setVisibility(8);
        u9 u9Var16 = this.f90345c;
        if (u9Var16 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var = u9Var16;
        }
        u9Var.f116300k.setVisibility(8);
    }

    public static final /* synthetic */ void Z3(MallCartOrderDetailFragment mallCartOrderDetailFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 41677, new Class[]{MallCartOrderDetailFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.j5(z10);
    }

    private final void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41624, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbutils.utils.n.q(u5().n()) == 0) {
            l5("0");
            return;
        }
        if (kotlin.jvm.internal.f0.g(PaymentManager.A, u5().c())) {
            String strN = u5().n();
            kotlin.jvm.internal.f0.m(strN);
            l5(strN);
            return;
        }
        PaymentManager paymentManager = null;
        if (kotlin.jvm.internal.f0.g(PaymentManager.f71427z, u5().c())) {
            PaymentManager paymentManager2 = this.f90361s;
            if (paymentManager2 == null) {
                kotlin.jvm.internal.f0.S("mPaymentManager");
            } else {
                paymentManager = paymentManager2;
            }
            ProgressDialog progressDialogM = paymentManager.M(2, u5().n());
            kotlin.jvm.internal.f0.o(progressDialogM, "mPaymentManager.requestP…oin\n                    )");
            this.f90362t = progressDialogM;
            return;
        }
        if (kotlin.jvm.internal.f0.g("lianlian", u5().c())) {
            PaymentManager paymentManager3 = this.f90361s;
            if (paymentManager3 == null) {
                kotlin.jvm.internal.f0.S("mPaymentManager");
            } else {
                paymentManager = paymentManager3;
            }
            ProgressDialog progressDialogM2 = paymentManager.M(4, u5().n());
            kotlin.jvm.internal.f0.o(progressDialogM2, "mPaymentManager.requestP…oin\n                    )");
            this.f90362t = progressDialogM2;
            return;
        }
        PaymentManager paymentManager4 = this.f90361s;
        if (paymentManager4 == null) {
            kotlin.jvm.internal.f0.S("mPaymentManager");
        } else {
            paymentManager = paymentManager4;
        }
        ProgressDialog progressDialogM3 = paymentManager.M(1, u5().n());
        kotlin.jvm.internal.f0.o(progressDialogM3, "mPaymentManager.requestP…oin\n                    )");
        this.f90362t = progressDialogM3;
    }

    private final void Z5() {
        String stack_coupon_value;
        String stack_coupon_value2;
        String stack_coupon_value3;
        String stack_coupon_value4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41577, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String string = null;
        strL2 = null;
        String strL2 = null;
        String string2 = null;
        u9 u9Var = null;
        u9 u9Var2 = null;
        strL2 = null;
        String strL3 = null;
        if (Y4() != TYPE_CODE.WAITING_FOR_PAY) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            MallPriceObj discount_params_v2 = mallCartOrderDetailObj.getDiscount_params_v2();
            String stack_coupon_value5 = discount_params_v2 != null ? discount_params_v2.getStack_coupon_value() : null;
            if (!(stack_coupon_value5 == null || stack_coupon_value5.length() == 0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("- ¥");
                MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
                if (mallCartOrderDetailObj2 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj2 = null;
                }
                MallPriceObj discount_params_v3 = mallCartOrderDetailObj2.getDiscount_params_v2();
                if (discount_params_v3 != null && (stack_coupon_value = discount_params_v3.getStack_coupon_value()) != null) {
                    strL3 = kotlin.text.u.l2(stack_coupon_value, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null);
                }
                sb2.append(com.max.xiaoheihe.module.game.r1.I(strL3));
                string = sb2.toString();
            }
            g5(string);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(this.f90364v)) {
            if (u5().m() != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("- ¥");
                MallPriceObj mallPriceObj = this.f90357o;
                if (mallPriceObj != null && (stack_coupon_value4 = mallPriceObj.getStack_coupon_value()) != null) {
                    strL2 = kotlin.text.u.l2(stack_coupon_value4, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null);
                }
                sb3.append(com.max.xiaoheihe.module.game.r1.I(strL2));
                string2 = sb3.toString();
            }
            g5(string2);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116706t.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116692f.setArrowColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
        if (mallCartOrderDetailObj3 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj3 = null;
        }
        if (com.max.hbutils.utils.n.q(mallCartOrderDetailObj3.getStack_coupon_count()) > 0) {
            if (u5().m() != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("- ¥");
                MallPriceObj mallPriceObj2 = this.f90357o;
                sb4.append(com.max.xiaoheihe.module.game.r1.I((mallPriceObj2 == null || (stack_coupon_value3 = mallPriceObj2.getStack_coupon_value()) == null) ? null : kotlin.text.u.l2(stack_coupon_value3, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
                String string3 = sb4.toString();
                u9 u9Var5 = this.f90345c;
                if (u9Var5 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var5 = null;
                }
                u9Var5.W.f116692f.setTextFontBold(false);
                u9 u9Var6 = this.f90345c;
                if (u9Var6 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var6 = null;
                }
                u9Var6.W.f116692f.setText(string3);
                u9 u9Var7 = this.f90345c;
                if (u9Var7 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var7 = null;
                }
                u9Var7.W.f116692f.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.gold_light));
                u9 u9Var8 = this.f90345c;
                if (u9Var8 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var8 = null;
                }
                u9Var8.W.f116692f.setTextVisible(true);
                u9 u9Var9 = this.f90345c;
                if (u9Var9 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var9 = null;
                }
                u9Var9.W.f116697k.setVisibility(8);
            } else {
                u9 u9Var10 = this.f90345c;
                if (u9Var10 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var10 = null;
                }
                u9Var10.W.f116692f.setTextVisible(false);
                u9 u9Var11 = this.f90345c;
                if (u9Var11 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var11 = null;
                }
                u9Var11.W.f116697k.setVisibility(0);
                u9 u9Var12 = this.f90345c;
                if (u9Var12 == null) {
                    kotlin.jvm.internal.f0.S("binding");
                    u9Var12 = null;
                }
                TextView textView = u9Var12.W.f116697k;
                StringBuilder sb5 = new StringBuilder();
                MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
                if (mallCartOrderDetailObj4 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                    mallCartOrderDetailObj4 = null;
                }
                sb5.append(mallCartOrderDetailObj4.getStack_coupon_count());
                sb5.append("张可用");
                textView.setText(sb5.toString());
            }
            u9 u9Var13 = this.f90345c;
            if (u9Var13 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var13;
            }
            u9Var.W.f116706t.setOnClickListener(new s0());
            return;
        }
        if (u5().m() != null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("- ¥");
            MallPriceObj mallPriceObj3 = this.f90357o;
            sb6.append(com.max.xiaoheihe.module.game.r1.G((mallPriceObj3 == null || (stack_coupon_value2 = mallPriceObj3.getStack_coupon_value()) == null) ? null : kotlin.text.u.l2(stack_coupon_value2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "", false, 4, null)));
            String string4 = sb6.toString();
            u9 u9Var14 = this.f90345c;
            if (u9Var14 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var14 = null;
            }
            u9Var14.W.f116692f.setTextFontBold(false);
            u9 u9Var15 = this.f90345c;
            if (u9Var15 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var15 = null;
            }
            u9Var15.W.f116692f.setText(string4);
            u9 u9Var16 = this.f90345c;
            if (u9Var16 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var16 = null;
            }
            u9Var16.W.f116692f.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.gold_light));
            u9 u9Var17 = this.f90345c;
            if (u9Var17 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var17 = null;
            }
            u9Var17.W.f116692f.setTextVisible(true);
            u9 u9Var18 = this.f90345c;
            if (u9Var18 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var18 = null;
            }
            u9Var18.W.f116697k.setVisibility(8);
        } else if (u5().e()) {
            u9 u9Var19 = this.f90345c;
            if (u9Var19 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var19 = null;
            }
            u9Var19.W.f116692f.setTextVisible(false);
            u9 u9Var20 = this.f90345c;
            if (u9Var20 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var20 = null;
            }
            u9Var20.W.f116697k.setVisibility(0);
            u9 u9Var21 = this.f90345c;
            if (u9Var21 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var21 = null;
            }
            TextView textView2 = u9Var21.W.f116697k;
            StringBuilder sb7 = new StringBuilder();
            MallCartOrderDetailObj mallCartOrderDetailObj5 = this.f90354l;
            if (mallCartOrderDetailObj5 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj5 = null;
            }
            MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj5.getStack_coupons();
            kotlin.jvm.internal.f0.m(stack_coupons);
            sb7.append(stack_coupons.getAvailable_stack_cnt());
            sb7.append("张可用");
            textView2.setText(sb7.toString());
        } else {
            u9 u9Var22 = this.f90345c;
            if (u9Var22 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var22 = null;
            }
            u9Var22.W.f116692f.setTextColor(getResources().getColor(R.color.text_secondary_2_color));
            u9 u9Var23 = this.f90345c;
            if (u9Var23 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var23 = null;
            }
            u9Var23.W.f116692f.setTextVisible(true);
            u9 u9Var24 = this.f90345c;
            if (u9Var24 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var24 = null;
            }
            u9Var24.W.f116697k.setVisibility(8);
            u9 u9Var25 = this.f90345c;
            if (u9Var25 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var25 = null;
            }
            u9Var25.W.f116692f.setTextFontBold(false);
            u9 u9Var26 = this.f90345c;
            if (u9Var26 == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var26 = null;
            }
            u9Var26.W.f116692f.setText(getString(R.string.not_available_for_use));
        }
        u9 u9Var27 = this.f90345c;
        if (u9Var27 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var2 = u9Var27;
        }
        u9Var2.W.f116706t.setOnClickListener(new t0());
    }

    private final void a5(String str) {
        String coupon_id;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41603, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = this.f90345c;
        String str2 = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        u9Var.f116290b0.setVisibility(0);
        if (u5().h() != null) {
            MallCouponObj mallCouponObjH = u5().h();
            kotlin.jvm.internal.f0.m(mallCouponObjH);
            coupon_id = mallCouponObjH.getCoupon_id();
        } else {
            coupon_id = null;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str3 = this.f90353k;
        if (str3 == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
        } else {
            str2 = str3;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.P(str, str2, coupon_id).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private final void a6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult = registerForActivityResult(new z.b.m(), new u0());
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult, "private fun registerLaun…        }\n        }\n    }");
        this.f90349g = gVarRegisterForActivityResult;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult2 = registerForActivityResult(new z.b.m(), new v0());
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult2, "private fun registerLaun…        }\n        }\n    }");
        this.f90350h = gVarRegisterForActivityResult2;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult3 = registerForActivityResult(new z.b.m(), new w0());
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult3, "private fun registerLaun…        }\n        }\n    }");
        this.f90351i = gVarRegisterForActivityResult3;
        androidx.activity.result.g<Intent> gVarRegisterForActivityResult4 = registerForActivityResult(new z.b.m(), new x0());
        kotlin.jvm.internal.f0.o(gVarRegisterForActivityResult4, "private fun registerLaun…        }\n        }\n    }");
        this.f90352j = gVarRegisterForActivityResult4;
    }

    private final void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41573, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f90354l == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
        }
        if (this.f90356n) {
            this.f90356n = false;
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            q6(mallCartOrderDetailObj);
        }
    }

    private final void b6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41570, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TitleBar mTitleBar = this.mTitleBar;
        kotlin.jvm.internal.f0.o(mTitleBar, "mTitleBar");
        Activity mContext = this.mContext;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        com.max.xiaoheihe.module.mall.cart.ui.a.b(mTitleBar, mContext, mallCartOrderDetailObj.getMore_option_btns(), new y0());
    }

    private final void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41622, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.activity.result.g<Intent> gVar = this.f90352j;
        if (gVar == null) {
            kotlin.jvm.internal.f0.S("addAddressLauncher");
            gVar = null;
        }
        gVar.b(AddressListActivity.N1(this.mContext, true));
    }

    private final void d5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41592, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (com.max.hbcommon.utils.c.u(str)) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var2;
            }
            u9Var.W.f116700n.setVisibility(8);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116700n.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116689c.setArrowVisible(false);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.W.f116689c.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.W.f116689c.setTextFontBold(false);
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        u9Var7.W.f116689c.setText(str);
        u9 u9Var8 = this.f90345c;
        if (u9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var8 = null;
        }
        u9Var8.W.f116694h.setVisibility(8);
        u9 u9Var9 = this.f90345c;
        if (u9Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var9 = null;
        }
        u9Var9.W.f116700n.setOnClickListener(null);
    }

    private final void d6(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41629, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        CountDownTimer countDownTimer = this.f90347e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f90347e = new z0(com.max.hbutils.utils.n.r(str) * ((long) 1000)).start();
    }

    private final void e5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41596, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (com.max.hbcommon.utils.c.u(str)) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var2;
            }
            u9Var.W.f116701o.setVisibility(8);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116701o.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116690d.setArrowVisible(false);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.W.f116690d.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.W.f116690d.setTextFontBold(false);
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        u9Var7.W.f116690d.setText(str);
        u9 u9Var8 = this.f90345c;
        if (u9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var8 = null;
        }
        u9Var8.W.f116701o.setOnClickListener(null);
    }

    private final void e6(List<MallProductActionObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 41619, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        u5 u5VarC = u5.c(this.mInflater);
        kotlin.jvm.internal.f0.o(u5VarC, "inflate(mInflater)");
        u5VarC.b().setElevation(ViewUtils.f(this.mContext, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.mContext, true, (View) u5VarC.b());
        u5VarC.f116189d.setText(com.max.xiaoheihe.module.game.d0.f87251w);
        u5VarC.f116188c.setLayoutManager(new LinearLayoutManager(this.mContext));
        MaxHeightRecyclerView maxHeightRecyclerView = u5VarC.f116188c;
        Activity activity = this.mContext;
        maxHeightRecyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 10.0f), 0, 0));
        u5VarC.f116188c.setAdapter(new a1(list, this, this.mContext));
        iVar.setCancelable(true);
        b1 b1Var = new b1(iVar);
        u5VarC.f116190e.setOnClickListener(b1Var);
        u5VarC.f116187b.setOnClickListener(b1Var);
        iVar.show();
    }

    private final void f5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41594, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (com.max.hbcommon.utils.c.u(str)) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var2;
            }
            u9Var.W.f116704r.setVisibility(8);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116704r.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116691e.setTextFontBold(false);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.W.f116691e.setText(str);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.W.f116691e.setArrowVisible(false);
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        u9Var7.W.f116691e.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        u9 u9Var8 = this.f90345c;
        if (u9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var8 = null;
        }
        u9Var8.W.f116704r.setOnClickListener(null);
    }

    private final void f6(List<CartItemObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 41618, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        u5 u5VarC = u5.c(this.mInflater);
        kotlin.jvm.internal.f0.o(u5VarC, "inflate(mInflater)");
        u5VarC.b().setElevation(ViewUtils.f(this.mContext, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.mContext, true, (View) u5VarC.b());
        u5VarC.f116189d.setText("商品清单(" + list.size() + ')');
        u5VarC.f116188c.setLayoutManager(new LinearLayoutManager(this.mContext));
        MaxHeightRecyclerView maxHeightRecyclerView = u5VarC.f116188c;
        Activity activity = this.mContext;
        maxHeightRecyclerView.addItemDecoration(new com.max.hbcommon.base.adapter.i(activity, ViewUtils.f(activity, 10.0f), 0, 0));
        u5VarC.f116188c.setAdapter(new c1(list, this, this.mContext));
        iVar.setCancelable(true);
        d1 d1Var = new d1(iVar);
        u5VarC.f116190e.setOnClickListener(d1Var);
        u5VarC.f116187b.setOnClickListener(d1Var);
        iVar.show();
    }

    public static final /* synthetic */ void g4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41645, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.p5();
    }

    private final void g5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41578, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9Var = null;
        if (com.max.hbcommon.utils.c.u(str)) {
            u9 u9Var2 = this.f90345c;
            if (u9Var2 == null) {
                kotlin.jvm.internal.f0.S("binding");
            } else {
                u9Var = u9Var2;
            }
            u9Var.W.f116706t.setVisibility(8);
            return;
        }
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.W.f116706t.setVisibility(0);
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.W.f116692f.setArrowVisible(false);
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        u9Var5.W.f116692f.setColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.W.f116692f.setTextFontBold(false);
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        u9Var7.W.f116692f.setText(str);
        u9 u9Var8 = this.f90345c;
        if (u9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var8 = null;
        }
        u9Var8.W.f116697k.setVisibility(8);
        u9 u9Var9 = this.f90345c;
        if (u9Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var9 = null;
        }
        u9Var9.W.f116706t.setOnClickListener(null);
    }

    private final void g6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41613, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90353k;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        }
        eVarA.q(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new e1());
    }

    public static final /* synthetic */ void h4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41652, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.q5();
    }

    private final void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41605, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f90362t == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
        }
        ProgressDialog progressDialog = this.f90362t;
        if (progressDialog == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
    }

    private final void h6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41560, new Class[0], Void.TYPE).isSupported || !isActive() || this.mContext.isFinishing()) {
            return;
        }
        MallOrderCancelTipObj mallOrderCancelTipObj = this.f90358p;
        if (mallOrderCancelTipObj != null) {
            kotlin.jvm.internal.f0.m(mallOrderCancelTipObj);
            if (kotlin.jvm.internal.f0.g("deduct", mallOrderCancelTipObj.getType())) {
                MallOrderCancelTipObj mallOrderCancelTipObj2 = this.f90358p;
                kotlin.jvm.internal.f0.m(mallOrderCancelTipObj2);
                if (mallOrderCancelTipObj2.getDiscount() != null) {
                    com.max.hbcommon.view.a.f fVarX = new com.max.hbcommon.view.a.f(this.mContext).x(R.string.sure_forgive_purchase);
                    kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                    MallOrderCancelTipObj mallOrderCancelTipObj3 = this.f90358p;
                    kotlin.jvm.internal.f0.m(mallOrderCancelTipObj3);
                    String str = String.format("取消订单将失去价值%s超值优惠", Arrays.copyOf(new Object[]{mallOrderCancelTipObj3.getDiscount()}, 1));
                    kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                    int color = getResources().getColor(R.color.text_primary_1_color);
                    MallOrderCancelTipObj mallOrderCancelTipObj4 = this.f90358p;
                    kotlin.jvm.internal.f0.m(mallOrderCancelTipObj4);
                    String discount = mallOrderCancelTipObj4.getDiscount();
                    kotlin.jvm.internal.f0.m(discount);
                    fVarX.m(com.max.xiaoheihe.utils.e0.d(str, color, 9, discount.length() + 9, false, bb.d.a().b(4), null)).t(R.string.goto_purchase, f1.f90405b).n(R.string.cancel_order, new g1()).g(false).F();
                    return;
                }
            }
        }
        MallOrderCancelTipObj mallOrderCancelTipObj5 = this.f90358p;
        if (mallOrderCancelTipObj5 != null) {
            kotlin.jvm.internal.f0.m(mallOrderCancelTipObj5);
            if (kotlin.jvm.internal.f0.g("same_count", mallOrderCancelTipObj5.getType())) {
                com.max.hbcommon.view.a.f fVarX2 = new com.max.hbcommon.view.a.f(this.mContext).x(R.string.sure_forgive_purchase);
                kotlin.jvm.internal.v0 v0Var2 = kotlin.jvm.internal.v0.f124986a;
                MallOrderCancelTipObj mallOrderCancelTipObj6 = this.f90358p;
                kotlin.jvm.internal.f0.m(mallOrderCancelTipObj6);
                String str2 = String.format("还有%s人和你一样选购了这款商品，是否要继续购买", Arrays.copyOf(new Object[]{mallOrderCancelTipObj6.getCount()}, 1));
                kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
                int color2 = getResources().getColor(R.color.text_primary_1_color);
                MallOrderCancelTipObj mallOrderCancelTipObj7 = this.f90358p;
                kotlin.jvm.internal.f0.m(mallOrderCancelTipObj7);
                String count = mallOrderCancelTipObj7.getCount();
                kotlin.jvm.internal.f0.m(count);
                fVarX2.m(com.max.xiaoheihe.utils.e0.d(str2, color2, 2, count.length() + 2, false, bb.d.a().b(4), null)).t(R.string.goto_purchase, h1.f90413b).n(R.string.cancel_order, new i1()).g(false).F();
                return;
            }
        }
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.sure_forgive_purchase).k(R.string.order_cancel_tip).t(R.string.goto_purchase, j1.f90419b).n(R.string.cancel_order, new k1()).g(false).F();
    }

    public static final /* synthetic */ void i4(MallCartOrderDetailFragment mallCartOrderDetailFragment, boolean z10, boolean z11) {
        Object[] objArr = {mallCartOrderDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 41644, new Class[]{MallCartOrderDetailFragment.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.r5(z10, z11);
    }

    private final Drawable i5(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 41640, new Class[]{Float.TYPE}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableO = com.max.hbutils.utils.q.o(this.mContext, R.color.background_layer_2_color, f10);
        kotlin.jvm.internal.f0.o(gradientDrawableO, "getRectShape(mContext, R…er_2_color, cardRadiusDP)");
        return gradientDrawableO;
    }

    private final void i6() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41621, new Class[0], Void.TYPE).isSupported || (activity = this.mContext) == null || activity.isFinishing() || u5().g() == null) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.item_address_confirm, (ViewGroup) null, false);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.item_address_confirm, viewInflate);
        ViewGroup.LayoutParams layoutParams = viewInflate != null ? viewInflate.getLayoutParams() : null;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.width = -1;
        viewInflate.setLayoutParams(layoutParams);
        com.max.hblogistics.b.b(eVar, u5().g());
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.confirm_address).i(viewInflate).t(R.string.confirm, new l1()).n(R.string.modify_info, new m1()).F();
    }

    private final void j5(boolean z10) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41574, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            u9 u9Var = this.f90345c;
            if (u9Var == null) {
                kotlin.jvm.internal.f0.S("binding");
                u9Var = null;
            }
            u9Var.f116290b0.setVisibility(0);
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str2 = this.f90353k;
        if (str2 == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        } else {
            str = str2;
        }
        MallCouponObj mallCouponObjH = u5().h();
        String coupon_id = mallCouponObjH != null ? mallCouponObjH.getCoupon_id() : null;
        KeyDescObj keyDescObjK = u5().k();
        addDisposable((io.reactivex.disposables.b) eVarA.j6(str, coupon_id, keyDescObjK != null ? keyDescObjK.getKey() : null, u5().i(), t5()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void j6(String str) {
        Activity activity;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41589, new Class[]{String.class}, Void.TYPE).isSupported || (activity = this.mContext) == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).x(R.string.confirm_receipt_title).k(R.string.confirm_receipt_desc).t(R.string.confirm_receipt, new n1(str)).n(R.string.cancel, o1.f90435b).F();
    }

    static /* synthetic */ void k5(MallCartOrderDetailFragment mallCartOrderDetailFragment, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 41575, new Class[]{MallCartOrderDetailFragment.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        mallCartOrderDetailFragment.j5(z10);
    }

    private final com.max.hbcommon.component.i k6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41597, new Class[0], com.max.hbcommon.component.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.component.i) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.dialog_hcoin_deduction, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(this.mContext, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.mContext, true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bottom_bar);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_order_price);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_faq);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.vg_bg);
        kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.iv_close);
        kotlin.jvm.internal.f0.n(viewFindViewById5, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById5;
        bb.d.d(textView, 4);
        String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(u5().n()) + com.max.hbutils.utils.n.r(u5().i()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 165);
        sb2.append(com.max.hbutils.utils.n.t(new Regex(Constants.ACCEPT_TIME_SEPARATOR_SP).m(String.valueOf(com.max.hbutils.utils.n.p(strValueOf) / 1000.0f), ".")));
        textView.setText(sb2.toString());
        ((ViewGroup) viewFindViewById).setBackground(com.max.hbutils.utils.q.E(this.mContext, R.color.divider_color, 8.0f));
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
        long j10 = s5()[1];
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.current_h_coin));
        sb3.append(": ");
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        sb3.append(mallCartOrderDetailObj.getTotal_coin());
        sb3.append("，可抵现");
        sb3.append(j10);
        String string = sb3.toString();
        textView3.setText(string);
        if (!com.max.hbcommon.utils.c.u(u5().i())) {
            editText.setText(u5().i());
            String strI = u5().i();
            kotlin.jvm.internal.f0.m(strI);
            editText.setSelection(strI.length());
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(j10)});
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new p1(textView5));
        editText.addTextChangedListener(new q1(j10, textView3, textView4, textView5, string));
        textView4.setOnClickListener(new r1(j10, editText));
        textView5.setOnClickListener(new s1(editText, this, iVar));
        textView2.setOnClickListener(new t1());
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        u1 u1Var = new u1(iVar);
        imageView.setOnClickListener(u1Var);
        viewGroup.setOnClickListener(u1Var);
        iVar.show();
        return iVar;
    }

    public static final /* synthetic */ com.max.xiaoheihe.module.mall.cart.viewmodel.b l4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41648, new Class[]{MallCartOrderDetailFragment.class}, com.max.xiaoheihe.module.mall.cart.viewmodel.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.cart.viewmodel.b) patchProxyResultProxy.result : mallCartOrderDetailFragment.u5();
    }

    private final void l5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41625, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K1(PaymentManager.A, o5(str)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.max.hbcommon.component.i] */
    private final void l6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41602, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        v5 v5VarC = v5.c(this.mInflater);
        kotlin.jvm.internal.f0.o(v5VarC, "inflate(mInflater)");
        v5VarC.b().setElevation(ViewUtils.f(this.mContext, 2.0f));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = new com.max.hbcommon.component.i((Context) this.mContext, true, (View) v5VarC.b());
        v5VarC.f116634b.setRightClickListener(new v1(v5VarC, this, objectRef));
        ((com.max.hbcommon.component.i) objectRef.f124891b).setCancelable(true);
        w1 w1Var = new w1(objectRef);
        v5VarC.f116637e.setOnClickListener(w1Var);
        v5VarC.f116636d.setOnClickListener(w1Var);
        ((com.max.hbcommon.component.i) objectRef.f124891b).show();
        ViewUtils.r0(v5VarC.f116635c);
    }

    public static final /* synthetic */ void m4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41663, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.v5();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private final void m6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41607, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.f90365w;
        if (aVar != null) {
            kotlin.jvm.internal.f0.m(aVar);
            if (!aVar.isShowing()) {
                if (!this.f90367y) {
                    this.f90365w = new com.max.hbcommon.view.a.f(this.mContext).l("您是否已经完成了支付").u("已支付", new x1()).o("未支付", new y1()).F();
                    return;
                }
            }
        } else if (!this.f90367y) {
            this.f90365w = new com.max.hbcommon.view.a.f(this.mContext).l("您是否已经完成了支付").u("已支付", new x1()).o("未支付", new y1()).F();
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", " showPayCompleteConfirmDialog isBlocked==" + this.f90367y);
    }

    public static final /* synthetic */ void n4(MallCartOrderDetailFragment mallCartOrderDetailFragment, String str) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, str}, null, changeQuickRedirect, true, 41659, new Class[]{MallCartOrderDetailFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.A5(str);
    }

    private final boolean n6() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41630, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        TYPE_CODE type_codeY4 = Y4();
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        return (!kotlin.jvm.internal.f0.g(MallOrderDetailObj.ORDER_TYPE_PHYSICAL, mallCartOrderDetailObj.getOrder_type()) || type_codeY4 == TYPE_CODE.WAITING_FOR_PAY || type_codeY4 == TYPE_CODE.CANCELED || type_codeY4 == TYPE_CODE.FAILED) ? false : true;
    }

    public static final /* synthetic */ void o4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41651, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.B5();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    private final Map<String, String> o5(String str) {
        String key;
        String coupon_id;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41626, new Class[]{String.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        String str2 = this.f90353k;
        MallCartOrderDetailObj mallCartOrderDetailObj = null;
        if (str2 == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str2 = null;
        }
        map.put("order_id", str2);
        map.put("order_type", "mall");
        if (str != null) {
            map.put("pay_price", str);
        }
        MallCouponObj mallCouponObjH = u5().h();
        if (mallCouponObjH != null && (coupon_id = mallCouponObjH.getCoupon_id()) != null) {
            map.put("coupon_id", coupon_id);
        }
        KeyDescObj keyDescObjK = u5().k();
        if (keyDescObjK != null && (key = keyDescObjK.getKey()) != null) {
            map.put("purchase_code", key);
        }
        String strI = u5().i();
        if (strI != null) {
            map.put("deduct_coin", strI);
        }
        if (u5().e()) {
            MallCartOrderDetailObj mallCartOrderDetailObj2 = this.f90354l;
            if (mallCartOrderDetailObj2 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj2 = null;
            }
            if (mallCartOrderDetailObj2.getStack_coupons() != null) {
                MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
                if (mallCartOrderDetailObj3 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                } else {
                    mallCartOrderDetailObj = mallCartOrderDetailObj3;
                }
                MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj.getStack_coupons();
                kotlin.jvm.internal.f0.m(stack_coupons);
                map.put("stack_sku_id", stack_coupons.getCoupon_sku_id());
                if (u5().m() != null) {
                    MallCouponObj mallCouponObjM = u5().m();
                    kotlin.jvm.internal.f0.m(mallCouponObjM);
                    String coupon_pool_id = mallCouponObjM.getCoupon_pool_id();
                    kotlin.jvm.internal.f0.o(coupon_pool_id, "viewModel.mCurrentStackCoupon!!.coupon_pool_id");
                    map.put("stack_cou_pool_id", coupon_pool_id);
                }
            } else if (u5().m() != null) {
                MallCouponObj mallCouponObjM2 = u5().m();
                kotlin.jvm.internal.f0.m(mallCouponObjM2);
                String coupon_id2 = mallCouponObjM2.getCoupon_id();
                kotlin.jvm.internal.f0.o(coupon_id2, "viewModel.mCurrentStackCoupon!!.coupon_id");
                map.put("stack_coupon_id", coupon_id2);
            }
        } else if (u5().m() != null) {
            MallCouponObj mallCouponObjM3 = u5().m();
            kotlin.jvm.internal.f0.m(mallCouponObjM3);
            String coupon_id3 = mallCouponObjM3.getCoupon_id();
            kotlin.jvm.internal.f0.o(coupon_id3, "viewModel.mCurrentStackCoupon!!.coupon_id");
            map.put("stack_coupon_id", coupon_id3);
        }
        return map;
    }

    private final void o6(MallOrderStackCouponObj mallOrderStackCouponObj, boolean z10) {
        String coupon_value;
        if (PatchProxy.proxy(new Object[]{mallOrderStackCouponObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41580, new Class[]{MallOrderStackCouponObj.class, Boolean.TYPE}, Void.TYPE).isSupported || mallOrderStackCouponObj == null || this.mContext.isFinishing()) {
            return;
        }
        com.max.hbcommon.component.bottomsheet.a aVar = new com.max.hbcommon.component.bottomsheet.a();
        View viewInflate = this.mInflater.inflate(R.layout.layout_stack_coupon_dialog, (ViewGroup) null);
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) viewInflate.findViewById(R.id.rv);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        maxHeightRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        maxHeightRecyclerView.setAdapter(new z1(this.mContext, mallOrderStackCouponObj.getFlat_coupons()));
        textView.setText("叠加优惠券包");
        aVar.h(R.drawable.bottom_sheets_key_discount_28x28).n(R.drawable.bottom_sheets_broken_coupon_80x80).k(true).x(false).r(viewInflate);
        if (z10) {
            String str = "总价值 " + mallOrderStackCouponObj.getTotal_value() + " 元，本单可用 ";
            MallOrderSuggestCoupon suggest_coupon = mallOrderStackCouponObj.getSuggest_coupon();
            if (suggest_coupon == null || (coupon_value = suggest_coupon.getCoupon_value()) == null) {
                coupon_value = "0";
            }
            SpannableString spannableString = new SpannableString(str + coupon_value + " 元优惠\n" + mallOrderStackCouponObj.getTip());
            spannableString.setSpan(new ForegroundColorSpan(com.max.hbcommon.utils.l.a(R.color.coupon_orange)), str.length(), str.length() + coupon_value.length(), 33);
            textView2.setText(spannableString);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        com.max.hbcommon.component.bottomsheet.q qVarA = aVar.a();
        qVarA.M3(getChildFragmentManager(), "stack_coupon_bottom_dialog");
        if (qVarA.isViewCreated()) {
            View viewD4 = qVarA.d4();
            kotlin.jvm.internal.f0.n(viewD4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) viewD4).getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            layoutParams2.T = (int) (ViewUtils.J(this.mContext) * 0.85f);
            qVarA.m4().setVisibility(8);
        }
    }

    public static final /* synthetic */ void p4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41678, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.C5();
    }

    private final void p5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41567, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90353k;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.z4(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    static /* synthetic */ void p6(MallCartOrderDetailFragment mallCartOrderDetailFragment, MallOrderStackCouponObj mallOrderStackCouponObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, mallOrderStackCouponObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 41581, new Class[]{MallCartOrderDetailFragment.class, MallOrderStackCouponObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        mallCartOrderDetailFragment.o6(mallOrderStackCouponObj, z10);
    }

    public static final /* synthetic */ void q4(MallCartOrderDetailFragment mallCartOrderDetailFragment, boolean z10, boolean z11) {
        Object[] objArr = {mallCartOrderDetailFragment, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 41654, new Class[]{MallCartOrderDetailFragment.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.D5(z10, z11);
    }

    private final void q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41568, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        r5(false, false);
    }

    private final void q6(MallCartOrderDetailObj mallCartOrderDetailObj) {
        Activity mContext;
        Activity mContext2;
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailObj}, this, changeQuickRedirect, false, 41587, new Class[]{MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ShareInfoObj share_info = mallCartOrderDetailObj.getShare_info();
        JsonObject extra_data = share_info != null ? share_info.getExtra_data() : null;
        if (extra_data == null) {
            extra_data = new JsonObject();
        }
        String str = this.f90353k;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        }
        extra_data.addProperty("order_id", str);
        com.max.hbshare.c.a(com.max.hbshare.c.f72545a, "3", null, extra_data);
        List<CardObjV2> cm_cards_v2 = mallCartOrderDetailObj.getCm_cards_v2();
        List listN2 = cm_cards_v2 != null ? CollectionsKt___CollectionsKt.n2(cm_cards_v2) : null;
        if (!(listN2 == null || listN2.isEmpty()) && (mContext2 = this.mContext) != null && this.mInflater != null) {
            kotlin.jvm.internal.f0.o(mContext2, "mContext");
            LayoutInflater mInflater = this.mInflater;
            kotlin.jvm.internal.f0.o(mInflater, "mInflater");
            MallCartOrderShowCardShareKt.d(this, mContext2, mInflater, mallCartOrderDetailObj);
            return;
        }
        List<CardObj> cm_cards = mallCartOrderDetailObj.getCm_cards();
        if (!(cm_cards == null || cm_cards.isEmpty()) && (mContext = this.mContext) != null && this.mInflater != null) {
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            LayoutInflater mInflater2 = this.mInflater;
            kotlin.jvm.internal.f0.o(mInflater2, "mInflater");
            MallCartOrderShowCardShareKt.c(this, mContext, mInflater2, mallCartOrderDetailObj);
            return;
        }
        ShareInfoObj share_info2 = mallCartOrderDetailObj.getShare_info();
        if (this.mContext.isFinishing() || share_info2 == null || share_info2.getShare_window() == null) {
            return;
        }
        ShareWindowObj share_window = share_info2.getShare_window();
        com.max.hbcommon.component.bottomsheet.a aVar = new com.max.hbcommon.component.bottomsheet.a();
        SpannableString spannableString = new SpannableString(share_window.getDesc());
        if (!com.max.hbcommon.utils.c.u(share_window.getDesc_highlight()) && !com.max.hbcommon.utils.c.u(share_window.getDesc())) {
            String desc = share_window.getDesc();
            kotlin.jvm.internal.f0.m(desc);
            String desc_highlight = share_window.getDesc_highlight();
            kotlin.jvm.internal.f0.m(desc_highlight);
            if (StringsKt__StringsKt.W2(desc, desc_highlight, false, 2, null)) {
                String desc2 = share_window.getDesc();
                kotlin.jvm.internal.f0.m(desc2);
                String desc_highlight2 = share_window.getDesc_highlight();
                kotlin.jvm.internal.f0.m(desc_highlight2);
                int iS3 = StringsKt__StringsKt.s3(desc2, desc_highlight2, 0, false, 6, null);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange));
                String desc_highlight3 = share_window.getDesc_highlight();
                kotlin.jvm.internal.f0.m(desc_highlight3);
                spannableString.setSpan(foregroundColorSpan, iS3, desc_highlight3.length() + iS3, 17);
            }
        }
        View weChatShareView = this.mInflater.inflate(R.layout.layout_mall_order_share, (ViewGroup) null);
        weChatShareView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        aVar.h(R.drawable.bottom_sheets_key_discount_28x28).n(R.drawable.bottom_sheets_broken_coupon_80x80).k(true).x(true).l(spannableString).r(weChatShareView);
        com.max.hbcommon.component.bottomsheet.q qVarA = aVar.a();
        SpannableString spannableString2 = new SpannableString(share_window.getTitle());
        if (!com.max.hbcommon.utils.c.u(share_window.getTitle_highlight()) && !com.max.hbcommon.utils.c.u(share_window.getTitle())) {
            String title = share_window.getTitle();
            kotlin.jvm.internal.f0.m(title);
            String title_highlight = share_window.getTitle_highlight();
            kotlin.jvm.internal.f0.m(title_highlight);
            if (StringsKt__StringsKt.W2(title, title_highlight, false, 2, null)) {
                String title2 = share_window.getTitle();
                kotlin.jvm.internal.f0.m(title2);
                String title_highlight2 = share_window.getTitle_highlight();
                kotlin.jvm.internal.f0.m(title_highlight2);
                int iS4 = StringsKt__StringsKt.s3(title2, title_highlight2, 0, false, 6, null);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange));
                String title_highlight3 = share_window.getTitle_highlight();
                kotlin.jvm.internal.f0.m(title_highlight3);
                spannableString2.setSpan(foregroundColorSpan2, iS4, title_highlight3.length() + iS4, 17);
            }
        }
        kotlin.jvm.internal.f0.o(weChatShareView, "weChatShareView");
        w5(weChatShareView);
        View viewFindViewById = weChatShareView.findViewById(R.id.vg_wechat_timeline);
        View viewFindViewById2 = weChatShareView.findViewById(R.id.vg_wechat_friends);
        View viewFindViewById3 = weChatShareView.findViewById(R.id.vg_qq);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(0);
        }
        HBShareData hBShareData = new HBShareData(false, true, share_info2.getShare_title(), share_info2.getShare_desc(), share_info2.getShare_url(), null, !com.max.hbcommon.utils.c.u(share_info2.getShare_img()) ? new UMImage(this.mContext, share_info2.getShare_img()) : new UMImage(this.mContext, R.drawable.share_thumbnail), this.G, null, null, null, null, null, bb.c.k.L0, null);
        viewFindViewById.setOnClickListener(new a2(hBShareData, qVarA));
        viewFindViewById2.setOnClickListener(new b2(hBShareData, qVarA));
        viewFindViewById3.setOnClickListener(new c2(hBShareData, qVarA));
        qVarA.M3(getChildFragmentManager(), "share_bottom_dialog");
        if (qVarA.isViewCreated()) {
            qVarA.l4().setText(spannableString2);
            qVarA.e4().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            View viewD4 = qVarA.d4();
            kotlin.jvm.internal.f0.n(viewD4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) viewD4).getLayoutParams();
            kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).height = -2;
            ViewGroup.LayoutParams layoutParams2 = qVarA.m4().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = ViewUtils.f(this.mContext, 56.0f);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.height = -2;
        }
    }

    public static final /* synthetic */ void r4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41668, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.H5();
    }

    @SuppressLint({"AutoDispose"})
    private final void r5(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 41569, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f90353k;
        if (str == null) {
            kotlin.jvm.internal.f0.S("mOrderId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.j0(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h(z10, z11)));
    }

    private final void r6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41559, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f90362t == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
        }
        ProgressDialog progressDialog = this.f90362t;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this.f90362t;
            if (progressDialog3 == null) {
                kotlin.jvm.internal.f0.S("loadingDialog");
            } else {
                progressDialog2 = progressDialog3;
            }
            progressDialog2.dismiss();
        }
        io.reactivex.disposables.a aVar = this.f90368z;
        if (aVar != null) {
            aVar.f();
        }
        this.f90366x = false;
    }

    public static final /* synthetic */ void s4(MallCartOrderDetailFragment mallCartOrderDetailFragment, String str, String str2, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, str, str2, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 41647, new Class[]{MallCartOrderDetailFragment.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.I5(str, str2, i10, z10);
    }

    private final long[] s5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41598, new Class[0], long[].class);
        if (patchProxyResultProxy.isSupported) {
            return (long[]) patchProxyResultProxy.result;
        }
        long[] jArr = new long[2];
        String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(u5().n()) + com.max.hbutils.utils.n.r(u5().i()));
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        MallCartOrderDetailObj mallCartOrderDetailObj2 = null;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        if (mallCartOrderDetailObj.getMax_deduct_coin() < 0) {
            jArr[0] = com.max.hbutils.utils.n.r(strValueOf);
        } else {
            long jR = com.max.hbutils.utils.n.r(strValueOf);
            MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
            if (mallCartOrderDetailObj3 == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj3 = null;
            }
            jArr[0] = Math.min(jR, mallCartOrderDetailObj3.getMax_deduct_coin());
        }
        MallCartOrderDetailObj mallCartOrderDetailObj4 = this.f90354l;
        if (mallCartOrderDetailObj4 == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
        } else {
            mallCartOrderDetailObj2 = mallCartOrderDetailObj4;
        }
        jArr[1] = Math.min(com.max.hbutils.utils.n.r(mallCartOrderDetailObj2.getTotal_coin()), jArr[0]);
        return jArr;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void s6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41614, new Class[0], Void.TYPE).isSupported) {
        }
        String strC = u5().c();
        u9 u9Var = null;
        switch (strC.hashCode()) {
            case -1414974525:
                if (strC.equals(PaymentManager.f71427z)) {
                    u9 u9Var2 = this.f90345c;
                    if (u9Var2 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var2 = null;
                    }
                    u9Var2.U.f116248h.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var3 = this.f90345c;
                    if (u9Var3 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var3 = null;
                    }
                    u9Var3.U.f116250j.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var4 = this.f90345c;
                    if (u9Var4 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var4 = null;
                    }
                    u9Var4.U.f116246f.setImageResource(R.drawable.common_select_single_filled_16x16);
                    u9 u9Var5 = this.f90345c;
                    if (u9Var5 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var5 = null;
                    }
                    u9Var5.U.f116249i.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var6 = this.f90345c;
                    if (u9Var6 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var6 = null;
                    }
                    u9Var6.U.C.setVisibility(8);
                    u9 u9Var7 = this.f90345c;
                    if (u9Var7 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var7 = null;
                    }
                    u9Var7.U.f116261u.setVisibility(0);
                    u9 u9Var8 = this.f90345c;
                    if (u9Var8 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        u9Var = u9Var8;
                    }
                    u9Var.U.f116263w.setVisibility(8);
                    break;
                }
                break;
            case 113570720:
                if (strC.equals(PaymentManager.f71426y)) {
                    u9 u9Var9 = this.f90345c;
                    if (u9Var9 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var9 = null;
                    }
                    u9Var9.U.f116248h.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var10 = this.f90345c;
                    if (u9Var10 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var10 = null;
                    }
                    u9Var10.U.f116250j.setImageResource(R.drawable.common_select_single_filled_16x16);
                    u9 u9Var11 = this.f90345c;
                    if (u9Var11 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var11 = null;
                    }
                    u9Var11.U.f116246f.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var12 = this.f90345c;
                    if (u9Var12 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var12 = null;
                    }
                    u9Var12.U.f116249i.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var13 = this.f90345c;
                    if (u9Var13 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var13 = null;
                    }
                    u9Var13.U.C.setVisibility(0);
                    u9 u9Var14 = this.f90345c;
                    if (u9Var14 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var14 = null;
                    }
                    u9Var14.U.f116261u.setVisibility(8);
                    u9 u9Var15 = this.f90345c;
                    if (u9Var15 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        u9Var = u9Var15;
                    }
                    u9Var.U.f116263w.setVisibility(8);
                    break;
                }
                break;
            case 524462452:
                if (strC.equals(PaymentManager.A)) {
                    u9 u9Var16 = this.f90345c;
                    if (u9Var16 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var16 = null;
                    }
                    u9Var16.U.f116248h.setImageResource(R.drawable.common_select_single_filled_16x16);
                    u9 u9Var17 = this.f90345c;
                    if (u9Var17 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var17 = null;
                    }
                    u9Var17.U.f116250j.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var18 = this.f90345c;
                    if (u9Var18 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var18 = null;
                    }
                    u9Var18.U.f116246f.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var19 = this.f90345c;
                    if (u9Var19 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var19 = null;
                    }
                    u9Var19.U.f116249i.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var20 = this.f90345c;
                    if (u9Var20 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var20 = null;
                    }
                    u9Var20.U.C.setVisibility(8);
                    u9 u9Var21 = this.f90345c;
                    if (u9Var21 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var21 = null;
                    }
                    u9Var21.U.f116261u.setVisibility(8);
                    u9 u9Var22 = this.f90345c;
                    if (u9Var22 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        u9Var = u9Var22;
                    }
                    u9Var.U.f116263w.setVisibility(8);
                    break;
                }
                break;
            case 825497556:
                if (strC.equals("lianlian")) {
                    u9 u9Var23 = this.f90345c;
                    if (u9Var23 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var23 = null;
                    }
                    u9Var23.U.f116248h.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var24 = this.f90345c;
                    if (u9Var24 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var24 = null;
                    }
                    u9Var24.U.f116250j.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var25 = this.f90345c;
                    if (u9Var25 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var25 = null;
                    }
                    u9Var25.U.f116246f.setImageResource(R.drawable.common_select_line_16x16);
                    u9 u9Var26 = this.f90345c;
                    if (u9Var26 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var26 = null;
                    }
                    u9Var26.U.f116249i.setImageResource(R.drawable.common_select_single_filled_16x16);
                    u9 u9Var27 = this.f90345c;
                    if (u9Var27 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var27 = null;
                    }
                    u9Var27.U.C.setVisibility(8);
                    u9 u9Var28 = this.f90345c;
                    if (u9Var28 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                        u9Var28 = null;
                    }
                    u9Var28.U.f116261u.setVisibility(8);
                    u9 u9Var29 = this.f90345c;
                    if (u9Var29 == null) {
                        kotlin.jvm.internal.f0.S("binding");
                    } else {
                        u9Var = u9Var29;
                    }
                    u9Var.U.f116263w.setVisibility(0);
                    break;
                }
                break;
        }
    }

    public static final /* synthetic */ void t4(MallCartOrderDetailFragment mallCartOrderDetailFragment, AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, addressInfoObj}, null, changeQuickRedirect, true, 41650, new Class[]{MallCartOrderDetailFragment.class, AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.J5(addressInfoObj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    private final Map<String, String> t5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41627, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        if (u5().e()) {
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            MallCartOrderDetailObj mallCartOrderDetailObj2 = null;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            if (mallCartOrderDetailObj.getStack_coupons() != null) {
                MallCartOrderDetailObj mallCartOrderDetailObj3 = this.f90354l;
                if (mallCartOrderDetailObj3 == null) {
                    kotlin.jvm.internal.f0.S("mOrderDetailObj");
                } else {
                    mallCartOrderDetailObj2 = mallCartOrderDetailObj3;
                }
                MallOrderStackCouponObj stack_coupons = mallCartOrderDetailObj2.getStack_coupons();
                kotlin.jvm.internal.f0.m(stack_coupons);
                map.put("stack_sku_id", stack_coupons.getCoupon_sku_id());
                if (u5().m() != null) {
                    MallCouponObj mallCouponObjM = u5().m();
                    kotlin.jvm.internal.f0.m(mallCouponObjM);
                    String coupon_pool_id = mallCouponObjM.getCoupon_pool_id();
                    kotlin.jvm.internal.f0.o(coupon_pool_id, "viewModel.mCurrentStackCoupon!!.coupon_pool_id");
                    map.put("stack_cou_pool_id", coupon_pool_id);
                }
            } else if (u5().m() != null) {
                MallCouponObj mallCouponObjM2 = u5().m();
                kotlin.jvm.internal.f0.m(mallCouponObjM2);
                String coupon_id = mallCouponObjM2.getCoupon_id();
                kotlin.jvm.internal.f0.o(coupon_id, "viewModel.mCurrentStackCoupon!!.coupon_id");
                map.put("stack_coupon_id", coupon_id);
            }
        } else if (u5().m() != null) {
            MallCouponObj mallCouponObjM3 = u5().m();
            kotlin.jvm.internal.f0.m(mallCouponObjM3);
            String coupon_id2 = mallCouponObjM3.getCoupon_id();
            kotlin.jvm.internal.f0.o(coupon_id2, "viewModel.mCurrentStackCoupon!!.coupon_id");
            map.put("stack_coupon_id", coupon_id2);
        }
        return map;
    }

    private final void t6() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41588, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
        if (mallCartOrderDetailObj == null) {
            kotlin.jvm.internal.f0.S("mOrderDetailObj");
            mallCartOrderDetailObj = null;
        }
        ShareInfoObj share_info = mallCartOrderDetailObj.getShare_info();
        this.G.a(share_info != null ? share_info.getExtra_data() : null);
    }

    public static final /* synthetic */ void u4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41662, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.O5();
    }

    private final com.max.xiaoheihe.module.mall.cart.viewmodel.b u5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41555, new Class[0], com.max.xiaoheihe.module.mall.cart.viewmodel.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.cart.viewmodel.b) patchProxyResultProxy.result : (com.max.xiaoheihe.module.mall.cart.viewmodel.b) this.f90344b.getValue();
    }

    public static final /* synthetic */ void v4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41658, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.P5();
    }

    private final void v5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41584, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", lb.a.f131011n3);
        intent.putExtra("title", getString(R.string.request_return_replacement));
        this.mContext.startActivity(intent);
    }

    public static final /* synthetic */ void w4(MallCartOrderDetailFragment mallCartOrderDetailFragment, MallCartOrderDetailObj mallCartOrderDetailObj) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment, mallCartOrderDetailObj}, null, changeQuickRedirect, true, 41676, new Class[]{MallCartOrderDetailFragment.class, MallCartOrderDetailObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.V5(mallCartOrderDetailObj);
    }

    private final void w5(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41586, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        x5(view, R.id.vg_create_post);
        x5(view, R.id.vg_post);
        x5(view, R.id.vg_copy_link);
        x5(view, R.id.vg_save);
        x5(view, R.id.vg_qq);
        x5(view, R.id.vg_wechat_timeline);
        x5(view, R.id.vg_wechat_friends);
    }

    public static final /* synthetic */ void x4(MallCartOrderDetailFragment mallCartOrderDetailFragment) {
        if (PatchProxy.proxy(new Object[]{mallCartOrderDetailFragment}, null, changeQuickRedirect, true, 41665, new Class[]{MallCartOrderDetailFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallCartOrderDetailFragment.W5();
    }

    private static final void x5(View view, @androidx.annotation.d0 int i10) {
        View viewFindViewById;
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, 41642, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported || (viewFindViewById = view.findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    private final void y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41620, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        re reVarC = re.c(this.mInflater);
        kotlin.jvm.internal.f0.o(reVarC, "inflate(mInflater)");
        this.f90346d = reVarC;
        u9 u9Var = this.f90345c;
        u9 u9Var2 = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        BottomButtonLeftItemView bottomButtonLeftItemView = u9Var.I;
        re reVar = this.f90346d;
        if (reVar == null) {
            kotlin.jvm.internal.f0.S("mPriceBinding");
            reVar = null;
        }
        ConstraintLayout constraintLayoutB = reVar.b();
        kotlin.jvm.internal.f0.o(constraintLayoutB, "mPriceBinding.root");
        bottomButtonLeftItemView.b(constraintLayoutB);
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.I.setRightText("去结算");
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.I.setRightButtonFixWidth();
        re reVar2 = this.f90346d;
        if (reVar2 == null) {
            kotlin.jvm.internal.f0.S("mPriceBinding");
            reVar2 = null;
        }
        reVar2.f115205b.setVisibility(0);
        re reVar3 = this.f90346d;
        if (reVar3 == null) {
            kotlin.jvm.internal.f0.S("mPriceBinding");
            reVar3 = null;
        }
        ViewGroup.LayoutParams layoutParams = reVar3.b().getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        LinearLayout leftView = u9Var5.I.getLeftView();
        ViewGroup.LayoutParams layoutParams3 = leftView != null ? leftView.getLayoutParams() : null;
        kotlin.jvm.internal.f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.width = 0;
        layoutParams4.weight = 1.0f;
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var2 = u9Var6;
        }
        u9Var2.I.setRightClickListener(new i());
    }

    private final void z5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41558, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mTitleBar.a0();
        this.mTitleBar.setNavigationOnClickListener(new j());
        y5();
        u9 u9Var = this.f90345c;
        u9 u9Var2 = null;
        if (u9Var == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var = null;
        }
        u9Var.Q.setOnClickListener(new k());
        u9 u9Var3 = this.f90345c;
        if (u9Var3 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var3 = null;
        }
        u9Var3.f116308s.S(new l());
        u9 u9Var4 = this.f90345c;
        if (u9Var4 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var4 = null;
        }
        u9Var4.f116308s.b0(false);
        Activity activity = this.mContext;
        u9 u9Var5 = this.f90345c;
        if (u9Var5 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var5 = null;
        }
        float fH0 = ViewUtils.h0(activity, ViewUtils.o(activity, u9Var5.W.f116694h));
        GradientDrawable gradientDrawableM = com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.mContext, R.color.gold_light_alpha8, fH0), this.mContext, R.color.gold_light, 0.5f);
        u9 u9Var6 = this.f90345c;
        if (u9Var6 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var6 = null;
        }
        u9Var6.W.f116694h.setBackground(gradientDrawableM);
        GradientDrawable gradientDrawableM2 = com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.mContext, R.color.gold_light_alpha8, fH0), this.mContext, R.color.gold_light, 0.5f);
        u9 u9Var7 = this.f90345c;
        if (u9Var7 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var7 = null;
        }
        u9Var7.W.f116697k.setBackground(gradientDrawableM2);
        Activity activity2 = this.mContext;
        float fH1 = ViewUtils.h0(activity2, ViewUtils.m(activity2, ViewUtils.L(activity2), ViewUtils.f(this.mContext, 100.0f)));
        u9 u9Var8 = this.f90345c;
        if (u9Var8 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var8 = null;
        }
        u9Var8.G.setBackground(i5(fH1));
        u9 u9Var9 = this.f90345c;
        if (u9Var9 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var9 = null;
        }
        u9Var9.N.setBackground(i5(fH1));
        u9 u9Var10 = this.f90345c;
        if (u9Var10 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var10 = null;
        }
        u9Var10.Y.setBackground(i5(fH1));
        u9 u9Var11 = this.f90345c;
        if (u9Var11 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var11 = null;
        }
        u9Var11.V.setBackground(i5(fH1));
        u9 u9Var12 = this.f90345c;
        if (u9Var12 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var12 = null;
        }
        u9Var12.X.setBackground(i5(fH1));
        u9 u9Var13 = this.f90345c;
        if (u9Var13 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var13 = null;
        }
        u9Var13.S.setBackground(i5(fH1));
        u9 u9Var14 = this.f90345c;
        if (u9Var14 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var14 = null;
        }
        u9Var14.P.setBackground(i5(fH1));
        u9 u9Var15 = this.f90345c;
        if (u9Var15 == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9Var15 = null;
        }
        u9Var15.L.setBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.u(this.mContext, R.color.gold_light_alpha8, 5.0f), this.mContext, R.color.coupon_orange, 1.0f));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{com.max.hbcommon.utils.l.a(R.color.orange_start), com.max.hbcommon.utils.l.a(R.color.orange_end)});
        gradientDrawable.setCornerRadii(com.max.hbutils.utils.q.I(ViewUtils.f(this.mContext, 5.0f), 6));
        u9 u9Var16 = this.f90345c;
        if (u9Var16 == null) {
            kotlin.jvm.internal.f0.S("binding");
        } else {
            u9Var2 = u9Var16;
        }
        u9Var2.M.setBackground(gradientDrawable);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void E3(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41637, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f90364v = str;
        r6();
        r5(true, false);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void S1() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    @Override // cf.a
    public boolean S2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41566, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.f90354l == null || !U4()) {
            this.mContext.finish();
            return true;
        }
        com.max.hbcommon.view.a.f fVarX = new com.max.hbcommon.view.a.f(this.mContext).x(R.string.sure_forgive_purchase);
        MallOrderCancelTipObj mallOrderCancelTipObj = this.f90358p;
        if (mallOrderCancelTipObj != null) {
            kotlin.jvm.internal.f0.m(mallOrderCancelTipObj);
            if (kotlin.jvm.internal.f0.g("deduct", mallOrderCancelTipObj.getType())) {
                MallOrderCancelTipObj mallOrderCancelTipObj2 = this.f90358p;
                kotlin.jvm.internal.f0.m(mallOrderCancelTipObj2);
                if (mallOrderCancelTipObj2.getDiscount() != null) {
                    kotlin.jvm.internal.v0 v0Var = kotlin.jvm.internal.v0.f124986a;
                    MallOrderCancelTipObj mallOrderCancelTipObj3 = this.f90358p;
                    kotlin.jvm.internal.f0.m(mallOrderCancelTipObj3);
                    String str = String.format("放弃订单将失去价值%s超值优惠", Arrays.copyOf(new Object[]{mallOrderCancelTipObj3.getDiscount()}, 1));
                    kotlin.jvm.internal.f0.o(str, "format(format, *args)");
                    int color = getResources().getColor(R.color.text_primary_1_color);
                    MallOrderCancelTipObj mallOrderCancelTipObj4 = this.f90358p;
                    kotlin.jvm.internal.f0.m(mallOrderCancelTipObj4);
                    String discount = mallOrderCancelTipObj4.getDiscount();
                    kotlin.jvm.internal.f0.m(discount);
                    fVarX.m(com.max.xiaoheihe.utils.e0.d(str, color, 9, discount.length() + 9, false, bb.d.a().b(4), null));
                } else {
                    fVarX.k(R.string.order_cancel_tip);
                }
            } else {
                fVarX.k(R.string.order_cancel_tip);
            }
        } else {
            fVarX.k(R.string.order_cancel_tip);
        }
        fVarX.t(R.string.goto_purchase, m.f90426b).n(R.string.cruel_to_leave, new n()).g(false);
        fVarX.F();
        return true;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void U2(@dl.e String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41638, new Class[]{String.class}, Void.TYPE).isSupported && kotlin.jvm.internal.f0.g(u5().c(), str)) {
            this.f90364v = null;
        }
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void Y0(@dl.e WeixinQueryObj weixinQueryObj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r0.equals("-3") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if (r0.equals("-1") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0086, code lost:
    
        return com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.FAILED;
     */
    @dl.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE Y4() {
        /*
            r8 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE> r7 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.class
            r4 = 0
            r5 = 41633(0xa2a1, float:5.834E-41)
            r2 = r8
            com.meituan.robust.PatchProxyResult r0 = com.meituan.robust.PatchProxy.proxy(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r0.isSupported
            if (r1 == 0) goto L1b
            java.lang.Object r0 = r0.result
            com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE r0 = (com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE) r0
            return r0
        L1b:
            com.max.xiaoheihe.bean.mall.cart.MallCartOrderDetailObj r0 = r8.f90354l
            r1 = 0
            if (r0 != 0) goto L26
            java.lang.String r0 = "mOrderDetailObj"
            kotlin.jvm.internal.f0.S(r0)
            r0 = r1
        L26:
            java.lang.String r0 = r0.getProduct_state()
            int r2 = r0.hashCode()
            r3 = 1444(0x5a4, float:2.023E-42)
            if (r2 == r3) goto L72
            r3 = 1446(0x5a6, float:2.026E-42)
            if (r2 == r3) goto L69
            r3 = 1569(0x621, float:2.199E-42)
            if (r2 == r3) goto L5d
            r3 = 48625(0xbdf1, float:6.8138E-41)
            if (r2 == r3) goto L51
            r3 = 1389220(0x1532a4, float:1.946712E-39)
            if (r2 == r3) goto L45
            goto L7a
        L45:
            java.lang.String r2 = "-100"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L4e
            goto L7a
        L4e:
            com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE r0 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.CANCELED
            return r0
        L51:
            java.lang.String r2 = "100"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5a
            goto L7a
        L5a:
            com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE r0 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.WAITING_FOR_PAY
            return r0
        L5d:
            java.lang.String r2 = "12"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L66
            goto L7a
        L66:
            com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE r0 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.FINISH
            return r0
        L69:
            java.lang.String r2 = "-3"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L84
            goto L7a
        L72:
            java.lang.String r2 = "-1"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L84
        L7a:
            int r0 = com.max.hbutils.utils.n.q(r0)
            if (r0 <= 0) goto L83
            com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE r0 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.PAID
            return r0
        L83:
            return r1
        L84:
            com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE r0 = com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.TYPE_CODE.FAILED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment.Y4():com.max.xiaoheihe.module.mall.cart.ui.MallCartOrderDetailFragment$TYPE_CODE");
    }

    public final void c6(int i10) {
        this.D = i10;
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.e
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41639, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        String str = null;
        if (this.f90354l != null) {
            JsonArray jsonArray = new JsonArray();
            MallCartOrderDetailObj mallCartOrderDetailObj = this.f90354l;
            if (mallCartOrderDetailObj == null) {
                kotlin.jvm.internal.f0.S("mOrderDetailObj");
                mallCartOrderDetailObj = null;
            }
            Iterator<T> it = mallCartOrderDetailObj.getOrder_items().get(0).getItems().iterator();
            while (it.hasNext()) {
                jsonArray.add(((CartItemObj) it.next()).getProduct().getSku_id());
            }
            jsonObject.addProperty("sku_id", jsonArray.toString());
        }
        String str2 = this.f90353k;
        if (str2 != null) {
            if (str2 == null) {
                kotlin.jvm.internal.f0.S("mOrderId");
            } else {
                str = str2;
            }
            jsonObject.addProperty("order_id", str);
        }
        jsonObject.addProperty("h_src", this.f90355m);
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41556, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        u9 u9VarC = u9.c(this.mInflater);
        kotlin.jvm.internal.f0.o(u9VarC, "inflate(mInflater)");
        this.f90345c = u9VarC;
        if (u9VarC == null) {
            kotlin.jvm.internal.f0.S("binding");
            u9VarC = null;
        }
        setContentView(u9VarC);
        Activity activity = this.mContext;
        kotlin.jvm.internal.f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
        PaymentManager paymentManager = new PaymentManager(this, (BaseActivity) activity);
        this.f90361s = paymentManager;
        paymentManager.U(false);
        ProgressDialog progressDialog = new ProgressDialog(this.mContext);
        this.f90362t = progressDialog;
        progressDialog.setIndeterminate(true);
        ProgressDialog progressDialog2 = this.f90362t;
        if (progressDialog2 == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        PaymentManager paymentManager2 = this.f90361s;
        if (paymentManager2 == null) {
            kotlin.jvm.internal.f0.S("mPaymentManager");
            paymentManager2 = null;
        }
        ProgressDialog progressDialog3 = this.f90362t;
        if (progressDialog3 == null) {
            kotlin.jvm.internal.f0.S("loadingDialog");
            progressDialog3 = null;
        }
        paymentManager2.Q(progressDialog3);
        z5();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("order_id") : null;
        kotlin.jvm.internal.f0.m(string);
        this.f90353k = string;
        Bundle arguments2 = getArguments();
        this.f90356n = arguments2 != null ? arguments2.getBoolean(K) : false;
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver();
        this.f90348f = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.A);
        a6();
        showLoading();
        q5();
        p5();
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> j3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41635, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarK1 = com.max.xiaoheihe.network.i.a().K1(PaymentManager.f71427z, o5(str));
        kotlin.jvm.internal.f0.o(zVarK1, "createHeyBoxService().ge…erParams(price)\n        )");
        return zVarK1;
    }

    public final int m5() {
        return this.D;
    }

    @dl.d
    public final com.max.hbshare.c.b n5() {
        return this.G;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void o1() {
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41632, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        UMShareAPI.get(this.mContext).release();
        Activity activity = this.mContext;
        RefreshBroadcastReceiver refreshBroadcastReceiver = this.f90348f;
        if (refreshBroadcastReceiver == null) {
            kotlin.jvm.internal.f0.S("mRefreshBroadcastReceiver");
            refreshBroadcastReceiver = null;
        }
        activity.unregisterReceiver(refreshBroadcastReceiver);
        this.f90368z.f();
        CountDownTimer countDownTimer = this.f90347e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f90347e = null;
        this.E = null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        kotlinx.coroutines.d2 d2Var = this.E;
        if (d2Var != null) {
            kotlinx.coroutines.d2.a.b(d2Var, null, 1, null);
        }
        this.f90367y = true;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41557, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        q5();
        p5();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41561, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (!this.A) {
            onRefresh();
        }
        this.A = false;
        this.f90367y = false;
        if (com.max.hbcommon.utils.c.u(this.f90364v)) {
            return;
        }
        this.E = kotlinx.coroutines.k.f(kotlinx.coroutines.r0.a(kotlinx.coroutines.e1.e()), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> q0(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41634, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarK1 = com.max.xiaoheihe.network.i.a().K1(PaymentManager.f71426y, o5(str));
        kotlin.jvm.internal.f0.o(zVarK1, "createHeyBoxService().ge…erParams(price)\n        )");
        return zVarK1;
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> z3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41636, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarK1 = com.max.xiaoheihe.network.i.a().K1("lianlian", o5(str));
        kotlin.jvm.internal.f0.o(zVarK1, "createHeyBoxService().ge…erParams(price)\n        )");
        return zVarK1;
    }
}
