package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.v;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import p1.LocaleList;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aP\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/style/j;", "textDirection", "Lp1/f;", "localeList", "", "b", "(Landroidx/compose/ui/text/style/j;Lp1/f;)I", "", "text", "Landroidx/compose/ui/text/q0;", "style", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/d0;", "spanStyles", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/r;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class g {
    @dl.d
    public static final androidx.compose.ui.text.r a(@dl.d String text, @dl.d TextStyle style, @dl.d List<androidx.compose.ui.text.d.Range<SpanStyle>> spanStyles, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, @dl.d s1.e density, @dl.d v.b fontFamilyResolver) {
        f0.p(text, "text");
        f0.p(style, "style");
        f0.p(spanStyles, "spanStyles");
        f0.p(placeholders, "placeholders");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, fontFamilyResolver, density);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r6 == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(@dl.e androidx.compose.ui.text.style.j r6, @dl.e p1.LocaleList r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.getValue()
            goto Ld
        L7:
            androidx.compose.ui.text.style.j$a r6 = androidx.compose.ui.text.style.j.INSTANCE
            int r6 = r6.a()
        Ld:
            androidx.compose.ui.text.style.j$a r0 = androidx.compose.ui.text.style.j.INSTANCE
            int r1 = r0.b()
            boolean r1 = androidx.compose.ui.text.style.j.i(r6, r1)
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L1f
        L1d:
            r2 = r5
            goto L70
        L1f:
            int r1 = r0.c()
            boolean r1 = androidx.compose.ui.text.style.j.i(r6, r1)
            if (r1 == 0) goto L2b
        L29:
            r2 = r4
            goto L70
        L2b:
            int r1 = r0.d()
            boolean r1 = androidx.compose.ui.text.style.j.i(r6, r1)
            if (r1 == 0) goto L37
            r2 = r3
            goto L70
        L37:
            int r1 = r0.e()
            boolean r1 = androidx.compose.ui.text.style.j.i(r6, r1)
            if (r1 == 0) goto L42
            goto L70
        L42:
            int r0 = r0.a()
            boolean r6 = androidx.compose.ui.text.style.j.i(r6, r0)
            if (r6 == 0) goto L71
            if (r7 == 0) goto L63
            p1.e r6 = r7.e(r3)
            p1.g r6 = r6.getF138136a()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.f0.n(r6, r7)
            p1.a r6 = (p1.a) r6
            java.util.Locale r6 = r6.getF138134a()
            if (r6 != 0) goto L67
        L63:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L67:
            int r6 = androidx.core.text.s.b(r6)
            if (r6 == 0) goto L1d
            if (r6 == r2) goto L29
            goto L1d
        L70:
            return r2
        L71:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.g.b(androidx.compose.ui.text.style.j, p1.f):int");
    }

    public static /* synthetic */ int c(androidx.compose.ui.text.style.j jVar, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = null;
        }
        if ((i10 & 2) != 0) {
            localeList = null;
        }
        return b(jVar, localeList);
    }
}
