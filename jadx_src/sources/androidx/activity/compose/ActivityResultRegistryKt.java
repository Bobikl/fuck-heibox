package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.g;
import androidx.activity.result.i;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.UUID;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"})
public final class ActivityResultRegistryKt {
    @dl.d
    @h
    public static final <I, O> d<I, O> a(@dl.d final z.a<I, O> contract, @dl.d l<? super O, b2> onResult, @dl.e p pVar, int i10) {
        f0.p(contract, "contract");
        f0.p(onResult, "onResult");
        pVar.T(-1408504823);
        m2 m2VarT = e2.t(contract, pVar, 8);
        final m2 m2VarT2 = e2.t(onResult, pVar, (i10 >> 3) & 14);
        Object objD = RememberSaveableKt.d(new Object[0], null, null, new yh.a<String>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return UUID.randomUUID().toString();
            }
        }, pVar, bb.c.d.f31377lj, 6);
        f0.o(objD, "rememberSaveable { UUID.randomUUID().toString() }");
        final String str = (String) objD;
        i iVarA = LocalActivityResultRegistryOwner.f1430a.a(pVar, 6);
        if (iVarA == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        final ActivityResultRegistry activityResultRegistry = iVarA.getActivityResultRegistry();
        pVar.T(-3687241);
        Object objU = pVar.U();
        p.Companion companion = p.INSTANCE;
        if (objU == companion.a()) {
            objU = new b();
            pVar.N(objU);
        }
        pVar.c0();
        final b bVar = (b) objU;
        pVar.T(-3687241);
        Object objU2 = pVar.U();
        if (objU2 == companion.a()) {
            objU2 = new d(bVar, m2VarT);
            pVar.N(objU2);
        }
        pVar.c0();
        d<I, O> dVar = (d) objU2;
        EffectsKt.a(activityResultRegistry, str, contract, new l<androidx.compose.runtime.f0, e0>() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1

            /* JADX INFO: Add missing generic type declarations: [O] */
            /* JADX INFO: compiled from: ActivityResultRegistry.kt */
            public static final class a<O> implements androidx.activity.result.a<O> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ m2<l<O, b2>> f1416a;

                /* JADX WARN: Multi-variable type inference failed */
                a(m2<? extends l<? super O, b2>> m2Var) {
                    this.f1416a = m2Var;
                }

                @Override // androidx.activity.result.a
                public final void a(O o10) {
                    this.f1416a.getValue().invoke(o10);
                }
            }

            /* JADX INFO: compiled from: Effects.kt */
            @t0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n1#1,483:1\n109#2,2:484\n*E\n"})
            public static final class b implements e0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.activity.compose.b f1417a;

                public b(androidx.activity.compose.b bVar) {
                    this.f1417a = bVar;
                }

                @Override // androidx.compose.runtime.e0
                public void dispose() {
                    this.f1417a.d();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                f0.p(DisposableEffect, "$this$DisposableEffect");
                bVar.c((g<I>) activityResultRegistry.j(str, contract, new a(m2VarT2)));
                return new b(bVar);
            }
        }, pVar, bb.c.b.f30512a7);
        pVar.c0();
        return dVar;
    }
}
