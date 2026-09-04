package com.max.xiaoheihe.module.account.mine;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.analytics.m;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.network.q;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.hbshare.bean.HBShareProtocolData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.AvatarDecorCategoriesObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.avatar.AvatarDecorListObj;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;

/* JADX INFO: loaded from: classes9.dex */
@m(path = lb.d.f131216n4)
@n9.a({com.max.hbminiprogram.d.class})
public class SetAvatarDecorFragment extends NativeLittleProgramFragment {
    public static final int A = 3;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f79034z = "ARG_SET_DECOR_SUCCESS";

    @BindView(R.id.avatar)
    HeyBoxAvatarView mAvatarView;

    @BindView(R.id.bottom_bar)
    View mBottomBarView;

    @BindView(R.id.comment)
    TextView mCommentTextView;

    @BindView(R.id.confirm)
    TextView mConfirmTextView;

    @BindView(R.id.avatar_decor_list_containers)
    LinearLayout mDecorListContainers;

    @BindView(R.id.ll_tab)
    LinearLayout mTabLinearLayout;

    @BindView(R.id.title_divider)
    View mTitleDividerView;

    @BindView(R.id.toolbar)
    TitleBar mToolbar;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i f79035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private LoadingDialog f79036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AvatarDecorationObj f79037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private KeyDescObj f79038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f79039t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private BroadcastReceiver f79040u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f79041v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected io.reactivex.disposables.b f79043x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f79042w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f79044y = false;

