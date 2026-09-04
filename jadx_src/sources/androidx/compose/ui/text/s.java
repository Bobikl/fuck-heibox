package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: ParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007\u001aR\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0013"}, d2 = {"", "text", "Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/u$b;", "resourceLoader", "Landroidx/compose/ui/text/r;", ak.av, "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class s {
    @dl.d
    @kotlin.k(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @kotlin.s0(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
    public static final r a(@dl.d String text, @dl.d TextStyle style, @dl.d List<d.Range<SpanStyle>> spanStyles, @dl.d List<d.Range<Placeholder>> placeholders, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.u.b resourceLoader) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(resourceLoader, "resourceLoader");
        return androidx.compose.ui.text.platform.g.a(text, style, spanStyles, placeholders, density, androidx.compose.ui.text.font.o.a(resourceLoader));
    }

    @dl.d
    public static final r b(@dl.d String text, @dl.d TextStyle style, @dl.d List<d.Range<SpanStyle>> spanStyles, @dl.d List<d.Range<Placeholder>> placeholders, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver) {
        kotlin.jvm.internal.f0.p(text, "text");
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(spanStyles, "spanStyles");
        kotlin.jvm.internal.f0.p(placeholders, "placeholders");
        kotlin.jvm.internal.f0.p(density, "density");
        kotlin.jvm.internal.f0.p(fontFamilyResolver, "fontFamilyResolver");
        return androidx.compose.ui.text.platform.g.a(text, style, spanStyles, placeholders, density, fontFamilyResolver);
    }

    public static /* synthetic */ r c(String str, TextStyle textStyle, List list, List list2, s1.e eVar, androidx.compose.ui.text.font.u.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.E();
        }
        return a(str, textStyle, list3, list2, eVar, bVar);
    }

    public static /* synthetic */ r d(String str, TextStyle textStyle, List list, List list2, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = CollectionsKt__CollectionsKt.E();
        }
        return b(str, textStyle, list3, list2, eVar, bVar);
    }
}
