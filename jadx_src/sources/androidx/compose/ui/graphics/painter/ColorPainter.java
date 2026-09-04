package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import b1.m;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.d, reason: from toString */
/* JADX INFO: compiled from: ColorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR#\u0010\u001f\u001a\u00020\u001d8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/painter/d;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "k", "", "alpha", "", ak.av, "Landroidx/compose/ui/graphics/m0;", "colorFilter", "b", "", "other", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/l0;", "g", "J", "l", "()J", "color", RXScreenCaptureService.KEY_HEIGHT, "F", "i", "Landroidx/compose/ui/graphics/m0;", "Lb1/m;", "j", "intrinsicSize", "<init>", "(JLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class ColorPainter extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @e
    private m0 colorFilter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    private ColorPainter(long j10) {
        this.color = j10;
        this.alpha = 1.0f;
        this.intrinsicSize = m.f30386b.a();
    }

    public /* synthetic */ ColorPainter(long j10, u uVar) {
        this(j10);
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
        return (other instanceof ColorPainter) && l0.y(this.color, ((ColorPainter) other).color);
    }

    public int hashCode() {
        return l0.K(this.color);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: i, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void k(@dl.d g gVar) {
        f0.p(gVar, "<this>");
        f.K(gVar, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @dl.d
    public String toString() {
        return "ColorPainter(color=" + ((Object) l0.L(this.color)) + ')';
    }
}
