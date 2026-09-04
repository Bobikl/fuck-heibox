package com.ss.android.ttvecamera.cameraalgorithm;

import androidx.annotation.Keep;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.j;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class TECameraAlgorithmInterface {

    public static class TECameraAlgoResult {
    }

    public interface a {
        void onError(int i10, String str);
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public TECameraAlgorithmInterface(j jVar) {
    }

    public int addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        return 0;
    }

    public int destroy() {
        return 0;
    }

    public qg.a getResult() {
        return null;
    }

    public int init() {
        return 0;
    }

    public native int nativeAddCameraAlgorithm(long j10, Object obj);

    public native int nativeAlgorithmDestroy(long j10);

    public native Object nativeAlgorithmGetResult(long j10);

    public void nativeCallback_onError(int i10, String str) {
    }

    public void nativeCallback_onProcess(float f10, boolean z10) {
    }

    public native long nativeInit();

    public native TECameraAlgoResult nativeProcessAlgorithm(long j10, Object obj);

    public native int nativeRemoveCameraAlgorithm(long j10, int i10);

    public native int nativeUpdateCameraAlgorithmParam(long j10, Object obj);

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        return null;
    }

    public int removeCameraAlgorithm(int i10) {
        return 0;
    }

    public void setErrorListener(a aVar) {
    }

    public void setProcessListener(b bVar) {
    }

    public int updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        return 0;
    }
}
