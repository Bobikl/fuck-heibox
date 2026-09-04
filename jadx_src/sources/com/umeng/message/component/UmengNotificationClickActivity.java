package com.umeng.message.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.ac;
import com.umeng.message.proguard.am;
import com.umeng.message.proguard.w;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class UmengNotificationClickActivity extends Activity {
    private void a(Intent intent) {
        if (intent == null) {
            finish();
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("MSG");
            if (stringExtra != null && stringExtra.length() != 0) {
                UMessage uMessage = new UMessage(new JSONObject(stringExtra));
                UTrack.getInstance().trackMsgClick(uMessage);
                Context applicationContext = getApplicationContext();
                UPLog.i("NotificationClick", uMessage.getRaw());
                UPushMessageHandler notificationClickHandler = PushAgent.getInstance(applicationContext).getNotificationClickHandler();
                if (notificationClickHandler != null) {
                    notificationClickHandler.handleMessage(applicationContext, uMessage);
                } else {
                    UPLog.i("NotificationClick", "handle == null skipped!");
                }
                w wVarA = w.a();
                ac acVarA = wVarA.a(uMessage.getMsgId());
                if (acVarA != null) {
                    wVarA.b(acVarA);
                    am.a(acVarA);
                }
                finish();
                return;
            }
            finish();
        } catch (Throwable th2) {
            try {
                UPLog.e("NotificationClick", th2);
            } finally {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = 1;
            attributes.height = 1;
            attributes.gravity = 8388659;
            window.setAttributes(attributes);
            a(getIntent());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        try {
            a(intent);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
