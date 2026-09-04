package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import dl.d;
import dl.e;
import kotlin.DeprecationLevel;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.k;
import yh.l;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,218:1\n31#2:219\n63#2,2:220\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n187#1:219\n187#1:220,2\n*E\n"})
public final class c {
    private static final <VM extends w0> VM a(c1 c1Var, Class<VM> cls, String str, y0.b bVar, u2.a aVar) {
        y0 y0Var;
        if (bVar != null) {
            y0Var = new y0(c1Var.getViewModelStore(), bVar, aVar);
        } else {
            y0Var = c1Var instanceof r ? new y0(c1Var.getViewModelStore(), ((r) c1Var).getDefaultViewModelProviderFactory(), aVar) : new y0(c1Var);
        }
        return str != null ? (VM) y0Var.b(str, cls) : (VM) y0Var.a(cls);
    }

    static /* synthetic */ w0 b(c1 c1Var, Class cls, String str, y0.b bVar, u2.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        if ((i10 & 8) != 0) {
            aVar = c1Var instanceof r ? ((r) c1Var).getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
        }
        return a(c1Var, cls, str, bVar, aVar);
    }

    @k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    @h
    public static final /* synthetic */ <VM extends w0> VM c(c1 c1Var, String str, y0.b bVar, p pVar, int i10, int i11) {
        pVar.T(-384969861);
        if ((i11 & 1) != 0 && (c1Var = LocalViewModelStoreOwner.f24269a.a(pVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        c1 c1Var2 = c1Var;
        String str2 = (i11 & 2) != 0 ? null : str;
        y0.b bVar2 = (i11 & 4) != 0 ? null : bVar;
        f0.y(4, "VM");
        VM vm = (VM) g(w0.class, c1Var2, str2, bVar2, null, pVar, ((i10 << 3) & bb.c.b.f30796me) | bb.c.e.f32077wb, 16);
        pVar.c0();
        return vm;
    }

    @h
    public static final /* synthetic */ <VM extends w0> VM d(c1 c1Var, String str, y0.b bVar, u2.a aVar, p pVar, int i10, int i11) {
        pVar.T(1729797275);
        if ((i11 & 1) != 0 && (c1Var = LocalViewModelStoreOwner.f24269a.a(pVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        c1 c1Var2 = c1Var;
        String str2 = (i11 & 2) != 0 ? null : str;
        y0.b bVar2 = (i11 & 4) != 0 ? null : bVar;
        if ((i11 & 8) != 0) {
            aVar = c1Var2 instanceof r ? ((r) c1Var2).getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
        }
        f0.y(4, "VM");
        VM vm = (VM) g(w0.class, c1Var2, str2, bVar2, aVar, pVar, ((i10 << 3) & bb.c.b.f30796me) | 36936, 0);
        pVar.c0();
        return vm;
    }

    @h
    public static final /* synthetic */ <VM extends w0> VM e(c1 c1Var, String str, l<? super u2.a, ? extends VM> initializer, p pVar, int i10, int i11) {
        f0.p(initializer, "initializer");
        pVar.T(419377738);
        if ((i11 & 1) != 0 && (c1Var = LocalViewModelStoreOwner.f24269a.a(pVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        c1 c1Var2 = c1Var;
        if ((i11 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        f0.y(4, "VM");
        u2.c cVar = new u2.c();
        f0.y(4, "VM");
        cVar.a(n0.d(w0.class), initializer);
        b2 b2Var = b2.f124493a;
        VM vm = (VM) g(w0.class, c1Var2, str2, cVar.b(), c1Var2 instanceof r ? ((r) c1Var2).getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b, pVar, ((i10 << 3) & bb.c.b.f30796me) | 36936, 0);
        pVar.c0();
        return vm;
    }

    @k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    @h
    public static final /* synthetic */ w0 f(Class modelClass, c1 c1Var, String str, y0.b bVar, p pVar, int i10, int i11) {
        f0.p(modelClass, "modelClass");
        pVar.T(1324836815);
        if ((i11 & 2) != 0 && (c1Var = LocalViewModelStoreOwner.f24269a.a(pVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        w0 w0VarB = b(c1Var, modelClass, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : bVar, null, 8, null);
        pVar.c0();
        return w0VarB;
    }

    @d
    @h
    public static final <VM extends w0> VM g(@d Class<VM> modelClass, @e c1 c1Var, @e String str, @e y0.b bVar, @e u2.a aVar, @e p pVar, int i10, int i11) {
        f0.p(modelClass, "modelClass");
        pVar.T(-1439476281);
        if ((i11 & 2) != 0 && (c1Var = LocalViewModelStoreOwner.f24269a.a(pVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            bVar = null;
        }
        if ((i11 & 16) != 0) {
            aVar = c1Var instanceof r ? ((r) c1Var).getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
        }
        VM vm = (VM) a(c1Var, modelClass, str, bVar, aVar);
        pVar.c0();
        return vm;
    }
}
