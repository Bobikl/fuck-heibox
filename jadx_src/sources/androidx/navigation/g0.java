package androidx.navigation;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.b1;

/* JADX INFO: compiled from: NavHostController.kt */
/* JADX INFO: loaded from: classes6.dex */
public class g0 extends NavController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@dl.d Context context) {
        super(context);
        kotlin.jvm.internal.f0.p(context, "context");
    }

    @Override // androidx.navigation.NavController
    public final void C(boolean z10) {
        super.C(z10);
    }

    @Override // androidx.navigation.NavController
    public final void s1(@dl.d androidx.lifecycle.y owner) {
        kotlin.jvm.internal.f0.p(owner, "owner");
        super.s1(owner);
    }

    @Override // androidx.navigation.NavController
    public final void u1(@dl.d OnBackPressedDispatcher dispatcher) {
        kotlin.jvm.internal.f0.p(dispatcher, "dispatcher");
        super.u1(dispatcher);
    }

    @Override // androidx.navigation.NavController
    public final void v1(@dl.d b1 viewModelStore) {
        kotlin.jvm.internal.f0.p(viewModelStore, "viewModelStore");
        super.v1(viewModelStore);
    }
}
