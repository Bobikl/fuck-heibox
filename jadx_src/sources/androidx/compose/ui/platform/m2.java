package androidx.compose.ui.platform;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.umeng.analytics.pro.ak;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: WeakCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0015\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/m2;", androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/b2;", ak.av, "element", "d", "(Ljava/lang/Object;)V", ak.aF, "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/e;", "Ljava/lang/ref/Reference;", "Landroidx/compose/runtime/collection/e;", "values", "Ljava/lang/ref/ReferenceQueue;", "b", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class m2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<Reference<T>> values = new androidx.compose.runtime.collection.e<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.c0(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int b() {
        a();
        return this.values.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
    }

    @dl.e
    public final T c() {
        a();
        while (this.values.Q()) {
            androidx.compose.runtime.collection.e<Reference<T>> eVar = this.values;
            T t10 = eVar.g0(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1).get();
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public final void d(T element) {
        a();
        this.values.b(new WeakReference(element, this.referenceQueue));
    }
}
