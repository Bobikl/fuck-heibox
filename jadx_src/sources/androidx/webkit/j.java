package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TracingController.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j {

    /* JADX INFO: compiled from: TracingController.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f28413a = new androidx.webkit.internal.k();

        private a() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public j() {
    }

    @n0
    public static j a() {
        return a.f28413a;
    }

    public abstract boolean b();

    public abstract void c(@n0 i iVar);

    public abstract boolean d(@p0 OutputStream outputStream, @n0 Executor executor);
}
