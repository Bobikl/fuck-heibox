package com.max.xiaoheihe.module.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.max.hbcommon.base.BaseActivity;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
public class MomentsPrivacyActivity extends BaseActivity {
    static final String M = "show_moment_content_filter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean L = false;

    public static Intent M1(Context context, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 23758, new Class[]{Context.class, Boolean.TYPE}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) MomentsPrivacyActivity.class);
        intent.putExtra(M, z10);
        return intent;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23760, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_fragment_container);
        if (this.L) {
            this.f66616q.setTitle(R.string.moment_content_pref);
        } else {
            this.f66616q.setTitle(R.string.moments_privacy_settings);
        }
        this.f66617r.setVisibility(0);
        findViewById(R.id.fragment_container).setBackgroundDrawable(getResources().getDrawable(R.color.white));
        if (((k0) getSupportFragmentManager().r0(R.id.fragment_container)) == null) {
            getSupportFragmentManager().u().b(R.id.fragment_container, k0.S3(this.L)).m();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 23759, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.L = intent.getBooleanExtra(M, false);
        }
        super.onCreate(bundle);
    }
}
