package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.animation.core.t, reason: from toString */
/* JADX INFO: compiled from: ComplexDouble.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nJ\t\u0010\f\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/t;", "", "", "e", "f", "other", "n", "o", "l", "m", "p", "q", "r", "i", "_real", "_imaginary", "g", "", "toString", "", "hashCode", "", "equals", ak.av, "D", "b", "k", "()D", "real", "j", "imaginary", "<init>", "(DD)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ComplexDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private double _real;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private double _imaginary;

    public ComplexDouble(double d10, double d11) {
        this._real = d10;
        this._imaginary = d11;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    private final double get_real() {
        return this._real;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    private final double get_imaginary() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble h(ComplexDouble complexDouble, double d10, double d11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = complexDouble._real;
        }
        if ((i10 & 2) != 0) {
            d11 = complexDouble._imaginary;
        }
        return complexDouble.g(d10, d11);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) other;
        return kotlin.jvm.internal.f0.g(Double.valueOf(this._real), Double.valueOf(complexDouble._real)) && kotlin.jvm.internal.f0.g(Double.valueOf(this._imaginary), Double.valueOf(complexDouble._imaginary));
    }

    @dl.d
    public final ComplexDouble g(double _real, double _imaginary) {
        return new ComplexDouble(_real, _imaginary);
    }

    public int hashCode() {
        return (s.a(this._real) * 31) + s.a(this._imaginary);
    }

    @dl.d
    public final ComplexDouble i(double other) {
        this._real /= other;
        this._imaginary /= other;
        return this;
    }

    public final double j() {
        return this._imaginary;
    }

    public final double k() {
        return this._real;
    }

    @dl.d
    public final ComplexDouble l(double other) {
        this._real += -other;
        return this;
    }

    @dl.d
    public final ComplexDouble m(@dl.d ComplexDouble other) {
        kotlin.jvm.internal.f0.p(other, "other");
        double d10 = -1;
        other._real *= d10;
        other._imaginary *= d10;
        this._real += other.k();
        this._imaginary += other.j();
        return this;
    }

    @dl.d
    public final ComplexDouble n(double other) {
        this._real += other;
        return this;
    }

    @dl.d
    public final ComplexDouble o(@dl.d ComplexDouble other) {
        kotlin.jvm.internal.f0.p(other, "other");
        this._real += other.k();
        this._imaginary += other.j();
        return this;
    }

    @dl.d
    public final ComplexDouble p(double other) {
        this._real *= other;
        this._imaginary *= other;
        return this;
    }

    @dl.d
    public final ComplexDouble q(@dl.d ComplexDouble other) {
        kotlin.jvm.internal.f0.p(other, "other");
        this._real = (k() * other.k()) - (j() * other.j());
        this._imaginary = (k() * other.j()) + (other.k() * j());
        return this;
    }

    @dl.d
    public final ComplexDouble r() {
        double d10 = -1;
        this._real *= d10;
        this._imaginary *= d10;
        return this;
    }

    @dl.d
    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }
}
