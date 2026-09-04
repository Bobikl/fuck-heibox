package com.max.hbwallet;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponCategoryObj;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OrderCouponListFragment extends com.max.hbcommon.base.d implements t {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f73958q = "type";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f73959r = "cat";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f73960s = "order_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f73961t = "checked_item_list";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f73962u = "purchase_code";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f73963v = "search_type";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f73964w = "coupon_sku_id";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f73965x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f73966y = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f73967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f73968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f73969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f73970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f73971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f73972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f73973h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<MallCouponObj> f73975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f73976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private h1 f73977l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RefreshBroadcastReceiver f73979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ProgressDialog f73980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private mb.b1 f73981p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f73974i = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<MallCouponObj> f73978m = new ArrayList();

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(OrderCouponListFragment orderCouponListFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, bb.c.l.f34488v1, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.C.equals(intent.getAction())) {
                OrderCouponListFragment.O3(OrderCouponListFragment.this);
            }
        }
    }

    public class a implements h1.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbwallet.h1.b
        public void a(@androidx.annotation.n0 MallCouponObj mallCouponObj) {
            if (PatchProxy.proxy(new Object[]{mallCouponObj}, this, changeQuickRedirect, false, bb.c.l.f34332o1, new Class[]{MallCouponObj.class}, Void.TYPE).isSupported || OrderCouponListFragment.this.f73976k == null) {
                return;
            }
            OrderCouponListFragment.this.f73976k.b(OrderCouponListFragment.M3(OrderCouponListFragment.this));
        }

        @Override // com.max.hbwallet.h1.b
        public boolean isValid() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34355p1, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            return OrderCouponListFragment.this.f73967b == 0;
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.l.f34378q1, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            OrderCouponListFragment.O3(OrderCouponListFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<MallCouponListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34400r1, new Class[0], Void.TYPE).isSupported && OrderCouponListFragment.this.isActive()) {
                super.onComplete();
                OrderCouponListFragment.this.f73981p.f131496c.A(0);
                OrderCouponListFragment.this.f73981p.f131496c.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.l.f34422s1, new Class[]{Throwable.class}, Void.TYPE).isSupported && OrderCouponListFragment.this.isActive()) {
                super.onError(th2);
                OrderCouponListFragment.Q3(OrderCouponListFragment.this);
                OrderCouponListFragment.this.f73981p.f131496c.A(0);
                OrderCouponListFragment.this.f73981p.f131496c.p(0);
            }
        }

        public void onNext(Result<MallCouponListResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.l.f34444t1, new Class[]{Result.class}, Void.TYPE).isSupported && OrderCouponListFragment.this.isActive()) {
                super.onNext(result);
                if (OrderCouponListFragment.this.f73976k != null) {
                    OrderCouponListFragment.this.f73976k.j0(result.getResult());
                }
                OrderCouponListFragment.R3(OrderCouponListFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.l.f34466u1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallCouponListResultObj>) obj);
        }
    }

    public interface d {
        void b(List<MallCouponObj> list);

        MallCouponListResultObj c0();

        void j0(MallCouponListResultObj mallCouponListResultObj);
    }

    static /* synthetic */ List M3(OrderCouponListFragment orderCouponListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{orderCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.f34240k1, new Class[]{OrderCouponListFragment.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : orderCouponListFragment.S3();
    }

    static /* synthetic */ void O3(OrderCouponListFragment orderCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{orderCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.f34263l1, new Class[]{OrderCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        orderCouponListFragment.T3();
    }

    static /* synthetic */ void Q3(OrderCouponListFragment orderCouponListFragment) {
        if (PatchProxy.proxy(new Object[]{orderCouponListFragment}, null, changeQuickRedirect, true, bb.c.l.f34286m1, new Class[]{OrderCouponListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        orderCouponListFragment.showError();
    }

    static /* synthetic */ void R3(OrderCouponListFragment orderCouponListFragment, MallCouponListResultObj mallCouponListResultObj) {
        if (PatchProxy.proxy(new Object[]{orderCouponListFragment, mallCouponListResultObj}, null, changeQuickRedirect, true, bb.c.l.f34309n1, new Class[]{OrderCouponListFragment.class, MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        orderCouponListFragment.X3(mallCouponListResultObj);
    }

    private List<MallCouponObj> S3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10008, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (MallCouponObj mallCouponObj : this.f73978m) {
            if (mallCouponObj.isChecked()) {
                arrayList.add(mallCouponObj);
            }
        }
        return arrayList;
    }

    private void T3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10009, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) (this.f73973h != null ? ce.b.a().m(this.f73973h, this.f73974i) : ce.b.a().A(this.f73968c, this.f73969d, this.f73970e, this.f73971f, this.f73972g)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void U3() {
        ProgressDialog progressDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10012, new Class[0], Void.TYPE).isSupported || !isActive() || this.mContext.isFinishing() || (progressDialog = this.f73980o) == null) {
            return;
        }
        progressDialog.dismiss();
    }

    public static OrderCouponListFragment V3(int i10, String str, int i11, ArrayList<MallCouponObj> arrayList) {
        Object[] objArr = {new Integer(i10), str, new Integer(i11), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 10000, new Class[]{cls, String.class, cls, ArrayList.class}, OrderCouponListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (OrderCouponListFragment) patchProxyResultProxy.result;
        }
        OrderCouponListFragment orderCouponListFragment = new OrderCouponListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i10);
        bundle.putInt("count", i11);
        bundle.putString("sku_id", str);
        bundle.putSerializable("checked_item_list", arrayList);
        orderCouponListFragment.setArguments(bundle);
        return orderCouponListFragment;
    }

    public static OrderCouponListFragment W3(int i10, String str, String str2, ArrayList<MallCouponObj> arrayList, String str3, String str4, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), str, str2, arrayList, str3, str4, str5}, null, changeQuickRedirect, true, 10001, new Class[]{Integer.TYPE, String.class, String.class, ArrayList.class, String.class, String.class, String.class}, OrderCouponListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (OrderCouponListFragment) patchProxyResultProxy.result;
        }
        OrderCouponListFragment orderCouponListFragment = new OrderCouponListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i10);
        bundle.putString(f73959r, str);
        bundle.putString("order_id", str2);
        bundle.putSerializable("checked_item_list", arrayList);
        bundle.putString(f73962u, str3);
        bundle.putString(f73963v, str4);
        bundle.putString(f73964w, str5);
        orderCouponListFragment.setArguments(bundle);
        return orderCouponListFragment;
    }

    private void X3(MallCouponListResultObj mallCouponListResultObj) {
        if (PatchProxy.proxy(new Object[]{mallCouponListResultObj}, this, changeQuickRedirect, false, 10010, new Class[]{MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (mallCouponListResultObj != null) {
            this.f73978m.clear();
            if (mallCouponListResultObj.getList() != null) {
                for (MallCouponCategoryObj mallCouponCategoryObj : mallCouponListResultObj.getList()) {
                    boolean z10 = "valid".equals(mallCouponCategoryObj.getKey()) && this.f73967b == 0;
                    boolean z11 = "invalid".equals(mallCouponCategoryObj.getKey()) && 1 == this.f73967b;
                    if (z10 || z11) {
                        boolean z12 = false;
                        for (MallCouponObj mallCouponObj : mallCouponCategoryObj.getList()) {
                            ArrayList<MallCouponObj> arrayList = this.f73975j;
                            if (arrayList != null && arrayList.size() > 0) {
                                for (MallCouponObj mallCouponObj2 : this.f73975j) {
                                    if (mallCouponObj.getCoupon_id() != null && mallCouponObj.getCoupon_id().equals(mallCouponObj2.getCoupon_id())) {
                                        mallCouponObj.setChecked(true);
                                    } else if (mallCouponObj.getCoupon_pool_id() != null && mallCouponObj.getCoupon_pool_id().equals(mallCouponObj2.getCoupon_pool_id()) && !z12) {
                                        mallCouponObj.setChecked(true);
                                        z12 = true;
                                    }
                                }
                            }
                            this.f73978m.add(mallCouponObj);
                        }
                    }
                }
            }
        }
        this.f73977l.notifyDataSetChanged();
        if (this.f73978m.isEmpty()) {
            showEmpty();
        } else {
            showContentView();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10007, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        MallCouponListResultObj mallCouponListResultObjC0 = this.f73976k.c0();
        if (mallCouponListResultObjC0 != null) {
            X3(mallCouponListResultObjC0);
        } else {
            T3();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 10004, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        mb.b1 b1VarC = mb.b1.c(this.mInflater);
        this.f73981p = b1VarC;
        setContentView(b1VarC);
        if (getArguments() != null) {
            this.f73967b = getArguments().getInt("type");
            this.f73968c = getArguments().getString(f73959r);
            this.f73969d = getArguments().getString("order_id");
            this.f73975j = (ArrayList) getArguments().getSerializable("checked_item_list");
            this.f73970e = getArguments().getString(f73962u);
            this.f73971f = getArguments().getString(f73963v);
            this.f73972g = getArguments().getString(f73964w);
            this.f73973h = getArguments().getString("sku_id");
            this.f73974i = getArguments().getInt("count", 1);
        }
        h1 h1Var = new h1(this.mContext, this.f73978m);
        this.f73977l = h1Var;
        h1Var.D(new a());
        this.f73981p.f131495b.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.f73981p.f131495b.setBackgroundResource(R.color.background_layer_2_color);
        this.f73981p.f131495b.setAdapter(this.f73977l);
        this.f73981p.f131495b.setPadding(0, ViewUtils.f(this.mContext, 10.0f), 0, 0);
        this.f73981p.f131495b.setClipToPadding(false);
        this.f73981p.f131496c.S(new b());
        this.f73981p.f131496c.b0(false);
        if (this.mIsFirst) {
            showLoading();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 10002, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof d) {
            this.f73976k = (d) getParentFragment();
            return;
        }
        if (context instanceof d) {
            this.f73976k = (d) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement CouponListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10003, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f73976k = null;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10011, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        T3();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10005, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f73979n = refreshBroadcastReceiver;
        registerReceiver(refreshBroadcastReceiver, lb.a.C);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f73979n);
    }

    @Override // com.max.hbwallet.t
    public void z() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10013, new Class[0], Void.TYPE).isSupported || (context = getContext()) == null) {
            return;
        }
        context.sendBroadcast(new Intent(lb.a.C));
    }
}
