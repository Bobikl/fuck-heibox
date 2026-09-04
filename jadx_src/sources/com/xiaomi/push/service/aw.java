package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.is;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class aw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f107889a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Object f1022a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static WeakHashMap<Integer, aw> f1023a = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f1024a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f1025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107890b;

    private aw(String str) {
        this.f1025a = str;
    }

    private static int a(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        try {
            return f107889a.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    private static NotificationManager a() {
        return (NotificationManager) f107889a.getSystemService("notification");
    }

    public static aw a(Context context, String str) {
        a(context);
        int iHashCode = str.hashCode();
        aw awVar = f1023a.get(Integer.valueOf(iHashCode));
        if (awVar != null) {
            return awVar;
        }
        aw awVar2 = new aw(str);
        f1023a.put(Integer.valueOf(iHashCode), awVar2);
        return awVar2;
    }

    private static <T> T a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strA = a("mipush|%s|%s", str2, "");
        return str.startsWith(strA) ? a("mipush_%s_%s", str2, str.replace(strA, "")) : str;
    }

    private static String a(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    private static void a(Context context) {
        if (f107889a == null) {
            f107889a = context.getApplicationContext();
            NotificationManager notificationManagerA = a();
            Boolean bool = (Boolean) com.xiaomi.push.bk.a((Object) notificationManagerA, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m710a("fwk is support.init:" + bool);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            f1024a = zBooleanValue;
            if (zBooleanValue) {
                f1022a = com.xiaomi.push.bk.a((Object) notificationManagerA, "getService", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    static void m710a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m62a("NMHelper:" + str);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m711a() {
        if (com.xiaomi.push.j.m520a() && az.a(f107889a).a(is.NotificationBelongToAppSwitch.a(), true)) {
            return f1024a;
        }
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m712a(Context context) {
        a(context);
        return m711a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private StatusBarNotification[] m713a() {
        if (!com.xiaomi.push.j.m521a(m715a())) {
            return null;
        }
        try {
            Object objA = com.xiaomi.push.bk.a(f1022a, "getActiveNotifications", m715a().getPackageName());
            if (objA instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) objA;
            }
            return null;
        } catch (Throwable th2) {
            m710a("getAllNotifications error " + th2);
            return null;
        }
    }

    private String b(String str) {
        return a(m711a() ? "mipush|%s|%s" : "mipush_%s_%s", this.f1025a, str);
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public NotificationChannel m714a(String str) {
        NotificationChannel notificationChannel = null;
        try {
            if (m711a()) {
                List<NotificationChannel> listM718a = m718a();
                if (listM718a != null) {
                    for (NotificationChannel notificationChannel2 : listM718a) {
                        if (str.equals(notificationChannel2.getId())) {
                            notificationChannel = notificationChannel2;
                            break;
                        }
                    }
                }
            } else {
                notificationChannel = a().getNotificationChannel(str);
            }
        } catch (Exception e10) {
            m710a("getNotificationChannel error" + e10);
        }
        return notificationChannel;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Context m715a() {
        return f107889a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m716a() {
        return this.f1025a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m717a(String str) {
        if (TextUtils.isEmpty(str)) {
            return b();
        }
        return com.xiaomi.push.j.m521a(m715a()) ? b(str) : str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public List<NotificationChannel> m718a() {
        String str;
        String str2 = this.f1025a;
        List<NotificationChannel> notificationChannels = null;
        try {
            if (m711a()) {
                int iA = a(str2);
                if (iA != -1) {
                    Object obj = f1022a;
                    Object[] objArr = {str2, Integer.valueOf(iA), Boolean.FALSE};
                    str = "mipush|%s|%s";
                    notificationChannels = (List) a(com.xiaomi.push.bk.a(obj, "getNotificationChannelsForPackage", objArr));
                } else {
                    str = null;
                }
            } else {
                notificationChannels = a().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!com.xiaomi.push.j.m520a() || notificationChannels == null) {
                return notificationChannels;
            }
            ArrayList arrayList = new ArrayList();
            String strA = a(str, str2, "");
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (notificationChannel.getId().startsWith(strA)) {
                    arrayList.add(notificationChannel);
                }
            }
            return arrayList;
        } catch (Exception e10) {
            m710a("getNotificationChannels error " + e10);
            return notificationChannels;
        }
    }

    public void a(int i10) {
        String str = this.f1025a;
        try {
            if (!m711a()) {
                a().cancel(i10);
                return;
            }
            int iA = com.xiaomi.push.i.a();
            String packageName = m715a().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                com.xiaomi.push.bk.b(f1022a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i10), Integer.valueOf(iA));
            } else {
                com.xiaomi.push.bk.b(f1022a, "cancelNotificationWithTag", str, null, Integer.valueOf(i10), Integer.valueOf(iA));
            }
            m710a("cancel succ:" + i10);
        } catch (Exception e10) {
            m710a("cancel error" + e10);
        }
    }

    public void a(int i10, Notification notification) {
        String str = this.f1025a;
        NotificationManager notificationManagerA = a();
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (m711a()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i11 >= 29) {
                    notificationManagerA.notifyAsPackage(str, null, i10, notification);
                } else {
                    notificationManagerA.notify(i10, notification);
                }
            } else {
                notificationManagerA.notify(i10, notification);
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    void a(NotificationChannel notificationChannel) {
        String str = this.f1025a;
        try {
            if (m711a()) {
                int iA = a(str);
                if (iA != -1) {
                    com.xiaomi.push.bk.b(f1022a, "createNotificationChannelsForPackage", str, Integer.valueOf(iA), a(Arrays.asList(notificationChannel)));
                }
            } else {
                a().createNotificationChannel(notificationChannel);
            }
        } catch (Exception e10) {
            m710a("createNotificationChannel error" + e10);
        }
    }

    void a(NotificationChannel notificationChannel, boolean z10) {
        String str = this.f1025a;
        try {
            if (z10) {
                int iA = a(str);
                if (iA != -1) {
                    com.xiaomi.push.bk.b(f1022a, "updateNotificationChannelForPackage", str, Integer.valueOf(iA), notificationChannel);
                }
            } else {
                a(notificationChannel);
            }
        } catch (Exception e10) {
            m710a("updateNotificationChannel error " + e10);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m719a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(b(""));
    }

    String b() {
        if (TextUtils.isEmpty(this.f107890b)) {
            this.f107890b = b("default");
        }
        return this.f107890b;
    }

    String b(String str, String str2) {
        return m711a() ? str : str2;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public List<StatusBarNotification> m720b() {
        String str = this.f1025a;
        NotificationManager notificationManagerA = a();
        List<StatusBarNotification> list = null;
        try {
            if (m711a()) {
                int iA = com.xiaomi.push.i.a();
                if (iA != -1) {
                    list = (List) a(com.xiaomi.push.bk.a(f1022a, "getAppActiveNotifications", str, Integer.valueOf(iA)));
                }
            } else {
                StatusBarNotification[] activeNotifications = notificationManagerA.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(ax.c(statusBarNotification.getNotification()))) {
                                arrayList.add(statusBarNotification);
                            }
                        }
                        list = arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        list = arrayList;
                        m710a("getActiveNotifications error " + th);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        return list;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f1025a + z5.g.f141884d;
    }
}
