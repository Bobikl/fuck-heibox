package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.j, reason: from toString */
/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\u0019\b\u0002\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001f¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/j;", "Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/platform/y0;", "Ls1/e;", "", "parentData", "m", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/c;", "e", "Landroidx/compose/ui/c;", "f", "()Landroidx/compose/ui/c;", "n", "(Landroidx/compose/ui/c;)V", "alignment", "Z", "g", "()Z", "o", "(Z)V", "matchParentSize", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/c;ZLyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class BoxChildData extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private androidx.compose.ui.c alignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean matchParentSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxChildData(@dl.d androidx.compose.ui.c alignment, boolean z10, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.alignment = alignment;
        this.matchParentSize = z10;
    }

    public /* synthetic */ BoxChildData(androidx.compose.ui.c cVar, boolean z10, yh.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(cVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? InspectableValueKt.b() : lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        BoxChildData boxChildData = other instanceof BoxChildData ? (BoxChildData) other : null;
        if (boxChildData == null) {
            return false;
        }
        return kotlin.jvm.internal.f0.g(this.alignment, boxChildData.alignment) && this.matchParentSize == boxChildData.matchParentSize;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + androidx.compose.foundation.b0.a(this.matchParentSize);
    }

    @Override // androidx.compose.ui.layout.d1
    @dl.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public BoxChildData V(@dl.d s1.e eVar, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        return this;
    }

    public final void n(@dl.d androidx.compose.ui.c cVar) {
        kotlin.jvm.internal.f0.p(cVar, "<set-?>");
        this.alignment = cVar;
    }

    public final void o(boolean z10) {
        this.matchParentSize = z10;
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
        return "BoxChildData(alignment=" + this.alignment + ", matchParentSize=" + this.matchParentSize + ')';
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
