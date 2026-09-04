package com.alipay.face.camera.utils;

import android.hardware.Camera;
import android.os.Build;
import com.alipay.zoloz.toyger.ToygerLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AndroidCameraUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f38699b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f38700a = new b();

    /* JADX INFO: renamed from: com.alipay.face.camera.utils.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidCameraUtil.java */
    public class C0297a implements Comparator<Camera.Size> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f38701b;

        C0297a(float f10) {
            this.f38701b = f10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            float fAbs = Math.abs((size.width / size.height) - this.f38701b) - Math.abs((size2.width / size2.height) - this.f38701b);
            if (Math.abs(fAbs) < 0.01d) {
                return 0;
            }
            if (fAbs < 0.0f) {
                return -1;
            }
            return fAbs > 0.0f ? 1 : 0;
        }
    }

    /* JADX INFO: compiled from: AndroidCameraUtil.java */
    public class b implements Comparator<Camera.Size> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i10 = size.width;
            int i11 = size2.width;
            if (i10 == i11) {
                return size.height - size2.height;
            }
            return i10 > i11 ? 1 : -1;
        }
    }

    private a() {
    }

    private static int b() {
        int numberOfCameras;
        try {
            numberOfCameras = Integer.parseInt(Build.VERSION.SDK) > 8 ? Camera.getNumberOfCameras() : 0;
        } catch (Throwable th2) {
            ToygerLog.e("face", th2.toString());
        }
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i10;
                }
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static int c() {
        return b();
    }

    private static int d() {
        int numberOfCameras;
        try {
            numberOfCameras = Integer.parseInt(Build.VERSION.SDK) > 8 ? Camera.getNumberOfCameras() : 0;
        } catch (Throwable th2) {
            ToygerLog.e("face", th2.toString());
        }
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            try {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                if (cameraInfo.facing == 1) {
                    return i10;
                }
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public static Map<String, String> e() {
        HashMap map = new HashMap();
        new ArrayList();
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            for (int i10 = 0; i10 < numberOfCameras; i10++) {
                Camera cameraOpen = Camera.open(i10);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i10, cameraInfo);
                int i11 = cameraInfo.facing;
                if (i11 == 1) {
                    Camera.Size size = cameraOpen.getParameters().getSupportedPictureSizes().get(0);
                    map.put("frontCamera", size.width + androidx.webkit.b.f28327e + size.height);
                } else if (i11 == 0) {
                    Camera.Size size2 = cameraOpen.getParameters().getSupportedPictureSizes().get(0);
                    map.put("backCamera", size2.width + androidx.webkit.b.f28327e + size2.height);
                }
                if (cameraOpen != null) {
                    cameraOpen.release();
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    private float f(Camera.Size size, float f10) {
        return Math.abs((size.width / size.height) - f10);
    }

    public static synchronized a g() {
        a aVar = f38699b;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        f38699b = aVar2;
        return aVar2;
    }

    public boolean a(Camera.Size size, float f10) {
        return ((double) Math.abs((((float) size.width) / ((float) size.height)) - f10)) <= 0.03d;
    }

    public Camera.Size h(List<Camera.Size> list, float f10, int i10) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f38700a);
        float f11 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        for (Camera.Size size : list) {
            if (size.width >= i10) {
                if (i11 == 0) {
                    f11 = f(size, f10);
                    i11 = i12;
                }
                if (f11 > f(size, f10)) {
                    f11 = f(size, f10);
                    i11 = i12;
                }
            }
            i12++;
        }
        return list.get(i11);
    }

    public Camera.Size i(List<Camera.Size> list, float f10, int i10) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new C0297a(f10));
        int size = 0;
        Iterator<Camera.Size> it = list.iterator();
        while (it.hasNext() && it.next().width < i10) {
            size++;
        }
        if (size == list.size()) {
            size = list.size() - 1;
        }
        return list.get(size);
    }

    public Camera.Size j(List<Camera.Size> list, int i10, int i11) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, this.f38700a);
        for (Camera.Size size : list) {
            if (size.width >= i10 && size.height >= i11) {
                ToygerLog.i("PreviewSize:w = " + size.width + "h = " + size.height);
                return size;
            }
        }
        return null;
    }

    public void k(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return;
        }
        Iterator<String> it = supportedFocusModes.iterator();
        while (it.hasNext()) {
            ToygerLog.i("focusModes--" + it.next());
        }
    }

    public void l(Camera.Parameters parameters) {
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes == null) {
            return;
        }
        for (int i10 = 0; i10 < supportedPictureSizes.size(); i10++) {
            Camera.Size size = supportedPictureSizes.get(i10);
            ToygerLog.i("pictureSizes:width = " + size.width + " height = " + size.height);
        }
    }

    public void m(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            return;
        }
        for (int i10 = 0; i10 < supportedPreviewSizes.size(); i10++) {
            Camera.Size size = supportedPreviewSizes.get(i10);
            ToygerLog.i("previewSizes:width = " + size.width + " height = " + size.height);
        }
    }
}
