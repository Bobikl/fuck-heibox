package com.alipay.face.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.alipay.face.config.DeviceSetting;

/* JADX INFO: loaded from: classes6.dex */
public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static f f38627g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f38628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SurfaceHolder f38629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f38630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    e f38631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private DeviceSetting f38632f;

    public CameraSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context applicationContext = context.getApplicationContext();
        this.f38628b = applicationContext;
        this.f38630d = com.alipay.face.camera.utils.c.c(applicationContext);
        SurfaceHolder holder = getHolder();
        this.f38629c = holder;
        holder.setFormat(-2);
        this.f38629c.setType(3);
        this.f38629c.addCallback(this);
    }

    public static synchronized f getCameraImpl() {
        if (f38627g == null) {
            f38627g = a.a0();
        }
        return f38627g;
    }

    public static String getCameraName() {
        return "Android";
    }

    public void a(boolean z10) {
        if (z10) {
            f38627g.K();
        } else {
            f38627g.i();
        }
    }

    public void b(Context context, boolean z10, boolean z11, DeviceSetting[] deviceSettingArr) {
        this.f38632f = com.alipay.face.camera.utils.b.a(deviceSettingArr);
        f cameraImpl = getCameraImpl();
        f38627g = cameraImpl;
        if (cameraImpl != null) {
            cameraImpl.I(context, z10, z11, this.f38632f);
        }
    }

    public f getCameraInterface() {
        return f38627g;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.f38629c;
    }

    public void setCameraCallback(e eVar) {
        this.f38631e = eVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        f fVar = f38627g;
        if (fVar != null) {
            fVar.d(this.f38629c, this.f38630d, i11, i12);
            if (this.f38631e != null) {
                int iF = f38627g.F();
                if (iF == 90 || iF == 270) {
                    i11 = f38627g.x();
                    i12 = f38627g.B();
                } else if (iF == 0 || iF == 180) {
                    i11 = f38627g.B();
                    i12 = f38627g.x();
                }
                this.f38631e.c(i11, i12);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        f fVar = f38627g;
        if (fVar != null) {
            fVar.p(this.f38631e);
        }
        f fVar2 = f38627g;
        if (fVar2 != null) {
            fVar2.E();
        }
        e eVar = this.f38631e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f fVar = f38627g;
        if (fVar != null) {
            fVar.M();
            f38627g.p(null);
        }
        e eVar = this.f38631e;
        if (eVar != null) {
            eVar.b();
        }
    }
}
