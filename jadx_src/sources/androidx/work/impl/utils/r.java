package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

/* JADX INFO: compiled from: PreferenceUtils.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f29368b = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29369c = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29370d = "androidx.work.util.preferences";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29371e = "last_cancel_all_time_ms";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29372f = "reschedule_needed";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f29373g = "last_force_stop_ms";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkDatabase f29374a;

    /* JADX INFO: compiled from: PreferenceUtils.java */
    public class a implements f0.a<Long, Long> {
        a() {
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(Long l10) {
            return Long.valueOf(l10 != null ? l10.longValue() : 0L);
        }
    }

    public r(@n0 WorkDatabase workDatabase) {
        this.f29374a = workDatabase;
    }

    public static void e(@n0 Context context, @n0 j3.g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f29370d, 0);
        if (sharedPreferences.contains(f29372f) || sharedPreferences.contains(f29371e)) {
            long j10 = sharedPreferences.getLong(f29371e, 0L);
            long j11 = sharedPreferences.getBoolean(f29372f, false) ? 1L : 0L;
            gVar.u();
            try {
                gVar.P0(f29368b, new Object[]{f29371e, Long.valueOf(j10)});
                gVar.P0(f29368b, new Object[]{f29372f, Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                gVar.O0();
            } finally {
                gVar.U0();
            }
        }
    }

    public long a() {
        Long lC = this.f29374a.S().c(f29371e);
        if (lC != null) {
            return lC.longValue();
        }
        return 0L;
    }

    @n0
    public LiveData<Long> b() {
        return Transformations.b(this.f29374a.S().a(f29371e), new a());
    }

    public long c() {
        Long lC = this.f29374a.S().c(f29373g);
        if (lC != null) {
            return lC.longValue();
        }
        return 0L;
    }

    public boolean d() {
        Long lC = this.f29374a.S().c(f29372f);
        return lC != null && lC.longValue() == 1;
    }

    public void f(long j10) {
        this.f29374a.S().b(new Preference(f29371e, Long.valueOf(j10)));
    }

    public void g(long j10) {
        this.f29374a.S().b(new Preference(f29373g, Long.valueOf(j10)));
    }

    public void h(boolean z10) {
        this.f29374a.S().b(new Preference(f29372f, z10));
    }
}
