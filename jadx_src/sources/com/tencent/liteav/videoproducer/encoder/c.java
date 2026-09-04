package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f100856a;

    private c(b bVar) {
        this.f100856a = bVar;
    }

    public static Runnable a(b bVar) {
        return new c(bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f100856a;
        if (bVar.f100833e != null) {
            LiteavLog.w(bVar.f100829a, "onRequestRestart");
            bVar.f100833e.a();
        }
    }
}
