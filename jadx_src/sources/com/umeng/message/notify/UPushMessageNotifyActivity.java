package com.umeng.message.notify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.umeng.message.proguard.aj;

/* JADX INFO: loaded from: classes4.dex */
public final class UPushMessageNotifyActivity extends Activity {
    private void a(Intent intent) {
        try {
            aj ajVarA = aj.a();
            ajVarA.b();
            ajVarA.a(this, intent);
        } catch (Throwable unused) {
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getIntent());
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }
}
