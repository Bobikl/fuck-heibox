package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001d\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/q;", "", "", "Landroidx/compose/foundation/lazy/m;", "f", "()Ljava/util/List;", "visibleItemsInfo", "", "e", "()I", "viewportStartOffset", "g", "viewportEndOffset", "d", "totalItemsCount", "Ls1/r;", ak.av, "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", ak.aF, "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "j", "()Z", "reverseLayout", RXScreenCaptureService.KEY_HEIGHT, "beforeContentPadding", "b", "afterContentPadding", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface q {

    /* JADX INFO: compiled from: LazyListLayoutInfo.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static int a(@dl.d q qVar) {
            return p.a(qVar);
        }

        @Deprecated
        public static int b(@dl.d q qVar) {
            return p.b(qVar);
        }

        @dl.d
        @Deprecated
        public static Orientation c(@dl.d q qVar) {
            return p.c(qVar);
        }

        @Deprecated
        public static boolean d(@dl.d q qVar) {
            return p.d(qVar);
        }

        @Deprecated
        public static long e(@dl.d q qVar) {
            return p.e(qVar);
        }
    }

    long a();

    int b();

    @dl.d
    Orientation c();

    int d();

    int e();

    @dl.d
    List<m> f();

    int g();

    int h();

    boolean j();
}
