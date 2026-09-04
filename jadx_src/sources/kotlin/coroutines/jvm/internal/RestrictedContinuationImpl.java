package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.u0;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(@dl.e kotlin.coroutines.c<Object> cVar) {
        super(cVar);
        if (cVar != null) {
            if (!(cVar.getContext() == EmptyCoroutineContext.f124694b)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f124694b;
    }
}
