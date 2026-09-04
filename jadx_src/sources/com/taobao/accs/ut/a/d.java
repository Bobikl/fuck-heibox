package com.taobao.accs.ut.a;

import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f98416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f98417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f98418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f98419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f98420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f98421g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f98423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f98424j = "receiveMessage";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f98422h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f98425k = false;

    public void a() {
        String str;
        String strValueOf;
        if (this.f98425k) {
            return;
        }
        this.f98425k = true;
        HashMap map = new HashMap();
        try {
            str = this.f98415a;
            try {
                strValueOf = String.valueOf(221);
                try {
                    map.put("device_id", this.f98415a);
                    map.put("data_id", this.f98416b);
                    map.put("receive_date", this.f98417c);
                    map.put("to_bz_date", this.f98418d);
                    map.put("service_id", this.f98419e);
                    map.put("data_length", this.f98420f);
                    map.put(SendToFriendActivity.R, this.f98421g);
                    map.put("repeat", this.f98422h ? "y" : "n");
                    map.put("user_id", this.f98423i);
                    UTMini.getInstance().commitEvent(66001, "receiveMessage", str, (Object) null, strValueOf, map);
                } catch (Throwable th2) {
                    th = th2;
                    ALog.d("ReceiveMessage", UTMini.getCommitInfo(66001, str, (String) null, strValueOf, map) + " " + th.toString(), new Object[0]);
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
