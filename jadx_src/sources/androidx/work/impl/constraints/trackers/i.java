package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.w0;
import androidx.work.impl.utils.p;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import o3.NetworkState;

/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@w0(24)
@Metadata(bv = {}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/work/impl/constraints/trackers/i;", "Landroidx/work/impl/constraints/trackers/g;", "Lo3/b;", "Lkotlin/b2;", "i", "j", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "androidx/work/impl/constraints/trackers/i$a", "g", "Landroidx/work/impl/constraints/trackers/i$a;", "networkCallback", "l", "()Lo3/b;", "initialState", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "Landroidx/work/impl/utils/taskexecutor/c;", "taskExecutor", "<init>", "(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/c;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class i extends g<NetworkState> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a networkCallback;

    /* JADX INFO: compiled from: NetworkStateTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/work/impl/constraints/trackers/i$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", ad.c.f1243w, "Landroid/net/NetworkCapabilities;", "capabilities", "Lkotlin/b2;", "onCapabilitiesChanged", "onLost", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@dl.d Network network, @dl.d NetworkCapabilities capabilities) {
            f0.p(network, "network");
            f0.p(capabilities, "capabilities");
            androidx.work.n.e().a(j.f28941a, "Network capabilities changed: " + capabilities);
            i iVar = i.this;
            iVar.h(j.c(iVar.connectivityManager));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@dl.d Network network) {
            f0.p(network, "network");
            androidx.work.n.e().a(j.f28941a, "Network connection lost");
            i iVar = i.this;
            iVar.h(j.c(iVar.connectivityManager));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d Context context, @dl.d androidx.work.impl.utils.taskexecutor.c taskExecutor) {
        super(context, taskExecutor);
        f0.p(context, "context");
        f0.p(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
        this.networkCallback = new a();
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public void i() {
        try {
            androidx.work.n.e().a(j.f28941a, "Registering network callback");
            p.a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            androidx.work.n.e().d(j.f28941a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            androidx.work.n.e().d(j.f28941a, "Received exception while registering network callback", e11);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.g
    public void j() {
        try {
            androidx.work.n.e().a(j.f28941a, "Unregistering network callback");
            androidx.work.impl.utils.m.c(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            androidx.work.n.e().d(j.f28941a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            androidx.work.n.e().d(j.f28941a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.g
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public NetworkState e() {
        return j.c(this.connectivityManager);
    }
}
