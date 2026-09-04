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
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MyHcashActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallOrderInfoObj;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseParamObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.math.BigDecimal;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class TradePurchaseRegisterActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    public static final a f93214p2 = new a(null);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f93215x2 = 8;
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
    private View Y;
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private TradePurchaseParamObj f93216a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private double f93218c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f93219p1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private LoadingDialog f93221y1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f93217b0 = 1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private BigDecimal f93220x1 = new BigDecimal("0.00");

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 45845, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) TradePurchaseRegisterActivity.class);
            intent.putExtra("spu_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93223c;

        b(String str) {
            this.f93223c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45846, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradePurchaseRegisterActivity.this.f93221y1;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45847, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onNext(result);
                MallPayInfoObj result2 = result.getResult();
                double dO = com.max.hbutils.utils.n.o(result2 != null ? result2.getTotal_hbalance() : null) * ((double) 10);
                MallPayInfoObj result3 = result.getResult();
                if (dO >= com.max.hbutils.utils.n.o(result3 != null ? result3.getPay_price() : null)) {
                    TradePurchaseRegisterActivity.R1(TradePurchaseRegisterActivity.this, this.f93223c);
                    return;
                }
                LoadingDialog loadingDialog = TradePurchaseRegisterActivity.this.f93221y1;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                MallPayInfoObj result4 = result.getResult();
                if (com.max.hbutils.utils.n.o(result4 != null ? result4.getProfit() : null) <= 0.0d) {
                    TradePurchaseRegisterActivity.p2(TradePurchaseRegisterActivity.this);
                    return;
                }
                TradePurchaseRegisterActivity tradePurchaseRegisterActivity = TradePurchaseRegisterActivity.this;
                MallPayInfoObj result5 = result.getResult();
                String profit = result5 != null ? result5.getProfit() : null;
                f0.m(profit);
                TradePurchaseRegisterActivity.n2(tradePurchaseRegisterActivity, profit);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45848, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradePurchaseParamObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45849, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onError(e10);
                SmartRefreshLayout smartRefreshLayout = TradePurchaseRegisterActivity.this.L;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                TradePurchaseRegisterActivity.m2(TradePurchaseRegisterActivity.this);
            }
        }

        public void onNext(@dl.d Result<TradePurchaseParamObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45850, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradePurchaseRegisterActivity.this.L;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                TradePurchaseRegisterActivity.l2(TradePurchaseRegisterActivity.this);
                TradePurchaseRegisterActivity.this.f93216a0 = result.getResult();
                TradePurchaseRegisterActivity.e2(TradePurchaseRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45851, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradePurchaseParamObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93226c;

        d(String str) {
            this.f93226c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45852, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradePurchaseRegisterActivity.this.f93221y1;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45853, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                TradePurchaseRegisterActivity.b2(TradePurchaseRegisterActivity.this, this.f93226c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45854, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45855, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradePurchaseRegisterActivity.N1(TradePurchaseRegisterActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45856, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradePurchaseRegisterActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.L3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) TradePurchaseRegisterActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45857, new Class[]{View.class}, Void.TYPE).isSupported && TradePurchaseRegisterActivity.this.f93217b0 > 1) {
                TradePurchaseRegisterActivity.this.f93217b0--;
                TextView textView = TradePurchaseRegisterActivity.this.Q;
                if (textView == null) {
                    f0.S("et_count");
                    textView = null;
                }
                textView.setText(String.valueOf(TradePurchaseRegisterActivity.this.f93217b0));
                TradePurchaseRegisterActivity.f2(TradePurchaseRegisterActivity.this);
            }
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45858, new Class[]{View.class}, Void.TYPE).isSupported && TradePurchaseRegisterActivity.this.f93217b0 < 100) {
                TradePurchaseRegisterActivity.this.f93217b0++;
                TextView textView = TradePurchaseRegisterActivity.this.Q;
                if (textView == null) {
                    f0.S("et_count");
                    textView = null;
                }
                textView.setText(String.valueOf(TradePurchaseRegisterActivity.this.f93217b0));
                TradePurchaseRegisterActivity.f2(TradePurchaseRegisterActivity.this);
            }
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class i implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 45861, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            EditText editText = null;
            if (s10.length() > 0) {
                EditText editText2 = TradePurchaseRegisterActivity.this.S;
                if (editText2 == null) {
                    f0.S("et_price");
                } else {
                    editText = editText2;
                }
                bb.d.d(editText, 5);
            } else {
                EditText editText3 = TradePurchaseRegisterActivity.this.S;
                if (editText3 == null) {
                    f0.S("et_price");
                } else {
                    editText = editText3;
                }
                editText.setTypeface(Typeface.defaultFromStyle(0));
            }
            TradePurchaseRegisterActivity.this.f93218c0 = com.max.hbutils.utils.n.o(s10.toString());
            TradePurchaseRegisterActivity.f2(TradePurchaseRegisterActivity.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45859, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45860, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class j implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 45864, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            TradePurchaseRegisterActivity.this.f93217b0 = com.max.hbutils.utils.n.q(s10.toString());
            TradePurchaseRegisterActivity.f2(TradePurchaseRegisterActivity.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45862, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45863, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Double total_hbalance;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45865, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (TradePurchaseRegisterActivity.this.f93218c0 <= 0.0d && TradePurchaseRegisterActivity.this.f93217b0 <= 0) {
                TradePurchaseRegisterActivity.k2(TradePurchaseRegisterActivity.this, "请输入求购单价和数量");
                return;
            }
            if (TradePurchaseRegisterActivity.this.f93218c0 <= 0.0d) {
                TradePurchaseRegisterActivity.k2(TradePurchaseRegisterActivity.this, "请输入求购单价");
                return;
            }
            if (TradePurchaseRegisterActivity.this.f93217b0 <= 0) {
                TradePurchaseRegisterActivity.k2(TradePurchaseRegisterActivity.this, "请输入求购数量");
                return;
            }
            if (!TradePurchaseRegisterActivity.a2(TradePurchaseRegisterActivity.this)) {
                TradePurchaseRegisterActivity tradePurchaseRegisterActivity = TradePurchaseRegisterActivity.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("最小单位为");
                TradePurchaseParamObj tradePurchaseParamObj = TradePurchaseRegisterActivity.this.f93216a0;
                sb2.append(tradePurchaseParamObj != null ? tradePurchaseParamObj.getLowest_delta() : null);
                TradePurchaseRegisterActivity.k2(tradePurchaseRegisterActivity, sb2.toString());
                return;
            }
            TradePurchaseParamObj tradePurchaseParamObj2 = TradePurchaseRegisterActivity.this.f93216a0;
            if (new BigDecimal((tradePurchaseParamObj2 == null || (total_hbalance = tradePurchaseParamObj2.getTotal_hbalance()) == null) ? 0.0d : total_hbalance.doubleValue()).compareTo(new BigDecimal(String.valueOf(TradePurchaseRegisterActivity.this.f93218c0)).multiply(new BigDecimal(TradePurchaseRegisterActivity.this.f93217b0)).multiply(new BigDecimal(100))) >= 0) {
                TradePurchaseRegisterActivity.this.H2();
                return;
            }
            TradePurchaseParamObj tradePurchaseParamObj3 = TradePurchaseRegisterActivity.this.f93216a0;
            Double total_profit = tradePurchaseParamObj3 != null ? tradePurchaseParamObj3.getTotal_profit() : null;
            f0.m(total_profit);
            if (total_profit.doubleValue() <= 0.0d) {
                TradePurchaseRegisterActivity.p2(TradePurchaseRegisterActivity.this);
                return;
            }
            TradePurchaseRegisterActivity tradePurchaseRegisterActivity2 = TradePurchaseRegisterActivity.this;
            TradePurchaseParamObj tradePurchaseParamObj4 = tradePurchaseRegisterActivity2.f93216a0;
            Double total_profit2 = tradePurchaseParamObj4 != null ? tradePurchaseParamObj4.getTotal_profit() : null;
            f0.m(total_profit2);
            String strN = com.max.hbutils.utils.n.n(Double.valueOf(total_profit2.doubleValue() / ((double) 100)));
            f0.o(strN, "numberToTwobitStr(\n     …                        )");
            TradePurchaseRegisterActivity.n2(tradePurchaseRegisterActivity2, strN);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45866, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradePurchaseRegisterActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.K3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) TradePurchaseRegisterActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45867, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradePurchaseRegisterActivity.this.f93221y1;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45868, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onNext(result);
                LoadingDialog loadingDialog = TradePurchaseRegisterActivity.this.f93221y1;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                TradePurchaseRegisterActivity.o2(TradePurchaseRegisterActivity.this, result.getResult().getTitle(), result.getResult().getMsg());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45869, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class n extends com.max.hbcommon.network.d<Result<MallOrderInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45870, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradePurchaseRegisterActivity.this.f93221y1;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallOrderInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45871, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseRegisterActivity.this.isActive()) {
                TradePurchaseRegisterActivity tradePurchaseRegisterActivity = TradePurchaseRegisterActivity.this;
                MallOrderInfoObj result2 = result.getResult();
                f0.m(result2);
                String order_id = result2.getOrder_id();
                f0.o(order_id, "result.result!!.order_id");
                TradePurchaseRegisterActivity.M1(tradePurchaseRegisterActivity, order_id);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45872, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class o implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f93237b = new o();
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45873, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45874, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) TradePurchaseRegisterActivity.this).f66601b.startActivity(MyHcashActivity.n2(((BaseActivity) TradePurchaseRegisterActivity.this).f66601b));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class q implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f93239b = new q();
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45875, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<com.max.hbcommon.view.a> f93241c;

        r(Ref.ObjectRef<com.max.hbcommon.view.a> objectRef) {
            this.f93241c = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45876, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) TradePurchaseRegisterActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.e0(mContext, 2).A();
            this.f93241c.f124891b.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class s implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45879, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradePurchaseRegisterActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class t implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45880, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) TradePurchaseRegisterActivity.this).f66601b.startActivity(MyHcashActivity.n2(((BaseActivity) TradePurchaseRegisterActivity.this).f66601b));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseRegisterActivity.kt */
    public static final class u implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f93245b = new u();
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45881, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    private final void A2() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45824, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f93221y1;
        if (loadingDialog == null) {
            Activity mContext = this.f66601b;
            f0.o(mContext, "mContext");
            this.f93221y1 = new LoadingDialog(mContext, "", true).r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z10 = true;
            }
            if (z10) {
                Activity mContext2 = this.f66601b;
                f0.o(mContext2, "mContext");
                this.f93221y1 = new LoadingDialog(mContext2, "", true).r();
            }
        }
        this.f93219p1 = new BigDecimal(String.valueOf(this.f93218c0)).multiply(new BigDecimal(1000)).multiply(new BigDecimal(String.valueOf(this.f93217b0))).intValue();
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.Z;
        if (str == null) {
            f0.S("spu_id");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.qa(str, String.valueOf(new BigDecimal(String.valueOf(this.f93218c0)).multiply(new BigDecimal(1000)).intValue()), String.valueOf(this.f93217b0)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    private final void B2() {
        String lowest_limit;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45821, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C2();
        TextView textView = this.X;
        EditText editText = null;
        if (textView == null) {
            f0.S("tv_desc");
            textView = null;
        }
        TradePurchaseParamObj tradePurchaseParamObj = this.f93216a0;
        textView.setText(tradePurchaseParamObj != null ? tradePurchaseParamObj.getDescription() : null);
        TradePurchaseParamObj tradePurchaseParamObj2 = this.f93216a0;
        if (tradePurchaseParamObj2 == null || (lowest_limit = tradePurchaseParamObj2.getLowest_limit()) == null) {
            return;
        }
        EditText editText2 = this.S;
        if (editText2 == null) {
            f0.S("et_price");
        } else {
            editText = editText2;
        }
        editText.setHint("最低" + lowest_limit + (char) 20803);
    }

    private final void C2() {
        TradeSteamInventoryObj asset;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45822, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.R;
        if (textView == null) {
            f0.S("tv_suggest_price");
            textView = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("参考价: ¥");
        TradePurchaseParamObj tradePurchaseParamObj = this.f93216a0;
        sb2.append((tradePurchaseParamObj == null || (asset = tradePurchaseParamObj.getAsset()) == null) ? null : asset.getQuick_price());
        textView.setText(sb2.toString());
        TextView textView2 = this.P;
        if (textView2 == null) {
            f0.S("tv_highest_price");
            textView2 = null;
        }
        TradePurchaseParamObj tradePurchaseParamObj2 = this.f93216a0;
        textView2.setText(tradePurchaseParamObj2 != null ? tradePurchaseParamObj2.getHigh_purchase_price() : null);
        TextView textView3 = this.N;
        if (textView3 == null) {
            f0.S("tv_lowest_price");
            textView3 = null;
        }
        TradePurchaseParamObj tradePurchaseParamObj3 = this.f93216a0;
        textView3.setText(tradePurchaseParamObj3 != null ? tradePurchaseParamObj3.getLow_sale_price() : null);
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        View view = this.T;
        if (view == null) {
            f0.S("vg_item");
            view = null;
        }
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.activity_trade_want_to_buy_item, view);
        TradePurchaseParamObj tradePurchaseParamObj4 = this.f93216a0;
        TradeSteamInventoryObj asset2 = tradePurchaseParamObj4 != null ? tradePurchaseParamObj4.getAsset() : null;
        f0.m(asset2);
        TradeInfoUtilKt.B(mContext, eVar, asset2, false, 8, null);
    }

    private final void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45819, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = null;
        if (this.f93218c0 <= 0.0d || this.f93217b0 <= 0) {
            TextView textView2 = this.W;
            if (textView2 == null) {
                f0.S("tv_action");
            } else {
                textView = textView2;
            }
            textView.setText("支付");
            return;
        }
        BigDecimal scale = new BigDecimal(this.f93218c0).multiply(new BigDecimal(this.f93217b0)).setScale(2, 4);
        f0.o(scale, "BigDecimal(mPrice).multi…BigDecimal.ROUND_HALF_UP)");
        this.f93220x1 = scale;
        TextView textView3 = this.W;
        if (textView3 == null) {
            f0.S("tv_action");
        } else {
            textView = textView3;
        }
        textView.setText("支付");
    }

    private final void E2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45818, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(str).u("确定", o.f93237b).g(true).F();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.max.hbcommon.view.a] */
    private final void G2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45827, new Class[]{String.class}, Void.TYPE).isSupported) {
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
        fVar.u(this.f66601b.getString(R.string.go_recharge), new p()).o(this.f66601b.getString(R.string.cancel), q.f93239b);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = fVar.F();
        textView4.setOnClickListener(new r(objectRef));
        linearLayout.getLayoutParams().width = -1;
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(this.f66601b, 24.0f);
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = ViewUtils.f(this.f66601b, 34.0f);
    }

    private final void I2(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 45830, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null) {
            str = "求购发起成功";
        }
        if (str2 == null) {
            str2 = "";
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(str).l(str2).u("确定", new s()).g(false).F();
    }

    private final void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45826, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y("余额不足").l("请充值余额");
        fVarL.u(this.f66601b.getString(R.string.go_recharge), new t()).o(this.f66601b.getString(R.string.cancel), u.f93245b);
        fVarL.F();
    }

    public static final /* synthetic */ void M1(TradePurchaseRegisterActivity tradePurchaseRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity, str}, null, changeQuickRedirect, true, 45841, new Class[]{TradePurchaseRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.q2(str);
    }

    public static final /* synthetic */ void N1(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45831, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.u2();
    }

    public static final /* synthetic */ void R1(TradePurchaseRegisterActivity tradePurchaseRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity, str}, null, changeQuickRedirect, true, 45842, new Class[]{TradePurchaseRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.v2(str);
    }

    public static final /* synthetic */ boolean a2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45834, new Class[]{TradePurchaseRegisterActivity.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : tradePurchaseRegisterActivity.y2();
    }

    public static final /* synthetic */ void b2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity, str}, null, changeQuickRedirect, true, 45843, new Class[]{TradePurchaseRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.z2(str);
    }

    public static final /* synthetic */ void c2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45840, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.A2();
    }

    public static final /* synthetic */ void e2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45839, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.B2();
    }

    public static final /* synthetic */ void f2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45832, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.D2();
    }

    public static final /* synthetic */ void k2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity, str}, null, changeQuickRedirect, true, 45833, new Class[]{TradePurchaseRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.E2(str);
    }

    public static final /* synthetic */ void l2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45838, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.x1();
    }

    public static final /* synthetic */ void m2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45837, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.C1();
    }

    public static final /* synthetic */ void n2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity, str}, null, changeQuickRedirect, true, 45835, new Class[]{TradePurchaseRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.G2(str);
    }

    public static final /* synthetic */ void o2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity, str, str2}, null, changeQuickRedirect, true, 45844, new Class[]{TradePurchaseRegisterActivity.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.I2(str, str2);
    }

    public static final /* synthetic */ void p2(TradePurchaseRegisterActivity tradePurchaseRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseRegisterActivity}, null, changeQuickRedirect, true, 45836, new Class[]{TradePurchaseRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseRegisterActivity.J2();
    }

    private final void q2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45825, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o9(str, String.valueOf(this.f93219p1)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str)));
    }

    private final void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45814, new Class[0], Void.TYPE).isSupported) {
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
        View viewFindViewById14 = findViewById(R.id.vg_price_faq);
        f0.o(viewFindViewById14, "findViewById(R.id.vg_price_faq)");
        this.Y = viewFindViewById14;
    }

    private final void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45820, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.Z;
        if (str == null) {
            f0.S("spu_id");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.A3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void v2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45828, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Kb(str, "trade", PaymentManager.A, String.valueOf(this.f93219p1), null, null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(str)));
    }

    private final void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45816, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        TextView textView = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new e());
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
        View view = this.Y;
        if (view == null) {
            f0.S("vg_price_faq");
            view = null;
        }
        view.setOnClickListener(new f());
        View view2 = this.U;
        if (view2 == null) {
            f0.S("vg_minus");
            view2 = null;
        }
        view2.setOnClickListener(new g());
        View view3 = this.V;
        if (view3 == null) {
            f0.S("vg_plus");
            view3 = null;
        }
        view3.setOnClickListener(new h());
        EditText editText = this.S;
        if (editText == null) {
            f0.S("et_price");
            editText = null;
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(50000L)});
        TextView textView7 = this.Q;
        if (textView7 == null) {
            f0.S("et_count");
            textView7 = null;
        }
        textView7.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(100L)});
        EditText editText2 = this.S;
        if (editText2 == null) {
            f0.S("et_price");
            editText2 = null;
        }
        editText2.addTextChangedListener(new i());
        TextView textView8 = this.Q;
        if (textView8 == null) {
            f0.S("et_count");
            textView8 = null;
        }
        textView8.addTextChangedListener(new j());
        TextView textView9 = this.W;
        if (textView9 == null) {
            f0.S("tv_action");
        } else {
            textView = textView9;
        }
        textView.setOnClickListener(new k());
    }

    private final boolean y2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45817, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        TradePurchaseParamObj tradePurchaseParamObj = this.f93216a0;
        String lowest_delta = tradePurchaseParamObj != null ? tradePurchaseParamObj.getLowest_delta() : null;
        if (!(lowest_delta == null || lowest_delta.length() == 0)) {
            int iIntValue = new BigDecimal(String.valueOf(this.f93218c0)).multiply(new BigDecimal(100)).intValue();
            TradePurchaseParamObj tradePurchaseParamObj2 = this.f93216a0;
            if (iIntValue % new BigDecimal(tradePurchaseParamObj2 != null ? tradePurchaseParamObj2.getLowest_delta() : null).multiply(new BigDecimal(100)).intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    private final void z2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45829, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String strValueOf = String.valueOf(new BigDecimal(String.valueOf(this.f93218c0)).multiply(new BigDecimal(1000)).intValue());
        String strValueOf2 = String.valueOf(this.f93217b0);
        String str2 = this.Z;
        if (str2 == null) {
            f0.S("spu_id");
            str2 = null;
        }
        V((io.reactivex.disposables.b) eVarA.wb(str, PaymentManager.A, strValueOf, strValueOf2, str2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    public final void H2() {
        Double total_hbalance;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45823, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradePurchaseParamObj tradePurchaseParamObj = this.f93216a0;
        String strN = com.max.hbutils.utils.n.n((tradePurchaseParamObj == null || (total_hbalance = tradePurchaseParamObj.getTotal_hbalance()) == null) ? 0 : Float.valueOf((float) (total_hbalance.doubleValue() / ((double) 100))));
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        String strValueOf = String.valueOf(this.f93217b0);
        String strValueOf2 = String.valueOf(this.f93218c0);
        String string = this.f93220x1.toString();
        f0.o(string, "mPriceTotal.toString()");
        TradeInfoUtilKt.P(mContext, "确认求购", "", "求购数量:", strValueOf, "求购单价:", strValueOf2, "应付金额:", string, strN, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseRegisterActivity$showPutOnConfirmDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45878, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45877, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradePurchaseRegisterActivity.c2(this.f93243b);
            }
        });
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45813, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_want_to_buy_item);
        String stringExtra = getIntent().getStringExtra("spu_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.Z = stringExtra;
        this.f66616q.setTitle("求购");
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new l());
        r2();
        x2();
        E1();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45815, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        u2();
    }
}
