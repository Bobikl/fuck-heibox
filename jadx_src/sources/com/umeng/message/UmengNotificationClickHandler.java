package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.message.api.UPushMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.aw;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UmengNotificationClickHandler implements UPushMessageHandler {
    private static void a(Intent intent, UMessage uMessage) {
        if (intent == null || uMessage == null || uMessage.getExtra() == null) {
            return;
        }
        for (Map.Entry<String, String> entry : uMessage.getExtra().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                intent.putExtra(key, value);
            }
        }
    }

    public void changeBadgeNum(Context context, UMessage uMessage) {
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(context);
        if (TextUtils.equals(uMessage.getMsgId(), messageSharedPrefs.f())) {
            return;
        }
        messageSharedPrefs.c(uMessage.getMsgId());
        aw.b(context, -1);
    }

    public void dealWithCustomAction(Context context, UMessage uMessage) {
    }

    public void dismissNotification(Context context, UMessage uMessage) {
    }

    protected Intent getMainIntent(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setFlags(67108864);
        return launchIntentForPackage;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:8:0x0014, B:10:0x001c, B:33:0x0083, B:11:0x0020, B:13:0x0028, B:14:0x002c, B:16:0x0034, B:17:0x0038, B:19:0x003e, B:21:0x004c, B:22:0x0050, B:24:0x0056, B:26:0x0064, B:27:0x0068, B:29:0x006e, B:31:0x007c, B:32:0x0080), top: B:38:0x0000 }] */
    @Override // com.umeng.message.api.UPushMessageHandler
    public void handleMessage(Context context, UMessage uMessage) {
        try {
            if (uMessage.dismiss) {
                dismissNotification(context, uMessage);
                return;
            }
            String action = uMessage.getAction();
            if (TextUtils.equals("go_app", action)) {
                launchApp(context, uMessage);
            } else if (TextUtils.equals("go_url", action)) {
                openUrl(context, uMessage);
            } else if (TextUtils.equals("go_activity", action)) {
                openActivity(context, uMessage);
            } else if (TextUtils.equals(UMessage.NOTIFICATION_GO_CUSTOM, action)) {
                dealWithCustomAction(context, uMessage);
            } else if (uMessage.getDeeplink() != null && !TextUtils.isEmpty(uMessage.getDeeplink().trim())) {
                openUrl(context, uMessage);
            } else if (uMessage.getActivity() != null && !TextUtils.isEmpty(uMessage.getActivity().trim())) {
                openActivity(context, uMessage);
            } else if (uMessage.getCustom() == null || TextUtils.isEmpty(uMessage.getContent().trim())) {
                launchApp(context, uMessage);
            } else {
                dealWithCustomAction(context, uMessage);
            }
            changeBadgeNum(context, uMessage);
        } catch (Throwable th2) {
            UPLog.e("UmengNotificationClickHandler", th2);
        }
    }

    public void launchApp(Context context, UMessage uMessage) {
        try {
            Intent mainIntent = getMainIntent(context);
            if (mainIntent == null) {
                UPLog.e("UmengNotificationClickHandler", "can't find launchIntent:", context.getPackageName());
                return;
            }
            mainIntent.addFlags(268435456);
            a(mainIntent, uMessage);
            UPLog.d("UmengNotificationClickHandler", "open app:", context.getPackageName());
            context.startActivity(mainIntent);
        } catch (Throwable th2) {
            UPLog.e("UmengNotificationClickHandler", th2);
        }
    }

    public void openActivity(Context context, UMessage uMessage) {
        try {
            String activity = uMessage.getActivity();
            if (activity == null) {
                return;
            }
            String strTrim = activity.trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            UPLog.d("UmengNotificationClickHandler", "open activity:", strTrim);
            Intent intent = new Intent();
            a(intent, uMessage);
            intent.setClassName(context, strTrim);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable th2) {
            UPLog.e("UmengNotificationClickHandler", th2);
        }
    }

    public void openUrl(Context context, UMessage uMessage) {
        try {
            String deeplink = uMessage.getDeeplink();
            if (deeplink == null) {
                return;
            }
            String strTrim = deeplink.trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            UPLog.d("UmengNotificationClickHandler", "open deeplink:".concat(String.valueOf(strTrim)));
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strTrim));
            a(intent, uMessage);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Throwable th2) {
            UPLog.e("UmengNotificationClickHandler", th2);
        }
    }
}
