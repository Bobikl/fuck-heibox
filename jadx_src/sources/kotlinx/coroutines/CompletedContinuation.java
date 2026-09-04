package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.c0, reason: from toString */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\\\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J&\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J`\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0011\u0010#\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lkotlinx/coroutines/c0;", "", "Lkotlinx/coroutines/q;", "cont", "", "cause", "Lkotlin/b2;", "i", ak.av, "Lkotlinx/coroutines/n;", "b", "Lkotlin/Function1;", "Lkotlin/m0;", "name", ak.aF, "d", "e", "result", "cancelHandler", "onCancellation", "idempotentResume", "cancelCause", "f", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "Lkotlinx/coroutines/n;", "Ljava/lang/Throwable;", RXScreenCaptureService.KEY_HEIGHT, "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lyh/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final /* data */ class CompletedContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final Object result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final n cancelHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @dl.e
    @xh.e
    public final yh.l<Throwable, kotlin.b2> onCancellation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final Object idempotentResume;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(@dl.e Object obj, @dl.e n nVar, @dl.e yh.l<? super Throwable, kotlin.b2> lVar, @dl.e Object obj2, @dl.e Throwable th2) {
        this.result = obj;
        this.cancelHandler = nVar;
        this.onCancellation = lVar;
        this.idempotentResume = obj2;
        this.cancelCause = th2;
    }

    public /* synthetic */ CompletedContinuation(Object obj, n nVar, yh.l lVar, Object obj2, Throwable th2, int i10, kotlin.jvm.internal.u uVar) {
        this(obj, (i10 & 2) != 0 ? null : nVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation g(CompletedContinuation completedContinuation, Object obj, n nVar, yh.l lVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            nVar = completedContinuation.cancelHandler;
        }
        n nVar2 = nVar;
        if ((i10 & 4) != 0) {
            lVar = completedContinuation.onCancellation;
        }
        yh.l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        return completedContinuation.f(obj, nVar2, lVar2, obj4, th2);
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getCancelHandler() {
        return this.cancelHandler;
    }

    @dl.e
    public final yh.l<Throwable, kotlin.b2> c() {
        return this.onCancellation;
    }

    @dl.e
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getIdempotentResume() {
        return this.idempotentResume;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Throwable getCancelCause() {
        return this.cancelCause;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return kotlin.jvm.internal.f0.g(this.result, completedContinuation.result) && kotlin.jvm.internal.f0.g(this.cancelHandler, completedContinuation.cancelHandler) && kotlin.jvm.internal.f0.g(this.onCancellation, completedContinuation.onCancellation) && kotlin.jvm.internal.f0.g(this.idempotentResume, completedContinuation.idempotentResume) && kotlin.jvm.internal.f0.g(this.cancelCause, completedContinuation.cancelCause);
    }

    @dl.d
    public final CompletedContinuation f(@dl.e Object obj, @dl.e n nVar, @dl.e yh.l<? super Throwable, kotlin.b2> lVar, @dl.e Object obj2, @dl.e Throwable th2) {
        return new CompletedContinuation(obj, nVar, lVar, obj2, th2);
    }

    public final boolean h() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        Object obj = this.result;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        n nVar = this.cancelHandler;
        int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        yh.l<Throwable, kotlin.b2> lVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final void i(@dl.d q<?> qVar, @dl.d Throwable th2) {
        n nVar = this.cancelHandler;
        if (nVar != null) {
            qVar.k(nVar, th2);
        }
        yh.l<Throwable, kotlin.b2> lVar = this.onCancellation;
        if (lVar != null) {
            qVar.n(lVar, th2);
        }
    }

    @dl.d
    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }
}
