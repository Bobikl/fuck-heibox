package v0;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import u0.f;

/* JADX INFO: compiled from: ReadOnlyCollectionAdapters.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv0/d;", androidx.exifinterface.media.a.S4, "Lu0/f;", "Lv0/a;", "", "impl", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d<E> extends a<E> implements f<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d Set<? extends E> impl) {
        super(impl);
        f0.p(impl, "impl");
    }
}
