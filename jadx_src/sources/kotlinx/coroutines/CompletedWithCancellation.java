package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.e0, reason: from toString */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B4\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003J$\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J:\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/e0;", "", ak.av, "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "b", "result", "onCancellation", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final /* data */ class CompletedWithCancellation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    @xh.e
    public final Object result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @dl.d
    @xh.e
    public final yh.l<Throwable, kotlin.b2> onCancellation;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedWithCancellation(@dl.e Object obj, @dl.d yh.l<? super Throwable, kotlin.b2> lVar) {
        this.result = obj;
        this.onCancellation = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedWithCancellation d(CompletedWithCancellation completedWithCancellation, Object obj, yh.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = completedWithCancellation.result;
        }
        if ((i10 & 2) != 0) {
            lVar = completedWithCancellation.onCancellation;
        }
        return completedWithCancellation.c(obj, lVar);
    }

    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getResult() {
        return this.result;
    }

    @dl.d
    public final yh.l<Throwable, kotlin.b2> b() {
        return this.onCancellation;
    }

    @dl.d
    public final CompletedWithCancellation c(@dl.e Object obj, @dl.d yh.l<? super Throwable, kotlin.b2> lVar) {
        return new CompletedWithCancellation(obj, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedWithCancellation)) {
            return false;
        }
        CompletedWithCancellation completedWithCancellation = (CompletedWithCancellation) other;
        return kotlin.jvm.internal.f0.g(this.result, completedWithCancellation.result) && kotlin.jvm.internal.f0.g(this.onCancellation, completedWithCancellation.onCancellation);
    }

    public int hashCode() {
        Object obj = this.result;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.onCancellation.hashCode();
    }

    @dl.d
    public String toString() {
        return "CompletedWithCancellation(result=" + this.result + ", onCancellation=" + this.onCancellation + ')';
    }
}
