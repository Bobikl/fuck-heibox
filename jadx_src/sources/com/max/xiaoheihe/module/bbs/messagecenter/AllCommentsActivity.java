package com.max.xiaoheihe.module.bbs.messagecenter;

import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.ia0;
import dl.e;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AllCommentsActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@m(path = lb.d.A4)
@o(parameters = 0)
@ig.d(path = {lb.d.B4})
public final class AllCommentsActivity extends BaseActivity {
    public static final int P = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private SlidingTabLayout L;
    private ia0 M;

    @dl.d
    private final ArrayList<Fragment> N = new ArrayList<>();
    private int O;

    /* JADX INFO: compiled from: AllCommentsActivity.kt */
    public static final class a extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28215, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : AllCommentsActivity.this.N.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 28214, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Object obj = AllCommentsActivity.this.N.get(i10);
            f0.o(obj, "mFragments[position]");
            return (Fragment) obj;
        }
    }

    private final void O1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28213, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.clear();
        d dVarA = d.f81371g.a();
        ia0 ia0Var = null;
        this.N.add(MessageCenterFragment.Q.b("0", null, null));
        this.N.add(dVarA);
        ia0 ia0Var2 = this.M;
        if (ia0Var2 == null) {
            f0.S("binding");
            ia0Var2 = null;
        }
        ia0Var2.f111722b.setAdapter(new a(getSupportFragmentManager()));
        SlidingTabLayout slidingTabLayout = this.L;
        f0.m(slidingTabLayout);
        ia0 ia0Var3 = this.M;
        if (ia0Var3 == null) {
            f0.S("binding");
        } else {
            ia0Var = ia0Var3;
        }
        slidingTabLayout.setViewPager(ia0Var.f111722b, new String[]{getString(R.string.reply_comment), getString(R.string.my_comments)});
        SlidingTabLayout slidingTabLayout2 = this.L;
        f0.m(slidingTabLayout2);
        slidingTabLayout2.setCurrentTab(this.O);
    }

    @e
    public final SlidingTabLayout N1() {
        return this.L;
    }

    public final void Q1(@e SlidingTabLayout slidingTabLayout) {
        this.L = slidingTabLayout;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28212, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ia0 ia0VarC = ia0.c(this.f66602c);
        f0.o(ia0VarC, "inflate(mInflater)");
        this.M = ia0VarC;
        if (ia0VarC == null) {
            f0.S("binding");
            ia0VarC = null;
        }
        setContentView(ia0VarC.b());
        this.f66616q.a0();
        this.f66617r.setVisibility(0);
        this.L = this.f66616q.getTitleTabLayout();
        O1();
    }
}
