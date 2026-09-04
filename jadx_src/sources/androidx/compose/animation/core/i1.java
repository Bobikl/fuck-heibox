package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/i1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "d", "b", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", ak.aF, "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "", ak.av, "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface i1<V extends p> {

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.d
        @Deprecated
        public static <V extends p> V a(@dl.d i1<V> i1Var, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
            kotlin.jvm.internal.f0.p(initialValue, "initialValue");
            kotlin.jvm.internal.f0.p(targetValue, "targetValue");
            kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
            return (V) h1.a(i1Var, initialValue, targetValue, initialVelocity);
        }
    }

    boolean a();

    long b(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity);

    @dl.d
    V c(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity);

    @dl.d
    V d(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity);

    @dl.d
    V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity);
}
