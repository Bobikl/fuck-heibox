package com.max.hbwallet;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OrderCouponListActivity extends BaseActivity implements OrderCouponListFragment.d {
    public static final int V = 10;
    public static final String W = "coupon_list";
    private static final String X = "cat";
    private static final String Y = "order_id";
    private static final String Z = "checked_item_list";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f73949a0 = "purchase_code";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f73950b0 = "coupon_type";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f73951c0 = "coupon_sku_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f73952p1 = "sku_id";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f73953x1 = "count";
    private String L;
    private String M;
    private String N;
    private String O;
    private ArrayList<MallCouponObj> Q;
    private androidx.viewpager.widget.a R;
    private mb.e1 T;
    MallCouponListResultObj U;
    private int P = 1;
    private ArrayList<MallCouponObj> S = new ArrayList<>();

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.l.U0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.l().k(((BaseActivity) OrderCouponListActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    public class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f73955l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f73956m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FragmentManager fragmentManager, String str, String str2) {
            super(fragmentManager);
            this.f73955l = str;
            this.f73956m = str2;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.V0, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                return OrderCouponListActivity.this.O != null ? OrderCouponListFragment.V3(0, OrderCouponListActivity.this.O, OrderCouponListActivity.this.P, OrderCouponListActivity.this.Q) : OrderCouponListFragment.W3(0, OrderCouponListActivity.this.L, OrderCouponListActivity.this.M, OrderCouponListActivity.this.Q, OrderCouponListActivity.this.N, this.f73955l, this.f73956m);
            }
            return OrderCouponListActivity.this.O != null ? OrderCouponListFragment.V3(1, OrderCouponListActivity.this.O, OrderCouponListActivity.this.P, OrderCouponListActivity.this.Q) : OrderCouponListFragment.W3(1, OrderCouponListActivity.this.L, OrderCouponListActivity.this.M, OrderCouponListActivity.this.Q, OrderCouponListActivity.this.N, this.f73955l, this.f73956m);
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            return i10 == 0 ? "可使用   " : "不可使用   ";
        }
    }

    public static Intent W1(Context context, String str, int i10, ArrayList<MallCouponObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, new Integer(i10), arrayList}, null, changeQuickRedirect, true, 9991, new Class[]{Context.class, String.class, Integer.TYPE, ArrayList.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OrderCouponListActivity.class);
        intent.putExtra("sku_id", str);
        intent.putExtra("count", i10);
        intent.putExtra("checked_item_list", arrayList);
        return intent;
    }

    public static Intent X1(Context context, String str, String str2, ArrayList<MallCouponObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, arrayList}, null, changeQuickRedirect, true, bb.c.l.O0, new Class[]{Context.class, String.class, String.class, ArrayList.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : Y1(context, str, str2, arrayList, null);
    }

    public static Intent Y1(Context context, String str, String str2, ArrayList<MallCouponObj> arrayList, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, arrayList, str3}, null, changeQuickRedirect, true, bb.c.l.P0, new Class[]{Context.class, String.class, String.class, ArrayList.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OrderCouponListActivity.class);
        intent.putExtra(X, str);
        intent.putExtra("order_id", str2);
        intent.putExtra("checked_item_list", arrayList);
        intent.putExtra(f73949a0, str3);
        return intent;
    }

    public static Intent Z1(Context context, String str, String str2, ArrayList<MallCouponObj> arrayList, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, arrayList, str3, str4}, null, changeQuickRedirect, true, bb.c.l.Q0, new Class[]{Context.class, String.class, String.class, ArrayList.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OrderCouponListActivity.class);
        intent.putExtra(X, str);
        intent.putExtra("order_id", str2);
        intent.putExtra("checked_item_list", arrayList);
        intent.putExtra(f73949a0, str3);
        intent.putExtra(f73950b0, "stack");
        intent.putExtra(f73951c0, str4);
        return intent;
    }

    @Override // com.max.hbwallet.OrderCouponListFragment.d
    public void b(List<MallCouponObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.l.T0, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.S.clear();
        if (list != null) {
            this.S.addAll(list);
        }
        Intent intent = new Intent();
        intent.putExtra("coupon_list", this.S);
        setResult(10, intent);
        finish();
    }

    @Override // com.max.hbwallet.OrderCouponListFragment.d
    public MallCouponListResultObj c0() {
        return this.U;
    }

    @Override // com.max.hbwallet.OrderCouponListFragment.d
    public void j0(MallCouponListResultObj mallCouponListResultObj) {
        TextView titleView;
        TextView titleView2;
        if (PatchProxy.proxy(new Object[]{mallCouponListResultObj}, this, changeQuickRedirect, false, bb.c.l.S0, new Class[]{MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.U = mallCouponListResultObj;
        this.R.notifyDataSetChanged();
        if (mallCouponListResultObj != null) {
            if (com.max.hbutils.utils.n.q(mallCouponListResultObj.getValid_count()) > 0 && this.T.f131536b.getTabCount() > 0 && (titleView2 = this.T.f131536b.getTitleView(0)) != null) {
                titleView2.setText("可使用 " + mallCouponListResultObj.getValid_count());
            }
            if (com.max.hbutils.utils.n.q(mallCouponListResultObj.getInvalid_count()) <= 0 || this.T.f131536b.getTabCount() <= 1 || (titleView = this.T.f131536b.getTitleView(1)) == null) {
                return;
            }
            titleView.setText("不可使用 " + mallCouponListResultObj.getInvalid_count());
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.R0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        mb.e1 e1VarC = mb.e1.c(this.f66602c);
        this.T = e1VarC;
        setContentView(e1VarC.b());
        this.T.b().setBackgroundResource(R.color.background_layer_2_color);
        this.L = getIntent().getStringExtra(X);
        this.M = getIntent().getStringExtra("order_id");
        this.Q = (ArrayList) getIntent().getSerializableExtra("checked_item_list");
        this.N = getIntent().getStringExtra(f73949a0);
        this.O = getIntent().getStringExtra("sku_id");
        this.P = getIntent().getIntExtra("count", 1);
        String stringExtra = getIntent().getStringExtra(f73950b0);
        String stringExtra2 = getIntent().getStringExtra(f73951c0);
        this.f66616q.setTitle(getString(R.string.my_coupon));
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new a());
        b bVar = new b(getSupportFragmentManager(), stringExtra, stringExtra2);
        this.R = bVar;
        this.T.f131537c.setAdapter(bVar);
        this.T.f131536b.setVisibility(0);
        this.T.f131537c.setOffscreenPageLimit(2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.T.f131536b.getLayoutParams();
        marginLayoutParams.leftMargin = ViewUtils.f(this.f66601b, 2.0f);
        marginLayoutParams.width = -2;
        this.T.f131536b.setTabPadding(10.0f);
        this.T.f131536b.setTabSpaceEqual(false);
        mb.e1 e1Var = this.T;
        e1Var.f131536b.setViewPager(e1Var.f131537c);
    }
}
