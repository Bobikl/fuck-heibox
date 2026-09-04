package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.w0;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
public final class b0 {
    @dl.d
    @w0(21)
    public static final PersistableBundle a() {
        return z.a(0);
    }

    @dl.d
    @w0(21)
    public static final PersistableBundle b(@dl.d Pair<String, ? extends Object>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        PersistableBundle persistableBundleA = z.a(pairs.length);
        for (Pair<String, ? extends Object> pair : pairs) {
            z.b(persistableBundleA, pair.a(), pair.b());
        }
        return persistableBundleA;
    }

    @dl.d
    @w0(21)
    public static final PersistableBundle c(@dl.d Map<String, ? extends Object> map) {
        kotlin.jvm.internal.f0.p(map, "<this>");
        PersistableBundle persistableBundleA = z.a(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            z.b(persistableBundleA, entry.getKey(), entry.getValue());
        }
        return persistableBundleA;
    }
}
