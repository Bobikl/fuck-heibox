package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\tJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0017\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/q1;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/k1;", "", "playTimeNanos", "initialValue", "initialVelocity", "e", "(JLandroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", ak.aF, "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)J", "b", "d", "(Landroidx/compose/animation/core/p;Landroidx/compose/animation/core/p;)Landroidx/compose/animation/core/p;", "Landroidx/compose/animation/core/i0;", ak.av, "Landroidx/compose/animation/core/i0;", "f", "()Landroidx/compose/animation/core/i0;", "floatDecaySpec", "Landroidx/compose/animation/core/p;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "<init>", "(Landroidx/compose/animation/core/i0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class q1<V extends p> implements k1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i0 floatDecaySpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V targetVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float absVelocityThreshold;

    public q1(@dl.d i0 floatDecaySpec) {
        kotlin.jvm.internal.f0.p(floatDecaySpec, "floatDecaySpec");
        this.floatDecaySpec = floatDecaySpec;
        this.absVelocityThreshold = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.k1
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.k1
    @dl.d
    public V b(long playTimeNanos, @dl.d V initialValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) q.g(initialValue);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("velocityVector");
            v10 = null;
        }
        int i10 = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            V v11 = this.velocityVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("velocityVector");
                v11 = null;
            }
            v11.e(i11, this.floatDecaySpec.b(playTimeNanos, initialValue.a(i11), initialVelocity.a(i11)));
        }
        V v12 = this.velocityVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.k1
    public long c(@dl.d V initialValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) q.g(initialValue);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("velocityVector");
            v10 = null;
        }
        int i10 = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        long jMax = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.floatDecaySpec.c(initialValue.a(i11), initialVelocity.a(i11)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.k1
    @dl.d
    public V d(@dl.d V initialValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.targetVector == null) {
            this.targetVector = (V) q.g(initialValue);
        }
        V v10 = this.targetVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("targetVector");
            v10 = null;
        }
        int i10 = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            V v11 = this.targetVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("targetVector");
                v11 = null;
            }
            v11.e(i11, this.floatDecaySpec.d(initialValue.a(i11), initialVelocity.a(i11)));
        }
        V v12 = this.targetVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.k1
    @dl.d
    public V e(long playTimeNanos, @dl.d V initialValue, @dl.d V initialVelocity) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        kotlin.jvm.internal.f0.p(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) q.g(initialValue);
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            kotlin.jvm.internal.f0.S("valueVector");
            v10 = null;
        }
        int i10 = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            V v11 = this.valueVector;
            if (v11 == null) {
                kotlin.jvm.internal.f0.S("valueVector");
                v11 = null;
            }
            v11.e(i11, this.floatDecaySpec.e(playTimeNanos, initialValue.a(i11), initialVelocity.a(i11)));
        }
        V v12 = this.valueVector;
        if (v12 != null) {
            return v12;
        }
        kotlin.jvm.internal.f0.S("valueVector");
        return null;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final i0 getFloatDecaySpec() {
        return this.floatDecaySpec;
    }
}
