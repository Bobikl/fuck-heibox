package androidx.compose.runtime;

import com.taobao.aranger.constant.Constants;
import com.umeng.analytics.pro.ak;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: ProduceState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002/\b\u0001\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aa\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062/\b\u0001\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ak\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062/\b\u0001\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001au\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062/\b\u0001\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001ao\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0015\"\u0004\u0018\u00010\u00062/\b\u0001\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {androidx.exifinterface.media.a.f23244d5, "initialValue", "Lkotlin/Function2;", "Landroidx/compose/runtime/i1;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "producer", "Landroidx/compose/runtime/m2;", "d", "(Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "key1", ak.aF, "(Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "key3", ak.av, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "", Constants.PARAM_KEYS, "e", "(Ljava/lang/Object;[Ljava/lang/Object;Lyh/p;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "runtime_release"}, k = 5, mv = {1, 7, 1}, xs = "androidx/compose/runtime/SnapshotStateKt")
public final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    @dl.d
    @h
    public static final <T> m2<T> a(T t10, @dl.e Object obj, @dl.e Object obj2, @dl.e Object obj3, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> producer, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(producer, "producer");
        pVar.T(1807205155);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1807205155, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:178)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = h2.g(t10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        EffectsKt.f(obj, obj2, obj3, new SnapshotStateKt__ProduceStateKt$produceState$4(producer, a1Var, null), pVar, bb.c.f.A4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @dl.d
    @h
    public static final <T> m2<T> b(T t10, @dl.e Object obj, @dl.e Object obj2, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> producer, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(producer, "producer");
        pVar.T(-1703169085);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:144)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = h2.g(t10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        EffectsKt.g(obj, obj2, new SnapshotStateKt__ProduceStateKt$produceState$3(producer, a1Var, null), pVar, bb.c.b.f30790m8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @dl.d
    @h
    public static final <T> m2<T> c(T t10, @dl.e Object obj, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> producer, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(producer, "producer");
        pVar.T(-1928268701);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:111)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = h2.g(t10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        EffectsKt.h(obj, new SnapshotStateKt__ProduceStateKt$produceState$2(producer, a1Var, null), pVar, 72);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @dl.d
    @h
    public static final <T> m2<T> d(T t10, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> producer, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(producer, "producer");
        pVar.T(10454275);
        if (ComposerKt.g0()) {
            ComposerKt.w0(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = h2.g(t10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        EffectsKt.h(kotlin.b2.f124493a, new SnapshotStateKt__ProduceStateKt$produceState$1(producer, a1Var, null), pVar, 64);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    @dl.d
    @h
    public static final <T> m2<T> e(T t10, @dl.d Object[] keys, @kotlin.b @dl.d yh.p<? super i1<T>, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> producer, @dl.e p pVar, int i10) {
        kotlin.jvm.internal.f0.p(keys, "keys");
        kotlin.jvm.internal.f0.p(producer, "producer");
        pVar.T(490154582);
        if (ComposerKt.g0()) {
            ComposerKt.w0(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:213)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = h2.g(t10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        EffectsKt.j(Arrays.copyOf(keys, keys.length), new SnapshotStateKt__ProduceStateKt$produceState$5(producer, a1Var, null), pVar, 72);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }
}
