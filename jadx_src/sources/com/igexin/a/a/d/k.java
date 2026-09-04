package com.igexin.a.a.d;

import android.os.Process;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile boolean f63282a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f63283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f63284c;

    public k(f fVar) {
        this.f63284c = fVar;
        setName("TS-processor");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-2);
        d<e> dVar = this.f63284c.f63254k;
        while (true) {
            e eVarC = null;
            while (true) {
                byte b10 = 1;
                while (true) {
                    if (!this.f63282a) {
                        dVar.d();
                        return;
                    }
                    try {
                        try {
                            try {
                                if (b10 != -1) {
                                    if (b10 != 0) {
                                        if (b10 != 1) {
                                            if (b10 == 2) {
                                                this.f63284c.g();
                                            }
                                        }
                                    }
                                    eVarC = dVar.c();
                                    if (eVarC == null) {
                                        this.f63284c.g();
                                    } else if (!eVarC.f63232j || eVarC.f63233k) {
                                        eVarC = null;
                                    } else {
                                        b10 = -1;
                                    }
                                } else {
                                    try {
                                        eVarC.d();
                                        if (eVarC.q()) {
                                            break;
                                        }
                                        if (eVarC.f63235n && eVarC.f63241t == 0) {
                                            com.igexin.a.a.c.b.a("TaskService|" + eVarC + "|isBlock = false|cycyle = true|doTime = 0, invalid ###########", new Object[0]);
                                        }
                                    } catch (Exception e10) {
                                        com.igexin.a.a.c.b.a("TaskService|TASK_INIT|error|" + e10.toString(), new Object[0]);
                                    }
                                }
                                eVarC = dVar.c();
                            } catch (InterruptedException unused) {
                            }
                            eVarC.b();
                            eVarC.g();
                            eVarC.e_();
                            this.f63284c.g();
                            if (!eVarC.f63240s) {
                                eVarC.c();
                            }
                            if (!eVarC.f63232j && !eVarC.f63236o) {
                                eVarC.f63247z = 0;
                                dVar.a(eVarC);
                            }
                        } catch (Exception e11) {
                            com.igexin.a.a.c.b.a("TaskService|SERVICE_PROCESSING|error|" + e11.toString(), new Object[0]);
                            eVarC.f63240s = true;
                            eVarC.A = e11;
                            eVarC.t();
                            eVarC.p();
                            this.f63284c.f63253j.a(eVarC);
                            this.f63284c.g();
                            if (!eVarC.f63240s) {
                                eVarC.c();
                            }
                            if (!eVarC.f63232j && !eVarC.f63236o) {
                            }
                            eVarC = null;
                            b10 = 1;
                            eVarC = dVar.c();
                            if (eVarC == null) {
                                if (eVarC.f63232j) {
                                }
                                eVarC = null;
                            } else {
                                this.f63284c.g();
                            }
                        }
                        eVarC = null;
                        b10 = 1;
                        if (eVarC == null) {
                            if (eVarC.f63232j) {
                            }
                            eVarC = null;
                        } else {
                            this.f63284c.g();
                        }
                    } catch (Throwable th2) {
                        this.f63284c.g();
                        if (!eVarC.f63240s) {
                            eVarC.c();
                        }
                        if (!eVarC.f63232j && !eVarC.f63236o) {
                            eVarC.f63247z = 0;
                            dVar.a(eVarC);
                        }
                        throw th2;
                    }
                }
            }
            if (this.f63283b == null) {
                this.f63283b = new h(this.f63284c);
            }
            this.f63283b.a(eVarC);
        }
    }
}
