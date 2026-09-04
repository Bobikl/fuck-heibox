package com.alipay.face.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.zim.ZimOcrMobileRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimOcrMobileResponse;
import com.alipay.face.log.RecordLevel;
import com.alipay.face.log.RecordService;
import com.alipay.face.network.model.OCRInfo;
import com.alipay.face.ui.overlay.CommAlertOverlay;
import com.alipay.face.ui.overlay.OcrIdentityErrorOverlay;
import com.alipay.face.ui.overlay.OcrIdentityNetErrorOverlay;
import com.alipay.face.ui.overlay.OcrLoadingOverlay;
import com.alipay.face.ui.overlay.OcrPhotoRequireOverlay;
import com.alipay.face.ui.widget.OcrGuideStageView;
import com.alipay.face.verify.ocr.R;

/* JADX INFO: loaded from: classes6.dex */
public class OcrGuideBaseActivity extends FaceBaseActivity {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f38932p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f38933q = -2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38934c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38935d = 1001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38936e = 1002;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f38937f = 1003;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f38938g = 1004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f38939h = 1005;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38940i = 1006;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private OCRInfo f38941j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f38942k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f38943l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38944m = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f38945n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f38946o = new Handler(new d());

    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (System.currentTimeMillis() - OcrGuideBaseActivity.this.f38945n > 2000) {
                OcrGuideBaseActivity.this.f38945n = System.currentTimeMillis();
                OcrGuideBaseActivity.this.C();
            }
        }
    }

    public class b implements View.OnClickListener {

        public class a implements CommAlertOverlay.d {
            a() {
            }

            @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
            public void a() {
                OcrGuideBaseActivity.this.B();
            }

            @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
            public void onCancel() {
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OcrGuideBaseActivity.this.N(true, new a());
        }
    }

    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OcrGuideBaseActivity.this.D();
        }
    }

    public class d implements Handler.Callback {
        d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (1001 == i10) {
                OcrGuideBaseActivity.this.J();
                return false;
            }
            if (1002 == i10) {
                OcrGuideBaseActivity.this.I();
                return false;
            }
            if (1003 == i10) {
                OcrGuideBaseActivity.this.H();
                return false;
            }
            if (1004 == i10) {
                OcrGuideBaseActivity.this.F();
                return false;
            }
            if (1005 == i10) {
                OcrGuideBaseActivity.this.G();
                return false;
            }
            if (1006 != i10) {
                return false;
            }
            OcrGuideBaseActivity.this.E((String) message.obj);
            return false;
        }
    }

    public class e implements com.alipay.face.ui.c {
        e() {
        }

        @Override // com.alipay.face.ui.c
        public void a(String str, String str2) {
            OcrGuideBaseActivity.this.f38946o.sendEmptyMessage(1005);
        }

        @Override // com.alipay.face.ui.c
        public void b(String str, String str2) {
            if (String.valueOf(2003).equalsIgnoreCase(str)) {
                OcrGuideBaseActivity.this.K(String.valueOf(2003));
            } else {
                OcrGuideBaseActivity.this.f38946o.sendEmptyMessage(1004);
            }
        }

        @Override // com.alipay.face.ui.c
        public void c(OCRInfo oCRInfo) {
            OcrGuideBaseActivity.this.f38941j = oCRInfo;
            OcrGuideBaseActivity.this.f38946o.sendEmptyMessage(1003);
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ZimOcrMobileRequest f38953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.alipay.face.ui.c f38954c;

        f(ZimOcrMobileRequest zimOcrMobileRequest, com.alipay.face.ui.c cVar) {
            this.f38953b = zimOcrMobileRequest;
            this.f38954c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ZimOcrMobileResponse zimOcrMobileResponseH = com.alipay.zoloz.android.net.b.g().h(this.f38953b);
                if (zimOcrMobileResponseH != null) {
                    if (!TextUtils.equals(zimOcrMobileResponseH.retCode, "4000") || zimOcrMobileResponseH.ocrInfo == null) {
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "zimOCRIdentify", "status", "server error", "content", JSON.toJSONString(zimOcrMobileResponseH));
                        this.f38954c.b(zimOcrMobileResponseH.retCodeSub, zimOcrMobileResponseH.retMessageSub);
                    } else {
                        RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "zimOCRIdentify", "status", "success", "content", JSON.toJSONString(zimOcrMobileResponseH));
                        this.f38954c.c((OCRInfo) JSON.parseObject(zimOcrMobileResponseH.ocrInfo, OCRInfo.class));
                    }
                }
            } catch (Exception e10) {
                RecordService.getInstance().recordEvent(RecordLevel.LOG_DEBUG, "zimOCRIdentify", "status", "network error", "content", Log.getStackTraceString(e10));
                this.f38954c.a(String.valueOf(-1), e10.getMessage());
            }
        }
    }

    public class g implements OcrIdentityNetErrorOverlay.c {
        g() {
        }

        @Override // com.alipay.face.ui.overlay.OcrIdentityNetErrorOverlay.c
        public void a() {
            OcrGuideBaseActivity.this.R(false, null);
            OcrGuideBaseActivity.this.Q(true);
            OcrGuideBaseActivity.this.U();
        }

        @Override // com.alipay.face.ui.overlay.OcrIdentityNetErrorOverlay.c
        public void b() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ossFrontError", "status", "user cancel on net error");
            OcrGuideBaseActivity.this.K(com.alipay.face.b.a.A);
        }
    }

    public class h implements CommAlertOverlay.d {
        h() {
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void a() {
            OcrGuideBaseActivity.this.K(com.alipay.face.b.a.f38598z);
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void onCancel() {
        }
    }

    public class i implements OcrIdentityErrorOverlay.c {
        i() {
        }

        @Override // com.alipay.face.ui.overlay.OcrIdentityErrorOverlay.c
        public void a() {
            OcrGuideBaseActivity.this.O(false, null);
            OcrGuideBaseActivity.this.D();
        }

        @Override // com.alipay.face.ui.overlay.OcrIdentityErrorOverlay.c
        public void onClose() {
        }
    }

    public class j implements OcrIdentityNetErrorOverlay.c {
        j() {
        }

        @Override // com.alipay.face.ui.overlay.OcrIdentityNetErrorOverlay.c
        public void a() {
            OcrGuideBaseActivity.this.R(false, null);
            OcrGuideBaseActivity.this.Q(true);
            OcrGuideBaseActivity.this.J();
        }

        @Override // com.alipay.face.ui.overlay.OcrIdentityNetErrorOverlay.c
        public void b() {
            RecordService.getInstance().recordEvent(RecordLevel.LOG_INFO, "ocrNetError", "status", "user cancel on net error");
            OcrGuideBaseActivity.this.K(com.alipay.face.b.a.A);
        }
    }

    public class k implements CommAlertOverlay.d {
        k() {
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void a() {
            OcrGuideBaseActivity.this.B();
            OcrGuideBaseActivity.super.onBackPressed();
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void onCancel() {
        }
    }

    public class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OcrGuideBaseActivity.this.T(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str) {
        this.f38941j = null;
        this.f38942k = null;
        finish();
        e4.b.f118543a.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        Q(false);
        int i10 = this.f38944m;
        if (i10 <= 0) {
            P(true, new h());
        } else {
            this.f38944m = i10 - 1;
            O(true, new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        Q(false);
        R(true, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        Q(false);
        if (A()) {
            L(this.f38941j);
            e4.c cVar = e4.b.f118543a;
            if (cVar != null) {
                OCRInfo oCRInfo = this.f38941j;
                cVar.e(oCRInfo.name, oCRInfo.num);
            }
        }
        byte[] bArr = this.f38942k;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            M(bitmapDecodeByteArray);
        }
        r(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        Q(false);
        R(true, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        String strA;
        String strEncodeToString = Base64.encodeToString(this.f38942k, 2);
        boolean zA = A();
        e4.c cVar = e4.b.f118543a;
        if (cVar != null) {
            strA = cVar.a();
            if (zA) {
                e4.b.f118543a.c(this.f38942k);
            } else {
                e4.b.f118543a.g(this.f38942k);
            }
        } else {
            strA = "";
        }
        V(strA, strEncodeToString, zA, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        Q(true);
        this.f38946o.sendEmptyMessage(1001);
    }

    public static void V(String str, String str2, boolean z10, com.alipay.face.ui.c cVar) {
        ZimOcrMobileRequest zimOcrMobileRequest = new ZimOcrMobileRequest();
        zimOcrMobileRequest.dataContext = str2;
        zimOcrMobileRequest.dataType = "BASE64_JPG";
        zimOcrMobileRequest.zimId = str;
        zimOcrMobileRequest.side = z10 ? "face" : com.alipay.sdk.m.x.d.f39542v;
        e4.b.f118543a.b().submit(new f(zimOcrMobileRequest, cVar));
    }

    private void w() {
        TextView textView = (TextView) findViewById(R.id.R);
        if (textView != null) {
            textView.setOnClickListener(new l());
        }
        Button button = (Button) findViewById(R.id.f39185t);
        if (button != null) {
            button.setOnClickListener(new a());
        }
        View viewFindViewById = findViewById(R.id.f39184s);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new b());
        }
        ImageView imageView = (ImageView) findViewById(R.id.Y);
        if (imageView != null) {
            imageView.setOnClickListener(new c());
        }
    }

    private void x() {
        ImageView imageView = (ImageView) findViewById(R.id.O);
        if (imageView != null) {
            int width = (int) (imageView.getWidth() * 0.60655737f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            imageView.setLayoutParams(layoutParams);
            if (A()) {
                imageView.setImageResource(R.mipmap.f39215l);
            } else {
                imageView.setImageResource(R.mipmap.f39214k);
            }
            byte[] bArr = this.f38942k;
            if (bArr != null) {
                M(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            }
        }
    }

    private void y() {
        OcrGuideStageView ocrGuideStageView = (OcrGuideStageView) findViewById(R.id.f39188w);
        if (ocrGuideStageView != null) {
            if (A()) {
                ocrGuideStageView.setStage(0);
            } else if (z()) {
                ocrGuideStageView.setStage(1);
            }
        }
        TextView textView = (TextView) findViewById(R.id.Z);
        if (textView != null) {
            textView.setText(v());
        }
        TextView textView2 = (TextView) findViewById(R.id.K);
        if (textView2 != null) {
            textView2.setText(s());
        }
        r(false);
    }

    public boolean A() {
        return false;
    }

    public void B() {
    }

    public void C() {
    }

    public void D() {
    }

    public void K(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1006;
        messageObtain.obj = str;
        this.f38946o.sendMessage(messageObtain);
    }

    public void L(OCRInfo oCRInfo) {
        View viewFindViewById = findViewById(R.id.f39189x);
        if (viewFindViewById != null) {
            if (oCRInfo == null) {
                viewFindViewById.setVisibility(4);
                return;
            }
            viewFindViewById.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.D);
        if (textView != null) {
            textView.setText(oCRInfo.name);
        }
        TextView textView2 = (TextView) findViewById(R.id.C);
        if (textView2 != null) {
            textView2.setText(oCRInfo.num);
        }
    }

    public void M(Bitmap bitmap) {
        ImageView imageView = (ImageView) findViewById(R.id.O);
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void N(boolean z10, CommAlertOverlay.d dVar) {
        CommAlertOverlay commAlertOverlay = (CommAlertOverlay) findViewById(R.id.f39187v);
        if (commAlertOverlay != null) {
            commAlertOverlay.setCommAlertOverlayListener(dVar);
            commAlertOverlay.setTitleText("确定退出吗?");
            commAlertOverlay.setMessageText("拍张照就能通过");
            commAlertOverlay.setVisibility(z10 ? 0 : 4);
        }
    }

    public void O(boolean z10, OcrIdentityErrorOverlay.c cVar) {
        OcrIdentityErrorOverlay ocrIdentityErrorOverlay = (OcrIdentityErrorOverlay) findViewById(R.id.f39190y);
        if (ocrIdentityErrorOverlay != null) {
            ocrIdentityErrorOverlay.setVisibility(z10 ? 0 : 4);
            ocrIdentityErrorOverlay.setOcrIdentityErrorOverlayListener(cVar);
        }
    }

    public void P(boolean z10, CommAlertOverlay.d dVar) {
        CommAlertOverlay commAlertOverlay = (CommAlertOverlay) findViewById(R.id.f39187v);
        if (commAlertOverlay != null) {
            commAlertOverlay.setCommAlertOverlayListener(dVar);
            commAlertOverlay.setTitleText("识别失败次数过多");
            commAlertOverlay.setMessageText("请退出后重试");
            commAlertOverlay.setButtonType(false);
            commAlertOverlay.setConfirmText("退出");
            commAlertOverlay.setVisibility(z10 ? 0 : 4);
        }
    }

    public void Q(boolean z10) {
        OcrLoadingOverlay ocrLoadingOverlay = (OcrLoadingOverlay) findViewById(R.id.F);
        if (ocrLoadingOverlay != null) {
            ocrLoadingOverlay.setVisibility(z10 ? 0 : 4);
        }
    }

    public void R(boolean z10, OcrIdentityNetErrorOverlay.c cVar) {
        OcrIdentityNetErrorOverlay ocrIdentityNetErrorOverlay = (OcrIdentityNetErrorOverlay) findViewById(R.id.E);
        if (ocrIdentityNetErrorOverlay != null) {
            ocrIdentityNetErrorOverlay.setVisibility(z10 ? 0 : 4);
            ocrIdentityNetErrorOverlay.setOnNetworkErrorListener(cVar);
        }
    }

    public void S(boolean z10) {
        ImageView imageView = (ImageView) findViewById(R.id.Y);
        if (imageView != null) {
            if (z10) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
    }

    public void T(boolean z10) {
        OcrPhotoRequireOverlay ocrPhotoRequireOverlay = (OcrPhotoRequireOverlay) findViewById(R.id.T);
        if (ocrPhotoRequireOverlay != null) {
            ocrPhotoRequireOverlay.setVisibility(z10 ? 0 : 4);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (intent != null) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("roiPicture");
            this.f38942k = byteArrayExtra;
            if (byteArrayExtra != null) {
                U();
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        N(true, new k());
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f39192a);
        w();
        y();
        e4.b.f118543a.init();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            x();
        }
    }

    public void r(boolean z10) {
        Resources resources;
        int i10;
        int color;
        Button button = (Button) findViewById(R.id.f39185t);
        if (button != null) {
            button.setEnabled(z10);
            String str = com.alipay.face.ui.a.f39008a;
            if (str != null) {
                color = z10 ? Color.parseColor(str) : getResources().getColor(R.color.f39141d);
            } else {
                if (z10) {
                    resources = getResources();
                    i10 = R.color.f39140c;
                } else {
                    resources = getResources();
                    i10 = R.color.f39141d;
                }
                color = resources.getColor(i10);
            }
            button.setBackgroundColor(color);
        }
    }

    public String s() {
        return "";
    }

    public String t() {
        EditText editText = (EditText) findViewById(R.id.D);
        return editText != null ? editText.getText().toString() : "";
    }

    public String u() {
        EditText editText = (EditText) findViewById(R.id.C);
        return editText != null ? editText.getText().toString() : "";
    }

    public String v() {
        return "";
    }

    public boolean z() {
        return false;
    }
}
