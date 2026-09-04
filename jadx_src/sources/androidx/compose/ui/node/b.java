package androidx.compose.ui.node;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000e\u0088\u0001\u0016\u0092\u0001\u00020\u0013ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/b;", "", "", UCropPlusActivity.ARG_INDEX, "e", "([II)I", "value", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "([III)V", "", "i", "([I)Ljava/lang/String;", "g", "([I)I", "other", "", ak.aF, "([ILjava/lang/Object;)Z", "", ak.av, "[I", "data", "f", "mid", "b", "([I)[I", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final int[] data;

    private /* synthetic */ b(int[] iArr) {
        this.data = iArr;
    }

    public static final /* synthetic */ b a(int[] iArr) {
        return new b(iArr);
    }

    @dl.d
    public static int[] b(@dl.d int[] data) {
        kotlin.jvm.internal.f0.p(data, "data");
        return data;
    }

    public static boolean c(int[] iArr, Object obj) {
        return (obj instanceof b) && kotlin.jvm.internal.f0.g(iArr, ((b) obj).getData());
    }

    public static final boolean d(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.f0.g(iArr, iArr2);
    }

    public static final int e(int[] iArr, int i10) {
        return iArr[i10 + f(iArr)];
    }

    private static final int f(int[] iArr) {
        return iArr.length / 2;
    }

    public static int g(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void h(int[] iArr, int i10, int i11) {
        iArr[i10 + f(iArr)] = i11;
    }

    public static String i(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.data, obj);
    }

    public int hashCode() {
        return g(this.data);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ int[] getData() {
        return this.data;
    }

    public String toString() {
        return i(this.data);
    }
}
