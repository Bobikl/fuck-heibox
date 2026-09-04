package com.max.xiaoheihe.module.bbs;

import android.content.Context;
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

/* JADX INFO: loaded from: classes10.dex */
public class AddAtUserActivity extends BaseActivity implements com.max.xiaoheihe.module.bbs.adapter.a.b {
    private static final String O = "userid";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private SlidingTabLayout M;
    private ArrayList<Fragment> N = new ArrayList<>();

    @BindView(R.id.vp)
    ViewPager vp;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25702, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : AddAtUserActivity.this.N.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25701, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) AddAtUserActivity.this.N.get(i10);
        }
    }

    public static Intent N1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 25697, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) AddAtUserActivity.class);
        intent.putExtra("userid", str);
        return intent;
    }

    private void O1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25699, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N.clear();
        AddAtUserFragment addAtUserFragmentG4 = AddAtUserFragment.g4(this.L, AddAtUserFragment.f79522o, this);
        AddAtUserFragment addAtUserFragmentG5 = AddAtUserFragment.g4(this.L, AddAtUserFragment.f79523p, this);
        this.N.add(addAtUserFragmentG4);
        this.N.add(addAtUserFragmentG5);
        this.vp.setAdapter(new a(getSupportFragmentManager()));
        this.M.setViewPager(this.vp, new String[]{getString(R.string.follow), getString(R.string.fans)});
    }

    @Override // com.max.xiaoheihe.module.bbs.adapter.a.b
    public void J(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 25700, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25698, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.f66620u = ButterKnife.a(this);
        if (getIntent() != null) {
            this.L = getIntent().getStringExtra("userid");
        }
        this.f66616q.a0();
        this.f66617r.setVisibility(0);
        this.M = this.f66616q.getTitleTabLayout();
        O1();
    }
}
