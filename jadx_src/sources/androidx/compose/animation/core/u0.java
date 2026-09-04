package androidx.compose.animation.core;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&B4\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010$\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b%\u0010'J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010$\u001a\u00020\u001f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/animation/core/u0;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/f0;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "converter", "Landroidx/compose/animation/core/o1;", ak.av, "", "other", "", "equals", "", "hashCode", "I", RXScreenCaptureService.KEY_HEIGHT, "()I", "iterations", "Landroidx/compose/animation/core/a0;", "b", "Landroidx/compose/animation/core/a0;", "f", "()Landroidx/compose/animation/core/a0;", "animation", "Landroidx/compose/animation/core/RepeatMode;", ak.aF, "Landroidx/compose/animation/core/RepeatMode;", "i", "()Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/a1;", "d", "J", "g", "()J", "initialStartOffset", "<init>", "(ILandroidx/compose/animation/core/a0;Landroidx/compose/animation/core/RepeatMode;)V", "(ILandroidx/compose/animation/core/a0;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/u;)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class u0<T> implements f0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int iterations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a0<T> animation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RepeatMode repeatMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ u0(int i10, a0 animation, RepeatMode repeatMode) {
        this(i10, animation, repeatMode, a1.d(0, 0, 2, null), (kotlin.jvm.internal.u) null);
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(repeatMode, "repeatMode");
    }

    public /* synthetic */ u0(int i10, a0 a0Var, RepeatMode repeatMode, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, a0Var, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    private u0(int i10, a0<T> a0Var, RepeatMode repeatMode, long j10) {
        this.iterations = i10;
        this.animation = a0Var;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j10;
    }

    public /* synthetic */ u0(int i10, a0 a0Var, RepeatMode repeatMode, long j10, int i11, kotlin.jvm.internal.u uVar) {
        this(i10, a0Var, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 8) != 0 ? a1.d(0, 0, 2, null) : j10, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ u0(int i10, a0 a0Var, RepeatMode repeatMode, long j10, kotlin.jvm.internal.u uVar) {
        this(i10, a0Var, repeatMode, j10);
    }

    @Override // androidx.compose.animation.core.h
    @dl.d
    public <V extends p> o1<V> a(@dl.d f1<T, V> converter) {
        kotlin.jvm.internal.f0.p(converter, "converter");
        return new t1(this.iterations, this.animation.a((f1) converter), this.repeatMode, this.initialStartOffset, (kotlin.jvm.internal.u) null);
    }

    public boolean equals(@dl.e Object other) {
        if (!(other instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) other;
        return u0Var.iterations == this.iterations && kotlin.jvm.internal.f0.g(u0Var.animation, this.animation) && u0Var.repeatMode == this.repeatMode && a1.f(u0Var.initialStartOffset, this.initialStartOffset);
    }

    @dl.d
    public final a0<T> f() {
        return this.animation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getInitialStartOffset() {
        return this.initialStartOffset;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getIterations() {
        return this.iterations;
    }

    public int hashCode() {
        return (((((this.iterations * 31) + this.animation.hashCode()) * 31) + this.repeatMode.hashCode()) * 31) + a1.i(this.initialStartOffset);
    }

    @dl.d
    /* JADX INFO: renamed from: i, reason: from getter */
    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }
}
