package com.umeng.message.proguard;

import android.os.SystemClock;
import com.alibaba.sdk.android.httpdns.HttpDns;
import com.alibaba.sdk.android.httpdns.HttpDnsService;
import com.umeng.message.common.UPLog;

/* JADX INFO: loaded from: classes4.dex */
public final class au {
    public static String a(String str, String str2) {
        String ipByHostAsync;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            HttpDnsService service = HttpDns.getService(x.a(), str);
            service.setExpiredIPEnabled(true);
            int i10 = 0;
            ipByHostAsync = null;
            while (true) {
                try {
                    ipByHostAsync = service.getIpByHostAsync(str2);
                    if (ipByHostAsync != null) {
                        break;
                    }
                    Thread.sleep(500L);
                    int i11 = i10 + 1;
                    if (i11 >= 5) {
                        break;
                    }
                    i10 = i11;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        UPLog.i("HttpDns", "host parse error:", th.getMessage());
                        UPLog.i("HttpDns", "host:", str2, "ip:", ipByHostAsync, "consume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    } catch (Throwable th3) {
                        UPLog.i("HttpDns", "host:", str2, "ip:", ipByHostAsync, "consume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        throw th3;
                    }
                }
            }
            UPLog.i("HttpDns", "host:", str2, "ip:", ipByHostAsync, "consume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        } catch (Throwable th4) {
            th = th4;
            ipByHostAsync = null;
        }
        return ipByHostAsync;
    }
}
