package com.max.xiaoheihe.module.account.component;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FollowButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@o(parameters = 0)
public final class FollowButton extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78834f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f78835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f78836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f78837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private FollowState f78838e;

    /* JADX INFO: compiled from: FollowButton.kt */
    public enum FollowState {
        Follow,
        Followed,
        FollowedEachOther,
        FollowBack;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static FollowState valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 24851, new Class[]{String.class}, FollowState.class);
            return (FollowState) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(FollowState.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static FollowState[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 24850, new Class[0], FollowState[].class);
            return (FollowState[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: FollowButton.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78839a;

        static {
            int[] iArr = new int[FollowState.valuesCustom().length];
            try {
                iArr[FollowState.Followed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FollowState.FollowedEachOther.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FollowState.FollowBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78839a = iArr;
        }
    }

    public FollowButton(@dl.e Context context) {
        this(context, null);
    }

    public FollowButton(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FollowButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FollowButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f78837d = 3.0f;
        this.f78838e = FollowState.Follow;
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24845, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        setIvFollow(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 2.0f);
        getIvFollow().setLayoutParams(layoutParams);
        addView(getIvFollow());
        setTvFollow(new TextView(getContext()));
        getTvFollow().setTextSize(ViewUtils.g(getContext(), 12.0f));
        getTvFollow().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        addView(getTvFollow());
        setFollowState(FollowState.Follow);
    }

    @dl.d
    public final FollowState getFollowState() {
        return this.f78838e;
    }

    @dl.d
    public final ImageView getIvFollow() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24840, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f78835b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivFollow");
        return null;
    }

    @dl.d
    public final FollowState getMFollowState() {
        return this.f78838e;
    }

    @dl.d
    public final TextView getTvFollow() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24842, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f78836c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvFollow");
        return null;
    }

    @qa.a(note = "设置状态0123代表四种状态")
    public final void setFollowState(int i10) {
        FollowState followState;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 24847, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 1) {
            followState = FollowState.Followed;
        } else if (i10 != 2) {
            followState = i10 != 3 ? FollowState.Follow : FollowState.FollowBack;
        } else {
            followState = FollowState.FollowedEachOther;
        }
        setFollowState(followState);
    }

    public final void setFollowState(@dl.d FollowState followState) {
        StateListDrawable stateListDrawable;
        int i10;
        if (PatchProxy.proxy(new Object[]{followState}, this, changeQuickRedirect, false, 24848, new Class[]{FollowState.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followState, "followState");
        this.f78838e = followState;
        int i11 = a.f78839a[followState.ordinal()];
        int i12 = R.color.background_layer_2_color;
        int i13 = R.drawable.ic_0icon_action_interact_16;
        if (i11 != 1) {
            if (i11 == 2) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(getContext(), R.color.background_card_1_color, this.f78837d));
                stateListDrawable.addState(new int[0], q.o(getContext(), R.color.divider_secondary_1_color, this.f78837d));
                i10 = R.string.follow_each_other;
            } else if (i11 != 3) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(getContext(), R.color.appbar_text_color, this.f78837d));
                stateListDrawable.addState(new int[0], q.o(getContext(), R.color.text_primary_1_color, this.f78837d));
                i13 = R.drawable.ic_0icon_action_add_16;
                i10 = R.string.follow;
            } else {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(getContext(), R.color.appbar_text_color, this.f78837d));
                stateListDrawable.addState(new int[0], q.o(getContext(), R.color.text_primary_1_color, this.f78837d));
                i10 = R.string.follow_too;
            }
            setBackground(stateListDrawable);
            getIvFollow().setImageResource(i13);
            getTvFollow().setText(i10);
            getTvFollow().setTextColor(getContext().getResources().getColor(i12));
            getIvFollow().setColorFilter(getContext().getResources().getColor(i12));
        }
        stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, q.o(getContext(), R.color.background_card_1_color, this.f78837d));
        stateListDrawable.addState(new int[0], q.o(getContext(), R.color.divider_secondary_1_color, this.f78837d));
        i13 = R.drawable.ic_0icon_action_select_16;
        i10 = R.string.has_followed;
        i12 = R.color.text_primary_2_color;
        setBackground(stateListDrawable);
        getIvFollow().setImageResource(i13);
        getTvFollow().setText(i10);
        getTvFollow().setTextColor(getContext().getResources().getColor(i12));
        getIvFollow().setColorFilter(getContext().getResources().getColor(i12));
    }

    public final void setIvFollow(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 24841, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f78835b = imageView;
    }

    public final void setMFollowState(@dl.d FollowState followState) {
        if (PatchProxy.proxy(new Object[]{followState}, this, changeQuickRedirect, false, 24844, new Class[]{FollowState.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followState, "<set-?>");
        this.f78838e = followState;
    }

    public final void setRadiusDp(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 24846, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f78837d = ViewUtils.h0(getContext(), f10);
    }

    public final void setTitleStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24849, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int iF = ViewUtils.f(getContext(), 14.0f);
        ViewGroup.LayoutParams layoutParams = getIvFollow().getLayoutParams();
        layoutParams.width = iF;
        layoutParams.height = iF;
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = 0;
        getIvFollow().setLayoutParams(marginLayoutParams);
        getTvFollow().setTextSize(1, 11.0f);
    }

    public final void setTvFollow(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 24843, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f78836c = textView;
    }
}
