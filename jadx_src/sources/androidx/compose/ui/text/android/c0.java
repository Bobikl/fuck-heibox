package androidx.compose.ui.text.android;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u000b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006\"\u0010\b\u0002\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00028\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "Lkotlin/Function1;", "Lkotlin/b2;", "action", ak.av, "R", "", "C", "destination", "transform", "b", "(Ljava/util/List;Ljava/util/Collection;Lyh/l;)Ljava/util/Collection;", "Lkotlin/Function2;", ak.aF, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class c0 {
    public static final <T> void a(@dl.d List<? extends T> list, @dl.d yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(action, "action");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.invoke(list.get(i10));
        }
    }

    @dl.d
    public static final <T, R, C extends Collection<? super R>> C b(@dl.d List<? extends T> list, @dl.d C destination, @dl.d yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(destination, "destination");
        kotlin.jvm.internal.f0.p(transform, "transform");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            destination.add(transform.invoke(list.get(i10)));
        }
        return destination;
    }

    @dl.d
    public static final <T, R> List<R> c(@dl.d List<? extends T> list, @dl.d yh.p<? super T, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(list, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
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
