package y0;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: ForEachOneBit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\b\u001a\u00020\u0006*\u00020\u000026\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "mask", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "body", ak.av, "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    public static final void a(int i10, @dl.d p<? super Integer, ? super Integer, b2> body) {
        f0.p(body, "body");
        int i11 = 0;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            body.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i11));
            i11++;
            i10 ^= iLowestOneBit;
        }
    }
}
