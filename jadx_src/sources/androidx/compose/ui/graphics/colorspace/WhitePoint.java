package androidx.compose.ui.graphics.colorspace;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.k, reason: from toString */
/* JADX INFO: compiled from: WhitePoint.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0019B)\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/k;", "", "", "g", "()[F", "", ak.av, "b", "x", "y", ak.aF, "", "toString", "", "hashCode", "other", "", "equals", "F", "e", "()F", "f", "<init>", "(FF)V", ak.aD, "(FFF)V", "sum", "(FFFF)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class WhitePoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float y;

    public WhitePoint(float f10, float f11) {
        this.x = f10;
        this.y = f11;
    }

    public WhitePoint(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private WhitePoint(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }

    public static /* synthetic */ WhitePoint d(WhitePoint whitePoint, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = whitePoint.x;
        }
        if ((i10 & 2) != 0) {
            f11 = whitePoint.y;
        }
        return whitePoint.c(f10, f11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @dl.d
    public final WhitePoint c(float x10, float y10) {
        return new WhitePoint(x10, y10);
    }

    public final float e() {
        return this.x;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) other;
        return f0.g(Float.valueOf(this.x), Float.valueOf(whitePoint.x)) && f0.g(Float.valueOf(this.y), Float.valueOf(whitePoint.y));
    }

    public final float f() {
        return this.y;
    }

    @dl.d
    public final float[] g() {
        float f10 = this.x;
        float f11 = this.y;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.x) * 31) + Float.floatToIntBits(this.y);
    }

    @dl.d
    public String toString() {
        return "WhitePoint(x=" + this.x + ", y=" + this.y + ')';
    }
}
