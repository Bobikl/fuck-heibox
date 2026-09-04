package androidx.compose.runtime;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001a\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\n\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u001a$\u0010\u000b\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u001a\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f\u001a\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u001c\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\u0004\u0012\u00020\u00170\u00140\u0013\u001a\u0006\u0010\u0019\u001a\u00020\u000e\u001aK\u0010\u001f\u001a\u00020\u000e\"\b\b\u0000\u0010\u001a*\u00020\f\"\b\b\u0001\u0010\u001b*\u00020\f*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001d0\u001c2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010&\u001a\u00020\u000e\"\u0004\b\u0000\u0010!*\u0012\u0012\u0004\u0012\u00028\u00000\"j\b\u0012\u0004\u0012\u00028\u0000`#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170$H\u0082\b\"\u0014\u0010(\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'\"\u001e\u0010\t\u001a\u00020\b*\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/r;", "parent", "Landroidx/compose/runtime/q;", ak.av, "Landroidx/compose/runtime/z;", ak.aF, "Lkotlin/coroutines/CoroutineContext;", "recomposeCoroutineContext", "b", "d", "", com.umeng.analytics.pro.d.R, "Lkotlin/b2;", "n", "", "key", "l", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "i", RXScreenCaptureService.KEY_HEIGHT, "K", androidx.exifinterface.media.a.X4, "Landroidx/compose/runtime/collection/b;", "Landroidx/compose/runtime/collection/c;", "value", "g", "(Landroidx/compose/runtime/collection/b;Ljava/lang/Object;Ljava/lang/Object;)V", androidx.exifinterface.media.a.S4, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlin/Function1;", "predicate", "m", "Ljava/lang/Object;", "PendingApplyNoModifications", "j", "(Landroidx/compose/runtime/z;)Lkotlin/coroutines/CoroutineContext;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/z;)V", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Object f13320a = new Object();

    @dl.d
    public static final q a(@dl.d e<?> applier, @dl.d r parent) {
        kotlin.jvm.internal.f0.p(applier, "applier");
        kotlin.jvm.internal.f0.p(parent, "parent");
        return new t(parent, applier, null, 4, null);
    }

    @h0
    @dl.d
    public static final q b(@dl.d e<?> applier, @dl.d r parent, @dl.d CoroutineContext recomposeCoroutineContext) {
        kotlin.jvm.internal.f0.p(applier, "applier");
        kotlin.jvm.internal.f0.p(parent, "parent");
        kotlin.jvm.internal.f0.p(recomposeCoroutineContext, "recomposeCoroutineContext");
        return new t(parent, applier, recomposeCoroutineContext);
    }

    @dl.d
    public static final z c(@dl.d e<?> applier, @dl.d r parent) {
        kotlin.jvm.internal.f0.p(applier, "applier");
        kotlin.jvm.internal.f0.p(parent, "parent");
        return new t(parent, applier, null, 4, null);
    }

    @h0
    @dl.d
    public static final z d(@dl.d e<?> applier, @dl.d r parent, @dl.d CoroutineContext recomposeCoroutineContext) {
        kotlin.jvm.internal.f0.p(applier, "applier");
        kotlin.jvm.internal.f0.p(parent, "parent");
        kotlin.jvm.internal.f0.p(recomposeCoroutineContext, "recomposeCoroutineContext");
        return new t(parent, applier, recomposeCoroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void g(androidx.compose.runtime.collection.b<K, androidx.compose.runtime.collection.c<V>> bVar, K k10, V v10) {
        if (bVar.b(k10)) {
            androidx.compose.runtime.collection.c<V> cVarF = bVar.f(k10);
            if (cVarF != null) {
                cVarF.add(v10);
                return;
            }
            return;
        }
        androidx.compose.runtime.collection.c<V> cVar = new androidx.compose.runtime.collection.c<>();
        cVar.add(v10);
        kotlin.b2 b2Var = kotlin.b2.f124493a;
        bVar.o(k10, cVar);
    }

    public static final void h() {
        l0.INSTANCE.a();
    }

    @dl.d
    public static final List<Pair<Exception, Boolean>> i() {
        List<p1> listB = l0.INSTANCE.b();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listB, 10));
        for (p1 p1Var : listB) {
            arrayList.add(kotlin.c1.a(p1Var.getCause(), Boolean.valueOf(p1Var.getRecoverable())));
        }
        return arrayList;
    }

    @h0
    @dl.d
    public static final CoroutineContext j(@dl.d z zVar) {
        CoroutineContext coroutineContextP;
        kotlin.jvm.internal.f0.p(zVar, "<this>");
        t tVar = zVar instanceof t ? (t) zVar : null;
        return (tVar == null || (coroutineContextP = tVar.p()) == null) ? EmptyCoroutineContext.f124694b : coroutineContextP;
    }

    @h0
    public static /* synthetic */ void k(z zVar) {
    }

    public static final void l(int i10) {
        l0.INSTANCE.c(i10);
    }

    private static final <E> void m(HashSet<E> hashSet, yh.l<? super E, Boolean> lVar) {
        Iterator<E> it = hashSet.iterator();
        kotlin.jvm.internal.f0.o(it, "iterator()");
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void n(@dl.d Object context) {
        kotlin.jvm.internal.f0.p(context, "context");
        l0.INSTANCE.f(context);
    }
}
