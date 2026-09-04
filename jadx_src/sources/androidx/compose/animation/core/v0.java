package androidx.compose.animation.core;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/v0;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/a0;", "Landroidx/compose/animation/core/p;", androidx.exifinterface.media.a.X4, "Landroidx/compose/animation/core/f1;", "converter", "Landroidx/compose/animation/core/m1;", ak.av, "", "other", "", "equals", "", "hashCode", "I", "f", "()I", "delay", "<init>", "(I)V", "animation-core_release"}, k = 1, mv = {1, 7, 1})
public final class v0<T> implements a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    public v0() {
        this(0, 1, null);
    }

    public v0(int i10) {
        this.delay = i10;
    }

    public /* synthetic */ v0(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // androidx.compose.animation.core.f0, androidx.compose.animation.core.h
    @dl.d
    public <V extends p> m1<V> a(@dl.d f1<T, V> converter) {
        kotlin.jvm.internal.f0.p(converter, "converter");
        return new u1(this.delay);
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof v0) && ((v0) other).delay == this.delay;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }
}
