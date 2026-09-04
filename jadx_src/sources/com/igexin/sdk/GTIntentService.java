package com.igexin.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;

/* JADX INFO: loaded from: classes6.dex */
public class GTIntentService extends Service {
    private static final int REMOTE_CLINET_RECEIVED = 2;
    private static final int REMOTE_MSG_RECEIVED = 1;
    public final String TAG = getClass().getName();
    private final Messenger client = new Messenger(new a(this));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        com.igexin.a.a.c.a.c.a().a("onBind " + this);
        return this.client.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    public void onNotificationMessageArrived(Context context, GTNotificationMessage gTNotificationMessage) {
    }

    public void onNotificationMessageClicked(Context context, GTNotificationMessage gTNotificationMessage) {
    }

    public void onReceiveClientId(Context context, String str) {
    }

    public void onReceiveCommandResult(Context context, GTCmdMessage gTCmdMessage) {
    }

    public void onReceiveDeviceToken(Context context, String str) {
    }

    public void onReceiveMessageData(Context context, GTTransmitMessage gTTransmitMessage) {
    }

    public void onReceiveOnlineState(Context context, boolean z10) {
    }

    public void onReceiveServicePid(Context context, int i10) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent == null) {
            return 2;
        }
        processOnHandleIntent(this, intent);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public void processOnHandleIntent(Context context, Intent intent) {
        Bundle extras;
        com.igexin.a.a.c.a.c cVarA;
        String str;
        if (intent == null || context == null || (extras = intent.getExtras()) == null || extras.get("action") == null || !(extras.get("action") instanceof Integer)) {
            return;
        }
        int i10 = extras.getInt("action");
        Context applicationContext = context.getApplicationContext();
        if (i10 == 10001) {
            onReceiveMessageData(applicationContext, (GTTransmitMessage) intent.getSerializableExtra(PushConsts.KEY_MESSAGE_DATA));
            cVarA = com.igexin.a.a.c.a.c.a();
            str = "onHandleIntent() = received msg data ";
        } else if (i10 == 10002) {
            onReceiveClientId(applicationContext, extras.getString(PushConsts.KEY_CLIENT_ID));
            cVarA = com.igexin.a.a.c.a.c.a();
            str = "onHandleIntent() = received client id ";
        } else {
            if (i10 == 10007) {
                onReceiveOnlineState(applicationContext, extras.getBoolean(PushConsts.KEY_ONLINE_STATE));
                return;
            }
            if (i10 != 10008) {
                switch (i10) {
                    case 10010:
                        onReceiveCommandResult(applicationContext, (GTCmdMessage) intent.getSerializableExtra(PushConsts.KEY_CMD_MSG));
                        cVarA = com.igexin.a.a.c.a.c.a();
                        str = "onHandleIntent() = " + intent.getSerializableExtra(PushConsts.KEY_CMD_MSG).getClass().getSimpleName();
                        break;
                    case 10011:
                        onNotificationMessageArrived(applicationContext, (GTNotificationMessage) intent.getSerializableExtra(PushConsts.KEY_NOTIFICATION_ARRIVED));
                        cVarA = com.igexin.a.a.c.a.c.a();
                        str = "onHandleIntent() = notification arrived ";
                        break;
                    case 10012:
                        onNotificationMessageClicked(applicationContext, (GTNotificationMessage) intent.getSerializableExtra(PushConsts.KEY_NOTIFICATION_CLICKED));
                        cVarA = com.igexin.a.a.c.a.c.a();
                        str = "onHandleIntent() notification clicked ";
                        break;
                    case 10013:
                        onReceiveDeviceToken(applicationContext, extras.getString(PushConsts.KEY_DEVICE_TOKEN));
                        cVarA = com.igexin.a.a.c.a.c.a();
                        str = "onHandleIntent() = received device token ";
                        break;
                    default:
                        return;
                }
            } else {
                onReceiveServicePid(applicationContext, extras.getInt(PushConsts.KEY_SERVICE_PIT));
                cVarA = com.igexin.a.a.c.a.c.a();
                str = "onHandleIntent() = get sdk service pid ";
            }
        }
        cVarA.a(str);
    }
}
