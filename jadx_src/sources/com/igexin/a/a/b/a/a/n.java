package com.igexin.a.a.b.a.a;

import android.text.TextUtils;
import org.android.spdy.TnetStatusCode;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends a {
    private com.igexin.a.a.b.a.a.a.c K;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.igexin.a.a.b.b f63167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    p f63168i;

    public n(p pVar, com.igexin.a.a.b.b bVar) {
        super(TnetStatusCode.EASY_REASON_SPDYINIT_ERROR, null, bVar);
        this.f63167h = bVar;
        this.f63168i = pVar;
    }

    public void a(com.igexin.a.a.b.a.a.a.c cVar) {
        this.K = cVar;
    }

    @Override // com.igexin.a.a.d.e
    public void b() throws Exception {
        super.b();
        Thread threadCurrentThread = Thread.currentThread();
        com.igexin.a.a.c.b.a("GS-W|" + threadCurrentThread + " running", new Object[0]);
        f fVarA = f.a();
        while (this.f63137g && !threadCurrentThread.isInterrupted() && !((a) this).f63134d) {
            try {
                fVarA.f63146a.lock();
                if (fVarA.f63148c.isEmpty() && this.f63137g) {
                    fVarA.f63147b.await();
                }
                m mVarPoll = fVarA.f63148c.poll();
                if (mVarPoll != null && this.f63137g && this.f63168i != null && this.f63137g) {
                    this.f63135e = b.NORMAL;
                    if (this.K != null && this.f63137g) {
                        this.K.a(mVarPoll);
                    }
                    this.f63168i.a((byte[]) this.f63167h.d(null, mVarPoll.f63193c));
                    if (mVarPoll.f63193c != null) {
                        com.igexin.a.a.c.b.a("GS-W|" + mVarPoll.toString() + " --> " + mVarPoll.f63193c.getClass().getName() + "-- send success", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                try {
                    this.f63137g = false;
                    if (this.f63135e != b.INTERRUPT) {
                        this.f63135e = b.EXCEPTION;
                        this.f63136f = th2.toString();
                    }
                } catch (Throwable th3) {
                    try {
                        fVarA.f63146a.unlock();
                    } catch (Exception unused) {
                    }
                    throw th3;
                }
            }
            try {
                fVarA.f63146a.unlock();
            } catch (Exception unused2) {
            }
        }
        ((a) this).f63134d = true;
        com.igexin.a.a.c.b.a("GS-W|finish ~~~~~~", new Object[0]);
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return TnetStatusCode.EASY_REASON_SPDYINIT_ERROR;
    }

    @Override // com.igexin.a.a.b.d, com.igexin.a.a.d.e
    public void f() {
        super.f();
        com.igexin.a.a.c.b.a("GS-W|wt dispose", new Object[0]);
        if (this.K != null) {
            if (this.f63135e != b.EXCEPTION) {
                this.K.a(this);
            } else if (!TextUtils.isEmpty(this.f63136f)) {
                this.K.a(new Exception(this.f63136f));
            }
        }
        this.K = null;
    }

    public void j() {
        this.f63137g = false;
        this.f63135e = b.INTERRUPT;
        f fVarA = f.a();
        try {
            if (!((a) this).f63134d) {
                fVarA.f63146a.lock();
                fVarA.f63147b.signalAll();
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                fVarA.f63146a.unlock();
            } catch (Exception unused2) {
            }
            throw th2;
        }
        try {
            fVarA.f63146a.unlock();
        } catch (Exception unused3) {
        }
    }
}
