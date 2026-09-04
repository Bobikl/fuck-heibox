package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.push.fo;
import com.xiaomi.push.fp;
import com.xiaomi.push.fq;
import com.xiaomi.push.fr;
import com.xiaomi.push.in;
import com.xiaomi.push.ja;
import com.xiaomi.push.jj;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f107873a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static volatile ar f1003a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final LinkedList<Pair<Integer, jj>> f1004a = new LinkedList<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ExecutorService f1005a = Executors.newCachedThreadPool();

    public static class a implements Callable<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f107874a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private String f1006a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f1007a;

        public a(String str, Context context, boolean z10) {
            this.f107874a = context;
            this.f1006a = str;
            this.f1007a = z10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Throwable {
            if (TextUtils.isEmpty(this.f1006a)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            if (this.f1006a.startsWith("http")) {
                av.b bVarA = av.a(this.f107874a, this.f1006a, this.f1007a);
                if (bVarA != null) {
                    return bVarA.f1021a;
                }
                com.xiaomi.channel.commonutils.logger.b.m62a("Failed get online picture/icon resource");
                return null;
            }
            Bitmap bitmapA = av.a(this.f107874a, this.f1006a);
            if (bitmapA != null) {
                return bitmapA;
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("Failed get online picture/icon resource");
            return bitmapA;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f107875a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        Notification f1008a;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public String f1009a;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f107876a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public boolean f1010a = false;
    }

    static int a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    private static int a(Context context, String str, Map<String, String> map, int i10) {
        ComponentName componentNameA;
        Intent intentB = b(context, str, map, i10);
        if (intentB == null || (componentNameA = m.a(context, intentB)) == null) {
            return 0;
        }
        return componentNameA.hashCode();
    }

    private static int a(Map<String, String> map) {
        String str = map == null ? null : map.get(l5.a.f130839h0);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static Notification a(Notification notification) {
        Object objA = com.xiaomi.push.bk.a(notification, "extraNotification");
        if (objA != null) {
            com.xiaomi.push.bk.a(objA, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    private static PendingIntent a(Context context, jj jjVar, String str, byte[] bArr, int i10) {
        return a(context, jjVar, str, bArr, i10, 0, a(context, jjVar, str));
    }

    private static PendingIntent a(Context context, jj jjVar, String str, byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        Intent intent;
        if (c(jjVar)) {
            i12 = 1000;
        } else {
            i12 = m698a(jjVar) ? 3000 : -1;
        }
        ja jaVarM564a = jjVar.m564a();
        String strM530a = jaVarM564a != null ? jaVarM564a.m530a() : "";
        boolean zM698a = m698a(jjVar);
        if (jaVarM564a != null && !TextUtils.isEmpty(jaVarM564a.f668e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(jaVarM564a.f668e));
            try {
                String protocol = new URL(jaVarM564a.f668e).getProtocol();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    ax.a(context, str, intent2);
                } else {
                    intent2.setPackage(str);
                }
            } catch (MalformedURLException unused) {
                com.xiaomi.channel.commonutils.logger.b.m62a("meet URL exception : " + jaVarM564a.f668e);
                intent2.setPackage(str);
            }
            intent2.addFlags(268435456);
            intent2.putExtra("messageId", strM530a);
            intent2.putExtra("eventMessageType", i12);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent2, 167772160) : PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        if (zM698a) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i10));
            intent.addCategory(String.valueOf(strM530a));
        } else {
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i10));
            intent.addCategory(String.valueOf(strM530a));
        }
        intent.putExtra("notification_click_button", i11);
        intent.putExtra("messageId", strM530a);
        intent.putExtra("eventMessageType", i12);
        if (zM698a || !z10) {
            a(context, intent, jjVar, jaVarM564a, strM530a, i11);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getService(context, 0, intent, 167772160) : PendingIntent.getService(context, 0, intent, 134217728);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(a(str));
        intent3.addFlags(276824064);
        intent3.putExtra("mipush_serviceIntent", intent);
        intent3.addCategory(String.valueOf(i10));
        intent3.addCategory(String.valueOf(strM530a));
        intent3.addCategory(String.valueOf(i11));
        a(context, intent3, jjVar, jaVarM564a, strM530a, i11);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent3, 167772160) : PendingIntent.getActivity(context, 0, intent3, 134217728);
    }

    private static PendingIntent a(Context context, String str, jj jjVar, byte[] bArr, int i10, int i11) {
        Map<String, String> mapM531a = jjVar.m564a().m531a();
        if (mapM531a == null) {
            return null;
        }
        boolean zA = a(context, jjVar, str);
        if (zA) {
            return a(context, jjVar, str, bArr, i10, i11, zA);
        }
        Intent intentM693a = m693a(context, str, mapM531a, i11);
        if (intentM693a != null) {
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intentM693a, 167772160) : PendingIntent.getActivity(context, 0, intentM693a, 134217728);
        }
        return null;
    }

    public static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Intent m693a(Context context, String str, Map<String, String> map, int i10) {
        if (m703b(map)) {
            return a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i10)), String.format("cust_btn_%s_iu", Integer.valueOf(i10)), String.format("cust_btn_%s_ic", Integer.valueOf(i10)), String.format("cust_btn_%s_wu", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i10 == 2) {
            return a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i10 == 3) {
            return a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i10 != 4) {
            return null;
        }
        return a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    private static Intent a(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        Intent launchIntentForPackage;
        Intent intent;
        Intent uri;
        String str6 = map.get(str2);
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        if (bj.f107931a.equals(str6)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e10.getMessage());
                launchIntentForPackage = null;
            }
        } else if (bj.f107932b.equals(str6)) {
            if (map.containsKey(str3)) {
                String str7 = map.get(str3);
                if (str7 != null) {
                    try {
                        uri = Intent.parseUri(str7, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e11) {
                            e = e11;
                            com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e.getMessage());
                        }
                    } catch (URISyntaxException e12) {
                        e = e12;
                        uri = null;
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey(str4)) {
                String str8 = map.get(str4);
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str8));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (bj.f107933c.equals(str6)) {
                String str9 = map.get(str5);
                if (!TextUtils.isEmpty(str9)) {
                    String strTrim = str9.trim();
                    if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                        strTrim = "http://" + strTrim;
                    }
                    try {
                        String protocol = new URL(strTrim).getProtocol();
                        if ("http".equals(protocol) || "https".equals(protocol)) {
                            intent = new Intent("android.intent.action.VIEW");
                            try {
                                intent.setData(Uri.parse(strTrim));
                                ax.a(context, str, intent);
                            } catch (MalformedURLException e13) {
                                e = e13;
                                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e.getMessage());
                            }
                            launchIntentForPackage = intent;
                        }
                    } catch (MalformedURLException e14) {
                        e = e14;
                        intent = null;
                    }
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !com.xiaomi.push.j.m521a(context) && bj.f107933c.equals(str6)) {
                    return launchIntentForPackage;
                }
                com.xiaomi.channel.commonutils.logger.b.m62a("not resolve activity:" + launchIntentForPackage + "for buttons");
            } catch (Exception e15) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e15.getMessage());
            }
        }
        return null;
    }

    private static Bitmap a(Context context, int i10) {
        return a(context.getResources().getDrawable(i10));
    }

    private static Bitmap a(Context context, String str, boolean z10) {
        Future futureSubmit = f1005a.submit(new a(str, context, z10));
        try {
            try {
                try {
                    Bitmap bitmap = (Bitmap) futureSubmit.get(180L, TimeUnit.SECONDS);
                    if (bitmap != null) {
                        return bitmap;
                    }
                    futureSubmit.cancel(true);
                    return bitmap;
                } catch (ExecutionException e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                    futureSubmit.cancel(true);
                    return null;
                }
            } catch (InterruptedException e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
                futureSubmit.cancel(true);
                return null;
            } catch (TimeoutException e12) {
                com.xiaomi.channel.commonutils.logger.b.a(e12);
                futureSubmit.cancel(true);
                return null;
            }
        } catch (Throwable th2) {
            futureSubmit.cancel(true);
            throw th2;
        }
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static RemoteViews a(Context context, jj jjVar, byte[] bArr) {
        ja jaVarM564a = jjVar.m564a();
        String strA = a(jjVar);
        if (jaVarM564a != null && jaVarM564a.m531a() != null) {
            Map<String, String> mapM531a = jaVarM564a.m531a();
            String str = mapM531a.get("layout_name");
            String str2 = mapM531a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strA);
                    int identifier = resourcesForApplication.getIdentifier(str, com.google.android.exoplayer2.text.ttml.d.f49813w, strA);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(strA, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", strA);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> itKeys2 = jSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", strA);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", strA);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> itKeys3 = jSONObject4.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", strA);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e10) {
                        com.xiaomi.channel.commonutils.logger.b.a(e10);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
            }
        }
        return null;
    }

    @TargetApi(16)
    private static fq a(Context context, jj jjVar, byte[] bArr, String str, int i10) {
        PendingIntent pendingIntentA;
        String strA = a(jjVar);
        Map<String, String> mapM531a = jjVar.m564a().m531a();
        String str2 = mapM531a.get("notification_style_type");
        fq fqVarA = (!com.xiaomi.push.j.m521a(context) || f1003a == null) ? null : f1003a.a(context, i10, strA, mapM531a);
        if (fqVarA != null) {
            fqVarA.a(mapM531a);
            return fqVarA;
        }
        if ("2".equals(str2)) {
            fq fqVar = new fq(context);
            Bitmap bitmapA = TextUtils.isEmpty(mapM531a.get("notification_bigPic_uri")) ? null : a(context, mapM531a.get("notification_bigPic_uri"), false);
            if (bitmapA == null) {
                com.xiaomi.channel.commonutils.logger.b.m62a("can not get big picture.");
                return fqVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(fqVar);
            bigPictureStyle.bigPicture(bitmapA);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            fqVar.setStyle(bigPictureStyle);
            return fqVar;
        }
        if ("1".equals(str2)) {
            fq fqVar2 = new fq(context);
            fqVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return fqVar2;
        }
        if ("4".equals(str2) && com.xiaomi.push.j.m520a()) {
            fp fpVar = new fp(context, strA);
            if (!TextUtils.isEmpty(mapM531a.get("notification_banner_image_uri"))) {
                fpVar.setLargeIcon(a(context, mapM531a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(mapM531a.get("notification_banner_icon_uri"))) {
                fpVar.b(a(context, mapM531a.get("notification_banner_icon_uri"), false));
            }
            fpVar.a(mapM531a);
            return fpVar;
        }
        if (!"3".equals(str2) || !com.xiaomi.push.j.m520a()) {
            return new fq(context);
        }
        fr frVar = new fr(context, i10, strA);
        if (!TextUtils.isEmpty(mapM531a.get("notification_colorful_button_text")) && (pendingIntentA = a(context, strA, jjVar, bArr, i10, 4)) != null) {
            frVar.a(mapM531a.get("notification_colorful_button_text"), pendingIntentA).mo380a(mapM531a.get("notification_colorful_button_bg_color"));
        }
        if (!TextUtils.isEmpty(mapM531a.get("notification_colorful_bg_color"))) {
            frVar.b(mapM531a.get("notification_colorful_bg_color"));
        } else if (!TextUtils.isEmpty(mapM531a.get("notification_colorful_bg_image_uri"))) {
            frVar.setLargeIcon(a(context, mapM531a.get("notification_colorful_bg_image_uri"), false));
        }
        frVar.a(mapM531a);
        return frVar;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x037a  */
    /* JADX WARN: Code duplicated, block: B:129:0x037d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0397 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0399  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:152:0x0402  */
    /* JADX WARN: Code duplicated, block: B:155:0x041d  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:81:0x023a  */
    /* JADX WARN: Code duplicated, block: B:91:0x027d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0282  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @SuppressLint({"NewApi"})
    private static b a(Context context, jj jjVar, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent, int i10) throws Throwable {
        fq fqVar;
        int i11;
        Bitmap bitmapA;
        boolean z10;
        String strA;
        boolean z11;
        boolean z12;
        long jCurrentTimeMillis;
        String str;
        boolean z13;
        int iA;
        String str2;
        Notification notification;
        int iA2;
        int iA3;
        Bitmap bitmapA2;
        b bVar = new b();
        ja jaVarM564a = jjVar.m564a();
        String strA2 = a(jjVar);
        Map<String, String> mapM531a = jaVarM564a.m531a();
        String[] strArrA = a(context, jaVarM564a);
        if (remoteViews != null) {
            fqVar = new fq(context);
            fqVar.setCustomContentView(remoteViews);
        } else {
            fqVar = (mapM531a == null || !mapM531a.containsKey("notification_style_type")) ? new fq(context) : a(context, jjVar, bArr, strArrA[1], i10);
        }
        fq fqVar2 = fqVar;
        a(fqVar2, context, jjVar.b(), jjVar, bArr, i10);
        fqVar2.setContentTitle(strArrA[0]);
        fqVar2.setContentText(strArrA[1]);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        fqVar2.setWhen(jCurrentTimeMillis2);
        String strA3 = a(mapM531a, "notification_show_when");
        if (!TextUtils.isEmpty(strA3)) {
            fqVar2.setShowWhen(Boolean.parseBoolean(strA3));
        } else if (Build.VERSION.SDK_INT >= 24) {
            fqVar2.setShowWhen(true);
        }
        fqVar2.setContentIntent(pendingIntent);
        a(context, strA2, fqVar2, mapM531a);
        int i12 = Build.VERSION.SDK_INT;
        if (mapM531a == null) {
            i11 = 1;
            bitmapA = null;
        } else {
            i11 = 1;
            bitmapA = a(context, mapM531a.get("notification_small_icon_uri"), true);
        }
        if (bitmapA != null) {
            Object[] objArr = new Object[i11];
            objArr[0] = bitmapA;
            Object objA = com.xiaomi.push.bk.a("android.graphics.drawable.Icon", "createWithBitmap", objArr);
            if (objA != null) {
                Object[] objArr2 = new Object[i11];
                objArr2[0] = objA;
                com.xiaomi.push.bk.a((Object) fqVar2, "setSmallIcon", objArr2);
                Bundle bundle = new Bundle();
                bundle.putBoolean("miui.isGrayscaleIcon", i11);
                fqVar2.addExtras(bundle);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m62a("failed te get small icon with url:" + mapM531a.get("notification_small_icon_uri"));
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m62a("failed to get small icon url:" + a(mapM531a, "notification_small_icon_uri"));
        }
        fqVar2.mo380a(a(mapM531a, "notification_small_icon_color"));
        String strA4 = a(mapM531a, "__dynamic_icon_uri");
        boolean z14 = Boolean.parseBoolean(a(mapM531a, "__adiom")) || !com.xiaomi.push.j.m520a();
        if (TextUtils.isEmpty(strA4) || !z14) {
            z10 = false;
        } else {
            if (strA4.startsWith("http")) {
                av.b bVarA = av.a(context, strA4, true);
                if (bVarA != null) {
                    bitmapA2 = bVarA.f1021a;
                    bVar.f107875a = bVarA.f107888a;
                } else {
                    bitmapA2 = null;
                }
            } else {
                bitmapA2 = av.a(context, strA4);
            }
            if (bitmapA2 != null) {
                fqVar2.setLargeIcon(bitmapA2);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        Bitmap bitmapA3 = mapM531a == null ? null : a(context, mapM531a.get("notification_large_icon_uri"), true);
        if (bitmapA3 != null) {
            fqVar2.setLargeIcon(bitmapA3);
        }
        if (mapM531a != null && i12 >= 24) {
            String strA5 = mapM531a.get("notification_group");
            z11 = Boolean.parseBoolean(mapM531a.get("notification_is_summary"));
            boolean z15 = Boolean.parseBoolean(mapM531a.get("notification_group_disable_default"));
            if (TextUtils.isEmpty(strA5) && (com.xiaomi.push.j.m520a() || !z15)) {
                strA5 = a(jjVar);
            }
            String str3 = strA5;
            com.xiaomi.push.bk.a((Object) fqVar2, "setGroupSummary", Boolean.valueOf(z11));
            String str4 = mapM531a.get("notification_style_type");
            if ("com.xiaomi.xmsf".equals(context.getPackageName()) && ("4".equals(str4) || "3".equals(str4))) {
                strA = a(jjVar) + "_custom_" + jCurrentTimeMillis2;
                z12 = true;
            } else {
                strA = str3;
            }
            fqVar2.setAutoCancel(true);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (mapM531a != null && mapM531a.containsKey(RemoteMessageConst.Notification.TICKER)) {
                fqVar2.setTicker(mapM531a.get(RemoteMessageConst.Notification.TICKER));
            }
            if (jCurrentTimeMillis - f107873a > 10000) {
                f107873a = jCurrentTimeMillis;
                iA = jaVarM564a.f655a;
                if (m701b(context, strA2)) {
                    iA = a(context, strA2);
                }
                fqVar2.setDefaults(iA);
                if (mapM531a != null || (iA & 1) == 0) {
                    str = "com.xiaomi.xmsf";
                    z13 = z10;
                } else {
                    String str5 = mapM531a.get("sound_uri");
                    if (TextUtils.isEmpty(str5)) {
                        str = "com.xiaomi.xmsf";
                        z13 = z10;
                    } else {
                        z13 = z10;
                        StringBuilder sb2 = new StringBuilder();
                        str = "com.xiaomi.xmsf";
                        sb2.append("android.resource://");
                        sb2.append(strA2);
                        if (str5.startsWith(sb2.toString())) {
                            fqVar2.setDefaults(iA ^ 1);
                            fqVar2.setSound(Uri.parse(str5));
                        }
                    }
                }
            } else {
                str = "com.xiaomi.xmsf";
                z13 = z10;
                iA = -100;
            }
            str2 = "0";
            if (mapM531a != null || i12 < 26) {
                str2 = "0";
                if (mapM531a != null && i12 < 26) {
                    com.xiaomi.push.bk.a((Object) fqVar2, "setPriority", Integer.valueOf(c(mapM531a)));
                }
            } else {
                aw awVarA = aw.a(context, strA2);
                int iA4 = a(mapM531a);
                if (iA4 > 0) {
                    com.xiaomi.push.bk.a((Object) fqVar2, "setTimeoutAfter", Long.valueOf(iA4 * 1000));
                }
                as.a(jaVarM564a);
                String str6 = mapM531a.get("channel_id");
                if (!TextUtils.isEmpty(str6) || context.getApplicationInfo().targetSdkVersion >= 26) {
                    String strA6 = a(context, strA2, mapM531a);
                    int iB = b(mapM531a);
                    int i13 = jaVarM564a.f655a;
                    String str7 = mapM531a.get("channel_description");
                    String str8 = mapM531a.get("sound_uri");
                    String str9 = mapM531a.get("channel_perm");
                    cd.a(context, mapM531a, fqVar2, jCurrentTimeMillis2);
                    com.xiaomi.push.bk.a((Object) fqVar2, "setChannelId", as.a(awVarA, str6, strA6, str7, i13, iB, str8, str9));
                    if (iA == -100 && ax.a(mapM531a)) {
                        ax.a(fqVar2, z11);
                    }
                    if ("pulldown".equals(ax.a((Object) mapM531a)) && ax.a(mapM531a) && Objects.equals(mapM531a.get("pull_down_pop_type"), str2)) {
                        ax.a(fqVar2, z11);
                    }
                    if ("tts".equals(ax.a((Object) mapM531a)) && ax.a(mapM531a)) {
                        ax.a(fqVar2, z11);
                    }
                }
                String str10 = mapM531a.get("background_color");
                if (!TextUtils.isEmpty(str10)) {
                    try {
                        int i14 = Integer.parseInt(str10);
                        fqVar2.setOngoing(true);
                        fqVar2.setColor(i14);
                        com.xiaomi.push.bk.a((Object) fqVar2, "setColorized", Boolean.TRUE);
                    } catch (Exception e10) {
                        com.xiaomi.channel.commonutils.logger.b.a(e10);
                    }
                }
            }
            if (strA != null) {
                if (!z12) {
                    strA = at.a().a(context, fqVar2, strA);
                }
                com.xiaomi.push.bk.a((Object) fqVar2, "setGroup", strA);
            }
            if (com.xiaomi.push.j.m525c() && str.equals(context.getPackageName())) {
                com.xiaomi.push.bk.a("miui.util.NotificationHelper", "setTargetPkg", context, fqVar2, a(jjVar));
            }
            notification = fqVar2.getNotification();
            if (z13 && com.xiaomi.push.j.m520a()) {
                a(notification);
            }
            if (mapM531a != null) {
                if (notification.extras == null) {
                    notification.extras = new Bundle();
                }
                if (!TextUtils.isEmpty(mapM531a.get("enable_keyguard"))) {
                    ax.b(notification, Boolean.parseBoolean(mapM531a.get("enable_keyguard")));
                }
                if (!TextUtils.isEmpty(mapM531a.get("enable_float"))) {
                    ax.a(notification, Boolean.parseBoolean(mapM531a.get("enable_float")));
                }
                if (!TextUtils.isEmpty(mapM531a.get("float_small_win")) && str2.equals(mapM531a.get("float_small_win")) && com.xiaomi.push.g.e(context, strA2)) {
                    ax.a(notification, false);
                }
                iA2 = com.xiaomi.push.s.a(mapM531a.get("section_is_prr"), -1);
                iA3 = com.xiaomi.push.s.a(mapM531a.get("section_prr_cl"), -1);
                if (iA2 >= 0 && iA3 >= 0) {
                    ax.a(notification, iA2, iA3);
                }
            }
            bVar.f1008a = notification;
            return bVar;
        }
        strA = null;
        z11 = false;
        z12 = false;
        fqVar2.setAutoCancel(true);
        jCurrentTimeMillis = System.currentTimeMillis();
        if (mapM531a != null) {
            fqVar2.setTicker(mapM531a.get(RemoteMessageConst.Notification.TICKER));
        }
        if (jCurrentTimeMillis - f107873a > 10000) {
            f107873a = jCurrentTimeMillis;
            iA = jaVarM564a.f655a;
            if (m701b(context, strA2)) {
                iA = a(context, strA2);
            }
            fqVar2.setDefaults(iA);
            if (mapM531a != null) {
                str = "com.xiaomi.xmsf";
                z13 = z10;
            } else {
                str = "com.xiaomi.xmsf";
                z13 = z10;
            }
        } else {
            str = "com.xiaomi.xmsf";
            z13 = z10;
            iA = -100;
        }
        str2 = "0";
        if (mapM531a != null) {
            str2 = "0";
            if (mapM531a != null) {
                com.xiaomi.push.bk.a((Object) fqVar2, "setPriority", Integer.valueOf(c(mapM531a)));
            }
        } else {
            str2 = "0";
            if (mapM531a != null) {
                com.xiaomi.push.bk.a((Object) fqVar2, "setPriority", Integer.valueOf(c(mapM531a)));
            }
        }
        if (strA != null) {
            if (!z12) {
                strA = at.a().a(context, fqVar2, strA);
            }
            com.xiaomi.push.bk.a((Object) fqVar2, "setGroup", strA);
        }
        if (com.xiaomi.push.j.m525c()) {
            com.xiaomi.push.bk.a("miui.util.NotificationHelper", "setTargetPkg", context, fqVar2, a(jjVar));
        }
        notification = fqVar2.getNotification();
        if (z13) {
            a(notification);
        }
        if (mapM531a != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            if (!TextUtils.isEmpty(mapM531a.get("enable_keyguard"))) {
                ax.b(notification, Boolean.parseBoolean(mapM531a.get("enable_keyguard")));
            }
            if (!TextUtils.isEmpty(mapM531a.get("enable_float"))) {
                ax.a(notification, Boolean.parseBoolean(mapM531a.get("enable_float")));
            }
            if (!TextUtils.isEmpty(mapM531a.get("float_small_win"))) {
                ax.a(notification, false);
            }
            iA2 = com.xiaomi.push.s.a(mapM531a.get("section_is_prr"), -1);
            iA3 = com.xiaomi.push.s.a(mapM531a.get("section_prr_cl"), -1);
            if (iA2 >= 0) {
                ax.a(notification, iA2, iA3);
            }
        }
        bVar.f1008a = notification;
        return bVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static c m694a(Context context, jj jjVar, byte[] bArr) {
        int iC;
        Map<String, String> mapM531a;
        c cVar = new c();
        com.xiaomi.push.g.b bVarA = com.xiaomi.push.g.a(context, a(jjVar), true);
        ja jaVarM564a = jjVar.m564a();
        if (jaVarM564a != null) {
            iC = jaVarM564a.c();
            mapM531a = jaVarM564a.m531a();
        } else {
            iC = 0;
            mapM531a = null;
        }
        int iB = com.xiaomi.push.s.b(a(jjVar), iC);
        if (com.xiaomi.push.j.m521a(context) && bVarA == com.xiaomi.push.g.b.NOT_ALLOWED) {
            if (jaVarM564a != null) {
                fo.a(context.getApplicationContext()).a(jjVar.b(), b(jjVar), jaVarM564a.m530a(), "10:" + a(jjVar));
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("Do not notify because user block " + a(jjVar) + "‘s notification");
            return cVar;
        }
        if (com.xiaomi.push.j.m521a(context) && f1003a != null && f1003a.m705a(context, iB, a(jjVar), mapM531a)) {
            if (jaVarM564a != null) {
                fo.a(context.getApplicationContext()).a(jjVar.b(), b(jjVar), jaVarM564a.m530a(), "14:" + a(jjVar));
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("Do not notify because card notification is canceled or sequence incorrect");
            return cVar;
        }
        RemoteViews remoteViewsA = a(context, jjVar, bArr);
        PendingIntent pendingIntentA = a(context, jjVar, jjVar.b(), bArr, iB);
        if (pendingIntentA == null) {
            if (jaVarM564a != null) {
                fo.a(context.getApplicationContext()).a(jjVar.b(), b(jjVar), jaVarM564a.m530a(), "11");
            }
            com.xiaomi.channel.commonutils.logger.b.m62a("The click PendingIntent is null. ");
            return cVar;
        }
        b bVarA2 = a(context, jjVar, bArr, remoteViewsA, pendingIntentA, iB);
        cVar.f107876a = bVarA2.f107875a;
        cVar.f1009a = a(jjVar);
        Notification notification = bVarA2.f1008a;
        if (com.xiaomi.push.j.m520a()) {
            if (!TextUtils.isEmpty(jaVarM564a.m530a())) {
                notification.extras.putString("message_id", jaVarM564a.m530a());
            }
            notification.extras.putString("local_paid", jjVar.m565a());
            ax.a(mapM531a, notification.extras, "msg_busi_type");
            ax.a(mapM531a, notification.extras, "disable_notification_flags");
            String str = jaVarM564a.m536b() == null ? null : jaVarM564a.m536b().get("score_info");
            if (!TextUtils.isEmpty(str)) {
                notification.extras.putString("score_info", str);
            }
            notification.extras.putString("pushUid", a(jaVarM564a.f659a, "n_stats_expose"));
            int i10 = -1;
            if (c(jjVar)) {
                i10 = 1000;
            } else if (m698a(jjVar)) {
                i10 = 3000;
            }
            notification.extras.putString("eventMessageType", String.valueOf(i10));
            notification.extras.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, a(jjVar));
        }
        String str2 = jaVarM564a.m531a() != null ? jaVarM564a.m531a().get("message_count") : null;
        if (com.xiaomi.push.j.m520a() && str2 != null) {
            try {
                ax.a(notification, Integer.parseInt(str2));
            } catch (NumberFormatException e10) {
                fo.a(context.getApplicationContext()).b(jjVar.b(), b(jjVar), jaVarM564a.m530a(), "8");
                com.xiaomi.channel.commonutils.logger.b.d("fail to set message count. " + e10);
            }
        }
        String strA = a(jjVar);
        ax.m721a(notification, strA);
        aw awVarA = aw.a(context, strA);
        if (com.xiaomi.push.j.m521a(context) && f1003a != null) {
            f1003a.a(jjVar, jaVarM564a.m531a(), iB, notification);
        }
        if (com.xiaomi.push.j.m521a(context) && f1003a != null && f1003a.a(jaVarM564a.m531a(), iB, notification)) {
            com.xiaomi.channel.commonutils.logger.b.b("consume this notificaiton by agent");
        } else {
            awVarA.a(iB, notification);
            cVar.f1010a = true;
            com.xiaomi.channel.commonutils.logger.b.m62a("notification: " + jaVarM564a.m530a() + " is notifyied");
        }
        if (com.xiaomi.push.j.m520a() && com.xiaomi.push.j.m521a(context)) {
            at.a().a(context, iB, notification);
            cd.m746a(context, strA, iB, jaVarM564a.m530a(), notification);
        }
        if (m698a(jjVar)) {
            fo.a(context.getApplicationContext()).a(jjVar.b(), b(jjVar), jaVarM564a.m530a(), 3002, null);
        }
        if (c(jjVar)) {
            fo.a(context.getApplicationContext()).a(jjVar.b(), b(jjVar), jaVarM564a.m530a(), 1002, null);
        }
        if (Build.VERSION.SDK_INT < 26) {
            String strM530a = jaVarM564a.m530a();
            com.xiaomi.push.ah ahVarA = com.xiaomi.push.ah.a(context);
            int iA = a(jaVarM564a.m531a());
            if (iA > 0 && !TextUtils.isEmpty(strM530a)) {
                String str3 = "n_timeout_" + strM530a;
                ahVarA.m145a(str3);
                ahVarA.b(new am(str3, awVarA, iB), iA);
            }
        }
        Pair<Integer, jj> pair = new Pair<>(Integer.valueOf(iB), jjVar);
        LinkedList<Pair<Integer, jj>> linkedList = f1004a;
        synchronized (linkedList) {
            linkedList.add(pair);
            if (linkedList.size() > 100) {
                linkedList.remove();
            }
        }
        return cVar;
    }

    private static String a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? com.xiaomi.push.g.m397b(context, str) : map.get("channel_name");
    }

    public static String a(jj jjVar) {
        ja jaVarM564a;
        if ("com.xiaomi.xmsf".equals(jjVar.f751b) && (jaVarM564a = jjVar.m564a()) != null && jaVarM564a.m531a() != null) {
            String str = jaVarM564a.m531a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return jjVar.f751b;
    }

    public static String a(Map<String, String> map, int i10) {
        String str;
        if (i10 == 0) {
            str = "notify_effect";
        } else if (m703b(map)) {
            str = String.format("cust_btn_%s_ne", Integer.valueOf(i10));
        } else if (i10 == 1) {
            str = "notification_style_button_left_notify_effect";
        } else if (i10 == 2) {
            str = "notification_style_button_mid_notify_effect";
        } else if (i10 == 3) {
            str = "notification_style_button_right_notify_effect";
        } else {
            str = i10 == 4 ? "notification_colorful_button_notify_effect" : null;
        }
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static void a(Context context, Intent intent, jj jjVar, ja jaVar, String str, int i10) {
        if (jjVar == null || jaVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strA = a(jaVar.m531a(), i10);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if (bj.f107931a.equals(strA) || bj.f107932b.equals(strA) || bj.f107933c.equals(strA)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", jjVar.f747a);
            if (!TextUtils.isEmpty(jjVar.f751b)) {
                intent.putExtra(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, jjVar.f751b);
            }
            intent.putExtra("job_key", a(jaVar.m531a(), "jobkey"));
            intent.putExtra(i10 + lg.a.f131412e + "target_component", a(context, jjVar.f751b, jaVar.m531a(), i10));
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m695a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i10) {
        a(context, str, i10, -1);
    }

    public static void a(Context context, String str, int i10, int i11) {
        int iHashCode;
        if (context == null || TextUtils.isEmpty(str) || i10 < -1) {
            return;
        }
        aw awVarA = aw.a(context, str);
        List<StatusBarNotification> listM720b = awVarA.m720b();
        if (com.xiaomi.push.s.a(listM720b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z10 = false;
        if (i10 == -1) {
            z10 = true;
            iHashCode = 0;
        } else {
            iHashCode = ((str.hashCode() / 10) * 10) + i10;
        }
        for (StatusBarNotification statusBarNotification : listM720b) {
            if (!TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id2 = statusBarNotification.getId();
                if (!z10) {
                    if (iHashCode == id2) {
                        d.a(context, statusBarNotification, i11);
                        linkedList.add(statusBarNotification);
                        awVarA.a(id2);
                        break;
                    }
                } else {
                    linkedList.add(statusBarNotification);
                    awVarA.a(id2);
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    private static void a(Context context, String str, fq fqVar, Map<String, String> map) {
        int iA = a(context, str, "mipush_small_notification");
        int iA2 = a(context, str, "mipush_notification");
        if (com.xiaomi.push.j.m521a(context)) {
            if (iA <= 0 || iA2 <= 0) {
                b(context, str, fqVar, map);
                return;
            } else {
                fqVar.setSmallIcon(iA);
                fqVar.setLargeIcon(a(context, iA2));
                return;
            }
        }
        if (iA > 0) {
            fqVar.setSmallIcon(iA);
        } else {
            b(context, str, fqVar, map);
        }
        if (iA2 > 0) {
            fqVar.setLargeIcon(a(context, iA2));
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        aw awVarA = aw.a(context, str);
        List<StatusBarNotification> listM720b = awVarA.m720b();
        if (com.xiaomi.push.s.a(listM720b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : listM720b) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id2 = statusBarNotification.getId();
                String strA = ax.a(notification);
                String strB = ax.b(notification);
                if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strB) && a(strA, str2) && a(strB, str3)) {
                    linkedList.add(statusBarNotification);
                    awVarA.a(id2);
                }
            }
        }
        a(context, (LinkedList<? extends Object>) linkedList);
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        ca.a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    private static void a(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-2) & (-3) & (-65) & (-129));
    }

    @TargetApi(16)
    private static void a(fq fqVar, Context context, String str, jj jjVar, byte[] bArr, int i10) {
        PendingIntent pendingIntentA;
        PendingIntent pendingIntentA2;
        PendingIntent pendingIntentA3;
        PendingIntent pendingIntentA4;
        Map<String, String> mapM531a = jjVar.m564a().m531a();
        if (TextUtils.equals("3", mapM531a.get("notification_style_type")) || TextUtils.equals("4", mapM531a.get("notification_style_type"))) {
            return;
        }
        if (m703b(mapM531a)) {
            for (int i11 = 1; i11 <= 3; i11++) {
                String str2 = mapM531a.get(String.format("cust_btn_%s_n", Integer.valueOf(i11)));
                if (!TextUtils.isEmpty(str2) && (pendingIntentA4 = a(context, str, jjVar, bArr, i10, i11)) != null) {
                    fqVar.addAction(0, str2, pendingIntentA4);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(mapM531a.get("notification_style_button_left_name")) && (pendingIntentA3 = a(context, str, jjVar, bArr, i10, 1)) != null) {
            fqVar.addAction(0, mapM531a.get("notification_style_button_left_name"), pendingIntentA3);
        }
        if (!TextUtils.isEmpty(mapM531a.get("notification_style_button_mid_name")) && (pendingIntentA2 = a(context, str, jjVar, bArr, i10, 2)) != null) {
            fqVar.addAction(0, mapM531a.get("notification_style_button_mid_name"), pendingIntentA2);
        }
        if (TextUtils.isEmpty(mapM531a.get("notification_style_button_right_name")) || (pendingIntentA = a(context, str, jjVar, bArr, i10, 3)) == null) {
            return;
        }
        fqVar.addAction(0, mapM531a.get("notification_style_button_right_name"), pendingIntentA);
    }

    private static boolean a(Context context, jj jjVar, String str) {
        if (jjVar != null && jjVar.m564a() != null && jjVar.m564a().m531a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(jjVar.m564a().m531a().get("use_clicked_activity")) && m.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("should clicked activity params are null.");
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m696a(Context context, String str) {
        return com.xiaomi.push.g.m398b(context, str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m697a(Context context, String str, boolean z10) {
        return com.xiaomi.push.j.m520a() && !z10 && m696a(context, str);
    }

    private static boolean a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        String strM530a = jaVar.m530a();
        return !TextUtils.isEmpty(strM530a) && strM530a.length() == 22 && "satuigmo".indexOf(strM530a.charAt(0)) >= 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m698a(jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        return a(jaVarM564a) && jaVarM564a.l();
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m699a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074 A[PHI: r0 r3
  0x0074: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:18:0x0072, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0074: PHI (r3v15 java.lang.String) = (r3v14 java.lang.String), (r3v21 java.lang.String) binds: [B:18:0x0072, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    private static String[] a(Context context, ja jaVar) {
        String str;
        String strM538c = jaVar.m538c();
        String strD = jaVar.d();
        Map<String, String> mapM531a = jaVar.m531a();
        if (mapM531a != null) {
            int iIntValue = Float.valueOf((context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f).intValue();
            if (iIntValue <= 320) {
                String str2 = mapM531a.get("title_short");
                if (!TextUtils.isEmpty(str2)) {
                    strM538c = str2;
                }
                str = mapM531a.get("description_short");
                if (!TextUtils.isEmpty(str)) {
                    strD = str;
                }
            } else if (iIntValue > 360) {
                String str3 = mapM531a.get("title_long");
                if (!TextUtils.isEmpty(str3)) {
                    strM538c = str3;
                }
                str = mapM531a.get("description_long");
                if (!TextUtils.isEmpty(str)) {
                    strD = str;
                }
            }
        }
        return new String[]{strM538c, strD};
    }

    private static int b(Context context, String str) {
        int iA = a(context, str, "mipush_notification");
        int iA2 = a(context, str, "mipush_small_notification");
        if (iA <= 0) {
            iA = iA2 > 0 ? iA2 : context.getApplicationInfo().icon;
        }
        return iA == 0 ? context.getApplicationInfo().logo : iA;
    }

    private static int b(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.c("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("parsing channel importance error: " + e10);
            return 3;
        }
    }

    public static Intent b(Context context, String str, Map<String, String> map, int i10) {
        Intent launchIntentForPackage;
        String str2;
        Intent intent;
        Intent uri;
        if (map == null) {
            return null;
        }
        if (i10 != 0) {
            return m693a(context, str, map, i10);
        }
        if (!map.containsKey("notify_effect")) {
            return null;
        }
        String str3 = map.get("notify_effect");
        int i11 = -1;
        String str4 = map.get("intent_flag");
        try {
            if (!TextUtils.isEmpty(str4)) {
                i11 = Integer.parseInt(str4);
            }
        } catch (NumberFormatException e10) {
            com.xiaomi.channel.commonutils.logger.b.d("Cause by intent_flag: " + e10.getMessage());
        }
        if (bj.f107931a.equals(str3)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e11.getMessage());
                launchIntentForPackage = null;
            }
        } else if (bj.f107932b.equals(str3)) {
            if (map.containsKey("intent_uri")) {
                String str5 = map.get("intent_uri");
                if (str5 != null) {
                    try {
                        uri = Intent.parseUri(str5, 1);
                        try {
                            uri.setPackage(str);
                        } catch (URISyntaxException e12) {
                            e = e12;
                            com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e.getMessage());
                        }
                    } catch (URISyntaxException e13) {
                        e = e13;
                        uri = null;
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey("class_name")) {
                String str6 = map.get("class_name");
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str6));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (bj.f107933c.equals(str3) && (str2 = map.get("web_uri")) != null) {
                String strTrim = str2.trim();
                if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                    strTrim = "http://" + strTrim;
                }
                try {
                    String protocol = new URL(strTrim).getProtocol();
                    if ("http".equals(protocol) || "https".equals(protocol)) {
                        intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(strTrim));
                            ax.a(context, str, intent);
                        } catch (MalformedURLException e14) {
                            e = e14;
                            com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e.getMessage());
                        }
                        launchIntentForPackage = intent;
                    }
                } catch (MalformedURLException e15) {
                    e = e15;
                    intent = null;
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            if (i11 >= 0) {
                launchIntentForPackage.setFlags(i11);
            }
            a(launchIntentForPackage);
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !com.xiaomi.push.j.m521a(context) && bj.f107933c.equals(str3)) {
                    return launchIntentForPackage;
                }
                com.xiaomi.channel.commonutils.logger.b.m62a("not resolve activity:" + launchIntentForPackage);
            } catch (Exception e16) {
                com.xiaomi.channel.commonutils.logger.b.d("Cause: " + e16.getMessage());
            }
        }
        return null;
    }

    public static String b(jj jjVar) {
        if (m698a(jjVar)) {
            return "E100002";
        }
        if (c(jjVar)) {
            return "E100000";
        }
        if (m702b(jjVar)) {
            return "E100001";
        }
        return d(jjVar) ? "E100003" : "";
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m700b(Context context, String str) {
        if (!com.xiaomi.push.j.m521a(context) || f1003a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f1003a.a(str);
    }

    static void b(Context context, String str, int i10) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i10).commit();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    private static void b(Context context, String str, fq fqVar, Map<String, String> map) {
        boolean z10;
        int iA;
        if (com.xiaomi.push.j.m521a(context)) {
            z10 = false;
        } else {
            String strA = a(map, "fcm_icon_uri");
            String strA2 = a(map, "fcm_icon_color");
            if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2) || (iA = a(context, str, strA)) <= 0) {
                z10 = false;
            } else {
                z10 = true;
                fqVar.setSmallIcon(iA);
                fqVar.mo380a(strA2);
            }
        }
        if (z10) {
            return;
        }
        fqVar.setSmallIcon(Icon.createWithResource(str, ax.a(context, str)));
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    static boolean m701b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m702b(jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        return a(jaVarM564a) && jaVarM564a.f661b == 1 && !m698a(jjVar);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static boolean m703b(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("meta extra is null");
        return false;
    }

    private static int c(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("parsing notification priority error: " + e10);
            return 0;
        }
    }

    static void c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    public static boolean c(jj jjVar) {
        ja jaVarM564a = jjVar.m564a();
        return a(jaVarM564a) && jaVarM564a.f661b == 0 && !m698a(jjVar);
    }

    public static boolean d(jj jjVar) {
        return jjVar.a() == in.Registration;
    }

    public static boolean e(jj jjVar) {
        return m698a(jjVar) || c(jjVar) || m702b(jjVar);
    }
}
