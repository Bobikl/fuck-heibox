package com.max.hbwallet;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.TabEntity;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.hbwallet.bean.WalletBalanceObj;
import com.max.hbwallet.bean.WalletHcoinObj;
import com.max.hbwallet.bean.WalletInfoObj;
import com.max.hbwallet.bean.WalletProfitObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: HBWalletActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@ig.d(path = {lb.d.f131221o2})
public final class HBWalletActivity extends BaseActivity implements t {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private WalletInfoObj G2;
    private h1 K3;

    @dl.e
    private MallCouponListResultObj L3;

    @dl.e
    private ProgressDialog M3;
    private int N3;
    private View Q;
    private View R;
    private View S;
    private TextView T;
    private TextView U;
    private TextView V;
    private View W;
    private View X;
    private CommonTabLayout Y;
    private ConsecutiveScrollerLayout Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private RecyclerView f73856a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private SmartRefreshLayout f73857b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.e
    private TextView f73858c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private TextView f73859p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.e
    private String f73860p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f73861p3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f73863x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private String f73864y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private boolean f73865y2;
    private final int L = 1;
    private final int M = 2;

    @dl.d
    private final String N = "all";

    @dl.d
    private final String O = "redeem";

    @dl.d
    private final String P = GameObj.TAG_TYPE_COUPON;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private String f73862x1 = "";

    @dl.d
    private String G3 = "all";

