package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yh.q;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<kotlinx.coroutines.flow.f<? super Object>, Object, kotlin.coroutines.c<? super b2>, Object>, kotlin.coroutines.jvm.internal.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SafeCollectorKt$emitFun$1 f130060d = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.flow.f<Object> fVar, @dl.e Object obj, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return fVar.emit(obj, cVar);
    }
}
