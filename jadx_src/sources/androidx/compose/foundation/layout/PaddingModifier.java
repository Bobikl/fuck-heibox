package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#¢\u0006\u0002\b&ø\u0001\u0001¢\u0006\u0004\b(\u0010)J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002R \u0010\u0016\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R \u0010\u001b\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R \u0010\u001d\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\"\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "hashCode", "", "other", "", "equals", "Ls1/h;", "e", "F", "n", "()F", com.google.android.exoplayer2.text.ttml.d.f49798o0, "f", "o", "top", "g", com.google.android.exoplayer2.text.ttml.d.f49800p0, RXScreenCaptureService.KEY_HEIGHT, "bottom", "i", "Z", "m", "()Z", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(FFFFZLyh/l;Lkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class PaddingModifier extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float start;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float end;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean rtlAware;

    private PaddingModifier(float f10, float f11, float f12, float f13, boolean z10, yh.l<? super androidx.compose.ui.platform.x0, b2> lVar) {
        super(lVar);
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        if (!((f10 >= 0.0f || s1.h.l(f10, s1.h.f139219c.e())) && (f11 >= 0.0f || s1.h.l(f11, s1.h.f139219c.e())) && ((f12 >= 0.0f || s1.h.l(f12, s1.h.f139219c.e())) && (f13 >= 0.0f || s1.h.l(f13, s1.h.f139219c.e()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ PaddingModifier(float f10, float f11, float f12, float f13, boolean z10, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s1.h.g(0) : f10, (i10 & 2) != 0 ? s1.h.g(0) : f11, (i10 & 4) != 0 ? s1.h.g(0) : f12, (i10 & 8) != 0 ? s1.h.g(0) : f13, z10, lVar, null);
    }

    public /* synthetic */ PaddingModifier(float f10, float f11, float f12, float f13, boolean z10, yh.l lVar, kotlin.jvm.internal.u uVar) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.d(this, nVar, mVar, i10);
    }

    public boolean equals(@dl.e Object other) {
        PaddingModifier paddingModifier = other instanceof PaddingModifier ? (PaddingModifier) other : null;
        return paddingModifier != null && s1.h.l(this.start, paddingModifier.start) && s1.h.l(this.top, paddingModifier.top) && s1.h.l(this.end, paddingModifier.end) && s1.h.l(this.bottom, paddingModifier.bottom) && this.rtlAware == paddingModifier.rtlAware;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (((((((s1.h.n(this.start) * 31) + s1.h.n(this.top)) * 31) + s1.h.n(this.end)) * 31) + s1.h.n(this.bottom)) * 31) + androidx.compose.foundation.b0.a(this.rtlAware);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int i(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.a(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int j(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.layout.w
    @dl.d
    public androidx.compose.ui.layout.j0 k(@dl.d final androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        int iE1 = measure.e1(this.start) + measure.e1(this.end);
        int iE2 = measure.e1(this.top) + measure.e1(this.bottom);
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(s1.c.i(j10, -iE1, -iE2));
        return androidx.compose.ui.layout.k0.p(measure, s1.c.g(j10, e1VarZ1.getWidth() + iE1), s1.c.f(j10, e1VarZ1.getHeight() + iE2), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                if (this.f6065b.getRtlAware()) {
                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, measure.e1(this.f6065b.getStart()), measure.e1(this.f6065b.getTop()), 0.0f, 4, null);
                } else {
                    androidx.compose.ui.layout.e1.a.p(layout, e1VarZ1, measure.e1(this.f6065b.getStart()), measure.e1(this.f6065b.getTop()), 0.0f, 4, null);
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
