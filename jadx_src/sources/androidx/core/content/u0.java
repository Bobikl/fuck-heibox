package androidx.core.content;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: SharedPreferencesCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class u0 {

    /* JADX INFO: compiled from: SharedPreferencesCompat.java */
    @Deprecated
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static a f20620b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0128a f20621a = new C0128a();

        /* JADX INFO: renamed from: androidx.core.content.u0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SharedPreferencesCompat.java */
        public static class C0128a {
            C0128a() {
            }

            public void a(@androidx.annotation.n0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        @Deprecated
        public static a b() {
            if (f20620b == null) {
                f20620b = new a();
            }
            return f20620b;
        }

        @Deprecated
        public void a(@androidx.annotation.n0 SharedPreferences.Editor editor) {
            this.f20621a.a(editor);
        }
    }

    private u0() {
    }
}
