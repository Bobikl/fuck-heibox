package androidx.compose.ui.text;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aG\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aT\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\t*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001ae\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00028\u00012'\u0010\u0012\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aM\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00150\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0000\u001aA\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001ab\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0002H\u0000\u001a\u007f\u0010*\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010(*\u00060&j\u0002`'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010)\u001a\u00028\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001e2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0002H\u0002¢\u0006\u0004\b*\u0010+\u001a;\u0010.\u001a\u00020-\"\u0004\b\u0000\u0010\u0000*\u00060&j\u0002`'2\u0006\u0010,\u001a\u00028\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0002H\u0002¢\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "", "predicate", "d", "K", "selector", "b", "", "R", "m", "(Ljava/util/List;Lyh/l;)Ljava/lang/Object;", "initial", "Lkotlin/Function2;", "Lkotlin/m0;", "name", "acc", "operation", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/util/List;Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "", "transform", "g", "e", "", "f", "n", "", ak.aF, "", "separator", "prefix", "postfix", "limit", "truncated", "", "k", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", androidx.exifinterface.media.a.W4, "buffer", "i", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lyh/l;)Ljava/lang/Appendable;", "element", "Lkotlin/b2;", ak.av, "(Ljava/lang/Appendable;Ljava/lang/Object;Lyh/l;)V", "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class f0 {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void a(Appendable appendable, T t10, yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    @dl.d
    public static final <T, K> List<T> b(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <T> List<T> c(@dl.d List<? extends T> list, int i10) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return list;
        }
        int size = list.size() - i10;
        if (size <= 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (size == 1) {
            return kotlin.collections.s.k(CollectionsKt___CollectionsKt.k3(list));
        }
        ArrayList arrayList = new ArrayList(size);
        int size2 = list.size();
        while (i10 < size2) {
            arrayList.add(list.get(i10));
            i10++;
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> d(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
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

    @dl.d
    public static final <T> List<T> e(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (!predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T> List<T> f(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R> List<R> g(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            kotlin.collections.x.n0(arrayList, transform.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> R h(@dl.d List<? extends T> list, R r10, @dl.d yh.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(operation, "operation");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = operation.invoke(r10, list.get(i10));
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A i(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @dl.d
    public static final <T> String k(@dl.d List<? extends T> list, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) i(list, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String l(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return k(list, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.e
    public static final <T, R extends Comparable<? super R>> T m(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(selector, "selector");
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
                if (rInvoke.compareTo(rInvoke2) > 0) {
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

    @dl.d
    public static final <T> List<T> n(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (!predicate.invoke(t10).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }
}
