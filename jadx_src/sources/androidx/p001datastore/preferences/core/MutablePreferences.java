package androidx.p001datastore.preferences.core;

import androidx.exifinterface.media.a;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u000e0&\u0012\b\b\u0002\u0010.\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u001d\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002J&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u000e0\rH\u0016J,\u0010\u0011\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0001H\u0086\u0002J\u0015\u0010\u0018\u001a\u00020\u00022\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0086\u0002J\u0015\u0010\u0019\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\u001c\u001a\u00020\u00022\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00160\u001a\"\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u0006\u0010\u001f\u001a\u00020\u0002J\u0013\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010#\u001a\u00020\"H\u0016J\b\u0010%\u001a\u00020$H\u0016R*\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u000e0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,¨\u00061"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/a;", "Lkotlin/b2;", "f", "()V", RXScreenCaptureService.KEY_HEIGHT, a.f23244d5, "Landroidx/datastore/preferences/core/a$a;", "key", "", "b", ak.aF, "(Landroidx/datastore/preferences/core/a$a;)Ljava/lang/Object;", "", "", ak.av, "value", "o", "(Landroidx/datastore/preferences/core/a$a;Ljava/lang/Object;)V", "p", "prefs", "l", "Landroidx/datastore/preferences/core/a$b;", "pair", "k", "j", "", "pairs", "m", "([Landroidx/datastore/preferences/core/a$b;)V", "n", "g", "other", "equals", "", "hashCode", "", "toString", "", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "preferencesMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "frozen", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class MutablePreferences extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final Map<a.C0158a<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final AtomicBoolean frozen;

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public MutablePreferences(@d Map<a.C0158a<?>, Object> preferencesMap, boolean z10) {
        f0.p(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z10);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    @Override // androidx.p001datastore.preferences.core.a
    @d
    public Map<a.C0158a<?>, Object> a() {
        Map<a.C0158a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        f0.o(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // androidx.p001datastore.preferences.core.a
    public <T> boolean b(@d a.C0158a<T> key) {
        f0.p(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    @Override // androidx.p001datastore.preferences.core.a
    @e
    public <T> T c(@d a.C0158a<T> key) {
        f0.p(key, "key");
        return (T) this.preferencesMap.get(key);
    }

    public boolean equals(@e Object other) {
        if (other instanceof MutablePreferences) {
            return f0.g(this.preferencesMap, ((MutablePreferences) other).preferencesMap);
        }
        return false;
    }

    public final void f() {
        if (!(!this.frozen.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void g() {
        f();
        this.preferencesMap.clear();
    }

    public final void h() {
        this.frozen.set(true);
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    @d
    public final Map<a.C0158a<?>, Object> i() {
        return this.preferencesMap;
    }

    public final void j(@d a.C0158a<?> key) {
        f0.p(key, "key");
        f();
        n(key);
    }

    public final void k(@d a.b<?> pair) {
        f0.p(pair, "pair");
        f();
        m(pair);
    }

    public final void l(@d a prefs) {
        f0.p(prefs, "prefs");
        f();
        this.preferencesMap.putAll(prefs.a());
    }

    public final void m(@d a.b<?>... pairs) {
        f0.p(pairs, "pairs");
        f();
        for (a.b<?> bVar : pairs) {
            p(bVar.a(), bVar.b());
        }
    }

    public final <T> T n(@d a.C0158a<T> key) {
        f0.p(key, "key");
        f();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void o(@d a.C0158a<T> key, T value) {
        f0.p(key, "key");
        p(key, value);
    }

    public final void p(@d a.C0158a<?> key, @e Object value) {
        f0.p(key, "key");
        f();
        if (value == null) {
            n(key);
            return;
        }
        if (!(value instanceof Set)) {
            this.preferencesMap.put(key, value);
            return;
        }
        Map<a.C0158a<?>, Object> map = this.preferencesMap;
        Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt___CollectionsKt.V5((Iterable) value));
        f0.o(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, setUnmodifiableSet);
    }

    @d
    public String toString() {
        return CollectionsKt___CollectionsKt.h3(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new l<Map.Entry<a.C0158a<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // yh.l
            @d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@d Map.Entry<a.C0158a<?>, Object> entry) {
                f0.p(entry, "entry");
                return "  " + entry.getKey().getName() + " = " + entry.getValue();
            }
        }, 24, null);
    }
}
