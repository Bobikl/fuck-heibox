package com.max.hbcommon.base;

import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseFragment.java */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class d extends Fragment implements f, com.max.hbcommon.analytics.d.f, com.max.hbcommon.analytics.f, com.max.hbcommon.base.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PathSrcNode clickSrcInfo;
    private io.reactivex.disposables.a mCompositeDisposable;
    protected FrameLayout mContainer;
    protected View mContentView;
    protected Activity mContext;
    private View mEmptyView;
    private View mErrorView;
    protected l3.c mFragmentBinding;
    protected LayoutInflater mInflater;
    protected boolean mIsVisible;
    private View mLoadingView;
    private View mNoNetworkView;
    protected View.OnClickListener mOnRetryClickListener;
    private String mScreenAlias;
    protected TitleBar mTitleBar;
    protected View mTitleBarDivider;
    private View mTopLoadingView;
    public Unbinder mUnBinder;
    private List<ValueAnimator> mValueAnimatorList;
    protected ViewGroup mVgBaseFragmentView;
    protected boolean mViewAvailable;
    private int mViewStatus;
    protected com.max.hbcommon.analytics.j reporter;
    protected View rootView;
    protected ViewGroup vg_title;
    private int mEmptyViewResId = R.layout.empty_view;
    private int mErrorViewResId = R.layout.error_view;
    private int mLoadingViewResId = R.layout.loading_view;
    private final int mTopLoadingViewResId = R.layout.loading_view_top;
    private int mNoNetworkViewResId = R.layout.no_network_view;
    private final ViewGroup.LayoutParams mLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    protected boolean mIsPrepared = false;
    protected boolean mIsFirst = true;
    protected boolean mFragmentHidden = true;
    private final boolean mIsScreen = true;
    protected boolean backIconInvisible = false;
    protected boolean isInFragmentStack = false;
    private boolean ignorePageEvent = false;
    private boolean isVisited = false;
    private int topPadding = 0;

    /* JADX INFO: compiled from: BaseFragment.java */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.aw, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            d.this.onRefresh();
        }
    }

    private void clearViewsCache(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.mv, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                clearViewsCache(viewGroup.getChildAt(i10));
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

    private boolean isParentHidden() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.qv, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (Fragment parentFragment = getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment.isHidden() || !parentFragment.getUserVisibleHint()) {
                return true;
            }
        }
        return false;
    }

    private void notifyStatusChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Iv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View view = this.mLoadingView;
        if (view != null) {
            view.setVisibility(i10 == 1 ? 0 : 8);
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) this.mLoadingView.findViewById(R.id.img_progress);
            if (circularProgressIndicator != null) {
                if (i10 == 1) {
                    circularProgressIndicator.p();
                } else {
                    circularProgressIndicator.j();
                }
            }
        }
        View view2 = this.mTopLoadingView;
        if (view2 != null) {
            view2.setVisibility(i10 == 1 ? 0 : 8);
            CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) this.mTopLoadingView.findViewById(R.id.img_progress);
            if (circularProgressIndicator2 != null) {
                if (i10 == 1) {
                    circularProgressIndicator2.p();
                } else {
                    circularProgressIndicator2.j();
                }
            }
        }
        View view3 = this.mEmptyView;
        if (view3 != null) {
            view3.setVisibility(i10 == 2 ? 0 : 8);
        }
        View view4 = this.mErrorView;
        if (view4 != null) {
            view4.setVisibility(i10 == 3 ? 0 : 8);
            this.mErrorView.bringToFront();
        }
        View view5 = this.mNoNetworkView;
        if (view5 != null) {
            view5.setVisibility(i10 == 4 ? 0 : 8);
        }
        if (i10 != 3 || this.topPadding <= 0) {
            View view6 = this.mContentView;
            if (view6 != null) {
                view6.setVisibility(i10 != 0 ? 8 : 0);
                return;
            }
            return;
        }
        View view7 = this.mContentView;
        if (view7 != null) {
            view7.setVisibility(0);
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String H() {
        return com.max.hbcommon.analytics.e.a(this);
    }

    public void addDisposable(io.reactivex.disposables.b bVar) {
        if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.b.Kv, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new io.reactivex.disposables.a();
        }
        this.mCompositeDisposable.c(bVar);
    }

    @Override // com.max.hbcommon.base.a
    public void addValueAnimator(ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, 1805, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.mValueAnimatorList == null) {
            this.mValueAnimatorList = new ArrayList();
        }
        this.mValueAnimatorList.add(valueAnimator);
    }

    public void clearCompositeDisposable() {
        io.reactivex.disposables.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Lv, new Class[0], Void.TYPE).isSupported || (aVar = this.mCompositeDisposable) == null) {
            return;
        }
        aVar.f();
    }

    public void clearValueAnimator() {
        List<ValueAnimator> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1806, new Class[0], Void.TYPE).isSupported || (list = this.mValueAnimatorList) == null) {
            return;
        }
        for (ValueAnimator valueAnimator : list) {
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
        }
        this.mValueAnimatorList.clear();
        this.mValueAnimatorList = null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean d2() {
        return com.max.hbcommon.analytics.e.c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.max.hbcommon.analytics.f
    public void dispatchUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.Zv, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            onFragmentShow();
        } else {
            onFragmentHide();
        }
        if (isAdded()) {
            List<Fragment> listJ0 = getChildFragmentManager().J0();
            if (com.max.hbcommon.utils.c.w(listJ0)) {
                return;
            }
            for (Fragment fragment : listJ0) {
                if ((fragment instanceof com.max.hbcommon.analytics.f) && fragment.getUserVisibleHint()) {
                    ((com.max.hbcommon.analytics.f) fragment).dispatchUserVisibleHint(z10);
                }
            }
        }
    }

    public <T extends View> T findViewById(@d0 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.lv, new Class[]{Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.mContainer;
        if (frameLayout == null) {
            return null;
        }
        return (T) frameLayout.findViewById(i10);
    }

    public f getBaseView() {
        return this;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @p0
    public PathSrcNode getClickSrc() {
        return this.clickSrcInfo;
    }

    public io.reactivex.disposables.a getCompositeDisposable() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Jv, new Class[0], io.reactivex.disposables.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.a) patchProxyResultProxy.result;
        }
        if (this.mCompositeDisposable == null) {
            this.mCompositeDisposable = new io.reactivex.disposables.a();
        }
        return this.mCompositeDisposable;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public View getEmptyView() {
        return this.mEmptyView;
    }

    public View getErrorView() {
        return this.mErrorView;
    }

    public View getLoadingView() {
        return this.mLoadingView;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @p0
    public String getPageAdditional() {
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @p0
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Xv, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbcommon.analytics.d.r(getClass());
    }

    public TitleBar getTitleBar() {
        return this.mTitleBar;
    }

    public List<ValueAnimator> getValueAnimatorList() {
        return this.mValueAnimatorList;
    }

    public ViewGroup getVgBaseFragmentView() {
        return this.mVgBaseFragmentView;
    }

    @Override // com.max.hbcommon.base.f
    public Context getViewContext() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Wv, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : getContext();
    }

    public int getViewStatus() {
        return this.mViewStatus;
    }

    public String getmScreenAlias() {
        return this.mScreenAlias;
    }

    public void initBaseData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.dv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mVgBaseFragmentView = (ViewGroup) this.rootView.findViewById(R.id.vg_base_fragment);
        this.mContainer = (FrameLayout) this.rootView.findViewById(R.id.multi_status_view_container);
        this.vg_title = (ViewGroup) this.rootView.findViewById(R.id.vg_title);
        this.mTitleBar = (TitleBar) this.rootView.findViewById(R.id.tb_title);
        this.mTitleBarDivider = this.rootView.findViewById(R.id.title_bar_divider);
        this.mOnRetryClickListener = new a();
    }

    public void initData() {
    }

    public void installViews(View view) {
        com.max.heybox.hblog.g gVarS;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.b.kv, new Class[]{View.class}, Void.TYPE).isSupported || (gVarS = com.max.heybox.hblog.g.S()) == null) {
            return;
        }
        gVarS.a0("Fragment_installViews :  " + getClass().getSimpleName());
    }

    @Override // com.max.hbcommon.base.f
    public boolean isActive() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Vv, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return isAdded() && this.mViewAvailable;
    }

    public boolean isLoading() {
        return this.mViewStatus == 1;
    }

    public boolean isNotPage() {
        return false;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public boolean isPageVisited() {
        return this.isVisited;
    }

    public boolean isScreenFragment() {
        return true;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void l1(View view) {
        com.max.hbcommon.analytics.e.f(this, view);
    }

    public void loadData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.sv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_loadData :  " + getClass().getSimpleName() + "  mIsPrepared: " + this.mIsPrepared + "  mIsVisible: " + this.mIsVisible + "  mIsFirst: " + this.mIsFirst);
        }
        if (this.mIsPrepared && this.mIsVisible && this.mIsFirst) {
            initData();
            this.mIsFirst = false;
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean o3() {
        return com.max.hbcommon.analytics.e.d(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.b.cv, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_onActivityCreated :  " + getClass().getSimpleName());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.b.Xu, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_onAttach :  " + getClass().getSimpleName());
        }
        this.mContext = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.b.Zu, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.b.av, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_OnCreateView :  " + getClass().getSimpleName() + ", savedInstanceState = " + bundle);
        }
        if (shouldKeepViewOnDestroyView() && (view = this.rootView) != null) {
            return view;
        }
        this.rootView = layoutInflater.inflate(R.layout.fragment_base, viewGroup, false);
        this.mInflater = layoutInflater;
        initBaseData();
        installViews(this.rootView);
        this.mViewAvailable = true;
        registerEvents();
        onRegisterReceiver();
        this.reporter = new com.max.hbcommon.analytics.j(this, bundle != null);
        com.max.hbcommon.analytics.d.z(this, this.rootView, bundle);
        if (this.isInFragmentStack) {
            this.mTitleBar.setInStack();
        }
        if (this.backIconInvisible) {
            this.mTitleBar.setBackIconInvisible();
            this.mTitleBar.getAppbarNavButtonView().setVisibility(4);
        }
        return this.rootView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Uv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroy();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_Destroy :  " + getClass().getSimpleName());
        }
        com.max.hbcommon.analytics.j jVar = this.reporter;
        if (jVar != null) {
            jVar.d();
        }
        if (shouldKeepViewOnDestroyView()) {
            onUnRegisterReceiver();
            this.mIsFirst = true;
            this.mIsPrepared = false;
            this.mViewAvailable = false;
            this.mContentView = null;
            this.mEmptyView = null;
            this.mErrorView = null;
            this.mLoadingView = null;
            this.mNoNetworkView = null;
            this.rootView = null;
            Unbinder unbinder = this.mUnBinder;
            if (unbinder != null) {
                unbinder.a();
            }
            this.mFragmentBinding = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Tv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        boolean zShouldKeepViewOnDestroyView = shouldKeepViewOnDestroyView();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_OnDestroyView :  " + this + getClass().getSimpleName() + ", shouldKeepViewOnDestroyView = " + zShouldKeepViewOnDestroyView);
        }
        clearCompositeDisposable();
        clearValueAnimator();
        if (zShouldKeepViewOnDestroyView) {
            return;
        }
        onUnRegisterReceiver();
        this.mIsFirst = true;
        this.mIsPrepared = false;
        this.mViewAvailable = false;
        this.mContentView = null;
        this.mEmptyView = null;
        this.mErrorView = null;
        this.mLoadingView = null;
        this.mNoNetworkView = null;
        this.rootView = null;
        Unbinder unbinder = this.mUnBinder;
        if (unbinder != null) {
            unbinder.a();
        }
        this.mFragmentBinding = null;
        clearViewsCache(getView());
        Activity activity = this.mContext;
        if (activity != null) {
            Glide.e(activity).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Yu, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_onDetach :  " + this + getClass().getSimpleName());
        }
        super.onDetach();
        this.mContext = null;
    }

    public void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.pv, new Class[0], Void.TYPE).isSupported || this.mFragmentHidden) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_OnFragmentHide :  " + getClass().getSimpleName());
        }
        this.mFragmentHidden = true;
        com.max.hbcommon.analytics.j jVar = this.reporter;
        if (jVar != null) {
            jVar.e();
        }
    }

    public void onFragmentShow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ov, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.ignorePageEvent) {
            this.ignorePageEvent = false;
            return;
        }
        if (this.mFragmentHidden) {
            com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
            if (gVarS != null) {
                gVarS.a0("Fragment_OnFragmentShow :  " + getClass().getSimpleName());
            }
            this.mFragmentHidden = false;
            com.max.hbcommon.analytics.j jVar = this.reporter;
            if (jVar != null) {
                jVar.f();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.bv, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (getUserVisibleHint()) {
            if (z10) {
                onFragmentHide();
            } else if (!isParentHidden()) {
                onFragmentShow();
            }
        }
        com.max.hbcommon.utils.d.b("zzzzfragmentpage", getClass().getSimpleName() + "  onHiddenChanged  " + z10);
    }

    public void onInvisible() {
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void onPageVisitSuccess() {
        com.max.hbcommon.analytics.j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Yv, new Class[0], Void.TYPE).isSupported || (jVar = this.reporter) == null) {
            return;
        }
        jVar.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.gv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_OnPause :  " + getClass().getSimpleName());
        }
        onFragmentHide();
    }

    public void onRefresh() {
    }

    public void onRegisterReceiver() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.fv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_OnResume :  " + getClass().getSimpleName());
        }
        if (isHidden() || isParentHidden() || !getUserVisibleHint()) {
            return;
        }
        onFragmentShow();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ev, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_onStart :  " + getClass().getSimpleName());
        }
        com.max.hbcommon.analytics.j jVar = this.reporter;
        if (jVar != null) {
            jVar.g();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.hv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_onStop :  " + getClass().getSimpleName());
        }
        com.max.hbcommon.analytics.j jVar = this.reporter;
        if (jVar != null) {
            jVar.h();
        }
        super.onStop();
    }

    public void onUnRegisterReceiver() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@n0 View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 1811, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        com.max.heybox.hblog.g gVarS = com.max.heybox.hblog.g.S();
        if (gVarS != null) {
            gVarS.a0("Fragment_OnViewCreated :  " + getClass().getSimpleName());
        }
        this.mIsPrepared = true;
        loadData();
    }

    public void onVisible() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.rv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        loadData();
    }

    public void registerEvents() {
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (PatchProxy.proxy(new Object[]{broadcastReceiver, intentFilter}, this, changeQuickRedirect, false, 1808, new Class[]{BroadcastReceiver.class, IntentFilter.class}, Void.TYPE).isSupported || broadcastReceiver == null || intentFilter == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.mContext.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            this.mContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, String str) {
        if (PatchProxy.proxy(new Object[]{broadcastReceiver, str}, this, changeQuickRedirect, false, 1807, new Class[]{BroadcastReceiver.class, String.class}, Void.TYPE).isSupported || broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(str);
        if (Build.VERSION.SDK_INT >= 26) {
            this.mContext.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            this.mContext.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public void replaceTitlebar(View view, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.proxy(new Object[]{view, layoutParams}, this, changeQuickRedirect, false, 1810, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE).isSupported) {
            return;
        }
        int iIndexOfChild = this.vg_title.indexOfChild(this.mTitleBar);
        this.vg_title.removeView(this.mTitleBar);
        this.vg_title.addView(view, iIndexOfChild, layoutParams);
    }

    public void setBackIconInvisible() {
        this.backIconInvisible = true;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setClickSrc(@p0 PathSrcNode pathSrcNode) {
        this.clickSrcInfo = pathSrcNode;
    }

    public void setContentView(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.iv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.mInflater.inflate(i10, (ViewGroup) null);
        this.mContentView = viewInflate;
        this.mContainer.addView(viewInflate, 0, this.mLayoutParams);
    }

    public void setContentView(l3.c cVar) {
        if (PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.b.jv, new Class[]{l3.c.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mFragmentBinding = cVar;
        View root = cVar.getRoot();
        this.mContentView = root;
        this.mContainer.addView(root, 0, this.mLayoutParams);
    }

    public void setIgnorePageEvent(boolean z10) {
        this.ignorePageEvent = z10;
    }

    public void setInFragmentStack(boolean z10) {
        this.isInFragmentStack = z10;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setPageVisited(boolean z10) {
        this.isVisited = z10;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.b.nv, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setUserVisibleHint(z10);
        com.max.hbcommon.utils.d.b("zzzzfragmentpage", getClass().getSimpleName() + "  setUserVisibleHint  " + z10);
        dispatchUserVisibleHint(isResumed() && z10);
        if (getUserVisibleHint()) {
            this.mIsVisible = true;
            onVisible();
        } else {
            this.mIsVisible = false;
            onInvisible();
        }
    }

    public void setmScreenAlias(String str) {
        this.mScreenAlias = str;
    }

    public boolean shouldKeepViewOnDestroyView() {
        return this.mContext instanceof n;
    }

    public final void showContentView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.tv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mViewStatus = 0;
        notifyStatusChanged(0);
    }

    public final void showEmpty() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Av, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mViewStatus = 2;
        if (this.mEmptyView == null) {
            View viewInflate = this.mInflater.inflate(this.mEmptyViewResId, (ViewGroup) null);
            this.mEmptyView = viewInflate;
            this.mContainer.addView(viewInflate, 0, this.mLayoutParams);
        }
        notifyStatusChanged(this.mViewStatus);
    }

    public final void showEmpty(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.zv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mEmptyViewResId = i10;
        showEmpty();
    }

    public final void showEmpty(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Cv, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        showEmpty(i10, com.max.hbcommon.utils.l.e(i11));
    }

    public final void showEmpty(int i10, String str) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.b.Bv, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mViewStatus = 2;
        if (this.mEmptyView == null) {
            View viewInflate = this.mInflater.inflate(this.mEmptyViewResId, (ViewGroup) null);
            this.mEmptyView = viewInflate;
            this.mContainer.addView(viewInflate, 0, this.mLayoutParams);
        }
        ImageView imageView = (ImageView) this.mEmptyView.findViewById(R.id.iv_empty);
        TextView textView = (TextView) this.mEmptyView.findViewById(R.id.tv_empty);
        imageView.setImageResource(i10);
        textView.setText(str);
        notifyStatusChanged(this.mViewStatus);
    }

    public final void showError() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Ev, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showErrorWithTopPadding(0);
    }

    public final void showError(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Dv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mErrorViewResId = i10;
        showError();
    }

    public final void showErrorWithTopPadding(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Fv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.topPadding = i10;
        this.mViewStatus = 3;
        if (this.mErrorView == null) {
            View viewInflate = this.mInflater.inflate(this.mErrorViewResId, (ViewGroup) null);
            this.mErrorView = viewInflate;
            View viewFindViewById = viewInflate.findViewById(R.id.error_content);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(this.mOnRetryClickListener);
            } else {
                this.mErrorView.setOnClickListener(this.mOnRetryClickListener);
            }
            this.mContainer.addView(this.mErrorView, 0, this.mLayoutParams);
            View viewFindViewById2 = this.mErrorView.findViewById(R.id.top_view);
            if (viewFindViewById2 != null) {
                viewFindViewById2.getLayoutParams().height = i10;
            }
        }
        com.max.hbcommon.analytics.j jVar = this.reporter;
        if (jVar != null) {
            jVar.i();
        }
        notifyStatusChanged(this.mViewStatus);
    }

    public final void showLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.vv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading((String) null);
    }

    public final void showLoading(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.uv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mLoadingViewResId = i10;
        showLoading();
    }

    public final void showLoading(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.yv, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mViewStatus = 1;
        if (this.mLoadingView == null) {
            View viewInflate = this.mInflater.inflate(this.mLoadingViewResId, (ViewGroup) null);
            this.mLoadingView = viewInflate;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.img_progress);
            TextView textView = (TextView) this.mLoadingView.findViewById(R.id.tv_loading_description);
            if (circularProgressIndicator != null) {
                circularProgressIndicator.p();
            }
            if (textView != null && !com.max.hbcommon.utils.c.u(str)) {
                textView.setText(str);
            }
            this.mContainer.addView(this.mLoadingView, 0, this.mLayoutParams);
        }
        notifyStatusChanged(this.mViewStatus);
    }

    public final void showNoNetwork() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Hv, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mViewStatus = 4;
        if (this.mNoNetworkView == null) {
            View viewInflate = this.mInflater.inflate(this.mNoNetworkViewResId, (ViewGroup) null);
            this.mNoNetworkView = viewInflate;
            viewInflate.setOnClickListener(this.mOnRetryClickListener);
            this.mContainer.addView(this.mNoNetworkView, 0, this.mLayoutParams);
        }
        notifyStatusChanged(this.mViewStatus);
    }

    public final void showNoNetwork(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Gv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mNoNetworkViewResId = i10;
        showNoNetwork();
    }

    public final void showTopLoading(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.wv, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        showTopLoading(null, i10);
    }

    public final void showTopLoading(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.xv, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mViewStatus = 1;
        if (this.mTopLoadingView == null) {
            View viewInflate = this.mInflater.inflate(this.mTopLoadingViewResId, (ViewGroup) null);
            this.mTopLoadingView = viewInflate;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) viewInflate.findViewById(R.id.img_progress);
            TextView textView = (TextView) this.mTopLoadingView.findViewById(R.id.tv_loading_description);
            if (circularProgressIndicator != null) {
                circularProgressIndicator.p();
            }
            if (textView != null && !com.max.hbcommon.utils.c.u(str)) {
                textView.setText(str);
            }
            this.mContainer.addView(viewInflate, 0, this.mLayoutParams);
        }
        View viewFindViewById = this.mTopLoadingView.findViewById(R.id.top_space);
        if (viewFindViewById != null) {
            viewFindViewById.getLayoutParams().height = Math.max(0, ViewUtils.f(viewFindViewById.getContext(), i10));
            viewFindViewById.requestLayout();
        }
        notifyStatusChanged(this.mViewStatus);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        if (PatchProxy.proxy(new Object[]{broadcastReceiver}, this, changeQuickRedirect, false, bb.c.b.Qv, new Class[]{BroadcastReceiver.class}, Void.TYPE).isSupported || broadcastReceiver == null) {
            return;
        }
        try {
            this.mContext.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String v3() {
        return com.max.hbcommon.analytics.e.b(this);
    }
}
