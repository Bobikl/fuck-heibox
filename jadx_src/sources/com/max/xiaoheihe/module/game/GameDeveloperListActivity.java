package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(path = {lb.d.N2})
public class GameDeveloperListActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Intent M1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 33031, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) GameDeveloperListActivity.class);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33032, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.f66616q.setTitle(R.string.game_developers);
        this.f66617r.setVisibility(0);
        if (((GameDeveloperListFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, GameDeveloperListFragment.T3()).m();
        }
    }
}
