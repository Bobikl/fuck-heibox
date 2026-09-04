package com.ss.android.ttvecamera.framework;

import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFocusSettings;
import com.ss.android.ttvecamera.j;

/* JADX INFO: compiled from: ITECameraMode.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f97498a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f97499b = 1;

    int A();

    void B(j.f fVar);

    void C(int i10);

    int[] D();

    void E(long j10);

    int F() throws Exception;

    void G(j.b bVar);

    int H(int i10, int i11);

    void I(boolean z10);

    void J();

    int[] K();

    void L(boolean z10);

    int[] M();

    void N(float f10);

    void O(Object obj) throws ClassCastException;

    int P() throws CameraAccessException;

    void Q(rg.a aVar, int i10, TECameraSettings.f fVar);

    String R(@TECameraSettings.c int i10) throws CameraAccessException;

    float[] S();

    Rect T(float f10);

    void U(Bundle bundle);

    void V();

    int W(int i10, int i11, float f10, int i12, int i13);

    void Y(float f10);

    int Z(boolean z10);

    int a();

    float a0();

    int[] b0();

    int c();

    void close();

    int d();

    void e(int i10, int i11, TECameraSettings.r rVar);

    void f();

    int g(float f10, TECameraSettings.w wVar);

    boolean h(int i10);

    void i(TECameraSettings.p pVar);

    void j(boolean z10, String str);

    int k(TEFocusSettings tEFocusSettings);

    int l(String str, int i10) throws CameraAccessException;

    void m(TECameraSettings.r rVar, int i10);

    int n();

    Rect o(float f10);

    void p();

    int q();

    void r();

    void reset();

    long[] s();

    float[] t();

    void v(int i10);

    void w(j.e eVar);

    void x(int i10);

    void y(float f10, TECameraSettings.w wVar);

    int z();
}
