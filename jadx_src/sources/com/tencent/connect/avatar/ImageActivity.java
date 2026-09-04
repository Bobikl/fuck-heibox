package com.tencent.connect.avatar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.j1;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.e;
import com.tencent.open.b.h;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.open.utils.m;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class ImageActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RelativeLayout f99357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private QQToken f99358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f99359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Handler f99360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f99361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Button f99362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Button f99363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f99364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f99365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ProgressBar f99366j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f99374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Bitmap f99375s;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99367k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f99368l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f99369m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99370n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f99371o = bb.c.b.f30883q9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f99372p = bb.c.b.f30883q9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Rect f99373q = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View.OnClickListener f99376t = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.f99366j.setVisibility(0);
            ImageActivity.this.f99363g.setEnabled(false);
            ImageActivity.this.f99363g.setTextColor(Color.rgb(21, 21, 21));
            ImageActivity.this.f99362f.setEnabled(false);
            ImageActivity.this.f99362f.setTextColor(Color.rgb(36, 94, 134));
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageActivity.this.c();
                }
            }).start();
            if (ImageActivity.this.f99368l) {
                ImageActivity.this.a("10657", 0L);
                return;
            }
            ImageActivity.this.a("10655", System.currentTimeMillis() - ImageActivity.this.f99369m);
            if (ImageActivity.this.f99361e.f99397b) {
                ImageActivity.this.a("10654", 0L);
            }
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final View.OnClickListener f99377u = new View.OnClickListener() { // from class: com.tencent.connect.avatar.ImageActivity.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageActivity.this.a("10656", System.currentTimeMillis() - ImageActivity.this.f99369m);
            ImageActivity.this.setResult(0);
            ImageActivity.this.d();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final IUiListener f99378v = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.5
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            ImageActivity.this.f99363g.setEnabled(true);
            int i10 = -1;
            ImageActivity.this.f99363g.setTextColor(-1);
            ImageActivity.this.f99362f.setEnabled(true);
            ImageActivity.this.f99362f.setTextColor(-1);
            ImageActivity.this.f99366j.setVisibility(8);
            JSONObject jSONObject = (JSONObject) obj;
            try {
                i10 = jSONObject.getInt("ret");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (i10 != 0) {
                ImageActivity.this.a("设置出错了，请重新登录再尝试下呢：）", 1);
                e.a().a(ImageActivity.this.f99358b.getOpenId(), ImageActivity.this.f99358b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, "12", "19", "1");
                return;
            }
            ImageActivity.this.a("设置成功", 0);
            ImageActivity.this.a("10658", 0L);
            e.a().a(ImageActivity.this.f99358b.getOpenId(), ImageActivity.this.f99358b.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, "12", "3", "0");
            ImageActivity imageActivity = ImageActivity.this;
            if (imageActivity.f99359c != null && !"".equals(ImageActivity.this.f99359c)) {
                Intent intent = new Intent();
                intent.setClassName(imageActivity, ImageActivity.this.f99359c);
                if (imageActivity.getPackageManager().resolveActivity(intent, 0) != null) {
                    imageActivity.startActivity(intent);
                }
            }
            ImageActivity.this.a(0, jSONObject.toString(), null, null);
            ImageActivity.this.d();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ImageActivity.this.f99363g.setEnabled(true);
            ImageActivity.this.f99363g.setTextColor(-1);
            ImageActivity.this.f99362f.setEnabled(true);
            ImageActivity.this.f99362f.setTextColor(-1);
            ImageActivity.this.f99362f.setText("重试");
            ImageActivity.this.f99366j.setVisibility(8);
            ImageActivity.this.f99368l = true;
            ImageActivity.this.a(uiError.errorMessage, 1);
            ImageActivity.this.a("10660", 0L);
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final IUiListener f99379w = new DefaultUiListener() { // from class: com.tencent.connect.avatar.ImageActivity.6
        private void a(int i10) {
            if (ImageActivity.this.f99367k < 2) {
                ImageActivity.this.e();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            int i10 = -1;
            try {
                i10 = jSONObject.getInt("ret");
                if (i10 == 0) {
                    final String string = jSONObject.getString("nickname");
                    ImageActivity.this.f99360d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageActivity.this.c(string);
                        }
                    });
                    ImageActivity.this.a("10659", 0L);
                } else {
                    ImageActivity.this.a("10661", 0L);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            if (i10 != 0) {
                a(i10);
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            a(0);
        }
    };

    /* JADX INFO: compiled from: ProGuard */
    public class QQAvatarImp extends BaseApi {
        public QQAvatarImp(QQToken qQToken) {
            super(qQToken);
        }

        public void setAvator(Bitmap bitmap, IUiListener iUiListener) {
            Bundle bundleA = a();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 40, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            BaseApi.TempRequestListener tempRequestListener = new BaseApi.TempRequestListener(iUiListener);
            bundleA.putByteArray("picture", byteArray);
            HttpUtils.requestAsync(this.f99424c, g.a(), "user/set_user_face", bundleA, "POST", tempRequestListener);
            e.a().a(this.f99424c.getOpenId(), this.f99424c.getAppId(), Constants.VIA_SET_AVATAR_SUCCEED, "12", "19", "0");
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class a extends View {
        public a(Context context) {
            super(context);
        }

        public void a(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableB = ImageActivity.this.b("com.tencent.plus.blue_normal.png");
            Drawable drawableB2 = ImageActivity.this.b("com.tencent.plus.blue_down.png");
            Drawable drawableB3 = ImageActivity.this.b("com.tencent.plus.blue_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableB2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableB);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableB);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableB);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableB3);
            button.setBackgroundDrawable(stateListDrawable);
        }

        public void b(Button button) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawableB = ImageActivity.this.b("com.tencent.plus.gray_normal.png");
            Drawable drawableB2 = ImageActivity.this.b("com.tencent.plus.gray_down.png");
            Drawable drawableB3 = ImageActivity.this.b("com.tencent.plus.gray_disable.png");
            stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, drawableB2);
            stateListDrawable.addState(View.ENABLED_FOCUSED_STATE_SET, drawableB);
            stateListDrawable.addState(View.ENABLED_STATE_SET, drawableB);
            stateListDrawable.addState(View.FOCUSED_STATE_SET, drawableB);
            stateListDrawable.addState(View.EMPTY_STATE_SET, drawableB3);
            button.setBackgroundDrawable(stateListDrawable);
        }
    }

    private Bitmap a(String str) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        Uri uri = Uri.parse(str);
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        } catch (OutOfMemoryError e10) {
            e10.printStackTrace();
        }
        inputStreamOpenInputStream.close();
        int i11 = options.outWidth;
        int i12 = options.outHeight;
        while (i11 * i12 > 4194304) {
            i11 /= 2;
            i12 /= 2;
            i10 *= 2;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        try {
            return BitmapFactory.decodeStream(getContentResolver().openInputStream(uri), null, options);
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private View a() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f99357a = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams);
        this.f99357a.setBackgroundColor(j1.f21601t);
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(layoutParams3);
        this.f99357a.addView(relativeLayout2);
        c cVar = new c(this);
        this.f99361e = cVar;
        cVar.setLayoutParams(layoutParams2);
        this.f99361e.setScaleType(ImageView.ScaleType.MATRIX);
        relativeLayout2.addView(this.f99361e);
        this.f99364h = new b(this);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(layoutParams2);
        layoutParams4.addRule(14, -1);
        layoutParams4.addRule(15, -1);
        this.f99364h.setLayoutParams(layoutParams4);
        relativeLayout2.addView(this.f99364h);
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, com.tencent.connect.avatar.a.a(this, 80.0f));
        layoutParams5.addRule(14, -1);
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        this.f99357a.addView(linearLayout);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 24.0f), com.tencent.connect.avatar.a.a(this, 24.0f)));
        imageView.setImageDrawable(b("com.tencent.plus.logo.png"));
        linearLayout.addView(imageView);
        this.f99365i = new TextView(this);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(layoutParams3);
        layoutParams6.leftMargin = com.tencent.connect.avatar.a.a(this, 7.0f);
        this.f99365i.setLayoutParams(layoutParams6);
        this.f99365i.setEllipsize(TextUtils.TruncateAt.END);
        this.f99365i.setSingleLine();
        this.f99365i.setTextColor(-1);
        this.f99365i.setTextSize(24.0f);
        this.f99365i.setVisibility(8);
        linearLayout.addView(this.f99365i);
        RelativeLayout relativeLayout3 = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, com.tencent.connect.avatar.a.a(this, 60.0f));
        layoutParams7.addRule(12, -1);
        layoutParams7.addRule(9, -1);
        relativeLayout3.setLayoutParams(layoutParams7);
        relativeLayout3.setBackgroundDrawable(b("com.tencent.plus.bar.png"));
        int iA = com.tencent.connect.avatar.a.a(this, 10.0f);
        relativeLayout3.setPadding(iA, iA, iA, 0);
        this.f99357a.addView(relativeLayout3);
        a aVar = new a(this);
        int iA2 = com.tencent.connect.avatar.a.a(this, 14.0f);
        int iA3 = com.tencent.connect.avatar.a.a(this, 7.0f);
        this.f99363g = new Button(this);
        this.f99363g.setLayoutParams(new RelativeLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 78.0f), com.tencent.connect.avatar.a.a(this, 45.0f)));
        this.f99363g.setText("取消");
        this.f99363g.setTextColor(-1);
        this.f99363g.setTextSize(18.0f);
        this.f99363g.setPadding(iA2, iA3, iA2, iA3);
        aVar.b(this.f99363g);
        relativeLayout3.addView(this.f99363g);
        this.f99362f = new Button(this);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 78.0f), com.tencent.connect.avatar.a.a(this, 45.0f));
        layoutParams8.addRule(11, -1);
        this.f99362f.setLayoutParams(layoutParams8);
        this.f99362f.setTextColor(-1);
        this.f99362f.setTextSize(18.0f);
        this.f99362f.setPadding(iA2, iA3, iA2, iA3);
        this.f99362f.setText("选取");
        aVar.a(this.f99362f);
        relativeLayout3.addView(this.f99362f);
        TextView textView = new TextView(this);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams9.addRule(13, -1);
        textView.setLayoutParams(layoutParams9);
        textView.setText("移动和缩放");
        textView.setPadding(0, com.tencent.connect.avatar.a.a(this, 3.0f), 0, 0);
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        relativeLayout3.addView(textView);
        this.f99366j = new ProgressBar(this);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(layoutParams3);
        layoutParams10.addRule(14, -1);
        layoutParams10.addRule(15, -1);
        this.f99366j.setLayoutParams(layoutParams10);
        this.f99366j.setVisibility(8);
        this.f99357a.addView(this.f99366j);
        return this.f99357a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_ERROR_CODE, i10);
        intent.putExtra(Constants.KEY_ERROR_MSG, str2);
        intent.putExtra(Constants.KEY_ERROR_DETAIL, str3);
        intent.putExtra(Constants.KEY_RESPONSE, str);
        setResult(-1, intent);
    }

    private void a(Bitmap bitmap) {
        new QQAvatarImp(this.f99358b).setAvator(bitmap, this.f99378v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final int i10) {
        this.f99360d.post(new Runnable() { // from class: com.tencent.connect.avatar.ImageActivity.4
            @Override // java.lang.Runnable
            public void run() {
                ImageActivity.this.b(str, i10);
            }
        });
    }

    public static void a(String str, long j10, String str2) {
        HashMap map = new HashMap();
        map.put("strValue", str2);
        map.put("nValue", str);
        map.put("qver", Constants.SDK_VERSION);
        if (j10 != 0) {
            map.put("elt", String.valueOf(j10));
        }
        h.a().a("https://cgi.qplus.com/report/report", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable b(String str) {
        return m.a(str, this);
    }

    private void b() {
        try {
            Bitmap bitmapA = a(this.f99374r);
            this.f99375s = bitmapA;
            if (bitmapA != null) {
                this.f99361e.setImageBitmap(bitmapA);
                this.f99362f.setOnClickListener(this.f99376t);
                this.f99363g.setOnClickListener(this.f99377u);
                this.f99357a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tencent.connect.avatar.ImageActivity.1
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        ImageActivity.this.f99357a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        ImageActivity imageActivity = ImageActivity.this;
                        imageActivity.f99373q = imageActivity.f99364h.a();
                        ImageActivity.this.f99361e.a(ImageActivity.this.f99373q);
                    }
                });
                return;
            }
            throw new IOException("cannot read picture: '" + this.f99374r + "'!");
        } catch (IOException e10) {
            e10.printStackTrace();
            a(Constants.MSG_IMAGE_ERROR, 1);
            a(-5, null, Constants.MSG_IMAGE_ERROR, e10.getMessage());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i10) {
        Toast toastMakeText = Toast.makeText(this, str, 1);
        LinearLayout linearLayout = (LinearLayout) toastMakeText.getView();
        ((TextView) linearLayout.getChildAt(0)).setPadding(8, 0, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(com.tencent.connect.avatar.a.a(this, 16.0f), com.tencent.connect.avatar.a.a(this, 16.0f)));
        if (i10 == 0) {
            imageView.setImageDrawable(b("com.tencent.plus.ic_success.png"));
        } else {
            imageView.setImageDrawable(b("com.tencent.plus.ic_error.png"));
        }
        linearLayout.addView(imageView, 0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        toastMakeText.setView(linearLayout);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        float fWidth = this.f99373q.width();
        Matrix imageMatrix = this.f99361e.getImageMatrix();
        float[] fArr = new float[9];
        imageMatrix.getValues(fArr);
        float f10 = fArr[2];
        float f11 = fArr[5];
        float f12 = fArr[0];
        float f13 = 640.0f / fWidth;
        Rect rect = this.f99373q;
        int i10 = (int) ((rect.left - f10) / f12);
        int i11 = i10 < 0 ? 0 : i10;
        int i12 = (int) ((rect.top - f11) / f12);
        int i13 = i12 < 0 ? 0 : i12;
        Matrix matrix = new Matrix();
        matrix.set(imageMatrix);
        matrix.postScale(f13, f13);
        int i14 = (int) (650.0f / f12);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f99375s, i11, i13, Math.min(this.f99375s.getWidth() - i11, i14), Math.min(this.f99375s.getHeight() - i13, i14), matrix, true);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bb.c.b.f30883q9, bb.c.b.f30883q9);
            bitmapCreateBitmap.recycle();
            a(bitmapCreateBitmap2);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            a(Constants.MSG_IMAGE_ERROR, 1);
            a(-5, null, Constants.MSG_IMAGE_ERROR, e10.getMessage());
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        String strD = d(str);
        if ("".equals(strD)) {
            return;
        }
        this.f99365i.setText(strD);
        this.f99365i.setVisibility(0);
    }

    private String d(String str) {
        return str.replaceAll("&gt;", ">").replaceAll("&lt;", "<").replaceAll("&quot;", "\"").replaceAll("&#39;", "'").replaceAll("&amp;", "&");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        finish();
        int i10 = this.f99370n;
        if (i10 != 0) {
            overridePendingTransition(0, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.f99367k++;
        new UserInfo(this, this.f99358b).getUserInfo(this.f99379w);
    }

    public void a(String str, long j10) {
        a(str, j10, this.f99358b.getAppId());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        d();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        setContentView(a());
        this.f99360d = new Handler();
        Bundle bundleExtra = getIntent().getBundleExtra(Constants.KEY_PARAMS);
        this.f99374r = bundleExtra.getString("picture");
        this.f99359c = bundleExtra.getString("return_activity");
        String string = bundleExtra.getString("appid");
        String string2 = bundleExtra.getString("access_token");
        long j10 = bundleExtra.getLong("expires_in");
        String string3 = bundleExtra.getString("openid");
        this.f99370n = bundleExtra.getInt("exitAnim");
        QQToken qQToken = new QQToken(string);
        this.f99358b = qQToken;
        qQToken.setAccessToken(string2, ((j10 - System.currentTimeMillis()) / 1000) + "");
        this.f99358b.setOpenId(string3);
        b();
        e();
        this.f99369m = System.currentTimeMillis();
        a("10653", 0L);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f99361e.setImageBitmap(null);
        Bitmap bitmap = this.f99375s;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f99375s.recycle();
    }
}
