package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f60118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f60119b;

    public z0(n0 n0Var, Callable callable) {
        this.f60118a = n0Var;
        this.f60119b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f60118a.a(this.f60119b.call());
        } catch (Exception e10) {
            this.f60118a.a(e10);
        }
    }
}
