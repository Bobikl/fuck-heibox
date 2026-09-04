package androidx.compose.runtime.saveable;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: MapSaver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ax\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r\"\u0004\b\u0000\u0010\u00002:\u0010\n\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0001¢\u0006\u0002\b\t2\"\u0010\f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¨\u0006\u000f"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/f;", "Lkotlin/m0;", "name", "value", "", "", "", "Lkotlin/t;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/e;", ak.av, "runtime-saveable_release"}, k = 2, mv = {1, 7, 1})
public final class MapSaverKt {
    @dl.d
    public static final <T> e<T, Object> a(@dl.d final p<? super f, ? super T, ? extends Map<String, ? extends Object>> save, @dl.d final l<? super Map<String, ? extends Object>, ? extends T> restore) {
        f0.p(save, "save");
        f0.p(restore, "restore");
        return ListSaverKt.a(new p<f, T, List<? extends Object>>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // yh.p
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Object> invoke(@dl.d f listSaver, T t10) {
                f0.p(listSaver, "$this$listSaver");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : save.invoke(listSaver, t10).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            }
        }, new l<List<? extends Object>, T>() { // from class: androidx.compose.runtime.saveable.MapSaverKt$mapSaver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(@dl.d List<? extends Object> list) {
                f0.p(list, "list");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!(list.size() % 2 == 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                for (int i10 = 0; i10 < list.size(); i10 += 2) {
                    Object obj = list.get(i10);
                    f0.n(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, list.get(i10 + 1));
                }
                return restore.invoke(linkedHashMap);
            }
        });
    }
}
