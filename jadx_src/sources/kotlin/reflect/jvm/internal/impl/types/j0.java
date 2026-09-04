package kotlin.reflect.jvm.internal.impl.types;

import com.meituan.robust.Constants;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: compiled from: KotlinType.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j0 extends l1 implements si.i, si.k {
    public j0() {
        super(null);
    }

    @dl.d
    public abstract j0 V0(boolean z10);

    @dl.d
    public abstract j0 W0(@dl.d w0 w0Var);

    @dl.d
    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            kotlin.text.r.k0(sb2, Constants.ARRAY_TYPE, DescriptorRenderer.u(DescriptorRenderer.f127420j, it.next(), null, 2, null), "] ");
        }
        sb2.append(O0());
        if (!M0().isEmpty()) {
            CollectionsKt___CollectionsKt.e3(M0(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "<", (112 & 8) == 0 ? ">" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
        if (P0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
