package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.u1;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultDelegatingLazyLayoutItemProvider;", "Landroidx/compose/foundation/lazy/layout/i;", "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", ak.aF, "(ILandroidx/compose/runtime/p;I)V", "", "e", "b", "Landroidx/compose/runtime/m2;", ak.av, "Landroidx/compose/runtime/m2;", "delegate", "()I", "itemCount", "", "d", "()Ljava/util/Map;", "keyToIndexMap", "<init>", "(Landroidx/compose/runtime/m2;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultDelegatingLazyLayoutItemProvider implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<i> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDelegatingLazyLayoutItemProvider(@dl.d m2<? extends i> delegate) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int a() {
        return this.delegate.getValue().a();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.e
    public Object b(int index) {
        return this.delegate.getValue().b(index);
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @androidx.compose.runtime.h
    public void c(final int i10, @dl.e androidx.compose.runtime.p pVar, final int i11) {
        int i12;
        androidx.compose.runtime.p pVarF = pVar.F(1633511187);
        if ((i11 & 14) == 0) {
            i12 = (pVarF.y(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= pVarF.s(this) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(1633511187, i12, -1, "androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider.Item (LazyLayoutItemProvider.kt:195)");
            }
            this.delegate.getValue().c(i10, pVarF, i12 & 14);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.DefaultDelegatingLazyLayoutItemProvider$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i13) {
                this.f7005b.c(i10, pVar2, i11 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Map<Object, Integer> d() {
        return this.delegate.getValue().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @dl.d
    public Object e(int index) {
        return this.delegate.getValue().e(index);
    }
}
