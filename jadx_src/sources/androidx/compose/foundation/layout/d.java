package androidx.compose.foundation.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/d;", "", "Landroidx/compose/ui/layout/e1;", "placeable", "", ak.av, "<init>", "()V", "b", "Landroidx/compose/foundation/layout/d$a;", "Landroidx/compose/foundation/layout/d$b;", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public abstract class d {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.d$a, reason: from toString */
    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/d$a;", "Landroidx/compose/foundation/layout/d;", "Landroidx/compose/ui/layout/e1;", "placeable", "", ak.av, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/n0;", "b", "lineProviderBlock", ak.aF, "", "toString", "hashCode", "", "other", "", "equals", "Lyh/l;", "e", "()Lyh/l;", "<init>", "(Lyh/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Block extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f6305b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
        @dl.d
        private final yh.l<androidx.compose.ui.layout.n0, Integer> lineProviderBlock;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Block(@dl.d yh.l<? super androidx.compose.ui.layout.n0, Integer> lineProviderBlock) {
            super(null);
            kotlin.jvm.internal.f0.p(lineProviderBlock, "lineProviderBlock");
            this.lineProviderBlock = lineProviderBlock;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Block d(Block block, yh.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = block.lineProviderBlock;
            }
            return block.c(lVar);
        }

        @Override // androidx.compose.foundation.layout.d
        public int a(@dl.d androidx.compose.ui.layout.e1 placeable) {
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            return this.lineProviderBlock.invoke(placeable).intValue();
        }

        @dl.d
        public final yh.l<androidx.compose.ui.layout.n0, Integer> b() {
            return this.lineProviderBlock;
        }

        @dl.d
        public final Block c(@dl.d yh.l<? super androidx.compose.ui.layout.n0, Integer> lineProviderBlock) {
            kotlin.jvm.internal.f0.p(lineProviderBlock, "lineProviderBlock");
            return new Block(lineProviderBlock);
        }

        @dl.d
        public final yh.l<androidx.compose.ui.layout.n0, Integer> e() {
            return this.lineProviderBlock;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Block) && kotlin.jvm.internal.f0.g(this.lineProviderBlock, ((Block) other).lineProviderBlock);
        }

        public int hashCode() {
            return this.lineProviderBlock.hashCode();
        }

        @dl.d
        public String toString() {
            return "Block(lineProviderBlock=" + this.lineProviderBlock + ')';
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.d$b, reason: from toString */
    /* JADX INFO: compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.o(parameters = 0)
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/d$b;", "Landroidx/compose/foundation/layout/d;", "Landroidx/compose/ui/layout/e1;", "placeable", "", ak.av, "Landroidx/compose/ui/layout/a;", "b", "alignmentLine", ak.aF, "", "toString", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/layout/a;", "e", "()Landroidx/compose/ui/layout/a;", "<init>", "(Landroidx/compose/ui/layout/a;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Value extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f6307b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final androidx.compose.ui.layout.a alignmentLine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            super(null);
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            this.alignmentLine = alignmentLine;
        }

        public static /* synthetic */ Value d(Value value, androidx.compose.ui.layout.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = value.alignmentLine;
            }
            return value.c(aVar);
        }

        @Override // androidx.compose.foundation.layout.d
        public int a(@dl.d androidx.compose.ui.layout.e1 placeable) {
            kotlin.jvm.internal.f0.p(placeable, "placeable");
            return placeable.v(this.alignmentLine);
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final androidx.compose.ui.layout.a getAlignmentLine() {
            return this.alignmentLine;
        }

        @dl.d
        public final Value c(@dl.d androidx.compose.ui.layout.a alignmentLine) {
            kotlin.jvm.internal.f0.p(alignmentLine, "alignmentLine");
            return new Value(alignmentLine);
        }

        @dl.d
        public final androidx.compose.ui.layout.a e() {
            return this.alignmentLine;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Value) && kotlin.jvm.internal.f0.g(this.alignmentLine, ((Value) other).alignmentLine);
        }

        public int hashCode() {
            return this.alignmentLine.hashCode();
        }

        @dl.d
        public String toString() {
            return "Value(alignmentLine=" + this.alignmentLine + ')';
        }
    }

    private d() {
    }

    public /* synthetic */ d(kotlin.jvm.internal.u uVar) {
        this();
    }

    public abstract int a(@dl.d androidx.compose.ui.layout.e1 placeable);
}
