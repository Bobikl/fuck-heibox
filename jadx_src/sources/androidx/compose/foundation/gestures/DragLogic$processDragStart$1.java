package androidx.compose.foundation.gestures;

import androidx.core.app.o0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {bb.c.b.f30922s4, bb.c.b.f30988v4, bb.c.b.f31032x4}, m = "processDragStart", n = {"this", "$this$processDragStart", o0.I0, "this", "$this$processDragStart", o0.I0, "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class DragLogic$processDragStart$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f5374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f5375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ DragLogic f5376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f5377h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragLogic$processDragStart$1(DragLogic dragLogic, kotlin.coroutines.c<? super DragLogic$processDragStart$1> cVar) {
        super(cVar);
        this.f5376g = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5375f = obj;
        this.f5377h |= Integer.MIN_VALUE;
        return this.f5376g.f(null, null, this);
    }
}
