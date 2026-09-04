package androidx.compose.foundation;

import androidx.compose.animation.core.s0;
import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002JA\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJZ\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u000f\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0002\b\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/MutatorMutex;", "", "Landroidx/compose/foundation/MutatorMutex$a;", "mutator", "Lkotlin/b2;", RXScreenCaptureService.KEY_HEIGHT, "R", "Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "block", "d", "(Landroidx/compose/foundation/MutatePriority;Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.f23244d5, SocialConstants.PARAM_RECEIVER, "Lkotlin/Function2;", "Lkotlin/t;", "f", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", ak.av, "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lkotlinx/coroutines/sync/c;", "b", "Lkotlinx/coroutines/sync/c;", "mutex", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class MutatorMutex {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.sync.c mutex = MutexKt.b(false, 1, null);

    /* JADX INFO: compiled from: MutatorMutex.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/MutatorMutex$a;", "", "other", "", ak.av, "Lkotlin/b2;", "b", "Landroidx/compose/foundation/MutatePriority;", "Landroidx/compose/foundation/MutatePriority;", "d", "()Landroidx/compose/foundation/MutatePriority;", "priority", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d2;", ak.aF, "()Lkotlinx/coroutines/d2;", "job", "<init>", "(Landroidx/compose/foundation/MutatePriority;Lkotlinx/coroutines/d2;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final MutatePriority priority;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final d2 job;

        public a(@dl.d MutatePriority priority, @dl.d d2 job) {
            kotlin.jvm.internal.f0.p(priority, "priority");
            kotlin.jvm.internal.f0.p(job, "job");
            this.priority = priority;
            this.job = job;
        }

        public final boolean a(@dl.d a other) {
            kotlin.jvm.internal.f0.p(other, "other");
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            d2.a.b(this.job, null, 1, null);
        }

        @dl.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public final d2 getJob() {
            return this.job;
        }

        @dl.d
        /* JADX INFO: renamed from: d, reason: from getter */
        public final MutatePriority getPriority() {
            return this.priority;
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, yh.l lVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, lVar, cVar);
    }

    public static /* synthetic */ Object g(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, yh.p pVar, kotlin.coroutines.c cVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.f(obj, mutatePriority, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(a aVar) {
        a aVar2;
        do {
            aVar2 = this.currentMutator.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!s0.a(this.currentMutator, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @dl.e
    public final <R> Object d(@dl.d MutatePriority mutatePriority, @dl.d yh.l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return r0.g(new MutatorMutex$mutate$2(mutatePriority, this, lVar, null), cVar);
    }

    @dl.e
    public final <T, R> Object f(T t10, @dl.d MutatePriority mutatePriority, @dl.d yh.p<? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        return r0.g(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, t10, null), cVar);
    }
}
