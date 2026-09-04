package com.airbnb.lottie;

import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: compiled from: LottieConfig.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    final com.airbnb.lottie.network.e f37366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    final com.airbnb.lottie.network.d f37367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f37368c;

    /* JADX INFO: compiled from: LottieConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private com.airbnb.lottie.network.e f37369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private com.airbnb.lottie.network.d f37370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f37371c = false;

        /* JADX INFO: compiled from: LottieConfig.java */
        public class a implements com.airbnb.lottie.network.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f37372a;

            a(File file) {
                this.f37372a = file;
            }

            @Override // com.airbnb.lottie.network.d
            @n0
            public File a() {
                if (this.f37372a.isDirectory()) {
                    return this.f37372a;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* JADX INFO: renamed from: com.airbnb.lottie.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LottieConfig.java */
        public class C0285b implements com.airbnb.lottie.network.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.airbnb.lottie.network.d f37374a;

            C0285b(com.airbnb.lottie.network.d dVar) {
                this.f37374a = dVar;
            }

            @Override // com.airbnb.lottie.network.d
            @n0
            public File a() {
                File fileA = this.f37374a.a();
                if (fileA.isDirectory()) {
                    return fileA;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @n0
        public i a() {
            return new i(this.f37369a, this.f37370b, this.f37371c);
        }

        @n0
        public b b(boolean z10) {
            this.f37371c = z10;
            return this;
        }

        @n0
        public b c(@n0 File file) {
            if (this.f37370b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f37370b = new a(file);
            return this;
        }

        @n0
        public b d(@n0 com.airbnb.lottie.network.d dVar) {
            if (this.f37370b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f37370b = new C0285b(dVar);
            return this;
        }

        @n0
        public b e(@n0 com.airbnb.lottie.network.e eVar) {
            this.f37369a = eVar;
            return this;
        }
    }

    private i(@p0 com.airbnb.lottie.network.e eVar, @p0 com.airbnb.lottie.network.d dVar, boolean z10) {
        this.f37366a = eVar;
        this.f37367b = dVar;
        this.f37368c = z10;
    }
}
