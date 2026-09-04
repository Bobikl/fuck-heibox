package com.max.xiaoheihe.module.mall;

import android.view.View;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.W1})
public class MallOrderListActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40236, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) MallOrderListActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40235, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle(R.string.my_order);
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new a());
        this.f66617r.setVisibility(0);
        if (((MallOrderListFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            MallOrderListFragment mallOrderListFragmentP4 = MallOrderListFragment.p4();
            mallOrderListFragmentP4.setMenuVisibility(true);
            mallOrderListFragmentP4.setUserVisibleHint(true);
            getSupportFragmentManager().u().b(R.id.fragment_container, mallOrderListFragmentP4).m();
        }
    }
}
