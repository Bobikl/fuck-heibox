package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.push.C1339r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final int[] f1088a = {1, 2, 4, 8, 16, 32, 64};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray<ax.a<String, String, String>> f108009a = new g(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<Integer> f108010b = new h(5);

    static int a(String str, String str2) {
        int i10 = m749a(str, str2, 8) ? 8 : 0;
        if (m749a(str, str2, 16)) {
            i10 |= 16;
        }
        if (m749a(str, str2, 1)) {
            i10 |= 1;
        }
        if (m749a(str, str2, 2)) {
            i10 |= 2;
        }
        return m749a(str, str2, 4) ? i10 | 4 : i10;
    }

    public static int a(String str, String str2, int i10) {
        return ax.a(C1339r.m655a(), str, str2, f108009a.get(i10));
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Bundle m748a(String str, String str2) {
        return ax.a(C1339r.m655a(), str, str2);
    }

    static void a(Context context, String str) {
        List<NotificationChannel> listM718a;
        if (!com.xiaomi.push.j.m521a(context) || TextUtils.isEmpty(str) || (listM718a = aw.a(context, str).m718a()) == null) {
            return;
        }
        synchronized (f.class) {
            SharedPreferences sharedPreferencesA = a(context);
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = listM718a.iterator();
            while (it.hasNext()) {
                String str2 = (String) com.xiaomi.push.bk.a(it.next(), "mId");
                if (!TextUtils.isEmpty(str2) && sharedPreferencesA.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                a(sharedPreferencesA, arrayList);
            }
        }
    }

    static void a(Context context, String str, String str2, int i10, String str3, boolean z10, int i11) {
        if (!com.xiaomi.push.j.m521a(context) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            if (com.xiaomi.push.j.m521a(context)) {
                com.xiaomi.channel.commonutils.logger.b.m62a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
                return;
            }
            return;
        }
        int iA = com.xiaomi.push.s.a(str3, 0);
        boolean zA = a(i10, iA);
        if (z10) {
            a(str, str2, iA, i11);
            if (zA) {
                synchronized (f.class) {
                    a(a(context), iA, str2);
                }
                return;
            }
            return;
        }
        synchronized (f.class) {
            SharedPreferences sharedPreferencesA = a(context);
            if (zA || sharedPreferencesA.contains(str2)) {
                a(sharedPreferencesA, iA, str, str2, i11);
                if (zA) {
                    a(sharedPreferencesA, iA, str2);
                } else {
                    a(sharedPreferencesA, str2);
                }
            }
        }
    }

    private static void a(SharedPreferences sharedPreferences, int i10, String str) {
        sharedPreferences.edit().putInt(str, i10).commit();
    }

    private static void a(SharedPreferences sharedPreferences, int i10, String str, String str2, int i11) {
        if (sharedPreferences.getInt(str2, 0) != i10) {
            a(str, str2, i10, i11);
        }
    }

    private static void a(SharedPreferences sharedPreferences, String str) {
        a(sharedPreferences, new i(str));
    }

    private static void a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.commit();
    }

    static void a(String str, String str2, int i10, int i11) {
        for (int i12 : f1088a) {
            if ((f108010b.get(i12).intValue() & i11) == 0) {
                a(str, str2, i12, (i10 & i12) > 0);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m62a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i12 + "> :stoped by userLock");
            }
        }
    }

    private static void a(String str, String str2, int i10, boolean z10) {
        com.xiaomi.channel.commonutils.logger.b.m62a("ChannelPermissions.grantPermission:" + str + ":" + str2 + ": <" + i10 + ContainerUtils.KEY_VALUE_DELIMITER + z10 + "> :" + ax.a(C1339r.m655a(), str, str2, f108009a.get(i10), z10));
    }

    private static boolean a(int i10, int i11) {
        return i10 >= 4 || (i11 & 2) > 0 || (i11 & 1) > 0 || (i11 & 8) > 0 || (i11 & 16) > 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m749a(String str, String str2, int i10) {
        boolean z10 = ax.a(C1339r.m655a(), str, str2, f108009a.get(i10)) == 1;
        com.xiaomi.channel.commonutils.logger.b.m62a("ChannelPermissions.checkPermission:" + str + ":" + str2 + ": <" + i10 + ContainerUtils.KEY_VALUE_DELIMITER + z10 + ">");
        return z10;
    }
}
