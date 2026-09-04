package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.is;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(24)
public class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static at f107882a = new at();

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        List<b> f1017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<b> f107884b;

        private a() {
            this.f1017a = new ArrayList();
            this.f107884b = new ArrayList();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f107885a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        Notification f1018a;

        public b(int i10, Notification notification) {
            this.f107885a = i10;
            this.f1018a = notification;
        }

        public String toString() {
            return "id:" + this.f107885a;
        }
    }

    private at() {
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    public static at a() {
        return f107882a;
    }

    private String a(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    private List<StatusBarNotification> a(aw awVar) {
        List<StatusBarNotification> listM720b = awVar != null ? awVar.m720b() : null;
        if (listM720b == null || listM720b.size() == 0) {
            return null;
        }
        return listM720b;
    }

    private void a(Context context, int i10, Notification notification, boolean z10) {
        Notification notification2;
        String strC = ax.c(notification);
        if (TextUtils.isEmpty(strC)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("group auto not extract pkg from notification:" + i10);
            return;
        }
        List<StatusBarNotification> listA = a(aw.a(context, strC));
        if (listA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("group auto not get notifications");
            return;
        }
        String strB = b(notification);
        HashMap map = new HashMap();
        for (StatusBarNotification statusBarNotification : listA) {
            if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i10) {
                a(map, statusBarNotification);
            }
        }
        for (Map.Entry<String, a> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                a value = entry.getValue();
                if (z10 && key.equals(strB) && !m709b(notification)) {
                    b bVar = new b(i10, notification);
                    if (m708a(notification)) {
                        value.f107884b.add(bVar);
                    } else {
                        value.f1017a.add(bVar);
                    }
                }
                int size = value.f1017a.size();
                if (value.f107884b.size() <= 0) {
                    if (z10 && size >= 2) {
                        a(context, strC, key, value.f1017a.get(0).f1018a);
                    }
                } else if (size <= 0) {
                    a(context, strC, key);
                } else if (az.a(context).a(is.NotificationGroupUpdateTimeSwitch.a(), false) && (notification2 = value.f107884b.get(0).f1018a) != null) {
                    notification2.when = System.currentTimeMillis();
                    a(context, strC, key, notification2);
                }
            }
        }
    }

    private void a(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.b.b("group cancel summary:" + str2);
        aw.a(context, str).a(a(str, str2));
    }

    private void a(Context context, String str, String str2, Notification notification) {
        Notification.Builder defaults;
        try {
            if (TextUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("group show summary group is null");
                return;
            }
            int iA = ax.a(context, str);
            if (iA == 0) {
                com.xiaomi.channel.commonutils.logger.b.m62a("group show summary not get icon from " + str);
                return;
            }
            aw awVarA = aw.a(context, str);
            if (Build.VERSION.SDK_INT >= 26) {
                String strB = awVarA.b(notification.getChannelId(), "groupSummary");
                NotificationChannel notificationChannelM714a = awVarA.m714a(strB);
                if ("groupSummary".equals(strB) && notificationChannelM714a == null) {
                    awVarA.a(new NotificationChannel(strB, "group_summary", 3));
                }
                defaults = new Notification.Builder(context, strB);
            } else {
                defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            ax.a(defaults, true);
            Notification notificationBuild = defaults.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, iA)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!com.xiaomi.push.j.m525c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                ax.m721a(notificationBuild, str);
            }
            int iA2 = a(str, str2);
            awVarA.a(iA2, notificationBuild);
            com.xiaomi.channel.commonutils.logger.b.b("group show summary notify:" + iA2);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("group show summary error " + e10);
        }
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String strB = b(statusBarNotification.getNotification());
        a aVar = map.get(strB);
        if (aVar == null) {
            aVar = new a();
            map.put(strB, aVar);
        }
        b bVar = new b(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (m708a(statusBarNotification.getNotification())) {
            aVar.f107884b.add(bVar);
        } else {
            aVar.f1017a.add(bVar);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m707a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private boolean m708a(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object objA = com.xiaomi.push.bk.a((Object) notification, "isGroupSummary", (Object[]) null);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }

    private boolean a(Context context) {
        if (b(context) && aw.m712a(context)) {
            return az.a(context).a(is.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m709b(notification) ? a(notification) : notification.getGroup();
    }

    private void b(Context context, int i10, Notification notification) {
        String strC = ax.c(notification);
        if (TextUtils.isEmpty(strC)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("group restore not extract pkg from notification:" + i10);
            return;
        }
        aw awVarA = aw.a(context, strC);
        List<StatusBarNotification> listA = a(awVarA);
        if (listA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : listA) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && m709b(notification2) && statusBarNotification.getId() != i10) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                builderRecoverBuilder.setGroup(a(notification2));
                ax.a(builderRecoverBuilder, m708a(notification2));
                awVarA.a(statusBarNotification.getId(), builderRecoverBuilder.build());
                com.xiaomi.channel.commonutils.logger.b.b("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private boolean m709b(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), a(notification)));
    }

    private boolean b(Context context) {
        return az.a(context).a(is.NotificationAutoGroupSwitch.a(), true);
    }

    public String a(Context context, Notification.Builder builder, String str) {
        if (!m707a() || !a(context)) {
            return str;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", jCurrentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(jCurrentTimeMillis), str);
    }

    public void a(Context context, int i10, Notification notification) {
        if (m707a()) {
            if (a(context)) {
                try {
                    b(context, i10, notification);
                } catch (Exception e10) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("group notify handle restore error " + e10);
                }
            }
            if (b(context)) {
                try {
                    a(context, i10, notification, true);
                } catch (Exception e11) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("group notify handle auto error " + e11);
                }
            }
        }
    }
}
