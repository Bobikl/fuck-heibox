package androidx.compose.ui.text.platform.extensions;

import com.umeng.analytics.pro.ak;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LocaleExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lp1/e;", "Ljava/util/Locale;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @dl.d
    public static final Locale a(@dl.d p1.e eVar) {
        f0.p(eVar, "<this>");
        p1.g f138136a = eVar.getF138136a();
        f0.n(f138136a, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((p1.a) f138136a).getF138134a();
    }
}
