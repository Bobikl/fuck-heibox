package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.google.android.play.core.splitinstall.SplitInstallException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DynamicInstallManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDynamicInstallManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicInstallManager.kt\nandroidx/navigation/dynamicfeatures/DynamicInstallManager\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,176:1\n146#2:177\n*S KotlinDebug\n*F\n+ 1 DynamicInstallManager.kt\nandroidx/navigation/dynamicfeatures/DynamicInstallManager\n*L\n77#1:177\n*E\n"})
public class DynamicInstallManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f24970c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f24971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final com.google.android.play.core.splitinstall.c f24972b;

    /* JADX INFO: compiled from: DynamicInstallManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final void a(@dl.d i0<com.google.android.play.core.splitinstall.f> status) {
            f0.p(status, "status");
            if (!(!status.h())) {
                throw new IllegalStateException("This DynamicInstallMonitor will not emit any more status updates. You should remove all Observers after null has been emitted.".toString());
            }
        }
    }

    /* JADX INFO: compiled from: DynamicInstallManager.kt */
    public static final class b implements com.google.android.play.core.splitinstall.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Context f24973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final i0<com.google.android.play.core.splitinstall.f> f24974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final l f24975c;

        public b(@dl.d Context context, @dl.d i0<com.google.android.play.core.splitinstall.f> status, @dl.d l installMonitor) {
            f0.p(context, "context");
            f0.p(status, "status");
            f0.p(installMonitor, "installMonitor");
            this.f24973a = context;
            this.f24974b = status;
            this.f24975c = installMonitor;
        }

        @Override // k9.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStateUpdate(@dl.d com.google.android.play.core.splitinstall.f splitInstallSessionState) {
            f0.p(splitInstallSessionState, "splitInstallSessionState");
            if (splitInstallSessionState.h() == this.f24975c.c()) {
                if (splitInstallSessionState.i() == 5) {
                    com.google.android.play.core.splitcompat.a.a(this.f24973a);
                    com.google.android.play.core.splitinstall.b.b(this.f24973a);
                }
                this.f24974b.r(splitInstallSessionState);
                if (splitInstallSessionState.d()) {
                    com.google.android.play.core.splitinstall.c cVarD = this.f24975c.d();
                    f0.m(cVarD);
                    cVarD.h(this);
                    DynamicInstallManager.f24970c.a(this.f24974b);
                }
            }
        }
    }

    public DynamicInstallManager(@dl.d Context context, @dl.d com.google.android.play.core.splitinstall.c splitInstallManager) {
        f0.p(context, "context");
        f0.p(splitInstallManager, "splitInstallManager");
        this.f24971a = context;
        this.f24972b = splitInstallManager;
    }

    private final void g(final String str, final l lVar) {
        if (!(!lVar.g())) {
            throw new IllegalStateException("You must pass in a fresh DynamicInstallMonitor in DynamicExtras every time you call navigate().".toString());
        }
        LiveData<com.google.android.play.core.splitinstall.f> liveDataE = lVar.e();
        f0.n(liveDataE, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.google.android.play.core.splitinstall.SplitInstallSessionState>");
        final i0 i0Var = (i0) liveDataE;
        lVar.i(true);
        com.google.android.play.core.splitinstall.e eVarC = com.google.android.play.core.splitinstall.e.c().b(str).c();
        f0.o(eVarC, "newBuilder().addModule(module).build()");
        com.google.android.gms.tasks.k<Integer> kVarB = this.f24972b.b(eVarC);
        final yh.l<Integer, b2> lVar2 = new yh.l<Integer, b2>() { // from class: androidx.navigation.dynamicfeatures.DynamicInstallManager$requestInstall$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(Integer sessionId) {
                l lVar3 = lVar;
                f0.o(sessionId, "sessionId");
                lVar3.j(sessionId.intValue());
                lVar.k(this.f24972b);
                if (sessionId.intValue() == 0) {
                    i0Var.r(com.google.android.play.core.splitinstall.f.b(sessionId.intValue(), 5, 0, 0L, 0L, s.k(str), CollectionsKt__CollectionsKt.E()));
                    DynamicInstallManager.f24970c.a(i0Var);
                } else {
                    this.f24972b.i(new DynamicInstallManager.b(this.f24971a, i0Var, lVar));
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                a(num);
                return b2.f124493a;
            }
        };
        kVarB.k(new com.google.android.gms.tasks.g() { // from class: androidx.navigation.dynamicfeatures.j
            @Override // com.google.android.gms.tasks.g
            public final void onSuccess(Object obj) {
                DynamicInstallManager.h(lVar2, obj);
            }
        }).h(new com.google.android.gms.tasks.f() { // from class: androidx.navigation.dynamicfeatures.k
            @Override // com.google.android.gms.tasks.f
            public final void onFailure(Exception exc) {
                DynamicInstallManager.i(str, lVar, i0Var, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(yh.l tmp0, Object obj) {
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String module, l installMonitor, i0 status, Exception exception) {
        f0.p(module, "$module");
        f0.p(installMonitor, "$installMonitor");
        f0.p(status, "$status");
        f0.p(exception, "exception");
        Log.i("DynamicInstallManager", "Error requesting install of " + module + ": " + exception.getMessage());
        installMonitor.h(exception);
        status.r(com.google.android.play.core.splitinstall.f.b(0, 6, exception instanceof SplitInstallException ? ((SplitInstallException) exception).d() : -100, 0L, 0L, s.k(module), CollectionsKt__CollectionsKt.E()));
        f24970c.a(status);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean e(@dl.d String module) {
        f0.p(module, "module");
        return !this.f24972b.q().contains(module);
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination f(@dl.d NavBackStackEntry backStackEntry, @dl.e e eVar, @dl.d String moduleName) {
        f0.p(backStackEntry, "backStackEntry");
        f0.p(moduleName, "moduleName");
        if ((eVar != null ? eVar.b() : null) != null) {
            g(moduleName, eVar.b());
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(androidx.navigation.dynamicfeatures.a.f24985c, backStackEntry.e().A());
        bundle.putBundle(androidx.navigation.dynamicfeatures.a.f24986d, backStackEntry.c());
        f.a aVarA = f.a.f25003w.a(backStackEntry.e());
        Navigator navigatorF = aVarA.V0().f(aVarA.D());
        if (!(navigatorF instanceof f)) {
            throw new IllegalStateException("You must use a DynamicNavGraph to perform a module installation.");
        }
        ((f) navigatorF).t(aVarA, bundle);
        return null;
    }
}
