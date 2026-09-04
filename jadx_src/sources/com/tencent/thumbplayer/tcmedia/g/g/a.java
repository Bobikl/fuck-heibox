package com.tencent.thumbplayer.tcmedia.g.g;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import z5.g;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f102781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f102782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f102783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f102784e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f102786g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f102780a = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f102785f = "";

    public a(boolean z10) {
        this.f102786g = z10;
    }

    private final void c(boolean z10) {
        this.f102782c = z10;
        this.f102784e = true;
    }

    private final void d(boolean z10) {
        this.f102783d = z10;
    }

    public final void a() {
        this.f102785f = "";
        this.f102780a.clear();
        this.f102781b = System.currentTimeMillis();
    }

    public final void a(boolean z10) {
        d(z10);
        this.f102781b = System.currentTimeMillis();
    }

    public final void b() {
        this.f102780a.put("createCodec", Long.valueOf(System.currentTimeMillis() - this.f102781b));
    }

    public final void b(boolean z10) {
        c(z10);
        this.f102780a.put("configCodec", Long.valueOf(System.currentTimeMillis() - this.f102781b));
    }

    public final void c() {
        this.f102781b = System.currentTimeMillis();
    }

    public final void d() {
        this.f102780a.put("startCodec", Long.valueOf(System.currentTimeMillis() - this.f102781b));
    }

    public final String e() {
        if (TextUtils.isEmpty(this.f102785f)) {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("\"isVideo\":");
            sb2.append(this.f102786g + " ,");
            if (this.f102784e) {
                sb2.append("\"isReuse\":");
                sb2.append(this.f102782c + " ,");
            }
            sb2.append("\"reuseEnable\":");
            sb2.append(this.f102783d + " ,");
            long jLongValue = 0;
            for (Map.Entry<String, Long> entry : this.f102780a.entrySet()) {
                if (entry != null) {
                    jLongValue += entry.getValue().longValue();
                }
                sb2.append("\"" + ((Object) entry.getKey()) + "\":");
                sb2.append(entry.getValue().longValue() + " ,");
            }
            sb2.append("\"totalCodec\":");
            sb2.append(jLongValue);
            sb2.append(g.f141884d);
            this.f102785f = sb2.toString();
        }
        return this.f102785f;
    }
}
