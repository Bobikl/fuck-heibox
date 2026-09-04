package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "value", "velocity", "Landroidx/compose/animation/core/q0;", ak.av, "(FF)J", "", "D", "VelocityThresholdMultiplier", "b", "F", "()F", "UNSET", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f4576a = 62.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f4577b = Float.MAX_VALUE;

    public static final long a(float f10, float f11) {
        return q0.b((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }

    public static final float b() {
        return f4577b;
    }
}
