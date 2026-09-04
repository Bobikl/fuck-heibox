package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.z, reason: from toString */
/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B0\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/z;", "Landroidx/compose/ui/graphics/y1;", "Landroid/graphics/RenderEffect;", "b", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/y1;", "renderEffect", "", ak.aF, "F", "radiusX", "d", "radiusY", "Landroidx/compose/ui/graphics/m2;", "e", "I", "edgeTreatment", "<init>", "(Landroidx/compose/ui/graphics/y1;FFILkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class BlurEffect extends y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.e
    private final y1 renderEffect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float radiusX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float radiusY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int edgeTreatment;

    private BlurEffect(y1 y1Var, float f10, float f11, int i10) {
        super(null);
        this.renderEffect = y1Var;
        this.radiusX = f10;
        this.radiusY = f11;
        this.edgeTreatment = i10;
    }

    public /* synthetic */ BlurEffect(y1 y1Var, float f10, float f11, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(y1Var, f10, (i11 & 4) != 0 ? f10 : f11, (i11 & 8) != 0 ? m2.INSTANCE.a() : i10, null);
    }

    public /* synthetic */ BlurEffect(y1 y1Var, float f10, float f11, int i10, kotlin.jvm.internal.u uVar) {
        this(y1Var, f10, f11, i10);
    }

    @Override // androidx.compose.ui.graphics.y1
    @dl.d
    @androidx.annotation.w0(31)
    /* JADX INFO: renamed from: b */
    protected RenderEffect getAndroidRenderEffect() {
        return a2.f13654a.a(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) other;
        if (this.radiusX == blurEffect.radiusX) {
            return ((this.radiusY > blurEffect.radiusY ? 1 : (this.radiusY == blurEffect.radiusY ? 0 : -1)) == 0) && m2.h(this.edgeTreatment, blurEffect.edgeTreatment) && kotlin.jvm.internal.f0.g(this.renderEffect, blurEffect.renderEffect);
        }
        return false;
    }

    public int hashCode() {
        y1 y1Var = this.renderEffect;
        return ((((((y1Var != null ? y1Var.hashCode() : 0) * 31) + Float.floatToIntBits(this.radiusX)) * 31) + Float.floatToIntBits(this.radiusY)) * 31) + m2.i(this.edgeTreatment);
    }

    @dl.d
    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) m2.j(this.edgeTreatment)) + ')';
    }
}
