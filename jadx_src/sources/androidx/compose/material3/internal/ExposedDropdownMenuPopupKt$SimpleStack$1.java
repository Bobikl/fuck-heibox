package androidx.compose.material3.internal;

import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.layout.k0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.n;
import dl.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExposedDropdownMenuPopupKt$SimpleStack$1 f11950a = new ExposedDropdownMenuPopupKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.i0
    @d
    public final j0 a(@d l0 Layout, @d List<? extends g0> measurables, long j10) {
        int i10;
        int i11;
        f0.p(Layout, "$this$Layout");
        f0.p(measurables, "measurables");
        int size = measurables.size();
        if (size == 0) {
            return k0.p(Layout, 0, 0, null, new l<e1.a, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1
                public final void a(@d e1.a layout) {
                    f0.p(layout, "$this$layout");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }, 4, null);
        }
        int i12 = 0;
        if (size == 1) {
            final e1 e1VarZ1 = measurables.get(0).z1(j10);
            return k0.p(Layout, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new l<e1.a, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2
                {
                    super(1);
                }

                public final void a(@d e1.a layout) {
                    f0.p(layout, "$this$layout");
                    e1.a.v(layout, e1VarZ1, 0, 0, 0.0f, 4, null);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                    a(aVar);
                    return b2.f124493a;
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(measurables.size());
        int size2 = measurables.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList.add(measurables.get(i13).z1(j10));
        }
        int iG = CollectionsKt__CollectionsKt.G(arrayList);
        if (iG >= 0) {
            int iMax = 0;
            int iMax2 = 0;
            while (true) {
                e1 e1Var = (e1) arrayList.get(i12);
                iMax = Math.max(iMax, e1Var.getWidth());
                iMax2 = Math.max(iMax2, e1Var.getHeight());
                if (i12 == iG) {
                    break;
                }
                i12++;
            }
            i10 = iMax;
            i11 = iMax2;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return k0.p(Layout, i10, i11, null, new l<e1.a, b2>() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void a(@d e1.a layout) {
                f0.p(layout, "$this$layout");
                int iG2 = CollectionsKt__CollectionsKt.G(arrayList);
                if (iG2 < 0) {
                    return;
                }
                int i14 = 0;
                while (true) {
                    e1.a.v(layout, arrayList.get(i14), 0, 0, 0.0f, 4, null);
                    if (i14 == iG2) {
                        return;
                    } else {
                        i14++;
                    }
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int b(n nVar, List list, int i10) {
        return h0.c(this, nVar, list, i10);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int c(n nVar, List list, int i10) {
        return h0.d(this, nVar, list, i10);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int d(n nVar, List list, int i10) {
        return h0.a(this, nVar, list, i10);
    }

    @Override // androidx.compose.ui.layout.i0
    public /* synthetic */ int e(n nVar, List list, int i10) {
        return h0.b(this, nVar, list, i10);
    }
}
