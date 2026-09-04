package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.net.TrafficStats;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes6.dex */
public class q implements Callable<String[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f38007a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private s f50a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38008d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private long f51d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f38009e;
    private Map<String, String> extra;
    private String hostName;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f38011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f38012l;
    private static d hostManager = d.a();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Object f49a = new Object();

    q(String str, s sVar) {
        this.f38008d = 1;
        this.f38011k = null;
        this.f38009e = f.f33c;
        this.f38010j = false;
        this.f38012l = null;
        this.extra = new HashMap();
        this.f51d = 0L;
        this.hostName = str;
        this.f50a = sVar;
    }

    q(String str, s sVar, Map<String, String> map, String str2) {
        this.f38008d = 1;
        this.f38011k = null;
        this.f38009e = f.f33c;
        this.f38010j = false;
        this.f38012l = null;
        HashMap map2 = new HashMap();
        this.extra = map2;
        this.f51d = 0L;
        this.hostName = str;
        this.f50a = sVar;
        this.f38012l = str2;
        map2.putAll(map);
    }

    private boolean d(String str) {
        return str.matches("[a-zA-Z0-9\\-_]+");
    }

    private boolean e(String str) {
        return str.matches("[a-zA-Z0-9\\-_=]+");
    }

    private String getExtra() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        Map<String, String> map = this.extra;
        boolean z11 = true;
        if (map != null) {
            z10 = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append("&sdns-");
                sb2.append(entry.getKey());
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                if (!d(entry.getKey())) {
                    i.f("设置自定义参数失败，自定义key不合法：" + entry.getKey());
                    z11 = false;
                }
                if (!e(entry.getValue())) {
                    i.f("设置自定义参数失败，自定义value不合法：" + entry.getValue());
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (z11 && z10) {
            String string = sb2.toString();
            if (string.getBytes("UTF-8").length <= 1000) {
                return string;
            }
            i.f("设置自定义参数失败，自定义参数过长");
        }
        return "";
    }

    static void setContext(Context context) {
        f38007a = context;
    }

    public void a(int i10) {
        if (i10 >= 0) {
            this.f38008d = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03fa A[Catch: IOException -> 0x03f6, TRY_LEAVE, TryCatch #3 {IOException -> 0x03f6, blocks: (B:97:0x03f2, B:101:0x03fa), top: B:108:0x03f2 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x03bd A[Catch: all -> 0x03ea, TryCatch #5 {all -> 0x03ea, blocks: (B:77:0x03af, B:79:0x03bd, B:80:0x03c4), top: B:111:0x03af }] */
    /* JADX WARN: Code duplicated, block: B:80:0x03c4 A[Catch: all -> 0x03ea, TRY_LEAVE, TryCatch #5 {all -> 0x03ea, blocks: (B:77:0x03af, B:79:0x03bd, B:80:0x03c4), top: B:111:0x03af }] */
    /* JADX WARN: Code duplicated, block: B:82:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x03d1 A[Catch: IOException -> 0x03d5, TRY_ENTER, TryCatch #2 {IOException -> 0x03d5, blocks: (B:63:0x038a, B:65:0x038f, B:84:0x03d1, B:88:0x03d9), top: B:107:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x03d9 A[Catch: IOException -> 0x03d5, TRY_LEAVE, TryCatch #2 {IOException -> 0x03d5, blocks: (B:63:0x038a, B:65:0x038f, B:84:0x03d1, B:88:0x03d9), top: B:107:0x0049 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String[] call() {
        ?? r10;
        ?? r11;
        int i10;
        StringBuilder sb2;
        String string;
        InputStream inputStream;
        BufferedReader bufferedReader;
        StringBuilder sb3;
        this.f51d = System.currentTimeMillis();
        if (!this.f38010j) {
            synchronized (f49a) {
                if (hostManager.m20a(this.hostName)) {
                    i.d("host:" + this.hostName + " is already resolving");
                    return this.f38009e;
                }
                hostManager.m18a(this.hostName);
                this.f38010j = true;
            }
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                TrafficStats.setThreadStatsTag(40965);
                String strA = u.a(this.f50a);
                this.f38011k = strA;
                if (strA == null) {
                    i.d("serverIp is null, give up query for hostname:" + this.hostName);
                    inputStream = null;
                    bufferedReader = null;
                } else {
                    com.alibaba.sdk.android.httpdns.c.a.a().c(f38007a);
                    if (a.a()) {
                        String timestamp = a.getTimestamp();
                        if (com.alibaba.sdk.android.httpdns.c.a.a().h()) {
                            sb3 = new StringBuilder();
                            sb3.append(f.PROTOCOL);
                            sb3.append(this.f38011k);
                            sb3.append(":");
                            sb3.append(f.f37960d);
                            sb3.append("/");
                            sb3.append(f.f37959c);
                            sb3.append("/sign_d?host=");
                            sb3.append(this.hostName);
                            sb3.append("&sdk=android_");
                            sb3.append("1.3.2.3-no-bssid-ssid");
                            sb3.append("&t=");
                            sb3.append(timestamp);
                            sb3.append("&s=");
                            sb3.append(a.a(this.hostName, timestamp));
                            sb3.append("&sid=");
                            sb3.append(com.alibaba.sdk.android.httpdns.e.a.a().getSessionId());
                            sb3.append("&net=");
                            sb3.append(com.alibaba.sdk.android.httpdns.e.a.a().l());
                            sb3.append(getExtra());
                        } else {
                            sb3 = new StringBuilder();
                            sb3.append(f.PROTOCOL);
                            sb3.append(this.f38011k);
                            sb3.append(":");
                            sb3.append(f.f37960d);
                            sb3.append("/");
                            sb3.append(f.f37959c);
                            sb3.append("/sign_d?host=");
                            sb3.append(this.hostName);
                            sb3.append("&sdk=android_");
                            sb3.append("1.3.2.3-no-bssid-ssid");
                            sb3.append("&t=");
                            sb3.append(timestamp);
                            sb3.append("&s=");
                            sb3.append(a.a(this.hostName, timestamp));
                            sb3.append("&sid=");
                            sb3.append(com.alibaba.sdk.android.httpdns.e.a.a().getSessionId());
                            sb3.append("&net=");
                            sb3.append(com.alibaba.sdk.android.httpdns.e.a.a().l());
                            sb3.append(getExtra());
                        }
                        string = sb3.toString();
                    } else {
                        if (com.alibaba.sdk.android.httpdns.c.a.a().h()) {
                            sb2 = new StringBuilder();
                            sb2.append(f.PROTOCOL);
                            sb2.append(this.f38011k);
                            sb2.append(":");
                            sb2.append(f.f37960d);
                            sb2.append("/");
                            sb2.append(f.f37959c);
                            sb2.append("/d?host=");
                            sb2.append(this.hostName);
                            sb2.append("&sdk=android_");
                            sb2.append("1.3.2.3-no-bssid-ssid");
                            sb2.append("&sid=");
                            sb2.append(com.alibaba.sdk.android.httpdns.e.a.a().getSessionId());
                            sb2.append("&net=");
                            sb2.append(com.alibaba.sdk.android.httpdns.e.a.a().l());
                            sb2.append(getExtra());
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(f.PROTOCOL);
                            sb2.append(this.f38011k);
                            sb2.append(":");
                            sb2.append(f.f37960d);
                            sb2.append("/");
                            sb2.append(f.f37959c);
                            sb2.append("/d?host=");
                            sb2.append(this.hostName);
                            sb2.append("&sdk=android_");
                            sb2.append("1.3.2.3-no-bssid-ssid");
                            sb2.append("&sid=");
                            sb2.append(com.alibaba.sdk.android.httpdns.e.a.a().getSessionId());
                            sb2.append("&net=");
                            sb2.append(com.alibaba.sdk.android.httpdns.e.a.a().l());
                            sb2.append(getExtra());
                        }
                        string = sb2.toString();
                    }
                    if (com.alibaba.sdk.android.httpdns.net64.a.a().m29a()) {
                        string = string + "&query=4,6";
                    }
                    i.f("resolve url: " + string);
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(string).openConnection();
                    try {
                        httpURLConnection2.setConnectTimeout(f.f37957a);
                        httpURLConnection2.setReadTimeout(f.f37957a);
                        if (httpURLConnection2 instanceof HttpsURLConnection) {
                            ((HttpsURLConnection) httpURLConnection2).setHostnameVerifier(new HostnameVerifier() { // from class: com.alibaba.sdk.android.httpdns.q.1
                                @Override // javax.net.ssl.HostnameVerifier
                                public boolean verify(String str, SSLSession sSLSession) {
                                    i.d("Https request, set hostnameVerifier");
                                    return HttpsURLConnection.getDefaultHostnameVerifier().verify("203.107.1.1", sSLSession);
                                }
                            });
                        }
                        int responseCode = httpURLConnection2.getResponseCode();
                        r11 = 200;
                        try {
                            try {
                                if (responseCode != 200) {
                                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream(), "UTF-8"));
                                    StringBuilder sb4 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            i.f("response code is " + httpURLConnection2.getResponseCode() + " expect 200. response body is " + sb4.toString());
                                            throw new h(httpURLConnection2.getResponseCode(), new g(httpURLConnection2.getResponseCode(), sb4.toString()).b());
                                        }
                                        sb4.append(line);
                                    }
                                } else {
                                    inputStream = httpURLConnection2.getInputStream();
                                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                                    StringBuilder sb5 = new StringBuilder();
                                    while (true) {
                                        String line2 = bufferedReader.readLine();
                                        if (line2 == null) {
                                            break;
                                        }
                                        sb5.append(line2);
                                    }
                                    i.d("resolve host: " + this.hostName + ", return: " + sb5.toString());
                                    e eVar = new e(sb5.toString());
                                    eVar.setCacheKey(this.f38012l);
                                    if (hostManager.count() >= 100) {
                                        throw new Exception("the total number of hosts is exceed 100");
                                    }
                                    hostManager.m19a(this.hostName, eVar);
                                    u.a(this.hostName, this.f38011k, System.currentTimeMillis() - this.f51d);
                                    hostManager.b(this.hostName);
                                    this.f38009e = eVar.getIps();
                                    this.extra = eVar.m24a();
                                    httpURLConnection = httpURLConnection2;
                                }
                            } catch (Throwable th2) {
                                httpURLConnection = httpURLConnection2;
                                th = th2;
                                r11 = 0;
                                r10 = responseCode;
                                try {
                                    i.a(th);
                                    u.a(this.hostName, this.f38011k, th);
                                    i10 = this.f38008d;
                                    if (i10 > 0) {
                                        this.f38008d = i10 - 1;
                                        call();
                                    } else {
                                        u.reportHttpDnsSuccess(this.hostName, 0);
                                    }
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (r10 != 0) {
                                        r10.close();
                                    }
                                    if (r11 != 0) {
                                        r11.close();
                                    }
                                } catch (Throwable th3) {
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    if (r10 != 0) {
                                        try {
                                            r10.close();
                                            if (r11 != 0) {
                                                r11.close();
                                            }
                                        } catch (IOException e10) {
                                            i.a(e10);
                                            throw th3;
                                        }
                                    } else if (r11 != 0) {
                                        r11.close();
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            httpURLConnection = httpURLConnection2;
                            th = th4;
                            r10 = responseCode;
                            i.a(th);
                            u.a(this.hostName, this.f38011k, th);
                            i10 = this.f38008d;
                            if (i10 > 0) {
                                this.f38008d = i10 - 1;
                                call();
                            } else {
                                u.reportHttpDnsSuccess(this.hostName, 0);
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (r11 != 0) {
                                r11.close();
                            }
                        }
                    } catch (Throwable th5) {
                        r11 = 0;
                        httpURLConnection = httpURLConnection2;
                        th = th5;
                        r10 = 0;
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e11) {
                i.a(e11);
            }
        } catch (Throwable th6) {
            th = th6;
            r10 = 0;
            r11 = 0;
        }
        hostManager.b(this.hostName);
        return this.f38009e;
    }
}
