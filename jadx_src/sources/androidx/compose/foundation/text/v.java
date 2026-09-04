package androidx.compose.foundation.text;

import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextLayoutHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001au\u0010\u0017\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/i0;", "Landroidx/compose/ui/text/d;", "text", "Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/q;", "overflow", "Ls1/e;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Ls1/b;", "constraints", ak.av, "(Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/d;Landroidx/compose/ui/text/q0;Ljava/util/List;IZILs1/e;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/v$b;J)Z", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class v {
    public static final boolean a(@dl.d TextLayoutResult canReuse, @dl.d androidx.compose.ui.text.d text, @dl.d TextStyle style, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, int i10, boolean z10, int i11, @dl.d s1.e density, @dl.d LayoutDirection layoutDirection, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, long j10) {
        f0.p(canReuse, "$this$canReuse");
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(placeholders, "placeholders");
        f0.p(density, "density");
        f0.p(layoutDirection, "layoutDirection");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput layoutInput = canReuse.getLayoutInput();
        if (canReuse.getMultiParagraph().getIntrinsics().c() || !f0.g(layoutInput.getText(), text) || !layoutInput.getStyle().N(style) || !f0.g(layoutInput.i(), placeholders) || layoutInput.getMaxLines() != i10 || layoutInput.getSoftWrap() != z10 || !androidx.compose.ui.text.style.q.g(layoutInput.getOverflow(), i11) || !f0.g(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !f0.g(layoutInput.getFontFamilyResolver(), fontFamilyResolver) || s1.b.r(j10) != s1.b.r(layoutInput.getConstraints())) {
            return false;
        }
        if (z10 || androidx.compose.ui.text.style.q.g(i11, androidx.compose.ui.text.style.q.INSTANCE.c())) {
            return s1.b.p(j10) == s1.b.p(layoutInput.getConstraints()) && s1.b.o(j10) == s1.b.o(layoutInput.getConstraints());
        }
        return true;
    }
}
