package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankActivity;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.C1339r;
import com.xiaomi.push.bg;
import com.xiaomi.push.bk;
import com.xiaomi.push.bo;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.az;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static int a() {
        Integer num = (Integer) bk.a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int a(Context context, e eVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strA = a(eVar);
        String string = sharedPreferences.getString(strA, "");
        String strM119c = b.m111a(context).m119c();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        }
        if (TextUtils.isEmpty(string)) {
            return 1;
        }
        if (!string.equals(str)) {
            return 2;
        }
        if (!TextUtils.equals(strM119c, string2)) {
            return 3;
        }
        if (m136a(eVar)) {
            if (a() != sharedPreferences.getInt(b(eVar), 0)) {
                return 4;
            }
        }
        return 0;
    }

    public static MiPushMessage a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has(RemoteMessageConst.Notification.NOTIFY_ID)) {
                    miPushMessage.setNotifyId(jSONObject.getInt(RemoteMessageConst.Notification.NOTIFY_ID));
                }
                if (jSONObject.has(PUBGFriendRankActivity.Y)) {
                    miPushMessage.setCategory(jSONObject.getString(PUBGFriendRankActivity.Y));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> itKeys = jSONObject2.keys();
                    HashMap map = new HashMap();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject2.getString(next));
                    }
                    if (map.size() > 0) {
                        miPushMessage.setExtra(map);
                    }
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d(e10.toString());
            }
        }
        return miPushMessage;
    }

    protected static PushMessageReceiver a(Context context) {
        ResolveInfo next;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (listQueryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (activityInfo == null || !activityInfo.packageName.equals(context.getPackageName())) {
                    }
                }
                next = null;
            } else {
                next = null;
            }
            if (next != null) {
                return (PushMessageReceiver) C1339r.a(context, next.activityInfo.name).newInstance();
            }
            return null;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d(e10.toString());
            return null;
        }
    }

    static String a(Context context, e eVar) {
        return a(context, eVar, false);
    }

    protected static synchronized String a(Context context, e eVar, boolean z10) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        if (z10) {
            String string = sharedPreferences.getString("syncingToken", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String strA = a(eVar);
        if (TextUtils.isEmpty(strA)) {
            return "";
        }
        return sharedPreferences.getString(strA, "");
    }

    public static String a(e eVar) {
        int i10 = k.f106791a[eVar.ordinal()];
        if (i10 == 1) {
            return "hms_push_token";
        }
        if (i10 == 2) {
            return "fcm_push_token_v2";
        }
        if (i10 == 3) {
            return "cos_push_token";
        }
        if (i10 != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static HashMap<String, String> m130a(Context context, e eVar) {
        HashMap<String, String> map = new HashMap<>();
        int i10 = k.f106791a[eVar.ordinal()];
        String string = null;
        ApplicationInfo applicationInfo = null;
        if (i10 == 1) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d(e10.toString());
            }
            string = new com.xiaomi.push.s.a(":", Constants.WAVE_SEPARATOR).a("brand", ag.HUAWEI.name()).a("token", a(context, eVar, true)).a("package_name", context.getPackageName()).a("app_id", Integer.valueOf(applicationInfo != null ? applicationInfo.metaData.getInt(Constants.HUAWEI_HMS_CLIENT_APPID) : -1)).toString();
        } else if (i10 == 2) {
            com.xiaomi.push.s.a aVarA = new com.xiaomi.push.s.a(":", Constants.WAVE_SEPARATOR).a("brand", ag.FCM.name()).a("token", a(context, eVar, false)).a("package_name", context.getPackageName());
            int iA = a();
            if (iA != 0) {
                aVarA.a("version", Integer.valueOf(iA));
            } else {
                aVarA.a("version", Integer.valueOf(BuildConfig.VERSION_CODE));
            }
            string = aVarA.toString();
        } else if (i10 == 3) {
            string = new com.xiaomi.push.s.a(":", Constants.WAVE_SEPARATOR).a("brand", ag.OPPO.name()).a("token", a(context, eVar, true)).a("package_name", context.getPackageName()).toString();
        } else if (i10 == 4) {
            com.xiaomi.push.s.a aVarA2 = new com.xiaomi.push.s.a(":", Constants.WAVE_SEPARATOR).a("brand", ag.VIVO.name()).a("token", a(context, eVar, true)).a("package_name", context.getPackageName());
            int iA2 = a();
            if (iA2 != 0) {
                aVarA2.a("version", Integer.valueOf(iA2));
            }
            string = aVarA2.toString();
        }
        map.put(Constants.ASSEMBLE_PUSH_REG_INFO, string);
        return map;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    static void m131a(Context context) {
        boolean z10 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strA = a(e.ASSEMBLE_PUSH_HUAWEI);
        String strA2 = a(e.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(strA, "")) && TextUtils.isEmpty(sharedPreferences.getString(strA2, ""))) {
            z10 = true;
        }
        if (z10) {
            ao.a(context).a(2, strA);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m132a(Context context, e eVar) {
        String strA = a(eVar);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        com.xiaomi.push.p.a(context.getSharedPreferences("mipush_extra", 0).edit().putString(strA, ""));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m133a(Context context, e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iA = a(context, eVar, str);
        if (iA == 0) {
            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : do not need to send token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : send token upload, check:" + iA);
        a(context, str);
        au auVarA = l.a(eVar);
        if (auVarA == null) {
            return;
        }
        ao.a(context).a((String) null, auVarA, eVar, "upload");
    }

    private static synchronized void a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString("syncingToken", str);
        editorEdit.apply();
    }

    public static void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("pushMsg")) {
            return;
        }
        intent.putExtra(PushMessageHelper.KEY_MESSAGE, a(extras.getString("pushMsg")));
    }

    public static void a(String str, int i10) {
        MiTinyDataClient.upload("hms_push_error", str, 1L, "error code = " + i10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m134a(Context context) {
        if (context == null) {
            return false;
        }
        return bg.b(context);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m135a(Context context, e eVar) {
        if (l.m138a(eVar) != null) {
            return az.a(context).a(l.m138a(eVar).a(), true);
        }
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m136a(e eVar) {
        return eVar == e.ASSEMBLE_PUSH_FTOS || eVar == e.ASSEMBLE_PUSH_FCM;
    }

    public static boolean a(jj jjVar, e eVar) {
        if (jjVar == null || jjVar.m564a() == null || jjVar.m564a().m531a() == null) {
            return false;
        }
        return (eVar == e.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(jjVar.m564a().m531a().get("assemble_push_type"));
    }

    public static byte[] a(Context context, jj jjVar, e eVar) {
        if (a(jjVar, eVar)) {
            return bo.m190a(a(context, eVar));
        }
        return null;
    }

    public static String b(e eVar) {
        return a(eVar) + "_version";
    }

    public static void b(Context context) {
        f.a(context).register();
    }

    public static void b(Context context, e eVar, String str) {
        com.xiaomi.push.ah.a(context).a(new j(str, context, eVar));
    }

    public static String c(e eVar) {
        int i10 = k.f106791a[eVar.ordinal()];
        if (i10 == 1) {
            return "hms_push_error";
        }
        if (i10 == 2) {
            return "fcm_push_error";
        }
        if (i10 == 3) {
            return "cos_push_error";
        }
        if (i10 != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    public static void c(Context context) {
        f.a(context).unregister();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(Context context, e eVar, String str) {
        String strA = a(eVar);
        if (TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(strA, str).putString("last_check_token", b.m111a(context).m119c());
        if (m136a(eVar)) {
            editorEdit.putInt(b(eVar), a());
        }
        editorEdit.putString("syncingToken", "");
        com.xiaomi.push.p.a(editorEdit);
        com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH : update sp file success!  " + str);
    }
}
