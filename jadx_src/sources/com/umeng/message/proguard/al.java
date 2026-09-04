package com.umeng.message.proguard;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq f105734a = new aq("notify");

    private long f() {
        return this.f105734a.b("rep_ts", 0L);
    }

    public final void a(long j10) {
        this.f105734a.a("rep_ts", j10);
    }

    public final void a(boolean z10) {
        this.f105734a.a("e_s", z10);
    }

    public final boolean a() {
        return this.f105734a.b("e_u", true);
    }

    public final long b() {
        return this.f105734a.b("req_ts", 0L);
    }

    public final void b(boolean z10) {
        this.f105734a.a("sync", z10);
    }

    public final boolean c() {
        return Math.abs(System.currentTimeMillis() - f()) < 60000;
    }

    public final String d() {
        String strB = this.f105734a.b("info", "");
        if (!TextUtils.isEmpty(strB)) {
            try {
                return new String(as.a(strB));
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public final boolean e() {
        return this.f105734a.b("sync", false);
    }
}
