package com.tencent.connect.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.open.utils.i;
import com.tencent.open.utils.j;
import com.tencent.open.utils.k;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import com.tencent.open.web.security.JniInterface;
import com.tencent.tauth.DefaultUiListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class AuthAgent extends BaseApi {
    public static final String KEY_FORCE_QR_LOGIN = "KEY_FORCE_QR_LOGIN";
    public static final String SECURE_LIB_ARM64_FILE_NAME = "libwbsafeedit_64";
    public static final String SECURE_LIB_ARM_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_FILE_NAME = "libwbsafeedit";
    public static String SECURE_LIB_NAME = null;
    public static final int SECURE_LIB_VERSION = 5;
    public static final String SECURE_LIB_X86_64_FILE_NAME = "libwbsafeedit_x86_64";
    public static final String SECURE_LIB_X86_FILE_NAME = "libwbsafeedit_x86";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IUiListener f99276a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f99277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f99278e;

    /* JADX INFO: compiled from: ProGuard */
    public class a extends DefaultUiListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        IUiListener f99284a;

        public a(IUiListener iUiListener) {
            this.f99284a = iUiListener;
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            IUiListener iUiListener = this.f99284a;
            if (iUiListener != null) {
                iUiListener.onCancel();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                SLog.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data is null");
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            try {
                int i10 = jSONObject.getInt("ret");
                String string = i10 == 0 ? "success" : jSONObject.getString("msg");
                IUiListener iUiListener = this.f99284a;
                if (iUiListener != null) {
                    iUiListener.onComplete(new JSONObject().put("ret", i10).put("msg", string));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                SLog.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data format error");
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            IUiListener iUiListener = this.f99284a;
            if (iUiListener != null) {
                iUiListener.onError(uiError);
            }
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class b extends DefaultUiListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<IUiListener> f99286a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f99288c = "sendinstall";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f99289d = "installwording";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f99290e = "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi";

        /* JADX INFO: compiled from: ProGuard */
        public abstract class a implements View.OnClickListener {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Dialog f99300d;

            a(Dialog dialog) {
                this.f99300d = dialog;
            }
        }

        public b(IUiListener iUiListener) {
            this.f99286a = new WeakReference<>(iUiListener);
        }

        private Drawable a(String str, Context context) {
            Bitmap bitmapDecodeStream;
            Drawable drawableCreateFromStream = null;
            try {
                InputStream inputStreamOpen = context.getApplicationContext().getAssets().open(str);
                if (inputStreamOpen == null) {
                    return null;
                }
                if (!str.endsWith(".9.png")) {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                    inputStreamOpen.close();
                    return drawableCreateFromStream;
                }
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                } catch (OutOfMemoryError e10) {
                    e10.printStackTrace();
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                    return null;
                }
                byte[] ninePatchChunk = bitmapDecodeStream.getNinePatchChunk();
                NinePatch.isNinePatchChunk(ninePatchChunk);
                return new NinePatchDrawable(bitmapDecodeStream, ninePatchChunk, new Rect(), null);
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }

        private View a(Context context, Drawable drawable, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setId(1);
            int i10 = (int) (60.0f * f10);
            int i11 = (int) (f10 * 14.0f);
            int i12 = (int) (18.0f * f10);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
            layoutParams.addRule(9);
            layoutParams.setMargins(0, i12, (int) (6.0f * f10), i12);
            relativeLayout.addView(imageView, layoutParams);
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setTextSize(14.0f);
            textView.setGravity(3);
            textView.setIncludeFontPadding(false);
            textView.setPadding(0, 0, 0, 0);
            textView.setLines(2);
            textView.setId(5);
            textView.setMinWidth((int) (185.0f * f10));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, 1);
            layoutParams2.addRule(6, 1);
            float f11 = 5.0f * f10;
            layoutParams2.setMargins(0, 0, (int) f11, 0);
            relativeLayout.addView(textView, layoutParams2);
            View view = new View(context);
            view.setBackgroundColor(Color.rgb(bb.c.b.f30645g1, bb.c.b.f30645g1, bb.c.b.f30645g1));
            view.setId(3);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, 2);
            layoutParams3.addRule(3, 1);
            layoutParams3.addRule(5, 1);
            layoutParams3.addRule(7, 5);
            int i13 = (int) (12.0f * f10);
            layoutParams3.setMargins(0, 0, 0, i13);
            relativeLayout.addView(view, layoutParams3);
            LinearLayout linearLayout = new LinearLayout(context);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(5, 1);
            layoutParams4.addRule(7, 5);
            layoutParams4.addRule(3, 3);
            Button button = new Button(context);
            button.setText("跳过");
            button.setBackgroundDrawable(a("buttonNegt.png", context));
            button.setTextColor(Color.rgb(36, 97, 131));
            button.setTextSize(20.0f);
            button.setOnClickListener(onClickListener2);
            button.setId(4);
            int i14 = (int) (45.0f * f10);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, i14);
            layoutParams5.rightMargin = i11;
            int i15 = (int) (4.0f * f10);
            layoutParams5.leftMargin = i15;
            layoutParams5.weight = 1.0f;
            linearLayout.addView(button, layoutParams5);
            Button button2 = new Button(context);
            button2.setText("确定");
            button2.setTextSize(20.0f);
            button2.setTextColor(Color.rgb(255, 255, 255));
            button2.setBackgroundDrawable(a("buttonPost.png", context));
            button2.setOnClickListener(onClickListener);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, i14);
            layoutParams6.weight = 1.0f;
            layoutParams6.rightMargin = i15;
            linearLayout.addView(button2, layoutParams6);
            relativeLayout.addView(linearLayout, layoutParams4);
            ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) (279.0f * f10), (int) (f10 * 163.0f));
            relativeLayout.setPadding(i11, 0, i13, i13);
            relativeLayout.setLayoutParams(layoutParams7);
            relativeLayout.setBackgroundColor(Color.rgb(247, 251, 247));
            PaintDrawable paintDrawable = new PaintDrawable(Color.rgb(247, 251, 247));
            paintDrawable.setCornerRadius(f11);
            relativeLayout.setBackgroundDrawable(paintDrawable);
            return relativeLayout;
        }

        private void a(String str, final IUiListener iUiListener, final Object obj) {
            PackageInfo packageInfo;
            if (AuthAgent.this.f99278e == null) {
                SLog.i("openSDK_LOG.AuthAgent", "showFeedConfrimDialog mActivity null and return");
                return;
            }
            Activity activity = (Activity) AuthAgent.this.f99278e.get();
            if (activity == null) {
                SLog.i("openSDK_LOG.AuthAgent", "showFeedConfrimDialog mActivity.get() null and return");
                return;
            }
            Dialog dialog = new Dialog(activity);
            dialog.requestWindowFeature(1);
            PackageManager packageManager = activity.getPackageManager();
            try {
                packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                SLog.e("openSDK_LOG.AuthAgent", "showFeedConfrimDialog exception:" + e10.getStackTrace().toString());
                packageInfo = null;
            }
            Drawable drawableLoadIcon = packageInfo != null ? packageInfo.applicationInfo.loadIcon(packageManager) : null;
            View.OnClickListener onClickListener = new a(dialog) { // from class: com.tencent.connect.auth.AuthAgent.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    b.this.a();
                    Dialog dialog2 = this.f99300d;
                    if (dialog2 != null && dialog2.isShowing()) {
                        this.f99300d.dismiss();
                    }
                    IUiListener iUiListener2 = iUiListener;
                    if (iUiListener2 != null) {
                        iUiListener2.onComplete(obj);
                    }
                }
            };
            View.OnClickListener onClickListener2 = new a(dialog) { // from class: com.tencent.connect.auth.AuthAgent.b.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Dialog dialog2 = this.f99300d;
                    if (dialog2 != null && dialog2.isShowing()) {
                        this.f99300d.dismiss();
                    }
                    IUiListener iUiListener2 = iUiListener;
                    if (iUiListener2 != null) {
                        iUiListener2.onComplete(obj);
                    }
                }
            };
            ColorDrawable colorDrawable = new ColorDrawable();
            colorDrawable.setAlpha(0);
            dialog.getWindow().setBackgroundDrawable(colorDrawable);
            dialog.setContentView(a(activity, drawableLoadIcon, str, onClickListener, onClickListener2));
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tencent.connect.auth.AuthAgent.b.3
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IUiListener iUiListener2 = iUiListener;
                    if (iUiListener2 != null) {
                        iUiListener2.onComplete(obj);
                    }
                }
            });
            if (activity.isFinishing()) {
                return;
            }
            dialog.show();
        }

        protected void a() {
            Activity activity;
            Bundle bundleB = AuthAgent.this.b();
            if (AuthAgent.this.f99278e == null || (activity = (Activity) AuthAgent.this.f99278e.get()) == null) {
                return;
            }
            HttpUtils.requestAsync(((BaseApi) AuthAgent.this).f99424c, activity, "https://appsupport.qq.com/cgi-bin/qzapps/mapp_addapp.cgi", bundleB, "POST", null);
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            if (this.f99286a.get() != null) {
                this.f99286a.get().onCancel();
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            boolean z10;
            String string;
            if (obj != null) {
                JSONObject jSONObject = (JSONObject) obj;
                boolean zSaveSession = false;
                try {
                    z10 = jSONObject.getInt("sendinstall") == 1;
                    try {
                        string = jSONObject.getString("installwording");
                    } catch (JSONException unused) {
                        SLog.w("openSDK_LOG.AuthAgent", "FeedConfirmListener onComplete There is no value for sendinstall.");
                        string = "";
                    }
                } catch (JSONException unused2) {
                    z10 = false;
                }
                String strDecode = URLDecoder.decode(string);
                SLog.i("openSDK_LOG.AuthAgent", " WORDING = " + strDecode + "xx,showConfirmDialog=" + z10);
                if (z10 && !TextUtils.isEmpty(strDecode)) {
                    a(strDecode, this.f99286a.get(), obj);
                    SLog.i("openSDK_LOG.AuthAgent", " WORDING is not empty and return");
                    return;
                }
                IUiListener iUiListener = this.f99286a.get();
                if (iUiListener == null) {
                    SLog.i("openSDK_LOG.AuthAgent", " userListener is null");
                    return;
                }
                if (((BaseApi) AuthAgent.this).f99424c != null) {
                    zSaveSession = ((BaseApi) AuthAgent.this).f99424c.saveSession(jSONObject);
                    SLog.i("openSDK_LOG.AuthAgent", " saveSession saveSuccess=" + zSaveSession);
                }
                if (zSaveSession) {
                    iUiListener.onComplete(obj);
                } else {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PERSISTENCE_FAIL, null));
                }
            }
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            if (this.f99286a.get() != null) {
                this.f99286a.get().onError(uiError);
            }
        }
    }

    /* JADX INFO: compiled from: ProGuard */
    public class c extends DefaultUiListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IUiListener f99303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f99304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f99305d;

        public c(Context context, IUiListener iUiListener, boolean z10, boolean z11) {
            this.f99305d = context;
            this.f99303b = iUiListener;
            this.f99304c = z10;
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
            this.f99303b.onCancel();
            SLog.release();
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0072 A[Catch: JSONException -> 0x007a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x007a, blocks: (B:3:0x000f, B:5:0x0024, B:8:0x002e, B:9:0x004b, B:15:0x006e, B:17:0x0072, B:14:0x0068, B:11:0x0051), top: B:25:0x000f, inners: #0 }] */
        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
            JSONObject jSONObject = (JSONObject) obj;
            try {
                String string = jSONObject.getString("access_token");
                String string2 = jSONObject.getString("expires_in");
                String string3 = jSONObject.getString("openid");
                if (string != null && ((BaseApi) AuthAgent.this).f99424c != null && string3 != null) {
                    ((BaseApi) AuthAgent.this).f99424c.setAccessToken(string, string2);
                    ((BaseApi) AuthAgent.this).f99424c.setOpenId(string3);
                    com.tencent.connect.a.a.d(this.f99305d, ((BaseApi) AuthAgent.this).f99424c);
                }
                String string4 = jSONObject.getString("pf");
                if (string4 != null) {
                    try {
                        this.f99305d.getSharedPreferences(Constants.PREFERENCE_PF, 0).edit().putString("pf", string4).commit();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        SLog.e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e10);
                    }
                    if (this.f99304c) {
                        CookieSyncManager.getInstance().sync();
                    }
                } else if (this.f99304c) {
                    CookieSyncManager.getInstance().sync();
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
                SLog.e("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", e11);
            }
            this.f99303b.onComplete(jSONObject);
            AuthAgent.this.releaseResource();
            SLog.release();
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            SLog.d("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
            this.f99303b.onError(uiError);
            SLog.release();
        }
    }

    static {
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + DynamicSoManager.f77250e;
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + DynamicSoManager.f77250e;
            SLog.i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase(com.max.xiaoheihe.dynamic_so.a.f77018b)) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_ARM64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + DynamicSoManager.f77250e;
            SLog.i("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
            return;
        }
        if (str.equalsIgnoreCase("x86")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + DynamicSoManager.f77250e;
            SLog.i("openSDK_LOG.AuthAgent", "is x86 architecture");
            return;
        }
        if (str.equalsIgnoreCase("x86_64")) {
            SECURE_LIB_FILE_NAME = SECURE_LIB_X86_64_FILE_NAME;
            SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + DynamicSoManager.f77250e;
            SLog.i("openSDK_LOG.AuthAgent", "is x86_64 architecture");
            return;
        }
        SECURE_LIB_FILE_NAME = SECURE_LIB_ARM_FILE_NAME;
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + DynamicSoManager.f77250e;
        SLog.i("openSDK_LOG.AuthAgent", "is arm(default) architecture");
    }

    public AuthAgent(QQToken qQToken) {
        super(qQToken);
    }

    private int a(boolean z10, IUiListener iUiListener, boolean z11, Map<String, Object> map) {
        CookieSyncManager.createInstance(g.a());
        Bundle bundleA = a();
        if (z10) {
            bundleA.putString("isadd", "1");
        }
        bundleA.putString("scope", this.f99277d);
        bundleA.putString(Constants.PARAM_CLIENT_ID, this.f99424c.getAppId());
        if (BaseApi.isOEM) {
            bundleA.putString("pf", "desktop_m_qq-" + BaseApi.installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.businessId);
        } else {
            bundleA.putString("pf", Constants.DEFAULT_PF);
        }
        String str = (System.currentTimeMillis() / 1000) + "";
        bundleA.putString("sign", k.b(g.a(), str));
        bundleA.putString("time", str);
        bundleA.putString("display", "mobile");
        bundleA.putString(i7.a.i.f119306a, "token");
        bundleA.putString(i7.a.i.f119307b, "auth://tauth.qq.com/");
        bundleA.putString("cancel_display", "1");
        bundleA.putString("switch", "1");
        bundleA.putString("compat_v", "1");
        if (z11) {
            bundleA.putString("style", "qr");
        }
        String strB = b(map);
        SLog.i("openSDK_LOG.AuthAgent", "OpenUI, showDialog addLoginAccount: " + strB);
        if (strB != null && !strB.isEmpty()) {
            bundleA.putString("uin", strB);
        }
        boolean zA = a(map);
        bundleA.putString("show_download_ui", Boolean.toString(zA));
        SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start, isShowDownloadUi=" + zA);
        final String str2 = j.a().a(g.a(), "https://openmobile.qq.com/oauth2.0/m_authorize?") + HttpUtils.encodeUrl(bundleA);
        final c cVar = new c(g.a(), iUiListener, true, false);
        SLog.d("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
        l.b(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1
            @Override // java.lang.Runnable
            public void run() {
                final Activity activity;
                k.a(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 5);
                JniInterface.loadSo();
                if (AuthAgent.this.f99278e == null || (activity = (Activity) AuthAgent.this.f99278e.get()) == null) {
                    return;
                }
                activity.runOnUiThread(new Runnable() { // from class: com.tencent.connect.auth.AuthAgent.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (JniInterface.isJniOk) {
                            Activity activity2 = activity;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            com.tencent.connect.auth.a aVar = new com.tencent.connect.auth.a(activity2, "action_login", str2, cVar, ((BaseApi) AuthAgent.this).f99424c);
                            if (activity.isFinishing()) {
                                return;
                            }
                            aVar.show();
                            return;
                        }
                        SLog.w("openSDK_LOG.AuthAgent", "OpenUi, secure so load failed, goto download QQ.");
                        Activity activity3 = activity;
                        String strA = AuthAgent.this.a("");
                        AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                        TDialog tDialog = new TDialog(activity3, "", strA, cVar, ((BaseApi) AuthAgent.this).f99424c);
                        if (activity.isFinishing()) {
                            return;
                        }
                        tDialog.show();
                    }
                });
            }
        });
        SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
        return 2;
    }

    private String a(Bundle bundle) {
        String string = bundle.getString("status_os");
        String string2 = bundle.getString("status_machine");
        String string3 = bundle.getString("status_version");
        String string4 = bundle.getString(SocializeProtocolConstants.PROTOCOL_KEY_VERSION);
        String string5 = bundle.getString(Constants.PARAM_CLIENT_ID);
        String string6 = bundle.getString("need_pay");
        String string7 = bundle.getString("pf");
        SLog.d("openSDK_LOG.AuthAgent", "os=" + string + ", machine=" + string2 + ", version=" + string3 + ", sdkv=" + string4 + ", appId=" + string5 + ", needPay=" + string6 + ", pf=" + string7);
        StringBuilder sb2 = new StringBuilder();
        if (string == null) {
            string = "";
        }
        sb2.append(string);
        if (string2 == null) {
            string2 = "";
        }
        sb2.append(string2);
        if (string3 == null) {
            string3 = "";
        }
        sb2.append(string3);
        if (string4 == null) {
            string4 = "";
        }
        sb2.append(string4);
        if (string5 == null) {
            string5 = "";
        }
        sb2.append(string5);
        if (string6 == null) {
            string6 = "";
        }
        sb2.append(string6);
        if (string7 == null) {
            string7 = "";
        }
        sb2.append(string7);
        return sb2.toString();
    }

    private void a(Bundle bundle, Map<String, Object> map) {
        String strB = b(map);
        if (strB == null || strB.isEmpty()) {
            return;
        }
        bundle.putString(Constants.KEY_ADD_LOGIN_ACCOUNT, strB);
    }

    private boolean a(Activity activity, Fragment fragment, Map<String, Object> map, boolean z10, Object[] objArr) {
        SLog.i("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
        Intent intentC = c();
        if (intentC != null) {
            Bundle bundleA = a();
            if (z10) {
                bundleA.putString("isadd", "1");
            }
            bundleA.putString("scope", this.f99277d);
            bundleA.putString(Constants.PARAM_CLIENT_ID, this.f99424c.getAppId());
            if (BaseApi.isOEM) {
                bundleA.putString("pf", "desktop_m_qq-" + BaseApi.installChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + "android" + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.registerChannel + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER + BaseApi.businessId);
            } else {
                bundleA.putString("pf", Constants.DEFAULT_PF);
            }
            bundleA.putString("need_pay", "1");
            a(bundleA, map);
            bundleA.putString(Constants.KEY_APP_NAME, k.a(g.a()));
            intentC.putExtra(Constants.KEY_ACTION, "action_login");
            intentC.putExtra(Constants.KEY_PARAMS, bundleA);
            intentC.putExtra("appid", this.f99424c.getAppId());
            bundleA.putString(Constants.KEY_PPSTS, k.a(activity, a(bundleA)));
            try {
                this.f99276a = new b(this.f99276a);
                UIListenerManager.getInstance().setListenerWithRequestcode(11101, this.f99276a);
                if (fragment != null) {
                    SLog.d("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
                    a(fragment, intentC, 11101, map);
                } else {
                    SLog.d("openSDK_LOG.AuthAgent", "startAssitActivity activity");
                    a(activity, intentC, 11101, map);
                }
                SLog.i("openSDK_LOG.AuthAgent", "startActionActivity() -- end, found activity for loginIntent");
                e.a().a(0, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
                objArr[0] = "0";
                objArr[1] = 1;
                return true;
            } catch (Exception e10) {
                SLog.e("openSDK_LOG.AuthAgent", "startActionActivity() exception", e10);
            }
        }
        e.a().a(1, "LOGIN_CHECK_SDK", Constants.DEFAULT_UIN, this.f99424c.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
        SLog.i("openSDK_LOG.AuthAgent", "startActionActivity() -- end, no target activity for loginIntent");
        return false;
    }

    private boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        Object obj = map.get(Constants.KEY_ENABLE_SHOW_DOWNLOAD_URL);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return true;
    }

    private String b(Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        Object obj = map.get(Constants.KEY_ADD_LOGIN_ACCOUNT);
        return obj instanceof String ? ((String) obj).trim() : "";
    }

    int a(Activity activity, String str, IUiListener iUiListener, boolean z10, Fragment fragment, boolean z11) {
        return doLogin(activity, str, iUiListener, z10, fragment, z11, null);
    }

    protected void a(IUiListener iUiListener) {
        String strG;
        SLog.i("openSDK_LOG.AuthAgent", "reportDAU() -- start");
        String accessToken = this.f99424c.getAccessToken();
        String openId = this.f99424c.getOpenId();
        String appId = this.f99424c.getAppId();
        if (TextUtils.isEmpty(accessToken) || TextUtils.isEmpty(openId) || TextUtils.isEmpty(appId)) {
            strG = "";
        } else {
            strG = m.g("tencent&sdk&qazxc***14969%%" + accessToken + appId + openId + "qzone3.4");
        }
        if (TextUtils.isEmpty(strG)) {
            SLog.e("openSDK_LOG.AuthAgent", "reportDAU -- encrytoken is null");
            return;
        }
        Bundle bundleA = a();
        bundleA.putString("encrytoken", strG);
        HttpUtils.requestAsync(this.f99424c, g.a(), "https://openmobile.qq.com/user/user_login_statis", bundleA, "POST", null);
        SLog.i("openSDK_LOG.AuthAgent", "reportDAU() -- end");
    }

    protected void b(IUiListener iUiListener) {
        Bundle bundleA = a();
        bundleA.putString("reqType", "checkLogin");
        HttpUtils.requestAsync(this.f99424c, g.a(), "https://openmobile.qq.com/v3/user/get_info", bundleA, "GET", new BaseApi.TempRequestListener(new a(iUiListener)));
    }

    public int doLogin(Activity activity, String str, IUiListener iUiListener, boolean z10, Fragment fragment, boolean z11, Map<String, Object> map) {
        if (com.tencent.connect.a.a("openSDK_LOG.AuthAgent", iUiListener)) {
            return -1;
        }
        this.f99277d = str;
        this.f99278e = new WeakReference<>(activity);
        this.f99276a = iUiListener;
        Object[] objArr = new Object[2];
        boolean booleanExtra = activity.getIntent().getBooleanExtra(KEY_FORCE_QR_LOGIN, false);
        boolean zB = i.a(activity, this.f99424c.getAppId()).b("C_LoginWeb");
        SLog.i("openSDK_LOG.AuthAgent", "doLogin needForceQrLogin=" + booleanExtra + ", toWebLogin=" + zB);
        if (!booleanExtra && !zB && a(activity, fragment, map, z10, objArr)) {
            SLog.i("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
            e.a().a(this.f99424c.getOpenId(), this.f99424c.getAppId(), "2", "1", "5", (String) objArr[0], "0", "0");
            return ((Integer) objArr[1]).intValue();
        }
        e.a().a(this.f99424c.getOpenId(), this.f99424c.getAppId(), "2", "1", "5", "1", "0", "0");
        SLog.w("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
        b bVar = new b(this.f99276a);
        this.f99276a = bVar;
        return a(z10, bVar, z11, map);
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
        this.f99276a = null;
    }
}
