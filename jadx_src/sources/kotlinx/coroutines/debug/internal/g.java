package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.ak;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/debug/internal/g;", androidx.exifinterface.media.a.f23244d5, "Ljava/lang/ref/WeakReference;", "", ak.av, "I", "hash", "ref", "Ljava/lang/ref/ReferenceQueue;", "queue", "<init>", "(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class g<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @xh.e
    public final int hash;

    public g(T t10, @dl.e ReferenceQueue<T> referenceQueue) {
        super(t10, referenceQueue);
        this.hash = t10 != null ? t10.hashCode() : 0;
    }
}
