package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MyHcashActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallOrderInfoObj;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.trade.TradeBatchBuyResult;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseParamObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.message.common.inter.ITagManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class TradeBatchRegisterActivity extends BaseActivity {

    @dl.d
    public static final a J3 = new a(null);
    public static final int K3 = 8;
    private static final int L3 = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int G2;

    @dl.e
    private LoadingDialog G3;
    private SmartRefreshLayout L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private EditText S;
    private View T;
    private View U;
    private View V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextView f92723a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextView f92724b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f92725c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private TradePurchaseParamObj f92726p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private double f92727p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private TradeSteamInventoryResult f92729x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.e
    private String f92730x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.e
    private String f92732y2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f92731y1 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @dl.d
    private BigDecimal f92728p3 = new BigDecimal("0.00");

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 44949, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) TradeBatchRegisterActivity.class);
            intent.putExtra("spu_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class a0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45007, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) TradeBatchRegisterActivity.this).f66601b.startActivity(MyHcashActivity.n2(((BaseActivity) TradeBatchRegisterActivity.this).f66601b));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeBatchBuyResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<TradeBatchBuyResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44950, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity tradeBatchRegisterActivity = TradeBatchRegisterActivity.this;
                TradeBatchBuyResult result2 = result.getResult();
                String buy_count = result2 != null ? result2.getBuy_count() : null;
                TradeBatchBuyResult result3 = result.getResult();
                TradeBatchRegisterActivity.A2(tradeBatchRegisterActivity, buy_count, result3 != null ? result3.getAborted_count() : null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44951, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeBatchBuyResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class b0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b0 f92735b = new b0();
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45008, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44952, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44953, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onNext(result);
                MallPayInfoObj result2 = result.getResult();
                double dO = com.max.hbutils.utils.n.o(result2 != null ? result2.getTotal_hbalance() : null) * ((double) 10);
                MallPayInfoObj result3 = result.getResult();
                if (dO >= com.max.hbutils.utils.n.o(result3 != null ? result3.getPay_price() : null)) {
                    TradeBatchRegisterActivity.T1(TradeBatchRegisterActivity.this);
                    return;
                }
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                MallPayInfoObj result4 = result.getResult();
                if (com.max.hbutils.utils.n.o(result4 != null ? result4.getProfit() : null) <= 0.0d) {
                    TradeBatchRegisterActivity.G2(TradeBatchRegisterActivity.this);
                    return;
                }
                TradeBatchRegisterActivity tradeBatchRegisterActivity = TradeBatchRegisterActivity.this;
                MallPayInfoObj result5 = result.getResult();
                String profit = result5 != null ? result5.getProfit() : null;
                f0.m(profit);
                TradeBatchRegisterActivity.E2(tradeBatchRegisterActivity, profit);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44954, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class c0 extends com.max.hbcommon.network.d<Result<MallOrderInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45009, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallOrderInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45010, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity.this.f92732y2 = result.getResult().getOrder_id();
                TradeBatchRegisterActivity.c2(TradeBatchRegisterActivity.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45011, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<TradePurchaseParamObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44955, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                SmartRefreshLayout smartRefreshLayout = TradeBatchRegisterActivity.this.L;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                TradeBatchRegisterActivity.D2(TradeBatchRegisterActivity.this);
            }
        }

        public void onNext(@dl.d Result<TradePurchaseParamObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44956, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity.C2(TradeBatchRegisterActivity.this);
                SmartRefreshLayout smartRefreshLayout = TradeBatchRegisterActivity.this.L;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                TradeBatchRegisterActivity.this.f92726p1 = result.getResult();
                TradeBatchRegisterActivity.m2(TradeBatchRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44957, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradePurchaseParamObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44958, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44959, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity.j2(TradeBatchRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44960, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class f implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44970, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeBatchRegisterActivity.O1(TradeBatchRegisterActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44971, new Class[]{View.class}, Void.TYPE).isSupported && TradeBatchRegisterActivity.this.f92731y1 > 0) {
                TradeBatchRegisterActivity.this.f92731y1--;
                TextView textView = TradeBatchRegisterActivity.this.Q;
                if (textView == null) {
                    f0.S("et_count");
                    textView = null;
                }
                textView.setText(String.valueOf(TradeBatchRegisterActivity.this.f92731y1));
            }
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44972, new Class[]{View.class}, Void.TYPE).isSupported && TradeBatchRegisterActivity.this.f92731y1 < 100) {
                TradeBatchRegisterActivity.this.f92731y1++;
                TextView textView = TradeBatchRegisterActivity.this.Q;
                if (textView == null) {
                    f0.S("et_count");
                    textView = null;
                }
                textView.setText(String.valueOf(TradeBatchRegisterActivity.this.f92731y1));
            }
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class i implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 44975, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            EditText editText = null;
            if (s10.length() > 0) {
                EditText editText2 = TradeBatchRegisterActivity.this.S;
                if (editText2 == null) {
                    f0.S("et_price");
                    editText2 = null;
                }
                bb.d.d(editText2, 5);
            } else {
                EditText editText3 = TradeBatchRegisterActivity.this.S;
                if (editText3 == null) {
                    f0.S("et_price");
                    editText3 = null;
                }
                editText3.setTypeface(Typeface.defaultFromStyle(0));
            }
            TradeBatchRegisterActivity.this.f92727p2 = com.max.hbutils.utils.n.o(s10.toString());
            double dO = com.max.hbutils.utils.n.o(s10.toString());
            TradePurchaseParamObj tradePurchaseParamObj = TradeBatchRegisterActivity.this.f92726p1;
            if (dO >= com.max.hbutils.utils.n.o(tradePurchaseParamObj != null ? tradePurchaseParamObj.getLow_sale_price() : null)) {
                TextView textView = TradeBatchRegisterActivity.this.f92724b0;
                if (textView == null) {
                    f0.S("tv_input_tips");
                    textView = null;
                }
                textView.setVisibility(8);
                EditText editText4 = TradeBatchRegisterActivity.this.S;
                if (editText4 == null) {
                    f0.S("et_price");
                } else {
                    editText = editText4;
                }
                editText.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                TradeBatchRegisterActivity.k2(TradeBatchRegisterActivity.this);
                return;
            }
            TextView textView2 = TradeBatchRegisterActivity.this.f92724b0;
            if (textView2 == null) {
                f0.S("tv_input_tips");
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = TradeBatchRegisterActivity.this.f92724b0;
            if (textView3 == null) {
                f0.S("tv_input_tips");
                textView3 = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("请输入不小于 ");
            TradePurchaseParamObj tradePurchaseParamObj2 = TradeBatchRegisterActivity.this.f92726p1;
            sb2.append(tradePurchaseParamObj2 != null ? tradePurchaseParamObj2.getLow_sale_price() : null);
            sb2.append(" 的金额");
            textView3.setText(sb2.toString());
            EditText editText5 = TradeBatchRegisterActivity.this.S;
            if (editText5 == null) {
                f0.S("et_price");
            } else {
                editText = editText5;
            }
            editText.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.badge_bg_color));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44973, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44974, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 44978, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            TradeBatchRegisterActivity.this.f92731y1 = com.max.hbutils.utils.n.q(s10.toString());
            TradeBatchRegisterActivity.l2(TradeBatchRegisterActivity.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44976, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44977, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44979, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = TradeBatchRegisterActivity.this.Q;
            TextView textView2 = null;
            if (textView == null) {
                f0.S("et_count");
                textView = null;
            }
            TextView textView3 = TradeBatchRegisterActivity.this.Y;
            if (textView3 == null) {
                f0.S("tv_match_count");
            } else {
                textView2 = textView3;
            }
            textView.setText(textView2.getText().toString());
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Double total_hbalance;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44980, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (TradeBatchRegisterActivity.this.f92727p2 <= 0.0d && TradeBatchRegisterActivity.this.f92731y1 <= 0) {
                TradeBatchRegisterActivity.z2(TradeBatchRegisterActivity.this, "请输入求购单价和数量");
                return;
            }
            if (TradeBatchRegisterActivity.this.f92727p2 <= 0.0d) {
                TradeBatchRegisterActivity.z2(TradeBatchRegisterActivity.this, "请输入求购单价");
                return;
            }
            if (TradeBatchRegisterActivity.this.f92731y1 <= 0) {
                TradeBatchRegisterActivity.z2(TradeBatchRegisterActivity.this, "请输入求购数量");
                return;
            }
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(TradeBatchRegisterActivity.this.f92727p2));
            TradePurchaseParamObj tradePurchaseParamObj = TradeBatchRegisterActivity.this.f92726p1;
            if (bigDecimal.compareTo(new BigDecimal(tradePurchaseParamObj != null ? tradePurchaseParamObj.getLow_sale_price() : null)) < 0) {
                TradeBatchRegisterActivity tradeBatchRegisterActivity = TradeBatchRegisterActivity.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("请输入不小于 ");
                TradePurchaseParamObj tradePurchaseParamObj2 = TradeBatchRegisterActivity.this.f92726p1;
                sb2.append(tradePurchaseParamObj2 != null ? tradePurchaseParamObj2.getLow_sale_price() : null);
                sb2.append(" 的金额");
                TradeBatchRegisterActivity.z2(tradeBatchRegisterActivity, sb2.toString());
                return;
            }
            TextView textView = TradeBatchRegisterActivity.this.Y;
            if (textView == null) {
                f0.S("tv_match_count");
                textView = null;
            }
            if (Integer.parseInt(textView.getText().toString()) < TradeBatchRegisterActivity.this.f92731y1) {
                TradeBatchRegisterActivity.z2(TradeBatchRegisterActivity.this, "超出可购买数量");
                return;
            }
            TradePurchaseParamObj tradePurchaseParamObj3 = TradeBatchRegisterActivity.this.f92726p1;
            if (new BigDecimal((tradePurchaseParamObj3 == null || (total_hbalance = tradePurchaseParamObj3.getTotal_hbalance()) == null) ? 0.0d : total_hbalance.doubleValue()).compareTo(new BigDecimal(String.valueOf(TradeBatchRegisterActivity.this.f92727p2)).multiply(new BigDecimal(TradeBatchRegisterActivity.this.f92731y1)).multiply(new BigDecimal(100))) >= 0) {
                TradeBatchRegisterActivity.this.k3();
                return;
            }
            TradePurchaseParamObj tradePurchaseParamObj4 = TradeBatchRegisterActivity.this.f92726p1;
            Double total_profit = tradePurchaseParamObj4 != null ? tradePurchaseParamObj4.getTotal_profit() : null;
            f0.m(total_profit);
            if (total_profit.doubleValue() <= 0.0d) {
                TradeBatchRegisterActivity.G2(TradeBatchRegisterActivity.this);
                return;
            }
            TradeBatchRegisterActivity tradeBatchRegisterActivity2 = TradeBatchRegisterActivity.this;
            TradePurchaseParamObj tradePurchaseParamObj5 = tradeBatchRegisterActivity2.f92726p1;
            Double total_profit2 = tradePurchaseParamObj5 != null ? tradePurchaseParamObj5.getTotal_profit() : null;
            f0.m(total_profit2);
            String strN = com.max.hbutils.utils.n.n(Double.valueOf(total_profit2.doubleValue() / ((double) 100)));
            f0.o(strN, "numberToTwobitStr(\n     …                        )");
            TradeBatchRegisterActivity.E2(tradeBatchRegisterActivity2, strN);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44981, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradeBatchRegisterActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.M3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) TradeBatchRegisterActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<TradeOfferStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f92754c;

        n(int i10) {
            this.f92754c = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44982, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TradeOfferStateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44983, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeOfferStateObj result2 = result.getResult();
                String state = result2 != null ? result2.getState() : null;
                if (state != null) {
                    int iHashCode = state.hashCode();
                    if (iHashCode == -1281977283) {
                        if (state.equals(z5.f.f141859j)) {
                            LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                            if (loadingDialog != null) {
                                loadingDialog.c();
                            }
                            TradeOfferStateObj result3 = result.getResult();
                            com.max.hbutils.utils.c.f(result3 != null ? result3.getState_desc() : null);
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 3548) {
                        if (state.equals(ITagManager.SUCCESS)) {
                            TradeBatchRegisterActivity.o2(TradeBatchRegisterActivity.this);
                        }
                    } else if (iHashCode == 1116313165 && state.equals("waiting")) {
                        int i10 = this.f92754c;
                        if (i10 < 9) {
                            TradeBatchRegisterActivity.h2(TradeBatchRegisterActivity.this, i10 + 1);
                            return;
                        }
                        LoadingDialog loadingDialog2 = TradeBatchRegisterActivity.this.G3;
                        if (loadingDialog2 != null) {
                            loadingDialog2.c();
                        }
                        TradeBatchRegisterActivity.B2(TradeBatchRegisterActivity.this);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44984, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeOfferStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class o extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44985, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44986, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity.h2(TradeBatchRegisterActivity.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44987, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class p extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44988, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44989, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onNext(result);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                TradeBatchRegisterActivity.M1(TradeBatchRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44990, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class q extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44991, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                TradeBatchRegisterActivity.n2(TradeBatchRegisterActivity.this, false);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            ArrayList<TradeSteamInventoryObj> list;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44992, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity.this.f92729x1 = result.getResult();
                TradeBatchRegisterActivity.n2(TradeBatchRegisterActivity.this, false);
                TradeSteamInventoryResult result2 = result.getResult();
                TextView textView = null;
                numValueOf = null;
                Integer numValueOf = null;
                if ((result2 != null ? result2.getList() : null) != null) {
                    TextView textView2 = TradeBatchRegisterActivity.this.Y;
                    if (textView2 == null) {
                        f0.S("tv_match_count");
                        textView2 = null;
                    }
                    TradeSteamInventoryResult result3 = result.getResult();
                    if (result3 != null && (list = result3.getList()) != null) {
                        numValueOf = Integer.valueOf(list.size());
                    }
                    textView2.setText(String.valueOf(numValueOf));
                } else {
                    TextView textView3 = TradeBatchRegisterActivity.this.Y;
                    if (textView3 == null) {
                        f0.S("tv_match_count");
                    } else {
                        textView = textView3;
                    }
                    textView.setText("0");
                }
                TradeBatchRegisterActivity.l2(TradeBatchRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44993, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class r extends com.max.hbcommon.network.d<Result<MallOrderInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44994, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeBatchRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradeBatchRegisterActivity.this.G3;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallOrderInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44995, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeBatchRegisterActivity.this.isActive()) {
                TradeBatchRegisterActivity tradeBatchRegisterActivity = TradeBatchRegisterActivity.this;
                MallOrderInfoObj result2 = result.getResult();
                f0.m(result2);
                tradeBatchRegisterActivity.f92730x2 = result2.getOrder_id();
                TradeBatchRegisterActivity.N1(TradeBatchRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44996, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class s implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44997, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            Activity activity = ((BaseActivity) TradeBatchRegisterActivity.this).f66601b;
            TradeOrderActivity.a aVar = TradeOrderActivity.Q;
            Activity mContext = ((BaseActivity) TradeBatchRegisterActivity.this).f66601b;
            f0.o(mContext, "mContext");
            activity.startActivity(aVar.a(mContext, 0));
            TradeBatchRegisterActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class t implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44998, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeBatchRegisterActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class u implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f92762b = new u();
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44999, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class v implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45002, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeBatchRegisterActivity.H2(TradeBatchRegisterActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class w implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final w f92764b = new w();
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45003, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class x implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) TradeBatchRegisterActivity.this).f66601b.startActivity(MyHcashActivity.n2(((BaseActivity) TradeBatchRegisterActivity.this).f66601b));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class y implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final y f92766b = new y();
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45005, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeBatchRegisterActivity.kt */
    public static final class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<com.max.hbcommon.view.a> f92768c;

        z(Ref.ObjectRef<com.max.hbcommon.view.a> objectRef) {
            this.f92768c = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45006, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) TradeBatchRegisterActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.e0(mContext, 2).A();
            this.f92768c.f124891b.dismiss();
        }
    }

    public static final /* synthetic */ void A2(TradeBatchRegisterActivity tradeBatchRegisterActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity, str, str2}, null, changeQuickRedirect, true, 44945, new Class[]{TradeBatchRegisterActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.l3(str, str2);
    }

    public static final /* synthetic */ void B2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44940, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.n3();
    }

    public static final /* synthetic */ void C2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44935, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.x1();
    }

    public static final /* synthetic */ void D2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44934, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.C1();
    }

    public static final /* synthetic */ void E2(TradeBatchRegisterActivity tradeBatchRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity, str}, null, changeQuickRedirect, true, 44931, new Class[]{TradeBatchRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.p3(str);
    }

    public static final /* synthetic */ void G2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44932, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.q3();
    }

    public static final /* synthetic */ void H2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44946, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.r3();
    }

    private final void I2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44920, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().y4(this.f92730x2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44915, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o9(this.f92730x2, String.valueOf(this.G2)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void K2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44899, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.srl);
        f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.L = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_lowest_price_symbol);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_lowest_price_symbol)");
        this.M = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_lowest_price);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_lowest_price)");
        this.N = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_highest_price_symbol);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_highest_price_symbol)");
        this.O = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_highest_price);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_highest_price)");
        this.P = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.et_count);
        f0.o(viewFindViewById6, "findViewById(R.id.et_count)");
        this.Q = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_desc)");
        this.X = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tv_action);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_action)");
        this.W = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.tv_suggest_price);
        f0.o(viewFindViewById9, "findViewById(R.id.tv_suggest_price)");
        this.R = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.vg_item);
        f0.o(viewFindViewById10, "findViewById(R.id.vg_item)");
        this.T = viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.et_price);
        f0.o(viewFindViewById11, "findViewById(R.id.et_price)");
        this.S = (EditText) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.vg_minus);
        f0.o(viewFindViewById12, "findViewById(R.id.vg_minus)");
        this.U = viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.vg_plus);
        f0.o(viewFindViewById13, "findViewById(R.id.vg_plus)");
        this.V = viewFindViewById13;
        View viewFindViewById14 = findViewById(R.id.tv_match_count);
        f0.o(viewFindViewById14, "findViewById(R.id.tv_match_count)");
        this.Y = (TextView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.tv_buy_all);
        f0.o(viewFindViewById15, "findViewById(R.id.tv_buy_all)");
        this.Z = (TextView) viewFindViewById15;
        View viewFindViewById16 = findViewById(R.id.tv_refresh);
        f0.o(viewFindViewById16, "findViewById(R.id.tv_refresh)");
        this.f92723a0 = (TextView) viewFindViewById16;
        View viewFindViewById17 = findViewById(R.id.tv_input_tips);
        f0.o(viewFindViewById17, "findViewById(R.id.tv_input_tips)");
        this.f92724b0 = (TextView) viewFindViewById17;
    }

    private final void L2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44906, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f92725c0;
        if (str == null) {
            f0.S("spu_id");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.S(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static final /* synthetic */ void M1(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44944, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.I2();
    }

    public static final /* synthetic */ void N1(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44941, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.J2();
    }

    public static final /* synthetic */ void O1(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44927, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.L2();
    }

    private final void O2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44918, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Kb(this.f92730x2, "trade", PaymentManager.A, String.valueOf(this.G2), null, null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void P2(final int i10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44923, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 3) {
            j10 = 2;
        } else {
            j10 = i10 < 8 ? 4L : 8L;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f3(this.f92732y2).w1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<TradeOfferStateObj>>() { // from class: com.max.xiaoheihe.module.trade.TradeBatchRegisterActivity$getOfferState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44961, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f92742b.isActive()) {
                    LoadingDialog loadingDialog = this.f92742b.G3;
                    if (loadingDialog != null) {
                        loadingDialog.c();
                    }
                    Activity mContext = ((BaseActivity) this.f92742b).f66601b;
                    f0.o(mContext, "mContext");
                    final TradeBatchRegisterActivity tradeBatchRegisterActivity = this.f92742b;
                    TradeInfoUtilKt.q(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeBatchRegisterActivity$getOfferState$1$onError$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44965, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44964, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            Activity activity = ((BaseActivity) tradeBatchRegisterActivity).f66601b;
                            TradeOrderActivity.a aVar = TradeOrderActivity.Q;
                            Activity mContext2 = ((BaseActivity) tradeBatchRegisterActivity).f66601b;
                            f0.o(mContext2, "mContext");
                            activity.startActivity(aVar.a(mContext2, 0));
                            tradeBatchRegisterActivity.finish();
                        }
                    });
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<TradeOfferStateObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44962, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f92742b.isActive()) {
                    TradeOfferStateObj result2 = result.getResult();
                    String state = result2 != null ? result2.getState() : null;
                    if (state != null) {
                        int iHashCode = state.hashCode();
                        if (iHashCode == -1867169789) {
                            if (state.equals("success")) {
                                LoadingDialog loadingDialog = this.f92742b.G3;
                                if (loadingDialog != null) {
                                    loadingDialog.c();
                                }
                                TradeBatchRegisterActivity.p2(this.f92742b);
                                return;
                            }
                            return;
                        }
                        if (iHashCode == -1091295072) {
                            if (state.equals("overdue")) {
                                LoadingDialog loadingDialog2 = this.f92742b.G3;
                                if (loadingDialog2 != null) {
                                    loadingDialog2.c();
                                }
                                Activity mContext = ((BaseActivity) this.f92742b).f66601b;
                                f0.o(mContext, "mContext");
                                final TradeBatchRegisterActivity tradeBatchRegisterActivity = this.f92742b;
                                TradeInfoUtilKt.b0(mContext, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeBatchRegisterActivity$getOfferState$1$onNext$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44967, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44966, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        TradeBatchRegisterActivity tradeBatchRegisterActivity2 = tradeBatchRegisterActivity;
                                        tradeBatchRegisterActivity2.startActivityForResult(TradeUploadSteamActivity.P.a(((BaseActivity) tradeBatchRegisterActivity2).f66601b, tradeBatchRegisterActivity.f92730x2), 2);
                                    }
                                }, 14, null);
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 1116313165 && state.equals("waiting")) {
                            int i11 = i10;
                            if (i11 <= 12) {
                                TradeBatchRegisterActivity.c2(this.f92742b, i11 + 1);
                                return;
                            }
                            LoadingDialog loadingDialog3 = this.f92742b.G3;
                            if (loadingDialog3 != null) {
                                loadingDialog3.c();
                            }
                            Activity mContext2 = ((BaseActivity) this.f92742b).f66601b;
                            f0.o(mContext2, "mContext");
                            final TradeBatchRegisterActivity tradeBatchRegisterActivity2 = this.f92742b;
                            TradeInfoUtilKt.s(mContext2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeBatchRegisterActivity$getOfferState$1$onNext$2
                                public static ChangeQuickRedirect changeQuickRedirect;

                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ b2 invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44969, new Class[0], Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    invoke2();
                                    return b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44968, new Class[0], Void.TYPE).isSupported) {
                                        return;
                                    }
                                    Activity activity = ((BaseActivity) tradeBatchRegisterActivity2).f66601b;
                                    TradeOrderActivity.a aVar = TradeOrderActivity.Q;
                                    Activity mContext3 = ((BaseActivity) tradeBatchRegisterActivity2).f66601b;
                                    f0.o(mContext3, "mContext");
                                    activity.startActivity(aVar.a(mContext3, 0));
                                    tradeBatchRegisterActivity2.finish();
                                }
                            });
                        }
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44963, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<TradeOfferStateObj>) obj);
            }
        }));
    }

    private final String Q2() {
        ArrayList<TradeSteamInventoryObj> list;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44925, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        int i10 = this.f92731y1;
        for (int i11 = 0; i11 < i10; i11++) {
            TradeSteamInventoryResult tradeSteamInventoryResult = this.f92729x1;
            TradeSteamInventoryObj tradeSteamInventoryObj = (tradeSteamInventoryResult == null || (list = tradeSteamInventoryResult.getList()) == null) ? null : list.get(i11);
            f0.m(tradeSteamInventoryObj);
            jsonArray.add(tradeSteamInventoryObj.getSku_id());
        }
        jsonObject.add("skus", jsonArray);
        String string = jsonObject.toString();
        f0.o(string, "data.toString()");
        return string;
    }

    private final void S2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44901, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        TextView textView = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new f());
        TextView textView2 = this.M;
        if (textView2 == null) {
            f0.S("tv_lowest_price_symbol");
            textView2 = null;
        }
        bb.d.d(textView2, 5);
        TextView textView3 = this.N;
        if (textView3 == null) {
            f0.S("tv_lowest_price");
            textView3 = null;
        }
        bb.d.d(textView3, 5);
        TextView textView4 = this.O;
        if (textView4 == null) {
            f0.S("tv_highest_price_symbol");
            textView4 = null;
        }
        bb.d.d(textView4, 5);
        TextView textView5 = this.P;
        if (textView5 == null) {
            f0.S("tv_highest_price");
            textView5 = null;
        }
        bb.d.d(textView5, 5);
        TextView textView6 = this.Q;
        if (textView6 == null) {
            f0.S("et_count");
            textView6 = null;
        }
        bb.d.d(textView6, 5);
        TextView textView7 = this.Y;
        if (textView7 == null) {
            f0.S("tv_match_count");
            textView7 = null;
        }
        bb.d.d(textView7, 5);
        View view = this.U;
        if (view == null) {
            f0.S("vg_minus");
            view = null;
        }
        view.setOnClickListener(new g());
        View view2 = this.V;
        if (view2 == null) {
            f0.S("vg_plus");
            view2 = null;
        }
        view2.setOnClickListener(new h());
        EditText editText = this.S;
        if (editText == null) {
            f0.S("et_price");
            editText = null;
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(50000L)});
        TextView textView8 = this.Q;
        if (textView8 == null) {
            f0.S("et_count");
            textView8 = null;
        }
        textView8.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(100L)});
        EditText editText2 = this.S;
        if (editText2 == null) {
            f0.S("et_price");
            editText2 = null;
        }
        editText2.addTextChangedListener(new i());
        TextView textView9 = this.Q;
        if (textView9 == null) {
            f0.S("et_count");
            textView9 = null;
        }
        textView9.addTextChangedListener(new j());
        TextView textView10 = this.Z;
        if (textView10 == null) {
            f0.S("tv_buy_all");
            textView10 = null;
        }
        textView10.setOnClickListener(new k());
        TextView textView11 = this.W;
        if (textView11 == null) {
            f0.S("tv_action");
            textView11 = null;
        }
        textView11.setOnClickListener(new l());
        TextView textView12 = this.Q;
        if (textView12 == null) {
            f0.S("et_count");
        } else {
            textView = textView12;
        }
        textView.setText("0");
    }

    public static final /* synthetic */ void T1(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44942, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.O2();
    }

    private final void T2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44912, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().R8(Q2()).C1(2L, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n(i10)));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    private final void V2() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44911, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.G3;
        if (loadingDialog == null) {
            Activity mContext = this.f66601b;
            f0.o(mContext, "mContext");
            this.G3 = new LoadingDialog(mContext, "正在购买…", true).r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z10 = true;
            }
            if (z10) {
                Activity mContext2 = this.f66601b;
                f0.o(mContext2, "mContext");
                this.G3 = new LoadingDialog(mContext2, "正在购买…", true).r();
            }
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().v0(Q2()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o()));
    }

    private final void W2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44919, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o1(this.f92730x2, null, PaymentManager.A).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p()));
    }

    private final void X2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44903, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f3(true);
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.f92725c0;
        if (str == null) {
            f0.S("spu_id");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.B8(str, "1", String.valueOf(this.f92727p2)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q()));
    }

    private final void Y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44904, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.Y;
        TextView textView2 = null;
        if (textView == null) {
            f0.S("tv_match_count");
            textView = null;
        }
        if (Integer.parseInt(textView.getText().toString()) < this.f92731y1) {
            TextView textView3 = this.Q;
            if (textView3 == null) {
                f0.S("et_count");
            } else {
                textView2 = textView3;
            }
            textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.badge_bg_color));
            return;
        }
        TextView textView4 = this.Q;
        if (textView4 == null) {
            f0.S("et_count");
        } else {
            textView2 = textView4;
        }
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
    }

    private final void a3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44907, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e3();
        TextView textView = this.X;
        if (textView == null) {
            f0.S("tv_desc");
            textView = null;
        }
        TradePurchaseParamObj tradePurchaseParamObj = this.f92726p1;
        textView.setText(tradePurchaseParamObj != null ? tradePurchaseParamObj.getDescription() : null);
    }

    public static final /* synthetic */ void c2(TradeBatchRegisterActivity tradeBatchRegisterActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity, new Integer(i10)}, null, changeQuickRedirect, true, 44947, new Class[]{TradeBatchRegisterActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.P2(i10);
    }

    private final void e3() {
        TradeSteamInventoryObj asset;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44908, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.R;
        if (textView == null) {
            f0.S("tv_suggest_price");
            textView = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("参考价: ¥");
        TradePurchaseParamObj tradePurchaseParamObj = this.f92726p1;
        sb2.append((tradePurchaseParamObj == null || (asset = tradePurchaseParamObj.getAsset()) == null) ? null : asset.getQuick_price());
        textView.setText(sb2.toString());
        TextView textView2 = this.P;
        if (textView2 == null) {
            f0.S("tv_highest_price");
            textView2 = null;
        }
        TradePurchaseParamObj tradePurchaseParamObj2 = this.f92726p1;
        textView2.setText(tradePurchaseParamObj2 != null ? tradePurchaseParamObj2.getHigh_sale_price() : null);
        TextView textView3 = this.N;
        if (textView3 == null) {
            f0.S("tv_lowest_price");
            textView3 = null;
        }
        TradePurchaseParamObj tradePurchaseParamObj3 = this.f92726p1;
        textView3.setText(tradePurchaseParamObj3 != null ? tradePurchaseParamObj3.getLow_sale_price() : null);
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        View view = this.T;
        if (view == null) {
            f0.S("vg_item");
            view = null;
        }
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.activity_trade_batch_register, view);
        TradePurchaseParamObj tradePurchaseParamObj4 = this.f92726p1;
        TradeSteamInventoryObj asset2 = tradePurchaseParamObj4 != null ? tradePurchaseParamObj4.getAsset() : null;
        f0.m(asset2);
        TradeInfoUtilKt.B(mContext, eVar, asset2, false, 8, null);
    }

    private final void f3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44909, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (z10) {
            TextView textView2 = this.f92723a0;
            if (textView2 == null) {
                f0.S("tv_refresh");
                textView2 = null;
            }
            textView2.setText("[刷新中…]");
            TextView textView3 = this.f92723a0;
            if (textView3 == null) {
                f0.S("tv_refresh");
                textView3 = null;
            }
            textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            TextView textView4 = this.Z;
            if (textView4 == null) {
                f0.S("tv_buy_all");
                textView4 = null;
            }
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            TextView textView5 = this.f92723a0;
            if (textView5 == null) {
                f0.S("tv_refresh");
                textView5 = null;
            }
            textView5.setEnabled(false);
            TextView textView6 = this.Z;
            if (textView6 == null) {
                f0.S("tv_buy_all");
            } else {
                textView = textView6;
            }
            textView.setEnabled(false);
            return;
        }
        TextView textView7 = this.f92723a0;
        if (textView7 == null) {
            f0.S("tv_refresh");
            textView7 = null;
        }
        textView7.setText("[刷新]");
        TextView textView8 = this.f92723a0;
        if (textView8 == null) {
            f0.S("tv_refresh");
            textView8 = null;
        }
        textView8.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        TextView textView9 = this.Z;
        if (textView9 == null) {
            f0.S("tv_buy_all");
            textView9 = null;
        }
        textView9.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        TextView textView10 = this.f92723a0;
        if (textView10 == null) {
            f0.S("tv_refresh");
            textView10 = null;
        }
        textView10.setEnabled(true);
        TextView textView11 = this.Z;
        if (textView11 == null) {
            f0.S("tv_buy_all");
        } else {
            textView = textView11;
        }
        textView.setEnabled(true);
    }

    private final void g3() {
        String str;
        ArrayList<TradeSteamInventoryObj> list;
        ArrayList<TradeSteamInventoryObj> list2;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44914, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G2 = 0;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        int i11 = this.f92731y1;
        while (true) {
            str = null;
            tradeSteamInventoryObj = null;
            TradeSteamInventoryObj tradeSteamInventoryObj = null;
            if (i10 >= i11) {
                break;
            }
            TradeSteamInventoryResult tradeSteamInventoryResult = this.f92729x1;
            TradeSteamInventoryObj tradeSteamInventoryObj2 = (tradeSteamInventoryResult == null || (list2 = tradeSteamInventoryResult.getList()) == null) ? null : list2.get(i10);
            f0.m(tradeSteamInventoryObj2);
            jsonArray.add(tradeSteamInventoryObj2.getSku_id());
            int i12 = this.G2;
            TradeSteamInventoryResult tradeSteamInventoryResult2 = this.f92729x1;
            if (tradeSteamInventoryResult2 != null && (list = tradeSteamInventoryResult2.getList()) != null) {
                tradeSteamInventoryObj = list.get(i10);
            }
            f0.m(tradeSteamInventoryObj);
            this.G2 = i12 + ((int) (com.max.hbutils.utils.n.o(tradeSteamInventoryObj.getPrice()) * ((double) 1000)));
            i10++;
        }
        String str2 = this.f92725c0;
        if (str2 == null) {
            f0.S("spu_id");
        } else {
            str = str2;
        }
        jsonObject.addProperty("spu_id", str);
        jsonObject.addProperty(GameObj.KEY_POINT_PRICE, Integer.valueOf(this.G2));
        jsonObject.addProperty("count", Integer.valueOf(this.f92731y1));
        jsonObject.add("skus", jsonArray);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().H9(jsonObject.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r()));
    }

    public static final /* synthetic */ void h2(TradeBatchRegisterActivity tradeBatchRegisterActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity, new Integer(i10)}, null, changeQuickRedirect, true, 44938, new Class[]{TradeBatchRegisterActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.T2(i10);
    }

    private final void h3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44924, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(this.f66601b).y("报价发送成功");
        fVarY.u("前往查看", new s());
        fVarY.o(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new t());
        fVarY.F();
    }

    public static final /* synthetic */ void i2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44937, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.V2();
    }

    private final void i3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44902, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(str).u("确定", u.f92762b).g(true).F();
    }

    public static final /* synthetic */ void j2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44943, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.W2();
    }

    public static final /* synthetic */ void k2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44928, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.X2();
    }

    public static final /* synthetic */ void l2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44929, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.Y2();
    }

    private final void l3(String str, String str2) {
        String str3;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 44921, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        String str4 = "成功购买" + str + "件，等待发起报价";
        TextView textView = null;
        if (com.max.hbutils.utils.n.q(str2) > 0) {
            str3 = "失败: " + str2 + (char) 20214;
            textView = new TextView(this.f66601b);
            textView.setIncludeFontPadding(false);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            textView.setText("市场自发交易及网络波动均会导致购买失败，失败的对应金额将退回至钱包余额");
        } else {
            str3 = "";
        }
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(this.f66601b).y(str4).l(str3).u("发起报价", new v()).g(false).d();
        if (textView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.topMargin = ViewUtils.f(this.f66601b, 20.0f);
            marginLayoutParams.bottomMargin = ViewUtils.f(this.f66601b, 20.0f);
            textView.setLayoutParams(marginLayoutParams);
            aVarD.l(textView);
        }
        aVarD.show();
        aVarD.f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
    }

    public static final /* synthetic */ void m2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44936, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.a3();
    }

    public static final /* synthetic */ void n2(TradeBatchRegisterActivity tradeBatchRegisterActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44933, new Class[]{TradeBatchRegisterActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.f3(z10);
    }

    private final void n3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44913, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(this.f66601b).y("购买超时,请重试...");
        fVarY.u("我知道了", w.f92764b);
        fVarY.F();
    }

    public static final /* synthetic */ void o2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44939, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.g3();
    }

    public static final /* synthetic */ void p2(TradeBatchRegisterActivity tradeBatchRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity}, null, changeQuickRedirect, true, 44948, new Class[]{TradeBatchRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.h3();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.max.hbcommon.view.a] */
    private final void p3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44917, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.f66601b);
        LinearLayout linearLayout = new LinearLayout(this.f66601b);
        LinearLayout linearLayout2 = new LinearLayout(this.f66601b);
        linearLayout.setOrientation(1);
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = new LinearLayout(this.f66601b);
        linearLayout3.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout2.setGravity(17);
        linearLayout3.setGravity(17);
        TextView textView = new TextView(this.f66601b);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView.setText("我的收益");
        textView.setGravity(17);
        TextView textView2 = new TextView(this.f66601b);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView2.setText(str);
        textView2.setGravity(17);
        ImageView imageView = new ImageView(this.f66601b);
        imageView.setImageResource(R.drawable.heybox_hcash_24);
        imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.f66601b, 12.0f), ViewUtils.f(this.f66601b, 12.0f));
        layoutParams.leftMargin = ViewUtils.f(this.f66601b, 2.0f);
        layoutParams.rightMargin = ViewUtils.f(this.f66601b, 2.0f);
        linearLayout2.addView(textView);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(this.f66601b);
        textView3.setIncludeFontPadding(false);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        textView3.setText("可兑换" + str + "元余额");
        textView3.setGravity(17);
        TextView textView4 = new TextView(this.f66601b);
        textView4.setIncludeFontPadding(false);
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        textView4.setText("[去兑换]");
        textView4.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = ViewUtils.f(this.f66601b, 6.0f);
        linearLayout3.addView(textView3);
        linearLayout3.addView(textView4, layoutParams2);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);
        fVar.y("余额不足").i(linearLayout);
        fVar.u(this.f66601b.getString(R.string.go_recharge), new x()).o(this.f66601b.getString(R.string.cancel), y.f92766b);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = fVar.F();
        textView4.setOnClickListener(new z(objectRef));
        linearLayout.getLayoutParams().width = -1;
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(this.f66601b, 24.0f);
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = ViewUtils.f(this.f66601b, 34.0f);
    }

    private final void q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44916, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y("余额不足").l("请充值余额");
        fVarL.u(this.f66601b.getString(R.string.go_recharge), new a0()).o(this.f66601b.getString(R.string.cancel), b0.f92735b);
        fVarL.F();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    private final void r3() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.G3;
        if (loadingDialog == null) {
            Activity mContext = this.f66601b;
            f0.o(mContext, "mContext");
            this.G3 = new LoadingDialog(mContext, "正在发起报价…", true).r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z10 = true;
            }
            if (z10) {
                Activity mContext2 = this.f66601b;
                f0.o(mContext2, "mContext");
                this.G3 = new LoadingDialog(mContext2, "正在发起报价…", true).r();
            }
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V9(this.f92730x2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c0()));
    }

    public static final /* synthetic */ void z2(TradeBatchRegisterActivity tradeBatchRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeBatchRegisterActivity, str}, null, changeQuickRedirect, true, 44930, new Class[]{TradeBatchRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeBatchRegisterActivity.i3(str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44898, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_batch_register);
        String stringExtra = getIntent().getStringExtra("spu_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f92725c0 = stringExtra;
        this.f66616q.setTitle("批量购买");
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new m());
        K2();
        S2();
        E1();
    }

    public final void k3() {
        ArrayList<TradeSteamInventoryObj> list;
        Double total_hbalance;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradePurchaseParamObj tradePurchaseParamObj = this.f92726p1;
        String strN = com.max.hbutils.utils.n.n((tradePurchaseParamObj == null || (total_hbalance = tradePurchaseParamObj.getTotal_hbalance()) == null) ? 0 : Float.valueOf((float) (total_hbalance.doubleValue() / ((double) 100))));
        BigDecimal scale = new BigDecimal(this.f92727p2).multiply(new BigDecimal(this.f92731y1)).setScale(2, 4);
        f0.o(scale, "BigDecimal(mPrice).multi…BigDecimal.ROUND_HALF_UP)");
        this.f92728p3 = scale;
        this.f92728p3 = new BigDecimal(0);
        int i10 = this.f92731y1;
        for (int i11 = 0; i11 < i10; i11++) {
            BigDecimal bigDecimal = this.f92728p3;
            TradeSteamInventoryResult tradeSteamInventoryResult = this.f92729x1;
            TradeSteamInventoryObj tradeSteamInventoryObj = (tradeSteamInventoryResult == null || (list = tradeSteamInventoryResult.getList()) == null) ? null : list.get(i11);
            f0.m(tradeSteamInventoryObj);
            BigDecimal bigDecimalAdd = bigDecimal.add(new BigDecimal(tradeSteamInventoryObj.getPrice()));
            f0.o(bigDecimalAdd, "this.add(other)");
            this.f92728p3 = bigDecimalAdd;
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        String strValueOf = String.valueOf(this.f92731y1);
        String strValueOf2 = String.valueOf(this.f92727p2);
        String string = this.f92728p3.toString();
        f0.o(string, "mPriceTotal.toString()");
        TradeInfoUtilKt.P(mContext, "确认购买", "", "购买数量:", strValueOf, "购买最高价:", strValueOf2, "应付金额:", string, strN, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeBatchRegisterActivity$showBatchConfirmDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45001, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45000, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeBatchRegisterActivity.i2(this.f92760b);
            }
        });
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44905, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        L2();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44926, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == -1) {
            LoadingDialog loadingDialog = this.G3;
            if (loadingDialog == null) {
                Activity mContext = this.f66601b;
                f0.o(mContext, "mContext");
                this.G3 = new LoadingDialog(mContext, "正在发起报价…", true).r();
            } else {
                if ((loadingDialog == null || loadingDialog.i()) ? false : true) {
                    Activity mContext2 = this.f66601b;
                    f0.o(mContext2, "mContext");
                    this.G3 = new LoadingDialog(mContext2, "正在发起报价…", true).r();
                }
            }
            P2(0);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44900, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        L2();
    }
}
