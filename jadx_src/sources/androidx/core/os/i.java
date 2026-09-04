package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: ExecutorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: compiled from: ExecutorCompat.java */
    public static class a implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f20976b;

        a(@androidx.annotation.n0 Handler handler) {
            this.f20976b = (Handler) androidx.core.util.o.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.n0 Runnable runnable) {
            if (this.f20976b.post((Runnable) androidx.core.util.o.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f20976b + " is shutting down");
        }
    }

    private i() {
    }

    @androidx.annotation.n0
    public static Executor a(@androidx.annotation.n0 Handler handler) {
        return new a(handler);
    }
}
