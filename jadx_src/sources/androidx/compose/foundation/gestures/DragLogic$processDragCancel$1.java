package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", i = {0, 0}, l = {400, 403}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
public final class DragLogic$processDragCancel$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f5366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f5367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f5368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ DragLogic f5369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragLogic$processDragCancel$1(DragLogic dragLogic, kotlin.coroutines.c<? super DragLogic$processDragCancel$1> cVar) {
        super(cVar);
        this.f5369e = dragLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f5368d = obj;
        this.f5370f |= Integer.MIN_VALUE;
        return this.f5369e.e(null, this);
    }
}
