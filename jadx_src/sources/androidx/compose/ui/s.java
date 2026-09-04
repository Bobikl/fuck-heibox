package androidx.compose.ui;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aa\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022'\u0010\n\u001a#\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u000fH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\u007f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000226\u0010\u0004\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00020\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000fH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0000\u001a\u007f\u0010$\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\"*\u00060 j\u0002`!*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010#\u001a\u00028\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010%\u001a;\u0010\u0014\u001a\u00020'\"\u0004\b\u0000\u0010\u0000*\u00060 j\u0002`!2\u0006\u0010&\u001a\u00028\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "", "Lkotlin/Function2;", "transform", "j", androidx.exifinterface.media.a.R4, "Lkotlin/m0;", "name", "acc", "operation", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/util/List;Lyh/p;)Ljava/lang/Object;", "K", androidx.exifinterface.media.a.X4, "Lkotlin/Function1;", "Lkotlin/Pair;", "", "b", "other", ak.av, "i", "g", "", "separator", "prefix", "postfix", "", "limit", "truncated", "", "e", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", androidx.exifinterface.media.a.W4, "buffer", ak.aF, "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lyh/l;)Ljava/lang/Appendable;", "element", "Lkotlin/b2;", "(Ljava/lang/Appendable;Ljava/lang/Object;Lyh/l;)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class s {
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
    public static final <T, K, V> Map<K, V> b(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        f0.p(list, "<this>");
        f0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(list.get(i10));
            linkedHashMap.put(pairInvoke.e(), pairInvoke.f());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A c(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
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
    public static final <T> String e(@dl.d List<? extends T> list, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        f0.p(list, "<this>");
        f0.p(separator, "separator");
        f0.p(prefix, "prefix");
        f0.p(postfix, "postfix");
        f0.p(truncated, "truncated");
        String string = ((StringBuilder) c(list, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        f0.o(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String f(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return e(list, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <T, R> List<R> g(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends R> transform) {
        f0.p(list, "<this>");
        f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = transform.invoke(list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <S, T extends S> S h(@dl.d List<? extends T> list, @dl.d yh.p<? super S, ? super T, ? extends S> operation) {
        f0.p(list, "<this>");
        f0.p(operation, "operation");
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) CollectionsKt___CollectionsKt.w2(list);
        int iG = CollectionsKt__CollectionsKt.G(list);
        int i10 = 1;
        if (1 <= iG) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, list.get(i10));
                if (i10 == iG) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @dl.d
    public static final <T, R, V> List<V> i(@dl.d List<? extends T> list, @dl.d List<? extends R> other, @dl.d yh.p<? super T, ? super R, ? extends V> transform) {
        f0.p(list, "<this>");
        f0.p(other, "other");
        f0.p(transform, "transform");
        int iMin = Math.min(list.size(), other.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(list.get(i10), other.get(i10)));
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R> List<R> j(@dl.d List<? extends T> list, @dl.d yh.p<? super T, ? super T, ? extends R> transform) {
        f0.p(list, "<this>");
        f0.p(transform, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        a.a.a.a.d.p.d.c.d dVar = list.get(0);
        int iG = CollectionsKt__CollectionsKt.G(list);
        while (i10 < iG) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(transform.invoke(dVar, t10));
            dVar = t10;
        }
        return arrayList;
    }
}
