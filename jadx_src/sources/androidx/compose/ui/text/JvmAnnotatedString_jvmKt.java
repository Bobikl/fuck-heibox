package androidx.compose.ui.text;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.c1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: JvmAnnotatedString.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a(\u0010\f\u001a\u00020\u000b2\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/d;", "Lkotlin/Function3;", "", "", "transform", "b", "", "Landroidx/compose/ui/text/d$b;", "ranges", "Ljava/util/SortedSet;", "target", "Lkotlin/b2;", ak.av, "ui-text_release"}, k = 2, mv = {1, 7, 1})
public final class JvmAnnotatedString_jvmKt {
    private static final void a(List<? extends d.Range<?>> list, SortedSet<Integer> sortedSet) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.Range<?> range = list.get(i10);
            sortedSet.add(Integer.valueOf(range.i()));
            sortedSet.add(Integer.valueOf(range.g()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final d b(@dl.d final d dVar, @dl.d final yh.q<? super String, ? super Integer, ? super Integer, String> transform) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        kotlin.jvm.internal.f0.p(transform, "transform");
        TreeSet treeSetH = c1.h(0, Integer.valueOf(dVar.getText().length()));
        a(dVar.e(), treeSetH);
        a(dVar.d(), treeSetH);
        a(dVar.b(), treeSetH);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = "";
        final Map mapJ0 = kotlin.collections.s0.j0(kotlin.c1.a(0, 0));
        CollectionsKt___CollectionsKt.b6(treeSetH, 2, 0, false, new yh.l<List<? extends Integer>, Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@dl.d List<Integer> list) {
                kotlin.jvm.internal.f0.p(list, "<name for destructuring parameter 0>");
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                objectRef.f124891b = objectRef.f124891b + transform.invoke(dVar.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                return mapJ0.put(Integer.valueOf(iIntValue2), Integer.valueOf(objectRef.f124891b.length()));
            }
        }, 6, null);
        List<d.Range<SpanStyle>> listE = dVar.e();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.Range<SpanStyle> range = listE.get(i10);
            SpanStyle spanStyleH = range.h();
            Object obj = mapJ0.get(Integer.valueOf(range.i()));
            kotlin.jvm.internal.f0.m(obj);
            int iIntValue = ((Number) obj).intValue();
            Object obj2 = mapJ0.get(Integer.valueOf(range.g()));
            kotlin.jvm.internal.f0.m(obj2);
            arrayList.add(new d.Range(spanStyleH, iIntValue, ((Number) obj2).intValue()));
        }
        List<d.Range<ParagraphStyle>> listD = dVar.d();
        ArrayList arrayList2 = new ArrayList(listD.size());
        int size2 = listD.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d.Range<ParagraphStyle> range2 = listD.get(i11);
            ParagraphStyle paragraphStyleH = range2.h();
            Object obj3 = mapJ0.get(Integer.valueOf(range2.i()));
            kotlin.jvm.internal.f0.m(obj3);
            int iIntValue2 = ((Number) obj3).intValue();
            Object obj4 = mapJ0.get(Integer.valueOf(range2.g()));
            kotlin.jvm.internal.f0.m(obj4);
            arrayList2.add(new d.Range(paragraphStyleH, iIntValue2, ((Number) obj4).intValue()));
        }
        List<d.Range<? extends Object>> listB = dVar.b();
        ArrayList arrayList3 = new ArrayList(listB.size());
        int size3 = listB.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d.Range<? extends Object> range3 = listB.get(i12);
            Object objH = range3.h();
            Object obj5 = mapJ0.get(Integer.valueOf(range3.i()));
            kotlin.jvm.internal.f0.m(obj5);
            int iIntValue3 = ((Number) obj5).intValue();
            Object obj6 = mapJ0.get(Integer.valueOf(range3.g()));
            kotlin.jvm.internal.f0.m(obj6);
            arrayList3.add(new d.Range(objH, iIntValue3, ((Number) obj6).intValue()));
        }
        return new d((String) objectRef.f124891b, arrayList, arrayList2, arrayList3);
    }
}
