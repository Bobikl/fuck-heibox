package androidx.p001datastore.migrations;

import android.content.SharedPreferences;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\rJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002J(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010J\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/datastore/migrations/c;", "", "", "key", ak.av, "", "b", "defValue", "d", "", "e", "", "f", "", "g", RXScreenCaptureService.KEY_HEIGHT, "", "defValues", "j", "", ak.aF, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "prefs", "Ljava/util/Set;", "keySet", "<init>", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "datastore_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @e
    private final Set<String> keySet;

    public c(@d SharedPreferences prefs, @e Set<String> set) {
        f0.p(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String a(String key) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(key)) {
            return key;
        }
        throw new IllegalStateException(f0.C("Can't access key outside migration: ", key).toString());
    }

    public static /* synthetic */ String i(c cVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return cVar.h(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set k(c cVar, String str, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        return cVar.j(str, set);
    }

    public final boolean b(@d String key) {
        f0.p(key, "key");
        return this.prefs.contains(a(key));
    }

    @d
    public final Map<String, Object> c() {
        Map<String, ?> all = this.prefs.getAll();
        f0.o(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set == null ? true : set.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(r0.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = CollectionsKt___CollectionsKt.V5((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean d(@d String key, boolean defValue) {
        f0.p(key, "key");
        return this.prefs.getBoolean(a(key), defValue);
    }

    public final float e(@d String key, float defValue) {
        f0.p(key, "key");
        return this.prefs.getFloat(a(key), defValue);
    }

    public final int f(@d String key, int defValue) {
        f0.p(key, "key");
        return this.prefs.getInt(a(key), defValue);
    }

    public final long g(@d String key, long defValue) {
        f0.p(key, "key");
        return this.prefs.getLong(a(key), defValue);
    }

    @e
    public final String h(@d String key, @e String defValue) {
        f0.p(key, "key");
        return this.prefs.getString(a(key), defValue);
    }

    @e
    public final Set<String> j(@d String key, @e Set<String> defValues) {
        f0.p(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(a(key), defValues);
        if (stringSet == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.U5(stringSet);
    }
}
