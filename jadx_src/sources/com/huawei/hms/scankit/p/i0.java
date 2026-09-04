package com.huawei.hms.scankit.p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: CameraFocusManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class i0 implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Set<String> f61909i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f61910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Camera f61911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AsyncTask<?, ?, ?> f61912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61913d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f61914e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61915f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f61916g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f61917h = null;

    /* JADX INFO: compiled from: CameraFocusManager.java */
    public static class a extends AsyncTask<Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<i0> f61918a;

        a(i0 i0Var) {
            this.f61918a = new WeakReference<>(i0Var);
        }

        @Override // android.os.AsyncTask
        protected Object doInBackground(Object... objArr) {
            i0 i0Var = this.f61918a.get();
            if (i0Var == null) {
                return null;
            }
            i0Var.d();
            try {
                Thread.sleep(Math.max(i0Var.c(), 0));
            } catch (InterruptedException unused) {
                Log.e("CameraManager", "CameraFocusManager::doInBackground InterruptedException");
            }
            return null;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f61909i = hashSet;
        hashSet.add("auto");
        hashSet.add("macro");
    }

    i0(Camera camera) {
        String focusMode;
        this.f61911b = camera;
        try {
            focusMode = camera.getParameters().getFocusMode();
        } catch (RuntimeException e10) {
            Log.e("CameraManager", "Unexpected exception while getFocusMode" + e10.getMessage());
            focusMode = "auto";
        }
        boolean zContains = f61909i.contains(focusMode);
        this.f61910a = zContains;
        Log.i("CameraManager", "CameraFocusManager useAutoFocus： " + zContains);
    }

    private static int a(int i10) {
        if (i10 > 1000) {
            return 1000;
        }
        return Math.max(i10, -1000);
    }

    private static Rect a(float f10, float f11, float f12, int i10, int i11, boolean z10, int i12) {
        int i13 = (int) (((f10 / i10) * 2000.0f) - 1000.0f);
        int i14 = (int) (((f11 / i11) * 2000.0f) - 1000.0f);
        RectF rectF = new RectF(a(i13 - 150), a(i14 - 150), a(i13 + 150), a(i14 + 150));
        Matrix matrix = new Matrix();
        try {
            a(matrix, z10, i12);
            matrix.mapRect(rectF);
            return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        } catch (RuntimeException e10) {
            Log.i("CameraManager", "CameraFocusManager::prepareMatrix failed: " + e10.getMessage());
            return null;
        }
    }

    private synchronized void a() {
        if (!this.f61913d && this.f61912c == null) {
            a aVar = new a(this);
            try {
                aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f61912c = aVar;
            } catch (RejectedExecutionException e10) {
                Log.w("CameraManager", "CameraFocusManager::autoFocusAgainLater RejectedExecutionException: " + e10.getMessage());
            }
        }
    }

    public static void a(Matrix matrix, boolean z10, int i10) {
        if (matrix == null) {
            return;
        }
        Matrix matrix2 = new Matrix();
        try {
            matrix.reset();
            matrix2.setScale(z10 ? -1.0f : 1.0f, 1.0f);
            matrix2.postRotate(i10);
            matrix2.invert(matrix);
        } catch (RuntimeException e10) {
            Log.i("CameraManager", "CameraFocusManager::prepareMatrix failed: " + e10.getMessage());
        }
    }

    private synchronized void b() {
        AsyncTask<?, ?, ?> asyncTask = this.f61912c;
        if (asyncTask != null) {
            if (asyncTask.getStatus() != AsyncTask.Status.FINISHED) {
                this.f61912c.cancel(true);
            }
            this.f61912c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int c() {
        return this.f61915f;
    }

    public void a(Rect rect, int i10, int i11, boolean z10, boolean z11) {
        int i12 = this.f61916g;
        if (i12 < 1) {
            return;
        }
        this.f61916g = i12 - 1;
        Rect rectA = a(rect.centerX(), rect.centerY(), 1.0f, i11, i10, false, z10 ? 90 : 0);
        if (rectA == null) {
            this.f61916g--;
            return;
        }
        Camera camera = this.f61911b;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
                Camera.Parameters parameters = this.f61911b.getParameters();
                if (parameters.getMaxNumFocusAreas() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Camera.Area(rectA, 1000));
                    parameters.setFocusAreas(arrayList);
                } else {
                    Log.i("CameraManager", "focus areas not supported");
                }
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new Camera.Area(rectA, 1000));
                    parameters.setMeteringAreas(arrayList2);
                } else {
                    Log.i("CameraManager", "metering areas not supported");
                }
                this.f61917h = parameters.getFocusMode();
                parameters.setFocusMode("macro");
                this.f61911b.setParameters(parameters);
                this.f61911b.autoFocus(this);
            } catch (RuntimeException e10) {
                Log.i("CameraManager", "CameraFocusManager::setCameraFocusArea failed: " + e10.getMessage());
                this.f61916g = this.f61916g + 1;
            }
        }
    }

    public synchronized void d() {
        if (this.f61910a) {
            this.f61912c = null;
            if (!this.f61913d && !this.f61914e) {
                try {
                    this.f61911b.autoFocus(this);
                    this.f61914e = true;
                } catch (RuntimeException e10) {
                    Log.w("CameraManager", "Unexpected exception while focusing" + e10.getMessage());
                    a();
                }
            }
        }
    }

    synchronized void e() {
        this.f61913d = true;
        if (this.f61910a) {
            b();
            try {
                Camera camera = this.f61911b;
                if (camera != null) {
                    camera.cancelAutoFocus();
                }
            } catch (RuntimeException e10) {
                Log.w("CameraManager", "Unexpected exception while cancelling focusing" + e10.getMessage());
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z10, Camera camera) {
        this.f61914e = false;
        a();
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.i("CameraManager", "Unexpected exception while cancelling focusing" + e10.getMessage());
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode(this.f61917h);
                camera.setParameters(parameters);
            } catch (RuntimeException e11) {
                Log.i("CameraManager", "CameraFocusManager::setCameraFocusArea failed: " + e11.getMessage());
            }
        }
    }
}
