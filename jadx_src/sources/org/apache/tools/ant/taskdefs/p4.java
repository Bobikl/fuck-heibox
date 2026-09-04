package org.apache.tools.ant.taskdefs;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.ExitStatusException;
import org.apache.tools.ant.Location;

/* JADX INFO: compiled from: Parallel.java */
/* JADX INFO: loaded from: classes5.dex */
public class p4 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.x2 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f135515y = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f135520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f135521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f135522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f135523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f135524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private StringBuffer f135525t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Throwable f135527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Location f135528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f135529x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Vector<org.apache.tools.ant.u2> f135516k = new Vector<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f135517l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f135518m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f135519n = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f135526u = 0;

    /* JADX INFO: compiled from: Parallel.java */
    public class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public synchronized void run() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + p4.this.f135520o;
                for (long jCurrentTimeMillis2 = System.currentTimeMillis(); jCurrentTimeMillis2 < jCurrentTimeMillis; jCurrentTimeMillis2 = System.currentTimeMillis()) {
                    wait(jCurrentTimeMillis - jCurrentTimeMillis2);
                }
                synchronized (p4.this.f135517l) {
                    p4.this.f135521p = false;
                    p4.this.f135522q = true;
                    p4.this.f135517l.notifyAll();
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: compiled from: Parallel.java */
    public static class b implements org.apache.tools.ant.x2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<org.apache.tools.ant.u2> f135531b = new ArrayList();

        @Override // org.apache.tools.ant.x2
        public void c1(org.apache.tools.ant.u2 u2Var) {
            this.f135531b.add(u2Var);
        }
    }

    /* JADX INFO: compiled from: Parallel.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Throwable f135532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private org.apache.tools.ant.u2 f135533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f135534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile Thread f135535e;

        c(org.apache.tools.ant.u2 u2Var) {
            this.f135533c = u2Var;
        }

        public Throwable a() {
            return this.f135532b;
        }

        void b() {
            this.f135535e.interrupt();
        }

        boolean c() {
            return this.f135534d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                org.apache.tools.ant.property.b.j(p4.this.b()).g();
                this.f135535e = Thread.currentThread();
                this.f135533c.b2();
                synchronized (p4.this.f135517l) {
                    this.f135534d = true;
                    p4.this.f135517l.notifyAll();
                }
            } catch (Throwable th2) {
                try {
                    this.f135532b = th2;
                    if (p4.this.f135523r) {
                        p4.this.f135521p = false;
                    }
                } finally {
                    synchronized (p4.this.f135517l) {
                        this.f135534d = true;
                        p4.this.f135517l.notifyAll();
                    }
                }
            }
        }
    }

    private void A2() {
        if (this.f135519n != 0) {
            this.f135518m = Runtime.getRuntime().availableProcessors() * this.f135519n;
        }
    }

    private void q2(c[] cVarArr) {
        int i10 = 0;
        do {
            boolean z10 = false;
            for (c cVar : cVarArr) {
                if (cVar != null && !cVar.c()) {
                    cVar.b();
                    Thread.yield();
                    z10 = true;
                }
            }
            if (z10) {
                i10++;
                Thread.yield();
            }
            if (!z10) {
                return;
            }
        } while (i10 < 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c r2(org.apache.tools.ant.u2 u2Var) {
        return new c(u2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c[] s2(int i10) {
        return new c[i10];
    }

    private void t2(c[] cVarArr) {
        if (cVarArr == null) {
            return;
        }
        for (c cVar : cVarArr) {
            Throwable thA = cVar.a();
            if (thA != null) {
                this.f135526u++;
                if (this.f135527v == null) {
                    this.f135527v = thA;
                }
                if ((thA instanceof BuildException) && this.f135528w == Location.f133036e) {
                    this.f135528w = ((BuildException) thA).b();
                }
                if ((thA instanceof ExitStatusException) && this.f135529x == null) {
                    ExitStatusException exitStatusException = (ExitStatusException) thA;
                    this.f135529x = Integer.valueOf(exitStatusException.d());
                    this.f135528w = exitStatusException.b();
                }
                this.f135525t.append(System.lineSeparator());
                this.f135525t.append(thA.getMessage());
            }
        }
    }

    private void z2() throws BuildException {
        boolean z10;
        int i10;
        this.f135521p = true;
        this.f135522q = false;
        c[] cVarArr = (c[]) this.f135516k.stream().map(new Function() { // from class: org.apache.tools.ant.taskdefs.n4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f134611a.r2((org.apache.tools.ant.u2) obj);
            }
        }).toArray(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.o4
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return p4.s2(i11);
            }
        });
        int size = this.f135516k.size();
        int i11 = this.f135518m;
        if (size < i11) {
            i11 = size;
        }
        c[] cVarArr2 = new c[i11];
        ThreadGroup threadGroup = new ThreadGroup("parallel");
        b bVar = this.f135524s;
        c[] cVarArr3 = (bVar == null || bVar.f135531b.isEmpty()) ? null : new c[this.f135524s.f135531b.size()];
        synchronized (this.f135517l) {
        }
        synchronized (this.f135517l) {
            if (cVarArr3 != null) {
                for (int i12 = 0; i12 < cVarArr3.length; i12++) {
                    try {
                        cVarArr3[i12] = new c((org.apache.tools.ant.u2) this.f135524s.f135531b.get(i12));
                        Thread thread = new Thread(threadGroup, cVarArr3[i12]);
                        thread.setDaemon(true);
                        thread.start();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                cVarArr2[i13] = cVarArr[i14];
                new Thread(threadGroup, cVarArr2[i13]).start();
                i13++;
                i14++;
            }
            if (this.f135520o != 0) {
                new a().start();
            }
            while (i14 < size) {
                try {
                    if (!this.f135521p) {
                        break;
                    }
                    while (true) {
                        if (i10 < i11) {
                            c cVar = cVarArr2[i10];
                            i10 = (cVar == null || cVar.c()) ? 0 : i10 + 1;
                            cVarArr2[i10] = cVarArr[i14];
                            new Thread(threadGroup, cVarArr2[i10]).start();
                            i14++;
                            break;
                        }
                        this.f135517l.wait();
                        break;
                    }
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            while (this.f135521p) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i11) {
                        this.f135521p = false;
                        break;
                    }
                    c cVar2 = cVarArr2[i15];
                    if (cVar2 != null && !cVar2.c()) {
                        this.f135517l.wait();
                        break;
                    }
                    i15++;
                }
            }
            z10 = false;
            if (!this.f135522q && !this.f135523r) {
                q2(cVarArr2);
            }
        }
        if (z10) {
            throw new BuildException("Parallel execution interrupted.");
        }
        if (this.f135522q) {
            throw new BuildException("Parallel execution timed out");
        }
        this.f135525t = new StringBuffer();
        this.f135526u = 0;
        this.f135527v = null;
        this.f135529x = null;
        this.f135528w = Location.f133036e;
        t2(cVarArr3);
        t2(cVarArr);
        int i16 = this.f135526u;
        if (i16 == 1) {
            Throwable th3 = this.f135527v;
            if (!(th3 instanceof BuildException)) {
                throw new BuildException(this.f135527v);
            }
            throw ((BuildException) th3);
        }
        if (i16 > 1) {
            if (this.f135529x != null) {
                throw new ExitStatusException(this.f135525t.toString(), this.f135529x.intValue(), this.f135528w);
            }
            throw new BuildException(this.f135525t.toString(), this.f135528w);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        A2();
        if (this.f135518m == 0) {
            this.f135518m = this.f135516k.size();
        }
        z2();
    }

    @Override // org.apache.tools.ant.x2
    public void c1(org.apache.tools.ant.u2 u2Var) {
        this.f135516k.addElement(u2Var);
    }

    public void p2(b bVar) {
        if (this.f135524s != null) {
            throw new BuildException("Only one daemon group is supported");
        }
        this.f135524s = bVar;
    }

    public void u2(boolean z10) {
        this.f135523r = z10;
    }

    public void v2(int i10) {
    }

    public void w2(int i10) {
        this.f135518m = i10;
    }

    public void x2(int i10) {
        this.f135519n = i10;
    }

    public void y2(long j10) {
        this.f135520o = j10;
    }
}
