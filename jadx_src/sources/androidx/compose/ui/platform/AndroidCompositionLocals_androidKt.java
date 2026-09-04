package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\"\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\" \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00138\u0006¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b'\u0010\u0016¨\u0006)"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Landroidx/compose/ui/platform/AndroidComposeView;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroid/content/res/Configuration;", "configuration", "Lj1/e;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/p;I)Lj1/e;", "", "name", "", "l", "Landroidx/compose/runtime/j1;", "Landroidx/compose/runtime/j1;", "f", "()Landroidx/compose/runtime/j1;", "LocalConfiguration", "b", "g", "LocalContext", ak.aF, RXScreenCaptureService.KEY_HEIGHT, "LocalImageVectorCache", "Landroidx/lifecycle/y;", "d", "i", "LocalLifecycleOwner", "Landroidx/savedstate/d;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<Configuration> f15527a = CompositionLocalKt.c(androidx.compose.runtime.e2.l(), new yh.a<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<Context> f15528b = CompositionLocalKt.e(new yh.a<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<j1.e> f15529c = CompositionLocalKt.e(new yh.a<j1.e>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1.e invoke() {
            AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.lifecycle.y> f15530d = CompositionLocalKt.e(new yh.a<androidx.lifecycle.y>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.y invoke() {
            AndroidCompositionLocals_androidKt.l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<androidx.savedstate.d> f15531e = CompositionLocalKt.e(new yh.a<androidx.savedstate.d>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.savedstate.d invoke() {
            AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.runtime.j1<View> f15532f = CompositionLocalKt.e(new yh.a<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.l("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Configuration f15549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j1.e f15550c;

        a(Configuration configuration, j1.e eVar) {
            this.f15549b = configuration;
            this.f15550c = eVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@dl.d Configuration configuration) {
            kotlin.jvm.internal.f0.p(configuration, "configuration");
            this.f15550c.c(this.f15549b.updateFrom(configuration));
            this.f15549b.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f15550c.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f15550c.a();
        }
    }

    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final AndroidComposeView owner, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1396852028);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1396852028, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = owner.getContext();
        pVarF.T(-492369756);
        Object objU = pVarF.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = androidx.compose.runtime.e2.j(context.getResources().getConfiguration(), androidx.compose.runtime.e2.l());
            pVarF.N(objU);
        }
        pVarF.c0();
        final androidx.compose.runtime.a1 a1Var = (androidx.compose.runtime.a1) objU;
        pVarF.T(1157296644);
        boolean zS = pVarF.s(a1Var);
        Object objU2 = pVarF.U();
        if (zS || objU2 == companion.a()) {
            objU2 = new yh.l<Configuration, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d Configuration it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    AndroidCompositionLocals_androidKt.c(a1Var, it);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Configuration configuration) {
                    a(configuration);
                    return kotlin.b2.f124493a;
                }
            };
            pVarF.N(objU2);
        }
        pVarF.c0();
        owner.setConfigurationChangeObserver((yh.l) objU2);
        pVarF.T(-492369756);
        Object objU3 = pVarF.U();
        if (objU3 == companion.a()) {
            kotlin.jvm.internal.f0.o(context, "context");
            objU3 = new c0(context);
            pVarF.N(objU3);
        }
        pVarF.c0();
        final c0 c0Var = (c0) objU3;
        AndroidComposeView.b viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        pVarF.T(-492369756);
        Object objU4 = pVarF.U();
        if (objU4 == companion.a()) {
            objU4 = DisposableSaveableStateRegistry_androidKt.a(owner, viewTreeOwners.getSavedStateRegistryOwner());
            pVarF.N(objU4);
        }
        pVarF.c0();
        final q0 q0Var = (q0) objU4;
        EffectsKt.c(kotlin.b2.f124493a, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ q0 f15541a;

                public a(q0 q0Var) {
                    this.f15541a = q0Var;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f15541a.d();
                }
            }

            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                return new a(q0Var);
            }
        }, pVarF, 0);
        kotlin.jvm.internal.f0.o(context, "context");
        j1.e eVarM = m(context, b(a1Var), pVarF, 72);
        androidx.compose.runtime.j1<Configuration> j1Var = f15527a;
        Configuration configuration = b(a1Var);
        kotlin.jvm.internal.f0.o(configuration, "configuration");
        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{j1Var.f(configuration), f15528b.f(context), f15530d.f(viewTreeOwners.getLifecycleOwner()), f15531e.f(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.b().f(q0Var), f15532f.f(owner.getView()), f15529c.f(eVarM)}, androidx.compose.runtime.internal.b.b(pVarF, 1471621628, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                if ((i11 & 11) == 2 && pVar2.b()) {
                    pVar2.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1471621628, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
                }
                CompositionLocalsKt.a(owner, c0Var, content, pVar2, ((i10 << 3) & bb.c.b.f30796me) | 72);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        }), pVarF, 56);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                AndroidCompositionLocals_androidKt.a(owner, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    private static final Configuration b(androidx.compose.runtime.a1<Configuration> a1Var) {
        return a1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.runtime.a1<Configuration> a1Var, Configuration configuration) {
        a1Var.setValue(configuration);
    }

    @dl.d
    public static final androidx.compose.runtime.j1<Configuration> f() {
        return f15527a;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<Context> g() {
        return f15528b;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<j1.e> h() {
        return f15529c;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.lifecycle.y> i() {
        return f15530d;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<androidx.savedstate.d> j() {
        return f15531e;
    }

    @dl.d
    public static final androidx.compose.runtime.j1<View> k() {
        return f15532f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @androidx.compose.runtime.j2
    @androidx.compose.runtime.h
    private static final j1.e m(final Context context, Configuration configuration, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-485908294);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:132)");
        }
        pVar.T(-492369756);
        Object objU = pVar.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = new j1.e();
            pVar.N(objU);
        }
        pVar.c0();
        j1.e eVar = (j1.e) objU;
        pVar.T(-492369756);
        Object objU2 = pVar.U();
        Object obj = objU2;
        if (objU2 == companion.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            pVar.N(configuration2);
            obj = configuration2;
        }
        pVar.c0();
        Configuration configuration3 = (Configuration) obj;
        pVar.T(-492369756);
        Object objU3 = pVar.U();
        if (objU3 == companion.a()) {
            objU3 = new a(configuration3, eVar);
            pVar.N(objU3);
        }
        pVar.c0();
        final a aVar = (a) objU3;
        EffectsKt.c(eVar, new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1

            /* JADX INFO: compiled from: Effects.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
            public static final class a implements androidx.compose.runtime.e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Context f15553a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ AndroidCompositionLocals_androidKt.a f15554b;

                public a(Context context, AndroidCompositionLocals_androidKt.a aVar) {
                    this.f15553a = context;
                    this.f15554b = aVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f15553a.getApplicationContext().unregisterComponentCallbacks(this.f15554b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                context.getApplicationContext().registerComponentCallbacks(aVar);
                return new a(context, aVar);
            }
        }, pVar, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return eVar;
    }
}
