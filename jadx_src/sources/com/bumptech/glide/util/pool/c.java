package com.bumptech.glide.util.pool;

import androidx.annotation.n0;

/* JADX INFO: compiled from: StateVerifier.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f42028a = false;

    /* JADX INFO: compiled from: StateVerifier.java */
    public static class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile RuntimeException f42029b;

        b() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.c
        void b(boolean z10) {
            if (z10) {
                this.f42029b = new RuntimeException("Released");
            } else {
                this.f42029b = null;
            }
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f42029b != null) {
                throw new IllegalStateException("Already released", this.f42029b);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.pool.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StateVerifier.java */
    public static class C0348c extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f42030b;

        C0348c() {
            super();
        }

        @Override // com.bumptech.glide.util.pool.c
        public void b(boolean z10) {
            this.f42030b = z10;
        }

        @Override // com.bumptech.glide.util.pool.c
        public void c() {
            if (this.f42030b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private c() {
    }

    @n0
    public static c a() {
        return new C0348c();
    }

    abstract void b(boolean z10);

    public abstract void c();
}
