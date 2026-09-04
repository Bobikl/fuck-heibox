package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J0\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R*\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u001d\u0010\u0011R$\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b!\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/animation/core/x0;", "", "Lkotlin/b2;", "e", "", "lastDisplacement", "lastVelocity", ak.av, "", "timeElapsed", "Landroidx/compose/animation/core/q0;", "i", "(FFJ)J", "F", ak.aF, "()F", "g", "(F)V", "finalPosition", "", "b", "D", "naturalFreq", "", "Z", "initialized", "d", "gammaPlus", "gammaMinus", "f", "dampedFreq", "value", "dampingRatio", RXScreenCaptureService.KEY_HEIGHT, "stiffness", "<init>", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private double gammaPlus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double gammaMinus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double dampedFreq;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public x0(float f10) {
        this.finalPosition = f10;
    }

    private final void e() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == y0.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f10 = this.dampingRatio;
        double d10 = ((double) f10) * ((double) f10);
        if (f10 > 1.0f) {
            double d11 = this.naturalFreq;
            double d12 = d10 - ((double) 1);
            this.gammaPlus = (((double) (-f10)) * d11) + (d11 * Math.sqrt(d12));
            double d13 = -this.dampingRatio;
            double d14 = this.naturalFreq;
            this.gammaMinus = (d13 * d14) - (d14 * Math.sqrt(d12));
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(((double) 1) - d10);
        }
        this.initialized = true;
    }

    public final float a(float lastDisplacement, float lastVelocity) {
        float f10 = lastDisplacement - this.finalPosition;
        double d10 = this.naturalFreq;
        return (float) (((-(d10 * d10)) * ((double) f10)) - (((d10 * 2.0d) * ((double) this.dampingRatio)) * ((double) lastVelocity)));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float d() {
        double d10 = this.naturalFreq;
        return (float) (d10 * d10);
    }

    public final void f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f10;
        this.initialized = false;
    }

    public final void g(float f10) {
        this.finalPosition = f10;
    }

    public final void h(float f10) {
        if (d() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f10);
        this.initialized = false;
    }

    public final long i(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        e();
        float f10 = lastDisplacement - this.finalPosition;
        double d10 = timeElapsed / 1000.0d;
        float f11 = this.dampingRatio;
        if (f11 > 1.0f) {
            double d11 = f10;
            double d12 = this.gammaMinus;
            double d13 = lastVelocity;
            double d14 = this.gammaPlus;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            dExp = (Math.exp(d12 * d10) * d15) + (Math.exp(this.gammaPlus * d10) * d16);
            double d17 = this.gammaMinus;
            double dExp2 = d15 * d17 * Math.exp(d17 * d10);
            double d18 = this.gammaPlus;
            dCos = dExp2 + (d16 * d18 * Math.exp(d18 * d10));
        } else {
            if (f11 == 1.0f) {
                double d19 = this.naturalFreq;
                double d20 = f10;
                double d21 = ((double) lastVelocity) + (d19 * d20);
                double d22 = d20 + (d21 * d10);
                double dExp3 = Math.exp((-d19) * d10) * d22;
                double dExp4 = d22 * Math.exp((-this.naturalFreq) * d10);
                double d23 = this.naturalFreq;
                dCos = (dExp4 * (-d23)) + (d21 * Math.exp((-d23) * d10));
                dExp = dExp3;
            } else {
                double d24 = ((double) 1) / this.dampedFreq;
                double d25 = this.naturalFreq;
                double d26 = f10;
                double d27 = d24 * ((((double) f11) * d25 * d26) + ((double) lastVelocity));
                double dExp5 = Math.exp(((double) (-f11)) * d25 * d10) * ((Math.cos(this.dampedFreq * d10) * d26) + (Math.sin(this.dampedFreq * d10) * d27));
                double d28 = this.naturalFreq;
                float f12 = this.dampingRatio;
                double d29 = (-d28) * dExp5 * ((double) f12);
                double dExp6 = Math.exp(((double) (-f12)) * d28 * d10);
                double d30 = this.dampedFreq;
                double dSin = (-d30) * d26 * Math.sin(d30 * d10);
                double d31 = this.dampedFreq;
                dCos = d29 + (dExp6 * (dSin + (d27 * d31 * Math.cos(d31 * d10))));
                dExp = dExp5;
            }
        }
        return y0.a((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
