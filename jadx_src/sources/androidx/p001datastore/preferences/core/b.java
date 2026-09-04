package androidx.p001datastore.preferences.core;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.umeng.analytics.pro.ak;
import dl.d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.h;

/* JADX INFO: compiled from: PreferencesFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@h(name = "PreferencesFactory")
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0006\u001a\u00020\u00002\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\t\u001a\u00020\b2\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/preferences/core/a;", "b", "()Landroidx/datastore/preferences/core/a;", "", "Landroidx/datastore/preferences/core/a$b;", "pairs", ak.av, "([Landroidx/datastore/preferences/core/a$b;)Landroidx/datastore/preferences/core/a;", "Landroidx/datastore/preferences/core/MutablePreferences;", ak.aF, "([Landroidx/datastore/preferences/core/a$b;)Landroidx/datastore/preferences/core/MutablePreferences;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1})
public final class b {
    @d
    @h(name = TopicHashtagWrapper.TYPE_CREATE)
    public static final a a(@d a.b<?>... pairs) {
        f0.p(pairs, "pairs");
        return c((a.b[]) Arrays.copyOf(pairs, pairs.length));
    }

    @d
    @h(name = "createEmpty")
    public static final a b() {
        return new MutablePreferences(null, true, 1, null);
    }

    @d
    @h(name = "createMutable")
    public static final MutablePreferences c(@d a.b<?>... pairs) {
        f0.p(pairs, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.m((a.b[]) Arrays.copyOf(pairs, pairs.length));
        return mutablePreferences;
    }
}
