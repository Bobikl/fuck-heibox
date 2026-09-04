package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlinx.coroutines.t0;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/scheduling/m;", "Lkotlinx/coroutines/scheduling/j;", "Lkotlin/b2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "d", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lkotlinx/coroutines/scheduling/k;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/k;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class m extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Runnable block;

    public m(@dl.d Runnable runnable, long j10, @dl.d k kVar) {
        super(j10, kVar);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.c();
        }
    }

    @dl.d
    public String toString() {
        return "Task[" + t0.a(this.block) + '@' + t0.b(this.block) + ", " + this.submissionTime + ", " + this.taskContext + ']';
    }
}
