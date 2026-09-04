package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/p;", "Landroidx/compose/ui/graphics/y1;", "Landroid/graphics/RenderEffect;", "b", "Landroid/graphics/RenderEffect;", "d", "()Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class p extends y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RenderEffect androidRenderEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@dl.d RenderEffect androidRenderEffect) {
        super(null);
        kotlin.jvm.internal.f0.p(androidRenderEffect, "androidRenderEffect");
        this.androidRenderEffect = androidRenderEffect;
    }

    @Override // androidx.compose.ui.graphics.y1
    @dl.d
    /* JADX INFO: renamed from: b, reason: from getter */
    protected RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }

    @dl.d
    public final RenderEffect d() {
        return this.androidRenderEffect;
    }
}
