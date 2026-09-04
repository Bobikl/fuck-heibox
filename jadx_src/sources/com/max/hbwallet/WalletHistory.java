package com.max.hbwallet;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: compiled from: WalletHistory.kt */
/* JADX INFO: loaded from: classes2.dex */
@ig.d(path = {lb.d.f131228p2})
public final class WalletHistory extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    private static final int R = 0;
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 3;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private androidx.viewpager.widget.a L;
    private ViewPager M;
    private SlidingTabLayout N;
    private int O;

    @dl.d
    private ArrayList<Integer> P = new ArrayList<>();

    /* JADX INFO: compiled from: WalletHistory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: WalletHistory.kt */
    public static final class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34467u2, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : WalletHistory.this.P.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34445t2, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            WalletHistory walletHistory = WalletHistory.this;
            Object obj = walletHistory.P.get(i10);
            kotlin.jvm.internal.f0.o(obj, "get(...)");
            return WalletHistory.M1(walletHistory, ((Number) obj).intValue());
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34489v2, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            WalletHistory walletHistory = WalletHistory.this;
            Object obj = walletHistory.P.get(i10);
            kotlin.jvm.internal.f0.o(obj, "get(...)");
            return WalletHistory.O1(walletHistory, ((Number) obj).intValue());
        }
    }

    public static final /* synthetic */ Fragment M1(WalletHistory walletHistory, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletHistory, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.f34401r2, new Class[]{WalletHistory.class, Integer.TYPE}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : walletHistory.Q1(i10);
    }

    public static final /* synthetic */ String O1(WalletHistory walletHistory, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{walletHistory, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.l.f34423s2, new Class[]{WalletHistory.class, Integer.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : walletHistory.R1(i10);
    }

    private final Fragment Q1(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.f34379q2, new Class[]{Integer.TYPE}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        if (i10 == 1) {
            c1 c1VarC4 = c1.c4();
            kotlin.jvm.internal.f0.o(c1VarC4, "hcoinInstance(...)");
            return c1VarC4;
        }
        if (i10 == 2) {
            c1 c1VarG4 = c1.g4();
            kotlin.jvm.internal.f0.o(c1VarG4, "profitInstance(...)");
            return c1VarG4;
        }
        if (i10 == 3) {
            return s.f74246h.a();
        }
        c1 c1VarB4 = c1.b4();
        kotlin.jvm.internal.f0.o(c1VarB4, "hcashInstance(...)");
        return c1VarB4;
    }

    private final String R1(int i10) {
        if (i10 == 1) {
            return "H币";
        }
        if (i10 != 2) {
            return i10 != 3 ? "余额" : "卡券";
        }
        return "收益";
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34356p2, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.hbwallet_fragment_history);
        int intExtra = getIntent().getIntExtra("page_index", 0);
        View viewFindViewById = findViewById(R.id.vp);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(...)");
        this.M = (ViewPager) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tab);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(...)");
        this.N = (SlidingTabLayout) viewFindViewById2;
        this.P.add(0);
        this.P.add(1);
        this.P.add(2);
        this.P.add(3);
        this.O = this.P.contains(Integer.valueOf(intExtra)) ? this.P.indexOf(Integer.valueOf(intExtra)) : 0;
        this.f66616q.setTitle("明细");
        this.L = new b(getSupportFragmentManager());
        ViewPager viewPager = this.M;
        ViewPager viewPager2 = null;
        if (viewPager == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
            viewPager = null;
        }
        viewPager.setAdapter(this.L);
        ViewPager viewPager3 = this.M;
        if (viewPager3 == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
            viewPager3 = null;
        }
        viewPager3.setOffscreenPageLimit(3);
        SlidingTabLayout slidingTabLayout = this.N;
        if (slidingTabLayout == null) {
            kotlin.jvm.internal.f0.S("mSlidingTabLayout");
            slidingTabLayout = null;
        }
        ViewPager viewPager4 = this.M;
        if (viewPager4 == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
            viewPager4 = null;
        }
        slidingTabLayout.setViewPager(viewPager4);
        ViewPager viewPager5 = this.M;
        if (viewPager5 == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
        } else {
            viewPager2 = viewPager5;
        }
        viewPager2.setCurrentItem(this.O);
    }
}
