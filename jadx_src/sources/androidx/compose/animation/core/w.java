package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0010\u0019\u001a\u00028\u0000\u0012\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0004\b)\u0010*B;\b\u0016\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0010\u0019\u001a\u00028\u0000\u0012\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0004\b)\u0010,B;\b\u0016\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0010\u0019\u001a\u00028\u0000\u0012\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b)\u0010.J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0017\u0010\u001e\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010!\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010$\u001a\u00020\u00058VX\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b\u0015\u0010#R\u001a\u0010(\u001a\u00020%8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b\f\u0010'¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/w;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/d;", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Landroidx/compose/animation/core/p;", "Landroidx/compose/animation/core/k1;", ak.av, "Landroidx/compose/animation/core/k1;", "animationSpec", "Landroidx/compose/animation/core/f1;", "b", "Landroidx/compose/animation/core/f1;", "d", "()Landroidx/compose/animation/core/f1;", "typeConverter", ak.aF, "Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "initialValue", "Landroidx/compose/animation/core/p;", "initialValueVector", "i", "()Landroidx/compose/animation/core/p;", "initialVelocityVector", "f", "endVelocity", "targetValue", "J", "()J", "durationNanos", "", "Z", "()Z", "isInfinite", "<init>", "(Landroidx/compose/animation/core/k1;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Landroidx/compose/animation/core/p;)V", "Landroidx/compose/animation/core/x;", "(Landroidx/compose/animation/core/x;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Landroidx/compose/animation/core/p;)V", "initialVelocity", "(Landroidx/compose/animation/core/x;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class w<T, V extends p> implements d<T, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4537j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final k1<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V initialValueVector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V initialVelocityVector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V endVelocity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isInfinite;

    public w(@dl.d k1<V> animationSpec, @dl.d f1<T, V> typeConverter, T t10, @dl.d V initialVelocityVector) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(initialVelocityVector, "initialVelocityVector");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t10;
        V vInvoke = d().a().invoke(t10);
        this.initialValueVector = vInvoke;
        this.initialVelocityVector = (V) q.e(initialVelocityVector);
        this.targetValue = (T) d().b().invoke(animationSpec.d(vInvoke, initialVelocityVector));
        this.durationNanos = animationSpec.c(vInvoke, initialVelocityVector);
        V v10 = (V) q.e(animationSpec.b(getDurationNanos(), vInvoke, initialVelocityVector));
        this.endVelocity = v10;
        int i10 = v10.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            V v11 = this.endVelocity;
            v11.e(i11, fi.u.H(v11.a(i11), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@dl.d x<T> animationSpec, @dl.d f1<T, V> typeConverter, T t10, @dl.d V initialVelocityVector) {
        this(animationSpec.a(typeConverter), typeConverter, t10, initialVelocityVector);
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(initialVelocityVector, "initialVelocityVector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(@dl.d x<T> animationSpec, @dl.d f1<T, V> typeConverter, T t10, T t11) {
        this(animationSpec.a(typeConverter), typeConverter, t10, typeConverter.a().invoke(t11));
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
    }

    @Override // androidx.compose.animation.core.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsInfinite() {
        return this.isInfinite;
    }

    @Override // androidx.compose.animation.core.d
    public /* synthetic */ boolean b(long j10) {
        return c.a(this, j10);
    }

    @Override // androidx.compose.animation.core.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.d
    @dl.d
    public f1<T, V> d() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.d
    public T e(long playTimeNanos) {
        return !b(playTimeNanos) ? (T) d().b().invoke(this.animationSpec.e(playTimeNanos, this.initialValueVector, this.initialVelocityVector)) : f();
    }

    @Override // androidx.compose.animation.core.d
    public T f() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.d
    @dl.d
    public V g(long playTimeNanos) {
        return !b(playTimeNanos) ? (V) this.animationSpec.b(playTimeNanos, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    public final T h() {
        return this.initialValue;
    }

    @dl.d
    public final V i() {
        return this.initialVelocityVector;
    }
}
