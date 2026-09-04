package com.igexin.push.extension.distribution.basic.a;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.bean.k;
import com.igexin.sdk.PushConsts;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a implements com.igexin.push.core.a.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63897a = "EXT-" + a.class.getName();

    private int a() {
        try {
            Field field = Class.forName("com.android.internal.R$id").getField("icon");
            field.setAccessible(true);
            return field.getInt(null);
        } catch (Exception unused) {
            return 0;
        }
    }

    private int a(com.igexin.push.extension.distribution.basic.b.a aVar, boolean z10) {
        int identifier;
        int identifier2 = 0;
        if (!z10) {
            if (!TextUtils.isEmpty(com.igexin.push.core.d.ay) && (identifier2 = com.igexin.push.core.d.f63671e.getResources().getIdentifier(com.igexin.push.core.d.ay, "drawable", com.igexin.push.core.d.f63669c)) == 0) {
                identifier2 = com.igexin.push.core.d.f63671e.getResources().getIdentifier(com.igexin.push.core.d.ay, "mipmap", com.igexin.push.core.d.f63669c);
            }
            int identifier3 = com.igexin.push.core.d.f63671e.getResources().getIdentifier("push", "drawable", com.igexin.push.core.d.f63669c);
            if (identifier3 == 0) {
                identifier3 = com.igexin.push.core.d.f63671e.getResources().getIdentifier("push", "mipmap", com.igexin.push.core.d.f63669c);
            }
            if (TextUtils.isEmpty(aVar.s()) || "null".equals(aVar.s())) {
                return identifier2 > 0 ? identifier2 : identifier3;
            }
            if (aVar.s().startsWith("@")) {
                String strS = aVar.s();
                return strS.substring(1, strS.length()).endsWith("email") ? R.drawable.sym_action_email : R.drawable.sym_def_app_icon;
            }
            if (!"push".equals(aVar.s()) || identifier2 <= 0) {
                identifier = com.igexin.push.core.d.f63671e.getResources().getIdentifier(aVar.s(), "drawable", com.igexin.push.core.d.f63669c);
                if (identifier == 0) {
                    identifier = com.igexin.push.core.d.f63671e.getResources().getIdentifier(aVar.s(), "mipmap", com.igexin.push.core.d.f63669c);
                }
            } else {
                identifier = identifier2;
            }
            if (identifier > 0) {
                return identifier;
            }
            return identifier2 > 0 ? identifier2 : identifier3;
        }
        if (!TextUtils.isEmpty(com.igexin.push.core.d.ax)) {
            int identifier4 = com.igexin.push.core.d.f63671e.getResources().getIdentifier(com.igexin.push.core.d.ax, "drawable", com.igexin.push.core.d.f63669c);
            if (identifier4 == 0) {
                identifier4 = com.igexin.push.core.d.f63671e.getResources().getIdentifier(com.igexin.push.core.d.ax, "mipmap", com.igexin.push.core.d.f63669c);
            }
            if (identifier4 > 0) {
                return identifier4;
            }
        }
        int identifier5 = com.igexin.push.core.d.f63671e.getResources().getIdentifier("push_small", "drawable", com.igexin.push.core.d.f63669c);
        if (identifier5 == 0) {
            identifier5 = com.igexin.push.core.d.f63671e.getResources().getIdentifier("push_small", "mipmap", com.igexin.push.core.d.f63669c);
        }
        if (identifier5 != 0) {
            String str = f63897a;
            com.igexin.a.a.c.b.a(str, "|push_small.png is set, use default push_small");
            com.igexin.a.a.c.b.a(str + "|push_small.png is set, use default push_small", new Object[0]);
            return identifier5;
        }
        String str2 = f63897a;
        com.igexin.a.a.c.b.c(str2, "|push_small.png is missing");
        com.igexin.a.a.c.b.a(str2 + "|push_small.png is missing", new Object[0]);
        return com.igexin.push.core.d.f63671e.getApplicationInfo().icon;
    }

    private int a(String str) {
        int iCharAt = 0;
        for (int i10 = 0; i10 != str.length(); i10++) {
            iCharAt = (iCharAt * 131) + str.charAt(i10);
        }
        if (iCharAt == Integer.MIN_VALUE) {
            iCharAt = 1;
        }
        return Math.abs(iCharAt);
    }

    @TargetApi(26)
    private Notification.Builder a(com.igexin.push.extension.distribution.basic.b.a aVar) {
        Notification.Builder builder = new Notification.Builder(com.igexin.push.core.d.f63671e);
        NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.d.f63671e.getSystemService("notification");
        try {
            Class<?> cls = Class.forName("android.app.NotificationChannel");
            Constructor<?> constructor = cls.getConstructor(String.class, CharSequence.class, Integer.TYPE);
            int iG = aVar.j() ? 4 : aVar.g();
            Class<?> cls2 = notificationManager.getClass();
            try {
                if (((Parcelable) cls2.getMethod("getNotificationChannel", String.class).invoke(notificationManager, aVar.e())) == null) {
                    Parcelable parcelable = (Parcelable) constructor.newInstance(aVar.e(), aVar.f(), Integer.valueOf(iG));
                    Method method = cls2.getMethod("createNotificationChannel", Class.forName("android.app.NotificationChannel"));
                    Method method2 = cls.getMethod("enableVibration", Boolean.TYPE);
                    Method method3 = cls.getMethod("setSound", Uri.class, AudioAttributes.class);
                    method2.invoke(parcelable, Boolean.valueOf(aVar.A()));
                    if (!aVar.B()) {
                        method3.invoke(parcelable, null, null);
                    } else if (!TextUtils.isEmpty(aVar.C())) {
                        method3.invoke(parcelable, b(aVar.C()), null);
                    }
                    method.invoke(notificationManager, parcelable);
                }
                builder.getClass().getMethod("setChannelId", String.class).invoke(builder, aVar.e());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        return builder;
    }

    private Notification a(Notification notification, com.igexin.push.extension.distribution.basic.b.a aVar) {
        notification.defaults = 4;
        notification.ledARGB = -16711936;
        notification.ledOnMS = 1000;
        notification.ledOffMS = 3000;
        notification.flags = 1;
        if (aVar.B()) {
            if (TextUtils.isEmpty(aVar.C())) {
                notification.defaults |= 1;
            } else {
                notification.sound = b(aVar.C());
            }
        }
        notification.flags = aVar.E() ? notification.flags | 16 : notification.flags | 32;
        if (aVar.A()) {
            notification.defaults |= 2;
        }
        notification.icon = a(aVar, true);
        return notification;
    }

    private PendingIntent a(Intent intent) {
        return PendingIntent.getService(com.igexin.push.core.d.f63671e, new Random().nextInt(1000), intent, (com.igexin.push.extension.distribution.basic.g.d.a(com.igexin.push.core.d.f63671e) < 31 || Build.VERSION.SDK_INT < 30) ? 134217728 : 67108864);
    }

    private PendingIntent a(String str, String str2, int i10, com.igexin.push.extension.distribution.basic.b.a aVar, boolean z10) {
        Intent intent = new Intent(com.igexin.push.extension.distribution.basic.c.b.f63952a);
        intent.putExtra("taskid", str);
        intent.putExtra("messageid", str2);
        intent.putExtra("appid", com.igexin.push.core.d.f63655a);
        intent.putExtra("actionid", aVar.getDoActionId());
        intent.putExtra("accesstoken", com.igexin.push.extension.distribution.basic.c.e.f63964d);
        intent.putExtra("notifID", i10);
        intent.putExtra("notifyStyle", aVar.x() + "");
        intent.putExtra("id", aVar.i() + "");
        intent.putExtra("bigStyle", aVar.l() + "");
        intent.putExtra("isFloat", z10);
        intent.putExtra("checkpackage", com.igexin.push.core.d.f63671e.getPackageName());
        intent.putExtra("feedbackid", aVar.getActionId().substring(aVar.getActionId().length() + (-1)));
        String strQ = aVar.q();
        if (strQ == null) {
            strQ = "";
        }
        intent.putExtra("title", strQ);
        String strR = aVar.r();
        if (strR == null) {
            strR = "";
        }
        intent.putExtra("content", strR);
        String strA = aVar.a();
        if (strA == null) {
            strA = "";
        }
        intent.putExtra("url", strA);
        String strB = aVar.b();
        if (strB == null) {
            strB = "";
        }
        intent.putExtra(RemoteMessageConst.Notification.INTENT_URI, strB);
        String strC = aVar.c();
        intent.putExtra(AssistPushConsts.MSG_TYPE_PAYLOAD, strC != null ? strC : "");
        if (com.igexin.push.extension.distribution.basic.g.c.a("4.4.3.15", "2.11.0.0") < 0) {
            return PendingIntent.getBroadcast(com.igexin.push.core.d.f63671e, new Random().nextInt(1000), intent, 134217728);
        }
        try {
            Intent intent2 = new Intent(com.igexin.push.core.d.f63671e, Class.forName("com.igexin.sdk.GetuiActivity"));
            intent2.setFlags(268435456);
            intent2.putExtra("action", PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK);
            intent2.putExtra("broadcast_intent", intent);
            return PendingIntent.getActivity(com.igexin.push.core.d.f63671e, new Random().nextInt(1000), intent2, 201326592);
        } catch (Throwable unused) {
            Intent intent3 = new Intent(PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK);
            intent3.setAction(PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK);
            intent3.putExtra("action", PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK);
            intent3.putExtra("broadcast_intent", intent);
            return PendingIntent.getBroadcast(com.igexin.push.core.d.f63671e, new Random().nextInt(1000), intent3, 201326592);
        }
    }

    private PendingIntent a(String str, String str2, String str3, int i10, com.igexin.push.extension.distribution.basic.b.a aVar, boolean z10) {
        try {
            Intent intent = new Intent(com.igexin.push.core.d.f63671e, Class.forName(com.igexin.push.extension.distribution.basic.g.e.a(com.igexin.push.extension.distribution.basic.c.e.f63961a)));
            intent.putExtra("taskid", str2);
            intent.putExtra("messageid", str3);
            intent.putExtra("appid", com.igexin.push.core.d.f63655a);
            intent.putExtra("appkey", str);
            intent.putExtra("actionid", aVar.getDoActionId());
            intent.putExtra("notifyStyle", aVar.x() + "");
            intent.putExtra("id", aVar.i() + "");
            intent.putExtra("feedbackid", aVar.getActionId().substring(aVar.getActionId().length() + (-1)));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_NOTIFICATION_DELETE);
            return a(intent);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63897a + "|getDelPendingIntent err：" + e10.toString(), new Object[0]);
            return null;
        }
    }

    private void a(String str, String str2, String str3, String str4, com.igexin.push.extension.distribution.basic.b.a aVar) {
        Context context = com.igexin.push.core.d.f63671e;
        if (context == null) {
            return;
        }
        Intent intent = null;
        try {
            Class clsB = b(context);
            if (clsB == null || com.igexin.push.core.d.f63655a == null) {
                return;
            }
            Intent intent2 = new Intent(com.igexin.push.core.d.f63671e, (Class<?>) clsB);
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("action", 10011);
                Class<?> cls = Class.forName("com.igexin.sdk.message.GTNotificationMessage");
                try {
                    bundle.putSerializable(PushConsts.KEY_NOTIFICATION_ARRIVED, (Serializable) cls.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class).newInstance(str, str2, str3, str4, aVar.a(), aVar.b(), aVar.c()));
                } catch (Throwable unused) {
                    if (com.igexin.push.extension.distribution.basic.g.c.a("4.4.3.15", "2.12.0.0") == 0) {
                        bundle.putSerializable("notification_arrive", (Serializable) cls.getConstructor(String.class, String.class).newInstance(str, str2));
                    } else {
                        bundle.putSerializable(PushConsts.KEY_NOTIFICATION_ARRIVED, (Serializable) cls.getConstructor(String.class, String.class, String.class, String.class).newInstance(str, str2, str3, str4));
                    }
                }
                intent2.putExtras(bundle);
                if (a(com.igexin.push.core.d.f63671e)) {
                    com.igexin.push.extension.distribution.basic.c.a.a().a(com.igexin.push.core.d.f63671e, intent2, 1902131808);
                    return;
                } else {
                    com.igexin.push.core.d.f63671e.startService(intent2);
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                intent = intent2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        com.igexin.a.a.c.b.a(f63897a + "|" + th.toString(), new Object[0]);
        if (!(th instanceof IllegalStateException) || com.igexin.push.extension.distribution.basic.g.c.a("4.4.3.15", "2.13.1.0") < 0) {
            return;
        }
        com.igexin.push.extension.distribution.basic.c.a.a().a(com.igexin.push.core.d.f63671e, intent, 1902131808);
    }

    private boolean a(Context context) {
        return com.igexin.push.extension.distribution.basic.g.c.a("4.4.3.15", "2.13.1.0") >= 0 && com.igexin.push.extension.distribution.basic.g.b.b();
    }

    private Uri b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return Uri.parse("android.resource://" + com.igexin.push.core.d.f63671e.getPackageName() + "/raw/" + str.toLowerCase());
        } catch (Throwable unused) {
            return null;
        }
    }

    private Class b(Context context) {
        try {
            com.igexin.push.extension.distribution.basic.d.a.a();
            String strC = com.igexin.push.extension.distribution.basic.d.a.c();
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            return Class.forName(strC);
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63897a + "|" + th2.toString(), new Object[0]);
            return null;
        }
    }

    private Bitmap c(String str) {
        if (str != null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
                if (bitmapDecodeFile != null) {
                    return bitmapDecodeFile;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        boolean z10;
        if (!(baseAction instanceof com.igexin.push.extension.distribution.basic.b.a)) {
            return com.igexin.push.core.a.stop;
        }
        com.igexin.push.extension.distribution.basic.b.a aVar = (com.igexin.push.extension.distribution.basic.b.a) baseAction;
        String strT = aVar.t();
        String strP = aVar.p();
        String taskId = pushTaskBean.getTaskId();
        String messageId = pushTaskBean.getMessageId();
        boolean z11 = true;
        if (strP != null) {
            String strA = com.igexin.push.extension.distribution.basic.c.c.a().a(strP);
            if (strA.equals("")) {
                aVar.c(false);
                z10 = true;
            } else {
                aVar.h(strA);
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (strT != null) {
            String strA2 = com.igexin.push.extension.distribution.basic.c.c.a().a(strT);
            if (strA2.equals("")) {
                aVar.d(false);
            } else {
                aVar.n(strA2);
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (!z11 && !z10) {
            return com.igexin.push.core.a.success;
        }
        if (z11) {
            a(strT, taskId, messageId, baseAction, 2);
        }
        if (z10) {
            a(strP, taskId, messageId, baseAction, 8);
        }
        return com.igexin.push.core.a.wait;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        int i10;
        int i11;
        try {
            com.igexin.push.extension.distribution.basic.b.a aVar = new com.igexin.push.extension.distribution.basic.b.a();
            aVar.setType("notification");
            aVar.setActionId(jSONObject.getString("actionid"));
            aVar.setDoActionId(jSONObject.getString("do"));
            if (jSONObject.has("notifyStyle")) {
                try {
                    i10 = jSONObject.getInt("notifyStyle");
                } catch (Exception unused) {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            if (jSONObject.has("id")) {
                aVar.f(jSONObject.getString("id"));
            }
            if (jSONObject.has("title")) {
                aVar.j(jSONObject.getString("title"));
            }
            if (jSONObject.has("text")) {
                aVar.k(jSONObject.getString("text"));
            }
            if (TextUtils.isEmpty(aVar.q()) && TextUtils.isEmpty(aVar.r()) && i10 != 4) {
                com.igexin.a.a.c.b.a(f63897a + "|title and content is empty, not support", new Object[0]);
                return null;
            }
            if (i10 == 4) {
                aVar.f(4);
                com.igexin.a.a.c.b.a(f63897a + "Do not support notifyStyle4", new Object[0]);
                return null;
            }
            com.igexin.a.a.c.b.a(f63897a, "parse notify style 0");
            aVar.f(0);
            if (jSONObject.has("bigStyle")) {
                try {
                    i11 = jSONObject.getInt("bigStyle");
                } catch (Exception unused2) {
                    i11 = 0;
                }
                if (i11 > 3 || i11 < 1) {
                    i11 = 0;
                }
            } else {
                i11 = 0;
            }
            aVar.c(i11);
            if (jSONObject.has("logo_url") && jSONObject.getString("logo_url").startsWith("http")) {
                aVar.m(jSONObject.getString("logo_url"));
            }
            if (jSONObject.has(com.max.xiaoheihe.module.game.adapter.overview.b.f85771p) && !"".equals(jSONObject.getString(com.max.xiaoheihe.module.game.adapter.overview.b.f85771p))) {
                String string = jSONObject.getString(com.max.xiaoheihe.module.game.adapter.overview.b.f85771p);
                if (string.lastIndexOf(com.max.mediaselector.lib.config.f.f75141t) == -1 && string.lastIndexOf(com.max.mediaselector.lib.config.f.f75139r) == -1) {
                    string = "";
                } else {
                    int iIndexOf = string.indexOf(com.max.mediaselector.lib.config.f.f75141t);
                    if (iIndexOf == -1) {
                        iIndexOf = string.indexOf(com.max.mediaselector.lib.config.f.f75139r);
                    }
                    if (iIndexOf != -1) {
                        string = string.substring(0, iIndexOf);
                        if (Pattern.compile("^\\d+$").matcher(string).matches()) {
                            string = "";
                        }
                    }
                }
                aVar.l(string);
            }
            try {
                if (jSONObject.has("priority")) {
                    int i12 = jSONObject.getInt("priority");
                    if (i12 <= -3 || i12 >= 3) {
                        aVar.b(0);
                    } else {
                        aVar.b(i12);
                    }
                }
            } catch (Exception unused3) {
                aVar.b(0);
            }
            if (i11 == 1 && jSONObject.has("big_image_url") && jSONObject.getString("big_image_url").startsWith("http")) {
                aVar.i(jSONObject.getString("big_image_url"));
            } else if (i11 == 2 && jSONObject.has("big_text") && !jSONObject.getString("big_text").equals("")) {
                aVar.g(jSONObject.getString("big_text"));
            } else if (i11 == 3) {
                com.igexin.a.a.c.b.a(f63897a + "big style = 3 doesn't support", new Object[0]);
                return null;
            }
            if (jSONObject.has("isFloat")) {
                aVar.b(jSONObject.getBoolean("isFloat"));
            }
            if (jSONObject.has("is_noclear")) {
                aVar.g(!jSONObject.getBoolean("is_noclear"));
            }
            if (jSONObject.has("is_novibrate")) {
                aVar.e(!jSONObject.getBoolean("is_novibrate"));
            }
            if (jSONObject.has("is_noring")) {
                aVar.f(!jSONObject.getBoolean("is_noring"));
            }
            if (jSONObject.has("color")) {
                aVar.o(jSONObject.getString("color"));
            }
            if (jSONObject.has("channel")) {
                aVar.d(jSONObject.getString("channel"));
            }
            if (jSONObject.has("channelName")) {
                aVar.e(jSONObject.getString("channelName"));
            }
            if (jSONObject.has("channelLevel")) {
                aVar.a(jSONObject.getInt("channelLevel"));
            }
            if (jSONObject.has("badgeAddNum")) {
                aVar.h(jSONObject.optInt("badgeAddNum"));
            }
            if (jSONObject.has("ringName")) {
                aVar.p(jSONObject.getString("ringName"));
            }
            if (aVar.g() > 4 || aVar.g() < 0) {
                aVar.a(3);
            }
            if (jSONObject.has("notifyid")) {
                try {
                    aVar.g(Integer.parseInt(jSONObject.optString("notifyid")));
                    aVar.a(true);
                } catch (NumberFormatException unused4) {
                    com.igexin.a.a.c.b.a(f63897a + (" NotificationAction.parseAction() : " + jSONObject.optString("notifyid") + lg.a.f131412e), new Object[0]);
                }
            }
            return aVar;
        } catch (Exception unused5) {
            return null;
        }
    }

    public void a(String str, String str2, String str3, BaseAction baseAction, int i10) {
        String str4;
        String str5;
        String str6 = "width=" + com.igexin.push.extension.distribution.basic.c.e.f63963c + "&height=" + com.igexin.push.extension.distribution.basic.c.e.f63962b;
        if (str.contains(str6)) {
            str4 = str;
        } else {
            if (str.indexOf("?") > 0) {
                str5 = str + "&" + str6;
            } else {
                str5 = str + "?" + str6;
            }
            str4 = str5;
        }
        com.igexin.push.extension.distribution.basic.f.c cVar = new com.igexin.push.extension.distribution.basic.f.c(str4, str, str2, baseAction, i10, new b(this, baseAction, str2, str3, str, i10));
        if (i10 == 2) {
            com.igexin.push.extension.distribution.basic.b.a aVar = (com.igexin.push.extension.distribution.basic.b.a) baseAction;
            aVar.e(aVar.w() + 1);
        } else if (i10 == 8) {
            com.igexin.push.extension.distribution.basic.b.a aVar2 = (com.igexin.push.extension.distribution.basic.b.a) baseAction;
            aVar2.d(aVar2.o() + 1);
        }
        com.igexin.a.a.b.c.b().a(new com.igexin.push.extension.distribution.basic.f.a(cVar), false, true);
    }

    public void a(String str, String str2, String str3, com.igexin.push.extension.distribution.basic.b.a aVar, int i10) {
        a aVar2;
        Notification.Style styleBigText;
        Bitmap bitmapC;
        com.igexin.push.core.d.f63659ad.put(str2, Integer.valueOf(i10));
        PushTaskBean pushTaskBean = com.igexin.push.core.d.f63658ac.get(str2 + ":" + str3);
        if (pushTaskBean != null) {
            byte[] msgExtra = pushTaskBean.getMsgExtra();
            if (msgExtra != null) {
                aVar.c(new String(msgExtra));
            }
            for (BaseAction baseAction : pushTaskBean.getActionChains()) {
                if (baseAction instanceof k) {
                    String strA = ((k) baseAction).a();
                    if (strA == null) {
                        strA = "";
                    }
                    aVar.a(strA);
                }
                if (baseAction instanceof com.igexin.push.extension.distribution.basic.b.d) {
                    String strA2 = ((com.igexin.push.extension.distribution.basic.b.d) baseAction).a();
                    if (strA2 == null) {
                        strA2 = "";
                    }
                    aVar.b(strA2);
                }
            }
        }
        PendingIntent pendingIntentA = a(str2, str3, i10, aVar, false);
        PendingIntent pendingIntentA2 = a(str, str2, str3, i10, aVar, false);
        NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.d.f63671e.getSystemService("notification");
        String strU = aVar.u();
        String strQ = aVar.q();
        String strR = aVar.r();
        Bitmap bitmapDecodeResource = null;
        if (strU != null && !"".equals(strU)) {
            bitmapDecodeResource = c(strU);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f63897a);
            sb2.append("|use net logo bitmap is null = ");
            sb2.append(bitmapDecodeResource == null);
            com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
        }
        if (bitmapDecodeResource == null) {
            bitmapDecodeResource = BitmapFactory.decodeResource(com.igexin.push.extension.distribution.basic.c.e.f63961a.getResources(), a(aVar, false));
        }
        new Notification();
        int i11 = Build.VERSION.SDK_INT;
        Notification.Builder builder = new Notification.Builder(com.igexin.push.core.d.f63671e);
        if (i11 >= 26) {
            builder = a(aVar);
        }
        int iA = a(aVar, true);
        if (iA != 0 && com.igexin.push.core.d.f63671e.getResources().getDrawable(iA) == null) {
            com.igexin.a.a.c.b.a(f63897a + "|showNotification smallIconId: " + iA + " couldn't find resource", new Object[0]);
            return;
        }
        if (!TextUtils.isEmpty(strQ)) {
            builder.setContentTitle(strQ);
        }
        if (!TextUtils.isEmpty(strR)) {
            builder.setContentText(strR);
        }
        builder.setSmallIcon(iA).setTicker(aVar.r()).setWhen(System.currentTimeMillis()).setLargeIcon(bitmapDecodeResource).setContentIntent(pendingIntentA).setDeleteIntent(pendingIntentA2);
        builder.setShowWhen(true);
        if (i11 >= 24 && !TextUtils.isEmpty(aVar.y())) {
            try {
                builder.setColor(Color.parseColor(aVar.y()));
            } catch (Throwable unused) {
            }
        }
        if (aVar.l() == c.BIG_IMAGE.a()) {
            String strM = aVar.m();
            aVar2 = this;
            if (!TextUtils.isEmpty(strM) && (bitmapC = aVar2.c(strM)) != null) {
                builder.setPriority(aVar.h());
                styleBigText = new Notification.BigPictureStyle().bigPicture(bitmapC);
                builder.setStyle(styleBigText);
            }
        } else {
            aVar2 = this;
            if (aVar.l() == c.LONG_TEXT.a()) {
                String strK = aVar.k();
                if (!TextUtils.isEmpty(strK)) {
                    builder.setPriority(aVar.h());
                    styleBigText = new Notification.BigTextStyle().bigText(strK);
                    builder.setStyle(styleBigText);
                }
            }
        }
        if (aVar.j() && (aVar.A() || aVar.B())) {
            builder.setPriority(2);
        }
        Notification notification = builder.getNotification();
        aVar2.a(notification, aVar);
        com.igexin.push.extension.distribution.basic.g.f.a(notificationManager, i10, notification, 0, aVar);
        if (com.igexin.push.extension.distribution.basic.g.c.a("4.4.3.15", "2.12.0.0") >= 0) {
            a(str2, str3, strQ, strR, aVar);
        }
    }

    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        if (pushTaskBean != null && (baseAction instanceof com.igexin.push.extension.distribution.basic.b.a)) {
            com.igexin.push.extension.distribution.basic.b.a aVar = (com.igexin.push.extension.distribution.basic.b.a) baseAction;
            int iA = !aVar.d() ? a(pushTaskBean.getTaskId()) : aVar.z();
            int i10 = 0;
            try {
                i10 = Integer.parseInt(aVar.getActionId().substring(aVar.getActionId().length() - 1)) + 30000;
            } catch (Exception unused) {
            }
            a(pushTaskBean.getAppKey(), pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), aVar, iA);
            if (i10 != 0) {
                com.igexin.push.core.a.e.a().a(pushTaskBean, i10 + "", "notifyStyle:" + aVar.x());
            }
            pushTaskBean.setPerActionid(Integer.parseInt(aVar.getActionId()));
            pushTaskBean.setCurrentActionid(Integer.parseInt(aVar.getDoActionId()));
        }
        return true;
    }
}
