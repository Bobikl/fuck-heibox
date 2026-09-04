package androidx.compose.ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.compose.ui.text.platform.l;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import p1.LocaleList;

/* JADX INFO: compiled from: LocaleExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(24)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/b;", "", "Lp1/f;", "localeList", ak.av, "Landroidx/compose/ui/text/platform/l;", "textPaint", "Lkotlin/b2;", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f16858a = new b();

    private b() {
    }

    @u
    @dl.d
    @w0(24)
    public final Object a(@dl.d LocaleList localeList) {
        f0.p(localeList, "localeList");
        ArrayList arrayList = new ArrayList(t.Y(localeList, 10));
        Iterator<p1.e> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @u
    @w0(24)
    public final void b(@dl.d l textPaint, @dl.d LocaleList localeList) {
        f0.p(textPaint, "textPaint");
        f0.p(localeList, "localeList");
        ArrayList arrayList = new ArrayList(t.Y(localeList, 10));
        Iterator<p1.e> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        textPaint.setTextLocales(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
