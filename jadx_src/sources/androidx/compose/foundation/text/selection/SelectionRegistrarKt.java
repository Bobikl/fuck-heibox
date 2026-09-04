package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.j1;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: SelectionRegistrar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/selection/o;", "", "selectableId", "", "b", "Landroidx/compose/runtime/j1;", ak.av, "Landroidx/compose/runtime/j1;", "()Landroidx/compose/runtime/j1;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SelectionRegistrarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final j1<o> f8270a = CompositionLocalKt.d(null, new yh.a<o>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarKt$LocalSelectionRegistrar$1
        @Override // yh.a
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return null;
        }
    }, 1, null);

    @dl.d
    public static final j1<o> a() {
        return f8270a;
    }

    public static final boolean b(@dl.e o oVar, long j10) {
        Map<Long, Selection> mapF;
        if (oVar == null || (mapF = oVar.f()) == null) {
            return false;
        }
        return mapF.containsKey(Long.valueOf(j10));
    }
}
