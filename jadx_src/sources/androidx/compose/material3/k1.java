package androidx.compose.material3;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@w
@j2
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/k1;", "", "other", "", "equals", "", "hashCode", "", "<set-?>", ak.av, "Landroidx/compose/runtime/a1;", "()F", ak.aF, "(F)V", "positionFraction", "", "b", "()[F", "d", "([F)V", "tickFractions", "initialPositionFraction", "initialTickFractions", "<init>", "(F[F)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 positionFraction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 tickFractions;

    public k1(float f10, @dl.d float[] initialTickFractions) {
        kotlin.jvm.internal.f0.p(initialTickFractions, "initialTickFractions");
        this.positionFraction = h2.g(Float.valueOf(f10), null, 2, null);
        this.tickFractions = h2.g(initialTickFractions, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float a() {
        return ((Number) this.positionFraction.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public final float[] b() {
        return (float[]) this.tickFractions.getValue();
    }

    public final void c(float f10) {
        this.positionFraction.setValue(Float.valueOf(f10));
    }

    public final void d(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<set-?>");
        this.tickFractions.setValue(fArr);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) other;
        return ((a() > k1Var.a() ? 1 : (a() == k1Var.a() ? 0 : -1)) == 0) && Arrays.equals(b(), k1Var.b());
    }

    public int hashCode() {
        return (Float.floatToIntBits(a()) * 31) + Arrays.hashCode(b());
    }
}
