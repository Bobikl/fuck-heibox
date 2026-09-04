package androidx.compose.ui.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import p1.LocaleList;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a\u0012\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Lp1/e;", "locale", "g", "e", ak.av, ak.aF, "Lp1/f;", "localeList", RXScreenCaptureService.KEY_HEIGHT, "f", "b", "d", "Landroidx/compose/ui/text/a0;", "Landroidx/compose/ui/text/a0;", "stringDelegate", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final a0 f16419a = androidx.compose.ui.text.platform.k.a();

    @dl.d
    public static final String a(@dl.d String str, @dl.d p1.e locale) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(locale, "locale");
        return f16419a.d(str, locale.getF138136a());
    }

    @dl.d
    public static final String b(@dl.d String str, @dl.d LocaleList localeList) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return a(str, localeList.isEmpty() ? p1.e.f138135b.a() : localeList.e(0));
    }

    @dl.d
    public static final String c(@dl.d String str, @dl.d p1.e locale) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(locale, "locale");
        return f16419a.c(str, locale.getF138136a());
    }

    @dl.d
    public static final String d(@dl.d String str, @dl.d LocaleList localeList) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return c(str, localeList.isEmpty() ? p1.e.f138135b.a() : localeList.e(0));
    }

    @dl.d
    public static final String e(@dl.d String str, @dl.d p1.e locale) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(locale, "locale");
        return f16419a.a(str, locale.getF138136a());
    }

    @dl.d
    public static final String f(@dl.d String str, @dl.d LocaleList localeList) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return e(str, localeList.isEmpty() ? p1.e.f138135b.a() : localeList.e(0));
    }

    @dl.d
    public static final String g(@dl.d String str, @dl.d p1.e locale) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(locale, "locale");
        return f16419a.b(str, locale.getF138136a());
    }

    @dl.d
    public static final String h(@dl.d String str, @dl.d LocaleList localeList) {
        kotlin.jvm.internal.f0.p(str, "<this>");
        kotlin.jvm.internal.f0.p(localeList, "localeList");
        return g(str, localeList.isEmpty() ? p1.e.f138135b.a() : localeList.e(0));
    }
}
