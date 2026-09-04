package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.u0;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class BaseContinuationImpl implements kotlin.coroutines.c<Object>, c, Serializable {

    @dl.e
    private final kotlin.coroutines.c<Object> completion;

    public BaseContinuationImpl(@dl.e kotlin.coroutines.c<Object> cVar) {
        this.completion = cVar;
    }

    @dl.d
    public kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        f0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @dl.d
    public kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> completion) {
        f0.p(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public c getCallerFrame() {
        kotlin.coroutines.c<Object> cVar = this.completion;
        if (cVar instanceof c) {
            return (c) cVar;
        }
        return null;
    }

    @dl.e
    public final kotlin.coroutines.c<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @dl.e
    public StackTraceElement getStackTraceElement() {
        return e.e(this);
    }

    @dl.e
    protected abstract Object invokeSuspend(@dl.d Object obj);

    protected void releaseIntercepted() {
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(@dl.d Object obj) {
        kotlin.coroutines.c<Object> cVar = this;
        while (true) {
            f.b(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            kotlin.coroutines.c<Object> cVar2 = baseContinuationImpl.completion;
            f0.m(cVar2);
            try {
                Object objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (objInvokeSuspend == kotlin.coroutines.intrinsics.b.h()) {
                    return;
                }
                Result.a aVar = Result.f124476c;
                obj = Result.b(objInvokeSuspend);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                obj = Result.b(t0.a(th2));
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(cVar2 instanceof BaseContinuationImpl)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
