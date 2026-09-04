package androidx.compose.ui.layout;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005J%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH&J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H¦\u0002R\u001d\u0010\u001d\u001a\u00020\u001a8&X¦\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010)\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(ø\u0001\u0003\u0082\u0002\u0015\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/q;", "", "Lb1/f;", "relativeToWindow", "i0", "(J)J", "relativeToLocal", RXScreenCaptureService.KEY_WIDTH, "L", "sourceCoordinates", "relativeToSource", "a0", "(Landroidx/compose/ui/layout/q;J)J", "", "clipBounds", "Lb1/i;", "x", "Landroidx/compose/ui/graphics/c1;", "matrix", "Lkotlin/b2;", "s0", "(Landroidx/compose/ui/layout/q;[F)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "v", "Ls1/r;", ak.av, "()J", UiKitSpanObj.TYPE_SIZE, "", "A1", "()Ljava/util/Set;", "providedAlignmentLines", "D", "()Landroidx/compose/ui/layout/q;", "parentLayoutCoordinates", "c0", "parentCoordinates", "p", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 7, 1})
public interface q {

    /* JADX INFO: compiled from: LayoutCoordinates.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Deprecated
        public static void b(@dl.d q qVar, @dl.d q sourceCoordinates, @dl.d float[] matrix) {
            kotlin.jvm.internal.f0.p(sourceCoordinates, "sourceCoordinates");
            kotlin.jvm.internal.f0.p(matrix, "matrix");
            p.a(qVar, sourceCoordinates, matrix);
        }
    }

    @dl.d
    Set<androidx.compose.ui.layout.a> A1();

    @dl.e
    q D();

    long L(long relativeToLocal);

    long a();

    long a0(@dl.d q sourceCoordinates, long relativeToSource);

    @dl.e
    q c0();

    long i0(long relativeToWindow);

    boolean p();

    void s0(@dl.d q sourceCoordinates, @dl.d float[] matrix);

    int v(@dl.d androidx.compose.ui.layout.a alignmentLine);

    long w(long relativeToLocal);

    @dl.d
    b1.i x(@dl.d q sourceCoordinates, boolean clipBounds);
}
