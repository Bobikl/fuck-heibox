package com.taobao.accs.ut.a;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98405b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f98409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f98410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f98411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f98412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f98413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f98414k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98406c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98407d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98408e = 0;

    public void a() {
        String strValueOf;
        String strValueOf2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ALog.isPrintLog()) {
            ALog.d("MonitorStatistic", "commitUT interval:" + (jCurrentTimeMillis - this.f98414k) + " interval1:" + (jCurrentTimeMillis - this.f98411h), new Object[0]);
        }
        if (jCurrentTimeMillis - this.f98414k <= 1200000 || jCurrentTimeMillis - this.f98411h <= 60000) {
            return;
        }
        HashMap map = new HashMap();
        String str = null;
        try {
            String strValueOf3 = String.valueOf(this.f98407d);
            try {
                strValueOf2 = String.valueOf(this.f98408e);
                try {
                    strValueOf = String.valueOf(221);
                    try {
                        map.put("connStatus", String.valueOf(this.f98404a));
                        map.put("connType", String.valueOf(this.f98405b));
                        map.put("tcpConnected", String.valueOf(this.f98406c));
                        map.put(WebviewFragment.A4, String.valueOf(this.f98409f));
                        map.put("startServiceTime", String.valueOf(this.f98411h));
                        map.put("commitTime", String.valueOf(jCurrentTimeMillis));
                        map.put("networkAvailable", String.valueOf(this.f98412i));
                        map.put("threadIsalive", String.valueOf(this.f98413j));
                        map.put("url", this.f98410g);
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            try {
                                ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, strValueOf3, strValueOf2, strValueOf, map), new Object[0]);
                            } catch (Throwable th2) {
                                th = th2;
                                str = strValueOf3;
                                ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, str, strValueOf2, strValueOf, map) + " " + th.toString(), new Object[0]);
                            }
                        }
                        try {
                            UTMini.getInstance().commitEvent(66001, "MONITOR", strValueOf3, strValueOf2, strValueOf, map);
                            this.f98414k = jCurrentTimeMillis;
                        } catch (Throwable th3) {
                            th = th3;
                            str = strValueOf3;
                            strValueOf = strValueOf;
                            strValueOf2 = strValueOf2;
                            ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, str, strValueOf2, strValueOf, map) + " " + th.toString(), new Object[0]);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    strValueOf = null;
                }
            } catch (Throwable th6) {
                th = th6;
                strValueOf = null;
                strValueOf2 = null;
            }
        } catch (Throwable th7) {
            th = th7;
            strValueOf = null;
            strValueOf2 = null;
        }
    }
}
