package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.cache.l;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.util.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: GlideBuilder.java */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.i f40575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.e f40576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f40577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.j f40578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f40579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f40580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.a.InterfaceC0327a f40581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f40582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.manager.c f40583k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private n.b f40586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f40587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f40588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private List<com.bumptech.glide.request.g<Object>> f40589q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, k<?, ?>> f40573a = new androidx.collection.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.e.a f40574b = new com.bumptech.glide.e.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40584l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Glide.a f40585m = new a();

    /* JADX INFO: compiled from: GlideBuilder.java */
    public class a implements Glide.a {
        a() {
        }

        @Override // com.bumptech.glide.Glide.a
        @n0
        public com.bumptech.glide.request.h build() {
            return new com.bumptech.glide.request.h();
        }
    }

    /* JADX INFO: compiled from: GlideBuilder.java */
    public class b implements Glide.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.request.h f40591a;

        b(com.bumptech.glide.request.h hVar) {
            this.f40591a = hVar;
        }

        @Override // com.bumptech.glide.Glide.a
        @n0
        public com.bumptech.glide.request.h build() {
            com.bumptech.glide.request.h hVar = this.f40591a;
            return hVar != null ? hVar : new com.bumptech.glide.request.h();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class C0321c implements com.bumptech.glide.e.b {
        C0321c() {
        }
    }

    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class d implements com.bumptech.glide.e.b {
    }

    /* JADX INFO: compiled from: GlideBuilder.java */
    public static final class e implements com.bumptech.glide.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f40593a;

        e(int i10) {
            this.f40593a = i10;
        }
    }

    @n0
    public c a(@n0 com.bumptech.glide.request.g<Object> gVar) {
        if (this.f40589q == null) {
            this.f40589q = new ArrayList();
        }
        this.f40589q.add(gVar);
        return this;
    }

    @n0
    Glide b(@n0 Context context, List<y6.c> list, y6.a aVar) {
        if (this.f40579g == null) {
            this.f40579g = com.bumptech.glide.load.engine.executor.a.k();
        }
        if (this.f40580h == null) {
            this.f40580h = com.bumptech.glide.load.engine.executor.a.g();
        }
        if (this.f40587o == null) {
            this.f40587o = com.bumptech.glide.load.engine.executor.a.d();
        }
        if (this.f40582j == null) {
            this.f40582j = new l.a(context).a();
        }
        if (this.f40583k == null) {
            this.f40583k = new com.bumptech.glide.manager.e();
        }
        if (this.f40576d == null) {
            int iB = this.f40582j.b();
            if (iB > 0) {
                this.f40576d = new com.bumptech.glide.load.engine.bitmap_recycle.k(iB);
            } else {
                this.f40576d = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.f40577e == null) {
            this.f40577e = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.f40582j.a());
        }
        if (this.f40578f == null) {
            this.f40578f = new com.bumptech.glide.load.engine.cache.i(this.f40582j.d());
        }
        if (this.f40581i == null) {
            this.f40581i = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.f40575c == null) {
            this.f40575c = new com.bumptech.glide.load.engine.i(this.f40578f, this.f40581i, this.f40580h, this.f40579g, com.bumptech.glide.load.engine.executor.a.n(), this.f40587o, this.f40588p);
        }
        List<com.bumptech.glide.request.g<Object>> list2 = this.f40589q;
        if (list2 == null) {
            this.f40589q = Collections.emptyList();
        } else {
            this.f40589q = Collections.unmodifiableList(list2);
        }
        return new Glide(context, this.f40575c, this.f40578f, this.f40576d, this.f40577e, new n(this.f40586n), this.f40583k, this.f40584l, this.f40585m, this.f40573a, this.f40589q, list, aVar, this.f40574b.c());
    }

    @n0
    public c c(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f40587o = aVar;
        return this;
    }

    @n0
    public c d(@p0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f40577e = bVar;
        return this;
    }

    @n0
    public c e(@p0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f40576d = eVar;
        return this;
    }

    @n0
    public c f(@p0 com.bumptech.glide.manager.c cVar) {
        this.f40583k = cVar;
        return this;
    }

    @n0
    public c g(@n0 Glide.a aVar) {
        this.f40585m = (Glide.a) m.e(aVar);
        return this;
    }

    @n0
    public c h(@p0 com.bumptech.glide.request.h hVar) {
        return g(new b(hVar));
    }

    @n0
    public <T> c i(@n0 Class<T> cls, @p0 k<?, T> kVar) {
        this.f40573a.put(cls, kVar);
        return this;
    }

    @Deprecated
    public c j(boolean z10) {
        return this;
    }

    @n0
    public c k(@p0 com.bumptech.glide.load.engine.cache.a.InterfaceC0327a interfaceC0327a) {
        this.f40581i = interfaceC0327a;
        return this;
    }

    @n0
    public c l(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f40580h = aVar;
        return this;
    }

    c m(com.bumptech.glide.load.engine.i iVar) {
        this.f40575c = iVar;
        return this;
    }

    public c n(boolean z10) {
        this.f40574b.d(new C0321c(), z10 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @n0
    public c o(boolean z10) {
        this.f40588p = z10;
        return this;
    }

    @n0
    public c p(int i10) {
        if (i10 < 2 || i10 > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.f40584l = i10;
        return this;
    }

    public c q(boolean z10) {
        this.f40574b.d(new d(), z10);
        return this;
    }

    @n0
    public c r(@p0 com.bumptech.glide.load.engine.cache.j jVar) {
        this.f40578f = jVar;
        return this;
    }

    @n0
    public c s(@n0 l.a aVar) {
        return t(aVar.a());
    }

    @n0
    public c t(@p0 l lVar) {
        this.f40582j = lVar;
        return this;
    }

    void u(@p0 n.b bVar) {
        this.f40586n = bVar;
    }

    @Deprecated
    public c v(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        return w(aVar);
    }

    @n0
    public c w(@p0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f40579g = aVar;
        return this;
    }
}
