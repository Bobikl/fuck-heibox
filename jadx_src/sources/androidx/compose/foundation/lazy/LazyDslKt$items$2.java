package androidx.compose.foundation.lazy;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, "", ak.av, "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
public final class LazyDslKt$items$2 extends Lambda implements yh.l<Integer, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.l<T, Object> f6462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<T> f6463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$2(yh.l<? super T, ? extends Object> lVar, List<? extends T> list) {
        super(1);
        this.f6462b = lVar;
        this.f6463c = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @dl.d
    public final Object a(int i10) {
        return this.f6462b.invoke((T) this.f6463c.get(i10));
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return a(num.intValue());
    }
}
