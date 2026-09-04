package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeOrderActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeOrderActivity extends BaseActivity {

    @dl.d
    public static final a Q = new a(null);
    public static final int R = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private ViewPager L;
    public SlidingTabLayout M;

    @dl.e
    private androidx.viewpager.widget.a N;

    @dl.e
    private TradeMsgBroadcastReceiver O;
    private int P;

    /* JADX INFO: compiled from: TradeOrderActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, Integer num, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, num, new Integer(i10), obj}, null, changeQuickRedirect, true, 45461, new Class[]{a.class, Context.class, Integer.class, Integer.TYPE, Object.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            if ((i10 & 2) != 0) {
                num = 0;
            }
            return aVar.a(context, num);
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.e Integer num) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, num}, this, changeQuickRedirect, false, 45460, new Class[]{Context.class, Integer.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) TradeOrderActivity.class);
            intent.putExtra("prefer_page", num);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeOrderActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45462, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return i10 == 0 ? TradeOrderListFragment.f93089n.b(false) : TradeOrderListFragment.f93089n.b(true);
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            return i10 == 0 ? "购买订单" : "出售订单";
        }
    }

    @dl.d
    public final SlidingTabLayout M1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45456, new Class[0], SlidingTabLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SlidingTabLayout) patchProxyResultProxy.result;
        }
        SlidingTabLayout slidingTabLayout = this.M;
        if (slidingTabLayout != null) {
            return slidingTabLayout;
        }
        f0.S("mSlidingTabLayout");
        return null;
    }

    @dl.e
    public final ViewPager N1() {
        return this.L;
    }

    public final void O1(@dl.d SlidingTabLayout slidingTabLayout) {
        if (PatchProxy.proxy(new Object[]{slidingTabLayout}, this, changeQuickRedirect, false, 45457, new Class[]{SlidingTabLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(slidingTabLayout, "<set-?>");
        this.M = slidingTabLayout;
    }

    public final void Q1(@dl.e ViewPager viewPager) {
        this.L = viewPager;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45458, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.L = (ViewPager) findViewById(R.id.vp);
        this.P = getIntent().getIntExtra("prefer_page", 0);
        this.f66616q.a0();
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        TitleBar mTitleBar = this.f66616q;
        f0.o(mTitleBar, "mTitleBar");
        TradeInfoUtilKt.I(mContext, mTitleBar);
        TitleBar mTitleBar2 = this.f66616q;
        f0.o(mTitleBar2, "mTitleBar");
        TradeMsgBroadcastReceiver tradeMsgBroadcastReceiver = new TradeMsgBroadcastReceiver(mTitleBar2, false, 2, null);
        this.O = tradeMsgBroadcastReceiver;
        registerReceiver(tradeMsgBroadcastReceiver, new IntentFilter(lb.a.N));
        SlidingTabLayout titleTabLayout = this.f66616q.getTitleTabLayout();
        f0.o(titleTabLayout, "mTitleBar.titleTabLayout");
        O1(titleTabLayout);
        this.N = new b(getSupportFragmentManager());
        ViewPager viewPager = this.L;
        f0.m(viewPager);
        viewPager.setAdapter(this.N);
        M1().setViewPager(this.L);
        ViewPager viewPager2 = this.L;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(this.P);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45459, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        unregisterReceiver(this.O);
    }
}
