package com.tencent.open.a;

import android.os.Build;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f101022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f101023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f101024c;

    protected f() {
        b();
    }

    public static f a() {
        if (f101022a == null) {
            synchronized (f.class) {
                if (f101022a == null) {
                    f101022a = new f();
                }
            }
        }
        f101022a.c();
        return f101022a;
    }

    private void b() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + lg.a.f131412e + com.tencent.open.utils.f.a().b(com.tencent.open.utils.g.a()) + lg.a.f131412e + Build.VERSION.RELEASE;
        try {
            this.f101024c = new e(str);
        } catch (NoClassDefFoundError e10) {
            SLog.e("openSDK_LOG.OpenHttpService", "initClient okHttp catch error", e10);
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th2);
        }
        if (this.f101024c == null) {
            this.f101024c = new b(str);
        }
    }

    private void c() {
        i iVar = this.f101023b;
        if (iVar == null) {
            return;
        }
        int iA = iVar.a("Common_HttpConnectionTimeout");
        if (iA == 0) {
            iA = 15000;
        }
        int iA2 = this.f101023b.a("Common_SocketConnectionTimeout");
        if (iA2 == 0) {
            iA2 = 30000;
        }
        a(iA, iA2);
    }

    public g a(String str, String str2) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "get.");
        return this.f101024c.a(str, str2);
    }

    public g a(String str, Map<String, String> map) throws IOException {
        if (map == null || map.isEmpty()) {
            return a(str, "");
        }
        StringBuilder sb2 = new StringBuilder("");
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (str3 != null) {
                sb2.append(URLEncoder.encode(str2, "UTF-8"));
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(str3, "UTF-8"));
                sb2.append("&");
            }
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return a(str, sb2.toString());
    }

    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        return (map2 == null || map2.size() == 0) ? b(str, map) : this.f101024c.a(str, map, map2);
    }

    public void a(long j10, long j11) {
        a aVar = this.f101024c;
        if (aVar != null) {
            aVar.a(j10, j11);
        }
    }

    public void a(i iVar) {
        this.f101023b = iVar;
        c();
    }

    public g b(String str, Map<String, String> map) throws IOException {
        SLog.i("openSDK_LOG.OpenHttpService", "post data");
        return this.f101024c.a(str, map);
    }
}
