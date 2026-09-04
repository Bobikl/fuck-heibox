package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.u0;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class SuspendLambda extends ContinuationImpl implements b0<Object>, j {
    private final int arity;

    public SuspendLambda(int i10) {
        this(i10, null);
    }

    public SuspendLambda(int i10, @dl.e kotlin.coroutines.c<Object> cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.b0
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strW = n0.w(this);
        f0.o(strW, "renderLambdaToString(this)");
        return strW;
    }
}
