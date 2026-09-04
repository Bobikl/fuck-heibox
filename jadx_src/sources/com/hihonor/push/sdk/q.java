package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class q implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f60068a;

    public q(s sVar) {
        this.f60068a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f60068a.f60076b.a(false);
        return null;
    }
}
