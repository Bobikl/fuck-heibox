package com.ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.WindowManager;
import androidx.annotation.n0;
import androidx.annotation.w0;
import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: TECameraUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97741a = "TECameraUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f97742b = 3264;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f97743c = 2560;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f97744d = 1920;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f97745e = 1920;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f97746f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f97747g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f97750j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String[] f97748h = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String[] f97749i = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Class f97751k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Field f97752l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Method f97753m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static byte f97754n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final ArrayList<TEFrameSizei> f97755o = new ArrayList<>(Arrays.asList(new TEFrameSizei(160, 120), new TEFrameSizei(240, 160), new TEFrameSizei(bb.c.b.f30693i3, 240), new TEFrameSizei(400, 240), new TEFrameSizei(480, bb.c.b.f30693i3), new TEFrameSizei(bb.c.b.f30883q9, 360), new TEFrameSizei(bb.c.b.f30883q9, 480), new TEFrameSizei(768, 480), new TEFrameSizei(bb.c.b.f31019wd, 480), new TEFrameSizei(800, 600), new TEFrameSizei(bb.c.b.f31065yf, 540), new TEFrameSizei(bb.c.b.f31065yf, bb.c.b.f30883q9), new TEFrameSizei(1024, bb.c.b.f30606e8), new TEFrameSizei(1024, 600), new TEFrameSizei(1280, 720), new TEFrameSizei(1280, 1024), new TEFrameSizei(1920, 1080), new TEFrameSizei(1920, bb.c.b.Ko), new TEFrameSizei(2560, bb.c.b.Ko), new TEFrameSizei(bb.c.e.f31800g5, bb.c.d.B1)));

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class a implements Comparator<TEFrameSizei> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.f97206b * tEFrameSizei2.f97207c) - (tEFrameSizei.f97206b * tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class b implements Comparator<TEFrameSizei> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.f97206b * tEFrameSizei2.f97207c) - (tEFrameSizei.f97206b * tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class c implements Comparator<int[]> {
        c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr2[0] - iArr[0];
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class d implements Comparator<int[]> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f97756c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f97757d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f97758e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f97759f = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f97760b;

        d(int[] iArr) {
            this.f97760b = iArr;
        }

        private int b(int[] iArr) {
            int[] iArr2 = this.f97760b;
            int i10 = iArr2[0];
            int i11 = iArr[0];
            int i12 = i10 > i11 ? (i10 - i11) * 2 : (i11 - i10) * 3;
            int i13 = iArr2[1];
            int i14 = iArr[1];
            return i12 + (i13 > i14 ? (i13 - i14) * 4 : (i14 - i13) * 1);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return b(iArr) - b(iArr2);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class e implements Comparator<int[]> {
        e() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr2[1] - iArr[1];
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class f extends l<TEFrameSizei> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TEFrameSizei f97761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(TEFrameSizei tEFrameSizei) {
            super(null);
            this.f97761b = tEFrameSizei;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.ss.android.ttvecamera.p.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(TEFrameSizei tEFrameSizei) {
            return Math.abs(this.f97761b.f97206b - tEFrameSizei.f97206b) + Math.abs(this.f97761b.f97207c - tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class g extends l<Size> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Size f97762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Size size) {
            super(null);
            this.f97762b = size;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.ss.android.ttvecamera.p.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(Size size) {
            return Math.abs(this.f97762b.getWidth() - size.getWidth()) + Math.abs(this.f97762b.getHeight() - size.getHeight());
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class h implements Comparator<TEFrameSizei> {
        h() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.f97206b * tEFrameSizei2.f97207c) - (tEFrameSizei.f97206b * tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class i implements Comparator<TEFrameSizei> {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.f97206b * tEFrameSizei2.f97207c) - (tEFrameSizei.f97206b * tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class j implements Comparator<TEFrameSizei> {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.f97206b * tEFrameSizei2.f97207c) - (tEFrameSizei.f97206b * tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static final class k implements Comparator<TEFrameSizei> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
            return (tEFrameSizei2.f97206b * tEFrameSizei2.f97207c) - (tEFrameSizei.f97206b * tEFrameSizei.f97207c);
        }
    }

    /* JADX INFO: compiled from: TECameraUtils.java */
    public static abstract class l<T> implements Comparator<T> {
        private l() {
        }

        /* synthetic */ l(c cVar) {
            this();
        }

        abstract int a(T t10);

        @Override // java.util.Comparator
        public int compare(T t10, T t11) {
            return a(t10) - a(t11);
        }
    }

    static {
        f97750j = false;
        String strP = p();
        if (!TextUtils.isEmpty(strP)) {
            strP = strP.toUpperCase();
            for (String str : f97748h) {
                if (strP.contains(str)) {
                    f97747g = true;
                    break;
                }
            }
        }
        String upperCase = Build.MODEL;
        if (!TextUtils.isEmpty(upperCase)) {
            upperCase = upperCase.toUpperCase();
            for (String str2 : f97749i) {
                if (str2.equals(upperCase)) {
                    f97750j = true;
                    break;
                }
            }
        }
        q.k(f97741a, "cpuHardware: " + strP + ", isHighPerformanceCpu: " + f97747g + "model: " + upperCase + ", isInAbortCapturesBlockList: " + f97750j);
    }

    public static int A() {
        return f97745e;
    }

    @w0(api = 19)
    public static boolean B(Image image, byte[] bArr) {
        if (image == null) {
            q.e(f97741a, "image is null");
            return false;
        }
        if (image.getFormat() != 35) {
            q.e(f97741a, "image format wrong: " + image.getFormat());
            return false;
        }
        if (bArr == null) {
            q.e(f97741a, "output buffer is null");
            return false;
        }
        int width = image.getWidth();
        int height = image.getHeight();
        if (bArr.length < ((width * height) * 3) / 2) {
            q.e(f97741a, "output buffer size invalid...");
            return false;
        }
        Image.Plane[] planes = image.getPlanes();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i10 >= planes.length) {
                return true;
            }
            Image.Plane plane = planes[i10];
            ByteBuffer buffer = plane.getBuffer();
            if (buffer == null) {
                return false;
            }
            int rowStride = plane.getRowStride();
            if (rowStride <= 0) {
                q.e(f97741a, "imageToNV21, rowStride: " + width);
                rowStride = width;
            }
            int pixelStride = plane.getPixelStride();
            if (pixelStride <= 0) {
                q.e(f97741a, "imageToNV21, pixelStride: " + pixelStride);
            } else {
                i12 = pixelStride;
            }
            int i13 = height / i12;
            if (rowStride == width) {
                buffer.get(bArr, i11, buffer.remaining());
                i11 += rowStride * i13;
            } else {
                for (int i14 = 0; i14 < i13 - 1; i14++) {
                    buffer.get(bArr, i11, rowStride);
                    i11 += width;
                }
                buffer.get(bArr, i11, Math.min(width, buffer.remaining()));
                i11 += width;
            }
            i10 += 2;
        }
    }

    public static boolean C() {
        return f97747g;
    }

    public static boolean D() {
        return f97750j;
    }

    public static boolean E() {
        String str = Build.MANUFACTURER;
        return str.equalsIgnoreCase("samsung") || str.equalsIgnoreCase("huawei");
    }

    public static boolean F(Context context) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            if (i10 < 28 && (i10 != 27 || Build.VERSION.PREVIEW_SDK_INT <= 0)) {
                Method declaredMethod = cameraManager.getClass().getDeclaredMethod("supportsCamera2ApiLocked", String.class);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(cameraManager, "0")).booleanValue();
            }
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cameraManager.getClass(), "supportsCamera2ApiLocked", String.class);
            method.setAccessible(true);
            return ((Boolean) method.invoke(cameraManager, "0")).booleanValue();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return true;
        }
    }

    public static boolean G(Rect rect) {
        return rect != null && !rect.isEmpty() && rect.left >= 0 && rect.right >= 0 && rect.top >= 0 && rect.bottom >= 0;
    }

    public static void H(int i10, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate(-i10);
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    public static void I(byte[] bArr, String str) {
        if (bArr == null) {
            q.e(f97741a, "Input null data, failed to save jpeg!");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    fileOutputStream2.write(bArr, 0, bArr.length);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        q.e(f97741a, "close FileOutputStream failed!");
                        e10.printStackTrace();
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    q.e(f97741a, "save jpeg failed！");
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            q.e(f97741a, "close FileOutputStream failed!");
                            e12.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            q.e(f97741a, "close FileOutputStream failed!");
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    @w0(api = 19)
    public static void J(Image.Plane[] planeArr, int i10, int i11, String str) {
        if (planeArr == null) {
            q.e(f97741a, "Input null plane, failed to save yuv!");
            return;
        }
        FileOutputStream fileOutputStream = null;
        if (planeArr[0] == null) {
            q.e(f97741a, "save yuv failed, plane is null");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(i10).putInt(i11).putInt(planeArr[0].getPixelStride()).putInt(planeArr[0].getRowStride());
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    fileOutputStream2.write(byteBufferAllocate.array());
                    for (Image.Plane plane : planeArr) {
                        ByteBuffer buffer = plane.getBuffer();
                        byte[] bArr = new byte[buffer.remaining()];
                        buffer.get(bArr);
                        fileOutputStream2.write(bArr);
                        buffer.rewind();
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        q.e(f97741a, "close FileOutputStream failed!");
                        e10.printStackTrace();
                    }
                } catch (IOException e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    q.e(f97741a, "save yuv failed!");
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            q.e(f97741a, "close FileOutputStream failed!");
                            e12.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            q.e(f97741a, "close FileOutputStream failed!");
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public static void K(int i10) {
        f97745e = i10;
    }

    private static TEFrameSizei a(@n0 List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            int i10 = tEFrameSizei3.f97206b;
            if (i10 > tEFrameSizei.f97206b && tEFrameSizei3.f97207c > tEFrameSizei.f97207c && (tEFrameSizei2 == null || i10 < tEFrameSizei2.f97206b)) {
                tEFrameSizei2 = tEFrameSizei3;
            }
        }
        if (tEFrameSizei2 != null) {
            return tEFrameSizei2;
        }
        return null;
    }

    public static TEFrameSizei b(@n0 List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        int i10;
        TEFrameSizei tEFrameSizei2 = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i11 = tEFrameSizei.f97206b;
        int i12 = tEFrameSizei.f97207c;
        float f10 = i11 / i12;
        ArrayList<TEFrameSizei> arrayList = new ArrayList();
        ArrayList<TEFrameSizei> arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (Float.compare(f10, tEFrameSizei3.f97206b / tEFrameSizei3.f97207c) == 0) {
                arrayList.add(tEFrameSizei3);
            } else {
                arrayList2.add(tEFrameSizei3);
            }
        }
        if (arrayList.isEmpty()) {
            Collections.sort(arrayList2, new k());
            for (TEFrameSizei tEFrameSizei4 : arrayList2) {
                if (tEFrameSizei2 == null || ((i10 = tEFrameSizei4.f97206b) >= i11 && tEFrameSizei4.f97207c >= i12)) {
                    tEFrameSizei2 = tEFrameSizei4;
                } else if (i10 < i11 && tEFrameSizei4.f97207c < i12) {
                    return tEFrameSizei2;
                }
            }
            return tEFrameSizei2;
        }
        Collections.sort(arrayList, new j());
        for (TEFrameSizei tEFrameSizei5 : arrayList) {
            if (tEFrameSizei2 != null) {
                int i13 = tEFrameSizei5.f97206b;
                if (i13 == i11 && tEFrameSizei5.f97207c == i12) {
                    return tEFrameSizei5;
                }
                if (i13 <= i11 || i13 >= tEFrameSizei2.f97206b) {
                    if (i13 < i11) {
                        return tEFrameSizei2;
                    }
                }
            }
            tEFrameSizei2 = tEFrameSizei5;
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei c(List<TEFrameSizei> list, float f10) {
        if (f10 <= 0.0f || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f10, tEFrameSizei.f97206b / tEFrameSizei.f97207c) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = f97755o;
            if (arrayList2.contains(arrayList3.get(14))) {
                return arrayList3.get(14);
            }
            if (arrayList.contains(arrayList3.get(16))) {
                return arrayList3.get(16);
            }
            Collections.sort(arrayList2, new b());
            return (TEFrameSizei) arrayList.get(arrayList.size() / 2);
        }
        ArrayList<TEFrameSizei> arrayList4 = f97755o;
        if (arrayList.contains(arrayList4.get(14))) {
            return arrayList4.get(14);
        }
        if (arrayList.contains(arrayList4.get(16))) {
            return arrayList4.get(16);
        }
        Collections.sort(arrayList, new a());
        return (TEFrameSizei) arrayList.get(0);
    }

    public static void d(Handler handler) {
        if (Thread.currentThread() != handler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static int e(int i10) {
        return f(i10, -1000, 1000);
    }

    public static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    public static boolean g(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static List<TEFrameSizei> i(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Camera.Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    @w0(api = 21)
    public static List<TEFrameRateRange> j(Range<Integer>[] rangeArr) {
        if (rangeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        for (Range<Integer> range : rangeArr) {
            arrayList.add(new TEFrameRateRange(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue()));
        }
        return arrayList;
    }

    @w0(api = 21)
    public static List<TEFrameSizei> k(List<Size> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Size size : list) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    @w0(api = 21)
    public static List<TEFrameSizei> l(Size[] sizeArr) {
        if (sizeArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sizeArr.length);
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    @w0(api = 21)
    public static Object m(String str, @TECameraSettings.e int i10, Context context, com.ss.android.ttvecamera.j.a aVar, Handler handler, com.ss.android.ttvecamera.j.e eVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = null;
        try {
            Method method = Class.forName(str).getMethod(TopicHashtagWrapper.TYPE_CREATE, Integer.TYPE, Context.class, com.ss.android.ttvecamera.j.a.class, Handler.class, com.ss.android.ttvecamera.j.e.class);
            method.setAccessible(true);
            objInvoke = method.invoke(null, Integer.valueOf(i10), context, aVar, handler, eVar);
        } catch (Exception e10) {
            Log.w("VESDK-TECameraUtils", "createCameraInstance for " + str + ", exception occurred.", e10);
        }
        q.k(f97741a, "createCameraInstance for " + str + ", cost time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms, cameraInstance = " + objInvoke);
        return objInvoke;
    }

    public static boolean n(Object obj) {
        try {
            if (f97751k == null || f97752l == null || f97753m == null) {
                f97751k = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                f97752l = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = f97751k.getDeclaredMethod("finalize", new Class[0]);
                f97753m = declaredMethod;
                declaredMethod.setAccessible(true);
                f97752l.setAccessible(true);
            }
            f97753m.invoke(f97752l.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException unused) {
            q.u(f97741a, "CameraMetadataNative class not found");
            return false;
        } catch (IllegalAccessException unused2) {
            q.u(f97741a, "illegal access");
            return false;
        } catch (NoSuchFieldException unused3) {
            q.u(f97741a, "mResults field not found");
            return false;
        } catch (NoSuchMethodException unused4) {
            q.u(f97741a, "finalize method not found");
            return false;
        } catch (InvocationTargetException unused5) {
            q.u(f97741a, "method invoke error");
            return false;
        } catch (Exception unused6) {
            q.u(f97741a, "unknown error");
            return false;
        }
    }

    @w0(api = 21)
    public static Object o(String str, String str2, Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(String.class, Class.class);
            if (declaredConstructor == null) {
                return null;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(str2, cls);
        } catch (Exception e10) {
            Log.w("VESDK-TECameraUtils", "generateCamera2Key for " + str + ", exception occurred.", e10);
            return null;
        }
    }

    public static String p() throws Throwable {
        if (!TextUtils.isEmpty(f97746f)) {
            return f97746f;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/cpuinfo"));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                bufferedReader2.close();
                                break;
                            }
                            if (line.startsWith("Hardware")) {
                                String[] strArrSplit = line.split(":");
                                if (strArrSplit.length > 1) {
                                    String strTrim = strArrSplit[1].trim();
                                    f97746f = strTrim;
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                    return strTrim;
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            String str = Build.HARDWARE;
                            f97746f = str;
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                }
                String str2 = Build.HARDWARE;
                f97746f = str2;
                return str2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
    }

    public static int[] q(int[] iArr, List<int[]> list) {
        int[] iArrR;
        if (list == null || list.size() <= 0) {
            q.b(f97741a, "supported fpsRange is null,use [7,30]");
            return new int[]{7, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr[0] > 1000) {
                if (iArr2[1] == 30000) {
                    arrayList.add(iArr2);
                } else {
                    arrayList2.add(iArr2);
                }
            } else if (iArr2[1] == 30) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (arrayList.isEmpty()) {
            iArrR = null;
            break;
        }
        Collections.sort(arrayList, new c());
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                iArrR = null;
                break;
            }
            iArrR = (int[]) it.next();
        } while (iArrR[0] > iArr[0]);
        if (iArrR == null) {
            iArrR = r(iArr, list);
        }
        q.b(f97741a, "calculate fps range = [" + iArrR[0] + Constants.ACCEPT_TIME_SEPARATOR_SP + iArrR[1] + "]");
        return iArrR;
    }

    public static int[] r(int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new d(iArr));
    }

    @w0(api = 21)
    public static Size s(@n0 List<Size> list, Size size) {
        return (Size) Collections.min(list, new g(size));
    }

    public static TEFrameSizei t(@n0 List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        return (TEFrameSizei) Collections.min(list, new f(tEFrameSizei));
    }

    public static TEFrameSizei u(@n0 List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, @n0 int i10, float f10) {
        TEFrameSizei tEFrameSizeiA;
        if (tEFrameSizei != null && tEFrameSizei.a()) {
            Iterator<TEFrameSizei> it = list.iterator();
            float f11 = (tEFrameSizei.f97206b * 1.0f) / tEFrameSizei.f97207c;
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (Math.abs(f11 - ((next.f97206b * 1.0f) / next.f97207c)) > f10) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new i());
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (tEFrameSizei3.f97206b <= i10) {
                tEFrameSizei2 = tEFrameSizei3;
                break;
            }
        }
        if ((f97754n & 8) == 0 ? (tEFrameSizei2 == null || tEFrameSizei2.f97206b < tEFrameSizei.f97206b || tEFrameSizei2.f97207c < tEFrameSizei.f97207c) && (tEFrameSizeiA = a(list, tEFrameSizei)) != null : (tEFrameSizei2 == null || tEFrameSizei2.f97206b <= tEFrameSizei.f97206b || tEFrameSizei2.f97207c <= tEFrameSizei.f97207c) && (tEFrameSizeiA = a(list, tEFrameSizei)) != null) {
            tEFrameSizei2 = tEFrameSizeiA;
        }
        if (tEFrameSizei2 == null) {
            q.e(f97741a, "getClosestSupportedSize failed, maxWidth: " + i10 + ", accuracy: " + f10 + ", previewSize: " + tEFrameSizei);
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei v(@n0 List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, @n0 TEFrameSizei tEFrameSizei2) {
        if (tEFrameSizei != null && tEFrameSizei.a()) {
            if (tEFrameSizei.equals(tEFrameSizei2) && list.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator<TEFrameSizei> it = list.iterator();
            while (it.hasNext()) {
                TEFrameSizei next = it.next();
                if (next.f97206b * tEFrameSizei.f97207c != next.f97207c * tEFrameSizei.f97206b) {
                    it.remove();
                }
            }
        }
        Collections.sort(list, new h());
        TEFrameSizei tEFrameSizei3 = null;
        for (TEFrameSizei tEFrameSizei4 : list) {
            if (tEFrameSizei3 != null) {
                if (tEFrameSizei4.f97206b == tEFrameSizei2.f97206b && tEFrameSizei4.f97207c == tEFrameSizei2.f97207c) {
                    return tEFrameSizei4;
                }
                int i10 = tEFrameSizei4.f97207c;
                int i11 = tEFrameSizei2.f97207c;
                if (i10 <= i11 || i10 >= tEFrameSizei3.f97207c) {
                    if (i10 < i11) {
                        return tEFrameSizei3;
                    }
                }
            }
            tEFrameSizei3 = tEFrameSizei4;
        }
        return tEFrameSizei3;
    }

    public static int w(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public static int[] x(int[] iArr, List<int[]> list) {
        int[] iArrR;
        if (list == null || list.size() <= 0) {
            q.b(f97741a, "supported fpsRange is null,use [30,30]");
            return new int[]{30, 30};
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int[] iArr2 : list) {
            if (iArr2[1] == iArr2[0]) {
                arrayList.add(iArr2);
            } else {
                arrayList2.add(iArr2);
            }
        }
        if (arrayList.isEmpty()) {
            iArrR = null;
            break;
        }
        Collections.sort(arrayList, new e());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                iArrR = null;
                break;
            }
            iArrR = (int[]) it.next();
            int i10 = iArrR[0];
            if ((i10 >= 15 && i10 <= 30) || (i10 >= 15000 && iArrR[1] <= 30000)) {
                if (iArr[1] == iArrR[1]) {
                    break;
                }
            }
        }
        if (iArrR == null) {
            iArrR = r(iArr, list);
        }
        q.b(f97741a, "calculate fps range = [" + iArrR[0] + Constants.ACCEPT_TIME_SEPARATOR_SP + iArrR[1] + "]");
        return iArrR;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    public static int[] y(int i10, int i11, int[] iArr, List<int[]> list) {
        int[] iArr2;
        q.b(f97741a, "requiredFpsRange : [" + iArr[0] + Constants.ACCEPT_TIME_SEPARATOR_SP + iArr[1] + "]");
        if (i10 == 1) {
            q.b(f97741a, "fixed framerate for all cameras");
            return x(iArr, list);
        }
        if (i10 == 2) {
            if (i11 == 0) {
                q.b(f97741a, "fixed framerate for rear camera");
                return x(iArr, list);
            }
            q.b(f97741a, "dynamic framerate for front camera");
            return q(iArr, list);
        }
        if (i10 == 3) {
            q.b(f97741a, "dynamic framerate without select");
            return r(iArr, list);
        }
        if (i10 != 4) {
            q.b(f97741a, "dynamic framerate");
            return q(iArr, list);
        }
        q.b(f97741a, "framerate by user");
        for (int[] iArr3 : list) {
            if (iArr3[0] == iArr[0] && iArr3[1] == iArr[1]) {
                iArr2 = iArr;
                if (iArr2 == null) {
                    return q(iArr, list);
                }
                return iArr2;
            }
        }
        iArr2 = null;
        if (iArr2 == null) {
            return q(iArr, list);
        }
        return iArr2;
    }

    public static List<TEFrameSizei> z(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
        list.retainAll(list2);
        return list;
    }
}
