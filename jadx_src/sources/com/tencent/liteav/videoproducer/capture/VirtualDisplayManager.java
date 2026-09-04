package com.tencent.liteav.videoproducer.capture;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.m;
import com.tencent.rtmp.video.ScreenCaptureService;
import com.tencent.rtmp.video.TXScreenCapture;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class VirtualDisplayManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile VirtualDisplayManager f100689b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f100692d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaProjection f100696h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile WeakReference<Activity> f100691c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Surface, a> f100694f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f100695g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f100697i = f.a(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f100698j = g.a(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final MediaProjection.Callback f100699k = new AnonymousClass1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f100693e = new CustomHandler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f100690a = new m();

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.capture.VirtualDisplayManager$1, reason: invalid class name */
    public final class AnonymousClass1 extends MediaProjection.Callback {
        AnonymousClass1() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            LiteavLog.e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            VirtualDisplayManager.this.f100690a.a(k.a(VirtualDisplayManager.this));
        }
    }

    public interface VirtualDisplayListener {
        void onCaptureError();

        void onStartFinish(boolean z10, boolean z11);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Surface f100701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f100702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public VirtualDisplayListener f100704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VirtualDisplay f100705e;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    private VirtualDisplayManager(Context context) {
        this.f100692d = context.getApplicationContext();
    }

    public static VirtualDisplayManager a(Context context) {
        if (f100689b == null) {
            synchronized (VirtualDisplayManager.class) {
                if (f100689b == null) {
                    f100689b = new VirtualDisplayManager(context);
                }
            }
        }
        return f100689b;
    }

    private void a() {
        Activity activityC = com.tencent.liteav.base.util.j.a().c();
        if (!this.f100695g) {
            this.f100695g = true;
            Intent intent = new Intent(this.f100692d, (Class<?>) TXScreenCapture.TXScreenCaptureAssistantActivity.class);
            intent.addFlags(268435456);
            this.f100692d.startActivity(intent);
            this.f100691c = new WeakReference<>(activityC);
            return;
        }
        if (activityC == this.f100691c.get()) {
            return;
        }
        this.f100691c = new WeakReference<>(activityC);
        if (activityC == null || !activityC.getClass().equals(TXScreenCapture.TXScreenCaptureAssistantActivity.class)) {
            LiteavLog.i("VirtualDisplayManager", "rerequest permission delay beacuse activity changed, current activity: ".concat(String.valueOf(activityC)));
            this.f100690a.c(this.f100698j);
            this.f100690a.b(this.f100698j, TimeUnit.MILLISECONDS.toMillis(500L));
        }
    }

    static /* synthetic */ void a(VirtualDisplayManager virtualDisplayManager) {
        if (virtualDisplayManager.f100695g) {
            LiteavLog.i("VirtualDisplayManager", "finish ScreenCaptureActivity");
            com.tencent.liteav.videobase.utils.c.a().a(new Intent("com.tencent.liteav.video.action.FINISH_SCREEN_CAPTURE_ACTIVITY"));
            virtualDisplayManager.f100695g = false;
            virtualDisplayManager.a();
        }
    }

    static /* synthetic */ void a(VirtualDisplayManager virtualDisplayManager, MediaProjection mediaProjection) {
        virtualDisplayManager.f100695g = false;
        if (mediaProjection != null) {
            LiteavLog.i("VirtualDisplayManager", "Got session ".concat(String.valueOf(mediaProjection)));
            virtualDisplayManager.f100696h = mediaProjection;
            mediaProjection.registerCallback(virtualDisplayManager.f100699k, virtualDisplayManager.f100693e);
            virtualDisplayManager.b();
            b(virtualDisplayManager.f100696h);
            virtualDisplayManager.a(true);
            return;
        }
        HashMap map = new HashMap(virtualDisplayManager.f100694f);
        virtualDisplayManager.f100694f.clear();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            VirtualDisplayListener virtualDisplayListener = ((a) it.next()).f100704d;
            if (virtualDisplayListener != null) {
                virtualDisplayListener.onStartFinish(false, true);
            }
        }
        virtualDisplayManager.c();
    }

    static /* synthetic */ void a(VirtualDisplayManager virtualDisplayManager, Surface surface) {
        VirtualDisplay virtualDisplay;
        if (surface != null) {
            a aVarRemove = virtualDisplayManager.f100694f.remove(surface);
            if (aVarRemove != null && (virtualDisplay = aVarRemove.f100705e) != null) {
                virtualDisplay.release();
                LiteavLog.i("VirtualDisplayManager", "VirtualDisplay released, " + aVarRemove.f100705e);
            }
            virtualDisplayManager.a(!(LiteavSystemInfo.getSystemOSVersionInt() >= 34));
        }
    }

    static /* synthetic */ void a(VirtualDisplayManager virtualDisplayManager, Surface surface, int i10, int i11, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        byte b10 = 0;
        if (surface == null) {
            LiteavLog.e("VirtualDisplayManager", "surface is null!");
            virtualDisplayListener.onStartFinish(false, false);
            return;
        }
        a aVar = new a(b10);
        aVar.f100701a = surface;
        aVar.f100702b = i10;
        aVar.f100703c = i11;
        aVar.f100704d = virtualDisplayListener;
        aVar.f100705e = null;
        virtualDisplayManager.f100694f.put(surface, aVar);
        virtualDisplayManager.f100690a.c(virtualDisplayManager.f100697i);
        MediaProjection mediaProjection2 = virtualDisplayManager.f100696h;
        if (mediaProjection2 == null && mediaProjection == null) {
            virtualDisplayManager.a();
        } else if (mediaProjection == null || mediaProjection2 == mediaProjection) {
            virtualDisplayManager.b();
        } else {
            LiteavLog.i("VirtualDisplayManager", "start capture with media projection from user:".concat(String.valueOf(mediaProjection)));
            virtualDisplayManager.a(mediaProjection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (this.f100694f.isEmpty()) {
            if (z10) {
                this.f100690a.b(this.f100697i, TimeUnit.SECONDS.toMillis(1L));
                return;
            }
            LiteavLog.i("VirtualDisplayManager", "Stop media projection session " + this.f100696h);
            if (this.f100696h != null) {
                b((MediaProjection) null);
                try {
                    this.f100696h.unregisterCallback(this.f100699k);
                    this.f100696h.stop();
                } catch (Throwable th2) {
                    LiteavLog.w("VirtualDisplayManager", "stop media projection session with exception ", th2);
                }
                this.f100696h = null;
            }
            c();
        }
    }

    private void b() {
        for (a aVar : this.f100694f.values()) {
            if (aVar.f100705e == null) {
                try {
                    aVar.f100705e = this.f100696h.createVirtualDisplay("TXCScreenCapture", aVar.f100702b, aVar.f100703c, 1, 1, aVar.f100701a, null, null);
                    LiteavLog.i("VirtualDisplayManager", "create VirtualDisplay " + aVar.f100705e);
                    VirtualDisplayListener virtualDisplayListener = aVar.f100704d;
                    if (virtualDisplayListener != null) {
                        virtualDisplayListener.onStartFinish(true, false);
                    }
                } catch (Throwable th2) {
                    LiteavLog.e("VirtualDisplayManager", "create VirtualDisplay error ", th2);
                    VirtualDisplayListener virtualDisplayListener2 = aVar.f100704d;
                    if (virtualDisplayListener2 != null) {
                        virtualDisplayListener2.onStartFinish(false, false);
                    }
                }
            }
        }
    }

    private static void b(MediaProjection mediaProjection) {
        try {
            Class.forName("com.tencent.liteav.audio2.SystemLoopbackRecorder2").getMethod("notifyMediaProjectionState", MediaProjection.class).invoke(null, mediaProjection);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            LiteavLog.e("VirtualDisplayManager", "fail to send media projection session " + e10.getMessage());
        }
    }

    private void c() {
        LiteavLog.i("VirtualDisplayManager", "stopScreenCaptureService");
        try {
            this.f100692d.stopService(new Intent(this.f100692d, (Class<?>) ScreenCaptureService.class));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(VirtualDisplayManager virtualDisplayManager) {
        HashMap map = new HashMap(virtualDisplayManager.f100694f);
        virtualDisplayManager.f100694f.clear();
        for (a aVar : map.values()) {
            VirtualDisplayListener virtualDisplayListener = aVar.f100704d;
            if (virtualDisplayListener != null) {
                if (aVar.f100705e != null) {
                    virtualDisplayListener.onCaptureError();
                } else {
                    virtualDisplayListener.onStartFinish(false, false);
                }
            }
        }
        virtualDisplayManager.a(false);
    }

    public final void a(MediaProjection mediaProjection) {
        this.f100690a.a(j.a(this, mediaProjection));
    }
}
