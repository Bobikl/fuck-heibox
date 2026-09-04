package androidx.p001datastore.preferences.core;

import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: compiled from: PreferencesKeys.kt */
/* JADX INFO: loaded from: classes.dex */
@h(name = "PreferencesKeys")
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0005\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0005\u001a\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u0005\u001a#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u000f0\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"", "name", "Landroidx/datastore/preferences/core/a$a;", "", "d", "(Ljava/lang/String;)Landroidx/datastore/preferences/core/a$a;", "", "b", "f", "", ak.av, "", ak.aF, "", "e", "", "g", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1})
public final class c {
    @d
    @h(name = "booleanKey")
    public static final a.C0158a<Boolean> a(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }

    @d
    @h(name = "doubleKey")
    public static final a.C0158a<Double> b(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }

    @d
    @h(name = "floatKey")
    public static final a.C0158a<Float> c(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }

    @d
    @h(name = "intKey")
    public static final a.C0158a<Integer> d(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }

    @d
    @h(name = "longKey")
    public static final a.C0158a<Long> e(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }

    @d
    @h(name = "stringKey")
    public static final a.C0158a<String> f(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }

    @d
    @h(name = "stringSetKey")
    public static final a.C0158a<Set<String>> g(@d String name) {
        f0.p(name, "name");
        return new a.C0158a<>(name);
    }
}
