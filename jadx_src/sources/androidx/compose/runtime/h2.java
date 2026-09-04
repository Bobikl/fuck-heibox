package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a>\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0001\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017\u001a\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u001a\u001aQ\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u001a2*\u0010\u001e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001f\u0010 \u001a4\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d0!\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010#\u001a\u00028\u0000H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {androidx.exifinterface.media.a.f23244d5, "value", "Landroidx/compose/runtime/d2;", ak.bo, "Landroidx/compose/runtime/a1;", "f", "(Ljava/lang/Object;Landroidx/compose/runtime/d2;)Landroidx/compose/runtime/a1;", "Landroidx/compose/runtime/m2;", "", "thisObj", "Lkotlin/reflect/n;", org.apache.tools.ant.taskdefs.condition.a0.f133862j, ak.av, "(Landroidx/compose/runtime/m2;Ljava/lang/Object;Lkotlin/reflect/n;)Ljava/lang/Object;", "Lkotlin/b2;", "i", "(Landroidx/compose/runtime/a1;Ljava/lang/Object;Lkotlin/reflect/n;Ljava/lang/Object;)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "b", "", "elements", ak.aF, "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "j", "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/snapshots/t;", "d", "Lkotlin/Pair;", "pairs", "e", "([Lkotlin/Pair;)Landroidx/compose/runtime/snapshots/t;", "", "k", "newValue", RXScreenCaptureService.KEY_HEIGHT, "(Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "runtime_release"}, k = 5, mv = {1, 7, 1}, xs = "androidx/compose/runtime/SnapshotStateKt")
public final /* synthetic */ class h2 {
    public static final <T> T a(@dl.d m2<? extends T> m2Var, @dl.e Object obj, @dl.d kotlin.reflect.n<?> property) {
        kotlin.jvm.internal.f0.p(m2Var, "<this>");
        kotlin.jvm.internal.f0.p(property, "property");
        return m2Var.getValue();
    }

    @dl.d
    public static final <T> SnapshotStateList<T> b() {
        return new SnapshotStateList<>();
    }

    @dl.d
    public static final <T> SnapshotStateList<T> c(@dl.d T... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ArraysKt___ArraysKt.kz(elements));
        return snapshotStateList;
    }

    @dl.d
    public static final <K, V> androidx.compose.runtime.snapshots.t<K, V> d() {
        return new androidx.compose.runtime.snapshots.t<>();
    }

    @dl.d
    public static final <K, V> androidx.compose.runtime.snapshots.t<K, V> e(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        androidx.compose.runtime.snapshots.t<K, V> tVar = new androidx.compose.runtime.snapshots.t<>();
        tVar.putAll(kotlin.collections.s0.H0(pairs));
        return tVar;
    }

    @dl.d
    public static final <T> a1<T> f(T t10, @dl.d d2<T> policy) {
        kotlin.jvm.internal.f0.p(policy, "policy");
        return ActualAndroid_androidKt.a(t10, policy);
    }

    public static /* synthetic */ a1 g(Object obj, d2 d2Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            d2Var = e2.w();
        }
        return e2.j(obj, d2Var);
    }

    @dl.d
    @h
    public static final <T> m2<T> h(T t10, @dl.e p pVar, int i10) {
        pVar.T(-1058319986);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:294)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = g(t10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        a1Var.setValue(t10);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }

    public static final <T> void i(@dl.d a1<T> a1Var, @dl.e Object obj, @dl.d kotlin.reflect.n<?> property, T t10) {
        kotlin.jvm.internal.f0.p(a1Var, "<this>");
        kotlin.jvm.internal.f0.p(property, "property");
        a1Var.setValue(t10);
    }

    @dl.d
    public static final <T> SnapshotStateList<T> j(@dl.d Collection<? extends T> collection) {
        kotlin.jvm.internal.f0.p(collection, "<this>");
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @dl.d
    public static final <K, V> androidx.compose.runtime.snapshots.t<K, V> k(@dl.d Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.f0.p(iterable, "<this>");
        androidx.compose.runtime.snapshots.t<K, V> tVar = new androidx.compose.runtime.snapshots.t<>();
        tVar.putAll(kotlin.collections.s0.B0(iterable));
        return tVar;
    }
}
