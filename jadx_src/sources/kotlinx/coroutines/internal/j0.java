package kotlinx.coroutines.internal;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: compiled from: ResizableAtomicArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/j0;", androidx.exifinterface.media.a.f23244d5, "", "", ak.av, UCropPlusActivity.ARG_INDEX, "b", "(I)Ljava/lang/Object;", "value", "Lkotlin/b2;", ak.aF, "(ILjava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "initialLength", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class j0<T> {

    @dl.d
    private volatile AtomicReferenceArray<T> array;

    public j0(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    public final int a() {
        return this.array.length();
    }

    @dl.e
    public final T b(int index) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (index < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(index);
        }
        return null;
    }

    public final void c(int index, @dl.e T value) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (index < length) {
            atomicReferenceArray.set(index, value);
            return;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(fi.u.u(index + 1, length * 2));
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(index, value);
        this.array = atomicReferenceArray2;
    }
}
