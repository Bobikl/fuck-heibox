package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/k0;", "", "fillInStackTrace", "b", "", "toString", "", "other", "", "equals", "", "hashCode", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", "job", "message", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class JobCancellationException extends CancellationException implements k0<JobCancellationException> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final transient d2 job;

    public JobCancellationException(@dl.d String str, @dl.e Throwable th2, @dl.d d2 d2Var) {
        super(str);
        this.job = d2Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // kotlinx.coroutines.k0
    @dl.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JobCancellationException a() {
        return null;
    }

    public boolean equals(@dl.e Object other) {
        if (other != this) {
            if (other instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) other;
                if (!kotlin.jvm.internal.f0.g(jobCancellationException.getMessage(), getMessage()) || !kotlin.jvm.internal.f0.g(jobCancellationException.job, this.job) || !kotlin.jvm.internal.f0.g(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @dl.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.f0.m(message);
        int iHashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @dl.d
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
