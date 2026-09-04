package com.max.xiaoheihe.module.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.utils.k;
import com.max.hbcustomview.CubicBezierInterpolators;
import com.max.hbcustomview.simplevideo.SimpleVideoPlayerView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.AdsInfoObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.max.xiaoheihe.utils.l0;
import com.max.xiaoheihe.utils.viewprioritymanager.ViewPriority;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import eightbitlab.com.blurview.j;
import java.io.File;
import java.util.Locale;
import org.apache.tools.ant.taskdefs.v7;

/* JADX INFO: loaded from: classes9.dex */
public class AdsActivity extends BaseActivity {
    private static final String R = "AdsActivity";
    protected static final float S = 50.0f;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ValueAnimator L;
    private ValueAnimator M;
    private AdsInfoObj N;
    private df.e O;
    GestureDetector P;
    private boolean Q = false;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdsInfoObj f79457b;

        a(AdsInfoObj adsInfoObj) {
            this.f79457b = adsInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25578, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (AdsActivity.this.O.f109941j != null) {
                AdsActivity.this.O.f109941j.w();
            }
            AdsActivity.this.Y1(true);
            AdsActivity.O1(AdsActivity.this, this.f79457b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        @TargetApi(11)
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 25579, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported || AdsActivity.this.O.f109939h == null) {
                return;
            }
            AdsActivity.this.O.f109939h.setText(String.format(Locale.US, AdsActivity.this.getString(R.string.skip_format), Integer.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue() / 1000)));
        }
    }

    public class c extends AnimatorListenerAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, 25580, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            AdsActivity.this.Y1(true);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f79461b;

        d(float f10) {
            this.f79461b = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 25581, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            AdsActivity.this.O.f109936e.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue() - this.f79461b);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25582, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            AdsActivity.this.Y1(true);
        }
    }

    public class f implements GestureDetector.OnGestureListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            Object[] objArr = {motionEvent, motionEvent2, new Float(f10), new Float(f11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Float.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 25583, new Class[]{MotionEvent.class, MotionEvent.class, cls, cls}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            float y10 = motionEvent.getY() - motionEvent2.getY();
            com.max.hbcommon.utils.d.b(AdsActivity.R, "disx==" + (motionEvent.getX() - motionEvent2.getX()) + "deltaY == " + y10 + "  velocityY==" + f11 + "  velocityX==" + f10);
            if (y10 <= 50.0f || y10 <= Math.abs(motionEvent.getX() - motionEvent2.getX()) || AdsActivity.this.O.f109942k.getVisibility() != 0) {
                return false;
            }
            AdsActivity.this.O.f109942k.performClick();
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    static /* synthetic */ void O1(AdsActivity adsActivity, AdsInfoObj adsInfoObj) {
        if (PatchProxy.proxy(new Object[]{adsActivity, adsInfoObj}, null, changeQuickRedirect, true, 25577, new Class[]{AdsActivity.class, AdsInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        adsActivity.X1(adsInfoObj);
    }

    private void Q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25568, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.Q = true;
        com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.a(ViewPriority.TOP.getValue() + 100);
    }

    public static Intent R1(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25563, new Class[]{Context.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent(context, (Class<?>) AdsActivity.class);
    }

    private void V1(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 25567, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        AdsInfoObj adsInfoObjG = com.max.xiaoheihe.module.ads.b.g("yes".equals(T1()));
        this.N = adsInfoObjG;
        if (adsInfoObjG == null) {
            this.O.f109935d.setVisibility(8);
            this.O.f109939h.setVisibility(8);
            this.O.f109940i.setVisibility(8);
            this.O.f109942k.setVisibility(8);
            Y1(false);
            return;
        }
        Q1();
        AdsInfoObj adsInfoObj = this.N;
        String type = adsInfoObj.getDisplay_content() != null ? adsInfoObj.getDisplay_content().getType() : "image";
        String show_time = adsInfoObj.getShow_time();
        File file = new File(com.max.xiaoheihe.utils.d.Q(), com.max.xiaoheihe.module.ads.b.e(adsInfoObj));
        com.max.hbcache.c.C(com.max.xiaoheihe.module.ads.b.i(adsInfoObj), System.currentTimeMillis() + "");
        long jMin = Math.min(5000L, n.r(show_time) * 1000);
        if (com.max.hbcommon.utils.c.A(this.N.getShow_open_screen_ads_text())) {
            this.O.f109942k.setVisibility(0);
        } else {
            this.O.f109942k.setVisibility(8);
        }
        if (!com.max.hbcommon.utils.c.u(this.N.getOpen_screen_ads_text())) {
            this.O.f109938g.setText(this.N.getOpen_screen_ads_text());
        }
        if ("image".equals(type)) {
            this.O.f109935d.setVisibility(0);
            this.O.f109941j.setVisibility(8);
            this.O.f109940i.setVisibility(8);
            com.max.hbimage.b.K(Uri.fromFile(file).toString(), this.O.f109935d);
            k.c(adsInfoObj.getAd_report());
        } else {
            this.O.f109935d.setVisibility(8);
            this.O.f109941j.setVisibility(0);
            this.O.f109940i.setVisibility(0);
            k.c(adsInfoObj.getAd_report());
            com.max.hbcommon.utils.d.b("cqtest", "abspath:" + file.getAbsolutePath());
            this.O.f109941j.m();
            this.O.f109941j.h(true);
            this.O.f109941j.setDataSourceAndPlayWithAction(Uri.parse(v7.f135919a + file.getAbsolutePath()), new SimpleVideoPlayerView.a() { // from class: com.max.xiaoheihe.module.ads.a
                @Override // com.max.hbcustomview.simplevideo.SimpleVideoPlayerView.a
                public final void a() {
                    this.f79465a.W1();
                }
            });
        }
        this.O.f109942k.setOnClickListener(new a(adsInfoObj));
        a2();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.O.f109939h.getLayoutParams();
        marginLayoutParams.topMargin = ViewUtils.f(this.f66601b, 4.0f) + ViewUtils.M();
        this.O.f109939h.setLayoutParams(marginLayoutParams);
        this.O.f109939h.setVisibility(0);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) jMin, 0);
        this.L = valueAnimatorOfInt;
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.L.setDuration(jMin);
        this.L.addUpdateListener(new b());
        this.L.addListener(new c());
        float f10 = ViewUtils.f(this.f66601b, 63.0f) + ViewUtils.f(this.f66601b, 20.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, ViewUtils.L(this.f66601b) + f10);
        this.M = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolators.Type.EASE_IN.create());
        this.M.setRepeatMode(1);
        this.M.setRepeatCount(-1);
        this.M.setDuration(2000L);
        this.M.addUpdateListener(new d(f10));
        addValueAnimator(this.L);
        addValueAnimator(this.M);
        this.O.f109939h.setOnClickListener(new e());
        b2(adsInfoObj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W1() {
        ValueAnimator valueAnimator;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25576, new Class[0], Void.TYPE).isSupported || (valueAnimator = this.L) == null) {
            return;
        }
        valueAnimator.start();
    }

    private void X1(AdsInfoObj adsInfoObj) {
        if (PatchProxy.proxy(new Object[]{adsInfoObj}, this, changeQuickRedirect, false, 25572, new Class[]{AdsInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        k.b(adsInfoObj.getAd_report());
        if (!com.max.hbcommon.utils.c.u(adsInfoObj.getProtocol())) {
            com.max.xiaoheihe.base.router.b.k0(this.f66601b, adsInfoObj.getProtocol());
            return;
        }
        if (com.max.hbcommon.utils.c.u(adsInfoObj.getAd_url())) {
            return;
        }
        String ad_url = adsInfoObj.getAd_url();
        if (ad_url.endsWith(".apk")) {
            l0.y0(this.f66601b, ad_url);
            return;
        }
        Intent intent = new Intent(this.f66601b, (Class<?>) WebActionActivity.class);
        intent.putExtra("pageurl", ad_url);
        intent.putExtra("title", adsInfoObj.getTitle());
        intent.putExtra("welcome", T1());
        startActivity(intent);
    }

    private void Z1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25569, new Class[0], Void.TYPE).isSupported && this.Q) {
            com.max.xiaoheihe.utils.viewprioritymanager.a.f95777a.b(ViewPriority.TOP.getValue() + 100);
        }
    }

    private void a2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25573, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.P = new GestureDetector(this.f66601b, new f());
    }

    private void b2(AdsInfoObj adsInfoObj) {
        if (PatchProxy.proxy(new Object[]{adsInfoObj}, this, changeQuickRedirect, false, 25574, new Class[]{AdsInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        int iE1 = com.max.xiaoheihe.utils.d.e1("#33FFFFFF");
        if (adsInfoObj != null && !com.max.hbcommon.utils.c.u(adsInfoObj.getBtn_color())) {
            iE1 = com.max.xiaoheihe.utils.d.e1(adsInfoObj.getBtn_color());
        }
        this.O.f109937f.setBackground(q.M(q.o(this.f66601b, R.color.transparent, 27.5f), this.f66601b, R.color.white_alpha20, 0.5f));
        j jVar = new j(this);
        df.e eVar = this.O;
        eVar.f109933b.f(eVar.b()).d(iE1).h(jVar).c(25.0f);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public boolean K1() {
        return false;
    }

    public String T1() {
        return null;
    }

    public void Y1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25575, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        t.l(this);
        t.v(this.f66601b);
        df.e eVarC = df.e.c(this.f66602c);
        this.O = eVarC;
        setContentView(eVarC.b());
        V1(getIntent());
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25571, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        Z1();
        SimpleVideoPlayerView simpleVideoPlayerView = this.O.f109941j;
        if (simpleVideoPlayerView != null) {
            simpleVideoPlayerView.w();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (PatchProxy.proxy(new Object[]{intent}, this, changeQuickRedirect, false, 25565, new Class[]{Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onNewIntent(intent);
        V1(intent);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        String type;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25570, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        AdsInfoObj adsInfoObj = this.N;
        if (adsInfoObj != null) {
            type = adsInfoObj.getDisplay_content() != null ? this.N.getDisplay_content().getType() : "image";
        } else {
            type = "";
        }
        if (this.L != null && "image".equals(type)) {
            this.L.start();
        }
        ValueAnimator valueAnimator = this.M;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 25566, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        GestureDetector gestureDetector = this.P;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }
}
