package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkApi21.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "NetworkApi21")
@w0(21)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¨\u0006\r"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lkotlin/b2;", ak.aF, "Landroid/net/Network;", ad.c.f1243w, "Landroid/net/NetworkCapabilities;", ak.av, "", "capability", "", "b", "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class m {
    @androidx.annotation.u
    @dl.e
    public static final NetworkCapabilities a(@dl.d ConnectivityManager connectivityManager, @dl.e Network network) {
        kotlin.jvm.internal.f0.p(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @androidx.annotation.u
    public static final boolean b(@dl.d NetworkCapabilities networkCapabilities, int i10) {
        kotlin.jvm.internal.f0.p(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i10);
    }

    @androidx.annotation.u
    public static final void c(@dl.d ConnectivityManager connectivityManager, @dl.d ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.f0.p(connectivityManager, "<this>");
        kotlin.jvm.internal.f0.p(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
