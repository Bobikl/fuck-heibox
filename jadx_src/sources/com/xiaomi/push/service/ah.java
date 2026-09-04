package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.jj;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f107870a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b f1001a;

    public interface a {
        Map<String, String> a(Context context, jj jjVar);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        void m691a(Context context, jj jjVar);

        boolean a(Context context, jj jjVar, boolean z10);
    }

    public interface b {
        void a(jj jjVar);

        void a(String str);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        boolean m692a(jj jjVar);
    }

    public static Map<String, String> a(Context context, jj jjVar) {
        a aVar = f107870a;
        if (aVar != null && jjVar != null) {
            return aVar.a(context, jjVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("pepa listener or container is null");
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m689a(Context context, jj jjVar) {
        a aVar = f107870a;
        if (aVar == null || jjVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("handle msg wrong");
        } else {
            aVar.m691a(context, jjVar);
        }
    }

    public static void a(jj jjVar) {
        b bVar = f1001a;
        if (bVar == null || jjVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("pepa clearMessage is null");
        } else {
            bVar.a(jjVar);
        }
    }

    public static void a(String str) {
        b bVar = f1001a;
        if (bVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("pepa clearMessage is null");
        } else {
            bVar.a(str);
        }
    }

    public static boolean a(Context context, jj jjVar, boolean z10) {
        a aVar = f107870a;
        if (aVar != null && jjVar != null) {
            return aVar.a(context, jjVar, z10);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("pepa judement listener or container is null");
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m690a(jj jjVar) {
        b bVar = f1001a;
        if (bVar != null && jjVar != null) {
            return bVar.m692a(jjVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("pepa handleReceiveMessage is null");
        return false;
    }
}
