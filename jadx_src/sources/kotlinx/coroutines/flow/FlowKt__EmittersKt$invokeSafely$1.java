package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {216}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f129371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f129372d;

    FlowKt__EmittersKt$invokeSafely$1(kotlin.coroutines.c<? super FlowKt__EmittersKt$invokeSafely$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129371c = obj;
        this.f129372d |= Integer.MIN_VALUE;
        return FlowKt__EmittersKt.c(null, null, null, this);
    }
}
