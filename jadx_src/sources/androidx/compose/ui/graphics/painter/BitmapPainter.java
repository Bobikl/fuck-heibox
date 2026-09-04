package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.y0;
import b1.m;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import s1.n;
import s1.r;
import s1.s;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.a, reason: from toString */
/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b.\u0010/J%\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR+\u0010'\u001a\u00020 8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001d\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\u001d\u0010-\u001a\u00020+8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010,\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/graphics/painter/a;", "Landroidx/compose/ui/graphics/painter/Painter;", "Ls1/n;", "srcOffset", "Ls1/r;", "srcSize", "n", "(JJ)J", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/b2;", "k", "", "alpha", "", ak.av, "Landroidx/compose/ui/graphics/m0;", "colorFilter", "b", "", "other", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/graphics/y0;", "g", "Landroidx/compose/ui/graphics/y0;", "image", RXScreenCaptureService.KEY_HEIGHT, "J", "i", "Landroidx/compose/ui/graphics/r0;", "j", "I", "l", "()I", "m", "(I)V", "filterQuality", UiKitSpanObj.TYPE_SIZE, "F", "Landroidx/compose/ui/graphics/m0;", "Lb1/m;", "()J", "intrinsicSize", "<init>", "(Landroidx/compose/ui/graphics/y0;JJLkotlin/jvm/internal/u;)V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
public final class BitmapPainter extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final y0 image;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcOffset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int filterQuality;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @e
    private m0 colorFilter;

    private BitmapPainter(y0 y0Var, long j10, long j11) {
        this.image = y0Var;
        this.srcOffset = j10;
        this.srcSize = j11;
        this.filterQuality = r0.INSTANCE.b();
        this.size = n(j10, j11);
        this.alpha = 1.0f;
    }

    public /* synthetic */ BitmapPainter(y0 y0Var, long j10, long j11, int i10, u uVar) {
        this(y0Var, (i10 & 2) != 0 ? n.f139237b.a() : j10, (i10 & 4) != 0 ? s.a(y0Var.getWidth(), y0Var.getHeight()) : j11, null);
    }

    public /* synthetic */ BitmapPainter(y0 y0Var, long j10, long j11, u uVar) {
        this(y0Var, j10, j11);
    }

    private final long n(long srcOffset, long srcSize) {
        if (n.m(srcOffset) >= 0 && n.o(srcOffset) >= 0 && r.m(srcSize) >= 0 && r.j(srcSize) >= 0 && r.m(srcSize) <= this.image.getWidth() && r.j(srcSize) <= this.image.getHeight()) {
            return srcSize;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
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
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return f0.g(this.image, bitmapPainter.image) && n.j(this.srcOffset, bitmapPainter.srcOffset) && r.h(this.srcSize, bitmapPainter.srcSize) && r0.h(this.filterQuality, bitmapPainter.filterQuality);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + n.p(this.srcOffset)) * 31) + r.n(this.srcSize)) * 31) + r0.j(this.filterQuality);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return s.f(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void k(@dl.d g gVar) {
        f0.p(gVar, "<this>");
        f.z(gVar, this.image, this.srcOffset, this.srcSize, 0L, s.a(di.d.L0(m.t(gVar.c())), di.d.L0(m.m(gVar.c()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, bb.c.b.f30877q3, null);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getFilterQuality() {
        return this.filterQuality;
    }

    public final void m(int i10) {
        this.filterQuality = i10;
    }

    @dl.d
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) n.u(this.srcOffset)) + ", srcSize=" + ((Object) r.p(this.srcSize)) + ", filterQuality=" + ((Object) r0.k(this.filterQuality)) + ')';
    }
}
