package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: NestedVectorStack.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/s0;", androidx.exifinterface.media.a.f23244d5, "", "", "value", "Lkotlin/b2;", "d", "", ak.av, "b", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/e;", "vector", ak.aF, "I", org.apache.tools.ant.taskdefs.optional.vss.g.H2, "lastIndex", "", "[I", "indexes", "Landroidx/compose/runtime/collection/e;", "vectors", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class s0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int current = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private int[] indexes = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<androidx.compose.runtime.collection.e<T>> vectors = new androidx.compose.runtime.collection.e<>(new androidx.compose.runtime.collection.e[16], 0);

    private final void d(int i10) {
        int i11 = this.lastIndex;
        int[] iArr = this.indexes;
        if (i11 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.f0.o(iArrCopyOf, "copyOf(this, newSize)");
            this.indexes = iArrCopyOf;
        }
        int[] iArr2 = this.indexes;
        int i12 = this.lastIndex;
        this.lastIndex = i12 + 1;
        iArr2[i12] = i10;
    }

    public final boolean a() {
        int i10 = this.current;
        return i10 >= 0 && this.indexes[i10] >= 0;
    }

    public final T b() {
        int i10 = this.current;
        int i11 = this.indexes[i10];
        androidx.compose.runtime.collection.e<T> eVar = this.vectors.G()[i10];
        if (i11 > 0) {
            int[] iArr = this.indexes;
            iArr[i10] = iArr[i10] - 1;
        } else if (i11 == 0) {
            this.vectors.g0(i10);
            this.current--;
        }
        return eVar.G()[i11];
    }

    public final void c(@dl.d androidx.compose.runtime.collection.e<T> vector) {
        kotlin.jvm.internal.f0.p(vector, "vector");
        if (vector.Q()) {
            this.vectors.b(vector);
            d(vector.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
            this.current++;
        }
    }
}
