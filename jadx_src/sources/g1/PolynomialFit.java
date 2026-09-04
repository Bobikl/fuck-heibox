package g1;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: g1.c, reason: from toString */
/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J#\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lg1/c;", "", "", "", ak.av, "b", "coefficients", "confidence", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "e", "()Ljava/util/List;", "F", "f", "()F", "<init>", "(Ljava/util/List;F)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class PolynomialFit {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @dl.d
    private final List<Float> coefficients;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    private final float confidence;

    public PolynomialFit(@dl.d List<Float> coefficients, float f10) {
        f0.p(coefficients, "coefficients");
        this.coefficients = coefficients;
        this.confidence = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolynomialFit d(PolynomialFit polynomialFit, List list, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = polynomialFit.coefficients;
        }
        if ((i10 & 2) != 0) {
            f10 = polynomialFit.confidence;
        }
        return polynomialFit.c(list, f10);
    }

    @dl.d
    public final List<Float> a() {
        return this.coefficients;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    @dl.d
    public final PolynomialFit c(@dl.d List<Float> coefficients, float confidence) {
        f0.p(coefficients, "coefficients");
        return new PolynomialFit(coefficients, confidence);
    }

    @dl.d
    public final List<Float> e() {
        return this.coefficients;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolynomialFit)) {
            return false;
        }
        PolynomialFit polynomialFit = (PolynomialFit) other;
        return f0.g(this.coefficients, polynomialFit.coefficients) && f0.g(Float.valueOf(this.confidence), Float.valueOf(polynomialFit.confidence));
    }

    public final float f() {
        return this.confidence;
    }

    public int hashCode() {
        return (this.coefficients.hashCode() * 31) + Float.floatToIntBits(this.confidence);
    }

    @dl.d
    public String toString() {
        return "PolynomialFit(coefficients=" + this.coefficients + ", confidence=" + this.confidence + ')';
    }
}
