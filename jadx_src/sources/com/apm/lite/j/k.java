package com.apm.lite.j;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f40043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f40044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f40045d;

    public k(int i10) {
        this.f40042a = i10;
    }

    public k(int i10, String str) {
        this.f40042a = i10;
        this.f40043b = str;
    }

    public k(int i10, Throwable th2) {
        this.f40042a = i10;
        if (th2 != null) {
            this.f40043b = th2.getMessage();
        }
    }

    public k(int i10, JSONObject jSONObject) {
        this.f40042a = i10;
        this.f40044c = jSONObject;
    }

    public k(int i10, byte[] bArr) {
        this.f40042a = i10;
        this.f40045d = bArr;
    }

    public boolean a() {
        return this.f40042a != 207;
    }

    public byte[] b() {
        return this.f40045d;
    }
}
