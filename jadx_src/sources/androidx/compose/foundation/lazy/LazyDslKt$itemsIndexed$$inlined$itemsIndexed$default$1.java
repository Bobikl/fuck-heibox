package androidx.compose.foundation.lazy;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", UCropPlusActivity.ARG_INDEX, "", ak.av, "(I)Ljava/lang/Object;", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3"}, k = 3, mv = {1, 7, 1})
public final class LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1 extends Lambda implements yh.l<Integer, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f6475b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(List list) {
        super(1);
        this.f6475b = list;
    }

    @dl.e
    public final Object a(int i10) {
        this.f6475b.get(i10);
        return null;
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return a(num.intValue());
    }
}
