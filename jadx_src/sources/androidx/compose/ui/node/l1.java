package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0018\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0011\u0010\u001d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\fR\u0014\u0010$\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001f\u0088\u0001\u0015\u0092\u0001\u00020\u0011ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/node/l1;", "", "Landroidx/compose/ui/node/n;", "diagonals", "Lkotlin/b2;", ak.av, "([ILandroidx/compose/ui/node/n;)V", "", "p", "([I)Ljava/lang/String;", "", "n", "([I)I", "other", "", "d", "([ILjava/lang/Object;)Z", "", "[I", "f", "()[I", "data", "l", "startX", "m", "startY", RXScreenCaptureService.KEY_HEIGHT, "endX", "i", "endY", "k", "([I)Z", "reverse", "g", "diagonalSize", "j", "hasAdditionOrRemoval", "o", "isAddition", ak.aF, "([I)[I", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] data;

    private /* synthetic */ l1(int[] iArr) {
        this.data = iArr;
    }

    public static final void a(int[] iArr, @dl.d n diagonals) {
        kotlin.jvm.internal.f0.p(diagonals, "diagonals");
        if (!j(iArr)) {
            diagonals.e(l(iArr), m(iArr), h(iArr) - l(iArr));
            return;
        }
        if (k(iArr)) {
            diagonals.e(l(iArr), m(iArr), g(iArr));
        } else if (o(iArr)) {
            diagonals.e(l(iArr), m(iArr) + 1, g(iArr));
        } else {
            diagonals.e(l(iArr) + 1, m(iArr), g(iArr));
        }
    }

    public static final /* synthetic */ l1 b(int[] iArr) {
        return new l1(iArr);
    }

    @dl.d
    public static int[] c(@dl.d int[] data) {
        kotlin.jvm.internal.f0.p(data, "data");
        return data;
    }

    public static boolean d(int[] iArr, Object obj) {
        return (obj instanceof l1) && kotlin.jvm.internal.f0.g(iArr, ((l1) obj).q());
    }

    public static final boolean e(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.f0.g(iArr, iArr2);
    }

    public static final int g(int[] iArr) {
        return Math.min(h(iArr) - l(iArr), i(iArr) - m(iArr));
    }

    public static final int h(int[] iArr) {
        return iArr[2];
    }

    public static final int i(int[] iArr) {
        return iArr[3];
    }

    private static final boolean j(int[] iArr) {
        return i(iArr) - m(iArr) != h(iArr) - l(iArr);
    }

    public static final boolean k(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int l(int[] iArr) {
        return iArr[0];
    }

    public static final int m(int[] iArr) {
        return iArr[1];
    }

    public static int n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    private static final boolean o(int[] iArr) {
        return i(iArr) - m(iArr) > h(iArr) - l(iArr);
    }

    @dl.d
    public static String p(int[] iArr) {
        return "Snake(" + l(iArr) + ',' + m(iArr) + ',' + h(iArr) + ',' + i(iArr) + ',' + k(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.data, obj);
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return n(this.data);
    }

    public final /* synthetic */ int[] q() {
        return this.data;
    }

    @dl.d
    public String toString() {
        return p(this.data);
    }
}
