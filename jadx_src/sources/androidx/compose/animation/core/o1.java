package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/o1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/i1;", "", ak.av, "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public interface o1<V extends p> extends i1<V> {

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @dl.d
        @Deprecated
        public static <V extends p> V a(@dl.d o1<V> o1Var, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
            kotlin.jvm.internal.f0.p(initialValue, "initialValue");
            kotlin.jvm.internal.f0.p(targetValue, "targetValue");
            kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
            return (V) h1.a(o1Var, initialValue, targetValue, initialVelocity);
        }

        @Deprecated
        public static <V extends p> boolean b(@dl.d o1<V> o1Var) {
            return n1.a(o1Var);
        }
    }

    @Override // androidx.compose.animation.core.i1
    boolean a();
}
