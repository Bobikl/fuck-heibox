package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&R\u0014\u0010\r\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/core/i0;", "", "", "playTimeNanos", "", "initialValue", "initialVelocity", "e", ak.aF, "b", "d", ak.av, "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface i0 {
    float a();

    float b(long playTimeNanos, float initialValue, float initialVelocity);

    long c(float initialValue, float initialVelocity);

    float d(float initialValue, float initialVelocity);

    float e(long playTimeNanos, float initialValue, float initialVelocity);
}
