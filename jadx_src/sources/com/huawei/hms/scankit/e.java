package com.huawei.hms.scankit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.e5;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.r3;
import com.huawei.hms.scankit.p.r6;
import com.huawei.hms.scankit.p.w3;
import com.huawei.hms.scankit.p.w7;
import com.huawei.hms.scankit.util.OpencvJNI;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlinx.coroutines.s0;

/* JADX INFO: compiled from: IRemoteCustomedViewDelegateImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class e extends IRemoteViewDelegate.Stub implements e5, SensorEventListener {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f61460y = e.class.getSimpleName();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static boolean f61461z = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f61463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f61464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ProviderRemoteView f61465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextureView f61466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected com.huawei.hms.scankit.b f61467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected IOnResultCallback f61468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected SensorManager f61469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View.OnClickListener f61470i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected Boolean f61473l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected AlertDialog f61474m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Rect f61475n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IObjectWrapper f61476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f61477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private OrientationEventListener f61478q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f61479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f61480s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected IOnLightCallback f61483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected LinearLayout f61484w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile w3 f61462a = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f61471j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Float f61472k = Float.valueOf(40.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f61481t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Point f61482u = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f61485x = false;

    /* JADX INFO: compiled from: IRemoteCustomedViewDelegateImpl.java */
    public class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            e.this.f61467f.b(motionEvent);
            return true;
        }
    }

    /* JADX INFO: compiled from: IRemoteCustomedViewDelegateImpl.java */
    public class b extends OrientationEventListener {
        b(Context context) {
            super(context);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = ((Activity) e.this.f61464c).getWindowManager().getDefaultDisplay().getRotation();
            boolean zB = w7.b();
            boolean zE = w7.e();
            if (w7.e(e.this.f61464c) && !zB) {
                e.this.a(90);
                return;
            }
            if (w7.b((Activity) e.this.f61464c) && !zE) {
                e.this.a(90);
                return;
            }
            if (rotation == 0) {
                e.this.a(90);
                return;
            }
            if (rotation == 1) {
                e.this.a(0);
            } else if (rotation == 2) {
                e.this.a(270);
            } else {
                if (rotation != 3) {
                    return;
                }
                e.this.a(180);
            }
        }
    }

    /* JADX INFO: compiled from: IRemoteCustomedViewDelegateImpl.java */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.f61474m.dismiss();
        }
    }

    public e(Context context, int i10, Object obj, IObjectWrapper iObjectWrapper, boolean z10, boolean z11, boolean z12) {
        this.f61463b = 0;
        this.f61477p = false;
        this.f61464c = context;
        this.f61463b = i10;
        this.f61476o = iObjectWrapper;
        if (obj instanceof Rect) {
            this.f61475n = (Rect) obj;
        } else {
            this.f61475n = null;
        }
        this.f61477p = z10;
        this.f61479r = z11;
        this.f61480s = z12;
    }

    private static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (w7.f(context) || w7.e(context)) {
            Log.i(f61460y, "initSurfaceView: is in MultiWindowMode");
            defaultDisplay.getSize(point);
        } else {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.huawei.hms.scankit.b bVar = this.f61467f;
        if (bVar == null || bVar.a() == null) {
            return;
        }
        try {
            Point pointA = a(this.f61464c);
            if (i10 != this.f61467f.a().d()) {
                this.f61467f.a().b(i10);
            }
            if (this.f61467f.a().i()) {
                Point point = this.f61482u;
                if (point == null || point.x != pointA.x) {
                    a(pointA, false);
                }
            }
        } catch (NullPointerException unused) {
            o4.e(f61460y, "adjustCameraOrientation: nullpoint");
        } catch (Exception unused2) {
            o4.e(f61460y, "adjustCameraOrientation: Exception");
        }
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        int iB;
        if (iObjectWrapper == null) {
            o4.b("ScankitRemoteS", "bitmap is null");
            return new HmsScan[0];
        }
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            iB = 0;
        } else {
            iB = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            int i10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i10;
            z10 = i10 >= 2;
            if (z10) {
                iB = w7.b(iB);
            }
        }
        HmsScan[] hmsScanArrB = r6.a().b((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), iB, true, this.f61462a);
        if (!z10) {
            hmsScanArrB = w7.a(hmsScanArrB);
        }
        if (hmsScanArrB.length == 0) {
            h();
        } else {
            HmsScan hmsScan = hmsScanArrB[0];
            if (hmsScan != null && TextUtils.isEmpty(hmsScan.originalValue)) {
                h();
            }
        }
        return hmsScanArrB;
    }

    protected void a(Point point, boolean z10) {
        try {
            if (this.f61464c.getSystemService("window") != null) {
                if (point == null) {
                    point = a(this.f61464c);
                }
                this.f61482u = point;
                b(point, z10);
            }
        } catch (NullPointerException unused) {
            o4.e(f61460y, "initSurfaceView: nullpoint");
        } catch (Exception unused2) {
            o4.e(f61460y, "initSurfaceView: Exception");
        }
    }

    @Override // com.huawei.hms.scankit.p.e5
    public boolean a() {
        return this.f61485x;
    }

    @Override // com.huawei.hms.scankit.p.e5
    public boolean a(HmsScan[] hmsScanArr) {
        AlertDialog alertDialog;
        if (hmsScanArr == null || hmsScanArr.length <= 0 || (alertDialog = this.f61474m) == null || !alertDialog.isShowing()) {
            return false;
        }
        this.f61474m.dismiss();
        return false;
    }

    protected void b(Point point, boolean z10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f61466e.getLayoutParams();
        float f10 = point.x;
        float f11 = point.y;
        boolean zB = w7.b();
        o4.d(f61460y, "initSurfaceViewSize: isPortraitScreen: " + w7.c((Activity) this.f61464c) + " inMultiWindow: " + w7.f(this.f61464c) + " isInMultiWindowFreeform: " + w7.b((Activity) this.f61464c) + " isPadOrFold: " + w7.j(this.f61464c) + " isFoldStateExpand: " + w7.h(this.f61464c) + " isPad: " + w7.i(this.f61464c) + " inMagicWindow: " + w7.e(this.f61464c) + " ignore: " + zB + " screen: " + point.toString() + " width: " + layoutParams.width + " height: " + layoutParams.height + " inMagicWindow " + w7.e(this.f61464c) + " ignore " + zB + " isInit " + z10 + " isSpecialExpectSize " + this.f61467f.b());
        if (w7.c((Activity) this.f61464c) || (w7.e(this.f61464c) && !(w7.e(this.f61464c) && zB))) {
            f61461z = false;
            int i10 = 1080;
            int i11 = 1920;
            int i12 = 1280;
            if ("ceres-c3".equals(Build.DEVICE)) {
                i10 = 1280;
                i11 = 1280;
            }
            if (z10 && (w7.f(this.f61464c) || w7.b((Activity) this.f61464c) || w7.e(this.f61464c))) {
                i10 = 1280;
                i11 = 1280;
            }
            if (this.f61467f.b()) {
                i11 = 1280;
            } else {
                i12 = i10;
            }
            float f12 = i12;
            float f13 = f10 / f12;
            float f14 = i11;
            float f15 = f11 / f14;
            if (f13 > f15) {
                layoutParams.width = -1;
                layoutParams.height = (int) (f14 * f13);
                layoutParams.gravity = 17;
            } else {
                layoutParams.height = -1;
                layoutParams.width = (int) (f12 * f15);
                layoutParams.gravity = 17;
            }
        } else {
            f61461z = true;
            float f16 = 1920.0f;
            float f17 = 1080.0f;
            float f18 = 1280.0f;
            if (z10 && (w7.f(this.f61464c) || w7.b((Activity) this.f61464c) || w7.e(this.f61464c))) {
                f16 = 1280.0f;
                f17 = 1280.0f;
            }
            if (this.f61467f.b()) {
                f17 = 1280.0f;
            } else {
                f18 = f16;
            }
            float f19 = f10 / f18;
            float f20 = f11 / f17;
            if (f19 > f20) {
                layoutParams.width = -1;
                layoutParams.height = (int) (f17 * f19);
                layoutParams.gravity = 17;
            } else {
                layoutParams.height = -1;
                layoutParams.width = (int) (f18 * f20);
                layoutParams.gravity = 17;
            }
        }
        this.f61466e.setLayoutParams(layoutParams);
    }

    protected boolean b() {
        try {
            return this.f61467f.a().h().equals("torch");
        } catch (RuntimeException unused) {
            o4.b(f61460y, "getFlashStatusRuntimeException");
            return false;
        } catch (Exception unused2) {
            o4.b(f61460y, "getFlashStatusException");
            return false;
        }
    }

    protected void c() {
        Object systemService = this.f61464c.getSystemService(ak.f104420ac);
        if (systemService instanceof SensorManager) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.f61469h = sensorManager;
            Iterator<Sensor> it = sensorManager.getSensorList(-1).iterator();
            while (it.hasNext()) {
                if (5 == it.next().getType()) {
                    this.f61471j = true;
                    return;
                }
            }
        }
    }

    protected ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.f61464c : DynamicModuleInitializer.getContext(), true);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!r3.A) {
            OpencvJNI.init();
        }
        Bundle bundle = (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper2);
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = true;
            z11 = false;
            z12 = false;
        } else {
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.USE_APK, false);
            z12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
            z10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PARSE_RESULT, true);
        }
        r3.f62280f = z10;
        if (z12 && !r3.f62275a && z11) {
            return new HmsScan[]{r6.b()};
        }
        if (this.f61462a == null) {
            try {
                this.f61462a = new w3(bundle, DetailRect.PHOTO_MODE);
            } catch (RuntimeException unused) {
                o4.b(f61460y, "RuntimeException");
            } catch (Exception unused2) {
                o4.b(f61460y, "Exception");
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    protected void e() {
        ProviderRemoteView providerRemoteViewD = d();
        this.f61465d = providerRemoteViewD;
        this.f61466e = (TextureView) providerRemoteViewD.findViewById(R.id.surfaceView);
        com.huawei.hms.scankit.b bVar = new com.huawei.hms.scankit.b(this.f61464c, this.f61466e, null, this.f61475n, this.f61463b, this.f61476o, this.f61477p, "CustomizedView", true);
        this.f61467f = bVar;
        bVar.b(this.f61480s);
        c();
        a((Point) null, true);
    }

    protected void f() {
        try {
            com.huawei.hms.scankit.b bVar = this.f61467f;
            if (bVar == null || bVar.a() == null) {
                return;
            }
            this.f61467f.a().a(s0.f130317e);
        } catch (RuntimeException unused) {
            o4.b(f61460y, "offFlashRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "offFlashException");
        }
    }

    public void g() {
        try {
            com.huawei.hms.scankit.b bVar = this.f61467f;
            if (bVar == null || bVar.a() == null) {
                return;
            }
            this.f61467f.a().a("torch");
        } catch (RuntimeException unused) {
            o4.b(f61460y, "openFlashRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "openFlashException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public boolean getLightStatus() throws RemoteException {
        return b();
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.f61465d);
    }

    protected void h() {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f61464c).create();
        this.f61474m = alertDialogCreate;
        alertDialogCreate.show();
        View viewInflate = LayoutInflater.from(DynamicModuleInitializer.getContext() == null ? this.f61464c : DynamicModuleInitializer.getContext()).inflate(R.layout.scankit_dialog_layout, (ViewGroup) null);
        Window window = this.f61474m.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = 60;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setContentView(viewInflate);
        window.setGravity(80);
        viewInflate.findViewById(R.id.dialog_sure_btn).setOnClickListener(new c());
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(Bundle bundle) {
        Context context = this.f61464c;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.f61464c).getWindow().setFlags(16777216, 16777216);
        }
        Context context2 = this.f61464c;
        if (context2 != null && context2.getPackageManager() != null) {
            this.f61481t = this.f61464c.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
            o4.d("Scankit", "initlight hasFlash " + this.f61481t);
        }
        e();
        this.f61467f.a(this);
        this.f61465d.setOnTouchListener(new a());
        IOnResultCallback iOnResultCallback = this.f61468g;
        if (iOnResultCallback != null) {
            this.f61467f.a(iOnResultCallback);
        }
        this.f61467f.a(this.f61479r);
        this.f61467f.c();
        if (Build.VERSION.SDK_INT >= 24) {
            b bVar = new b(this.f61464c);
            this.f61478q = bVar;
            if (bVar.canDetectOrientation()) {
                this.f61478q.enable();
            } else {
                this.f61478q.disable();
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onDestroy() {
        try {
            this.f61467f.d();
            OrientationEventListener orientationEventListener = this.f61478q;
            if (orientationEventListener != null && orientationEventListener.canDetectOrientation()) {
                this.f61478q.disable();
            }
            if (this.f61464c != null) {
                this.f61464c = null;
            }
            AlertDialog alertDialog = this.f61474m;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.f61474m.dismiss();
            this.f61474m = null;
        } catch (RuntimeException unused) {
            o4.b(f61460y, "onDestroyRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "onDestroyException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onPause() {
        try {
            this.f61467f.e();
            this.f61469h.unregisterListener(this);
        } catch (RuntimeException unused) {
            o4.b(f61460y, "onPauseRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "onPauseException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
        try {
            this.f61467f.f();
            SensorManager sensorManager = this.f61469h;
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 2);
        } catch (RuntimeException unused) {
            o4.b(f61460y, "onResumeRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "onResumeException");
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f61471j && sensorEvent.sensor.getType() == 5 && this.f61481t) {
            Boolean boolValueOf = Boolean.valueOf(sensorEvent.values[0] > this.f61472k.floatValue());
            this.f61473l = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (sensorEvent.values[0] > 600.0f) {
                    if (this.f61484w != null && !b()) {
                        this.f61484w.setVisibility(8);
                    }
                    IOnLightCallback iOnLightCallback = this.f61483v;
                    if (iOnLightCallback != null) {
                        try {
                            iOnLightCallback.onVisibleChanged(false);
                            return;
                        } catch (RemoteException unused) {
                            o4.e(f61460y, "onSensorChanged RemoteException");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (w7.a(this.f61464c)) {
                if (this.f61484w != null) {
                    o4.d("Scankit", "initlight onSensorChanged open");
                    this.f61484w.setVisibility(0);
                }
                IOnLightCallback iOnLightCallback2 = this.f61483v;
                if (iOnLightCallback2 != null) {
                    try {
                        iOnLightCallback2.onVisibleChanged(true);
                    } catch (RemoteException unused2) {
                        o4.e(f61460y, "onSensorChanged RemoteException");
                    }
                }
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
        try {
            this.f61467f.g();
        } catch (RuntimeException unused) {
            o4.b(f61460y, "onStartRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "onStartException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
        try {
            this.f61467f.h();
        } catch (RuntimeException unused) {
            o4.b(f61460y, "onStopRuntimeException");
        } catch (Exception unused2) {
            o4.b(f61460y, "onStopException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void pauseContinuouslyScan() throws RemoteException {
        com.huawei.hms.scankit.b bVar = this.f61467f;
        if (bVar != null) {
            bVar.i();
        }
        this.f61485x = true;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void resumeContinuouslyScan() throws RemoteException {
        this.f61485x = false;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f61470i = (View.OnClickListener) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnErrorCallback(IOnErrorCallback iOnErrorCallback) throws RemoteException {
        com.huawei.hms.scankit.b bVar = this.f61467f;
        if (bVar != null) {
            bVar.a(iOnErrorCallback);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnLightVisbleCallBack(IOnLightCallback iOnLightCallback) throws RemoteException {
        this.f61483v = iOnLightCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnResultCallback(IOnResultCallback iOnResultCallback) {
        this.f61468g = iOnResultCallback;
        com.huawei.hms.scankit.b bVar = this.f61467f;
        if (bVar != null) {
            bVar.a(iOnResultCallback);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() throws RemoteException {
        f();
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() throws RemoteException {
        g();
    }
}
