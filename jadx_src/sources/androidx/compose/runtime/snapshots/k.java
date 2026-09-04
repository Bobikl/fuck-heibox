package androidx.compose.runtime.snapshots;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002R$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/compose/runtime/snapshots/k;", "", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "j", "i", ak.av, "b", "k", "atLeast", ak.aF, "handle", "d", "default", "f", "value", RXScreenCaptureService.KEY_HEIGHT, "l", "m", "<set-?>", "I", "e", "()I", UiKitSpanObj.TYPE_SIZE, "", "[I", "values", "handles", "firstFreeHandle", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] values = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] index = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] handles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstFreeHandle;

    public k() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.handles = iArr;
    }

    private final int b() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i10 = 0;
            int i11 = length * 2;
            int[] iArr = new int[i11];
            while (i10 < i11) {
                int i12 = i10 + 1;
                iArr[i10] = i12;
                i10 = i12;
            }
            kotlin.collections.m.j1(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i13 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i13];
        return i13;
    }

    private final void c(int i10) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        kotlin.collections.m.j1(iArr, iArr2, 0, 0, 0, 14, null);
        kotlin.collections.m.j1(this.index, iArr3, 0, 0, 0, 14, null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void d(int i10) {
        this.handles[i10] = this.firstFreeHandle;
        this.firstFreeHandle = i10;
    }

    public static /* synthetic */ int g(k kVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return kVar.f(i10);
    }

    private final void i(int i10) {
        int i11;
        int[] iArr = this.values;
        int i12 = this.size >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.size || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] >= iArr[i10]) {
                    return;
                }
                k(i14, i10);
                i10 = i14;
            } else {
                if (i11 >= iArr[i10]) {
                    return;
                }
                k(i13, i10);
                i10 = i13;
            }
        }
    }

    private final void j(int i10) {
        int[] iArr = this.values;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] <= i11) {
                return;
            }
            k(i12, i10);
            i10 = i12;
        }
    }

    private final void k(int i10, int i11) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int a(int value) {
        c(this.size + 1);
        int i10 = this.size;
        this.size = i10 + 1;
        int iB = b();
        this.values[i10] = value;
        this.index[i10] = iB;
        this.handles[iB] = i10;
        j(i10);
        return iB;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int f(int i10) {
        return this.size > 0 ? this.values[0] : i10;
    }

    public final void h(int i10) {
        int i11 = this.handles[i10];
        k(i11, this.size - 1);
        this.size--;
        j(i11);
        i(i11);
        d(i10);
    }

    public final void l() {
        int i10 = this.size;
        int i11 = 1;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int[] iArr = this.values;
            if (iArr[(i12 >> 1) - 1] > iArr[i11]) {
                throw new IllegalStateException(("Index " + i11 + " is out of place").toString());
            }
            i11 = i12;
        }
    }

    public final void m(int i10, int i11) {
        int i12 = this.handles[i10];
        if (this.index[i12] != i10) {
            throw new IllegalStateException(("Index for handle " + i10 + " is corrupted").toString());
        }
        if (this.values[i12] == i11) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + i10 + " was " + this.values[i12] + " but was supposed to be " + i11).toString());
    }
}
