package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002<\u0010\n\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/q0;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/m0;", "name", "recomposer", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "e", "(Lyh/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "K", androidx.exifinterface.media.a.X4, "", "", "key", "value", "", ak.aF, "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "d", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", ak.av, "I", "RecomposerCompoundHashKey", "b", "Ljava/lang/Object;", "ProduceAnotherFrame", "FramePending", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class RecomposerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f12533a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final Object f12534b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Object f12535c = new Object();

    public static final <K, V> boolean c(@dl.d Map<K, List<V>> map, K k10, V v10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        List<V> arrayList = map.get(k10);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k10, arrayList);
        }
        return arrayList.add(v10);
    }

    @dl.e
    public static final <K, V> V d(@dl.d Map<K, List<V>> map, K k10) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        List<V> list = map.get(k10);
        if (list == null) {
            return null;
        }
        V v10 = (V) kotlin.collections.x.J0(list);
        if (!list.isEmpty()) {
            return v10;
        }
        map.remove(k10);
        return v10;
    }

    @dl.e
    public static final <R> Object e(@dl.d yh.q<? super kotlinx.coroutines.q0, ? super Recomposer, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return kotlinx.coroutines.r0.g(new RecomposerKt$withRunningRecomposer$2(qVar, null), cVar);
    }
}
