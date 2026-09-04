package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.c, reason: from toString */
/* JADX INFO: compiled from: BrushPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u00020\u001d8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/painter/c;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "k", "", "alpha", "", ak.av, "Landroidx/compose/ui/graphics/m0;", "colorFilter", "b", "", "other", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/a0;", "g", "Landroidx/compose/ui/graphics/a0;", "l", "()Landroidx/compose/ui/graphics/a0;", "brush", RXScreenCaptureService.KEY_HEIGHT, "F", "i", "Landroidx/compose/ui/graphics/m0;", "Lb1/m;", "()J", "intrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/a0;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class BrushPainter extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final a0 brush;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @e
    private m0 colorFilter;

    public BrushPainter(@dl.d a0 brush) {
        f0.p(brush, "brush");
        this.brush = brush;
        this.alpha = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(@e m0 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(@e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BrushPainter) && f0.g(this.brush, ((BrushPainter) other).brush);
    }

    public int hashCode() {
        return this.brush.hashCode();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return this.brush.getIntrinsicSize();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void k(@dl.d g gVar) {
        f0.p(gVar, "<this>");
        f.J(gVar, this.brush, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    @dl.d
    /* JADX INFO: renamed from: l, reason: from getter */
    public final a0 getBrush() {
        return this.brush;
    }

    @dl.d
    public String toString() {
        return "BrushPainter(brush=" + this.brush + ')';
    }
}
