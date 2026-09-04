package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {153}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
public final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f128994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f128995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f128996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f128997e;

    ProduceKt$awaitClose$1(kotlin.coroutines.c<? super ProduceKt$awaitClose$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f128996d = obj;
        this.f128997e |= Integer.MIN_VALUE;
        return ProduceKt.a(null, null, this);
    }
}
