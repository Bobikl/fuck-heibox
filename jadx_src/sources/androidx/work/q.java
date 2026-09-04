package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.p0;

/* JADX INFO: compiled from: Operation.java */
/* JADX INFO: loaded from: classes6.dex */
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final b.c f29462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final b.C0239b f29463b;

    /* JADX INFO: compiled from: Operation.java */
    public static abstract class b {

        /* JADX INFO: compiled from: Operation.java */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f29464a;

            public a(@n0 Throwable th2) {
                this.f29464a = th2;
            }

            @n0
            public Throwable a() {
                return this.f29464a;
            }

            @n0
            public String toString() {
                return "FAILURE (" + this.f29464a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.work.q$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Operation.java */
        public static final class C0239b extends b {
            private C0239b() {
            }

            @n0
            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* JADX INFO: compiled from: Operation.java */
        public static final class c extends b {
            private c() {
            }

            @n0
            public String toString() {
                return "SUCCESS";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        b() {
        }
    }

    static {
        f29462a = new b.c();
        f29463b = new b.C0239b();
    }

    @n0
    p0<b.c> getResult();

    @n0
    LiveData<b> getState();
}
