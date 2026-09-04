package com.alipay.face.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.face.camera.CameraSurfaceView;
import com.alipay.face.ui.overlay.CommAlertOverlay;
import com.alipay.face.ui.widget.RectMaskView;
import com.alipay.face.verify.ocr.R;
import com.alipay.zoloz.toyger.ToygerLog;

/* JADX INFO: loaded from: classes6.dex */
public class OcrTakePhotoActivity extends FaceBaseActivity implements com.alipay.face.camera.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CameraSurfaceView f38963c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f38964d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Bitmap f38965e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bitmap f38966f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f38967g = 0.0d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f38968h = 0.0d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38969i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38970j = 1000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f38971k = new Handler(new b());

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OcrTakePhotoActivity.this.v();
        }
    }

    public class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message != null && OcrTakePhotoActivity.this.f38970j == message.what) {
                OcrTakePhotoActivity.this.finish();
            }
            return false;
        }
    }

    public class c implements CommAlertOverlay.d {
        c() {
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void a() {
            OcrTakePhotoActivity.this.f38971k.sendEmptyMessage(OcrTakePhotoActivity.this.f38970j);
        }

        @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
        public void onCancel() {
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f38975b;

        d(ImageView imageView) {
            this.f38975b = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38975b.setEnabled(false);
            OcrTakePhotoActivity.this.z();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f38977b;

        e(ImageView imageView) {
            this.f38977b = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38977b.setEnabled(false);
            OcrTakePhotoActivity.this.x();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f38979b;

        f(ImageView imageView) {
            this.f38979b = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f38979b.setEnabled(false);
            OcrTakePhotoActivity.this.y();
        }
    }

    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OcrTakePhotoActivity.this.setResult(-1, null);
            OcrTakePhotoActivity.this.finish();
        }
    }

    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OcrTakePhotoActivity ocrTakePhotoActivity = OcrTakePhotoActivity.this;
            ocrTakePhotoActivity.f38969i = !ocrTakePhotoActivity.f38969i;
            OcrTakePhotoActivity.this.f38963c.a(OcrTakePhotoActivity.this.f38969i);
            ImageView imageView = (ImageView) OcrTakePhotoActivity.this.findViewById(R.id.f39183r);
            if (imageView != null) {
                if (OcrTakePhotoActivity.this.f38969i) {
                    imageView.setImageResource(R.mipmap.f39216m);
                } else {
                    imageView.setImageResource(R.mipmap.f39211h);
                }
            }
        }
    }

    public class i implements Runnable {

        public class a implements CommAlertOverlay.d {
            a() {
            }

            @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
            public void a() {
                OcrTakePhotoActivity.this.f38971k.sendEmptyMessage(OcrTakePhotoActivity.this.f38970j);
            }

            @Override // com.alipay.face.ui.overlay.CommAlertOverlay.d
            public void onCancel() {
            }
        }

        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (OcrTakePhotoActivity.this.checkSelfPermission("android.permission.CAMERA") != 0) {
                CommAlertOverlay commAlertOverlay = (CommAlertOverlay) OcrTakePhotoActivity.this.findViewById(R.id.f39187v);
                commAlertOverlay.setButtonType(false);
                commAlertOverlay.setTitleText("温馨提示");
                commAlertOverlay.setMessageText("相机权限被禁止，请检查");
                commAlertOverlay.setConfirmText("退出");
                commAlertOverlay.setVisibility(0);
                commAlertOverlay.setCommAlertOverlayListener(new a());
            }
        }
    }

    public class j implements com.alipay.face.camera.g {
        j() {
        }

        @Override // com.alipay.face.camera.g
        public void a(Bitmap bitmap) {
            OcrTakePhotoActivity.this.f38965e = bitmap;
            ToygerLog.e("takenPictureSize, x=" + bitmap.getWidth() + " y=" + bitmap.getHeight());
            ToygerLog.e("surfaceViewSize, x=" + OcrTakePhotoActivity.this.f38963c.getWidth() + " y=" + OcrTakePhotoActivity.this.f38963c.getHeight());
            OcrTakePhotoActivity.this.A(true);
            OcrTakePhotoActivity.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        ImageView imageView = (ImageView) findViewById(R.id.f39186u);
        View viewFindViewById = findViewById(R.id.L);
        ImageView imageView2 = (ImageView) findViewById(R.id.H);
        RectMaskView rectMaskView = (RectMaskView) findViewById(R.id.Q);
        ImageView imageView3 = (ImageView) findViewById(R.id.f39162a0);
        if (!z10) {
            if (imageView3 != null) {
                imageView3.setVisibility(4);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(4);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (rectMaskView != null) {
                rectMaskView.setAlpha(0.8f);
                return;
            }
            return;
        }
        if (imageView3 != null) {
            imageView3.setImageBitmap(this.f38965e);
            imageView3.setVisibility(0);
        }
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
        if (rectMaskView != null) {
            rectMaskView.setAlpha(1.0f);
        }
    }

    private void r(int i10, int i11) {
        ImageView imageView = (ImageView) findViewById(R.id.f39162a0);
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = i10;
            layoutParams.height = i11;
            imageView.setLayoutParams(layoutParams);
        }
        RectMaskView rectMaskView = (RectMaskView) findViewById(R.id.Q);
        if (rectMaskView != null) {
            ViewGroup.LayoutParams layoutParams2 = rectMaskView.getLayoutParams();
            layoutParams2.width = i10;
            layoutParams2.height = i11;
            rectMaskView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        RectMaskView rectMaskView = (RectMaskView) findViewById(R.id.Q);
        int width = rectMaskView.getWidth();
        int height = rectMaskView.getHeight();
        int rectLeft = (int) rectMaskView.getRectLeft();
        int rectTop = (int) rectMaskView.getRectTop();
        int rectWidth = (int) rectMaskView.getRectWidth();
        int rectHeigth = (int) rectMaskView.getRectHeigth();
        RectF rectF = new RectF();
        float f10 = width;
        float f11 = rectLeft / f10;
        rectF.left = f11;
        float f12 = height;
        float f13 = rectTop / f12;
        rectF.top = f13;
        rectF.right = f11 + (rectWidth / f10);
        rectF.bottom = f13 + (rectHeigth / f12);
        this.f38966f = d4.c.s(d4.c.g(this.f38965e, rectF), 800);
        ToygerLog.e("裁剪后大小=>" + this.f38966f.getWidth() + androidx.webkit.b.f28327e + this.f38966f.getHeight() + " 磁盘大小=>" + d4.c.d(this.f38966f).length);
    }

    private void t(boolean z10) {
        ImageView imageView = (ImageView) findViewById(R.id.f39186u);
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.V);
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.N);
        if (imageView3 != null) {
            imageView3.setEnabled(z10);
        }
    }

    private void u() {
        CameraSurfaceView cameraSurfaceView = (CameraSurfaceView) findViewById(R.id.X);
        this.f38963c = cameraSurfaceView;
        cameraSurfaceView.b(this, false, false, null);
        this.f38963c.setCameraCallback(this);
        ImageView imageView = (ImageView) findViewById(R.id.f39186u);
        if (imageView != null) {
            imageView.setOnClickListener(new d(imageView));
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.N);
        if (imageView2 != null) {
            imageView2.setOnClickListener(new e(imageView2));
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.V);
        if (imageView3 != null) {
            imageView3.setOnClickListener(new f(imageView3));
        }
        View viewFindViewById = findViewById(R.id.M);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new g());
        }
        View viewFindViewById2 = findViewById(R.id.W);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new h());
        }
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("takePhotoFront")) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("takePhotoFront", false);
        TextView textView = (TextView) findViewById(R.id.P);
        if (textView != null) {
            if (booleanExtra) {
                textView.setText(R.string.f39227d);
            } else {
                textView.setText(R.string.f39226c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        int height;
        int width;
        int i10;
        int height2;
        View viewFindViewById = findViewById(R.id.f39164b0);
        int top = 0;
        if (viewFindViewById != null) {
            width = viewFindViewById.getWidth();
            height = viewFindViewById.getHeight();
            double d10 = this.f38968h / this.f38967g;
            double d11 = height;
            double d12 = width;
            if (d10 < d11 / d12) {
                width = (int) (d11 / d10);
            } else {
                height = (int) (d12 * d10);
            }
        } else {
            height = 0;
            width = 0;
        }
        ViewGroup.LayoutParams layoutParams = this.f38963c.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        this.f38963c.setLayoutParams(layoutParams);
        r(width, height);
        ImageView imageView = (ImageView) findViewById(R.id.H);
        if (imageView != null) {
            int width2 = imageView.getWidth();
            height2 = imageView.getHeight();
            top = imageView.getTop();
            i10 = width2;
        } else {
            i10 = 0;
            height2 = 0;
        }
        int dimension = (int) getResources().getDimension(R.dimen.f39147d);
        int dimension2 = (int) (top + getResources().getDimension(R.dimen.f39147d));
        RectMaskView rectMaskView = (RectMaskView) findViewById(R.id.Q);
        if (rectMaskView != null) {
            rectMaskView.setRectTop(dimension2);
            rectMaskView.setRectLeft(dimension);
            rectMaskView.setRectWidth(i10);
            rectMaskView.setRectHeight(height2);
            rectMaskView.setRectRoundCx(1);
            rectMaskView.invalidate();
        }
    }

    private void w() {
        ImageView imageView = (ImageView) findViewById(R.id.H);
        if (imageView != null) {
            int width = (int) (imageView.getWidth() * 0.6330275f);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = width;
            imageView.setLayoutParams(layoutParams);
            imageView.post(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Intent intent = new Intent();
        intent.putExtra("roiPicture", d4.c.d(this.f38966f));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        A(false);
        t(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        com.alipay.face.camera.f cameraInterface;
        CameraSurfaceView cameraSurfaceView = this.f38963c;
        if (cameraSurfaceView == null || (cameraInterface = cameraSurfaceView.getCameraInterface()) == null) {
            return;
        }
        cameraInterface.g(new j());
    }

    @Override // com.alipay.face.camera.e
    public void a() {
    }

    @Override // com.alipay.face.camera.e
    public void b() {
    }

    @Override // com.alipay.face.camera.e
    public void c(double d10, double d11) {
        this.f38967g = d10;
        this.f38968h = d11;
        CameraSurfaceView cameraSurfaceView = this.f38963c;
        if (cameraSurfaceView != null) {
            if (d10 < d11) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cameraSurfaceView.getLayoutParams();
                int width = this.f38963c.getWidth();
                layoutParams.width = width;
                layoutParams.height = (int) ((((double) width) / (d10 * 1.0d)) * d11);
                this.f38963c.setLayoutParams(layoutParams);
                this.f38963c.setBackgroundColor(0);
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cameraSurfaceView.getLayoutParams();
            int height = this.f38963c.getHeight();
            layoutParams2.height = height;
            layoutParams2.width = (int) ((((double) height) / (d11 * 1.0d)) * d10);
            this.f38963c.setLayoutParams(layoutParams2);
            this.f38963c.setBackgroundColor(0);
        }
    }

    @Override // com.alipay.face.camera.e
    public void d(com.alipay.face.camera.c cVar) {
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f39194c);
        boolean z10 = false;
        if (checkSelfPermission("android.permission.CAMERA") != 0) {
            CommAlertOverlay commAlertOverlay = (CommAlertOverlay) findViewById(R.id.f39187v);
            commAlertOverlay.setButtonType(false);
            commAlertOverlay.setTitleText("温馨提示");
            commAlertOverlay.setMessageText("相机权限被禁止，请检查");
            commAlertOverlay.setConfirmText("退出");
            commAlertOverlay.setVisibility(0);
            commAlertOverlay.setCommAlertOverlayListener(new c());
        } else {
            z10 = true;
        }
        if (z10) {
            u();
        }
    }

    @Override // com.alipay.face.camera.e
    public void onError(int i10) {
    }

    @Override // com.alipay.face.ui.FaceBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f38971k.post(new i());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            w();
        }
    }
}
