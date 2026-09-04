package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u000e\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/q0;", "style", "Ls1/e;", "density", "Landroidx/compose/ui/text/font/v$b;", "fontFamilyResolver", "", "text", "", "maxLines", "Ls1/r;", ak.av, "(Landroidx/compose/ui/text/q0;Ls1/e;Landroidx/compose/ui/text/font/v$b;Ljava/lang/String;I)J", "I", "DefaultWidthCharCount", "b", "Ljava/lang/String;", ak.aF, "()Ljava/lang/String;", "EmptyTextReplacement", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f8121a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f8122b = kotlin.text.u.h2("H", 10);

    public static final long a(@dl.d TextStyle style, @dl.d s1.e density, @dl.d androidx.compose.ui.text.font.v.b fontFamilyResolver, @dl.d String text, int i10) {
        f0.p(style, "style");
        f0.p(density, "density");
        f0.p(fontFamilyResolver, "fontFamilyResolver");
        f0.p(text, "text");
        androidx.compose.ui.text.n nVarG = androidx.compose.ui.text.t.g(text, style, s1.c.b(0, 0, 0, 0, 15, null), density, fontFamilyResolver, (64 & 32) != 0 ? CollectionsKt__CollectionsKt.E() : CollectionsKt__CollectionsKt.E(), (64 & 64) != 0 ? CollectionsKt__CollectionsKt.E() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : i10, (64 & 256) != 0 ? false : false);
        return s1.s.a(q.a(nVarG.a()), q.a(nVarG.getHeight()));
    }

    public static /* synthetic */ long b(TextStyle textStyle, s1.e eVar, androidx.compose.ui.text.font.v.b bVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = f8122b;
        }
        if ((i11 & 16) != 0) {
            i10 = 1;
        }
        return a(textStyle, eVar, bVar, str, i10);
    }

    @dl.d
    public static final String c() {
        return f8122b;
    }
}
