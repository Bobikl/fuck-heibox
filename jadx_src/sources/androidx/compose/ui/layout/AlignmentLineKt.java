package androidx.compose.ui.layout;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AlignmentLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/a;", "", "position1", "position2", ak.aF, "Landroidx/compose/ui/layout/k;", ak.av, "Landroidx/compose/ui/layout/k;", "()Landroidx/compose/ui/layout/k;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AlignmentLineKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final k f14873a = new k(AlignmentLineKt$FirstBaseline$1.f14875d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final k f14874b = new k(AlignmentLineKt$LastBaseline$1.f14876d);

    @dl.d
    public static final k a() {
        return f14873a;
    }

    @dl.d
    public static final k b() {
        return f14874b;
    }

    public static final int c(@dl.d a aVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(aVar, "<this>");
        return aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
