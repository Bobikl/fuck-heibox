package com.taobao.accs.ut.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f98393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f98395e = "BindApp";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98396f = false;

    private void b(String str) {
        String str2;
        String strValueOf;
        if (this.f98396f) {
            return;
        }
        this.f98396f = true;
        HashMap map = new HashMap();
        try {
            str2 = this.f98391a;
            try {
                strValueOf = String.valueOf(221);
                try {
                    map.put("device_id", this.f98391a);
                    map.put("bind_date", this.f98392b);
                    map.put("ret", this.f98393c ? "y" : "n");
                    map.put("fail_reasons", this.f98394d);
                    map.put("push_token", "");
                    UTMini.getInstance().commitEvent(66001, str, str2, (Object) null, strValueOf, map);
                } catch (Throwable th2) {
                    th = th2;
                    ALog.d("BindAppStatistic", UTMini.getCommitInfo(66001, str2, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th3) {
                th = th3;
                strValueOf = null;
            }
        } catch (Throwable th4) {
            th = th4;
            str2 = null;
            strValueOf = null;
        }
    }

    public void a() {
        b("BindApp");
    }

    public void a(int i10) {
        if (i10 == -4) {
            a("msg too large");
            return;
        }
        if (i10 == -3) {
            a("service not available");
            return;
        }
        if (i10 == -2) {
            a("param error");
            return;
        }
        if (i10 == -1) {
            a("network fail");
        } else if (i10 != 200) {
            if (i10 != 300) {
                a(String.valueOf(i10));
            } else {
                a("app not bind");
            }
        }
    }

    public void a(String str) {
        this.f98394d = str;
    }
}
