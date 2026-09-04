package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.x;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import n1.j;
import s1.u;
import s1.w;

/* JADX INFO: compiled from: PlaceholderExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"!\u0010\u0013\u001a\u00020\n*\u00020\u000e8BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"!\u0010\u0019\u001a\u00020\n*\u00020\u00148BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "placeholders", "Ls1/e;", "density", "Lkotlin/b2;", "f", "placeholder", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "e", "Ls1/u;", ak.av, "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Landroidx/compose/ui/text/x;", ak.aF, "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class c {
    private static final int a(long j10) {
        long jM = u.m(j10);
        w.a aVar = w.f139257b;
        if (w.g(jM, aVar.b())) {
            return 0;
        }
        return w.g(jM, aVar.a()) ? 1 : 2;
    }

    private static /* synthetic */ void b(long j10) {
    }

    private static final int c(int i10) {
        x.Companion companion = x.INSTANCE;
        if (x.k(i10, companion.a())) {
            return 0;
        }
        if (x.k(i10, companion.g())) {
            return 1;
        }
        if (x.k(i10, companion.b())) {
            return 2;
        }
        if (x.k(i10, companion.c())) {
            return 3;
        }
        if (x.k(i10, companion.f())) {
            return 4;
        }
        if (x.k(i10, companion.d())) {
            return 5;
        }
        if (x.k(i10, companion.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static /* synthetic */ void d(int i10) {
    }

    private static final void e(Spannable spannable, Placeholder placeholder, int i10, int i11, s1.e eVar) {
        SpannableExtensions_androidKt.r(spannable, new j(u.n(placeholder.getWidth()), a(placeholder.getWidth()), u.n(placeholder.getHeight()), a(placeholder.getHeight()), eVar.getF139218c() * eVar.getF139217b(), c(placeholder.getPlaceholderVerticalAlign())), i10, i11);
    }

    public static final void f(@dl.d Spannable spannable, @dl.d List<androidx.compose.ui.text.d.Range<Placeholder>> placeholders, @dl.d s1.e density) {
        f0.p(spannable, "<this>");
        f0.p(placeholders, "placeholders");
        f0.p(density, "density");
        int size = placeholders.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.text.d.Range<Placeholder> range = placeholders.get(i10);
            e(spannable, range.a(), range.getStart(), range.getEnd(), density);
        }
    }
}
