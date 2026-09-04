package androidx.core.os;

import android.os.CancellationSignal;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: compiled from: CancellationSignal.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f20970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f20971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f20972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20973d;

    /* JADX INFO: compiled from: CancellationSignal.java */
    @w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @androidx.annotation.u
        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* JADX INFO: compiled from: CancellationSignal.java */
    public interface b {
        void onCancel();
    }

    private void f() {
        while (this.f20973d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f20970a) {
                return;
            }
            this.f20970a = true;
            this.f20973d = true;
            b bVar = this.f20971b;
            Object obj = this.f20972c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f20973d = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f20973d = false;
                notifyAll();
            }
        }
    }

    @p0
    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.f20972c == null) {
                CancellationSignal cancellationSignalB = a.b();
                this.f20972c = cancellationSignalB;
                if (this.f20970a) {
                    a.a(cancellationSignalB);
                }
            }
            obj = this.f20972c;
        }
        return obj;
    }

    public boolean c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f20970a;
        }
        return z10;
    }

    public void d(@p0 b bVar) {
        synchronized (this) {
            f();
            if (this.f20971b == bVar) {
                return;
            }
            this.f20971b = bVar;
            if (this.f20970a && bVar != null) {
                bVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new OperationCanceledException();
        }
    }
}
