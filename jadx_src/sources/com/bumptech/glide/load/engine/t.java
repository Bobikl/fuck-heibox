package com.bumptech.glide.load.engine;

import androidx.annotation.n0;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: ResourceCacheGenerator.java */
/* JADX INFO: loaded from: classes6.dex */
public class t implements e, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f41275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f<?> f41276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41278e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.c f41279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.o<File, ?>> f41280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile com.bumptech.glide.load.model.o.a<?> f41282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f41283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private u f41284k;

    t(f<?> fVar, e.a aVar) {
        this.f41276c = fVar;
        this.f41275b = aVar;
    }

    private boolean b() {
        return this.f41281h < this.f41280g.size();
    }

    @Override // com.bumptech.glide.load.engine.e
    public boolean a() {
        com.bumptech.glide.util.pool.b.a("ResourceCacheGenerator.startNext");
        try {
            List<com.bumptech.glide.load.c> listC = this.f41276c.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                com.bumptech.glide.util.pool.b.f();
                return false;
            }
            List<Class<?>> listM = this.f41276c.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f41276c.r())) {
                    com.bumptech.glide.util.pool.b.f();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f41276c.i() + " to " + this.f41276c.r());
            }
            while (true) {
                if (this.f41280g != null && b()) {
                    this.f41282i = null;
                    while (!z10 && b()) {
                        List<com.bumptech.glide.load.model.o<File, ?>> list = this.f41280g;
                        int i10 = this.f41281h;
                        this.f41281h = i10 + 1;
                        this.f41282i = list.get(i10).a(this.f41283j, this.f41276c.t(), this.f41276c.f(), this.f41276c.k());
                        if (this.f41282i != null && this.f41276c.u(this.f41282i.f41380c.a())) {
                            this.f41282i.f41380c.d(this.f41276c.l(), this);
                            z10 = true;
                        }
                    }
                    com.bumptech.glide.util.pool.b.f();
                    return z10;
                }
                int i11 = this.f41278e + 1;
                this.f41278e = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f41277d + 1;
                    this.f41277d = i12;
                    if (i12 >= listC.size()) {
                        com.bumptech.glide.util.pool.b.f();
                        return false;
                    }
                    this.f41278e = 0;
                }
                com.bumptech.glide.load.c cVar = listC.get(this.f41277d);
                Class<?> cls = listM.get(this.f41278e);
                this.f41284k = new u(this.f41276c.b(), cVar, this.f41276c.p(), this.f41276c.t(), this.f41276c.f(), this.f41276c.s(cls), cls, this.f41276c.k());
                File fileB = this.f41276c.d().b(this.f41284k);
                this.f41283j = fileB;
                if (fileB != null) {
                    this.f41279f = cVar;
                    this.f41280g = this.f41276c.j(fileB);
                    this.f41281h = 0;
                }
            }
        } catch (Throwable th2) {
            com.bumptech.glide.util.pool.b.f();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.e
    public void cancel() {
        com.bumptech.glide.load.model.o.a<?> aVar = this.f41282i;
        if (aVar != null) {
            aVar.f41380c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f41275b.d(this.f41279f, obj, this.f41282i.f41380c, DataSource.RESOURCE_DISK_CACHE, this.f41284k);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(@n0 Exception exc) {
        this.f41275b.b(this.f41284k, exc, this.f41282i.f41380c, DataSource.RESOURCE_DISK_CACHE);
    }
}
