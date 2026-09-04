package com.alipay.face.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.alipay.face.config.DeviceSetting;
import java.util.Map;

/* JADX INFO: compiled from: ICameraInterface.java */
/* JADX INFO: loaded from: classes6.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f38698a = "faceRegion";

    void A();

    int B();

    void C();

    int D();

    void E();

    int F();

    void G(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener);

    void H(Map<String, Object> map);

    void I(Context context, boolean z10, boolean z11, DeviceSetting deviceSetting);

    Object J();

    void K();

    void L();

    void M();

    int N();

    boolean a(Bitmap bitmap);

    Camera b();

    Rect c();

    void d(SurfaceHolder surfaceHolder, float f10, int i10, int i11);

    void e();

    void f();

    void g(g gVar);

    void h();

    void i();

    String j();

    int k();

    d l();

    boolean m(boolean z10);

    void n(h hVar);

    int o();

    void p(e eVar);

    int q();

    PointF r(PointF pointF);

    int s();

    void t();

    boolean u();

    void v(DeviceSetting deviceSetting);

    String w();

    int x();

    int y();

    PointF z(PointF pointF);
}
