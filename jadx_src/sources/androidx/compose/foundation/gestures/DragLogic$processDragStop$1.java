package androidx.compose.foundation.gestures;

import androidx.core.app.o0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0, 0}, l = {bb.c.b.C4, bb.c.b.F4}, m = "processDragStop", n = {"this", "$this$processDragStop", o0.I0}, s = {"L$0", "L$1", "L$2"})
public final class DragLogic$processDragStop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f5380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f5381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ DragLogic f5382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f5383g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragLogic$processDragStop$1(DragLogic dragLogic, kotlin.coroutines.c<? super DragLogic$processDragStop$1> cVar) {
        super(cVar);
        this.f5382f = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5381e = obj;
        this.f5383g |= Integer.MIN_VALUE;
        return this.f5382f.g(null, null, this);
    }
}
