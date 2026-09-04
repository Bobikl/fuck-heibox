package androidx.compose.animation.core;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u0011\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002\u001a3\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/i1;", "initialValue", "targetValue", "initialVelocity", "", "e", "(Landroidx/compose/animation/core/i1;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", "playTimeMillis", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "startVelocity", "f", "(Landroidx/compose/animation/core/i1;JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "Landroidx/compose/animation/core/m1;", "playTime", ak.aF, "visibilityThreshold", "", "dampingRatio", "stiffness", "Landroidx/compose/animation/core/r;", "d", "(Landroidx/compose/animation/core/p;FF)Landroidx/compose/animation/core/r;", "", ak.av, "I", "InfiniteIterations", "animation-core_release"}, k = 2, mv = {1, 7, 1})
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f4441a = Integer.MAX_VALUE;

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/animation/core/j1$a", "Landroidx/compose/animation/core/r;", "", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/animation/core/l0;", ak.av, "", "Ljava/util/List;", "anims", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<l0> anims;

        /* JADX WARN: Incorrect types in method signature: (TV;FF)V */
        a(p pVar, float f10, float f11) {
            fi.l lVarW1 = fi.u.W1(0, pVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String());
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(lVarW1, 10));
            Iterator<Integer> it = lVarW1.iterator();
            while (it.hasNext()) {
                arrayList.add(new l0(f10, f11, pVar.a(((kotlin.collections.k0) it).nextInt())));
            }
            this.anims = arrayList;
        }

        @Override // androidx.compose.animation.core.r
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 get(int index) {
            return this.anims.get(index);
        }
    }

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/animation/core/j1$b", "Landroidx/compose/animation/core/r;", "", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/animation/core/l0;", ak.av, "Landroidx/compose/animation/core/l0;", "anim", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final l0 anim;

        b(float f10, float f11) {
            this.anim = new l0(f10, f11, 0.0f, 4, null);
        }

        @Override // androidx.compose.animation.core.r
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 get(int index) {
            return this.anim;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(m1<?> m1Var, long j10) {
        return fi.u.K(j10 - ((long) m1Var.getDelayMillis()), 0L, m1Var.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V extends p> r d(V v10, float f10, float f11) {
        return v10 != null ? new a(v10, f10, f11) : new b(f10, f11);
    }

    public static final <V extends p> long e(@dl.d i1<V> i1Var, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(i1Var, "<this>");
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        return i1Var.b(initialValue, targetValue, initialVelocity) / 1000000;
    }

    @dl.d
    public static final <V extends p> V f(@dl.d i1<V> i1Var, long j10, @dl.d V start, @dl.d V end, @dl.d V startVelocity) {
        kotlin.jvm.internal.f0.p(i1Var, "<this>");
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(end, "end");
        kotlin.jvm.internal.f0.p(startVelocity, "startVelocity");
        return (V) i1Var.e(j10 * 1000000, start, end, startVelocity);
    }
}
