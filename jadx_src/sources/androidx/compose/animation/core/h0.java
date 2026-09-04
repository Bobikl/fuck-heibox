package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/h0;", "Landroidx/compose/animation/core/h;", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "b", "d", ak.aF, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "converter", "Landroidx/compose/animation/core/p1;", ak.av, "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface h0 extends h<Float> {

    /* JADX INFO: compiled from: FloatAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static float a(@dl.d h0 h0Var, float f10, float f11, float f12) {
            return g0.a(h0Var, f10, f11, f12);
        }

        @dl.d
        @Deprecated
        public static <V extends p> p1<V> b(@dl.d h0 h0Var, @dl.d f1<Float, V> converter) {
            kotlin.jvm.internal.f0.p(converter, "converter");
            return g0.c(h0Var, converter);
        }
    }

    @Override // androidx.compose.animation.core.h
    /* bridge */ /* synthetic */ i1 a(f1 f1Var);

    @Override // androidx.compose.animation.core.h
    @dl.d
    <V extends p> p1<V> a(@dl.d f1<Float, V> converter);

    float b(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);

    long c(float initialValue, float targetValue, float initialVelocity);

    float d(float initialValue, float targetValue, float initialVelocity);

    float e(long playTimeNanos, float initialValue, float targetValue, float initialVelocity);
}
