package com.taobao.accs.ut.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f98430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f98431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f98432g = "sendAck";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f98433h = false;

    public void a() {
        String str;
        String strValueOf;
        if (this.f98433h) {
            return;
        }
        this.f98433h = true;
        HashMap map = new HashMap();
        try {
            str = this.f98426a;
            try {
                strValueOf = String.valueOf(221);
                try {
                    map.put("device_id", this.f98426a);
                    map.put("session_id", this.f98427b);
                    map.put("data_id", this.f98428c);
                    map.put("ack_date", this.f98429d);
                    map.put("service_id", this.f98430e);
                    map.put("fail_reasons", this.f98431f);
                    UTMini.getInstance().commitEvent(66001, "sendAck", str, (Object) null, strValueOf, map);
                } catch (Throwable th2) {
                    th = th2;
                    ALog.d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                strValueOf = null;
            }
        } catch (Throwable th4) {
            th = th4;
            str = null;
            strValueOf = null;
        }
    }
}
