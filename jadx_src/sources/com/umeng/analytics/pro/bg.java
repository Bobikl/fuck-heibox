package com.umeng.analytics.pro;

import java.io.Serializable;

/* JADX INFO: compiled from: FieldValueMetaData.java */
/* JADX INFO: loaded from: classes4.dex */
public class bg implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f104570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f104571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f104572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f104573d;

    public bg(byte b10) {
        this(b10, false);
    }

    public bg(byte b10, String str) {
        this.f104571b = b10;
        this.f104570a = true;
        this.f104572c = str;
        this.f104573d = false;
    }

    public bg(byte b10, boolean z10) {
        this.f104571b = b10;
        this.f104570a = false;
        this.f104572c = null;
        this.f104573d = z10;
    }

    public boolean a() {
        return this.f104570a;
    }

    public String b() {
        return this.f104572c;
    }

    public boolean c() {
        return this.f104571b == 12;
    }

    public boolean d() {
        byte b10 = this.f104571b;
        return b10 == 15 || b10 == 13 || b10 == 14;
    }

    public boolean e() {
        return this.f104573d;
    }
}
