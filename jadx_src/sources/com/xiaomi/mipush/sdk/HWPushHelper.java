package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class HWPushHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f106733a = false;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static boolean hasNetwork(Context context) {
        return i.m134a(context);
    }

    public static boolean isHmsTokenSynced(Context context) {
        String strA = i.a(context, e.ASSEMBLE_PUSH_HUAWEI, false);
        String strA2 = af.a(context).a(au.UPLOAD_HUAWEI_TOKEN);
        return (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2) || !"synced".equals(strA2)) ? false : true;
    }

    public static boolean isUserOpenHmsPush(Context context) {
        return MiPushClient.getOpenHmsPush(context);
    }

    public static boolean needConnect() {
        return f106733a;
    }

    public static void notifyHmsNotificationMessageClicked(Context context, String str) throws JSONException {
        String string = "";
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        if (jSONObject.has("pushMsg")) {
                            string = jSONObject.getString("pushMsg");
                            break;
                        }
                    }
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d(e10.toString());
            }
        }
        PushMessageReceiver pushMessageReceiverA = i.a(context);
        if (pushMessageReceiverA != null) {
            MiPushMessage miPushMessageA = i.a(string);
            if (miPushMessageA.getExtra().containsKey("notify_effect")) {
                return;
            }
            pushMessageReceiverA.onNotificationMessageClicked(context, miPushMessageA);
        }
    }

    public static void notifyHmsPassThoughMessageArrived(Context context, String str) throws JSONException {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("content")) {
                    string = jSONObject.getString("content");
                }
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d(e10.toString());
        }
        PushMessageReceiver pushMessageReceiverA = i.a(context);
        if (pushMessageReceiverA != null) {
            pushMessageReceiverA.onReceivePassThroughMessage(context, i.a(string));
        }
    }

    public static void registerHuaWeiAssemblePush(Context context) {
        AbstractPushManager abstractPushManagerA = f.a(context).a(e.ASSEMBLE_PUSH_HUAWEI);
        if (abstractPushManagerA != null) {
            abstractPushManagerA.register();
        }
    }

    public static void reportError(String str, int i10) {
        i.a(str, i10);
    }

    public static synchronized void setConnectTime(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
    }

    public static synchronized void setGetTokenTime(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_get_token_time", System.currentTimeMillis()).commit();
    }

    public static void setNeedConnect(boolean z10) {
        f106733a = z10;
    }

    public static synchronized boolean shouldGetToken(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_get_token_time", -1L)) > 172800000;
    }

    public static synchronized boolean shouldTryConnect(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > 5000;
    }

    public static void uploadToken(Context context, String str) {
        i.m133a(context, e.ASSEMBLE_PUSH_HUAWEI, str);
    }
}
