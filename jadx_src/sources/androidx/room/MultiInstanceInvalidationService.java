package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.umeng.analytics.pro.ak;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/IBinder;", "onBind", "", "b", "I", ak.aF, "()I", "d", "(I)V", "maxClientId", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/z;", "Landroid/os/RemoteCallbackList;", ak.av, "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/a0$b;", "e", "Landroidx/room/a0$b;", "binder", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
@v
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxClientId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Integer, String> clientNames = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RemoteCallbackList<z> callbackList = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a0.b binder = new a();

    /* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(bv = {}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016J'\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/a0$b;", "Landroidx/room/z;", "callback", "", "name", "", "V0", "clientId", "Lkotlin/b2;", "o1", "", "tables", "R0", "(I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends a0.b {
        a() {
        }

        @Override // androidx.room.a0
        public void R0(int clientId, @dl.d String[] tables) {
            kotlin.jvm.internal.f0.p(tables, "tables");
            RemoteCallbackList<z> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    String str = multiInstanceInvalidationService.b().get(Integer.valueOf(clientId));
                    if (str == null) {
                        Log.w(t1.f27263b, "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                    for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i10);
                            kotlin.jvm.internal.f0.n(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) broadcastCookie).intValue();
                            String str2 = multiInstanceInvalidationService.b().get(Integer.valueOf(iIntValue));
                            if (clientId != iIntValue && kotlin.jvm.internal.f0.g(str, str2)) {
                                try {
                                    ((z) multiInstanceInvalidationService.a().getBroadcastItem(i10)).h(tables);
                                } catch (RemoteException e10) {
                                    Log.w(t1.f27263b, "Error invoking a remote callback", e10);
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.a().finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.a().finishBroadcast();
                    kotlin.b2 b2Var = kotlin.b2.f124493a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.room.a0
        public int V0(@dl.d z callback, @dl.e String name) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            int i10 = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<z> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() + 1);
                int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                if (multiInstanceInvalidationService.a().register(callback, Integer.valueOf(maxClientId))) {
                    multiInstanceInvalidationService.b().put(Integer.valueOf(maxClientId), name);
                    i10 = maxClientId;
                } else {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() - 1);
                    multiInstanceInvalidationService.getMaxClientId();
                }
            }
            return i10;
        }

        @Override // androidx.room.a0
        public void o1(@dl.d z callback, int i10) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            RemoteCallbackList<z> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                multiInstanceInvalidationService.a().unregister(callback);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }
    }

    /* JADX INFO: compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/z;", "callback", "", "cookie", "Lkotlin/b2;", ak.av, "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends RemoteCallbackList<z> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(@dl.d z callback, @dl.d Object cookie) {
            kotlin.jvm.internal.f0.p(callback, "callback");
            kotlin.jvm.internal.f0.p(cookie, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) cookie);
        }
    }

    @dl.d
    public final RemoteCallbackList<z> a() {
        return this.callbackList;
    }

    @dl.d
    public final Map<Integer, String> b() {
        return this.clientNames;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void d(int i10) {
        this.maxClientId = i10;
    }

    @Override // android.app.Service
    @dl.d
    public IBinder onBind(@dl.d Intent intent) {
        kotlin.jvm.internal.f0.p(intent, "intent");
        return this.binder;
    }
}
