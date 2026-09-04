package wi;

import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.text.i;
import kotlin.text.j;
import kotlin.u0;
import xh.h;

/* JADX INFO: compiled from: RegexExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "RegexExtensionsJDK8Kt")
public final class a {
    @u0(version = "1.2")
    @e
    public static final kotlin.text.h a(@d i iVar, @d String name) {
        f0.p(iVar, "<this>");
        f0.p(name, "name");
        j jVar = iVar instanceof j ? (j) iVar : null;
        if (jVar != null) {
            return jVar.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
