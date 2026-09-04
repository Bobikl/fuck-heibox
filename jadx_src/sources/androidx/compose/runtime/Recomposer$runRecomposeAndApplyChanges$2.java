package androidx.compose.runtime;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Landroidx/compose/runtime/w0;", "parentFrameClock", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {bb.c.b.f30902r6, 503}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements yh.q<kotlinx.coroutines.q0, w0, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f12505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f12506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f12507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f12508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f12509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f12510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ Recomposer f12511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, kotlin.coroutines.c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.f12511i = recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(List<z> list, List<z0> list2, List<z> list3, Set<z> set, Set<z> set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(List<z0> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.stateLock) {
            List list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.add((z0) list2.get(i10));
            }
            recomposer.compositionValuesAwaitingInsert.clear();
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        }
    }

    @Override // yh.q
    @dl.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.d w0 w0Var, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f12511i, cVar);
        recomposer$runRecomposeAndApplyChanges$2.f12510h = w0Var;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(kotlin.b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008e  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bb A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x00b4, B:21:0x00bb), top: B:37:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c8 -> B:11:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f9 -> B:31:0x00fd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
