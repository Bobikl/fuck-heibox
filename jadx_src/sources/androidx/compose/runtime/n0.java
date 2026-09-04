package androidx.compose.runtime;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/n0;", "", "", "value", "Lkotlin/b2;", "j", "i", "default", RXScreenCaptureService.KEY_HEIGHT, "f", UCropPlusActivity.ARG_INDEX, "g", "", "d", "e", ak.av, ak.aF, "", "[I", "slots", "b", "I", "tos", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] slots = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int tos;

    public final void a() {
        this.tos = 0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTos() {
        return this.tos;
    }

    public final int c(int value) {
        int i10 = this.tos;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.slots[i11] == value) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean d() {
        return this.tos == 0;
    }

    public final boolean e() {
        return this.tos != 0;
    }

    public final int f() {
        return this.slots[this.tos - 1];
    }

    public final int g(int index) {
        return this.slots[index];
    }

    public final int h(int i10) {
        return this.tos > 0 ? f() : i10;
    }

    public final int i() {
        int[] iArr = this.slots;
        int i10 = this.tos - 1;
        this.tos = i10;
        return iArr[i10];
    }

    public final void j(int i10) {
        int i11 = this.tos;
        int[] iArr = this.slots;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.slots = iArrCopyOf;
        }
        int[] iArr2 = this.slots;
        int i12 = this.tos;
        this.tos = i12 + 1;
        iArr2[i12] = i10;
    }
}
