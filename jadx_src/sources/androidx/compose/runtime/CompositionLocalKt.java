package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a>\u0010\u000e\u001a\u00020\u000b2\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/runtime/d2;", ak.bo, "Lkotlin/Function0;", "defaultFactory", "Landroidx/compose/runtime/j1;", ak.aF, "e", "", "Landroidx/compose/runtime/k1;", "values", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "b", "([Landroidx/compose/runtime/k1;Lyh/p;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/runtime/w;", com.umeng.analytics.pro.d.R, ak.av, "(Landroidx/compose/runtime/w;Lyh/p;Landroidx/compose/runtime/p;I)V", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class CompositionLocalKt {
    @i(scheme = "[0[0]]")
    @h
    public static final void a(@dl.d final w context, @dl.d final yh.p<? super p, ? super Integer, kotlin.b2> content, @dl.e p pVar, final int i10) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(content, "content");
        p pVarF = pVar.F(1853897736);
        int i11 = (i10 & 14) == 0 ? (pVarF.s(context) ? 4 : 2) | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(1853897736, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:246)");
            }
            u0.i<v<Object>, m2<Object>> iVarA = context.a();
            ArrayList arrayList = new ArrayList(iVarA.size());
            for (Map.Entry<v<Object>, m2<Object>> entry : iVarA.entrySet()) {
                v<Object> key = entry.getKey();
                kotlin.jvm.internal.f0.n(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((j1) key).f(entry.getValue().getValue()));
            }
            Object[] array = arrayList.toArray(new k1[0]);
            kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            k1[] k1VarArr = (k1[]) array;
            b((k1[]) Arrays.copyOf(k1VarArr, k1VarArr.length), content, pVarF, (i11 & 112) | 8);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i12) {
                CompositionLocalKt.a(context, content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @i(scheme = "[0[0]]")
    @h
    public static final void b(@dl.d final k1<?>[] values, @dl.d final yh.p<? super p, ? super Integer, kotlin.b2> content, @dl.e p pVar, final int i10) {
        kotlin.jvm.internal.f0.p(values, "values");
        kotlin.jvm.internal.f0.p(content, "content");
        p pVarF = pVar.F(-1390796515);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        pVarF.t(values);
        content.invoke(pVarF, Integer.valueOf((i10 >> 3) & 14));
        pVarF.Z();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<p, Integer, kotlin.b2>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e p pVar2, int i11) {
                k1<?>[] k1VarArr = values;
                CompositionLocalKt.b((k1[]) Arrays.copyOf(k1VarArr, k1VarArr.length), content, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    @dl.d
    public static final <T> j1<T> c(@dl.d d2<T> policy, @dl.d yh.a<? extends T> defaultFactory) {
        kotlin.jvm.internal.f0.p(policy, "policy");
        kotlin.jvm.internal.f0.p(defaultFactory, "defaultFactory");
        return new g0(policy, defaultFactory);
    }

    public static /* synthetic */ j1 d(d2 d2Var, yh.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = e2.w();
        }
        return c(d2Var, aVar);
    }

    @dl.d
    public static final <T> j1<T> e(@dl.d yh.a<? extends T> defaultFactory) {
        kotlin.jvm.internal.f0.p(defaultFactory, "defaultFactory");
        return new n2(defaultFactory);
    }
}
