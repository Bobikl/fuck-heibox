package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: IdGenerator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u0014\u0010\u000f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "", "key", "", "d", "value", "Lkotlin/b2;", "e", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Lj3/g;", "sqLiteDatabase", ak.aF, ak.av, "I", "INITIAL_ID", "b", "Ljava/lang/String;", "NEXT_JOB_SCHEDULER_ID_KEY", "NEXT_ALARM_MANAGER_ID_KEY", "PREFERENCE_FILE_KEY", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f29356a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final String f29357b = "next_job_scheduler_id";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final String f29358c = "next_alarm_manager_id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final String f29359d = "androidx.work.util.id";

    public static final void c(@dl.d Context context, @dl.d j3.g sqLiteDatabase) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences(f29359d, 0);
        if (sharedPreferences.contains(f29357b) || sharedPreferences.contains(f29357b)) {
            int i10 = sharedPreferences.getInt(f29357b, 0);
            int i11 = sharedPreferences.getInt(f29358c, 0);
            sqLiteDatabase.u();
            try {
                sqLiteDatabase.P0(r.f29368b, new Object[]{f29357b, Integer.valueOf(i10)});
                sqLiteDatabase.P0(r.f29368b, new Object[]{f29358c, Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.O0();
            } finally {
                sqLiteDatabase.U0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        Long lC = workDatabase.S().c(str);
        int iLongValue = lC != null ? (int) lC.longValue() : 0;
        e(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.S().b(new Preference(str, Long.valueOf(i10)));
    }
}
