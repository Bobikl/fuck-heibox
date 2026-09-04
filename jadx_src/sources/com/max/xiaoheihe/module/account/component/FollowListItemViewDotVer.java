package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.module.upload.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FollowListItemViewDotVer.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class FollowListItemViewDotVer extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f78847h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AvatarView f78848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FollowButton f78849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f78850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f78851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f78852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f78853g;

    public FollowListItemViewDotVer(@dl.e Context context) {
        this(context, null);
    }

    public FollowListItemViewDotVer(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowListItemViewDotVer(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FollowListItemViewDotVer(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24879, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setAvatar(new AvatarView(getContext()));
        getAvatar().setId(R.id.avatar);
        int iF = ViewUtils.f(getContext(), 70.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.addRule(15);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 2.0f);
        addView(getAvatar(), layoutParams);
        setFb(new FollowButton(getContext()));
        getFb().setId(R.id.f76246fb);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(15);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 12.0f);
        getFb().setMinimumWidth(ViewUtils.f(getContext(), 80.0f));
        getFb().setMinimumHeight(ViewUtils.f(getContext(), 30.0f));
        addView(getFb(), layoutParams2);
        View viewInflate = View.inflate(getContext(), R.layout.view_user_item_content, null);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, R.id.f76246fb);
        layoutParams3.addRule(1, R.id.avatar);
        ic.a aVar = ic.a.f119343a;
        Context context = getContext();
        f0.o(context, "context");
        layoutParams3.setMarginStart(aVar.a(context, 10.0f));
        addView(viewInflate, layoutParams3);
        View viewFindViewById = findViewById(R.id.tv_name);
        f0.o(viewFindViewById, "findViewById(R.id.tv_name)");
        setTv_name((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.rl_medal_level);
        f0.o(viewFindViewById2, "findViewById(R.id.rl_medal_level)");
        setRl_medal_level((RelativeLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_desc)");
        setTv_desc((TextView) viewFindViewById3);
        View viewInflate2 = View.inflate(getContext(), R.layout.divider, null);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f));
        layoutParams4.addRule(12);
        addView(viewInflate2, layoutParams4);
    }

    @dl.d
    public final AvatarView getAvatar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24867, new Class[0], AvatarView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AvatarView) patchProxyResultProxy.result;
        }
        AvatarView avatarView = this.f78848b;
        if (avatarView != null) {
            return avatarView;
        }
        f0.S(g.f93525b);
        return null;
    }

    @dl.d
    public final View getDivider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24871, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f78850d;
        if (view != null) {
            return view;
        }
        f0.S(SearchHelper.E);
        return null;
    }

    @dl.d
    public final FollowButton getFb() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24869, new Class[0], FollowButton.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowButton) patchProxyResultProxy.result;
        }
        FollowButton followButton = this.f78849c;
        if (followButton != null) {
            return followButton;
        }
        f0.S("fb");
        return null;
    }

    @dl.d
    public final RelativeLayout getRl_medal_level() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24875, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f78852f;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("rl_medal_level");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24877, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f78853g;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24873, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f78851e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    public final void setAvatar(@dl.d AvatarView avatarView) {
        if (PatchProxy.proxy(new Object[]{avatarView}, this, changeQuickRedirect, false, 24868, new Class[]{AvatarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(avatarView, "<set-?>");
        this.f78848b = avatarView;
    }

    public final void setDivider(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 24872, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f78850d = view;
    }

    public final void setFb(@dl.d FollowButton followButton) {
        if (PatchProxy.proxy(new Object[]{followButton}, this, changeQuickRedirect, false, 24870, new Class[]{FollowButton.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followButton, "<set-?>");
        this.f78849c = followButton;
    }

    public final void setName(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 24880, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setRl_medal_level(@dl.d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 24876, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f78852f = relativeLayout;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 24878, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f78853g = textView;
    }

    public final void setTv_name(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 24874, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f78851e = textView;
    }
}
