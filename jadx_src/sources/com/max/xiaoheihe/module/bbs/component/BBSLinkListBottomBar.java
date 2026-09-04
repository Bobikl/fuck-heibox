package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.likecomment.BBSLinkListLikeComment;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSLinkListBottomBar.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSLinkListBottomBar extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f80804f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BBSLinkListLikeComment f80805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GameRateStarView f80806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RichStackModelView f80807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f80808e;

    /* JADX INFO: compiled from: BBSLinkListBottomBar.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80809a;

        static {
            int[] iArr = new int[BBSUserSectionView.BBSUserSectionType.valuesCustom().length];
            try {
                iArr[BBSUserSectionView.BBSUserSectionType.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BBSUserSectionView.BBSUserSectionType.LinkComment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BBSUserSectionView.BBSUserSectionType.GameComment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f80809a = iArr;
        }
    }

    public BBSLinkListBottomBar(@e Context context) {
        this(context, null);
    }

    public BBSLinkListBottomBar(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSLinkListBottomBar(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSLinkListBottomBar(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b(attributeSet);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27610, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setLikeComment(new BBSLinkListLikeComment(getContext()));
        getLikeComment().setId(R.id.vg_like);
        getLikeComment().setType(BBSLinkListLikeComment.Type.Comment);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        addView(getLikeComment(), layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(19);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(9);
        layoutParams2.addRule(0, R.id.vg_like);
        layoutParams2.bottomMargin = ViewUtils.f(getContext(), -1.0f);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 12.0f);
        addView(linearLayout, layoutParams2);
        setRating_star(new GameRateStarView(getContext()));
        getRating_star().setId(R.id.bbs_rating);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.rightMargin = ViewUtils.f(getContext(), 6.0f);
        linearLayout.addView(getRating_star(), layoutParams3);
        setTv_desc(new RichStackModelView(getContext()));
        linearLayout.addView(getTv_desc(), new LinearLayout.LayoutParams(-2, -2));
        setIv_not_interested(new ImageView(getContext()));
        getIv_not_interested().setVisibility(8);
        getIv_not_interested().setImageResource(R.drawable.ic_close_oval_20);
        getIv_not_interested().setColorFilter(getContext().getResources().getColor(R.color.text_secondary_2_color));
        int iF = ViewUtils.f(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iF, iF);
        layoutParams4.leftMargin = ViewUtils.f(getContext(), 2.0f);
        linearLayout.addView(getIv_not_interested(), layoutParams4);
    }

    private final void b(AttributeSet attributeSet) {
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27612, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getRating_star().setVisibility(0);
        } else {
            getRating_star().setVisibility(8);
        }
    }

    @d
    public final ImageView getIv_not_interested() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27608, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80808e;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_not_interested");
        return null;
    }

    @d
    public final BBSLinkListLikeComment getLikeComment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27602, new Class[0], BBSLinkListLikeComment.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkListLikeComment) patchProxyResultProxy.result;
        }
        BBSLinkListLikeComment bBSLinkListLikeComment = this.f80805b;
        if (bBSLinkListLikeComment != null) {
            return bBSLinkListLikeComment;
        }
        f0.S("likeComment");
        return null;
    }

    @d
    public final GameRateStarView getRating_star() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27604, new Class[0], GameRateStarView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameRateStarView) patchProxyResultProxy.result;
        }
        GameRateStarView gameRateStarView = this.f80806c;
        if (gameRateStarView != null) {
            return gameRateStarView;
        }
        f0.S("rating_star");
        return null;
    }

    @d
    public final RichStackModelView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27606, new Class[0], RichStackModelView.class);
        if (patchProxyResultProxy.isSupported) {
            return (RichStackModelView) patchProxyResultProxy.result;
        }
        RichStackModelView richStackModelView = this.f80807d;
        if (richStackModelView != null) {
            return richStackModelView;
        }
        f0.S("tv_desc");
        return null;
    }

    public final void setIv_not_interested(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27609, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80808e = imageView;
    }

    public final void setLikeComment(@d BBSLinkListLikeComment bBSLinkListLikeComment) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListLikeComment}, this, changeQuickRedirect, false, 27603, new Class[]{BBSLinkListLikeComment.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSLinkListLikeComment, "<set-?>");
        this.f80805b = bBSLinkListLikeComment;
    }

    public final void setRating(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 27613, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getRating_star().setRating(f10);
    }

    public final void setRating_star(@d GameRateStarView gameRateStarView) {
        if (PatchProxy.proxy(new Object[]{gameRateStarView}, this, changeQuickRedirect, false, 27605, new Class[]{GameRateStarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameRateStarView, "<set-?>");
        this.f80806c = gameRateStarView;
    }

    public final void setTv_desc(@d RichStackModelView richStackModelView) {
        if (PatchProxy.proxy(new Object[]{richStackModelView}, this, changeQuickRedirect, false, 27607, new Class[]{RichStackModelView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(richStackModelView, "<set-?>");
        this.f80807d = richStackModelView;
    }

    public final void setType(@d BBSUserSectionView.BBSUserSectionType type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 27611, new Class[]{BBSUserSectionView.BBSUserSectionType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int i10 = a.f80809a[type.ordinal()];
        if (i10 == 1) {
            getLikeComment().setType(BBSLinkListLikeComment.Type.Comment);
            c(false);
        } else if (i10 == 2) {
            getLikeComment().setType(BBSLinkListLikeComment.Type.LikeOnly);
            c(false);
        } else {
            if (i10 != 3) {
                return;
            }
            getLikeComment().setType(BBSLinkListLikeComment.Type.Comment);
            c(false);
        }
    }
}
