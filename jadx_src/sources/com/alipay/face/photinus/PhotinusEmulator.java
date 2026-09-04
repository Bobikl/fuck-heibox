package com.alipay.face.photinus;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Camera;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.view.o;
import com.alibaba.fastjson.JSON;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class PhotinusEmulator implements VideoWriter.c {
    private static final String A = "ZOLOZ";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38838h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f38841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f38842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38844n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f38846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Uri f38847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f38848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g f38849s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private VideoWriter f38853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e f38854x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f38831a = {androidx.exifinterface.media.a.I0, androidx.exifinterface.media.a.f23296k1, androidx.exifinterface.media.a.f23240d1, androidx.exifinterface.media.a.f23281i2, androidx.exifinterface.media.a.f23320n1, androidx.exifinterface.media.a.f23264g1, androidx.exifinterface.media.a.U, androidx.exifinterface.media.a.f23223b0, androidx.exifinterface.media.a.K0, androidx.exifinterface.media.a.Y0, androidx.exifinterface.media.a.f23248e1, androidx.exifinterface.media.a.f23393w0, androidx.exifinterface.media.a.R0, androidx.exifinterface.media.a.f23272h1, androidx.exifinterface.media.a.W0, androidx.exifinterface.media.a.U0, androidx.exifinterface.media.a.V0, androidx.exifinterface.media.a.f23288j1, androidx.exifinterface.media.a.W, androidx.exifinterface.media.a.N0, androidx.exifinterface.media.a.T, androidx.exifinterface.media.a.f23304l1, androidx.exifinterface.media.a.H0, androidx.exifinterface.media.a.f23402x0, androidx.exifinterface.media.a.f23256f1, androidx.exifinterface.media.a.Q, androidx.exifinterface.media.a.J0, androidx.exifinterface.media.a.f23375u0, androidx.exifinterface.media.a.f23384v0, androidx.exifinterface.media.a.f23411y0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f38832b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f38839i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f38840j = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private State f38845o = State.INVALID;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList<d> f38850t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f38851u = new d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HashMap<String, String> f38852v = new HashMap<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Handler f38855y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Runnable f38856z = new a();

    public enum State {
        INVALID(false, true),
        READY(false, false),
        AWAITING_FRAMES(false, false),
        AWAITING_COMPLETION(false, false),
        IN_COMPLETION(true, false),
        AT_FAULT(false, true),
        COMPLETED(true, true);

        public final boolean isComplete;
        public final boolean isTerminalState;

        State(boolean z10, boolean z11) {
            this.isComplete = z10;
            this.isTerminalState = z11;
        }
    }

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (PhotinusEmulator.this.f38832b) {
                if (PhotinusEmulator.this.f38845o == State.COMPLETED) {
                    return;
                }
                PhotinusEmulator.this.f38845o = State.AT_FAULT;
                if (PhotinusEmulator.this.f38849s != null) {
                    PhotinusEmulator.this.f38849s.b("Timeout");
                    PhotinusEmulator.this.f38849s.a(null, null);
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f38858b;

        b(ConditionVariable conditionVariable) {
            this.f38858b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38858b.block(800L);
            Log.e("kaifu", "block ");
            PhotinusEmulator.this.n();
        }
    }

    public class c implements Camera.PictureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f38861b;

        c(Context context, ConditionVariable conditionVariable) {
            this.f38860a = context;
            this.f38861b = conditionVariable;
        }

        @Override // android.hardware.Camera.PictureCallback
        public void onPictureTaken(byte[] bArr, Camera camera) {
            try {
                try {
                    File file = new File(this.f38860a.getCacheDir(), "probe.jpg");
                    new FileOutputStream(file).write(bArr);
                    ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                    d dVar = new d();
                    dVar.f38904e = PhotinusEmulator.u(exifInterface, androidx.exifinterface.media.a.f23411y0);
                    dVar.f38903d = PhotinusEmulator.u(exifInterface, androidx.exifinterface.media.a.f23375u0);
                    dVar.f38905f = PhotinusEmulator.u(exifInterface, androidx.exifinterface.media.a.f23384v0);
                    dVar.f38906g = PhotinusEmulator.u(exifInterface, androidx.exifinterface.media.a.J0);
                    dVar.f38901b = camera.getParameters().getHorizontalViewAngle();
                    dVar.f38902c = camera.getParameters().getVerticalViewAngle();
                    HashMap<String, String> map = new HashMap<>();
                    for (String str : PhotinusEmulator.this.f38831a) {
                        String attribute = exifInterface.getAttribute(str);
                        if (attribute != null && !attribute.isEmpty()) {
                            map.put(str, attribute);
                        }
                    }
                    if (!map.containsKey(androidx.exifinterface.media.a.U)) {
                        map.put(androidx.exifinterface.media.a.U, new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).format(new Date()));
                    }
                    PhotinusEmulator.this.y(dVar);
                    PhotinusEmulator.this.x(map);
                } catch (FileNotFoundException unused) {
                    PhotinusEmulator.this.f38849s.d("ReadSampleFailure");
                } catch (IOException unused2) {
                    PhotinusEmulator.this.f38849s.d("saveSampleFailure");
                }
            } finally {
                Log.e("kaifu", "open ");
                this.f38861b.open();
            }
        }
    }

    private static void B(Uri uri, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(uri.getPath());
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f38846p;
        HashMap map = new HashMap();
        map.put("data-source", "antfincloud-production-android-2");
        map.put("device-name", Build.MODEL);
        map.put("total-time-ms", Long.valueOf(jCurrentTimeMillis));
        map.put("sequence-index", Integer.valueOf(this.f38835e));
        map.put("sequence-length", 5);
        map.put("sequence-periods", 3);
        map.put("sequence-repeat", Integer.valueOf(this.f38836f));
        map.put("sequence-margin", Integer.valueOf(this.f38837g));
        map.put("sequence-extra", 0);
        map.put("color-magnitude", Float.valueOf(this.f38839i));
        map.put("color-offset", Float.valueOf(this.f38840j));
        map.put("video-width", Integer.valueOf(this.f38834d));
        map.put("video-height", Integer.valueOf(this.f38833c));
        if (this.f38838h) {
            map.put("smooth-transition-length", 3);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.f38850t.iterator();
        while (it.hasNext()) {
            arrayList.add(t(it.next(), this.f38851u));
        }
        map.put("frame-metadata", arrayList);
        map.put("extra-exif", this.f38852v);
        B(this.f38848r, JSON.toJSONString(map).getBytes());
    }

    private static int[] i(int[] iArr, int i10) {
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr2[i11] = -7829368;
        }
        int[] iArr3 = new int[iArr.length + i10 + i10];
        System.arraycopy(iArr2, 0, iArr3, 0, i10);
        System.arraycopy(iArr, 0, iArr3, iArr.length, i10);
        System.arraycopy(iArr2, 0, iArr3, iArr.length + i10, i10);
        return iArr3;
    }

    private static int k(int i10, float f10, float f11) {
        return (int) ((((i10 / 255.0f) * f10) + f11) * 255.0f);
    }

    private static int[] l(int i10) {
        return new int[]{-16776961, o.f21773u, o.f21773u, -1, -16711936};
    }

    private static int[] m(int[] iArr, float f10, float f11) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = Color.rgb(k(Color.red(i11), f10, f11), k(Color.green(i11), f10, f11), k(Color.blue(i11), f10, f11));
        }
        return iArr;
    }

    private static String o(int i10) {
        Locale locale = Locale.US;
        return new SimpleDateFormat("yy.M.dd.HH.mm.ss.SSS", locale).format(new Date()) + String.format(locale, "_n%d_k%d_d%d_p%d_i%d", 5, 2, 3, 3, Integer.valueOf(i10));
    }

    private static Uri r(Context context) {
        return Uri.withAppendedPath(Uri.fromFile(context.getCacheDir()), "ZLZPhontinus");
    }

    private static HashMap<String, Object> t(d dVar, d dVar2) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("light-sensor", Float.valueOf(dVar.f38900a));
        map.put("horizontal-view-angle", Float.valueOf(dVar2.f38901b));
        map.put("vertical-view-angle", Float.valueOf(dVar2.f38902c));
        map.put("brightness-value", dVar2.f38906g);
        map.put("f-number", dVar2.f38905f);
        map.put("iso-speed", dVar2.f38904e);
        map.put("exposure-time", dVar2.f38903d);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Float u(ExifInterface exifInterface, String str) {
        String attribute = exifInterface.getAttribute(str);
        if (attribute == null || attribute.isEmpty()) {
            return null;
        }
        return Float.valueOf((float) exifInterface.getAttributeDouble(str, Double.NaN));
    }

    private boolean v() {
        return this.f38844n - this.f38842l.length >= 0;
    }

    public void A(float f10, float f11) {
        if (f11 < 0.0f || f10 + f11 > 1.0f) {
            Log.e(A, "Invalid color sequence transformation");
            return;
        }
        synchronized (this.f38832b) {
            if (this.f38845o == State.READY) {
                int[] iArr = this.f38841k;
                this.f38839i = f10;
                this.f38840j = f11;
                this.f38842l = m(iArr, f10, f11);
            }
        }
    }

    @Override // com.alipay.face.photinus.VideoWriter.c
    public void a(VideoWriter videoWriter) {
        synchronized (this.f38832b) {
            if (videoWriter == this.f38853w || this.f38845o == State.IN_COMPLETION) {
                this.f38855y.removeCallbacks(this.f38856z);
                C();
                this.f38845o = State.COMPLETED;
                g gVar = this.f38849s;
                if (gVar != null) {
                    gVar.a(this.f38847q, this.f38848r);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[PHI: r4
  0x004d: PHI (r4v1 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v3 java.lang.Integer) binds: [B:5:0x000a, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    public void h(com.alipay.face.photinus.c cVar) {
        boolean z10;
        Integer numValueOf;
        synchronized (this.f38832b) {
            z10 = true;
            numValueOf = null;
            if (this.f38845o != State.AWAITING_FRAMES) {
                z10 = false;
            } else {
                if (this.f38844n >= 0) {
                    cVar.f38898b.f38900a = this.f38854x.b();
                    this.f38853w.t(cVar);
                    this.f38850t.add(cVar.f38898b);
                }
                int i10 = this.f38843m;
                int[] iArr = this.f38842l;
                numValueOf = i10 < iArr.length ? Integer.valueOf(iArr[i10]) : null;
                this.f38844n++;
                this.f38843m++;
                if (v()) {
                    numValueOf = -1;
                    this.f38845o = State.AWAITING_COMPLETION;
                } else {
                    z10 = false;
                }
            }
        }
        g gVar = this.f38849s;
        if (gVar != null) {
            if (numValueOf != null) {
                gVar.c(numValueOf.intValue());
            }
            if (z10) {
                this.f38849s.e();
            }
        }
    }

    public void j() {
        synchronized (this.f38832b) {
            if (this.f38845o != State.READY) {
                return;
            }
            this.f38843m = 0;
            this.f38844n = -3;
            this.f38850t.clear();
            this.f38845o = State.AWAITING_FRAMES;
            this.f38846p = System.currentTimeMillis();
            g gVar = this.f38849s;
            if (gVar != null) {
                gVar.f();
            }
        }
    }

    public void n() {
        g gVar;
        boolean z10 = !this.f38853w.C();
        synchronized (this.f38832b) {
            if (this.f38845o == State.AWAITING_COMPLETION) {
                this.f38845o = State.IN_COMPLETION;
                if (!z10) {
                    this.f38853w.v();
                    this.f38855y.postDelayed(this.f38856z, 3000L);
                }
            }
        }
        if (!z10 || (gVar = this.f38849s) == null) {
            return;
        }
        gVar.b("AtFault");
        this.f38849s.a(null, null);
    }

    public void p() {
        synchronized (this.f38832b) {
            e eVar = this.f38854x;
            if (eVar != null) {
                eVar.a();
            }
            VideoWriter videoWriter = this.f38853w;
            if (videoWriter != null) {
                videoWriter.v();
                this.f38853w = null;
            }
            this.f38845o = State.INVALID;
        }
    }

    public State q() {
        State state;
        synchronized (this.f38832b) {
            state = this.f38845o;
        }
        return state;
    }

    public boolean s(Context context, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        synchronized (this.f38832b) {
            boolean z11 = false;
            if (!this.f38845o.isTerminalState) {
                return false;
            }
            h.a();
            Uri uriR = r(context);
            File file = new File(uriR.getPath());
            if ((!file.exists() || file.delete()) && !file.mkdir()) {
                z11 = true;
            }
            this.f38836f = i14;
            this.f38837g = i13;
            this.f38833c = i10;
            this.f38834d = i11;
            this.f38835e = i12;
            this.f38838h = z10;
            int[] iArrL = l(i12);
            this.f38841k = iArrL;
            if (this.f38838h) {
                this.f38841k = com.alipay.face.photinus.b.b(com.alipay.face.photinus.b.e(com.alipay.face.photinus.b.a(com.alipay.face.photinus.b.d(iArrL, 3), i13), 3));
            } else {
                this.f38841k = i(iArrL, this.f38837g);
            }
            this.f38842l = this.f38841k;
            String strO = o(this.f38835e);
            this.f38847q = Uri.withAppendedPath(uriR, strO + ".mp4");
            this.f38848r = Uri.withAppendedPath(uriR, strO + ".json");
            VideoWriter videoWriter = new VideoWriter(this);
            this.f38853w = videoWriter;
            if (!z11) {
                videoWriter.D(this.f38847q, this.f38833c, this.f38834d);
            }
            this.f38854x = new e(context);
            this.f38851u = new d();
            this.f38852v = new HashMap<>();
            this.f38845o = State.READY;
            return true;
        }
    }

    public void w(g gVar) {
        this.f38849s = gVar;
    }

    public void x(HashMap<String, String> map) {
        this.f38852v = map;
    }

    public void y(d dVar) {
        this.f38851u = dVar;
    }

    public void z(Camera camera, Context context) {
        if (camera == null) {
            n();
            this.f38849s.d("NullCameraInstance");
        } else {
            ConditionVariable conditionVariable = new ConditionVariable();
            h.a().b(new b(conditionVariable));
            camera.takePicture(null, null, new c(context, conditionVariable));
        }
    }
}
