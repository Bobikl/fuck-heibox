package com.max.hbwallet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.hbwallet.bean.MallCouponWrapperObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RollCouponListFragment extends NativeLittleProgramFragment implements com.max.hbminiprogram.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f74136w = "checked_item_list";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f74137x = "show_check";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f74138y = "KEY_COUPON_LIST";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ArrayList<MallCouponObj> f74139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f74140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.u<MallCouponWrapperObj> f74141r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RefreshBroadcastReceiver f74143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private be.t f74144u;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<MallCouponWrapperObj> f74142s = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f74145v = true;

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(RollCouponListFragment rollCouponListFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, bb.c.l.f34333o2, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.C.equals(intent.getAction())) {
                RollCouponListFragment.this.f74140q = 0;
                RollCouponListFragment.U4(RollCouponListFragment.this);
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34058c2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(lb.a.f130954e0);
            intent.putExtra(RollCouponListFragment.f74138y, RollCouponListFragment.I4(RollCouponListFragment.this));
            ((com.max.hbcommon.base.d) RollCouponListFragment.this).mContext.sendBroadcast(intent);
            ((com.max.hbcommon.base.d) RollCouponListFragment.this).mContext.onBackPressed();
        }
    }

    public class b extends com.max.hbcommon.base.adapter.u<MallCouponWrapperObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(Context context, List list) {
            super(context, list);
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, MallCouponWrapperObj mallCouponWrapperObj) {
            Object[] objArr = {new Integer(i10), mallCouponWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34127f2, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, mallCouponWrapperObj);
        }

        public int n(int i10, MallCouponWrapperObj mallCouponWrapperObj) {
            Object[] objArr = {new Integer(i10), mallCouponWrapperObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.l.f34081d2, new Class[]{cls, MallCouponWrapperObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return 1 == mallCouponWrapperObj.getItemType() ? R.layout.hbwallet_item_category : R.layout.hbwallet_coupon_roll_item;
        }

        public void o(com.max.hbcommon.base.adapter.s.e eVar, MallCouponWrapperObj mallCouponWrapperObj) {
            if (PatchProxy.proxy(new Object[]{eVar, mallCouponWrapperObj}, this, changeQuickRedirect, false, bb.c.l.f34104e2, new Class[]{com.max.hbcommon.base.adapter.s.e.class, MallCouponWrapperObj.class}, Void.TYPE).isSupported) {
                return;
            }
            if (1 == mallCouponWrapperObj.getItemType()) {
                ((TextView) eVar.i(R.id.tv_name)).setText(mallCouponWrapperObj.getDesc());
                return;
            }
            be.d dVarA = be.d.a(eVar.itemView);
            RollCouponListFragment.b5(dVarA, mallCouponWrapperObj.getCoupon(), RollCouponListFragment.this.f74145v);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dVarA.b().getLayoutParams();
            marginLayoutParams.topMargin = ViewUtils.f(((com.max.hbcommon.base.d) RollCouponListFragment.this).mContext, 10.0f);
            marginLayoutParams.leftMargin = ViewUtils.f(((com.max.hbcommon.base.d) RollCouponListFragment.this).mContext, 12.0f);
            marginLayoutParams.rightMargin = ViewUtils.f(((com.max.hbcommon.base.d) RollCouponListFragment.this).mContext, 12.0f);
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, bb.c.l.f34150g2, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (MallCouponWrapperObj) obj);
        }
    }

    public class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.l.f34173h2, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            RollCouponListFragment.this.f74140q = 0;
            RollCouponListFragment.U4(RollCouponListFragment.this);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallCouponObj f74150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ be.d f74151c;

        d(MallCouponObj mallCouponObj, be.d dVar) {
            this.f74150b = mallCouponObj;
            this.f74151c = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34196i2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (this.f74150b.isChecked()) {
                this.f74150b.setChecked(false);
                this.f74151c.f35258d.setImageResource(R.drawable.unchecked_icon_16x16);
            } else {
                this.f74150b.setChecked(true);
                this.f74151c.f35258d.setImageResource(R.drawable.checked_icon_white_16x16);
            }
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<MallCouponListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34218j2, new Class[0], Void.TYPE).isSupported && RollCouponListFragment.this.isActive()) {
                super.onComplete();
                RollCouponListFragment.this.f74144u.f35409d.A(0);
                RollCouponListFragment.this.f74144u.f35409d.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.f34241k2, new Class[]{Throwable.class}, Void.TYPE).isSupported && RollCouponListFragment.this.isActive()) {
                super.onError(th2);
                RollCouponListFragment.L4(RollCouponListFragment.this);
                RollCouponListFragment.this.f74144u.f35409d.A(0);
                RollCouponListFragment.this.f74144u.f35409d.p(0);
            }
        }

        public void onNext(Result<MallCouponListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.f34264l2, new Class[]{Result.class}, Void.TYPE).isSupported && RollCouponListFragment.this.isActive()) {
                super.onNext(result);
                RollCouponListFragment.M4(RollCouponListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34287m2, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallCouponListResultObj>) obj);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.f34310n2, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.l().c(((com.max.hbcommon.base.d) RollCouponListFragment.this).mContext);
        }
    }

    static /* synthetic */ ArrayList I4(RollCouponListFragment rollCouponListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{rollCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.Y1, new Class[]{RollCouponListFragment.class}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : rollCouponListFragment.V4();
    }

    static /* synthetic */ void L4(RollCouponListFragment rollCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{rollCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.f34012a2, new Class[]{RollCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        rollCouponListFragment.showError();
    }

    static /* synthetic */ void M4(RollCouponListFragment rollCouponListFragment, MallCouponListResultObj mallCouponListResultObj) {
        if (PatchProxy.proxy(new Object[]{rollCouponListFragment, mallCouponListResultObj}, null, changeQuickRedirect, true, bb.c.l.f34035b2, new Class[]{RollCouponListFragment.class, MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        rollCouponListFragment.a5(mallCouponListResultObj);
    }

    static /* synthetic */ void U4(RollCouponListFragment rollCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{rollCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.Z1, new Class[]{RollCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        rollCouponListFragment.W4();
    }

    private ArrayList<MallCouponObj> V4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.W1, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<MallCouponObj> arrayList = new ArrayList<>();
        for (MallCouponWrapperObj mallCouponWrapperObj : this.f74142s) {
            if (mallCouponWrapperObj.getItemType() == 0 && mallCouponWrapperObj.getCoupon().isChecked()) {
                arrayList.add(mallCouponWrapperObj.getCoupon());
            }
        }
        return arrayList;
    }

    private void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.U1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) ce.b.a().k(this.f74140q, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    public static RollCouponListFragment X4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.N1, new Class[0], RollCouponListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (RollCouponListFragment) patchProxyResultProxy.result;
        }
        RollCouponListFragment rollCouponListFragment = new RollCouponListFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(f74137x, false);
        rollCouponListFragment.setArguments(bundle);
        return rollCouponListFragment;
    }

    public static RollCouponListFragment Y4(Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bundle}, null, changeQuickRedirect, true, bb.c.l.O1, new Class[]{Bundle.class}, RollCouponListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (RollCouponListFragment) patchProxyResultProxy.result;
        }
        RollCouponListFragment rollCouponListFragment = new RollCouponListFragment();
        rollCouponListFragment.setArguments(bundle);
        return rollCouponListFragment;
    }

    public static RollCouponListFragment Z4(ArrayList<MallCouponObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, bb.c.l.P1, new Class[]{ArrayList.class}, RollCouponListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (RollCouponListFragment) patchProxyResultProxy.result;
        }
        RollCouponListFragment rollCouponListFragment = new RollCouponListFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f74136w, arrayList);
        bundle.putBoolean(f74137x, true);
        rollCouponListFragment.setArguments(bundle);
        return rollCouponListFragment;
    }

    private void a5(MallCouponListResultObj mallCouponListResultObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponListResultObj}, this, changeQuickRedirect, false, bb.c.l.V1, new Class[]{MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (mallCouponListResultObj != null) {
            if (this.f74140q == 0) {
                this.f74142s.clear();
            }
            if (mallCouponListResultObj.getItems() != null) {
                for (MallCouponObj mallCouponObj : mallCouponListResultObj.getItems()) {
                    MallCouponWrapperObj mallCouponWrapperObj = new MallCouponWrapperObj();
                    mallCouponWrapperObj.setItemType(0);
                    mallCouponWrapperObj.setCoupon(mallCouponObj);
                    mallCouponObj.setState("0");
                    mallCouponObj.setChecked(false);
                    ArrayList<MallCouponObj> arrayList = this.f74139p;
                    if (arrayList != null && arrayList.size() > 0) {
                        Iterator<MallCouponObj> it = this.f74139p.iterator();
                        while (it.hasNext()) {
                            if (mallCouponObj.getCoupon_id().equals(it.next().getCoupon_id())) {
                                mallCouponObj.setChecked(true);
                            }
                        }
                    }
                    this.f74142s.add(mallCouponWrapperObj);
                }
            }
            this.f74141r.notifyDataSetChanged();
        }
        if (!this.f74142s.isEmpty()) {
            showContentView();
            return;
        }
        showEmpty(R.drawable.common_tag_money_45x45, R.string.tap_to_get_voucher);
        View emptyView = getEmptyView();
        if (emptyView != null) {
            emptyView.setOnClickListener(new f());
        }
    }

    public static void b5(be.d dVar, MallCouponObj mallCouponObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{dVar, mallCouponObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.T1, new Class[]{be.d.class, MallCouponObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Context context = dVar.b().getContext();
        com.max.hbimage.b.K(mallCouponObj.getImage_url(), dVar.f35260f);
        dVar.f35259e.setBackgroundDrawable(com.max.hbutils.utils.q.L(context, R.color.white_alpha40, 0.5f, 4.0f));
        dVar.f35265k.setText(mallCouponObj.getName());
        dVar.f35266l.setText(mallCouponObj.getTime_desc());
        dVar.f35264j.setText(mallCouponObj.getDescription());
        if (z10) {
            dVar.f35258d.setVisibility(0);
        } else {
            dVar.f35258d.setVisibility(8);
        }
        if (mallCouponObj.isChecked()) {
            dVar.f35258d.setImageResource(R.drawable.checked_icon_white_16x16);
        } else {
            dVar.f35258d.setImageResource(R.drawable.unchecked_icon_16x16);
        }
        dVar.f35257c.setBackground(ViewUtils.i(0, com.max.hbcommon.utils.l.a(R.color.icon_gradient_gray_dark_start_color), com.max.hbcommon.utils.l.a(R.color.icon_gradient_gray_dark_end_color)));
        dVar.b().setOnClickListener(new d(mallCouponObj, dVar));
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.l.Q1, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        be.t tVarC = be.t.c(this.mInflater);
        this.f74144u = tVarC;
        setContentView(tVarC);
        if (getArguments() != null) {
            this.f74139p = (ArrayList) getArguments().getSerializable(f74136w);
            this.f74145v = getArguments().getBoolean(f74137x);
        }
        if (this.f74145v) {
            this.mTitleBar.setTitle("选择已有的礼品卡");
            this.f74144u.f35407b.setVisibility(0);
        } else {
            this.f74144u.f35407b.setVisibility(8);
        }
        this.f74144u.f35407b.setRightClickListener(new a());
        this.f74141r = new b(this.mContext, this.f74142s);
        this.f74144u.f35408c.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f74144u.f35408c.setAdapter(this.f74141r);
        this.f74144u.f35409d.S(new c());
        this.f74144u.f35409d.b0(false);
        showLoading();
        W4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.X1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        W4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.R1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f74143t = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.C);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.S1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f74143t);
    }
}
