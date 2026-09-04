package com.ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.n0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class TECameraSettings {
    public static final String A0 = "auto";
    public static final int A1 = 9;
    public static final String B0 = "barcode";
    public static final int B1 = 10;
    public static final String C0 = "beach";
    public static final int C1 = 0;
    public static final int D1 = 1;
    public static final String E0 = "fireworks";
    public static final int E1 = 2;
    public static final int F1 = 3;
    public static final int G1 = 60;
    public static final int H1 = 90;
    public static final String I0 = "night-portrait";
    public static final int I1 = 120;
    public static final int J1 = 480;
    public static final int K1 = 0;
    public static final int L1 = 1;
    public static final String M0 = "sports";
    public static final int M1 = 2;
    public static final String N0 = "steadyphoto";
    public static final int N1 = 3;
    public static final int O1 = 4;
    public static final String P0 = "theatre";
    public static final byte Q0 = 1;
    public static final byte R0 = 2;
    public static final int R1 = -1;
    public static final byte S0 = 1;
    public static final int S1 = 0;
    public static final byte T0 = 8;
    public static final int T1 = 1;
    public static final int U0 = 0;
    public static final int U1 = 2;
    public static final int V0 = 1;
    public static final int V1 = 3;
    public static final int W0 = 2;
    public static final int W1 = 4;
    public static final int X0 = 3;
    public static final String X1 = "auto";
    public static final int Y0 = 4;
    public static final String Y1 = "incandescent";
    public static final int Z0 = 5;
    public static final String Z1 = "fluorescent";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f97038a1 = 6;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f97039a2 = "warm-fluorescent";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f97040b1 = 7;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f97041b2 = "daylight";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f97042c1 = 8;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f97043c2 = "cloudy-daylight";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f97045d2 = "twilight";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f97046e1 = 1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f97047e2 = "shade";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f97048f1 = 2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final int f97049f2 = 0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f97050g1 = 1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final int f97051g2 = 1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f97052h1 = 2;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final int f97053h2 = 2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f97054i1 = 3;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final int f97055i2 = 3;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f97056j1 = 4;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f97057k1 = 5;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f97058l1 = 6;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f97059m1 = 7;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f97060n1 = 8;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f97061o1 = 9;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f97062p1 = 10;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f97063q1 = 11;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f97064r1 = 0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f97065s1 = 1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f97066t1 = 2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f97067u1 = 3;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f97068v1 = 4;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f97069w1 = 5;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f97070x1 = 6;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f97071y1 = 7;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f97072z0 = "action";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f97073z1 = 8;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public Bundle E;
    public byte F;
    public String G;
    public String H;
    public String I;
    public String J;
    public h K;
    public boolean L;
    public boolean M;

    @j
    public int N;

    @d
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f97074a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f97075a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    public int f97076b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f97077b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TEFrameRateRange f97078c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f97079c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @c
    public int f97080d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f97081d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97082e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @v
    public String f97083e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97084f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @g
    public int f97085f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f97086g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f97087g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f97088h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f97089h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f97090i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f97091i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f97092j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f97093j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97094k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f97095k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f97096l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f97097l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f97098m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f97099m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f97100n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f97101n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f97102o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f97103o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f97104p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f97105p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TEFrameSizei f97106q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f97107q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TEFrameSizei f97108r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f97109r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TEFrameSizei f97110s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f97111s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f97112t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f97113t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f97114u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f97115u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f97116v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f97117v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f97118w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f97119w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f97120x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f97121x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f97122y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ARConfig f97123y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f97124z;
    public static final String K0 = "portrait";
    public static final String J0 = "party";
    public static final String O0 = "sunset";
    public static final String D0 = "candlelight";
    public static final String H0 = "night";
    public static final String F0 = "hdr";
    public static final String G0 = "landscape";
    public static final String L0 = "snow";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String[] f97044d1 = {"auto", K0, J0, O0, D0, H0, F0, "action", G0, L0};
    public static final int[] P1 = {2, 0, 1, 3};
    public static final int[] Q1 = {1, 2, 0, 3};

    public static final class ARConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AugmentedFaceMode f97125a = AugmentedFaceMode.DISABLED;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CloudAnchorMode f97126b = CloudAnchorMode.DISABLED;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DepthMode f97127c = DepthMode.DISABLED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FocusMode f97128d = FocusMode.FIXED;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LightEstimationMode f97129e = LightEstimationMode.DISABLED;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PlaneFindingMode f97130f = PlaneFindingMode.DISABLED;

        public enum AugmentedFaceMode {
            DISABLED,
            MESH3D
        }

        public enum CloudAnchorMode {
            DISABLED,
            ENABLED
        }

        public enum DepthMode {
            DISABLED,
            AUTOMATIC
        }

        public enum FocusMode {
            FIXED,
            AUTO
        }

        public enum LightEstimationMode {
            DISABLED,
            AMBIENT_INTENSITY,
            ENVIRONMENTAL_HDR
        }

        public enum PlaneFindingMode {
            DISABLED,
            HORIZONTAL,
            VERTICAL,
            HORIZONTAL_AND_VERTICAL
        }
    }

    public interface a {
        void a(float[] fArr);
    }

    public interface b {
        void a(JSONObject jSONObject);
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface d {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface e {
    }

    public interface f {
        void a(int i10, int i11, int i12, @n0 byte[] bArr);

        void b(Exception exc);
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface g {
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f97131a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f97132b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f97133c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f97134d = 0.0f;

        public boolean a() {
            return this.f97131a > this.f97133c && this.f97134d > 0.001f;
        }

        public String toString() {
            return "ExposureCompensationInfo{max = " + this.f97131a + ", exposure = " + this.f97132b + ", min = " + this.f97133c + ", step = " + this.f97134d + z5.g.f141884d;
        }
    }

    public interface i {
        void a(float[] fArr);
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface j {
    }

    public static final class k {
        public static final String A = "device_support_multicamera_zoom";
        private static final Map<String, Class> B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f97135a = "facing";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f97136b = "support_light_soft";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f97137c = "device_support_wide_angle";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f97138d = "device_support_anti_shake";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f97139e = "device_support_camera";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f97140f = "device_wide_angle_camera_id";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f97141g = "support_super_stabilization";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f97142h = "support_wide_angle";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f97143i = "support_telephoto";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f97144j = "support_body_beauty";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f97145k = "support_anti_shake";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f97146l = "support_fps_480";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f97147m = "support_fps_120";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f97148n = "support_fps_60";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f97149o = "support_preview_sizes";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f97150p = "support_picture_sizes";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f97151q = "camera_support_fps_range";

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f97152r = "camera_preview_size";

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f97153s = "camera_focus_parameters";

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f97154t = "camera_torch_supported";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f97155u = "camera_sensor_orientation";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f97156v = "support_video_sizes";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f97157w = "device_support_wide_angle_mode";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f97158x = "device_support_antishake_mode";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f97159y = "device_support_ai_night_video";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f97160z = "device_should_use_shader_zoom";

        static {
            HashMap map = new HashMap();
            B = map;
            map.put(f97135a, Integer.class);
            map.put(f97157w, Integer.class);
            map.put(f97158x, Integer.class);
            map.put(f97159y, Integer.class);
            map.put(f97136b, Boolean.class);
            map.put(f97137c, Boolean.class);
            map.put(f97138d, Boolean.class);
            map.put(f97139e, Boolean.class);
            map.put(f97140f, String.class);
            map.put(f97142h, Boolean.class);
            map.put(f97143i, Boolean.class);
            map.put(f97144j, Boolean.class);
            map.put(f97145k, Boolean.class);
            map.put(f97146l, Boolean.class);
            map.put(f97147m, Boolean.class);
            map.put(f97148n, Boolean.class);
            map.put(f97149o, ArrayList.class);
            map.put(f97150p, ArrayList.class);
            map.put(f97152r, TEFrameSizei.class);
            map.put(f97153s, TEFocusParameters.class);
            map.put(f97154t, Boolean.class);
            map.put(f97156v, ArrayList.class);
            map.put(f97151q, ArrayList.class);
            map.put(f97160z, Boolean.class);
            map.put(A, Boolean.class);
        }

        public static Class a(String str) {
            Map<String, Class> map = B;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface l {
    }

    public interface m {
        void a(int i10);
    }

    public interface n {
        void a(int[] iArr);
    }

    public interface o {
        void a(float f10);
    }

    public static class p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f97161b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f97162c = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f97163a;

        public p(int i10) {
            this.f97163a = i10;
        }

        public int a() {
            return this.f97163a;
        }
    }

    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f97164a = "enable_body_beauty";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f97165b = "body_beauty_level";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f97166c = "enable_light_soft";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f97167d = "video_path";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f97168e = "enable_anti_shake";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f97169f = "enable_dim_light_quality";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f97170g = "enable_video_stabilization";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f97171h = "enable_super_Stabilization";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f97172i = "enable_ai_night_video";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f97173j = "enable_video_hdr";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f97174k = "video_fps";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f97175l = "aperture";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f97176m = "face_detect";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f97177n = "exposure_compensation";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f97178o = "flash_mode";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Map<String, Class> f97179p;

        static {
            HashMap map = new HashMap();
            f97179p = map;
            map.put(f97164a, Boolean.class);
            map.put(f97166c, Boolean.class);
            map.put(f97168e, Boolean.class);
            map.put(f97167d, String.class);
            map.put(f97165b, Integer.class);
            map.put(f97169f, Boolean.class);
            map.put(f97172i, Boolean.class);
            map.put(f97170g, Boolean.class);
            map.put(f97171h, Boolean.class);
            map.put(f97173j, Boolean.class);
            map.put(f97174k, int[].class);
            map.put(f97175l, Float.class);
            map.put(f97178o, Integer.class);
            map.put(f97176m, Integer.class);
            map.put(f97177n, Integer.class);
        }

        public static boolean a(String str, Object obj) {
            Map<String, Class> map = f97179p;
            return map.containsKey(str) && (obj == null || obj.getClass() == map.get(str));
        }
    }

    public interface r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f97180a = "errorCode=";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f97181b = 256;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f97182c = 42;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f97183d = -1000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f97184e = -1001;

        void a(Exception exc);

        void b(TECameraFrame tECameraFrame, com.ss.android.ttvecamera.j jVar);
    }

    public interface s {
        void a(int i10, float f10);
    }

    public interface t {
        void a(float f10);
    }

    public interface u {
        void a(long[] jArr);
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface v {
    }

    public interface w {
        boolean enableSmooth();

        void onChange(int i10, float f10, boolean z10);

        void onZoomSupport(int i10, boolean z10, boolean z11, float f10, List<Integer> list);
    }

    public TECameraSettings(@n0 Context context) {
        this.f97076b = 1;
        this.f97078c = new TEFrameRateRange(7, 30);
        this.f97080d = 0;
        this.f97082e = 0;
        this.f97084f = -1;
        this.f97086g = 17;
        this.f97088h = false;
        this.f97090i = false;
        this.f97092j = true;
        this.f97094k = false;
        this.f97096l = false;
        this.f97098m = false;
        this.f97100n = false;
        this.f97102o = false;
        this.f97104p = -1.0f;
        this.f97106q = new TEFrameSizei(1280, 720);
        this.f97108r = new TEFrameSizei(1920, 1080);
        this.f97110s = new TEFrameSizei(1920, 1080);
        this.f97112t = 1;
        this.f97114u = 0;
        this.f97116v = 0;
        this.f97118w = 0;
        this.f97120x = 1;
        this.f97122y = 0.0f;
        this.f97124z = false;
        this.A = false;
        this.B = 0;
        this.C = 1;
        this.D = 1;
        this.E = new Bundle();
        this.F = (byte) 1;
        this.G = "auto";
        this.H = "0";
        this.I = "0";
        this.J = "-1";
        this.K = new h();
        this.L = true;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = 50;
        this.U = false;
        this.V = false;
        this.W = 2500;
        this.X = 0;
        this.Y = 30;
        this.Z = false;
        this.f97075a0 = false;
        this.f97077b0 = false;
        this.f97079c0 = "";
        this.f97081d0 = 0;
        this.f97083e0 = "auto";
        this.f97085f0 = 1;
        this.f97087g0 = false;
        this.f97089h0 = false;
        this.f97091i0 = false;
        this.f97093j0 = false;
        this.f97095k0 = 5;
        this.f97099m0 = false;
        this.f97101n0 = false;
        this.f97103o0 = false;
        this.f97105p0 = false;
        this.f97107q0 = false;
        this.f97109r0 = false;
        this.f97111s0 = false;
        this.f97113t0 = -1.0f;
        this.f97115u0 = -1.0f;
        this.f97117v0 = false;
        this.f97119w0 = true;
        this.f97121x0 = 1.0f;
        this.f97123y0 = null;
        this.f97074a = context;
    }

    public TECameraSettings(@n0 Context context, int i10) {
        this.f97076b = 1;
        this.f97078c = new TEFrameRateRange(7, 30);
        this.f97080d = 0;
        this.f97082e = 0;
        this.f97084f = -1;
        this.f97086g = 17;
        this.f97088h = false;
        this.f97090i = false;
        this.f97092j = true;
        this.f97094k = false;
        this.f97096l = false;
        this.f97098m = false;
        this.f97100n = false;
        this.f97102o = false;
        this.f97104p = -1.0f;
        this.f97106q = new TEFrameSizei(1280, 720);
        this.f97108r = new TEFrameSizei(1920, 1080);
        this.f97110s = new TEFrameSizei(1920, 1080);
        this.f97112t = 1;
        this.f97114u = 0;
        this.f97116v = 0;
        this.f97118w = 0;
        this.f97120x = 1;
        this.f97122y = 0.0f;
        this.f97124z = false;
        this.A = false;
        this.B = 0;
        this.C = 1;
        this.D = 1;
        this.E = new Bundle();
        this.F = (byte) 1;
        this.G = "auto";
        this.H = "0";
        this.I = "0";
        this.J = "-1";
        this.K = new h();
        this.L = true;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = 50;
        this.U = false;
        this.V = false;
        this.W = 2500;
        this.X = 0;
        this.Y = 30;
        this.Z = false;
        this.f97075a0 = false;
        this.f97077b0 = false;
        this.f97079c0 = "";
        this.f97081d0 = 0;
        this.f97083e0 = "auto";
        this.f97085f0 = 1;
        this.f97087g0 = false;
        this.f97089h0 = false;
        this.f97091i0 = false;
        this.f97093j0 = false;
        this.f97095k0 = 5;
        this.f97099m0 = false;
        this.f97101n0 = false;
        this.f97103o0 = false;
        this.f97105p0 = false;
        this.f97107q0 = false;
        this.f97109r0 = false;
        this.f97111s0 = false;
        this.f97113t0 = -1.0f;
        this.f97115u0 = -1.0f;
        this.f97117v0 = false;
        this.f97119w0 = true;
        this.f97121x0 = 1.0f;
        this.f97123y0 = null;
        this.f97074a = context;
        this.f97076b = i10;
    }

    public TECameraSettings(@n0 Context context, int i10, int i11, int i12) {
        this.f97076b = 1;
        this.f97078c = new TEFrameRateRange(7, 30);
        this.f97080d = 0;
        this.f97082e = 0;
        this.f97084f = -1;
        this.f97086g = 17;
        this.f97088h = false;
        this.f97090i = false;
        this.f97092j = true;
        this.f97094k = false;
        this.f97096l = false;
        this.f97098m = false;
        this.f97100n = false;
        this.f97102o = false;
        this.f97104p = -1.0f;
        this.f97106q = new TEFrameSizei(1280, 720);
        this.f97108r = new TEFrameSizei(1920, 1080);
        this.f97110s = new TEFrameSizei(1920, 1080);
        this.f97112t = 1;
        this.f97114u = 0;
        this.f97116v = 0;
        this.f97118w = 0;
        this.f97120x = 1;
        this.f97122y = 0.0f;
        this.f97124z = false;
        this.A = false;
        this.B = 0;
        this.C = 1;
        this.D = 1;
        this.E = new Bundle();
        this.F = (byte) 1;
        this.G = "auto";
        this.H = "0";
        this.I = "0";
        this.J = "-1";
        this.K = new h();
        this.L = true;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = 50;
        this.U = false;
        this.V = false;
        this.W = 2500;
        this.X = 0;
        this.Y = 30;
        this.Z = false;
        this.f97075a0 = false;
        this.f97077b0 = false;
        this.f97079c0 = "";
        this.f97081d0 = 0;
        this.f97083e0 = "auto";
        this.f97085f0 = 1;
        this.f97087g0 = false;
        this.f97089h0 = false;
        this.f97091i0 = false;
        this.f97093j0 = false;
        this.f97095k0 = 5;
        this.f97099m0 = false;
        this.f97101n0 = false;
        this.f97103o0 = false;
        this.f97105p0 = false;
        this.f97107q0 = false;
        this.f97109r0 = false;
        this.f97111s0 = false;
        this.f97113t0 = -1.0f;
        this.f97115u0 = -1.0f;
        this.f97117v0 = false;
        this.f97119w0 = true;
        this.f97121x0 = 1.0f;
        this.f97123y0 = null;
        this.f97074a = context;
        this.f97076b = i10;
        TEFrameSizei tEFrameSizei = this.f97106q;
        tEFrameSizei.f97206b = i11;
        tEFrameSizei.f97207c = i12;
    }

    public TECameraSettings(@n0 Context context, int i10, int i11, int i12, int i13, int i14) {
        this(context, i10, i11, i12, i13, i14, false);
    }

    public TECameraSettings(@n0 Context context, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f97076b = 1;
        this.f97078c = new TEFrameRateRange(7, 30);
        this.f97080d = 0;
        this.f97082e = 0;
        this.f97084f = -1;
        this.f97086g = 17;
        this.f97088h = false;
        this.f97090i = false;
        this.f97092j = true;
        this.f97094k = false;
        this.f97096l = false;
        this.f97098m = false;
        this.f97100n = false;
        this.f97102o = false;
        this.f97104p = -1.0f;
        this.f97106q = new TEFrameSizei(1280, 720);
        this.f97108r = new TEFrameSizei(1920, 1080);
        this.f97110s = new TEFrameSizei(1920, 1080);
        this.f97112t = 1;
        this.f97114u = 0;
        this.f97116v = 0;
        this.f97118w = 0;
        this.f97120x = 1;
        this.f97122y = 0.0f;
        this.f97124z = false;
        this.A = false;
        this.B = 0;
        this.C = 1;
        this.D = 1;
        this.E = new Bundle();
        this.F = (byte) 1;
        this.G = "auto";
        this.H = "0";
        this.I = "0";
        this.J = "-1";
        this.K = new h();
        this.L = true;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = 50;
        this.U = false;
        this.V = false;
        this.W = 2500;
        this.X = 0;
        this.Y = 30;
        this.Z = false;
        this.f97075a0 = false;
        this.f97077b0 = false;
        this.f97079c0 = "";
        this.f97081d0 = 0;
        this.f97083e0 = "auto";
        this.f97085f0 = 1;
        this.f97087g0 = false;
        this.f97089h0 = false;
        this.f97091i0 = false;
        this.f97093j0 = false;
        this.f97095k0 = 5;
        this.f97099m0 = false;
        this.f97101n0 = false;
        this.f97103o0 = false;
        this.f97105p0 = false;
        this.f97107q0 = false;
        this.f97109r0 = false;
        this.f97111s0 = false;
        this.f97113t0 = -1.0f;
        this.f97115u0 = -1.0f;
        this.f97117v0 = false;
        this.f97119w0 = true;
        this.f97121x0 = 1.0f;
        this.f97123y0 = null;
        this.f97074a = context;
        this.f97076b = i10;
        TEFrameSizei tEFrameSizei = this.f97106q;
        tEFrameSizei.f97206b = i11;
        tEFrameSizei.f97207c = i12;
        tEFrameSizei.f97206b = i13;
        tEFrameSizei.f97207c = i14;
        this.f97090i = z10;
    }

    public void a() {
        this.f97074a = null;
        this.E.clear();
    }

    public TEFrameSizei b() {
        return this.f97108r;
    }

    public TEFrameSizei c() {
        return this.f97106q;
    }

    public boolean d() {
        return this.f97074a != null && this.f97106q.a() && this.f97108r.a() && this.f97078c.c();
    }

    public void e(TEFrameSizei tEFrameSizei) {
        this.f97108r = tEFrameSizei;
    }

    public void f(TEFrameSizei tEFrameSizei) {
        this.f97106q = tEFrameSizei;
    }
}
