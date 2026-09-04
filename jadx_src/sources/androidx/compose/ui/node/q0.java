package androidx.compose.ui.node;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: MutableVectorWithMutationTracking.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\fH\u0086\bø\u0001\u0000J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/q0;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", ak.aF, "", UCropPlusActivity.ARG_INDEX, "element", ak.av, "(ILjava/lang/Object;)V", "i", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "d", "", "b", "e", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/runtime/collection/e;", RXScreenCaptureService.KEY_HEIGHT, "()Landroidx/compose/runtime/collection/e;", "vector", "Lkotlin/Function0;", "onVectorMutated", "Lyh/a;", "f", "()Lyh/a;", "g", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "(Landroidx/compose/runtime/collection/e;Lyh/a;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class q0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<T> vector;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.a<b2> f15363b;

    public q0(@dl.d androidx.compose.runtime.collection.e<T> vector, @dl.d yh.a<b2> onVectorMutated) {
        kotlin.jvm.internal.f0.p(vector, "vector");
        kotlin.jvm.internal.f0.p(onVectorMutated, "onVectorMutated");
        this.vector = vector;
        this.f15363b = onVectorMutated;
    }

    public final void a(int index, T element) {
        this.vector.a(index, element);
        this.f15363b.invoke();
    }

    @dl.d
    public final List<T> b() {
        return this.vector.l();
    }

    public final void c() {
        this.vector.m();
        this.f15363b.invoke();
    }

    public final void d(@dl.d yh.l<? super T, b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        androidx.compose.runtime.collection.e<T> eVarH = h();
        int i10 = eVarH.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            T[] tArrG = eVarH.G();
            kotlin.jvm.internal.f0.n(tArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                block.invoke(tArrG[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public final T e(int index) {
        return this.vector.G()[index];
    }

    @dl.d
    public final yh.a<b2> f() {
        return this.f15363b;
    }

    public final int g() {
        return this.vector.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<T> h() {
        return this.vector;
    }

    public final T i(int index) {
        T tG0 = this.vector.g0(index);
        this.f15363b.invoke();
        return tG0;
    }
}
