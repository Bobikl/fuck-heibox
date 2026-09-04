package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.e1, reason: from toString */
/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001c\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001d\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/e1;", "Landroidx/compose/ui/graphics/y1;", "Landroid/graphics/RenderEffect;", "b", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "Lb1/f;", ak.aF, "J", androidx.constraintlayout.core.motion.utils.w.c.R, "<init>", "(Landroidx/compose/ui/graphics/y1;JLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class OffsetEffect extends y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final y1 renderEffect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offset;

    private OffsetEffect(y1 y1Var, long j10) {
        super(null);
        this.renderEffect = y1Var;
        this.offset = j10;
    }

    public /* synthetic */ OffsetEffect(y1 y1Var, long j10, kotlin.jvm.internal.u uVar) {
        this(y1Var, j10);
    }

    @Override // androidx.compose.ui.graphics.y1
    @dl.d
    @androidx.annotation.w0(31)
    /* JADX INFO: renamed from: b */
    protected RenderEffect getAndroidRenderEffect() {
        return a2.f13654a.b(this.renderEffect, this.offset);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) other;
        return kotlin.jvm.internal.f0.g(this.renderEffect, offsetEffect.renderEffect) && b1.f.l(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        y1 y1Var = this.renderEffect;
        return ((y1Var != null ? y1Var.hashCode() : 0) * 31) + b1.f.s(this.offset);
    }

    @dl.d
    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) b1.f.y(this.offset)) + ')';
    }
}
