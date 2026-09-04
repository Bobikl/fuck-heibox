package com.tencent.qmsp.sdk.b;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f101723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f101724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f101725e;

    public b() {
        new HashMap();
    }

    public synchronized Object a() {
        return this.f101725e;
    }

    public synchronized void a(Object obj) {
        this.f101725e = obj;
    }
}
