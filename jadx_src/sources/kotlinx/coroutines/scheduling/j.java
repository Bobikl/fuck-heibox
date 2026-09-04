package kotlinx.coroutines.scheduling;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/scheduling/j;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "b", "J", "submissionTime", "Lkotlinx/coroutines/scheduling/k;", ak.aF, "Lkotlinx/coroutines/scheduling/k;", "taskContext", "", ak.av, "()I", "mode", "<init>", "(JLkotlinx/coroutines/scheduling/k;)V", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public long submissionTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public k taskContext;

    public j() {
        this(0L, n.f130388i);
    }

    public j(long j10, @dl.d k kVar) {
        this.submissionTime = j10;
        this.taskContext = kVar;
    }

    public final int a() {
        return this.taskContext.getTaskMode();
    }
}
