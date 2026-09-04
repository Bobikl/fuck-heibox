package androidx.compose.foundation;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0004\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ae\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u00012'\u0010\f\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a^\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012)\u0010\u0011\u001a%\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aT\u0010\u0015\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "", "predicate", ak.av, "R", "initial", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "acc", "operation", "b", "(Ljava/util/List;Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "", UCropPlusActivity.ARG_INDEX, "transform", ak.aF, "", "selector", "d", "(Ljava/util/List;Lyh/l;)Ljava/lang/Comparable;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class p0 {
    @dl.d
    public static final <T> List<T> a(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T, R> R b(@dl.d List<? extends T> list, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = operation.invoke(r10, list.get(i10));
        }
        return r10;
    }

    @dl.d
    public static final <T, R> List<R> c(@dl.d List<? extends T> list, @dl.d yh.p<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = transform.invoke(Integer.valueOf(i10), list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @dl.e
    public static final <T, R extends Comparable<? super R>> R d(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = selector.invoke(list.get(0));
        int iG = CollectionsKt__CollectionsKt.G(list);
        int i10 = 1;
        if (1 <= iG) {
            while (true) {
                R rInvoke2 = selector.invoke(list.get(i10));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i10 == iG) {
                    break;
                }
                i10++;
            }
        }
        return rInvoke;
    }
}
