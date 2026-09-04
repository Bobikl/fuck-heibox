package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.i;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.account.SteamIdInfoObj;
import com.max.xiaoheihe.bean.trade.TradeSteamSettingObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.message.common.inter.ITagManager;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import ng.j;

/* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeAccountSettingActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private TradeSteamSettingObj L;
    private View M;
    private ImageView N;
    private TextView O;
    private TextView P;
    private MarqueeTextView Q;
    private View R;
    private TextView S;
    private ViewGroup T;
    private ViewGroup U;
    private ViewGroup V;
    private ViewGroup W;
    private TextView X;
    private TextView Y;
    private TextView Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private TextView f92624a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TextView f92625b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private TextView f92626c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private TextView f92627p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private SmartRefreshLayout f92628x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private i f92629y1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    public static final a f92620p2 = new a(null);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f92622x2 = 8;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f92623y2 = 2;
    private static final int G2 = 3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f92621p3 = 4;
    private static final int G3 = 5;
    private static final int J3 = 6;

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44687, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) TradeAccountSettingActivity.class);
        }

        public final int b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44683, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeAccountSettingActivity.G2;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44686, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeAccountSettingActivity.J3;
        }

        public final int d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44684, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeAccountSettingActivity.f92621p3;
        }

        public final int e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44682, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeAccountSettingActivity.f92623y2;
        }

        public final int f() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44685, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeAccountSettingActivity.G3;
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamSettingObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44689, new Class[0], Void.TYPE).isSupported && TradeAccountSettingActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeAccountSettingActivity.this.f92628x1;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeAccountSettingActivity.this.f92628x1;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44688, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeAccountSettingActivity.this.isActive()) {
                super.onError(e10);
                TradeAccountSettingActivity.e2(TradeAccountSettingActivity.this);
                SmartRefreshLayout smartRefreshLayout = TradeAccountSettingActivity.this.f92628x1;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeAccountSettingActivity.this.f92628x1;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamSettingObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44690, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeAccountSettingActivity.this.isActive()) {
                TradeAccountSettingActivity.this.L = result.getResult();
                TradeAccountSettingActivity.this.n2();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44691, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamSettingObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<StateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f92632c;

        c(int i10) {
            this.f92632c = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44692, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeAccountSettingActivity.this.isActive()) {
                super.onError(e10);
                e10.printStackTrace();
            }
        }

        public void onNext(@dl.d Result<StateObj> result) {
            i iVar;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44693, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeAccountSettingActivity.this.isActive()) {
                if (TradeAccountSettingActivity.this.f92629y1 == null) {
                    TradeAccountSettingActivity tradeAccountSettingActivity = TradeAccountSettingActivity.this;
                    Activity mContext = ((BaseActivity) tradeAccountSettingActivity).f66601b;
                    f0.o(mContext, "mContext");
                    tradeAccountSettingActivity.f92629y1 = TradeInfoUtilKt.O(mContext);
                }
                i iVar2 = TradeAccountSettingActivity.this.f92629y1;
                if (!(iVar2 != null && iVar2.isShowing()) && (iVar = TradeAccountSettingActivity.this.f92629y1) != null) {
                    iVar.show();
                }
                i iVar3 = TradeAccountSettingActivity.this.f92629y1;
                if (iVar3 != null && iVar3.isShowing()) {
                    Activity mContext2 = ((BaseActivity) TradeAccountSettingActivity.this).f66601b;
                    f0.o(mContext2, "mContext");
                    i iVar4 = TradeAccountSettingActivity.this.f92629y1;
                    f0.m(iVar4);
                    TradeInfoUtilKt.W(mContext2, result, iVar4, this.f92632c);
                }
                StateObj result2 = result.getResult();
                String state = result2 == null ? z5.f.f141859j : result2.getState();
                if (state == null) {
                    state = z5.f.f141859j;
                }
                int iHashCode = state.hashCode();
                ViewGroup viewGroup = null;
                if (iHashCode != -1281977283) {
                    if (iHashCode != 3548) {
                        if (iHashCode == 1116313165 && state.equals("waiting")) {
                            if (this.f92632c > 10) {
                                ViewGroup viewGroup2 = TradeAccountSettingActivity.this.T;
                                if (viewGroup2 == null) {
                                    f0.S("vg_state");
                                } else {
                                    viewGroup = viewGroup2;
                                }
                                viewGroup.setClickable(true);
                                return;
                            }
                            ViewGroup viewGroup3 = TradeAccountSettingActivity.this.T;
                            if (viewGroup3 == null) {
                                f0.S("vg_state");
                            } else {
                                viewGroup = viewGroup3;
                            }
                            viewGroup.setClickable(false);
                            TradeAccountSettingActivity.Z1(TradeAccountSettingActivity.this, this.f92632c + 1);
                            return;
                        }
                    } else if (state.equals(ITagManager.SUCCESS)) {
                        ViewGroup viewGroup4 = TradeAccountSettingActivity.this.T;
                        if (viewGroup4 == null) {
                            f0.S("vg_state");
                        } else {
                            viewGroup = viewGroup4;
                        }
                        viewGroup.setClickable(true);
                        TradeAccountSettingActivity.R1(TradeAccountSettingActivity.this);
                        return;
                    }
                } else if (state.equals(z5.f.f141859j)) {
                    ViewGroup viewGroup5 = TradeAccountSettingActivity.this.T;
                    if (viewGroup5 == null) {
                        f0.S("vg_state");
                    } else {
                        viewGroup = viewGroup5;
                    }
                    viewGroup.setClickable(true);
                    return;
                }
                ViewGroup viewGroup6 = TradeAccountSettingActivity.this.T;
                if (viewGroup6 == null) {
                    f0.S("vg_state");
                } else {
                    viewGroup = viewGroup6;
                }
                viewGroup.setClickable(true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44694, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<StateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44695, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeAccountSettingActivity.R1(TradeAccountSettingActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44705, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) TradeAccountSettingActivity.this).f66601b;
            SetTradeUrlActivity.a aVar = SetTradeUrlActivity.Q;
            Activity mContext = ((BaseActivity) TradeAccountSettingActivity.this).f66601b;
            f0.o(mContext, "mContext");
            TradeSteamSettingObj tradeSteamSettingObj = TradeAccountSettingActivity.this.L;
            activity.startActivityForResult(aVar.a(mContext, tradeSteamSettingObj != null ? tradeSteamSettingObj.getTrade_url() : null), TradeAccountSettingActivity.f92620p2.e());
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer has_api_key;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44706, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) TradeAccountSettingActivity.this).f66601b;
            SetAPIKeyActivity.a aVar = SetAPIKeyActivity.T;
            Activity mContext = ((BaseActivity) TradeAccountSettingActivity.this).f66601b;
            f0.o(mContext, "mContext");
            TradeSteamSettingObj tradeSteamSettingObj = TradeAccountSettingActivity.this.L;
            activity.startActivityForResult(aVar.a(mContext, (tradeSteamSettingObj == null || (has_api_key = tradeSteamSettingObj.getHas_api_key()) == null || 1 != has_api_key.intValue()) ? false : true), TradeAccountSettingActivity.f92620p2.b());
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44707, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradeAccountSettingActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.C3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) TradeAccountSettingActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradeAccountSettingActivity.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Integer trade_state;
            boolean z10 = false;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44708, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeSteamSettingObj tradeSteamSettingObj = TradeAccountSettingActivity.this.L;
            if (tradeSteamSettingObj != null && (trade_state = tradeSteamSettingObj.getTrade_state()) != null && trade_state.intValue() == 1) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            TradeAccountSettingActivity.Z1(TradeAccountSettingActivity.this, 1);
        }
    }

    public static final /* synthetic */ void R1(TradeAccountSettingActivity tradeAccountSettingActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAccountSettingActivity}, null, changeQuickRedirect, true, 44679, new Class[]{TradeAccountSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAccountSettingActivity.h2();
    }

    public static final /* synthetic */ void Z1(TradeAccountSettingActivity tradeAccountSettingActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeAccountSettingActivity, new Integer(i10)}, null, changeQuickRedirect, true, 44681, new Class[]{TradeAccountSettingActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeAccountSettingActivity.i2(i10);
    }

    public static final /* synthetic */ void e2(TradeAccountSettingActivity tradeAccountSettingActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAccountSettingActivity}, null, changeQuickRedirect, true, 44680, new Class[]{TradeAccountSettingActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAccountSettingActivity.C1();
    }

    private final void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44668, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.srl);
        f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.f92628x1 = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.vg_avartar);
        f0.o(viewFindViewById2, "findViewById(R.id.vg_avartar)");
        this.M = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.iv_avartar);
        f0.o(viewFindViewById3, "findViewById(R.id.iv_avartar)");
        this.N = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_update);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_update)");
        this.O = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_name)");
        this.P = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.tv_message);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_message)");
        this.Q = (MarqueeTextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.vg_message);
        f0.o(viewFindViewById7, "findViewById(R.id.vg_message)");
        this.R = viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tv_join_date);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_join_date)");
        this.S = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.vg_state);
        f0.o(viewFindViewById9, "findViewById(R.id.vg_state)");
        this.T = (ViewGroup) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.item_setting_1);
        f0.o(viewFindViewById10, "findViewById(R.id.item_setting_1)");
        this.U = (ViewGroup) viewFindViewById10;
        View viewFindViewById11 = findViewById(R.id.item_setting_2);
        f0.o(viewFindViewById11, "findViewById(R.id.item_setting_2)");
        this.V = (ViewGroup) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.item_setting_3);
        f0.o(viewFindViewById12, "findViewById(R.id.item_setting_3)");
        this.W = (ViewGroup) viewFindViewById12;
        View viewFindViewById13 = findViewById(R.id.tv_steam_id);
        f0.o(viewFindViewById13, "findViewById(R.id.tv_steam_id)");
        this.X = (TextView) viewFindViewById13;
        View viewFindViewById14 = findViewById(R.id.tv_unbind);
        f0.o(viewFindViewById14, "findViewById(R.id.tv_unbind)");
        this.Z = (TextView) viewFindViewById14;
        View viewFindViewById15 = findViewById(R.id.tv_change_bind);
        f0.o(viewFindViewById15, "findViewById(R.id.tv_change_bind)");
        this.Y = (TextView) viewFindViewById15;
    }

    private final void h2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44670, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().M3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void i2(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44674, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup viewGroup = this.T;
        if (viewGroup == null) {
            f0.S("vg_state");
            viewGroup = null;
        }
        viewGroup.setClickable(false);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().A9().C1(i10 < 4 ? 1L : 2L, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(i10)));
    }

    private final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44669, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f92628x1;
        TextView textView = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new d());
        SmartRefreshLayout smartRefreshLayout2 = this.f92628x1;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.b0(false);
        View view = this.M;
        if (view == null) {
            f0.S("vg_avartar");
            view = null;
        }
        view.setBackgroundDrawable(q.K(this.f66601b, R.color.white_alpha20, 2.0f));
        TextView textView2 = this.O;
        if (textView2 == null) {
            f0.S("tv_update");
            textView2 = null;
        }
        textView2.setBackgroundDrawable(q.s(this.f66601b, R.color.text_primary_1_color_alpha70, 2.0f));
        TextView textView3 = this.O;
        if (textView3 == null) {
            f0.S("tv_update");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextView textView4 = this.S;
        if (textView4 == null) {
            f0.S("tv_join_date");
            textView4 = null;
        }
        bb.d.d(textView4, 2);
        ViewGroup viewGroup = this.U;
        if (viewGroup == null) {
            f0.S("item_setting_1");
            viewGroup = null;
        }
        ((ImageView) viewGroup.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_open_privacy);
        ViewGroup viewGroup2 = this.V;
        if (viewGroup2 == null) {
            f0.S("item_setting_2");
            viewGroup2 = null;
        }
        ((ImageView) viewGroup2.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_trade_url);
        ViewGroup viewGroup3 = this.W;
        if (viewGroup3 == null) {
            f0.S("item_setting_3");
            viewGroup3 = null;
        }
        ((ImageView) viewGroup3.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_api_key);
        ViewGroup viewGroup4 = this.U;
        if (viewGroup4 == null) {
            f0.S("item_setting_1");
            viewGroup4 = null;
        }
        ((TextView) viewGroup4.findViewById(R.id.tv_title)).setText("公开Steam库存");
        ViewGroup viewGroup5 = this.V;
        if (viewGroup5 == null) {
            f0.S("item_setting_2");
            viewGroup5 = null;
        }
        ((TextView) viewGroup5.findViewById(R.id.tv_title)).setText("设置Steam交易链接");
        ViewGroup viewGroup6 = this.W;
        if (viewGroup6 == null) {
            f0.S("item_setting_3");
            viewGroup6 = null;
        }
        ((TextView) viewGroup6.findViewById(R.id.tv_title)).setText("设置API Key");
        ViewGroup viewGroup7 = this.V;
        if (viewGroup7 == null) {
            f0.S("item_setting_2");
            viewGroup7 = null;
        }
        View viewFindViewById = viewGroup7.findViewById(R.id.tv_desc);
        f0.o(viewFindViewById, "item_setting_2.findViewB…d<TextView>(R.id.tv_desc)");
        this.f92624a0 = (TextView) viewFindViewById;
        ViewGroup viewGroup8 = this.U;
        if (viewGroup8 == null) {
            f0.S("item_setting_1");
            viewGroup8 = null;
        }
        View viewFindViewById2 = viewGroup8.findViewById(R.id.tv_btn);
        f0.o(viewFindViewById2, "item_setting_1.findViewById<TextView>(R.id.tv_btn)");
        this.f92625b0 = (TextView) viewFindViewById2;
        ViewGroup viewGroup9 = this.V;
        if (viewGroup9 == null) {
            f0.S("item_setting_2");
            viewGroup9 = null;
        }
        View viewFindViewById3 = viewGroup9.findViewById(R.id.tv_btn);
        f0.o(viewFindViewById3, "item_setting_2.findViewById<TextView>(R.id.tv_btn)");
        this.f92626c0 = (TextView) viewFindViewById3;
        ViewGroup viewGroup10 = this.W;
        if (viewGroup10 == null) {
            f0.S("item_setting_3");
            viewGroup10 = null;
        }
        View viewFindViewById4 = viewGroup10.findViewById(R.id.tv_btn);
        f0.o(viewFindViewById4, "item_setting_3.findViewById<TextView>(R.id.tv_btn)");
        this.f92627p1 = (TextView) viewFindViewById4;
        TextView textView5 = this.Z;
        if (textView5 == null) {
            f0.S("tv_unbind");
            textView5 = null;
        }
        textView5.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeAccountSettingActivity$initView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 44696, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((BaseActivity) this.f92638b).f66601b;
                f0.o(mContext, "mContext");
                final TradeAccountSettingActivity tradeAccountSettingActivity = this.f92638b;
                TradeInfoUtilKt.b0(mContext, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeAccountSettingActivity$initView$2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44698, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44697, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        Activity activity = ((BaseActivity) tradeAccountSettingActivity).f66601b;
                        TradeAutoGetInfoActivity.b bVar = TradeAutoGetInfoActivity.L3;
                        activity.startActivityForResult(bVar.d(((BaseActivity) tradeAccountSettingActivity).f66601b, bVar.g()), TradeAccountSettingActivity.f92620p2.f());
                    }
                }, 14, null);
            }
        });
        TextView textView6 = this.Y;
        if (textView6 == null) {
            f0.S("tv_change_bind");
            textView6 = null;
        }
        textView6.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeAccountSettingActivity$initView$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 44699, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((BaseActivity) this.f92640b).f66601b;
                f0.o(mContext, "mContext");
                final TradeAccountSettingActivity tradeAccountSettingActivity = this.f92640b;
                TradeInfoUtilKt.b0(mContext, true, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeAccountSettingActivity$initView$3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44701, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44700, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        Activity activity = ((BaseActivity) tradeAccountSettingActivity).f66601b;
                        TradeAutoGetInfoActivity.b bVar = TradeAutoGetInfoActivity.L3;
                        activity.startActivityForResult(bVar.d(((BaseActivity) tradeAccountSettingActivity).f66601b, bVar.c()), TradeAccountSettingActivity.f92620p2.c());
                    }
                }, 12, null);
            }
        });
        TextView textView7 = this.f92625b0;
        if (textView7 == null) {
            f0.S("tv_btn_inventory");
            textView7 = null;
        }
        textView7.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeAccountSettingActivity$initView$4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 44702, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity mContext = ((BaseActivity) this.f92642b).f66601b;
                f0.o(mContext, "mContext");
                final TradeAccountSettingActivity tradeAccountSettingActivity = this.f92642b;
                TradeInfoUtilKt.b0(mContext, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeAccountSettingActivity$initView$4.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44704, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44703, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        Activity activity = ((BaseActivity) tradeAccountSettingActivity).f66601b;
                        TradeAutoGetInfoActivity.b bVar = TradeAutoGetInfoActivity.L3;
                        activity.startActivityForResult(bVar.d(((BaseActivity) tradeAccountSettingActivity).f66601b, bVar.e()), TradeAccountSettingActivity.f92620p2.d());
                    }
                }, 14, null);
            }
        });
        TextView textView8 = this.f92626c0;
        if (textView8 == null) {
            f0.S("tv_btn_trade_url");
            textView8 = null;
        }
        textView8.setOnClickListener(new e());
        TextView textView9 = this.f92627p1;
        if (textView9 == null) {
            f0.S("tv_btn_api_key");
        } else {
            textView = textView9;
        }
        textView.setOnClickListener(new f());
    }

    private final void m2(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44676, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
            textView.setBackgroundDrawable(q.o(this.f66601b, R.color.text_primary_1_color, 2.0f));
        } else {
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            textView.setBackgroundDrawable(q.o(this.f66601b, R.color.divider_secondary_1_color, 2.0f));
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44667, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_account_setting);
        this.f66616q.setTitle("账号设置");
        this.f66616q.setActionIcon(R.drawable.common_question);
        this.f66616q.setActionIconOnClickListener(new g());
        f2();
        j2();
        E1();
        h2();
    }

    public final void k2() {
        String has_trade_url_desc;
        String has_api_key_desc;
        String has_api_key_desc2;
        Integer has_api_key;
        Integer has_open_inventory;
        String has_trade_url_desc2;
        Integer has_trade_url;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44675, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeSteamSettingObj tradeSteamSettingObj = this.L;
        if ((tradeSteamSettingObj == null || (has_trade_url = tradeSteamSettingObj.getHas_trade_url()) == null || 1 != has_trade_url.intValue()) ? false : true) {
            TextView textView = this.f92624a0;
            if (textView == null) {
                f0.S("tv_trade_url");
                textView = null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.f92624a0;
            if (textView2 == null) {
                f0.S("tv_trade_url");
                textView2 = null;
            }
            TradeSteamSettingObj tradeSteamSettingObj2 = this.L;
            textView2.setText(tradeSteamSettingObj2 != null ? tradeSteamSettingObj2.getTrade_url() : null);
            TextView textView3 = this.f92626c0;
            if (textView3 == null) {
                f0.S("tv_btn_trade_url");
                textView3 = null;
            }
            m2(textView3, false);
            TextView textView4 = this.f92626c0;
            if (textView4 == null) {
                f0.S("tv_btn_trade_url");
                textView4 = null;
            }
            TradeSteamSettingObj tradeSteamSettingObj3 = this.L;
            String has_trade_url_desc3 = tradeSteamSettingObj3 != null ? tradeSteamSettingObj3.getHas_trade_url_desc() : null;
            if (has_trade_url_desc3 == null || has_trade_url_desc3.length() == 0) {
                has_trade_url_desc2 = "已设置";
            } else {
                TradeSteamSettingObj tradeSteamSettingObj4 = this.L;
                has_trade_url_desc2 = tradeSteamSettingObj4 != null ? tradeSteamSettingObj4.getHas_trade_url_desc() : null;
            }
            textView4.setText(has_trade_url_desc2);
        } else {
            TextView textView5 = this.f92624a0;
            if (textView5 == null) {
                f0.S("tv_trade_url");
                textView5 = null;
            }
            textView5.setVisibility(8);
            TextView textView6 = this.f92626c0;
            if (textView6 == null) {
                f0.S("tv_btn_trade_url");
                textView6 = null;
            }
            m2(textView6, true);
            TextView textView7 = this.f92626c0;
            if (textView7 == null) {
                f0.S("tv_btn_trade_url");
                textView7 = null;
            }
            TradeSteamSettingObj tradeSteamSettingObj5 = this.L;
            String has_trade_url_desc4 = tradeSteamSettingObj5 != null ? tradeSteamSettingObj5.getHas_trade_url_desc() : null;
            if (has_trade_url_desc4 == null || has_trade_url_desc4.length() == 0) {
                has_trade_url_desc = "设置链接";
            } else {
                TradeSteamSettingObj tradeSteamSettingObj6 = this.L;
                has_trade_url_desc = tradeSteamSettingObj6 != null ? tradeSteamSettingObj6.getHas_trade_url_desc() : null;
            }
            textView7.setText(has_trade_url_desc);
        }
        TradeSteamSettingObj tradeSteamSettingObj7 = this.L;
        if ((tradeSteamSettingObj7 == null || (has_open_inventory = tradeSteamSettingObj7.getHas_open_inventory()) == null || 1 != has_open_inventory.intValue()) ? false : true) {
            TextView textView8 = this.f92625b0;
            if (textView8 == null) {
                f0.S("tv_btn_inventory");
                textView8 = null;
            }
            m2(textView8, false);
            TextView textView9 = this.f92625b0;
            if (textView9 == null) {
                f0.S("tv_btn_inventory");
                textView9 = null;
            }
            textView9.setText("已公开");
        } else {
            TextView textView10 = this.f92625b0;
            if (textView10 == null) {
                f0.S("tv_btn_inventory");
                textView10 = null;
            }
            m2(textView10, true);
            TextView textView11 = this.f92625b0;
            if (textView11 == null) {
                f0.S("tv_btn_inventory");
                textView11 = null;
            }
            textView11.setText("去公开");
        }
        TradeSteamSettingObj tradeSteamSettingObj8 = this.L;
        if ((tradeSteamSettingObj8 == null || (has_api_key = tradeSteamSettingObj8.getHas_api_key()) == null || 1 != has_api_key.intValue()) ? false : true) {
            TextView textView12 = this.f92627p1;
            if (textView12 == null) {
                f0.S("tv_btn_api_key");
                textView12 = null;
            }
            m2(textView12, false);
            TextView textView13 = this.f92627p1;
            if (textView13 == null) {
                f0.S("tv_btn_api_key");
                textView13 = null;
            }
            TradeSteamSettingObj tradeSteamSettingObj9 = this.L;
            String has_api_key_desc3 = tradeSteamSettingObj9 != null ? tradeSteamSettingObj9.getHas_api_key_desc() : null;
            if (has_api_key_desc3 == null || has_api_key_desc3.length() == 0) {
                has_api_key_desc2 = "已获取";
            } else {
                TradeSteamSettingObj tradeSteamSettingObj10 = this.L;
                has_api_key_desc2 = tradeSteamSettingObj10 != null ? tradeSteamSettingObj10.getHas_api_key_desc() : null;
            }
            textView13.setText(has_api_key_desc2);
            return;
        }
        TextView textView14 = this.f92627p1;
        if (textView14 == null) {
            f0.S("tv_btn_api_key");
            textView14 = null;
        }
        m2(textView14, true);
        TextView textView15 = this.f92627p1;
        if (textView15 == null) {
            f0.S("tv_btn_api_key");
            textView15 = null;
        }
        TradeSteamSettingObj tradeSteamSettingObj11 = this.L;
        String has_api_key_desc4 = tradeSteamSettingObj11 != null ? tradeSteamSettingObj11.getHas_api_key_desc() : null;
        if (has_api_key_desc4 == null || has_api_key_desc4.length() == 0) {
            has_api_key_desc = "获取Key";
        } else {
            TradeSteamSettingObj tradeSteamSettingObj12 = this.L;
            has_api_key_desc = tradeSteamSettingObj12 != null ? tradeSteamSettingObj12.getHas_api_key_desc() : null;
        }
        textView15.setText(has_api_key_desc);
    }

    public final void l2() {
        String date_desc;
        SteamIdInfoObj steam_id_info;
        SteamIdInfoObj steam_id_info2;
        SteamIdInfoObj steam_id_info3;
        SteamIdInfoObj steam_id_info4;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44673, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeSteamSettingObj tradeSteamSettingObj = this.L;
        ViewGroup viewGroup = null;
        String avatar = (tradeSteamSettingObj == null || (steam_id_info4 = tradeSteamSettingObj.getSteam_id_info()) == null) ? null : steam_id_info4.getAvatar();
        ImageView imageView = this.N;
        if (imageView == null) {
            f0.S("iv_avartar");
            imageView = null;
        }
        com.max.hbimage.b.d0(avatar, imageView, ViewUtils.f(this.f66601b, 2.0f));
        TextView textView = this.P;
        if (textView == null) {
            f0.S("tv_name");
            textView = null;
        }
        TradeSteamSettingObj tradeSteamSettingObj2 = this.L;
        textView.setText((tradeSteamSettingObj2 == null || (steam_id_info3 = tradeSteamSettingObj2.getSteam_id_info()) == null) ? null : steam_id_info3.getNickname());
        TextView textView2 = this.X;
        if (textView2 == null) {
            f0.S("tv_steam_id");
            textView2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Steam ID: ");
        TradeSteamSettingObj tradeSteamSettingObj3 = this.L;
        sb2.append((tradeSteamSettingObj3 == null || (steam_id_info2 = tradeSteamSettingObj3.getSteam_id_info()) == null) ? null : steam_id_info2.getSteamid());
        textView2.setText(sb2.toString());
        TextView textView3 = this.S;
        if (textView3 == null) {
            f0.S("tv_join_date");
            textView3 = null;
        }
        TradeSteamSettingObj tradeSteamSettingObj4 = this.L;
        if (tradeSteamSettingObj4 == null || (steam_id_info = tradeSteamSettingObj4.getSteam_id_info()) == null || (date_desc = steam_id_info.getDate_desc()) == null) {
            date_desc = "";
        }
        textView3.setText(date_desc);
        ViewGroup viewGroup2 = this.T;
        if (viewGroup2 == null) {
            f0.S("vg_state");
            viewGroup2 = null;
        }
        TradeSteamSettingObj tradeSteamSettingObj5 = this.L;
        Integer trade_state = tradeSteamSettingObj5 != null ? tradeSteamSettingObj5.getTrade_state() : null;
        TradeSteamSettingObj tradeSteamSettingObj6 = this.L;
        TradeInfoUtilKt.C(viewGroup2, trade_state, tradeSteamSettingObj6 != null ? tradeSteamSettingObj6.getTrade_state_desc() : null);
        ViewGroup viewGroup3 = this.T;
        if (viewGroup3 == null) {
            f0.S("vg_state");
        } else {
            viewGroup = viewGroup3;
        }
        viewGroup.setOnClickListener(new h());
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44671, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        h2();
    }

    public final void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44672, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        TradeSteamSettingObj tradeSteamSettingObj = this.L;
        View view = null;
        String message = tradeSteamSettingObj != null ? tradeSteamSettingObj.getMessage() : null;
        if (message == null || message.length() == 0) {
            View view2 = this.R;
            if (view2 == null) {
                f0.S("vg_message");
            } else {
                view = view2;
            }
            view.setVisibility(8);
        } else {
            View view3 = this.R;
            if (view3 == null) {
                f0.S("vg_message");
                view3 = null;
            }
            view3.setVisibility(0);
            MarqueeTextView marqueeTextView = this.Q;
            if (marqueeTextView == null) {
                f0.S("tv_message");
                marqueeTextView = null;
            }
            TradeSteamSettingObj tradeSteamSettingObj2 = this.L;
            marqueeTextView.setText(tradeSteamSettingObj2 != null ? tradeSteamSettingObj2.getMessage() : null);
        }
        l2();
        k2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44678, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == G3 && i11 == -1) {
            finish();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44677, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        h2();
    }
}
