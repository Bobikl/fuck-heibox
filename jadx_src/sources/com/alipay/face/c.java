package com.alipay.face;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.face.camera.e;
import com.alipay.face.camera.f;
import com.alipay.face.config.AndroidClientConfig;
import com.alipay.face.config.DeviceSetting;
import com.alipay.face.config.OSSConfig;
import com.alipay.face.config.Protocol;
import com.alipay.face.config.ProtocolContent;
import com.alipay.face.config.SDKAction;
import com.alipay.face.config.Upload;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.network.model.OCRInfo;
import com.alipay.face.photinus.PhotinusEmulator;
import com.alipay.face.photinus.g;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.TGDepthFrame;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.alipay.zoloz.toyger.face.ToygerFaceCallback;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.alipay.zoloz.toyger.face.ToygerFaceState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import ol.d;

/* JADX INFO: compiled from: ToygerPresenter.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements ToygerFaceCallback, e {
    private static c L = new c();
    private String A;
    private String B;
    private PhotinusEmulator F;
    private int G;
    private Long H;
    private byte[] I;
    private byte[] J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f38600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ToygerFaceService f38601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Protocol f38602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OSSConfig f38603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Bitmap f38604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f38605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ToygerFaceAttr f38606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f38607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f38609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Handler f38610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.alipay.face.api.c f38611n;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f38619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f38620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte[] f38621x;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WorkState f38612o = WorkState.INIT;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AtomicBoolean f38613p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38614q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map<String, Object> f38615r = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38616s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<Bitmap> f38617t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f38618u = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f38622y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38623z = 0;
    private int C = 0;
    private boolean D = false;
    private boolean E = true;
    private OCRInfo K = null;

    /* JADX INFO: compiled from: ToygerPresenter.java */
    public class a implements ol.b<Bitmap> {
        a() {
        }

        @Override // ol.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap next() {
            Bitmap bitmap = (Bitmap) c.this.f38617t.get(c.this.f38618u);
            c.g(c.this);
            return bitmap;
        }

        @Override // ol.b
        public boolean hasNext() {
            return c.this.f38618u < c.this.f38617t.size();
        }

        @Override // ol.b
        public int size() {
            return c.this.f38617t.size();
        }
    }

    /* JADX INFO: compiled from: ToygerPresenter.java */
    public class b implements d {
        b() {
        }

        @Override // ol.d
        public void a(int i10) {
        }
    }

    /* JADX INFO: renamed from: com.alipay.face.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ToygerPresenter.java */
    public class C0295c implements g {
        C0295c() {
        }

        @Override // com.alipay.face.photinus.g
        public void a(Uri uri, Uri uri2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "photinusFileReady", "elapsedTime", Long.toString(System.currentTimeMillis() - c.this.H.longValue()));
            if (uri != null) {
                c.this.B = uri.getPath();
            }
            if (uri2 != null) {
                c.this.A = uri2.getPath();
            }
            c.this.D = false;
            c.this.X();
        }

        @Override // com.alipay.face.photinus.g
        public void b(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "photinusEncoderError", "reason", str);
        }

        @Override // com.alipay.face.photinus.g
        public void c(int i10) {
            c.this.Y(i10);
        }

        @Override // com.alipay.face.photinus.g
        public void d(String str) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "photinusTakePicture", "reason", str);
        }

        @Override // com.alipay.face.photinus.g
        public void e() {
            ToygerLog.e("onHasEnoughFrames");
            c.this.f38610m.sendEmptyMessage(913);
            c.this.b0();
        }

        @Override // com.alipay.face.photinus.g
        public void f() {
            if (c.this.f38600c != null) {
                c.this.f38600c.A();
            }
            ToygerLog.e("onLockCameraParameterRequest");
        }
    }

    private void N(com.alipay.face.camera.c cVar) {
        ToygerCameraConfig toygerCameraConfig = new ToygerCameraConfig();
        f fVar = this.f38600c;
        if (fVar != null) {
            this.f38615r.put(ToygerBaseService.KEY_IS_MIRROR, Boolean.toString(fVar.u()));
            com.alipay.face.camera.d dVarL = this.f38600c.l();
            if (dVarL != null) {
                toygerCameraConfig.colorIntrin = dVarL.f38694a;
                toygerCameraConfig.depthIntrin = dVarL.f38695b;
                toygerCameraConfig.color2depthExtrin = dVarL.f38696c;
                toygerCameraConfig.isAligned = dVarL.f38697d;
            }
            toygerCameraConfig.roiRect = this.f38600c.c();
        }
        this.f38615r.put(ToygerBaseService.KEY_CAMERA_CONFIG, toygerCameraConfig);
        ToygerFaceService toygerFaceService = this.f38601d;
        if (toygerFaceService == null || toygerFaceService.config(this.f38615r)) {
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "faceServiceConfig", "status", "false");
        d0(com.alipay.face.b.a.f38574b);
    }

    private void O(AndroidClientConfig androidClientConfig) {
        this.f38615r.put("porting", "JRCloud");
        this.f38615r.put(ToygerBaseService.KEY_PUBLIC_KEY, D());
        this.f38615r.put("meta_serializer", Integer.toString(1));
        this.f38615r.put(ToygerBaseService.KEY_LOCAL_MATCHING_COMMAND, androidClientConfig.getVerifyMode());
        this.f38615r.put(ToygerBaseService.KEY_ALGORITHM_CONFIG, androidClientConfig.getAlgorithm().toJSONString());
        this.f38615r.put(ToygerBaseService.KEY_UPLOAD_CONFIG, androidClientConfig.getUpload().toJSONString());
    }

    private boolean P() {
        DeviceSetting deviceSetting;
        AndroidClientConfig androidClientConfigR = r();
        if (androidClientConfigR == null) {
            return false;
        }
        DeviceSetting[] deviceSettings = androidClientConfigR.getDeviceSettings();
        return deviceSettings.length > 0 && (deviceSetting = deviceSettings[0]) != null && !deviceSetting.isCameraAuto() && deviceSetting.getCameraID() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i10) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 912;
        messageObtain.arg1 = i10;
        this.f38610m.sendMessage(messageObtain);
    }

    private boolean Z(int i10, int i11) {
        this.f38610m.sendEmptyMessage(911);
        if (!this.F.s(this.f38599b, i10, i11, this.f38623z, 5, 2, false)) {
            return false;
        }
        this.G = this.f38600c.F();
        this.H = Long.valueOf(System.currentTimeMillis());
        this.F.w(new C0295c());
        this.F.j();
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "photinusStart", "usePhotinus", String.valueOf(this.f38622y));
        return true;
    }

    private void a0(com.alipay.face.camera.c cVar) {
        if (this.E) {
            Z(cVar.e(), cVar.d());
            this.E = false;
        }
        byte[] bArr = null;
        ByteBuffer byteBufferB = cVar.b();
        try {
            byte[] bArrArray = byteBufferB.array();
            bArr = new byte[bArrArray.length];
            System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
        } catch (ReadOnlyBufferException unused) {
            if (bArr == null) {
                bArr = new byte[byteBufferB.remaining()];
                byteBufferB.get(bArr);
            }
        } catch (UnsupportedOperationException unused2) {
            if (bArr == null) {
                bArr = new byte[byteBufferB.remaining()];
                byteBufferB.get(bArr);
            }
        } catch (Throwable th2) {
            if (bArr == null) {
                byteBufferB.get(new byte[byteBufferB.remaining()]);
            }
            throw th2;
        }
        com.alipay.face.photinus.c cVar2 = new com.alipay.face.photinus.c(bArr);
        cVar2.f38899c = this.G;
        this.F.h(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        this.F.z(this.f38600c.b(), this.f38599b);
    }

    private void c0(com.alipay.face.camera.c cVar, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                new YuvImage(cVar.b().array(), 17, cVar.p(), cVar.o(), null).compressToJpeg(new Rect(0, 0, cVar.p(), cVar.o()), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                if (bitmapDecodeByteArray == null) {
                    return;
                }
                Matrix matrix = new Matrix();
                matrix.setRotate(i10);
                this.f38617t.add(Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false));
                if (this.f38617t.size() > 30) {
                    this.f38617t.remove(0);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            d4.c.r(byteArrayOutputStream);
        }
    }

    private void d0(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 903;
        messageObtain.obj = str;
        this.f38610m.sendMessage(messageObtain);
    }

    static /* synthetic */ int g(c cVar) {
        int i10 = cVar.f38618u;
        cVar.f38618u = i10 + 1;
        return i10;
    }

    private int p() {
        int iF;
        f fVar = this.f38600c;
        if (fVar != null) {
            iF = fVar.F();
            if (!P()) {
                iF = (360 - iF) % 360;
            }
        } else {
            iF = 0;
        }
        AndroidClientConfig androidClientConfigR = r();
        if (androidClientConfigR == null) {
            return iF;
        }
        DeviceSetting[] deviceSettings = androidClientConfigR.getDeviceSettings();
        if (deviceSettings.length <= 0) {
            return iF;
        }
        DeviceSetting deviceSetting = deviceSettings[0];
        if (!deviceSetting.isAlgorithmAuto()) {
            return deviceSetting.getAlgorithmAngle();
        }
        f fVar2 = this.f38600c;
        if (fVar2 == null) {
            return iF;
        }
        int iF2 = fVar2.F();
        return !P() ? (360 - iF2) % 360 : iF2;
    }

    private void q() {
        this.f38606i = null;
        this.f38604g = null;
        this.f38612o = WorkState.INIT;
        this.f38613p = new AtomicBoolean(false);
        this.f38614q = false;
        this.f38617t = new LinkedList();
        this.f38618u = 0;
        this.f38619v = "";
        this.f38622y = true;
        this.A = null;
        this.B = null;
        this.C = 0;
        this.D = false;
        this.E = true;
        this.F = null;
        this.G = 0;
        this.H = null;
    }

    public static c w() {
        return L;
    }

    public OSSConfig A() {
        return this.f38603f;
    }

    public String B() {
        return this.A;
    }

    public String C() {
        return this.B;
    }

    public String D() {
        return d4.c.o(this.f38599b, "bid-log-key-public.key");
    }

    public byte[] E() {
        byte[] bArr = this.f38605h;
        if (bArr != null) {
            return bArr;
        }
        return null;
    }

    public boolean F() {
        return this.f38616s;
    }

    public byte[] G() {
        return this.I;
    }

    public byte[] H() {
        return this.J;
    }

    public String I() {
        return this.f38619v;
    }

    public WorkState J() {
        return this.f38612o;
    }

    public String K() {
        return this.f38607j;
    }

    public com.alipay.face.api.c L() {
        return this.f38611n;
    }

    public boolean M(Context context, Handler handler, f fVar) {
        Upload photinusCfg;
        q();
        this.f38599b = context;
        this.f38610m = handler;
        this.f38600c = fVar;
        ToygerFaceService toygerFaceService = new ToygerFaceService();
        this.f38601d = toygerFaceService;
        if (!toygerFaceService.init(context, false, (ToygerFaceCallback) this)) {
            return false;
        }
        AndroidClientConfig androidClientConfigR = r();
        if (androidClientConfigR != null && (photinusCfg = androidClientConfigR.getPhotinusCfg()) != null) {
            this.f38622y = photinusCfg.photinusVideo;
            this.f38623z = photinusCfg.photinusType;
        }
        if (this.f38622y) {
            this.F = new PhotinusEmulator();
        }
        O(r());
        this.f38612o = WorkState.FACE_CAPTURING;
        return true;
    }

    public boolean Q() {
        ArrayList<SDKAction> sdkActionList;
        AndroidClientConfig androidClientConfigR = r();
        if (androidClientConfigR != null && (sdkActionList = androidClientConfigR.getSdkActionList()) != null && sdkActionList.size() > 0) {
            Iterator<SDKAction> it = sdkActionList.iterator();
            while (it.hasNext()) {
                if ("ocr".equalsIgnoreCase(it.next().actionName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean R() {
        return this.f38608k;
    }

    public boolean S() {
        return this.f38622y;
    }

    public boolean T() {
        String str = this.f38599b.getFilesDir().getAbsolutePath() + "/" + com.alipay.face.b.f38554h;
        w().q0(str);
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                new xyz.mylib.creator.encoder.b(new a(), 16, file, 0, new b()).m();
                for (Bitmap bitmap : this.f38617t) {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
                this.f38617t.clear();
                this.f38617t = null;
                return true;
            } catch (Exception e10) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "makeVideo", "exception", e10.getMessage());
                e10.printStackTrace();
                for (Bitmap bitmap2 : this.f38617t) {
                    if (!bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                }
                this.f38617t.clear();
                this.f38617t = null;
                w().q0("");
                return false;
            }
        } catch (Throwable th2) {
            for (Bitmap bitmap3 : this.f38617t) {
                if (!bitmap3.isRecycled()) {
                    bitmap3.recycle();
                }
            }
            this.f38617t.clear();
            this.f38617t = null;
            throw th2;
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public boolean onHighQualityFrame(Bitmap bitmap, ToygerFaceAttr toygerFaceAttr) {
        if (bitmap == null) {
            return true;
        }
        i0(bitmap);
        h0(toygerFaceAttr);
        return true;
    }

    public void V() {
        ToygerFaceService toygerFaceService = this.f38601d;
        if (toygerFaceService != null) {
            try {
                toygerFaceService.release();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public boolean onStateUpdated(ToygerFaceState toygerFaceState, ToygerFaceAttr toygerFaceAttr, Map<String, Object> map) {
        int i10 = toygerFaceState.messageCode;
        if (this.f38610m == null) {
            return true;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 904;
        messageObtain.arg1 = i10;
        this.f38610m.sendMessage(messageObtain);
        return true;
    }

    public void X() {
        Handler handler = this.f38610m;
        if (handler != null) {
            handler.sendEmptyMessage(902);
        }
        this.f38612o = WorkState.FACE_COMPLETED;
    }

    @Override // com.alipay.face.camera.e
    public void a() {
    }

    @Override // com.alipay.face.camera.e
    public void b() {
    }

    @Override // com.alipay.face.camera.e
    public void c(double d10, double d11) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 901;
        messageObtain.arg1 = (int) d10;
        messageObtain.arg2 = (int) d11;
        this.f38610m.sendMessage(messageObtain);
    }

    @Override // com.alipay.face.camera.e
    public void d(com.alipay.face.camera.c cVar) {
        ArrayList arrayList;
        if (!this.f38614q) {
            N(cVar);
            this.f38614q = true;
        }
        WorkState workState = WorkState.PHOTINUS;
        WorkState workState2 = this.f38612o;
        if (workState == workState2 && this.D) {
            a0(cVar);
            return;
        }
        WorkState workState3 = WorkState.FACE_CAPTURING;
        if ((workState2 == workState3 || workState2 == WorkState.FACE_CAPTURING_DARK) && !this.f38613p.getAndSet(true)) {
            int iP = p();
            if (w().F()) {
                c0(cVar, iP);
            }
            ByteBuffer byteBufferB = cVar.b();
            if (byteBufferB != null) {
                arrayList = new ArrayList();
                arrayList.add(new TGFrame(byteBufferB, cVar.e(), cVar.d(), iP, cVar.c(), this.f38612o == workState3 ? 0 : 1));
            } else {
                arrayList = null;
            }
            ByteBuffer byteBufferF = cVar.f();
            TGDepthFrame tGDepthFrame = byteBufferF != null ? new TGDepthFrame(byteBufferF, cVar.i(), cVar.h(), iP) : null;
            ToygerFaceService toygerFaceService = this.f38601d;
            if (toygerFaceService != null) {
                toygerFaceService.processImage(arrayList, tGDepthFrame);
            }
            this.f38613p.set(false);
        }
    }

    public void e0(String str) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "sendErrorCode", i7.a.i.f119320o, str);
        RecordService.getInstance().flush();
        WorkState workState = WorkState.RET;
        if (workState == w().J()) {
            return;
        }
        w().r0(workState);
        com.alipay.face.api.c cVarL = w().L();
        if (cVarL != null) {
            cVarL.a(str);
        }
        this.f38621x = null;
        this.f38620w = null;
        this.f38605h = null;
    }

    public void f0(Protocol protocol) {
        this.f38602e = protocol;
    }

    public void g0(String str) {
        this.f38609l = str;
    }

    public void h0(ToygerFaceAttr toygerFaceAttr) {
        this.f38606i = toygerFaceAttr;
    }

    public void i0(Bitmap bitmap) {
        this.f38604g = bitmap;
    }

    public void j0(byte[] bArr) {
        this.f38621x = bArr;
    }

    public void k0(byte[] bArr) {
        this.f38620w = bArr;
    }

    public void l0(OCRInfo oCRInfo) {
        this.K = oCRInfo;
    }

    public void m0(OSSConfig oSSConfig) {
        this.f38603f = oSSConfig;
    }

    public void n0(byte[] bArr) {
        this.f38605h = bArr;
    }

    public void o0(boolean z10) {
        this.f38608k = z10;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public PointF onAlignDepthPoint(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        f fVar = this.f38600c;
        if (fVar != null) {
            int iK = fVar.k();
            int iO = this.f38600c.o();
            int iN = this.f38600c.N();
            int iD = this.f38600c.D();
            PointF pointF3 = new PointF();
            pointF3.x = pointF.x * iK;
            pointF3.y = pointF.y * iO;
            PointF pointFR = this.f38600c.r(pointF3);
            pointF2.x = pointFR.x / iN;
            pointF2.y = pointFR.y / iD;
        }
        return pointF2;
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public void onAsyncUpload(int i10, byte[] bArr, byte[] bArr2, boolean z10) {
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onComplete(int i10, byte[] bArr, byte[] bArr2, boolean z10) {
        this.I = bArr;
        this.J = bArr2;
        if (this.f38622y) {
            this.f38612o = WorkState.PHOTINUS;
            this.D = true;
        } else {
            this.f38610m.sendEmptyMessage(913);
            X();
        }
        return true;
    }

    @Override // com.alipay.face.camera.e
    public void onError(int i10) {
        String str;
        switch (i10) {
            case 100:
                str = com.alipay.face.b.a.f38575c;
                break;
            case 101:
                str = com.alipay.face.b.a.f38586n;
                break;
            case 102:
                str = com.alipay.face.b.a.f38587o;
                break;
            default:
                str = "unkown Camera Code =>" + i10;
                break;
        }
        d0(str);
    }

    @Override // com.alipay.zoloz.toyger.ToygerCallback
    public boolean onEvent(int i10, Map<String, Object> map) {
        String str;
        if (i10 == -4) {
            str = com.alipay.face.b.a.f38574b;
        } else if (i10 != -3) {
            str = i10 != -2 ? "" : com.alipay.face.b.a.f38588p;
        } else {
            str = com.alipay.face.b.a.f38583k;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        d0(str);
        return true;
    }

    public void p0(boolean z10) {
        this.f38616s = z10;
    }

    public void q0(String str) {
        this.f38619v = str;
    }

    public AndroidClientConfig r() {
        ProtocolContent protocolContent;
        Protocol protocol = this.f38602e;
        if (protocol == null || (protocolContent = protocol.protocolContent) == null) {
            return null;
        }
        return protocolContent.androidClientConfig;
    }

    public WorkState r0(WorkState workState) {
        WorkState workState2 = this.f38612o;
        this.f38612o = workState;
        return workState2;
    }

    public ProtocolContent s() {
        Protocol protocol = this.f38602e;
        if (protocol != null) {
            return protocol.protocolContent;
        }
        return null;
    }

    public void s0(String str) {
        this.f38607j = str;
    }

    public String t() {
        return this.f38609l;
    }

    public void t0(com.alipay.face.api.c cVar) {
        this.f38611n = cVar;
    }

    public ToygerFaceAttr u() {
        return this.f38606i;
    }

    public Bitmap v() {
        return this.f38604g;
    }

    public byte[] x() {
        return this.f38621x;
    }

    public byte[] y() {
        return this.f38620w;
    }

    public OCRInfo z() {
        return this.K;
    }
}
