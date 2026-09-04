package androidx.compose.foundation.text;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InlineTextContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0014\u0010\u0007\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/d$a;", "", "id", "alternateText", "Lkotlin/b2;", ak.av, "Ljava/lang/String;", "INLINE_CONTENT_TAG", "b", "REPLACEMENT_CHAR", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final String f8061a = "androidx.compose.foundation.text.inlineContent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f8062b = "�";

    public static final void a(@dl.d androidx.compose.ui.text.d.a aVar, @dl.d String id2, @dl.d String alternateText) {
        f0.p(aVar, "<this>");
        f0.p(id2, "id");
        f0.p(alternateText, "alternateText");
        if (!(alternateText.length() > 0)) {
            throw new IllegalArgumentException("alternateText can't be an empty string.".toString());
        }
        aVar.l(f8061a, id2);
        aVar.h(alternateText);
        aVar.j();
    }

    public static /* synthetic */ void b(androidx.compose.ui.text.d.a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = f8062b;
        }
        a(aVar, str, str2);
    }
}
