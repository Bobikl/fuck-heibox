package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.p0;
import com.meituan.robust.Constants;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\rJ?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Landroidx/compose/ui/text/o0;", "newRawSelectionRange", "", "previousHandleOffset", "", "isStartHandle", "previousSelectionRange", ak.av, "(Landroidx/compose/ui/text/i0;JIZLandroidx/compose/ui/text/o0;)J", "Companion", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface SelectionAdjustment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f8161a;

    /* JADX INFO: compiled from: SelectionAdjustment.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Landroidx/compose/ui/text/o0;", "newRawSelection", "Lkotlin/Function1;", "", "boundaryFun", "b", "(Landroidx/compose/ui/text/i0;JLyh/l;)J", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "e", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", d4.d.f108133a, ak.aF, Constants.LANG_CHARACTER, "d", "g", "Word", "f", "Paragraph", "CharacterWithWordAccelerate", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8161a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final SelectionAdjustment None = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final SelectionAdjustment Character = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public long a(@dl.d TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @dl.e o0 previousSelectionRange) {
                f0.p(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.f8161a.b(textLayoutResult, newRawSelectionRange, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public long a(@dl.d TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @dl.e o0 previousSelectionRange) {
                f0.p(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.f8161a.b(textLayoutResult, newRawSelectionRange, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final SelectionAdjustment CharacterWithWordAccelerate = new b();

        /* JADX INFO: compiled from: SelectionAdjustment.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"androidx/compose/foundation/text/selection/SelectionAdjustment$Companion$a", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Landroidx/compose/ui/text/o0;", "newRawSelectionRange", "", "previousHandleOffset", "", "isStartHandle", "previousSelectionRange", ak.av, "(Landroidx/compose/ui/text/i0;JIZLandroidx/compose/ui/text/o0;)J", "foundation_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements SelectionAdjustment {
            a() {
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public long a(@dl.d TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @dl.e o0 previousSelectionRange) {
                f0.p(textLayoutResult, "textLayoutResult");
                if (o0.h(newRawSelectionRange)) {
                    return k.a(o0.n(newRawSelectionRange), StringsKt__StringsKt.j3(textLayoutResult.getLayoutInput().getText()), isStartHandle, previousSelectionRange != null ? o0.m(previousSelectionRange.getPackedValue()) : false);
                }
                return newRawSelectionRange;
            }
        }

        /* JADX INFO: compiled from: SelectionAdjustment.kt */
        @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J@\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J8\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0014\u0010\u0010\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J?\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"androidx/compose/foundation/text/selection/SelectionAdjustment$Companion$b", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "", "newRawOffset", "previousRawOffset", "previousAdjustedOffset", "otherBoundaryOffset", "", "isStart", "isReversed", "e", "currentLine", "d", androidx.constraintlayout.core.motion.utils.w.c.R, "b", "previousReversed", ak.aF, "Landroidx/compose/ui/text/o0;", "newRawSelectionRange", "previousHandleOffset", "isStartHandle", "previousSelectionRange", ak.av, "(Landroidx/compose/ui/text/i0;JIZLandroidx/compose/ui/text/o0;)J", "foundation_release"}, k = 1, mv = {1, 7, 1})
        public static final class b implements SelectionAdjustment {
            b() {
            }

            private final boolean b(TextLayoutResult textLayoutResult, int i10) {
                long jC = textLayoutResult.C(i10);
                return i10 == o0.n(jC) || i10 == o0.i(jC);
            }

            private final boolean c(int newRawOffset, int previousRawOffset, boolean isStart, boolean previousReversed) {
                if (previousRawOffset == -1) {
                    return true;
                }
                if (newRawOffset == previousRawOffset) {
                    return false;
                }
                if (isStart ^ previousReversed) {
                    if (newRawOffset < previousRawOffset) {
                        return true;
                    }
                } else if (newRawOffset > previousRawOffset) {
                    return true;
                }
                return false;
            }

            private final int d(TextLayoutResult textLayoutResult, int newRawOffset, int currentLine, int otherBoundaryOffset, boolean isStart, boolean isReversed) {
                long jC = textLayoutResult.C(newRawOffset);
                int iN = textLayoutResult.q(o0.n(jC)) == currentLine ? o0.n(jC) : textLayoutResult.u(currentLine);
                int i10 = textLayoutResult.q(o0.i(jC)) == currentLine ? o0.i(jC) : TextLayoutResult.p(textLayoutResult, currentLine, false, 2, null);
                if (iN == otherBoundaryOffset) {
                    return i10;
                }
                if (i10 == otherBoundaryOffset) {
                    return iN;
                }
                int i11 = (iN + i10) / 2;
                if (isStart ^ isReversed) {
                    if (newRawOffset <= i11) {
                        return iN;
                    }
                } else if (newRawOffset < i11) {
                    return iN;
                }
                return i10;
            }

            private final int e(TextLayoutResult textLayoutResult, int newRawOffset, int previousRawOffset, int previousAdjustedOffset, int otherBoundaryOffset, boolean isStart, boolean isReversed) {
                if (newRawOffset == previousRawOffset) {
                    return previousAdjustedOffset;
                }
                int iQ = textLayoutResult.q(newRawOffset);
                if (iQ != textLayoutResult.q(previousAdjustedOffset)) {
                    return d(textLayoutResult, newRawOffset, iQ, otherBoundaryOffset, isStart, isReversed);
                }
                return (c(newRawOffset, previousRawOffset, isStart, isReversed) && b(textLayoutResult, previousAdjustedOffset)) ? d(textLayoutResult, newRawOffset, iQ, otherBoundaryOffset, isStart, isReversed) : newRawOffset;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public long a(@dl.d TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @dl.e o0 previousSelectionRange) {
                int iE;
                int iE2;
                f0.p(textLayoutResult, "textLayoutResult");
                if (previousSelectionRange == null) {
                    return Companion.f8161a.g().a(textLayoutResult, newRawSelectionRange, previousHandleOffset, isStartHandle, previousSelectionRange);
                }
                if (o0.h(newRawSelectionRange)) {
                    return k.a(o0.n(newRawSelectionRange), StringsKt__StringsKt.j3(textLayoutResult.getLayoutInput().getText()), isStartHandle, o0.m(previousSelectionRange.getPackedValue()));
                }
                if (isStartHandle) {
                    iE2 = e(textLayoutResult, o0.n(newRawSelectionRange), previousHandleOffset, o0.n(previousSelectionRange.getPackedValue()), o0.i(newRawSelectionRange), true, o0.m(newRawSelectionRange));
                    iE = o0.i(newRawSelectionRange);
                } else {
                    int iN = o0.n(newRawSelectionRange);
                    iE = e(textLayoutResult, o0.i(newRawSelectionRange), previousHandleOffset, o0.i(previousSelectionRange.getPackedValue()), o0.n(newRawSelectionRange), false, o0.m(newRawSelectionRange));
                    iE2 = iN;
                }
                return p0.b(iE2, iE);
            }
        }

        /* JADX INFO: compiled from: SelectionAdjustment.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"androidx/compose/foundation/text/selection/SelectionAdjustment$Companion$c", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Landroidx/compose/ui/text/o0;", "newRawSelectionRange", "", "previousHandleOffset", "", "isStartHandle", "previousSelectionRange", ak.av, "(Landroidx/compose/ui/text/i0;JIZLandroidx/compose/ui/text/o0;)J", "foundation_release"}, k = 1, mv = {1, 7, 1})
        public static final class c implements SelectionAdjustment {
            c() {
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            public long a(@dl.d TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @dl.e o0 previousSelectionRange) {
                f0.p(textLayoutResult, "textLayoutResult");
                return newRawSelectionRange;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(TextLayoutResult textLayoutResult, long newRawSelection, yh.l<? super Integer, o0> boundaryFun) {
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return o0.INSTANCE.a();
            }
            int iJ3 = StringsKt__StringsKt.j3(textLayoutResult.getLayoutInput().getText());
            long packedValue = boundaryFun.invoke(Integer.valueOf(fi.u.I(o0.n(newRawSelection), 0, iJ3))).getPackedValue();
            long packedValue2 = boundaryFun.invoke(Integer.valueOf(fi.u.I(o0.i(newRawSelection), 0, iJ3))).getPackedValue();
            return p0.b(o0.m(newRawSelection) ? o0.i(packedValue) : o0.n(packedValue), o0.m(newRawSelection) ? o0.n(packedValue2) : o0.i(packedValue2));
        }

        @dl.d
        public final SelectionAdjustment c() {
            return Character;
        }

        @dl.d
        public final SelectionAdjustment d() {
            return CharacterWithWordAccelerate;
        }

        @dl.d
        public final SelectionAdjustment e() {
            return None;
        }

        @dl.d
        public final SelectionAdjustment f() {
            return Paragraph;
        }

        @dl.d
        public final SelectionAdjustment g() {
            return Word;
        }
    }

    long a(@dl.d TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, @dl.e o0 previousSelectionRange);
}
