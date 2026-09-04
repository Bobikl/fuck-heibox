package androidx.compose.foundation.lazy.grid;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import org.apache.tools.ant.taskdefs.a6;

/* JADX INFO: compiled from: LazyGridItemInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\u00020\t8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001d\u0010\u0013\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\u0082\u0001\u0001\u0014ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/h;", "", "", "getIndex", "()I", UCropPlusActivity.ARG_INDEX, "getKey", "()Ljava/lang/Object;", "key", "Ls1/n;", ak.aF, "()J", androidx.constraintlayout.core.motion.utils.w.c.R, "getRow", a6.a.f133725d, "b", "column", "Ls1/r;", ak.av, UiKitSpanObj.TYPE_SIZE, "Landroidx/compose/foundation/lazy/grid/q;", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f6912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6910b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f6911c = -1;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.h$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LazyGridItemInfo.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/grid/h$a;", "", "", "b", "I", "UnknownRow", ak.aF, "UnknownColumn", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f6912a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int UnknownRow = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int UnknownColumn = -1;

        private Companion() {
        }
    }

    long a();

    int b();

    long c();

    int getIndex();

    @dl.d
    Object getKey();

    int getRow();
}
