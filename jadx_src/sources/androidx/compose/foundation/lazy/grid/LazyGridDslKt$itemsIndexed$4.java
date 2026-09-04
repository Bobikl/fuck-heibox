package androidx.compose.foundation.lazy.grid;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, "", ak.av, "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
public final class LazyGridDslKt$itemsIndexed$4 extends Lambda implements yh.l<Integer, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.p<Integer, T, Object> f6707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<T> f6708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$4(yh.p<? super Integer, ? super T, ? extends Object> pVar, List<? extends T> list) {
        super(1);
        this.f6707b = pVar;
        this.f6708c = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @dl.e
    public final Object a(int i10) {
        return this.f6707b.invoke(Integer.valueOf(i10), (T) this.f6708c.get(i10));
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return a(num.intValue());
    }
}
