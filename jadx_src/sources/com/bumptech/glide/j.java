package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.b0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.r;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class j implements ComponentCallbacks2, com.bumptech.glide.manager.k, g<i<Drawable>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f40798n = com.bumptech.glide.request.h.k1(Bitmap.class).q0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f40799o = com.bumptech.glide.request.h.k1(com.bumptech.glide.load.resource.gif.c.class).q0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.bumptech.glide.request.h f40800p = com.bumptech.glide.request.h.l1(com.bumptech.glide.load.engine.h.f41154c).H0(Priority.LOW).Q0(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Glide f40801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f40802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final com.bumptech.glide.manager.j f40803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("this")
    private final p f40804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b0("this")
    private final o f40805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b0("this")
    private final r f40806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f40807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.manager.b f40808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<com.bumptech.glide.request.g<Object>> f40809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @b0("this")
    private com.bumptech.glide.request.h f40810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40812m;

    /* JADX INFO: compiled from: RequestManager.java */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f40803d.c(jVar);
        }
    }

    /* JADX INFO: compiled from: RequestManager.java */
    public static class b extends com.bumptech.glide.request.target.f<View, Object> {
        b(@n0 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.f
        protected void f(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onLoadFailed(@p0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void onResourceReady(@n0 Object obj, @p0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }
    }

    /* JADX INFO: compiled from: RequestManager.java */
    public class c implements com.bumptech.glide.manager.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b0("RequestManager.this")
        private final p f40814a;

        c(p pVar) {
            this.f40814a = pVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (j.this) {
                    this.f40814a.g();
                }
            }
        }
    }

    public j(@n0 Glide glide, @n0 com.bumptech.glide.manager.j jVar, @n0 o oVar, @n0 Context context) {
        this(glide, jVar, oVar, new p(), glide.i(), context);
    }

    j(Glide glide, com.bumptech.glide.manager.j jVar, o oVar, p pVar, com.bumptech.glide.manager.c cVar, Context context) {
        this.f40806g = new r();
        a aVar = new a();
        this.f40807h = aVar;
        this.f40801b = glide;
        this.f40803d = jVar;
        this.f40805f = oVar;
        this.f40804e = pVar;
        this.f40802c = context;
        com.bumptech.glide.manager.b bVarA = cVar.a(context.getApplicationContext(), new c(pVar));
        this.f40808i = bVarA;
        glide.w(this);
        if (com.bumptech.glide.util.o.u()) {
            com.bumptech.glide.util.o.y(aVar);
        } else {
            jVar.c(this);
        }
        jVar.c(bVarA);
        this.f40809j = new CopyOnWriteArrayList<>(glide.k().c());
        Q(glide.k().d());
    }

    private void T(@n0 com.bumptech.glide.request.target.p<?> pVar) {
        boolean zS = S(pVar);
        com.bumptech.glide.request.e request = pVar.getRequest();
        if (zS || this.f40801b.x(pVar) || request == null) {
            return;
        }
        pVar.setRequest(null);
        request.clear();
    }

    private synchronized void U(@n0 com.bumptech.glide.request.h hVar) {
        this.f40810k = this.f40810k.i(hVar);
    }

    private synchronized void s() {
        Iterator<com.bumptech.glide.request.target.p<?>> it = this.f40806g.b().iterator();
        while (it.hasNext()) {
            q(it.next());
        }
        this.f40806g.a();
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i<Drawable> c(@p0 Drawable drawable) {
        return m().c(drawable);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i<Drawable> e(@p0 Uri uri) {
        return m().e(uri);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public i<Drawable> b(@p0 File file) {
        return m().b(file);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public i<Drawable> h(@u0 @v @p0 Integer num) {
        return m().h(num);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public i<Drawable> d(@p0 Object obj) {
        return m().d(obj);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public i<Drawable> load(@p0 String str) {
        return m().load(str);
    }

    @Override // com.bumptech.glide.g
    @androidx.annotation.j
    @Deprecated
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public i<Drawable> a(@p0 URL url) {
        return m().a(url);
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public i<Drawable> f(@p0 byte[] bArr) {
        return m().f(bArr);
    }

    public synchronized void I() {
        this.f40804e.e();
    }

    public synchronized void J() {
        I();
        Iterator<j> it = this.f40805f.a().iterator();
        while (it.hasNext()) {
            it.next().I();
        }
    }

    public synchronized void K() {
        this.f40804e.f();
    }

    public synchronized void L() {
        K();
        Iterator<j> it = this.f40805f.a().iterator();
        while (it.hasNext()) {
            it.next().K();
        }
    }

    public synchronized void M() {
        this.f40804e.h();
    }

    public synchronized void N() {
        com.bumptech.glide.util.o.b();
        M();
        Iterator<j> it = this.f40805f.a().iterator();
        while (it.hasNext()) {
            it.next().M();
        }
    }

    @n0
    public synchronized j O(@n0 com.bumptech.glide.request.h hVar) {
        Q(hVar);
        return this;
    }

    public void P(boolean z10) {
        this.f40811l = z10;
    }

    protected synchronized void Q(@n0 com.bumptech.glide.request.h hVar) {
        this.f40810k = hVar.clone().j();
    }

    synchronized void R(@n0 com.bumptech.glide.request.target.p<?> pVar, @n0 com.bumptech.glide.request.e eVar) {
        this.f40806g.c(pVar);
        this.f40804e.i(eVar);
    }

    synchronized boolean S(@n0 com.bumptech.glide.request.target.p<?> pVar) {
        com.bumptech.glide.request.e request = pVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f40804e.b(request)) {
            return false;
        }
        this.f40806g.d(pVar);
        pVar.setRequest(null);
        return true;
    }

    public j i(com.bumptech.glide.request.g<Object> gVar) {
        this.f40809j.add(gVar);
        return this;
    }

    @n0
    public synchronized j j(@n0 com.bumptech.glide.request.h hVar) {
        U(hVar);
        return this;
    }

    @n0
    @androidx.annotation.j
    public <ResourceType> i<ResourceType> k(@n0 Class<ResourceType> cls) {
        return new i<>(this.f40801b, this, cls, this.f40802c);
    }

    @n0
    @androidx.annotation.j
    public i<Bitmap> l() {
        return k(Bitmap.class).i(f40798n);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> m() {
        return k(Drawable.class);
    }

    @n0
    @androidx.annotation.j
    public i<File> n() {
        return k(File.class).i(com.bumptech.glide.request.h.F1(true));
    }

    @n0
    @androidx.annotation.j
    public i<com.bumptech.glide.load.resource.gif.c> o() {
        return k(com.bumptech.glide.load.resource.gif.c.class).i(f40799o);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onDestroy() {
        this.f40806g.onDestroy();
        s();
        this.f40804e.c();
        this.f40803d.b(this);
        this.f40803d.b(this.f40808i);
        com.bumptech.glide.util.o.z(this.f40807h);
        this.f40801b.C(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStart() {
        M();
        this.f40806g.onStart();
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStop() {
        this.f40806g.onStop();
        if (this.f40812m) {
            s();
        } else {
            K();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f40811l) {
            J();
        }
    }

    public void p(@n0 View view) {
        q(new b(view));
    }

    public void q(@p0 com.bumptech.glide.request.target.p<?> pVar) {
        if (pVar == null) {
            return;
        }
        T(pVar);
    }

    @n0
    public synchronized j r() {
        this.f40812m = true;
        return this;
    }

    @n0
    @androidx.annotation.j
    public i<File> t(@p0 Object obj) {
        return u().d(obj);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f40804e + ", treeNode=" + this.f40805f + z5.g.f141884d;
    }

    @n0
    @androidx.annotation.j
    public i<File> u() {
        return k(File.class).i(f40800p);
    }

    List<com.bumptech.glide.request.g<Object>> v() {
        return this.f40809j;
    }

    synchronized com.bumptech.glide.request.h w() {
        return this.f40810k;
    }

    @n0
    <T> k<?, T> x(Class<T> cls) {
        return this.f40801b.k().e(cls);
    }

    public synchronized boolean y() {
        return this.f40804e.d();
    }

    @Override // com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public i<Drawable> g(@p0 Bitmap bitmap) {
        return m().g(bitmap);
    }
}
