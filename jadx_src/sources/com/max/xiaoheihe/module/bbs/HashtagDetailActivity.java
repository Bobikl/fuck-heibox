package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.player.VideoPlayerManager;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.HashPostLinkInfoObj;
import com.max.xiaoheihe.bean.bbs.HashtagLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131192k1)
@ig.d(path = {lb.d.f131192k1, lb.d.f131227p1})
public class HashtagDetailActivity extends BaseActivity implements HashtagDetailContentFragment.e, com.max.xiaoheihe.module.video.b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f79867b0 = "tag";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f79868c0 = "hashtag_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f79869p1 = "quick_from";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f79870x1 = "extra_params";
    private df.p0 L;
    private String N;
    private String O;
    private String P;
    private HashPostLinkInfoObj S;
    private KeyDescObj T;
    private List<KeyDescObj> V;
    private androidx.viewpager.widget.a W;
    private HashtagLinkListResultObj X;

    @BindView(R.id.abl)
    AppBarLayout abl;

    @BindView(R.id.iv_icon_hashtag)
    QMUIRadiusImageView iv_icon_hashtag;

    @BindView(R.id.tab)
    TabLayout mCommonTabLayout;

    @BindView(R.id.tb_title_trans)
    TitleBar tb_title_trans;

    @BindView(R.id.tv_desc)
    TextView tv_desc;

    @BindView(R.id.tv_long_desc)
    TextView tv_long_desc;

    @BindView(R.id.tv_name)
    TextView tv_name;

    @BindView(R.id.v_title_bg)
    View v_title_bg;

    @BindView(R.id.vg_post)
    FloatingPostButton vg_post;

    @BindView(R.id.vp_content)
    ViewPager viewPager;
    private boolean M = false;
    private String Q = "";
    private String R = "";
    private int U = 0;
    private boolean Y = true;
    private boolean Z = true;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private UMShareListener f79871a0 = new a();

    public class a implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 26498, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(HashtagDetailActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (!PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 26497, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported && HashtagDetailActivity.this.isActive()) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(com.max.xiaoheihe.utils.d.n0(R.string.share_success));
            }
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class b implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbimage.b.q
        public void a(Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 26499, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            HashtagDetailActivity.this.L.f114366x.setBitmap(com.max.mediaselector.lib.utils.c.e(drawable, 0));
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(Drawable drawable) {
        }
    }

    public class c implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 26500, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            HashtagDetailActivity hashtagDetailActivity = HashtagDetailActivity.this;
            hashtagDetailActivity.T = (KeyDescObj) hashtagDetailActivity.V.get(hVar.k());
            HashtagDetailActivity.this.viewPager.setCurrentItem(hVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.h hVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.h hVar) {
        }
    }

    public class d extends com.max.hbcommon.network.d<Result<HashtagLinkListResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26502, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            HashtagDetailActivity.this.isActive();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26501, new Class[]{Throwable.class}, Void.TYPE).isSupported && HashtagDetailActivity.this.isActive()) {
                super.onError(th2);
                HashtagDetailActivity.j2(HashtagDetailActivity.this);
                th2.printStackTrace();
            }
        }

        public void onNext(Result<HashtagLinkListResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26503, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            HashtagDetailActivity.this.Z = false;
            if (HashtagDetailActivity.this.isActive()) {
                if (result == null) {
                    HashtagDetailActivity.R1(HashtagDetailActivity.this);
                    return;
                }
                HashtagDetailActivity.this.X = result.getResult();
                if (HashtagDetailActivity.this.X.getHashtag().getPost_link_info() != null) {
                    HashtagDetailActivity hashtagDetailActivity = HashtagDetailActivity.this;
                    hashtagDetailActivity.S = hashtagDetailActivity.X.getHashtag().getPost_link_info();
                }
                HashtagDetailActivity.p2(HashtagDetailActivity.this, result.getResult());
                HashtagDetailActivity.q2(HashtagDetailActivity.this, result.getResult());
                HashtagDetailActivity.r2(HashtagDetailActivity.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26504, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<HashtagLinkListResultObj>) obj);
        }
    }

    public class e implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 26505, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            float fAbs = Math.abs(i10 / HashtagDetailActivity.this.abl.getTotalScrollRange());
            com.max.hbcommon.utils.d.b("zzzztest", "percent" + fAbs);
            HashtagDetailActivity.this.v_title_bg.setAlpha(fAbs);
            if (fAbs > 0.5d) {
                if (HashtagDetailActivity.this.Y) {
                    HashtagDetailActivity.this.Y = false;
                    HashtagDetailActivity.this.tb_title_trans.setTitleTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    HashtagDetailActivity.this.tb_title_trans.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    HashtagDetailActivity.this.tb_title_trans.getAppbarActionButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                    com.max.hbutils.utils.t.M(HashtagDetailActivity.this, true);
                    return;
                }
                return;
            }
            if (HashtagDetailActivity.this.Y) {
                return;
            }
            HashtagDetailActivity.this.Y = true;
            HashtagDetailActivity.this.tb_title_trans.setTitleTextColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
            HashtagDetailActivity.this.tb_title_trans.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
            HashtagDetailActivity.this.tb_title_trans.getAppbarActionButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
            com.max.hbutils.utils.t.M(HashtagDetailActivity.this, false);
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26506, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            HashtagDetailActivity.this.finish();
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashtagLinkListResultObj f79878b;

        g(HashtagLinkListResultObj hashtagLinkListResultObj) {
            this.f79878b = hashtagLinkListResultObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26507, new Class[]{View.class}, Void.TYPE).isSupported && com.max.xiaoheihe.utils.i0.e(((BaseActivity) HashtagDetailActivity.this).f66601b)) {
                HashtagLinkListResultObj hashtagLinkListResultObj = this.f79878b;
                if (hashtagLinkListResultObj != null && !com.max.hbcommon.utils.c.u(hashtagLinkListResultObj.getPublish_protocol())) {
                    com.max.xiaoheihe.base.router.b.j0(((BaseActivity) HashtagDetailActivity.this).f66601b, HashtagDetailActivity.this.X.getPublish_protocol());
                    return;
                }
                s0 s0VarI4 = s0.i4(null, HashtagDetailActivity.this.N, HashtagDetailActivity.this.R, HashtagDetailActivity.this.S);
                Bundle arguments = s0VarI4.getArguments() != null ? s0VarI4.getArguments() : new Bundle();
                arguments.putString("source", "tag");
                s0VarI4.setArguments(arguments);
                s0VarI4.show(HashtagDetailActivity.this.getSupportFragmentManager(), "writeposttype");
            }
        }
    }

    public class h extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ HashtagLinkListResultObj f79880l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FragmentManager fragmentManager, HashtagLinkListResultObj hashtagLinkListResultObj) {
            super(fragmentManager);
            this.f79880l = hashtagLinkListResultObj;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26509, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f79880l.getSort_filter().size();
        }

        @Override // androidx.fragment.app.n0
        @androidx.annotation.n0
        public Fragment getItem(int i10) {
            int i11;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26508, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if ("2".equals(this.f79880l.getSort_filter().get(i10).getList_type())) {
                i11 = HashtagDetailActivity.this.M ? 3 : 2;
            } else {
                i11 = HashtagDetailActivity.this.M ? 3 : 1;
            }
            return HashtagDetailContentFragment.f4(i11, HashtagDetailActivity.this.O, HashtagDetailActivity.this.N, ((KeyDescObj) HashtagDetailActivity.this.V.get(i10)).getKey(), HashtagDetailActivity.e2(HashtagDetailActivity.this), HashtagDetailActivity.this.P, HashtagDetailActivity.this.Q);
        }
    }

    private void B2(HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagLinkListResultObj}, this, changeQuickRedirect, false, 26482, new Class[]{HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setVisibility(8);
        this.f66617r.setVisibility(8);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        setContentView(this.L.b());
        this.f66620u = ButterKnife.a(this);
        getWindow().setFormat(-3);
        com.max.hbutils.utils.t.h0(getWindow());
        com.max.hbutils.utils.t.M(this.f66601b, false);
        this.abl.e(new e());
        ((ViewGroup.MarginLayoutParams) this.tb_title_trans.getLayoutParams()).topMargin = com.max.hbutils.utils.t.f73584e;
        String name = this.X.getHashtag().getName();
        String display_name = this.X.getHashtag().getDisplay_name();
        TitleBar titleBar = this.tb_title_trans;
        if (com.max.hbcommon.utils.c.u(display_name)) {
            display_name = "#" + name + "#";
        }
        titleBar.setTitle(display_name);
        this.tb_title_trans.setTitleTextColor(com.max.xiaoheihe.utils.d.E(R.color.transparent));
        this.tb_title_trans.getAppbarNavButtonView().setImageResource(R.drawable.ic_0icon_arrow_24);
        this.tb_title_trans.getAppbarNavButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
        this.tb_title_trans.getAppbarNavButtonView().setPadding(ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 10.0f), 0);
        this.tb_title_trans.setNavigationOnClickListener(new f());
        if (hashtagLinkListResultObj != null) {
            final HashtagLinkListResultObj.ShareInfoObj share_info = hashtagLinkListResultObj.getShare_info();
            if (share_info != null) {
                this.tb_title_trans.setActionIcon(R.drawable.common_share);
                this.tb_title_trans.getAppbarActionButtonView().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                this.tb_title_trans.setActionIconOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f83252b.H2(share_info, view);
                    }
                });
            }
        } else {
            com.max.heybox.hblog.g.G("[HashtagDetailActivity][initHeader] when call getShare_info, result should not be null!");
        }
        x1();
        this.vg_post.setVisibility(0);
        this.vg_post.setText((hashtagLinkListResultObj == null || hashtagLinkListResultObj.getPost_btn() == null || com.max.hbcommon.utils.c.u(hashtagLinkListResultObj.getPost_btn().getDesc())) ? "参与讨论" : hashtagLinkListResultObj.getPost_btn().getDesc());
        this.vg_post.setOnClickListener(new g(hashtagLinkListResultObj));
    }

    private void C2(HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagLinkListResultObj}, this, changeQuickRedirect, false, 26477, new Class[]{HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        HashtagObj hashtag = hashtagLinkListResultObj.getHashtag();
        String name = hashtag.getName();
        String display_name = hashtag.getDisplay_name();
        TextView textView = this.tv_name;
        if (com.max.hbcommon.utils.c.u(display_name)) {
            display_name = "#" + name + "#";
        }
        textView.setText(display_name);
        this.tv_desc.setText(hashtag.getDesc());
        if (!com.max.hbcommon.utils.c.u(hashtag.getBg_img())) {
            this.L.f114346d.setVisibility(0);
            this.L.f114347e.setVisibility(0);
            this.L.f114366x.setVisibility(8);
            this.L.f114348f.setVisibility(8);
            com.max.hbimage.b.L(hashtag.getBg_img(), this.L.f114346d, R.drawable.common_default_placeholder_375x210);
        } else if (com.max.hbcommon.utils.c.u(hashtag.getBg_offset_img())) {
            this.L.f114346d.setVisibility(8);
            this.L.f114347e.setVisibility(0);
            this.L.f114366x.setVisibility(0);
            this.L.f114348f.setVisibility(8);
        } else {
            this.L.f114346d.setVisibility(8);
            this.L.f114347e.setVisibility(8);
            this.L.f114366x.setVisibility(0);
            this.L.f114348f.setVisibility(0);
            if (!com.max.hbcommon.utils.c.v(hashtag.getBg_st_color(), hashtag.getBg_ed_color())) {
                this.L.f114348f.setVisibility(0);
                this.L.f114348f.setBackground(ViewUtils.i(0, com.max.xiaoheihe.utils.d.e1(hashtag.getBg_st_color()), com.max.xiaoheihe.utils.d.e1(hashtag.getBg_ed_color())));
                com.max.hbimage.b.Y(this.f66601b, hashtag.getBg_offset_img(), new b());
            }
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.iv_icon_hashtag;
        qMUIRadiusImageView.setCornerRadius(ViewUtils.p(this.f66601b, qMUIRadiusImageView, ViewUtils.ViewType.IMAGE));
        if (hashtag.getIcon() != null) {
            com.max.hbimage.b.K(hashtag.getIcon(), this.iv_icon_hashtag);
        } else {
            this.iv_icon_hashtag.setImageResource(R.drawable.hashtag_profile_default_57x57);
        }
        if (com.max.hbcommon.utils.c.u(hashtag.getLong_desc())) {
            this.tv_long_desc.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) this.tv_desc.getLayoutParams()).topMargin = ViewUtils.f(this.f66601b, 12.0f);
        } else {
            this.tv_long_desc.setVisibility(0);
            this.tv_long_desc.setText(hashtag.getLong_desc());
            ((ViewGroup.MarginLayoutParams) this.tv_desc.getLayoutParams()).topMargin = ViewUtils.f(this.f66601b, 5.0f);
        }
        if (this.mCommonTabLayout.getTabCount() == 0 && !com.max.hbcommon.utils.c.w(hashtagLinkListResultObj.getSort_filter())) {
            List<KeyDescObj> sort_filter = hashtagLinkListResultObj.getSort_filter();
            this.V = sort_filter;
            if (sort_filter.size() == 1) {
                this.mCommonTabLayout.setVisibility(8);
            } else {
                this.mCommonTabLayout.setVisibility(0);
            }
            for (KeyDescObj keyDescObj : hashtagLinkListResultObj.getSort_filter()) {
                TabLayout tabLayout = this.mCommonTabLayout;
                tabLayout.i(tabLayout.I().D(keyDescObj.getText()));
            }
            this.mCommonTabLayout.h(new c());
        }
        D2(hashtagLinkListResultObj.getMore_inspiration_info());
        E2(hashtagLinkListResultObj.getRelated_act_info());
    }

    private void D2(final HashtagLinkListResultObj.MoreInspirationInfoObj moreInspirationInfoObj) {
        if (PatchProxy.proxy(new Object[]{moreInspirationInfoObj}, this, changeQuickRedirect, false, 26479, new Class[]{HashtagLinkListResultObj.MoreInspirationInfoObj.class}, Void.TYPE).isSupported || moreInspirationInfoObj == null) {
            return;
        }
        this.L.f114351i.setBackground(com.max.hbutils.utils.q.o(this, R.color.white_alpha10, 3.0f));
        this.L.f114351i.setVisibility(0);
        this.L.f114351i.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83213b.I2(moreInspirationInfoObj, view);
            }
        });
        this.L.f114350h.setVisibility(0);
        this.L.f114352j.setVisibility(0);
        this.L.f114352j.setText(moreInspirationInfoObj.getButton_text());
    }

    private void E2(final HashtagLinkListResultObj.RelatedActInfoObj relatedActInfoObj) {
        if (PatchProxy.proxy(new Object[]{relatedActInfoObj}, this, changeQuickRedirect, false, 26478, new Class[]{HashtagLinkListResultObj.RelatedActInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (relatedActInfoObj == null) {
            this.L.f114354l.setVisibility(8);
            return;
        }
        this.L.f114354l.setVisibility(0);
        this.L.f114354l.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.bbs.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83250b.J2(relatedActInfoObj, view);
            }
        });
        Typeface typefaceA = com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c);
        this.L.f114355m.setBackground(com.max.hbutils.utils.q.o(this, R.color.divider_secondary_1_color, 5.0f));
        this.L.f114358p.setTypeface(typefaceA);
        this.L.f114358p.setText(relatedActInfoObj.getTitle());
        this.L.f114357o.setBackground(com.max.hbutils.utils.q.o(this, R.color.click_blue_alpha10, 2.0f));
        this.L.f114357o.setText(relatedActInfoObj.getLabel_text());
        if (relatedActInfoObj.getDesc() == null || relatedActInfoObj.getDesc().isEmpty()) {
            this.L.f114356n.setVisibility(8);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.H(this.L.f114354l);
            cVar.L(this.L.f114358p.getId(), 6, this.L.f114355m.getId(), 6, ViewUtils.f(this.f66601b, 10.0f));
            cVar.L(this.L.f114358p.getId(), 3, this.L.f114355m.getId(), 3, 0);
            cVar.L(this.L.f114358p.getId(), 4, this.L.f114355m.getId(), 4, 0);
            cVar.r(this.L.f114354l);
        } else {
            this.L.f114356n.setVisibility(0);
            this.L.f114356n.setText(relatedActInfoObj.getDesc());
        }
        this.L.f114359q.setTypeface(typefaceA);
    }

    private void G2(HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagLinkListResultObj}, this, changeQuickRedirect, false, 26483, new Class[]{HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.M = hashtagLinkListResultObj != null && "1".equals(hashtagLinkListResultObj.getUse_waterfall_style());
        this.W = new h(getSupportFragmentManager(), hashtagLinkListResultObj);
        this.viewPager.setOffscreenPageLimit(8);
        this.viewPager.setAdapter(this.W);
        this.viewPager.c(new TabLayout.l(this.mCommonTabLayout));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(HashtagLinkListResultObj.ShareInfoObj shareInfoObj, View view) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj, view}, this, changeQuickRedirect, false, 26489, new Class[]{HashtagLinkListResultObj.ShareInfoObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbshare.d.E(this.f66601b, new HBShareData(false, true, shareInfoObj.getTitle(), shareInfoObj.getDesc(), shareInfoObj.getUrl(), null, new UMImage(this.f66601b, shareInfoObj.getImg()), new com.max.hbshare.c.b(com.max.hbshare.c.f72570z, this.f79871a0, A2())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2(HashtagLinkListResultObj.MoreInspirationInfoObj moreInspirationInfoObj, View view) {
        if (PatchProxy.proxy(new Object[]{moreInspirationInfoObj, view}, this, changeQuickRedirect, false, 26490, new Class[]{HashtagLinkListResultObj.MoreInspirationInfoObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.j0(this, moreInspirationInfoObj.getProtocol());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J2(HashtagLinkListResultObj.RelatedActInfoObj relatedActInfoObj, View view) {
        if (PatchProxy.proxy(new Object[]{relatedActInfoObj, view}, this, changeQuickRedirect, false, 26491, new Class[]{HashtagLinkListResultObj.RelatedActInfoObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.j0(this, relatedActInfoObj.getProtocol());
    }

    private Map<String, String> K2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26481, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        String str = this.Q;
        if (str != null && !str.isEmpty()) {
            try {
                HashMap map2 = (HashMap) com.max.hbutils.utils.k.a(this.Q, HashMap.class);
                if (map2 == null) {
                    return map;
                }
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        map.put(entry.getKey().toString(), entry.getValue().toString());
                    }
                }
            } catch (Exception e10) {
                com.max.heybox.hblog.g.G("[HashtagDetailActivity#retrieveExtraParam] json resolve fail, cause: " + e10);
            }
        }
        return map;
    }

    static /* synthetic */ void R1(HashtagDetailActivity hashtagDetailActivity) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailActivity}, null, changeQuickRedirect, true, 26496, new Class[]{HashtagDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailActivity.C1();
    }

    static /* synthetic */ int e2(HashtagDetailActivity hashtagDetailActivity) {
        int i10 = hashtagDetailActivity.U;
        hashtagDetailActivity.U = i10 + 1;
        return i10;
    }

    static /* synthetic */ void j2(HashtagDetailActivity hashtagDetailActivity) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailActivity}, null, changeQuickRedirect, true, 26492, new Class[]{HashtagDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailActivity.C1();
    }

    static /* synthetic */ void p2(HashtagDetailActivity hashtagDetailActivity, HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailActivity, hashtagLinkListResultObj}, null, changeQuickRedirect, true, 26493, new Class[]{HashtagDetailActivity.class, HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailActivity.B2(hashtagLinkListResultObj);
    }

    static /* synthetic */ void q2(HashtagDetailActivity hashtagDetailActivity, HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailActivity, hashtagLinkListResultObj}, null, changeQuickRedirect, true, 26494, new Class[]{HashtagDetailActivity.class, HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailActivity.C2(hashtagLinkListResultObj);
    }

    static /* synthetic */ void r2(HashtagDetailActivity hashtagDetailActivity, HashtagLinkListResultObj hashtagLinkListResultObj) {
        if (PatchProxy.proxy(new Object[]{hashtagDetailActivity, hashtagLinkListResultObj}, null, changeQuickRedirect, true, 26495, new Class[]{HashtagDetailActivity.class, HashtagLinkListResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        hashtagDetailActivity.G2(hashtagLinkListResultObj);
    }

    @SuppressLint({"AutoDispose"})
    private void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26480, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N = getIntent().getStringExtra("tag");
        this.O = getIntent().getStringExtra("hashtag_id");
        this.P = getIntent().getStringExtra("quick_from");
        this.Q = getIntent().getStringExtra("extra_params");
        this.R = getIntent().getStringExtra("h_src");
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.O;
        String str2 = this.N;
        KeyDescObj keyDescObj = this.T;
        V((io.reactivex.disposables.b) eVarA.ka(str, str2, keyDescObj != null ? keyDescObj.getKey() : null, null, 0, 30, this.P, K2(), this.Z ? 1 : 0).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    public static Intent x2(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 26471, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) HashtagDetailActivity.class);
        intent.putExtra("tag", str);
        return intent;
    }

    public static Intent y2(Context context, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2}, null, changeQuickRedirect, true, 26472, new Class[]{Context.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) HashtagDetailActivity.class);
        intent.putExtra("tag", str);
        intent.putExtra("hashtag_id", str2);
        return intent;
    }

    public static Intent z2(Context context, String str, String str2, String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str, str2, str3}, null, changeQuickRedirect, true, 26473, new Class[]{Context.class, String.class, String.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) HashtagDetailActivity.class);
        intent.putExtra("tag", str);
        intent.putExtra("hashtag_id", str2);
        intent.putExtra("quick_from", str3);
        return intent;
    }

    public JsonObject A2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26488, new Class[0], JsonObject.class);
        if (patchProxyResultProxy.isSupported) {
            return (JsonObject) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("tag", this.N);
        jsonObject.addProperty("tag_id", this.O);
        jsonObject.addProperty("h_src", this.R);
        jsonObject.addProperty("use_waterfall_style", this.M ? "1" : "0");
        return jsonObject;
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void c(AbsVideoView absVideoView, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{absVideoView, viewGroup}, this, changeQuickRedirect, false, 26485, new Class[]{AbsVideoView.class, ViewGroup.class}, Void.TYPE).isSupported || absVideoView == null) {
            return;
        }
        VideoPlayerManager.f76079a.w(this, absVideoView, viewGroup, 0);
    }

    @Override // com.max.xiaoheihe.module.video.b
    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26486, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoPlayerManager.f76079a.e(this);
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26487, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : A2().toString();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26474, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        u2();
        this.L = df.p0.c(this.f66602c);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26476, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26475, new Class[0], Void.TYPE).isSupported && VideoPlayerManager.f76079a.c(this) == null) {
            super.onBackPressed();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.HashtagDetailContentFragment.e
    public void r0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26484, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
    }

    @Override // com.max.xiaoheihe.module.bbs.HashtagDetailContentFragment.e
    public void t(boolean z10) {
    }

    @androidx.annotation.p0
    public HashtagLinkListResultObj v2() {
        return this.X;
    }
}
