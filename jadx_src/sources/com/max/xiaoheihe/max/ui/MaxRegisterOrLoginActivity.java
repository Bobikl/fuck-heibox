package com.max.xiaoheihe.max.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.MainActivity;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.account.GetRegisterCodeObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.m0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.connect.common.Constants;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRegisterOrLoginActivity extends BaseActivity implements View.OnClickListener, com.max.xiaoheihe.max.helper.a.k {
    public static final int B4 = 3;
    public static final int C4 = 4;
    public static final int D4 = 5;
    public static final int E4 = 6;
    public static final int F4 = 7;
    public static final String G4 = "slectview";
    private static final int H4 = 500;
    public static ChangeQuickRedirect changeQuickRedirect;
    private View A4;
    private View.OnClickListener G2;
    private EditText J3;
    private EditText K3;
    private Activity L;
    private TextView L3;
    private Button M;
    private Button M3;
    private View N;
    private ViewGroup N3;
    private View O;
    private ViewGroup O3;
    private View P;
    private View Q;
    private View R;
    private View S;
    private EditText S3;
    private View T;
    private Button T3;
    private View U;
    private TextView V;
    String V3;
    private ImageButton W;
    String W3;
    private int X;
    String X3;
    private int Y;
    private TextView Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private TextView f77346a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private EditText f77348b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private EditText f77350c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private ImageView f77351d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private Button f77352e4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private Timer f77358k4;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private TimerTask f77359l4;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private String f77360m4;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private EditText f77362o4;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private View.OnClickListener f77364p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private LoadingDialog f77365p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private EditText f77366p4;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private Button f77367q4;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private EditText f77369s4;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private EditText f77370t4;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private Button f77371u4;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private View.OnClickListener f77374x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private View.OnClickListener f77375x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private View.OnClickListener f77377y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private View.OnClickListener f77378y2;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private TextView f77379y4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private CheckBox f77380z4;
    private boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f77345a0 = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f77347b0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final int f77349c0 = 11;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private Map<Integer, com.max.xiaoheihe.max.helper.a> f77363p1 = new HashMap();
    private final int G3 = 6;
    private String P3 = "";
    private String Q3 = "";
    private UMShareAPI R3 = null;
    private String U3 = "";
    private final int Y3 = 4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private String f77353f4 = "";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private String f77354g4 = "";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private String f77355h4 = "";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private String f77356i4 = "";

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private int f77357j4 = 60;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private final int f77361n4 = 20;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private final Handler f77368r4 = new k();

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private String f77372v4 = "";

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private String f77373w4 = "";

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private String f77376x4 = "";

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22260, new Class[]{View.class}, Void.TYPE).isSupported || view.getId() != R.id.bt_click_login || com.max.hbcommon.utils.c.g(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.J3, MaxRegisterOrLoginActivity.this.getString(R.string.account_empty)) || com.max.hbcommon.utils.c.j(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.J3, 11, MaxRegisterOrLoginActivity.this.getString(R.string.account_length_msg), true) || com.max.hbcommon.utils.c.g(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.K3, MaxRegisterOrLoginActivity.this.getString(R.string.pwd_empty_msg)) || com.max.hbcommon.utils.c.j(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.K3, 6, MaxRegisterOrLoginActivity.this.getString(R.string.pwd_min_msg), true) || !com.max.hbcommon.utils.c.m(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.J3, true)) {
                return;
            }
            MaxRegisterOrLoginActivity.r2(MaxRegisterOrLoginActivity.this, false);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22261, new Class[]{View.class}, Void.TYPE).isSupported && com.max.hbcommon.utils.c.l(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.S3, true) && com.max.hbcommon.utils.i.c(MaxRegisterOrLoginActivity.this.L)) {
                MaxRegisterOrLoginActivity.X1(MaxRegisterOrLoginActivity.this, Boolean.FALSE);
            }
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22262, new Class[]{View.class}, Void.TYPE).isSupported || view.getId() != R.id.bt_click_login || com.max.hbcommon.utils.c.g(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.f77369s4, MaxRegisterOrLoginActivity.this.getString(R.string.account_empty)) || com.max.hbcommon.utils.c.g(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.f77370t4, MaxRegisterOrLoginActivity.this.getString(R.string.pwd_empty_msg))) {
                return;
            }
            MaxRegisterOrLoginActivity maxRegisterOrLoginActivity = MaxRegisterOrLoginActivity.this;
            MaxRegisterOrLoginActivity.y2(maxRegisterOrLoginActivity, maxRegisterOrLoginActivity.getString(R.string.logining));
            MaxRegisterOrLoginActivity maxRegisterOrLoginActivity2 = MaxRegisterOrLoginActivity.this;
            maxRegisterOrLoginActivity2.f77372v4 = maxRegisterOrLoginActivity2.f77369s4.getText().toString().trim();
            MaxRegisterOrLoginActivity maxRegisterOrLoginActivity3 = MaxRegisterOrLoginActivity.this;
            maxRegisterOrLoginActivity3.f77376x4 = maxRegisterOrLoginActivity3.f77370t4.getText().toString().trim();
            MaxRegisterOrLoginActivity.r2(MaxRegisterOrLoginActivity.this, true);
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22263, new Class[]{Throwable.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                super.onError(th2);
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        public void onNext(Result<User> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22264, new Class[]{Result.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
                com.max.hbcache.c.C("user_account", MaxRegisterOrLoginActivity.this.P3);
                com.max.hbcache.c.C("user_bind_phone", MaxRegisterOrLoginActivity.this.P3);
                MaxRegisterOrLoginActivity.a3(MaxRegisterOrLoginActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22265, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class e extends com.max.hbcommon.network.d<Result<GetRegisterCodeObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Boolean f77385b;

        e(Boolean bool) {
            this.f77385b = bool;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22266, new Class[]{Throwable.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                super.onError(th2);
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        public void onNext(Result<GetRegisterCodeObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22267, new Class[]{Result.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
                if (result == null || result.getResult() == null) {
                    return;
                }
                int iQ = com.max.hbutils.utils.n.q(result.getResult().getRemain_time());
                if (this.f77385b.booleanValue()) {
                    MaxRegisterOrLoginActivity maxRegisterOrLoginActivity = MaxRegisterOrLoginActivity.this;
                    if (iQ == 0) {
                        iQ = 60;
                    }
                    MaxRegisterOrLoginActivity.G2(maxRegisterOrLoginActivity, iQ);
                    return;
                }
                MaxRegisterOrLoginActivity maxRegisterOrLoginActivity2 = MaxRegisterOrLoginActivity.this;
                if (iQ == 0) {
                    iQ = 60;
                }
                MaxRegisterOrLoginActivity.C2(maxRegisterOrLoginActivity2, iQ);
                MaxRegisterOrLoginActivity maxRegisterOrLoginActivity3 = MaxRegisterOrLoginActivity.this;
                MaxRegisterOrLoginActivity.f2(maxRegisterOrLoginActivity3, maxRegisterOrLoginActivity3.O, MaxRegisterOrLoginActivity.this.P);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22268, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GetRegisterCodeObj>) obj);
        }
    }

    public class f extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22269, new Class[]{Throwable.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                super.onError(th2);
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22270, new Class[]{Result.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
                MaxRegisterOrLoginActivity.this.f77360m4 = result.getKeyMap().get("sid");
                MaxRegisterOrLoginActivity maxRegisterOrLoginActivity = MaxRegisterOrLoginActivity.this;
                MaxRegisterOrLoginActivity.f2(maxRegisterOrLoginActivity, maxRegisterOrLoginActivity.P, MaxRegisterOrLoginActivity.this.Q);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22271, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22273, new Class[0], Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22272, new Class[]{Throwable.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                super.onError(th2);
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22274, new Class[]{Result.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                MaxRegisterOrLoginActivity maxRegisterOrLoginActivity = MaxRegisterOrLoginActivity.this;
                MaxRegisterOrLoginActivity.J2(maxRegisterOrLoginActivity, maxRegisterOrLoginActivity.Q, MaxRegisterOrLoginActivity.this.R);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22275, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class h extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22276, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            MaxRegisterOrLoginActivity.this.f77368r4.sendMessage(message);
        }
    }

    public class i extends TimerTask {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22277, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Message message = new Message();
            message.what = 1;
            MaxRegisterOrLoginActivity.this.f77368r4.sendMessage(message);
        }
    }

    public class j implements com.max.xiaoheihe.max.helper.a.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f77391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f77392b;

        j(View view, View view2) {
            this.f77391a = view;
            this.f77392b = view2;
        }

        @Override // com.max.xiaoheihe.max.helper.a.l
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22278, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (MaxRegisterOrLoginActivity.this.Z || MaxRegisterOrLoginActivity.this.Y == this.f77391a.getId()) {
                Log.d("animation", "animationing");
                return;
            }
            MaxRegisterOrLoginActivity.this.W.setVisibility(0);
            MaxRegisterOrLoginActivity.this.Y = this.f77391a.getId();
            MaxRegisterOrLoginActivity.this.X = this.f77392b.getId();
            MaxRegisterOrLoginActivity.this.i3(this.f77391a);
            MaxRegisterOrLoginActivity.this.T3(this.f77392b);
        }
    }

    public class k extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 22259, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            if (MaxRegisterOrLoginActivity.this.f77357j4 <= 1) {
                MaxRegisterOrLoginActivity.this.f77350c4.setText(MaxRegisterOrLoginActivity.this.getString(R.string.resend));
                MaxRegisterOrLoginActivity.this.f77350c4.setBackgroundColor(MaxRegisterOrLoginActivity.this.L.getResources().getColor(R.color.text_01));
                MaxRegisterOrLoginActivity.this.f77350c4.setEnabled(true);
                MaxRegisterOrLoginActivity.this.f77350c4.setClickable(true);
                return;
            }
            MaxRegisterOrLoginActivity.this.f77350c4.setText(MaxRegisterOrLoginActivity.N1(MaxRegisterOrLoginActivity.this) + MaxRegisterOrLoginActivity.this.getString(R.string.resend_verification_code_in_sec));
            MaxRegisterOrLoginActivity.this.f77350c4.setEnabled(false);
            MaxRegisterOrLoginActivity.this.f77350c4.setClickable(false);
        }
    }

    public class l implements UMAuthListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SHARE_MEDIA f77395a;

        public class a implements UMAuthListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f77397a;

            a(String str) {
                this.f77397a = str;
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i10) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10)}, this, changeQuickRedirect, false, 22285, new Class[]{SHARE_MEDIA.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.cancel));
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), map}, this, changeQuickRedirect, false, 22283, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (map != null) {
                    MaxRegisterOrLoginActivity.V2(MaxRegisterOrLoginActivity.this, map.get("unionid"), map.get("openid"), this.f77397a, map.get("profile_image_url"), map.get("screen_name"), map.get(g0.a.G));
                } else {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.fail));
                }
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
                if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), th2}, this, changeQuickRedirect, false, 22284, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.fail));
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        }

        l(SHARE_MEDIA share_media) {
            this.f77395a = share_media;
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onCancel(SHARE_MEDIA share_media, int i10) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10)}, this, changeQuickRedirect, false, 22282, new Class[]{SHARE_MEDIA.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.cancel));
            MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onComplete(SHARE_MEDIA share_media, int i10, Map<String, String> map) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), map}, this, changeQuickRedirect, false, 22280, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Map.class}, Void.TYPE).isSupported) {
                return;
            }
            String str = map.get("access_token");
            com.max.hbcommon.utils.d.b("weixinlogin", "  doOauthVerifyonComplete");
            if (com.max.hbcommon.utils.c.u(str) || MaxRegisterOrLoginActivity.this.R3 == null) {
                return;
            }
            MaxRegisterOrLoginActivity.this.R3.getPlatformInfo(((BaseActivity) MaxRegisterOrLoginActivity.this).f66601b, this.f77395a, new a(str));
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onError(SHARE_MEDIA share_media, int i10, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, new Integer(i10), th2}, this, changeQuickRedirect, false, 22281, new Class[]{SHARE_MEDIA.class, Integer.TYPE, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.fail));
            MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
        }

        @Override // com.umeng.socialize.UMAuthListener
        public void onStart(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22279, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("weixinlogin", "  doOauthVerifyonStart");
        }
    }

    public class m implements com.max.xiaoheihe.max.helper.a.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.xiaoheihe.max.helper.a.l
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22286, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MaxRegisterOrLoginActivity.W2(MaxRegisterOrLoginActivity.this);
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22287, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MaxRegisterOrLoginActivity.X2(MaxRegisterOrLoginActivity.this);
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f77401b;

        o(l0.g gVar) {
            this.f77401b = gVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22288, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f77401b.a();
            dialogInterface.dismiss();
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22289, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MaxRegisterOrLoginActivity.h2(MaxRegisterOrLoginActivity.this);
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 22290, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class r extends com.max.hbcommon.network.d<Result<User>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f77405b;

        r(String str) {
            this.f77405b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 22291, new Class[]{Throwable.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                super.onError(th2);
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        public void onNext(Result<User> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 22292, new Class[]{Result.class}, Void.TYPE).isSupported && MaxRegisterOrLoginActivity.this.isActive()) {
                com.max.hbcache.c.C("user_account", this.f77405b);
                com.max.hbcommon.utils.d.b("zzzzphone", "onNext==" + result);
                MaxRegisterOrLoginActivity.a3(MaxRegisterOrLoginActivity.this, result.getResult());
                MaxRegisterOrLoginActivity.Y2(MaxRegisterOrLoginActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22293, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<User>) obj);
        }
    }

    public class s implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 22294, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable.length() > 5) {
                MaxRegisterOrLoginActivity.this.f77367q4.setEnabled(true);
                MaxRegisterOrLoginActivity.this.f77367q4.setBackgroundResource(R.drawable.btn_clickable);
            } else {
                MaxRegisterOrLoginActivity.this.f77367q4.setEnabled(false);
                MaxRegisterOrLoginActivity.this.f77367q4.setBackgroundResource(R.drawable.btn_tran_white);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class t implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 22295, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable.length() > 0) {
                MaxRegisterOrLoginActivity.this.f77352e4.setEnabled(true);
                MaxRegisterOrLoginActivity.this.f77352e4.setBackgroundResource(R.drawable.btn_clickable);
            } else {
                MaxRegisterOrLoginActivity.this.f77352e4.setEnabled(false);
                MaxRegisterOrLoginActivity.this.f77352e4.setBackgroundResource(R.drawable.btn_tran_white);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class u implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 22296, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable.length() == 11) {
                MaxRegisterOrLoginActivity.this.T3.setEnabled(true);
                MaxRegisterOrLoginActivity.this.T3.setBackgroundResource(R.drawable.btn_clickable);
            } else {
                MaxRegisterOrLoginActivity.this.T3.setEnabled(false);
                MaxRegisterOrLoginActivity.this.T3.setBackgroundResource(R.drawable.btn_tran_white);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22297, new Class[]{View.class}, Void.TYPE).isSupported && view.getId() == R.id.bt_submit) {
                String str = MaxRegisterOrLoginActivity.this.f77353f4;
                String strTrim = MaxRegisterOrLoginActivity.this.f77362o4.getText().toString().trim();
                if (!MaxRegisterOrLoginActivity.this.f77362o4.getText().toString().equals(MaxRegisterOrLoginActivity.this.f77366p4.getText().toString())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.diff_pwd_msg));
                } else {
                    if ("".equals(str) || "".equals(strTrim)) {
                        return;
                    }
                    if (com.max.xiaoheihe.utils.d.W1(MaxRegisterOrLoginActivity.this.f77362o4.getText().toString().trim())) {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(MaxRegisterOrLoginActivity.this.getString(R.string.pwd_simple_msg));
                    } else if (com.max.hbcommon.utils.i.c(MaxRegisterOrLoginActivity.this.L)) {
                        MaxRegisterOrLoginActivity.W1(MaxRegisterOrLoginActivity.this);
                    }
                }
            }
        }
    }

    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22298, new Class[]{View.class}, Void.TYPE).isSupported) {
            }
            switch (view.getId()) {
                case R.id.bt_achieve_code /* 2131362005 */:
                    if (com.max.hbcommon.utils.i.c(MaxRegisterOrLoginActivity.this.L)) {
                        MaxRegisterOrLoginActivity.X1(MaxRegisterOrLoginActivity.this, Boolean.TRUE);
                    }
                    break;
                case R.id.bt_check_code /* 2131362006 */:
                    if (com.max.hbcommon.utils.c.h(MaxRegisterOrLoginActivity.this.L, MaxRegisterOrLoginActivity.this.f77348b4, 4, MaxRegisterOrLoginActivity.this.getString(R.string.input_verification_code), true)) {
                        MaxRegisterOrLoginActivity.this.f77351d4.setVisibility(8);
                    } else if (com.max.hbcommon.utils.i.c(MaxRegisterOrLoginActivity.this.L)) {
                        MaxRegisterOrLoginActivity.Z1(MaxRegisterOrLoginActivity.this);
                    }
                    break;
            }
        }
    }

    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements com.max.xiaoheihe.max.helper.a.l {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // com.max.xiaoheihe.max.helper.a.l
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22300, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                MaxRegisterOrLoginActivity.h2(MaxRegisterOrLoginActivity.this);
            }
        }

        public class b implements l0.g {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f77414a;

            b(View view) {
                this.f77414a = view;
            }

            @Override // com.max.xiaoheihe.utils.l0.g
            public void a() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22301, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                MaxRegisterOrLoginActivity.this.f77380z4.setChecked(true);
                this.f77414a.performClick();
            }
        }

        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22299, new Class[]{View.class}, Void.TYPE).isSupported) {
            }
            switch (view.getId()) {
                case R.id.bt_login /* 2131362008 */:
                    MaxRegisterOrLoginActivity maxRegisterOrLoginActivity = MaxRegisterOrLoginActivity.this;
                    MaxRegisterOrLoginActivity.f2(maxRegisterOrLoginActivity, maxRegisterOrLoginActivity.N, MaxRegisterOrLoginActivity.this.R);
                    break;
                case R.id.pass_login /* 2131363730 */:
                    MaxRegisterOrLoginActivity.i2(MaxRegisterOrLoginActivity.this, new a());
                    break;
                case R.id.tv_find_pwd /* 2131364976 */:
                    MaxRegisterOrLoginActivity maxRegisterOrLoginActivity2 = MaxRegisterOrLoginActivity.this;
                    MaxRegisterOrLoginActivity.f2(maxRegisterOrLoginActivity2, maxRegisterOrLoginActivity2.R, MaxRegisterOrLoginActivity.this.O);
                    break;
                case R.id.vg_login_by_web /* 2131366696 */:
                    MaxRegisterOrLoginActivity maxRegisterOrLoginActivity3 = MaxRegisterOrLoginActivity.this;
                    MaxRegisterOrLoginActivity.f2(maxRegisterOrLoginActivity3, maxRegisterOrLoginActivity3.R, MaxRegisterOrLoginActivity.this.S);
                    break;
                case R.id.vg_login_by_weixin /* 2131366697 */:
                    if (!MaxRegisterOrLoginActivity.this.f77380z4.isChecked()) {
                        MaxRegisterOrLoginActivity.m2(MaxRegisterOrLoginActivity.this, new b(view));
                    } else {
                        MaxRegisterOrLoginActivity.n2(MaxRegisterOrLoginActivity.this, SHARE_MEDIA.WEIXIN);
                    }
                    break;
            }
        }
    }

    public class y implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f77416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f77417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f77418c;

        y(View view, boolean z10, boolean z11) {
            this.f77417b = z10;
            this.f77418c = z11;
            this.f77416a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 22303, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.max.helper.a.f77302o = false;
            if (this.f77417b) {
                this.f77416a.setVisibility(8);
            }
            if (MaxRegisterOrLoginActivity.this.Z) {
                MaxRegisterOrLoginActivity.this.Z = false;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 22302, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.max.helper.a.f77302o = true;
            if (this.f77418c) {
                this.f77416a.setVisibility(0);
            }
        }
    }

    private void A3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22210, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.S3 = (EditText) this.O.findViewById(R.id.et_number);
        Button button = (Button) this.O.findViewById(R.id.bt_submit);
        this.T3 = button;
        button.setOnClickListener(this.f77375x2);
        this.S3.addTextChangedListener(new u());
        N3(this.O, null, 0, this.S3);
    }

    private void B3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22206, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77346a4 = (TextView) findViewById(R.id.tv_send_number);
        TextView textView = (TextView) this.P.findViewById(R.id.tv_no_code);
        this.Z3 = textView;
        textView.getPaint().setFlags(8);
        this.f77348b4 = (EditText) this.P.findViewById(R.id.et_code);
        this.f77351d4 = (ImageView) this.P.findViewById(R.id.remove_code);
        this.f77352e4 = (Button) this.P.findViewById(R.id.bt_check_code);
        this.f77350c4 = (EditText) this.P.findViewById(R.id.bt_achieve_code);
        this.f77348b4.addTextChangedListener(new t());
        com.max.hbcommon.utils.c.d(this.f77348b4, this.f77351d4, 4, false);
        this.f77350c4.setOnClickListener(this.f77378y2);
        this.f77352e4.setOnClickListener(this.f77378y2);
        this.Z3.setOnClickListener(this.f77378y2);
        N3(this.P, null, 0, this.f77348b4);
    }

    static /* synthetic */ void C2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, new Integer(i10)}, null, changeQuickRedirect, true, 22254, new Class[]{MaxRegisterOrLoginActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.M3(i10);
    }

    private void C3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22205, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77362o4 = (EditText) this.Q.findViewById(R.id.et_pwd);
        this.f77366p4 = (EditText) this.Q.findViewById(R.id.et_pwd_again);
        this.f77367q4 = (Button) this.Q.findViewById(R.id.bt_submit);
        com.max.hbcommon.utils.c.d(this.f77362o4, null, 20, false);
        com.max.hbcommon.utils.c.d(this.f77366p4, null, 20, false);
        this.f77362o4.addTextChangedListener(new s());
        this.f77367q4.setOnClickListener(this.G2);
        N3(this.Q, null, 0, this.f77362o4, this.f77366p4);
    }

    private void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22221, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.J3 = (EditText) this.R.findViewById(R.id.et_number);
        this.K3 = (EditText) this.R.findViewById(R.id.et_pwd);
        this.M3 = (Button) this.R.findViewById(R.id.bt_click_login);
        this.L3 = (TextView) this.R.findViewById(R.id.tv_find_pwd);
        this.N3 = (ViewGroup) this.R.findViewById(R.id.vg_login_by_web);
        this.O3 = (ViewGroup) this.R.findViewById(R.id.vg_login_by_weixin);
        this.f77379y4 = (TextView) this.R.findViewById(R.id.tv_agreement);
        this.f77380z4 = (CheckBox) this.R.findViewById(R.id.ck_agreement);
        this.M3.setOnClickListener(this.f77374x1);
        this.L3.setOnClickListener(this.f77364p2);
        this.N3.setOnClickListener(this.f77364p2);
        this.O3.setOnClickListener(this.f77364p2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("已阅读并同意MAX+");
        com.max.xiaoheihe.view.l.j(this.f66601b, spannableStringBuilder, true, false, com.max.xiaoheihe.utils.d.E(R.color.white));
        spannableStringBuilder.append((CharSequence) "与");
        com.max.xiaoheihe.view.l.j(this.f66601b, spannableStringBuilder, true, true, com.max.xiaoheihe.utils.d.E(R.color.white));
        this.f77379y4.setText(spannableStringBuilder);
        this.f77379y4.setMovementMethod(LinkMovementMethod.getInstance());
        N3(this.R, null, 65, this.J3, this.K3);
    }

    private void F3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22209, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f77369s4 = (EditText) this.S.findViewById(R.id.et_number);
        this.f77370t4 = (EditText) this.S.findViewById(R.id.et_pwd);
        Button button = (Button) this.S.findViewById(R.id.bt_click_login);
        this.f77371u4 = button;
        button.setOnClickListener(this.f77377y1);
        N3(this.S, null, 0, this.f77369s4, this.f77370t4);
    }

    static /* synthetic */ void G2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, new Integer(i10)}, null, changeQuickRedirect, true, 22255, new Class[]{MaxRegisterOrLoginActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.s3(i10);
    }

    private void G3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22204, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.A4 = findViewById(R.id.welcome_img);
        this.N = findViewById(R.id.ll_btn);
        this.R = findViewById(R.id.ll_2);
        this.O = findViewById(R.id.ll_3);
        this.P = findViewById(R.id.ll_7);
        this.Q = findViewById(R.id.ll_8);
        this.S = findViewById(R.id.ll_4);
        this.T = findViewById(R.id.ll_btn_and_image);
        this.U = findViewById(R.id.frame_content);
        this.X = this.N.getId();
        H3();
        y3();
        D3();
        A3();
        B3();
        C3();
        F3();
        P3();
    }

    private void H3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22211, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.G2 = new v();
        this.f77378y2 = new w();
        this.f77364p2 = new x();
        this.f77374x1 = new a();
        this.f77375x2 = new b();
        this.f77377y1 = new c();
    }

    private void I3(SHARE_MEDIA share_media) {
        if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 22200, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported || this.R3 == null) {
            return;
        }
        R3(getString(R.string.logining));
        this.R3.doOauthVerify(this, share_media, new l(share_media));
    }

    static /* synthetic */ void J2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, view, view2}, null, changeQuickRedirect, true, 22256, new Class[]{MaxRegisterOrLoginActivity.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.g3(view, view2);
    }

    private void K3(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, changeQuickRedirect, false, 22218, new Class[]{User.class}, Void.TYPE).isSupported) {
            return;
        }
        User userO = i0.o();
        userO.setLoginFlag(true);
        if (!com.max.hbcommon.utils.c.u(user.getPkey())) {
            userO.setPkey(user.getPkey());
        }
        if (user.getAccount_detail() != null) {
            userO.setAccount_detail(user.getAccount_detail());
        }
        if (user.getProfile() != null) {
            userO.setProfile(user.getProfile());
        }
        if (user.getVisitor_enabled() != null) {
            userO.setVisitor_enabled(user.getVisitor_enabled());
        }
        userO.setInvite_info(user.getInvite_info());
        i0.z(userO);
        HeyBoxApplication.C().F();
        com.max.xiaoheihe.utils.v.h(this.f66601b);
        sendBroadcast(new Intent(lb.a.f130942c0));
        MainActivity.f76171q5 = user.getTips_state();
        if ("1".equals(com.max.hbcache.c.o("valid_ws", ""))) {
            m0.x().C();
        }
        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
        com.max.hbutils.utils.c.f(getString(R.string.login_success));
        Y3();
    }

    private void L3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22212, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        R3(getString(R.string.logining));
        this.P3 = (z10 ? this.f77369s4 : this.J3).getText().toString().trim();
        this.Q3 = (z10 ? this.f77370t4 : this.K3).getText().toString().trim();
        com.max.heybox.hblog.g.x("MaxLogin   loginbypwd   isWeb: " + z10 + "   number_login: " + this.P3 + "   pwd_login: " + this.Q3);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Jb(z10 ? null : com.max.xiaoheihe.utils.w.a(this.P3), z10 ? com.max.xiaoheihe.utils.w.a(this.P3) : null, com.max.xiaoheihe.utils.w.a(this.Q3)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private void M3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22216, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        Timer timer = this.f77358k4;
        if (timer != null) {
            timer.cancel();
        }
        this.f77357j4 = i10;
        this.f77353f4 = this.X3;
        this.f77355h4 = this.V3;
        this.f77356i4 = this.W3;
        TextView textView = this.f77346a4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getString(R.string.verification_code_send));
        sb2.append(this.f77353f4.substring(0, 3) + "****" + this.f77353f4.substring(7, 11));
        textView.setText(sb2.toString());
        this.f77358k4 = new Timer(true);
        h hVar = new h();
        this.f77359l4 = hVar;
        this.f77358k4.schedule(hVar, 1000L, 1000L);
    }

    static /* synthetic */ int N1(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        int i10 = maxRegisterOrLoginActivity.f77357j4 - 1;
        maxRegisterOrLoginActivity.f77357j4 = i10;
        return i10;
    }

    private void N3(View view, View view2, int i10, EditText... editTextArr) {
        if (PatchProxy.proxy(new Object[]{view, view2, new Integer(i10), editTextArr}, this, changeQuickRedirect, false, 22208, new Class[]{View.class, View.class, Integer.TYPE, EditText[].class}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.activePart);
        com.max.xiaoheihe.max.helper.a aVar = new com.max.xiaoheihe.max.helper.a();
        aVar.n(this, viewFindViewById, view, editTextArr);
        aVar.k(view2);
        aVar.l(this);
        aVar.B(this.f66601b, i10);
        aVar.m(this.A4);
        this.f77363p1.put(Integer.valueOf(view.getId()), aVar);
    }

    private void O3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22199, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.N.setVisibility(8);
        if (i10 == 3) {
            X3(this.R, this.O);
            return;
        }
        if (i10 == 4) {
            X3(this.O, this.P);
            return;
        }
        if (i10 == 5) {
            X3(this.P, this.Q);
            return;
        }
        if (i10 == 6) {
            X3(this.N, this.R);
        } else if (i10 != 7) {
            this.N.setVisibility(0);
        } else {
            X3(this.R, this.S);
        }
    }

    private void P3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22222, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M.setOnClickListener(this.f77364p2);
        this.V.setOnClickListener(this.f77364p2);
        this.W.setOnClickListener(this);
        this.U.setOnClickListener(this);
    }

    private void Q3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22215, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R3(getString(R.string.setting_new_pwd));
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().I6(com.max.xiaoheihe.utils.w.a(this.f77353f4), com.max.xiaoheihe.utils.w.a(this.f77362o4.getText().toString().trim()), this.f77360m4).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private void R3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22201, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        u3();
        this.f77365p3 = new LoadingDialog(this.f66601b, str).r();
    }

    private void U3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("如您不同意");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, false, true);
        spannableStringBuilder.append((CharSequence) "，我们将无法为您提供Max的完整功能，您可以选择使用仅浏览模式或直接退出应用。");
        TextView textViewL = com.max.xiaoheihe.view.l.l(this.f66601b);
        textViewL.setText(spannableStringBuilder);
        new com.max.hbcommon.view.a.f(this.f66601b).i(textViewL).g(true).w(true).E(0).u("去同意", new q()).o("仍然体验", new p()).d().show();
    }

    static /* synthetic */ void V2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 22241, new Class[]{MaxRegisterOrLoginActivity.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.Z3(str, str2, str3, str4, str5, str6);
    }

    private void V3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22219, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcache.c.C("skip_login", "1");
        Y3();
    }

    static /* synthetic */ void W1(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity}, null, changeQuickRedirect, true, 22244, new Class[]{MaxRegisterOrLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.Q3();
    }

    static /* synthetic */ void W2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity}, null, changeQuickRedirect, true, 22257, new Class[]{MaxRegisterOrLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.n3();
    }

    private void W3(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, this, changeQuickRedirect, false, 22224, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        l3(new j(view, view2));
    }

    static /* synthetic */ void X1(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, bool}, null, changeQuickRedirect, true, 22245, new Class[]{MaxRegisterOrLoginActivity.class, Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.r3(bool);
    }

    static /* synthetic */ void X2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity}, null, changeQuickRedirect, true, 22258, new Class[]{MaxRegisterOrLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.U3();
    }

    private void X3(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, this, changeQuickRedirect, false, 22225, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        W3(view, view2);
    }

    static /* synthetic */ void Y2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity}, null, changeQuickRedirect, true, 22242, new Class[]{MaxRegisterOrLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.u3();
    }

    private void Y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22220, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.utils.d.U0(this);
    }

    static /* synthetic */ void Z1(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity}, null, changeQuickRedirect, true, 22246, new Class[]{MaxRegisterOrLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.h3();
    }

    private void Z3(String str, String str2, String str3, String str4, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 22203, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzphone", "wechat_id==" + str);
        HashMap map = new HashMap();
        map.put("wechat_id", str);
        map.put(Constants.JumpUrlConstants.URL_KEY_OPENID, str2);
        map.put("access_token", str3);
        map.put(com.max.xiaoheihe.module.upload.g.f93525b, str4);
        map.put("name", str5);
        map.put(g0.a.G, str6);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().N7(map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r(str5)));
    }

    static /* synthetic */ void a3(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, User user) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, user}, null, changeQuickRedirect, true, 22243, new Class[]{MaxRegisterOrLoginActivity.class, User.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.K3(user);
    }

    static /* synthetic */ void f2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, View view, View view2) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, view, view2}, null, changeQuickRedirect, true, 22247, new Class[]{MaxRegisterOrLoginActivity.class, View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.W3(view, view2);
    }

    private void g0(l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, 22239, new Class[]{l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("为了更好地保障您的合法权益，请您阅读并同意以下协议");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, false, false);
        spannableStringBuilder.append((CharSequence) "、");
        com.max.xiaoheihe.view.l.i(this.f66601b, spannableStringBuilder, false, true);
        TextView textViewL = com.max.xiaoheihe.view.l.l(this.f66601b);
        textViewL.setText(spannableStringBuilder);
        new com.max.hbcommon.view.a.f(this.f66601b).y(com.max.xiaoheihe.utils.d.n0(R.string.privacy_dialog_title)).i(textViewL).g(true).w(true).E(0).u("同意", new o(gVar)).o("不同意", new n()).d().show();
    }

    private void g3(View view, View view2) {
        if (PatchProxy.proxy(new Object[]{view, view2}, this, changeQuickRedirect, false, 22226, new Class[]{View.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.X = view2.getId();
        this.Y = view.getId();
        k3(view);
        S3(view2);
    }

    static /* synthetic */ void h2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity}, null, changeQuickRedirect, true, 22248, new Class[]{MaxRegisterOrLoginActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.V3();
    }

    private void h3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22214, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R3(getString(R.string.verification_code_verifying));
        this.U3 = this.S3.getText().toString().trim();
        String strTrim = this.f77348b4.getText().toString().trim();
        com.max.heybox.hblog.g.x("MaxLogin   checkSid   verifyCode: " + strTrim + "  number_forget1: " + this.U3);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K8(com.max.xiaoheihe.utils.w.a(this.U3), strTrim).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    static /* synthetic */ void i2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, com.max.xiaoheihe.max.helper.a.l lVar) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, lVar}, null, changeQuickRedirect, true, 22249, new Class[]{MaxRegisterOrLoginActivity.class, com.max.xiaoheihe.max.helper.a.l.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.l3(lVar);
    }

    private void l3(com.max.xiaoheihe.max.helper.a.l lVar) {
        if (PatchProxy.proxy(new Object[]{lVar}, this, changeQuickRedirect, false, 22237, new Class[]{com.max.xiaoheihe.max.helper.a.l.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.max.helper.a aVarQ3 = q3();
        if (aVarQ3 != null) {
            aVarQ3.o(lVar);
        } else if (lVar != null) {
            lVar.a();
        }
    }

    static /* synthetic */ void m2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, gVar}, null, changeQuickRedirect, true, 22250, new Class[]{MaxRegisterOrLoginActivity.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.g0(gVar);
    }

    static /* synthetic */ void n2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, SHARE_MEDIA share_media) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, share_media}, null, changeQuickRedirect, true, 22251, new Class[]{MaxRegisterOrLoginActivity.class, SHARE_MEDIA.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.I3(share_media);
    }

    private void n3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22228, new Class[0], Void.TYPE).isSupported || this.Z) {
            return;
        }
        switch (this.X) {
            case R.id.ll_2 /* 2131363304 */:
                g3(this.R, this.N);
                break;
            case R.id.ll_3 /* 2131363305 */:
                g3(this.O, this.R);
                break;
            case R.id.ll_4 /* 2131363306 */:
                g3(this.S, this.R);
                break;
            case R.id.ll_7 /* 2131363307 */:
                g3(this.P, this.O);
                break;
            case R.id.ll_8 /* 2131363308 */:
                g3(this.Q, this.P);
                break;
        }
    }

    @n0
    private Animation p3(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22234, new Class[]{cls, cls}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        int width = getWindowManager().getDefaultDisplay().getWidth();
        TranslateAnimation translateAnimation = new TranslateAnimation(0, i10 * width, 0, i11 * width, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setStartOffset(this.f77347b0);
        return translateAnimation;
    }

    private com.max.xiaoheihe.max.helper.a q3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22236, new Class[0], com.max.xiaoheihe.max.helper.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.xiaoheihe.max.helper.a) patchProxyResultProxy.result : this.f77363p1.get(Integer.valueOf(this.X));
    }

    static /* synthetic */ void r2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 22252, new Class[]{MaxRegisterOrLoginActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.L3(z10);
    }

    private void r3(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 22213, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
            return;
        }
        R3(getString(R.string.sending_verification_code));
        String strTrim = this.S3.getText().toString().trim();
        this.U3 = strTrim;
        this.X3 = strTrim;
        com.max.heybox.hblog.g.x("MaxLogin   getPwdCode   number_forget1: " + this.U3);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().U8(com.max.xiaoheihe.utils.w.a(this.U3)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e(bool)));
    }

    private void s3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 22217, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f77357j4 = i10;
        this.f77350c4.setBackgroundColor(this.L.getResources().getColor(R.color.text_01));
        this.f77350c4.setEnabled(false);
        this.f77350c4.setClickable(false);
        i iVar = new i();
        this.f77359l4 = iVar;
        this.f77358k4.schedule(iVar, 1000L, 1000L);
    }

    private void t3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22227, new Class[0], Void.TYPE).isSupported || this.Z) {
            return;
        }
        l3(new m());
    }

    private void u3() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22202, new Class[0], Void.TYPE).isSupported || (loadingDialog = this.f77365p3) == null) {
            return;
        }
        loadingDialog.c();
    }

    private void w3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22229, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.T.getWindowToken(), 0);
    }

    static /* synthetic */ void y2(MaxRegisterOrLoginActivity maxRegisterOrLoginActivity, String str) {
        if (PatchProxy.proxy(new Object[]{maxRegisterOrLoginActivity, str}, null, changeQuickRedirect, true, 22253, new Class[]{MaxRegisterOrLoginActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        maxRegisterOrLoginActivity.R3(str);
    }

    private void y3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22207, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.M = (Button) findViewById(R.id.bt_login);
        this.V = (TextView) findViewById(R.id.pass_login);
        this.W = (ImageButton) findViewById(R.id.ib_icon_back);
    }

    @Override // com.max.xiaoheihe.max.helper.a.k
    public void O() {
        this.Z = true;
    }

    public Animation S3(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22231, new Class[]{View.class}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        Animation animationP3 = p3(-1, 0);
        animationP3.setAnimationListener(new y(view, false, true));
        animationP3.setInterpolator(com.max.xiaoheihe.max.helper.a.q());
        view.startAnimation(animationP3);
        return animationP3;
    }

    public Animation T3(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22230, new Class[]{View.class}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        Animation animationP3 = p3(1, 0);
        animationP3.setAnimationListener(new y(view, false, true));
        animationP3.setInterpolator(com.max.xiaoheihe.max.helper.a.r());
        view.startAnimation(animationP3);
        return animationP3;
    }

    public Animation i3(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22233, new Class[]{View.class}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        Animation animationP3 = p3(0, -1);
        animationP3.setAnimationListener(new y(view, true, false));
        animationP3.setInterpolator(com.max.xiaoheihe.max.helper.a.r());
        view.startAnimation(animationP3);
        return animationP3;
    }

    public Animation k3(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22232, new Class[]{View.class}, Animation.class);
        if (patchProxyResultProxy.isSupported) {
            return (Animation) patchProxyResultProxy.result;
        }
        Animation animationP3 = p3(0, 1);
        animationP3.setAnimationListener(new y(view, true, false));
        animationP3.setInterpolator(com.max.xiaoheihe.max.helper.a.q());
        view.startAnimation(animationP3);
        return animationP3;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 22238, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI uMShareAPI = this.R3;
        if (uMShareAPI != null) {
            uMShareAPI.onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22235, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.X != this.N.getId()) {
            t3();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 22223, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        int id2 = view.getId();
        if (id2 == R.id.frame_content) {
            w3();
        } else {
            if (id2 != R.id.ib_icon_back) {
                return;
            }
            onBackPressed();
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 22197, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_max_register_or_login);
        com.max.hbutils.utils.t.k(this);
        com.max.hbutils.utils.t.M(this.f66601b, false);
        getWindow().setNavigationBarColor(com.max.xiaoheihe.utils.d.E(R.color.black));
        this.R3 = UMShareAPI.get(this);
        this.L = this;
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        G3();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22198, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (this.f77345a0) {
            this.f77347b0 = 200;
            O3(getIntent().getIntExtra(G4, 0));
            this.f77347b0 = 0;
            this.f77345a0 = false;
        }
    }

    @Override // com.max.xiaoheihe.max.helper.a.k
    public void t0() {
        this.Z = false;
    }
}
