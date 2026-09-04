package com.max.xiaoheihe.module.game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.TitleBar;
import com.max.hbshare.bean.HBShareData;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameCompilationDetailObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationDetailFragment extends com.max.hbcommon.base.d implements GameCompilationGameListFragment.f {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f84171j = "game_header";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameListHeaderObj f84172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GameCompilationDetailObj f84173c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.viewpager.widget.a f84176f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f84178h;

    @BindView(R.id.abl)
    AppBarLayout mAppBarLayout;

    @BindView(R.id.iv_bg_img)
    ImageView mBGImageView;

    @BindView(R.id.ctl)
    CollapsingToolbarLayout mCollapsingToolbarLayout;

    @BindView(R.id.tl_sort)
    SlidingTabLayout mSortSlidingTabLayout;

    @BindView(R.id.vg_sort)
    View mSortView;

    @BindView(R.id.toolbar)
    TitleBar mToolbar;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f84174d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<Fragment> f84175e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<KeyDescObj> f84177g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.max.hbshare.c.b f84179i = new com.max.hbshare.c.b(com.max.hbshare.c.f72553i, new e());

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32635, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameCompilationDetailFragment.this.S3();
        }
    }

    public class b implements AppBarLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f84181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f84182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f84183c;

        b(ImageView imageView, int i10, int i11) {
            this.f84181a = imageView;
            this.f84182b = i10;
            this.f84183c = i11;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.f, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            if (PatchProxy.proxy(new Object[]{appBarLayout, new Integer(i10)}, this, changeQuickRedirect, false, 32636, new Class[]{AppBarLayout.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (Math.abs(i10) >= appBarLayout.getTotalScrollRange()) {
                if (GameCompilationDetailFragment.this.f84174d) {
                    GameCompilationDetailFragment.this.mToolbar.getAppbarTitleTextView().setAlpha(1.0f);
                    this.f84181a.setVisibility(8);
                    GameCompilationDetailFragment.this.mToolbar.getAppbarNavButtonView().setColorFilter(this.f84182b);
                    GameCompilationDetailFragment.this.mToolbar.getAppbarActionButtonView().setColorFilter(this.f84182b);
                }
                GameCompilationDetailFragment.this.f84174d = false;
                return;
            }
            if (GameCompilationDetailFragment.this.f84174d) {
                return;
            }
            GameCompilationDetailFragment.this.mToolbar.getAppbarTitleTextView().setAlpha(0.0f);
            this.f84181a.setVisibility(0);
            GameCompilationDetailFragment.this.mToolbar.getAppbarNavButtonView().setColorFilter(this.f84183c);
            GameCompilationDetailFragment.this.mToolbar.getAppbarActionButtonView().setColorFilter(this.f84183c);
            GameCompilationDetailFragment.this.f84174d = true;
        }
    }

    public class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32637, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 >= 0 && i10 < GameCompilationDetailFragment.this.f84177g.size()) {
                ((KeyDescObj) GameCompilationDetailFragment.this.f84177g.get(i10)).getKey();
            }
        }
    }

    public class d extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32639, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : GameCompilationDetailFragment.this.f84175e.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32638, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) GameCompilationDetailFragment.this.f84175e.get(i10);
        }
    }

    public class e implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 32641, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameCompilationDetailFragment.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 32640, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameCompilationDetailFragment.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    private String[] P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32632, new Class[0], String[].class);
        if (patchProxyResultProxy.isSupported) {
            return (String[]) patchProxyResultProxy.result;
        }
        String[] strArr = new String[this.f84177g.size()];
        for (int i10 = 0; i10 < this.f84177g.size(); i10++) {
            strArr[i10] = this.f84177g.get(i10).getText();
        }
        return strArr;
    }

    public static GameCompilationDetailFragment Q3(GameListHeaderObj gameListHeaderObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameListHeaderObj}, null, changeQuickRedirect, true, 32628, new Class[]{GameListHeaderObj.class}, GameCompilationDetailFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameCompilationDetailFragment) patchProxyResultProxy.result;
        }
        GameCompilationDetailFragment gameCompilationDetailFragment = new GameCompilationDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(f84171j, gameListHeaderObj);
        gameCompilationDetailFragment.setArguments(bundle);
        return gameCompilationDetailFragment;
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32631, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mToolbar.setTitle(this.f84173c.getTitle());
        if (com.max.hbcommon.utils.c.u(this.f84173c.getBg_img())) {
            this.mBGImageView.setBackgroundColor(this.f84178h);
        } else {
            com.max.hbimage.b.M(this.f84173c.getBg_img(), this.mBGImageView, 0, -1);
        }
    }

    public void S3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32633, new Class[0], Void.TYPE).isSupported || this.f84173c == null) {
            return;
        }
        com.max.hbshare.d.E(this.mContext, new HBShareData(false, true, this.f84173c.getShare_title(), this.f84173c.getShare_desc(), this.f84173c.getShare_url(), new Bundle(), !com.max.hbcommon.utils.c.u(this.f84173c.getShare_img()) ? new UMImage(this.mContext, this.f84173c.getShare_img()) : new UMImage(this.mContext, R.drawable.share_thumbnail), this.f84179i));
    }

    @Override // com.max.xiaoheihe.module.game.GameCompilationGameListFragment.f
    public void W1(GameCompilationDetailObj gameCompilationDetailObj) {
        if (PatchProxy.proxy(new Object[]{gameCompilationDetailObj}, this, changeQuickRedirect, false, 32630, new Class[]{GameCompilationDetailObj.class}, Void.TYPE).isSupported || !isActive() || gameCompilationDetailObj == null) {
            return;
        }
        this.f84173c = gameCompilationDetailObj;
        R3();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32629, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_game_compilation_detail);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f84172b = (GameListHeaderObj) getArguments().getSerializable(f84171j);
        }
        this.f84178h = this.mContext.getResources().getColor(R.color.white);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mToolbar.getLayoutParams();
        marginLayoutParams.topMargin = com.max.hbutils.utils.t.m(this.mContext);
        this.mToolbar.setLayoutParams(marginLayoutParams);
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.mCollapsingToolbarLayout.getLayoutParams();
        layoutParams.h(3);
        this.mCollapsingToolbarLayout.setLayoutParams(layoutParams);
        this.mCollapsingToolbarLayout.setContentScrimColor(this.f84178h);
        this.mToolbar.setVisibility(0);
        this.mToolbar.a0();
        this.mToolbar.getAppbarTitleTextView().setAlpha(0.0f);
        this.mToolbar.getAppbarActionButtonView().setColorFilter(this.mContext.getResources().getColor(R.color.white));
        this.mToolbar.setNavigationIcon(R.drawable.common_arrow_single_10x18);
        int iE = androidx.core.content.res.i.e(getResources(), R.color.white, null);
        int iE2 = androidx.core.content.res.i.e(getResources(), R.color.black, null);
        this.mToolbar.getAppbarNavButtonView().setColorFilter(iE);
        ImageView imageViewQ = TitleBar.Q(this.mContext, iE);
        this.mToolbar.setContentView(imageViewQ);
        this.mToolbar.setActionIcon(this.mContext.getResources().getDrawable(R.drawable.common_share));
        this.mToolbar.setTitleTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
        this.mToolbar.setActionIconOnClickListener(new a());
        com.max.hbutils.utils.t.h0(this.mContext.getWindow());
        com.max.hbutils.utils.t.N(this.mContext.getWindow(), true);
        this.mAppBarLayout.e(new b(imageViewQ, iE2, iE));
        this.mViewPager.h();
        this.mViewPager.c(new c());
        this.f84175e.clear();
        this.f84177g.clear();
        this.f84176f = new d(getChildFragmentManager());
        this.f84175e.add(GameCompilationGameListFragment.U3(this.f84172b));
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey("game_list");
        keyDescObj.setText("");
        this.f84177g.add(keyDescObj);
        this.mViewPager.setAdapter(this.f84176f);
        this.mSortSlidingTabLayout.setSaveEnabled(false);
        this.mSortSlidingTabLayout.setViewPager(this.mViewPager, P3());
        this.mSortView.setVisibility(8);
        GameCompilationDetailObj gameCompilationDetailObj = new GameCompilationDetailObj();
        this.f84173c = gameCompilationDetailObj;
        gameCompilationDetailObj.setBg_img(this.f84172b.getBg_img());
        this.f84173c.setTitle(this.f84172b.getTitle());
        this.f84173c.setDesc(this.f84172b.getDesc());
        R3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32634, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.mContext).onActivityResult(i10, i11, intent);
    }
}
