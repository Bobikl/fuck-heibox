package com.github.penfeizhou.animation.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.k1;
import androidx.annotation.p0;
import com.github.penfeizhou.animation.io.e;
import com.github.penfeizhou.animation.io.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FrameSeqDecoder<R extends com.github.penfeizhou.animation.io.e, W extends com.github.penfeizhou.animation.io.g> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f43239u = "FrameSeqDecoder";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Rect f43240v = new Rect();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f43241w = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.github.penfeizhou.animation.loader.d f43243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f43244c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43247f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ByteBuffer f43256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected volatile Rect f43257p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List<com.github.penfeizhou.animation.decode.a> f43245d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f43246e = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f43248g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set<i> f43249h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f43250i = new AtomicBoolean(true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f43251j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f43252k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Set<Bitmap> f43253l = new HashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f43254m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Map<Bitmap, Canvas> f43255n = new WeakHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private W f43258q = (W) z();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private R f43259r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f43260s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile State f43261t = State.IDLE;

    public enum State {
        IDLE,
        RUNNING,
        INITIALIZING,
        FINISHING
    }

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FrameSeqDecoder.this.f43250i.get()) {
                return;
            }
            if (!FrameSeqDecoder.this.n()) {
                FrameSeqDecoder.this.S();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            FrameSeqDecoder.this.f43244c.postDelayed(this, Math.max(0L, FrameSeqDecoder.this.R() - (System.currentTimeMillis() - jCurrentTimeMillis)));
            Iterator it = FrameSeqDecoder.this.f43249h.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(FrameSeqDecoder.this.f43256o);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f43263b;

        b(i iVar) {
            this.f43263b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.f43249h.add(this.f43263b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f43265b;

        c(i iVar) {
            this.f43265b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.f43249h.remove(this.f43265b);
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FrameSeqDecoder.this.f43249h.size() == 0) {
                FrameSeqDecoder.this.S();
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Thread f43268b;

        e(Thread thread) {
            this.f43268b = thread;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (FrameSeqDecoder.this.f43257p == null) {
                        if (FrameSeqDecoder.this.f43259r == null) {
                            FrameSeqDecoder frameSeqDecoder = FrameSeqDecoder.this;
                            frameSeqDecoder.f43259r = frameSeqDecoder.x(frameSeqDecoder.f43243b.a());
                        } else {
                            FrameSeqDecoder.this.f43259r.reset();
                        }
                        FrameSeqDecoder frameSeqDecoder2 = FrameSeqDecoder.this;
                        frameSeqDecoder2.A(frameSeqDecoder2.H(frameSeqDecoder2.f43259r));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    FrameSeqDecoder.this.f43257p = FrameSeqDecoder.f43240v;
                }
            } finally {
                LockSupport.unpark(this.f43268b);
            }
        }
    }

    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.B();
        }
    }

    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.C();
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43272b;

        h(boolean z10) {
            this.f43272b = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            FrameSeqDecoder.this.C();
            try {
                FrameSeqDecoder frameSeqDecoder = FrameSeqDecoder.this;
                frameSeqDecoder.A(frameSeqDecoder.H(frameSeqDecoder.x(frameSeqDecoder.f43243b.a())));
                if (this.f43272b) {
                    FrameSeqDecoder.this.B();
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
    }

    public interface i {
        void a(ByteBuffer byteBuffer);

        void d();

        void onStart();
    }

    public FrameSeqDecoder(com.github.penfeizhou.animation.loader.d dVar, @p0 i iVar) {
        this.f43243b = dVar;
        if (iVar != null) {
            this.f43249h.add(iVar);
        }
        int iA = com.github.penfeizhou.animation.executor.a.b().a();
        this.f43242a = iA;
        this.f43244c = new Handler(com.github.penfeizhou.animation.executor.a.b().c(iA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Rect rect) {
        this.f43257p = rect;
        int iWidth = rect.width() * rect.height();
        int i10 = this.f43252k;
        this.f43256o = ByteBuffer.allocate(((iWidth / (i10 * i10)) + 1) * 4);
        if (this.f43258q == null) {
            this.f43258q = (W) z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @k1
    public void B() {
        this.f43250i.compareAndSet(true, false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f43245d.size() == 0) {
                try {
                    R r10 = this.f43259r;
                    if (r10 == null) {
                        this.f43259r = (R) x(this.f43243b.a());
                    } else {
                        r10.reset();
                    }
                    A(H(this.f43259r));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            String str = f43239u;
            Log.i(str, o() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f43261t = State.RUNNING;
            if (w() != 0 && this.f43260s) {
                Log.i(str, o() + " No need to started");
                return;
            }
            this.f43246e = -1;
            this.f43251j.run();
            Iterator<i> it = this.f43249h.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        } catch (Throwable th3) {
            Log.i(f43239u, o() + " Set state to RUNNING,cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
            this.f43261t = State.RUNNING;
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @k1
    public void C() {
        this.f43244c.removeCallbacks(this.f43251j);
        this.f43245d.clear();
        synchronized (this.f43254m) {
            for (Bitmap bitmap : this.f43253l) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            this.f43253l.clear();
        }
        if (this.f43256o != null) {
            this.f43256o = null;
        }
        this.f43255n.clear();
        try {
            R r10 = this.f43259r;
            if (r10 != null) {
                r10.close();
                this.f43259r = null;
            }
            W w10 = this.f43258q;
            if (w10 != null) {
                w10.close();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        J();
        this.f43261t = State.IDLE;
        Iterator<i> it = this.f43249h.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @k1
    public long R() {
        int i10 = this.f43246e + 1;
        this.f43246e = i10;
        if (i10 >= t()) {
            this.f43246e = 0;
            this.f43247f++;
        }
        com.github.penfeizhou.animation.decode.a aVarR = r(this.f43246e);
        if (aVarR == null) {
            return 0L;
        }
        L(aVarR);
        return aVarR.f43279f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        if (!E() || this.f43245d.size() == 0) {
            return false;
        }
        if (w() <= 0 || this.f43247f < w() - 1) {
            return true;
        }
        if (this.f43247f == w() - 1 && this.f43246e < t() - 1) {
            return true;
        }
        this.f43260s = true;
        return false;
    }

    private String o() {
        return "";
    }

    private com.github.penfeizhou.animation.decode.a r(int i10) {
        if (i10 < 0 || i10 >= this.f43245d.size()) {
            return null;
        }
        return this.f43245d.get(i10);
    }

    private int t() {
        return this.f43245d.size();
    }

    private int w() {
        Integer num = this.f43248g;
        return num != null ? num.intValue() : u();
    }

    public boolean D() {
        return this.f43250i.get();
    }

    public boolean E() {
        return this.f43261t == State.RUNNING || this.f43261t == State.INITIALIZING;
    }

    protected Bitmap F(int i10, int i11) {
        synchronized (this.f43254m) {
            Bitmap bitmapCreateBitmap = null;
            Iterator<Bitmap> it = this.f43253l.iterator();
            while (it.hasNext()) {
                int i12 = i10 * i11 * 4;
                Bitmap next = it.next();
                if (next != null && next.getAllocationByteCount() >= i12) {
                    it.remove();
                    if (next.getWidth() != i10 || next.getHeight() != i11) {
                        next.reconfigure(i10, i11, Bitmap.Config.ARGB_8888);
                    }
                    next.eraseColor(0);
                    return next;
                }
                bitmapCreateBitmap = next;
            }
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError e10) {
                e10.printStackTrace();
            }
            return bitmapCreateBitmap;
        }
    }

    public void G() {
        this.f43244c.removeCallbacks(this.f43251j);
        this.f43250i.compareAndSet(false, true);
    }

    protected abstract Rect H(R r10) throws IOException;

    protected void I(Bitmap bitmap) {
        synchronized (this.f43254m) {
            if (bitmap != null) {
                if (!this.f43253l.contains(bitmap)) {
                    this.f43253l.add(bitmap);
                }
            }
        }
    }

    protected abstract void J();

    public void K(i iVar) {
        this.f43244c.post(new c(iVar));
    }

    protected abstract void L(com.github.penfeizhou.animation.decode.a aVar);

    public void M() {
        this.f43247f = 0;
        this.f43246e = -1;
        this.f43260s = false;
    }

    public void N() {
        this.f43250i.compareAndSet(true, false);
        this.f43244c.removeCallbacks(this.f43251j);
        this.f43244c.post(this.f43251j);
    }

    public boolean O(int i10, int i11) {
        int iQ = q(i10, i11);
        if (iQ == this.f43252k) {
            return false;
        }
        this.f43252k = iQ;
        boolean zE = E();
        this.f43244c.removeCallbacks(this.f43251j);
        this.f43244c.post(new h(zE));
        return true;
    }

    public void P(int i10) {
        this.f43248g = Integer.valueOf(i10);
    }

    public void Q() {
        if (this.f43257p == f43240v) {
            return;
        }
        if (this.f43261t != State.RUNNING) {
            State state = this.f43261t;
            State state2 = State.INITIALIZING;
            if (state != state2) {
                if (this.f43261t == State.FINISHING) {
                    Log.e(f43239u, o() + " Processing,wait for finish at " + this.f43261t);
                }
                this.f43261t = state2;
                if (Looper.myLooper() == this.f43244c.getLooper()) {
                    B();
                    return;
                } else {
                    this.f43244c.post(new f());
                    return;
                }
            }
        }
        Log.i(f43239u, o() + " Already started");
    }

    public void S() {
        if (this.f43257p == f43240v) {
            return;
        }
        State state = this.f43261t;
        State state2 = State.FINISHING;
        if (state == state2 || this.f43261t == State.IDLE) {
            Log.i(f43239u, o() + "No need to stop");
            return;
        }
        if (this.f43261t == State.INITIALIZING) {
            Log.e(f43239u, o() + "Processing,wait for finish at " + this.f43261t);
        }
        this.f43261t = state2;
        if (Looper.myLooper() == this.f43244c.getLooper()) {
            C();
        } else {
            this.f43244c.post(new g());
        }
    }

    public void T() {
        this.f43244c.post(new d());
    }

    public void m(i iVar) {
        this.f43244c.post(new b(iVar));
    }

    public Rect p() {
        if (this.f43257p == null) {
            if (this.f43261t == State.FINISHING) {
                Log.e(f43239u, "In finishing,do not interrupt");
            }
            Thread threadCurrentThread = Thread.currentThread();
            this.f43244c.post(new e(threadCurrentThread));
            LockSupport.park(threadCurrentThread);
        }
        return this.f43257p;
    }

    protected int q(int i10, int i11) {
        int i12 = 1;
        if (i10 != 0 && i11 != 0) {
            int iMin = Math.min(p().width() / i10, p().height() / i11);
            while (true) {
                int i13 = i12 * 2;
                if (i13 > iMin) {
                    break;
                }
                i12 = i13;
            }
        }
        return i12;
    }

    public Bitmap s(int i10) throws IOException {
        if (this.f43261t != State.IDLE) {
            Log.e(f43239u, o() + ",stop first");
            return null;
        }
        this.f43261t = State.RUNNING;
        this.f43250i.compareAndSet(true, false);
        if (this.f43245d.size() == 0) {
            R r10 = this.f43259r;
            if (r10 == null) {
                this.f43259r = (R) x(this.f43243b.a());
            } else {
                r10.reset();
            }
            A(H(this.f43259r));
        }
        if (i10 < 0) {
            i10 += this.f43245d.size();
        }
        int i11 = i10 >= 0 ? i10 : 0;
        this.f43246e = -1;
        while (this.f43246e < i11 && n()) {
            R();
        }
        this.f43256o.rewind();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(p().width() / y(), p().height() / y(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(this.f43256o);
        C();
        return bitmapCreateBitmap;
    }

    protected abstract int u();

    public int v() {
        int iCapacity;
        synchronized (this.f43254m) {
            iCapacity = 0;
            for (Bitmap bitmap : this.f43253l) {
                if (!bitmap.isRecycled()) {
                    iCapacity += bitmap.getAllocationByteCount();
                }
            }
            ByteBuffer byteBuffer = this.f43256o;
            if (byteBuffer != null) {
                iCapacity += byteBuffer.capacity();
            }
        }
        return iCapacity;
    }

    protected abstract R x(com.github.penfeizhou.animation.io.e eVar);

    public int y() {
        return this.f43252k;
    }

    protected abstract W z();
}
