package com.max.xiaoheihe.module.bbs;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.ActColumnObj;
import com.max.xiaoheihe.bean.bbs.ActColumnTabObj;
import com.max.xiaoheihe.bean.bbs.ColumnInfoObj;
import com.max.xiaoheihe.bean.bbs.CreatePostInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.ArrayList;

/* JADX INFO: compiled from: ActColumnActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ActColumnActivity extends BaseActivity implements com.max.xiaoheihe.module.video.b, HashtagDetailContentFragment.e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ImageView L;
    private TextView M;
    private TextView N;
    private TabLayout O;
    private ViewPager P;
    private androidx.viewpager.widget.a Q;
    private View R;
    private FrameLayout S;
    private int V;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private ColumnInfoObj f79510a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.d
    private final com.max.hbshare.c.b f79511b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    public static final a f79507c0 = new a(null);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f79508p1 = 8;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.d
    private static final String f79509x1 = "arg_column_id";
    private final int T = 30;

    @dl.d
    private String U = "";

    @dl.d
    private String W = "1";

    @dl.d
    private ArrayList<ActColumnTabObj> X = new ArrayList<>();
    private int Y = -1;
    private boolean Z = true;

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        private static /* synthetic */ void a() {
        }

        @dl.d
        @xh.m
        public final Intent b(@dl.d Context context, @dl.d String columnID) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, columnID}, this, changeQuickRedirect, false, 25653, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(columnID, "columnID");
            Intent intent = new Intent(context, (Class<?>) ActColumnActivity.class);
            intent.putExtra(ActColumnActivity.f79509x1, columnID);
            return intent;
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActColumnObj f79512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActColumnActivity f79513c;

        b(ActColumnObj actColumnObj, ActColumnActivity actColumnActivity) {
            this.f79512b = actColumnObj;
            this.f79513c = actColumnActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ColumnInfoObj share_info;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25654, new Class[]{View.class}, Void.TYPE).isSupported || (share_info = this.f79512b.getShare_info()) == null) {
                return;
            }
            ActColumnActivity actColumnActivity = this.f79513c;
            com.max.hbshare.d.E(((BaseActivity) actColumnActivity).f66601b, new HBShareData(false, true, share_info.getTitle(), share_info.getDesc(), share_info.getUrl(), null, !com.max.hbcommon.utils.c.u(share_info.getThumb()) ? new UMImage(((BaseActivity) actColumnActivity).f66601b, share_info.getThumb()) : new UMImage(((BaseActivity) actColumnActivity).f66601b, R.drawable.share_thumbnail), actColumnActivity.f79511b0, null, null, null, null, null, bb.c.k.L0, null));
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class c implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 25655, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
            ViewPager viewPager = ActColumnActivity.this.P;
            if (viewPager == null) {
                kotlin.jvm.internal.f0.S("mViewPager");
                viewPager = null;
            }
            viewPager.setCurrentItem(tab.k());
            ActColumnActivity.this.V = tab.k();
            View view = ActColumnActivity.this.R;
            if (view == null) {
                kotlin.jvm.internal.f0.S("mWritePostImageView");
                view = null;
            }
            CreatePostInfo post = ((ActColumnTabObj) ActColumnActivity.this.X.get(ActColumnActivity.this.V)).getPost();
            view.setVisibility(kotlin.jvm.internal.f0.g(post != null ? post.getEnabled() : null, "1") ? 0 : 8);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 25656, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.d TabLayout.h tab) {
            if (PatchProxy.proxy(new Object[]{tab}, this, changeQuickRedirect, false, 25657, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(tab, "tab");
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class d extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ActColumnObj f79516m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ActColumnObj actColumnObj, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f79516m = actColumnObj;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25659, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ActColumnActivity.this.X.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25658, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (i10 == 0) {
                com.max.xiaoheihe.module.bbs.a.C0674a c0674a = com.max.xiaoheihe.module.bbs.a.f80234r;
                String str = ActColumnActivity.this.W;
                String list_type = ((ActColumnTabObj) ActColumnActivity.this.X.get(i10)).getList_type();
                kotlin.jvm.internal.f0.m(list_type);
                return c0674a.a(str, list_type, i10, ActColumnActivity.this.U, this.f79516m);
            }
            com.max.xiaoheihe.module.bbs.a.C0674a c0674a2 = com.max.xiaoheihe.module.bbs.a.f80234r;
            String str2 = ActColumnActivity.this.W;
            String list_type2 = ((ActColumnTabObj) ActColumnActivity.this.X.get(i10)).getList_type();
            kotlin.jvm.internal.f0.m(list_type2);
            String id2 = ((ActColumnTabObj) ActColumnActivity.this.X.get(i10)).getId();
            kotlin.jvm.internal.f0.m(id2);
            return c0674a2.b(str2, list_type2, id2);
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@dl.e View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25660, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((BaseActivity) ActColumnActivity.this).f66601b)) {
                Activity mContext = ((BaseActivity) ActColumnActivity.this).f66601b;
                kotlin.jvm.internal.f0.o(mContext, "mContext");
                CreatePostInfo post = ((ActColumnTabObj) ActColumnActivity.this.X.get(ActColumnActivity.this.V)).getPost();
                com.max.xiaoheihe.base.router.b.q(mContext, null, post != null ? post.getHashtag_name() : null, false).A();
            }
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<ActColumnObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 25662, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (ActColumnActivity.this.isActive()) {
                ActColumnActivity.b2(ActColumnActivity.this);
            }
        }

        public void onNext(@dl.d Result<ActColumnObj> t10) {
            if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, 25661, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(t10, "t");
            if (ActColumnActivity.this.isActive()) {
                ActColumnActivity.a2(ActColumnActivity.this);
                ActColumnActivity actColumnActivity = ActColumnActivity.this;
                ActColumnObj result = t10.getResult();
                kotlin.jvm.internal.f0.o(result, "t.result");
                ActColumnActivity.Y1(actColumnActivity, result);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25663, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ActColumnObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class g extends com.max.hbshare.c.b {
        g(h hVar, JsonObject jsonObject) {
            super(com.max.hbshare.c.f72554j, hVar, jsonObject);
        }
    }

    /* JADX INFO: compiled from: ActColumnActivity.kt */
    public static final class h implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(@dl.e SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(@dl.e SHARE_MEDIA share_media, @dl.e Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 25665, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) ActColumnActivity.this).f66601b;
            com.max.hbutils.utils.c.f(activity != null ? activity.getString(R.string.share_fail) : null);
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(@dl.e SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 25664, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c.f(ActColumnActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(@dl.e SHARE_MEDIA share_media) {
        }
    }

    public ActColumnActivity() {
        h hVar = new h();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("col_id", this.W);
        this.f79511b0 = new g(hVar, jsonObject);
    }

    public static final /* synthetic */ void Y1(ActColumnActivity actColumnActivity, ActColumnObj actColumnObj) {
        if (PatchProxy.proxy(new Object[]{actColumnActivity, actColumnObj}, null, changeQuickRedirect, true, 25651, new Class[]{ActColumnActivity.class, ActColumnObj.class}, Void.TYPE).isSupported) {
            return;
        }
        actColumnActivity.f2(actColumnObj);
    }

    public static final /* synthetic */ void a2(ActColumnActivity actColumnActivity) {
        if (PatchProxy.proxy(new Object[]{actColumnActivity}, null, changeQuickRedirect, true, 25650, new Class[]{ActColumnActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        actColumnActivity.x1();
    }

    public static final /* synthetic */ void b2(ActColumnActivity actColumnActivity) {
        if (PatchProxy.proxy(new Object[]{actColumnActivity}, null, changeQuickRedirect, true, 25652, new Class[]{ActColumnActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        actColumnActivity.C1();
    }

    private final void c2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25641, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.iv_banner);
        kotlin.jvm.internal.f0.o(viewFindViewById, "findViewById(R.id.iv_banner)");
        this.L = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_act_name);
        kotlin.jvm.internal.f0.o(viewFindViewById2, "findViewById(R.id.tv_act_name)");
        this.M = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_act_desc);
        kotlin.jvm.internal.f0.o(viewFindViewById3, "findViewById(R.id.tv_act_desc)");
        this.N = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tab);
        kotlin.jvm.internal.f0.o(viewFindViewById4, "findViewById(R.id.tab)");
        this.O = (TabLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.vp);
        kotlin.jvm.internal.f0.o(viewFindViewById5, "findViewById(R.id.vp)");
        this.P = (ViewPager) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.fb_write_post);
        kotlin.jvm.internal.f0.o(viewFindViewById6, "findViewById(R.id.fb_write_post)");
        this.R = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.vg_fullscreen_video_container);
        kotlin.jvm.internal.f0.o(viewFindViewById7, "findViewById(R.id.vg_fullscreen_video_container)");
        this.S = (FrameLayout) viewFindViewById7;
    }

    private final void e2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25644, new Class[0], Void.TYPE).isSupported && this.Z) {
            View view = this.R;
            if (view == null) {
                kotlin.jvm.internal.f0.S("mWritePostImageView");
                view = null;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, ViewUtils.f(this.f66601b, 74.0f) + 0.0f);
            objectAnimatorOfFloat.start();
            addValueAnimator(objectAnimatorOfFloat);
            this.Z = false;
        }
    }

    private final void f2(ActColumnObj actColumnObj) {
        if (PatchProxy.proxy(new Object[]{actColumnObj}, this, changeQuickRedirect, false, 25642, new Class[]{ActColumnObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setActionIcon(R.drawable.common_share);
        this.f66616q.setActionIconOnClickListener(new b(actColumnObj, this));
        ColumnInfoObj col = actColumnObj.getCol();
        View view = null;
        if (col != null) {
            TextView textView = this.M;
            if (textView == null) {
                kotlin.jvm.internal.f0.S("tvActName");
                textView = null;
            }
            textView.setText(col.getTitle());
            TextView textView2 = this.N;
            if (textView2 == null) {
                kotlin.jvm.internal.f0.S("tvActDesc");
                textView2 = null;
            }
            textView2.setText(col.getDesc());
            String thumb = col.getThumb();
            ImageView imageView = this.L;
            if (imageView == null) {
                kotlin.jvm.internal.f0.S("ivBanner");
                imageView = null;
            }
            com.max.hbimage.b.K(thumb, imageView);
        }
        this.f79510a0 = actColumnObj.getShare_info();
        String lastval = actColumnObj.getLastval();
        if (lastval == null) {
            lastval = "";
        }
        this.U = lastval;
        TabLayout tabLayout = this.O;
        if (tabLayout == null) {
            kotlin.jvm.internal.f0.S("mTablayout");
            tabLayout = null;
        }
        tabLayout.L();
        if (!com.max.hbcommon.utils.c.w(actColumnObj.getTabs())) {
            ArrayList<ActColumnTabObj> tabs = actColumnObj.getTabs();
            kotlin.jvm.internal.f0.m(tabs);
            this.X = tabs;
            int i10 = 0;
            for (ActColumnTabObj actColumnTabObj : tabs) {
                int i11 = i10 + 1;
                TabLayout tabLayout2 = this.O;
                if (tabLayout2 == null) {
                    kotlin.jvm.internal.f0.S("mTablayout");
                    tabLayout2 = null;
                }
                TabLayout.h hVarI = tabLayout2.I();
                kotlin.jvm.internal.f0.o(hVarI, "mTablayout.newTab()");
                hVarI.D(actColumnTabObj.getName());
                if (hVarI.o()) {
                    this.V = i10;
                }
                TabLayout tabLayout3 = this.O;
                if (tabLayout3 == null) {
                    kotlin.jvm.internal.f0.S("mTablayout");
                    tabLayout3 = null;
                }
                tabLayout3.i(hVarI);
                i10 = i11;
            }
        }
        TabLayout tabLayout4 = this.O;
        if (tabLayout4 == null) {
            kotlin.jvm.internal.f0.S("mTablayout");
            tabLayout4 = null;
        }
        tabLayout4.h(new c());
        this.Q = new d(actColumnObj, getSupportFragmentManager());
        ViewPager viewPager = this.P;
        if (viewPager == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
            viewPager = null;
        }
        viewPager.setOffscreenPageLimit(5);
        ViewPager viewPager2 = this.P;
        if (viewPager2 == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
            viewPager2 = null;
        }
        androidx.viewpager.widget.a aVar = this.Q;
        if (aVar == null) {
            kotlin.jvm.internal.f0.S("mPagerAdapter");
            aVar = null;
        }
        viewPager2.setAdapter(aVar);
        ViewPager viewPager3 = this.P;
        if (viewPager3 == null) {
            kotlin.jvm.internal.f0.S("mViewPager");
            viewPager3 = null;
        }
        TabLayout tabLayout5 = this.O;
        if (tabLayout5 == null) {
            kotlin.jvm.internal.f0.S("mTablayout");
            tabLayout5 = null;
        }
        viewPager3.c(new TabLayout.l(tabLayout5));
        TabLayout tabLayout6 = this.O;
        if (tabLayout6 == null) {
            kotlin.jvm.internal.f0.S("mTablayout");
            tabLayout6 = null;
        }
        TabLayout tabLayout7 = this.O;
        if (tabLayout7 == null) {
            kotlin.jvm.internal.f0.S("mTablayout");
            tabLayout7 = null;
        }
        tabLayout6.R(tabLayout7.D(this.V));
        View view2 = this.R;
        if (view2 == null) {
            kotlin.jvm.internal.f0.S("mWritePostImageView");
            view2 = null;
        }
        CreatePostInfo post = this.X.get(this.V).getPost();
        view2.setVisibility(kotlin.jvm.internal.f0.g(post != null ? post.getEnabled() : null, "1") ? 0 : 8);
        View view3 = this.R;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("mWritePostImageView");
        } else {
            view = view3;
        }
        view.setOnClickListener(new e());
    }

    @dl.d
    @xh.m
    public static final Intent h2(@dl.d Context context, @dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 25649, new Class[]{Context.class, String.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : f79507c0.b(context, str);
    }

    private final void i2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25640, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V3(this.W, "", 0, Integer.valueOf(this.T), "").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    private final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25643, new Class[0], Void.TYPE).isSupported || this.Z) {
            return;
        }
        View view = this.R;
        if (view == null) {
            kotlin.jvm.internal.f0.S("mWritePostImageView");
            view = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", ViewUtils.f(this.f66601b, 74.0f) + 0.0f, 0.0f);
        objectAnimatorOfFloat.start();
        addValueAnimator(objectAnimatorOfFloat);
        this.Z = true;
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void c(@dl.e AbsVideoView absVideoView, @dl.e ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{absVideoView, viewGroup}, this, changeQuickRedirect, false, 25645, new Class[]{AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported || absVideoView == null) {
            return;
        }
        VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        VideoPlayerManager.x(videoPlayerManager, mContext, absVideoView, viewGroup, 0, 8, null);
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25646, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
        Activity mContext = this.f66601b;
        kotlin.jvm.internal.f0.o(mContext, "mContext");
        videoPlayerManager.e(mContext);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25638, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_act_column);
        getWindow().setFormat(-3);
        com.max.hbutils.utils.t.h0(getWindow());
        com.max.hbutils.utils.t.M(this.f66601b, true);
        int iN = com.max.hbutils.utils.t.n(this.f66601b);
        View viewZ0 = Z0();
        kotlin.jvm.internal.f0.n(viewZ0, "null cannot be cast to non-null type android.view.ViewGroup");
        com.max.hbutils.utils.t.c(iN, (ViewGroup) viewZ0, null);
        this.f66616q.setTitle("专题");
        String stringExtra = getIntent().getStringExtra(f79509x1);
        if (stringExtra == null) {
            stringExtra = "1";
        }
        this.W = stringExtra;
        c2();
        E1();
        i2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25639, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        i2();
    }

    @Override // com.max.xiaoheihe.module.bbs.HashtagDetailContentFragment.e
    public void r0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25647, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
    }

    @Override // com.max.xiaoheihe.module.bbs.HashtagDetailContentFragment.e
    public void t(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25648, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            j2();
        } else {
            e2();
        }
    }
}
