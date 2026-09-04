package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.u0;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements b0<Object>, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f124719b;

    public RestrictedSuspendLambda(int i10) {
        this(i10, null);
    }

    public RestrictedSuspendLambda(int i10, @dl.e kotlin.coroutines.c<Object> cVar) {
        super(cVar);
        this.f124719b = i10;
    }

    @Override // kotlin.jvm.internal.b0
    public int getArity() {
        return this.f124719b;
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
