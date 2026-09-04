package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/e1;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/a0;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "converter", "Landroidx/compose/animation/core/w1;", "i", "", "other", "", "equals", "", "hashCode", ak.av, "I", "g", "()I", "durationMillis", "b", "f", "delay", "Landroidx/compose/animation/core/b0;", ak.aF, "Landroidx/compose/animation/core/b0;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/animation/core/b0;", "easing", "<init>", "(IILandroidx/compose/animation/core/b0;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class e1<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final b0 easing;

    public e1() {
        this(0, 0, null, 7, null);
    }

    public e1(int i10, int i11, @dl.d b0 easing) {
        kotlin.jvm.internal.f0.p(easing, "easing");
        this.durationMillis = i10;
        this.delay = i11;
        this.easing = easing;
    }

    public /* synthetic */ e1(int i10, int i11, b0 b0Var, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? d0.b() : b0Var);
    }

    public boolean equals(@dl.e Object other) {
        if (!(other instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) other;
        return e1Var.durationMillis == this.durationMillis && e1Var.delay == this.delay && kotlin.jvm.internal.f0.g(e1Var.easing, this.easing);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @dl.d
    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getEasing() {
        return this.easing;
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    @Override // androidx.compose.animation.core.f0, androidx.compose.animation.core.h
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends p> w1<V> a(@dl.d f1<T, V> converter) {
        kotlin.jvm.internal.f0.p(converter, "converter");
        return new w1<>(this.durationMillis, this.delay, this.easing);
    }
}
