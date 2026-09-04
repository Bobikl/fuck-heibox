package androidx.compose.ui.graphics.colorspace;

import androidx.compose.animation.core.s;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.j, reason: from toString */
/* JADX INFO: compiled from: TransferParameters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003JO\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/j;", "", "", ak.av, "b", ak.aF, "d", "e", "f", "g", "gamma", RXScreenCaptureService.KEY_HEIGHT, "", "toString", "", "hashCode", "other", "", "equals", "D", "p", "()D", "j", "k", "l", "m", "n", "o", "<init>", "(DDDDDDD)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TransferParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double gamma;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double b;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double c;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double d;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double e;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double f;

    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x009a  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ba  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if ((r2 == 0.0d) == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TransferParameters(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.TransferParameters.<init>(double, double, double, double, double, double, double):void");
    }

    public /* synthetic */ TransferParameters(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, u uVar) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getGamma() {
        return this.gamma;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getA() {
        return this.a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getD() {
        return this.d;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) other;
        return f0.g(Double.valueOf(this.gamma), Double.valueOf(transferParameters.gamma)) && f0.g(Double.valueOf(this.a), Double.valueOf(transferParameters.a)) && f0.g(Double.valueOf(this.b), Double.valueOf(transferParameters.b)) && f0.g(Double.valueOf(this.c), Double.valueOf(transferParameters.c)) && f0.g(Double.valueOf(this.d), Double.valueOf(transferParameters.d)) && f0.g(Double.valueOf(this.e), Double.valueOf(transferParameters.e)) && f0.g(Double.valueOf(this.f), Double.valueOf(transferParameters.f));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getF() {
        return this.f;
    }

    @dl.d
    public final TransferParameters h(double gamma, double a10, double b10, double c10, double d10, double e10, double f10) {
        return new TransferParameters(gamma, a10, b10, c10, d10, e10, f10);
    }

    public int hashCode() {
        return (((((((((((s.a(this.gamma) * 31) + s.a(this.a)) * 31) + s.a(this.b)) * 31) + s.a(this.c)) * 31) + s.a(this.d)) * 31) + s.a(this.e)) * 31) + s.a(this.f);
    }

    public final double j() {
        return this.a;
    }

    public final double k() {
        return this.b;
    }

    public final double l() {
        return this.c;
    }

    public final double m() {
        return this.d;
    }

    public final double n() {
        return this.e;
    }

    public final double o() {
        return this.f;
    }

    public final double p() {
        return this.gamma;
    }

    @dl.d
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ')';
    }
}
