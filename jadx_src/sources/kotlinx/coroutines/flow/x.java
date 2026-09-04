package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/x;", "Lkotlinx/coroutines/flow/f;", "", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "b", "Ljava/lang/Throwable;", "e", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class x implements f<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final Throwable e;

    public x(@dl.d Throwable th2) {
        this.e = th2;
    }

    @Override // kotlinx.coroutines.flow.f
    @dl.e
    public Object emit(@dl.e Object obj, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        throw this.e;
    }
}
