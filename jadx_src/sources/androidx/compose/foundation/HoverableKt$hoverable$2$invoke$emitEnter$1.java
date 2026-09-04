package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", i = {0, 0}, l = {62}, m = "invoke$emitEnter", n = {"hoverInteraction$delegate", "interaction"}, s = {"L$0", "L$1"})
public final class HoverableKt$hoverable$2$invoke$emitEnter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f4938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f4939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f4940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4941e;

    HoverableKt$hoverable$2$invoke$emitEnter$1(kotlin.coroutines.c<? super HoverableKt$hoverable$2$invoke$emitEnter$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f4940d = obj;
        this.f4941e |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.e(null, null, this);
    }
}
