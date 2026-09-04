package com.bumptech.glide.request.transition;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: NoTransition.java */
/* JADX INFO: loaded from: classes6.dex */
public class e<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e<?> f41955a = new e<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g<?> f41956b = new a();

    /* JADX INFO: compiled from: NoTransition.java */
    public static class a<R> implements g<R> {
        @Override // com.bumptech.glide.request.transition.g
        public f<R> a(DataSource dataSource, boolean z10) {
            return e.f41955a;
        }
    }

    public static <R> f<R> b() {
        return f41955a;
    }

    public static <R> g<R> c() {
        return (g<R>) f41956b;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(Object obj, f.a aVar) {
        return false;
    }
}
