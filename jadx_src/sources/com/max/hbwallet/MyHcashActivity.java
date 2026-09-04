package com.max.hbwallet;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.HbalanceChargeInfoObj;
import com.max.hbwallet.bean.PriceItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MyHcashActivity extends BaseActivity implements PaymentManager.g {
    private static final String U = "ARG_NEED_BALANCE";
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.max.hbcommon.base.adapter.s<PriceItemObj> M;
    private HbalanceChargeInfoObj O;
    private PaymentManager P;
    private String Q;
    private String R;
    private ProgressDialog S;
    private be.c T;
    private List<PriceItemObj> L = new ArrayList();
    private int N = 0;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34553y0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            if (ob.a.o().f(((BaseActivity) MyHcashActivity.this).f66601b)) {
                com.max.hbwallet.utils.d.b(((BaseActivity) MyHcashActivity.this).f66601b, 0);
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34575z0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.p().a(((BaseActivity) MyHcashActivity.this).f66601b, ob.a.b().k() + "充值服务协议", lb.a.f131047t3);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.A0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbutils.utils.n.q(MyHcashActivity.this.Q) > 0) {
                MyHcashActivity.f2(MyHcashActivity.this);
            } else {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f("无效的金额");
            }
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<HbalanceChargeInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.C0, new Class[0], Void.TYPE).isSupported || !MyHcashActivity.this.isActive() || MyHcashActivity.this.S == null) {
                return;
            }
            MyHcashActivity.this.S.dismiss();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.B0, new Class[]{Throwable.class}, Void.TYPE).isSupported && MyHcashActivity.this.isActive()) {
                super.onError(th2);
                if (MyHcashActivity.this.S != null) {
                    MyHcashActivity.this.S.dismiss();
                }
            }
        }

        public void onNext(Result<HbalanceChargeInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.D0, new Class[]{Result.class}, Void.TYPE).isSupported && MyHcashActivity.this.isActive()) {
                if (!com.max.hbcommon.utils.c.w(result.getResult().getPayment_list())) {
                    MyHcashActivity.this.P.R(result.getResult().getPayment_list());
                }
                MyHcashActivity.this.P.M(3, MyHcashActivity.this.Q);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.E0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HbalanceChargeInfoObj>) obj);
        }
    }

    public class e extends com.max.hbcommon.base.adapter.s<PriceItemObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PriceItemObj f73943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f73944c;

            a(PriceItemObj priceItemObj, int i10) {
                this.f73943b = priceItemObj;
                this.f73944c = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.H0, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if ("1".equals(this.f73943b.getCustom_type())) {
                    MyHcashActivity.this.T.f35253k.setVisibility(0);
                    MyHcashActivity myHcashActivity = MyHcashActivity.this;
                    myHcashActivity.Q = String.valueOf(com.max.hbutils.utils.n.r(myHcashActivity.T.f35244b.getText().toString()) * 100);
                } else {
                    MyHcashActivity.this.T.f35253k.setVisibility(8);
                    MyHcashActivity.this.Q = this.f73943b.getPrice();
                }
                MyHcashActivity.this.N = this.f73944c;
                MyHcashActivity.R1(MyHcashActivity.this);
                e.this.notifyDataSetChanged();
            }
        }

        e(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, PriceItemObj priceItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, priceItemObj}, this, changeQuickRedirect, false, bb.c.l.F0, new Class[]{com.max.hbcommon.base.adapter.s.e.class, PriceItemObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) eVar.i(R.id.vg_bg);
            TextView textView = (TextView) eVar.i(R.id.tv_title);
            ImageView imageView = (ImageView) eVar.i(R.id.iv_checked);
            ImageView imageView2 = (ImageView) eVar.i(R.id.iv_tag);
            if ("1".equals(priceItemObj.getCustom_type())) {
                imageView2.setVisibility(8);
                textView.setTextSize(1, 14.0f);
                textView.setText("自定义充值");
            } else {
                imageView2.setVisibility(0);
                textView.setTextSize(1, 20.0f);
                textView.setText(com.max.hbutils.utils.n.n(Double.valueOf(com.max.hbutils.utils.n.o(priceItemObj.getPrice()) / 100.0d)));
            }
            if (eVar.getAdapterPosition() == MyHcashActivity.this.N) {
                imageView.setVisibility(0);
                viewGroup.setBackgroundDrawable(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(((BaseActivity) MyHcashActivity.this).f66601b, R.color.divider_secondary_1_color, 2.0f), ((BaseActivity) MyHcashActivity.this).f66601b, R.color.text_primary_1_color, 1.0f));
            } else {
                imageView.setVisibility(8);
                viewGroup.setBackgroundDrawable(com.max.hbutils.utils.q.o(((BaseActivity) MyHcashActivity.this).f66601b, R.color.divider_secondary_1_color, 2.0f));
            }
            eVar.itemView.setOnClickListener(new a(priceItemObj, eVar.getAdapterPosition()));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, PriceItemObj priceItemObj) {
            if (PatchProxy.proxy(new Object[]{eVar, priceItemObj}, this, changeQuickRedirect, false, bb.c.l.G0, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, priceItemObj);
        }
    }

    public class f extends RecyclerView.ItemDecoration {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (PatchProxy.proxy(new Object[]{rect, view, recyclerView, state}, this, changeQuickRedirect, false, bb.c.l.I0, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                return;
            }
            rect.set(ViewUtils.f(((BaseActivity) MyHcashActivity.this).f66601b, 5.0f), 0, ViewUtils.f(((BaseActivity) MyHcashActivity.this).f66601b, 5.0f), ViewUtils.f(((BaseActivity) MyHcashActivity.this).f66601b, 10.0f));
        }
    }

    public class g implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.l.J0, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            MyHcashActivity.this.Q = String.valueOf(com.max.hbutils.utils.n.r(editable.toString()) * 100);
            MyHcashActivity.R1(MyHcashActivity.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class h extends com.max.hbcommon.network.d<Result<HbalanceChargeInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.K0, new Class[]{Throwable.class}, Void.TYPE).isSupported && MyHcashActivity.this.isActive()) {
                super.onError(th2);
                MyHcashActivity.X1(MyHcashActivity.this);
            }
        }

        public void onNext(Result<HbalanceChargeInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.L0, new Class[]{Result.class}, Void.TYPE).isSupported && MyHcashActivity.this.isActive()) {
                MyHcashActivity.this.O = result.getResult();
                if (MyHcashActivity.this.O == null || com.max.hbcommon.utils.c.w(MyHcashActivity.this.O.getRecommend_charge_list())) {
                    return;
                }
                MyHcashActivity.a2(MyHcashActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.M0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HbalanceChargeInfoObj>) obj);
        }
    }

    static /* synthetic */ void R1(MyHcashActivity myHcashActivity) {
        if (PatchProxy.proxy(new Object[]{myHcashActivity}, null, changeQuickRedirect, true, bb.c.l.f34487v0, new Class[]{MyHcashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        myHcashActivity.x2();
    }

    static /* synthetic */ void X1(MyHcashActivity myHcashActivity) {
        if (PatchProxy.proxy(new Object[]{myHcashActivity}, null, changeQuickRedirect, true, bb.c.l.f34509w0, new Class[]{MyHcashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        myHcashActivity.C1();
    }

    static /* synthetic */ void a2(MyHcashActivity myHcashActivity) {
        if (PatchProxy.proxy(new Object[]{myHcashActivity}, null, changeQuickRedirect, true, bb.c.l.f34531x0, new Class[]{MyHcashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        myHcashActivity.v2();
    }

    static /* synthetic */ void f2(MyHcashActivity myHcashActivity) {
        if (PatchProxy.proxy(new Object[]{myHcashActivity}, null, changeQuickRedirect, true, bb.c.l.f34465u0, new Class[]{MyHcashActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        myHcashActivity.q2();
    }

    public static Intent n2(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.l.f34056c0, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) MyHcashActivity.class);
    }

    public static Intent o2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.l.f34079d0, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MyHcashActivity.class);
        intent.putExtra(U, str);
        return intent;
    }

    private void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34399r0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) ce.b.a().r().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private void q2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34194i0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.S = com.max.hbwallet.utils.d.c(this.f66601b, "", "", false);
        V((io.reactivex.disposables.b) ce.b.a().f(this.Q, "balance").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void r2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34216j0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = new e(this.f66601b, this.L, R.layout.hbwallet_item_price_in_hcash);
        this.T.f35247e.setLayoutManager(new GridLayoutManager(this.f66601b, 3));
        this.T.f35247e.addItemDecoration(new f());
        this.T.f35247e.setAdapter(this.M);
        this.T.f35244b.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(100000000L)});
        this.T.f35244b.setSingleLine();
        this.T.f35244b.addTextChangedListener(new g());
    }

    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34125f0, new Class[0], Void.TYPE).isSupported || this.O.getUser_profile() == null) {
            return;
        }
        com.max.hbimage.b.I(this.O.getUser_profile().getAvartar(), this.T.f35245c, R.drawable.common_default_avatar_40x40);
        this.T.f35251i.setText(this.O.getUser_profile().getUsername());
        this.T.f35249g.setText(com.max.hbutils.utils.n.n(Double.valueOf(this.O.getHbalance().getBalance_fee().doubleValue() / 100.0d)));
    }

    private void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34421s0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.T.f35252j.setText(this.O.getTips());
        u2();
        this.L.clear();
        int iMin = Math.min(this.O.getRecommend_charge_list().size(), 5);
        if (this.N == -1) {
            this.N = iMin;
        }
        for (int i10 = 0; i10 < iMin; i10++) {
            PriceItemObj priceItemObj = new PriceItemObj();
            priceItemObj.setPrice(this.O.getRecommend_charge_list().get(i10));
            if (i10 == this.N) {
                priceItemObj.setChecked("1");
            }
            this.L.add(priceItemObj);
        }
        PriceItemObj priceItemObj2 = new PriceItemObj();
        priceItemObj2.setCustom_type("1");
        this.L.add(priceItemObj2);
        if (com.max.hbcommon.utils.c.u(this.L.get(this.N).getPrice())) {
            this.Q = String.valueOf(com.max.hbutils.utils.n.r(this.T.f35244b.getText().toString()) * 100);
        } else {
            this.Q = this.L.get(this.N).getPrice();
        }
        x2();
        this.M.notifyDataSetChanged();
    }

    private void x2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34443t0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strN = com.max.hbutils.utils.n.n(Double.valueOf(com.max.hbutils.utils.n.o(this.Q) / 100.0d));
        this.T.f35250h.setText("支付" + strN + this.f66601b.getString(R.string.price_unit));
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void E3(String str) {
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void S1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34308n0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f("支付成功");
        setResult(-1);
        ob.a aVar = ob.a.f132240a;
        ob.a.a().c(this);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void U2(String str) {
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void Y0(WeixinQueryObj weixinQueryObj) {
        if (PatchProxy.proxy(new Object[]{weixinQueryObj}, this, changeQuickRedirect, false, bb.c.l.f34354p0, new Class[]{WeixinQueryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        p2();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> j3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34262l0, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : ce.b.a().b(PaymentManager.A, str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34102e0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        be.c cVarC = be.c.c(this.f66602c);
        this.T = cVarC;
        setContentView(cVarC.b());
        this.f66620u = ButterKnife.a(this);
        this.P = new PaymentManager(this, this);
        this.R = getIntent().getStringExtra(U);
        this.f66616q.setTitle("我的钱包");
        this.f66616q.setAction("账单");
        this.f66616q.setActionOnClickListener(new a());
        this.T.f35254l.f131542e.setText("选择充值额度");
        this.T.f35254l.f131543f.setVisibility(8);
        this.T.f35248f.setOnClickListener(new b());
        r2();
        if (!com.max.hbcommon.utils.c.u(this.R)) {
            this.N = -1;
            this.T.f35244b.setText(this.R);
            EditText editText = this.T.f35244b;
            editText.setSelection(editText.getText().length());
            this.T.f35253k.setVisibility(0);
            this.Q = String.valueOf(com.max.hbutils.utils.n.r(this.T.f35244b.getText().toString()) * 100);
        }
        E1();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34377q0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        p2();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void o1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34331o0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f("支付失败");
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34171h0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        p2();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> q0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34239k0, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : ce.b.a().t(PaymentManager.A, str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34148g0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.T.f35250h.setOnClickListener(new c());
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> z3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.l.f34285m0, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : ce.b.a().C(PaymentManager.A, str);
    }
}
