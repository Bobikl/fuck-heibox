package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.bp;
import com.xiaomi.push.fy;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jd;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.jo;
import com.xiaomi.push.jt;
import com.xiaomi.push.ju;
import com.xiaomi.push.jx;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MiPushClient4Hybrid {
    private static MiPushCallback sCallback;
    private static Map<String, b.a> dataMap = new HashMap();
    private static Map<String, Long> sRegisterTimeMap = new HashMap();

    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    private static void addPullNotificationTime(Context context, String str) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z10) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int iIntValue = TextUtils.isEmpty(str) ? 0 : Integer.valueOf(str).intValue();
        if (!z10) {
            iIntValue = (iIntValue & (-4)) + com.xiaomi.push.g.b.NOT_ALLOWED.a();
        }
        return (short) iIntValue;
    }

    public static boolean isRegistered(Context context, String str) {
        return b.m111a(context).a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, jo joVar) {
        b.a aVar;
        String strC = joVar.c();
        if (joVar.a() == 0 && (aVar = dataMap.get(strC)) != null) {
            aVar.a(joVar.f819e, joVar.f820f);
            b.m111a(context).a(strC, aVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(joVar.f819e)) {
            arrayList = new ArrayList();
            arrayList.add(joVar.f819e);
        }
        MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(fy.COMMAND_REGISTER.f447a, arrayList, joVar.f807a, joVar.f818d, null, null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(strC, miPushCommandMessageGenerateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, ju juVar) {
        MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(fy.COMMAND_UNREGISTER.f447a, null, juVar.f885a, juVar.f893d, null, null);
        String strA = juVar.a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(strA, miPushCommandMessageGenerateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (b.m111a(context).m116a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            b.a aVarA = b.m111a(context).a(str);
            if (aVarA != null) {
                arrayList.add(aVarA.f106777c);
                MiPushCommandMessage miPushCommandMessageGenerateCommandMessage = PushMessageHelper.generateCommandMessage(fy.COMMAND_REGISTER.f447a, arrayList, 0L, null, null, null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, miPushCommandMessageGenerateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                jm jmVar = new jm();
                jmVar.b(str2);
                jmVar.c(ix.PullOfflineMessage.f623a);
                jmVar.a(bc.a());
                jmVar.a(false);
                ao.a(context).a(jmVar, in.Notification, false, true, null, false, str, str2);
                com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0L)) < 5000) {
            com.xiaomi.channel.commonutils.logger.b.m62a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(jCurrentTimeMillis));
        String strA = bp.a(6);
        b.a aVar = new b.a(context);
        aVar.c(str2, str3, strA);
        dataMap.put(str, aVar);
        jn jnVar = new jn();
        jnVar.a(bc.a());
        jnVar.b(str2);
        jnVar.e(str3);
        jnVar.d(str);
        jnVar.f(strA);
        jnVar.c(com.xiaomi.push.g.m393a(context, context.getPackageName()));
        jnVar.b(com.xiaomi.push.g.a(context, context.getPackageName()));
        jnVar.h(BuildConfig.VERSION_NAME);
        jnVar.a(BuildConfig.VERSION_CODE);
        jnVar.a(jb.Init);
        if (!com.xiaomi.push.j.m526d()) {
            String strD = com.xiaomi.push.i.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jnVar.i(bp.a(strD));
            }
        }
        int iA = com.xiaomi.push.i.a();
        if (iA >= 0) {
            jnVar.c(iA);
        }
        jm jmVar2 = new jm();
        jmVar2.c(ix.HybridRegister.f623a);
        jmVar2.b(b.m111a(context).m112a());
        jmVar2.d(context.getPackageName());
        jmVar2.a(jx.a(jnVar));
        jmVar2.a(bc.a());
        ao.a(context).a(jmVar2, in.Notification, (ja) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String messageId = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(messageId)) {
            messageId = miPushMessage.getMessageId();
        }
        am.a(context, messageId);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z10) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("do not ack message, message is null");
            return;
        }
        try {
            jd jdVar = new jd();
            jdVar.b(b.m111a(context).m112a());
            jdVar.a(miPushMessage.getMessageId());
            jdVar.a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            jdVar.a(getDeviceStatus(miPushMessage, z10));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                jdVar.c(miPushMessage.getTopic());
            }
            ao.a(context).a(jdVar, in.AckMessage, false, bs.a(PushMessageHelper.generateMessage(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th2) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a(th2);
            } finally {
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
            }
        }
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    private static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("last_pull_notification_");
        sb2.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb2.toString(), -1L)) > 300000;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        b.a aVarA = b.m111a(context).a(str);
        if (aVarA == null) {
            return;
        }
        jt jtVar = new jt();
        jtVar.a(bc.a());
        jtVar.d(str);
        jtVar.b(aVarA.f145a);
        jtVar.c(aVarA.f106777c);
        jtVar.e(aVarA.f106776b);
        jm jmVar = new jm();
        jmVar.c(ix.HybridUnregister.f623a);
        jmVar.b(b.m111a(context).m112a());
        jmVar.d(context.getPackageName());
        jmVar.a(jx.a(jtVar));
        jmVar.a(bc.a());
        ao.a(context).a(jmVar, in.Notification, (ja) null);
        b.m111a(context).b(str);
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        com.xiaomi.push.service.al.a(context, linkedList);
    }
}
