package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.v;
import kotlin.reflect.jvm.internal.impl.types.w;

/* JADX INFO: compiled from: RawProjectionComputer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends v {

    /* JADX INFO: compiled from: RawProjectionComputer.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126285a;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126285a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.v
    @dl.d
    public c1 a(@dl.d y0 parameter, @dl.d w typeAttr, @dl.d TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, @dl.d d0 erasedUpperBound) {
        c1 e1Var;
        f0.p(parameter, "parameter");
        f0.p(typeAttr, "typeAttr");
        f0.p(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        f0.p(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarL = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a) typeAttr;
        if (!aVarL.i()) {
            aVarL = aVarL.l(JavaTypeFlexibility.INFLEXIBLE);
        }
        int i10 = a.f126285a[aVarL.g().ordinal()];
        if (i10 == 1) {
            return new e1(Variance.INVARIANT, erasedUpperBound);
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (parameter.n().getAllowsOutPosition()) {
            List<y0> parameters = erasedUpperBound.O0().getParameters();
            f0.o(parameters, "erasedUpperBound.constructor.parameters");
            e1Var = parameters.isEmpty() ^ true ? new e1(Variance.OUT_VARIANCE, erasedUpperBound) : i1.t(parameter, aVarL);
        } else {
            e1Var = new e1(Variance.INVARIANT, DescriptorUtilsKt.j(parameter).H());
        }
        f0.o(e1Var, "{\n                if (!p…          }\n            }");
        return e1Var;
    }
}
