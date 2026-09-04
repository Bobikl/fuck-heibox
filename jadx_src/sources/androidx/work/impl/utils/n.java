package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkApi23.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "NetworkApi23")
@w0(23)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {"Landroid/net/ConnectivityManager;", "Landroid/net/Network;", ak.av, "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class n {
    @androidx.annotation.u
    @dl.e
    public static final Network a(@dl.d ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.f0.p(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
