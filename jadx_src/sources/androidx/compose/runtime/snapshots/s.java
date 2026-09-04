package androidx.compose.runtime.snapshots;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "d", "", UCropPlusActivity.ARG_INDEX, UiKitSpanObj.TYPE_SIZE, "Lkotlin/b2;", "e", "", ak.av, "Ljava/lang/Object;", "sync", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object f13271a = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(int i10, int i11) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
    }
}
