package androidx.compose.animation.core;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Easing.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/core/v;", "Landroidx/compose/animation/core/b0;", "", ak.av, "b", "m", Progress.G, "", "other", "", "equals", "", "hashCode", "F", ak.aF, "d", "<init>", "(FFFF)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class v implements b0 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public v(float f10, float f11, float f12, float f13) {
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        if ((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + lg.a.f131414g).toString());
    }

    private final float b(float a10, float b10, float m10) {
        float f10 = 3;
        float f11 = 1 - m10;
        return (a10 * f10 * f11 * f11 * m10) + (f10 * b10 * f11 * m10 * m10) + (m10 * m10 * m10);
    }

    @Override // androidx.compose.animation.core.b0
    public float a(float fraction) {
        float f10 = 0.0f;
        if (fraction > 0.0f) {
            float f11 = 1.0f;
            if (fraction < 1.0f) {
                while (true) {
                    float f12 = (f10 + f11) / 2;
                    float fB = b(this.a, this.c, f12);
                    if (Math.abs(fraction - fB) < 0.001f) {
                        return b(this.b, this.d, f12);
                    }
                    if (fB < fraction) {
                        f10 = f12;
                    } else {
                        f11 = f12;
                    }
                }
            }
        }
        return fraction;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof v) {
            v vVar = (v) other;
            if (this.a == vVar.a) {
                if (this.b == vVar.b) {
                    if (this.c == vVar.c) {
                        if (this.d == vVar.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }
}
