package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkApi24.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "NetworkApi24")
@w0(24)
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Lkotlin/b2;", ak.av, "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class p {
    @androidx.annotation.u
    public static final void a(@dl.d ConnectivityManager connectivityManager, @dl.d ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.f0.p(connectivityManager, "<this>");
        kotlin.jvm.internal.f0.p(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
