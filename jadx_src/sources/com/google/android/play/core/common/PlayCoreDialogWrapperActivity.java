package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.play:core-common@@2.0.3 */
/* JADX INFO: loaded from: classes7.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private ResultReceiver f56190b;

    private final void a() {
        ResultReceiver resultReceiver = this.f56190b;
        if (resultReceiver != null) {
            resultReceiver.send(3, new Bundle());
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0 && (resultReceiver = this.f56190b) != null) {
            if (i11 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i11 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intent;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        Intent intent2 = intent;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f56190b = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f56190b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            a();
            finish();
        } else {
            try {
                startIntentSenderForResult(((PendingIntent) extras.get("confirmation_intent")).getIntentSender(), 0, intent2, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                a();
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f56190b);
    }
}
