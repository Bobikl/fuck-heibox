package com.max.xiaoheihe.module.game.pubg;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGWeaponsActivity extends BaseActivity {
    public static final String L = "player_id";
    public static final String M = "season";
    public static final String N = "mode";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Intent M1(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 38319, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) PUBGWeaponsActivity.class);
        intent.putExtra("player_id", str);
        intent.putExtra("season", str2);
        intent.putExtra("mode", str3);
        return intent;
    }

    public static void N1(Context context, String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 38318, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.Y(context, str, str3, str2, str4, str5));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38320, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        String stringExtra = getIntent().getStringExtra("player_id");
        String stringExtra2 = getIntent().getStringExtra("season");
        String stringExtra3 = getIntent().getStringExtra("mode");
        t.N(this.f66601b.getWindow(), false);
        t.c(com.max.xiaoheihe.utils.d.E(R.color.transparent), this.f66616q, null);
        this.f66601b.getWindow().setNavigationBarColor(0);
        this.f66616q.setBackgroundResource(R.color.transparent);
        if (((PUBGWeaponsFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            PUBGWeaponsFragment pUBGWeaponsFragmentN4 = PUBGWeaponsFragment.N4(stringExtra, stringExtra2, stringExtra3);
            pUBGWeaponsFragmentN4.setMenuVisibility(true);
            pUBGWeaponsFragmentN4.setUserVisibleHint(true);
            getSupportFragmentManager().u().b(R.id.fragment_container, pUBGWeaponsFragmentN4).m();
        }
    }
}
