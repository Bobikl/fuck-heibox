package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/d2;", "", "", "d", "()J", "longPressTimeoutMillis", ak.aF, "doubleTapTimeoutMillis", ak.av, "doubleTapMinTimeMillis", "", "b", "()F", "touchSlop", "Ls1/l;", "e", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface d2 {

    /* JADX INFO: compiled from: ViewConfiguration.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static long a(@dl.d d2 d2Var) {
            return c2.a(d2Var);
        }
    }

    long a();

    float b();

    long c();

    long d();

    long e();
}
