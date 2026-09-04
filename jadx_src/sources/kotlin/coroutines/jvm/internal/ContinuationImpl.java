package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.f0;
import kotlin.u0;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @dl.e
    private final CoroutineContext _context;

    @dl.e
    private transient kotlin.coroutines.c<Object> intercepted;

    public ContinuationImpl(@dl.e kotlin.coroutines.c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }

    public ContinuationImpl(@dl.e kotlin.coroutines.c<Object> cVar, @dl.e CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        f0.m(coroutineContext);
        return coroutineContext;
    }

    @dl.d
    public final kotlin.coroutines.c<Object> intercepted() {
        kotlin.coroutines.c<Object> cVarQ = this.intercepted;
        if (cVarQ == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().f(kotlin.coroutines.d.f124698w1);
            if (dVar == null || (cVarQ = dVar.Q(this)) == null) {
                cVarQ = this;
            }
            this.intercepted = cVarQ;
        }
        return cVarQ;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
        kotlin.coroutines.c<?> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            CoroutineContext.a aVarF = getContext().f(kotlin.coroutines.d.f124698w1);
            f0.m(aVarF);
            ((kotlin.coroutines.d) aVarF).k(cVar);
        }
        this.intercepted = b.f124720b;
    }
}
