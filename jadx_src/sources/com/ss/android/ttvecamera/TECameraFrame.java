package com.ss.android.ttvecamera;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Rational;
import com.huawei.hms.mlsdk.common.MLFrame;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes8.dex */
public class TECameraFrame {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96852f = "TECameraFrame";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f96853g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f96854h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f96855i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f96856j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f96857k = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f96858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f96859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f96860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f96861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f96862e;

    public enum ETEPixelFormat {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count,
        PIXEL_FORMAT_Recorder,
        PIXEL_FORMAT_RAW_SENSOR
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96863a;

        static {
            int[] iArr = new int[ETEPixelFormat.values().length];
            f96863a = iArr;
            try {
                iArr[ETEPixelFormat.PIXEL_FORMAT_YUV420.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_YUV420P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_YUV422P.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_YUYV422.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_UYVY422.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_RGB8.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_RGBA8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_JPEG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_GRAY8.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_BGR8.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_NV12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_GRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f96863a[ETEPixelFormat.PIXEL_FORMAT_Count.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static class b extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f96864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte[] f96865h;

        public b(int i10, int i11, long j10, byte[] bArr, int i12, ETEPixelFormat eTEPixelFormat, int i13) {
            super(i10, i11, j10, i13);
            this.f96868c = 2;
            this.f96869d = i12;
            this.f96867b = eTEPixelFormat;
            this.f96865h = bArr;
            this.f96864g = i10 * i11 * 4;
        }

        public byte[] a() {
            return this.f96865h;
        }

        public int b() {
            return this.f96864g;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TEFrameSizei f96866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ETEPixelFormat f96867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f96868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f96869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f96870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f96871f;

        public c(int i10, int i11, long j10) {
            this(i10, i11, j10, 0);
        }

        public c(int i10, int i11, long j10, int i12) {
            this.f96868c = 0;
            this.f96866a = new TEFrameSizei(i10, i11);
            this.f96870e = j10;
            this.f96871f = i12;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96872a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f96873b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f96874c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TotalCaptureResult f96875d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f96876e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f96877f = 0;

        public HashMap<String, String> a() {
            HashMap<String, String> map = new HashMap<>();
            if (this.f96874c != -1) {
                TimeZone timeZone = TimeZone.getDefault();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
                simpleDateFormat.setTimeZone(timeZone);
                String str = simpleDateFormat.format(Long.valueOf(this.f96874c));
                if (str != null) {
                    map.put(androidx.exifinterface.media.a.U, str);
                    int i10 = Build.VERSION.SDK_INT;
                    map.put(androidx.exifinterface.media.a.f23319n0, str);
                    if (i10 >= 24) {
                        map.put(androidx.exifinterface.media.a.f23311m0, str);
                    }
                }
            }
            int i11 = this.f96872a;
            if (i11 != -1) {
                map.put(androidx.exifinterface.media.a.f23401x, String.valueOf(i11));
                if (Build.VERSION.SDK_INT >= 24) {
                    map.put(androidx.exifinterface.media.a.f23255f0, String.valueOf(this.f96872a));
                }
            }
            int i12 = this.f96873b;
            if (i12 != -1) {
                map.put(androidx.exifinterface.media.a.f23410y, String.valueOf(i12));
                if (Build.VERSION.SDK_INT >= 24) {
                    map.put(androidx.exifinterface.media.a.f23263g0, String.valueOf(this.f96873b));
                }
            }
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                map.put(androidx.exifinterface.media.a.W, str2);
            }
            String str3 = Build.MODEL;
            if (str3 != null) {
                map.put(androidx.exifinterface.media.a.X, str3);
            }
            TotalCaptureResult totalCaptureResult = this.f96875d;
            if (totalCaptureResult != null) {
                int i13 = Build.VERSION.SDK_INT;
                Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l10 != null) {
                    map.put(androidx.exifinterface.media.a.f23375u0, String.valueOf(new Rational((int) (l10.longValue() / 1000000), 1000).floatValue()));
                }
                Integer num = (Integer) this.f96875d.get(CaptureResult.CONTROL_AWB_MODE);
                if (num != null) {
                    if (num.intValue() == 1) {
                        map.put(androidx.exifinterface.media.a.f23256f1, String.valueOf(0));
                    } else {
                        map.put(androidx.exifinterface.media.a.f23256f1, String.valueOf(1));
                    }
                }
                if (i13 >= 24) {
                    Float f10 = (Float) this.f96875d.get(CaptureResult.LENS_FOCAL_LENGTH);
                    if (f10 != null) {
                        map.put(androidx.exifinterface.media.a.R0, new Rational((int) (f10.floatValue() * 1000.0f), 1000).toString());
                    }
                    Integer num2 = (Integer) this.f96875d.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                    Integer num3 = (Integer) this.f96875d.get(CaptureResult.SENSOR_SENSITIVITY);
                    if (num3 != null && num2 != null) {
                        map.put(androidx.exifinterface.media.a.f23411y0, String.valueOf((num3.intValue() * num2.intValue()) / 100));
                    }
                    Float f11 = (Float) this.f96875d.get(CaptureResult.LENS_APERTURE);
                    if (f11 != null) {
                        map.put(androidx.exifinterface.media.a.f23384v0, String.valueOf(f11));
                    }
                }
            }
            return map;
        }

        public HashMap<String, Integer> b() {
            HashMap<String, Integer> map = new HashMap<>();
            TotalCaptureResult totalCaptureResult = this.f96875d;
            if (totalCaptureResult != null) {
                int i10 = Build.VERSION.SDK_INT;
                Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l10 != null) {
                    map.put("exposuretime", Integer.valueOf(new Rational((int) (l10.longValue() / 1000000), 1000).intValue()));
                }
                if (i10 >= 24) {
                    Integer num = (Integer) this.f96875d.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
                    Integer num2 = (Integer) this.f96875d.get(CaptureResult.SENSOR_SENSITIVITY);
                    if (num2 != null && num != null) {
                        map.put("iso", Integer.valueOf((num2.intValue() * num.intValue()) / 100));
                    }
                    int i11 = this.f96876e;
                    if (i11 != -1) {
                        map.put("maxiso", Integer.valueOf(i11));
                    }
                    int i12 = this.f96877f;
                    if (i12 != -1) {
                        map.put("minIso", Integer.valueOf(i12));
                    }
                }
            }
            return map;
        }
    }

    public static class e extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        r f96878g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        DngCreator f96879h;

        public e(int i10, int i11, long j10, r rVar, int i12, ETEPixelFormat eTEPixelFormat, int i13, DngCreator dngCreator) {
            super(i10, i11, j10, i13);
            this.f96868c = 4;
            this.f96869d = i12;
            this.f96867b = eTEPixelFormat;
            this.f96878g = rVar;
            this.f96879h = dngCreator;
        }

        public DngCreator a() {
            return this.f96879h;
        }

        public r b() {
            return this.f96878g;
        }
    }

    public static class f extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f96880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float[] f96881h;

        public f(int i10, int i11, long j10, int i12, int i13, float[] fArr, ETEPixelFormat eTEPixelFormat, int i14) {
            super(i10, i11, j10, i14);
            this.f96868c = 1;
            this.f96880g = i12;
            this.f96869d = i13;
            this.f96881h = fArr;
            this.f96867b = eTEPixelFormat;
        }

        public float[] b() {
            return this.f96881h;
        }

        public int c() {
            return this.f96880g;
        }
    }

