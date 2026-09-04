package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.f.class}, path = {lb.d.f131270v2})
public class GameParticularTagListActivity extends BaseActivity {
    public static final String N = "tag";
    public static final String O = "default_check";
    public static ChangeQuickRedirect changeQuickRedirect;
    private KeyDescObj L;
    private String M = null;

    public static Intent M1(Context context, KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, keyDescObj}, null, changeQuickRedirect, true, 33355, new Class[]{Context.class, KeyDescObj.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameParticularTagListActivity.class);
        intent.putExtra("tag", keyDescObj);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33356, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        if (getIntent() != null) {
            this.L = (KeyDescObj) getIntent().getSerializableExtra("tag");
            this.M = getIntent().getStringExtra(O);
        }
        TitleBar titleBar = this.f66616q;
        KeyDescObj keyDescObj = this.L;
        titleBar.setTitle(keyDescObj != null ? keyDescObj.getDesc() : getString(R.string.game));
        this.f66617r.setVisibility(0);
        if (((t1) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            t1 t1VarP4 = t1.P4(this.L, this.M);
            t1VarP4.setUserVisibleHint(true);
            t1VarP4.setMenuVisibility(true);
            getSupportFragmentManager().u().b(R.id.fragment_container, t1VarP4).m();
        }
    }
}
