package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {80}, m = "yieldFrames", n = {}, s = {})
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f129122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f129123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f129124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f129125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ DebugCoroutineInfo f129126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f129127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$yieldFrames$1(DebugCoroutineInfo debugCoroutineInfo, kotlin.coroutines.c<? super DebugCoroutineInfoImpl$yieldFrames$1> cVar) {
        super(cVar);
        this.f129126f = debugCoroutineInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f129125e = obj;
        this.f129127g |= Integer.MIN_VALUE;
        return this.f129126f.k(null, null, this);
    }
}
