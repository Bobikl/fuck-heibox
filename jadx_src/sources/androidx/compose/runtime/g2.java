package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotMutationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¨\u0006\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/d2;", "b", ak.aF, ak.av, "runtime_release"}, k = 5, mv = {1, 7, 1}, xs = "androidx/compose/runtime/SnapshotStateKt")
public final /* synthetic */ class g2 {
    @dl.d
    public static final <T> d2<T> a() {
        b1 b1Var = b1.f12626a;
        kotlin.jvm.internal.f0.n(b1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return b1Var;
    }

    @dl.d
    public static final <T> d2<T> b() {
        r1 r1Var = r1.f13057a;
        kotlin.jvm.internal.f0.n(r1Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return r1Var;
    }

    @dl.d
    public static final <T> d2<T> c() {
        p2 p2Var = p2.f13049a;
        kotlin.jvm.internal.f0.n(p2Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return p2Var;
    }
}
