package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class PlayerLeaderboardsActivity extends BaseActivity {
    private static final String N = "game_type";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private PlayerLeaderboardsFragment M;

    public static Intent M1(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 35049, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) PlayerLeaderboardsActivity.class);
        intent.putExtra("game_type", str);
        return intent;
    }

    public static void N1(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 35050, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("game_type", str);
        if (com.max.xiaoheihe.module.littleprogram.b.p(context, com.max.xiaoheihe.module.littleprogram.b.f88755p, bundle)) {
            return;
        }
        Intent intentM1 = M1(context, str);
        if (!(context instanceof Activity)) {
            intentM1.addFlags(268435456);
        }
        context.startActivity(intentM1);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35051, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        ButterKnife.a(this);
        String stringExtra = getIntent().getStringExtra("game_type");
        this.L = stringExtra;
        PlayerLeaderboardsFragment playerLeaderboardsFragmentV5 = PlayerLeaderboardsFragment.v5(stringExtra);
        this.M = playerLeaderboardsFragmentV5;
        playerLeaderboardsFragmentV5.setMenuVisibility(true);
        this.M.setUserVisibleHint(true);
        androidx.fragment.app.p0 p0VarU = getSupportFragmentManager().u();
        p0VarU.y(R.id.fragment_container, this.M);
        p0VarU.m();
    }
}
