package com.alipay.face.ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.face.R;
import com.alipay.face.WorkState;
import com.alipay.face.camera.CameraSurfaceView;
import com.alipay.face.config.AndroidClientConfig;
import com.alipay.face.config.OSSConfig;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.ui.overlay.CommAlertOverlay;
import com.alipay.face.ui.widget.CircleHoleView;
import com.alipay.face.ui.widget.RoundProgressBar;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.face.ToygerFaceAttr;
import com.lzy.okgo.model.Progress;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerActivity extends FaceBaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CameraSurfaceView f38987d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38986c = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38988e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38989f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f38990g = new Handler(new b());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WorkState f38991h = null;

    public class a implements CommAlertOverlay.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f38992a;

        a(k kVar) {
            this.f38992a = kVar;
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void a() {
            if (this.f38992a != null) {
                ToygerActivity.this.S(false);
                this.f38992a.a();
            }
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void onCancel() {
            if (this.f38992a != null) {
                ToygerActivity.this.S(false);
                this.f38992a.onCancel();
            }
        }
    }

    public class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 901:
                    ToygerActivity.this.c(message.arg1, message.arg2);
                    break;
                case 902:
                    ToygerActivity.this.I();
                    break;
                case 903:
                    ToygerActivity.this.H((String) message.obj);
                    break;
                case 904:
                    ToygerActivity.this.Y(message.arg1);
                    break;
                case 905:
                    ToygerActivity.this.K();
                    break;
                case 906:
                    ToygerActivity.this.L();
                    break;
                case 907:
                    ToygerActivity.this.N((String) message.obj);
                    break;
                case 908:
                    ToygerActivity.this.M();
                    break;
                case 910:
                    ToygerActivity.this.T();
                    break;
                case 911:
                    ToygerActivity.this.R();
                    break;
                case 912:
                    ToygerActivity.this.G(message);
                    break;
                case 913:
                    ToygerActivity.this.Q();
                    break;
            }
            return true;
        }
    }

    public class c implements k {
        c() {
        }

        @Override // com.alipay.face.ui.ToygerActivity.k
        public void a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "guidPageClose");
            ToygerActivity.this.U(com.alipay.face.b.a.f38580h);
        }

        @Override // com.alipay.face.ui.ToygerActivity.k
        public void onCancel() {
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToygerActivity.this.J();
        }
    }

    public class e implements com.alipay.face.network.d.c {
        e() {
        }

        @Override // com.alipay.face.network.d.c
        public boolean a(int i10, String str, String str2, String str3) {
            RecordService recordService = RecordService.getInstance();
            RecordLevel recordLevel = RecordLevel.LOG_ERROR;
            StringBuilder sb2 = new StringBuilder();
            String str4 = "";
            sb2.append("");
            sb2.append(i10);
            recordService.recordEvent(recordLevel, "ossUploadFileError", "idx", sb2.toString(), Progress.F, str2, "errMsg", str3);
            if ("InvalidAccessKeyId".equalsIgnoreCase(str3)) {
                ToygerActivity.this.U(com.alipay.face.b.a.B);
                return false;
            }
            if (i10 == 0) {
                str4 = com.alipay.face.b.a.f38591s;
            } else if (1 == i10) {
                str4 = com.alipay.face.b.a.f38596x;
            } else if (2 == i10) {
                str4 = com.alipay.face.b.a.f38597y;
            }
            ToygerActivity.this.U(str4);
            return false;
        }

        @Override // com.alipay.face.network.d.c
        public boolean b(int i10, String str, String str2) {
            return true;
        }

        @Override // com.alipay.face.network.d.c
        public void c(int i10, int i11) {
            if (i10 == i11) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ossUploadFileSuccess", "count", "" + i11);
                ToygerActivity.this.J();
            }
        }
    }

    public class f implements com.alipay.face.network.h {
        f() {
        }

        @Override // com.alipay.face.network.h
        public void a(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "netVerifyRes", "status", "fail", "msg", "Face Compare onError, code=" + str + " errMsg=" + str2);
            ToygerActivity.this.U(com.alipay.face.b.a.f38592t);
        }

        @Override // com.alipay.face.network.h
        public void b(String str, String str2) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "netVerifyRes", "status", "fail", "msg", "Server Internal onError, code=" + str + " errMsg=" + str2);
            ToygerActivity.this.U(str);
        }

        @Override // com.alipay.face.network.h
        public void c(String str, String str2, String str3) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "netVerifyRes", "status", "success", AliVerifyDialogActivity.f77461k, "false", "msg", "Face Compare onValidateFail, retCodeSub=" + str + " retMessageSub=" + str2 + " srvRes=" + str3);
            ToygerActivity toygerActivity = ToygerActivity.this;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.alipay.face.b.a.f38595w);
            sb2.append(str);
            toygerActivity.U(sb2.toString());
        }

        @Override // com.alipay.face.network.h
        public void onSuccess() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "netVerifyRes", "status", "success", AliVerifyDialogActivity.f77461k, "success");
            ToygerActivity.this.U(com.alipay.face.b.a.f38593u);
        }
    }

    public class g implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38999a;

        g(String str) {
            this.f38999a = str;
        }

        @Override // com.alipay.face.ui.ToygerActivity.k
        public void a() {
            ToygerActivity.this.V(this.f38999a);
        }

        @Override // com.alipay.face.ui.ToygerActivity.k
        public void onCancel() {
        }
    }

    public class h implements com.alipay.face.ui.widget.a {

        public class a implements k {
            a() {
            }

            @Override // com.alipay.face.ui.ToygerActivity.k
            public void a() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", "status", "time out, not success");
                ToygerActivity.this.U(com.alipay.face.b.a.f38578f);
            }

            @Override // com.alipay.face.ui.ToygerActivity.k
            public void onCancel() {
            }
        }

        public class b implements k {
            b() {
            }

            @Override // com.alipay.face.ui.ToygerActivity.k
            public void a() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", "status", "time out, user retry:" + ToygerActivity.this.f38988e);
                ToygerActivity.n(ToygerActivity.this);
                ToygerActivity.this.f38990g.sendEmptyMessage(910);
            }

            @Override // com.alipay.face.ui.ToygerActivity.k
            public void onCancel() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "faceScan", "status", "time out, user back");
                ToygerActivity.this.U(com.alipay.face.b.a.f38578f);
            }
        }

        h() {
        }

        @Override // com.alipay.face.ui.widget.a
        public void onFinish() {
            if (ToygerActivity.this.f38988e >= 4) {
                ToygerActivity.this.Z(R.string.K, R.string.B, R.string.f38490u, -1, new a());
                return;
            }
            int i10 = R.string.J;
            if (ToygerActivity.this.f38989f) {
                i10 = R.string.H;
            }
            ToygerActivity.this.Z(i10, R.string.A, R.string.f38489t, -1, new b());
        }

        @Override // com.alipay.face.ui.widget.a
        public void onProgress(int i10) {
        }
    }

    public class i implements View.OnClickListener {

        public class a implements k {
            a() {
            }

            @Override // com.alipay.face.ui.ToygerActivity.k
            public void a() {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "pressCloseButton");
                ToygerActivity.this.U(com.alipay.face.b.a.f38580h);
            }

            @Override // com.alipay.face.ui.ToygerActivity.k
            public void onCancel() {
            }
        }

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ToygerActivity.this.F()) {
                return;
            }
            ToygerActivity.this.Z(R.string.E, R.string.f38491v, R.string.f38487r, R.string.f38483n, new a());
        }
    }

    public class j implements k {
        j() {
        }

        @Override // com.alipay.face.ui.ToygerActivity.k
        public void a() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "userBack", "type", "homeBack");
            ToygerActivity.this.H(com.alipay.face.b.a.f38580h);
            ToygerActivity.super.onBackPressed();
        }

        @Override // com.alipay.face.ui.ToygerActivity.k
        public void onCancel() {
        }
    }

    public interface k {
        void a();

        void onCancel();
    }

    private com.alipay.face.camera.f B() {
        CameraSurfaceView cameraSurfaceView = this.f38987d;
        if (cameraSurfaceView != null) {
            return cameraSurfaceView.getCameraInterface();
        }
        return null;
    }

    private void C() {
        TextView textView = (TextView) findViewById(R.id.f38455o);
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    private void D() {
        W(false);
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "faceScan", "status", "start preview");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.f38464x);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        Button button = (Button) findViewById(R.id.f38444d);
        if (button != null) {
            button.setVisibility(0);
        }
        com.alipay.face.c cVarW = com.alipay.face.c.w();
        if (cVarW != null) {
            CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(R.id.f38443c);
            this.f38987d = cameraSurfaceView;
            cameraSurfaceView.setVisibility(0);
            com.alipay.face.camera.b.f38656b = 600;
            this.f38987d.b(this, true, true, null);
            this.f38987d.setCameraCallback(cVarW);
            if (!cVarW.M(this, this.f38990g, this.f38987d.getCameraInterface())) {
                RecordService.getInstance().recordEvent(recordLevel, "faceScan", "status", "init toyger presenter fail");
                U(com.alipay.face.b.a.f38574b);
            } else {
                RecordService.getInstance().recordEvent(recordLevel, "faceScan", "status", "faceScan init Success");
                this.f38988e = 0;
                T();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    private void E() {
        ToygerWebView toygerWebView;
        AndroidClientConfig androidClientConfigR = com.alipay.face.c.w().r();
        boolean z10 = true;
        if (androidClientConfigR == null || androidClientConfigR.getNavi() == null || !androidClientConfigR.getNavi().isEnable()) {
            z10 = false;
        } else {
            String url = androidClientConfigR.getNavi().getUrl();
            if (TextUtils.isEmpty(url) || (toygerWebView = (ToygerWebView) findViewById(R.id.f38453m)) == null) {
                z10 = false;
            } else {
                toygerWebView.setVisibility(0);
                toygerWebView.setHandler(this.f38990g);
                toygerWebView.loadUrl(url);
                RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initToygerUI", "startGuid", "true", "url", url);
            }
        }
        if (z10) {
            return;
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "initToygerUI", "startGuid", "false");
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(Message message) {
        int i10 = message.arg1;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.f38464x);
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i10);
        }
        CircleHoleView circleHoleView = (CircleHoleView) findViewById(R.id.f38462v);
        if (circleHoleView != null) {
            circleHoleView.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.alipay.face.b.a.f38573a;
        }
        c0(true);
        d0();
        if (!com.alipay.face.c.w().R()) {
            V(str);
        } else {
            if (X(str, new g(str))) {
                return;
            }
            V(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "faceScan", "status", "face completed");
        com.alipay.face.camera.f fVarB = B();
        if (fVarB != null) {
            fVarB.C();
        }
        c0(true);
        RecordService.getInstance().recordEvent(recordLevel, "uploadFaceImage", "status", "start upload face image");
        com.alipay.face.network.b.f38805b.execute(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        String str;
        String strK = com.alipay.face.c.w().K();
        Bitmap bitmapV = com.alipay.face.c.w().v();
        ToygerFaceAttr toygerFaceAttrU = com.alipay.face.c.w().u();
        RecordService recordService = RecordService.getInstance();
        RecordLevel recordLevel = RecordLevel.LOG_INFO;
        recordService.recordEvent(recordLevel, "startNetVerify", "status", "start net verify");
        if (com.alipay.face.c.w().F()) {
            if (com.alipay.face.c.w().T()) {
                RecordService.getInstance().recordEvent(recordLevel, "makeVideo", "status", "true");
            } else {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "makeVideo", "status", "false");
            }
        }
        OSSConfig oSSConfigA = com.alipay.face.c.w().A();
        String str2 = "/";
        if (oSSConfigA != null) {
            str2 = "/" + oSSConfigA.BucketName + "/";
        }
        String strD = com.alipay.face.network.d.c().d(0);
        String str3 = "";
        if (com.alipay.face.c.w().S()) {
            String str4 = str2 + com.alipay.face.network.d.c().d(1);
            str3 = str4;
            str = str2 + com.alipay.face.network.d.c().d(2);
        } else {
            str = "";
        }
        com.alipay.face.network.b.e(this, strK, strD, str3, str, bitmapV, toygerFaceAttrU, com.alipay.face.c.w().z(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        ToygerWebView toygerWebView = (ToygerWebView) findViewById(R.id.f38453m);
        if (toygerWebView != null) {
            toygerWebView.setVisibility(8);
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "guidPage", "action", "click auth, and start toyger");
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        Z(R.string.E, R.string.f38491v, R.string.f38487r, R.string.f38483n, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "guidPage", "action", "load local page");
        ToygerWebView toygerWebView = (ToygerWebView) findViewById(R.id.f38453m);
        if (toygerWebView != null) {
            toygerWebView.setVisibility(0);
            toygerWebView.loadUrl("file:///android_asset/nav/facewelcome.html");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "guidPageLog", "guid_log", str);
    }

    private void O(double d10, double d11) {
        View viewFindViewById = findViewById(R.id.f38459s);
        if (viewFindViewById != null) {
            int height = viewFindViewById.getHeight();
            double dimension = getResources().getDimension(R.dimen.f38429i);
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f38461u);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int i10 = (int) ((((double) height) - dimension) * 0.6600000262260437d);
            layoutParams.height = i10;
            layoutParams.width = (int) ((((double) i10) / (d11 * 1.0d)) * d10);
            frameLayout.setLayoutParams(layoutParams);
            CircleHoleView circleHoleView = (CircleHoleView) findViewById(R.id.f38462v);
            if (circleHoleView != null) {
                ViewGroup.LayoutParams layoutParams2 = circleHoleView.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                circleHoleView.setLayoutParams(layoutParams2);
                int i11 = layoutParams.height;
                circleHoleView.f39031h = i11;
                circleHoleView.f39032i = i11;
                circleHoleView.invalidate();
            }
            ImageView imageView = (ImageView) findViewById(R.id.f38452l);
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                int i12 = layoutParams.height;
                layoutParams3.width = i12;
                layoutParams3.height = i12;
                imageView.setLayoutParams(layoutParams3);
            }
            TextView textView = (TextView) findViewById(R.id.f38455o);
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                layoutParams4.width = layoutParams.height;
                textView.setLayoutParams(layoutParams4);
            }
            RoundProgressBar roundProgressBar = (RoundProgressBar) findViewById(R.id.f38458r);
            if (roundProgressBar != null) {
                ViewGroup.LayoutParams layoutParams5 = roundProgressBar.getLayoutParams();
                int i13 = layoutParams.height;
                layoutParams5.width = i13;
                layoutParams5.height = i13;
                roundProgressBar.setLayoutParams(layoutParams5);
            }
            ToygerLog.e("屏幕宽度=>" + height + " 预览宽度=>" + layoutParams.height);
        }
        this.f38987d.setBackgroundColor(0);
    }

    private void P(double d10, double d11) {
        View viewFindViewById = findViewById(R.id.f38459s);
        if (viewFindViewById != null) {
            int width = viewFindViewById.getWidth();
            viewFindViewById.getHeight();
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.f38461u);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int i10 = (int) (((double) width) * 0.6600000262260437d);
            layoutParams.width = i10;
            layoutParams.height = (int) ((((double) i10) / (d10 * 1.0d)) * d11);
            frameLayout.setLayoutParams(layoutParams);
            CircleHoleView circleHoleView = (CircleHoleView) findViewById(R.id.f38462v);
            if (circleHoleView != null) {
                int i11 = layoutParams.width;
                circleHoleView.f39031h = i11;
                circleHoleView.f39032i = i11;
                circleHoleView.invalidate();
            }
            ImageView imageView = (ImageView) findViewById(R.id.f38452l);
            if (imageView != null) {
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.width;
                imageView.setLayoutParams(layoutParams2);
            }
            ToygerLog.e("屏幕宽度=>" + width + " 预览宽度=>" + layoutParams.width);
        }
        this.f38987d.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        W(true);
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean z10) {
        RoundProgressBar roundProgressBar = (RoundProgressBar) findViewById(R.id.f38458r);
        if (roundProgressBar != null) {
            roundProgressBar.g(z10);
        }
        if (z10) {
            this.f38991h = com.alipay.face.c.w().r0(WorkState.PAUSE);
        } else {
            com.alipay.face.c.w().r0(this.f38991h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        a0(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 903;
        messageObtain.obj = str;
        this.f38990g.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(String str) {
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ToygerActivityClose", i7.a.i.f119320o, str);
        com.alipay.face.c.w().e0(str);
        finish();
    }

    private void W(boolean z10) {
        ImageView imageView = (ImageView) findViewById(R.id.f38452l);
        RoundProgressBar roundProgressBar = (RoundProgressBar) findViewById(R.id.f38458r);
        if (imageView == null || roundProgressBar == null) {
            return;
        }
        if (!z10) {
            imageView.setVisibility(8);
            roundProgressBar.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        roundProgressBar.setVisibility(8);
        Bitmap bitmapC = d4.a.c(com.alipay.face.c.w().v(), com.alipay.face.c.w().u());
        if (bitmapC != null) {
            imageView.setImageBitmap(bitmapC);
        }
    }

    private boolean X(String str, k kVar) {
        ToygerLog.e("showErrorMsgBox=>" + str);
        if (str.equalsIgnoreCase(com.alipay.face.b.a.f38590r) || str.equalsIgnoreCase(com.alipay.face.b.a.f38591s) || str.equalsIgnoreCase(com.alipay.face.b.a.f38592t) || str.equalsIgnoreCase(com.alipay.face.b.a.f38581i) || str.equalsIgnoreCase(com.alipay.face.b.a.f38582j)) {
            Z(R.string.F, R.string.f38492w, R.string.f38487r, -1, kVar);
            return true;
        }
        if (str.equalsIgnoreCase(com.alipay.face.b.a.f38574b) || str.equalsIgnoreCase(com.alipay.face.b.a.f38583k) || str.equalsIgnoreCase(com.alipay.face.b.a.f38588p)) {
            Z(R.string.L, R.string.C, R.string.f38487r, -1, kVar);
            return true;
        }
        if (!str.equalsIgnoreCase(com.alipay.face.b.a.f38575c) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38586n) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38587o) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38584l) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38577e) && !str.equalsIgnoreCase(com.alipay.face.b.a.f38576d)) {
            return false;
        }
        Z(R.string.G, R.string.f38493x, R.string.f38487r, -1, kVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i10) {
        String string;
        if (i10 != 100) {
            switch (i10) {
                case 1:
                    string = getString(R.string.N);
                    break;
                case 2:
                    string = getString(R.string.f38477h);
                    break;
                case 3:
                    string = getString(R.string.f38476g);
                    break;
                case 4:
                    string = getString(R.string.f38480k);
                    break;
                case 5:
                case 6:
                    string = getString(R.string.f38472c);
                    break;
                case 7:
                    string = getString(R.string.f38482m);
                    break;
                case 8:
                    string = getString(R.string.f38470a);
                    break;
                case 9:
                    string = getString(R.string.f38473d);
                    break;
                case 10:
                    string = getString(R.string.f38471b);
                    break;
                case 11:
                    string = getString(R.string.f38475f);
                    break;
                case 12:
                    string = getString(R.string.O);
                    break;
                default:
                    string = "";
                    break;
            }
        } else {
            string = getString(R.string.P);
        }
        TextView textView = (TextView) findViewById(R.id.f38455o);
        if (textView == null || TextUtils.isEmpty(string)) {
            return;
        }
        textView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(int i10, int i11, int i12, int i13, k kVar) {
        CommAlertOverlay commAlertOverlay = (CommAlertOverlay) findViewById(R.id.f38456p);
        if (commAlertOverlay != null) {
            if (i10 > 0) {
                commAlertOverlay.setTitleText(getString(i10));
            }
            if (i11 > 0) {
                commAlertOverlay.setMessageText(getString(i11));
            }
            if (i13 > 0) {
                commAlertOverlay.setButtonType(true);
                commAlertOverlay.setCancelText(getString(i13));
            } else {
                commAlertOverlay.setButtonType(false);
            }
            if (i12 > 0) {
                commAlertOverlay.setConfirmText(getString(i12));
            }
            commAlertOverlay.setVisibility(0);
            S(true);
            commAlertOverlay.setCommAlertOverlayListener(new a(kVar));
        }
    }

    private void a0(com.alipay.face.ui.widget.a aVar) {
        int time;
        RoundProgressBar roundProgressBar = (RoundProgressBar) findViewById(R.id.f38458r);
        if (roundProgressBar != null) {
            int i10 = 20;
            AndroidClientConfig androidClientConfigR = com.alipay.face.c.w().r();
            if (androidClientConfigR != null && androidClientConfigR.getColl() != null && (time = androidClientConfigR.getColl().getTime()) > 0) {
                i10 = time;
            }
            String str = com.alipay.face.ui.a.f39009b;
            if (str != null) {
                roundProgressBar.setGradientColor(Color.parseColor(str));
            }
            roundProgressBar.h(i10 * 1000, aVar);
        }
    }

    private void b0() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.f38463w);
        if (linearLayout != null) {
            if (linearLayout.getVisibility() == 0) {
                return;
            } else {
                linearLayout.setVisibility(0);
            }
        }
        Button button = (Button) findViewById(R.id.f38444d);
        if (button != null) {
            button.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(double d10, double d11) {
        Log.e("Toyger", "surfaceChanged, w=" + d10 + " h=" + d11);
        if (this.f38987d != null) {
            if (d10 < d11) {
                P(d10, d11);
            } else {
                O(d10, d11);
            }
        }
    }

    private void c0(boolean z10) {
        RoundProgressBar roundProgressBar = (RoundProgressBar) findViewById(R.id.f38458r);
        if (roundProgressBar != null) {
            roundProgressBar.i();
            if (z10) {
                roundProgressBar.setProgress(0);
            }
        }
    }

    private void d0() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.f38463w);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        Button button = (Button) findViewById(R.id.f38444d);
        if (button != null) {
            button.setEnabled(true);
        }
    }

    private void e0() throws Throwable {
        byte[] bArrD = d4.c.d(com.alipay.face.c.w().v());
        OSSConfig oSSConfigA = com.alipay.face.c.w().A();
        if (oSSConfigA == null) {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_ERROR, "uploadFaceImage", "status", "false", "errMsg", "ossConfig is invalid");
            U(com.alipay.face.b.a.f38590r);
            return;
        }
        com.alipay.face.network.d.c().e();
        com.alipay.face.network.d.c().b(0, oSSConfigA.BucketName, oSSConfigA.FileNamePrefix + "_0.jpeg", bArrD);
        if (com.alipay.face.c.w().S()) {
            com.alipay.face.network.d.c().b(1, oSSConfigA.BucketName, d4.c.h(oSSConfigA.FileNamePrefix, "colorinfo", "json"), d4.c.p(com.alipay.face.c.w().B()));
            com.alipay.face.network.d.c().b(2, oSSConfigA.BucketName, d4.c.h(oSSConfigA.FileNamePrefix, "colorvideo", "mp4"), d4.c.p(com.alipay.face.c.w().C()));
        }
        com.alipay.face.network.d.c().h(this, oSSConfigA.OssEndPoint, oSSConfigA.AccessKeyId, oSSConfigA.AccessKeySecret, oSSConfigA.SecurityToken, new e());
    }

    static /* synthetic */ int n(ToygerActivity toygerActivity) {
        int i10 = toygerActivity.f38988e;
        toygerActivity.f38988e = i10 + 1;
        return i10;
    }

    public boolean F() {
        CommAlertOverlay commAlertOverlay = (CommAlertOverlay) findViewById(R.id.f38456p);
        return commAlertOverlay != null && commAlertOverlay.getVisibility() == 0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (F()) {
            return;
        }
        Z(R.string.E, R.string.f38491v, R.string.f38487r, R.string.f38483n, new j());
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f38466b);
        d4.c.t(this, 1.0f);
        Button button = (Button) findViewById(R.id.f38444d);
        if (button != null) {
            button.setOnClickListener(new i());
        }
        RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ToygerActivityStart", "name", "ToygerActivity");
        E();
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onDestroy() {
        com.alipay.face.c.w().V();
        com.alipay.face.network.d.c().g();
        c0(true);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f38989f = true;
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f38989f = false;
    }
}
