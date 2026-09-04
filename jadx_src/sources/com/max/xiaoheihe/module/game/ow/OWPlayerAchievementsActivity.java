package com.max.xiaoheihe.module.game.ow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.t;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.ow.OWAchievementObj;
import com.max.xiaoheihe.bean.game.ow.OWPlayerOverviewObj;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.util.ArrayList;
import java.util.List;
import ng.j;

/* JADX INFO: loaded from: classes11.dex */
public class OWPlayerAchievementsActivity extends BaseActivity {
    private static final String W = "OWPlayerAchievementsActivity";
    private static final String X = "ARG_PLAYER_ID";
    public static ChangeQuickRedirect changeQuickRedirect;
    private s<OWAchievementObj> N;
    private t O;
    private String P;
    private boolean Q;
    private View R;
    private String T;
    private PopupWindow U;
    private GridView V;

    @BindView(R.id.rv)
    RecyclerView mRvList;

    @BindView(R.id.srl)
    SmartRefreshLayout mSmartRefreshLayout;
    private List<OWAchievementObj> L = new ArrayList();
    private List<OWAchievementObj> M = new ArrayList();
    private List<String> S = new ArrayList();

    public class a extends s<OWAchievementObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(Context context, List list, int i10) {
            super(context, list, i10);
        }

        @w0(api = 21)
        public void m(s.e eVar, OWAchievementObj oWAchievementObj) {
            if (PatchProxy.proxy(new Object[]{eVar, oWAchievementObj}, this, changeQuickRedirect, false, 38023, new Class[]{s.e.class, OWAchievementObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ImageView imageView = (ImageView) eVar.i(R.id.iv_icon);
            com.max.hbimage.b.K(oWAchievementObj.getIcon(), imageView);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(com.max.xiaoheihe.utils.d.E(R.color.ow_orange));
            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
            if ("1".equals(oWAchievementObj.getAchieved())) {
                imageView.setImageTintList(colorStateListValueOf);
            } else {
                imageView.setImageTintList(colorStateListValueOf2);
            }
            TextView textView = (TextView) eVar.i(R.id.tv_name);
            TextView textView2 = (TextView) eVar.i(R.id.tv_award);
            TextView textView3 = (TextView) eVar.i(R.id.tv_desc);
            textView.setText(oWAchievementObj.getName());
            textView3.setText(oWAchievementObj.getDescription());
            if ("1".equals(oWAchievementObj.getAchieved())) {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.ow_orange));
            } else {
                textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        @w0(api = 21)
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, OWAchievementObj oWAchievementObj) {
            if (PatchProxy.proxy(new Object[]{eVar, oWAchievementObj}, this, changeQuickRedirect, false, 38024, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, oWAchievementObj);
        }
    }

    public class b implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // pg.d
        public void k(j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 38025, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            OWPlayerAchievementsActivity.M1(OWPlayerAchievementsActivity.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<OWPlayerOverviewObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            SmartRefreshLayout smartRefreshLayout;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38027, new Class[0], Void.TYPE).isSupported || !OWPlayerAchievementsActivity.this.isActive() || (smartRefreshLayout = OWPlayerAchievementsActivity.this.mSmartRefreshLayout) == null) {
                return;
            }
            smartRefreshLayout.A(0);
            OWPlayerAchievementsActivity.this.mSmartRefreshLayout.p(0);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 38026, new Class[]{Throwable.class}, Void.TYPE).isSupported && OWPlayerAchievementsActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = OWPlayerAchievementsActivity.this.mSmartRefreshLayout;
                if (smartRefreshLayout != null) {
                    smartRefreshLayout.A(0);
                    OWPlayerAchievementsActivity.this.mSmartRefreshLayout.p(0);
                }
                super.onError(th2);
                OWPlayerAchievementsActivity.N1(OWPlayerAchievementsActivity.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<OWPlayerOverviewObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 38028, new Class[]{Result.class}, Void.TYPE).isSupported && OWPlayerAchievementsActivity.this.isActive()) {
                if (result == null || result.getResult().getAchievements() == null) {
                    OWPlayerAchievementsActivity.V1(OWPlayerAchievementsActivity.this);
                } else {
                    OWPlayerAchievementsActivity.T1(OWPlayerAchievementsActivity.this, result.getResult().getAchievements().getAchievements());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 38029, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<OWPlayerOverviewObj>) obj);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38030, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            OWPlayerAchievementsActivity oWPlayerAchievementsActivity = OWPlayerAchievementsActivity.this;
            OWPlayerAchievementsActivity.Y1(oWPlayerAchievementsActivity, ((BaseActivity) oWPlayerAchievementsActivity).f66601b, view, OWPlayerAchievementsActivity.this.S);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f87909b;

