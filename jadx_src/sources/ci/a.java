package ci;

import dl.d;
import dl.e;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.collections.s;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.q;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.m;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: Optionals.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @u0(version = s0.f136934y)
    @d
    @e2(markerClass = {q.class})
    public static final <T> m<T> a(@d Optional<? extends T> optional) {
        f0.p(optional, "<this>");
        return optional.isPresent() ? SequencesKt__SequencesKt.q(optional.get()) : SequencesKt__SequencesKt.g();
    }

    @u0(version = s0.f136934y)
    @e2(markerClass = {q.class})
    public static final <T> T b(@d Optional<? extends T> optional, T t10) {
        f0.p(optional, "<this>");
        return optional.isPresent() ? optional.get() : t10;
    }

    @u0(version = s0.f136934y)
    @e2(markerClass = {q.class})
    public static final <T> T c(@d Optional<? extends T> optional, @d yh.a<? extends T> defaultValue) {
        f0.p(optional, "<this>");
        f0.p(defaultValue, "defaultValue");
        return optional.isPresent() ? optional.get() : defaultValue.invoke();
    }

    @u0(version = s0.f136934y)
    @e
    @e2(markerClass = {q.class})
    public static final <T> T d(@d Optional<T> optional) {
        f0.p(optional, "<this>");
        return optional.orElse(null);
    }

    @u0(version = s0.f136934y)
    @d
    @e2(markerClass = {q.class})
    public static final <T, C extends Collection<? super T>> C e(@d Optional<T> optional, @d C destination) {
        f0.p(optional, "<this>");
        f0.p(destination, "destination");
        if (optional.isPresent()) {
            T t10 = optional.get();
            f0.o(t10, "get()");
            destination.add(t10);
        }
        return destination;
    }

    @u0(version = s0.f136934y)
    @d
    @e2(markerClass = {q.class})
    public static final <T> List<T> f(@d Optional<? extends T> optional) {
        f0.p(optional, "<this>");
        return optional.isPresent() ? s.k(optional.get()) : CollectionsKt__CollectionsKt.E();
    }

    @u0(version = s0.f136934y)
    @d
    @e2(markerClass = {q.class})
    public static final <T> Set<T> g(@d Optional<? extends T> optional) {
        f0.p(optional, "<this>");
        return optional.isPresent() ? c1.f(optional.get()) : d1.k();
    }
}
