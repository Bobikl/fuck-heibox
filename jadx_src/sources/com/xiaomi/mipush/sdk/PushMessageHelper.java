package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.ja;
import com.xiaomi.push.jq;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j10, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j10);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(jq jqVar, ja jaVar, boolean z10) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(jqVar.m602a());
        if (!TextUtils.isEmpty(jqVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(jqVar.d());
        } else if (!TextUtils.isEmpty(jqVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(jqVar.c());
        } else if (TextUtils.isEmpty(jqVar.f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(jqVar.f());
        }
        miPushMessage.setCategory(jqVar.e());
        if (jqVar.a() != null) {
            miPushMessage.setContent(jqVar.a().c());
        }
        if (jaVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(jaVar.m530a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(jaVar.m535b());
            }
            miPushMessage.setDescription(jaVar.d());
            miPushMessage.setTitle(jaVar.m538c());
            miPushMessage.setNotifyType(jaVar.a());
            miPushMessage.setNotifyId(jaVar.c());
            miPushMessage.setPassThrough(jaVar.b());
            miPushMessage.setExtra(jaVar.m531a());
        }
        miPushMessage.setNotified(z10);
        return miPushMessage;
    }

    public static ja generateMessage(MiPushMessage miPushMessage) {
        ja jaVar = new ja();
        jaVar.a(miPushMessage.getMessageId());
        jaVar.b(miPushMessage.getTopic());
        jaVar.d(miPushMessage.getDescription());
        jaVar.c(miPushMessage.getTitle());
        jaVar.c(miPushMessage.getNotifyId());
        jaVar.a(miPushMessage.getNotifyType());
        jaVar.b(miPushMessage.getPassThrough());
        jaVar.a(miPushMessage.getExtra());
        return jaVar;
    }

    public static int getPushMode(Context context) {
        if (pushMode == 0) {
            if (isUseCallbackPushMode(context)) {
                setPushMode(1);
            } else {
                setPushMode(2);
            }
        }
        return pushMode;
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) ? false : true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    private static void setPushMode(int i10) {
        pushMode = i10;
    }
}