        e(Context context) {
            this.f87909b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 38031, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            OWPlayerAchievementsActivity oWPlayerAchievementsActivity = OWPlayerAchievementsActivity.this;
            oWPlayerAchievementsActivity.e2(this.f87909b, oWPlayerAchievementsActivity.U, OWPlayerAchievementsActivity.this.V);
        }
    }

    public class f implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 38032, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            OWPlayerAchievementsActivity.this.V.setVisibility(0);
        }
    }

    public class g implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridView f87912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PopupWindow f87913b;

        g(GridView gridView, PopupWindow popupWindow) {
            this.f87912a = gridView;
            this.f87913b = popupWindow;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 38033, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f87912a.setVisibility(8);
            this.f87913b.dismiss();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class h extends com.max.hbcommon.base.adapter.h<String> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Context f87915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CompoundButton f87916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f87917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f87918h;

        public class a implements CompoundButton.OnCheckedChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f87920b;

            a(String str) {
                this.f87920b = str;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38038, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                h.g(h.this, compoundButton, z10);
                if (z10) {
                    OWPlayerAchievementsActivity.this.T = this.f87920b;
                    OWPlayerAchievementsActivity.Q1(OWPlayerAchievementsActivity.this);
                    OWPlayerAchievementsActivity.R1(OWPlayerAchievementsActivity.this);
                    h hVar = h.this;
                    OWPlayerAchievementsActivity.this.e2(hVar.f87915e, OWPlayerAchievementsActivity.this.U, OWPlayerAchievementsActivity.this.V);
                    if (h.this.f87916f != null && h.this.f87916f != compoundButton) {
                        h.this.f87916f.setChecked(false);
                    }
                    h.this.f87916f = compoundButton;
                }
            }
        }

        public h(Context context, List<String> list, String str) {
            super(context, list, R.layout.item_filter);
            this.f87915e = context;
            this.f87918h = str;
            this.f87917g = true;
        }

        static /* synthetic */ void g(h hVar, CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{hVar, compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 38037, new Class[]{h.class, CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            hVar.i(compoundButton, z10);
        }

        private void i(CompoundButton compoundButton, boolean z10) {
            if (PatchProxy.proxy(new Object[]{compoundButton, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38035, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (z10) {
                compoundButton.setTextColor(this.f87915e.getResources().getColor(R.color.white));
                compoundButton.setTypeface(Typeface.defaultFromStyle(0));
            } else {
                compoundButton.setTextColor(this.f87915e.getResources().getColor(R.color.text_primary_1_color));
                compoundButton.setTypeface(Typeface.defaultFromStyle(0));
            }
        }

        @Override // com.max.hbcommon.base.adapter.h
        public /* bridge */ /* synthetic */ void b(com.max.hbcommon.base.adapter.h.a aVar, String str) {
            if (PatchProxy.proxy(new Object[]{aVar, str}, this, changeQuickRedirect, false, 38036, new Class[]{com.max.hbcommon.base.adapter.h.a.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            h(aVar, str);
        }

        public void h(com.max.hbcommon.base.adapter.h.a aVar, String str) {
            String str2;
            if (PatchProxy.proxy(new Object[]{aVar, str}, this, changeQuickRedirect, false, 38034, new Class[]{com.max.hbcommon.base.adapter.h.a.class, String.class}, Void.TYPE).isSupported) {
                return;
            }
            RadioButton radioButton = (RadioButton) aVar.e(R.id.rb_filter);
            if (this.f87917g && (str2 = this.f87918h) != null && str2.equals(str)) {
                radioButton.setChecked(true);
                i(radioButton, true);
                this.f87916f = radioButton;
                this.f87917g = false;
            }
            radioButton.setOnCheckedChangeListener(new a(str));
            radioButton.setText(str);
        }
    }

    static /* synthetic */ void M1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity}, null, changeQuickRedirect, true, 38016, new Class[]{OWPlayerAchievementsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.b2();
    }

    static /* synthetic */ void N1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity}, null, changeQuickRedirect, true, 38017, new Class[]{OWPlayerAchievementsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.C1();
    }

    static /* synthetic */ void Q1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity}, null, changeQuickRedirect, true, 38021, new Class[]{OWPlayerAchievementsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.j2();
    }

    static /* synthetic */ void R1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity}, null, changeQuickRedirect, true, 38022, new Class[]{OWPlayerAchievementsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.k2();
    }

    static /* synthetic */ void T1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity, List list) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity, list}, null, changeQuickRedirect, true, 38018, new Class[]{OWPlayerAchievementsActivity.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.h2(list);
    }

    static /* synthetic */ void V1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity}, null, changeQuickRedirect, true, 38019, new Class[]{OWPlayerAchievementsActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.C1();
    }

    static /* synthetic */ void Y1(OWPlayerAchievementsActivity oWPlayerAchievementsActivity, Context context, View view, List list) {
        if (PatchProxy.proxy(new Object[]{oWPlayerAchievementsActivity, context, view, list}, null, changeQuickRedirect, true, 38020, new Class[]{OWPlayerAchievementsActivity.class, Context.class, View.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        oWPlayerAchievementsActivity.i2(context, view, list);
    }

    private void b2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38008, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) i.a().a3(this.P).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    public static Intent c2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 38006, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) OWPlayerAchievementsActivity.class);
        intent.putExtra("ARG_PLAYER_ID", str);
        return intent;
    }

    private void f2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38011, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = (TextView) this.R.findViewById(R.id.tv_arrow);
        bb.d.d(textView, 0);
        textView.setText(lb.b.f131094j);
        this.R.setOnClickListener(new d());
    }

    private void h2(List<OWAchievementObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 38010, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        this.M.clear();
        this.M.addAll(list);
        this.S.clear();
        for (OWAchievementObj oWAchievementObj : this.M) {
            if (!this.S.contains(oWAchievementObj.getCategory_name())) {
                this.S.add(oWAchievementObj.getCategory_name());
            }
        }
        this.T = this.S.get(0);
        j2();
        k2();
    }

    private void i2(Context context, View view, List<String> list) {
        if (PatchProxy.proxy(new Object[]{context, view, list}, this, changeQuickRedirect, false, 38013, new Class[]{Context.class, View.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_filter, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.divider_top);
        this.V = (GridView) viewInflate.findViewById(R.id.gv_filter);
        viewFindViewById.setVisibility(0);
        this.V.setAdapter((ListAdapter) new h(context, list, this.T));
        PopupWindow popupWindow = this.U;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.U = new PopupWindow(viewInflate, -1, -1, true);
        viewInflate.setOnClickListener(new e(context));
        this.U.setTouchable(true);
        this.U.setBackgroundDrawable(new BitmapDrawable());
        this.U.setAnimationStyle(0);
        if (this.U.isShowing() || view == null) {
            return;
        }
        ViewUtils.o0(this.U, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f66601b, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new f());
        this.V.startAnimation(animationLoadAnimation);
    }

    private void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ((TextView) this.R.findViewById(R.id.tv_desc)).setText(this.T);
    }

    private void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.L.clear();
        for (OWAchievementObj oWAchievementObj : this.M) {
            if (this.T.equals(oWAchievementObj.getCategory_name())) {
                this.L.add(oWAchievementObj);
            }
        }
        this.O.notifyDataSetChanged();
    }

    public void e2(Context context, PopupWindow popupWindow, GridView gridView) {
        if (PatchProxy.proxy(new Object[]{context, popupWindow, gridView}, this, changeQuickRedirect, false, 38014, new Class[]{Context.class, PopupWindow.class, GridView.class}, Void.TYPE).isSupported) {
            return;
        }
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f66601b, R.anim.filter_slide_out);
        animationLoadAnimation.setAnimationListener(new g(gridView, popupWindow));
        gridView.startAnimation(animationLoadAnimation);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38007, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_refresh_rv);
        this.f66620u = ButterKnife.a(this);
        String stringExtra = getIntent().getStringExtra("ARG_PLAYER_ID");
        this.P = stringExtra;
        boolean z10 = true;
        if (!com.max.hbcommon.utils.c.u(stringExtra) && com.max.xiaoheihe.module.account.utils.c.d(this.P) != 1) {
            z10 = false;
        }
        this.Q = z10;
        if (z10) {
            this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.my_achievement));
        } else {
            this.f66616q.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.his_achievement));
        }
        a aVar = new a(this.f66601b, this.L, R.layout.item_ow_player_achievement);
        this.N = aVar;
        this.O = new t(aVar);
        this.mRvList.setLayoutManager(new LinearLayoutManager(this.f66601b));
        this.mRvList.setAdapter(this.O);
        this.R = this.f66602c.inflate(R.layout.header_ow_achievement_filter, (ViewGroup) this.mRvList, false);
        f2();
        this.O.p(R.layout.header_ow_achievement_filter, this.R);
        this.mSmartRefreshLayout.b0(false);
        this.mSmartRefreshLayout.S(new b());
        E1();
        b2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38009, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        b2();
    }
}
