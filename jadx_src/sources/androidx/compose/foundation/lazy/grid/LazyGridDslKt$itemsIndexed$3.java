package androidx.compose.foundation.lazy.grid;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/lazy/grid/m;", "", "it", "Landroidx/compose/foundation/lazy/grid/d;", ak.av, "(Landroidx/compose/foundation/lazy/grid/m;I)J"}, k = 3, mv = {1, 7, 1})
public final class LazyGridDslKt$itemsIndexed$3 extends Lambda implements yh.p<m, Integer, d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ yh.q<m, Integer, T, d> f6705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<T> f6706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridDslKt$itemsIndexed$3(yh.q<? super m, ? super Integer, ? super T, d> qVar, List<? extends T> list) {
        super(2);
        this.f6705b = qVar;
        this.f6706c = list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final long a(@dl.d m mVar, int i10) {
        f0.p(mVar, "$this$null");
        return this.f6705b.invoke(mVar, Integer.valueOf(i10), (T) this.f6706c.get(i10)).getPackedValue();
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ d invoke(m mVar, Integer num) {
        return d.a(a(mVar, num.intValue()));
    }
}
