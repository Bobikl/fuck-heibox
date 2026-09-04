package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", i = {0}, l = {70}, m = "invoke$emitExit", n = {"hoverInteraction$delegate"}, s = {"L$0"})
public final class HoverableKt$hoverable$2$invoke$emitExit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f4944d;

    HoverableKt$hoverable$2$invoke$emitExit$1(kotlin.coroutines.c<? super HoverableKt$hoverable$2$invoke$emitExit$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f4943c = obj;
        this.f4944d |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.f(null, null, this);
    }
}
