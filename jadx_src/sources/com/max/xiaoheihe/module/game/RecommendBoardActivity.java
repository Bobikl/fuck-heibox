package com.max.xiaoheihe.module.game;

import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.mall.recommendboard.RecommendBoardFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: RecommendBoardActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@ig.d(path = {lb.d.D2})
public final class RecommendBoardActivity extends BaseActivity {
    public static final int M = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private RecommendBoardFragment L;

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35101, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("安利墙");
        this.L = new RecommendBoardFragment();
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        RecommendBoardFragment recommendBoardFragment = this.L;
        kotlin.jvm.internal.f0.m(recommendBoardFragment);
        p0VarU.b(R.id.multi_status_view_container, recommendBoardFragment).m();
    }
}
