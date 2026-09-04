package com.max.xiaoheihe.module.game;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcustomview.EZTabLayout;
import com.max.hbcustomview.viewpager.SwipeableViewPager;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.tab.TabKeyObj;
import com.max.xiaoheihe.flutter.api.FlutterFragmentParent;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.view.callback.a, FlutterFragmentParent {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f84457f = "pages";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f84458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager.widget.a f84459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NewMsgBroadcastReceiver f84460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View.OnClickListener f84461e = new a();

    @BindView(R.id.iv_home_mobile)
    ImageView mHomeMobileImageView;

    @BindView(R.id.iv_home_msg)
    ImageView mHomeMsgImageView;

    @BindView(R.id.iv_home_search)
    ImageView mHomeSearchImageView;

    @BindView(R.id.iv_point_home_mobile)
    ImageView mPointHomeMobileImageView;

    @BindView(R.id.iv_point_home_msg)
    ImageView mPointHomeMsgImageView;

    @BindView(R.id.tl_home)
    EZTabLayout mTabLayout;

    @BindView(R.id.vp)
    SwipeableViewPager mViewPager;

    public class NewMsgBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private NewMsgBroadcastReceiver() {
        }

        /* synthetic */ NewMsgBroadcastReceiver(GameFragment gameFragment, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 33140, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            String action = intent.getAction();
            if (lb.a.f131025q.equals(action)) {
                GameFragment.R3(GameFragment.this);
                return;
            }
            if (lb.a.F.equals(action)) {
                GameFragment gameFragment = GameFragment.this;
                MainActivity.O3(gameFragment.mPointHomeMobileImageView, gameFragment.mHomeMobileImageView);
            } else if ("com.max.xiaoheihe.game.gotop".equals(action)) {
                GameFragment.this.D3();
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33134, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.x0(((com.max.hbcommon.base.d) GameFragment.this).mContext, SearchHelper.c().e("main")).A();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33135, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.R1(((com.max.hbcommon.base.d) GameFragment.this).mContext);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33136, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MainActivity.f76157j5 = MainActivity.f76155i5;
            com.max.hbcache.c.C("mobile_tap_time", String.valueOf(MainActivity.f76155i5));
            ((com.max.hbcommon.base.d) GameFragment.this).mContext.sendBroadcast(new Intent(lb.a.F));
            GameFragment gameFragment = GameFragment.this;
            gameFragment.startActivity(GameCenterActivity.N1(((com.max.hbcommon.base.d) gameFragment).mContext, GameCenterActivity.V));
        }
    }

    public class d extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33138, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : com.max.xiaoheihe.utils.c0.j().getLegalKeyNum();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33137, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : com.max.xiaoheihe.utils.c0.c(com.max.xiaoheihe.utils.c0.j().getLegalEntry(i10).getKey(), GameFragment.this.f84458b);
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33139, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : com.max.xiaoheihe.utils.c0.j().getLegalEntry(i10).getTitle();
        }
    }

    static /* synthetic */ void R3(GameFragment gameFragment) {
        if (PatchProxy.proxy(new Object[]{gameFragment}, null, changeQuickRedirect, true, 33133, new Class[]{GameFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        gameFragment.Y3();
    }

    private void S3() {
        List<Fragment> listJ0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33126, new Class[0], Void.TYPE).isSupported || (listJ0 = getChildFragmentManager().J0()) == null) {
            return;
        }
        for (Fragment fragment : listJ0) {
            if (fragment instanceof t1) {
                ((t1) fragment).D4(U3());
            }
        }
    }

    private KeyDescObj U3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33127, new Class[0], KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (!"/game/rank".equals(MainActivity.p3(this.f84458b, 0))) {
            return null;
        }
        String strP3 = MainActivity.p3(this.f84458b, 1);
        String strP4 = MainActivity.p3(this.f84458b, 2);
        if (strP3 == null) {
            return null;
        }
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setFilter_head(strP3);
        keyDescObj.setList_type(strP4);
        keyDescObj.setSort(MainActivity.p3(this.f84458b, 2));
        return keyDescObj;
    }

    private int V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33124, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String strP3 = MainActivity.p3(this.f84458b, 0);
        if (strP3 == null) {
            strP3 = com.max.xiaoheihe.utils.c0.j().getDefault_checked_key();
        }
        return Math.max(0, com.max.xiaoheihe.utils.c0.i(strP3)[1].intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean W3(EZTabLayout.c cVar, View view, View view2, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar, view, view2, motionEvent}, this, changeQuickRedirect, false, 33132, new Class[]{EZTabLayout.c.class, View.class, View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (motionEvent.getAction() != 1) {
            return true;
        }
        int currentItem = this.mViewPager.getCurrentItem();
        if (currentItem == cVar.f()) {
            D3();
            TabKeyObj legalEntry = com.max.xiaoheihe.utils.c0.j() != null ? com.max.xiaoheihe.utils.c0.j().getLegalEntry(currentItem) : null;
            String title = legalEntry == null ? "" : legalEntry.getTitle();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("tab_title", title);
            jsonObject.addProperty("page", lb.d.f131235q2);
            com.max.hbcommon.analytics.d.d("4", lb.d.f131162g, null, jsonObject);
        }
        view.performClick();
        return true;
    }

    public static GameFragment X3(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 33122, new Class[]{String[].class}, GameFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameFragment) patchProxyResultProxy.result;
        }
        GameFragment gameFragment = new GameFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("pages", strArr);
        gameFragment.setArguments(bundle);
        return gameFragment;
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33128, new Class[0], Void.TYPE).isSupported || this.mPointHomeMsgImageView == null) {
            return;
        }
        if (com.max.xiaoheihe.utils.i0.s() && com.max.hbcache.c.v()) {
            this.mPointHomeMsgImageView.setVisibility(0);
        } else {
            this.mPointHomeMsgImageView.setVisibility(8);
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
        androidx.viewpager.widget.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33130, new Class[0], Void.TYPE).isSupported || !isActive() || (aVar = this.f84459c) == null) {
            return;
        }
        SwipeableViewPager swipeableViewPager = this.mViewPager;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) swipeableViewPager, swipeableViewPager.getCurrentItem());
        if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
            ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
        }
    }

    public void T3(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 33125, new Class[]{String[].class}, Void.TYPE).isSupported || this.mViewPager == null) {
            return;
        }
        this.f84458b = strArr;
        S3();
        this.mViewPager.setCurrentItem(V3());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33123, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_home_page);
        this.mUnBinder = ButterKnife.f(this, view);
        a aVar = null;
        com.max.hbutils.utils.t.c(com.max.hbutils.utils.t.n(this.mContext), (ViewGroup) view, null);
        if (getArguments() != null) {
            this.f84458b = getArguments().getStringArray("pages");
        }
        Y3();
        MainActivity.O3(this.mPointHomeMobileImageView, this.mHomeMobileImageView);
        this.mHomeSearchImageView.setOnClickListener(this.f84461e);
        this.mHomeMsgImageView.setOnClickListener(new b());
        this.mHomeMobileImageView.setOnClickListener(new c());
        d dVar = new d(getChildFragmentManager());
        this.f84459c = dVar;
        this.mViewPager.setAdapter(dVar);
        this.mViewPager.setOffscreenPageLimit(2);
        this.mTabLayout.setupWithViewPager(this.mViewPager);
        if (!ad.a.a(ad.a.H, false)) {
            for (int i10 = 0; i10 < this.mTabLayout.getTabCount(); i10++) {
                final EZTabLayout.c cVarW = this.mTabLayout.w(i10);
                if (cVarW != null) {
                    final EZTabLayout.EZTabView eZTabView = cVarW.f68461g;
                    eZTabView.setOnTouchListener(new View.OnTouchListener() { // from class: com.max.xiaoheihe.module.game.c0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return this.f86540b.W3(cVarW, eZTabView, view2, motionEvent);
                        }
                    });
                }
            }
        }
        T3(this.f84458b);
        this.f84460d = new NewMsgBroadcastReceiver(this, aVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.max.xiaoheihe.game.gotop");
        intentFilter.addAction(lb.a.f131025q);
        intentFilter.addAction(lb.a.F);
        registerReceiver(this.f84460d, intentFilter);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33131, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        unregisterReceiver(this.f84460d);
        this.f84459c = null;
        super.onDestroy();
    }

    @Override // com.max.xiaoheihe.flutter.api.FlutterFragmentParent
    public void onFlutterViewTouch(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33129, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mViewPager.Y(Boolean.valueOf(z10));
    }
}
