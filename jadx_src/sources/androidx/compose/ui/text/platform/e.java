package androidx.compose.ui.text.platform;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.text.ParagraphInfo;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AndroidMultiParagraphDraw.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000\u001a8\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/j;", "Landroidx/compose/ui/graphics/d0;", "canvas", "Landroidx/compose/ui/graphics/a0;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/e2;", "shadow", "Landroidx/compose/ui/text/style/i;", "decoration", "Lkotlin/b2;", ak.av, ak.aF, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class e {
    public static final void a(@dl.d androidx.compose.ui.text.j jVar, @dl.d d0 canvas, @dl.d a0 brush, float f10, @dl.e Shadow shadow, @dl.e androidx.compose.ui.text.style.i iVar) {
        f0.p(jVar, "<this>");
        f0.p(canvas, "canvas");
        f0.p(brush, "brush");
        canvas.f();
        if (jVar.B().size() <= 1 || (brush instanceof SolidColor)) {
            c(jVar, canvas, brush, f10, shadow, iVar);
        } else if (brush instanceof c2) {
            List<ParagraphInfo> listB = jVar.B();
            int size = listB.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                ParagraphInfo paragraphInfo = listB.get(i10);
                height += paragraphInfo.n().getHeight();
                fMax = Math.max(fMax, paragraphInfo.n().getWidth());
            }
            Shader shaderC = ((c2) brush).c(b1.n.a(fMax, height));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            List<ParagraphInfo> listB2 = jVar.B();
            int size2 = listB2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ParagraphInfo paragraphInfo2 = listB2.get(i11);
                androidx.compose.ui.text.m.b(paragraphInfo2.n(), canvas, b0.a(shaderC), f10, shadow, iVar, null, 32, null);
                canvas.b(0.0f, paragraphInfo2.n().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.n().getHeight());
                shaderC.setLocalMatrix(matrix);
            }
        }
        canvas.u();
    }

    public static /* synthetic */ void b(androidx.compose.ui.text.j jVar, d0 d0Var, a0 a0Var, float f10, Shadow shadow, androidx.compose.ui.text.style.i iVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        a(jVar, d0Var, a0Var, f10, (i10 & 8) != 0 ? null : shadow, (i10 & 16) != 0 ? null : iVar);
    }

    private static final void c(androidx.compose.ui.text.j jVar, d0 d0Var, a0 a0Var, float f10, Shadow shadow, androidx.compose.ui.text.style.i iVar) {
        List<ParagraphInfo> listB = jVar.B();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = listB.get(i10);
            androidx.compose.ui.text.m.b(paragraphInfo.n(), d0Var, a0Var, f10, shadow, iVar, null, 32, null);
            d0Var.b(0.0f, paragraphInfo.n().getHeight());
        }
    }
}
