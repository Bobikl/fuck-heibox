package androidx.compose.runtime.livedata;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.y;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LiveDataAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/lifecycle/LiveData;", "Landroidx/compose/runtime/m2;", ak.av, "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "R", "initial", "b", "(Landroidx/lifecycle/LiveData;Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "runtime-livedata_release"}, k = 2, mv = {1, 7, 1})
public final class LiveDataAdapterKt {
    @d
    @h
    public static final <T> m2<T> a(@d LiveData<T> liveData, @e p pVar, int i10) {
        f0.p(liveData, "<this>");
        pVar.T(-2027206144);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2027206144, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        m2<T> m2VarB = b(liveData, liveData.f(), pVar, 8);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarB;
    }

    @d
    @h
    public static final <R, T extends R> m2<R> b(@d LiveData<T> liveData, R r10, @e p pVar, int i10) {
        f0.p(liveData, "<this>");
        pVar.T(411178300);
        if (ComposerKt.g0()) {
            ComposerKt.w0(411178300, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:53)");
        }
        y yVar = (y) pVar.K(AndroidCompositionLocals_androidKt.i());
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == p.INSTANCE.a()) {
            objU = h2.g(r10, null, 2, null);
            pVar.N(objU);
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        EffectsKt.b(liveData, yVar, new LiveDataAdapterKt$observeAsState$1(liveData, yVar, a1Var), pVar, 72);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }
}
