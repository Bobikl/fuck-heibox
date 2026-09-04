package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: TextSelectionMouseDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", i = {0}, l = {127}, m = "awaitMouseEventDown", n = {"$this$awaitMouseEventDown"}, s = {"L$0"})
public final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f8328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f8329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f8330d;

    TextSelectionMouseDetectorKt$awaitMouseEventDown$1(kotlin.coroutines.c<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f8329c = obj;
        this.f8330d |= Integer.MIN_VALUE;
        return TextSelectionMouseDetectorKt.b(null, this);
    }
}
