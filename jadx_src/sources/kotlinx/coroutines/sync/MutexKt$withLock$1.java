package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {112}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
public final class MutexKt$withLock$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f130462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f130463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f130464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f130465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f130466f;

    MutexKt$withLock$1(kotlin.coroutines.c<? super MutexKt$withLock$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f130465e = obj;
        this.f130466f |= Integer.MIN_VALUE;
        return MutexKt.o(null, null, null, this);
    }
}
