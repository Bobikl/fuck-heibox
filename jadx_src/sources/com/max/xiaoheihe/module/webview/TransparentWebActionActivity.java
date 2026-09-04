package com.max.xiaoheihe.module.webview;

import android.os.Bundle;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: TransparentWebActionActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class TransparentWebActionActivity extends WebActionActivity {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final int f94257q4 = 0;

    @Override // com.max.xiaoheihe.module.webview.WebActionActivity, com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46990, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.window_alpha_out, R.anim.window_alpha_out);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 46989, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        overridePendingTransition(R.anim.window_alpha_in, R.anim.window_alpha_in);
    }
}
