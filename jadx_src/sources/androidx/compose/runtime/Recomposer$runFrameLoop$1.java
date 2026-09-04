package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {bb.c.b.Hb, 768}, m = "runFrameLoop", n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class Recomposer$runFrameLoop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f12493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f12494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f12495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f12496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f12497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ Recomposer f12498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f12499i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runFrameLoop$1(Recomposer recomposer, kotlin.coroutines.c<? super Recomposer$runFrameLoop$1> cVar) {
        super(cVar);
        this.f12498h = recomposer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f12497g = obj;
        this.f12499i |= Integer.MIN_VALUE;
        return this.f12498h.K0(null, null, this);
    }
}
