package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.ss.android.ttvecamera.systemresmanager.TESystemResManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public enum TECameraServer {
    INSTANCE;

    private static final String TAG = "TECameraServer";

    @androidx.annotation.b0("mLock")
    private com.ss.android.ttvecamera.k mCameraClient;
    private volatile com.ss.android.ttvecamera.j mCameraInstance;
    private TECameraSettings mCameraSettings;
    private Runnable mCheckCloseTask;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private volatile boolean mIsCameraPendingClose;
    private volatile boolean mIsCameraProviderChanged;
    private volatile boolean mIsInitialized;
    private com.ss.android.ttvecamera.k.d mPictureSizeCallback;
    com.ss.android.ttvecamera.provider.c mProviderManager;
    private com.ss.android.ttvecamera.provider.c.a mProviderSettings;
    private TECameraSettings.s mSATZoomCallback;
    private TESystemResManager mSystemResManager;
    private volatile boolean mHandlerDestroyed = true;
    private float mCurrentZoom = 0.0f;
    private com.ss.android.ttvecamera.k.b mCameraObserver = new com.ss.android.ttvecamera.k.c();
    private com.ss.android.ttvecamera.k.e mPreviewSizeCallback = null;
    private com.ss.android.ttvecamera.k.a mFpsConfigCallback = null;
    private final Object mStateLock = new Object();

    @androidx.annotation.b0("mStateLock")
    private volatile int mCurrentCameraState = 0;
    private final Object mLock = new Object();

    @androidx.annotation.b0("this")
    private volatile int sClientCount = 0;
    private long mOpenTime = 0;
    private long mBeginTime = 0;
    private int mRetryCnt = -1;
    private boolean mStartPreviewError = false;
    private final ConditionVariable mCameraClientCondition = new ConditionVariable();
    private final ConcurrentHashMap<String, String> mOpenInfoMap = new ConcurrentHashMap<>();
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private Cert cachedOpenPrivacyCert = null;
    private Cert cachedClosePrivacyCert = null;
    private boolean mOnBackGround = false;
    private boolean mFirstEC = true;
    private boolean mFirstZoom = true;
    private boolean mEnableVBoost = false;
    private int mVBoostTimeoutMS = 0;
    private boolean mIsForegroundVisible = false;
    private int mCameraCloseTaskHandlerId = -1;
    private volatile boolean mIsCameraSwitchState = false;
    private com.ss.android.ttvecamera.j.a mCameraEvent = new n0();
    private final com.ss.android.ttvecamera.j.b mFpsConfigCallbackProxy = new o0();
    private final com.ss.android.ttvecamera.j.e mPictureSizeCallBack = new p0();
    private final com.ss.android.ttvecamera.j.f mBasePreviewSizeCallback = new q0();
    private com.ss.android.ttvecamera.j.g satZoomCallback = new s0();

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f96884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cert f96886d;

        a(long j10, boolean z10, Cert cert) {
            this.f96884b = j10;
            this.f96885c = z10;
            this.f96886d = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f96884b;
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "Push close task cost: " + jCurrentTimeMillis);
            TECameraServer.this.close(this.f96885c, this.f96886d);
            TECameraServer.this.mIsCameraPendingClose = false;
            if (this.f96885c) {
                TECameraServer.this.mCameraClientCondition.open();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f96884b;
            com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97646j, jCurrentTimeMillis);
            com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97647k, jCurrentTimeMillis2);
            com.ss.android.ttvecamera.q.l(com.ss.android.ttvecamera.n.f97647k, Long.valueOf(jCurrentTimeMillis2));
        }
    }

    public class a0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96889c;

        a0(com.ss.android.ttvecamera.k kVar, boolean z10) {
            this.f96888b = kVar;
            this.f96889c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoFocusLock(this.f96888b, this.f96889c);
        }
    }

    public class a1 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96892c;

        a1(com.ss.android.ttvecamera.k kVar, boolean z10) {
            this.f96891b = kVar;
            this.f96892c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stop(this.f96891b, this.f96892c);
            if (this.f96892c) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cert f96896d;

        b(com.ss.android.ttvecamera.k kVar, int i10, Cert cert) {
            this.f96894b = kVar;
            this.f96895c = i10;
            this.f96896d = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f96894b, this.f96895c, this.f96896d);
        }
    }

    public class b0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f96900d;

        b0(com.ss.android.ttvecamera.k kVar, boolean z10, String str) {
            this.f96898b = kVar;
            this.f96899c = z10;
            this.f96900d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setWhileBalance(this.f96898b, this.f96899c, this.f96900d);
        }
    }

    public static class b1 implements Handler.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f96902c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f96903d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f96904e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<TECameraServer> f96905b;

        public b1(TECameraServer tECameraServer) {
            this.f96905b = new WeakReference<>(tECameraServer);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            Object obj = message.obj;
            TECameraServer tECameraServer = this.f96905b.get();
            if (i10 == 1) {
                com.ss.android.ttvecamera.q.b(TECameraServer.TAG, "startZoom...");
                synchronized (tECameraServer.mStateLock) {
                    if (tECameraServer.mCameraInstance != null) {
                        tECameraServer.mCameraInstance.z0(message.arg1 / 100.0f, (TECameraSettings.w) obj);
                    }
                    if (tECameraServer.mFirstZoom) {
                        tECameraServer.mCameraEvent.e(114, 0, "startzoom", tECameraServer.mCameraInstance);
                        tECameraServer.mFirstZoom = false;
                    }
                }
            }
            return false;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings f96907c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cert f96908d;

        c(com.ss.android.ttvecamera.k kVar, TECameraSettings tECameraSettings, Cert cert) {
            this.f96906b = kVar;
            this.f96907c = tECameraSettings;
            this.f96908d = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCamera(this.f96906b, this.f96907c, this.f96908d);
        }
    }

    public class c0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.n f96911c;

        c0(com.ss.android.ttvecamera.k kVar, TECameraSettings.n nVar) {
            this.f96910b = kVar;
            this.f96911c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iSORange = TECameraServer.this.getISORange(this.f96910b, this.f96911c);
            if (iSORange != null) {
                this.f96911c.a(iSORange);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.i f96914c;

        d(com.ss.android.ttvecamera.k kVar, TECameraSettings.i iVar) {
            this.f96913b = kVar;
            this.f96914c = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            float[] fov = TECameraServer.this.getFOV(this.f96913b, this.f96914c);
            TECameraSettings.i iVar = this.f96914c;
            if (iVar != null) {
                iVar.a(fov);
            }
        }
    }

    public class d0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96917c;

        d0(com.ss.android.ttvecamera.k kVar, int i10) {
            this.f96916b = kVar;
            this.f96917c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setISO(this.f96916b, this.f96917c);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.f f96919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ rg.a f96920c;

        e(TECameraSettings.f fVar, rg.a aVar) {
            this.f96919b = fVar;
            this.f96920c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                if (TECameraServer.this.mCurrentCameraState == 3) {
                    if (TECameraServer.this.mCameraSettings.f97076b == 1) {
                        TECameraServer.this.updateCameraState(2);
                    }
                    TECameraServer.this.mCameraInstance.d(this.f96920c, this.f96919b);
                    return;
                }
                String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                TECameraServer.this.mCameraObserver.onError(-105, str);
                com.ss.android.ttvecamera.q.e(TECameraServer.TAG, str);
                TECameraSettings.f fVar = this.f96919b;
                if (fVar != null) {
                    fVar.b(new Exception(str));
                }
            }
        }
    }

    public class e0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.m f96923c;

        e0(com.ss.android.ttvecamera.k kVar, TECameraSettings.m mVar) {
            this.f96922b = kVar;
            this.f96923c = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iso = TECameraServer.this.getISO(this.f96922b, this.f96923c);
            if (iso >= 0) {
                this.f96923c.a(iso);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.r f96925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96927d;

        f(TECameraSettings.r rVar, int i10, int i11) {
            this.f96925b = rVar;
            this.f96926c = i10;
            this.f96927d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                if (TECameraServer.this.mCurrentCameraState == 3) {
                    if (TECameraServer.this.mCameraSettings.f97076b == 1) {
                        TECameraServer.this.updateCameraState(2);
                    }
                    TECameraServer.this.mCameraInstance.H0(this.f96926c, this.f96927d, this.f96925b);
                    return;
                }
                String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                TECameraServer.this.mCameraObserver.onError(-105, str);
                com.ss.android.ttvecamera.q.e(TECameraServer.TAG, str);
                TECameraSettings.r rVar = this.f96925b;
                if (rVar != null) {
                    rVar.a(new Exception(str));
                }
            }
        }
    }

    public class f0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.u f96930c;

        f0(com.ss.android.ttvecamera.k kVar, TECameraSettings.u uVar) {
            this.f96929b = kVar;
            this.f96930c = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            long[] shutterTimeRange = TECameraServer.this.getShutterTimeRange(this.f96929b, this.f96930c);
            if (shutterTimeRange != null) {
                this.f96930c.a(shutterTimeRange);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.r f96932b;

        g(TECameraSettings.r rVar) {
            this.f96932b = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "takePicture");
            synchronized (TECameraServer.this.mStateLock) {
                if (TECameraServer.this.mCurrentCameraState == 3) {
                    if (TECameraServer.this.mCameraSettings.f97076b == 1) {
                        TECameraServer.this.updateCameraState(2);
                    }
                    TECameraServer.this.mCameraInstance.I0(this.f96932b);
                    return;
                }
                String str = "Can not takePicture on state : " + TECameraServer.this.mCurrentCameraState;
                TECameraServer.this.mCameraObserver.onError(-105, str);
                com.ss.android.ttvecamera.q.e(TECameraServer.TAG, str);
                TECameraSettings.r rVar = this.f96932b;
                if (rVar != null) {
                    rVar.a(new Exception(str));
                }
            }
        }
    }

    public class g0 implements Runnable {
        g0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCurrentCameraState <= 1 || TECameraServer.this.mCurrentCameraState >= 4) {
                if (TECameraServer.this.mCurrentCameraState == 1) {
                    TECameraServer.this.mMainHandler.postDelayed(this, 2000L);
                    return;
                }
                return;
            }
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "close camera in main thread");
            if (!TECameraServer.this.mCameraSettings.R || TECameraServer.this.mCameraInstance == null) {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.realCloseCamera(tECameraServer.cachedClosePrivacyCert);
            } else {
                TECameraServer.this.updateCameraState(4);
                TECameraServer.this.mCameraInstance.n(TECameraServer.this.cachedClosePrivacyCert);
                TECameraServer.this.updateCameraState(0);
            }
            if (TECameraServer.this.decreaseClientCount() == 0) {
                TECameraServer.this.destroy();
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TEFocusSettings f96936c;

        h(com.ss.android.ttvecamera.k kVar, TEFocusSettings tEFocusSettings) {
            this.f96935b = kVar;
            this.f96936c = tEFocusSettings;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFocusAtPoint = TECameraServer.this.focusAtPoint(this.f96935b, this.f96936c);
            if (iFocusAtPoint == 0 || this.f96936c.g() == null) {
                return;
            }
            this.f96936c.g().a(iFocusAtPoint, TECameraServer.this.mCameraSettings.f97080d, "");
        }
    }

    public class h0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f96939c;

        h0(com.ss.android.ttvecamera.k kVar, long j10) {
            this.f96938b = kVar;
            this.f96939c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setShutterTime(this.f96938b, this.f96939c);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96941b;

        i(com.ss.android.ttvecamera.k kVar) {
            this.f96941b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.cancelFocus(this.f96941b);
        }
    }

    public class i0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.a f96944c;

        i0(com.ss.android.ttvecamera.k kVar, TECameraSettings.a aVar) {
            this.f96943b = kVar;
            this.f96944c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            float[] apertureRange = TECameraServer.this.getApertureRange(this.f96943b, this.f96944c);
            if (apertureRange != null) {
                this.f96944c.a(apertureRange);
            }
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96946b;

        j(com.ss.android.ttvecamera.k kVar) {
            this.f96946b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableCaf(this.f96946b);
        }
    }

    public class j0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f96949c;

        j0(com.ss.android.ttvecamera.k kVar, float f10) {
            this.f96948b = kVar;
            this.f96949c = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAperture(this.f96948b, this.f96949c);
        }
    }

    public class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.mProviderManager.m();
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "provider release...");
        }
    }

    public class k0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f96953c;

        k0(com.ss.android.ttvecamera.k kVar, boolean z10) {
            this.f96952b = kVar;
            this.f96953c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.toggleTorch(this.f96952b, this.f96953c);
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.o f96956c;

        l(com.ss.android.ttvecamera.k kVar, TECameraSettings.o oVar) {
            this.f96955b = kVar;
            this.f96956c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            float manualFocusAbility = TECameraServer.this.getManualFocusAbility(this.f96955b, this.f96956c);
            if (manualFocusAbility >= 0.0f) {
                this.f96956c.a(manualFocusAbility);
            }
        }
    }

    public class l0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96959c;

        l0(com.ss.android.ttvecamera.k kVar, int i10) {
            this.f96958b = kVar;
            this.f96959c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchFlashMode(this.f96958b, this.f96959c);
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f96962c;

        m(com.ss.android.ttvecamera.k kVar, float f10) {
            this.f96961b = kVar;
            this.f96962c = f10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setManualFocusDistance(this.f96961b, this.f96962c);
        }
    }

    public class m0 implements Printer {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f96964e = ">>>>> Dispatching to Handler";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f96965f = "<<<<< Finished to Handler";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f96966g = 1000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f96967a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f96968b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f96969c = 0;

        m0() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (str.startsWith(f96964e)) {
                this.f96967a = System.currentTimeMillis();
                return;
            }
            if (str.startsWith(f96965f)) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f96967a;
                if (jCurrentTimeMillis > 1000) {
                    int i10 = this.f96968b + 1;
                    this.f96968b = i10;
                    com.ss.android.ttvecamera.n.b("te_record_camera_task_time_out_count", i10);
                    if (jCurrentTimeMillis > this.f96969c) {
                        this.f96969c = jCurrentTimeMillis;
                        com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97661y, jCurrentTimeMillis);
                        com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "task: " + str + ", cost: " + jCurrentTimeMillis + "ms");
                    }
                }
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f96971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96972c;

        n(int i10, int i11) {
            this.f96971b = i10;
            this.f96972c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCurrentCameraState == 3) {
                TECameraServer.this.mCameraInstance.q0(this.f96971b, this.f96972c);
                return;
            }
            com.ss.android.ttvecamera.q.e(TECameraServer.TAG, "set picture size failed, w: " + this.f96971b + ", h: " + this.f96972c + ", state: " + TECameraServer.this.mCurrentCameraState);
        }
    }

    public class n0 implements com.ss.android.ttvecamera.j.a {

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraServer.this.handlePreviewingFallback();
            }
        }

        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.start(tECameraServer.mCameraClient);
            }
        }

        n0() {
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void a(int i10, int i11, int i12, String str, Object obj) {
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "startCapture success!");
            TECameraServer.this.mStartPreviewError = false;
            if (TECameraServer.this.mCameraSettings == null || TECameraServer.this.mCameraInstance == null) {
                e(i11, i12, str, obj);
            } else {
                int iM = TECameraServer.this.mCameraSettings.f97118w - TECameraServer.this.mCameraInstance.M();
                e(i11, iM, str + ", Retry preview times = " + iM, obj);
                TECameraServer.this.mCameraInstance.g();
            }
            com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.C, 0L);
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void b(int i10, int i11, String str, Object obj) {
            if (TECameraServer.this.mCameraSettings.f97087g0 && i11 == -437) {
                com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.C, i11);
                Handler handler = TECameraServer.this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new a());
                return;
            }
            synchronized (TECameraServer.this.mStateLock) {
                if (TECameraServer.this.mCameraInstance == null || TECameraServer.this.mCameraInstance.M() <= 0) {
                    c(i10, i11, str, obj);
                    com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.C, i11);
                } else {
                    TECameraServer.this.mStartPreviewError = true;
                    com.ss.android.ttvecamera.q.u(TECameraServer.TAG, "Retry to startPreview. " + TECameraServer.this.mCameraInstance.M() + " times is waiting to retry.");
                    TECameraServer.this.mCameraInstance.h0();
                    Handler handler2 = TECameraServer.this.mHandler;
                    if (handler2 == null) {
                    } else {
                        handler2.postDelayed(new b(), 100L);
                    }
                }
            }
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void c(int i10, int i11, String str, Object obj) {
            com.ss.android.ttvecamera.q.e(TECameraServer.TAG, "onCameraError: code = " + i11 + ", msg = " + str);
            TECameraServer.this.mCameraObserver.onError(i11, "Open camera failed @" + TECameraServer.this.mCameraSettings.f97076b + ",face:" + TECameraServer.this.mCameraSettings.f97080d + " " + TECameraServer.this.mCameraSettings.f97106q.toString() + " " + str);
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void d(int i10, int i11, int i12, String str, Object obj) {
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "stopCapture success!");
            e(i11, i12, str, obj);
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void e(int i10, int i11, String str, Object obj) {
            com.ss.android.ttvecamera.q.b(TECameraServer.TAG, "onCameraInfo: " + i10 + ", ext: " + i11 + " msg: " + str);
            if (i10 == 108) {
                TECameraServer.this.updateCameraState(4);
            } else if (i10 == 109) {
                TECameraServer.this.updateCameraState(0);
            }
            TECameraServer.this.mCameraObserver.onInfo(i10, i11, str);
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void f(int i10, int i11, com.ss.android.ttvecamera.j jVar, Object obj) {
            com.ss.android.ttvecamera.s.a("TECameraServer-onCameraOpened: cameraType " + i10 + ", ret " + i11);
            TECameraServer.this.mOpenTime = System.currentTimeMillis() - TECameraServer.this.mBeginTime;
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "onCameraOpened: CameraType = " + TECameraServer.this.mCameraSettings.f97076b + ", Ret = " + i11 + ",retryCnt = " + TECameraServer.this.mRetryCnt);
            ConcurrentHashMap concurrentHashMap = TECameraServer.this.mOpenInfoMap;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CamType");
            sb2.append(TECameraServer.this.mRetryCnt);
            concurrentHashMap.put(sb2.toString(), String.valueOf(TECameraServer.this.mCameraSettings.f97076b));
            TECameraServer.this.mOpenInfoMap.put("Ret" + TECameraServer.this.mRetryCnt, String.valueOf(i11));
            TECameraServer.this.mOpenInfoMap.put("OpenTime" + TECameraServer.this.mRetryCnt, String.valueOf(TECameraServer.this.mOpenTime));
            if (i11 == 0) {
                TECameraServer tECameraServer = TECameraServer.this;
                tECameraServer.mRetryCnt = tECameraServer.mCameraSettings.f97116v;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState != 1) {
                        com.ss.android.ttvecamera.q.u(TECameraServer.TAG, "Open camera error ? May be closed now!!, state = " + TECameraServer.this.mCurrentCameraState);
                        return;
                    }
                    TECameraServer.this.updateCameraState(2);
                    TECameraServer.this.mCameraObserver.onCaptureStarted(i10, i11);
                    int i12 = TECameraServer.this.mCameraSettings.f97116v - TECameraServer.this.mRetryCnt;
                    TECameraServer.this.mCameraObserver.onInfo(120, i12, "Retry open camera times = " + i12);
                    TECameraServer.this.mOpenInfoMap.put("ResultType", "Open Success");
                    com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97649m, (long) i11);
                    com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97648l, TECameraServer.this.mOpenTime);
                    com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97650n, TECameraServer.this.mOpenInfoMap.toString());
                    com.ss.android.ttvecamera.q.k("VESDKCOST", "TE_RECORD_CAMERA_OPEN_COST " + TECameraServer.this.mOpenTime);
                    TECameraServer.this.mOpenInfoMap.clear();
                }
            } else if (TECameraServer.this.mCameraSettings.f97076b == 11 && i11 == -428) {
                com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "CameraUnit auth failed, fall back to camera2");
                TECameraServer tECameraServer2 = TECameraServer.this;
                tECameraServer2.mRetryCnt = tECameraServer2.mCameraSettings.f97116v;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 0) {
                        com.ss.android.ttvecamera.q.u(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                        TECameraServer.this.mCameraInstance = null;
                    } else {
                        TECameraServer.this.updateCameraState(4);
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.f(TECameraServer.this.cachedOpenPrivacyCert);
                            TECameraServer.this.mCameraInstance = null;
                        }
                        TECameraServer.this.updateCameraState(0);
                    }
                }
                TECameraServer.this.mCameraSettings.f97076b = 2;
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera2");
                com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97650n, TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else if (i11 != -403 && i11 != -408 && TECameraServer.this.mRetryCnt > 0 && TECameraServer.this.isCameraPermitted()) {
                TECameraServer.this.mCameraObserver.onError(-404, "Retry to Open Camera Failed @" + TECameraServer.this.mCameraSettings.f97076b + ",face:" + TECameraServer.this.mCameraSettings.f97080d + " " + TECameraServer.this.mCameraSettings.f97106q.toString());
                if (TECameraServer.this.mIsCameraPendingClose) {
                    TECameraServer.this.mIsCameraPendingClose = false;
                    com.ss.android.ttvecamera.q.e(TECameraServer.TAG, "retry to open camera, but camera close was called");
                    TECameraServer.this.mRetryCnt = -1;
                    TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                    com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97650n, TECameraServer.this.mOpenInfoMap.toString());
                    return;
                }
                if (TECameraServer.this.mCameraSettings.f97074a == null) {
                    TECameraServer.this.mRetryCnt = -1;
                    com.ss.android.ttvecamera.q.e(TECameraServer.TAG, "abort retry to open camera, no context: " + TECameraServer.this.mCameraSettings);
                    return;
                }
                if (i10 == 2 && TECameraServer.this.mRetryCnt == TECameraServer.this.mCameraSettings.f97116v && (i11 == 4 || i11 == 5 || i11 == 1)) {
                    com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "camera2 is not available");
                    TECameraServer tECameraServer3 = TECameraServer.this;
                    tECameraServer3.mRetryCnt = tECameraServer3.mCameraSettings.f97120x;
                }
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "retry to open camera, mRetryCnt = " + TECameraServer.this.mRetryCnt);
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 0) {
                        com.ss.android.ttvecamera.q.u(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                        TECameraServer.this.mCameraInstance = null;
                    } else {
                        TECameraServer.this.updateCameraState(4);
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.f(TECameraServer.this.cachedOpenPrivacyCert);
                            TECameraServer.this.mCameraInstance = null;
                        }
                        TECameraServer.this.updateCameraState(0);
                    }
                }
                TECameraServer.access$1810(TECameraServer.this);
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType" + TECameraServer.this.mRetryCnt, "retry to open camera");
                com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97650n, TECameraServer.this.mOpenInfoMap.toString());
            } else if ((!TECameraServer.this.mCameraSettings.L || i10 == 1 || i11 == -408) && i11 != -403) {
                TECameraServer.this.mCameraObserver.onCaptureStarted(i10, i11);
                com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "finally go to the error.");
                com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97649m, i11);
                TECameraServer.this.mCameraObserver.onError(i11, "Open camera failed @" + TECameraServer.this.mCameraSettings.f97076b + ",face:" + TECameraServer.this.mCameraSettings.f97080d + " " + TECameraServer.this.mCameraSettings.f97106q.toString());
                TECameraServer.INSTANCE.close(TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mRetryCnt = -1;
                com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97650n, TECameraServer.this.mOpenInfoMap.toString());
                TECameraServer.this.mOpenInfoMap.clear();
            } else {
                com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "Open camera failed, fall back to camera1");
                TECameraServer tECameraServer4 = TECameraServer.this;
                tECameraServer4.mRetryCnt = tECameraServer4.mCameraSettings.f97116v;
                synchronized (TECameraServer.this.mStateLock) {
                    if (TECameraServer.this.mCurrentCameraState == 0) {
                        com.ss.android.ttvecamera.q.u(TECameraServer.TAG, "onCameraOpened, no need to close camera, state: " + TECameraServer.this.mCurrentCameraState);
                        TECameraServer.this.mCameraInstance = null;
                    } else {
                        TECameraServer.this.updateCameraState(4);
                        if (TECameraServer.this.mCameraInstance != null) {
                            TECameraServer.this.mCameraInstance.f(TECameraServer.this.cachedOpenPrivacyCert);
                            TECameraServer.this.mCameraInstance = null;
                        }
                        TECameraServer.this.updateCameraState(0);
                    }
                }
                TECameraServer.this.mCameraSettings.f97076b = 1;
                TECameraServer.this.mCameraEvent.e(51, 0, "need recreate surfacetexture", null);
                TECameraServer.INSTANCE.open(TECameraServer.this.mCameraClient, TECameraServer.this.mCameraSettings, TECameraServer.this.cachedOpenPrivacyCert);
                TECameraServer.this.mOpenInfoMap.put("ResultType", "fallback to Camera1");
                com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97650n, TECameraServer.this.mOpenInfoMap.toString());
            }
            com.ss.android.ttvecamera.s.b();
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void g(int i10, int i11, int i12, String str, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onTorchError ");
            sb2.append(str);
            sb2.append(i12 == 0 ? " close" : " open");
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, sb2.toString());
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void h(int i10, int i11, int i12, String str, Object obj) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onTorchSuccess ");
            sb2.append(str);
            sb2.append(i12 == 0 ? " close" : " open");
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, sb2.toString());
        }

        @Override // com.ss.android.ttvecamera.j.a
        public void i(int i10, com.ss.android.ttvecamera.j jVar, Object obj) {
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "onCameraClosed, CameraState = " + TECameraServer.this.mCurrentCameraState);
            if (jVar == TECameraServer.this.mCameraInstance) {
                synchronized (TECameraServer.this.mStateLock) {
                    TECameraServer.this.updateCameraState(0);
                }
                TECameraServer.this.mCameraObserver.onCaptureStopped(0);
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f96977b;

        o(int i10) {
            this.f96977b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.u0(this.f96977b);
            }
        }
    }

    public class o0 implements com.ss.android.ttvecamera.j.b {
        o0() {
        }

        @Override // com.ss.android.ttvecamera.j.b
        public int[] a(List<int[]> list) {
            if (TECameraServer.this.mFpsConfigCallback != null) {
                return TECameraServer.this.mFpsConfigCallback.a(list);
            }
            return null;
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.w f96981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96982d;

        p(com.ss.android.ttvecamera.k kVar, TECameraSettings.w wVar, boolean z10) {
            this.f96980b = kVar;
            this.f96981c = wVar;
            this.f96982d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryZoomAbility(this.f96980b, this.f96981c, this.f96982d);
        }
    }

    public class p0 implements com.ss.android.ttvecamera.j.e {
        p0() {
        }

        @Override // com.ss.android.ttvecamera.j.e
        public TEFrameSizei a(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
            if (TECameraServer.this.mPictureSizeCallback != null) {
                return TECameraServer.this.mPictureSizeCallback.a(list, list2);
            }
            return null;
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.t f96986c;

        q(com.ss.android.ttvecamera.k kVar, TECameraSettings.t tVar) {
            this.f96985b = kVar;
            this.f96986c = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.queryShaderZoomStep(this.f96985b, this.f96986c);
        }
    }

    public class q0 implements com.ss.android.ttvecamera.j.f {
        q0() {
        }

        @Override // com.ss.android.ttvecamera.j.f
        public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
            if (TECameraServer.this.mPreviewSizeCallback == null) {
                return null;
            }
            try {
                return TECameraServer.this.mPreviewSizeCallback.getPreviewSize(list);
            } catch (Exception e10) {
                com.ss.android.ttvecamera.q.e(TECameraServer.TAG, "select preview size from client err: " + e10.getMessage());
                return null;
            }
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.w f96990c;

        r(com.ss.android.ttvecamera.k kVar, TECameraSettings.w wVar) {
            this.f96989b = kVar;
            this.f96990c = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.stopZoom(this.f96989b, this.f96990c);
        }
    }

    public class r0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f96993c;

        r0(com.ss.android.ttvecamera.k kVar, int i10) {
            this.f96992b = kVar;
            this.f96993c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.switchCameraMode(this.f96992b, this.f96993c);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f96995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f96996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.w f96997d;

        s(com.ss.android.ttvecamera.k kVar, float f10, TECameraSettings.w wVar) {
            this.f96995b = kVar;
            this.f96996c = f10;
            this.f96997d = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.zoomV2(this.f96995b, this.f96996c, this.f96997d);
        }
    }

    public class s0 implements com.ss.android.ttvecamera.j.g {
        s0() {
        }

        @Override // com.ss.android.ttvecamera.j.g
        public void a(int i10, float f10) {
            if (TECameraServer.this.mSATZoomCallback != null) {
                TECameraServer.this.mSATZoomCallback.a(i10, f10);
            }
        }
    }

    public class t implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f97001c;

        t(com.ss.android.ttvecamera.k kVar, Bundle bundle) {
            this.f97000b = kVar;
            this.f97001c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setFeatureParameters(this.f97000b, this.f97001c);
        }
    }

    public class t0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f97004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.j.c f97005d;

        t0(com.ss.android.ttvecamera.k kVar, int i10, com.ss.android.ttvecamera.j.c cVar) {
            this.f97003b = kVar;
            this.f97004c = i10;
            this.f97005d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.changeRecorderState(this.f97003b, this.f97004c, this.f97005d);
        }
    }

    public class u implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.p f97008c;

        u(com.ss.android.ttvecamera.k kVar, TECameraSettings.p pVar) {
            this.f97007b = kVar;
            this.f97008c = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.process(this.f97007b, this.f97008c);
        }
    }

    public class u0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f97011c;

        u0(com.ss.android.ttvecamera.k kVar, boolean z10) {
            this.f97010b = kVar;
            this.f97011c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.enableMulticamZoom(this.f97010b, this.f97011c);
        }
    }

    public class v implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f97013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TECameraSettings f97015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cert f97016e;

        v(long j10, com.ss.android.ttvecamera.k kVar, TECameraSettings tECameraSettings, Cert cert) {
            this.f97013b = j10;
            this.f97014c = kVar;
            this.f97015d = tECameraSettings;
            this.f97016e = cert;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ss.android.ttvecamera.q.b(TECameraServer.TAG, "Push open task cost: " + (System.currentTimeMillis() - this.f97013b));
            com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97645i, System.currentTimeMillis() - this.f97013b);
            TECameraServer.this.open(this.f97014c, this.f97015d, this.f97016e);
            com.ss.android.ttvecamera.q.k(TECameraServer.TAG, "Camera open cost: " + (System.currentTimeMillis() - this.f97013b) + "ms");
        }
    }

    public class v0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TECameraSettings.b f97019c;

        v0(com.ss.android.ttvecamera.k kVar, TECameraSettings.b bVar) {
            this.f97018b = kVar;
            this.f97019c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject cameraCapbilitiesForBytebench = TECameraServer.this.getCameraCapbilitiesForBytebench(this.f97018b, this.f97019c);
            TECameraSettings.b bVar = this.f97019c;
            if (bVar != null) {
                bVar.a(cameraCapbilitiesForBytebench);
            }
        }
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f97021b;

        w(int i10) {
            this.f97021b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (TECameraServer.this.mStateLock) {
                if (TECameraServer.this.mCameraInstance == null) {
                    return;
                }
                boolean zM0 = TECameraServer.this.mCameraInstance.m0(this.f97021b);
                if (TECameraServer.this.mFirstEC && zM0) {
                    TECameraServer.this.mCameraEvent.e(115, 0, "exposure compensation", TECameraServer.this.mCameraInstance);
                    TECameraServer.this.mFirstEC = false;
                }
            }
        }
    }

    public class w0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.provider.c.a f97024c;

        w0(com.ss.android.ttvecamera.k kVar, com.ss.android.ttvecamera.provider.c.a aVar) {
            this.f97023b = kVar;
            this.f97024c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.addCameraProvider(this.f97023b, this.f97024c);
        }
    }

    public class x implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97026b;

        x(com.ss.android.ttvecamera.k kVar) {
            this.f97026b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.upExposureCompensation(this.f97026b);
        }
    }

    public class x0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97028b;

        x0(com.ss.android.ttvecamera.k kVar) {
            this.f97028b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.removeCameraProvider(this.f97028b);
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97030b;

        y(com.ss.android.ttvecamera.k kVar) {
            this.f97030b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.downExposureCompensation(this.f97030b);
        }
    }

    public class y0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97032b;

        y0(com.ss.android.ttvecamera.k kVar) {
            this.f97032b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.start(this.f97032b);
            if (TECameraServer.this.mCameraSettings.f97094k) {
                TECameraServer.this.mCameraClientCondition.open();
            }
        }
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ss.android.ttvecamera.k f97034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f97035c;

        z(com.ss.android.ttvecamera.k kVar, boolean z10) {
            this.f97034b = kVar;
            this.f97035c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            TECameraServer.this.setAutoExposureLock(this.f97034b, this.f97035c);
        }
    }

    public class z0 implements Runnable {
        z0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TECameraServer.this.mCameraInstance != null) {
                TECameraServer.this.mCameraInstance.a();
            }
        }
    }

    TECameraServer() {
    }

    static /* synthetic */ int access$1810(TECameraServer tECameraServer) {
        int i10 = tECameraServer.mRetryCnt;
        tECameraServer.mRetryCnt = i10 - 1;
        return i10;
    }

    private boolean assertClient(com.ss.android.ttvecamera.k kVar) {
        synchronized (this.mLock) {
            com.ss.android.ttvecamera.k kVar2 = this.mCameraClient;
            if (kVar2 == kVar) {
                return true;
            }
            if (kVar2 == null) {
                com.ss.android.ttvecamera.q.u(TAG, "Internal CameraClient is null. Must call connect first!");
            } else {
                com.ss.android.ttvecamera.q.u(TAG, "Invalid CameraClient, need : " + this.mCameraClient);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int close(Cert cert) {
        return close(true, cert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int close(boolean z10, Cert cert) {
        Handler handler = this.mHandler;
        if (handler == null) {
            this.mCameraCloseTaskHandlerId = -1;
            updateCameraState(4);
            if (this.mCameraInstance != null) {
                com.ss.android.ttvecamera.q.e(TAG, "call camera close process, handler is null");
                this.mCameraInstance.n(this.cachedClosePrivacyCert);
                com.ss.android.ttvecamera.q.u(TAG, "call camera close process, handler is null, force close done");
            }
            updateCameraState(0);
            return com.ss.android.ttvecamera.o.f97693p;
        }
        com.ss.android.ttvecamera.q.k(TAG, "call camera close process...sync: " + z10 + ", handler: " + handler);
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            this.mCameraCloseTaskHandlerId = -1;
            if (this.mEnableVBoost) {
                this.mSystemResManager.c(new TESystemResManager.a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                realCloseCamera(cert);
                this.mSystemResManager.c(new TESystemResManager.a(TESystemResManager.ActionType.RESTORE_CPU));
            } else {
                realCloseCamera(cert);
            }
            this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
            if (!z10 && decreaseClientCount() == 0) {
                return destroy();
            }
        } else {
            int iHashCode = handler.hashCode();
            int i10 = this.mCameraCloseTaskHandlerId;
            if (i10 != -1 && i10 != iHashCode) {
                this.mCameraCloseTaskHandlerId = -1;
                com.ss.android.ttvecamera.q.e(TAG, "camera close task discard...handler id has changed");
                return 0;
            }
            this.mCameraCloseTaskHandlerId = iHashCode;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z10) {
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            handler.post(new a(jCurrentTimeMillis, z10, cert));
            if (z10) {
                boolean z11 = !this.mCameraClientCondition.block(1500L);
                this.mIsCameraPendingClose = false;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (z11) {
                    this.mCameraCloseTaskHandlerId = -1;
                    com.ss.android.ttvecamera.q.e(TAG, "Camera close timeout, mCurrentCameraState " + this.mCurrentCameraState);
                    updateCameraState(4);
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.n(this.cachedClosePrivacyCert);
                    }
                    updateCameraState(0);
                } else {
                    com.ss.android.ttvecamera.q.k(TAG, "Camera close cost: " + jCurrentTimeMillis2 + "ms");
                }
            }
        }
        return 0;
    }

    @androidx.annotation.p0
    private com.ss.android.ttvecamera.j createCameraInstance() {
        com.ss.android.ttvecamera.j jVarCreateCameraInstanceCore = createCameraInstanceCore();
        if (jVarCreateCameraInstanceCore != null) {
            jVarCreateCameraInstanceCore.e0(this.mPreviewSizeCallback != null ? this.mBasePreviewSizeCallback : null);
            jVarCreateCameraInstanceCore.d0(this.mFpsConfigCallback != null ? this.mFpsConfigCallbackProxy : null);
        }
        return jVarCreateCameraInstanceCore;
    }

    private com.ss.android.ttvecamera.j createCameraInstanceCore() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return com.ss.android.ttvecamera.c.T0(this.mCameraSettings.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        boolean z10 = !tECameraSettings.f97111s0 || com.ss.android.ttvecamera.p.F(tECameraSettings.f97074a);
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        int i11 = tECameraSettings2.f97076b;
        if (i11 == 1) {
            return com.ss.android.ttvecamera.c.T0(tECameraSettings2.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        if ((10 != i11 && 11 != i11) || i10 < 28) {
            if (!z10) {
                tECameraSettings2.f97076b = 1;
                return com.ss.android.ttvecamera.c.T0(tECameraSettings2.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            }
            com.ss.android.ttvecamera.j jVarCreateVendorCamera2Instance = createVendorCamera2Instance(i11, tECameraSettings2.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
            if (jVarCreateVendorCamera2Instance != null) {
                return jVarCreateVendorCamera2Instance;
            }
            TECameraSettings tECameraSettings3 = this.mCameraSettings;
            tECameraSettings3.f97076b = 2;
            return com.ss.android.ttvecamera.h.V0(2, tECameraSettings3.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        com.ss.android.ttvecamera.j jVar = (com.ss.android.ttvecamera.j) com.ss.android.ttvecamera.p.m("com.ss.android.ttvecamera.TEVendorCamera", i11, tECameraSettings2.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        if (jVar != null) {
            com.ss.android.ttvecamera.q.k(TAG, "createCameraInstance TEVendorCamera");
            return jVar;
        }
        if (z10) {
            TECameraSettings tECameraSettings4 = this.mCameraSettings;
            tECameraSettings4.f97076b = 2;
            return com.ss.android.ttvecamera.h.V0(2, tECameraSettings4.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
        }
        TECameraSettings tECameraSettings5 = this.mCameraSettings;
        tECameraSettings5.f97076b = 1;
        return com.ss.android.ttvecamera.c.T0(tECameraSettings5.f97074a, this.mCameraEvent, this.mHandler, this.mPictureSizeCallBack);
    }

    private Handler createHandler(boolean z10, String str) {
        if (z10) {
            try {
                HandlerThread handlerThread = this.mHandlerThread;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                HandlerThread handlerThread2 = new HandlerThread(str);
                handlerThread2.start();
                handlerThread2.getLooper().setMessageLogging(new m0());
                this.mHandlerThread = handlerThread2;
                return new Handler(handlerThread2.getLooper(), new b1(this));
            } catch (Exception e10) {
                com.ss.android.ttvecamera.q.e(TAG, "CreateHandler failed!: " + e10.toString());
            }
        }
        return new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    private Message createMessage(int i10, boolean z10, Handler handler) {
        Message messageObtainMessage;
        if (z10 && handler.hasMessages(i10)) {
            handler.removeMessages(i10);
            messageObtainMessage = new Message();
        } else {
            messageObtainMessage = handler.obtainMessage();
        }
        messageObtainMessage.what = i10;
        return messageObtainMessage;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0025, please report this as an issue */
    @androidx.annotation.w0(api = 21)
    private com.ss.android.ttvecamera.j createVendorCamera2Instance(@TECameraSettings.e int i10, Context context, com.ss.android.ttvecamera.j.a aVar, Handler handler, com.ss.android.ttvecamera.j.e eVar) {
        String str;
        String str2;
        if (i10 == 4) {
            str2 = "com.ss.android.ttvecamera.TEOpMediaCamera";
        } else if (i10 == 6) {
            str2 = "com.ss.android.ttvecamera.TEVoCamera";
        } else {
            if (i10 != 8 || Build.VERSION.SDK_INT < 28) {
                if (i10 == 9) {
                    str2 = "com.ss.android.ttvecamera.TEOpCamera";
                } else {
                    str = null;
                }
                if (str != null) {
                    return null;
                }
                com.ss.android.ttvecamera.h hVar = (com.ss.android.ttvecamera.h) com.ss.android.ttvecamera.p.m(str, i10, context, aVar, handler, eVar);
                com.ss.android.ttvecamera.q.k(TAG, "create, vendorCamera2 = " + hVar);
                return hVar;
            }
            str2 = "com.ss.android.ttvecamera.TEXmV2Camera";
        }
        str = str2;
        if (str != null) {
            return null;
        }
        com.ss.android.ttvecamera.h hVar2 = (com.ss.android.ttvecamera.h) com.ss.android.ttvecamera.p.m(str, i10, context, aVar, handler, eVar);
        com.ss.android.ttvecamera.q.k(TAG, "create, vendorCamera2 = " + hVar2);
        return hVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int decreaseClientCount() {
        this.sClientCount--;
        com.ss.android.ttvecamera.q.b(TAG, "sClientCount = " + this.sClientCount);
        if (this.sClientCount < 0) {
            com.ss.android.ttvecamera.q.u(TAG, "Invalid ClientCount = " + this.sClientCount);
            this.sClientCount = 0;
        }
        return this.sClientCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int destroy() {
        com.ss.android.ttvecamera.q.k(TAG, "destroy...start");
        this.mIsInitialized = false;
        this.mCheckCloseTask = null;
        this.mCameraClient = null;
        this.mPictureSizeCallback = null;
        this.mPreviewSizeCallback = null;
        this.mFpsConfigCallback = null;
        this.cachedClosePrivacyCert = null;
        this.cachedOpenPrivacyCert = null;
        this.mProviderSettings = null;
        if (this.mCameraInstance != null) {
            this.mCameraInstance.i();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new k());
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mHandlerThread = null;
            this.mHandlerDestroyed = true;
            this.mHandler = null;
        }
        this.mCameraObserver = com.ss.android.ttvecamera.k.c.a();
        com.ss.android.ttvecamera.q.k(TAG, "destroy...end");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePreviewingFallback() {
        boolean z10;
        if (this.mCameraSettings.f97076b == 1) {
            return;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.B0();
                    updateCameraState(4);
                    this.mCameraInstance.f(this.cachedOpenPrivacyCert);
                    this.mCameraInstance = null;
                    updateCameraState(0);
                }
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            this.mCameraSettings.f97076b = 1;
            this.mCameraEvent.e(51, 0, "need recreate surfacetexture", null);
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    private synchronized int increaseClientCount() {
        this.sClientCount++;
        com.ss.android.ttvecamera.q.b(TAG, "sClientCount = " + this.sClientCount);
        return this.sClientCount;
    }

    private synchronized void init(boolean z10) {
        com.ss.android.ttvecamera.q.k(TAG, "init...start");
        if (this.mIsInitialized) {
            return;
        }
        this.mHandler = createHandler(z10, TAG);
        this.mHandlerDestroyed = false;
        this.mProviderManager = new com.ss.android.ttvecamera.provider.c();
        this.mIsInitialized = true;
        this.mCurrentZoom = 0.0f;
        this.mOnBackGround = false;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mSystemResManager = new TESystemResManager();
        com.ss.android.ttvecamera.q.k(TAG, "init...end");
    }

    private boolean isARConfigNotEqual(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null) {
            return true;
        }
        if (tECameraSettings.B != 2) {
            return false;
        }
        TECameraSettings.ARConfig aRConfig = tECameraSettings2.f97123y0;
        return (aRConfig != null && aRConfig.f97125a.ordinal() == tECameraSettings.f97123y0.f97125a.ordinal() && this.mCameraSettings.f97123y0.f97126b.ordinal() == tECameraSettings.f97123y0.f97126b.ordinal() && this.mCameraSettings.f97123y0.f97127c.ordinal() == tECameraSettings.f97123y0.f97127c.ordinal() && this.mCameraSettings.f97123y0.f97128d.ordinal() == tECameraSettings.f97123y0.f97128d.ordinal() && this.mCameraSettings.f97123y0.f97129e.ordinal() == tECameraSettings.f97123y0.f97129e.ordinal() && this.mCameraSettings.f97123y0.f97130f.ordinal() == tECameraSettings.f97123y0.f97130f.ordinal()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCameraPermitted() {
        boolean z10 = true;
        try {
            if (androidx.core.content.d.a(this.mCameraSettings.f97074a, "android.permission.CAMERA") != 0) {
                z10 = false;
            }
        } catch (Exception e10) {
            com.ss.android.ttvecamera.q.e(TAG, "test camera permission failed!: " + e10.toString());
        }
        this.mOpenInfoMap.put("CamPerm" + this.mRetryCnt, String.valueOf(z10));
        return z10;
    }

    private boolean onlySwitchSession(TECameraSettings tECameraSettings) {
        int i10;
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 == null || tECameraSettings2.f97080d != 0 || tECameraSettings.f97080d != 0 || (i10 = tECameraSettings2.f97076b) != 11 || i10 != tECameraSettings.f97076b) {
            return false;
        }
        TEFrameSizei tEFrameSizei = tECameraSettings2.f97106q;
        int i11 = tEFrameSizei.f97206b;
        TEFrameSizei tEFrameSizei2 = tECameraSettings.f97106q;
        if (i11 != tEFrameSizei2.f97206b || tEFrameSizei.f97207c != tEFrameSizei2.f97207c || tECameraSettings2.N != tECameraSettings.N || tECameraSettings2.D != tECameraSettings.D || tECameraSettings2.f97114u != tECameraSettings.f97114u || tECameraSettings2.f97124z != tECameraSettings.f97124z || tECameraSettings2.U == tECameraSettings.U || tECameraSettings2.V == tECameraSettings.V) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(TECameraSettings.q.f97170g, tECameraSettings.U);
        bundle.putBoolean(TECameraSettings.q.f97172i, tECameraSettings.V);
        this.mCameraInstance.n0(bundle);
        this.mCameraSettings = tECameraSettings;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int open(@androidx.annotation.n0 com.ss.android.ttvecamera.k kVar, TECameraSettings tECameraSettings, Cert cert) {
        int iY;
        if (!assertClient(kVar)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            com.ss.android.ttvecamera.q.e(TAG, "pending close");
            return -105;
        }
        if (tECameraSettings.f97089h0 && this.mOnBackGround) {
            com.ss.android.ttvecamera.q.e(TAG, "in background");
            return -105;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            com.ss.android.ttvecamera.q.e(TAG, "open, mHandler is null!");
            return com.ss.android.ttvecamera.o.f97693p;
        }
        if (this.mIsCameraPendingClose) {
            com.ss.android.ttvecamera.q.e(TAG, "had called disConnect(), abandon open camera!");
            return com.ss.android.ttvecamera.o.f97695q;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == handler.getLooper()) {
            com.ss.android.ttvecamera.s.a("TECameraServer-open");
            this.mCameraSettings = tECameraSettings;
            com.ss.android.ttvecamera.q.k(TAG, "is force close camera=" + this.mCameraSettings.R + ", Camera2Detect=" + this.mCameraSettings.f97111s0);
            this.mCheckCloseTask = new g0();
            this.mCurrentZoom = 0.0f;
            if (this.mRetryCnt < 0) {
                this.mRetryCnt = tECameraSettings.f97116v;
            }
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 0) {
                    com.ss.android.ttvecamera.q.u(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
                    if (this.mCurrentCameraState != 1) {
                        this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                    }
                    com.ss.android.ttvecamera.s.b();
                    return 0;
                }
                updateCameraState(1);
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = createCameraInstance();
                    if (this.mCameraInstance == null) {
                        if (this.mCameraSettings.f97076b == 11) {
                            updateCameraState(0);
                            this.mCameraEvent.f(this.mCameraSettings.f97076b, com.ss.android.ttvecamera.o.f97708w0, null, null);
                        } else {
                            updateCameraState(0);
                            this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                        }
                        return -1;
                    }
                    this.mCameraInstance.t0(this.satZoomCallback);
                }
                this.mBeginTime = System.currentTimeMillis();
                if (this.mEnableVBoost) {
                    this.mSystemResManager.c(new TESystemResManager.a(TESystemResManager.ActionType.BOOST_CPU, this.mVBoostTimeoutMS));
                    iY = this.mCameraInstance.Y(this.mCameraSettings, cert);
                    this.mSystemResManager.c(new TESystemResManager.a(TESystemResManager.ActionType.RESTORE_CPU));
                } else {
                    iY = this.mCameraInstance.Y(this.mCameraSettings, cert);
                }
                if (iY != 0) {
                    com.ss.android.ttvecamera.q.u(TAG, "Open camera failed, ret = " + iY);
                }
                com.ss.android.ttvecamera.s.b();
            }
        } else {
            handler.post(new v(System.currentTimeMillis(), kVar, tECameraSettings, cert));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realCloseCamera(Cert cert) {
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 0) {
                com.ss.android.ttvecamera.q.u(TAG, "realCloseCamera, no need to close camera, state: " + this.mCurrentCameraState);
            } else {
                updateCameraState(4);
                if (this.mCameraInstance != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.mCameraInstance.f(cert);
                    com.ss.android.ttvecamera.q.k(TAG, "system call close() cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                }
                updateCameraState(0);
            }
            if (this.mCameraInstance != null) {
                this.mCameraInstance.i();
                this.mCameraInstance = null;
            }
        }
    }

    private void setAsyncCloseCheckMsg() {
        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
        this.mMainHandler.postDelayed(this.mCheckCloseTask, 2000L);
    }

    private boolean shouldReOpenCamera(TECameraSettings tECameraSettings) {
        TECameraSettings tECameraSettings2 = this.mCameraSettings;
        if (tECameraSettings2 != null) {
            if (tECameraSettings2.f97076b == tECameraSettings.f97076b) {
                TEFrameSizei tEFrameSizei = tECameraSettings2.f97106q;
                int i10 = tEFrameSizei.f97206b;
                TEFrameSizei tEFrameSizei2 = tECameraSettings.f97106q;
                if (i10 != tEFrameSizei2.f97206b || tEFrameSizei.f97207c != tEFrameSizei2.f97207c || tECameraSettings2.f97080d != tECameraSettings.f97080d || tECameraSettings2.N != tECameraSettings.N || tECameraSettings2.U != tECameraSettings.U || tECameraSettings2.D != tECameraSettings.D || tECameraSettings2.f97114u != tECameraSettings.f97114u || tECameraSettings2.f97124z != tECameraSettings.f97124z || tECameraSettings2.B != tECameraSettings.B || isARConfigNotEqual(tECameraSettings)) {
                }
            }
            return true;
        }
        return false;
    }

    public int abortSession(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            com.ss.android.ttvecamera.q.e(TAG, "abortSession, mHandler is null!");
            return com.ss.android.ttvecamera.o.f97693p;
        }
        handler.post(new z0());
        return 0;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            com.ss.android.ttvecamera.q.e(TAG, "addCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.b(tECameraAlgorithmParam);
        }
    }

    public int addCameraProvider(com.ss.android.ttvecamera.k kVar, com.ss.android.ttvecamera.provider.c.a aVar) {
        com.ss.android.ttvecamera.provider.c.a aVar2;
        if (!assertClient(kVar)) {
            return -108;
        }
        if (this.mHandlerDestroyed || Looper.myLooper() == this.mHandler.getLooper()) {
            com.ss.android.ttvecamera.q.k(TAG, "addCameraProvider");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                com.ss.android.ttvecamera.q.k(TAG, "addCameraProvider, mProviderSettings = " + this.mProviderSettings + ", providerSettings = " + aVar);
                if (this.mProviderSettings == null || this.mCameraInstance.L() == null || !((aVar2 = this.mProviderSettings) == null || aVar2.b(aVar))) {
                    this.mProviderManager.a(aVar, this.mCameraInstance);
                    this.mIsCameraProviderChanged = true;
                    com.ss.android.ttvecamera.provider.c.a aVar3 = this.mProviderSettings;
                    if (aVar3 == null) {
                        this.mProviderSettings = new com.ss.android.ttvecamera.provider.c.a(aVar);
                    } else {
                        aVar3.a(aVar);
                    }
                } else {
                    this.mIsCameraProviderChanged = false;
                }
            }
        } else {
            this.mHandler.post(new w0(kVar, aVar));
        }
        return 0;
    }

    public void appLifeCycleChanged(boolean z10) {
        this.mOnBackGround = z10;
    }

    public int cancelFocus(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new i(kVar));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "cancelFocus...");
        synchronized (this.mStateLock) {
            this.mCameraInstance.c();
        }
        return 0;
    }

    public int captureBurst(com.ss.android.ttvecamera.k kVar, TECameraSettings.f fVar, rg.a aVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        this.mHandler.post(new e(fVar, aVar));
        return 0;
    }

    public void changeCaptureFormat() {
    }

    public int changeRecorderState(com.ss.android.ttvecamera.k kVar, int i10, com.ss.android.ttvecamera.j.c cVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (!this.mHandlerDestroyed && Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new t0(kVar, i10, cVar));
            return 0;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance == null) {
                this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                return -100;
            }
            this.mCameraInstance.e(i10, cVar);
            return 0;
        }
    }

    public int connect(@androidx.annotation.n0 com.ss.android.ttvecamera.k kVar, @androidx.annotation.n0 com.ss.android.ttvecamera.k.b bVar, @androidx.annotation.n0 TECameraSettings tECameraSettings, com.ss.android.ttvecamera.k.d dVar, Cert cert) {
        com.ss.android.ttvecamera.q.k(TAG, "connect with client: " + kVar);
        if (kVar == null) {
            throw new IllegalArgumentException("client must not be null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("observer must not be null");
        }
        if (tECameraSettings == null) {
            throw new IllegalArgumentException("mParams must not be null");
        }
        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
        synchronized (this.mLock) {
            boolean zShouldReOpenCamera = shouldReOpenCamera(tECameraSettings);
            if (kVar == this.mCameraClient && !zShouldReOpenCamera) {
                com.ss.android.ttvecamera.q.u(TAG, "No need reconnect.");
                return 0;
            }
            if (!this.mIsInitialized) {
                init(true);
                zShouldReOpenCamera = false;
            }
            this.mCameraClient = kVar;
            this.mCameraObserver = bVar;
            this.mPictureSizeCallback = dVar;
            boolean z10 = tECameraSettings.S;
            this.mEnableVBoost = z10;
            this.mRetryCnt = -1;
            if (z10) {
                this.mVBoostTimeoutMS = tECameraSettings.T;
                this.mSystemResManager.b(new sg.b());
                this.mSystemResManager.a(tECameraSettings.f97074a);
            }
            increaseClientCount();
            if (zShouldReOpenCamera) {
                com.ss.android.ttvecamera.q.k(TAG, "reopen camera.");
                close(cert);
            }
            this.mIsCameraPendingClose = false;
            this.cachedOpenPrivacyCert = cert;
            return open(kVar, tECameraSettings, cert);
        }
    }

    public boolean couldForwardState(int i10) {
        if (i10 == this.mCurrentCameraState) {
            com.ss.android.ttvecamera.q.u(TAG, "No need this");
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    return this.mCurrentCameraState == 1;
                }
                com.ss.android.ttvecamera.q.e(TAG, "Invalidate camera state = " + i10);
                return false;
            }
            if (this.mCurrentCameraState != 0) {
                com.ss.android.ttvecamera.q.u(TAG, "No need open camera again, state = " + this.mCurrentCameraState);
            }
        }
        return true;
    }

    public int disConnect(com.ss.android.ttvecamera.k kVar, Cert cert) {
        return disConnect(kVar, true, cert);
    }

    public int disConnect(com.ss.android.ttvecamera.k kVar, boolean z10, Cert cert) {
        com.ss.android.ttvecamera.q.k(TAG, "disConnect with client: " + kVar);
        this.mIsCameraSwitchState = false;
        synchronized (this.mLock) {
            com.ss.android.ttvecamera.k kVar2 = this.mCameraClient;
            if (kVar2 != kVar || kVar2 == null) {
                return -100;
            }
            this.mCameraClient = null;
            this.mHandler.removeCallbacksAndMessages(null);
            this.cachedClosePrivacyCert = cert;
            close(z10, cert);
            if (!z10) {
                setAsyncCloseCheckMsg();
            } else if (decreaseClientCount() == 0) {
                return destroy();
            }
            return 0;
        }
    }

    public void downExposureCompensation(com.ss.android.ttvecamera.k kVar) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new y(kVar));
                return;
            }
            com.ss.android.ttvecamera.q.k(TAG, "downExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    TECameraSettings.h hVarS = this.mCameraInstance.s();
                    if (hVarS == null) {
                        this.mCameraObserver.onError(com.ss.android.ttvecamera.o.f97693p, "downExposureCompensation get ec info failed");
                        return;
                    } else {
                        this.mCameraInstance.m0(hVarS.f97132b - 1);
                        return;
                    }
                }
                this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
            }
        }
    }

    public int enableCaf(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new j(kVar));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "enableCaf...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.j();
            }
        }
        return 0;
    }

    public int enableMulticamZoom(com.ss.android.ttvecamera.k kVar, boolean z10) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new u0(kVar, z10));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "enableMulticamZoom: " + z10);
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.k(z10);
            }
        }
        return 0;
    }

    public int focusAtPoint(com.ss.android.ttvecamera.k kVar, TEFocusSettings tEFocusSettings) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new h(kVar, tEFocusSettings));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "focusAtPoint at: " + tEFocusSettings);
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3) {
                this.mCameraInstance.m(tEFocusSettings);
                return 0;
            }
            String str = "Can not set focus on state : " + this.mCurrentCameraState;
            com.ss.android.ttvecamera.q.u(TAG, str);
            this.mCameraObserver.onError(-105, str);
            return -105;
        }
    }

    public float[] getApertureRange(com.ss.android.ttvecamera.k kVar, TECameraSettings.a aVar) {
        float[] fArrO = {0.0f};
        if (!assertClient(kVar)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new i0(kVar, aVar));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    fArrO = this.mCameraInstance.o();
                }
            }
        }
        return fArrO;
    }

    public TEFrameSizei getBestPreviewSize(com.ss.android.ttvecamera.k kVar, float f10, TEFrameSizei tEFrameSizei) {
        if (!assertClient(kVar) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1) {
            return null;
        }
        return this.mCameraInstance.p(f10, tEFrameSizei);
    }

    public JSONObject getCameraCapbilitiesForBytebench(com.ss.android.ttvecamera.k kVar, TECameraSettings.b bVar) {
        JSONObject jSONObject = new JSONObject();
        if (!assertClient(kVar)) {
            return null;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new v0(kVar, bVar));
        } else {
            com.ss.android.ttvecamera.q.k(TAG, "getCameraCapbilitiesForBytebench");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    jSONObject = this.mCameraInstance.q();
                }
            }
        }
        return jSONObject;
    }

    public int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.r();
    }

    public TECameraSettings.h getCameraECInfo(com.ss.android.ttvecamera.k kVar) {
        if (assertClient(kVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.s();
        }
        return null;
    }

    public int getCameraState() {
        return getCameraState(false);
    }

    public int getCameraState(boolean z10) {
        int i10;
        if (!z10) {
            return this.mCurrentCameraState;
        }
        synchronized (this.mStateLock) {
            i10 = this.mCurrentCameraState;
        }
        return i10;
    }

    public int getExposureCompensation(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            throw new RuntimeException("Client is not connected!!!");
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                return this.mCameraInstance.x();
            }
            this.mCameraObserver.onError(-105, "Can not get ec on state : " + this.mCurrentCameraState);
            return -105;
        }
    }

    public float[] getFOV(com.ss.android.ttvecamera.k kVar, TECameraSettings.i iVar) {
        float[] fArrY = new float[2];
        if (!assertClient(kVar)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new d(kVar, iVar));
        } else {
            com.ss.android.ttvecamera.q.k(TAG, "getFOV");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    this.mCameraObserver.onError(-105, "Can not getFOV on state : " + this.mCurrentCameraState);
                    return new float[]{-2.0f, -2.0f};
                }
                fArrY = this.mCameraInstance.y();
            }
        }
        return fArrY;
    }

    public int getFlashMode(com.ss.android.ttvecamera.k kVar) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.C();
    }

    public int getISO(com.ss.android.ttvecamera.k kVar, TECameraSettings.m mVar) {
        int iG = -1;
        if (!assertClient(kVar)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new e0(kVar, mVar));
        } else {
            synchronized (this.mStateLock) {
                iG = this.mCameraInstance != null ? this.mCameraInstance.G() : -1;
            }
        }
        return iG;
    }

    public int[] getISORange(com.ss.android.ttvecamera.k kVar, TECameraSettings.n nVar) {
        int[] iArrH = new int[2];
        if (!assertClient(kVar)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new c0(kVar, nVar));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    iArrH = this.mCameraInstance.H();
                }
            }
        }
        return iArrH;
    }

    public float getManualFocusAbility(com.ss.android.ttvecamera.k kVar, TECameraSettings.o oVar) {
        float fI = -1.0f;
        if (!assertClient(kVar)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new l(kVar, oVar));
        } else {
            synchronized (this.mStateLock) {
                fI = this.mCameraInstance != null ? this.mCameraInstance.I() : -1.0f;
            }
        }
        return fI;
    }

    public int[] getPictureSize(com.ss.android.ttvecamera.k kVar) {
        if (assertClient(kVar) && this.mCameraInstance != null) {
            return this.mCameraInstance.J();
        }
        return null;
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.K();
    }

    public long[] getShutterTimeRange(com.ss.android.ttvecamera.k kVar, TECameraSettings.u uVar) {
        long[] jArrN = new long[2];
        if (!assertClient(kVar)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new f0(kVar, uVar));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    jArrN = this.mCameraInstance.N();
                }
            }
        }
        return jArrN;
    }

    public List<TEFrameSizei> getSupportedPictureSizes(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.O();
        } catch (Exception e10) {
            com.ss.android.ttvecamera.q.v(TAG, "getSupportedPictureSizes, exception occured.", e10);
            return null;
        }
    }

    public List<TEFrameSizei> getSupportedPreviewSizes(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.P();
        } catch (Exception e10) {
            com.ss.android.ttvecamera.q.v(TAG, "getSupportedPreviewSizes, exception occured.", e10);
            return null;
        }
    }

    public boolean isAutoExposureLockSupported(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                return this.mCameraInstance.R();
            }
            com.ss.android.ttvecamera.q.u(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
            return false;
        }
    }

    public boolean isAutoFocusLockSupported(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                return this.mCameraInstance.S();
            }
            com.ss.android.ttvecamera.q.u(TAG, "Can not get ae lock supported on state : " + this.mCurrentCameraState);
            return false;
        }
    }

    public boolean isCameraSwitchState() {
        return this.mIsCameraSwitchState;
    }

    public boolean isSupportWhileBalance(com.ss.android.ttvecamera.k kVar) {
        boolean z10 = false;
        if (!assertClient(kVar)) {
            return false;
        }
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null && this.mCameraInstance.U()) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean isSupportedExposureCompensation(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return false;
        }
        if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
            return this.mCameraInstance.V();
        }
        com.ss.android.ttvecamera.q.u(TAG, "Can not set ec on state : " + this.mCurrentCameraState);
        return false;
    }

    public boolean isTorchSupported(com.ss.android.ttvecamera.k kVar) {
        com.ss.android.ttvecamera.j jVar;
        return assertClient(kVar) && (jVar = this.mCameraInstance) != null && jVar.W();
    }

    public void notifyHostForegroundVisible(com.ss.android.ttvecamera.k kVar, boolean z10) {
        if (assertClient(kVar)) {
            this.mIsForegroundVisible = z10;
            com.ss.android.ttvecamera.q.k(TAG, "is foreground visible: " + z10);
        }
    }

    public int process(com.ss.android.ttvecamera.k kVar, TECameraSettings.p pVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new u(kVar, pVar));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.Z(pVar);
            }
        }
        return 0;
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.a0(tECameraFrame);
        }
        com.ss.android.ttvecamera.q.e(TAG, "processAlgorithm failed mCameraInstance is null!");
        return null;
    }

    public void queryFeatures(String str, Bundle bundle) {
        if (this.mCameraInstance == null) {
            com.ss.android.ttvecamera.q.e(TAG, "queryFeatures: camera instance null");
            return;
        }
        Bundle bundleA = this.mCameraInstance.A(str);
        if (bundleA == null) {
            com.ss.android.ttvecamera.q.e(TAG, "queryFeatures: getFeatures is null");
            return;
        }
        for (String str2 : bundle.keySet()) {
            if (bundleA.containsKey(str2)) {
                Class clsA = TECameraSettings.k.a(str2);
                if (clsA == Boolean.class) {
                    bundle.putBoolean(str2, bundleA.getBoolean(str2));
                } else if (clsA == Integer.class) {
                    bundle.putInt(str2, bundleA.getInt(str2));
                } else if (clsA == Long.class) {
                    bundle.putLong(str2, bundleA.getLong(str2));
                } else if (clsA == Float.class) {
                    bundle.putFloat(str2, bundleA.getFloat(str2));
                } else if (clsA == Double.class) {
                    bundle.putDouble(str2, bundleA.getDouble(str2));
                } else if (clsA == String.class) {
                    bundle.putString(str2, bundleA.getString(str2));
                } else if (clsA == ArrayList.class) {
                    bundle.putParcelableArrayList(str2, bundleA.getParcelableArrayList(str2));
                } else if (clsA == TEFrameSizei.class) {
                    bundle.putParcelable(str2, bundleA.getParcelable(str2));
                } else if (clsA == TEFocusParameters.class) {
                    bundle.putParcelable(str2, bundleA.getParcelable(str2));
                } else {
                    com.ss.android.ttvecamera.q.u(TAG, "Not supported key:" + str2);
                }
            }
        }
    }

    public float queryShaderZoomStep(com.ss.android.ttvecamera.k kVar, TECameraSettings.t tVar) {
        if (!assertClient(kVar)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new q(kVar, tVar));
            return 0.0f;
        }
        com.ss.android.ttvecamera.q.k(TAG, "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.b0(tVar);
            }
        }
        return 0.0f;
    }

    public int queryZoomAbility(com.ss.android.ttvecamera.k kVar, TECameraSettings.w wVar, boolean z10) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new p(kVar, wVar, z10));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "queryZoomAbility...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.c0(wVar, z10);
            }
        }
        return 0;
    }

    public void registerFpsConfigListener(com.ss.android.ttvecamera.k.a aVar) {
        this.mFpsConfigCallback = aVar;
    }

    public void registerPreviewSizeListener(com.ss.android.ttvecamera.k.e eVar) {
        this.mPreviewSizeCallback = eVar;
    }

    public void removeCameraAlgorithm(int i10) {
        if (this.mCameraInstance == null) {
            com.ss.android.ttvecamera.q.e(TAG, "removeCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.f0(i10);
        }
    }

    public int removeCameraProvider(com.ss.android.ttvecamera.k kVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new x0(kVar));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "removeCameraProvider");
        synchronized (this.mStateLock) {
            this.mProviderManager.m();
        }
        return 0;
    }

    public void setAperture(com.ss.android.ttvecamera.k kVar, float f10) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new j0(kVar, f10));
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.i0(f10);
                }
            }
        }
    }

    public void setAutoExposureLock(com.ss.android.ttvecamera.k kVar, boolean z10) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new z(kVar, z10));
                return;
            }
            com.ss.android.ttvecamera.q.k(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.j0(z10);
                    return;
                }
                this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
            }
        }
    }

    public void setAutoFocusLock(com.ss.android.ttvecamera.k kVar, boolean z10) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new a0(kVar, z10));
                return;
            }
            com.ss.android.ttvecamera.q.b(TAG, "setAutoExposureLock...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    this.mCameraInstance.k0(z10);
                    return;
                }
                this.mCameraObserver.onError(-105, "Can not set auto exposure lock on state : " + this.mCurrentCameraState);
            }
        }
    }

    public void setDeviceRotation(int i10) {
        if (this.mCameraInstance != null) {
            this.mCameraInstance.l0(i10);
        }
    }

    public void setExposureCompensation(com.ss.android.ttvecamera.k kVar, int i10) {
        Handler handler;
        if (!assertClient(kVar) || (handler = this.mHandler) == null) {
            com.ss.android.ttvecamera.q.e(TAG, "setExposureCompensation failed");
        } else {
            handler.post(new w(i10));
        }
    }

    public int setFeatureParameters(com.ss.android.ttvecamera.k kVar, Bundle bundle) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new t(kVar, bundle));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "setFeatureParameters...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.n0(bundle);
            }
        }
        return 0;
    }

    public void setISO(com.ss.android.ttvecamera.k kVar, int i10) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new d0(kVar, i10));
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.o0(i10);
                }
            }
        }
    }

    public void setManualFocusDistance(com.ss.android.ttvecamera.k kVar, float f10) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new m(kVar, f10));
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.p0(f10);
                }
            }
        }
    }

    public void setPictureSize(com.ss.android.ttvecamera.k kVar, int i10, int i11) {
        if (assertClient(kVar)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new n(i10, i11));
                return;
            }
            return;
        }
        com.ss.android.ttvecamera.q.u(TAG, "set picture size failed, w: " + i10 + ", h: " + i11);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings == null || this.mCameraInstance == null) {
            return;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        tECameraSettings.f97078c = tEFrameRateRange;
        tECameraSettings.O = 1;
        if (tECameraSettings.B == 1) {
            tECameraSettings.O = 4;
            tECameraSettings.Z = false;
        }
        this.mCameraInstance.r0();
    }

    public void setSATZoomCallback(TECameraSettings.s sVar) {
        this.mSATZoomCallback = sVar;
    }

    public void setSceneMode(com.ss.android.ttvecamera.k kVar, int i10) {
        if (assertClient(kVar)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.post(new o(i10));
                return;
            }
            return;
        }
        com.ss.android.ttvecamera.q.u(TAG, "set scnen failed: " + i10);
    }

    public void setShutterTime(com.ss.android.ttvecamera.k kVar, long j10) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new h0(kVar, j10));
                return;
            }
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.v0(j10);
                }
            }
        }
    }

    public void setWhileBalance(com.ss.android.ttvecamera.k kVar, boolean z10, String str) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new b0(kVar, z10, str));
                return;
            }
            synchronized (this.mStateLock) {
                com.ss.android.ttvecamera.q.k(TAG, "setWhileBalance...");
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.w0(z10, str);
                }
            }
        }
    }

    public int start(com.ss.android.ttvecamera.k kVar) {
        com.ss.android.ttvecamera.q.k(TAG, "start: client " + kVar);
        if (!assertClient(kVar)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null || tECameraSettings.f97074a == null) {
            com.ss.android.ttvecamera.q.e(TAG, "mCameraSettings has some error");
            return -100;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            com.ss.android.ttvecamera.q.e(TAG, "start, mHandler is null!");
            return com.ss.android.ttvecamera.o.f97693p;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            handler.post(new y0(kVar));
            if (this.mCameraSettings.f97094k) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mCameraClientCondition.close();
                this.mCameraClientCondition.block(2000L);
                com.ss.android.ttvecamera.q.k(TAG, "Camera start cost: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            }
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3) {
                    com.ss.android.ttvecamera.q.u(TAG, "start, no need to start capture, state: " + this.mCurrentCameraState);
                    if (!this.mIsCameraProviderChanged && !this.mStartPreviewError) {
                        return 0;
                    }
                    this.mCameraInstance.B0();
                    updateCameraState(2);
                    this.mIsCameraProviderChanged = false;
                }
                if (this.mCurrentCameraState != 2) {
                    this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                    return -105;
                }
                this.mCameraObserver.onInfo(3, this.mCurrentCameraState, "Camera state: opened");
                this.mCameraInstance.x0();
                updateCameraState(3);
                com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97639c, this.mCameraInstance.v());
                com.ss.android.ttvecamera.n.d(com.ss.android.ttvecamera.n.f97643g, this.mCameraSettings.f97106q.f97206b + androidx.webkit.b.f28327e + this.mCameraSettings.f97106q.f97207c);
                com.ss.android.ttvecamera.n.a(com.ss.android.ttvecamera.n.f97641e, (double) this.mCameraSettings.f97078c.f97204c);
                com.ss.android.ttvecamera.n.b(com.ss.android.ttvecamera.n.f97638b, (long) this.mCameraSettings.f97080d);
            }
        }
        return 0;
    }

    public int startRecording() {
        return this.mCameraInstance.y0();
    }

    public int startZoom(com.ss.android.ttvecamera.k kVar, float f10, TECameraSettings.w wVar) {
        if (!assertClient(kVar)) {
            com.ss.android.ttvecamera.q.e(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        com.ss.android.ttvecamera.j jVar = this.mCameraInstance;
        if (jVar == null) {
            com.ss.android.ttvecamera.q.e(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            com.ss.android.ttvecamera.q.u(TAG, "camera is null, no need to start zoom");
            return -105;
        }
        float fAbs = Math.abs(f10 - this.mCurrentZoom);
        if (Math.abs(f10 - jVar.f97564m) < 0.1f) {
            f10 = jVar.f97564m;
        } else if (Math.abs(f10) < 0.1f) {
            f10 = 0.0f;
        } else if (fAbs < 0.1f) {
            return 0;
        }
        this.mCurrentZoom = f10;
        Message messageCreateMessage = createMessage(1, true, this.mHandler);
        messageCreateMessage.arg1 = (int) (f10 * 100.0f);
        messageCreateMessage.obj = wVar;
        this.mHandler.sendMessage(messageCreateMessage);
        return 0;
    }

    public int stop(com.ss.android.ttvecamera.k kVar) {
        return stop(kVar, false);
    }

    public int stop(com.ss.android.ttvecamera.k kVar, boolean z10) {
        com.ss.android.ttvecamera.q.k(TAG, "stop: client " + kVar);
        if (!assertClient(kVar)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            com.ss.android.ttvecamera.q.e(TAG, "stop, mHandler is null!");
            return com.ss.android.ttvecamera.o.f97693p;
        }
        if (Looper.myLooper() != handler.getLooper()) {
            if (z10) {
                this.mCameraClientCondition.close();
            }
            handler.post(new a1(kVar, z10));
            if (z10 && (!this.mCameraClientCondition.block(1500L))) {
                com.ss.android.ttvecamera.q.e(TAG, "Camera stop timeout!");
            }
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 2) {
                    com.ss.android.ttvecamera.q.u(TAG, "stop, no need to stop capture, state: " + this.mCurrentCameraState);
                    return 0;
                }
                if (this.mCurrentCameraState != 3) {
                    this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 2");
                    return -105;
                }
                updateCameraState(2);
                this.mCameraInstance.B0();
            }
        }
        return 0;
    }

    public int stopRecording() {
        return this.mCameraInstance.C0();
    }

    public int stopZoom(com.ss.android.ttvecamera.k kVar, TECameraSettings.w wVar) {
        if (!assertClient(kVar)) {
            com.ss.android.ttvecamera.q.e(TAG, "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new r(kVar, wVar));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "stopZoom...");
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.E0(wVar);
            }
        }
        return 0;
    }

    public int switchCamera(com.ss.android.ttvecamera.k kVar, int i10, Cert cert) {
        com.ss.android.ttvecamera.q.k(TAG, "switchCamera: " + i10);
        if (!assertClient(kVar)) {
            return -108;
        }
        TECameraSettings tECameraSettings = this.mCameraSettings;
        if (tECameraSettings == null) {
            com.ss.android.ttvecamera.q.e(TAG, "switchCamera failed: " + i10);
            return -108;
        }
        if (tECameraSettings.f97080d == i10) {
            return com.ss.android.ttvecamera.o.f97698r0;
        }
        this.mIsCameraSwitchState = true;
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new b(kVar, i10, cert));
        } else {
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 1) {
                    this.mIsCameraSwitchState = false;
                    this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                    return -105;
                }
                this.mCameraSettings.f97080d = i10;
                this.mCurrentZoom = 0.0f;
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = createCameraInstance();
                    if (this.mCameraInstance == null) {
                        this.mCurrentCameraState = 0;
                        int i11 = this.mCameraSettings.f97076b;
                        if (i11 == 11) {
                            this.mCameraEvent.f(i11, com.ss.android.ttvecamera.o.f97708w0, null, null);
                        } else {
                            this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                        }
                        this.mIsCameraSwitchState = false;
                        return -1;
                    }
                }
                if (this.mCurrentCameraState != 0) {
                    updateCameraState(4);
                    this.mCameraInstance.f(cert);
                    updateCameraState(0);
                }
                updateCameraState(1);
                this.mIsCameraSwitchState = false;
                if (this.mRetryCnt < 0) {
                    this.mRetryCnt = this.mCameraSettings.f97116v;
                }
                this.mBeginTime = System.currentTimeMillis();
                int iY = this.mCameraInstance.Y(this.mCameraSettings, cert);
                if (iY != 0) {
                    this.mCameraObserver.onError(iY, "Switch camera failed @" + this.mCameraSettings.f97076b + ",face:" + this.mCameraSettings.f97080d + " " + this.mCameraSettings.f97106q.toString());
                }
            }
        }
        return 0;
    }

    public int switchCamera(com.ss.android.ttvecamera.k kVar, TECameraSettings tECameraSettings, Cert cert) {
        com.ss.android.ttvecamera.q.k(TAG, "switchCamera: " + tECameraSettings);
        if (!assertClient(kVar)) {
            return -108;
        }
        if (!shouldReOpenCamera(tECameraSettings)) {
            return com.ss.android.ttvecamera.o.f97698r0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new c(kVar, tECameraSettings, cert));
        } else {
            synchronized (this.mStateLock) {
                if (onlySwitchSession(tECameraSettings)) {
                    return 0;
                }
                boolean z10 = this.mCameraSettings.B != tECameraSettings.B;
                if (this.mCurrentCameraState == 1 && !z10) {
                    this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request...");
                    com.ss.android.ttvecamera.q.k(TAG, "Camera is opening, ignore this switch request...");
                    return -105;
                }
                TECameraSettings tECameraSettings2 = this.mCameraSettings;
                if (tECameraSettings2.f97076b == tECameraSettings.f97076b && tECameraSettings2.B == tECameraSettings.B) {
                    if (this.mCameraInstance == null) {
                        com.ss.android.ttvecamera.q.k(TAG, "switch camera, create instance...");
                        this.mCameraInstance = createCameraInstance();
                        if (this.mCameraInstance == null) {
                            this.mCurrentCameraState = 0;
                            int i10 = this.mCameraSettings.f97076b;
                            if (i10 == 11) {
                                this.mCameraEvent.f(i10, com.ss.android.ttvecamera.o.f97708w0, null, null);
                            } else {
                                this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            }
                            return -1;
                        }
                        this.mCameraInstance.t0(this.satZoomCallback);
                    }
                    if (this.mCurrentCameraState != 0) {
                        updateCameraState(4);
                        this.mCameraInstance.f(cert);
                        updateCameraState(0);
                    }
                    this.mCameraSettings = tECameraSettings;
                    this.mCurrentZoom = 0.0f;
                    updateCameraState(1);
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = this.mCameraSettings.f97116v;
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    com.ss.android.ttvecamera.q.b(TAG, "switch mode = " + this.mCameraSettings.B);
                    int iY = this.mCameraInstance.Y(this.mCameraSettings, cert);
                    if (iY != 0) {
                        this.mCameraObserver.onError(iY, "Switch camera failed @" + this.mCameraSettings.f97076b + ",face:" + this.mCameraSettings.f97080d + " " + this.mCameraSettings.f97106q.toString());
                    }
                    return 0;
                }
                close(cert);
                open(kVar, tECameraSettings, cert);
            }
        }
        return 0;
    }

    public int switchCameraMode(com.ss.android.ttvecamera.k kVar, int i10) {
        if (!assertClient(kVar)) {
            return -108;
        }
        TECameraSettings tECameraSettings = kVar.f97588a;
        if (tECameraSettings.f97076b == 1) {
            return -100;
        }
        if (i10 != 1 && i10 != 0 && i10 != 2) {
            return -100;
        }
        if (tECameraSettings.B == i10) {
            return 0;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new r0(kVar, i10));
        } else {
            com.ss.android.ttvecamera.q.k(TAG, "switchCameraMode");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState != 3) {
                    this.mCameraObserver.onError(-105, "Invalidate state: " + this.mCurrentCameraState + " ==> 3");
                    return -105;
                }
                this.mCameraInstance.F0(i10);
            }
        }
        return 0;
    }

    public int switchFlashMode(com.ss.android.ttvecamera.k kVar, @TECameraSettings.l int i10) {
        if (!assertClient(kVar)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new l0(kVar, i10));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "switchFlashMode: " + i10);
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.G0(i10);
                this.mCameraEvent.e(116, i10, "", this.mCameraInstance);
            }
        }
        return 0;
    }

    public int takePicture(com.ss.android.ttvecamera.k kVar, int i10, int i11, TECameraSettings.r rVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        this.mHandler.post(new f(rVar, i10, i11));
        return 0;
    }

    public int takePicture(com.ss.android.ttvecamera.k kVar, TECameraSettings.r rVar) {
        if (!assertClient(kVar)) {
            return -108;
        }
        this.mHandler.post(new g(rVar));
        return 0;
    }

    public int toggleTorch(com.ss.android.ttvecamera.k kVar, boolean z10) {
        if (!assertClient(kVar)) {
            com.ss.android.ttvecamera.q.e(TAG, "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new k0(kVar, z10));
            return 0;
        }
        com.ss.android.ttvecamera.q.k(TAG, "toggleTorch: " + z10);
        synchronized (this.mStateLock) {
            if (this.mCameraInstance != null) {
                this.mCameraInstance.J0(z10);
            }
        }
        return 0;
    }

    public void upExposureCompensation(com.ss.android.ttvecamera.k kVar) {
        if (assertClient(kVar)) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                this.mHandler.post(new x(kVar));
                return;
            }
            com.ss.android.ttvecamera.q.k(TAG, "upExposureCompensation...");
            synchronized (this.mStateLock) {
                if (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) {
                    TECameraSettings.h hVarS = this.mCameraInstance.s();
                    if (hVarS == null) {
                        this.mCameraObserver.onError(com.ss.android.ttvecamera.o.f97693p, "upExposureCompensation get ec info failed");
                        return;
                    } else {
                        this.mCameraInstance.m0(hVarS.f97132b + 1);
                        return;
                    }
                }
                this.mCameraObserver.onError(-105, "Can not set ec on state : " + this.mCurrentCameraState);
            }
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            com.ss.android.ttvecamera.q.e(TAG, "updateCameraAlgorithmParam failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.K0(tECameraAlgorithmParam);
        }
    }

    public void updateCameraState(int i10) {
        if (this.mCurrentCameraState == i10) {
            com.ss.android.ttvecamera.q.u(TAG, "No need update state: " + i10);
            return;
        }
        com.ss.android.ttvecamera.q.k(TAG, "[updateCameraState]: " + this.mCurrentCameraState + " -> " + i10);
        this.mCurrentCameraState = i10;
    }

    public int zoomV2(com.ss.android.ttvecamera.k kVar, float f10, TECameraSettings.w wVar) {
        if (!assertClient(kVar)) {
            com.ss.android.ttvecamera.q.e(TAG, "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            this.mHandler.post(new s(kVar, f10, wVar));
        } else {
            com.ss.android.ttvecamera.q.k(TAG, "zoomV2...");
            synchronized (this.mStateLock) {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.M0(f10, wVar);
                }
                if (this.mFirstZoom) {
                    this.mCameraEvent.e(114, 0, "zoomV2", this.mCameraInstance);
                    this.mFirstZoom = false;
                }
            }
        }
        return 0;
    }
}
