package androidx.compose.runtime.snapshots;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001aA\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\bH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aG\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\u0010\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aS\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0014\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u001d\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0000\u001a\u007f\u0010\"\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010 *\u00060\u001ej\u0002`\u001f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010!\u001a\u00028\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u00162\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\"\u0010#\u001a;\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u00060\u001ej\u0002`\u001f2\u0006\u0010$\u001a\u00028\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0002H\u0002¢\u0006\u0004\b%\u0010&\u001aI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aV\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012'\u0010\u000f\u001a#\u0012\u0013\u0012\u00110\t¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\bH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "Lkotlin/b2;", "action", "e", "", "n", "Lkotlin/Function2;", "", "f", "R", "transform", "l", "", "predicate", ak.aF, "b", "K", "keySelector", "", "g", "", "separator", "prefix", "postfix", "limit", "truncated", "", "j", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", androidx.exifinterface.media.a.W4, "buffer", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lyh/l;)Ljava/lang/Appendable;", "element", ak.av, "(Ljava/lang/Appendable;Ljava/lang/Object;Lyh/l;)V", "m", "Lkotlin/m0;", "name", UCropPlusActivity.ARG_INDEX, "d", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class a {
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

    public static final <T> boolean b(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!predicate.invoke(list.get(i10)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean c(@dl.d List<? extends T> list, @dl.d yh.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (predicate.invoke(list.get(i10)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public static final <T> List<T> d(@dl.d List<? extends T> list, @dl.d yh.p<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (predicate.invoke(Integer.valueOf(i10), t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> void e(@dl.d List<? extends T> list, @dl.d yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(list.get(i10));
        }
    }

    public static final <T> void f(@dl.d List<? extends T> list, @dl.d yh.p<? super Integer, ? super T, b2> action) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    @dl.d
    public static final <T, K> Map<K, List<T>> g(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(keySelector, "keySelector");
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            K kInvoke = keySelector.invoke(t10);
            Object arrayList = map.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(kInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t10);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A h(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l<? super T, ? extends CharSequence> lVar) throws IOException {
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
    public static final <T> String j(@dl.d List<? extends T> list, @dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        String string = ((StringBuilder) h(list, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        kotlin.jvm.internal.f0.o(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String k(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        return j(list, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @dl.d
    public static final <T, R> List<R> l(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(transform.invoke(list.get(i10)));
        }
        return arrayList;
    }

    @dl.d
    public static final <T, R> List<R> m(@dl.d List<? extends T> list, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
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

    @dl.d
    public static final <T> Set<T> n(@dl.d List<? extends T> list) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
