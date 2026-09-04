package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.text.font.v;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.s0;

/* JADX INFO: compiled from: ActualParagraph.android.kt.kt */
/* JADX INFO: loaded from: classes.dex */
@xh.h(name = "AndroidParagraph_androidKt")
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u001au\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"", "text", "Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Landroidx/compose/ui/text/w;", "placeholders", "", "maxLines", "", "ellipsis", "", "width", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "Landroidx/compose/ui/text/n;", ak.av, "Ls1/b;", "constraints", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", ak.aF, "(Ljava/lang/String;Landroidx/compose/ui/text/q0;Ljava/util/List;Ljava/util/List;IZJLs1/e;Landroidx/compose/ui/text/font/v$b;)Landroidx/compose/ui/text/n;", "Landroidx/compose/ui/text/r;", "paragraphIntrinsics", "b", "(Landroidx/compose/ui/text/r;IZJ)Landroidx/compose/ui/text/n;", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class h {
    @dl.d
    @kotlin.k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @s0(expression = "ActualParagraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final androidx.compose.ui.text.n a(@dl.d String text, @dl.d TextStyle style, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, int i10, boolean z10, float f10, @dl.d s1.e density, @dl.d u.b resourceLoader) {
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(spanStyles, "spanStyles");
        f0.p(placeholders, "placeholders");
        f0.p(density, "density");
        f0.p(resourceLoader, "resourceLoader");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, androidx.compose.ui.text.font.o.a(resourceLoader), density), i10, z10, s1.c.b(0, androidx.compose.ui.text.t.k(f10), 0, 0, 13, null), null);
    }

    @dl.d
    public static final androidx.compose.ui.text.n b(@dl.d androidx.compose.ui.text.r paragraphIntrinsics, int i10, boolean z10, long j10) {
        f0.p(paragraphIntrinsics, "paragraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i10, z10, j10, null);
    }

    @dl.d
    public static final androidx.compose.ui.text.n c(@dl.d String text, @dl.d TextStyle style, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, int i10, boolean z10, long j10, @dl.d s1.e density, @dl.d v.b fontFamilyResolver) {
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(spanStyles, "spanStyles");
        f0.p(placeholders, "placeholders");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density), i10, z10, j10, null);
    }
}
