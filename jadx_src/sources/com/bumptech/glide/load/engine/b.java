package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: DataCacheGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements e, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.c> f40962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f<?> f40963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e.a f40964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.c f40966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.o<File, ?>> f40967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f40968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.bumptech.glide.load.model.o.a<?> f40969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f40970j;

    b(f<?> fVar, e.a aVar) {
        this(fVar.c(), fVar, aVar);
    }

    b(List<com.bumptech.glide.load.c> list, f<?> fVar, e.a aVar) {
        this.f40965e = -1;
        this.f40962b = list;
        this.f40963c = fVar;
        this.f40964d = aVar;
    }

    private boolean b() {
        return this.f40968h < this.f40967g.size();
    }

    @Override // com.bumptech.glide.load.engine.e
    public boolean a() {
        com.bumptech.glide.util.pool.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z10 = false;
                if (this.f40967g != null && b()) {
                    this.f40969i = null;
                    while (!z10 && b()) {
                        List<com.bumptech.glide.load.model.o<File, ?>> list = this.f40967g;
                        int i10 = this.f40968h;
                        this.f40968h = i10 + 1;
                        this.f40969i = list.get(i10).a(this.f40970j, this.f40963c.t(), this.f40963c.f(), this.f40963c.k());
                        if (this.f40969i != null && this.f40963c.u(this.f40969i.f41380c.a())) {
                            this.f40969i.f41380c.d(this.f40963c.l(), this);
                            z10 = true;
                        }
                    }
                    com.bumptech.glide.util.pool.b.f();
                    return z10;
                }
                int i11 = this.f40965e + 1;
                this.f40965e = i11;
                if (i11 >= this.f40962b.size()) {
                    com.bumptech.glide.util.pool.b.f();
                    return false;
                }
                com.bumptech.glide.load.c cVar = this.f40962b.get(this.f40965e);
                File fileB = this.f40963c.d().b(new c(cVar, this.f40963c.p()));
                this.f40970j = fileB;
                if (fileB != null) {
                    this.f40966f = cVar;
                    this.f40967g = this.f40963c.j(fileB);
                    this.f40968h = 0;
                }
            } catch (Throwable th2) {
                com.bumptech.glide.util.pool.b.f();
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.e
    public void cancel() {
        com.bumptech.glide.load.model.o.a<?> aVar = this.f40969i;
        if (aVar != null) {
            aVar.f41380c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f40964d.d(this.f40966f, obj, this.f40969i.f41380c, DataSource.DATA_DISK_CACHE, this.f40966f);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(@n0 Exception exc) {
        this.f40964d.b(this.f40966f, exc, this.f40969i.f41380c, DataSource.DATA_DISK_CACHE);
    }
}
