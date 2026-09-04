package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiParagraphIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"", "Landroidx/compose/ui/text/d$b;", "Landroidx/compose/ui/text/w;", "", com.google.android.exoplayer2.text.ttml.d.f49798o0, com.google.android.exoplayer2.text.ttml.d.f49800p0, "b", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.Range<Placeholder>> b(List<d.Range<Placeholder>> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.Range<Placeholder> range = list.get(i12);
            d.Range<Placeholder> range2 = range;
            if (AnnotatedStringKt.o(i10, i11, range2.i(), range2.g())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.Range range3 = (d.Range) arrayList.get(i13);
            if (!(i10 <= range3.i() && range3.g() <= i11)) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
            arrayList2.add(new d.Range(range3.h(), range3.i() - i10, range3.g() - i10));
        }
        return arrayList2;
    }
}
