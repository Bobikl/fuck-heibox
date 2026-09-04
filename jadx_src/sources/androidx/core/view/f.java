package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: compiled from: DisplayCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21536a = 3840;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f21537b = 2160;

    /* JADX INFO: compiled from: DisplayCompat.java */
    @androidx.annotation.w0(17)
    public static class a {
        private a() {
        }

        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* JADX INFO: compiled from: DisplayCompat.java */
    @androidx.annotation.w0(23)
    public static class b {
        private b() {
        }

        @androidx.annotation.n0
        static c a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Display display) {
            Display.Mode mode = display.getMode();
            Point pointA = f.a(context, display);
            return (pointA == null || d(mode, pointA)) ? new c(mode, true) : new c(mode, pointA);
        }

        @androidx.annotation.n0
        @SuppressLint({"ArrayReturn"})
        public static c[] b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointA = f.a(context, display);
            if (pointA == null || d(mode, pointA)) {
                for (int i10 = 0; i10 < supportedModes.length; i10++) {
                    cVarArr[i10] = new c(supportedModes[i10], e(supportedModes[i10], mode));
                }
            } else {
                for (int i11 = 0; i11 < supportedModes.length; i11++) {
                    cVarArr[i11] = e(supportedModes[i11], mode) ? new c(supportedModes[i11], pointA) : new c(supportedModes[i11], false);
                }
            }
            return cVarArr;
        }

        static boolean c(@androidx.annotation.n0 Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    /* JADX INFO: compiled from: DisplayCompat.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Display.Mode f21538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Point f21539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21540c;

        /* JADX INFO: compiled from: DisplayCompat.java */
        @androidx.annotation.w0(23)
        public static class a {
            private a() {
            }

            @androidx.annotation.u
            static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @androidx.annotation.u
            static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        c(@androidx.annotation.n0 Point point) {
            androidx.core.util.o.m(point, "physicalSize == null");
            this.f21539b = point;
            this.f21538a = null;
            this.f21540c = true;
        }

        @androidx.annotation.w0(23)
        c(@androidx.annotation.n0 Display.Mode mode, @androidx.annotation.n0 Point point) {
            androidx.core.util.o.m(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.o.m(point, "physicalSize == null");
            this.f21539b = point;
            this.f21538a = mode;
            this.f21540c = true;
        }

        @androidx.annotation.w0(23)
        c(@androidx.annotation.n0 Display.Mode mode, boolean z10) {
            androidx.core.util.o.m(mode, "mode == null, can't wrap a null reference");
            this.f21539b = new Point(a.b(mode), a.a(mode));
            this.f21538a = mode;
            this.f21540c = z10;
        }

        public int a() {
            return this.f21539b.y;
        }

        public int b() {
            return this.f21539b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f21540c;
        }

        @androidx.annotation.w0(23)
        @androidx.annotation.p0
        public Display.Mode d() {
            return this.f21538a;
        }
    }

    private f() {
    }

    static Point a(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Display display) {
        Point pointJ = Build.VERSION.SDK_INT < 28 ? j("sys.display-size", display) : j("vendor.display-size", display);
        if (pointJ != null) {
            return pointJ;
        }
        if (g(context) && f(display)) {
            return new Point(3840, 2160);
        }
        return null;
    }

    @androidx.annotation.n0
    private static Point b(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Display display) {
        Point pointA = a(context, display);
        if (pointA != null) {
            return pointA;
        }
        Point point = new Point();
        a.a(display, point);
        return point;
    }

    @androidx.annotation.n0
    public static c c(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Display display) {
        return b.a(context, display);
    }

    @androidx.annotation.n0
    @SuppressLint({"ArrayReturn"})
    public static c[] d(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Display display) {
        return b.b(context, display);
    }

    @androidx.annotation.p0
    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean f(@androidx.annotation.n0 Display display) {
        return b.c(display);
    }

    private static boolean g(@androidx.annotation.n0 Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean h(@androidx.annotation.n0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point i(@androidx.annotation.n0 String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i10 = Integer.parseInt(strArrSplit[0]);
            int i11 = Integer.parseInt(strArrSplit[1]);
            if (i10 > 0 && i11 > 0) {
                return new Point(i10, i11);
            }
        }
        throw new NumberFormatException();
    }

    @androidx.annotation.p0
    private static Point j(@androidx.annotation.n0 String str, @androidx.annotation.n0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String strE = e(str);
        if (!TextUtils.isEmpty(strE) && strE != null) {
            try {
                return i(strE);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
