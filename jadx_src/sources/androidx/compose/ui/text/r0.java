package androidx.compose.ui.text;

import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007\u001a'\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/q0;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "stop", "", Progress.G, ak.aF, "style", "Landroidx/compose/ui/unit/LayoutDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "d", "layoutDirection", "Landroidx/compose/ui/text/style/j;", "textDirection", "e", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/j;)I", "Landroidx/compose/ui/text/z;", "platformSpanStyle", "Landroidx/compose/ui/text/y;", "platformParagraphStyle", "Landroidx/compose/ui/text/b0;", "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class r0 {

    /* JADX INFO: compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16880a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f16880a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle b(z zVar, PlatformParagraphStyle platformParagraphStyle) {
        if (zVar == null && platformParagraphStyle == null) {
            return null;
        }
        return c.a(zVar, platformParagraphStyle);
    }

    @dl.d
    public static final TextStyle c(@dl.d TextStyle start, @dl.d TextStyle stop, float f10) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(stop, "stop");
        return new TextStyle(SpanStyleKt.b(start.X(), stop.X(), f10), v.a(start.W(), stop.W(), f10));
    }

    @dl.d
    public static final TextStyle d(@dl.d TextStyle style, @dl.d LayoutDirection direction) {
        kotlin.jvm.internal.f0.p(style, "style");
        kotlin.jvm.internal.f0.p(direction, "direction");
        return new TextStyle(SpanStyleKt.f(style.getSpanStyle()), v.c(style.getParagraphStyle(), direction), style.getPlatformStyle());
    }

    public static final int e(@dl.d LayoutDirection layoutDirection, @dl.e androidx.compose.ui.text.style.j jVar) {
        kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
        androidx.compose.ui.text.style.j.Companion companion = androidx.compose.ui.text.style.j.INSTANCE;
        if (jVar == null ? false : androidx.compose.ui.text.style.j.i(jVar.getValue(), companion.a())) {
            int i10 = a.f16880a[layoutDirection.ordinal()];
            if (i10 == 1) {
                return companion.b();
            }
            if (i10 == 2) {
                return companion.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (jVar != null) {
            return jVar.getValue();
        }
        int i11 = a.f16880a[layoutDirection.ordinal()];
        if (i11 == 1) {
            return companion.d();
        }
        if (i11 == 2) {
            return companion.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
