package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/m1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/o1;", "initialValue", "targetValue", "initialVelocity", "", "b", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", "", "g", "()I", "durationMillis", "f", "delayMillis", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface m1<V extends p> extends o1<V> {

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static <V extends p> long a(@dl.d m1<V> m1Var, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
            kotlin.jvm.internal.f0.p(initialValue, "initialValue");
            kotlin.jvm.internal.f0.p(targetValue, "targetValue");
            kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
            return l1.a(m1Var, initialValue, targetValue, initialVelocity);
        }

        @dl.d
        @Deprecated
        public static <V extends p> V b(@dl.d m1<V> m1Var, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
            kotlin.jvm.internal.f0.p(initialValue, "initialValue");
            kotlin.jvm.internal.f0.p(targetValue, "targetValue");
            kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
            return (V) h1.a(m1Var, initialValue, targetValue, initialVelocity);
        }

        @Deprecated
        public static <V extends p> boolean c(@dl.d m1<V> m1Var) {
            return n1.a(m1Var);
        }
    }

    @Override // androidx.compose.animation.core.i1
    long b(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity);

    int f();

    int g();
}
