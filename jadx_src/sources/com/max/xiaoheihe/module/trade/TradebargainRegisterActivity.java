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
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.SwitchButton.SwitchButton;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.MyHcashActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.trade.BargainInfo;
import com.max.xiaoheihe.bean.trade.BargainTips;
import com.max.xiaoheihe.bean.trade.TradeBargainDetailObj;
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

/* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class TradebargainRegisterActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private SmartRefreshLayout L;
    private TextView M;
    private EditText N;
    private TextView O;
    private View P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private ViewGroup T;
    private ViewGroup U;
    private TextView V;
    private SwitchButton W;
    private String X;

    @dl.e
    private TradeBargainDetailObj Y;
    private double Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f93279a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private LoadingDialog f93280b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    public static final a f93276c0 = new a(null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f93277p1 = 8;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private static final String f93278x1 = "arg_bargain_setting";

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46056, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradebargainRegisterActivity.f93278x1;
        }

        @dl.d
        public final Intent b(@dl.d Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 46057, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) TradebargainRegisterActivity.class);
            intent.putExtra("sku_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class b extends com.max.hbcommon.network.p {
        b() {
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46058, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradebargainRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradebargainRegisterActivity.this.f93280b0;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46059, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradebargainRegisterActivity.this.isActive()) {
                MallPayInfoObj result2 = result.getResult();
                f0.m(result2);
                String order_id = result2.getOrder_id();
                if (!(order_id == null || order_id.length() == 0)) {
                    TradebargainRegisterActivity tradebargainRegisterActivity = TradebargainRegisterActivity.this;
                    MallPayInfoObj result3 = result.getResult();
                    f0.m(result3);
                    String order_id2 = result3.getOrder_id();
                    f0.o(order_id2, "result.result!!.order_id");
                    TradebargainRegisterActivity.V1(tradebargainRegisterActivity, order_id2);
                    return;
                }
                MallPayInfoObj result4 = result.getResult();
                f0.m(result4);
                String unfinished_order = result4.getUnfinished_order();
                if (unfinished_order != null && unfinished_order.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                LoadingDialog loadingDialog = TradebargainRegisterActivity.this.f93280b0;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                com.max.xiaoheihe.module.trade.b.a aVar = com.max.xiaoheihe.module.trade.b.A;
                MallPayInfoObj result5 = result.getResult();
                f0.m(result5);
                String unfinished_order2 = result5.getUnfinished_order();
                f0.m(unfinished_order2);
                com.max.xiaoheihe.module.trade.b bVarA = aVar.a(unfinished_order2);
                Activity activity = ((BaseActivity) TradebargainRegisterActivity.this).f66601b;
                f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                bVarA.show(((BaseActivity) activity).getSupportFragmentManager(), "tag_order_fragment");
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46060, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class d extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46061, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            super.onNext((Result) result);
            TradebargainRegisterActivity.this.onBackPressed();
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46062, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<TradeBargainDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46063, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradebargainRegisterActivity.this.isActive()) {
                super.onError(e10);
                SmartRefreshLayout smartRefreshLayout = TradebargainRegisterActivity.this.L;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                TradebargainRegisterActivity.m2(TradebargainRegisterActivity.this);
            }
        }

        public void onNext(@dl.d Result<TradeBargainDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46064, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradebargainRegisterActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradebargainRegisterActivity.this.L;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.P();
                TradebargainRegisterActivity.l2(TradebargainRegisterActivity.this);
                TradebargainRegisterActivity.this.Y = result.getResult();
                TradebargainRegisterActivity.f2(TradebargainRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46065, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeBargainDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93285c;

        f(String str) {
            this.f93285c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46066, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradebargainRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradebargainRegisterActivity.this.f93280b0;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46067, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradebargainRegisterActivity.this.isActive()) {
                TradebargainRegisterActivity.e2(TradebargainRegisterActivity.this, this.f93285c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46068, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class g implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 46069, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradebargainRegisterActivity.R1(TradebargainRegisterActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class h implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.d Editable s10) {
            if (PatchProxy.proxy(new Object[]{s10}, this, changeQuickRedirect, false, 46072, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
            EditText editText = null;
            if (s10.length() > 0) {
                EditText editText2 = TradebargainRegisterActivity.this.N;
                if (editText2 == null) {
                    f0.S("et_price");
                } else {
                    editText = editText2;
                }
                bb.d.d(editText, 5);
            } else {
                EditText editText3 = TradebargainRegisterActivity.this.N;
                if (editText3 == null) {
                    f0.S("et_price");
                } else {
                    editText = editText3;
                }
                editText.setTypeface(Typeface.defaultFromStyle(0));
            }
            TradebargainRegisterActivity.this.Z = com.max.hbutils.utils.n.o(s10.toString());
            TradebargainRegisterActivity.c2(TradebargainRegisterActivity.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46070, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.d CharSequence s10, int i10, int i11, int i12) {
            Object[] objArr = {s10, new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46071, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(s10, "s");
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Double total_hbalance;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46073, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeBargainDetailObj tradeBargainDetailObj = TradebargainRegisterActivity.this.Y;
            SwitchButton switchButton = null;
            if (com.max.hbcommon.utils.c.x(tradeBargainDetailObj != null ? tradeBargainDetailObj.is_seller() : null)) {
                SwitchButton switchButton2 = TradebargainRegisterActivity.this.W;
                if (switchButton2 == null) {
                    f0.S("sb_bargain");
                } else {
                    switchButton = switchButton2;
                }
                if (switchButton.isChecked()) {
                    TradebargainRegisterActivity.O1(TradebargainRegisterActivity.this);
                    return;
                }
                return;
            }
            if (TradebargainRegisterActivity.this.Z <= 0.0d) {
                TradebargainRegisterActivity.j2(TradebargainRegisterActivity.this, "请输入还价金额");
                return;
            }
            TradeBargainDetailObj tradeBargainDetailObj2 = TradebargainRegisterActivity.this.Y;
            if (new BigDecimal((tradeBargainDetailObj2 == null || (total_hbalance = tradeBargainDetailObj2.getTotal_hbalance()) == null) ? 0.0d : total_hbalance.doubleValue()).compareTo(new BigDecimal(String.valueOf(TradebargainRegisterActivity.this.Z)).multiply(new BigDecimal(100))) >= 0) {
                TradebargainRegisterActivity.this.E2();
                return;
            }
            TradeBargainDetailObj tradeBargainDetailObj3 = TradebargainRegisterActivity.this.Y;
            Double total_profit = tradeBargainDetailObj3 != null ? tradeBargainDetailObj3.getTotal_profit() : null;
            f0.m(total_profit);
            if (total_profit.doubleValue() <= 0.0d) {
                TradebargainRegisterActivity.o2(TradebargainRegisterActivity.this);
                return;
            }
            TradebargainRegisterActivity tradebargainRegisterActivity = TradebargainRegisterActivity.this;
            TradeBargainDetailObj tradeBargainDetailObj4 = tradebargainRegisterActivity.Y;
            Double total_profit2 = tradeBargainDetailObj4 != null ? tradeBargainDetailObj4.getTotal_profit() : null;
            f0.m(total_profit2);
            String strN = com.max.hbutils.utils.n.n(Double.valueOf(total_profit2.doubleValue() / ((double) 100)));
            f0.o(strN, "numberToTwobitStr(\n     …                        )");
            TradebargainRegisterActivity.n2(tradebargainRegisterActivity, strN);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46074, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradebargainRegisterActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46075, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradebargainRegisterActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.P3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) TradebargainRegisterActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class l extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 46076, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradebargainRegisterActivity.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = TradebargainRegisterActivity.this.f93280b0;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 46077, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradebargainRegisterActivity.this.isActive()) {
                super.onNext(result);
                LoadingDialog loadingDialog = TradebargainRegisterActivity.this.f93280b0;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
                TradebargainRegisterActivity.k2(TradebargainRegisterActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46078, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class m implements CompoundButton.OnCheckedChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 46079, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradebargainRegisterActivity.M1(TradebargainRegisterActivity.this, z10 ? "1" : "0");
            EditText editText = TradebargainRegisterActivity.this.N;
            if (editText == null) {
                f0.S("et_price");
                editText = null;
            }
            editText.setEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class n implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f93293b = new n();
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46080, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46083, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradebargainRegisterActivity.this.finish();
            Activity activity = ((BaseActivity) TradebargainRegisterActivity.this).f66601b;
            TradeBargainListActivity.a aVar = TradeBargainListActivity.R;
            Activity mContext = ((BaseActivity) TradebargainRegisterActivity.this).f66601b;
            f0.o(mContext, "mContext");
            activity.startActivity(aVar.a(mContext, 0, false));
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46084, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradebargainRegisterActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46085, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) TradebargainRegisterActivity.this).f66601b.startActivity(MyHcashActivity.n2(((BaseActivity) TradebargainRegisterActivity.this).f66601b));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class r implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r f93297b = new r();
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46086, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<com.max.hbcommon.view.a> f93299c;

        s(Ref.ObjectRef<com.max.hbcommon.view.a> objectRef) {
            this.f93299c = objectRef;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 46087, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) TradebargainRegisterActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.e0(mContext, 2).A();
            this.f93299c.f124891b.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class t implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46088, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((BaseActivity) TradebargainRegisterActivity.this).f66601b.startActivity(MyHcashActivity.n2(((BaseActivity) TradebargainRegisterActivity.this).f66601b));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradebargainRegisterActivity.kt */
    public static final class u implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final u f93302b = new u();
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 46089, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    private final void A2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46037, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Mb(str, PaymentManager.A, String.valueOf(new BigDecimal(String.valueOf(this.Z)).multiply(new BigDecimal(1000)).intValue())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private final void B2() {
        BargainInfo bargain_info;
        BargainInfo bargain_info2;
        BargainInfo bargain_info3;
        TradeSteamInventoryObj sku_info;
        BargainTips tips;
        BargainTips tips2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46029, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C2();
        TextView textView = this.S;
        TextView textView2 = null;
        SwitchButton switchButton = null;
        if (textView == null) {
            f0.S("tv_tips_title");
            textView = null;
        }
        TradeBargainDetailObj tradeBargainDetailObj = this.Y;
        textView.setText((tradeBargainDetailObj == null || (tips2 = tradeBargainDetailObj.getTips()) == null) ? null : tips2.getTitle());
        TextView textView3 = this.R;
        if (textView3 == null) {
            f0.S("tv_desc");
            textView3 = null;
        }
        TradeBargainDetailObj tradeBargainDetailObj2 = this.Y;
        textView3.setText((tradeBargainDetailObj2 == null || (tips = tradeBargainDetailObj2.getTips()) == null) ? null : tips.getContent());
        TradeBargainDetailObj tradeBargainDetailObj3 = this.Y;
        if (!com.max.hbcommon.utils.c.x(tradeBargainDetailObj3 != null ? tradeBargainDetailObj3.is_seller() : null)) {
            EditText editText = this.N;
            if (editText == null) {
                f0.S("et_price");
                editText = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("最低还价金额￥");
            TradeBargainDetailObj tradeBargainDetailObj4 = this.Y;
            sb2.append(tradeBargainDetailObj4 != null ? tradeBargainDetailObj4.getLowest_estimate_price() : null);
            editText.setHint(sb2.toString());
            this.f66616q.setTitle("还价");
            TextView textView4 = this.Q;
            if (textView4 == null) {
                f0.S("tv_action");
                textView4 = null;
            }
            textView4.setText("支付");
            ViewGroup viewGroup = this.U;
            if (viewGroup == null) {
                f0.S("vg_switch");
                viewGroup = null;
            }
            viewGroup.setVisibility(8);
            ViewGroup viewGroup2 = this.T;
            if (viewGroup2 == null) {
                f0.S("vg_profit");
                viewGroup2 = null;
            }
            viewGroup2.setVisibility(8);
            TextView textView5 = this.O;
            if (textView5 == null) {
                f0.S("tv_price_title");
            } else {
                textView2 = textView5;
            }
            textView2.setText("您的出价");
            return;
        }
        EditText editText2 = this.N;
        if (editText2 == null) {
            f0.S("et_price");
            editText2 = null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("最大不超过¥");
        TradeBargainDetailObj tradeBargainDetailObj5 = this.Y;
        sb3.append((tradeBargainDetailObj5 == null || (sku_info = tradeBargainDetailObj5.getSku_info()) == null) ? null : sku_info.getPrice());
        editText2.setHint(sb3.toString());
        TradeBargainDetailObj tradeBargainDetailObj6 = this.Y;
        String estimate_price = (tradeBargainDetailObj6 == null || (bargain_info3 = tradeBargainDetailObj6.getBargain_info()) == null) ? null : bargain_info3.getEstimate_price();
        if (estimate_price == null || estimate_price.length() == 0) {
            EditText editText3 = this.N;
            if (editText3 == null) {
                f0.S("et_price");
                editText3 = null;
            }
            editText3.setText("");
        } else {
            EditText editText4 = this.N;
            if (editText4 == null) {
                f0.S("et_price");
                editText4 = null;
            }
            TradeBargainDetailObj tradeBargainDetailObj7 = this.Y;
            editText4.setText((tradeBargainDetailObj7 == null || (bargain_info2 = tradeBargainDetailObj7.getBargain_info()) == null) ? null : bargain_info2.getEstimate_price());
        }
        TextView textView6 = this.O;
        if (textView6 == null) {
            f0.S("tv_price_title");
            textView6 = null;
        }
        textView6.setText("心理底价设置");
        this.f66616q.setTitle("还价设置");
        TextView textView7 = this.Q;
        if (textView7 == null) {
            f0.S("tv_action");
            textView7 = null;
        }
        textView7.setText("提交");
        ViewGroup viewGroup3 = this.U;
        if (viewGroup3 == null) {
            f0.S("vg_switch");
            viewGroup3 = null;
        }
        viewGroup3.setVisibility(0);
        ViewGroup viewGroup4 = this.T;
        if (viewGroup4 == null) {
            f0.S("vg_profit");
            viewGroup4 = null;
        }
        viewGroup4.setVisibility(0);
        SwitchButton switchButton2 = this.W;
        if (switchButton2 == null) {
            f0.S("sb_bargain");
            switchButton2 = null;
        }
        TradeBargainDetailObj tradeBargainDetailObj8 = this.Y;
        switchButton2.setChecked(f0.g((tradeBargainDetailObj8 == null || (bargain_info = tradeBargainDetailObj8.getBargain_info()) == null) ? null : bargain_info.getState(), "1"));
        EditText editText5 = this.N;
        if (editText5 == null) {
            f0.S("et_price");
            editText5 = null;
        }
        SwitchButton switchButton3 = this.W;
        if (switchButton3 == null) {
            f0.S("sb_bargain");
            switchButton3 = null;
        }
        editText5.setEnabled(switchButton3.isChecked());
        SwitchButton switchButton4 = this.W;
        if (switchButton4 == null) {
            f0.S("sb_bargain");
        } else {
            switchButton = switchButton4;
        }
        switchButton.setOnCheckedChangeListener(new m());
    }

    private final void C2() {
        TradeSteamInventoryObj sku_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46030, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.P;
        String price = null;
        if (view == null) {
            f0.S("vg_item");
            view = null;
        }
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.activity_trade_bargain_register, view);
        TradeBargainDetailObj tradeBargainDetailObj = this.Y;
        TradeSteamInventoryObj sku_info2 = tradeBargainDetailObj != null ? tradeBargainDetailObj.getSku_info() : null;
        f0.m(sku_info2);
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        TradeInfoUtilKt.B(mContext, eVar, sku_info2, false, 8, null);
        Activity mContext2 = this.f66601b;
        f0.o(mContext2, "mContext");
        TradeInfoUtilKt.u(mContext2, eVar, sku_info2);
        Activity mContext3 = this.f66601b;
        f0.o(mContext3, "mContext");
        TradeInfoUtilKt.z(mContext3, eVar, sku_info2, true);
        TextView textView = this.M;
        if (textView == null) {
            f0.S("tv_item_price");
            textView = null;
        }
        TradeBargainDetailObj tradeBargainDetailObj2 = this.Y;
        if (tradeBargainDetailObj2 != null && (sku_info = tradeBargainDetailObj2.getSku_info()) != null) {
            price = sku_info.getPrice();
        }
        textView.setText(price);
    }

    private final void D2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46027, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(str).u("确定", n.f93293b).g(true).F();
    }

    private final void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46038, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y("已发起还价").l("卖家会在12小时内处理还价。\n前往【我的】-【我的还价】查看").u("前往查看", new o()).o("我知道了", new p()).g(false).F();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.max.hbcommon.view.a] */
    private final void H2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46035, new Class[]{String.class}, Void.TYPE).isSupported) {
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
        fVar.u(this.f66601b.getString(R.string.go_recharge), new q()).o(this.f66601b.getString(R.string.cancel), r.f93297b);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = fVar.F();
        textView4.setOnClickListener(new s(objectRef));
        linearLayout.getLayoutParams().width = -1;
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(this.f66601b, 24.0f);
        ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = ViewUtils.f(this.f66601b, 34.0f);
    }

    private final void I2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46034, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y("余额不足").l("请充值余额");
        fVarL.u(this.f66601b.getString(R.string.go_recharge), new t()).o(this.f66601b.getString(R.string.cancel), u.f93302b);
        fVarL.F();
    }

    public static final /* synthetic */ void M1(TradebargainRegisterActivity tradebargainRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity, str}, null, changeQuickRedirect, true, 46051, new Class[]{TradebargainRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.p2(str);
    }

    public static final /* synthetic */ void N1(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46052, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.q2();
    }

    public static final /* synthetic */ void O1(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46044, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.r2();
    }

    public static final /* synthetic */ void R1(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46042, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.v2();
    }

    public static final /* synthetic */ void V1(TradebargainRegisterActivity tradebargainRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity, str}, null, changeQuickRedirect, true, 46053, new Class[]{TradebargainRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.x2(str);
    }

    public static final /* synthetic */ void c2(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46043, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.z2();
    }

    public static final /* synthetic */ void e2(TradebargainRegisterActivity tradebargainRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity, str}, null, changeQuickRedirect, true, 46054, new Class[]{TradebargainRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.A2(str);
    }

    public static final /* synthetic */ void f2(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46050, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.B2();
    }

    public static final /* synthetic */ void j2(TradebargainRegisterActivity tradebargainRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity, str}, null, changeQuickRedirect, true, 46045, new Class[]{TradebargainRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.D2(str);
    }

    public static final /* synthetic */ void k2(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46055, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.G2();
    }

    public static final /* synthetic */ void l2(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46049, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.x1();
    }

    public static final /* synthetic */ void m2(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46048, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.C1();
    }

    public static final /* synthetic */ void n2(TradebargainRegisterActivity tradebargainRegisterActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity, str}, null, changeQuickRedirect, true, 46046, new Class[]{TradebargainRegisterActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.H2(str);
    }

    public static final /* synthetic */ void o2(TradebargainRegisterActivity tradebargainRegisterActivity) {
        if (PatchProxy.proxy(new Object[]{tradebargainRegisterActivity}, null, changeQuickRedirect, true, 46047, new Class[]{TradebargainRegisterActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradebargainRegisterActivity.I2();
    }

    private final void p2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46039, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str2 = this.X;
        if (str2 == null) {
            f0.S("sku_id");
            str2 = null;
        }
        V((io.reactivex.disposables.b) eVarA.V(str2, null, str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    private final void q2() {
        String price;
        TradeSteamInventoryObj sku_info;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46033, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f93280b0;
        if (loadingDialog == null) {
            Activity mContext = this.f66601b;
            f0.o(mContext, "mContext");
            this.f93280b0 = new LoadingDialog(mContext, "", true).r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z10 = true;
            }
            if (z10) {
                Activity mContext2 = this.f66601b;
                f0.o(mContext2, "mContext");
                this.f93280b0 = new LoadingDialog(mContext2, "", true).r();
            }
        }
        this.f93279a0 = new BigDecimal(String.valueOf(this.Z)).multiply(new BigDecimal(1000)).intValue();
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.X;
        if (str == null) {
            f0.S("sku_id");
            str = null;
        }
        TradeBargainDetailObj tradeBargainDetailObj = this.Y;
        if (tradeBargainDetailObj == null || (sku_info = tradeBargainDetailObj.getSku_info()) == null || (price = sku_info.getPrice()) == null) {
            price = "0";
        }
        V((io.reactivex.disposables.b) eVarA.tb(str, String.valueOf(new BigDecimal(price).multiply(new BigDecimal(1000)).intValue()), String.valueOf(new BigDecimal(String.valueOf(this.Z)).multiply(new BigDecimal(1000)).intValue())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46040, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.X;
        if (str == null) {
            f0.S("sku_id");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.V(str, String.valueOf(new BigDecimal(String.valueOf(this.Z)).multiply(new BigDecimal(1000)).intValue()), null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private final void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46024, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.srl);
        f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.L = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_tips_title);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_tips_title)");
        this.S = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_desc)");
        this.R = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_action);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_action)");
        this.Q = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_item_price);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_item_price)");
        this.M = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.cl_root);
        f0.o(viewFindViewById6, "findViewById(R.id.cl_root)");
        this.P = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.et_price);
        f0.o(viewFindViewById7, "findViewById(R.id.et_price)");
        this.N = (EditText) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tv_price_title);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_price_title)");
        this.O = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.vg_profit);
        f0.o(viewFindViewById9, "findViewById(R.id.vg_profit)");
        this.T = (ViewGroup) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.vg_switch);
        f0.o(viewFindViewById10, "findViewById(R.id.vg_switch)");
        this.U = (ViewGroup) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.sb_bargain);
        f0.o(viewFindViewById11, "findViewById(R.id.sb_bargain)");
        this.W = (SwitchButton) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.tv_profit);
        f0.o(viewFindViewById12, "findViewById(R.id.tv_profit)");
        this.V = (TextView) viewFindViewById12;
    }

    private final void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46028, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.X;
        if (str == null) {
            f0.S("sku_id");
            str = null;
        }
        V((io.reactivex.disposables.b) eVarA.Z(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void x2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 46036, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Kb(str, "trade_bargain", PaymentManager.A, String.valueOf(this.f93279a0), null, null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f(str)));
    }

    private final void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46026, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        TextView textView = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new g());
        TextView textView2 = this.M;
        if (textView2 == null) {
            f0.S("tv_item_price");
            textView2 = null;
        }
        bb.d.d(textView2, 5);
        TextView textView3 = this.V;
        if (textView3 == null) {
            f0.S("tv_profit");
            textView3 = null;
        }
        bb.d.d(textView3, 5);
        EditText editText = this.N;
        if (editText == null) {
            f0.S("et_price");
            editText = null;
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(50000L)});
        EditText editText2 = this.N;
        if (editText2 == null) {
            f0.S("et_price");
            editText2 = null;
        }
        editText2.addTextChangedListener(new h());
        TextView textView4 = this.Q;
        if (textView4 == null) {
            f0.S("tv_action");
        } else {
            textView = textView4;
        }
        textView.setOnClickListener(new i());
    }

    private final void z2() {
        BigDecimal bigDecimal;
        TradeSteamInventoryObj sku_info;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46031, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeBargainDetailObj tradeBargainDetailObj = this.Y;
        TextView textView = null;
        if (com.max.hbcommon.utils.c.x(tradeBargainDetailObj != null ? tradeBargainDetailObj.is_seller() : null)) {
            EditText editText = this.N;
            if (editText == null) {
                f0.S("et_price");
                editText = null;
            }
            if (com.max.hbcommon.utils.c.u(editText.getText().toString())) {
                TradeBargainDetailObj tradeBargainDetailObj2 = this.Y;
                bigDecimal = new BigDecimal((tradeBargainDetailObj2 == null || (sku_info = tradeBargainDetailObj2.getSku_info()) == null) ? null : sku_info.getPrice());
            } else {
                EditText editText2 = this.N;
                if (editText2 == null) {
                    f0.S("et_price");
                    editText2 = null;
                }
                bigDecimal = new BigDecimal(editText2.getText().toString());
            }
            TradeBargainDetailObj tradeBargainDetailObj3 = this.Y;
            BigDecimal mDeduction = bigDecimal.multiply(new BigDecimal(tradeBargainDetailObj3 != null ? tradeBargainDetailObj3.getFee_rate() : null)).setScale(2, 4).max(new BigDecimal("0.01"));
            TextView textView2 = this.V;
            if (textView2 == null) {
                f0.S("tv_profit");
            } else {
                textView = textView2;
            }
            f0.o(mDeduction, "mDeduction");
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(mDeduction);
            f0.o(bigDecimalSubtract, "this.subtract(other)");
            textView.setText(bigDecimalSubtract.toString());
        }
    }

    public final void E2() {
        TradeSteamInventoryObj sku_info;
        Double total_hbalance;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46032, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeBargainDetailObj tradeBargainDetailObj = this.Y;
        String strN = com.max.hbutils.utils.n.n((tradeBargainDetailObj == null || (total_hbalance = tradeBargainDetailObj.getTotal_hbalance()) == null) ? 0 : Float.valueOf((float) (total_hbalance.doubleValue() / ((double) 100))));
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        TradeBargainDetailObj tradeBargainDetailObj2 = this.Y;
        String price = (tradeBargainDetailObj2 == null || (sku_info = tradeBargainDetailObj2.getSku_info()) == null) ? null : sku_info.getPrice();
        f0.m(price);
        TradeInfoUtilKt.P(mContext, "确认还价", "", "卖家售价:", price, "我的还价:", String.valueOf(this.Z), "", "", strN, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradebargainRegisterActivity$showBargainConfirmDialog$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46082, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46081, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradebargainRegisterActivity.N1(this.f93300b);
            }
        });
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46023, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_bargain_register);
        String stringExtra = getIntent().getStringExtra("sku_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.X = stringExtra;
        this.f66616q.setTitle("还价");
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setNavigationOnClickListener(new j());
        this.f66616q.setActionIconOnClickListener(new k());
        u2();
        y2();
        E1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent();
        KeyDescObj keyDescObj = new KeyDescObj();
        String str = this.X;
        SwitchButton switchButton = null;
        if (str == null) {
            f0.S("sku_id");
            str = null;
        }
        keyDescObj.setKey(str);
        SwitchButton switchButton2 = this.W;
        if (switchButton2 == null) {
            f0.S("sb_bargain");
        } else {
            switchButton = switchButton2;
        }
        keyDescObj.setValue(switchButton.isChecked() ? "1" : "0");
        intent.putExtra(f93278x1, keyDescObj);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46025, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        v2();
    }
}
