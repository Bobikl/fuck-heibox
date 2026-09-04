package com.bumptech.glide.request.transition;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: BitmapContainerTransitionFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a<R> implements g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<Drawable> f41944a;

    /* JADX INFO: renamed from: com.bumptech.glide.request.transition.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BitmapContainerTransitionFactory.java */
    public final class C0345a implements f<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f<Drawable> f41945a;

        C0345a(f<Drawable> fVar) {
            this.f41945a = fVar;
        }

        @Override // com.bumptech.glide.request.transition.f
        public boolean a(R r10, f.a aVar) {
            return this.f41945a.a(new BitmapDrawable(aVar.getView().getResources(), a.this.b(r10)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f41944a = gVar;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<R> a(DataSource dataSource, boolean z10) {
        return new C0345a(this.f41944a.a(dataSource, z10));
    }

    protected abstract Bitmap b(R r10);
}
