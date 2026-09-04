package androidx.compose.foundation.lazy.layout;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\b0\u0012H\u0016J\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\f\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/s;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/lazy/layout/c;", "", "itemIndex", "Landroidx/compose/foundation/lazy/layout/c$a;", "f", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "d", "", "e", UiKitSpanObj.TYPE_SIZE, "value", ak.aF, "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "b", "get", "Landroidx/compose/runtime/collection/e;", ak.av, "Landroidx/compose/runtime/collection/e;", "intervals", "<set-?>", "I", "()I", "Landroidx/compose/foundation/lazy/layout/c$a;", "lastInterval", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class s<T> implements c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7162d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<c.a<T>> intervals = new androidx.compose.runtime.collection.e<>(new c.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private c.a<? extends T> lastInterval;

    private final void d(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < getSize()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
    }

    private final boolean e(c.a<? extends T> aVar, int i10) {
        return i10 < aVar.getStartIndex() + aVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() && aVar.getStartIndex() <= i10;
    }

    private final c.a<T> f(int itemIndex) {
        c.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && e(aVar, itemIndex)) {
            return aVar;
        }
        androidx.compose.runtime.collection.e<c.a<T>> eVar = this.intervals;
        c.a aVar2 = (c.a<? extends T>) eVar.G()[d.b(eVar, itemIndex)];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    public void b(int i10, int i11, @dl.d yh.l<? super c.a<? extends T>, b2> block) {
        f0.p(block, "block");
        d(i10);
        d(i11);
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        int iB = d.b(this.intervals, i10);
        int startIndex = this.intervals.G()[iB].getStartIndex();
        while (startIndex <= i11) {
            c.a<T> aVar = this.intervals.G()[iB];
            block.invoke(aVar);
            startIndex += aVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            iB++;
        }
    }

    public final void c(int size, T value) {
        if (!(size >= 0)) {
            throw new IllegalArgumentException(("size should be >=0, but was " + size).toString());
        }
        if (size == 0) {
            return;
        }
        c.a<T> aVar = new c.a<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.b(aVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.c
    @dl.d
    public c.a<T> get(int index) {
        d(index);
        return f(index);
    }
}
