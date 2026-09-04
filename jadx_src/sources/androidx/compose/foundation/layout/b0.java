package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "intrinsicSize", "d", ak.av, ak.aF, "b", "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class b0 {

    /* JADX INFO: compiled from: Intrinsic.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6300a;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            iArr[IntrinsicSize.Min.ordinal()] = 1;
            iArr[IntrinsicSize.Max.ordinal()] = 2;
            f6300a = iArr;
        }
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d IntrinsicSize intrinsicSize) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(intrinsicSize, "intrinsicSize");
        int i10 = a.f6300a[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return nVar.s0(i0.f6332b);
        }
        if (i10 == 2) {
            return nVar.s0(g0.f6327b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d IntrinsicSize intrinsicSize) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(intrinsicSize, "intrinsicSize");
        int i10 = a.f6300a[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return nVar.s0(t0.f6388b);
        }
        if (i10 == 2) {
            return nVar.s0(r0.f6382b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, @dl.d IntrinsicSize intrinsicSize) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(intrinsicSize, "intrinsicSize");
        int i10 = a.f6300a[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return nVar.s0(u0.f6394b);
        }
        if (i10 == 2) {
            return nVar.s0(s0.f6386b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, @dl.d IntrinsicSize intrinsicSize) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(intrinsicSize, "intrinsicSize");
        int i10 = a.f6300a[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return nVar.s0(j0.f6335b);
        }
        if (i10 == 2) {
            return nVar.s0(h0.f6329b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
