package androidx.compose.ui.modifier;

import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ModifierLocalProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¨\u0006\u0007"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/ui/n;", "Landroidx/compose/ui/modifier/p;", "key", "Lkotlin/Function0;", "value", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class ModifierLocalProviderKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ModifierLocalProvider.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00028\u00008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/ui/modifier/ModifierLocalProviderKt$a", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/modifier/p;", "e", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "f", "Landroidx/compose/runtime/m2;", "getValue", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class a<T> extends y0 implements m<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final p<T> key;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final m2 value;

        a(p<T> pVar, yh.a<? extends T> aVar, yh.l<? super x0, b2> lVar) {
            super(lVar);
            this.key = pVar;
            this.value = e2.d(aVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean a0(yh.l lVar) {
            return androidx.compose.ui.o.a(this, lVar);
        }

        @Override // androidx.compose.ui.modifier.m
        @dl.d
        public p<T> getKey() {
            return this.key;
        }

        @Override // androidx.compose.ui.modifier.m
        public T getValue() {
            return (T) this.value.getValue();
        }

        @Override // androidx.compose.ui.n
        public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
            return androidx.compose.ui.m.a(this, nVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ boolean t(yh.l lVar) {
            return androidx.compose.ui.o.b(this, lVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object v(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.d(this, obj, pVar);
        }

        @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
        public /* synthetic */ Object x(Object obj, yh.p pVar) {
            return androidx.compose.ui.o.c(this, obj, pVar);
        }
    }

    @androidx.compose.ui.g
    @dl.d
    public static final <T> androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final p<T> key, @dl.d final yh.a<? extends T> value) {
        f0.p(nVar, "<this>");
        f0.p(key, "key");
        f0.p(value, "value");
        return nVar.s0(new a(key, value, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("modifierLocalProvider");
                x0Var.getProperties().c("key", key);
                x0Var.getProperties().c("value", value);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
