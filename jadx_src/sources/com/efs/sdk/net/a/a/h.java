package com.efs.sdk.net.a.a;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f42711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteArrayOutputStream f42712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f42713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f42714d;

    public h(f fVar, String str) {
        this.f42711a = fVar;
        this.f42714d = str;
    }

    public final boolean a() {
        return this.f42712b != null;
    }

    public final void b() {
        if (!a()) {
            throw new IllegalStateException("No body found; has createBodySink been called?");
        }
    }
}