    @dl.d
    private ArrayList<MallCouponObj> J3 = new ArrayList<>();

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<MallCouponListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.VA, new Class[0], Void.TYPE).isSupported && HBWalletActivity.this.isActive()) {
                super.onComplete();
                SmartRefreshLayout smartRefreshLayout = HBWalletActivity.this.f73857b0;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = HBWalletActivity.this.f73857b0;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.UA, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HBWalletActivity.this.isActive()) {
                super.onError(e10);
                SmartRefreshLayout smartRefreshLayout = HBWalletActivity.this.f73857b0;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = HBWalletActivity.this.f73857b0;
                if (smartRefreshLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<MallCouponListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.WA, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HBWalletActivity.this.isActive()) {
                HBWalletActivity.this.L3 = result.getResult();
                HBWalletActivity.h3(HBWalletActivity.this);
                if (HBWalletActivity.this.f73861p3 == 0) {
                    HBWalletActivity.this.J3.clear();
                }
                if (!com.max.hbcommon.utils.c.w(result.getResult().getItems())) {
                    HBWalletActivity.this.J3.addAll(result.getResult().getItems());
                }
                h1 h1Var = null;
                if (HBWalletActivity.this.J3.isEmpty()) {
                    View view = HBWalletActivity.this.W;
                    if (view == null) {
                        kotlin.jvm.internal.f0.S("vg_empty");
                        view = null;
                    }
                    view.setVisibility(0);
                    if (kotlin.jvm.internal.f0.g(HBWalletActivity.this.r3(), HBWalletActivity.this.G3)) {
                        View view2 = HBWalletActivity.this.X;
                        if (view2 == null) {
                            kotlin.jvm.internal.f0.S("vg_get_coupon");
                            view2 = null;
                        }
                        view2.setVisibility(0);
                    } else {
                        View view3 = HBWalletActivity.this.X;
                        if (view3 == null) {
                            kotlin.jvm.internal.f0.S("vg_get_coupon");
                            view3 = null;
                        }
                        view3.setVisibility(4);
                    }
                } else {
                    View view4 = HBWalletActivity.this.W;
                    if (view4 == null) {
                        kotlin.jvm.internal.f0.S("vg_empty");
                        view4 = null;
                    }
                    view4.setVisibility(8);
                }
                h1 h1Var2 = HBWalletActivity.this.K3;
                if (h1Var2 == null) {
                    kotlin.jvm.internal.f0.S("mAdapter");
                } else {
                    h1Var = h1Var2;
                }
                h1Var.notifyDataSetChanged();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.XA, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallCouponListResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<WalletInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ZA, new Class[0], Void.TYPE).isSupported && HBWalletActivity.this.isActive()) {
                super.onComplete();
                if (HBWalletActivity.this.f73865y2) {
                    SmartRefreshLayout smartRefreshLayout = HBWalletActivity.this.f73857b0;
                    SmartRefreshLayout smartRefreshLayout2 = null;
                    if (smartRefreshLayout == null) {
                        kotlin.jvm.internal.f0.S("mRefreshLayout");
                        smartRefreshLayout = null;
                    }
                    smartRefreshLayout.A(0);
                    SmartRefreshLayout smartRefreshLayout3 = HBWalletActivity.this.f73857b0;
                    if (smartRefreshLayout3 == null) {
                        kotlin.jvm.internal.f0.S("mRefreshLayout");
                    } else {
                        smartRefreshLayout2 = smartRefreshLayout3;
                    }
                    smartRefreshLayout2.p(0);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.YA, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HBWalletActivity.this.isActive()) {
                super.onError(e10);
                HBWalletActivity.g3(HBWalletActivity.this);
                if (HBWalletActivity.this.f73865y2) {
                    SmartRefreshLayout smartRefreshLayout = HBWalletActivity.this.f73857b0;
                    SmartRefreshLayout smartRefreshLayout2 = null;
                    if (smartRefreshLayout == null) {
                        kotlin.jvm.internal.f0.S("mRefreshLayout");
                        smartRefreshLayout = null;
                    }
                    smartRefreshLayout.A(0);
                    SmartRefreshLayout smartRefreshLayout3 = HBWalletActivity.this.f73857b0;
                    if (smartRefreshLayout3 == null) {
                        kotlin.jvm.internal.f0.S("mRefreshLayout");
                    } else {
                        smartRefreshLayout2 = smartRefreshLayout3;
                    }
                    smartRefreshLayout2.p(0);
                }
            }
        }

        public void onNext(@dl.d Result<WalletInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.aB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HBWalletActivity.this.isActive()) {
                HBWalletActivity.this.O3(result.getResult());
                HBWalletActivity.this.q4();
                View view = null;
                if (HBWalletActivity.this.f73863x2 == 1) {
                    View view2 = HBWalletActivity.this.Q;
                    if (view2 == null) {
                        kotlin.jvm.internal.f0.S("vg_hcash");
                    } else {
                        view = view2;
                    }
                    view.performClick();
                    HBWalletActivity.this.f73863x2 = 0;
                    return;
                }
                if (HBWalletActivity.this.f73863x2 == 2) {
                    View view3 = HBWalletActivity.this.S;
                    if (view3 == null) {
                        kotlin.jvm.internal.f0.S("vg_profit");
                    } else {
                        view = view3;
                    }
                    view.performClick();
                    HBWalletActivity.this.f73863x2 = 0;
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.bB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WalletInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f73869c;

        c(Dialog dialog) {
            this.f73869c = dialog;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.cB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HBWalletActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.dB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HBWalletActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f("兑换成功");
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                this.f73869c.dismiss();
                HBWalletActivity.T2(HBWalletActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.eB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class d implements h1.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbwallet.h1.a
        public void a(@dl.e View view, @dl.d MallCouponObj data) {
            if (PatchProxy.proxy(new Object[]{view, data}, this, changeQuickRedirect, false, bb.c.k.fB, new Class[]{View.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(data, "data");
            HBWalletActivity hBWalletActivity = HBWalletActivity.this;
            pb.j jVarL = ob.a.l();
            Activity activity = ((BaseActivity) HBWalletActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s-30656062(...)");
            String coupon_id = data.getCoupon_id();
            kotlin.jvm.internal.f0.o(coupon_id, "getCoupon_id(...)");
            String game_name = data.getGame_name();
            kotlin.jvm.internal.f0.o(game_name, "getGame_name(...)");
            hBWalletActivity.startActivityForResult(jVarL.i(activity, coupon_id, game_name), HBWalletActivity.this.n3());
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class e extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.g, pg.c
        public void i(@dl.d ng.f footer, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {footer, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.nB, new Class[]{ng.f.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(footer, "footer");
            ConsecutiveScrollerLayout consecutiveScrollerLayout = HBWalletActivity.this.Z;
            if (consecutiveScrollerLayout == null) {
                kotlin.jvm.internal.f0.S("mConsecutiveScrollerLayout");
                consecutiveScrollerLayout = null;
            }
            consecutiveScrollerLayout.setStickyOffset(i10);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f73873c;

        f(Dialog dialog) {
            this.f73873c = dialog;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.oB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HBWalletActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.pB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HBWalletActivity.this.isActive()) {
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f("兑换成功");
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                this.f73873c.dismiss();
                HBWalletActivity.T2(HBWalletActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.qB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class g implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            String strQ3;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.rB, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            HBWalletActivity hBWalletActivity = HBWalletActivity.this;
            if (i10 == 0) {
                strQ3 = hBWalletActivity.q3();
            } else if (i10 != 1) {
                strQ3 = i10 != 2 ? hBWalletActivity.q3() : hBWalletActivity.s3();
            } else {
                strQ3 = hBWalletActivity.r3();
            }
            hBWalletActivity.G3 = strQ3;
            HBWalletActivity.this.f73861p3 = 0;
            HBWalletActivity.C2(HBWalletActivity.this);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.sB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HBWalletActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.tB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HBWalletActivity.this.isActive()) {
                super.onNext(result);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c.f(HBWalletActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                HBWalletActivity.this.f73861p3 = 0;
                HBWalletActivity.C2(HBWalletActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.uB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class i implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f73876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f73877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f73878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ EditText f73879e;

        i(int i10, TextView textView, double d10, EditText editText) {
            this.f73876b = i10;
            this.f73877c = textView;
            this.f73878d = d10;
            this.f73879e = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.k.xB, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f73876b == 0 && editable != null) {
                EditText editText = this.f73879e;
                if (editable.length() > 1) {
                    if (StringsKt__StringsKt.g5(editable, "0", false, 2, null) && !StringsKt__StringsKt.g5(editable, "0.", false, 2, null)) {
                        editText.setText(editable.subSequence(1, editable.length()));
                        if (editable.length() == 2) {
                            editText.setSelection(1);
                        }
                    } else if (StringsKt__StringsKt.g5(editable, ".", false, 2, null)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('0');
                        sb2.append((Object) editable);
                        editText.setText(sb2.toString());
                    }
                }
            }
            this.f73877c.setEnabled(com.max.hbutils.utils.n.o(String.valueOf(editable)) <= this.f73878d);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.vB, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.wB, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: HBWalletActivity.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, bb.c.k.yB, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (HBWalletActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<KeyDescObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.zB, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (HBWalletActivity.this.isActive()) {
                String protocol = result.getResult().getProtocol();
                if (protocol != null) {
                    HBWalletActivity hBWalletActivity = HBWalletActivity.this;
                    pb.p pVarP = ob.a.p();
                    Activity activity = ((BaseActivity) hBWalletActivity).f66601b;
                    kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s-30656062(...)");
                    pVarP.c(activity, protocol);
                }
                HBWalletActivity.this.f73861p3 = 0;
                HBWalletActivity.C2(HBWalletActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.AB, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    private static final Drawable B3(HBWalletActivity hBWalletActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hBWalletActivity}, null, changeQuickRedirect, true, bb.c.k.fA, new Class[]{HBWalletActivity.class}, Drawable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Drawable) patchProxyResultProxy.result;
        }
        GradientDrawable gradientDrawableI = com.max.hbutils.utils.q.i(hBWalletActivity.f66601b, R.color.background_card_1_color, R.color.divider_secondary_1_color, 0.5f, 6.0f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, com.max.hbutils.utils.q.o(hBWalletActivity.f66601b, R.color.text_primary_1_color_alpha5, 6.0f));
        stateListDrawable.addState(new int[0], gradientDrawableI);
        return stateListDrawable;
    }

    public static final /* synthetic */ void C2(HBWalletActivity hBWalletActivity) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity}, null, changeQuickRedirect, true, bb.c.k.TA, new Class[]{HBWalletActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.gA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        pb.j jVarL = ob.a.l();
        Activity mContext = this$0.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        jVarL.e(mContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.hA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.iA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.jA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(HBWalletActivity this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.k.kA, new Class[]{HBWalletActivity.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        this$0.t3();
        if (this$0.f73865y2) {
            return;
        }
        this$0.f73861p3 = 0;
        this$0.k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(HBWalletActivity this$0, ng.j it) {
        if (PatchProxy.proxy(new Object[]{this$0, it}, null, changeQuickRedirect, true, bb.c.k.lA, new Class[]{HBWalletActivity.class, ng.j.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(it, "it");
        this$0.f73861p3 += 30;
        this$0.k3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.eA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        com.max.hbwallet.utils.d.b(this$0.f66601b, 0);
    }

    private final void L3(int i10, Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), dialog}, this, changeQuickRedirect, false, bb.c.k.Sz, new Class[]{Integer.TYPE, Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().x(i10, PaymentManager.A).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(dialog)));
    }

    private final void M3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Wz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<CustomTabEntity> arrayList = new ArrayList<>();
        arrayList.add(new TabEntity(com.max.xiaoheihe.module.game.d0.f87251w));
        arrayList.add(new TabEntity("优惠券"));
        arrayList.add(new TabEntity("兑换卡"));
        CommonTabLayout commonTabLayout = this.Y;
        CommonTabLayout commonTabLayout2 = null;
        if (commonTabLayout == null) {
            kotlin.jvm.internal.f0.S("tab_title");
            commonTabLayout = null;
        }
        commonTabLayout.setTabData(arrayList);
        CommonTabLayout commonTabLayout3 = this.Y;
        if (commonTabLayout3 == null) {
            kotlin.jvm.internal.f0.S("tab_title");
        } else {
            commonTabLayout2 = commonTabLayout3;
        }
        commonTabLayout2.setOnTabSelectListener(new g());
    }

    private final void N3(MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponObj}, this, changeQuickRedirect, false, bb.c.k.aA, new Class[]{MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().j(mallCouponObj.getCoupon_id()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private final void P3(String str, final yh.a<b2> aVar) {
        if (PatchProxy.proxy(new Object[]{str, aVar}, this, changeQuickRedirect, false, bb.c.k.Zz, new Class[]{String.class, yh.a.class}, Void.TYPE).isSupported || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y("是否确认使用").l(str).u(getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.t0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HBWalletActivity.Q3(aVar, dialogInterface, i10);
            }
        }).o(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.u0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HBWalletActivity.R3(dialogInterface, i10);
            }
        }).F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(yh.a action, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{action, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.LA, new Class[]{yh.a.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(action, "$action");
        action.invoke();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.MA, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    public static final /* synthetic */ void T2(HBWalletActivity hBWalletActivity) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity}, null, changeQuickRedirect, true, bb.c.k.SA, new Class[]{HBWalletActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(Dialog mDialog, View view) {
        if (PatchProxy.proxy(new Object[]{mDialog, view}, null, changeQuickRedirect, true, bb.c.k.pA, new Class[]{Dialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        mDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(HBWalletActivity this$0, Dialog mDialog, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, mDialog, view}, null, changeQuickRedirect, true, bb.c.k.mA, new Class[]{HBWalletActivity.class, Dialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        Activity activity = this$0.f66601b;
        activity.startActivity(MyHcashActivity.n2(activity));
        mDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.nA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.X3(1);
    }

    public static final /* synthetic */ void W2(HBWalletActivity hBWalletActivity, MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity, mallCouponObj}, null, changeQuickRedirect, true, bb.c.k.QA, new Class[]{HBWalletActivity.class, MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.N3(mallCouponObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.oA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        com.max.hbwallet.utils.d.b(this$0.f66601b, 0);
    }

    private final void X3(final int i10) {
        double dDoubleValue;
        WalletProfitObj profit;
        Double balance;
        WalletProfitObj profit2;
        Double balance2;
        WalletBalanceObj hbalance;
        Double balance_fee;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Qz, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.hbwallet_dialog_hcash_exchange, (ViewGroup) null, false);
        final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bg);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_close);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_desc_tag);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_exchange_tag);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_can_exchange);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_exchange_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_all_exchange);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_value);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.et_hcash);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_type_desc);
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_confirm);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView6 = (TextView) viewFindViewById2;
        if (i10 == 1) {
            int i11 = R.drawable.heybox_hcoin_24;
            imageView2.setImageResource(i11);
            imageView3.setImageResource(i11);
            textView2.setText("兑换H币");
            textView4.setText(this.f73864y1);
            WalletInfoObj walletInfoObj = this.G2;
            dDoubleValue = ((Double) ((walletInfoObj == null || (hbalance = walletInfoObj.getHbalance()) == null || (balance_fee = hbalance.getBalance_fee()) == null) ? 0 : Double.valueOf(balance_fee.doubleValue() / ((double) 100)))).doubleValue() * ((double) 1000);
            textView.setText(this.f73862x1 + "，可兑换" + dDoubleValue + "H币");
            editText.setHint("输入H币数值");
        } else {
            int i12 = R.drawable.heybox_hcash_24;
            imageView2.setImageResource(i12);
            imageView3.setImageResource(i12);
            textView2.setText("兑换余额");
            textView5.setText("收益");
            textView4.setText(this.f73862x1);
            WalletInfoObj walletInfoObj2 = this.G2;
            if (walletInfoObj2 != null && (profit2 = walletInfoObj2.getProfit()) != null && (balance2 = profit2.getBalance()) != null) {
                balance2.doubleValue();
            }
            WalletInfoObj walletInfoObj3 = this.G2;
            dDoubleValue = ((Double) ((walletInfoObj3 == null || (profit = walletInfoObj3.getProfit()) == null || (balance = profit.getBalance()) == null) ? 0 : Double.valueOf(balance.doubleValue() / ((double) 100)))).doubleValue();
            textView.setText(this.f73860p2 + "，可兑换" + dDoubleValue + "元 余额");
            editText.setInputType(8194);
            editText.setFilters(new com.max.hbwallet.utils.b[]{new com.max.hbwallet.utils.b()});
        }
        final double d10 = dDoubleValue;
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.max.hbwallet.a1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView7, int i13, KeyEvent keyEvent) {
                return HBWalletActivity.Y3(textView6, textView7, i13, keyEvent);
            }
        });
        editText.addTextChangedListener(new i(i10, textView6, d10, editText));
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.Z3(d10, editText, view);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.a4(this.f74276b, i10, editText, iVar, view);
            }
        });
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.max.hbwallet.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.f4(iVar, view);
            }
        };
        imageView.setOnClickListener(onClickListener);
        viewFindViewById.setOnClickListener(onClickListener);
        iVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y3(TextView tv_confirm, TextView textView, int i10, KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tv_confirm, textView, new Integer(i10), keyEvent}, null, changeQuickRedirect, true, bb.c.k.yA, new Class[]{TextView.class, TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        kotlin.jvm.internal.f0.p(tv_confirm, "$tv_confirm");
        if (i10 == 6) {
            tv_confirm.performClick();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(double d10, EditText editText, View view) {
        if (PatchProxy.proxy(new Object[]{new Double(d10), editText, view}, null, changeQuickRedirect, true, bb.c.k.zA, new Class[]{Double.TYPE, EditText.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        editText.setText(String.valueOf(d10));
        editText.setSelection(editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(final HBWalletActivity this$0, int i10, EditText editText, final com.max.hbcommon.component.i mDialog, View view) {
        double dO;
        String str;
        if (PatchProxy.proxy(new Object[]{this$0, new Integer(i10), editText, mDialog, view}, null, changeQuickRedirect, true, bb.c.k.EA, new Class[]{HBWalletActivity.class, Integer.TYPE, EditText.class, com.max.hbcommon.component.i.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this$0.f66601b);
        final Ref.IntRef intRef = new Ref.IntRef();
        if (i10 == 1) {
            double d10 = 10;
            dO = (com.max.hbutils.utils.n.o(editText.getText().toString()) / d10) * d10;
            intRef.f124889b = (int) (dO / d10);
            str = "H币";
        } else {
            dO = com.max.hbutils.utils.n.o(editText.getText().toString());
            intRef.f124889b = (int) (((double) 100) * dO);
            str = "元 余额";
        }
        if (intRef.f124889b <= 0) {
            com.max.hbutils.utils.c.f("无效的金额");
            return;
        }
        if (i10 == 1) {
            fVar.y("确认兑换 " + dO + ' ' + str).l("*兑换成功将无法退还\n*H币可用于商城购买抵扣等功能，请谨慎兑换").g(false).u(this$0.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.d0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    HBWalletActivity.b4(this.f74193b, intRef, mDialog, dialogInterface, i11);
                }
            }).o(this$0.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.e0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    HBWalletActivity.c4(dialogInterface, i11);
                }
            }).F().f().setTextColor(com.max.hbcommon.utils.l.a(R.color.delete_red));
            return;
        }
        fVar.y("确认兑换" + dO + ' ' + str).l("*兑换成功将无法退还\n*余额可用于商城游戏购买等功能，请谨慎兑换").g(false).u(this$0.getString(R.string.confirm), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.g0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                HBWalletActivity.d4(this.f74204b, intRef, mDialog, dialogInterface, i11);
            }
        }).o(this$0.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.h0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                HBWalletActivity.e4(dialogInterface, i11);
            }
        });
        fVar.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(HBWalletActivity this$0, Ref.IntRef amountfee, com.max.hbcommon.component.i mDialog, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, amountfee, mDialog, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.AA, new Class[]{HBWalletActivity.class, Ref.IntRef.class, com.max.hbcommon.component.i.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(amountfee, "$amountfee");
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        dialogInterface.dismiss();
        this$0.u3(amountfee.f124889b, mDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.BA, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(HBWalletActivity this$0, Ref.IntRef amountfee, com.max.hbcommon.component.i mDialog, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, amountfee, mDialog, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.CA, new Class[]{HBWalletActivity.class, Ref.IntRef.class, com.max.hbcommon.component.i.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(amountfee, "$amountfee");
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        dialogInterface.dismiss();
        this$0.L3(amountfee.f124889b, mDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.DA, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    public static final /* synthetic */ void f3(HBWalletActivity hBWalletActivity, String str, yh.a aVar) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity, str, aVar}, null, changeQuickRedirect, true, bb.c.k.PA, new Class[]{HBWalletActivity.class, String.class, yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.P3(str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(com.max.hbcommon.component.i mDialog, View view) {
        if (PatchProxy.proxy(new Object[]{mDialog, view}, null, changeQuickRedirect, true, bb.c.k.FA, new Class[]{com.max.hbcommon.component.i.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        if (mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }

    public static final /* synthetic */ void g3(HBWalletActivity hBWalletActivity) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity}, null, changeQuickRedirect, true, bb.c.k.NA, new Class[]{HBWalletActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.C1();
    }

    public static final /* synthetic */ void h3(HBWalletActivity hBWalletActivity) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity}, null, changeQuickRedirect, true, bb.c.k.OA, new Class[]{HBWalletActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.v4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.vA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        com.max.hbwallet.utils.d.b(this$0.f66601b, 1);
    }

    public static final /* synthetic */ void i3(HBWalletActivity hBWalletActivity, MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{hBWalletActivity, mallCouponObj}, null, changeQuickRedirect, true, bb.c.k.RA, new Class[]{HBWalletActivity.class, MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hBWalletActivity.w4(mallCouponObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.wA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        pb.p pVarP = ob.a.p();
        Activity mContext = this$0.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        String HCOIN_FULL_DEDUCTION_FAQ = lb.a.f131035r3;
        kotlin.jvm.internal.f0.o(HCOIN_FULL_DEDUCTION_FAQ, "HCOIN_FULL_DEDUCTION_FAQ");
        pVarP.a(mContext, "额度规则", HCOIN_FULL_DEDUCTION_FAQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(Dialog mDialog, View view) {
        if (PatchProxy.proxy(new Object[]{mDialog, view}, null, changeQuickRedirect, true, bb.c.k.xA, new Class[]{Dialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        mDialog.dismiss();
    }

    private final void k3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Iz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().y(this.G3, this.f73861p3, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l4(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.qA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.r4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m4(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.rA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.X3(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n4(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.sA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        Activity mContext = this$0.f66601b;
        ProfitWithdrawRecordActivity.a aVar = ProfitWithdrawRecordActivity.L;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        mContext.startActivity(aVar.a(mContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o4(HBWalletActivity this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.k.tA, new Class[]{HBWalletActivity.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        com.max.hbwallet.utils.d.b(this$0.f66601b, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p4(Dialog mDialog, View view) {
        if (PatchProxy.proxy(new Object[]{mDialog, view}, null, changeQuickRedirect, true, bb.c.k.uA, new Class[]{Dialog.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(mDialog, "$mDialog");
        mDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, null, changeQuickRedirect, true, bb.c.k.IA, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        PaymentManager.T(view, 1);
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.bA, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        ProgressDialog progressDialog = this.M3;
        if (progressDialog != null) {
            if (!((progressDialog == null || progressDialog.isShowing()) ? false : true)) {
                return;
            }
        }
        this.M3 = com.max.hbwallet.utils.d.c(this.f66601b, "", "", false);
    }

    private final void t3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Hz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().o().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, null, changeQuickRedirect, true, bb.c.k.JA, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        PaymentManager.T(view, 0);
    }

    private final void u3(int i10, Dialog dialog) {
        WalletBalanceObj hbalance;
        Double balance_fee;
        int iDoubleValue = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10), dialog}, this, changeQuickRedirect, false, bb.c.k.Rz, new Class[]{Integer.TYPE, Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        ce.a aVarA = ce.b.a();
        WalletInfoObj walletInfoObj = this.G2;
        if (walletInfoObj != null && (hbalance = walletInfoObj.getHbalance()) != null && (balance_fee = hbalance.getBalance_fee()) != null) {
            iDoubleValue = (int) balance_fee.doubleValue();
        }
        V((io.reactivex.disposables.b) aVarA.z(i10, "hcoin", iDoubleValue).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(dialog)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(ImageView imageView, HBWalletActivity this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{imageView, this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.KA, new Class[]{ImageView.class, HBWalletActivity.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        if (imageView.getVisibility() == 0) {
            this$0.x4();
        } else {
            Activity mContext = this$0.f66601b;
            AliWithdrawActivity.a aVar = AliWithdrawActivity.Y;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            mContext.startActivityForResult(aVar.a(mContext), this$0.L);
        }
        dialogInterface.dismiss();
    }

    private final void v4() {
        MallCouponListResultObj mallCouponListResultObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xz, new Class[0], Void.TYPE).isSupported || (mallCouponListResultObj = this.L3) == null) {
            return;
        }
        CommonTabLayout commonTabLayout = this.Y;
        CommonTabLayout commonTabLayout2 = null;
        if (commonTabLayout == null) {
            kotlin.jvm.internal.f0.S("tab_title");
            commonTabLayout = null;
        }
        TextView titleView = commonTabLayout.getTitleView(0);
        if (titleView != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("全部 ");
            String all = mallCouponListResultObj.getTotal().getAll();
            if (all == null) {
                all = "";
            }
            sb2.append(all);
            titleView.setText(sb2.toString());
        }
        CommonTabLayout commonTabLayout3 = this.Y;
        if (commonTabLayout3 == null) {
            kotlin.jvm.internal.f0.S("tab_title");
            commonTabLayout3 = null;
        }
        TextView titleView2 = commonTabLayout3.getTitleView(1);
        if (titleView2 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("优惠券 ");
            String coupon = mallCouponListResultObj.getTotal().getCoupon();
            if (coupon == null) {
                coupon = "";
            }
            sb3.append(coupon);
            titleView2.setText(sb3.toString());
        }
        CommonTabLayout commonTabLayout4 = this.Y;
        if (commonTabLayout4 == null) {
            kotlin.jvm.internal.f0.S("tab_title");
        } else {
            commonTabLayout2 = commonTabLayout4;
        }
        TextView titleView3 = commonTabLayout2.getTitleView(2);
        if (titleView3 == null) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("兑换卡 ");
        String redeem = mallCouponListResultObj.getTotal().getRedeem();
        sb4.append(redeem != null ? redeem : "");
        titleView3.setText(sb4.toString());
    }

    private final void w3() {
        ProgressDialog progressDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.cA, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing() || (progressDialog = this.M3) == null) {
            return;
        }
        progressDialog.dismiss();
    }

    private final void w4(MallCouponObj mallCouponObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponObj}, this, changeQuickRedirect, false, bb.c.k.Yz, new Class[]{MallCouponObj.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().q(mallCouponObj.getCoupon_id()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private final void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Tz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y("微信提现").l("请前往微信搜索【小黑盒APP】公众号进行提现").u("前往微信", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.r0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HBWalletActivity.y4(this.f74245b, dialogInterface, i10);
            }
        }).o("取消", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.s0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HBWalletActivity.z4(dialogInterface, i10);
            }
        }).g(true).F();
    }

    private final void y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Mz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        RecyclerView recyclerView = this.f73856a0;
        h1 h1Var = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        RecyclerView recyclerView2 = this.f73856a0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setPadding(0, ViewUtils.f(this.f66601b, 12.0f), 0, 0);
        RecyclerView recyclerView3 = this.f73856a0;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setClipToPadding(false);
        RecyclerView recyclerView4 = this.f73856a0;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipChildren(false);
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        h1 h1Var2 = new h1(mContext, this.J3);
        this.K3 = h1Var2;
        h1Var2.C(new d());
        h1 h1Var3 = this.K3;
        if (h1Var3 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
            h1Var3 = null;
        }
        h1Var3.B(new h1.a() { // from class: com.max.hbwallet.HBWalletActivity$initRv$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbwallet.h1.a
            public void a(@dl.e View view, @dl.d final MallCouponObj data) {
                if (PatchProxy.proxy(new Object[]{view, data}, this, changeQuickRedirect, false, bb.c.k.gB, new Class[]{View.class, MallCouponObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                kotlin.jvm.internal.f0.p(data, "data");
                if (kotlin.jvm.internal.f0.g("1", data.getState())) {
                    com.max.hbutils.utils.c.f("该兑换卡暂不可用");
                    return;
                }
                if (kotlin.jvm.internal.f0.g("0", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("4", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("9", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("8", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("10", data.getCoupon_type()) || kotlin.jvm.internal.f0.g("11", data.getCoupon_type())) {
                    pb.p pVarP = ob.a.p();
                    Activity activity = ((BaseActivity) this.f73880a).f66601b;
                    kotlin.jvm.internal.f0.o(activity, "access$getMContext$p$s-30656062(...)");
                    String protocol = data.getProtocol();
                    kotlin.jvm.internal.f0.o(protocol, "getProtocol(...)");
                    pVarP.c(activity, protocol);
                    return;
                }
                if (!kotlin.jvm.internal.f0.g("1", data.getCoupon_type()) && !kotlin.jvm.internal.f0.g("2", data.getCoupon_type()) && !kotlin.jvm.internal.f0.g("3", data.getCoupon_type())) {
                    HBWalletActivity hBWalletActivity = this.f73880a;
                    String name = data.getName();
                    kotlin.jvm.internal.f0.o(name, "getName(...)");
                    final HBWalletActivity hBWalletActivity2 = this.f73880a;
                    HBWalletActivity.f3(hBWalletActivity, name, new yh.a<b2>() { // from class: com.max.hbwallet.HBWalletActivity$initRv$2$onAction$3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.mB, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.lB, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            HBWalletActivity.i3(hBWalletActivity2, data);
                        }
                    });
                    return;
                }
                if (kotlin.jvm.internal.f0.g("0", data.getState())) {
                    HBWalletActivity hBWalletActivity3 = this.f73880a;
                    String name2 = data.getName();
                    kotlin.jvm.internal.f0.o(name2, "getName(...)");
                    final HBWalletActivity hBWalletActivity4 = this.f73880a;
                    HBWalletActivity.f3(hBWalletActivity3, name2, new yh.a<b2>() { // from class: com.max.hbwallet.HBWalletActivity$initRv$2$onAction$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.iB, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.hB, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            pb.e eVarD = ob.a.d();
                            HBWalletActivity hBWalletActivity5 = hBWalletActivity4;
                            String coupon_id = data.getCoupon_id();
                            kotlin.jvm.internal.f0.o(coupon_id, "getCoupon_id(...)");
                            eVarD.a(hBWalletActivity5, coupon_id);
                        }
                    });
                    return;
                }
                if (kotlin.jvm.internal.f0.g("2", data.getState())) {
                    HBWalletActivity hBWalletActivity5 = this.f73880a;
                    String name3 = data.getName();
                    kotlin.jvm.internal.f0.o(name3, "getName(...)");
                    final HBWalletActivity hBWalletActivity6 = this.f73880a;
                    HBWalletActivity.f3(hBWalletActivity5, name3, new yh.a<b2>() { // from class: com.max.hbwallet.HBWalletActivity$initRv$2$onAction$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.kB, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.jB, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            HBWalletActivity.W2(hBWalletActivity6, data);
                        }
                    });
                }
            }
        });
        RecyclerView recyclerView5 = this.f73856a0;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        h1 h1Var4 = this.K3;
        if (h1Var4 == null) {
            kotlin.jvm.internal.f0.S("mAdapter");
        } else {
            h1Var = h1Var4;
        }
        recyclerView5.setAdapter(h1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y4(HBWalletActivity this$0, DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.GA, new Class[]{HBWalletActivity.class, DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        try {
            this$0.setIntent(new Intent("android.intent.action.VIEW", Uri.parse("weixin://")));
            this$0.f66601b.startActivity(this$0.getIntent());
        } catch (Exception unused) {
        }
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(DialogInterface dialogInterface, int i10) {
        if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.HA, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        dialogInterface.dismiss();
    }

    public final void A3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Lz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.vg_hcash);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        this.Q = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.vg_hcoin);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        this.R = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.vg_profit);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "findViewById(...)");
        this.S = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tab_title);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "findViewById(...)");
        this.Y = (CommonTabLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.vg_empty);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "findViewById(...)");
        this.W = viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.vg_get_coupon);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "findViewById(...)");
        this.X = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.srl);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "findViewById(...)");
        this.f73857b0 = (SmartRefreshLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.csl);
        kotlin.jvm.internal.f0.o(viewFindViewById8, "findViewById(...)");
        this.Z = (ConsecutiveScrollerLayout) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.rv);
        kotlin.jvm.internal.f0.o(viewFindViewById9, "findViewById(...)");
        this.f73856a0 = (RecyclerView) viewFindViewById9;
        View view = this.Q;
        SmartRefreshLayout smartRefreshLayout = null;
        RecyclerView recyclerView = null;
        if (view == null) {
            kotlin.jvm.internal.f0.S("vg_hcash");
            view = null;
        }
        int i10 = R.id.tv_value;
        View viewFindViewById10 = view.findViewById(i10);
        kotlin.jvm.internal.f0.o(viewFindViewById10, "findViewById(...)");
        this.T = (TextView) viewFindViewById10;
        View view2 = this.R;
        if (view2 == null) {
            kotlin.jvm.internal.f0.S("vg_hcoin");
            view2 = null;
        }
        View viewFindViewById11 = view2.findViewById(i10);
        kotlin.jvm.internal.f0.o(viewFindViewById11, "findViewById(...)");
        this.U = (TextView) viewFindViewById11;
        View view3 = this.S;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("vg_profit");
            view3 = null;
        }
        View viewFindViewById12 = view3.findViewById(i10);
        kotlin.jvm.internal.f0.o(viewFindViewById12, "findViewById(...)");
        this.V = (TextView) viewFindViewById12;
        TextView textView = this.T;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_hcash");
            textView = null;
        }
        bb.d.d(textView, 4);
        TextView textView2 = this.U;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_hcoin");
            textView2 = null;
        }
        bb.d.d(textView2, 4);
        TextView textView3 = this.V;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_profit");
            textView3 = null;
        }
        bb.d.d(textView3, 4);
        View view4 = this.Q;
        if (view4 == null) {
            kotlin.jvm.internal.f0.S("vg_hcash");
            view4 = null;
        }
        view4.setBackground(B3(this));
        View view5 = this.R;
        if (view5 == null) {
            kotlin.jvm.internal.f0.S("vg_hcoin");
            view5 = null;
        }
        view5.setBackground(B3(this));
        View view6 = this.S;
        if (view6 == null) {
            kotlin.jvm.internal.f0.S("vg_profit");
            view6 = null;
        }
        view6.setBackground(B3(this));
        View view7 = this.X;
        if (view7 == null) {
            kotlin.jvm.internal.f0.S("vg_get_coupon");
            view7 = null;
        }
        view7.setBackgroundDrawable(com.max.hbutils.utils.q.o(this.f66601b, R.color.coupon_orange_alpha8, 4.0f));
        View view8 = this.X;
        if (view8 == null) {
            kotlin.jvm.internal.f0.S("vg_get_coupon");
            view8 = null;
        }
        view8.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                HBWalletActivity.C3(this.f74284b, view9);
            }
        });
        View view9 = this.Q;
        if (view9 == null) {
            kotlin.jvm.internal.f0.S("vg_hcash");
            view9 = null;
        }
        int i11 = R.id.tv_title;
        ((TextView) view9.findViewById(i11)).setText("我的余额");
        View view10 = this.R;
        if (view10 == null) {
            kotlin.jvm.internal.f0.S("vg_hcoin");
            view10 = null;
        }
        ((TextView) view10.findViewById(i11)).setText("我的H币");
        View view11 = this.S;
        if (view11 == null) {
            kotlin.jvm.internal.f0.S("vg_profit");
            view11 = null;
        }
        ((TextView) view11.findViewById(i11)).setText("我的收益");
        View view12 = this.Q;
        if (view12 == null) {
            kotlin.jvm.internal.f0.S("vg_hcash");
            view12 = null;
        }
        int i12 = R.id.iv_tag;
        ImageView imageView = (ImageView) view12.findViewById(i12);
        int i13 = R.drawable.heybox_hcash_24;
        imageView.setImageResource(i13);
        View view13 = this.R;
        if (view13 == null) {
            kotlin.jvm.internal.f0.S("vg_hcoin");
            view13 = null;
        }
        ((ImageView) view13.findViewById(i12)).setImageResource(R.drawable.heybox_hcoin_24);
        View view14 = this.S;
        if (view14 == null) {
            kotlin.jvm.internal.f0.S("vg_profit");
            view14 = null;
        }
        ((ImageView) view14.findViewById(i12)).setImageResource(i13);
        View view15 = this.Q;
        if (view15 == null) {
            kotlin.jvm.internal.f0.S("vg_hcash");
            view15 = null;
        }
        view15.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view16) {
                HBWalletActivity.D3(this.f74286b, view16);
            }
        });
        View view16 = this.R;
        if (view16 == null) {
            kotlin.jvm.internal.f0.S("vg_hcoin");
            view16 = null;
        }
        view16.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view17) {
                HBWalletActivity.F3(this.f74288b, view17);
            }
        });
        View view17 = this.S;
        if (view17 == null) {
            kotlin.jvm.internal.f0.S("vg_profit");
            view17 = null;
        }
        view17.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view18) {
                HBWalletActivity.G3(this.f74158b, view18);
            }
        });
        SmartRefreshLayout smartRefreshLayout2 = this.f73857b0;
        if (smartRefreshLayout2 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.S(new pg.d() { // from class: com.max.hbwallet.b0
            @Override // pg.d
            public final void k(ng.j jVar) {
                HBWalletActivity.H3(this.f74162b, jVar);
            }
        });
        SmartRefreshLayout smartRefreshLayout3 = this.f73857b0;
        if (smartRefreshLayout3 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.k0(new e());
        if (!this.f73865y2) {
            y3();
            M3();
            SmartRefreshLayout smartRefreshLayout4 = this.f73857b0;
            if (smartRefreshLayout4 == null) {
                kotlin.jvm.internal.f0.S("mRefreshLayout");
            } else {
                smartRefreshLayout = smartRefreshLayout4;
            }
            smartRefreshLayout.f0(new pg.b() { // from class: com.max.hbwallet.c0
                @Override // pg.b
                public final void f(ng.j jVar) {
                    HBWalletActivity.I3(this.f74167b, jVar);
                }
            });
            return;
        }
        View view18 = this.R;
        if (view18 == null) {
            kotlin.jvm.internal.f0.S("vg_hcoin");
            view18 = null;
        }
        view18.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout5 = this.f73857b0;
        if (smartRefreshLayout5 == null) {
            kotlin.jvm.internal.f0.S("mRefreshLayout");
            smartRefreshLayout5 = null;
        }
        smartRefreshLayout5.b0(false);
        CommonTabLayout commonTabLayout = this.Y;
        if (commonTabLayout == null) {
            kotlin.jvm.internal.f0.S("tab_title");
            commonTabLayout = null;
        }
        commonTabLayout.setVisibility(8);
        RecyclerView recyclerView2 = this.f73856a0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.f0.S("mRecyclerView");
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(8);
    }

    public final void O3(@dl.e WalletInfoObj walletInfoObj) {
        this.G2 = walletInfoObj;
    }

    public final void S3() {
        WalletBalanceObj hbalance;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Nz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String desc = null;
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.hbwallet_dialog_wallet_balance_detail, (ViewGroup) null, false);
        final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bg);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.View");
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_history);
        this.f73858c0 = (TextView) viewInflate.findViewById(R.id.tv_balance);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_tag);
        BaseBottomButton baseBottomButton = (BaseBottomButton) viewInflate.findViewById(R.id.bb_exchange);
        BaseBottomButton baseBottomButton2 = (BaseBottomButton) viewInflate.findViewById(R.id.bb_exchange_hcoin);
        BaseBottomButton baseBottomButton3 = (BaseBottomButton) viewInflate.findViewById(R.id.bb_charge);
        imageView.setImageResource(R.drawable.ic_wallect_hcash);
        imageView2.setImageResource(R.drawable.heybox_hcash_24);
        WalletInfoObj walletInfoObj = this.G2;
        if (walletInfoObj != null && (hbalance = walletInfoObj.getHbalance()) != null) {
            desc = hbalance.getDesc();
        }
        textView2.setText(desc);
        TextView textView3 = this.f73858c0;
        if (textView3 != null) {
            textView3.setText(this.f73862x1);
        }
        baseBottomButton3.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.U3(this.f74282b, iVar, view);
            }
        });
        WalletInfoObj walletInfoObj2 = this.G2;
        if (walletInfoObj2 != null ? kotlin.jvm.internal.f0.g(walletInfoObj2.getEnable_hbalance_to_hcoin(), Boolean.TRUE) : false) {
            baseBottomButton2.setVisibility(0);
            baseBottomButton2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HBWalletActivity.V3(this.f74285b, view);
                }
            });
        } else {
            baseBottomButton2.setVisibility(8);
        }
        baseBottomButton.setVisibility(8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.W3(this.f74287b, view);
            }
        });
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.T3(iVar, view);
            }
        });
        iVar.show();
    }

    public final void g4() {
        WalletHcoinObj hcoin;
        WalletHcoinObj hcoin2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Pz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.hbwallet_dialog_wallet_balance_detail, (ViewGroup) null, false);
        final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bg);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.View");
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_history);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_balance);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_tag);
        BaseBottomButton baseBottomButton = (BaseBottomButton) viewInflate.findViewById(R.id.bb_exchange);
        BaseBottomButton baseBottomButton2 = (BaseBottomButton) viewInflate.findViewById(R.id.bb_charge);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_hcoin_tips);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_value);
        imageView.setImageResource(R.drawable.ic_wallect_hcoin);
        imageView2.setImageResource(R.drawable.heybox_hcoin_24);
        WalletInfoObj walletInfoObj = this.G2;
        textView3.setText((walletInfoObj == null || (hcoin2 = walletInfoObj.getHcoin()) == null) ? null : hcoin2.getDesc());
        textView2.setText(this.f73864y1);
        WalletInfoObj walletInfoObj2 = this.G2;
        textView4.setText(String.valueOf((walletInfoObj2 == null || (hcoin = walletInfoObj2.getHcoin()) == null) ? null : hcoin.getFull_deduct_coin()));
        baseBottomButton.setVisibility(8);
        baseBottomButton2.setVisibility(8);
        WalletInfoObj walletInfoObj3 = this.G2;
        if (walletInfoObj3 != null ? kotlin.jvm.internal.f0.g(walletInfoObj3.getShow_full_deduct_limit(), Boolean.TRUE) : false) {
            viewFindViewById2.setVisibility(0);
        } else {
            viewFindViewById2.setVisibility(4);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.h4(this.f74255b, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.i4(this.f74201b, view);
            }
        });
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.j4(iVar, view);
            }
        });
        iVar.show();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Gz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.hbwallet_activity_hb_wallet);
        this.f73863x2 = getIntent().getIntExtra("exchange_type", 0);
        this.f73865y2 = getIntent().getBooleanExtra("is_mall_trade", false);
        this.f66616q.setTitle("我的钱包");
        this.f66616q.setAction("明细");
        this.f66616q.setActionOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.K3(this.f74280b, view);
            }
        });
        A3();
        E1();
        t3();
        if (!this.f73865y2) {
            k3();
        }
        ob.a.o().c(this);
    }

    public final void k4() {
        WalletProfitObj profit;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Oz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String desc = null;
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.hbwallet_dialog_wallet_balance_detail, (ViewGroup) null, false);
        final com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.vg_bg);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.View");
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_history);
        this.f73859p1 = (TextView) viewInflate.findViewById(R.id.tv_balance);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_tag);
        BaseBottomButton baseBottomButton = (BaseBottomButton) viewInflate.findViewById(R.id.bb_exchange);
        BaseBottomButton baseBottomButton2 = (BaseBottomButton) viewInflate.findViewById(R.id.bb_exchange_hcoin);
        BaseBottomButton baseBottomButton3 = (BaseBottomButton) viewInflate.findViewById(R.id.bb_charge);
        imageView.setImageResource(R.drawable.ic_wallect_profit);
        imageView2.setImageResource(R.drawable.heybox_hcash_24);
        WalletInfoObj walletInfoObj = this.G2;
        if (walletInfoObj != null && (profit = walletInfoObj.getProfit()) != null) {
            desc = profit.getDesc();
        }
        textView2.setText(desc);
        TextView textView3 = this.f73859p1;
        if (textView3 != null) {
            textView3.setText(this.f73860p2);
        }
        baseBottomButton3.setText("提现");
        baseBottomButton3.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.l4(this.f74232b, view);
            }
        });
        baseBottomButton.setText("兑换余额");
        baseBottomButton.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.m4(this.f74234b, view);
            }
        });
        baseBottomButton2.setVisibility(0);
        baseBottomButton2.setText("提现记录");
        baseBottomButton2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.n4(this.f74236b, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.o4(this.f74240b, view);
            }
        });
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.p4(iVar, view);
            }
        });
        iVar.show();
    }

    @dl.e
    public final WalletInfoObj l3() {
        return this.G2;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Jz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        t3();
        if (this.f73865y2) {
            return;
        }
        this.f73861p3 = 0;
        k3();
    }

    public final int n3() {
        return this.M;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.Uz, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (this.L == i10) {
            if (i11 == -1) {
                t3();
            }
        } else if (this.M == i10 && i11 == -1) {
            this.f73861p3 = 0;
            k3();
        }
    }

    public final int p3() {
        return this.L;
    }

    @dl.d
    public final String q3() {
        return this.N;
    }

    public final void q4() {
        WalletHcoinObj hcoin;
        WalletProfitObj profit;
        Double balance;
        WalletHcoinObj hcoin2;
        WalletBalanceObj hbalance;
        Double balance_fee;
        Number numberValueOf = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Kz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        WalletInfoObj walletInfoObj = this.G2;
        String strN = com.max.hbutils.utils.n.n((walletInfoObj == null || (hbalance = walletInfoObj.getHbalance()) == null || (balance_fee = hbalance.getBalance_fee()) == null) ? numberValueOf : Float.valueOf((float) (balance_fee.doubleValue() / ((double) 100))));
        kotlin.jvm.internal.f0.o(strN, "numberToTwobitStr(...)");
        this.f73862x1 = strN;
        WalletInfoObj walletInfoObj2 = this.G2;
        TextView textView = null;
        this.f73864y1 = String.valueOf((walletInfoObj2 == null || (hcoin2 = walletInfoObj2.getHcoin()) == null) ? null : hcoin2.getCoin());
        WalletInfoObj walletInfoObj3 = this.G2;
        if (walletInfoObj3 != null && (profit = walletInfoObj3.getProfit()) != null && (balance = profit.getBalance()) != null) {
            numberValueOf = Float.valueOf((float) (balance.doubleValue() / ((double) 100)));
        }
        this.f73860p2 = com.max.hbutils.utils.n.n(numberValueOf);
        TextView textView2 = this.T;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_hcash");
            textView2 = null;
        }
        textView2.setText(this.f73862x1);
        TextView textView3 = this.U;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_hcoin");
            textView3 = null;
        }
        WalletInfoObj walletInfoObj4 = this.G2;
        textView3.setText(String.valueOf((walletInfoObj4 == null || (hcoin = walletInfoObj4.getHcoin()) == null) ? null : hcoin.getCoin()));
        TextView textView4 = this.V;
        if (textView4 == null) {
            kotlin.jvm.internal.f0.S("tv_profit");
        } else {
            textView = textView4;
        }
        textView.setText(this.f73860p2);
        TextView textView5 = this.f73858c0;
        if (textView5 != null) {
            textView5.setText(this.f73862x1);
        }
        TextView textView6 = this.f73859p1;
        if (textView6 == null) {
            return;
        }
        textView6.setText(this.f73860p2);
    }

    @dl.d
    public final String r3() {
        return this.P;
    }

    public final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Vz, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.hbwallet_dialog_choose_paytype, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_pay_ali);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_pay_weixin);
        final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_checkmark_weixin);
        PaymentManager.T(viewInflate, 0);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.s4(viewInflate, view);
            }
        });
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbwallet.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HBWalletActivity.t4(viewInflate, view);
            }
        });
        new com.max.hbcommon.view.a.f(this.f66601b).y("请选择提现方式").i(viewInflate).g(true).w(true).u("去提现", new DialogInterface.OnClickListener() { // from class: com.max.hbwallet.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                HBWalletActivity.u4(imageView, this, dialogInterface, i10);
            }
        }).d().show();
    }

    @dl.d
    public final String s3() {
        return this.O;
    }

    @Override // com.max.hbwallet.t
    public void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.dA, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f73861p3 = 0;
        k3();
    }
}
