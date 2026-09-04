package com.tencent.liteav.audio2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.util.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends PhoneStateListener implements c.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static c f99535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Class<?> f99538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f99539e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f99541g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f99540f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f99543i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TelephonyManager f99536a = (TelephonyManager) ContextUtils.getApplicationContext().getSystemService(g0.a.f118921e);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AudioManager f99537b = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m f99542h = new m(60, "PhoneStateManager");

    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<e> f99544a;

        a(e eVar) {
            this.f99544a = new WeakReference<>(eVar);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            b bVar;
            try {
                if ("onModeChanged".equals(method.getName())) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    e eVar = this.f99544a.get();
                    if (eVar != null && (bVar = eVar.f99541g) != null) {
                        if (iIntValue == 2) {
                            eVar.f99543i = true;
                            bVar.onInterruptedByPhoneCall();
                        } else if (eVar.f99543i) {
                            eVar.f99543i = false;
                            bVar.onResumedByPhoneCall();
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.e("PhoneStateManager", "notify mode changed failed, " + th2.getMessage(), new Object[0]);
            }
            return obj;
        }
    }

    public interface b {
        void onInterruptedByPhoneCall();

        void onResumedByPhoneCall();
    }

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            f99535c = new c();
        }
    }

    public e(b bVar) {
        this.f99541g = bVar;
    }

    static /* synthetic */ void a(e eVar) {
        b bVar = eVar.f99541g;
        if (bVar == null) {
            return;
        }
        try {
            if (eVar.f99537b.getMode() == 2) {
                eVar.f99543i = true;
                bVar.onInterruptedByPhoneCall();
            } else if (eVar.f99543i) {
                eVar.f99543i = false;
                bVar.onResumedByPhoneCall();
            }
        } catch (Throwable th2) {
            Log.e("PhoneStateManager", "get Mode exception, " + th2.getMessage(), new Object[0]);
        }
    }

    static boolean b() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        try {
            return applicationContext.checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid()) == 0;
        } catch (Throwable th2) {
            Log.e("PhoneStateManager", "check permission exception, " + th2.getMessage(), new Object[0]);
            return true;
        }
    }

    static void c() {
        if (Build.VERSION.SDK_INT >= 26 && f99535c != null) {
            Log.i("PhoneStateManager", "unregister audio playback callback.", new Object[0]);
            f99535c.f99533a = null;
        }
    }

    @Override // com.tencent.liteav.audio2.c.a
    public final void a() {
        this.f99542h.b(f.a(this), 500L);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i10, String str) {
        b bVar = this.f99541g;
        if (bVar == null || this.f99540f == i10) {
            return;
        }
        this.f99540f = i10;
        if (i10 == 2) {
            bVar.onInterruptedByPhoneCall();
        } else if (i10 == 0) {
            bVar.onResumedByPhoneCall();
        }
    }
}
