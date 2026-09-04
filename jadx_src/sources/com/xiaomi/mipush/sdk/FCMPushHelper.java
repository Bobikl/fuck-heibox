package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.message.api.UPushThirdTokenCallback;
import com.xiaomi.push.in;
import com.xiaomi.push.jj;
import com.xiaomi.push.jq;
import com.xiaomi.push.jx;
import com.xiaomi.push.service.bj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class FCMPushHelper {
    private static Map<String, String> a(Context context) {
        HashMap map = new HashMap();
        map.put("actionType", String.valueOf(in.AckMessage.a()));
        map.put("deviceStatus", String.valueOf((int) jx.m631a(context, context.getPackageName())));
        map.put("mat", Long.toString(System.currentTimeMillis()));
        return map;
    }

    private static void a(Context context, jj jjVar) {
        try {
            MiPushMessage miPushMessageGenerateMessage = PushMessageHelper.generateMessage((jq) ai.a(context, jjVar), jjVar.m564a(), false);
            PushMessageReceiver pushMessageReceiverA = i.a(context);
            if (pushMessageReceiverA != null) {
                pushMessageReceiverA.onNotificationMessageArrived(context, miPushMessageGenerateMessage);
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a("fcm broadcast notification come error ", th2);
        }
    }

    private static void a(Context context, byte[] bArr) {
        boolean zM104a = ao.a(context).m104a();
        boolean z10 = true;
        boolean z11 = !"com.xiaomi.xmsf".equals(context.getPackageName());
        boolean zM80a = m80a(context);
        boolean z12 = false;
        if (zM104a && z11 && zM80a) {
            bArr = com.xiaomi.push.service.o.a(bArr, b.m111a(context).d());
            if (bArr == null) {
                com.xiaomi.channel.commonutils.logger.b.m62a("fcm message encrypt failed");
            } else {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                if (TextUtils.isEmpty(strEncodeToString)) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("fcm message buf base64 encode failed");
                    z10 = false;
                } else {
                    Intent intent = new Intent(bj.f107944n);
                    intent.setPackage("com.xiaomi.xmsf");
                    intent.setClassName("com.xiaomi.xmsf", "com.xiaomi.push.service.XMPushService");
                    intent.putExtra("ext_fcm_container_buffer", strEncodeToString);
                    intent.putExtra("mipush_app_package", context.getPackageName());
                    context.startService(intent);
                    com.xiaomi.channel.commonutils.logger.b.m62a("fcm message reroute to xmsf");
                }
                z12 = z10;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a(String.format("xmsf can not receive fcm msg - shouldUseMIUIPush=%s;isNotXmsf=%s;xmsfSupport=%s", Boolean.valueOf(zM104a), Boolean.valueOf(z11), Boolean.valueOf(zM80a)));
        }
        if (z12) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.b("fcm message post local");
        com.xiaomi.push.service.al.m694a(context, com.xiaomi.push.service.z.a(bArr), bArr);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m80a(Context context) {
        return ((long) com.xiaomi.push.j.b(context)) >= 50002000 && b(context);
    }

    private static boolean b(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    public static void clearToken(Context context) {
        i.m132a(context, e.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return i.m135a(context, e.ASSEMBLE_PUSH_FCM) && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverA;
        String str = map.get("pushMsg");
        if (TextUtils.isEmpty(str) || (pushMessageReceiverA = i.a(context)) == null) {
            return;
        }
        pushMessageReceiverA.onNotificationMessageArrived(context, i.a(str));
    }

    public static Map<String, String> notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver pushMessageReceiverA;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (pushMessageReceiverA = i.a(context)) != null) {
            pushMessageReceiverA.onReceivePassThroughMessage(context, i.a(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 2);
            a(context, com.xiaomi.push.service.z.a(bArrDecode));
            a(context, bArrDecode);
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a("fcm notify notification error ", th2);
        }
        return a(context);
    }

    public static void persistIfXmsfSupDecrypt(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putBoolean("is_xmsf_sup_decrypt", ((long) com.xiaomi.push.j.b(context)) >= 50002000).apply();
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(i.c(e.ASSEMBLE_PUSH_FCM), UPushThirdTokenCallback.TYPE_FCM, 1L, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        i.m133a(context, e.ASSEMBLE_PUSH_FCM, str);
    }
}