    public class AvatarDecorBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        AvatarDecorBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 25070, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.L.equals(intent.getAction())) {
                SetAvatarDecorFragment.R4(SetAvatarDecorFragment.this);
            }
        }
    }

    public class a implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 25063, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public void b(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 25062, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            if (bool.booleanValue()) {
                SetAvatarDecorFragment.this.f79036q.r();
            } else {
                SetAvatarDecorFragment.this.f79036q.c();
            }
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f79047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f79048c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LinearLayout f79049d;

        b(View view, List list, LinearLayout linearLayout) {
            this.f79047b = view;
            this.f79048c = list;
            this.f79049d = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25064, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            KeyDescObj keyDescObj = (KeyDescObj) this.f79047b.getTag();
            if (keyDescObj.isChecked()) {
                return;
            }
            com.max.xiaoheihe.utils.d.U1(this.f79048c, keyDescObj);
            SetAvatarDecorFragment.O4(SetAvatarDecorFragment.this, this.f79049d);
            SetAvatarDecorFragment.this.f79038s = keyDescObj;
            SetAvatarDecorFragment.R4(SetAvatarDecorFragment.this);
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<AvatarDecorCategoriesObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 25065, new Class[]{Throwable.class}, Void.TYPE).isSupported && SetAvatarDecorFragment.this.isActive()) {
                super.onError(th2);
                SetAvatarDecorFragment.this.f79036q.c();
                SetAvatarDecorFragment.S4(SetAvatarDecorFragment.this);
            }
        }

        public void onNext(Result<AvatarDecorCategoriesObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25066, new Class[]{Result.class}, Void.TYPE).isSupported && SetAvatarDecorFragment.this.isActive()) {
                super.onNext(result);
                SetAvatarDecorFragment.this.f79036q.c();
                SetAvatarDecorFragment.T4(SetAvatarDecorFragment.this);
                SetAvatarDecorFragment.U4(SetAvatarDecorFragment.this, result.getResult());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25067, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AvatarDecorCategoriesObj>) obj);
        }
    }

    public class d extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AvatarDecorationObj f79052b;

        d(AvatarDecorationObj avatarDecorationObj) {
            this.f79052b = avatarDecorationObj;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25068, new Class[]{Result.class}, Void.TYPE).isSupported && SetAvatarDecorFragment.this.isActive()) {
                super.onNext(result);
                SetAvatarDecorFragment.this.f79042w = true;
                Intent intent = new Intent();
                intent.putExtra(SetAvatarDecorFragment.f79034z, SetAvatarDecorFragment.this.f79042w);
                if (((com.max.hbcommon.base.d) SetAvatarDecorFragment.this).mContext != null) {
                    ((com.max.hbcommon.base.d) SetAvatarDecorFragment.this).mContext.setResult(-1, intent);
                }
                SetAvatarDecorFragment.P4(SetAvatarDecorFragment.this, this.f79052b);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25069, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    static /* synthetic */ void O4(SetAvatarDecorFragment setAvatarDecorFragment, LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{setAvatarDecorFragment, linearLayout}, null, changeQuickRedirect, true, 25056, new Class[]{SetAvatarDecorFragment.class, LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        setAvatarDecorFragment.j5(linearLayout);
    }

    static /* synthetic */ void P4(SetAvatarDecorFragment setAvatarDecorFragment, AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{setAvatarDecorFragment, avatarDecorationObj}, null, changeQuickRedirect, true, 25061, new Class[]{SetAvatarDecorFragment.class, AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        setAvatarDecorFragment.l5(avatarDecorationObj);
    }

    static /* synthetic */ void R4(SetAvatarDecorFragment setAvatarDecorFragment) {
        if (PatchProxy.proxy(new Object[]{setAvatarDecorFragment}, null, changeQuickRedirect, true, 25057, new Class[]{SetAvatarDecorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        setAvatarDecorFragment.a5();
    }

    static /* synthetic */ void S4(SetAvatarDecorFragment setAvatarDecorFragment) {
        if (PatchProxy.proxy(new Object[]{setAvatarDecorFragment}, null, changeQuickRedirect, true, 25058, new Class[]{SetAvatarDecorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        setAvatarDecorFragment.showError();
    }

    static /* synthetic */ void T4(SetAvatarDecorFragment setAvatarDecorFragment) {
        if (PatchProxy.proxy(new Object[]{setAvatarDecorFragment}, null, changeQuickRedirect, true, 25059, new Class[]{SetAvatarDecorFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        setAvatarDecorFragment.showContentView();
    }

    static /* synthetic */ void U4(SetAvatarDecorFragment setAvatarDecorFragment, AvatarDecorCategoriesObj avatarDecorCategoriesObj) {
        if (PatchProxy.proxy(new Object[]{setAvatarDecorFragment, avatarDecorCategoriesObj}, null, changeQuickRedirect, true, 25060, new Class[]{SetAvatarDecorFragment.class, AvatarDecorCategoriesObj.class}, Void.TYPE).isSupported) {
            return;
        }
        setAvatarDecorFragment.i5(avatarDecorCategoriesObj);
    }

    private AvatarDecorListContainer Z4(AvatarDecorListObj avatarDecorListObj, AvatarDecorationObj avatarDecorationObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarDecorListObj, avatarDecorationObj}, this, changeQuickRedirect, false, 25038, new Class[]{AvatarDecorListObj.class, AvatarDecorationObj.class}, AvatarDecorListContainer.class);
        if (patchProxyResultProxy.isSupported) {
            return (AvatarDecorListContainer) patchProxyResultProxy.result;
        }
        AvatarDecorListContainer avatarDecorListContainer = new AvatarDecorListContainer(this.mContext);
        avatarDecorListContainer.setAvatarDecorItemCheckedListener(new yh.l() { // from class: com.max.xiaoheihe.module.account.mine.d
            @Override // yh.l
            public final Object invoke(Object obj) {
                return this.f79061b.b5((AvatarDecorationObj) obj);
            }
        });
        avatarDecorListContainer.setRefreshDailyCallback(new yh.a() { // from class: com.max.xiaoheihe.module.account.mine.e
            @Override // yh.a
            public final Object invoke() {
                return this.f79062b.c5();
            }
        });
        avatarDecorListContainer.setData(avatarDecorListObj, avatarDecorationObj);
        return avatarDecorListContainer;
    }

    private void a5() {
        String key;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25045, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        io.reactivex.disposables.b bVar = this.f79043x;
        if (bVar != null) {
            bVar.dispose();
        }
        if (!isLoading()) {
            this.f79036q.r();
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        KeyDescObj keyDescObj = this.f79038s;
        if (keyDescObj != null) {
            key = keyDescObj.getKey();
        } else {
            key = this.f79041v;
            if (key == null) {
                key = null;
            }
        }
        io.reactivex.disposables.b bVar2 = (io.reactivex.disposables.b) eVarA.m6(key).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c());
        this.f79043x = bVar2;
        addDisposable(bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 b5(AvatarDecorationObj avatarDecorationObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 25055, new Class[]{AvatarDecorationObj.class}, b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        g5(avatarDecorationObj);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 c5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25054, new Class[0], b2.class);
        if (patchProxyResultProxy.isSupported) {
            return (b2) patchProxyResultProxy.result;
        }
        onRefresh();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e5(AvatarDecorationObj avatarDecorationObj, View view) {
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj, view}, this, changeQuickRedirect, false, 25053, new Class[]{AvatarDecorationObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.mall.h.k4(avatarDecorationObj, this.f79039t).M3(getChildFragmentManager(), "purchase");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f5(AvatarDecorationObj avatarDecorationObj, View view) {
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj, view}, this, changeQuickRedirect, false, 25052, new Class[]{AvatarDecorationObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        k5(avatarDecorationObj);
    }

    private void g5(final AvatarDecorationObj avatarDecorationObj) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 25041, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mAvatarView.setAvatarDecoration(avatarDecorationObj);
        int childCount = this.mDecorListContainers.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.mDecorListContainers.getChildAt(i10);
            if (childAt instanceof AvatarDecorListContainer) {
                ((AvatarDecorListContainer) childAt).k(avatarDecorationObj);
            }
        }
        if (avatarDecorationObj == null) {
            this.mBottomBarView.setVisibility(8);
            return;
        }
        this.mBottomBarView.setVisibility(0);
        this.mCommentTextView.setText(avatarDecorationObj.getComment());
        boolean zIsEnabled = avatarDecorationObj.isEnabled();
        boolean zIsIs_product = avatarDecorationObj.isIs_product();
        if (zIsEnabled && zIsIs_product && (keyDescObj = this.f79038s) != null && !AvatarDecorCategoriesObj.CATES_MINE.equals(keyDescObj.getKey())) {
            zIsEnabled = false;
        }
        if (zIsEnabled) {
            this.mConfirmTextView.setText(R.string.wearing);
            this.mConfirmTextView.setEnabled(false);
            this.mConfirmTextView.setClickable(false);
            this.mConfirmTextView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.mine.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetAvatarDecorFragment.d5(view);
                }
            });
            return;
        }
        if (zIsIs_product) {
            this.mConfirmTextView.setText(avatarDecorationObj.isRenew_enabled() ? R.string.renew : R.string.purchase);
            this.mConfirmTextView.setEnabled(true);
            this.mConfirmTextView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.mine.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79063b.e5(avatarDecorationObj, view);
                }
            });
        } else {
            this.mConfirmTextView.setText(R.string.save);
            this.mConfirmTextView.setEnabled(true);
            this.mConfirmTextView.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.account.mine.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79065b.f5(avatarDecorationObj, view);
                }
            });
        }
    }

    private void h5(List<AvatarDecorListObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25047, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("SetAvatarDecorFragment, refreshList getChildCount = " + this.mDecorListContainers.getChildCount());
        this.mDecorListContainers.removeAllViews();
        if (list != null) {
            Iterator<AvatarDecorListObj> it = list.iterator();
            while (it.hasNext()) {
                this.mDecorListContainers.addView(Z4(it.next(), this.f79037r));
            }
        }
    }

    private void i5(AvatarDecorCategoriesObj avatarDecorCategoriesObj) {
        if (PatchProxy.proxy(new Object[]{avatarDecorCategoriesObj}, this, changeQuickRedirect, false, 25046, new Class[]{AvatarDecorCategoriesObj.class}, Void.TYPE).isSupported || avatarDecorCategoriesObj == null || avatarDecorCategoriesObj.getItems() == null) {
            return;
        }
        this.f79039t = avatarDecorCategoriesObj.getSession();
        List<KeyDescObj> cates = avatarDecorCategoriesObj.getCates();
        if (cates == null || cates.size() <= 1) {
            this.mTitleDividerView.setVisibility(0);
            this.mTabLinearLayout.setVisibility(8);
        } else {
            this.mTitleDividerView.setVisibility(8);
            this.mTabLinearLayout.setVisibility(0);
            if (this.f79038s == null) {
                if (!com.max.hbcommon.utils.c.u(this.f79041v)) {
                    for (KeyDescObj keyDescObj : cates) {
                        if (this.f79041v.equals(keyDescObj.getKey())) {
                            this.f79038s = keyDescObj;
                            break;
                        }
                    }
                } else {
                    this.f79038s = cates.get(0);
                }
            }
            com.max.xiaoheihe.utils.d.U1(cates, this.f79038s);
            m5(this.mTabLinearLayout, cates);
        }
        g5(null);
        for (AvatarDecorationObj avatarDecorationObj : avatarDecorCategoriesObj.getItems()) {
            if (avatarDecorationObj.isEnabled()) {
                this.f79037r = avatarDecorationObj;
                this.mAvatarView.setAvatarDecoration(avatarDecorationObj);
                break;
            }
        }
        h5(avatarDecorCategoriesObj.getContents());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j5(LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 25044, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                KeyDescObj keyDescObj = (KeyDescObj) childAt.getTag();
                childAt.setBackgroundDrawable(keyDescObj.isChecked() ? getResources().getDrawable(R.drawable.bg_layer_2_color_2dp) : null);
                TextView textView = (TextView) childAt.findViewById(R.id.tv_desc);
                if (textView != null) {
                    if (keyDescObj.isChecked()) {
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    } else {
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                    }
                }
            } else {
                KeyDescObj keyDescObj2 = (KeyDescObj) linearLayout.getChildAt(i10 - 1).getTag();
                int i11 = i10 + 1;
                View childAt2 = i11 < childCount ? linearLayout.getChildAt(i11) : null;
                KeyDescObj keyDescObj3 = childAt2 != null ? (KeyDescObj) childAt2.getTag() : null;
                Object[] objArr = keyDescObj3 != null && keyDescObj3.isChecked();
                if (keyDescObj2.isChecked() || objArr == true) {
                    childAt.setVisibility(4);
                } else {
                    childAt.setVisibility(0);
                }
            }
        }
    }

    private void k5(AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 25048, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().mb(avatarDecorationObj.getId()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(avatarDecorationObj)));
    }

    private void l5(AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, 25042, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79037r = avatarDecorationObj;
        int childCount = this.mDecorListContainers.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.mDecorListContainers.getChildAt(i10);
            if (childAt instanceof AvatarDecorListContainer) {
                ((AvatarDecorListContainer) childAt).m(this.f79037r);
            }
        }
        g5(this.f79037r);
        this.mContext.sendBroadcast(new Intent(lb.a.f131055v));
    }

    private void m5(LinearLayout linearLayout, List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{linearLayout, list}, this, changeQuickRedirect, false, 25043, new Class[]{LinearLayout.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || list.size() <= 0) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                View view = new View(this.mContext);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 0.5f), -1);
                int iF = ViewUtils.f(this.mContext, 8.0f);
                layoutParams.bottomMargin = iF;
                layoutParams.topMargin = iF;
                view.setLayoutParams(layoutParams);
                view.setBackgroundColor(getResources().getColor(R.color.divider_primary_1_color));
                linearLayout.addView(view);
            }
            KeyDescObj keyDescObj = list.get(i10);
            View viewInflate = this.mInflater.inflate(R.layout.item_icon_desc_filter, (ViewGroup) linearLayout, false);
            viewInflate.setTag(keyDescObj);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_desc);
            linearLayout.addView(viewInflate);
            if (com.max.hbcommon.utils.c.u(keyDescObj.getImg())) {
                imageView.setVisibility(8);
            } else {
                com.max.hbimage.b.K(keyDescObj.getImg(), imageView);
                imageView.setVisibility(0);
            }
            textView.setText(keyDescObj.getTitle());
            viewInflate.setOnClickListener(new b(viewInflate, list, linearLayout));
        }
        j5(linearLayout);
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.A4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f79041v = arguments.getString("key");
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean H4() {
        return false;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.d
    @p0
    public Fragment a2(@p0 Map<String, ?> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25034, new Class[]{Map.class}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : new SetAvatarDecorFragment();
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25036, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(view, z10);
        setContentView(R.layout.activity_set_avatar_decor);
        this.f79035p = (i) new y0(this).a(i.class);
        ButterKnife.f(this, view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mToolbar.getLayoutParams();
        marginLayoutParams.topMargin = t.m(this.mContext);
        this.mToolbar.setLayoutParams(marginLayoutParams);
        if (this.backIconInvisible) {
            this.mToolbar.setBackIconInvisible();
            this.mToolbar.getAppbarNavButtonView().setVisibility(4);
        }
        this.mToolbar.setTitle(R.string.avatar_decoration);
        this.mToolbar.P();
        User userI = i0.i();
        this.mAvatarView.setAvatar(userI.getAccount_detail().getAvartar(), userI.getAccount_detail().getAvatar_decoration());
        this.mBottomBarView.setVisibility(8);
        this.f79036q = new LoadingDialog(this.mContext, "", true);
        this.f79035p.h().k(this, new a());
        showLoading();
        a5();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25049, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        com.max.heybox.hblog.g.x("SetAvatarDecorFragment, onDetach setDecorSuccess = " + this.f79042w);
        Intent intent = new Intent();
        intent.putExtra(f79034z, this.f79042w);
        Activity activity = this.mContext;
        if (activity != null) {
            activity.setResult(-1, intent);
        }
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25050, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        a5();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25037, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        AvatarDecorBroadcastReceiver avatarDecorBroadcastReceiver = new AvatarDecorBroadcastReceiver();
        this.f79040u = avatarDecorBroadcastReceiver;
        registerReceiver(avatarDecorBroadcastReceiver, lb.a.L);
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25039, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.f79035p.k(this.mContext);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25040, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        BroadcastReceiver broadcastReceiver = this.f79040u;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    public boolean x4() {
        return false;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment
    @p0
    public HBShareProtocolData y4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25051, new Class[0], HBShareProtocolData.class);
        return patchProxyResultProxy.isSupported ? (HBShareProtocolData) patchProxyResultProxy.result : new HBShareProtocolData(getString(R.string.avatar_decor_share_title), getString(R.string.miniprogram_share_desc), lb.a.A1, "", null, null, com.max.hbshare.c.f72557m, null, null);
    }
}
