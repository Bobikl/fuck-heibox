package androidx.compose.animation;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@j
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/animation/e;", "", "Landroidx/compose/animation/f;", ak.av, "Landroidx/compose/animation/f;", ak.aF, "()Landroidx/compose/animation/f;", "targetContentEnter", "Landroidx/compose/animation/h;", "b", "Landroidx/compose/animation/h;", "()Landroidx/compose/animation/h;", "initialContentExit", "", "<set-?>", "Landroidx/compose/runtime/a1;", "d", "()F", "f", "(F)V", "targetContentZIndex", "Landroidx/compose/animation/r;", "Landroidx/compose/animation/r;", "()Landroidx/compose/animation/r;", "e", "(Landroidx/compose/animation/r;)V", "sizeTransform", "<init>", "(Landroidx/compose/animation/f;Landroidx/compose/animation/h;FLandroidx/compose/animation/r;)V", "animation_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4583e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f targetContentEnter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final h initialContentExit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1 targetContentZIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private r sizeTransform;

    public e(@dl.d f targetContentEnter, @dl.d h initialContentExit, float f10, @dl.e r rVar) {
        f0.p(targetContentEnter, "targetContentEnter");
        f0.p(initialContentExit, "initialContentExit");
        this.targetContentEnter = targetContentEnter;
        this.initialContentExit = initialContentExit;
        this.targetContentZIndex = h2.g(Float.valueOf(f10), null, 2, null);
        this.sizeTransform = rVar;
    }

    public /* synthetic */ e(f fVar, h hVar, float f10, r rVar, int i10, kotlin.jvm.internal.u uVar) {
        this(fVar, hVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? AnimatedContentKt.d(false, null, 3, null) : rVar);
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getInitialContentExit() {
        return this.initialContentExit;
    }

    @dl.e
    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getSizeTransform() {
        return this.sizeTransform;
    }

    @dl.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getTargetContentEnter() {
        return this.targetContentEnter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float d() {
        return ((Number) this.targetContentZIndex.getValue()).floatValue();
    }

    public final void e(@dl.e r rVar) {
        this.sizeTransform = rVar;
    }

    public final void f(float f10) {
        this.targetContentZIndex.setValue(Float.valueOf(f10));
    }
}
