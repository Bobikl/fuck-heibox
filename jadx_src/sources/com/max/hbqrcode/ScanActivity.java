package com.max.hbqrcode;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.hms.hmsscankit.OnResultCallback;
import com.huawei.hms.hmsscankit.RemoteView;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.utils.l;
import com.max.hbpermission.PermissionManager;
import com.max.hbqrcode.bean.QRRedirectObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.heybox.hblog.g;
import com.max.mediaselector.e;
import com.max.mediaselector.lib.basic.q;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ScanActivity extends AppCompatActivity {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f71846i = "h_src";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f71847j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FrameLayout f71848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RemoteView f71849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TitleBar f71850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f71851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f71852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private io.reactivex.disposables.a f71853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f71854h = null;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.hbqrcode.ScanActivity$a$a, reason: collision with other inner class name */
        public class C0578a implements com.max.hbpermission.c {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0578a() {
            }

            @Override // com.max.hbpermission.c
            public void onResult() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33900v0, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                e.h(ScanActivity.this, 1, 0, false, false, false);
            }
        }

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.k.f33878u0, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PermissionManager.f71603a.S(ScanActivity.this, new C0578a());
        }
    }

    public class b extends com.max.hbcommon.network.d<Result<QRRedirectObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.f33922w0, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result<QRRedirectObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, bb.c.k.f33944x0, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            com.max.hbqrcode.b.e(result.getResult(), ScanActivity.this);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.f33966y0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<QRRedirectObj>) obj);
        }
    }

    public static class c extends AsyncTask<String, Integer, String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<Activity> f71858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f71859b;

        public c(Activity activity, String str) {
            this.f71858a = new WeakReference<>(activity);
            this.f71859b = str;
        }

        public String a(String... strArr) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.k.f33988z0, new Class[]{String[].class}, String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbqrcode.b.j(this.f71859b);
        }

        public void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.A0, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onPostExecute(str);
            ScanActivity scanActivity = (ScanActivity) this.f71858a.get();
            if (scanActivity != null) {
                scanActivity.Q0(str);
            }
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.lang.String] */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ String doInBackground(String[] strArr) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, bb.c.k.C0, new Class[]{Object[].class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.B0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(str);
        }
    }

    private void O0() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33834s0, new Class[0], Void.TYPE).isSupported || (aVar = this.f71853g) == null) {
            return;
        }
        aVar.f();
    }

    @SuppressLint({"AutoDispose"})
    private void P0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33790q0, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) dd.b.a().a(str, this.f71854h).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private void R0(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.f33537f0, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f71848b = (FrameLayout) findViewById(R.id.rim);
        int iL = ViewUtils.L(this);
        int iJ = ViewUtils.J(this);
        int iF = ViewUtils.f(this, 275.0f);
        Rect rect = new Rect();
        int i10 = iL / 2;
        int i11 = iF / 2;
        rect.left = i10 - i11;
        rect.right = i10 + i11;
        int i12 = iJ / 2;
        rect.top = i12 - i11;
        rect.bottom = i12 + i11;
        RemoteView remoteViewBuild = new RemoteView.Builder().setContext(this).setContinuouslyScan(false).setBoundingBox(rect).setFormat(HmsScanBase.QRCODE_SCAN_TYPE, new int[0]).build();
        this.f71849c = remoteViewBuild;
        remoteViewBuild.setOnResultCallback(new OnResultCallback() { // from class: com.max.hbqrcode.c
            @Override // com.huawei.hms.hmsscankit.OnResultCallback
            public final void onResult(HmsScan[] hmsScanArr) {
                this.f71865a.S0(hmsScanArr);
            }
        });
        this.f71849c.onCreate(bundle);
        this.f71848b.addView(this.f71849c, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(HmsScan[] hmsScanArr) {
        HmsScan hmsScan;
        if (PatchProxy.proxy(new Object[]{hmsScanArr}, this, changeQuickRedirect, false, bb.c.k.f33856t0, new Class[]{HmsScan[].class}, Void.TYPE).isSupported || hmsScanArr == null || hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.isEmpty(hmsScan.getOriginalValue())) {
            return;
        }
        g.x("setOnResultCallback, showResult = " + hmsScanArr[0].getShowResult() + ", originalValue = " + hmsScanArr[0].originalValue);
        Q0(hmsScanArr[0].showResult);
    }

    private void T0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33721n0, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        new c(this, str).execute(str);
    }

    private void V(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.k.f33812r0, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f71853g == null) {
            this.f71853g = new io.reactivex.disposables.a();
        }
        this.f71853g.c(bVar);
    }

    public void Q0(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.f33767p0, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        g.x("handleQrCode, s = " + str);
        if (str != null) {
            P0(str);
        } else {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f("该图片无法识别二维码");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        ArrayList<LocalMedia> arrayListG;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.k.f33744o0, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            g.x("onActivityResult, onActivityResult， resultCode = " + i11);
            if (i11 == -1 && (arrayListG = q.g(intent)) != null && arrayListG.size() > 0) {
                T0(arrayListG.get(0).G());
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.f33514e0, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f71854h = getIntent().getStringExtra("h_src");
        }
        t.h0(getWindow());
        t.M(this, false);
        setContentView(R.layout.hbqrcode_activity_scan);
        R0(bundle);
        this.f71851e = (ImageView) findViewById(R.id.iv_laser);
        this.f71852f = findViewById(R.id.vg_parse_from_gallery);
        this.f71851e.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scan_laser_anim));
        int iM = t.m(this);
        TitleBar titleBar = (TitleBar) findViewById(R.id.title);
        this.f71850d = titleBar;
        titleBar.setTitle("");
        this.f71850d.setNavigationIcon(getResources().getDrawable(R.drawable.common_arrow_single_10x18));
        this.f71850d.setTitleTextColor(getResources().getColor(R.color.background_layer_2_color));
        this.f71852f.setBackground(ViewUtils.j(ViewUtils.f(this, 27.0f), l.a(R.color.white_alpha20)));
        this.f71852f.setOnClickListener(new a());
        ((RelativeLayout.LayoutParams) this.f71850d.getLayoutParams()).setMargins(0, iM, 0, 0);
        pb.d dVarE = ob.a.e();
        if (dVarE == null || dVarE.b(com.max.xiaoheihe.loader.dynamic_so.a.f77296b)) {
            return;
        }
        dVarE.a(com.max.xiaoheihe.loader.dynamic_so.a.f77296b);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33652k0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        this.f71849c.onDestroy();
        O0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), keyEvent}, this, changeQuickRedirect, false, bb.c.k.f33698m0, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f71849c.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33606i0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        this.f71849c.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33583h0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.f71849c.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.f33675l0, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33560g0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.f71849c.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33629j0, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
        this.f71849c.onStop();
    }
}
