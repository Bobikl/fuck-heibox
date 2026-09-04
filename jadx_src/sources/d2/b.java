package d2;

import androidx.p001datastore.core.CorruptionException;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ReplaceFileCorruptionHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Ld2/b;", androidx.exifinterface.media.a.f23244d5, "Landroidx/datastore/core/a;", "Landroidx/datastore/core/CorruptionException;", "ex", ak.av, "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "produceNewData", "<init>", "(Lyh/l;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class b<T> implements androidx.p001datastore.core.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private final l<CorruptionException, T> f108132a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@d l<? super CorruptionException, ? extends T> produceNewData) {
        f0.p(produceNewData, "produceNewData");
        this.f108132a = produceNewData;
    }

    @Override // androidx.p001datastore.core.a
    @e
    public Object a(@d CorruptionException corruptionException, @d c<? super T> cVar) throws IOException {
        return this.f108132a.invoke(corruptionException);
    }
}
