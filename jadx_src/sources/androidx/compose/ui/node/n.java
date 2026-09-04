package androidx.compose.ui.node;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u001e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\u0006R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/n;", "", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "elSize", "Lkotlin/b2;", "g", ak.aF, "i", "j", ak.av, "b", "", "oldStart", "oldEnd", "newStart", "newEnd", "f", "x", "y", UiKitSpanObj.TYPE_SIZE, "e", "d", RXScreenCaptureService.KEY_HEIGHT, "", "[I", "stack", "I", "lastIndex", "initialCapacity", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] stack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    public n(int i10) {
        this.stack = new int[i10];
    }

    private final boolean a(int a10, int b10) {
        int[] iArr = this.stack;
        int i10 = iArr[a10];
        int i11 = iArr[b10];
        if (i10 >= i11) {
            return i10 == i11 && iArr[a10 + 1] <= iArr[b10 + 1];
        }
        return true;
    }

    private final int c(int start, int end, int elSize) {
        int i10 = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i10 += elSize;
                i(i10, start);
            }
            start += elSize;
        }
        int i11 = i10 + elSize;
        i(i11, end);
        return i11;
    }

    private final void g(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iC = c(i10, i11, i12);
            g(i10, iC - i12, i12);
            g(iC + i12, i11, i12);
        }
    }

    private final void i(int i10, int i11) {
        int[] iArr = this.stack;
        r0.i(iArr, i10, i11);
        r0.i(iArr, i10 + 1, i11 + 1);
        r0.i(iArr, i10 + 2, i11 + 2);
    }

    public final boolean b() {
        return this.lastIndex != 0;
    }

    public final int d() {
        int[] iArr = this.stack;
        int i10 = this.lastIndex - 1;
        this.lastIndex = i10;
        return iArr[i10];
    }

    public final void e(int i10, int i11, int i12) {
        int i13 = this.lastIndex;
        int i14 = i13 + 3;
        int[] iArr = this.stack;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i13 + 0] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.lastIndex = i14;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        int i14 = this.lastIndex;
        int i15 = i14 + 4;
        int[] iArr = this.stack;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i14 + 0] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.lastIndex = i15;
    }

    public final void h() {
        int i10 = this.lastIndex;
        if (!(i10 % 3 == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i10 > 3) {
            g(0, i10 - 3, 3);
        }
    }
}
