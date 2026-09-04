package com.max.xiaoheihe.module.account;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(path = {lb.d.f131283x1})
public class FollowingAndFansActivity extends BaseActivity {
    private static final String R = "userid";
    public static ChangeQuickRedirect changeQuickRedirect;
    SlidingTabLayout L;
    private ArrayList<Fragment> M = new ArrayList<>();
    private String N;
    private int O;
    private String P;
    private String Q;

    @BindView(R.id.vp)
    ViewPager vp;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22841, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : FollowingAndFansActivity.this.M.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22840, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) FollowingAndFansActivity.this.M.get(i10);
        }
    }

    private void N1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22839, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M.clear();
        FollowingAndFansFragment followingAndFansFragmentP4 = FollowingAndFansFragment.p4(this.N, 0);
        FollowingAndFansFragment followingAndFansFragmentQ4 = FollowingAndFansFragment.q4(this.N, 1, this.Q);
        FollowingAndFansFragment followingAndFansFragmentP5 = FollowingAndFansFragment.p4(this.N, 2);
        this.M.add(followingAndFansFragmentP4);
        this.M.add(followingAndFansFragmentQ4);
        this.M.add(followingAndFansFragmentP5);
        this.vp.setAdapter(new a(getSupportFragmentManager()));
        this.L.setViewPager(this.vp, new String[]{getString(R.string.recommend), getString(R.string.follow), getString(R.string.fans)});
        if (lb.c.f131110f.equals(this.P)) {
            this.L.setCurrentTab(2);
        } else if ("following".equals(this.P)) {
            this.L.setCurrentTab(1);
        } else {
            this.L.setCurrentTab(this.O);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22838, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.f66620u = ButterKnife.a(this);
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.N = intent.getStringExtra("userid");
            this.O = getIntent().getIntExtra("page_index", 0);
            this.P = intent.getStringExtra("key");
            this.Q = getIntent().getStringExtra("from");
        }
        this.f66616q.a0();
        this.f66617r.setVisibility(0);
        this.L = this.f66616q.getTitleTabLayout();
        N1();
    }
}
