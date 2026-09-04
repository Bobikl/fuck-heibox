package com.igexin.push.c;

import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63370a = "DT_" + j.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63373d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f63377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63378i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63374e = 2147483647L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f63375f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63376g = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f63379j = 1;

    public j() {
    }

    public j(String str, int i10) {
        this.f63371b = str;
        this.f63373d = i10;
    }

    private void i() {
        this.f63372c = null;
        this.f63377h = 0;
        this.f63376g = true;
    }

    private boolean j() {
        return this.f63372c != null && System.currentTimeMillis() - this.f63375f <= f.f63359b && this.f63377h < 1;
    }

    public synchronized String a() {
        return this.f63371b;
    }

    public void a(int i10) {
        this.f63373d = i10;
    }

    public void a(long j10) {
        this.f63374e = j10;
    }

    public synchronized void a(String str) {
        this.f63371b = str;
    }

    public synchronized void a(String str, long j10, long j11) {
        this.f63372c = str;
        this.f63374e = j10;
        this.f63375f = j11;
        this.f63377h = 0;
        this.f63378i = 0;
        this.f63376g = false;
    }

    public void a(boolean z10) {
        this.f63376g = z10;
    }

    public synchronized String b(boolean z10) {
        if (j()) {
            if (z10) {
                this.f63377h++;
            }
            this.f63376g = false;
            return this.f63372c;
        }
        i();
        com.igexin.a.a.c.b.a(f63370a + "|disc, ip is invalid, use domain = " + this.f63371b, new Object[0]);
        if (z10) {
            this.f63378i++;
        }
        return this.f63371b;
    }

    public synchronized void b() {
        this.f63372c = null;
        this.f63374e = 2147483647L;
        this.f63375f = -1L;
        this.f63376g = true;
        this.f63377h = 0;
    }

    public void b(long j10) {
        this.f63375f = j10;
    }

    public void b(String str) {
        this.f63372c = str;
    }

    public String c() {
        return this.f63372c;
    }

    public int d() {
        return this.f63373d;
    }

    public synchronized long e() {
        return this.f63374e;
    }

    public synchronized boolean f() {
        if (j()) {
            return true;
        }
        if (this.f63378i < 1) {
            return true;
        }
        this.f63378i = 0;
        return false;
    }

    public synchronized void g() {
        this.f63377h = 0;
        this.f63378i = 0;
    }

    public JSONObject h() {
        if (this.f63371b != null && this.f63372c != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", this.f63371b);
                jSONObject.put("ip", this.f63372c);
                long j10 = this.f63374e;
                if (j10 != 2147483647L) {
                    jSONObject.put("consumeTime", j10);
                }
                jSONObject.put(HeyboxMicFragment.f93763y, this.f63373d);
                long j11 = this.f63375f;
                if (j11 != -1) {
                    jSONObject.put("detectSuccessTime", j11);
                }
                jSONObject.put("isDomain", this.f63376g);
                jSONObject.put("connectTryCnt", 1);
                return jSONObject;
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
