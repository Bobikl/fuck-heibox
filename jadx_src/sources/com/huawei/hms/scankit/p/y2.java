package com.huawei.hms.scankit.p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: EncoderContext.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e7 f62578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l2 f62579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l2 f62580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StringBuilder f62581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f62582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f62583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d7 f62584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f62585i;

    y2(String str) throws Exception {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                try {
                    throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
                } catch (Exception e10) {
                    throw e10;
                }
            }
            sb2.append(c10);
        }
        this.f62577a = sb2.toString();
        this.f62578b = e7.FORCE_NONE;
        this.f62581e = new StringBuilder(str.length());
        this.f62583g = -1;
    }

    private int h() {
        return this.f62577a.length() - this.f62585i;
    }

    public int a() {
        return this.f62581e.length();
    }

    public void a(char c10) {
        this.f62581e.append(c10);
    }

    public void a(int i10) {
        this.f62585i = i10;
    }

    public void a(e7 e7Var) {
        this.f62578b = e7Var;
    }

    public void a(l2 l2Var, l2 l2Var2) {
        this.f62579c = l2Var;
        this.f62580d = l2Var2;
    }

    public void a(String str) {
        this.f62581e.append(str);
    }

    public StringBuilder b() {
        return this.f62581e;
    }

    public void b(int i10) {
        this.f62583g = i10;
    }

    public char c() {
        return this.f62577a.charAt(this.f62582f);
    }

    public void c(int i10) {
        d7 d7Var = this.f62584h;
        if (d7Var == null || i10 > d7Var.a()) {
            this.f62584h = d7.a(i10, this.f62578b, this.f62579c, this.f62580d, true);
        }
    }

    public String d() {
        return this.f62577a;
    }

    public int e() {
        return this.f62583g;
    }

    public int f() {
        return h() - this.f62582f;
    }

    public d7 g() {
        return this.f62584h;
    }

    public boolean i() {
        return this.f62582f < h();
    }

    public void j() {
        this.f62583g = -1;
    }

    public void k() {
        this.f62584h = null;
    }

    public void l() {
        c(a());
    }
}
