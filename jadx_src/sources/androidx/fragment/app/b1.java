package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b1 {
    @dl.d
    public static final <F extends Fragment> F a(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "<this>");
        F f10 = (F) FragmentManager.q0(view);
        kotlin.jvm.internal.f0.o(f10, "findFragment(this)");
        return f10;
    }
}
