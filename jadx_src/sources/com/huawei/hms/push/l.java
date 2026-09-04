package com.huawei.hms.push;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.o0;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* JADX INFO: compiled from: PushNotification.java */
/* JADX INFO: loaded from: classes7.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f61253a;

    private static Notification a(Context context, m mVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (h.a(mVar) == i.STYLE_BIGTEXT) {
            h.a(builder, mVar.g(), mVar);
        }
        f.a(context, builder, mVar);
        b(mVar, builder);
        d(mVar, builder);
        a(context, mVar, builder);
        a(builder);
        a(mVar, builder);
        c(mVar, builder);
        builder.setContentIntent(c(context, mVar, iArr));
        builder.setDeleteIntent(b(context, mVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, mVar);
        a(context, builder, mVar);
        return builder.build();
    }

    private static Intent a(Context context, m mVar, int[] iArr, String str, int i10) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", mVar.o()).putExtra("selfshow_token", mVar.y()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i10);
        return intent;
    }

    private static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    @SuppressLint({"NewApi"})
    private static void a(Context context, Notification.Builder builder, m mVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !d.a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String strK = mVar.k();
        HMSLog.i("PushSelfShowLog", "the package name of notification is:" + strK);
        if (!TextUtils.isEmpty(strK)) {
            String strA = d.a(context, strK);
            HMSLog.i("PushSelfShowLog", "the app name is:" + strA);
            if (strA != null) {
                bundle.putCharSequence("android.extraAppName", strA);
            }
        }
        builder.setExtras(bundle);
    }

    private static void a(Context context, Intent intent, long j10, int i10) {
        try {
            HMSLog.d("PushSelfShowLog", "enter setDelayAlarm(interval:" + j10 + "ms.");
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(o0.K0);
            if (alarmManager != null) {
                alarmManager.set(0, System.currentTimeMillis() + j10, PendingIntent.getBroadcast(context, i10, intent, d.b()));
            }
        } catch (Exception e10) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error." + e10.toString());
        }
    }

    public static synchronized void a(Context context, m mVar) {
        int iHashCode;
        int iHashCode2;
        int i10;
        int iHashCode3;
        if (context != null) {
            if (!a(mVar)) {
                HMSLog.d("PushSelfShowLog", "showNotification, the msg id = " + mVar.p());
                if (f61253a == 0) {
                    f61253a = (context.getPackageName() + System.currentTimeMillis()).hashCode();
                }
                if (TextUtils.isEmpty(mVar.l())) {
                    String strQ = mVar.q();
                    if (!TextUtils.isEmpty(strQ)) {
                        int iHashCode4 = strQ.hashCode();
                        mVar.a(iHashCode4);
                        HMSLog.d("PushSelfShowLog", "notification msgTag = " + iHashCode4);
                    }
                    if (mVar.s() != -1) {
                        iHashCode = mVar.s();
                        iHashCode2 = (mVar.k() + System.currentTimeMillis()).hashCode();
                        i10 = iHashCode2 + 1;
                        iHashCode3 = (mVar.s() + mVar.k() + context.getPackageName()).hashCode();
                    } else {
                        iHashCode = f61253a + 1;
                        iHashCode2 = iHashCode + 1;
                        i10 = iHashCode2 + 1;
                        iHashCode3 = i10 + 1;
                        f61253a = iHashCode3;
                    }
                } else {
                    iHashCode = (mVar.l() + mVar.k()).hashCode();
                    iHashCode2 = f61253a + 1;
                    i10 = iHashCode2 + 1;
                    f61253a = i10;
                    iHashCode3 = (mVar.l() + mVar.k() + context.getPackageName()).hashCode();
                }
                HMSLog.d("PushSelfShowLog", "notifyId:" + iHashCode + ",openNotifyId:" + iHashCode2 + ",delNotifyId:" + i10 + ",alarmNotifyId:" + iHashCode3);
                int[] iArr = new int[4];
                iArr[0] = iHashCode;
                iArr[1] = iHashCode2;
                iArr[2] = i10;
                if (mVar.f() <= 0) {
                    iHashCode3 = 0;
                }
                iArr[3] = iHashCode3;
                Notification notificationA = d.f() ? a(context, mVar, iArr) : null;
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null && notificationA != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        notificationManager.createNotificationChannel(new NotificationChannel("HwPushChannelID", context.getString(ResourceLoaderUtil.getStringId("hms_push_channel")), 3));
                    }
                    notificationManager.notify(iHashCode, notificationA);
                    d(context, mVar, iArr);
                    j.a(context, mVar.p(), mVar.b(), "100");
                }
            }
        }
    }

    private static void a(Context context, m mVar, Notification.Builder builder) {
        Bitmap bitmapA = f.a(context, mVar);
        if (bitmapA != null) {
            builder.setLargeIcon(bitmapA);
        }
    }

    private static void a(m mVar, Notification.Builder builder) {
        builder.setAutoCancel(mVar.e() == 1);
        builder.setOngoing(false);
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static boolean a(m mVar) {
        return mVar == null || (TextUtils.isEmpty(mVar.u()) && TextUtils.isEmpty(mVar.j()));
    }

    private static PendingIntent b(Context context, m mVar, int[] iArr) {
        return PendingIntent.getBroadcast(context, iArr[2], a(context, mVar, iArr, "2", 268435456), d.b());
    }

    @SuppressLint({"NewApi"})
    private static void b(Context context, Notification.Builder builder, m mVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String strK = mVar.k();
            if (TextUtils.isEmpty(strK)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", strK);
            builder.setExtras(bundle);
        }
    }

    private static void b(m mVar, Notification.Builder builder) {
        String strT = mVar.t();
        if (TextUtils.isEmpty(strT)) {
            return;
        }
        builder.setSubText(strT);
    }

    private static PendingIntent c(Context context, m mVar, int[] iArr) {
        Intent intentA = a(context, mVar, iArr, "1", 268435456);
        if (!a()) {
            return PendingIntent.getBroadcast(context, iArr[1], intentA, d.b());
        }
        intentA.setClass(context, TransActivity.class);
        intentA.setFlags(268468224);
        return PendingIntent.getActivity(context, iArr[1], intentA, d.b());
    }

    private static void c(m mVar, Notification.Builder builder) {
        builder.setTicker(mVar.x());
    }

    private static void d(Context context, m mVar, int[] iArr) {
        HMSLog.i("PushSelfShowLog", "setAutoClear time is: " + mVar.f());
        if (mVar.f() <= 0) {
            return;
        }
        a(context, a(context, mVar, iArr, "-1", 32), mVar.f(), iArr[3]);
    }

    private static void d(m mVar, Notification.Builder builder) {
        String strU = mVar.u();
        String strJ = mVar.j();
        if (TextUtils.isEmpty(strJ)) {
            builder.setContentText(strU);
            return;
        }
        builder.setContentText(strJ);
        if (TextUtils.isEmpty(strU)) {
            return;
        }
        builder.setContentTitle(strU);
    }
}
