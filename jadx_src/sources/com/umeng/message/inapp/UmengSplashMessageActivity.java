package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.proguard.ad;
import com.umeng.message.proguard.af;
import com.umeng.message.proguard.ah;
import com.umeng.message.proguard.ai;
import com.umeng.message.proguard.bb;
import com.umeng.message.proguard.f;
import java.io.File;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class UmengSplashMessageActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105633a = "com.umeng.message.inapp.UmengSplashMessageActivity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f105634s = 2000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f105635t = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f105636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private af f105637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f105638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f105639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f105640f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f105643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f105644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private UInAppMessage f105645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private UInAppHandler f105646l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f105651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f105652r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f105641g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f105642h = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f105647m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f105648n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f105649o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f105650p = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private af.a f105653u = new af.a() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1
        @Override // com.umeng.message.proguard.af.a
        public final void a(Bitmap[] bitmapArr) {
            if (UmengSplashMessageActivity.this.c()) {
                return;
            }
            if (UmengSplashMessageActivity.this.f105643i != null) {
                UmengSplashMessageActivity.this.f105643i.a();
                UmengSplashMessageActivity.c(UmengSplashMessageActivity.this);
            }
            try {
                if (bitmapArr.length == 1) {
                    UmengSplashMessageActivity.this.f105638d.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.d(UmengSplashMessageActivity.this);
                            if (TextUtils.equals("none", UmengSplashMessageActivity.this.f105645k.action_type)) {
                                return;
                            }
                            UmengSplashMessageActivity.a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f105651q);
                            ai.a(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, UmengSplashMessageActivity.this.f105645k.msg_type, 1, 1, 0, 0, 0, (int) UmengSplashMessageActivity.this.f105652r, 0);
                            UmengSplashMessageActivity.this.d();
                            UmengSplashMessageActivity.this.f105646l.handleInAppMessage(UmengSplashMessageActivity.this.f105636b, UmengSplashMessageActivity.this.f105645k, 16);
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                    UmengSplashMessageActivity.this.f105639e.setVisibility(8);
                    UmengSplashMessageActivity.this.f105638d.setImageBitmap(bitmapArr[0]);
                    UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105638d);
                }
                if (bitmapArr.length == 2) {
                    UmengSplashMessageActivity.this.f105638d.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.m(UmengSplashMessageActivity.this);
                            if (TextUtils.equals("none", UmengSplashMessageActivity.this.f105645k.action_type)) {
                                return;
                            }
                            UmengSplashMessageActivity.a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f105651q);
                            ai.a(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, UmengSplashMessageActivity.this.f105645k.msg_type, 1, 0, 1, UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105649o), 0, (int) UmengSplashMessageActivity.this.f105652r, 0);
                            UmengSplashMessageActivity.this.d();
                            UmengSplashMessageActivity.this.f105646l.handleInAppMessage(UmengSplashMessageActivity.this.f105636b, UmengSplashMessageActivity.this.f105645k, 16);
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                    UmengSplashMessageActivity.this.f105639e.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.o(UmengSplashMessageActivity.this);
                            if (TextUtils.equals("none", UmengSplashMessageActivity.this.f105645k.bottom_action_type)) {
                                return;
                            }
                            UmengSplashMessageActivity.a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f105651q);
                            ai.a(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, UmengSplashMessageActivity.this.f105645k.msg_type, 1, 0, UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105648n), 1, 0, (int) UmengSplashMessageActivity.this.f105652r, 0);
                            UmengSplashMessageActivity.this.d();
                            UmengSplashMessageActivity.this.f105646l.handleInAppMessage(UmengSplashMessageActivity.this.f105636b, UmengSplashMessageActivity.this.f105645k, 17);
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                    UmengSplashMessageActivity.this.f105638d.setImageBitmap(bitmapArr[0]);
                    UmengSplashMessageActivity.this.f105639e.setImageBitmap(bitmapArr[1]);
                    UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105638d);
                    UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105639e);
                }
                UmengSplashMessageActivity.this.f105651q = SystemClock.elapsedRealtime();
                if (UmengSplashMessageActivity.this.f105645k.display_button) {
                    UmengSplashMessageActivity.this.f105640f.setVisibility(0);
                    UmengSplashMessageActivity.this.f105640f.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.1.4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UmengSplashMessageActivity.a(UmengSplashMessageActivity.this, SystemClock.elapsedRealtime() - UmengSplashMessageActivity.this.f105651q);
                            ai.a(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, UmengSplashMessageActivity.this.f105645k.msg_type, 1, UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105647m), UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105648n), UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105649o), 1, (int) UmengSplashMessageActivity.this.f105652r, 0);
                            UmengSplashMessageActivity.this.d();
                            UmengSplashMessageActivity.this.finish();
                        }
                    });
                } else {
                    UmengSplashMessageActivity.this.f105640f.setVisibility(8);
                }
                InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k);
                InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, 1);
                InAppMessageManager inAppMessageManager = InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(System.currentTimeMillis());
                inAppMessageManager.b("KEY_LAST_SHOW_SPLASH_TS", sb2.toString());
                UmengSplashMessageActivity.s(UmengSplashMessageActivity.this);
                UmengSplashMessageActivity umengSplashMessageActivity = UmengSplashMessageActivity.this;
                umengSplashMessageActivity.f105644j = umengSplashMessageActivity.new a(umengSplashMessageActivity.f105645k.display_time * 1000, UmengSplashMessageActivity.f105635t);
                UmengSplashMessageActivity.this.f105644j.b();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ad f105654v = new ad() { // from class: com.umeng.message.inapp.UmengSplashMessageActivity.2
        @Override // com.umeng.message.proguard.ad
        public final void a(UInAppMessage uInAppMessage) {
            UInAppMessage uInAppMessage2;
            String strA = InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b).a();
            if (TextUtils.isEmpty(strA)) {
                uInAppMessage2 = null;
            } else {
                try {
                    uInAppMessage2 = new UInAppMessage(new JSONObject(strA));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    uInAppMessage2 = null;
                }
            }
            if (uInAppMessage != null) {
                if (uInAppMessage2 != null && !uInAppMessage.msg_id.equals(uInAppMessage2.msg_id)) {
                    InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b).a(new File(f.a((Context) UmengSplashMessageActivity.this.f105636b, uInAppMessage2.msg_id)));
                }
                UmengSplashMessageActivity.this.f105645k = uInAppMessage;
            } else if (uInAppMessage2 == null) {
                return;
            } else {
                UmengSplashMessageActivity.this.f105645k = uInAppMessage2;
            }
            if (UmengSplashMessageActivity.this.f105645k.show_type == 1 && !UmengSplashMessageActivity.u(UmengSplashMessageActivity.this)) {
                InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, 0);
            }
            InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b);
            if (InAppMessageManager.b(UmengSplashMessageActivity.this.f105645k) && InAppMessageManager.getInstance(UmengSplashMessageActivity.this.f105636b).c(UmengSplashMessageActivity.this.f105645k)) {
                if (UmengSplashMessageActivity.this.f105645k.msg_type == 0) {
                    UMLog.mutlInfo(UmengSplashMessageActivity.f105633a, 2, "SPLASH_A");
                    UmengSplashMessageActivity.this.f105637c = new af(UmengSplashMessageActivity.this.f105636b, UmengSplashMessageActivity.this.f105645k);
                    UmengSplashMessageActivity.this.f105637c.f105684a = UmengSplashMessageActivity.this.f105653u;
                    UmengSplashMessageActivity.this.f105637c.execute(UmengSplashMessageActivity.this.f105645k.image_url);
                }
                if (UmengSplashMessageActivity.this.f105645k.msg_type == 1) {
                    UMLog.mutlInfo(UmengSplashMessageActivity.f105633a, 2, "SPLASH_B");
                    UmengSplashMessageActivity.this.f105637c = new af(UmengSplashMessageActivity.this.f105636b, UmengSplashMessageActivity.this.f105645k);
                    UmengSplashMessageActivity.this.f105637c.f105684a = UmengSplashMessageActivity.this.f105653u;
                    UmengSplashMessageActivity.this.f105637c.execute(UmengSplashMessageActivity.this.f105645k.image_url, UmengSplashMessageActivity.this.f105645k.bottom_image_url);
                }
            }
        }

        @Override // com.umeng.message.proguard.ad
        public final void b(UInAppMessage uInAppMessage) {
        }
    };

    public final class a extends ah {
        a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // com.umeng.message.proguard.ah
        public final void a(long j10) {
            if (UmengSplashMessageActivity.this.f105641g) {
                return;
            }
            UmengSplashMessageActivity.this.f105640f.setVisibility(0);
            UmengSplashMessageActivity.this.f105640f.setText(((int) Math.ceil((j10 * 1.0d) / ((double) UmengSplashMessageActivity.f105635t))) + " " + UmengSplashMessageActivity.this.f105645k.display_name);
        }

        @Override // com.umeng.message.proguard.ah
        public final void e() {
            if (UmengSplashMessageActivity.this.c() && UmengSplashMessageActivity.this.f105641g) {
                return;
            }
            if (!UmengSplashMessageActivity.this.f105641g) {
                ai.a(UmengSplashMessageActivity.this.f105636b).a(UmengSplashMessageActivity.this.f105645k.msg_id, UmengSplashMessageActivity.this.f105645k.msg_type, 1, UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105647m), UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105648n), UmengSplashMessageActivity.a(UmengSplashMessageActivity.this.f105649o), 0, UmengSplashMessageActivity.this.f105645k.display_time * 1000, 0);
            }
            UmengSplashMessageActivity.this.d();
            UmengSplashMessageActivity.this.finish();
        }
    }

    static /* synthetic */ int a(boolean z10) {
        return z10 ? 1 : 0;
    }

    static /* synthetic */ long a(UmengSplashMessageActivity umengSplashMessageActivity, long j10) {
        long j11 = umengSplashMessageActivity.f105652r + j10;
        umengSplashMessageActivity.f105652r = j11;
        return j11;
    }

    static /* synthetic */ void a(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
        alphaAnimation.setDuration(500L);
        view.startAnimation(alphaAnimation);
    }

    static /* synthetic */ a c(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f105643i = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean c() {
        boolean z10;
        z10 = this.f105650p;
        this.f105650p = true;
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        if (this.f105642h) {
            this.f105642h = false;
            Intent intent = new Intent();
            intent.setClassName(this.f105636b, InAppMessageManager.getInstance(this).f105588c);
            intent.setFlags(536870912);
            try {
                this.f105636b.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    static /* synthetic */ boolean d(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f105647m = true;
        return true;
    }

    static /* synthetic */ boolean m(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f105648n = true;
        return true;
    }

    static /* synthetic */ boolean o(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f105649o = true;
        return true;
    }

    static /* synthetic */ boolean s(UmengSplashMessageActivity umengSplashMessageActivity) {
        umengSplashMessageActivity.f105641g = false;
        return false;
    }

    static /* synthetic */ boolean u(UmengSplashMessageActivity umengSplashMessageActivity) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(InAppMessageManager.getInstance(umengSplashMessageActivity.f105636b).a("KEY_LAST_SHOW_SPLASH_TS", "0")));
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f105636b = this;
        if ((getIntent().getFlags() & 4194304) > 0) {
            finish();
            return;
        }
        if (onCustomPretreatment()) {
            return;
        }
        setRequestedOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this.f105636b);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this.f105636b);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 13.0f);
        ImageView imageView = new ImageView(this.f105636b);
        this.f105638d = imageView;
        imageView.setLayoutParams(layoutParams);
        this.f105638d.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f105638d);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 3.0f);
        ImageView imageView2 = new ImageView(this.f105636b);
        this.f105639e = imageView2;
        imageView2.setLayoutParams(layoutParams2);
        this.f105639e.setScaleType(ImageView.ScaleType.FIT_XY);
        linearLayout.addView(this.f105639e);
        frameLayout.addView(linearLayout);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 5;
        layoutParams3.rightMargin = bb.a(30.0f);
        layoutParams3.topMargin = bb.a(20.0f);
        TextView textView = new TextView(this.f105636b);
        this.f105640f = textView;
        textView.setLayoutParams(layoutParams3);
        int iA = bb.a(6.0f);
        int i10 = iA / 3;
        this.f105640f.setPadding(iA, i10, iA, i10);
        this.f105640f.setTextSize(14.0f);
        this.f105640f.setBackgroundColor(Color.parseColor("#80000000"));
        this.f105640f.setTextColor(-1);
        this.f105640f.setVisibility(8);
        frameLayout.addView(this.f105640f);
        setContentView(frameLayout);
        if (!InAppMessageManager.f105583a && System.currentTimeMillis() - Long.parseLong(InAppMessageManager.getInstance(this.f105636b).a("KEY_SPLASH_TS", "0")) <= InAppMessageManager.f105584d) {
            this.f105654v.a(null);
        } else {
            ai.a(this).a(this.f105654v);
        }
        this.f105646l = InAppMessageManager.getInstance(this.f105636b).getInAppHandler();
        a aVar = new a(f105634s, f105635t);
        this.f105643i = aVar;
        aVar.b();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
    }

    public boolean onCustomPretreatment() {
        return false;
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        a aVar = this.f105643i;
        if (aVar != null) {
            aVar.a();
        }
        a aVar2 = this.f105644j;
        if (aVar2 != null) {
            aVar2.a();
        }
        af afVar = this.f105637c;
        if (afVar != null) {
            afVar.f105684a = null;
        }
        this.f105650p = false;
        this.f105647m = false;
        this.f105648n = false;
        this.f105649o = false;
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        a aVar = this.f105643i;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f105644j != null) {
            this.f105652r += SystemClock.elapsedRealtime() - this.f105651q;
            this.f105644j.c();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        a aVar = this.f105643i;
        if (aVar != null) {
            aVar.d();
        }
        if (this.f105644j != null) {
            this.f105651q = SystemClock.elapsedRealtime();
            this.f105644j.d();
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
    }
}
