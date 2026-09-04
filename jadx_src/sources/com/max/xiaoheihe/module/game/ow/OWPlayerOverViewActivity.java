package com.max.xiaoheihe.module.game.ow;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.p0;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.utils.c;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class OWPlayerOverViewActivity extends BaseActivity {
    public static final String N = "userid";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String L;
    private OWGameDataFragment M;

    public static Intent M1(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 38067, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OWPlayerOverViewActivity.class);
        intent.putExtra("player_id", str);
        intent.putExtra("name", str2);
        return intent;
    }

    public static Intent N1(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 38068, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OWPlayerOverViewActivity.class);
        intent.putExtra("player_id", str);
        intent.putExtra("name", str2);
        intent.putExtra("userid", str3);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38069, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        this.L = getIntent().getStringExtra("player_id");
        String stringExtra = getIntent().getStringExtra("name");
        String stringExtra2 = getIntent().getStringExtra("userid");
        this.f66616q.a0();
        if (c.d(this.L) == 1) {
            this.f66616q.setTitle(d.n0(R.string.f76254me) + "的战绩详情");
        } else if (com.max.hbcommon.utils.c.u(stringExtra)) {
            this.f66616q.setTitle("战绩详情");
        } else {
            this.f66616q.setTitle(stringExtra + "的战绩详情");
        }
        OWGameDataFragment oWGameDataFragmentH5 = OWGameDataFragment.H5(this.L, stringExtra2);
        this.M = oWGameDataFragmentH5;
        oWGameDataFragmentH5.setMenuVisibility(true);
        this.M.setUserVisibleHint(true);
        p0 p0VarU = getSupportFragmentManager().u();
        p0VarU.y(R.id.fragment_container, this.M);
        p0VarU.m();
    }
}
