package com.efs.sdk.base.core.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f42514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42515c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42516d = "none";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42517e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f42518f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f42519g = 1;

    a(String str, byte b10) {
        this.f42514b = (byte) 2;
        this.f42513a = str;
        if (b10 <= 0 || 3 < b10) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b10)));
        }
        this.f42514b = b10;
    }
}
