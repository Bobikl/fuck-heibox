package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.Intent;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileSortedGiftsActivity extends BaseActivity {
    private static final String L = "title";
    private static final String M = "sort_type";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Intent M1(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 33296, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameMobileSortedGiftsActivity.class);
        intent.putExtra("title", str);
        intent.putExtra(M, str2);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33297, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra(M);
        this.f66616q.setTitle(stringExtra);
        this.f66617r.setVisibility(0);
        if (((GameMobileSortedGiftsFragment) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, GameMobileSortedGiftsFragment.S3(stringExtra2)).m();
        }
    }
}
