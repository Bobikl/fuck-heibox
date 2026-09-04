package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.j2;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/i;", "", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", ak.aF, "(ILandroidx/compose/runtime/p;I)V", "b", "e", ak.av, "()I", "itemCount", "", "d", "()Ljava/util/Map;", "keyToIndexMap", "foundation_release"}, k = 1, mv = {1, 7, 1})
public interface i {
    int a();

    @dl.e
    Object b(int index);

    @androidx.compose.runtime.h
    void c(int i10, @dl.e androidx.compose.runtime.p pVar, int i11);

    @dl.d
    Map<Object, Integer> d();

    @dl.d
    Object e(int index);
}
