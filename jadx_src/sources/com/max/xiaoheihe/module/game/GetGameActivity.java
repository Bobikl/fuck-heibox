package com.max.xiaoheihe.module.game;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.B2, lb.d.U2})
public class GetGameActivity extends BaseActivity {
    private static final String M = "Epic限免";
    private static final String N = "Steam限免";
    public static ChangeQuickRedirect changeQuickRedirect;
    private androidx.viewpager.widget.a L;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34953, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return i10 == 0 ? GetGameFragment.n4("addfreelicense_epic", lb.a.f131082z2) : GetGameFragment.n4("addfreelicense", lb.a.f131076y2);
        }
    }

    public void M1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34952, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<Fragment> listJ0 = getSupportFragmentManager().J0();
        if (listJ0.size() > 0) {
            for (int i10 = 0; i10 < listJ0.size(); i10++) {
                if (this.mViewPager.getCurrentItem() != i10 && (listJ0.get(i10) instanceof GetGameFragment)) {
                    ((GetGameFragment) listJ0.get(i10)).i4();
                }
            }
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        int intExtra;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34951, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        ButterKnife.a(this);
        a aVar = new a(getSupportFragmentManager());
        this.L = aVar;
        this.mViewPager.setAdapter(aVar);
        this.f66616q.a0();
        this.f66617r.setVisibility(0);
        this.f66616q.getTitleTabLayout().setViewPager(this.mViewPager, new String[]{"Epic限免", N});
        if (getIntent() == null || (intExtra = getIntent().getIntExtra("page_index", 0)) < 0 || intExtra >= this.L.getCount()) {
            return;
        }
        this.mViewPager.setCurrentItem(intExtra);
    }
}
