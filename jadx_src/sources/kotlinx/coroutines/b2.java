package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B0\u0012'\u0010\u000b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/b2;", "Lkotlinx/coroutines/e2;", "", "cause", "Lkotlin/b2;", "j0", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(Lyh/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class b2 extends e2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f128737g = AtomicIntegerFieldUpdater.newUpdater(b2.class, "_invoked");

    @dl.d
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final yh.l<Throwable, kotlin.b2> f128738f;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(@dl.d yh.l<? super Throwable, kotlin.b2> lVar) {
        this.f128738f = lVar;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable cause) {
        if (f128737g.compareAndSet(this, 0, 1)) {
            this.f128738f.invoke(cause);
        }
    }
}
