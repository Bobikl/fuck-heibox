package com.igexin.a.a.b.a.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends a {
    private com.igexin.a.a.b.a.a.a.b K;
    private byte[] L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    o f63165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    com.igexin.a.a.b.b f63166i;

    public l(o oVar, com.igexin.a.a.b.b bVar) {
        super(-2035, null, bVar);
        this.f63166i = bVar;
        this.f63165h = oVar;
    }

    public void a(com.igexin.a.a.b.a.a.a.b bVar) {
        this.K = bVar;
    }

    @Override // com.igexin.a.a.d.e
    public void b() throws Exception {
        super.b();
        Thread threadCurrentThread = Thread.currentThread();
        com.igexin.a.a.c.b.a("GS-R|" + threadCurrentThread + " running", new Object[0]);
        while (this.f63137g && !threadCurrentThread.isInterrupted() && !((a) this).f63134d) {
            try {
                this.f63166i.c(null, this.f63165h);
                this.f63135e = b.NORMAL;
            } catch (Throwable th2) {
                this.f63137g = false;
                if (this.f63135e != b.INTERRUPT) {
                    this.f63135e = b.EXCEPTION;
                    this.f63136f = (th2.getMessage() == null || !th2.getMessage().equals("read = -1, end of stream !")) ? th2.toString() : "end of stream";
                }
            }
        }
        ((a) this).f63134d = true;
        com.igexin.a.a.c.b.a("GS-R|finish ~~~~~~", new Object[0]);
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return -2035;
    }

    @Override // com.igexin.a.a.b.d, com.igexin.a.a.d.e
    public void f() {
        super.f();
        com.igexin.a.a.c.b.a("GS-R|rt dispose", new Object[0]);
        if (this.K != null) {
            if (this.f63135e != b.EXCEPTION) {
                this.K.a(this);
            } else if (!TextUtils.isEmpty(this.f63136f)) {
                this.K.a(new Exception(this.f63136f));
            }
        }
        if (this.L != null) {
            this.L = null;
        }
        this.K = null;
    }

    public void j() {
        this.f63137g = false;
        this.f63135e = b.INTERRUPT;
    }
}
