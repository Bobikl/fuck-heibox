package com.igexin.sdk.a;

import com.igexin.push.core.stub.PushCore;
import com.igexin.sdk.IPushCore;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f64086b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IPushCore f64087a;

    private a() {
    }

    public static a a() {
        if (f64086b == null) {
            f64086b = new a();
        }
        return f64086b;
    }

    public void b() {
        this.f64087a = new PushCore();
    }

    public IPushCore c() {
        return this.f64087a;
    }
}
