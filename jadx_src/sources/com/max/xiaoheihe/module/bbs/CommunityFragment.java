package com.max.xiaoheihe.module.bbs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.adapter.OneTimeValidExposureViewWatcher;
import com.max.hbcustomview.EZTabLayout;
import com.max.hbcustomview.viewpager.SwipeableViewPager;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.bean.account.tab.TabKeyObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.module.game.GameCenterActivity;
import com.max.xiaoheihe.module.news.CommunityRecommendFragment;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.d70;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.J)
public class CommunityFragment extends com.max.hbcommon.base.d implements LinkListV2Fragment.i, com.max.xiaoheihe.view.callback.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f79752g = "pages";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f79753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager.widget.a f79754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NewMsgBroadcastReceiver f79755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d70 f79756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f79757f;

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(CommunityFragment communityFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 26192, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (lb.a.f131025q.equals(action)) {
                CommunityFragment.T3(CommunityFragment.this);
                return;
            }
            if (lb.a.F.equals(action)) {
                MainActivity.O3(CommunityFragment.this.f79756e.f109681b.f131574f, CommunityFragment.this.f79756e.f109681b.f131570b);
                return;
            }
            if ("com.max.xiaoheihe.bbs.gotop".equals(action)) {
                CommunityFragment.this.D3();
            } else if ("com.max.xiaoheihe.concept.channel".equals(action)) {
                CommunityFragment.this.c4();
            } else if (lb.a.E.equals(action)) {
                CommunityFragment.U3(CommunityFragment.this);
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26185, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.x0(((com.max.hbcommon.base.d) CommunityFragment.this).mContext, SearchHelper.c().e("main")).A();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26186, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.R1(((com.max.hbcommon.base.d) CommunityFragment.this).mContext);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26187, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MainActivity.f76157j5 = MainActivity.f76155i5;
            com.max.hbcache.c.C("mobile_tap_time", String.valueOf(MainActivity.f76155i5));
            ((com.max.hbcommon.base.d) CommunityFragment.this).mContext.sendBroadcast(new Intent(lb.a.F));
            CommunityFragment communityFragment = CommunityFragment.this;
            communityFragment.startActivity(GameCenterActivity.N1(((com.max.hbcommon.base.d) communityFragment).mContext, GameCenterActivity.V));
        }
    }

    public class d extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26189, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.xiaoheihe.utils.c0.f().getLegalKeyNum();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26188, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : com.max.xiaoheihe.utils.c0.c(com.max.xiaoheihe.utils.c0.f().getLegalEntry(i10).getKey(), CommunityFragment.this.f79753b);
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26190, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : com.max.xiaoheihe.utils.c0.f().getLegalEntry(i10).getTitle();
        }
    }

    public class e implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26191, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == CommunityFragment.this.f79757f) {
                CommunityFragment.this.f79756e.f109681b.f131576h.w(i10).q(false);
                com.max.hbcache.c.z("write_box_dot_shown", "1");
            }
        }
    }

    static /* synthetic */ void T3(CommunityFragment communityFragment) {
        if (PatchProxy.proxy(new Object[]{communityFragment}, null, changeQuickRedirect, true, 26183, new Class[]{CommunityFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        communityFragment.b4();
    }

    static /* synthetic */ void U3(CommunityFragment communityFragment) {
        if (PatchProxy.proxy(new Object[]{communityFragment}, null, changeQuickRedirect, true, 26184, new Class[]{CommunityFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        communityFragment.e4();
    }

    private void V3() {
        List<Fragment> listJ0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26175, new Class[0], Void.TYPE).isSupported || (listJ0 = getChildFragmentManager().J0()) == null) {
            return;
        }
        String strP3 = MainActivity.p3(this.f79753b, 0);
        String[] strArrR3 = MainActivity.r3(this.f79753b, 1);
        for (Fragment fragment : listJ0) {
            if ("/home/recommend".equals(strP3) && (fragment instanceof CommunityRecommendFragment)) {
                ((CommunityRecommendFragment) fragment).O3(strArrR3);
            }
        }
    }

    private int Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26172, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String strP3 = MainActivity.p3(this.f79753b, 0);
        if (strP3 == null) {
            strP3 = com.max.xiaoheihe.utils.c0.f().getDefault_checked_key();
        }
        return Math.max(0, com.max.xiaoheihe.utils.c0.i(strP3)[1].intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean Z3(EZTabLayout.c cVar, View view, View view2, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, view, view2, motionEvent}, this, changeQuickRedirect, false, 26182, new Class[]{EZTabLayout.c.class, View.class, View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        int currentItem = this.f79756e.f109682c.getCurrentItem();
        if (currentItem == cVar.f()) {
            D3();
            TabKeyObj legalEntry = com.max.xiaoheihe.utils.c0.f() != null ? com.max.xiaoheihe.utils.c0.f().getLegalEntry(currentItem) : null;
            String title = legalEntry == null ? "" : legalEntry.getTitle();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("tab_title", title);
            jsonObject.addProperty("page", lb.d.J);
            com.max.hbcommon.analytics.d.d("4", lb.d.f131162g, null, jsonObject);
        }
        view.performClick();
        return true;
    }

    public static CommunityFragment a4(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 26169, new Class[]{String[].class}, CommunityFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommunityFragment) patchProxyResultProxy.result;
        }
        CommunityFragment communityFragment = new CommunityFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("pages", strArr);
        communityFragment.setArguments(bundle);
        return communityFragment;
    }

    private void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26176, new Class[0], Void.TYPE).isSupported || this.f79756e.f109681b.f131575g == null) {
            return;
        }
        if (com.max.xiaoheihe.utils.i0.s() && com.max.hbcache.c.v()) {
            this.f79756e.f109681b.f131575g.setVisibility(0);
        } else {
            this.f79756e.f109681b.f131575g.setVisibility(8);
        }
    }

    private boolean d4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26171, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (int i10 = 0; i10 < com.max.xiaoheihe.utils.c0.f().getLegalKeyNum(); i10++) {
            if ("/bbs/web_writebox".equals(com.max.xiaoheihe.utils.c0.f().getLegalEntry(i10).getKey())) {
                return true;
            }
        }
        return false;
    }

    private void e4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26178, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Object objInstantiateItem = this.f79754c.instantiateItem((ViewGroup) this.f79756e.f109682c, 0);
        if (objInstantiateItem instanceof LinkListV2Fragment) {
            ((LinkListV2Fragment) objInstantiateItem).x4();
        } else if (objInstantiateItem instanceof CommunityRecommendFragment) {
            ((CommunityRecommendFragment) objInstantiateItem).T3();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26179, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f79754c;
        SwipeableViewPager swipeableViewPager = this.f79756e.f109682c;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) swipeableViewPager, swipeableViewPager.getCurrentItem());
        if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
            ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.LinkListV2Fragment.i
    public String N() {
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.LinkListV2Fragment.i
    public void W0(BBSLinkListResultObj bBSLinkListResultObj) {
    }

    public void W3(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 26173, new Class[]{String[].class}, Void.TYPE).isSupported) {
            return;
        }
        X3(strArr, true);
    }

    public void X3(String[] strArr, boolean z10) {
        SwipeableViewPager swipeableViewPager;
        if (PatchProxy.proxy(new Object[]{strArr, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 26174, new Class[]{String[].class, Boolean.TYPE}, Void.TYPE).isSupported || (swipeableViewPager = this.f79756e.f109682c) == null) {
            return;
        }
        this.f79753b = strArr;
        swipeableViewPager.setCurrentItem(Y3());
        if (z10) {
            V3();
        }
    }

    public void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26180, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79756e.f109682c.setCurrentItem(2, true);
    }

    @Override // com.max.xiaoheihe.module.bbs.LinkListV2Fragment.i
    public void f(View view, int i10, int i11) {
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26170, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        a aVar = null;
        d70 d70VarD = d70.d(this.mInflater, null, false);
        this.f79756e = d70VarD;
        setContentView(d70VarD);
        com.max.hbutils.utils.t.c(com.max.hbutils.utils.t.n(this.mContext), (ViewGroup) view, null);
        if (getArguments() != null) {
            this.f79753b = getArguments().getStringArray("pages");
        }
        b4();
        mb.i0 i0Var = this.f79756e.f109681b;
        MainActivity.O3(i0Var.f131574f, i0Var.f131570b);
        this.f79756e.f109681b.f131573e.setOnClickListener(new a());
        this.f79756e.f109681b.f131571c.setOnClickListener(new b());
        this.f79756e.f109681b.f131570b.setOnClickListener(new c());
        boolean z10 = !com.max.hbcommon.utils.c.x(com.max.hbcache.c.j("write_box_dot_shown"));
        this.f79757f = com.max.xiaoheihe.utils.c0.f().getLegalEntryIndex("/bbs/web_writebox");
        this.f79754c = new d(getChildFragmentManager());
        this.f79756e.f109682c.setOffscreenPageLimit(2);
        this.f79756e.f109682c.setAdapter(this.f79754c);
        d70 d70Var = this.f79756e;
        d70Var.f109681b.f131576h.setupWithViewPager(d70Var.f109682c);
        if (!ad.a.a(ad.a.H, false)) {
            for (int i10 = 0; i10 < this.f79756e.f109681b.f131576h.getTabCount(); i10++) {
                final EZTabLayout.c cVarW = this.f79756e.f109681b.f131576h.w(i10);
                if (cVarW != null) {
                    final EZTabLayout.EZTabView eZTabView = cVarW.f68461g;
                    eZTabView.setOnTouchListener(new View.OnTouchListener() { // from class: com.max.xiaoheihe.module.bbs.h
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return this.f81199b.Z3(cVarW, eZTabView, view2, motionEvent);
                        }
                    });
                }
            }
        }
        new OneTimeValidExposureViewWatcher(this, this.f79756e.f109682c);
        if (d4() && z10) {
            this.f79756e.f109682c.c(new e());
            this.f79756e.f109681b.f131576h.w(this.f79757f).q(true);
        }
        this.f79755d = new NewMsgBroadcastReceiver(this, aVar);
        X3(this.f79753b, false);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(lb.a.f131025q);
        intentFilter.addAction(lb.a.F);
        intentFilter.addAction("com.max.xiaoheihe.concept.channel");
        intentFilter.addAction("com.max.xiaoheihe.bbs.gotop");
        intentFilter.addAction(lb.a.E);
        registerReceiver(this.f79755d, intentFilter);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26181, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79754c = null;
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26177, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        unregisterReceiver(this.f79755d);
    }
}
