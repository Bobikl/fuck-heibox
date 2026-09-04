package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.u1;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/b;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", ak.av, "(Lyh/q;Landroidx/compose/runtime/p;I)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazySaveableStateHolderKt {
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.q<? super androidx.compose.runtime.saveable.b, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        final int i11;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(674185128);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            final androidx.compose.runtime.saveable.c cVar = (androidx.compose.runtime.saveable.c) pVarF.K(SaveableStateRegistryKt.b());
            final LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.d(new Object[]{cVar}, LazySaveableStateHolder.INSTANCE.a(cVar), null, new yh.a<LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LazySaveableStateHolder invoke() {
                    return new LazySaveableStateHolder(cVar, s0.z());
                }
            }, pVarF, 72, 4);
            CompositionLocalKt.b(new k1[]{SaveableStateRegistryKt.b().f(lazySaveableStateHolder)}, androidx.compose.runtime.internal.b.b(pVarF, 1863926504, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                    if ((i12 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1863926504, i12, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
                    }
                    lazySaveableStateHolder.i(SaveableStateHolderKt.a(pVar2, 0));
                    content.invoke(lazySaveableStateHolder, pVar2, Integer.valueOf(((i11 << 3) & 112) | 8));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, 56);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                LazySaveableStateHolderKt.a(content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
