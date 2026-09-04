package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: ViewAnimationFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class h<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.a f41957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f<R> f41958b;

    /* JADX INFO: compiled from: ViewAnimationFactory.java */
    public static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animation f41959a;

        a(Animation animation) {
            this.f41959a = animation;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return this.f41959a;
        }
    }

    /* JADX INFO: compiled from: ViewAnimationFactory.java */
    public static class b implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41960a;

        b(int i10) {
            this.f41960a = i10;
        }

        @Override // com.bumptech.glide.request.transition.k.a
        public Animation a(Context context) {
            return AnimationUtils.loadAnimation(context, this.f41960a);
        }
    }

    public h(int i10) {
        this(new b(i10));
    }

    public h(Animation animation) {
        this(new a(animation));
    }

    h(k.a aVar) {
        this.f41957a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(DataSource dataSource, boolean z10) {
        if (dataSource == DataSource.MEMORY_CACHE || !z10) {
            return e.b();
        }
        if (this.f41958b == null) {
            this.f41958b = new k(this.f41957a);
        }
        return this.f41958b;
    }
}
