package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", i = {0, 0, 1, 1}, l = {bb.c.b.Qs, bb.c.b.ut}, m = "boundsUpdatesEventLoop", n = {"this", "subtreeChangedSemanticsNodesIds", "this", "subtreeChangedSemanticsNodesIds"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f15501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f15502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f15503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f15505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f15506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, kotlin.coroutines.c<? super AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1> cVar) {
        super(cVar);
        this.f15505f = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f15504e = obj;
        this.f15506g |= Integer.MIN_VALUE;
        return this.f15505f.k(this);
    }
}
