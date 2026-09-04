package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u001a-\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/u;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Landroidx/compose/runtime/m2;", ak.aF, "(Lkotlinx/coroutines/flow/u;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "R", "Lkotlinx/coroutines/flow/e;", "initial", "b", "(Lkotlinx/coroutines/flow/e;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/p;II)Landroidx/compose/runtime/m2;", "Lkotlin/Function0;", "block", "e", "", "other", "", "d", "(Ljava/util/Set;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 7, 1}, xs = "androidx/compose/runtime/SnapshotStateKt")
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @dl.d
    @h
    public static final <T extends R, R> m2<R> b(@dl.d kotlinx.coroutines.flow.e<? extends T> eVar, R r10, @dl.e CoroutineContext coroutineContext, @dl.e p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(eVar, "<this>");
        pVar.T(-606625098);
        if ((i11 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        int i12 = i10 >> 3;
        m2<R> m2VarO = e2.o(r10, eVar, coroutineContext2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(coroutineContext2, eVar, null), pVar, (i12 & 8) | bb.c.f.f32551s4 | (i12 & 14));
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarO;
    }

    @dl.d
    @h
    public static final <T> m2<T> c(@dl.d kotlinx.coroutines.flow.u<? extends T> uVar, @dl.e CoroutineContext coroutineContext, @dl.e p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(uVar, "<this>");
        pVar.T(-1439883919);
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        m2<T> m2VarA = e2.a(uVar, uVar.getValue(), coroutineContext2, pVar, bb.c.b.f30512a7, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean d(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            Iterator<T> it2 = set2.iterator();
            while (it2.hasNext()) {
                if (set.contains(it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @dl.d
    public static final <T> kotlinx.coroutines.flow.e<T> e(@dl.d yh.a<? extends T> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        return kotlinx.coroutines.flow.g.I0(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(block, null));
    }
}
