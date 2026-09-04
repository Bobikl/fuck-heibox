package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import android.util.Base64InputStream;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.ENV;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.j;
import com.tencent.connect.common.Constants;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static AtomicInteger f29925a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static HostnameVerifier f29926b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static Random f29927c = new Random();

    b() {
    }

    public static int a(String str, Map map, int i10) {
        URL url;
        HttpURLConnection httpURLConnection;
        String str2 = "AMDC" + String.valueOf(f29925a.incrementAndGet());
        int i11 = 2;
        String str3 = "awcn.DispatchCore";
        ALog.i("awcn.DispatchCore", "send amdc request", str2, "url", str, "\nhost", map.get("domain").toString());
        ENV env = (ENV) map.remove("Env");
        try {
            url = new URL(str);
            try {
                httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    httpURLConnection.setConnectTimeout(20000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.addRequestProperty("Connection", "close");
                    httpURLConnection.addRequestProperty("Accept-Encoding", "gzip");
                    httpURLConnection.addRequestProperty("Host", DispatchConstants.getAmdcServerDomain());
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (url.getProtocol().equals("https")) {
                        ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(f29926b);
                        if (AwcnConfig.isHttpsSniEnable()) {
                            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new j(DispatchConstants.getAmdcServerDomain()));
                        }
                    }
                    if (ALog.isPrintLog(1)) {
                        ALog.d("awcn.DispatchCore", "amdc request.", str2, "headers", httpURLConnection.getRequestProperties().toString());
                    }
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    byte[] bytes = anet.channel.strategy.utils.c.a(map, "utf-8").getBytes();
                    outputStream.write(bytes);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (ALog.isPrintLog(1)) {
                        ALog.d("awcn.DispatchCore", "amdc response. code: " + responseCode, str2, "\nheaders", httpURLConnection.getHeaderFields());
                    }
                    if (responseCode != 200) {
                        if (responseCode != 302 && responseCode != 307) {
                            i11 = 1;
                        }
                        a(String.valueOf(responseCode), "response code not 200", url, i10, i11);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e10) {
                            ALog.e("awcn.DispatchCore", "http disconnect failed", null, e10, new Object[0]);
                        }
                        return i11;
                    }
                    String headerField = httpURLConnection.getHeaderField("x-am-code");
                    if (!Constants.DEFAULT_UIN.equals(headerField)) {
                        if (!"1007".equals(headerField) && !"1008".equals(headerField)) {
                            i11 = 1;
                        }
                        a(headerField, "return code: " + headerField, url, i10, i11);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e11) {
                            ALog.e("awcn.DispatchCore", "http disconnect failed", null, e11, new Object[0]);
                        }
                        return i11;
                    }
                    String headerField2 = httpURLConnection.getHeaderField("x-am-sign");
                    if (TextUtils.isEmpty(headerField2)) {
                        a("-1001", "response sign is empty", url, i10, 1);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e12) {
                            ALog.e("awcn.DispatchCore", "http disconnect failed", null, e12, new Object[0]);
                        }
                        return 1;
                    }
                    String strA = a(httpURLConnection.getInputStream(), "gzip".equalsIgnoreCase(httpURLConnection.getContentEncoding()));
                    if (ALog.isPrintLog(1)) {
                        ALog.d("awcn.DispatchCore", "amdc response body", str2, "\nbody", strA);
                    }
                    try {
                        a(str, bytes.length, httpURLConnection.getContentLength());
                        if (TextUtils.isEmpty(strA)) {
                            a("-1002", "read answer error", url, i10, 1);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e13) {
                                ALog.e("awcn.DispatchCore", "http disconnect failed", null, e13, new Object[0]);
                            }
                            return 1;
                        }
                        str3 = "awcn.DispatchCore";
                        try {
                            IAmdcSign sign = AmdcRuntimeInfo.getSign();
                            String strSign = sign != null ? sign.sign(strA) : null;
                            if (!strSign.equalsIgnoreCase(r19)) {
                                ALog.e(str3, "check ret sign failed", str2, "retSign", headerField2, "checkSign", strSign);
                                a("-1003", "check sign failed", url, i10, 1);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e14) {
                                    ALog.e(str3, "http disconnect failed", null, e14, new Object[0]);
                                }
                                return 1;
                            }
                            try {
                                JSONObject jSONObject = (JSONObject) new JSONTokener(strA).nextValue();
                                if (GlobalAppRuntimeInfo.getEnv() != env) {
                                    ALog.w(str3, "env change, do not notify result", str2, new Object[0]);
                                    try {
                                        httpURLConnection.disconnect();
                                        return 0;
                                    } catch (Exception e15) {
                                        ALog.e(str3, "http disconnect failed", null, e15, new Object[0]);
                                        return 0;
                                    }
                                }
                                HttpDispatcher.getInstance().a(new DispatchEvent(1, jSONObject));
                                a(headerField, "request success", url, i10, 0);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e16) {
                                    ALog.e(str3, "http disconnect failed", null, e16, new Object[0]);
                                }
                                return 0;
                            } catch (JSONException unused) {
                                HttpDispatcher.getInstance().a(new DispatchEvent(0, null));
                                ALog.e(str3, "resolve amdc anser failed", str2, new Object[0]);
                                a("-1004", "resolve answer failed", url, i10, 1);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception e17) {
                                    ALog.e(str3, "http disconnect failed", null, e17, new Object[0]);
                                }
                                return 1;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = "awcn.DispatchCore";
                    }
                    try {
                        String message = th.getMessage();
                        if (TextUtils.isEmpty(message)) {
                            message = th.toString();
                        }
                        a("-1000", message, url, i10, 1);
                        ALog.e(str3, "amdc request fail", str2, th, new Object[0]);
                        if (httpURLConnection != null) {
                            try {
                            } catch (Exception e18) {
                                ALog.e(str3, "http disconnect failed", null, e18, new Object[0]);
                            }
                        }
                        return 1;
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception e19) {
                                ALog.e(str3, "http disconnect failed", null, e19, new Object[0]);
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str3 = "awcn.DispatchCore";
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = null;
            }
        } catch (Throwable th6) {
            th = th6;
            url = null;
        }
    }

    static String a(InputStream inputStream, boolean z10) throws Throwable {
        IOException e10;
        InputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        if (z10) {
            try {
                bufferedInputStream = new GZIPInputStream(bufferedInputStream);
            } catch (IOException e11) {
                e10 = e11;
                ALog.e("awcn.DispatchCore", "", null, e10, new Object[0]);
                try {
                    bufferedInputStream.close();
                } catch (IOException unused) {
                }
                return null;
            }
        }
        Base64InputStream base64InputStream = new Base64InputStream(bufferedInputStream, 0);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i10 = base64InputStream.read(bArr);
                if (i10 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
            String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            try {
                base64InputStream.close();
            } catch (IOException unused2) {
            }
            return str;
        } catch (IOException e12) {
            e10 = e12;
            bufferedInputStream = base64InputStream;
            ALog.e("awcn.DispatchCore", "", null, e10, new Object[0]);
            bufferedInputStream.close();
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = base64InputStream;
            try {
                bufferedInputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }

    private static String a(String str, String str2, int i10, Map<String, String> map, int i11) {
        StringBuilder sb2 = new StringBuilder(64);
        if (!AmdcRuntimeInfo.isForceHttps() && i11 == 2 && "https".equalsIgnoreCase(str) && f29927c.nextBoolean()) {
            str = "http";
        }
        sb2.append(str);
        sb2.append(HttpConstant.SCHEME_SPLIT);
        if (str2 != null) {
            if (anet.channel.util.c.a() && anet.channel.strategy.utils.c.a(str2)) {
                try {
                    str2 = anet.channel.util.c.a(str2);
                } catch (Exception unused) {
                }
            }
            if (anet.channel.strategy.utils.c.b(str2)) {
                sb2.append('[');
                sb2.append(str2);
                sb2.append(']');
            } else {
                sb2.append(str2);
            }
            if (i10 == 0) {
                i10 = "https".equalsIgnoreCase(str) ? 443 : 80;
            }
            sb2.append(":");
            sb2.append(i10);
        } else {
            sb2.append(DispatchConstants.getAmdcServerDomain());
        }
        sb2.append(DispatchConstants.serverPath);
        TreeMap treeMap = new TreeMap();
        treeMap.put("appkey", map.remove("appkey"));
        treeMap.put("v", map.remove("v"));
        treeMap.put("platform", map.remove("platform"));
        sb2.append('?');
        sb2.append(anet.channel.strategy.utils.c.a(treeMap, "utf-8"));
        return sb2.toString();
    }

    static List<IConnStrategy> a(String str) {
        List<IConnStrategy> connStrategyListByHost = Collections.EMPTY_LIST;
        if (!NetworkStatusHelper.isProxy()) {
            connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(DispatchConstants.getAmdcServerDomain());
            ListIterator<IConnStrategy> listIterator = connStrategyListByHost.listIterator();
            while (listIterator.hasNext()) {
                if (!listIterator.next().getProtocol().protocol.equalsIgnoreCase(str)) {
                    listIterator.remove();
                }
            }
        }
        return connStrategyListByHost;
    }

    static void a(String str, long j10, long j11) {
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = "amdc";
            flowStat.protocoltype = "http";
            flowStat.req_identifier = str;
            flowStat.upstream = j10;
            flowStat.downstream = j11;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e10) {
            ALog.e("awcn.DispatchCore", "commit flow info failed!", null, e10, new Object[0]);
        }
    }

    static void a(String str, String str2, URL url, int i10, int i11) {
        if ((i11 != 1 || i10 == 2) && GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                AmdcStatistic amdcStatistic = new AmdcStatistic();
                amdcStatistic.errorCode = str;
                amdcStatistic.errorMsg = str2;
                if (url != null) {
                    amdcStatistic.host = url.getHost();
                    amdcStatistic.url = url.toString();
                }
                amdcStatistic.retryTimes = i10;
                AppMonitor.getInstance().commitStat(amdcStatistic);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Map map) {
        IConnStrategy iConnStrategyRemove;
        String strA;
        if (map == null) {
            return;
        }
        String schemeByHost = AmdcRuntimeInfo.isForceHttps() ? "https" : StrategyCenter.getInstance().getSchemeByHost(DispatchConstants.getAmdcServerDomain(), "http");
        List<IConnStrategy> listA = a(schemeByHost);
        for (int i10 = 0; i10 < 3; i10++) {
            HashMap map2 = new HashMap(map);
            if (i10 != 2) {
                iConnStrategyRemove = !listA.isEmpty() ? listA.remove(0) : null;
                strA = iConnStrategyRemove != null ? a(schemeByHost, iConnStrategyRemove.getIp(), iConnStrategyRemove.getPort(), map2, i10) : a(schemeByHost, (String) null, 0, map2, i10);
            } else {
                String[] amdcServerFixIp = DispatchConstants.getAmdcServerFixIp();
                String strA2 = (amdcServerFixIp == null || amdcServerFixIp.length <= 0) ? a(schemeByHost, (String) null, 0, map2, i10) : a(schemeByHost, amdcServerFixIp[f29927c.nextInt(amdcServerFixIp.length)], 0, map2, i10);
                iConnStrategyRemove = null;
                strA = strA2;
            }
            int iA = a(strA, map2, i10);
            if (iConnStrategyRemove != null) {
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = iA == 0;
                StrategyCenter.getInstance().notifyConnEvent(DispatchConstants.getAmdcServerDomain(), iConnStrategyRemove, connEvent);
            }
            if (iA == 0 || iA == 2) {
                return;
            }
        }
    }
}
