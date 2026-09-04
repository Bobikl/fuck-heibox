package si;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: compiled from: TypeSystemContext.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139401a;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f139401a = iArr;
        }
    }

    @dl.d
    public static final TypeVariance a(@dl.d Variance variance) {
        f0.p(variance, "<this>");
        int i10 = a.f139401a[variance.ordinal()];
        if (i10 == 1) {
            return TypeVariance.INV;
        }
        if (i10 == 2) {
            return TypeVariance.IN;
        }
        if (i10 == 3) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
