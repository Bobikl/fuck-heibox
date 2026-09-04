package u1;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0005\u001a;\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aT\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u000e\u001ab\u0010\u0019\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0011\"\u0010\b\u0002\u0010\u0017*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "Lkotlin/b2;", "action", "d", "Lkotlin/Function2;", "", "e", "", "predicate", ak.av, "b", ak.aF, "(Ljava/util/List;Lyh/l;)Ljava/lang/Object;", "selector", "i", "R", "transform", "f", "", RXScreenCaptureService.KEY_HEIGHT, "", "C", "destination", "g", "(Ljava/util/List;Ljava/util/Collection;Lyh/l;)Ljava/util/Collection;", "ui-util_release"}, k = 2, mv = {1, 7, 1})
public final class c {
    public static final <T> boolean a(@dl.d List<? extends T> list, @dl.d l<? super T, Boolean> predicate) {
        f0.p(list, "<this>");
        f0.p(predicate, "predicate");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!predicate.invoke(list.get(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean b(@dl.d List<? extends T> list, @dl.d l<? super T, Boolean> predicate) {
        f0.p(list, "<this>");
        f0.p(predicate, "predicate");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (predicate.invoke(list.get(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @dl.e
    public static final <T> T c(@dl.d List<? extends T> list, @dl.d l<? super T, Boolean> predicate) {
        f0.p(list, "<this>");
        f0.p(predicate, "predicate");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (predicate.invoke(t10).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static final <T> void d(@dl.d List<? extends T> list, @dl.d l<? super T, b2> action) {
        f0.p(list, "<this>");
        f0.p(action, "action");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(list.get(i10));
        }
    }

    public static final <T> void e(@dl.d List<? extends T> list, @dl.d p<? super Integer, ? super T, b2> action) {
        f0.p(list, "<this>");
        f0.p(action, "action");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    @dl.d
    public static final <T, R> List<R> f(@dl.d List<? extends T> list, @dl.d l<? super T, ? extends R> transform) {
        f0.p(list, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(transform.invoke(list.get(i10)));
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C g(@dl.d List<? extends T> list, @dl.d C destination, @dl.d l<? super T, ? extends R> transform) {
        f0.p(list, "<this>");
        f0.p(destination, "destination");
        f0.p(transform, "transform");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            destination.add(transform.invoke(list.get(i10)));
        }
        return destination;
    }

    @dl.e
    public static final <T, R extends Comparable<? super R>> T h(@dl.d List<? extends T> list, @dl.d l<? super T, ? extends R> selector) {
        f0.p(list, "<this>");
        f0.p(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        R rInvoke = selector.invoke(t10);
        int iG = CollectionsKt__CollectionsKt.G(list);
        int i10 = 1;
        if (1 <= iG) {
            while (true) {
                T t11 = list.get(i10);
                R rInvoke2 = selector.invoke(t11);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t10 = t11;
                    rInvoke = rInvoke2;
                }
                if (i10 == iG) {
                    break;
                }
                i10++;
            }
        }
        return (T) t10;
    }

    public static final <T> int i(@dl.d List<? extends T> list, @dl.d l<? super T, Integer> selector) {
        f0.p(list, "<this>");
        f0.p(selector, "selector");
        int size = list.size();
        int iIntValue = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iIntValue += selector.invoke(list.get(i10)).intValue();
        }
        return iIntValue;
    }
}
