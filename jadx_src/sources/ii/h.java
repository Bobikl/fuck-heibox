package ii;

import kotlin.jvm.internal.f0;
import kotlin.text.u;
import kotlin.text.y;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        String strB = bVar.i().b();
        f0.o(strB, "relativeClassName.asString()");
        String strK2 = u.k2(strB, lg.a.f131414g, y.f128594c, false, 4, null);
        if (bVar.h().d()) {
            return strK2;
        }
        return bVar.h() + lg.a.f131414g + strK2;
    }
}
