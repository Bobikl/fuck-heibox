package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\bj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/n;", "", "cause", "Lkotlin/b2;", ak.av, "", "toString", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a2 extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.l<Throwable, kotlin.b2> f128719b;

    /* JADX WARN: Multi-variable type inference failed */
    public a2(@dl.d yh.l<? super Throwable, kotlin.b2> lVar) {
        this.f128719b = lVar;
    }

    @Override // kotlinx.coroutines.o
    public void a(@dl.e Throwable th2) {
        this.f128719b.invoke(th2);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        a(th2);
        return kotlin.b2.f124493a;
    }

    @dl.d
    public String toString() {
        return "InvokeOnCancel[" + t0.a(this.f128719b) + '@' + t0.b(this) + ']';
    }
}
