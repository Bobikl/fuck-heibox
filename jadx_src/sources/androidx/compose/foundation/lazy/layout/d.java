package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a&\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¨\u0006\u0006"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/foundation/lazy/layout/c$a;", "", "itemIndex", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.foundation.t
    public static final <T> int b(androidx.compose.runtime.collection.e<c.a<T>> eVar, int i10) {
        int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            int startIndex = eVar.G()[i13].getStartIndex();
            if (startIndex == i10) {
                return i13;
            }
            if (startIndex < i10) {
                i12 = i13 + 1;
                if (i10 < eVar.G()[i12].getStartIndex()) {
                    return i13;
                }
            } else {
                i11 = i13 - 1;
            }
        }
        return i12;
    }
}
