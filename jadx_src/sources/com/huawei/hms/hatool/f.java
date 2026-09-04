package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f60914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f60916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f60918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<b1> f60919f;

    public f(byte[] bArr, String str, String str2, String str3, String str4, List<b1> list) {
        this.f60914a = (byte[]) bArr.clone();
        this.f60915b = str;
        this.f60916c = str2;
        this.f60918e = str3;
        this.f60917d = str4;
        this.f60919f = list;
    }

    private n0 a(Map<String, String> map) {
        return w.a(this.f60915b, this.f60914a, map);
    }

    private Map<String, String> a() {
        return k.b(this.f60916c, this.f60918e, this.f60917d);
    }

    private void b() {
        b0.c().a(new d1(this.f60919f, this.f60916c, this.f60917d, this.f60918e));
    }

    @Override // java.lang.Runnable
    public void run() {
        v.c("hmsSdk", "send data running");
        int iB = a(a()).b();
        if (iB != 200) {
            b();
            return;
        }
        v.b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f60917d, this.f60918e, this.f60916c, Integer.valueOf(iB));
    }
}
