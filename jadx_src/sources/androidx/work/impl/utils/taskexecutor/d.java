package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.work.impl.utils.v;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f29379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f29380b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f29381c = new a();

    /* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@n0 Runnable runnable) {
            d.this.f29380b.post(runnable);
        }
    }

    public d(@n0 Executor executor) {
        this.f29379a = new v(executor);
    }

    @Override // androidx.work.impl.utils.taskexecutor.c
    public /* synthetic */ void a(Runnable runnable) {
        b.a(this, runnable);
    }

    @Override // androidx.work.impl.utils.taskexecutor.c
    @n0
    public Executor b() {
        return this.f29381c;
    }

    @Override // androidx.work.impl.utils.taskexecutor.c
    @n0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public v c() {
        return this.f29379a;
    }
}
