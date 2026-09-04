package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/core/p1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/o1;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "d", ak.aF, "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "b", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", "Landroidx/compose/animation/core/r;", ak.av, "Landroidx/compose/animation/core/r;", "anims", "Landroidx/compose/animation/core/p;", "valueVector", "velocityVector", "endVelocityVector", "<init>", "(Landroidx/compose/animation/core/r;)V", "Landroidx/compose/animation/core/h0;", "anim", "(Landroidx/compose/animation/core/h0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class p1<V extends p> implements o1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4487e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r anims;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V endVelocityVector;

    /* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"androidx/compose/animation/core/p1$a", "Landroidx/compose/animation/core/r;", "", UCropPlusActivity.ARG_INDEX, "Landroidx/compose/animation/core/h0;", "get", "animation-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h0 f4492a;

        a(h0 h0Var) {
            this.f4492a = h0Var;
        }

        @Override // androidx.compose.animation.core.r
        @dl.d
        public h0 get(int index) {
            return this.f4492a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p1(@dl.d h0 anim) {
        this(new a(anim));
        kotlin.jvm.internal.f0.p(anim, "anim");
    }

    public p1(@dl.d r anims) {
        kotlin.jvm.internal.f0.p(anims, "anims");
        this.anims = anims;
    }

    @Override // androidx.compose.animation.core.o1, androidx.compose.animation.core.i1
    public /* synthetic */ boolean a() {
        return n1.a(this);
    }

    @Override // androidx.compose.animation.core.i1
    public long b(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        Iterator<Integer> it = fi.u.W1(0, initialValue.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.k0) it).nextInt();
            jMax = Math.max(jMax, this.anims.get(iNextInt).c(initialValue.a(iNextInt), targetValue.a(iNextInt), initialVelocity.a(iNextInt)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V c(@dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) q.g(initialVelocity);
        }
        V v10 = this.endVelocityVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("endVelocityVector");
            v10 = null;
        }
        int iB = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i10 = 0; i10 < iB; i10++) {
            V v11 = this.endVelocityVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("endVelocityVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).d(initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.endVelocityVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V d(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) q.g(initialVelocity);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("velocityVector");
            v10 = null;
        }
        int iB = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i10 = 0; i10 < iB; i10++) {
            V v11 = this.velocityVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("velocityVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).b(playTimeNanos, initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.velocityVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.i1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V targetValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(targetValue, "targetValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) q.g(initialValue);
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("valueVector");
            v10 = null;
        }
        int iB = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i10 = 0; i10 < iB; i10++) {
            V v11 = this.valueVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("valueVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).e(playTimeNanos, initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.valueVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("valueVector");
        return null;
    }
}
