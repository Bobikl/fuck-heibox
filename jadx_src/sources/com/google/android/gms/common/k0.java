package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Callable f52589f;

    /* synthetic */ k0(Callable callable, j0 j0Var) {
        super();
        this.f52589f = callable;
    }

    @Override // com.google.android.gms.common.m0
    final String a() {
        try {
            return (String) this.f52589f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
