package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/z0;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/f0;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "converter", "Landroidx/compose/animation/core/v1;", "i", "", "other", "", "equals", "", "hashCode", "", ak.av, "F", "f", "()F", "dampingRatio", "b", "g", "stiffness", ak.aF, "Ljava/lang/Object;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/lang/Object;", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class z0<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final T visibilityThreshold;

    public z0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public z0(float f10, float f11, @dl.e T t10) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.visibilityThreshold = t10;
    }

    public /* synthetic */ z0(float f10, float f11, Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof z0) {
            z0 z0Var = (z0) other;
            if (z0Var.dampingRatio == this.dampingRatio) {
                if ((z0Var.stiffness == this.stiffness) && kotlin.jvm.internal.f0.g(z0Var.visibilityThreshold, this.visibilityThreshold)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    @dl.e
    public final T h() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t10 = this.visibilityThreshold;
        return ((((t10 != null ? t10.hashCode() : 0) * 31) + Float.floatToIntBits(this.dampingRatio)) * 31) + Float.floatToIntBits(this.stiffness);
    }

    @Override // androidx.compose.animation.core.f0, androidx.compose.animation.core.h
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends p> v1<V> a(@dl.d f1<T, V> converter) {
        kotlin.jvm.internal.f0.p(converter, "converter");
        return new v1<>(this.dampingRatio, this.stiffness, i.b(converter, this.visibilityThreshold));
    }
}
