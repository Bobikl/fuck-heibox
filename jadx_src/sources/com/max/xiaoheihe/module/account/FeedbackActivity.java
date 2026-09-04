package com.max.xiaoheihe.module.account;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131195k4})
public class FeedbackActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    SlidingTabLayout L;
    private ArrayList<Fragment> M = new ArrayList<>();
    private int N;

    @BindView(R.id.vp)
    ViewPager vp;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22836, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : FeedbackActivity.this.M.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22835, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) FeedbackActivity.this.M.get(i10);
        }
    }

    private void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22834, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M.clear();
        WebviewFragment webviewFragmentA = new com.max.xiaoheihe.module.webview.u(lb.a.D2).p(WebviewFragment.U4).u(true).a();
        WebviewFragment webviewFragmentA2 = new com.max.xiaoheihe.module.webview.u(lb.a.E2).p(WebviewFragment.U4).u(true).a();
        this.M.add(webviewFragmentA);
        if (com.max.xiaoheihe.utils.i0.s()) {
            this.M.add(webviewFragmentA2);
        }
        this.vp.setAdapter(new a(getSupportFragmentManager()));
        this.L.setViewPager(this.vp, com.max.xiaoheihe.utils.i0.s() ? new String[]{getString(R.string.faq_center), getString(R.string.my_order_list)} : new String[]{getString(R.string.faq_center)});
        this.L.setCurrentTab(this.N);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22833, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.f66620u = ButterKnife.a(this);
        this.N = getIntent().getIntExtra("page_index", 0);
        this.f66616q.a0();
        this.L = this.f66616q.getTitleTabLayout();
        N1();
    }
}
