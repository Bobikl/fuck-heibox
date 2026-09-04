package androidx.compose.animation;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FlingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"", "friction", "density", ak.aF, ak.av, "F", "GravityEarth", "b", "InchesPerMeter", "DecelerationRate", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f4603a = 9.80665f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f4604b = 39.37f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f4605c = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f10, float f11) {
        return f11 * 386.0878f * 160.0f * f10;
    }
}
