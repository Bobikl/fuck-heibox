package com.hihonor.push.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a1<TResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f60001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TResult f60002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Exception f60003d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f60000a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<j0<TResult>> f60004e = new ArrayList();

    public final a1<TResult> a(j0<TResult> j0Var) {
        synchronized (this.f60000a) {
            if (this.f60001b) {
                j0Var.a(this);
            } else {
                this.f60004e.add(j0Var);
            }
        }
        return this;
    }

    public final void a() {
        synchronized (this.f60000a) {
            Iterator<j0<TResult>> it = this.f60004e.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f60004e = null;
        }
    }

    public final Exception b() {
        Exception exc;
        synchronized (this.f60000a) {
            exc = this.f60003d;
        }
        return exc;
    }

    public final TResult c() {
        TResult tresult;
        synchronized (this.f60000a) {
            if (this.f60003d != null) {
                throw new RuntimeException(this.f60003d);
            }
            tresult = this.f60002c;
        }
        return tresult;
    }

    public final boolean d() {
        synchronized (this.f60000a) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    public final boolean e() {
        boolean z10;
        synchronized (this.f60000a) {
            if (this.f60001b) {
                d();
                if (this.f60003d == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
