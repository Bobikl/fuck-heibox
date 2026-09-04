package com.ss.android.ttvecamera.hardware;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.n;
import com.ss.android.ttvecamera.p;
import com.ss.android.ttvecamera.q;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: compiled from: TECameraHardware2Proxy.java */
/* JADX INFO: loaded from: classes9.dex */
@w0(api = 21)
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f97543b = "TECameraHardware2Proxy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static String f97544c = "-1";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f97545d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f97546a;

    public d(Context context) {
        this.f97546a = context;
    }

    public static d c(Context context, @TECameraSettings.e int i10) {
        d dVar;
        q.k(f97543b, "getDeviceProxy, cameraType: " + i10);
        f97545d = i10;
        synchronized (d.class) {
            try {
                if (i10 == 6) {
                    dVar = new a(context);
                } else if (c.d()) {
                    dVar = new g(context);
                } else if (c.c()) {
                    dVar = new f(context);
                } else if (c.b()) {
                    dVar = new e(context);
                } else if (c.a()) {
                    dVar = new b(context);
                } else {
                    q.e(f97543b, "Unknown platform");
                    dVar = new d(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public boolean A(CameraCharacteristics cameraCharacteristics) {
        return false;
    }

    public boolean B(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    public int a(@n0 CameraCharacteristics cameraCharacteristics, @n0 CaptureRequest.Builder builder, boolean z10) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z10) {
            q.k(f97543b, "configStabilization not toggle");
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i10 : iArr) {
                q.k(f97543b, "EIS mode: " + i10);
                if (i10 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    q.k(f97543b, "Enable EIS");
                    return 0;
                }
            }
        } else {
            q.k(f97543b, "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 == null) {
            q.k(f97543b, "Don't supported OIS");
            return -200;
        }
        for (int i11 : iArr2) {
            q.k(f97543b, "OIS mode: " + i11);
            if (i11 == 1) {
                builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                q.k(f97543b, "Enable OIS");
                return 0;
            }
        }
        return -200;
    }

    public void b(int i10, CameraManager cameraManager) {
        try {
            f97544c = k(cameraManager.getCameraIdList(), cameraManager);
            q.k(f97543b, "fillWideCameraID mWideCameraID = " + f97544c);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }

    public TEFrameRateRange d(CameraCharacteristics cameraCharacteristics, int i10, int i11, int i12, int i13) {
        Range[] rangeArr;
        TEFrameRateRange tEFrameRateRange = new TEFrameRateRange(i10, i11);
        if (cameraCharacteristics == null || (rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) == null) {
            return tEFrameRateRange;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i14 = tEFrameRateRange.f97205d;
        int i15 = 0;
        for (Range range : rangeArr) {
            int[] iArr = {((Integer) range.getLower()).intValue() * i14, ((Integer) range.getUpper()).intValue() * i14};
            arrayList.add(iArr);
            int i16 = iArr[1];
            if (i15 < i16) {
                i15 = i16;
            }
        }
        n.b(n.f97642f, i15);
        int[] iArrY = p.y(i12, i13, tEFrameRateRange.b(), arrayList);
        tEFrameRateRange.f97203b = iArrY[0];
        tEFrameRateRange.f97204c = iArrY[1];
        return tEFrameRateRange;
    }

    public String e() {
        return f97544c;
    }

    public float f(@n0 CameraCharacteristics cameraCharacteristics, int i10, float f10) {
        Float f11 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f11 == null) {
            return 0.0f;
        }
        float fFloatValue = f11.floatValue();
        if (f10 == -1.0f) {
            return i10 != 6 ? fFloatValue / 2.0f : fFloatValue;
        }
        return fFloatValue * f10;
    }

    public float g(@n0 CameraCharacteristics cameraCharacteristics) {
        float fFloatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        try {
            return Float.valueOf(new DecimalFormat("0.00").format(((rect.width() - ((int) (rect.width() / fFloatValue))) / fFloatValue) / rect.width()).trim()).floatValue();
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return 0.01f;
        }
    }

    public String h() {
        CameraManager cameraManager = (CameraManager) this.f97546a.getSystemService("camera");
        try {
            return i(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException | IllegalArgumentException e10) {
            e10.printStackTrace();
            return "0";
        }
    }

    public String i(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f10 = Float.MIN_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    if (fArr == null || fArr.length == 0) {
                        fArr = new float[]{0.0f};
                    }
                    float f11 = fArr[0];
                    if (f11 > f10) {
                        str = str2;
                        f10 = f11;
                    }
                }
            }
        } catch (CameraAccessException | IllegalArgumentException e10) {
            e10.printStackTrace();
        }
        return str;
    }

    public String j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        CameraManager cameraManager = (CameraManager) this.f97546a.getSystemService("camera");
        try {
            String strK = k(cameraManager.getCameraIdList(), cameraManager);
            q.k(f97543b, "getWideAngleID, cost time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
            return strK;
        } catch (Throwable th2) {
            q.f(f97543b, "exception occurs when getWideAngleID", th2);
            return "0";
        }
    }

    public String k(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            float f10 = Float.MAX_VALUE;
            for (String str2 : strArr) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() != 0) {
                    float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    float f11 = (fArr == null || fArr.length <= 0) ? -1.0f : fArr[0];
                    if (f11 != -1.0f && f11 <= f10) {
                        str = str2;
                        f10 = f11;
                    }
                }
            }
            return str;
        } catch (Throwable th2) {
            q.f(f97543b, "exception occurs when getWideAngleID: ", th2);
            return str;
        }
    }

    public Range<Float> l(@n0 CameraCharacteristics cameraCharacteristics) {
        Range<Float> range;
        return (Build.VERSION.SDK_INT < 30 || (range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) == null) ? new Range<>(Float.valueOf(0.0f), (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) : range;
    }

    public boolean m() {
        return false;
    }

    public boolean n(@n0 CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        return (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) == null || iArr.length <= 0) ? false : true;
    }

    public boolean o(@n0 CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() >= 1;
    }

    public boolean p(CameraCharacteristics cameraCharacteristics, int i10) {
        if (cameraCharacteristics == null) {
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue < 0 || iIntValue > 4) {
            q.e(f97543b, "Invalid hardware level = " + iIntValue);
            return false;
        }
        int i11 = c.f97542g[iIntValue];
        n.b(n.f97644h, i11);
        if (i11 >= i10) {
            q.k(f97543b, "Camera hardware level supported, deviceLevel = " + i11 + ", require = " + i10);
            return true;
        }
        q.e(f97543b, "Camera hardware level not supported, deviceLevel = " + i11 + ", require = " + i10);
        return false;
    }

    public boolean q(@n0 CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        for (int i10 : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i10 == 11) {
                return true;
            }
        }
        return false;
    }

    public boolean r(@n0 CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics != null && ((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() >= 1;
    }

    public boolean s(@n0 CameraCharacteristics cameraCharacteristics) {
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public boolean t(@n0 CameraCharacteristics cameraCharacteristics) {
        boolean zN = n(cameraCharacteristics);
        ?? r10 = zN;
        if (s(cameraCharacteristics)) {
            r10 = (zN ? 1 : 0) | 2;
        }
        q.k(f97543b, "Stabilization type: " + Integer.toBinaryString(r10));
        n.b(n.f97640d, (long) r10);
        return r10 > 0;
    }

    public boolean u(int i10) {
        return false;
    }

    public boolean v(CameraCharacteristics cameraCharacteristics, int i10) {
        return false;
    }

    public boolean w(CameraCharacteristics cameraCharacteristics) {
        return false;
    }

    public boolean x() {
        return !h().equals("0");
    }

    public boolean y(CameraCharacteristics cameraCharacteristics) {
        return false;
    }

    public boolean z() {
        return !j().equals("0");
    }
}
