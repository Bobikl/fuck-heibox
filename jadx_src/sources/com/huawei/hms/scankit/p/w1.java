package com.huawei.hms.scankit.p;

import java.util.List;

/* JADX INFO: compiled from: DecoderResult.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f62466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f62468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<byte[]> f62469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f62470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f62471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f62472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f62473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f62474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f62475j;

    public w1(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public w1(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f62466a = bArr;
        this.f62467b = bArr == null ? 0 : bArr.length * 8;
        this.f62468c = str;
        this.f62469d = list;
        this.f62470e = str2;
        this.f62474i = i11;
        this.f62475j = i10;
    }

    public int a() {
        return this.f62467b;
    }

    public void a(int i10) {
        this.f62467b = i10;
    }

    public void a(Integer num) {
        this.f62472g = num;
    }

    public void a(Object obj) {
        this.f62473h = obj;
    }

    public Object b() {
        return this.f62473h;
    }

    public void b(Integer num) {
        this.f62471f = num;
    }

    public byte[] c() {
        return this.f62466a;
    }

    public String d() {
        return this.f62468c;
    }
}
