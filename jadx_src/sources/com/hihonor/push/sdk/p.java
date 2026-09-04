package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public class p implements Callable<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f60066a;

    public p(s sVar) {
        this.f60066a = sVar;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f60066a.f60076b.a(true);
        return null;
    }
}
