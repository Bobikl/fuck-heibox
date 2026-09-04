package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.hbcommon.utils.c;
import com.max.hbuikit.bean.UiKitViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.UserMedalObj;
import com.max.xiaoheihe.module.account.component.UserLevelView;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: BBSUserSectionSmallView.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nBBSUserSectionSmallView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBSUserSectionSmallView.kt\ncom/max/xiaoheihe/module/bbs/component/BBSUserSectionSmallView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,183:1\n262#2,2:184\n262#2,2:186\n262#2,2:188\n262#2,2:190\n262#2,2:192\n262#2,2:194\n262#2,2:196\n*S KotlinDebug\n*F\n+ 1 BBSUserSectionSmallView.kt\ncom/max/xiaoheihe/module/bbs/component/BBSUserSectionSmallView\n*L\n143#1:184,2\n144#1:186,2\n147#1:188,2\n148#1:190,2\n151#1:192,2\n152#1:194,2\n181#1:196,2\n*E\n"})
@o(parameters = 0)
public final class BBSUserSectionSmallView extends LinearLayout implements a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f80837h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HeyBoxAvatarView f80838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f80839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f80840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UserLevelView f80841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f80842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HBUiKitView f80843g;

    public BBSUserSectionSmallView(@e Context context) {
        this(context, null);
    }

    public BBSUserSectionSmallView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSUserSectionSmallView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSUserSectionSmallView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        c();
        d(attributeSet);
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27672, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        setAvartar(new HeyBoxAvatarView(getContext()));
        getAvartar().setId(R.id.bbs_avartar);
        int iF = ViewUtils.f(getContext(), 25.4f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 2.29f);
        addView(getAvartar(), layoutParams);
        setTv_name(new TextView(getContext()));
        getTv_name().setId(R.id.bbs_name);
        getTv_name().setTextSize(ViewUtils.g(getContext(), 12.0f));
        getTv_name().setGravity(17);
        getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        getTv_name().setIncludeFontPadding(false);
        addView(getTv_name(), new LinearLayout.LayoutParams(-2, -2));
        setRl_medal_level(new RelativeLayout(getContext()));
        getRl_medal_level().setId(R.id.bbs_medal);
        getRl_medal_level().setVisibility(8);
        addView(getRl_medal_level(), new LinearLayout.LayoutParams(-2, -2));
        setUserLevel(new UserLevelView(getContext()));
        getUserLevel().setId(R.id.bbs_user_level);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 4.0f);
        addView(getUserLevel(), layoutParams2);
        setExtra_tag(new TextView(getContext()));
        getExtra_tag().setTextSize(ViewUtils.g(getContext(), 9.0f));
        getExtra_tag().setGravity(17);
        getExtra_tag().setBackground(q.o(getContext(), R.color.divider_secondary_1_color, 2.0f));
        getExtra_tag().setPadding(ViewUtils.f(getContext(), 5.0f), 0, ViewUtils.f(getContext(), 5.0f), 0);
        getExtra_tag().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        getExtra_tag().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 16.0f));
        layoutParams3.leftMargin = ViewUtils.f(getContext(), 4.0f);
        addView(getExtra_tag(), layoutParams3);
        Context context = getContext();
        f0.o(context, "context");
        setExtra_tag_v2(new HBUiKitView(context));
        addView(getExtra_tag_v2(), new RelativeLayout.LayoutParams(-2, -2));
    }

    private final void d(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 27673, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.B);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.BBSUserSection)");
        typedArrayObtainStyledAttributes.getInt(0, 0);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void a(@e List<? extends UserMedalObj> list, @e List<? extends UserMedalObj> list2, @e String str) {
        if (PatchProxy.proxy(new Object[]{list, list2, str}, this, changeQuickRedirect, false, 27676, new Class[]{List.class, List.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        BBSUserSectionView.a aVar = BBSUserSectionView.f80844v;
        RelativeLayout rl_medal_level = getRl_medal_level();
        Context context = getContext();
        f0.o(context, "context");
        BBSUserSectionView.a.b(aVar, rl_medal_level, context, list, list2, str, false, 32, null);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27678, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getUserLevel().setVisibility(z10 ? 0 : 8);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    @d
    public HeyBoxAvatarView getAvartar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27660, new Class[0], HeyBoxAvatarView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HeyBoxAvatarView) patchProxyResultProxy.result;
        }
        HeyBoxAvatarView heyBoxAvatarView = this.f80838b;
        if (heyBoxAvatarView != null) {
            return heyBoxAvatarView;
        }
        f0.S("avartar");
        return null;
    }

    @d
    public final TextView getExtra_tag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27668, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80842f;
        if (textView != null) {
            return textView;
        }
        f0.S("extra_tag");
        return null;
    }

    @d
    public final HBUiKitView getExtra_tag_v2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27670, new Class[0], HBUiKitView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBUiKitView) patchProxyResultProxy.result;
        }
        HBUiKitView hBUiKitView = this.f80843g;
        if (hBUiKitView != null) {
            return hBUiKitView;
        }
        f0.S("extra_tag_v2");
        return null;
    }

    @d
    public final RelativeLayout getRl_medal_level() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27664, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f80840d;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("rl_medal_level");
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    @d
    public TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27662, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80839c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @d
    public final UserLevelView getUserLevel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27666, new Class[0], UserLevelView.class);
        if (patchProxyResultProxy.isSupported) {
            return (UserLevelView) patchProxyResultProxy.result;
        }
        UserLevelView userLevelView = this.f80841e;
        if (userLevelView != null) {
            return userLevelView;
        }
        f0.S("userLevel");
        return null;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setAvartar(@d HeyBoxAvatarView heyBoxAvatarView) {
        if (PatchProxy.proxy(new Object[]{heyBoxAvatarView}, this, changeQuickRedirect, false, 27661, new Class[]{HeyBoxAvatarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(heyBoxAvatarView, "<set-?>");
        this.f80838b = heyBoxAvatarView;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setExtraTag(@e String str, @e UiKitViewObj uiKitViewObj) {
        if (PatchProxy.proxy(new Object[]{str, uiKitViewObj}, this, changeQuickRedirect, false, 27675, new Class[]{String.class, UiKitViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (uiKitViewObj != null) {
            getExtra_tag().setVisibility(8);
            getExtra_tag_v2().setVisibility(0);
            getExtra_tag_v2().setDataToCreate(uiKitViewObj);
        } else if (c.u(str)) {
            getExtra_tag().setVisibility(8);
            getExtra_tag_v2().setVisibility(8);
        } else {
            getExtra_tag().setVisibility(0);
            getExtra_tag_v2().setVisibility(8);
            getExtra_tag().setText(str);
        }
    }

    public final void setExtra_tag(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27669, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80842f = textView;
    }

    public final void setExtra_tag_v2(@d HBUiKitView hBUiKitView) {
        if (PatchProxy.proxy(new Object[]{hBUiKitView}, this, changeQuickRedirect, false, 27671, new Class[]{HBUiKitView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hBUiKitView, "<set-?>");
        this.f80843g = hBUiKitView;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setLevel(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27677, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getUserLevel().setLevel(i10);
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27674, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setRl_medal_level(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 27665, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f80840d = relativeLayout;
    }

    @Override // com.max.xiaoheihe.module.bbs.component.a
    public void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27663, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80839c = textView;
    }

    public final void setUserLevel(@d UserLevelView userLevelView) {
        if (PatchProxy.proxy(new Object[]{userLevelView}, this, changeQuickRedirect, false, 27667, new Class[]{UserLevelView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(userLevelView, "<set-?>");
        this.f80841e = userLevelView;
    }
}
