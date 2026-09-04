package androidx.compose.material.ripple;

import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.material.ripple.e, reason: from toString */
/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ripple/e;", "", "other", "", "equals", "", "hashCode", "", "toString", "", ak.av, "F", "()F", "draggedAlpha", "b", "focusedAlpha", ak.aF, "hoveredAlpha", "d", "pressedAlpha", "<init>", "(FFFF)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class RippleAlpha {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float draggedAlpha;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float focusedAlpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float hoveredAlpha;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float pressedAlpha;

    public RippleAlpha(float f10, float f11, float f12, float f13) {
        this.draggedAlpha = f10;
        this.focusedAlpha = f11;
        this.hoveredAlpha = f12;
        this.pressedAlpha = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDraggedAlpha() {
        return this.draggedAlpha;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getFocusedAlpha() {
        return this.focusedAlpha;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getHoveredAlpha() {
        return this.hoveredAlpha;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getPressedAlpha() {
        return this.pressedAlpha;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RippleAlpha)) {
            return false;
        }
        RippleAlpha rippleAlpha = (RippleAlpha) other;
        if (!(this.draggedAlpha == rippleAlpha.draggedAlpha)) {
            return false;
        }
        if (!(this.focusedAlpha == rippleAlpha.focusedAlpha)) {
            return false;
        }
        if (this.hoveredAlpha == rippleAlpha.hoveredAlpha) {
            return (this.pressedAlpha > rippleAlpha.pressedAlpha ? 1 : (this.pressedAlpha == rippleAlpha.pressedAlpha ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.draggedAlpha) * 31) + Float.floatToIntBits(this.focusedAlpha)) * 31) + Float.floatToIntBits(this.hoveredAlpha)) * 31) + Float.floatToIntBits(this.pressedAlpha);
    }

    @dl.d
    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.draggedAlpha + ", focusedAlpha=" + this.focusedAlpha + ", hoveredAlpha=" + this.hoveredAlpha + ", pressedAlpha=" + this.pressedAlpha + ')';
    }
}
