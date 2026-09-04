package com.max.xiaoheihe.module.favour;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.NewFilterObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.gc0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CYPageActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
@ig.d(path = {lb.d.I1})
public final class CYPageActivity extends BaseActivity {
    public static final int R = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private gc0 L;
    private TabLayout M;
    private ViewPager2 N;
    private FragmentStateAdapter O;

    @dl.d
    private final HashMap<Integer, Fragment> P = new HashMap<>();

    @dl.d
    private final ArrayList<NewFilterObj> Q = CollectionsKt__CollectionsKt.r(new NewFilterObj("0", null, "CY顺序"));

    /* JADX INFO: compiled from: CYPageActivity.kt */
    public static final class a extends com.max.hbcommon.network.d<BBSUserMsgResult<List<? extends BBSUserMsgObj>>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void a(@dl.d BBSUserMsgResult<List<BBSUserMsgObj>> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 31535, new Class[]{BBSUserMsgResult.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(t10, "t");
            if (CYPageActivity.this.isActive()) {
                List<NewFilterObj> filter_list = t10.getFilter_list();
                if (filter_list != null) {
                    CYPageActivity cYPageActivity = CYPageActivity.this;
                    cYPageActivity.Q.clear();
                    cYPageActivity.Q.addAll(filter_list);
                }
                CYPageActivity.Q1(CYPageActivity.this);
                CYPageActivity.O1(CYPageActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 31536, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (CYPageActivity.this.isActive()) {
                CYPageActivity.R1(CYPageActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31537, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((BBSUserMsgResult) obj);
        }
    }

    /* JADX INFO: compiled from: CYPageActivity.kt */
    public static final class b extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31539, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            com.max.xiaoheihe.module.favour.c cVarA = com.max.xiaoheihe.module.favour.c.P.a(((NewFilterObj) CYPageActivity.this.Q.get(i10)).getKey());
            CYPageActivity.this.P.put(Integer.valueOf(i10), cVarA);
            return cVarA;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31538, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : CYPageActivity.this.Q.size();
        }
    }

    /* JADX INFO: compiled from: CYPageActivity.kt */
    public static final class c implements com.google.android.material.tabs.d.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.google.android.material.tabs.d.b
        public final void a(@dl.d TabLayout.h tab, int i10) {
            String text;
            if (PatchProxy.proxy(new Object[]{tab, new Integer(i10)}, this, changeQuickRedirect, false, 31540, new Class[]{TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tab, "tab");
            String str = "";
            if (i10 >= 0 && i10 < CYPageActivity.this.Q.size() && (text = ((NewFilterObj) CYPageActivity.this.Q.get(i10)).getText()) != null) {
                str = text;
            }
            tab.D(str);
        }
    }

    public static final /* synthetic */ void O1(CYPageActivity cYPageActivity) {
        if (PatchProxy.proxy(new Object[]{cYPageActivity}, null, changeQuickRedirect, true, 31533, new Class[]{CYPageActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        cYPageActivity.V1();
    }

    public static final /* synthetic */ void Q1(CYPageActivity cYPageActivity) {
        if (PatchProxy.proxy(new Object[]{cYPageActivity}, null, changeQuickRedirect, true, 31532, new Class[]{CYPageActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        cYPageActivity.x1();
    }

    public static final /* synthetic */ void R1(CYPageActivity cYPageActivity) {
        if (PatchProxy.proxy(new Object[]{cYPageActivity}, null, changeQuickRedirect, true, 31534, new Class[]{CYPageActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        cYPageActivity.C1();
    }

    private final void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31530, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String userid = i0.o().getAccount_detail().getUserid();
        if (userid == null) {
            userid = "-1";
        }
        V((io.reactivex.disposables.b) eVarA.V5(userid, 0, 30, "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a()));
    }

    private final void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31531, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O = new b(getSupportFragmentManager(), getLifecycle());
        ViewPager2 viewPager2 = this.N;
        TabLayout tabLayout = null;
        if (viewPager2 == null) {
            f0.S("mViewPager");
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(3);
        ViewPager2 viewPager3 = this.N;
        if (viewPager3 == null) {
            f0.S("mViewPager");
            viewPager3 = null;
        }
        FragmentStateAdapter fragmentStateAdapter = this.O;
        if (fragmentStateAdapter == null) {
            f0.S("mPagerAdapter");
            fragmentStateAdapter = null;
        }
        viewPager3.setAdapter(fragmentStateAdapter);
        TabLayout tabLayout2 = this.M;
        if (tabLayout2 == null) {
            f0.S("mTabLayout");
            tabLayout2 = null;
        }
        ViewPager2 viewPager4 = this.N;
        if (viewPager4 == null) {
            f0.S("mViewPager");
            viewPager4 = null;
        }
        new com.google.android.material.tabs.d(tabLayout2, viewPager4, new c()).a();
        if (this.Q.size() < 2) {
            TabLayout tabLayout3 = this.M;
            if (tabLayout3 == null) {
                f0.S("mTabLayout");
            } else {
                tabLayout = tabLayout3;
            }
            tabLayout.setVisibility(8);
            return;
        }
        TabLayout tabLayout4 = this.M;
        if (tabLayout4 == null) {
            f0.S("mTabLayout");
        } else {
            tabLayout = tabLayout4;
        }
        tabLayout.setVisibility(0);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31529, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.k1();
        gc0 gc0VarC = gc0.c(getLayoutInflater());
        f0.o(gc0VarC, "inflate(layoutInflater)");
        this.L = gc0VarC;
        this.f66616q.setTitle("CY");
        gc0 gc0Var = this.L;
        if (gc0Var == null) {
            f0.S("binding");
            gc0Var = null;
        }
        setContentView(gc0Var.b());
        gc0 gc0Var2 = this.L;
        if (gc0Var2 == null) {
            f0.S("binding");
            gc0Var2 = null;
        }
        ViewPager2 viewPager2 = gc0Var2.f110938c;
        f0.o(viewPager2, "binding.vp");
        this.N = viewPager2;
        gc0 gc0Var3 = this.L;
        if (gc0Var3 == null) {
            f0.S("binding");
            gc0Var3 = null;
        }
        TabLayout tabLayout = gc0Var3.f110937b;
        f0.o(tabLayout, "binding.tab");
        this.M = tabLayout;
        E1();
        this.f66617r.setVisibility(0);
        this.f66617r.setBackgroundColor(androidx.core.content.res.i.e(getResources(), R.color.divider_secondary_2_color, null));
        ViewGroup.LayoutParams layoutParams = this.f66617r.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ViewUtils.f(getViewContext(), 4.0f);
        }
        getWindow().setFormat(-3);
        t.h0(getWindow());
        t.M(this.f66601b, true);
        int iN = t.n(this.f66601b);
        View viewZ0 = Z0();
        f0.n(viewZ0, "null cannot be cast to non-null type android.view.ViewGroup");
        t.c(iN, (ViewGroup) viewZ0, null);
        T1();
    }
}
