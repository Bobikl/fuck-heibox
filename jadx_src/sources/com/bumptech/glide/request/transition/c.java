package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: compiled from: DrawableCrossFadeFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements g<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f41949c;

    /* JADX INFO: compiled from: DrawableCrossFadeFactory.java */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f41950c = 300;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f41952b;

        public a() {
            this(300);
        }

        public a(int i10) {
            this.f41951a = i10;
        }

        public c a() {
            return new c(this.f41951a, this.f41952b);
        }

        public a b(boolean z10) {
            this.f41952b = z10;
            return this;
        }
    }

    protected c(int i10, boolean z10) {
        this.f41947a = i10;
        this.f41948b = z10;
    }

    private f<Drawable> b() {
        if (this.f41949c == null) {
            this.f41949c = new d(this.f41947a, this.f41948b);
        }
        return this.f41949c;
    }

    @Override // com.bumptech.glide.request.transition.g
    public f<Drawable> a(DataSource dataSource, boolean z10) {
        return dataSource == DataSource.MEMORY_CACHE ? e.b() : b();
    }
}
