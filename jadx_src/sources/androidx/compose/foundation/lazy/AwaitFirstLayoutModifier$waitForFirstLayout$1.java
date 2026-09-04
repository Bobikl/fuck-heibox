package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", i = {0, 0}, l = {bb.c.b.f30967u5}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
public final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f6414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f6415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f6416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AwaitFirstLayoutModifier f6417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f6418f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, kotlin.coroutines.c<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> cVar) {
        super(cVar);
        this.f6417e = awaitFirstLayoutModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f6416d = obj;
        this.f6418f |= Integer.MIN_VALUE;
        return this.f6417e.a(this);
    }
}
