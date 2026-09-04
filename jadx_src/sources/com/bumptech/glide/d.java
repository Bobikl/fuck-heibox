package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.bumptech.glide.request.target.r;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: GlideContext.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @j1
    static final k<?, ?> f40594k = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f40595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.h.b<Registry> f40596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.request.target.k f40597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Glide.a f40598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.request.g<Object>> f40599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, k<?, ?>> f40600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.i f40601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f40602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f40603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @b0("this")
    @p0
    private com.bumptech.glide.request.h f40604j;

    public d(@n0 Context context, @n0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @n0 com.bumptech.glide.util.h.b<Registry> bVar2, @n0 com.bumptech.glide.request.target.k kVar, @n0 Glide.a aVar, @n0 Map<Class<?>, k<?, ?>> map, @n0 List<com.bumptech.glide.request.g<Object>> list, @n0 com.bumptech.glide.load.engine.i iVar, @n0 e eVar, int i10) {
        super(context.getApplicationContext());
        this.f40595a = bVar;
        this.f40597c = kVar;
        this.f40598d = aVar;
        this.f40599e = list;
        this.f40600f = map;
        this.f40601g = iVar;
        this.f40602h = eVar;
        this.f40603i = i10;
        this.f40596b = com.bumptech.glide.util.h.a(bVar2);
    }

    @n0
    public <X> r<ImageView, X> a(@n0 ImageView imageView, @n0 Class<X> cls) {
        return this.f40597c.a(imageView, cls);
    }

    @n0
    public com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f40595a;
    }

    public List<com.bumptech.glide.request.g<Object>> c() {
        return this.f40599e;
    }

    public synchronized com.bumptech.glide.request.h d() {
        if (this.f40604j == null) {
            this.f40604j = this.f40598d.build().q0();
        }
        return this.f40604j;
    }

    @n0
    public <T> k<?, T> e(@n0 Class<T> cls) {
        k<?, T> kVar = (k) this.f40600f.get(cls);
        if (kVar == null) {
            for (Map.Entry<Class<?>, k<?, ?>> entry : this.f40600f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        return kVar == null ? (k<?, T>) f40594k : kVar;
    }

    @n0
    public com.bumptech.glide.load.engine.i f() {
        return this.f40601g;
    }

    public e g() {
        return this.f40602h;
    }

    public int h() {
        return this.f40603i;
    }

    @n0
    public Registry i() {
        return this.f40596b.get();
    }
}
