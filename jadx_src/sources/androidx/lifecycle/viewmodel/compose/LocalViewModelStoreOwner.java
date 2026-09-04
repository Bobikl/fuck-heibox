package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.internal.o;
import androidx.compose.runtime.j1;
import androidx.compose.runtime.k1;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.c1;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import xh.h;

/* JADX INFO: compiled from: LocalViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,53:1\n76#2:54\n76#2:55\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n41#1:54\n42#1:55\n*E\n"})
@o(parameters = 0)
public final class LocalViewModelStoreOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final LocalViewModelStoreOwner f24269a = new LocalViewModelStoreOwner();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final j1<c1> f24270b = CompositionLocalKt.d(null, new yh.a<c1>() { // from class: androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner$LocalViewModelStoreOwner$1
        @Override // yh.a
        @e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return null;
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24271c = 0;

    private LocalViewModelStoreOwner() {
    }

    @h(name = "getCurrent")
    @e
    @androidx.compose.runtime.h
    public final c1 a(@e p pVar, int i10) {
        pVar.T(-584162872);
        c1 c1VarA = (c1) pVar.K(f24270b);
        if (c1VarA == null) {
            c1VarA = ViewTreeViewModelStoreOwner.a((View) pVar.K(AndroidCompositionLocals_androidKt.k()));
        }
        pVar.c0();
        return c1VarA;
    }

    @d
    public final k1<c1> b(@d c1 viewModelStoreOwner) {
        f0.p(viewModelStoreOwner, "viewModelStoreOwner");
        return f24270b.f(viewModelStoreOwner);
    }
}
