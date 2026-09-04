package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class SingleRequest<R> implements e, o, i {
    private static final String F = "Glide";

    @b0("requestLock")
    private int A;

    @b0("requestLock")
    private int B;

    @b0("requestLock")
    private boolean C;

    @p0
    private RuntimeException D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final String f41808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f41809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f41810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final g<R> f41811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RequestCoordinator f41812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f41813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f41814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final Object f41815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Class<R> f41816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a<?> f41817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f41818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f41819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Priority f41820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p<R> f41821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private final List<g<R>> f41822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.bumptech.glide.request.transition.g<? super R> f41823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Executor f41824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b0("requestLock")
    private s<R> f41825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b0("requestLock")
    private com.bumptech.glide.load.engine.i.d f41826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @b0("requestLock")
    private long f41827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.i f41828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @b0("requestLock")
    private Status f41829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @b0("requestLock")
    @p0
    private Drawable f41830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @b0("requestLock")
    @p0
    private Drawable f41831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @b0("requestLock")
    @p0
    private Drawable f41832z;
    private static final String E = "GlideRequest";
    private static final boolean G = Log.isLoggable(E, 2);

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private SingleRequest(Context context, com.bumptech.glide.d dVar, @n0 Object obj, @p0 Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, Priority priority, p<R> pVar, @p0 g<R> gVar, @p0 List<g<R>> list, RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.i iVar, com.bumptech.glide.request.transition.g<? super R> gVar2, Executor executor) {
        this.f41808b = G ? String.valueOf(super.hashCode()) : null;
        this.f41809c = com.bumptech.glide.util.pool.c.a();
        this.f41810d = obj;
        this.f41813g = context;
        this.f41814h = dVar;
        this.f41815i = obj2;
        this.f41816j = cls;
        this.f41817k = aVar;
        this.f41818l = i10;
        this.f41819m = i11;
        this.f41820n = priority;
        this.f41821o = pVar;
        this.f41811e = gVar;
        this.f41822p = list;
        this.f41812f = requestCoordinator;
        this.f41828v = iVar;
        this.f41823q = gVar2;
        this.f41824r = executor;
        this.f41829w = Status.PENDING;
        if (this.D == null && dVar.g().b(com.bumptech.glide.c.d.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    @b0("requestLock")
    private void A() {
        if (k()) {
            Drawable drawableP = this.f41815i == null ? p() : null;
            if (drawableP == null) {
                drawableP = o();
            }
            if (drawableP == null) {
                drawableP = q();
            }
            this.f41821o.onLoadFailed(drawableP);
        }
    }

    @b0("requestLock")
    private void i() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @b0("requestLock")
    private boolean j() {
        RequestCoordinator requestCoordinator = this.f41812f;
        return requestCoordinator == null || requestCoordinator.i(this);
    }

    @b0("requestLock")
    private boolean k() {
        RequestCoordinator requestCoordinator = this.f41812f;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @b0("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f41812f;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @b0("requestLock")
    private void m() {
        i();
        this.f41809c.c();
        this.f41821o.removeCallback(this);
        com.bumptech.glide.load.engine.i.d dVar = this.f41826t;
        if (dVar != null) {
            dVar.a();
            this.f41826t = null;
        }
    }

    private void n(Object obj) {
        List<g<R>> list = this.f41822p;
        if (list == null) {
            return;
        }
        for (g<R> gVar : list) {
            if (gVar instanceof c) {
                ((c) gVar).c(obj);
            }
        }
    }

    @b0("requestLock")
    private Drawable o() {
        if (this.f41830x == null) {
            Drawable drawableG = this.f41817k.G();
            this.f41830x = drawableG;
            if (drawableG == null && this.f41817k.F() > 0) {
                this.f41830x = s(this.f41817k.F());
            }
        }
        return this.f41830x;
    }

    @b0("requestLock")
    private Drawable p() {
        if (this.f41832z == null) {
            Drawable drawableH = this.f41817k.H();
            this.f41832z = drawableH;
            if (drawableH == null && this.f41817k.J() > 0) {
                this.f41832z = s(this.f41817k.J());
            }
        }
        return this.f41832z;
    }

    @b0("requestLock")
    private Drawable q() {
        if (this.f41831y == null) {
            Drawable drawableQ = this.f41817k.Q();
            this.f41831y = drawableQ;
            if (drawableQ == null && this.f41817k.R() > 0) {
                this.f41831y = s(this.f41817k.R());
            }
        }
        return this.f41831y;
    }

    @b0("requestLock")
    private boolean r() {
        RequestCoordinator requestCoordinator = this.f41812f;
        return requestCoordinator == null || !requestCoordinator.getRoot().a();
    }

    @b0("requestLock")
    private Drawable s(@v int i10) {
        return com.bumptech.glide.load.resource.drawable.c.a(this.f41813g, i10, this.f41817k.X() != null ? this.f41817k.X() : this.f41813g.getTheme());
    }

    private void t(String str) {
        Log.v(E, str + " this: " + this.f41808b);
    }

    private static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    @b0("requestLock")
    private void v() {
        RequestCoordinator requestCoordinator = this.f41812f;
        if (requestCoordinator != null) {
            requestCoordinator.g(this);
        }
    }

    @b0("requestLock")
    private void w() {
        RequestCoordinator requestCoordinator = this.f41812f;
        if (requestCoordinator != null) {
            requestCoordinator.b(this);
        }
    }

    public static <R> SingleRequest<R> x(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, Priority priority, p<R> pVar, g<R> gVar, @p0 List<g<R>> list, RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.i iVar, com.bumptech.glide.request.transition.g<? super R> gVar2, Executor executor) {
        return new SingleRequest<>(context, dVar, obj, obj2, cls, aVar, i10, i11, priority, pVar, gVar, list, requestCoordinator, iVar, gVar2, executor);
    }

    private void y(GlideException glideException, int i10) {
        boolean zA;
        this.f41809c.c();
        synchronized (this.f41810d) {
            glideException.l(this.D);
            int iH = this.f41814h.h();
            if (iH <= i10) {
                Log.w(F, "Load failed for [" + this.f41815i + "] with dimensions [" + this.A + "x" + this.B + "]", glideException);
                if (iH <= 4) {
                    glideException.h(F);
                }
            }
            this.f41826t = null;
            this.f41829w = Status.FAILED;
            v();
            boolean z10 = true;
            this.C = true;
            try {
                List<g<R>> list = this.f41822p;
                if (list != null) {
                    Iterator<g<R>> it = list.iterator();
                    zA = false;
                    while (it.hasNext()) {
                        zA |= it.next().a(glideException, this.f41815i, this.f41821o, r());
                    }
                } else {
                    zA = false;
                }
                g<R> gVar = this.f41811e;
                if (gVar == null || !gVar.a(glideException, this.f41815i, this.f41821o, r())) {
                    z10 = false;
                }
                if (!(zA | z10)) {
                    A();
                }
                this.C = false;
                com.bumptech.glide.util.pool.b.g(E, this.f41807a);
            } catch (Throwable th2) {
                this.C = false;
                throw th2;
            }
        }
    }

    @b0("requestLock")
    private void z(s<R> sVar, R r10, DataSource dataSource, boolean z10) {
        boolean zD;
        boolean zR = r();
        this.f41829w = Status.COMPLETE;
        this.f41825s = sVar;
        if (this.f41814h.h() <= 3) {
            Log.d(F, "Finished loading " + r10.getClass().getSimpleName() + " from " + dataSource + " for " + this.f41815i + " with size [" + this.A + "x" + this.B + "] in " + com.bumptech.glide.util.i.a(this.f41827u) + " ms");
        }
        w();
        boolean z11 = true;
        this.C = true;
        try {
            List<g<R>> list = this.f41822p;
            if (list != null) {
                zD = false;
                for (g<R> gVar : list) {
                    boolean zB = zD | gVar.b(r10, this.f41815i, this.f41821o, dataSource, zR);
                    zD = gVar instanceof c ? ((c) gVar).d(r10, this.f41815i, this.f41821o, dataSource, zR, z10) | zB : zB;
                }
            } else {
                zD = false;
            }
            g<R> gVar2 = this.f41811e;
            if (gVar2 == null || !gVar2.b(r10, this.f41815i, this.f41821o, dataSource, zR)) {
                z11 = false;
            }
            if (!(zD | z11)) {
                this.f41821o.onResourceReady(r10, this.f41823q.a(dataSource, zR));
            }
            this.C = false;
            com.bumptech.glide.util.pool.b.g(E, this.f41807a);
        } catch (Throwable th2) {
            this.C = false;
            throw th2;
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean a() {
        boolean z10;
        synchronized (this.f41810d) {
            z10 = this.f41829w == Status.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.i
    public void b(GlideException glideException) {
        y(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.i
    public void c(s<?> sVar, DataSource dataSource, boolean z10) {
        this.f41809c.c();
        s<?> sVar2 = null;
        try {
            synchronized (this.f41810d) {
                try {
                    this.f41826t = null;
                    if (sVar == null) {
                        b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f41816j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = sVar.get();
                    try {
                        if (obj != null && this.f41816j.isAssignableFrom(obj.getClass())) {
                            if (l()) {
                                z(sVar, obj, dataSource, z10);
                                return;
                            }
                            this.f41825s = null;
                            this.f41829w = Status.COMPLETE;
                            com.bumptech.glide.util.pool.b.g(E, this.f41807a);
                            this.f41828v.l(sVar);
                            return;
                        }
                        this.f41825s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f41816j);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : "");
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(sVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        b(new GlideException(sb2.toString()));
                        this.f41828v.l(sVar);
                    } catch (Throwable th2) {
                        sVar2 = sVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (sVar2 != null) {
                this.f41828v.l(sVar2);
            }
            throw th4;
        }
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f41810d) {
            i();
            this.f41809c.c();
            Status status = this.f41829w;
            Status status2 = Status.CLEARED;
            if (status == status2) {
                return;
            }
            m();
            s<R> sVar = this.f41825s;
            if (sVar != null) {
                this.f41825s = null;
            } else {
                sVar = null;
            }
            if (j()) {
                this.f41821o.onLoadCleared(q());
            }
            com.bumptech.glide.util.pool.b.g(E, this.f41807a);
            this.f41829w = status2;
            if (sVar != null) {
                this.f41828v.l(sVar);
            }
        }
    }

    @Override // com.bumptech.glide.request.target.o
    public void d(int i10, int i11) throws Throwable {
        Object obj;
        this.f41809c.c();
        Object obj2 = this.f41810d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = G;
                    if (z10) {
                        t("Got onSizeReady in " + com.bumptech.glide.util.i.a(this.f41827u));
                    }
                    if (this.f41829w == Status.WAITING_FOR_SIZE) {
                        Status status = Status.RUNNING;
                        this.f41829w = status;
                        float fV = this.f41817k.V();
                        this.A = u(i10, fV);
                        this.B = u(i11, fV);
                        if (z10) {
                            t("finished setup for calling load in " + com.bumptech.glide.util.i.a(this.f41827u));
                        }
                        obj = obj2;
                        try {
                            this.f41826t = this.f41828v.g(this.f41814h, this.f41815i, this.f41817k.U(), this.A, this.B, this.f41817k.T(), this.f41816j, this.f41820n, this.f41817k.E(), this.f41817k.Y(), this.f41817k.n0(), this.f41817k.i0(), this.f41817k.M(), this.f41817k.g0(), this.f41817k.b0(), this.f41817k.Z(), this.f41817k.K(), this, this.f41824r);
                            if (this.f41829w != status) {
                                this.f41826t = null;
                            }
                            if (z10) {
                                t("finished onSizeReady in " + com.bumptech.glide.util.i.a(this.f41827u));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean e() {
        boolean z10;
        synchronized (this.f41810d) {
            z10 = this.f41829w == Status.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f(e eVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        Priority priority2;
        int size2;
        if (!(eVar instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f41810d) {
            i10 = this.f41818l;
            i11 = this.f41819m;
            obj = this.f41815i;
            cls = this.f41816j;
            aVar = this.f41817k;
            priority = this.f41820n;
            List<g<R>> list = this.f41822p;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) eVar;
        synchronized (singleRequest.f41810d) {
            i12 = singleRequest.f41818l;
            i13 = singleRequest.f41819m;
            obj2 = singleRequest.f41815i;
            cls2 = singleRequest.f41816j;
            aVar2 = singleRequest.f41817k;
            priority2 = singleRequest.f41820n;
            List<g<R>> list2 = singleRequest.f41822p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i10 == i12 && i11 == i13 && com.bumptech.glide.util.o.d(obj, obj2) && cls.equals(cls2) && com.bumptech.glide.util.o.c(aVar, aVar2) && priority == priority2 && size == size2;
    }

    @Override // com.bumptech.glide.request.i
    public Object g() {
        this.f41809c.c();
        return this.f41810d;
    }

    @Override // com.bumptech.glide.request.e
    public void h() {
        synchronized (this.f41810d) {
            i();
            this.f41809c.c();
            this.f41827u = com.bumptech.glide.util.i.b();
            Object obj = this.f41815i;
            if (obj == null) {
                if (com.bumptech.glide.util.o.x(this.f41818l, this.f41819m)) {
                    this.A = this.f41818l;
                    this.B = this.f41819m;
                }
                y(new GlideException("Received null model"), p() == null ? 5 : 3);
                return;
            }
            Status status = this.f41829w;
            Status status2 = Status.RUNNING;
            if (status == status2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (status == Status.COMPLETE) {
                c(this.f41825s, DataSource.MEMORY_CACHE, false);
                return;
            }
            n(obj);
            this.f41807a = com.bumptech.glide.util.pool.b.b(E);
            Status status3 = Status.WAITING_FOR_SIZE;
            this.f41829w = status3;
            if (com.bumptech.glide.util.o.x(this.f41818l, this.f41819m)) {
                d(this.f41818l, this.f41819m);
            } else {
                this.f41821o.getSize(this);
            }
            Status status4 = this.f41829w;
            if ((status4 == status2 || status4 == status3) && k()) {
                this.f41821o.onLoadStarted(q());
            }
            if (G) {
                t("finished run method in " + com.bumptech.glide.util.i.a(this.f41827u));
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f41810d) {
            z10 = this.f41829w == Status.COMPLETE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f41810d) {
            Status status = this.f41829w;
            z10 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.f41810d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f41810d) {
            obj = this.f41815i;
            cls = this.f41816j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
