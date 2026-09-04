package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.app.job.JobInfo$TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.annotation.RestrictTo;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.w0;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.model.u;
import java.util.Iterator;

/* JADX INFO: compiled from: SystemJobInfoConverter.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(api = 23)
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f28909b = androidx.work.n.i("SystemJobInfoConverter");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f28910c = "EXTRA_WORK_SPEC_ID";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f28911d = "EXTRA_IS_PERIODIC";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f28912e = "EXTRA_WORK_SPEC_GENERATION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentName f28913a;

    /* JADX INFO: compiled from: SystemJobInfoConverter.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28914a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f28914a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28914a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28914a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28914a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28914a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @j1(otherwise = 3)
    i(@n0 Context context) {
        this.f28913a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.job.JobInfo$TriggerContentUri] */
    @w0(24)
    private static JobInfo$TriggerContentUri b(androidx.work.c.C0229c c0229c) {
        boolean isTriggeredForDescendants = c0229c.getIsTriggeredForDescendants();
        final Uri uri = c0229c.getUri();
        final int i10 = isTriggeredForDescendants ? 1 : 0;
        return new Parcelable(uri, i10) { // from class: android.app.job.JobInfo$TriggerContentUri
            static {
                throw new NoClassDefFoundError();
            }
        };
    }

    static int c(NetworkType networkType) {
        int i10 = a.f28914a[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        androidx.work.n.e().a(f28909b, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    static void d(@n0 JobInfo.Builder builder, @n0 NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(u uVar, int i10) {
        androidx.work.c cVar = uVar.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f28910c, uVar.id);
        persistableBundle.putInt(f28912e, uVar.z());
        persistableBundle.putBoolean(f28911d, uVar.D());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f28913a).setRequiresCharging(cVar.getRequiresCharging()).setRequiresDeviceIdle(cVar.getRequiresDeviceIdle()).setExtras(persistableBundle);
        d(extras, cVar.getRequiredNetworkType());
        if (!cVar.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(uVar.backoffDelayDuration, uVar.backoffPolicy == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(uVar.c() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!uVar.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && cVar.e()) {
            Iterator<androidx.work.c.C0229c> it = cVar.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(cVar.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(cVar.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(cVar.getRequiresBatteryNotLow());
            extras.setRequiresStorageNotLow(cVar.getRequiresStorageNotLow());
        }
        boolean z10 = uVar.runAttemptCount > 0;
        boolean z11 = jMax > 0;
        if (i12 >= 31 && uVar.expedited && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
