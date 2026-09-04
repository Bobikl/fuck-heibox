package com.max.hbwallet;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbpay.PaymentManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.HCoinHistoryObj;
import com.max.hbwallet.bean.HCoinHistoryResultObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: HCoinHistoryFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class c1 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f74168k = "page_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f74169l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f74170m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f74171n = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f74172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f74173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f74174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f74175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<HCoinHistoryObj> f74176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.t f74177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f74178h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<HCoinHistoryObj> f74179i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private mb.z0 f74180j;

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class a extends com.max.hbcommon.base.adapter.s<HCoinHistoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbwallet.c1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HCoinHistoryFragment.java */
        public class ViewOnClickListenerC0593a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HCoinHistoryObj f74182b;

            /* JADX INFO: renamed from: com.max.hbwallet.c1$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: HCoinHistoryFragment.java */
            public class C0594a implements com.max.hbwallet.utils.d.InterfaceC0596d {
                public static ChangeQuickRedirect changeQuickRedirect;

                C0594a() {
                }

                @Override // com.max.hbwallet.utils.d.InterfaceC0596d
                public void a() {
                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.YB, new Class[0], Void.TYPE).isSupported) {
                        return;
                    }
                    c1.this.f74174d = 0;
                    c1.this.f74175e = null;
                    c1.U3(c1.this);
                }
            }

            ViewOnClickListenerC0593a(HCoinHistoryObj hCoinHistoryObj) {
                this.f74182b = hCoinHistoryObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.XB, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbwallet.utils.d.d((BaseActivity) ((com.max.hbcommon.base.d) c1.this).mContext, this.f74182b.getOrder_id(), this.f74182b.getRefund_state(), new C0594a());
            }
        }

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, HCoinHistoryObj hCoinHistoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hCoinHistoryObj}, this, changeQuickRedirect, false, bb.c.k.VB, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HCoinHistoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            TextView textView = (TextView) eVar.i(R.id.tv_value);
            View viewI = eVar.i(R.id.divider);
            View viewI2 = eVar.i(R.id.vg_refund_info);
            View viewI3 = eVar.i(R.id.vg_value_detail);
            eVar.p(R.id.tv_event_desc, hCoinHistoryObj.getEvent_desc());
            eVar.p(R.id.tv_timestamp, hCoinHistoryObj.getTimestamp());
            if (c1.this.f74178h != 0 || com.max.hbcommon.utils.c.u(hCoinHistoryObj.getRefund_way())) {
                viewI2.setVisibility(8);
                viewI3.setOnClickListener(null);
            } else {
                viewI2.setVisibility(0);
                TextView textView2 = (TextView) eVar.i(R.id.tv_go_refund);
                ImageView imageView = (ImageView) eVar.i(R.id.iv_refund_way);
                ImageView imageView2 = (ImageView) eVar.i(R.id.iv_refund_arrow);
                if (hCoinHistoryObj.getRefund_way().equals(PaymentManager.f71426y)) {
                    imageView.setImageResource(R.drawable.weixinpay);
                } else {
                    imageView.setImageResource(R.drawable.common_alipay_38x38);
                }
                if ("0".equals(hCoinHistoryObj.getRefund_state())) {
                    textView2.setText("去退款");
                    int i10 = R.color.text_primary_1_color;
                    textView2.setTextColor(com.max.hbcommon.utils.l.a(i10));
                    imageView2.setColorFilter(com.max.hbcommon.utils.l.a(i10));
                } else {
                    if ("1".equals(hCoinHistoryObj.getRefund_state())) {
                        textView2.setText("退款中");
                    } else if ("2".equals(hCoinHistoryObj.getRefund_state())) {
                        textView2.setText("退款成功");
                    } else {
                        textView2.setText("退款失败");
                    }
                    int i11 = R.color.text_secondary_1_color;
                    textView2.setTextColor(com.max.hbcommon.utils.l.a(i11));
                    imageView2.setColorFilter(com.max.hbcommon.utils.l.a(i11));
                }
                viewI3.setOnClickListener(new ViewOnClickListenerC0593a(hCoinHistoryObj));
            }
            String strValueOf = c1.this.f74178h != 1 ? String.valueOf(com.max.hbutils.utils.n.p(hCoinHistoryObj.getValue()) / 100.0f) : hCoinHistoryObj.getValue();
            if ("inc".equalsIgnoreCase(hCoinHistoryObj.getType())) {
                textView.setTextColor(c1.this.getResources().getColor(R.color.lowest_discount_color));
                textView.setText(String.format("+%s", strValueOf));
            } else {
                textView.setTextColor(c1.this.getResources().getColor(R.color.badge_bg_color));
                textView.setText(String.format("-%s", strValueOf));
            }
            if (hCoinHistoryObj == this.mDataList.get(getItemCount() - 1)) {
                viewI.setVisibility(8);
            } else {
                viewI.setVisibility(0);
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HCoinHistoryObj hCoinHistoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, hCoinHistoryObj}, this, changeQuickRedirect, false, bb.c.k.WB, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, hCoinHistoryObj);
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.k.ZB, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            c1.this.f74174d = 0;
            c1.this.f74175e = null;
            c1.U3(c1.this);
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class c implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.b
        public void f(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.k.aC, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            c1.S3(c1.this, 30);
            c1.U3(c1.this);
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.bC, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) c1.this).mContext.startActivity(MyHcashActivity.n2(((com.max.hbcommon.base.d) c1.this).mContext));
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.cC, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) c1.this).mContext.startActivity(ProfitWithdrawRecordActivity.L.a(((com.max.hbcommon.base.d) c1.this).mContext));
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class f extends com.max.hbcommon.network.d<Result<HCoinHistoryResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.dC, new Class[0], Void.TYPE).isSupported && c1.this.isActive()) {
                super.onComplete();
                c1.this.f74180j.f131840c.f131496c.A(0);
                c1.this.f74180j.f131840c.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.eC, new Class[]{Throwable.class}, Void.TYPE).isSupported && c1.this.isActive()) {
                super.onError(th2);
                c1.N3(c1.this);
                c1.this.f74180j.f131840c.f131496c.A(0);
                c1.this.f74180j.f131840c.f131496c.p(0);
            }
        }

        public void onNext(Result<HCoinHistoryResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.fC, new Class[]{Result.class}, Void.TYPE).isSupported && c1.this.isActive()) {
                super.onNext(result);
                c1.O3(c1.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.gC, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HCoinHistoryResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class g extends com.max.hbcommon.network.d<Result<HCoinHistoryResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.hC, new Class[0], Void.TYPE).isSupported && c1.this.isActive()) {
                super.onComplete();
                c1.this.f74180j.f131840c.f131496c.A(0);
                c1.this.f74180j.f131840c.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.iC, new Class[]{Throwable.class}, Void.TYPE).isSupported && c1.this.isActive()) {
                super.onError(th2);
                c1.P3(c1.this);
                c1.this.f74180j.f131840c.f131496c.A(0);
                c1.this.f74180j.f131840c.f131496c.p(0);
            }
        }

        public void onNext(Result<HCoinHistoryResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.jC, new Class[]{Result.class}, Void.TYPE).isSupported && c1.this.isActive()) {
                super.onNext(result);
                c1.O3(c1.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.kC, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HCoinHistoryResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: HCoinHistoryFragment.java */
    public class h extends com.max.hbcommon.network.d<Result<HCoinHistoryResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.lC, new Class[0], Void.TYPE).isSupported && c1.this.isActive()) {
                super.onComplete();
                c1.this.f74180j.f131840c.f131496c.A(0);
                c1.this.f74180j.f131840c.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.mC, new Class[]{Throwable.class}, Void.TYPE).isSupported && c1.this.isActive()) {
                super.onError(th2);
                c1.Q3(c1.this);
                c1.this.f74180j.f131840c.f131496c.A(0);
                c1.this.f74180j.f131840c.f131496c.p(0);
            }
        }

        public void onNext(Result<HCoinHistoryResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.nC, new Class[]{Result.class}, Void.TYPE).isSupported && c1.this.isActive()) {
                super.onNext(result);
                c1.this.f74175e = result.getResult().getLastval();
                c1.O3(c1.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.oC, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HCoinHistoryResultObj>) obj);
        }
    }

    static /* synthetic */ void N3(c1 c1Var) {
        if (PatchProxy.proxy(new Object[]{c1Var}, null, changeQuickRedirect, true, bb.c.k.RB, new Class[]{c1.class}, Void.TYPE).isSupported) {
            return;
        }
        c1Var.showError();
    }

    static /* synthetic */ void O3(c1 c1Var, HCoinHistoryResultObj hCoinHistoryResultObj) {
        if (PatchProxy.proxy(new Object[]{c1Var, hCoinHistoryResultObj}, null, changeQuickRedirect, true, bb.c.k.SB, new Class[]{c1.class, HCoinHistoryResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        c1Var.f4(hCoinHistoryResultObj);
    }

    static /* synthetic */ void P3(c1 c1Var) {
        if (PatchProxy.proxy(new Object[]{c1Var}, null, changeQuickRedirect, true, bb.c.k.TB, new Class[]{c1.class}, Void.TYPE).isSupported) {
            return;
        }
        c1Var.showError();
    }

    static /* synthetic */ void Q3(c1 c1Var) {
        if (PatchProxy.proxy(new Object[]{c1Var}, null, changeQuickRedirect, true, bb.c.k.UB, new Class[]{c1.class}, Void.TYPE).isSupported) {
            return;
        }
        c1Var.showError();
    }

    static /* synthetic */ int S3(c1 c1Var, int i10) {
        int i11 = c1Var.f74174d + i10;
        c1Var.f74174d = i11;
        return i11;
    }

    static /* synthetic */ void U3(c1 c1Var) {
        if (PatchProxy.proxy(new Object[]{c1Var}, null, changeQuickRedirect, true, bb.c.k.QB, new Class[]{c1.class}, Void.TYPE).isSupported) {
            return;
        }
        c1Var.a4();
    }

    private void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.IB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f74178h;
        if (i10 == 0) {
            i4();
        } else if (i10 == 2) {
            k4();
        } else {
            j4();
        }
    }

    public static c1 b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.BB, new Class[0], c1.class);
        return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : e4(0);
    }

    public static c1 c4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.CB, new Class[0], c1.class);
        return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : e4(1);
    }

    private void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.GB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        int i10 = R.layout.hbwallet_layout_header_wallet_history;
        View viewInflate = layoutInflater.inflate(i10, (ViewGroup) this.f74180j.f131840c.f131495b, false);
        this.f74173c = viewInflate;
        this.f74172b = (TextView) viewInflate.findViewById(R.id.tv_desc);
        TextView textView = (TextView) this.f74173c.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) this.f74173c.findViewById(R.id.iv_tag);
        TextView textView2 = (TextView) this.f74173c.findViewById(R.id.tv_recharge);
        TextView textView3 = (TextView) this.f74173c.findViewById(R.id.tv_withdraw_record);
        int i11 = this.f74178h;
        if (i11 == 0) {
            textView.setText("我的余额");
            imageView.setImageResource(R.drawable.heybox_hcash_24);
            textView2.setVisibility(0);
            textView2.setOnClickListener(new d());
        } else if (i11 == 2) {
            textView.setText("我的收益");
            imageView.setImageResource(R.drawable.heybox_hcash_24);
            textView2.setVisibility(8);
            textView3.setVisibility(0);
            Activity activity = this.mContext;
            textView3.setBackground(com.max.hbutils.utils.q.o(this.mContext, R.color.divider_color, ViewUtils.h0(activity, ViewUtils.o(activity, textView3))));
            textView3.setOnClickListener(new e());
        } else {
            textView.setText("我的H币");
            imageView.setImageResource(R.drawable.heybox_hcoin_24);
            textView2.setVisibility(8);
        }
        this.f74177g.p(i10, this.f74173c);
    }

    private static c1 e4(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.EB, new Class[]{Integer.TYPE}, c1.class);
        if (patchProxyResultProxy.isSupported) {
            return (c1) patchProxyResultProxy.result;
        }
        c1 c1Var = new c1();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i10);
        c1Var.setArguments(bundle);
        return c1Var;
    }

    private void f4(HCoinHistoryResultObj hCoinHistoryResultObj) {
        if (PatchProxy.proxy(new Object[]{hCoinHistoryResultObj}, this, changeQuickRedirect, false, bb.c.k.NB, new Class[]{HCoinHistoryResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (hCoinHistoryResultObj != null) {
            h4(hCoinHistoryResultObj);
            if (this.f74174d == 0) {
                this.f74179i.clear();
            }
            if (hCoinHistoryResultObj.getHistory() != null) {
                this.f74179i.addAll(hCoinHistoryResultObj.getHistory());
            }
            this.f74177g.notifyDataSetChanged();
            l4(this.f74179i, R.drawable.common_tag_common_45x45, R.string.empty_view_def_text);
        }
    }

    public static c1 g4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.DB, new Class[0], c1.class);
        return patchProxyResultProxy.isSupported ? (c1) patchProxyResultProxy.result : e4(2);
    }

    private void h4(HCoinHistoryResultObj hCoinHistoryResultObj) {
        if (PatchProxy.proxy(new Object[]{hCoinHistoryResultObj}, this, changeQuickRedirect, false, bb.c.k.MB, new Class[]{HCoinHistoryResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f74178h;
        if (i10 == 0) {
            this.f74172b.setText(com.max.hbutils.utils.n.n(Float.valueOf(com.max.hbutils.utils.n.p(hCoinHistoryResultObj.getHbalance()) / 100.0f)));
        } else if (i10 == 2) {
            this.f74172b.setText(com.max.hbutils.utils.n.n(Float.valueOf(com.max.hbutils.utils.n.p(hCoinHistoryResultObj.getProfit()) / 100.0f)));
        } else {
            this.f74172b.setText(hCoinHistoryResultObj.getHcoin());
        }
    }

    private void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.KB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().v(this.f74174d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.JB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().i(this.f74174d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.LB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().u(this.f74175e, this.f74174d, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private void l4(List list, int i10, int i11) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.OB, new Class[]{List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!list.isEmpty()) {
            this.f74180j.f131839b.b().setVisibility(8);
            showContentView();
            this.f74180j.f131840c.f131496c.i0(true);
            this.f74180j.f131840c.f131496c.b0(true);
            return;
        }
        this.f74180j.f131840c.f131496c.i0(false);
        this.f74180j.f131840c.f131496c.b0(false);
        this.f74180j.f131839b.b().setVisibility(0);
        ImageView imageView = (ImageView) this.f74180j.f131839b.b().findViewById(R.id.iv_empty);
        TextView textView = (TextView) this.f74180j.f131839b.b().findViewById(R.id.tv_empty);
        imageView.setImageResource(i10);
        textView.setText(i11);
        if (this.f74180j.f131839b.b() == null || this.f74173c == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f74180j.f131839b.b().getLayoutParams();
        layoutParams.setMargins(0, ViewUtils.V(this.f74173c), 0, 0);
        this.f74180j.f131839b.b().setLayoutParams(layoutParams);
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.HB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        a4();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.FB, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        mb.z0 z0VarC = mb.z0.c(this.mInflater);
        this.f74180j = z0VarC;
        setContentView(z0VarC);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f74178h = getArguments().getInt("page_type", 1);
        }
        this.f74180j.f131840c.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        a aVar = new a(this.mContext, this.f74179i, R.layout.hbwallet_item_h_coin_history);
        this.f74176f = aVar;
        this.f74177g = new com.max.hbcommon.base.adapter.t(aVar);
        d4();
        this.f74180j.f131840c.f131495b.setAdapter(this.f74177g);
        this.f74180j.f131840c.f131496c.S(new b());
        this.f74180j.f131840c.f131496c.f0(new c());
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.PB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        a4();
    }
}
