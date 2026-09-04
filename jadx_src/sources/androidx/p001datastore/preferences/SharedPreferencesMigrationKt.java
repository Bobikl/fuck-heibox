package androidx.p001datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.p001datastore.migrations.SharedPreferencesMigration;
import androidx.p001datastore.migrations.c;
import androidx.p001datastore.preferences.core.a;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: SharedPreferencesMigration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u001a4\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a<\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "produceSharedPreferences", "", "", "keysToMigrate", "Landroidx/datastore/migrations/SharedPreferencesMigration;", "Landroidx/datastore/preferences/core/a;", "d", "Landroid/content/Context;", d.R, "sharedPreferencesName", "b", "Lkotlin/Function3;", "Landroidx/datastore/migrations/c;", "Lkotlin/coroutines/c;", "", RXScreenCaptureService.KEY_HEIGHT, "()Lyh/q;", "Lkotlin/Function2;", "", "i", "(Ljava/util/Set;)Lyh/p;", ak.av, "Ljava/util/Set;", "g", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore-preferences_release"}, k = 2, mv = {1, 5, 1})
public final class SharedPreferencesMigrationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final Set<String> f22210a = new LinkedHashSet();

    @dl.d
    @i
    public static final SharedPreferencesMigration<a> a(@dl.d Context context, @dl.d String sharedPreferencesName) {
        f0.p(context, "context");
        f0.p(sharedPreferencesName, "sharedPreferencesName");
        return e(context, sharedPreferencesName, null, 4, null);
    }

    @dl.d
    @i
    public static final SharedPreferencesMigration<a> b(@dl.d Context context, @dl.d String sharedPreferencesName, @dl.d Set<String> keysToMigrate) {
        f0.p(context, "context");
        f0.p(sharedPreferencesName, "sharedPreferencesName");
        f0.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f22210a ? new SharedPreferencesMigration<>(context, sharedPreferencesName, null, i(keysToMigrate), h(), 4, null) : new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, i(keysToMigrate), h());
    }

    @dl.d
    @i
    public static final SharedPreferencesMigration<a> c(@dl.d yh.a<? extends SharedPreferences> produceSharedPreferences) {
        f0.p(produceSharedPreferences, "produceSharedPreferences");
        return f(produceSharedPreferences, null, 2, null);
    }

    @dl.d
    @i
    public static final SharedPreferencesMigration<a> d(@dl.d yh.a<? extends SharedPreferences> produceSharedPreferences, @dl.d Set<String> keysToMigrate) {
        f0.p(produceSharedPreferences, "produceSharedPreferences");
        f0.p(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f22210a ? new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, i(keysToMigrate), h(), 2, (u) null) : new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, i(keysToMigrate), h());
    }

    public static /* synthetic */ SharedPreferencesMigration e(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f22210a;
        }
        return b(context, str, set);
    }

    public static /* synthetic */ SharedPreferencesMigration f(yh.a aVar, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = f22210a;
        }
        return d(aVar, set);
    }

    @dl.d
    public static final Set<String> g() {
        return f22210a;
    }

    private static final q<c, a, kotlin.coroutines.c<? super a>, Object> h() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(null);
    }

    private static final p<a, kotlin.coroutines.c<? super Boolean>, Object> i(Set<String> set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
