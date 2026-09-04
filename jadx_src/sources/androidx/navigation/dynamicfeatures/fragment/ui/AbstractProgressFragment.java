package androidx.navigation.dynamicfeatures.fragment.ui;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import androidx.navigation.dynamicfeatures.l;
import androidx.navigation.fragment.e;
import com.google.android.play.core.splitinstall.f;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: AbstractProgressFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractProgressFragment extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f25016g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f25017h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final String f25018i = "AbstractProgress";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f25019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f25020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f25021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final g<IntentSenderRequest> f25023f;

    /* JADX INFO: compiled from: AbstractProgressFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AbstractProgressFragment.kt */
    public final class b implements j0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final l f25024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractProgressFragment f25025b;

        public b(@dl.d AbstractProgressFragment abstractProgressFragment, l monitor) {
            f0.p(monitor, "monitor");
            this.f25025b = abstractProgressFragment;
            this.f25024a = monitor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(AbstractProgressFragment this$0, IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
            f0.p(this$0, "this$0");
            f0.p(intent, "intent");
            this$0.f25023f.b(new IntentSenderRequest.a(intent).b(intent2).c(i12, i11).a());
        }

        @Override // androidx.lifecycle.j0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@dl.d f sessionState) {
            f0.p(sessionState, "sessionState");
            if (sessionState.d()) {
                this.f25024a.e().p(this);
            }
            switch (sessionState.i()) {
                case 0:
                    this.f25025b.T3(-100);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 9:
                    this.f25025b.V3(sessionState.i(), sessionState.a(), sessionState.j());
                    break;
                case 5:
                    this.f25025b.U3();
                    this.f25025b.R3();
                    break;
                case 6:
                    this.f25025b.T3(sessionState.c());
                    break;
                case 7:
                    this.f25025b.S3();
                    break;
                case 8:
                    try {
                        com.google.android.play.core.splitinstall.c cVarD = this.f25024a.d();
                        if (cVarD != null) {
                            final AbstractProgressFragment abstractProgressFragment = this.f25025b;
                            cVarD.o(sessionState, new com.google.android.play.core.common.a() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.b
                                @Override // com.google.android.play.core.common.a
                                public final void a(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
                                    AbstractProgressFragment.b.d(abstractProgressFragment, intentSender, i10, intent, i11, i12, i13, bundle);
                                }
                            }, 1);
                        } else {
                            this.f25025b.T3(-100);
                        }
                    } catch (IntentSender.SendIntentException unused) {
                        this.f25025b.T3(-100);
                        return;
                    }
                    break;
            }
        }
    }

    public AbstractProgressFragment() {
        this.f25019b = b0.c(new yh.a<d>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$installViewModel$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke() {
                b1 viewModelStore = this.f25028b.getViewModelStore();
                f0.o(viewModelStore, "viewModelStore");
                y0.b bVarA = d.f25040c.a();
                u2.a defaultViewModelCreationExtras = this.f25028b.getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                return (d) new y0(viewModelStore, bVarA, defaultViewModelCreationExtras).a(d.class);
            }
        });
        this.f25020c = b0.c(new yh.a<Integer>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$destinationId$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(this.f25027b.requireArguments().getInt(androidx.navigation.dynamicfeatures.a.f24985c));
            }
        });
        this.f25021d = b0.c(new yh.a<Bundle>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$destinationArgs$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bundle invoke() {
                return this.f25026b.requireArguments().getBundle(androidx.navigation.dynamicfeatures.a.f24986d);
            }
        });
        g<IntentSenderRequest> gVarRegisterForActivityResult = registerForActivityResult(new z.b.n(), new androidx.activity.result.a() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                AbstractProgressFragment.Q3(this.f25037a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f25023f = gVarRegisterForActivityResult;
    }

    public AbstractProgressFragment(int i10) {
        super(i10);
        this.f25019b = b0.c(new yh.a<d>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$installViewModel$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke() {
                b1 viewModelStore = this.f25028b.getViewModelStore();
                f0.o(viewModelStore, "viewModelStore");
                y0.b bVarA = d.f25040c.a();
                u2.a defaultViewModelCreationExtras = this.f25028b.getDefaultViewModelCreationExtras();
                f0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
                return (d) new y0(viewModelStore, bVarA, defaultViewModelCreationExtras).a(d.class);
            }
        });
        this.f25020c = b0.c(new yh.a<Integer>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$destinationId$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return Integer.valueOf(this.f25027b.requireArguments().getInt(androidx.navigation.dynamicfeatures.a.f24985c));
            }
        });
        this.f25021d = b0.c(new yh.a<Bundle>() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.AbstractProgressFragment$destinationArgs$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Bundle invoke() {
                return this.f25026b.requireArguments().getBundle(androidx.navigation.dynamicfeatures.a.f24986d);
            }
        });
        g<IntentSenderRequest> gVarRegisterForActivityResult = registerForActivityResult(new z.b.n(), new androidx.activity.result.a() { // from class: androidx.navigation.dynamicfeatures.fragment.ui.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                AbstractProgressFragment.Q3(this.f25037a, (ActivityResult) obj);
            }
        });
        f0.o(gVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f25023f = gVarRegisterForActivityResult;
    }

    private final Bundle N3() {
        return (Bundle) this.f25021d.getValue();
    }

    private final int O3() {
        return ((Number) this.f25020c.getValue()).intValue();
    }

    private final d P3() {
        return (d) this.f25019b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(AbstractProgressFragment this$0, ActivityResult activityResult) {
        f0.p(this$0, "this$0");
        if (activityResult.b() == 0) {
            this$0.S3();
        }
    }

    public final void R3() {
        Log.i(f25018i, "navigate: ");
        l lVar = new l();
        e.a(this).m0(O3(), N3(), null, new androidx.navigation.dynamicfeatures.e(lVar, null, 2, null));
        if (lVar.f()) {
            Log.i(f25018i, "navigate: setting install monitor");
            P3().f(lVar);
        } else {
            Log.i(f25018i, "navigate: install not required");
            this.f25022e = true;
        }
    }

    protected abstract void S3();

    protected abstract void T3(@l9.a int i10);

    protected void U3() {
    }

    protected abstract void V3(@l9.b int i10, long j10, long j11);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f25022e = bundle.getBoolean(androidx.navigation.dynamicfeatures.a.f24984b, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@dl.d Bundle outState) {
        f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(androidx.navigation.dynamicfeatures.a.f24984b, this.f25022e);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        f0.p(view, "view");
        if (this.f25022e) {
            e.a(this).L0();
            return;
        }
        l lVarE = P3().e();
        if (lVarE == null) {
            Log.i(f25018i, "onViewCreated: monitor is null, navigating");
            R3();
            lVarE = P3().e();
        }
        if (lVarE != null) {
            Log.i(f25018i, "onViewCreated: monitor is now not null, observing");
            lVarE.e().k(getViewLifecycleOwner(), new b(this, lVarE));
        }
    }
}
