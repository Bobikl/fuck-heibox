package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a0\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\f\u0010\r\u001aj\u0010\u0014\u001a\u00020\u0011\"\u0004\b\u0000\u0010\b2%\u0010\u0012\u001a!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00110\u000e2%\u0010\u0013\u001a!\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"P\u0010\u001e\u001a>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00110\u000e0\u001bj\u0002`\u001c0\u001a0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018*d\b\u0002\u0010\u001f\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00110\u000e0\u001b2.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00110\u000e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00110\u000e0\u001b¨\u0006 "}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/m2;", "d", "Landroidx/compose/runtime/d2;", ak.bo, ak.aF, "R", "Landroidx/compose/runtime/b0;", "derivedState", "block", "e", "(Landroidx/compose/runtime/b0;Lyh/a;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "Lkotlin/b2;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "done", "f", "Landroidx/compose/runtime/i2;", "", ak.av, "Landroidx/compose/runtime/i2;", "calculationBlockNestedLevel", "Landroidx/compose/runtime/collection/e;", "Lkotlin/Pair;", "Landroidx/compose/runtime/DerivedStateObservers;", "b", "derivedStateObservers", "DerivedStateObservers", "runtime_release"}, k = 5, mv = {1, 7, 1}, xs = "androidx/compose/runtime/SnapshotStateKt")
public final /* synthetic */ class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final i2<Integer> f12772a = new i2<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final i2<androidx.compose.runtime.collection.e<Pair<yh.l<b0<?>, kotlin.b2>, yh.l<b0<?>, kotlin.b2>>>> f12773b = new i2<>();

    @dl.d
    public static final <T> m2<T> c(@dl.d d2<T> policy, @dl.d yh.a<? extends T> calculation) {
        kotlin.jvm.internal.f0.p(policy, "policy");
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        return new DerivedSnapshotState(calculation, policy);
    }

    @dl.d
    public static final <T> m2<T> d(@dl.d yh.a<? extends T> calculation) {
        kotlin.jvm.internal.f0.p(calculation, "calculation");
        return new DerivedSnapshotState(calculation, null);
    }

    private static final <R> R e(b0<?> b0Var, yh.a<? extends R> aVar) {
        androidx.compose.runtime.collection.e eVar = (androidx.compose.runtime.collection.e) f12773b.a();
        int i10 = 0;
        if (eVar == null) {
            eVar = new androidx.compose.runtime.collection.e(new Pair[0], 0);
        }
        int i11 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i11 > 0) {
            Object[] objArrG = eVar.G();
            kotlin.jvm.internal.f0.n(objArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i12 = 0;
            do {
                ((yh.l) ((Pair) objArrG[i12]).a()).invoke(b0Var);
                i12++;
            } while (i12 < i11);
        }
        try {
            R rInvoke = aVar.invoke();
            kotlin.jvm.internal.c0.d(1);
            int i13 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i13 > 0) {
                Object[] objArrG2 = eVar.G();
                kotlin.jvm.internal.f0.n(objArrG2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((yh.l) ((Pair) objArrG2[i10]).b()).invoke(b0Var);
                    i10++;
                } while (i10 < i13);
            }
            return rInvoke;
        } finally {
            kotlin.jvm.internal.c0.d(1);
            int i14 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
            if (i14 > 0) {
                Object[] objArrG3 = eVar.G();
                kotlin.jvm.internal.f0.n(objArrG3, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((yh.l) ((Pair) objArrG3[i10]).b()).invoke(b0Var);
                    i10++;
                } while (i10 < i14);
            }
            kotlin.jvm.internal.c0.c(1);
        }
    }

    public static final <R> void f(@dl.d yh.l<? super m2<?>, kotlin.b2> start, @dl.d yh.l<? super m2<?>, kotlin.b2> done, @dl.d yh.a<? extends R> block) {
        kotlin.jvm.internal.f0.p(start, "start");
        kotlin.jvm.internal.f0.p(done, "done");
        kotlin.jvm.internal.f0.p(block, "block");
        i2<androidx.compose.runtime.collection.e<Pair<yh.l<b0<?>, kotlin.b2>, yh.l<b0<?>, kotlin.b2>>>> i2Var = f12773b;
        androidx.compose.runtime.collection.e<Pair<yh.l<b0<?>, kotlin.b2>, yh.l<b0<?>, kotlin.b2>>> eVarA = i2Var.a();
        if (eVarA == null) {
            androidx.compose.runtime.collection.e<Pair<yh.l<b0<?>, kotlin.b2>, yh.l<b0<?>, kotlin.b2>>> eVar = new androidx.compose.runtime.collection.e<>(new Pair[16], 0);
            i2Var.b(eVar);
            eVarA = eVar;
        }
        try {
            eVarA.b(kotlin.c1.a(start, done));
            block.invoke();
        } finally {
            eVarA.g0(eVarA.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() - 1);
        }
    }
}
