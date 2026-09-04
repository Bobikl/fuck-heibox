package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeFeedbackActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradeFeedbackActivity extends BaseActivity {

    @dl.d
    public static final a P = new a(null);
    public static final int Q = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private SlidingTabLayout L;

    @dl.e
    private ViewPager M;

    @dl.d
    private final ArrayList<Fragment> N = new ArrayList<>();
    private int O;

    /* JADX INFO: compiled from: TradeFeedbackActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.e
        public final Intent a(@dl.e Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 45156, new Class[]{Context.class}, Intent.class);
            return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) TradeFeedbackActivity.class);
        }

        @dl.e
        public final Intent b(@dl.e Context context, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, 45157, new Class[]{Context.class, Integer.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) TradeFeedbackActivity.class);
            intent.putExtra("prefer_page", i10);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeFeedbackActivity.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45159, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeFeedbackActivity.this.N.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45158, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Object obj = TradeFeedbackActivity.this.N.get(i10);
            f0.o(obj, "mFragments[position]");
            return (Fragment) obj;
        }
    }

    private final void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45155, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.clear();
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(lb.a.B3).p(WebviewFragment.U4).u(true).a();
        WebviewFragment webviewFragmentA2 = new com.max.xiaoheihe.module.webview.u(lb.a.E2).p(WebviewFragment.U4).u(true).a();
        this.N.add(webviewFragmentA);
        if (i0.s()) {
            this.N.add(webviewFragmentA2);
        }
        ViewPager viewPager = this.M;
        f0.m(viewPager);
        viewPager.setAdapter(new b(getSupportFragmentManager()));
        SlidingTabLayout slidingTabLayout = this.L;
        f0.m(slidingTabLayout);
        slidingTabLayout.setViewPager(this.M, i0.s() ? new String[]{getString(R.string.faq_center), getString(R.string.my_order_list)} : new String[]{getString(R.string.faq_center)});
        SlidingTabLayout slidingTabLayout2 = this.L;
        f0.m(slidingTabLayout2);
        slidingTabLayout2.setCurrentTab(this.O);
    }

    @dl.e
    public final SlidingTabLayout N1() {
        return this.L;
    }

    @dl.e
    public final ViewPager O1() {
        return this.M;
    }

    public final void R1(@dl.e SlidingTabLayout slidingTabLayout) {
        this.L = slidingTabLayout;
    }

    public final void T1(@dl.e ViewPager viewPager) {
        this.M = viewPager;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45154, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.O = getIntent().getIntExtra("prefer_page", 0);
        this.M = (ViewPager) findViewById(R.id.vp);
        this.f66616q.a0();
        this.L = this.f66616q.getTitleTabLayout();
        Q1();
    }
}
