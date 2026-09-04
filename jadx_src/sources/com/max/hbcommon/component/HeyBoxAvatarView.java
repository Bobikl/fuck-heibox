package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class HeyBoxAvatarView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.r(unit = 0)
    private static final int f67012f = 49;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImageView f67013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageView f67014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageView f67015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnlineState f67016e;

    public enum OnlineState {
        None,
        Online,
        PhoneOnline;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static OnlineState valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.d.E8, new Class[]{String.class}, OnlineState.class);
            return patchProxyResultProxy.isSupported ? (OnlineState) patchProxyResultProxy.result : (OnlineState) Enum.valueOf(OnlineState.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static OnlineState[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.d.D8, new Class[0], OnlineState[].class);
            return patchProxyResultProxy.isSupported ? (OnlineState[]) patchProxyResultProxy.result : (OnlineState[]) values().clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67017a;

        static {
            int[] iArr = new int[OnlineState.valuesCustom().length];
            f67017a = iArr;
            try {
                iArr[OnlineState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67017a[OnlineState.Online.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67017a[OnlineState.PhoneOnline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public HeyBoxAvatarView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public HeyBoxAvatarView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeyBoxAvatarView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f67013b = imageView;
        ImageView imageView2 = new ImageView(context);
        this.f67014c = imageView2;
        addView(imageView);
        addView(imageView2);
        ImageView imageView3 = new ImageView(context);
        this.f67015d = imageView3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = ViewUtils.f(context, 7.0f);
        layoutParams.rightMargin = ViewUtils.f(context, 7.0f);
        imageView3.setLayoutParams(layoutParams);
        addView(imageView3);
        setOnlineState(OnlineState.None);
    }

    private int a(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31591v8, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iF = ViewUtils.f(getContext(), 49.0f);
        int mode = View.MeasureSpec.getMode(i10);
        return (Integer.MIN_VALUE == mode || 1073741824 == mode) ? View.MeasureSpec.getSize(i10) : iF;
    }

    private void setDecor(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.A8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.c(this.f67014c);
        if (com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        com.max.hbimage.b.K(str, this.f67014c);
    }

    public ImageView getAvatarImageView() {
        return this.f67013b;
    }

    public ImageView getDecorImageView() {
        return this.f67014c;
    }

    public OnlineState getOnlineState() {
        return this.f67016e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31569u8, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        for (int i16 = 0; i16 < Math.min(childCount, 2); i16++) {
            View childAt = getChildAt(i16);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i17 = (((i14 + 0) - measuredWidth) / 2) + 0;
            int i18 = (((i15 + 0) - measuredHeight) / 2) + 0;
            childAt.layout(i17, i18, measuredWidth + i17, measuredHeight + i18);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = 0;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.f31547t8, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int iMin = Math.min(a(i10), a(i11));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
        ImageView imageView = this.f67015d;
        if (imageView != null && imageView.getLayoutParams() != null) {
            int iF = (int) (((iMin * 1.0f) / 7.0f) - ViewUtils.f(getContext(), 3.0f));
            ((ViewGroup.MarginLayoutParams) this.f67015d.getLayoutParams()).bottomMargin = iF;
            ((ViewGroup.MarginLayoutParams) this.f67015d.getLayoutParams()).rightMargin = iF;
        }
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            int i13 = i12 == 0 ? (int) ((iMin * 5.0f) / 7.0f) : iMin;
            measureChild(childAt, View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            i12++;
        }
    }

    public void setAvatar(@androidx.annotation.v int i10, AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), avatarDecorationObj}, this, changeQuickRedirect, false, bb.c.d.f31635x8, new Class[]{Integer.TYPE, AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67013b.setImageResource(i10);
        setAvatarDecoration(avatarDecorationObj);
    }

    public void setAvatar(String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31679z8, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.c(this.f67014c);
        this.f67013b.setImageDrawable(null);
        com.max.hbimage.b.d0(str, this.f67014c, i10);
    }

    public void setAvatar(String str, AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{str, avatarDecorationObj}, this, changeQuickRedirect, false, bb.c.d.f31657y8, new Class[]{String.class, AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.c(this.f67013b);
        com.max.hbimage.b.V(str, this.f67013b, R.drawable.common_default_avatar_40x40);
        setAvatarDecoration(avatarDecorationObj);
    }

    public void setAvatarDecoration(AvatarDecorationObj avatarDecorationObj) {
        if (PatchProxy.proxy(new Object[]{avatarDecorationObj}, this, changeQuickRedirect, false, bb.c.d.f31613w8, new Class[]{AvatarDecorationObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (avatarDecorationObj == null) {
            com.max.hbimage.b.c(this.f67014c);
            this.f67014c.setImageDrawable(null);
        } else {
            if ("svga".equalsIgnoreCase(avatarDecorationObj.getSrc_type())) {
                return;
            }
            setDecor(avatarDecorationObj.getSrc_url());
        }
    }

    public void setOnlineState(OnlineState onlineState) {
        if (PatchProxy.proxy(new Object[]{onlineState}, this, changeQuickRedirect, false, bb.c.d.C8, new Class[]{OnlineState.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f67016e = onlineState;
        if (onlineState == null) {
            this.f67015d.setVisibility(8);
            return;
        }
        int i10 = a.f67017a[onlineState.ordinal()];
        if (i10 == 1) {
            this.f67015d.setVisibility(8);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f67015d.setVisibility(0);
            this.f67015d.setColorFilter(getContext().getResources().getColor(R.color.correct_color));
            this.f67015d.getLayoutParams().width = ViewUtils.f(getContext(), 16.0f);
            this.f67015d.getLayoutParams().height = ViewUtils.f(getContext(), 20.0f);
            int iF = ViewUtils.f(getContext(), 1.0f);
            int iF2 = ViewUtils.f(getContext(), 3.0f);
            this.f67015d.setPadding(iF, iF2, iF, iF2);
            this.f67015d.setImageResource(R.drawable.user_state_mobile_24x24);
            this.f67015d.setBackground(com.max.hbutils.utils.q.o(getContext(), R.color.background_layer_2_color, 5.0f));
            return;
        }
        this.f67015d.setVisibility(0);
        ImageView imageView = this.f67015d;
        Resources resources = getContext().getResources();
        int i11 = R.color.correct_color;
        imageView.setColorFilter(resources.getColor(i11));
        int iF3 = ViewUtils.f(getContext(), 16.0f);
        this.f67015d.getLayoutParams().width = iF3;
        this.f67015d.getLayoutParams().height = iF3;
        this.f67015d.setImageDrawable(com.max.hbutils.utils.q.o(getContext(), i11, 5.0f));
        int iF4 = ViewUtils.f(getContext(), 3.0f);
        this.f67015d.setPadding(iF4, iF4, iF4, iF4);
        this.f67015d.setBackground(com.max.hbutils.utils.q.o(getContext(), R.color.background_layer_2_color, 8.0f));
    }

    public void setOnlineState(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.B8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null) {
            setOnlineState(OnlineState.None);
            return;
        }
        if (str.equals("1")) {
            setOnlineState(OnlineState.Online);
        } else if (str.equals("2")) {
            setOnlineState(OnlineState.PhoneOnline);
        } else {
            setOnlineState(OnlineState.None);
        }
    }
}
