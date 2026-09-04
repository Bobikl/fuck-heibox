package com.xiaomi.push.service;

import com.xiaomi.push.C1339r;
import com.xiaomi.push.jm;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f108012a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static b f1089a;

    public interface a {
        boolean a(jm jmVar);
    }

    public interface b {
    }

    public static void a(b bVar) {
        f1089a = bVar;
    }

    public static boolean a(jm jmVar) {
        if (f108012a == null || jmVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("rc params is null, not cpra");
            return false;
        }
        if (com.xiaomi.push.j.m521a(C1339r.m655a())) {
            return f108012a.a(jmVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("rc app not permission to cpra");
        return false;
    }
}
