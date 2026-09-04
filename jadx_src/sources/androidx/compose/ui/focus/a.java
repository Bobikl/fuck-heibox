package androidx.compose.ui.focus;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/focus/b;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "Landroidx/compose/ui/layout/b$a;", "Lkotlin/t;", "block", ak.av, "(Landroidx/compose/ui/focus/FocusModifier;ILyh/l;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class a {
    @dl.e
    public static final <T> T a(@dl.d FocusModifier searchBeyondBounds, int i10, @dl.d yh.l<? super androidx.compose.ui.layout.b.a, ? extends T> block) {
        int iC;
        f0.p(searchBeyondBounds, "$this$searchBeyondBounds");
        f0.p(block, "block");
        androidx.compose.ui.layout.b beyondBoundsLayoutParent = searchBeyondBounds.getBeyondBoundsLayoutParent();
        if (beyondBoundsLayoutParent == null) {
            return null;
        }
        b.Companion companion = b.INSTANCE;
        if (b.n(i10, companion.n())) {
            iC = androidx.compose.ui.layout.b.C0089b.INSTANCE.a();
        } else if (b.n(i10, companion.a())) {
            iC = androidx.compose.ui.layout.b.C0089b.INSTANCE.d();
        } else if (b.n(i10, companion.h())) {
            iC = androidx.compose.ui.layout.b.C0089b.INSTANCE.e();
        } else if (b.n(i10, companion.m())) {
            iC = androidx.compose.ui.layout.b.C0089b.INSTANCE.f();
        } else if (b.n(i10, companion.i())) {
            iC = androidx.compose.ui.layout.b.C0089b.INSTANCE.b();
        } else {
            if (!b.n(i10, companion.l())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iC = androidx.compose.ui.layout.b.C0089b.INSTANCE.c();
        }
        return (T) beyondBoundsLayoutParent.a(iC, block);
    }
}
