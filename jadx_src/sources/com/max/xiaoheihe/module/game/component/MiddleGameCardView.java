package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.component.BlurView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MiddleGameCardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MiddleGameCardView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f86921p = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f86922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f86923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InnerGameItemView f86924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BlurView f86925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f86926o;

    public MiddleGameCardView(@e Context context) {
        this(context, null);
    }

    public MiddleGameCardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiddleGameCardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36872, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setRadius(ViewUtils.f(getContext(), 8.0f));
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        View.inflate(getContext(), R.layout.view_recommend_middle_game_card, this);
        View viewFindViewById = findViewById(R.id.vg_container);
        f0.o(viewFindViewById, "findViewById(R.id.vg_container)");
        setVg_container((RelativeLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_bg);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_bg)");
        setIv_bg((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.game_item);
        f0.o(viewFindViewById3, "findViewById(R.id.game_item)");
        setGame_item((InnerGameItemView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.view_blur);
        f0.o(viewFindViewById4, "findViewById(R.id.view_blur)");
        setView_blur((BlurView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.ll_platform_icon);
        f0.o(viewFindViewById5, "findViewById(R.id.ll_platform_icon)");
        setLl_platform_icon((LinearLayout) viewFindViewById5);
        getGame_item().setMiniStyle(true);
    }

    @d
    public final InnerGameItemView getGame_item() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36866, new Class[0], InnerGameItemView.class);
        if (patchProxyResultProxy.isSupported) {
            return (InnerGameItemView) patchProxyResultProxy.result;
        }
        InnerGameItemView innerGameItemView = this.f86924m;
        if (innerGameItemView != null) {
            return innerGameItemView;
        }
        f0.S("game_item");
        return null;
    }

    @d
    public final ImageView getIv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36864, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86923l;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_bg");
        return null;
    }

    @d
    public final LinearLayout getLl_platform_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36870, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86926o;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_platform_icon");
        return null;
    }

    @d
    public final RelativeLayout getVg_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36862, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86922k;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_container");
        return null;
    }

    @d
    public final BlurView getView_blur() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36868, new Class[0], BlurView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BlurView) patchProxyResultProxy.result;
        }
        BlurView blurView = this.f86925n;
        if (blurView != null) {
            return blurView;
        }
        f0.S("view_blur");
        return null;
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36873, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_container().setBackground(drawable);
    }

    public final void setBottomBlur(int i10, @d Bitmap bitmap, int i11) {
        Object[] objArr = {new Integer(i10), bitmap, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36874, new Class[]{cls, Bitmap.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bitmap, "bitmap");
        getView_blur().d(bitmap, i10, i11, 0.6f);
    }

    public final void setGame_item(@d InnerGameItemView innerGameItemView) {
        if (PatchProxy.proxy(new Object[]{innerGameItemView}, this, changeQuickRedirect, false, 36867, new Class[]{InnerGameItemView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(innerGameItemView, "<set-?>");
        this.f86924m = innerGameItemView;
    }

    public final void setIv_bg(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36865, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86923l = imageView;
    }

    public final void setLl_platform_icon(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36871, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86926o = linearLayout;
    }

    public final void setPlatformsIcon(@e List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36875, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        getLl_platform_icon().removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            getLl_platform_icon().setVisibility(8);
            return;
        }
        getLl_platform_icon().setVisibility(0);
        f0.m(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ImageView imageViewN0 = r1.n0(getContext(), it.next(), ViewUtils.f(getContext(), 18.0f));
            if (imageViewN0 != null) {
                getLl_platform_icon().addView(imageViewN0);
            }
        }
    }

    public final void setVg_container(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36863, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86922k = relativeLayout;
    }

    public final void setView_blur(@d BlurView blurView) {
        if (PatchProxy.proxy(new Object[]{blurView}, this, changeQuickRedirect, false, 36869, new Class[]{BlurView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(blurView, "<set-?>");
        this.f86925n = blurView;
    }
}
