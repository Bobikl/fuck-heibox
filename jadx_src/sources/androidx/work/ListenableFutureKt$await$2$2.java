package androidx.work;

import com.google.common.util.concurrent.p0;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class ListenableFutureKt$await$2$2 extends Lambda implements yh.l<Throwable, b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p0<R> f28693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(p0<R> p0Var) {
        super(1);
        this.f28693b = p0Var;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
        invoke2(th2);
        return b2.f124493a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@dl.e Throwable th2) {
        this.f28693b.cancel(false);
    }
}
