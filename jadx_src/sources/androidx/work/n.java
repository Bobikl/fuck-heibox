package androidx.work;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f29455a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile n f29456b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f29457c = "WM-";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f29458d = 23;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f29459e = 20;

    /* JADX INFO: compiled from: Logger.java */
    public static class a extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f29460f;

        public a(int i10) {
            super(i10);
            this.f29460f = i10;
        }

        @Override // androidx.work.n
        public void a(@n0 String str, @n0 String str2) {
            if (this.f29460f <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.n
        public void b(@n0 String str, @n0 String str2, @n0 Throwable th2) {
            if (this.f29460f <= 3) {
                Log.d(str, str2, th2);
            }
        }

        @Override // androidx.work.n
        public void c(@n0 String str, @n0 String str2) {
            if (this.f29460f <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.n
        public void d(@n0 String str, @n0 String str2, @n0 Throwable th2) {
            if (this.f29460f <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.n
        public void f(@n0 String str, @n0 String str2) {
            if (this.f29460f <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.n
        public void g(@n0 String str, @n0 String str2, @n0 Throwable th2) {
            if (this.f29460f <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // androidx.work.n
        public void j(@n0 String str, @n0 String str2) {
            if (this.f29460f <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // androidx.work.n
        public void k(@n0 String str, @n0 String str2, @n0 Throwable th2) {
            if (this.f29460f <= 2) {
                Log.v(str, str2, th2);
            }
        }

        @Override // androidx.work.n
        public void l(@n0 String str, @n0 String str2) {
            if (this.f29460f <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // androidx.work.n
        public void m(@n0 String str, @n0 String str2, @n0 Throwable th2) {
            if (this.f29460f <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public n(int i10) {
    }

    @n0
    public static n e() {
        n nVar;
        synchronized (f29455a) {
            if (f29456b == null) {
                f29456b = new a(3);
            }
            nVar = f29456b;
        }
        return nVar;
    }

    public static void h(@n0 n nVar) {
        synchronized (f29455a) {
            f29456b = nVar;
        }
    }

    @n0
    public static String i(@n0 String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(f29457c);
        int i10 = f29459e;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(@n0 String str, @n0 String str2);

    public abstract void b(@n0 String str, @n0 String str2, @n0 Throwable th2);

    public abstract void c(@n0 String str, @n0 String str2);

    public abstract void d(@n0 String str, @n0 String str2, @n0 Throwable th2);

    public abstract void f(@n0 String str, @n0 String str2);

    public abstract void g(@n0 String str, @n0 String str2, @n0 Throwable th2);

    public abstract void j(@n0 String str, @n0 String str2);

    public abstract void k(@n0 String str, @n0 String str2, @n0 Throwable th2);

    public abstract void l(@n0 String str, @n0 String str2);

    public abstract void m(@n0 String str, @n0 String str2, @n0 Throwable th2);
}
