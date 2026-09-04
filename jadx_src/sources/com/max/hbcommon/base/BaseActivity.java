package com.max.hbcommon.base;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.Unbinder;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.bumptech.glide.Glide;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.MobclickAgent;
import com.umeng.message.PushAgent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class BaseActivity extends AppCompatActivity implements f, com.max.hbcommon.analytics.d.f, com.max.hbcommon.base.a {
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 3;
    public static final int K = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Dialog A;
    protected com.max.hbcommon.analytics.j B;
    private PathSrcNode C;
    private SmartSwipeWrapper E;
    private db.a F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Activity f66601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected LayoutInflater f66602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f66604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f66605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f66606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f66607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected View f66608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected FrameLayout f66609j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f66614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private FrameLayout f66615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected TitleBar f66616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected View f66617r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View.OnClickListener f66619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Unbinder f66620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private io.reactivex.disposables.a f66621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<ValueAnimator> f66622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<Dialog> f66623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f66624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f66625z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f66610k = R.layout.empty_view;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f66611l = R.layout.error_view;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66612m = R.layout.loading_view;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f66613n = R.layout.no_network_view;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ViewGroup.LayoutParams f66618s = new ViewGroup.LayoutParams(-1, -1);
    private boolean D = false;

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Lu, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseActivity.this.n1();
        }
    }

    private final void J1(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.su, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View view = this.f66606g;
        if (view != null) {
            view.setVisibility(i10 == 1 ? 0 : 8);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this.f66606g.findViewById(R.id.img_progress);
            if (circularProgressIndicator != null) {
                if (i10 == 1) {
                    circularProgressIndicator.p();
                } else {
                    circularProgressIndicator.j();
                }
            }
        }
        View view2 = this.f66604e;
        if (view2 != null) {
            view2.setVisibility(i10 == 2 ? 0 : 8);
        }
        View view3 = this.f66605f;
        if (view3 != null) {
            view3.setVisibility(i10 == 3 ? 0 : 8);
        }
        View view4 = this.f66607h;
        if (view4 != null) {
            view4.setVisibility(i10 == 4 ? 0 : 8);
        }
        View view5 = this.f66608i;
        if (view5 != null) {
            view5.setVisibility(i10 != 0 ? 8 : 0);
        }
    }

    private void R0(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.Eu, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                R0(viewGroup.getChildAt(i10));
            }
            return;
        }
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            com.max.hbimage.b.c(imageView);
            imageView.setImageDrawable(null);
            imageView.setBackground(null);
        }
    }

    private void i1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.du, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.setContentView(L1() ? R.layout.activity_base_with_gesture : R.layout.activity_base);
        this.f66614o = findViewById(R.id.root);
        this.f66615p = (FrameLayout) findViewById(R.id.multi_status_view_container);
        this.f66609j = (FrameLayout) findViewById(R.id.vg_above);
        this.f66616q = (TitleBar) findViewById(R.id.tb_title);
        this.f66617r = findViewById(R.id.title_bar_divider);
        this.f66619t = new a();
    }

    public final void A1(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.nu, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f66603d = 2;
        if (this.f66604e == null) {
            View viewInflate = this.f66602c.inflate(this.f66610k, (ViewGroup) null);
            this.f66604e = viewInflate;
            this.f66615p.addView(viewInflate, 0, this.f66618s);
        }
        ImageView imageView = (ImageView) this.f66604e.findViewById(R.id.iv_empty);
        TextView textView = (TextView) this.f66604e.findViewById(R.id.tv_empty);
        imageView.setImageResource(i10);
        textView.setText(i11);
        J1(this.f66603d);
    }

    public final void C1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.pu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66603d = 3;
        if (this.f66605f == null) {
            View viewInflate = this.f66602c.inflate(this.f66611l, (ViewGroup) null);
            this.f66605f = viewInflate;
            viewInflate.setOnClickListener(this.f66619t);
            this.f66615p.addView(this.f66605f, 0, this.f66618s);
        }
        com.max.hbcommon.analytics.j jVar = this.B;
        if (jVar != null) {
            jVar.i();
        }
        J1(this.f66603d);
    }

    public final void D1(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.ou, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66611l = i10;
        C1();
    }

    public final void E1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ku, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66603d = 1;
        if (this.f66606g == null) {
            View viewInflate = this.f66602c.inflate(this.f66612m, (ViewGroup) null);
            this.f66606g = viewInflate;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.img_progress);
            if (circularProgressIndicator != null) {
                circularProgressIndicator.p();
            }
            this.f66615p.addView(this.f66606g, 0, this.f66618s);
        }
        J1(this.f66603d);
    }

    public final void F1(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.ju, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66612m = i10;
        E1();
    }

    public final void G1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ru, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66603d = 4;
        if (this.f66607h == null) {
            View viewInflate = this.f66602c.inflate(this.f66613n, (ViewGroup) null);
            this.f66607h = viewInflate;
            viewInflate.setOnClickListener(this.f66619t);
            this.f66615p.addView(this.f66607h, 0, this.f66618s);
        }
        J1(this.f66603d);
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String H() {
        return com.max.hbcommon.analytics.e.a(this);
    }

    public final void H1(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.qu, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66613n = i10;
        G1();
    }

    public boolean K1() {
        return true;
    }

    public boolean L1() {
        return false;
    }

    public void N0(Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.b.yu, new Class[]{Dialog.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66623x == null) {
            this.f66623x = new ArrayList();
        }
        if (dialog != null) {
            this.f66623x.add(dialog);
        }
    }

    public void O0() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.vu, new Class[0], Void.TYPE).isSupported || (aVar = this.f66621v) == null) {
            return;
        }
        aVar.f();
    }

    public void P0() {
        List<Dialog> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.zu, new Class[0], Void.TYPE).isSupported || (list = this.f66623x) == null) {
            return;
        }
        for (Dialog dialog : list) {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        this.f66623x.clear();
        this.f66623x = null;
    }

    public void Q0() {
        List<ValueAnimator> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.xu, new Class[0], Void.TYPE).isSupported || (list = this.f66622w) == null) {
            return;
        }
        for (ValueAnimator valueAnimator : list) {
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
        }
        this.f66622w.clear();
        this.f66622w = null;
    }

    public f S0() {
        return this;
    }

    public String T0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.hu, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : getClass().getSimpleName();
    }

    public Dialog U0() {
        return this.A;
    }

    public void V(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.uu, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66621v == null) {
            this.f66621v = new io.reactivex.disposables.a();
        }
        this.f66621v.c(bVar);
    }

    public io.reactivex.disposables.a V0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.tu, new Class[0], io.reactivex.disposables.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.a) patchProxyResultProxy.result;
        }
        if (this.f66621v == null) {
            this.f66621v = new io.reactivex.disposables.a();
        }
        return this.f66621v;
    }

    public View W0() {
        return this.f66608i;
    }

    @p0
    public com.billy.android.swipe.consumer.f X0() {
        return this.F;
    }

    public View Z0() {
        return this.f66614o;
    }

    @p0
    public SmartSwipeWrapper a1() {
        return this.E;
    }

    @Override // com.max.hbcommon.base.a
    public void addValueAnimator(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.b.wu, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f66622w == null) {
            this.f66622w = new ArrayList();
        }
        this.f66622w.add(valueAnimator);
    }

    public TitleBar c1() {
        return this.f66616q;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean d2() {
        return com.max.hbcommon.analytics.e.c(this);
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Iu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        ob.a.b().j(this);
    }

    public List<ValueAnimator> g1() {
        return this.f66622w;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @p0
    public PathSrcNode getClickSrc() {
        return this.C;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @p0
    public String getPageAdditional() {
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @p0
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Hu, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbcommon.analytics.d.r(getClass());
    }

    @Override // com.max.hbcommon.base.f
    public Context getViewContext() {
        return this.f66601b;
    }

    public int h1() {
        return this.f66603d;
    }

    @Override // com.max.hbcommon.base.f
    public boolean isActive() {
        return this.f66624y;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public boolean isPageVisited() {
        return this.D;
    }

    public void j1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ku, new Class[0], Void.TYPE).isSupported && L1() && this.F == null) {
            this.F = new db.a();
            this.E = (SmartSwipeWrapper) findViewById(R.id.vg_ssw);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(R.id.base_fragment_container);
            if (this.E != null) {
                this.F.z2(frameLayout);
                this.E.addConsumer(this.F);
            }
        }
    }

    public void k1() {
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void l1(View view) {
        com.max.hbcommon.analytics.e.f(this, view);
    }

    public void n1() {
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean o3() {
        return com.max.hbcommon.analytics.e.d(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.b.cu, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("OnCreate : " + T0());
        }
        com.max.hbcommon.utils.d.e("BaseActivity", T0() + " onCreate");
        this.f66601b = this;
        this.f66602c = LayoutInflater.from(this);
        i1();
        if (K1()) {
            t.J(this);
        }
        k1();
        this.B = new com.max.hbcommon.analytics.j(this, bundle != null);
        q1();
        this.f66624y = true;
        if ("1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            PushAgent.getInstance(this.f66601b).onAppStart();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Du, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("OnDestroy : " + T0());
        }
        this.B.d();
        O0();
        Q0();
        P0();
        this.f66624y = false;
        this.f66608i = null;
        this.f66604e = null;
        this.f66605f = null;
        this.f66606g = null;
        this.f66607h = null;
        Unbinder unbinder = this.f66620u;
        if (unbinder != null) {
            unbinder.a();
        }
        R0(getWindow().getDecorView());
        Activity activity = this.f66601b;
        if (activity != null) {
            Glide.e(activity).c();
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void onPageVisitSuccess() {
        com.max.hbcommon.analytics.j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ju, new Class[0], Void.TYPE).isSupported || (jVar = this.B) == null) {
            return;
        }
        jVar.k();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Cu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("OnPause : " + T0());
        }
        this.B.e();
        if ("1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            MobclickAgent.onPause(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Bu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("OnResume : " + T0());
        }
        this.B.f();
        if ("1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
            MobclickAgent.onResume(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Fu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        this.B.g();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("OnStart : " + T0());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Gu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.B.h();
        super.onStop();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("OnStop : " + T0());
        }
    }

    public void q1() {
    }

    public void replaceTitlebar(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.eu, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        ((LinearLayout) this.f66614o).removeView(this.f66616q);
        ((LinearLayout) this.f66614o).addView(view, 0, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setClickSrc(@p0 PathSrcNode pathSrcNode) {
        this.C = pathSrcNode;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.fu, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.f66602c.inflate(i10, (ViewGroup) null);
        this.f66608i = viewInflate;
        this.f66615p.addView(viewInflate, 0, this.f66618s);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.gu, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66608i = view;
        this.f66615p.addView(view, 0, this.f66618s);
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setPageVisited(boolean z10) {
        this.D = z10;
    }

    public void t1(BroadcastReceiver broadcastReceiver, String str) {
        if (PatchProxy.proxy(new Object[]{broadcastReceiver, str}, this, changeQuickRedirect, false, bb.c.b.Au, new Class[]{BroadcastReceiver.class, String.class}, Void.TYPE).isSupported || broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(str);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f66601b.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            this.f66601b.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String v3() {
        return com.max.hbcommon.analytics.e.b(this);
    }

    public void w1(Dialog dialog) {
        this.A = dialog;
    }

    public final void x1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.iu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66603d = 0;
        J1(0);
    }

    public final void y1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.mu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66603d = 2;
        if (this.f66604e == null) {
            View viewInflate = this.f66602c.inflate(this.f66610k, (ViewGroup) null);
            this.f66604e = viewInflate;
            this.f66615p.addView(viewInflate, 0, this.f66618s);
        }
        J1(this.f66603d);
    }

    public final void z1(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.lu, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66610k = i10;
        y1();
    }
}