    public static class g extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        byte[] f96882g;

        public g(int i10, int i11, long j10, byte[] bArr, int i12, ETEPixelFormat eTEPixelFormat, int i13) {
            super(i10, i11, j10, i13);
            this.f96868c = 3;
            this.f96869d = i12;
            this.f96867b = eTEPixelFormat;
            this.f96882g = bArr;
        }

        public byte[] a() {
            return this.f96882g;
        }
    }

    public static class h extends c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        r f96883g;

        public h(int i10, int i11, long j10, r rVar, int i12, ETEPixelFormat eTEPixelFormat, int i13) {
            super(i10, i11, j10, i13);
            this.f96868c = 3;
            this.f96869d = i12;
            this.f96867b = eTEPixelFormat;
            this.f96883g = rVar;
        }

        public r a() {
            return this.f96883g;
        }
    }

    public TECameraFrame(int i10, int i11, long j10) {
        this.f96862e = new c(0, 0, 0L);
        this.f96858a = i10;
        this.f96859b = i11;
        this.f96860c = j10;
    }

    public TECameraFrame(r rVar, ETEPixelFormat eTEPixelFormat, int i10, int i11, int i12) {
        this(i10, i11, 0L);
        t(rVar, i12, eTEPixelFormat, 0);
    }

    public TECameraFrame(r rVar, ETEPixelFormat eTEPixelFormat, int i10, int i11, int i12, DngCreator dngCreator) {
        this(i10, i11, 0L);
        q(rVar, i12, eTEPixelFormat, 0, dngCreator);
    }

    public TECameraFrame(byte[] bArr, ETEPixelFormat eTEPixelFormat, int i10, int i11, int i12) {
        this(i10, i11, 0L);
        p(bArr, i12, eTEPixelFormat, 0);
    }

    public static ETEPixelFormat o(int i10, int i11) {
        if (i11 == 2) {
            return ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES;
        }
        if (i11 == 1) {
            if (i10 == 41) {
                return ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGB8;
            }
            return i10 == 42 ? ETEPixelFormat.PIXEL_FORMAT_OpenGL_RGBA8 : ETEPixelFormat.PIXEL_FORMAT_Count;
        }
        if (i11 != 0) {
            return ETEPixelFormat.PIXEL_FORMAT_Count;
        }
        if (i10 == 17) {
            return ETEPixelFormat.PIXEL_FORMAT_NV21;
        }
        if (i10 == 35) {
            return ETEPixelFormat.PIXEL_FORMAT_YUV420P;
        }
        if (i10 == 39) {
            return ETEPixelFormat.PIXEL_FORMAT_YUV422P;
        }
        if (i10 == 256) {
            return ETEPixelFormat.PIXEL_FORMAT_JPEG;
        }
        if (i10 != 41) {
            return i10 != 42 ? ETEPixelFormat.PIXEL_FORMAT_Count : ETEPixelFormat.PIXEL_FORMAT_RGBA8;
        }
        return ETEPixelFormat.PIXEL_FORMAT_RGB8;
    }

    public static int u(ETEPixelFormat eTEPixelFormat) {
        switch (a.f96863a[eTEPixelFormat.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return MLFrame.Property.IMAGE_FORMAT_YV12;
            case 3:
                return 17;
            case 4:
                return 16;
            case 5:
            case 6:
                return 39;
            case 7:
                return 41;
            case 8:
                return 42;
            case 9:
                return 256;
            default:
                return 0;
        }
    }

    public void a(String str) {
        if (this.f96862e == null) {
            q.e(f96852f, "frame is null, dump failed!");
            return;
        }
        String str2 = str + "_TECameraFrame" + (lg.a.f131412e + k().f97206b + "x" + k().f97207c) + (lg.a.f131412e + System.currentTimeMillis());
        int i10 = a.f96863a[h().ordinal()];
        if (i10 == 1) {
            String str3 = str2 + "_YUV420.yuv";
            q.k(f96852f, "Start to dump TECameraFrame to " + str3);
            if (i() != null) {
                p.J(i().b(), k().f97206b, k().f97207c, str3);
                return;
            } else {
                q.e(f96852f, "plane is null, dump failed!");
                return;
            }
        }
        if (i10 != 9) {
            q.e(f96852f, "unexpected dump image format: " + h());
            return;
        }
        String str4 = str2 + "_JPEG.jpeg";
        q.k(f96852f, "Start to dump TECameraFrame to " + str4);
        p.I(e(), str4);
    }

    public byte[] b() {
        c cVar = this.f96862e;
        if (cVar instanceof b) {
            return ((b) cVar).a();
        }
        return null;
    }

    public int c() {
        c cVar = this.f96862e;
        if (cVar instanceof b) {
            return ((b) cVar).b();
        }
        return 0;
    }

    public int d() {
        return this.f96862e.f96871f;
    }

    public byte[] e() {
        if (h() != ETEPixelFormat.PIXEL_FORMAT_JPEG) {
            q.e(f96852f, "Current format is " + h() + ", could not get jpeg data!");
            return null;
        }
        c cVar = this.f96862e;
        if (cVar instanceof b) {
            return ((b) cVar).a();
        }
        if (!(cVar instanceof h)) {
            q.e(f96852f, "Unexpected frame instance! Failed to get jpeg data.");
            return null;
        }
        ByteBuffer byteBufferA = ((h) cVar).a().a(0);
        byteBufferA.rewind();
        byte[] bArr = new byte[byteBufferA.remaining()];
        byteBufferA.get(bArr);
        return bArr;
    }

    public float[] f() {
        c cVar = this.f96862e;
        if (cVar instanceof f) {
            return ((f) cVar).b();
        }
        return null;
    }

    public d g() {
        return this.f96861d;
    }

    public ETEPixelFormat h() {
        return this.f96862e.f96867b;
    }

    public r i() {
        c cVar = this.f96862e;
        if (cVar instanceof h) {
            return ((h) cVar).a();
        }
        return null;
    }

    public int j() {
        return this.f96862e.f96869d;
    }

    public TEFrameSizei k() {
        return this.f96862e.f96866a;
    }

    public int l() {
        c cVar = this.f96862e;
        if (cVar instanceof f) {
            return ((f) cVar).c();
        }
        return 0;
    }

    public long m() {
        return this.f96860c;
    }

    public int n() {
        return this.f96862e.f96868c;
    }

    public void p(byte[] bArr, int i10, ETEPixelFormat eTEPixelFormat, int i11) {
        this.f96862e = new b(this.f96858a, this.f96859b, this.f96860c, bArr, i10, eTEPixelFormat, i11);
    }

    public void q(r rVar, int i10, ETEPixelFormat eTEPixelFormat, int i11, DngCreator dngCreator) {
        this.f96862e = new e(this.f96858a, this.f96859b, this.f96860c, rVar, i10, eTEPixelFormat, i11, dngCreator);
    }

    public void r(int i10, int i11, float[] fArr, ETEPixelFormat eTEPixelFormat, int i12) {
        this.f96862e = new f(this.f96858a, this.f96859b, this.f96860c, i10, i11, fArr, eTEPixelFormat, i12);
    }

    public void s(byte[] bArr, int i10, ETEPixelFormat eTEPixelFormat, int i11) {
        this.f96862e = new g(this.f96858a, this.f96859b, this.f96860c, bArr, i10, eTEPixelFormat, i11);
    }

    public void t(r rVar, int i10, ETEPixelFormat eTEPixelFormat, int i11) {
        this.f96862e = new h(this.f96858a, this.f96859b, this.f96860c, rVar, i10, eTEPixelFormat, i11);
    }

    public void v(d dVar) {
        this.f96861d = dVar;
    }

    public void w(int i10) {
        c cVar = this.f96862e;
        if (cVar instanceof f) {
            ((f) cVar).f96880g = i10;
        }
    }
}
