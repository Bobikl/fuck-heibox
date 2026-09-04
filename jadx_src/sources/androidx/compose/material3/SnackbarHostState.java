package androidx.compose.material3;

import androidx.compose.runtime.h2;
import androidx.compose.runtime.j2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0016B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R/\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "duration", "Landroidx/compose/material3/SnackbarResult;", "e", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/material3/n1;", "visuals", "d", "(Landroidx/compose/material3/n1;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/c;", ak.av, "Lkotlinx/coroutines/sync/c;", "mutex", "Landroidx/compose/material3/l1;", "<set-?>", "b", "Landroidx/compose/runtime/a1;", "()Landroidx/compose/material3/l1;", ak.aF, "(Landroidx/compose/material3/l1;)V", "currentSnackbarData", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class SnackbarHostState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.sync.c mutex = MutexKt.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 currentSnackbarData = h2.g(null, null, 2, null);

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$a;", "Landroidx/compose/material3/l1;", "Lkotlin/b2;", "b", com.heybox.imageviewer.l.f59758c, "", "other", "", "equals", "", "hashCode", "Landroidx/compose/material3/n1;", ak.av, "Landroidx/compose/material3/n1;", "()Landroidx/compose/material3/n1;", "visuals", "Lkotlinx/coroutines/p;", "Landroidx/compose/material3/SnackbarResult;", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Landroidx/compose/material3/n1;Lkotlinx/coroutines/p;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements l1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final n1 visuals;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final kotlinx.coroutines.p<SnackbarResult> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@dl.d n1 visuals, @dl.d kotlinx.coroutines.p<? super SnackbarResult> continuation) {
            kotlin.jvm.internal.f0.p(visuals, "visuals");
            kotlin.jvm.internal.f0.p(continuation, "continuation");
            this.visuals = visuals;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material3.l1
        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public n1 getVisuals() {
            return this.visuals;
        }

        @Override // androidx.compose.material3.l1
        public void b() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.p<SnackbarResult> pVar = this.continuation;
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material3.l1
        public void dismiss() {
            if (this.continuation.isActive()) {
                kotlinx.coroutines.p<SnackbarResult> pVar = this.continuation;
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !kotlin.jvm.internal.f0.g(kotlin.jvm.internal.n0.d(a.class), kotlin.jvm.internal.n0.d(other.getClass()))) {
                return false;
            }
            a aVar = (a) other;
            return kotlin.jvm.internal.f0.g(getVisuals(), aVar.getVisuals()) && kotlin.jvm.internal.f0.g(this.continuation, aVar.continuation);
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }
    }

    /* JADX INFO: compiled from: SnackbarHost.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$b;", "Landroidx/compose/material3/n1;", "", "other", "", "equals", "", "hashCode", "", ak.av, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "message", ak.aF, "actionLabel", "Z", "d", "()Z", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", "Landroidx/compose/material3/SnackbarDuration;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements n1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final String message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final String actionLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean withDismissAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final SnackbarDuration duration;

        public b(@dl.d String message, @dl.e String str, boolean z10, @dl.d SnackbarDuration duration) {
            kotlin.jvm.internal.f0.p(message, "message");
            kotlin.jvm.internal.f0.p(duration, "duration");
            this.message = message;
            this.actionLabel = str;
            this.withDismissAction = z10;
            this.duration = duration;
        }

        @Override // androidx.compose.material3.n1
        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.n1
        @dl.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.n1
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !kotlin.jvm.internal.f0.g(kotlin.jvm.internal.n0.d(b.class), kotlin.jvm.internal.n0.d(other.getClass()))) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.f0.g(getMessage(), bVar.getMessage()) && kotlin.jvm.internal.f0.g(getActionLabel(), bVar.getActionLabel()) && getWithDismissAction() == bVar.getWithDismissAction() && getDuration() == bVar.getDuration();
        }

        @Override // androidx.compose.material3.n1
        @dl.d
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return ((((iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + androidx.compose.foundation.b0.a(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(l1 l1Var) {
        this.currentSnackbarData.setValue(l1Var);
    }

    public static /* synthetic */ Object f(SnackbarHostState snackbarHostState, String str, String str2, boolean z10, SnackbarDuration snackbarDuration, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.e(str, str3, z11, snackbarDuration, cVar);
    }

    @dl.e
    public final l1 b() {
        return (l1) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @w
    @dl.e
    public final Object d(@dl.d n1 n1Var, @dl.d kotlin.coroutines.c<? super SnackbarResult> cVar) throws Throwable {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        kotlinx.coroutines.sync.c cVar2;
        SnackbarHostState snackbarHostState;
        n1 n1Var2;
        SnackbarHostState snackbarHostState2;
        Throwable th2;
        kotlinx.coroutines.sync.c cVar3;
        if (cVar instanceof SnackbarHostState$showSnackbar$2) {
            snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) cVar;
            int i10 = snackbarHostState$showSnackbar$2.f10870h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snackbarHostState$showSnackbar$2.f10870h = i10 - Integer.MIN_VALUE;
            } else {
                snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, cVar);
            }
        } else {
            snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, cVar);
        }
        Object obj = snackbarHostState$showSnackbar$2.f10868f;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = snackbarHostState$showSnackbar$2.f10870h;
        try {
            try {
                if (i11 == 0) {
                    kotlin.t0.n(obj);
                    cVar2 = this.mutex;
                    snackbarHostState$showSnackbar$2.f10864b = this;
                    snackbarHostState$showSnackbar$2.f10865c = n1Var;
                    snackbarHostState$showSnackbar$2.f10866d = cVar2;
                    snackbarHostState$showSnackbar$2.f10870h = 1;
                    if (cVar2.e(null, snackbarHostState$showSnackbar$2) == objH) {
                        return objH;
                    }
                    snackbarHostState = this;
                    n1Var2 = n1Var;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar3 = (kotlinx.coroutines.sync.c) snackbarHostState$showSnackbar$2.f10866d;
                        snackbarHostState2 = (SnackbarHostState) snackbarHostState$showSnackbar$2.f10864b;
                        try {
                            kotlin.t0.n(obj);
                            snackbarHostState2.c(null);
                            cVar3.f(null);
                            return obj;
                        } catch (Throwable th3) {
                            th2 = th3;
                            snackbarHostState2.c(null);
                            throw th2;
                        }
                    }
                    kotlinx.coroutines.sync.c cVar4 = (kotlinx.coroutines.sync.c) snackbarHostState$showSnackbar$2.f10866d;
                    n1 n1Var3 = (n1) snackbarHostState$showSnackbar$2.f10865c;
                    snackbarHostState = (SnackbarHostState) snackbarHostState$showSnackbar$2.f10864b;
                    kotlin.t0.n(obj);
                    cVar2 = cVar4;
                    n1Var2 = n1Var3;
                }
                snackbarHostState$showSnackbar$2.f10864b = snackbarHostState;
                snackbarHostState$showSnackbar$2.f10865c = n1Var2;
                snackbarHostState$showSnackbar$2.f10866d = cVar2;
                snackbarHostState$showSnackbar$2.f10867e = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.f10870h = 2;
                kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(snackbarHostState$showSnackbar$2), 1);
                qVar.F0();
                snackbarHostState.c(new a(n1Var2, qVar));
                Object objT = qVar.t();
                if (objT == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(snackbarHostState$showSnackbar$2);
                }
                if (objT == objH) {
                    return objH;
                }
                snackbarHostState2 = snackbarHostState;
                kotlinx.coroutines.sync.c cVar5 = cVar2;
                obj = objT;
                cVar3 = cVar5;
                snackbarHostState2.c(null);
                cVar3.f(null);
                return obj;
            } catch (Throwable th4) {
                snackbarHostState2 = snackbarHostState;
                th2 = th4;
                snackbarHostState2.c(null);
                throw th2;
            }
        } catch (Throwable th5) {
            n1Var.f(null);
            throw th5;
        }
    }

    @dl.e
    public final Object e(@dl.d String str, @dl.e String str2, boolean z10, @dl.d SnackbarDuration snackbarDuration, @dl.d kotlin.coroutines.c<? super SnackbarResult> cVar) {
        return d(new b(str, str2, z10, snackbarDuration), cVar);
    }
}
