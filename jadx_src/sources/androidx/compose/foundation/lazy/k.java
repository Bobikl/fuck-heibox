package androidx.compose.foundation.lazy;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListHeaders.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\u001aF\u0010\u000b\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¨\u0006\f"}, d2 = {"", "Landroidx/compose/foundation/lazy/v;", "composedVisibleItems", "Landroidx/compose/foundation/lazy/z;", "itemProvider", "", "", "headerIndexes", "beforeContentPadding", "layoutWidth", "layoutHeight", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    @dl.e
    public static final v a(@dl.d List<v> composedVisibleItems, @dl.d z itemProvider, @dl.d List<Integer> headerIndexes, int i10, int i11, int i12) {
        f0.p(composedVisibleItems, "composedVisibleItems");
        f0.p(itemProvider, "itemProvider");
        f0.p(headerIndexes, "headerIndexes");
        int i13 = ((v) CollectionsKt___CollectionsKt.w2(composedVisibleItems)).getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
        int size = headerIndexes.size();
        int i14 = 0;
        int iIntValue = -1;
        int iIntValue2 = -1;
        while (i14 < size && headerIndexes.get(i14).intValue() <= i13) {
            iIntValue = headerIndexes.get(i14).intValue();
            i14++;
            iIntValue2 = ((i14 < 0 || i14 > CollectionsKt__CollectionsKt.G(headerIndexes)) ? -1 : headerIndexes.get(i14)).intValue();
        }
        int size2 = composedVisibleItems.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < size2; i16++) {
            v vVar = composedVisibleItems.get(i16);
            if (vVar.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() == iIntValue) {
                offset = vVar.getOffset();
                i15 = i16;
            } else if (vVar.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() == iIntValue2) {
                offset2 = vVar.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        y yVarA = itemProvider.a(b.c(iIntValue));
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i10, offset) : -i10;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - yVarA.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String());
        }
        v vVarF = yVarA.f(iMax, i11, i12);
        if (i15 != -1) {
            composedVisibleItems.set(i15, vVarF);
        } else {
            composedVisibleItems.add(0, vVarF);
        }
        return vVarF;
    }
}
