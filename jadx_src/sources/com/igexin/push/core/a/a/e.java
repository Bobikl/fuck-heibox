package com.igexin.push.core.a.a;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.igexin.assist.sdk.AssistPushConsts;
import com.igexin.push.config.k;
import com.igexin.push.core.CoreConsts;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.bean.j;
import com.igexin.push.core.r;
import com.igexin.push.core.x;
import com.igexin.push.util.n;
import com.igexin.sdk.GetuiActivity;
import com.igexin.sdk.PushConsts;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63473a = k.f63422a;

    private int a(com.igexin.push.core.bean.g gVar, boolean z10) {
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
            if (TextUtils.isEmpty(gVar.j()) || "null".equals(gVar.j())) {
                return identifier2 > 0 ? identifier2 : identifier3;
            }
            if (gVar.j().startsWith("@")) {
                String strJ = gVar.j();
                return strJ.substring(1, strJ.length()).endsWith("email") ? R.drawable.sym_action_email : R.drawable.sym_def_app_icon;
            }
            if (!"push".equals(gVar.j()) || identifier2 <= 0) {
                identifier = com.igexin.push.core.d.f63671e.getResources().getIdentifier(gVar.j(), "drawable", com.igexin.push.core.d.f63669c);
                if (identifier == 0) {
                    identifier = com.igexin.push.core.d.f63671e.getResources().getIdentifier(gVar.j(), "mipmap", com.igexin.push.core.d.f63669c);
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
            String str = f63473a;
            com.igexin.a.a.c.b.a(str, "|push_small.png is set, use default push_small");
            com.igexin.a.a.c.b.a(str + "|push_small.png is set, use default push_small", new Object[0]);
            return identifier5;
        }
        String str2 = f63473a;
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
    private Notification.Builder a(com.igexin.push.core.bean.g gVar) {
        Notification.Builder builder = new Notification.Builder(com.igexin.push.core.d.f63671e);
        NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.d.f63671e.getSystemService("notification");
        try {
            Class<?> cls = Class.forName("android.app.NotificationChannel");
            Constructor<?> constructor = cls.getConstructor(String.class, CharSequence.class, Integer.TYPE);
            if (constructor != null) {
                Class<?> cls2 = notificationManager.getClass();
                if (((Parcelable) cls2.getMethod("getNotificationChannel", String.class).invoke(notificationManager, gVar.n())) == null) {
                    Parcelable parcelable = (Parcelable) constructor.newInstance(gVar.n(), gVar.o(), Integer.valueOf(gVar.p()));
                    Method method = cls2.getMethod("createNotificationChannel", Class.forName("android.app.NotificationChannel"));
                    Method method2 = cls.getMethod("enableVibration", Boolean.TYPE);
                    Method method3 = cls.getMethod("setSound", Uri.class, AudioAttributes.class);
                    method2.invoke(parcelable, Boolean.valueOf(gVar.h()));
                    if (!gVar.i()) {
                        method3.invoke(parcelable, null, null);
                    } else if (!TextUtils.isEmpty(gVar.s())) {
                        method3.invoke(parcelable, b(gVar.s()), null);
                    }
                    method.invoke(notificationManager, parcelable);
                }
                builder.getClass().getMethod("setChannelId", String.class).invoke(builder, gVar.n());
            }
        } catch (Throwable unused) {
        }
        return builder;
    }

    private PendingIntent a(Intent intent) {
        return PendingIntent.getService(com.igexin.push.core.d.f63671e, new Random().nextInt(1000), intent, (n.a(com.igexin.push.core.d.f63671e) < 31 || Build.VERSION.SDK_INT < 30) ? 134217728 : 67108864);
    }

    private PendingIntent a(String str, String str2, String str3, int i10, com.igexin.push.core.bean.g gVar) {
        Intent intent = new Intent(CoreConsts.f63452b);
        intent.putExtra("taskid", str);
        intent.putExtra("messageid", str2);
        intent.putExtra("title", gVar.e() == null ? "" : gVar.e());
        intent.putExtra("content", gVar.f() == null ? "" : gVar.f());
        intent.putExtra("appid", com.igexin.push.core.d.f63655a);
        intent.putExtra("actionid", str3);
        intent.putExtra("accesstoken", com.igexin.push.core.d.f63664ai);
        intent.putExtra("notifID", i10);
        String strA = gVar.a();
        if (strA == null) {
            strA = "";
        }
        intent.putExtra("url", strA);
        String strB = gVar.b();
        if (strB == null) {
            strB = "";
        }
        intent.putExtra(RemoteMessageConst.Notification.INTENT_URI, strB);
        String strC = gVar.c();
        intent.putExtra(AssistPushConsts.MSG_TYPE_PAYLOAD, strC != null ? strC : "");
        if (n.a(com.igexin.push.core.d.f63671e) < 31 || Build.VERSION.SDK_INT < 30) {
            Intent intent2 = new Intent(com.igexin.push.core.d.f63671e, (Class<?>) x.a().b(com.igexin.push.core.d.f63671e));
            intent2.putExtra("action", PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK);
            intent2.putExtra("broadcast_intent", intent);
            return a(intent2);
        }
        Intent intent3 = new Intent(com.igexin.push.core.d.f63671e, (Class<?>) GetuiActivity.class);
        intent3.setFlags(268435456);
        intent3.putExtra("action", PushConsts.ACTION_BROADCAST_NOTIFICATION_CLICK);
        intent3.putExtra("broadcast_intent", intent);
        return PendingIntent.getActivity(com.igexin.push.core.d.f63671e, new Random().nextInt(1000), intent3, 67108864);
    }

    private PendingIntent a(String str, String str2, String str3, int i10, com.igexin.push.core.bean.g gVar, boolean z10) {
        try {
            Intent intent = new Intent(com.igexin.push.core.d.f63671e, (Class<?>) x.a().b(com.igexin.push.core.d.f63671e));
            intent.putExtra("taskid", str2);
            intent.putExtra("messageid", str3);
            intent.putExtra("appid", com.igexin.push.core.d.f63655a);
            intent.putExtra("appkey", str);
            intent.putExtra("actionid", gVar.getDoActionId());
            intent.putExtra("feedbackid", gVar.getActionId().substring(gVar.getActionId().length() - 1));
            intent.putExtra("action", PushConsts.ACTION_BROADCAST_NOTIFICATION_DELETE);
            return a(intent);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63473a + "|getDelPendingIntent err：" + e10.toString(), new Object[0]);
            return null;
        }
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

    @Override // com.igexin.push.core.a.a.a
    public com.igexin.push.core.a a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return com.igexin.push.core.a.success;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c3 A[PHI: r1
  0x00c3: PHI (r1v48 java.lang.String) = (r1v47 java.lang.String), (r1v49 java.lang.String) binds: [B:21:0x00ab, B:23:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.igexin.push.core.a.a.a
    public BaseAction a(JSONObject jSONObject) {
        String str = "";
        try {
            com.igexin.push.core.bean.g gVar = new com.igexin.push.core.bean.g();
            gVar.setType("notification");
            gVar.setActionId(jSONObject.getString("actionid"));
            gVar.setDoActionId(jSONObject.getString("do"));
            String string = jSONObject.getString("title");
            String string2 = jSONObject.getString("text");
            gVar.d(string);
            gVar.e(string2);
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                com.igexin.a.a.c.b.a(f63473a + " title & content = null", new Object[0]);
                return null;
            }
            if (jSONObject.has(com.max.xiaoheihe.module.game.adapter.overview.b.f85771p) && !"".equals(jSONObject.getString(com.max.xiaoheihe.module.game.adapter.overview.b.f85771p))) {
                String string3 = jSONObject.getString(com.max.xiaoheihe.module.game.adapter.overview.b.f85771p);
                if (string3.lastIndexOf(com.max.mediaselector.lib.config.f.f75141t) != -1 || string3.lastIndexOf(com.max.mediaselector.lib.config.f.f75139r) != -1) {
                    int iIndexOf = string3.indexOf(com.max.mediaselector.lib.config.f.f75141t);
                    if (iIndexOf == -1) {
                        iIndexOf = string3.indexOf(com.max.mediaselector.lib.config.f.f75139r);
                    }
                    if (iIndexOf != -1) {
                        string3 = string3.substring(0, iIndexOf);
                        if (!Pattern.compile("^\\d+$").matcher(string3).matches()) {
                            str = string3;
                        }
                    } else {
                        str = string3;
                    }
                }
                gVar.f(str);
            }
            if (jSONObject.has("is_noclear")) {
                gVar.b(!jSONObject.getBoolean("is_noclear"));
            }
            if (jSONObject.has("is_novibrate")) {
                gVar.c(!jSONObject.getBoolean("is_novibrate"));
            }
            if (jSONObject.has("is_noring")) {
                gVar.d(!jSONObject.getBoolean("is_noring"));
            }
            if (jSONObject.has("badgeAddNum")) {
                gVar.c(jSONObject.optInt("badgeAddNum"));
            }
            if (jSONObject.has("ringName")) {
                gVar.k(jSONObject.getString("ringName"));
            }
            if (jSONObject.has("is_chklayout")) {
                gVar.e(jSONObject.getBoolean("is_chklayout"));
            }
            if (jSONObject.has("logo_url")) {
                gVar.g(jSONObject.getString("logo_url"));
            }
            if (jSONObject.has("banner_url")) {
                gVar.h(jSONObject.getString("banner_url"));
            }
            if (jSONObject.has("channel")) {
                gVar.i(jSONObject.getString("channel"));
            }
            if (jSONObject.has("channelName")) {
                gVar.j(jSONObject.getString("channelName"));
            }
            if (jSONObject.has("channelLevel")) {
                gVar.a(jSONObject.getInt("channelLevel"));
            }
            if (jSONObject.has("notifyid")) {
                try {
                    gVar.b(Integer.parseInt(jSONObject.optString("notifyid")));
                    gVar.a(true);
                } catch (NumberFormatException unused) {
                    com.igexin.a.a.c.b.a(f63473a + (" NotificationAction.parseAction() : " + jSONObject.optString("notifyid") + lg.a.f131412e), new Object[0]);
                }
            }
            return gVar;
        } catch (JSONException unused2) {
            return null;
        }
    }

    public void a(String str, String str2, String str3, com.igexin.push.core.bean.g gVar) {
        int iA = !gVar.d() ? a(str2) : gVar.q();
        com.igexin.push.core.d.f63659ad.put(str2, Integer.valueOf(iA));
        PushTaskBean pushTaskBean = com.igexin.push.core.d.f63658ac.get(com.igexin.push.core.a.e.a().a(str2, str3));
        if (pushTaskBean != null) {
            byte[] msgExtra = pushTaskBean.getMsgExtra();
            if (msgExtra != null) {
                gVar.c(new String(msgExtra));
            }
            for (BaseAction baseAction : pushTaskBean.getActionChains()) {
                if (baseAction instanceof com.igexin.push.core.bean.k) {
                    String strA = ((com.igexin.push.core.bean.k) baseAction).a();
                    if (strA == null) {
                        strA = "";
                    }
                    gVar.a(strA);
                }
                if (baseAction instanceof j) {
                    String strA2 = ((j) baseAction).a();
                    if (strA2 == null) {
                        strA2 = "";
                    }
                    gVar.b(strA2);
                }
            }
        }
        PendingIntent pendingIntentA = a(str2, str3, gVar.getDoActionId(), iA, gVar);
        PendingIntent pendingIntentA2 = a(str, str2, str3, iA, gVar, false);
        NotificationManager notificationManager = (NotificationManager) com.igexin.push.core.d.f63671e.getSystemService("notification");
        int iA2 = a(gVar, false);
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builderA = i10 >= 26 ? a(gVar) : new Notification.Builder(com.igexin.push.core.d.f63671e);
        int iA3 = a(gVar, true);
        if (!TextUtils.isEmpty(gVar.e())) {
            builderA.setContentTitle(gVar.e());
        }
        if (!TextUtils.isEmpty(gVar.f())) {
            builderA.setContentText(gVar.f());
        }
        builderA.setShowWhen(true);
        Notification notification = builderA.setSmallIcon(iA3).setLargeIcon(BitmapFactory.decodeResource(com.igexin.push.core.d.f63671e.getResources(), iA2)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntentA).setDeleteIntent(pendingIntentA2).getNotification();
        if (com.igexin.push.util.a.g() && i10 < 24) {
            try {
                Field field = Class.forName("com.android.internal.R$id").getField("right_icon");
                field.setAccessible(true);
                int i11 = field.getInt(null);
                RemoteViews remoteViews = notification.contentView;
                if (remoteViews != null && i11 != 0) {
                    remoteViews.setViewVisibility(i11, 8);
                }
            } catch (Exception unused) {
            }
        }
        notification.tickerText = gVar.f();
        notification.defaults = 4;
        notification.ledARGB = -16711936;
        notification.ledOnMS = 1000;
        notification.ledOffMS = 3000;
        notification.flags = 1;
        notification.flags = gVar.g() ? notification.flags | 16 : notification.flags | 32;
        if (gVar.i()) {
            if (TextUtils.isEmpty(gVar.s())) {
                notification.defaults |= 1;
            } else {
                notification.sound = b(gVar.s());
            }
        }
        if (gVar.h()) {
            notification.defaults |= 2;
        }
        if (!(gVar.l() == null && gVar.k() == null) && gVar.m()) {
            return;
        }
        if (gVar.r() > 0) {
            com.igexin.push.util.b.a(gVar.r(), false);
            com.igexin.push.util.b.a(gVar.r(), notification);
        }
        notificationManager.notify(iA, notification);
        r.a().a(str2, str3, gVar.e() == null ? "" : gVar.e(), gVar.f() != null ? gVar.f() : "", gVar.a(), gVar.b(), gVar.c());
    }

    @Override // com.igexin.push.core.a.a.a
    public boolean b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        if (pushTaskBean == null || !(baseAction instanceof com.igexin.push.core.bean.g)) {
            return true;
        }
        try {
            a(pushTaskBean.getAppKey(), pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), (com.igexin.push.core.bean.g) baseAction);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
