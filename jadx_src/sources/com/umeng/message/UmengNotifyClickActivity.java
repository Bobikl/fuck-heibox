package com.umeng.message;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UmengNotifyClickActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UmengNotifyClick f105566a = new UmengNotifyClick() { // from class: com.umeng.message.UmengNotifyClickActivity.1
        @Override // com.umeng.message.UmengNotifyClick
        protected final void onChangeBadgeNumber(UMessage uMessage) {
            if (UmengNotifyClickActivity.this.canChangeBadgeNum(uMessage)) {
                super.onChangeBadgeNumber(uMessage);
            }
        }

        @Override // com.umeng.message.UmengNotifyClick
        public final void onMessage(final UMessage uMessage) {
            if (UmengNotifyClickActivity.this.isFinishing()) {
                return;
            }
            UmengNotifyClickActivity.this.runOnUiThread(new Runnable() { // from class: com.umeng.message.UmengNotifyClickActivity.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        UmengNotifyClickActivity.this.onMessage(uMessage);
                    } catch (Throwable th2) {
                        UPLog.e("UmengNotifyClickActivity", th2);
                    }
                }
            });
        }

        @Override // com.umeng.message.UmengNotifyClick
        public final void onMessageReceived(Intent intent) {
            UmengNotifyClickActivity.this.onMessage(intent);
        }
    };

    protected boolean canChangeBadgeNum(UMessage uMessage) {
        return true;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f105566a.onCreate(this, getIntent());
    }

    @Deprecated
    protected void onMessage(Intent intent) {
    }

    protected void onMessage(UMessage uMessage) {
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f105566a.onNewIntent(intent);
    }
}
