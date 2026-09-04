package androidx.compose.ui.input.rotary;

import androidx.collection.k;
import androidx.compose.runtime.internal.o;
import androidx.compose.ui.g;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import f1.b;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.input.rotary.a, reason: from toString */
/* JADX INFO: compiled from: RotaryScrollEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@g
@o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/rotary/a;", "Lf1/b;", "", "other", "", "equals", "", "hashCode", "", "toString", "", ak.av, "F", ak.aF, "()F", "verticalScrollPixels", "b", "horizontalScrollPixels", "", "J", "()J", "uptimeMillis", "<init>", "(FFJ)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class RotaryScrollEvent implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14860d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float verticalScrollPixels;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float horizontalScrollPixels;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long uptimeMillis;

    public RotaryScrollEvent(float f10, float f11, long j10) {
        this.verticalScrollPixels = f10;
        this.horizontalScrollPixels = f11;
        this.uptimeMillis = j10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public boolean equals(@e Object other) {
        if (other instanceof RotaryScrollEvent) {
            RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) other;
            if (rotaryScrollEvent.verticalScrollPixels == this.verticalScrollPixels) {
                if ((rotaryScrollEvent.horizontalScrollPixels == this.horizontalScrollPixels) && rotaryScrollEvent.uptimeMillis == this.uptimeMillis) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((0 + Float.floatToIntBits(this.verticalScrollPixels)) * 31) + Float.floatToIntBits(this.horizontalScrollPixels)) * 31) + k.a(this.uptimeMillis);
    }

    @d
    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.verticalScrollPixels + ",horizontalScrollPixels=" + this.horizontalScrollPixels + ",uptimeMillis=" + this.uptimeMillis + ')';
    }
}
