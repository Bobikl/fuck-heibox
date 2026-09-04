package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.p0;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DownloadManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 10;
    private static final int H = 11;
    private static final int I = 12;
    private static final String J = "DownloadManager";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f47251q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f47252r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Requirements f47253s = new Requirements(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f47254t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f47255u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f47256v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f47257w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f47258x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f47259y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f47260z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f47262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f47263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f47264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RequirementsWatcher.b f47265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<d> f47266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47268h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47269i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47270j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f47271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f47272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f47273m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f47274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<com.google.android.exoplayer2.offline.e> f47275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RequirementsWatcher f47276p;

    /* JADX INFO: compiled from: DownloadManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.offline.e f47277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f47278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.google.android.exoplayer2.offline.e> f47279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final Exception f47280d;

        public b(com.google.android.exoplayer2.offline.e eVar, boolean z10, List<com.google.android.exoplayer2.offline.e> list, @p0 Exception exc) {
            this.f47277a = eVar;
            this.f47278b = z10;
            this.f47279c = list;
            this.f47280d = exc;
        }
    }

    /* JADX INFO: compiled from: DownloadManager.java */
    public static final class c extends Handler {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f47281m = 5000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f47282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HandlerThread f47283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f47284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y f47285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f47286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ArrayList<com.google.android.exoplayer2.offline.e> f47287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final HashMap<String, e> f47288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f47289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f47290i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f47291j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f47292k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f47293l;

        public c(HandlerThread handlerThread, e0 e0Var, y yVar, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f47283b = handlerThread;
            this.f47284c = e0Var;
            this.f47285d = yVar;
            this.f47286e = handler;
            this.f47291j = i10;
            this.f47292k = i11;
            this.f47290i = z10;
            this.f47287f = new ArrayList<>();
            this.f47288g = new HashMap<>();
        }

        private void A(@p0 e eVar) {
            if (eVar != null) {
                com.google.android.exoplayer2.util.a.i(!eVar.f47297e);
                eVar.f(false);
            }
        }

        private void B() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f47287f.size(); i11++) {
                com.google.android.exoplayer2.offline.e eVar = this.f47287f.get(i11);
                e eVarY = this.f47288g.get(eVar.f47235a.f47094b);
                int i12 = eVar.f47236b;
                if (i12 == 0) {
                    eVarY = y(eVarY, eVar);
                } else if (i12 == 1) {
                    A(eVarY);
                } else if (i12 == 2) {
                    com.google.android.exoplayer2.util.a.g(eVarY);
                    x(eVarY, eVar, i10);
                } else {
                    if (i12 != 5 && i12 != 7) {
                        throw new IllegalStateException();
                    }
                    z(eVarY, eVar);
                }
                if (eVarY != null && !eVarY.f47297e) {
                    i10++;
                }
            }
        }

        private void C() {
            for (int i10 = 0; i10 < this.f47287f.size(); i10++) {
                com.google.android.exoplayer2.offline.e eVar = this.f47287f.get(i10);
                if (eVar.f47236b == 2) {
                    try {
                        this.f47284c.e(eVar);
                    } catch (IOException e10) {
                        com.google.android.exoplayer2.util.u.e(r.J, "Failed to update index.", e10);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        private void b(DownloadRequest downloadRequest, int i10) {
            com.google.android.exoplayer2.offline.e eVarF = f(downloadRequest.f47094b, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (eVarF != null) {
                m(r.r(eVarF, downloadRequest, i10, jCurrentTimeMillis));
            } else {
                m(new com.google.android.exoplayer2.offline.e(downloadRequest, i10 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i10, 0));
            }
            B();
        }

        private boolean c() {
            return !this.f47290i && this.f47289h == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int d(com.google.android.exoplayer2.offline.e eVar, com.google.android.exoplayer2.offline.e eVar2) {
            return u0.q(eVar.f47237c, eVar2.f47237c);
        }

        private static com.google.android.exoplayer2.offline.e e(com.google.android.exoplayer2.offline.e eVar, int i10, int i11) {
            return new com.google.android.exoplayer2.offline.e(eVar.f47235a, i10, eVar.f47237c, System.currentTimeMillis(), eVar.f47239e, i11, 0, eVar.f47242h);
        }

        @p0
        private com.google.android.exoplayer2.offline.e f(String str, boolean z10) {
            int iG = g(str);
            if (iG != -1) {
                return this.f47287f.get(iG);
            }
            if (!z10) {
                return null;
            }
            try {
                return this.f47284c.d(str);
            } catch (IOException e10) {
                String strValueOf = String.valueOf(str);
                com.google.android.exoplayer2.util.u.e(r.J, strValueOf.length() != 0 ? "Failed to load download: ".concat(strValueOf) : new String("Failed to load download: "), e10);
                return null;
            }
        }

        private int g(String str) {
            for (int i10 = 0; i10 < this.f47287f.size(); i10++) {
                if (this.f47287f.get(i10).f47235a.f47094b.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        private void h(int i10) {
            this.f47289h = i10;
            g gVarC = null;
            try {
                try {
                    this.f47284c.h();
                    gVarC = this.f47284c.c(0, 1, 2, 5, 7);
                    while (gVarC.moveToNext()) {
                        this.f47287f.add(gVarC.H());
                    }
                } catch (IOException e10) {
                    com.google.android.exoplayer2.util.u.e(r.J, "Failed to load index.", e10);
                    this.f47287f.clear();
                }
                u0.p(gVarC);
                this.f47286e.obtainMessage(0, new ArrayList(this.f47287f)).sendToTarget();
                B();
            } catch (Throwable th2) {
                u0.p(gVarC);
                throw th2;
            }
        }

        private void i(e eVar, long j10) {
            com.google.android.exoplayer2.offline.e eVar2 = (com.google.android.exoplayer2.offline.e) com.google.android.exoplayer2.util.a.g(f(eVar.f47294b.f47094b, false));
            if (j10 == eVar2.f47239e || j10 == -1) {
                return;
            }
            m(new com.google.android.exoplayer2.offline.e(eVar2.f47235a, eVar2.f47236b, eVar2.f47237c, System.currentTimeMillis(), j10, eVar2.f47240f, eVar2.f47241g, eVar2.f47242h));
        }

        private void j(com.google.android.exoplayer2.offline.e eVar, @p0 Exception exc) {
            com.google.android.exoplayer2.offline.e eVar2 = new com.google.android.exoplayer2.offline.e(eVar.f47235a, exc == null ? 3 : 4, eVar.f47237c, System.currentTimeMillis(), eVar.f47239e, eVar.f47240f, exc == null ? 0 : 1, eVar.f47242h);
            this.f47287f.remove(g(eVar2.f47235a.f47094b));
            try {
                this.f47284c.e(eVar2);
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(r.J, "Failed to update index.", e10);
            }
            this.f47286e.obtainMessage(2, new b(eVar2, false, new ArrayList(this.f47287f), exc)).sendToTarget();
        }

        private void k(com.google.android.exoplayer2.offline.e eVar) {
            if (eVar.f47236b == 7) {
                int i10 = eVar.f47240f;
                n(eVar, i10 == 0 ? 0 : 1, i10);
                B();
            } else {
                this.f47287f.remove(g(eVar.f47235a.f47094b));
                try {
                    this.f47284c.b(eVar.f47235a.f47094b);
                } catch (IOException unused) {
                    com.google.android.exoplayer2.util.u.d(r.J, "Failed to remove from database");
                }
                this.f47286e.obtainMessage(2, new b(eVar, true, new ArrayList(this.f47287f), null)).sendToTarget();
            }
        }

        private void l(e eVar) {
            String str = eVar.f47294b.f47094b;
            this.f47288g.remove(str);
            boolean z10 = eVar.f47297e;
            if (!z10) {
                int i10 = this.f47293l - 1;
                this.f47293l = i10;
                if (i10 == 0) {
                    removeMessages(11);
                }
            }
            if (eVar.f47300h) {
                B();
                return;
            }
            Exception exc = eVar.f47301i;
            if (exc != null) {
                String strValueOf = String.valueOf(eVar.f47294b);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
                sb2.append("Task failed: ");
                sb2.append(strValueOf);
                sb2.append(", ");
                sb2.append(z10);
                com.google.android.exoplayer2.util.u.e(r.J, sb2.toString(), exc);
            }
            com.google.android.exoplayer2.offline.e eVar2 = (com.google.android.exoplayer2.offline.e) com.google.android.exoplayer2.util.a.g(f(str, false));
            int i11 = eVar2.f47236b;
            if (i11 == 2) {
                com.google.android.exoplayer2.util.a.i(!z10);
                j(eVar2, exc);
            } else {
                if (i11 != 5 && i11 != 7) {
                    throw new IllegalStateException();
                }
                com.google.android.exoplayer2.util.a.i(z10);
                k(eVar2);
            }
            B();
        }

        private com.google.android.exoplayer2.offline.e m(com.google.android.exoplayer2.offline.e eVar) {
            int i10 = eVar.f47236b;
            com.google.android.exoplayer2.util.a.i((i10 == 3 || i10 == 4) ? false : true);
            int iG = g(eVar.f47235a.f47094b);
            if (iG == -1) {
                this.f47287f.add(eVar);
                Collections.sort(this.f47287f, new s());
            } else {
                boolean z10 = eVar.f47237c != this.f47287f.get(iG).f47237c;
                this.f47287f.set(iG, eVar);
                if (z10) {
                    Collections.sort(this.f47287f, new s());
                }
            }
            try {
                this.f47284c.e(eVar);
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(r.J, "Failed to update index.", e10);
            }
            this.f47286e.obtainMessage(2, new b(eVar, false, new ArrayList(this.f47287f), null)).sendToTarget();
            return eVar;
        }

        private com.google.android.exoplayer2.offline.e n(com.google.android.exoplayer2.offline.e eVar, int i10, int i11) {
            com.google.android.exoplayer2.util.a.i((i10 == 3 || i10 == 4) ? false : true);
            return m(e(eVar, i10, i11));
        }

        private void o() {
            Iterator<e> it = this.f47288g.values().iterator();
            while (it.hasNext()) {
                it.next().f(true);
            }
            try {
                this.f47284c.h();
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(r.J, "Failed to update index.", e10);
            }
            this.f47287f.clear();
            this.f47283b.quit();
            synchronized (this) {
                this.f47282a = true;
                notifyAll();
            }
        }

        private void p() {
            ArrayList arrayList = new ArrayList();
            try {
                g gVarC = this.f47284c.c(3, 4);
                while (gVarC.moveToNext()) {
                    try {
                        arrayList.add(gVarC.H());
                    } catch (Throwable th2) {
                        if (gVarC != null) {
                            try {
                                gVarC.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                gVarC.close();
            } catch (IOException unused) {
                com.google.android.exoplayer2.util.u.d(r.J, "Failed to load downloads.");
            }
            for (int i10 = 0; i10 < this.f47287f.size(); i10++) {
                ArrayList<com.google.android.exoplayer2.offline.e> arrayList2 = this.f47287f;
                arrayList2.set(i10, e(arrayList2.get(i10), 5, 0));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f47287f.add(e((com.google.android.exoplayer2.offline.e) arrayList.get(i11), 5, 0));
            }
            Collections.sort(this.f47287f, new s());
            try {
                this.f47284c.g();
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(r.J, "Failed to update index.", e10);
            }
            ArrayList arrayList3 = new ArrayList(this.f47287f);
            for (int i12 = 0; i12 < this.f47287f.size(); i12++) {
                this.f47286e.obtainMessage(2, new b(this.f47287f.get(i12), false, arrayList3, null)).sendToTarget();
            }
            B();
        }

        private void q(String str) {
            com.google.android.exoplayer2.offline.e eVarF = f(str, true);
            if (eVarF == null) {
                String strValueOf = String.valueOf(str);
                com.google.android.exoplayer2.util.u.d(r.J, strValueOf.length() != 0 ? "Failed to remove nonexistent download: ".concat(strValueOf) : new String("Failed to remove nonexistent download: "));
            } else {
                n(eVarF, 5, 0);
                B();
            }
        }

        private void r(boolean z10) {
            this.f47290i = z10;
            B();
        }

        private void s(int i10) {
            this.f47291j = i10;
            B();
        }

        private void t(int i10) {
            this.f47292k = i10;
        }

        private void u(int i10) {
            this.f47289h = i10;
            B();
        }

        private void v(com.google.android.exoplayer2.offline.e eVar, int i10) {
            if (i10 == 0) {
                if (eVar.f47236b == 1) {
                    n(eVar, 0, 0);
                }
            } else if (i10 != eVar.f47240f) {
                int i11 = eVar.f47236b;
                if (i11 == 0 || i11 == 2) {
                    i11 = 1;
                }
                m(new com.google.android.exoplayer2.offline.e(eVar.f47235a, i11, eVar.f47237c, System.currentTimeMillis(), eVar.f47239e, i10, 0, eVar.f47242h));
            }
        }

        private void w(@p0 String str, int i10) {
            if (str == null) {
                for (int i11 = 0; i11 < this.f47287f.size(); i11++) {
                    v(this.f47287f.get(i11), i10);
                }
                try {
                    this.f47284c.f(i10);
                } catch (IOException e10) {
                    com.google.android.exoplayer2.util.u.e(r.J, "Failed to set manual stop reason", e10);
                }
            } else {
                com.google.android.exoplayer2.offline.e eVarF = f(str, false);
                if (eVarF != null) {
                    v(eVarF, i10);
                } else {
                    try {
                        this.f47284c.a(str, i10);
                    } catch (IOException e11) {
                        com.google.android.exoplayer2.util.u.e(r.J, str.length() != 0 ? "Failed to set manual stop reason: ".concat(str) : new String("Failed to set manual stop reason: "), e11);
                    }
                }
            }
            B();
        }

        private void x(e eVar, com.google.android.exoplayer2.offline.e eVar2, int i10) {
            com.google.android.exoplayer2.util.a.i(!eVar.f47297e);
            if (!c() || i10 >= this.f47291j) {
                n(eVar2, 0, 0);
                eVar.f(false);
            }
        }

        @androidx.annotation.j
        @p0
        private e y(@p0 e eVar, com.google.android.exoplayer2.offline.e eVar2) {
            if (eVar != null) {
                com.google.android.exoplayer2.util.a.i(!eVar.f47297e);
                eVar.f(false);
                return eVar;
            }
            if (!c() || this.f47293l >= this.f47291j) {
                return null;
            }
            com.google.android.exoplayer2.offline.e eVarN = n(eVar2, 2, 0);
            e eVar3 = new e(eVarN.f47235a, this.f47285d.a(eVarN.f47235a), eVarN.f47242h, false, this.f47292k, this);
            this.f47288g.put(eVarN.f47235a.f47094b, eVar3);
            int i10 = this.f47293l;
            this.f47293l = i10 + 1;
            if (i10 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            eVar3.start();
            return eVar3;
        }

        private void z(@p0 e eVar, com.google.android.exoplayer2.offline.e eVar2) {
            if (eVar != null) {
                if (eVar.f47297e) {
                    return;
                }
                eVar.f(false);
            } else {
                e eVar3 = new e(eVar2.f47235a, this.f47285d.a(eVar2.f47235a), eVar2.f47242h, true, this.f47292k, this);
                this.f47288g.put(eVar2.f47235a.f47094b, eVar3);
                eVar3.start();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = 0;
            switch (message.what) {
                case 0:
                    h(message.arg1);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 1:
                    r(message.arg1 != 0);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 2:
                    u(message.arg1);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 3:
                    w((String) message.obj, message.arg1);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 4:
                    s(message.arg1);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 5:
                    t(message.arg1);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 6:
                    b((DownloadRequest) message.obj, message.arg1);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 7:
                    q((String) message.obj);
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 8:
                    p();
                    i10 = 1;
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 9:
                    l((e) message.obj);
                    this.f47286e.obtainMessage(1, i10, this.f47288g.size()).sendToTarget();
                    return;
                case 10:
                    i((e) message.obj, u0.x1(message.arg1, message.arg2));
                    return;
                case 11:
                    C();
                    return;
                case 12:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: compiled from: DownloadManager.java */
    public interface d {
        void a(r rVar, boolean z10);

        void b(r rVar, Requirements requirements, int i10);

        void c(r rVar);

        void d(r rVar);

        void e(r rVar, boolean z10);

        void f(r rVar, com.google.android.exoplayer2.offline.e eVar, @p0 Exception exc);

        void g(r rVar, com.google.android.exoplayer2.offline.e eVar);
    }

    /* JADX INFO: compiled from: DownloadManager.java */
    public static class e extends Thread implements x.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DownloadRequest f47294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x f47295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u f47296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f47297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f47298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private volatile c f47299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f47300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @p0
        private Exception f47301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f47302j;

        private e(DownloadRequest downloadRequest, x xVar, u uVar, boolean z10, int i10, c cVar) {
            this.f47294b = downloadRequest;
            this.f47295c = xVar;
            this.f47296d = uVar;
            this.f47297e = z10;
            this.f47298f = i10;
            this.f47299g = cVar;
            this.f47302j = -1L;
        }

        private static int g(int i10) {
            return Math.min((i10 - 1) * 1000, 5000);
        }

        @Override // com.google.android.exoplayer2.offline.x.a
        public void a(long j10, long j11, float f10) {
            this.f47296d.f47303a = j11;
            this.f47296d.f47304b = f10;
            if (j10 != this.f47302j) {
                this.f47302j = j10;
                c cVar = this.f47299g;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
                }
            }
        }

        public void f(boolean z10) {
            if (z10) {
                this.f47299g = null;
            }
            if (this.f47300h) {
                return;
            }
            this.f47300h = true;
            this.f47295c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f47297e) {
                    this.f47295c.remove();
                } else {
                    long j10 = -1;
                    int i10 = 0;
                    while (!this.f47300h) {
                        try {
                            this.f47295c.a(this);
                            break;
                        } catch (IOException e10) {
                            if (!this.f47300h) {
                                long j11 = this.f47296d.f47303a;
                                if (j11 != j10) {
                                    i10 = 0;
                                    j10 = j11;
                                }
                                i10++;
                                if (i10 > this.f47298f) {
                                    throw e10;
                                }
                                Thread.sleep(g(i10));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e11) {
                this.f47301i = e11;
            }
            c cVar = this.f47299g;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public r(Context context, e0 e0Var, y yVar) {
        this.f47261a = context.getApplicationContext();
        this.f47262b = e0Var;
        this.f47271k = 3;
        this.f47272l = 5;
        this.f47270j = true;
        this.f47275o = Collections.emptyList();
        this.f47266f = new CopyOnWriteArraySet<>();
        Handler handlerB = u0.B(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.p
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f47249b.n(message);
            }
        });
        this.f47263c = handlerB;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, e0Var, yVar, handlerB, this.f47271k, this.f47272l, this.f47270j);
        this.f47264d = cVar;
        RequirementsWatcher.b bVar = new RequirementsWatcher.b() { // from class: com.google.android.exoplayer2.offline.q
            @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.b
            public final void a(RequirementsWatcher requirementsWatcher, int i10) {
                this.f47250a.w(requirementsWatcher, i10);
            }
        };
        this.f47265e = bVar;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, bVar, f47253s);
        this.f47276p = requirementsWatcher;
        int i10 = requirementsWatcher.i();
        this.f47273m = i10;
        this.f47267g = 1;
        cVar.obtainMessage(0, i10, 0).sendToTarget();
    }

    @Deprecated
    public r(Context context, o8.b bVar, Cache cache, com.google.android.exoplayer2.upstream.o.a aVar) {
        this(context, bVar, cache, aVar, new androidx.profileinstaller.f());
    }

    public r(Context context, o8.b bVar, Cache cache, com.google.android.exoplayer2.upstream.o.a aVar, Executor executor) {
        this(context, new com.google.android.exoplayer2.offline.c(bVar), new com.google.android.exoplayer2.offline.d(new com.google.android.exoplayer2.upstream.cache.a.d().j(cache).p(aVar), executor));
    }

    private void D(boolean z10) {
        if (this.f47270j == z10) {
            return;
        }
        this.f47270j = z10;
        this.f47267g++;
        this.f47264d.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
        boolean zI = I();
        Iterator<d> it = this.f47266f.iterator();
        while (it.hasNext()) {
            it.next().a(this, z10);
        }
        if (zI) {
            s();
        }
    }

    private boolean I() {
        boolean z10;
        if (!this.f47270j && this.f47273m != 0) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f47275o.size()) {
                    z10 = false;
                    break;
                }
                if (this.f47275o.get(i10).f47236b == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        boolean z11 = this.f47274n != z10;
        this.f47274n = z10;
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            u((List) message.obj);
        } else if (i10 == 1) {
            v(message.arg1, message.arg2);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            t((b) message.obj);
        }
        return true;
    }

    static com.google.android.exoplayer2.offline.e r(com.google.android.exoplayer2.offline.e eVar, DownloadRequest downloadRequest, int i10, long j10) {
        int i11;
        int i12 = eVar.f47236b;
        long j11 = (i12 == 5 || eVar.c()) ? j10 : eVar.f47237c;
        if (i12 == 5 || i12 == 7) {
            i11 = 7;
        } else {
            i11 = i10 != 0 ? 1 : 0;
        }
        return new com.google.android.exoplayer2.offline.e(eVar.f47235a.c(downloadRequest), i11, j11, j10, -1L, i10, 0);
    }

    private void s() {
        Iterator<d> it = this.f47266f.iterator();
        while (it.hasNext()) {
            it.next().e(this, this.f47274n);
        }
    }

    private void t(b bVar) {
        this.f47275o = Collections.unmodifiableList(bVar.f47279c);
        com.google.android.exoplayer2.offline.e eVar = bVar.f47277a;
        boolean zI = I();
        if (bVar.f47278b) {
            Iterator<d> it = this.f47266f.iterator();
            while (it.hasNext()) {
                it.next().g(this, eVar);
            }
        } else {
            Iterator<d> it2 = this.f47266f.iterator();
            while (it2.hasNext()) {
                it2.next().f(this, eVar, bVar.f47280d);
            }
        }
        if (zI) {
            s();
        }
    }

    private void u(List<com.google.android.exoplayer2.offline.e> list) {
        this.f47269i = true;
        this.f47275o = Collections.unmodifiableList(list);
        boolean zI = I();
        Iterator<d> it = this.f47266f.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        if (zI) {
            s();
        }
    }

    private void v(int i10, int i11) {
        this.f47267g -= i10;
        this.f47268h = i11;
        if (o()) {
            Iterator<d> it = this.f47266f.iterator();
            while (it.hasNext()) {
                it.next().c(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(RequirementsWatcher requirementsWatcher, int i10) {
        Requirements requirementsF = requirementsWatcher.f();
        if (this.f47273m != i10) {
            this.f47273m = i10;
            this.f47267g++;
            this.f47264d.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zI = I();
        Iterator<d> it = this.f47266f.iterator();
        while (it.hasNext()) {
            it.next().b(this, requirementsF, i10);
        }
        if (zI) {
            s();
        }
    }

    public void A(String str) {
        this.f47267g++;
        this.f47264d.obtainMessage(7, str).sendToTarget();
    }

    public void B(d dVar) {
        this.f47266f.remove(dVar);
    }

    public void C() {
        D(false);
    }

    public void E(@androidx.annotation.f0(from = 1) int i10) {
        com.google.android.exoplayer2.util.a.a(i10 > 0);
        if (this.f47271k == i10) {
            return;
        }
        this.f47271k = i10;
        this.f47267g++;
        this.f47264d.obtainMessage(4, i10, 0).sendToTarget();
    }

    public void F(int i10) {
        com.google.android.exoplayer2.util.a.a(i10 >= 0);
        if (this.f47272l == i10) {
            return;
        }
        this.f47272l = i10;
        this.f47267g++;
        this.f47264d.obtainMessage(5, i10, 0).sendToTarget();
    }

    public void G(Requirements requirements) {
        if (requirements.equals(this.f47276p.f())) {
            return;
        }
        this.f47276p.j();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.f47261a, this.f47265e, requirements);
        this.f47276p = requirementsWatcher;
        w(this.f47276p, requirementsWatcher.i());
    }

    public void H(@p0 String str, int i10) {
        this.f47267g++;
        this.f47264d.obtainMessage(3, i10, 0, str).sendToTarget();
    }

    public void c(DownloadRequest downloadRequest) {
        d(downloadRequest, 0);
    }

    public void d(DownloadRequest downloadRequest, int i10) {
        this.f47267g++;
        this.f47264d.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
    }

    public void e(d dVar) {
        com.google.android.exoplayer2.util.a.g(dVar);
        this.f47266f.add(dVar);
    }

    public Looper f() {
        return this.f47263c.getLooper();
    }

    public List<com.google.android.exoplayer2.offline.e> g() {
        return this.f47275o;
    }

    public o h() {
        return this.f47262b;
    }

    public boolean i() {
        return this.f47270j;
    }

    public int j() {
        return this.f47271k;
    }

    public int k() {
        return this.f47272l;
    }

    public int l() {
        return this.f47273m;
    }

    public Requirements m() {
        return this.f47276p.f();
    }

    public boolean o() {
        return this.f47268h == 0 && this.f47267g == 0;
    }

    public boolean p() {
        return this.f47269i;
    }

    public boolean q() {
        return this.f47274n;
    }

    public void x() {
        D(true);
    }

    public void y() {
        synchronized (this.f47264d) {
            c cVar = this.f47264d;
            if (cVar.f47282a) {
                return;
            }
            cVar.sendEmptyMessage(12);
            boolean z10 = false;
            while (true) {
                c cVar2 = this.f47264d;
                if (cVar2.f47282a) {
                    break;
                }
                try {
                    cVar2.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            this.f47263c.removeCallbacksAndMessages(null);
            this.f47275o = Collections.emptyList();
            this.f47267g = 0;
            this.f47268h = 0;
            this.f47269i = false;
            this.f47273m = 0;
            this.f47274n = false;
        }
    }

    public void z() {
        this.f47267g++;
        this.f47264d.obtainMessage(8).sendToTarget();
    }
}
