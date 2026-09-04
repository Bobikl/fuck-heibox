package androidx.compose.ui.semantics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;

/* JADX INFO: compiled from: SemanticsProperties.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\"5\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/semantics/r;", "", "<set-?>", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", ak.av, "(Landroidx/compose/ui/semantics/r;)Z", ak.aF, "(Landroidx/compose/ui/semantics/r;Z)V", "getTestTagsAsResourceId$annotations", "(Landroidx/compose/ui/semantics/r;)V", "testTagsAsResourceId", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f16156a = {n0.k(new MutablePropertyReference1Impl(q.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final SemanticsPropertyKey f16157b = SemanticsPropertiesAndroid.f16066a.a();

    @androidx.compose.ui.g
    public static final boolean a(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        return ((Boolean) f16157b.c(rVar, f16156a[0])).booleanValue();
    }

    @androidx.compose.ui.g
    public static /* synthetic */ void b(r rVar) {
    }

    @androidx.compose.ui.g
    public static final void c(@dl.d r rVar, boolean z10) {
        f0.p(rVar, "<this>");
        f16157b.e(rVar, f16156a[0], Boolean.valueOf(z10));
    }
}
