package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0088\u0001\u0010\u0018\u001a\u0019\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u000e¢\u0006\u0002\b\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001d\u0010\u0013\u001a\u0019\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0002\b\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001d\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a.\u0010\u001f\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a.\u0010!\u001a\u00020\u001c*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Lkotlin/Function2;", "Ls1/e;", "Ls1/b;", "", "Lkotlin/t;", "slotSizesSums", "Landroidx/compose/foundation/f0;", "overscrollEffect", "Landroidx/compose/foundation/lazy/layout/m;", "Landroidx/compose/foundation/lazy/staggeredgrid/k;", "f", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/layout/i;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;Lyh/p;Landroidx/compose/foundation/f0;Landroidx/compose/runtime/p;I)Lyh/p;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/h;", "g", "(Landroidx/compose/foundation/layout/m0;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/unit/LayoutDirection;)F", "e", "(Landroidx/compose/foundation/layout/m0;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/unit/LayoutDirection;)F", "d", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyStaggeredGridMeasurePolicyKt {

    /* JADX INFO: compiled from: LazyStaggeredGridMeasurePolicy.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7272a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f7272a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(m0 m0Var, Orientation orientation, boolean z10, LayoutDirection layoutDirection) {
        int i10 = a.f7272a[orientation.ordinal()];
        if (i10 == 1) {
            return z10 ? m0Var.getTop() : m0Var.getBottom();
        }
        if (i10 == 2) {
            return z10 ? PaddingKt.i(m0Var, layoutDirection) : PaddingKt.h(m0Var, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(m0 m0Var, Orientation orientation, boolean z10, LayoutDirection layoutDirection) {
        int i10 = a.f7272a[orientation.ordinal()];
        if (i10 == 1) {
            return z10 ? m0Var.getBottom() : m0Var.getTop();
        }
        if (i10 == 2) {
            return z10 ? PaddingKt.h(m0Var, layoutDirection) : PaddingKt.i(m0Var, layoutDirection);
        }
        throw new NoWhenBranchMatchedException();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 ??, still in use, count: 1, list:
          (r11v2 ?? I:java.lang.Object) from 0x00a7: INVOKE (r23v0 ?? I:androidx.compose.runtime.p), (r11v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.foundation.t
    @dl.d
    @androidx.compose.runtime.h
    public static final yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, androidx.compose.foundation.lazy.staggeredgrid.k> f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 ??, still in use, count: 1, list:
          (r11v2 ?? I:java.lang.Object) from 0x00a7: INVOKE (r23v0 ?? I:androidx.compose.runtime.p), (r11v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.p.N(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(m0 m0Var, Orientation orientation, LayoutDirection layoutDirection) {
        int i10 = a.f7272a[orientation.ordinal()];
        if (i10 == 1) {
            return PaddingKt.i(m0Var, layoutDirection);
        }
        if (i10 == 2) {
            return m0Var.getTop();
        }
        throw new NoWhenBranchMatchedException();
    }
}
