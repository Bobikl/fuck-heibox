package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001d\u001a\u00028\u0000\u0012\u0006\u0010\u001f\u001a\u00028\u0000\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b+\u0010,BG\b\u0016\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000-\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001d\u001a\u00028\u0000\u0012\u0006\u0010\u001f\u001a\u00028\u0000\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b+\u0010.J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010#\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010&\u001a\u00020\u00058VX\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b\u0019\u0010%R\u0014\u0010'\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010*\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010)¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/c1;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/d;", "", "playTimeNanos", "e", "(J)Ljava/lang/Object;", "g", "(J)Landroidx/compose/animation/core/p;", "", "toString", "Landroidx/compose/animation/core/i1;", ak.av, "Landroidx/compose/animation/core/i1;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/animation/core/i1;", "animationSpec", "Landroidx/compose/animation/core/f1;", "b", "Landroidx/compose/animation/core/f1;", "d", "()Landroidx/compose/animation/core/f1;", "typeConverter", ak.aF, "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "initialValue", "f", "targetValue", "Landroidx/compose/animation/core/p;", "initialValueVector", "targetValueVector", "initialVelocityVector", "J", "()J", "durationNanos", "endVelocity", "", "()Z", "isInfinite", "<init>", "(Landroidx/compose/animation/core/i1;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/p;)V", "Landroidx/compose/animation/core/h;", "(Landroidx/compose/animation/core/h;Landroidx/compose/animation/core/f1;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/p;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class c1<T, V extends p> implements d<T, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4395j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final i1<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V initialValueVector;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V targetValueVector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V initialVelocityVector;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final V endVelocity;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(@dl.d h<T> animationSpec, @dl.d f1<T, V> typeConverter, T t10, T t11, @dl.e V v10) {
        this(animationSpec.a(typeConverter), typeConverter, t10, t11, v10);
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
    }

    public /* synthetic */ c1(h hVar, f1 f1Var, Object obj, Object obj2, p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this((h<Object>) hVar, (f1<Object, p>) f1Var, obj, obj2, (i10 & 16) != 0 ? null : pVar);
    }

    public c1(@dl.d i1<V> animationSpec, @dl.d f1<T, V> typeConverter, T t10, T t11, @dl.e V v10) {
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t10;
        this.targetValue = t11;
        V vInvoke = d().a().invoke(t10);
        this.initialValueVector = vInvoke;
        V vInvoke2 = d().a().invoke(f());
        this.targetValueVector = vInvoke2;
        V v11 = (v10 == null || (v11 = (V) q.e(v10)) == null) ? (V) q.g(d().a().invoke(t10)) : v11;
        this.initialVelocityVector = v11;
        this.durationNanos = animationSpec.b(vInvoke, vInvoke2, v11);
        this.endVelocity = (V) animationSpec.c(vInvoke, vInvoke2, v11);
    }

    public /* synthetic */ c1(i1 i1Var, f1 f1Var, Object obj, Object obj2, p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i1<p>) i1Var, (f1<Object, p>) f1Var, obj, obj2, (i10 & 16) != 0 ? null : pVar);
    }

    @Override // androidx.compose.animation.core.d
    /* JADX INFO: renamed from: a */
    public boolean getIsInfinite() {
        return this.animationSpec.a();
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
        if (b(playTimeNanos)) {
            return f();
        }
        p pVarE = this.animationSpec.e(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int i10 = pVarE.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        for (int i11 = 0; i11 < i10; i11++) {
            if (!(!Float.isNaN(pVarE.a(i11)))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + pVarE + ". Animation: " + this + ", playTimeNanos: " + playTimeNanos).toString());
            }
        }
        return (T) d().b().invoke(pVarE);
    }

    @Override // androidx.compose.animation.core.d
    public T f() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.d
    @dl.d
    public V g(long playTimeNanos) {
        return !b(playTimeNanos) ? (V) this.animationSpec.d(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @dl.d
    public final i1<V> h() {
        return this.animationSpec;
    }

    public final T i() {
        return this.initialValue;
    }

    @dl.d
    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + f() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.e(this) + " ms,animationSpec: " + this.animationSpec;
    }
}
