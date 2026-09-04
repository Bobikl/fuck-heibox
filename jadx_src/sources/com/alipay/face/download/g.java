package com.alipay.face.download;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: BioResManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class g {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    private static g D = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f38724p = "BioResManager";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f38725q = "bio";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f38726r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f38727s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f38728t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f38729u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f38730v = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f38731w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f38732x = 5;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f38733y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f38734z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f38737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f38738d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f38740f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38748n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.alipay.face.download.a f38735a = new com.alipay.face.download.impl.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Lock f38739e = new ReentrantLock();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.alipay.face.download.b> f38741g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<com.alipay.face.download.b> f38742h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<com.alipay.face.download.b> f38743i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f38744j = new com.alipay.face.download.impl.c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<f.a> f38745k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private f.b f38746l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h f38747m = new com.alipay.face.download.impl.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f38749o = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: BioResManager.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f38750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f38751c;

        a(Context context, i iVar) {
            this.f38750b = context;
            this.f38751c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.q(this.f38750b, this.f38751c, null);
        }
    }

    /* JADX INFO: compiled from: BioResManager.java */
    public class b implements f.b {
        b() {
        }

        @Override // com.alipay.face.download.f.b
        public void a(f.a aVar, int i10, String str) {
            synchronized (g.this.f38739e) {
                g.this.f38745k.remove(aVar);
                g.this.f38741g.remove(aVar.b());
                g.this.f38742h.add(aVar.b());
                g.this.f38738d.obtainMessage(4, 2, i10, str).sendToTarget();
                if (g.this.f38745k.size() == 0) {
                    g.this.f38748n = -1;
                }
            }
        }

        @Override // com.alipay.face.download.f.b
        public void b(f.a aVar) {
            synchronized (g.this.f38739e) {
                g.this.f38745k.remove(aVar);
                g.this.f38738d.obtainMessage(2, aVar.b().getFileName()).sendToTarget();
                g.this.f38741g.remove(aVar.b());
                g.this.f38743i.add(aVar.b());
                if (g.this.f38745k.size() == 0) {
                    if (g.this.f38742h.isEmpty()) {
                        g.this.f38748n = 3;
                    } else {
                        g.this.f38748n = -1;
                    }
                    g.this.f38738d.obtainMessage(3).sendToTarget();
                }
            }
        }

        @Override // com.alipay.face.download.f.b
        public void c(f.a aVar, long j10, long j11) {
        }

        @Override // com.alipay.face.download.f.b
        public void d(f.a aVar) {
            g.this.f38738d.obtainMessage(1, aVar.b().getFileName()).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: BioResManager.java */
    public interface c {
        void a();

        void b(int i10, int i11, String str);

        void c();

        void d(String str);

        void e(String str);
    }

    /* JADX INFO: compiled from: BioResManager.java */
    public static class d extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f38754b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f38755c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f38756d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f38757e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f38758f = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<g> f38759a;

        public d(g gVar, Looper looper) {
            super(looper);
            this.f38759a = new WeakReference<>(gVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            g gVar = this.f38759a.get();
            if (gVar == null) {
                return;
            }
            gVar.p(message);
        }
    }

    private g() {
        HandlerThread handlerThread = new HandlerThread(f38724p);
        this.f38737c = handlerThread;
        handlerThread.start();
        this.f38738d = new d(this, this.f38737c.getLooper());
        com.alipay.face.download.impl.b bVar = new com.alipay.face.download.impl.b();
        this.f38740f = bVar;
        if (bVar.c()) {
            this.f38748n = 5;
        } else {
            this.f38748n = 0;
        }
    }

    public static i k(Context context) {
        byte[] bArrI = d4.c.i(context, "bio_res.json");
        if (bArrI != null) {
            return i.a(new String(bArrI));
        }
        return null;
    }

    public static g m() {
        if (D == null) {
            synchronized (g.class) {
                if (D == null) {
                    D = new g();
                }
            }
        }
        return D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Message message) {
        String str;
        int i10 = message.what;
        if (i10 == 0) {
            Iterator<c> it = this.f38749o.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            return;
        }
        if (i10 == 1) {
            Object obj = message.obj;
            str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Iterator<c> it2 = this.f38749o.iterator();
                while (it2.hasNext()) {
                    it2.next().d(str);
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            Object obj2 = message.obj;
            str = obj2 instanceof String ? (String) obj2 : null;
            if (str != null) {
                Iterator<c> it3 = this.f38749o.iterator();
                while (it3.hasNext()) {
                    it3.next().e(str);
                }
                return;
            }
            return;
        }
        if (i10 == 3) {
            Iterator<c> it4 = this.f38749o.iterator();
            while (it4.hasNext()) {
                it4.next().a();
            }
        } else {
            if (i10 != 4) {
                return;
            }
            Object obj3 = message.obj;
            str = obj3 instanceof String ? (String) obj3 : null;
            Iterator<c> it5 = this.f38749o.iterator();
            while (it5.hasNext()) {
                it5.next().b(message.arg1, message.arg2, str);
            }
        }
    }

    public void i() {
        ArrayList arrayList = new ArrayList();
        this.f38739e.lock();
        try {
            if (this.f38748n != 2) {
                this.f38739e.unlock();
                return;
            }
            arrayList.addAll(this.f38745k);
            this.f38745k.clear();
            this.f38748n = 0;
            this.f38739e.unlock();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f.a) it.next()).cancel();
            }
        } catch (Throwable th2) {
            this.f38739e.unlock();
            throw th2;
        }
    }

    public void j() {
        i();
        this.f38744j.destroy();
    }

    public com.alipay.face.download.a l() {
        return this.f38735a;
    }

    public String n(Context context) {
        return new File(context.getFilesDir(), f38725q).getAbsolutePath();
    }

    public int o() {
        this.f38739e.lock();
        try {
            return this.f38748n;
        } finally {
            this.f38739e.unlock();
        }
    }

    public int q(Context context, i iVar, c cVar) {
        if (cVar != null) {
            s(cVar);
        }
        if (context != null) {
            this.f38736b = context.getApplicationContext();
        }
        this.f38740f.a(context, n(context));
        this.f38744j.init(context);
        this.f38739e.lock();
        try {
            if (iVar == null) {
                int i10 = this.f38748n;
                this.f38739e.unlock();
                return i10;
            }
            if (this.f38748n != 0) {
                Log.d(f38724p, "init called after inited");
                int i11 = this.f38748n;
                this.f38739e.unlock();
                return i11;
            }
            this.f38741g.clear();
            this.f38742h.clear();
            if (this.f38740f.c()) {
                this.f38748n = 5;
            } else {
                int iB = this.f38740f.b(context, iVar, this.f38741g, this.f38743i);
                if (iB > 0) {
                    this.f38748n = 1;
                } else if (iB == 0) {
                    this.f38748n = 3;
                } else if (iB == -2) {
                    Log.e(f38724p, "failed to stat file when check res");
                    this.f38738d.obtainMessage(4, 1, iB, "failed to stat file when check res").sendToTarget();
                }
            }
            this.f38739e.unlock();
            this.f38738d.obtainMessage(0).sendToTarget();
            return this.f38748n;
        } catch (Throwable th2) {
            this.f38739e.unlock();
            throw th2;
        }
    }

    public void r(Context context, i iVar, c cVar) {
        if (cVar != null) {
            s(cVar);
        }
        this.f38738d.post(new a(context, iVar));
    }

    public void s(c cVar) {
        synchronized (this.f38739e) {
            if (!this.f38749o.contains(cVar)) {
                this.f38749o.add(cVar);
            }
        }
    }

    public void t() {
        this.f38739e.lock();
        try {
            if (this.f38748n == -1) {
                this.f38748n = 0;
                this.f38745k.clear();
            }
        } finally {
            this.f38739e.unlock();
        }
    }

    public f u(f fVar) {
        f fVar2;
        synchronized (g.class) {
            if (this.f38748n == 2) {
                throw new IllegalStateException("cannot change downloader while downloading");
            }
            fVar2 = this.f38744j;
            this.f38744j = fVar;
        }
        return fVar2;
    }

    public void v() {
        Log.d(f38724p, "startDownload() called");
        this.f38739e.lock();
        try {
            if (this.f38748n == 1) {
                for (com.alipay.face.download.b bVar : this.f38741g) {
                    f.a aVarA = this.f38744j.a(this.f38736b, bVar, this.f38746l);
                    if (aVarA == null) {
                        Log.e(f38724p, "start download failed for file " + bVar);
                        this.f38742h.add(bVar);
                    } else {
                        Log.e(f38724p, "start download requested for file " + bVar);
                        this.f38745k.add(aVarA);
                    }
                }
            } else {
                Log.e(f38724p, "startDownload called in status " + this.f38748n);
            }
            this.f38739e.unlock();
        } catch (Throwable th2) {
            this.f38739e.unlock();
            throw th2;
        }
    }

    public boolean w() {
        Log.d(f38724p, "startLoading() called");
        ArrayList<com.alipay.face.download.b> arrayList = new ArrayList();
        this.f38739e.lock();
        try {
            int i10 = this.f38748n;
            if (i10 != 5) {
                if (i10 == 3) {
                    this.f38748n = 4;
                    try {
                        arrayList.addAll(this.f38743i);
                        boolean z10 = true;
                        for (com.alipay.face.download.b bVar : arrayList) {
                            if (this.f38747m.a(bVar) && !this.f38747m.b(bVar)) {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            this.f38748n = 5;
                        } else {
                            this.f38748n = -1;
                        }
                    } catch (Throwable th2) {
                        if (this.f38748n == 4) {
                            this.f38748n = -1;
                        }
                        throw th2;
                    }
                }
                this.f38739e.unlock();
                return false;
            }
            this.f38739e.unlock();
            return true;
        } catch (Throwable th3) {
            this.f38739e.unlock();
            throw th3;
        }
    }

    public void x(c cVar) {
        synchronized (this.f38739e) {
            this.f38749o.remove(cVar);
        }
    }
}
