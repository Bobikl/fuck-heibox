package com.max.xiaoheihe.module.bbs;

import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import df.ca0;

/* JADX INFO: compiled from: HotNewsActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(path = {lb.d.f131239r})
public final class HotNewsActivity extends BaseActivity {
    public static final int L = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ca0 ca0VarC = ca0.c(this.f66602c);
        kotlin.jvm.internal.f0.o(ca0VarC, "inflate(mInflater)");
        setContentView(ca0VarC.b());
        this.f66616q.setTitle("热点");
        if (((HotNewsFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            HotNewsFragment hotNewsFragmentA = HotNewsFragment.f79924h.a();
            hotNewsFragmentA.setUserVisibleHint(true);
            getSupportFragmentManager().u().b(R.id.fragment_container, hotNewsFragmentA).m();
        }
    }
}
