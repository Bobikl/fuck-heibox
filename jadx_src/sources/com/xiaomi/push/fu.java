package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ServiceInfo;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes4.dex */
public final class fu {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static a f440a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String f441a = XMJobService.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f107146a = 0;

    public interface a {
        void a();

        void a(boolean z10);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        boolean mo390a();
    }

    public static synchronized void a() {
        if (f440a == null) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] stop alarm.");
        f440a.a();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if ("com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
            f440a = new fv(applicationContext);
            return;
        }
        int i10 = 0;
        try {
            ServiceInfo[] serviceInfoArr = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 4).services;
            if (serviceInfoArr != null) {
                int length = serviceInfoArr.length;
                int i11 = 0;
                while (true) {
                    if (i10 < length) {
                        try {
                            ServiceInfo serviceInfo = serviceInfoArr[i10];
                            if ("android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                String str = f441a;
                                if (str.equals(serviceInfo.name)) {
                                    i11 = 1;
                                } else {
                                    try {
                                        if (str.equals(C1339r.a(applicationContext, serviceInfo.name).getSuperclass().getCanonicalName())) {
                                            i11 = 1;
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            if (f441a.equals(serviceInfo.name) && "android.permission.BIND_JOB_SERVICE".equals(serviceInfo.permission)) {
                                i10 = 1;
                                break;
                            }
                            i10++;
                        } catch (Exception e10) {
                            e = e10;
                            i10 = i11;
                            com.xiaomi.channel.commonutils.logger.b.m62a("check service err : " + e.getMessage());
                        }
                    }
                    i10 = i11;
                    break;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (i10 != 0 || !C1339r.m658a(applicationContext)) {
            f440a = new fv(applicationContext);
            return;
        }
        throw new RuntimeException("Should export service: " + f441a + " with permission android.permission.BIND_JOB_SERVICE in AndroidManifest.xml file");
    }

    public static synchronized void a(Context context, int i10) {
        int i11 = f107146a;
        if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
            if (i10 == 2) {
                f107146a = 2;
            } else {
                f107146a = 0;
            }
        }
        int i12 = f107146a;
        if (i11 != i12 && i12 == 2) {
            a();
            f440a = new fx(context);
        }
    }

    public static synchronized void a(boolean z10) {
        if (f440a == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("timer is not initialized");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("[Alarm] register alarm. (" + z10 + ")");
        f440a.a(z10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static synchronized boolean m389a() {
        a aVar = f440a;
        if (aVar == null) {
            return false;
        }
        return aVar.mo390a();
    }
}
