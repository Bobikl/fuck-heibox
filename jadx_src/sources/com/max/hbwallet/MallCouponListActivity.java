package com.max.hbwallet;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.MallCouponObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponListActivity extends BaseActivity implements MallCouponListFragment.k {
    public static final int U = 10;
    public static final String V = "from_other";
    public static final String W = "coupon_list";
    public static final String X = "use_pwd";
    private static final String Y = "from";
    private static final String Z = "cat";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f73888a0 = "order_id";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f73889b0 = "checked_item_list";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f73890c0 = "purchase_code";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private String N;
    private String O;
    private ArrayList<MallCouponObj> P;
    private androidx.viewpager.widget.a Q;
    private ArrayList<MallCouponObj> R = new ArrayList<>();
    private MallCouponListResultObj S;
    private mb.e1 T;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.uC, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ob.a aVar = ob.a.f132240a;
            ob.a.l().k(((BaseActivity) MallCouponListActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    public class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 4;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.vC, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                return MallCouponListFragment.j4(MallCouponListActivity.this.L, "0", MallCouponListActivity.this.M, MallCouponListActivity.this.N, MallCouponListActivity.this.P, MallCouponListActivity.this.O);
            }
            if (i10 == 1) {
                return MallCouponListFragment.j4(MallCouponListActivity.this.L, "1", MallCouponListActivity.this.M, MallCouponListActivity.this.N, MallCouponListActivity.this.P, MallCouponListActivity.this.O);
            }
            return i10 == 2 ? MallCouponListFragment.j4(MallCouponListActivity.this.L, "2", MallCouponListActivity.this.M, MallCouponListActivity.this.N, MallCouponListActivity.this.P, MallCouponListActivity.this.O) : MallCouponListFragment.j4(MallCouponListActivity.this.L, "3", MallCouponListActivity.this.M, MallCouponListActivity.this.N, MallCouponListActivity.this.P, MallCouponListActivity.this.O);
        }
    }

    public static Intent V1(Context context, String str, String str2, String str3, ArrayList<MallCouponObj> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, arrayList}, null, changeQuickRedirect, true, bb.c.k.pC, new Class[]{Context.class, String.class, String.class, String.class, ArrayList.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : W1(context, str, str2, str3, arrayList, null);
    }

    public static Intent W1(Context context, String str, String str2, String str3, ArrayList<MallCouponObj> arrayList, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, arrayList, str4}, null, changeQuickRedirect, true, bb.c.k.qC, new Class[]{Context.class, String.class, String.class, String.class, ArrayList.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MallCouponListActivity.class);
        intent.putExtra("from", str);
        intent.putExtra(Z, str2);
        intent.putExtra("order_id", str3);
        intent.putExtra("checked_item_list", arrayList);
        intent.putExtra(f73890c0, str4);
        return intent;
    }

    @Override // com.max.hbwallet.MallCouponListFragment.k
    public void U1(String str, MallCouponListResultObj mallCouponListResultObj) {
        TextView titleView;
        if (PatchProxy.proxy(new Object[]{str, mallCouponListResultObj}, this, changeQuickRedirect, false, bb.c.k.sC, new Class[]{String.class, MallCouponListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.S = mallCouponListResultObj;
        if (!"0".equals(str) || mallCouponListResultObj == null || com.max.hbutils.utils.n.q(mallCouponListResultObj.getValid_count()) <= 0 || this.T.f131536b.getTabCount() <= 0 || (titleView = this.T.f131536b.getTitleView(0)) == null) {
            return;
        }
        titleView.setText(getString(R.string.unused) + " " + mallCouponListResultObj.getValid_count());
    }

    @Override // com.max.hbwallet.MallCouponListFragment.k
    public void b(List<MallCouponObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.tC, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.R.clear();
        if (list != null) {
            this.R.addAll(list);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.rC, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        mb.e1 e1VarC = mb.e1.c(this.f66602c);
        this.T = e1VarC;
        setContentView(e1VarC.b());
        this.L = getIntent().getStringExtra("from");
        this.M = getIntent().getStringExtra(Z);
        this.N = getIntent().getStringExtra("order_id");
        this.P = (ArrayList) getIntent().getSerializableExtra("checked_item_list");
        this.O = getIntent().getStringExtra(f73890c0);
        this.f66616q.setTitle(getString(R.string.my_coupon));
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new a());
        String[] strArr = {getString(R.string.unused), getString(R.string.used), getString(R.string.expired), getString(R.string.gift_giving_record)};
        b bVar = new b(getSupportFragmentManager());
        this.Q = bVar;
        this.T.f131537c.setAdapter(bVar);
        this.T.f131536b.setVisibility(0);
        this.T.f131537c.setOffscreenPageLimit(2);
        this.T.f131536b.setSaveEnabled(false);
        mb.e1 e1Var = this.T;
        e1Var.f131536b.setViewPager(e1Var.f131537c, strArr);
    }
}
