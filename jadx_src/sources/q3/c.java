package q3;

import androidx.work.m;
import androidx.work.n;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConstraintTrackingWorker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¨\u0006\u0005"}, d2 = {"Landroidx/work/impl/utils/futures/a;", "Landroidx/work/m$a;", "", "d", "e", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f138582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f138583b = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";

    static {
        String strI = n.i("ConstraintTrkngWrkr");
        f0.o(strI, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f138582a = strI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(androidx.work.impl.utils.futures.a<m.a> aVar) {
        return aVar.p(m.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(androidx.work.impl.utils.futures.a<m.a> aVar) {
        return aVar.p(m.a.d());
    }
}
