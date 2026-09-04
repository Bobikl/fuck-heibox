package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "", ak.av, "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
public final class FlowKt__ZipKt$combine$6$1<T> extends Lambda implements yh.a<T[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e<T>[] f129791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$1(e<T>[] eVarArr) {
        super(0);
        this.f129791b = eVarArr;
    }

    @Override // yh.a
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T[] invoke() {
        int length = this.f129791b.length;
        f0.y(0, "T?");
        return (T[]) new Object[length];
    }
}
