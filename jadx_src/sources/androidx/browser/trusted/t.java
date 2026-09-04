package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.n0;

/* JADX INFO: compiled from: TrustedWebActivityDisplayMode.java */
/* JADX INFO: loaded from: classes.dex */
public interface t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3323a = "androidx.browser.trusted.displaymode.KEY_ID";

    /* JADX INFO: compiled from: TrustedWebActivityDisplayMode.java */
    public static class a implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f3324b = 0;

        @Override // androidx.browser.trusted.t
        @n0
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(t.f3323a, 0);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityDisplayMode.java */
    public static class b implements t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f3325d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f3326e = "androidx.browser.trusted.displaymode.KEY_STICKY";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f3327f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f3328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3329c;

        public b(boolean z10, int i10) {
            this.f3328b = z10;
            this.f3329c = i10;
        }

        @n0
        static t b(@n0 Bundle bundle) {
            return new b(bundle.getBoolean(f3326e), bundle.getInt(f3327f));
        }

        @Override // androidx.browser.trusted.t
        @n0
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(t.f3323a, 1);
            bundle.putBoolean(f3326e, this.f3328b);
            bundle.putInt(f3327f, this.f3329c);
            return bundle;
        }

        public boolean c() {
            return this.f3328b;
        }

        public int d() {
            return this.f3329c;
        }
    }

    @n0
    Bundle a();
}
