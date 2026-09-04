package com.max.xiaoheihe.module.game;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileFragment extends com.max.hbcommon.base.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f84491c = "pages";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String[] f84492b;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33220, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) GameMobileFragment.this).mContext.startActivity(AppMgrActivity.M1(((com.max.hbcommon.base.d) GameMobileFragment.this).mContext));
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33221, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.w0(((com.max.hbcommon.base.d) GameMobileFragment.this).mContext, 1).A();
        }
    }

    public class c extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33222, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return i10 == 0 ? GameMobileRecFragment.r4() : GameMobileGiftsFragment.j4();
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 33223, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            return i10 == 0 ? "推荐游戏" : GameMobileFragment.this.getString(R.string.gifts);
        }
    }

    private int P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33218, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return GameCenterActivity.U.equals(MainActivity.p3(this.f84492b, 0)) ? 1 : 0;
    }

    public static GameMobileFragment Q3(String[] strArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 33216, new Class[]{String[].class}, GameMobileFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameMobileFragment) patchProxyResultProxy.result;
        }
        GameMobileFragment gameMobileFragment = new GameMobileFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("pages", strArr);
        gameMobileFragment.setArguments(bundle);
        return gameMobileFragment;
    }

    public void O3(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 33219, new Class[]{String[].class}, Void.TYPE).isSupported || this.mViewPager == null) {
            return;
        }
        this.f84492b = strArr;
        this.mViewPager.setCurrentItem(P3());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 33217, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f84492b = getArguments().getStringArray("pages");
        }
        this.mTitleBar.a0();
        this.mTitleBar.setActionIcon(R.drawable.common_download);
        this.mTitleBar.setActionIconOnClickListener(new a());
        this.mTitleBar.setActionXIcon(R.drawable.common_search);
        this.mTitleBar.setActionXIconOnClickListener(new b());
        this.mTitleBar.getAppbarActionButtonView().setPadding(ViewUtils.f(this.mContext, 7.0f), 0, ViewUtils.f(this.mContext, 14.0f), 0);
        this.mTitleBar.getAppbarActionButtonXView().setPadding(ViewUtils.f(this.mContext, 7.0f), 0, ViewUtils.f(this.mContext, 7.0f), 0);
        SlidingTabLayout titleTabLayout = this.mTitleBar.getTitleTabLayout();
        this.mViewPager.setAdapter(new c(getChildFragmentManager()));
        titleTabLayout.setViewPager(this.mViewPager);
        O3(this.f84492b);
    }
}
