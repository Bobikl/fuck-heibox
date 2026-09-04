package com.tencent.qimei.l;

/* JADX INFO: compiled from: StringSingle.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101283a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f101284b = false;

    public void a(String str) {
        if (str == null) {
            this.f101283a = "";
        } else {
            this.f101283a = str;
        }
        this.f101284b = true;
    }

    public boolean a() {
        return this.f101284b;
    }

    public String b() {
        return this.f101283a;
    }
}
