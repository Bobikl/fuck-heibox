package com.max.xiaoheihe.module.mall;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.BaseViewModel;
import com.max.hbcommon.base.BaseViewModelActivity;
import com.max.hbcustomview.GradientTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.AccProxyObj;
import com.max.xiaoheihe.bean.mall.MallBalanceOrderStateObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.game.GameStorePurchaseShareActivity;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.view.ClockView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.b2;
import df.n4;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class SteamBalancePurchaseProgressActivity extends BaseViewModelActivity {
    private static final int G2 = 2;

    @dl.d
    private static final String G3 = "arg_order_id";

    @dl.d
    private static final String J3 = "arg_spu_name";

    @dl.d
    private static final String K3 = "arg_is_game";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f89835p3 = 3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    public static final a f89836x2 = new a(null);

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f89837y2 = 8;
    private b2 M;
    private ObjectAnimator N;

    @dl.e
    private ValueAnimator O;

    @dl.e
    private CountDownTimer P;

    @dl.e
    private com.max.hbcommon.view.a R;

    @dl.e
    private com.max.hbcommon.view.a S;

    @dl.e
    private com.max.hbcommon.view.a T;
    private boolean U;
    private int V;
    private boolean W;
    private boolean X;

    @dl.e
    private String Y;
    private boolean Z;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f89840c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f89841p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.view.a f89843x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.view.a f89844y1;

    @dl.d
    private final kotlin.z L = kotlin.b0.c(new yh.a<com.max.xiaoheihe.module.mall.b>() { // from class: com.max.xiaoheihe.module.mall.SteamBalancePurchaseProgressActivity$viewModel$2
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            super(0);
        }

        @dl.d
        public final b a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40966, new Class[0], b.class);
            return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : (b) this.f89873b.Q1(b.class);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.max.xiaoheihe.module.mall.b, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ b invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40967, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });
    private boolean Q = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f89838a0 = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f89839b0 = -1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    private ArrayList<String> f89842p2 = CollectionsKt__CollectionsKt.r("看板娘正在核对账户状态", "看板娘正在准备交易物品", "看板娘已准备就绪，开始交易", "报价处理成功", "成功上架Steam市场", "余额已成功进入Steam钱包");

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public enum STATE {
        SUCCESS,
        ERROR,
        WAIT_CONFIRM,
        QUERING;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static STATE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40926, new Class[]{String.class}, STATE.class);
            return (STATE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(STATE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static STATE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40925, new Class[0], STATE[].class);
            return (STATE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.d String orderId, @dl.d String spu_name, boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, orderId, spu_name, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40924, new Class[]{Context.class, String.class, String.class, Boolean.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(orderId, "orderId");
            f0.p(spu_name, "spu_name");
            Intent intentPutExtra = new Intent(context, (Class<?>) SteamBalancePurchaseProgressActivity.class).putExtra(SteamBalancePurchaseProgressActivity.G3, orderId).putExtra(SteamBalancePurchaseProgressActivity.J3, spu_name).putExtra(SteamBalancePurchaseProgressActivity.K3, z10);
            f0.o(intentPutExtra, "Intent(context, SteamBal…tra(ARG_IS_GAME, is_game)");
            return intentPutExtra;
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class a0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40963, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.Q = false;
            SteamBalancePurchaseProgressActivity.n2(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89846a;

        static {
            int[] iArr = new int[STATE.valuesCustom().length];
            try {
                iArr[STATE.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[STATE.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[STATE.WAIT_CONFIRM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[STATE.QUERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f89846a = iArr;
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class b0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40964, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b;
            f0.o(mContext, "mContext");
            TradeInfoUtilKt.o(mContext, true, null, 4, null);
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.Q = false;
            SteamBalancePurchaseProgressActivity.n2(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class c extends com.max.hbcommon.network.p {
        c() {
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class c0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40965, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.Q = false;
            SteamBalancePurchaseProgressActivity.n2(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40927, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f130934a4);
            intent.putExtra("title", "帮助");
            ((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class e extends com.max.hbcommon.base.adapter.s<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e(Activity activity, ArrayList<String> arrayList) {
            super(activity, arrayList, R.layout.item_balance_order_state);
        }

        public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d String data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 40933, new Class[]{com.max.hbcommon.base.adapter.s.e.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ((TextView) viewHolder.i(R.id.tv_state)).setText(data);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, String str) {
            if (PatchProxy.proxy(new Object[]{eVar, str}, this, changeQuickRedirect, false, 40934, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, str);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40935, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.Z3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class g implements j0<MallBalanceOrderStateObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(MallBalanceOrderStateObj mallBalanceOrderStateObj) {
            if (PatchProxy.proxy(new Object[]{mallBalanceOrderStateObj}, this, changeQuickRedirect, false, 40937, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(mallBalanceOrderStateObj);
        }

        public final void b(MallBalanceOrderStateObj result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40936, new Class[]{MallBalanceOrderStateObj.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity = SteamBalancePurchaseProgressActivity.this;
            f0.o(result, "result");
            SteamBalancePurchaseProgressActivity.a2(steamBalancePurchaseProgressActivity, result);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class h implements j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 40939, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40938, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzprogress", "progress==" + result);
            b2 b2Var = SteamBalancePurchaseProgressActivity.this.M;
            b2 b2Var2 = null;
            if (b2Var == null) {
                f0.S("binding");
                b2Var = null;
            }
            ClockView clockView = b2Var.f108733b;
            f0.o(result, "result");
            clockView.setCompleteDegree(result.intValue());
            b2 b2Var3 = SteamBalancePurchaseProgressActivity.this.M;
            if (b2Var3 == null) {
                f0.S("binding");
            } else {
                b2Var2 = b2Var3;
            }
            b2Var2.f108739h.setText(String.valueOf(result));
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40940, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SteamBalancePurchaseProgressActivity.this.isActive()) {
                super.onError(e10);
                SteamBalancePurchaseProgressActivity.this.f89839b0 = 0;
                SteamBalancePurchaseProgressActivity.W1(SteamBalancePurchaseProgressActivity.this).y();
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40941, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SteamBalancePurchaseProgressActivity.this.isActive()) {
                SteamBalancePurchaseProgressActivity.this.f89839b0 = 0;
                SteamBalancePurchaseProgressActivity.W1(SteamBalancePurchaseProgressActivity.this).y();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40942, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class j extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40943, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (SteamBalancePurchaseProgressActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40944, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (SteamBalancePurchaseProgressActivity.this.isActive()) {
                SteamBalancePurchaseProgressActivity.this.X = true;
                SteamBalancePurchaseProgressActivity.W1(SteamBalancePurchaseProgressActivity.this).y();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40945, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class k extends com.max.hbcustomview.spans.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(int i10) {
            super(i10);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@dl.d View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40946, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            if (com.max.xiaoheihe.utils.d.H0(((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b, lb.a.f130983j)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("heyboxacc://%7B%22protocol_type%22%3A%22openAcc%22%2C%22app_id%22%3A%2299928032%22%2C%22from_scheme%22%3A%22heybox%3A%2F%2F%22%7D"));
                intent.addFlags(268435456);
                com.max.xiaoheihe.utils.d.G1(((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b, intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("https://acc.xiaoheihe.cn"));
            intent2.addFlags(268435456);
            com.max.xiaoheihe.utils.d.G1(((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b, intent2);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class l implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@dl.d ValueAnimator animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 40947, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(animation, "animation");
            i0<Integer> i0VarD = SteamBalancePurchaseProgressActivity.W1(SteamBalancePurchaseProgressActivity.this).D();
            Object animatedValue = animation.getAnimatedValue();
            f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            i0VarD.r((Integer) animatedValue);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallBalanceOrderStateObj f89861c;

        m(MallBalanceOrderStateObj mallBalanceOrderStateObj) {
            this.f89861c = mallBalanceOrderStateObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40948, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", this.f89861c.getFaq());
            intent.putExtra("title", "帮助");
            ((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class n implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40949, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity.X1(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40950, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity.this.finish();
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class p extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f89864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f89865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SteamBalancePurchaseProgressActivity f89866c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(TextView textView, boolean z10, SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity, long j10) {
            super(j10, 1000L);
            this.f89864a = textView;
            this.f89865b = z10;
            this.f89866c = steamBalancePurchaseProgressActivity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40952, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (this.f89865b) {
                this.f89866c.W = true;
            } else {
                this.f89866c.f89840c0 = true;
                SteamBalancePurchaseProgressActivity.j2(this.f89866c);
            }
            this.f89864a.setText("00:00");
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 40951, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            this.f89864a.setText(String.valueOf(simpleDateFormat.format(new Date(j10))));
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40953, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity.Z1(SteamBalancePurchaseProgressActivity.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class r implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40954, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity.o2(SteamBalancePurchaseProgressActivity.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class s implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40955, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.U = false;
            SteamBalancePurchaseProgressActivity.R1(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class t implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40956, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.U = false;
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40957, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) SteamBalancePurchaseProgressActivity.this).f66601b;
            f0.o(mContext, "mContext");
            String MALL_BALANCE_MANUAL_CONFIRM_FAQ = lb.a.f130940b4;
            f0.o(MALL_BALANCE_MANUAL_CONFIRM_FAQ, "MALL_BALANCE_MANUAL_CONFIRM_FAQ");
            com.max.xiaoheihe.base.router.b.m0(mContext, "帮助", MALL_BALANCE_MANUAL_CONFIRM_FAQ);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class v implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity.b2(SteamBalancePurchaseProgressActivity.this);
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.f89838a0 = false;
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class w implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40959, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SteamBalancePurchaseProgressActivity.Y1(SteamBalancePurchaseProgressActivity.this);
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.f89838a0 = false;
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class x implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, org.apache.tools.zip.l.C3, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.this.f89838a0 = false;
            SteamBalancePurchaseProgressActivity.b2(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class y implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40961, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            SteamBalancePurchaseProgressActivity.c2(SteamBalancePurchaseProgressActivity.this);
        }
    }

    /* JADX INFO: compiled from: SteamBalancePurchaseProgressActivity.kt */
    public static final class z implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final z f89877b = new z();
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40962, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    private final void A2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40911, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ca(u2().C(), "accept").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i()));
    }

    private final void B2(MallBalanceOrderStateObj mallBalanceOrderStateObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{mallBalanceOrderStateObj}, this, changeQuickRedirect, false, 40885, new Class[]{MallBalanceOrderStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String alert = mallBalanceOrderStateObj.getAlert();
        b2 b2Var = null;
        if (alert == null || alert.length() == 0) {
            b2 b2Var2 = this.M;
            if (b2Var2 == null) {
                f0.S("binding");
                b2Var2 = null;
            }
            b2Var2.f108747p.setVisibility(8);
        } else {
            b2 b2Var3 = this.M;
            if (b2Var3 == null) {
                f0.S("binding");
                b2Var3 = null;
            }
            b2Var3.f108747p.setVisibility(0);
            b2 b2Var4 = this.M;
            if (b2Var4 == null) {
                f0.S("binding");
                b2Var4 = null;
            }
            b2Var4.f108738g.setText(mallBalanceOrderStateObj.getAlert());
        }
        String bottom_msg = mallBalanceOrderStateObj.getBottom_msg();
        if (bottom_msg != null && bottom_msg.length() != 0) {
            z10 = false;
        }
        if (z10) {
            b2 b2Var5 = this.M;
            if (b2Var5 == null) {
                f0.S("binding");
            } else {
                b2Var = b2Var5;
            }
            b2Var.f108737f.setVisibility(8);
        } else {
            b2 b2Var6 = this.M;
            if (b2Var6 == null) {
                f0.S("binding");
                b2Var6 = null;
            }
            b2Var6.f108737f.setVisibility(0);
            b2 b2Var7 = this.M;
            if (b2Var7 == null) {
                f0.S("binding");
                b2Var7 = null;
            }
            b2Var7.f108737f.setText(mallBalanceOrderStateObj.getBottom_msg());
            b2 b2Var8 = this.M;
            if (b2Var8 == null) {
                f0.S("binding");
            } else {
                b2Var = b2Var8;
            }
            b2Var.f108737f.setTextColor(com.max.xiaoheihe.utils.d.e1(mallBalanceOrderStateObj.getBottom_color()));
        }
        J2(mallBalanceOrderStateObj);
        if (q2() != STATE.WAIT_CONFIRM) {
            this.W = false;
            com.max.hbcommon.view.a aVar = this.R;
            if (aVar != null) {
                aVar.dismiss();
            }
            com.max.hbcommon.view.a aVar2 = this.T;
            if (aVar2 != null) {
                aVar2.dismiss();
            }
        }
        G2(mallBalanceOrderStateObj);
        H2(mallBalanceOrderStateObj);
        if (q2() == STATE.SUCCESS) {
            C2();
        }
        this.Y = mallBalanceOrderStateObj.getState();
    }

    private final void C2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40912, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        I2(100);
        if (this.Z) {
            startActivity(GameStorePurchaseShareActivity.f2(this.f66601b, u2().C(), "market_balance"));
        }
        Intent intent = new Intent(lb.a.A);
        intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
        this.f66601b.sendBroadcast(intent);
        finish();
    }

    private final void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40909, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = u2().z().f();
        f0.m(mallBalanceOrderStateObjF);
        String redirect_url = mallBalanceOrderStateObjF.getRedirect_url();
        if (redirect_url != null) {
            Activity mContext = this.f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.A0(mContext, redirect_url, null, null, null).C(3).A();
        }
    }

    private final void E2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40906, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ca(u2().C(), "purchase").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j()));
    }

    private final void G2(MallBalanceOrderStateObj mallBalanceOrderStateObj) {
        if (PatchProxy.proxy(new Object[]{mallBalanceOrderStateObj}, this, changeQuickRedirect, false, 40886, new Class[]{MallBalanceOrderStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (q2() != STATE.QUERING) {
            if (q2() == STATE.WAIT_CONFIRM) {
                if (this.W) {
                    L2();
                    return;
                } else {
                    u2().J();
                    return;
                }
            }
            return;
        }
        if (!f0.g(this.Y, mallBalanceOrderStateObj.getState())) {
            u2().N(1);
        }
        if (f0.g(mallBalanceOrderStateObj.getState(), com.max.xiaoheihe.module.mall.b.f90005j.k())) {
            String error_code = mallBalanceOrderStateObj.getError_code();
            if (!(error_code == null || error_code.length() == 0) && !this.X) {
                u2().N(30);
            }
        }
        if (!u2().F()) {
            if (u2().H()) {
                L2();
                return;
            } else {
                u2().J();
                return;
            }
        }
        if (this.f89840c0) {
            L2();
        } else if (this.f89839b0 == 1) {
            u2().J();
        }
    }

    private final void H2(MallBalanceOrderStateObj mallBalanceOrderStateObj) {
        if (PatchProxy.proxy(new Object[]{mallBalanceOrderStateObj}, this, changeQuickRedirect, false, 40888, new Class[]{MallBalanceOrderStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mallBalanceOrderStateObj.getTips());
        int iS3 = StringsKt__StringsKt.s3(spannableStringBuilder, "小黑盒加速器", 0, false, 6, null);
        spannableStringBuilder.setSpan(new k(this.f66601b.getResources().getColor(R.color.text_primary_1_color)), iS3, iS3 + 6, 33);
        b2 b2Var = this.M;
        b2 b2Var2 = null;
        if (b2Var == null) {
            f0.S("binding");
            b2Var = null;
        }
        b2Var.f108744m.setText(spannableStringBuilder);
        b2 b2Var3 = this.M;
        if (b2Var3 == null) {
            f0.S("binding");
            b2Var3 = null;
        }
        b2Var3.f108744m.setHighlightColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
        b2 b2Var4 = this.M;
        if (b2Var4 == null) {
            f0.S("binding");
        } else {
            b2Var2 = b2Var4;
        }
        b2Var2.f108744m.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void I2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40887, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.V == i10) {
            return;
        }
        this.V = i10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.O;
            f0.m(valueAnimator2);
            valueAnimator2.cancel();
        }
        Integer numF = u2().D().f();
        f0.m(numF);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(numF.intValue(), this.V);
        this.O = valueAnimatorOfInt;
        f0.m(valueAnimatorOfInt);
        valueAnimatorOfInt.addUpdateListener(new l());
        ValueAnimator valueAnimator3 = this.O;
        f0.m(valueAnimator3);
        valueAnimator3.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator4 = this.O;
        f0.m(valueAnimator4);
        valueAnimator4.setDuration(i10 < 100 ? 10000L : 1000L);
        ValueAnimator valueAnimator5 = this.O;
        f0.m(valueAnimator5);
        valueAnimator5.start();
        addValueAnimator(this.O);
    }

    private final void J2(MallBalanceOrderStateObj mallBalanceOrderStateObj) {
        String str;
        if (PatchProxy.proxy(new Object[]{mallBalanceOrderStateObj}, this, changeQuickRedirect, false, 40891, new Class[]{MallBalanceOrderStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = b.f89846a[q2().ordinal()];
        b2 b2Var = null;
        if (i10 == 1) {
            K2(true);
            ObjectAnimator objectAnimator = this.N;
            if (objectAnimator == null) {
                f0.S("mRotationAnimtor");
                objectAnimator = null;
            }
            if (objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.N;
                if (objectAnimator2 == null) {
                    f0.S("mRotationAnimtor");
                    objectAnimator2 = null;
                }
                objectAnimator2.end();
            }
            CountDownTimer countDownTimer = this.P;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            b2 b2Var2 = this.M;
            if (b2Var2 == null) {
                f0.S("binding");
                b2Var2 = null;
            }
            b2Var2.f108735d.setImageResource(R.drawable.common_error_filled_24x24);
            b2 b2Var3 = this.M;
            if (b2Var3 == null) {
                f0.S("binding");
                b2Var3 = null;
            }
            b2Var3.f108740i.setText(!com.max.hbcommon.utils.c.u(mallBalanceOrderStateObj.getError_msg()) ? mallBalanceOrderStateObj.getError_msg() : "未知错误");
            b2 b2Var4 = this.M;
            if (b2Var4 == null) {
                f0.S("binding");
                b2Var4 = null;
            }
            b2Var4.f108734c.setVisibility(0);
            b2 b2Var5 = this.M;
            if (b2Var5 == null) {
                f0.S("binding");
                b2Var5 = null;
            }
            b2Var5.f108746o.setVisibility(0);
            b2 b2Var6 = this.M;
            if (b2Var6 == null) {
                f0.S("binding");
                b2Var6 = null;
            }
            b2Var6.f108741j.setVisibility(0);
            b2 b2Var7 = this.M;
            if (b2Var7 == null) {
                f0.S("binding");
                b2Var7 = null;
            }
            b2Var7.f108741j.setText("查看原因");
            b2 b2Var8 = this.M;
            if (b2Var8 == null) {
                f0.S("binding");
                b2Var8 = null;
            }
            b2Var8.f108748q.setOnClickListener(new m(mallBalanceOrderStateObj));
            if (f0.g(mallBalanceOrderStateObj.getError_code(), com.max.xiaoheihe.module.mall.b.f90005j.c())) {
                Activity activity = this.f66601b;
                f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                com.max.xiaoheihe.module.mall.o.w((BaseActivity) activity, "登录Steam账号", com.max.hbcommon.utils.l.e(R.string.purchase_login_steam_tips), null, new n());
            }
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.O;
                f0.m(valueAnimator2);
                valueAnimator2.cancel();
                return;
            }
            return;
        }
        String error_msg = "购买成功，游戏已入库";
        if (i10 == 2) {
            K2(false);
            ObjectAnimator objectAnimator3 = this.N;
            if (objectAnimator3 == null) {
                f0.S("mRotationAnimtor");
                objectAnimator3 = null;
            }
            if (objectAnimator3.isRunning()) {
                ObjectAnimator objectAnimator4 = this.N;
                if (objectAnimator4 == null) {
                    f0.S("mRotationAnimtor");
                    objectAnimator4 = null;
                }
                objectAnimator4.end();
            }
            CountDownTimer countDownTimer2 = this.P;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            b2 b2Var9 = this.M;
            if (b2Var9 == null) {
                f0.S("binding");
                b2Var9 = null;
            }
            b2Var9.f108735d.setImageResource(R.drawable.common_correct_filled_24x24);
            b2 b2Var10 = this.M;
            if (b2Var10 == null) {
                f0.S("binding");
                b2Var10 = null;
            }
            b2Var10.f108740i.setText("购买成功，游戏已入库");
            b2 b2Var11 = this.M;
            if (b2Var11 == null) {
                f0.S("binding");
                b2Var11 = null;
            }
            b2Var11.f108734c.setVisibility(8);
            b2 b2Var12 = this.M;
            if (b2Var12 == null) {
                f0.S("binding");
                b2Var12 = null;
            }
            b2Var12.f108746o.setVisibility(8);
            b2 b2Var13 = this.M;
            if (b2Var13 == null) {
                f0.S("binding");
            } else {
                b2Var = b2Var13;
            }
            b2Var.f108741j.setVisibility(8);
            O2(3);
            I2(100);
            return;
        }
        if (i10 == 3) {
            K2(false);
            ObjectAnimator objectAnimator5 = this.N;
            if (objectAnimator5 == null) {
                f0.S("mRotationAnimtor");
                objectAnimator5 = null;
            }
            if (!objectAnimator5.isRunning()) {
                ObjectAnimator objectAnimator6 = this.N;
                if (objectAnimator6 == null) {
                    f0.S("mRotationAnimtor");
                    objectAnimator6 = null;
                }
                objectAnimator6.start();
            }
            b2 b2Var14 = this.M;
            if (b2Var14 == null) {
                f0.S("binding");
                b2Var14 = null;
            }
            TextView textView = b2Var14.f108741j;
            f0.o(textView, "binding.tvStateTips");
            String interval = mallBalanceOrderStateObj.getInterval();
            if (interval == null) {
                interval = "300";
            }
            P2(textView, interval, true);
            b2 b2Var15 = this.M;
            if (b2Var15 == null) {
                f0.S("binding");
                b2Var15 = null;
            }
            b2Var15.f108735d.setImageResource(R.drawable.common_circle_filled_24x24);
            b2 b2Var16 = this.M;
            if (b2Var16 == null) {
                f0.S("binding");
                b2Var16 = null;
            }
            b2Var16.f108740i.setText("等待确认Steam手机令牌");
            b2 b2Var17 = this.M;
            if (b2Var17 == null) {
                f0.S("binding");
                b2Var17 = null;
            }
            b2Var17.f108734c.setVisibility(8);
            b2 b2Var18 = this.M;
            if (b2Var18 == null) {
                f0.S("binding");
                b2Var18 = null;
            }
            b2Var18.f108746o.setVisibility(0);
            b2 b2Var19 = this.M;
            if (b2Var19 == null) {
                f0.S("binding");
            } else {
                b2Var = b2Var19;
            }
            b2Var.f108741j.setVisibility(0);
            if (this.Q) {
                W2();
            } else if (this.U) {
                S2();
            } else {
                this.U = true;
            }
            O2(2);
            I2(60);
            return;
        }
        if (i10 != 4) {
            return;
        }
        K2(false);
        ObjectAnimator objectAnimator7 = this.N;
        if (objectAnimator7 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator7 = null;
        }
        if (!objectAnimator7.isRunning()) {
            ObjectAnimator objectAnimator8 = this.N;
            if (objectAnimator8 == null) {
                f0.S("mRotationAnimtor");
                objectAnimator8 = null;
            }
            objectAnimator8.start();
        }
        b2 b2Var20 = this.M;
        if (b2Var20 == null) {
            f0.S("binding");
            b2Var20 = null;
        }
        b2Var20.f108735d.setImageResource(R.drawable.common_circle_filled_24x24);
        CountDownTimer countDownTimer3 = this.P;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
        }
        b2 b2Var21 = this.M;
        if (b2Var21 == null) {
            f0.S("binding");
            b2Var21 = null;
        }
        b2Var21.f108734c.setVisibility(8);
        b2 b2Var22 = this.M;
        if (b2Var22 == null) {
            f0.S("binding");
            b2Var22 = null;
        }
        b2Var22.f108746o.setVisibility(8);
        if (u2().F()) {
            b2 b2Var23 = this.M;
            if (b2Var23 == null) {
                f0.S("binding");
                b2Var23 = null;
            }
            b2Var23.f108741j.setVisibility(0);
            b2 b2Var24 = this.M;
            if (b2Var24 == null) {
                f0.S("binding");
                b2Var24 = null;
            }
            TextView textView2 = b2Var24.f108741j;
            f0.o(textView2, "binding.tvStateTips");
            String interval2 = mallBalanceOrderStateObj.getInterval();
            if (interval2 == null) {
                interval2 = "180";
            }
            P2(textView2, interval2, false);
            if (this.f89838a0) {
                T2();
            } else {
                int i11 = this.f89839b0;
                if (i11 >= 0) {
                    this.f89839b0 = i11 + 1;
                }
                if (this.f89839b0 == 2) {
                    Q2();
                }
            }
        } else {
            this.f89840c0 = false;
            b2 b2Var25 = this.M;
            if (b2Var25 == null) {
                f0.S("binding");
                b2Var25 = null;
            }
            b2Var25.f108741j.setVisibility(8);
            com.max.hbcommon.view.a aVar = this.f89844y1;
            if (aVar != null) {
                aVar.dismiss();
            }
            com.max.hbcommon.view.a aVar2 = this.f89843x1;
            if (aVar2 != null) {
                aVar2.dismiss();
            }
        }
        b2 b2Var26 = this.M;
        if (b2Var26 == null) {
            f0.S("binding");
        } else {
            b2Var = b2Var26;
        }
        TextView textView3 = b2Var.f108740i;
        String state = mallBalanceOrderStateObj.getState();
        com.max.xiaoheihe.module.mall.b.a aVar3 = com.max.xiaoheihe.module.mall.b.f90005j;
        if (f0.g(state, aVar3.n()) ? true : f0.g(state, aVar3.i())) {
            O2(0);
            I2(20);
            error_msg = "正在处理物品报价";
        } else if (f0.g(state, aVar3.g())) {
            O2(1);
            I2(40);
            error_msg = "正在上架Steam市场";
        } else if (f0.g(state, aVar3.l())) {
            O2(2);
            I2(80);
            error_msg = "正在等待余额进入Steam钱包";
        } else if (f0.g(state, aVar3.k())) {
            O2(3);
            if (this.Z) {
                I2(90);
                str = "正在购买游戏";
            } else {
                I2(100);
                str = "购买成功";
            }
            error_msg = str;
        } else if (f0.g(state, aVar3.j())) {
            O2(3);
            I2(100);
        } else {
            error_msg = mallBalanceOrderStateObj.getError_msg();
        }
        textView3.setText(error_msg);
    }

    private final void K2(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40892, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        b2 b2Var = null;
        if (z10) {
            GradientDrawable gradientDrawableO = com.max.hbutils.utils.q.o(this.f66601b, R.color.delete_red_alpha94, 4.0f);
            b2 b2Var2 = this.M;
            if (b2Var2 == null) {
                f0.S("binding");
                b2Var2 = null;
            }
            b2Var2.f108748q.setBackgroundDrawable(gradientDrawableO);
            b2 b2Var3 = this.M;
            if (b2Var3 == null) {
                f0.S("binding");
                b2Var3 = null;
            }
            b2Var3.f108735d.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
            b2 b2Var4 = this.M;
            if (b2Var4 == null) {
                f0.S("binding");
                b2Var4 = null;
            }
            b2Var4.f108740i.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
            b2 b2Var5 = this.M;
            if (b2Var5 == null) {
                f0.S("binding");
                b2Var5 = null;
            }
            b2Var5.f108741j.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red_alpha40));
            b2 b2Var6 = this.M;
            if (b2Var6 == null) {
                f0.S("binding");
            } else {
                b2Var = b2Var6;
            }
            b2Var.f108746o.setBackgroundResource(R.color.delete_red);
            return;
        }
        GradientDrawable gradientDrawableM = com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.f66601b, R.color.background_card_1_color, 4.0f), this.f66601b, R.color.divider_secondary_1_color, 0.5f);
        b2 b2Var7 = this.M;
        if (b2Var7 == null) {
            f0.S("binding");
            b2Var7 = null;
        }
        b2Var7.f108748q.setBackgroundDrawable(gradientDrawableM);
        b2 b2Var8 = this.M;
        if (b2Var8 == null) {
            f0.S("binding");
            b2Var8 = null;
        }
        b2Var8.f108735d.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        b2 b2Var9 = this.M;
        if (b2Var9 == null) {
            f0.S("binding");
            b2Var9 = null;
        }
        b2Var9.f108740i.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        b2 b2Var10 = this.M;
        if (b2Var10 == null) {
            f0.S("binding");
            b2Var10 = null;
        }
        b2Var10.f108741j.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        b2 b2Var11 = this.M;
        if (b2Var11 == null) {
            f0.S("binding");
        } else {
            b2Var = b2Var11;
        }
        b2Var.f108746o.setBackgroundResource(R.color.border_color_2);
    }

    private final void L2() {
        String error_msg;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40890, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        K2(true);
        ObjectAnimator objectAnimator = this.N;
        b2 b2Var = null;
        if (objectAnimator == null) {
            f0.S("mRotationAnimtor");
            objectAnimator = null;
        }
        if (objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.N;
            if (objectAnimator2 == null) {
                f0.S("mRotationAnimtor");
                objectAnimator2 = null;
            }
            objectAnimator2.end();
        }
        CountDownTimer countDownTimer = this.P;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        b2 b2Var2 = this.M;
        if (b2Var2 == null) {
            f0.S("binding");
            b2Var2 = null;
        }
        b2Var2.f108735d.setImageResource(R.drawable.common_error_filled_24x24);
        b2 b2Var3 = this.M;
        if (b2Var3 == null) {
            f0.S("binding");
            b2Var3 = null;
        }
        b2Var3.f108740i.setText("处理超时，请稍后再试");
        b2 b2Var4 = this.M;
        if (b2Var4 == null) {
            f0.S("binding");
            b2Var4 = null;
        }
        b2Var4.f108734c.setVisibility(8);
        b2 b2Var5 = this.M;
        if (b2Var5 == null) {
            f0.S("binding");
            b2Var5 = null;
        }
        b2Var5.f108746o.setVisibility(8);
        b2 b2Var6 = this.M;
        if (b2Var6 == null) {
            f0.S("binding");
            b2Var6 = null;
        }
        b2Var6.f108741j.setVisibility(8);
        b2 b2Var7 = this.M;
        if (b2Var7 == null) {
            f0.S("binding");
            b2Var7 = null;
        }
        b2Var7.f108748q.setOnClickListener(new o());
        String strK = com.max.xiaoheihe.module.mall.b.f90005j.k();
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = u2().z().f();
        if (f0.g(strK, mallBalanceOrderStateObjF != null ? mallBalanceOrderStateObjF.getState() : null)) {
            b2 b2Var8 = this.M;
            if (b2Var8 == null) {
                f0.S("binding");
            } else {
                b2Var = b2Var8;
            }
            TextView textView = b2Var.f108740i;
            MallBalanceOrderStateObj mallBalanceOrderStateObjF2 = u2().z().f();
            if (mallBalanceOrderStateObjF2 == null || (error_msg = mallBalanceOrderStateObjF2.getError_msg()) == null) {
                error_msg = "游戏购买失败";
            }
            textView.setText(error_msg);
            V2();
        }
    }

    private final void O2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40896, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        List<String> listSubList = this.f89842p2.subList(i10, i10 + 3);
        f0.o(listSubList, "stepList.subList(index, index + 3)");
        u2().B().clear();
        u2().B().addAll(listSubList);
        b2 b2Var = this.M;
        if (b2Var == null) {
            f0.S("binding");
            b2Var = null;
        }
        RecyclerView.Adapter adapter = b2Var.f108736e.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private final void P2(TextView textView, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40893, new Class[]{TextView.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (textView.getTag() != null && (textView.getTag() instanceof CountDownTimer)) {
            Object tag = textView.getTag();
            f0.n(tag, "null cannot be cast to non-null type android.os.CountDownTimer");
            ((CountDownTimer) tag).cancel();
        }
        CountDownTimer countDownTimerStart = new p(textView, z10, this, com.max.hbutils.utils.n.r(str) * ((long) 1000)).start();
        this.P = countDownTimerStart;
        textView.setTag(countDownTimerStart);
    }

    private final void Q2() {
        com.max.hbcommon.view.a aVar;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40910, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar2 = this.f89843x1;
        if ((aVar2 != null && aVar2.isShowing()) && (aVar = this.f89843x1) != null) {
            aVar.dismiss();
        }
        com.max.hbcommon.view.a aVar3 = this.f89844y1;
        if (aVar3 != null && aVar3.isShowing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        com.max.hbcommon.view.a.f fVarY = new com.max.hbcommon.view.a.f(this.f66601b).y("是否已成功回应报价");
        fVarY.u("我已回应", new q());
        fVarY.o("我未回应", new r());
        this.f89844y1 = fVarY.F();
    }

    public static final /* synthetic */ void R1(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40919, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.p2();
    }

    private final void S2() {
        com.max.hbcommon.view.a aVar;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40904, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.U = false;
        com.max.hbcommon.view.a aVar2 = this.R;
        if ((aVar2 != null && aVar2.isShowing()) && (aVar = this.R) != null) {
            aVar.dismiss();
        }
        com.max.hbcommon.view.a aVar3 = this.T;
        if (aVar3 != null && aVar3.isShowing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = r2().y("是否确认手机令牌").l("如未确认请前往Steam App完成确认");
        fVarL.u("已确认", new s());
        fVarL.o("未确认", new t());
        this.T = fVarL.F();
    }

    private final void T2() {
        String alert;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40907, new Class[0], Void.TYPE).isSupported || !isActive() || isFinishing()) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.f89843x1;
        if (aVar != null && aVar.isShowing()) {
            return;
        }
        boolean zD = com.max.hbcommon.utils.i.d();
        n4 n4VarC = n4.c(this.f66602c);
        f0.o(n4VarC, "inflate(mInflater)");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = ViewUtils.f(this.f66601b, 14.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(this.f66601b, 20.0f);
        n4VarC.b().setLayoutParams(marginLayoutParams);
        n4VarC.f113665b.setImageResource(R.drawable.mall_manual_large_filled_251x151);
        n4VarC.f113666c.setText("如何手动处理报价");
        n4VarC.f113667d.setOnClickListener(new u());
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = u2().z().f();
        if (mallBalanceOrderStateObjF == null || (alert = mallBalanceOrderStateObjF.getAlert()) == null) {
            alert = "请开启加速器并手动回应报价";
        }
        com.max.hbcommon.view.a.f fVarW = new com.max.hbcommon.view.a.f(this.f66601b).i(n4VarC.b()).y("自动处理报价失败").l(alert).g(false).w(false);
        f0.o(fVarW, "Builder(mContext).setCen… .setShowCloseIcon(false)");
        if (zD || !u2().G()) {
            fVarW.u("我知道了", new v());
        } else {
            fVarW.u("启动加速", new w());
            fVarW.o("我已开启", new x());
        }
        this.f89843x1 = fVarW.F();
    }

    private final void V2() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40903, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.S;
        if (aVar != null && aVar.isShowing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y("Steam余额已到账").l("游戏购买失败,是否再次购买");
        fVarL.u("再次购买", new y());
        fVarL.o("暂不需要", z.f89877b);
        this.S = fVarL.F();
    }

    public static final /* synthetic */ com.max.xiaoheihe.module.mall.b W1(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40914, new Class[]{SteamBalancePurchaseProgressActivity.class}, com.max.xiaoheihe.module.mall.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.b) patchProxyResultProxy.result : steamBalancePurchaseProgressActivity.u2();
    }

    private final void W2() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40902, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.R;
        if (aVar != null && aVar.isShowing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        boolean zD = com.max.hbcommon.utils.i.d();
        com.max.hbcommon.view.a.f fVarL = r2().y("确认Steam手机令牌").l(zD ? "请尽快前往Steam App确认令牌" : "请尽快前往Steam App确认令牌，推荐使用小黑盒加速器加速Steam社区");
        if (zD) {
            fVarL.u("我知道了", new a0());
        } else {
            fVarL.u("启动加速", new b0());
            fVarL.o("我已开启", new c0());
        }
        this.R = fVarL.F();
    }

    public static final /* synthetic */ void X1(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40915, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.v2();
    }

    public static final /* synthetic */ void Y1(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40921, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.z2();
    }

    public static final /* synthetic */ void Z1(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40922, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.A2();
    }

    public static final /* synthetic */ void a2(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity, MallBalanceOrderStateObj mallBalanceOrderStateObj) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity, mallBalanceOrderStateObj}, null, changeQuickRedirect, true, 40913, new Class[]{SteamBalancePurchaseProgressActivity.class, MallBalanceOrderStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.B2(mallBalanceOrderStateObj);
    }

    public static final /* synthetic */ void b2(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40920, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.D2();
    }

    public static final /* synthetic */ void c2(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40918, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.E2();
    }

    public static final /* synthetic */ void j2(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40916, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.L2();
    }

    public static final /* synthetic */ void n2(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40917, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.S2();
    }

    public static final /* synthetic */ void o2(SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity) {
        if (PatchProxy.proxy(new Object[]{steamBalancePurchaseProgressActivity}, null, changeQuickRedirect, true, 40923, new Class[]{SteamBalancePurchaseProgressActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        steamBalancePurchaseProgressActivity.T2();
    }

    private final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40905, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ca(u2().C(), qb.a.f138641d).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final STATE q2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40889, new Class[0], STATE.class);
        if (patchProxyResultProxy.isSupported) {
            return (STATE) patchProxyResultProxy.result;
        }
        if (u2().z().f() == null) {
            return STATE.QUERING;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = u2().z().f();
        f0.m(mallBalanceOrderStateObjF);
        String state = mallBalanceOrderStateObjF.getState();
        com.max.xiaoheihe.module.mall.b.a aVar = com.max.xiaoheihe.module.mall.b.f90005j;
        if (f0.g(state, aVar.m())) {
            return STATE.SUCCESS;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF2 = u2().z().f();
        f0.m(mallBalanceOrderStateObjF2);
        if (f0.g(mallBalanceOrderStateObjF2.getState(), aVar.o())) {
            return STATE.WAIT_CONFIRM;
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF3 = u2().z().f();
        f0.m(mallBalanceOrderStateObjF3);
        return com.max.hbutils.utils.n.q(mallBalanceOrderStateObjF3.getState()) < 0 ? STATE.ERROR : STATE.QUERING;
    }

    private final com.max.hbcommon.view.a.f r2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40901, new Class[0], com.max.hbcommon.view.a.f.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.view.a.f) patchProxyResultProxy.result;
        }
        n4 n4VarC = n4.c(this.f66602c);
        f0.o(n4VarC, "inflate(mInflater)");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = ViewUtils.f(this.f66601b, 14.0f);
        marginLayoutParams.bottomMargin = ViewUtils.f(this.f66601b, 20.0f);
        n4VarC.b().setLayoutParams(marginLayoutParams);
        n4VarC.f113667d.setOnClickListener(new d());
        com.max.hbcommon.view.a.f fVarI = new com.max.hbcommon.view.a.f(this.f66601b).i(n4VarC.b());
        f0.o(fVarI, "Builder(mContext).setCen…rView(dialogBinding.root)");
        return fVarI;
    }

    private final com.max.xiaoheihe.module.mall.b u2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40881, new Class[0], com.max.xiaoheihe.module.mall.b.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.module.mall.b) patchProxyResultProxy.result : (com.max.xiaoheihe.module.mall.b) this.L.getValue();
    }

    private final void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40900, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7("steam_balance").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<SteamWalletJsObj>>() { // from class: com.max.xiaoheihe.module.mall.SteamBalancePurchaseProgressActivity$getloginParams$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 40928, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f89852b.isActive()) {
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d final Result<SteamWalletJsObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40929, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f89852b.isActive()) {
                    super.onNext(result);
                    MagicUtil magicUtil = MagicUtil.f89378a;
                    Activity mContext = ((BaseActivity) this.f89852b).f66601b;
                    f0.o(mContext, "mContext");
                    SteamWalletJsObj result2 = result.getResult();
                    f0.m(result2);
                    final SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity = this.f89852b;
                    magicUtil.c(mContext, result2, new yh.a<kotlin.b2>() { // from class: com.max.xiaoheihe.module.mall.SteamBalancePurchaseProgressActivity$getloginParams$1$onNext$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40932, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return kotlin.b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40931, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            SteamBalancePurchaseProgressActivity steamBalancePurchaseProgressActivity2 = steamBalancePurchaseProgressActivity;
                            steamBalancePurchaseProgressActivity2.startActivityForResult(SteamRedeemWalletCodeLoginActivity.f2(((BaseActivity) steamBalancePurchaseProgressActivity2).f66601b, result.getResult()), 2);
                        }
                    });
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40930, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<SteamWalletJsObj>) obj);
            }
        }));
    }

    private final void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40895, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f66601b);
        b2 b2Var = this.M;
        b2 b2Var2 = null;
        if (b2Var == null) {
            f0.S("binding");
            b2Var = null;
        }
        b2Var.f108736e.setLayoutManager(linearLayoutManager);
        List<String> listSubList = this.f89842p2.subList(0, 3);
        f0.o(listSubList, "stepList.subList(0, 3)");
        u2().B().clear();
        u2().B().addAll(listSubList);
        b2 b2Var3 = this.M;
        if (b2Var3 == null) {
            f0.S("binding");
        } else {
            b2Var2 = b2Var3;
        }
        b2Var2.f108736e.setAdapter(new e(this.f66601b, u2().B()));
    }

    private final void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40884, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66617r.setVisibility(0);
        this.f66616q.setTitle("余额交易中");
        this.f66616q.setActionIcon(R.drawable.common_question);
        this.f66616q.setActionIconOnClickListener(new f());
        b2 b2Var = this.M;
        b2 b2Var2 = null;
        if (b2Var == null) {
            f0.S("binding");
            b2Var = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(b2Var.f108735d, androidx.constraintlayout.motion.widget.f.f18721i, 0.0f, 360.0f);
        f0.o(objectAnimatorOfFloat, "ofFloat(binding.ivState, \"rotation\", 0f, 360f)");
        this.N = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat == null) {
            f0.S("mRotationAnimtor");
            objectAnimatorOfFloat = null;
        }
        objectAnimatorOfFloat.setRepeatMode(1);
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null) {
            f0.S("mRotationAnimtor");
            objectAnimator = null;
        }
        objectAnimator.setDuration(1000L);
        ObjectAnimator objectAnimator2 = this.N;
        if (objectAnimator2 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator2 = null;
        }
        objectAnimator2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimator3 = this.N;
        if (objectAnimator3 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator3 = null;
        }
        objectAnimator3.setRepeatCount(-1);
        ObjectAnimator objectAnimator4 = this.N;
        if (objectAnimator4 == null) {
            f0.S("mRotationAnimtor");
            objectAnimator4 = null;
        }
        addValueAnimator(objectAnimator4);
        x2();
        String stringExtra = getIntent().getStringExtra(J3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("当前正在购买「" + stringExtra + "」请勿中途退出页面");
        int iS3 = StringsKt__StringsKt.s3(spannableStringBuilder, "「", 0, false, 6, null);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f66601b.getResources().getColor(R.color.text_secondary_1_color)), iS3, (stringExtra != null ? stringExtra.length() : 0) + iS3 + 2, 33);
        b2 b2Var3 = this.M;
        if (b2Var3 == null) {
            f0.S("binding");
            b2Var3 = null;
        }
        b2Var3.f108742k.setText(spannableStringBuilder);
        b2 b2Var4 = this.M;
        if (b2Var4 == null) {
            f0.S("binding");
            b2Var4 = null;
        }
        bb.d.d(b2Var4.f108739h, 1);
        Pair pair = new Pair(Integer.valueOf(com.max.xiaoheihe.utils.d.e1("#5A5D5B")), Integer.valueOf(com.max.xiaoheihe.utils.d.e1("#3F4147")));
        b2 b2Var5 = this.M;
        if (b2Var5 == null) {
            f0.S("binding");
            b2Var5 = null;
        }
        GradientTextView gradientTextView = b2Var5.f108739h;
        Object obj = pair.first;
        f0.o(obj, "colorPair.first");
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pair.second;
        f0.o(obj2, "colorPair.second");
        gradientTextView.setColors(iIntValue, ((Number) obj2).intValue(), GradientDrawable.Orientation.BL_TR);
        b2 b2Var6 = this.M;
        if (b2Var6 == null) {
            f0.S("binding");
        } else {
            b2Var2 = b2Var6;
        }
        GradientTextView gradientTextView2 = b2Var2.f108743l;
        Object obj3 = pair.first;
        f0.o(obj3, "colorPair.first");
        int iIntValue2 = ((Number) obj3).intValue();
        Object obj4 = pair.second;
        f0.o(obj4, "colorPair.second");
        gradientTextView2.setColors(iIntValue2, ((Number) obj4).intValue(), GradientDrawable.Orientation.BL_TR);
        u2().z().k(this, new g());
        u2().D().k(this, new h());
    }

    private final void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40908, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = u2().z().f();
        f0.m(mallBalanceOrderStateObjF);
        AccProxyObj acc_proxy = mallBalanceOrderStateObjF.getAcc_proxy();
        TradeInfoUtilKt.o(mContext, false, acc_proxy != null ? acc_proxy.getAppid() : null, 2, null);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b2 b2VarC = b2.c(this.f66602c);
        f0.o(b2VarC, "inflate(mInflater)");
        this.M = b2VarC;
        if (b2VarC == null) {
            f0.S("binding");
            b2VarC = null;
        }
        setContentView(b2VarC.b());
        this.Z = getIntent().getBooleanExtra(K3, false);
        y2();
        com.max.xiaoheihe.module.mall.b bVarU2 = u2();
        String stringExtra = getIntent().getStringExtra(G3);
        f0.m(stringExtra);
        bVarU2.L(stringExtra);
        u2().y();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40883, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u2().f().r(BaseViewModel.TYPE_STATE.LOADING);
        u2().y();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40899, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f89841p1 = true;
        } else if (i11 == -1) {
            u2().y();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40894, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        CountDownTimer countDownTimer = this.P;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40898, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        u2().I();
        this.f89841p1 = false;
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40897, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (u2().F() && !this.f89838a0) {
            if (this.f89841p1) {
                Q2();
            } else if (com.max.hbcommon.utils.i.d()) {
                D2();
            } else {
                T2();
            }
        }
        MallBalanceOrderStateObj mallBalanceOrderStateObjF = u2().z().f();
        if (mallBalanceOrderStateObjF != null) {
            G2(mallBalanceOrderStateObjF);
        }
    }
}
