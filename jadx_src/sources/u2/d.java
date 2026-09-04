package u2;

import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import yh.l;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static final /* synthetic */ <VM extends w0> void a(c cVar, l<? super a, ? extends VM> initializer) {
        f0.p(cVar, "<this>");
        f0.p(initializer, "initializer");
        f0.y(4, "VM");
        cVar.a(n0.d(w0.class), initializer);
    }

    @dl.d
    public static final y0.b b(@dl.d l<? super c, b2> builder) {
        f0.p(builder, "builder");
        c cVar = new c();
        builder.invoke(cVar);
        return cVar.b();
    }
}
