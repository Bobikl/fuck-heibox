package com.max.xiaoheihe.module.game.pubg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.p0;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGGameDataV2Fragment;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
@ig.d(interceptors = {f.class}, path = {lb.d.J3})
public class PUBGPlayerOverViewActivity extends BaseActivity {
    public static final String P = "user_id";
    public static final String Q = "real_name";
    public static final String R = "nickname";
    public static final String S = "player_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private String M;
    private String N;
    private PUBGGameDataV2Fragment O;

    public static Intent M1(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 38314, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) PUBGPlayerOverViewActivity.class);
        intent.putExtra("user_id", str3);
        intent.putExtra("real_name", str2);
        intent.putExtra("player_id", str);
        return intent;
    }

    public static void N1(Context context, String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4}, null, changeQuickRedirect, true, 38313, new Class[]{Context.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("nickname", str);
        bundle.putString("real_name", str2);
        bundle.putString("user_id", str3);
        bundle.putString("player_id", str4);
        if (com.max.xiaoheihe.module.littleprogram.b.p(context, lb.d.J3, bundle)) {
            return;
        }
        Intent intentM1 = M1(context, str4, str2, str3);
        if (!(context instanceof Activity)) {
            intentM1.addFlags(268435456);
        }
        context.startActivity(intentM1);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38315, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.L = getIntent().getStringExtra("nickname");
        this.M = getIntent().getStringExtra("user_id");
        this.N = getIntent().getStringExtra("real_name");
        String stringExtra = getIntent().getStringExtra("player_id");
        if (com.max.hbcommon.utils.c.u(this.L) && !com.max.hbcommon.utils.c.u(stringExtra)) {
            this.L = stringExtra;
        }
        if (com.max.hbcommon.utils.c.u(this.N)) {
            this.N = this.L;
        }
        if (com.max.hbcommon.utils.c.u(stringExtra)) {
            stringExtra = this.N;
        }
        this.f66616q.a0();
        if (com.max.xiaoheihe.module.account.utils.c.e(this.L) == 1 || i0.q(this.M)) {
            this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.f76254me) + "的战绩详情");
        } else {
            this.f66616q.setTitle("Ta的战绩详情");
        }
        PUBGGameDataV2Fragment pUBGGameDataV2FragmentI5 = PUBGGameDataV2Fragment.I5(stringExtra, this.L, this.N, this.M);
        this.O = pUBGGameDataV2FragmentI5;
        pUBGGameDataV2FragmentI5.setMenuVisibility(true);
        this.O.setUserVisibleHint(true);
        p0 p0VarU = getSupportFragmentManager().u();
        p0VarU.y(R.id.fragment_container, this.O);
        p0VarU.m();
    }
}
