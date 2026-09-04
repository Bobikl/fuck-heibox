package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.c, reason: from toString */
/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0019\u0012\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#ø\u0001\u0001¢\u0006\u0004\b%\u0010&J)\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\u00020\u00198\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u00020\u00198\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/c;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "k", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/g0;J)Landroidx/compose/ui/layout/j0;", "", "hashCode", "", "other", "", "equals", "", "toString", "Landroidx/compose/ui/layout/a;", "e", "Landroidx/compose/ui/layout/a;", "g", "()Landroidx/compose/ui/layout/a;", "alignmentLine", "Ls1/u;", "f", "J", "m", "()J", com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/a;JJLyh/l;Lkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class AlignmentLineOffset extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.w {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final androidx.compose.ui.layout.a alignmentLine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long before;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long after;

    private AlignmentLineOffset(androidx.compose.ui.layout.a aVar, long j10, long j11, yh.l<? super androidx.compose.ui.platform.x0, b2> lVar) {
        super(lVar);
        this.alignmentLine = aVar;
        this.before = j10;
        this.after = j11;
    }

    public /* synthetic */ AlignmentLineOffset(androidx.compose.ui.layout.a aVar, long j10, long j11, yh.l lVar, kotlin.jvm.internal.u uVar) {
        this(aVar, j10, j11, lVar);
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
        if (this == other) {
            return true;
        }
        AlignmentLineOffset alignmentLineOffset = other instanceof AlignmentLineOffset ? (AlignmentLineOffset) other : null;
        if (alignmentLineOffset == null) {
            return false;
        }
        return kotlin.jvm.internal.f0.g(this.alignmentLine, alignmentLineOffset.alignmentLine) && s1.u.j(this.before, alignmentLineOffset.before) && s1.u.j(this.after, alignmentLineOffset.after);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getAfter() {
        return this.after;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final androidx.compose.ui.layout.a getAlignmentLine() {
        return this.alignmentLine;
    }

    @Override // androidx.compose.ui.layout.w
    public /* synthetic */ int h(androidx.compose.ui.layout.n nVar, androidx.compose.ui.layout.m mVar, int i10) {
        return androidx.compose.ui.layout.v.b(this, nVar, mVar, i10);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + s1.u.o(this.before)) * 31) + s1.u.o(this.after);
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
    public androidx.compose.ui.layout.j0 k(@dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return AlignmentLineKt.c(measure, this.alignmentLine, !s1.v.s(this.before) ? measure.q(this.before) : s1.h.f139219c.e(), !s1.v.s(this.after) ? measure.q(this.after) : s1.h.f139219c.e(), measurable, j10);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getBefore() {
        return this.before;
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.d
    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.alignmentLine + ", before=" + ((Object) s1.u.u(this.before)) + ", after=" + ((Object) s1.u.u(this.after)) + ')';
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
