package androidx.fragment.app;

import android.os.Bundle;
import kotlin.b2;

/* JADX INFO: compiled from: Fragment.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class v {
    public static final void b(@dl.d Fragment fragment, @dl.d String requestKey) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().d(requestKey);
    }

    public static final void c(@dl.d Fragment fragment, @dl.d String requestKey) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(requestKey, "requestKey");
        fragment.getParentFragmentManager().b(requestKey);
    }

    public static final void d(@dl.d Fragment fragment, @dl.d String requestKey, @dl.d Bundle result) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(requestKey, "requestKey");
        kotlin.jvm.internal.f0.p(result, "result");
        fragment.getParentFragmentManager().a(requestKey, result);
    }

    public static final void e(@dl.d Fragment fragment, @dl.d String requestKey, @dl.d final yh.p<? super String, ? super Bundle, b2> listener) {
        kotlin.jvm.internal.f0.p(fragment, "<this>");
        kotlin.jvm.internal.f0.p(requestKey, "requestKey");
        kotlin.jvm.internal.f0.p(listener, "listener");
        fragment.getParentFragmentManager().c(requestKey, fragment, new k0() { // from class: androidx.fragment.app.u
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                v.f(listener, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(yh.p tmp0, String p10, Bundle p11) {
        kotlin.jvm.internal.f0.p(tmp0, "$tmp0");
        kotlin.jvm.internal.f0.p(p10, "p0");
        kotlin.jvm.internal.f0.p(p11, "p1");
        tmp0.invoke(p10, p11);
    }
}
