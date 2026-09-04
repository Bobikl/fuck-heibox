package com.tencent.beacon.a.c;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.module.ModuleName;

/* JADX INFO: compiled from: BeaconInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f98790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f98791b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f98796g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98794e = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f98797h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f98798i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f98799j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f98800k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f98801l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f98802m = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f98792c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f98793d = "beacon";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98795f = "unknown";

    public static c d() {
        if (f98790a == null) {
            synchronized (c.class) {
                if (f98790a == null) {
                    f98790a = new c();
                }
            }
        }
        return f98790a;
    }

    public BeaconModule a(ModuleName moduleName) {
        return BeaconModule.f99211a.get(moduleName);
    }

    public String a() {
        return this.f98798i;
    }

    public synchronized void a(long j10) {
        this.f98796g = j10;
    }

    public synchronized void a(Context context) {
        if (this.f98791b == null) {
            Context applicationContext = context.getApplicationContext();
            this.f98791b = applicationContext;
            if (applicationContext == null) {
                this.f98791b = context;
            }
        }
    }

    public void a(String str) {
        this.f98798i = str;
    }

    public void a(boolean z10) {
        this.f98802m = z10;
    }

    public synchronized String b() {
        return this.f98795f;
    }

    public void b(String str) {
        this.f98795f = str;
    }

    public synchronized Context c() {
        return this.f98791b;
    }

    public void c(String str) {
        this.f98801l = str;
    }

    public void d(String str) {
        this.f98797h = str;
    }

    public String e() {
        return this.f98801l;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f98800k = str;
    }

    @n0
    public String f() {
        return this.f98797h;
    }

    public String g() {
        return this.f98800k;
    }

    public synchronized byte h() {
        return this.f98792c;
    }

    public synchronized String i() {
        return this.f98793d;
    }

    public String j() {
        return "4.2.57.1";
    }

    public synchronized long k() {
        return this.f98796g;
    }

    public String l() {
        return this.f98799j;
    }

    public boolean m() {
        return this.f98802m;
    }
}
