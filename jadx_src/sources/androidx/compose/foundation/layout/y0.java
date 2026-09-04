package androidx.compose.foundation.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000e\u000fB\"\b\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/y0;", "Landroidx/compose/ui/layout/d1;", "Landroidx/compose/ui/platform/y0;", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;)V", ak.av, "b", "Landroidx/compose/foundation/layout/y0$a;", "Landroidx/compose/foundation/layout/y0$b;", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public abstract class y0 extends androidx.compose.ui.platform.y0 implements androidx.compose.ui.layout.d1 {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.y0$a, reason: from toString */
    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/y0$a;", "Landroidx/compose/foundation/layout/y0;", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/layout/a;", "e", "Landroidx/compose/ui/layout/a;", "f", "()Landroidx/compose/ui/layout/a;", "alignmentLine", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/ui/layout/a;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class WithAlignmentLine extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final androidx.compose.ui.layout.a line;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithAlignmentLine(@dl.d androidx.compose.ui.layout.a alignmentLine, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
            super(inspectorInfo, null);
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
            this.line = alignmentLine;
        }

        @Override // androidx.compose.foundation.layout.y0, androidx.compose.ui.layout.d1
        @dl.d
        public Object V(@dl.d s1.e eVar, @dl.e Object obj) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.i(q.INSTANCE.b(new d.Value(this.line)));
            return rowColumnParentData;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            WithAlignmentLine withAlignmentLine = other instanceof WithAlignmentLine ? (WithAlignmentLine) other : null;
            if (withAlignmentLine == null) {
                return false;
            }
            return kotlin.jvm.internal.f0.g(this.line, withAlignmentLine.line);
        }

        @dl.d
        /* JADX INFO: renamed from: f, reason: from getter */
        public final androidx.compose.ui.layout.a getLine() {
            return this.line;
        }

        public int hashCode() {
            return this.line.hashCode();
        }

        @dl.d
        public String toString() {
            return "WithAlignmentLine(line=" + this.line + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.y0$b, reason: from toString */
    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B4\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r\u0012\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\r¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/y0$b;", "Landroidx/compose/foundation/layout/y0;", "Ls1/e;", "", "parentData", androidx.exifinterface.media.a.X4, "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/n0;", "block", "Lyh/l;", "f", "()Lyh/l;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/b2;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class WithAlignmentLineBlock extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from toString */
        @dl.d
        private final yh.l<androidx.compose.ui.layout.n0, Integer> block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WithAlignmentLineBlock(@dl.d yh.l<? super androidx.compose.ui.layout.n0, Integer> block, @dl.d yh.l<? super androidx.compose.ui.platform.x0, b2> inspectorInfo) {
            super(inspectorInfo, null);
            kotlin.jvm.internal.f0.p(block, "block");
            kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
            this.block = block;
        }

        @Override // androidx.compose.foundation.layout.y0, androidx.compose.ui.layout.d1
        @dl.d
        public Object V(@dl.d s1.e eVar, @dl.e Object obj) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.i(q.INSTANCE.b(new d.Block(this.block)));
            return rowColumnParentData;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            WithAlignmentLineBlock withAlignmentLineBlock = other instanceof WithAlignmentLineBlock ? (WithAlignmentLineBlock) other : null;
            if (withAlignmentLineBlock == null) {
                return false;
            }
            return kotlin.jvm.internal.f0.g(this.block, withAlignmentLineBlock.block);
        }

        @dl.d
        public final yh.l<androidx.compose.ui.layout.n0, Integer> f() {
            return this.block;
        }

        public int hashCode() {
            return this.block.hashCode();
        }

        @dl.d
        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.block + ')';
        }
    }

    private y0(yh.l<? super androidx.compose.ui.platform.x0, b2> lVar) {
        super(lVar);
    }

    public /* synthetic */ y0(yh.l lVar, kotlin.jvm.internal.u uVar) {
        this(lVar);
    }

    @Override // androidx.compose.ui.layout.d1
    @dl.e
    public abstract Object V(@dl.d s1.e eVar, @dl.e Object obj);

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
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
