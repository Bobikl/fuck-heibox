package com.max.xiaoheihe.module.account;

import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.j.class}, path = {lb.d.U1})
public class MeHomeActivity extends BaseActivity {
    public static final String L = "heyboxId";
    public static final String M = "steamId";
    public static final String N = "page_index";
    public static final String O = "referer";
    public static final String P = "h_src";
    public static final int Q = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    private void M1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23273, new Class[0], Void.TYPE).isSupported && ((q0) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            q0 q0Var = new q0();
            q0Var.setArguments(getIntent().getExtras());
            getSupportFragmentManager().u().b(R.id.fragment_container, q0Var).n();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean K1() {
        return false;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23272, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        M1();
    }
}
