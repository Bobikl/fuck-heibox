package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import o3.NetworkState;

/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0013\u001a\u00020\u0005*\u00020\n8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "Landroidx/work/impl/constraints/trackers/g;", "Lo3/b;", ak.av, "", "Ljava/lang/String;", "TAG", "Landroid/net/ConnectivityManager;", "", "e", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", ak.aF, "(Landroid/net/ConnectivityManager;)Lo3/b;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f28941a;

    static {
        String strI = androidx.work.n.i("NetworkStateTracker");
        f0.o(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f28941a = strI;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final g<NetworkState> a(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        return Build.VERSION.SDK_INT >= 24 ? new i(context, taskExecutor) : new k(context, taskExecutor);
    }

    @dl.d
    public static final NetworkState c(@dl.d ConnectivityManager connectivityManager) {
        f0.p(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return new NetworkState(activeNetworkInfo != null && activeNetworkInfo.isConnected(), e(connectivityManager), androidx.core.net.a.c(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }

    public static /* synthetic */ void d(ConnectivityManager connectivityManager) {
    }

    public static final boolean e(@dl.d ConnectivityManager connectivityManager) {
        f0.p(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = androidx.work.impl.utils.m.a(connectivityManager, androidx.work.impl.utils.n.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return androidx.work.impl.utils.m.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e10) {
            androidx.work.n.e().d(f28941a, "Unable to validate active network", e10);
            return false;
        }
    }
}
