package androidx.navigation;

import kotlin.b2;

/* JADX INFO: compiled from: NamedNavArgument.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    @dl.d
    public static final i a(@dl.d String name, @dl.d yh.l<? super q, b2> builder) {
        kotlin.jvm.internal.f0.p(name, "name");
        kotlin.jvm.internal.f0.p(builder, "builder");
        q qVar = new q();
        builder.invoke(qVar);
        return new i(name, qVar.a());
    }
}
