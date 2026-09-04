package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: CursorAnchorInfoBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\f"}, d2 = {"Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/i0;", "textLayoutResult", "Landroid/graphics/Matrix;", "matrix", "Landroid/view/inputmethod/CursorAnchorInfo;", ak.av, "", "selectionStart", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class c {
    @dl.d
    public static final CursorAnchorInfo a(@dl.d CursorAnchorInfo.Builder builder, @dl.d TextFieldValue textFieldValue, @dl.d TextLayoutResult textLayoutResult, @dl.d Matrix matrix) {
        kotlin.jvm.internal.f0.p(builder, "<this>");
        kotlin.jvm.internal.f0.p(textFieldValue, "textFieldValue");
        kotlin.jvm.internal.f0.p(textLayoutResult, "textLayoutResult");
        kotlin.jvm.internal.f0.p(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int iL = o0.l(textFieldValue.getSelection());
        builder.setSelectionRange(iL, o0.k(textFieldValue.getSelection()));
        b(builder, iL, textLayoutResult);
        o0 composition = textFieldValue.getComposition();
        int iL2 = composition != null ? o0.l(composition.getPackedValue()) : -1;
        o0 composition2 = textFieldValue.getComposition();
        int iK = composition2 != null ? o0.k(composition2.getPackedValue()) : -1;
        boolean z10 = false;
        if (iL2 >= 0 && iL2 < iK) {
            z10 = true;
        }
        if (z10) {
            builder.setComposingText(iL2, textFieldValue.i().subSequence(iL2, iK));
        }
        CursorAnchorInfo cursorAnchorInfoBuild = builder.build();
        kotlin.jvm.internal.f0.o(cursorAnchorInfoBuild, "build()");
        return cursorAnchorInfoBuild;
    }

    private static final CursorAnchorInfo.Builder b(CursorAnchorInfo.Builder builder, int i10, TextLayoutResult textLayoutResult) {
        if (i10 < 0) {
            return builder;
        }
        b1.i iVarE = textLayoutResult.e(i10);
        builder.setInsertionMarkerLocation(iVarE.t(), iVarE.getF30372b(), iVarE.j(), iVarE.j(), textLayoutResult.c(i10) == ResolvedTextDirection.Rtl ? 4 : 0);
        return builder;
    }
}
