package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.n2;

/* JADX INFO: compiled from: DispatchQueue.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24217c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24215a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Queue<Runnable> f24218d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(l this$0, Runnable runnable) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(runnable, "$runnable");
        this$0.f(runnable);
    }

    @androidx.annotation.k0
    private final void f(Runnable runnable) {
        if (!this.f24218d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        e();
    }

    @androidx.annotation.k0
    public final boolean b() {
        return this.f24216b || !this.f24215a;
    }

    @androidx.annotation.d
    public final void c(@dl.d CoroutineContext context, @dl.d final Runnable runnable) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(runnable, "runnable");
        n2 n2VarP0 = e1.e().p0();
        if (n2VarP0.V(context) || b()) {
            n2VarP0.O(context, new Runnable() { // from class: androidx.lifecycle.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.d(this.f24213b, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    @androidx.annotation.k0
    public final void e() {
        if (this.f24217c) {
            return;
        }
        try {
            this.f24217c = true;
            while ((!this.f24218d.isEmpty()) && b()) {
                Runnable runnablePoll = this.f24218d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.f24217c = false;
        } catch (Throwable th2) {
            this.f24217c = false;
            throw th2;
        }
    }

    @androidx.annotation.k0
    public final void g() {
        this.f24216b = true;
        e();
    }

    @androidx.annotation.k0
    public final void h() {
        this.f24215a = true;
    }

    @androidx.annotation.k0
    public final void i() {
        if (this.f24215a) {
            if (!(!this.f24216b)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.f24215a = false;
            e();
        }
    }
}
