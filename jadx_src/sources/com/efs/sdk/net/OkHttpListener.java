package com.efs.sdk.net;

import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.efs.sdk.net.a.a;
import com.efs.sdk.net.a.b;
import com.efs.sdk.net.a.c;
import dl.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.i;
import okhttp3.p;

/* JADX INFO: loaded from: classes6.dex */
public class OkHttpListener extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicInteger f42691a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f42694d = new ArrayList();

    private void a() {
        try {
            c cVarC = a.a().c(this.f42692b);
            if (cVarC != null) {
                Map<String, Long> map = cVarC.E;
                Map<String, Long> map2 = cVarC.F;
                map2.put(c.f42742s, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42724a, c.f42725b)));
                map2.put(c.f42743t, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42727d, c.f42728e)));
                map2.put(c.f42744u, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42730g, c.f42731h)));
                map2.put(c.f42745v, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42729f, c.f42732i)));
                map2.put(c.f42746w, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42734k, c.f42735l)));
                map2.put(c.f42747x, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42736m, c.f42737n)));
                map2.put(c.f42748y, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42738o, c.f42739p)));
                map2.put(c.f42749z, Long.valueOf(com.efs.sdk.net.b.a.a(map, c.f42740q, c.f42741r)));
                b();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void a(String str) {
        Map<String, Long> map;
        try {
            c cVarC = a.a().c(this.f42692b);
            if (cVarC == null || (map = cVarC.E) == null) {
                return;
            }
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void b() {
        try {
            c cVarC = a.a().c(this.f42692b);
            b bVarA = a.a().a(this.f42692b);
            if (cVarC == null || bVarA == null) {
                return;
            }
            Map<String, Long> map = cVarC.E;
            Map<String, Long> map2 = cVarC.F;
            Log.i("NetTrace-Listener", bVarA.toString());
            if (TextUtils.isEmpty(cVarC.B)) {
                Log.d("NetTrace-Listener", "url is null.");
                return;
            }
            EfsJSONLog efsJSONLog = new EfsJSONLog("netperf");
            if (map.containsKey(c.f42727d)) {
                efsJSONLog.put("wd_dns", map.get(c.f42727d));
            }
            if (map.containsKey(c.f42728e)) {
                efsJSONLog.put("wd_dnstm", map.get(c.f42728e));
            }
            if (map2.containsKey(c.f42743t)) {
                efsJSONLog.put("wl_dns", map2.get(c.f42743t));
            }
            if (map.containsKey(c.f42729f)) {
                efsJSONLog.put("wd_tcp", map.get(c.f42729f));
            }
            if (map.containsKey(c.f42732i)) {
                efsJSONLog.put("wd_tcptm", map.get(c.f42732i));
            }
            if (map2.containsKey(c.f42745v)) {
                efsJSONLog.put("wl_tcp", map2.get(c.f42745v));
            }
            if (map.containsKey(c.f42730g)) {
                efsJSONLog.put("wd_ssl", map.get(c.f42730g));
            }
            if (map.containsKey(c.f42731h)) {
                efsJSONLog.put("wd_ssltm", map.get(c.f42731h));
            }
            if (map2.containsKey(c.f42744u)) {
                efsJSONLog.put("wl_ssl", map2.get(c.f42744u));
            }
            if (map.containsKey(c.f42734k)) {
                efsJSONLog.put("wd_ds", map.get(c.f42734k));
            }
            if (map.containsKey(c.f42737n)) {
                efsJSONLog.put("wd_dstm", map.get(c.f42737n));
            }
            if (map2.containsKey(c.f42746w) && map2.containsKey(c.f42747x)) {
                efsJSONLog.put("wl_ds", Long.valueOf(map2.get(c.f42746w).longValue() + map2.get(c.f42747x).longValue()));
            }
            if (map.containsKey(c.f42738o)) {
                efsJSONLog.put("wd_srt", map.get(c.f42738o));
            }
            if (map.containsKey(c.f42741r)) {
                efsJSONLog.put("wd_srttm", map.get(c.f42741r));
            }
            if (map2.containsKey(c.f42748y) && map2.containsKey(c.f42749z)) {
                efsJSONLog.put("wl_srt", Long.valueOf(map2.get(c.f42748y).longValue() + map2.get(c.f42749z).longValue()));
            }
            String[] strArrSplit = cVarC.B.split("\\?");
            String str = strArrSplit != null ? strArrSplit[0] : null;
            List list = this.f42694d;
            if (list == null || str == null || list.contains(str)) {
                efsJSONLog.put("wd_ttfb", 0);
                efsJSONLog.put("wd_ttfbtm", 0);
                efsJSONLog.put("wl_ttfb", 0);
            } else {
                this.f42694d.add(str);
                if (map.containsKey(c.f42737n)) {
                    efsJSONLog.put("wd_ttfb", map.get(c.f42737n));
                } else if (map.containsKey(c.f42735l)) {
                    efsJSONLog.put("wd_ttfb", map.get(c.f42735l));
                }
                if (map.containsKey(c.f42738o)) {
                    efsJSONLog.put("wd_ttfbtm", map.get(c.f42738o));
                }
                if (map.containsKey(c.f42738o)) {
                    if (map.containsKey(c.f42737n)) {
                        efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(c.f42738o).longValue() - map.get(c.f42737n).longValue()));
                    } else if (map.containsKey(c.f42735l)) {
                        efsJSONLog.put("wl_ttfb", Long.valueOf(map.get(c.f42738o).longValue() - map.get(c.f42735l).longValue()));
                    }
                }
            }
            if (map.containsKey(c.f42724a)) {
                efsJSONLog.put("wd_rt", map.get(c.f42724a));
            }
            if (map.containsKey(c.f42725b)) {
                efsJSONLog.put("wd_rttm", map.get(c.f42725b));
            }
            if (map2.containsKey(c.f42742s)) {
                efsJSONLog.put("wl_rt", map2.get(c.f42742s));
            }
            efsJSONLog.put("wk_res", cVarC.B);
            efsJSONLog.put("wk_ip", cVarC.C);
            efsJSONLog.put("wk_method", bVarA.f42719e);
            efsJSONLog.put("wk_rc", Integer.valueOf(bVarA.f42721g));
            efsJSONLog.put("wl_up", Long.valueOf(bVarA.f42720f));
            efsJSONLog.put("wl_down", Long.valueOf(bVarA.f42723i));
            efsJSONLog.put("wl_total", Long.valueOf(bVarA.f42720f + bVarA.f42723i));
            EfsReporter reporter = NetManager.getReporter();
            if (reporter != null) {
                reporter.send(efsJSONLog);
                a.a().d(this.f42692b);
                a.a().b(this.f42692b);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static p.c get() {
        return new p.c() { // from class: com.efs.sdk.net.OkHttpListener.1
            @Override // okhttp3.p.c
            @d
            public final p create(@d e eVar) {
                return new OkHttpListener();
            }
        };
    }

    @Override // okhttp3.p
    public void callEnd(@d e eVar) {
        super.callEnd(eVar);
        try {
            Log.d("NetTrace-Listener", "callEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callEnd net enable false.");
                return;
            }
            a(c.f42725b);
            a();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void callFailed(@d e eVar, @d IOException iOException) {
        super.callFailed(eVar, iOException);
        try {
            Log.d("NetTrace-Listener", "callFailed");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callFailed net enable false.");
                return;
            }
            a(c.f42726c);
            a();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void callStart(@d e eVar) {
        super.callStart(eVar);
        try {
            Log.d("NetTrace-Listener", "callStart");
            if (NetManager.getNetConfigManager() != null && NetManager.getNetConfigManager().enableTracer()) {
                this.f42693c = true;
            }
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            this.f42692b = String.valueOf(f42691a.getAndIncrement());
            Log.i("NetTrace-Listener", "requestId is" + this.f42692b);
            a(c.f42724a);
            String url = eVar.request().q().getUrl();
            try {
                c cVarC = a.a().c(this.f42692b);
                if (cVarC != null) {
                    cVarC.B = url;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void connectEnd(@d e eVar, @d InetSocketAddress inetSocketAddress, @d Proxy proxy, @dl.e Protocol protocol) {
        super.connectEnd(eVar, inetSocketAddress, proxy, protocol);
        try {
            Log.d("NetTrace-Listener", "connectEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectEnd net enable false.");
                return;
            }
            a(c.f42732i);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void connectFailed(@d e eVar, @d InetSocketAddress inetSocketAddress, @d Proxy proxy, @dl.e Protocol protocol, @d IOException iOException) {
        super.connectFailed(eVar, inetSocketAddress, proxy, protocol, iOException);
        try {
            Log.d("NetTrace-Listener", "connectFailed");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectFailed net enable false.");
                return;
            }
            a(c.f42733j);
            a();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void connectStart(@d e eVar, @d InetSocketAddress inetSocketAddress, @d Proxy proxy) {
        super.connectStart(eVar, inetSocketAddress, proxy);
        try {
            Log.d("NetTrace-Listener", "connectStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "connectStart net enable false.");
                return;
            }
            a(c.f42729f);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void connectionAcquired(@d e eVar, @d i iVar) {
        super.connectionAcquired(eVar, iVar);
        try {
            Log.d("NetTrace-Listener", "connectionAcquired");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "callStart net enable false.");
                return;
            }
            InetAddress inetAddress = iVar.socket().getInetAddress();
            if (inetAddress != null) {
                String hostAddress = inetAddress.getHostAddress();
                try {
                    c cVarC = a.a().c(this.f42692b);
                    if (cVarC != null) {
                        cVarC.C = hostAddress;
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void dnsEnd(@d e eVar, @d String str, @d List<InetAddress> list) {
        super.dnsEnd(eVar, str, list);
        try {
            Log.d("NetTrace-Listener", "dnsEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsEnd net enable false.");
                return;
            }
            a(c.f42728e);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void dnsStart(@d e eVar, @d String str) {
        super.dnsStart(eVar, str);
        try {
            Log.d("NetTrace-Listener", "dnsStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "dnsStart net enable false.");
                return;
            }
            a(c.f42727d);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void requestBodyEnd(@d e eVar, long j10) {
        super.requestBodyEnd(eVar, j10);
        try {
            Log.d("NetTrace-Listener", "requestBodyEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyEnd net enable false.");
                return;
            }
            a(c.f42737n);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void requestBodyStart(@d e eVar) {
        super.requestBodyStart(eVar);
        try {
            Log.d("NetTrace-Listener", "requestBodyStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestBodyStart net enable false.");
                return;
            }
            a(c.f42736m);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void requestHeadersEnd(@d e eVar, @d a0 a0Var) {
        super.requestHeadersEnd(eVar, a0Var);
        try {
            Log.d("NetTrace-Listener", "requestHeadersEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersEnd net enable false.");
                return;
            }
            a(c.f42735l);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void requestHeadersStart(@d e eVar) {
        super.requestHeadersStart(eVar);
        try {
            Log.d("NetTrace-Listener", "requestHeadersStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "requestHeadersStart net enable false.");
                return;
            }
            a(c.f42734k);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void responseBodyEnd(@d e eVar, long j10) {
        super.responseBodyEnd(eVar, j10);
        try {
            Log.d("NetTrace-Listener", "responseBodyEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyEnd net enable false.");
                return;
            }
            a(c.f42741r);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void responseBodyStart(@d e eVar) {
        super.responseBodyStart(eVar);
        try {
            Log.d("NetTrace-Listener", "responseBodyStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseBodyStart net enable false.");
                return;
            }
            a(c.f42740q);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void responseHeadersEnd(@d e eVar, @d c0 c0Var) {
        super.responseHeadersEnd(eVar, c0Var);
        try {
            Log.d("NetTrace-Listener", "responseHeadersEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersEnd net enable false.");
                return;
            }
            a(c.f42739p);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void responseHeadersStart(@d e eVar) {
        super.responseHeadersStart(eVar);
        try {
            Log.d("NetTrace-Listener", "responseHeadersStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "responseHeadersStart net enable false.");
                return;
            }
            a(c.f42738o);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void secureConnectEnd(@d e eVar, @dl.e Handshake handshake) {
        super.secureConnectEnd(eVar, handshake);
        try {
            Log.d("NetTrace-Listener", "secureConnectEnd");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectEnd net enable false.");
                return;
            }
            a(c.f42731h);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.p
    public void secureConnectStart(@d e eVar) {
        super.secureConnectStart(eVar);
        try {
            Log.d("NetTrace-Listener", "secureConnectStart");
            if (!this.f42693c && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                Log.d("NetTrace-Listener", "secureConnectStart net enable false.");
                return;
            }
            a(c.f42730g);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
