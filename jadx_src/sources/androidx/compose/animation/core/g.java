package androidx.compose.animation.core;

import androidx.compose.animation.core.p;
import androidx.compose.runtime.h2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u00102\u001a\u00028\u0000\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u00103\u001a\u00028\u0001\u0012\u0006\u0010'\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u00100\u001a\u00020+\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000504¢\u0006\u0004\b6\u00107J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u001dR*\u0010$\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010'\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00138F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017\"\u0004\b%\u0010&R*\u0010*\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00138F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0015\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b)\u0010&R+\u00100\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020+8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00101\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010\u0011¨\u00068"}, d2 = {"Landroidx/compose/animation/core/g;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "", "Lkotlin/b2;", ak.av, "Landroidx/compose/animation/core/j;", "p", "Landroidx/compose/animation/core/f1;", "Landroidx/compose/animation/core/f1;", "f", "()Landroidx/compose/animation/core/f1;", "typeConverter", "b", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "targetValue", "", ak.aF, "J", "d", "()J", "startTimeNanos", "<set-?>", "Landroidx/compose/runtime/a1;", "g", "n", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/animation/core/p;", "i", "()Landroidx/compose/animation/core/p;", "o", "(Landroidx/compose/animation/core/p;)V", "velocityVector", "l", "(J)V", "lastFrameTimeNanos", RXScreenCaptureService.KEY_HEIGHT, "k", "finishedTimeNanos", "", "j", "()Z", "m", "(Z)V", "isRunning", "velocity", "initialValue", "initialVelocityVector", "Lkotlin/Function0;", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/f1;Landroidx/compose/animation/core/p;JLjava/lang/Object;JZLyh/a;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class g<T, V extends p> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4421j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f1<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T targetValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long startTimeNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f4425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private V velocityVector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long finishedTimeNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 isRunning;

    public g(T t10, @dl.d f1<T, V> typeConverter, @dl.d V initialVelocityVector, long j10, T t11, long j11, boolean z10, @dl.d yh.a<b2> onCancel) {
        kotlin.jvm.internal.f0.p(typeConverter, "typeConverter");
        kotlin.jvm.internal.f0.p(initialVelocityVector, "initialVelocityVector");
        kotlin.jvm.internal.f0.p(onCancel, "onCancel");
        this.typeConverter = typeConverter;
        this.targetValue = t11;
        this.startTimeNanos = j11;
        this.f4425d = onCancel;
        this.value = h2.g(t10, null, 2, null);
        this.velocityVector = (V) q.e(initialVelocityVector);
        this.lastFrameTimeNanos = j10;
        this.finishedTimeNanos = Long.MIN_VALUE;
        this.isRunning = h2.g(Boolean.valueOf(z10), null, 2, null);
    }

    public final void a() {
        m(false);
        this.f4425d.invoke();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T e() {
        return this.targetValue;
    }

    @dl.d
    public final f1<T, V> f() {
        return this.typeConverter;
    }

    public final T g() {
        return this.value.getValue();
    }

    public final T h() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    @dl.d
    public final V i() {
        return this.velocityVector;
    }

    public final boolean j() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void k(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void l(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public final void m(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void n(T t10) {
        this.value.setValue(t10);
    }

    public final void o(@dl.d V v10) {
        kotlin.jvm.internal.f0.p(v10, "<set-?>");
        this.velocityVector = v10;
    }

    @dl.d
    public final AnimationState<T, V> p() {
        return new AnimationState<>(this.typeConverter, g(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, j());
    }
}
