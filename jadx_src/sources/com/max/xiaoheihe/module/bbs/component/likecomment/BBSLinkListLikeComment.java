package com.max.xiaoheihe.module.bbs.component.likecomment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSLinkListLikeComment.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSLinkListLikeComment extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80990e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BBSLinkListLikeCommentBase f80991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BBSLinkListLikeCommentBase f80992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BBSLinkListLikeCommentBase f80993d;

    /* JADX INFO: compiled from: BBSLinkListLikeComment.kt */
    public enum Type {
        Comment,
        Dislike,
        LikeOnly,
        CommentOnly;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 28008, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 28007, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: BBSLinkListLikeComment.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80994a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.LikeOnly.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.CommentOnly.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f80994a = iArr;
        }
    }

    public BBSLinkListLikeComment(@e Context context) {
        this(context, null);
    }

    public BBSLinkListLikeComment(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSLinkListLikeComment(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSLinkListLikeComment(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        int iF = ViewUtils.f(getContext(), 16.0f);
        setBll_comment(new BBSLinkListLikeCommentBase(getContext()));
        getBll_comment().setShapeResource(R.drawable.bbs_comment_filled_24x24);
        getBll_comment().setNum("0");
        getBll_comment().setIconSize(iF);
        addView(getBll_comment(), new LinearLayout.LayoutParams(-2, -2));
        setBll_like(new BBSLinkListLikeCommentBase(getContext()));
        getBll_like().setShapeResource(R.drawable.bbs_thumbs_up_filled_24x24);
        getBll_like().setNum("0");
        getBll_like().setIconSize(iF);
        getBll_like().setPadding(ViewUtils.f(getContext(), 10.0f), 0, 0, 0);
        addView(getBll_like(), new LinearLayout.LayoutParams(-2, -2));
        setBll_dislike(new BBSLinkListLikeCommentBase(getContext()));
        getBll_dislike().d(false);
        getBll_dislike().setShapeResource(R.drawable.ic_downvote_20);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 4.0f);
        addView(getBll_dislike(), layoutParams);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 28001, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.A);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…e.BBSLinkListLikeComment)");
        int i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i10 == 0) {
            setType(Type.Comment);
        } else {
            if (i10 != 1) {
                return;
            }
            setType(Type.Dislike);
        }
    }

    @d
    public final BBSLinkListLikeCommentBase getBll_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27998, new Class[0], BBSLinkListLikeCommentBase.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkListLikeCommentBase) patchProxyResultProxy.result;
        }
        BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase = this.f80993d;
        if (bBSLinkListLikeCommentBase != null) {
            return bBSLinkListLikeCommentBase;
        }
        f0.S("bll_comment");
        return null;
    }

    @d
    public final BBSLinkListLikeCommentBase getBll_dislike() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27996, new Class[0], BBSLinkListLikeCommentBase.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkListLikeCommentBase) patchProxyResultProxy.result;
        }
        BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase = this.f80992c;
        if (bBSLinkListLikeCommentBase != null) {
            return bBSLinkListLikeCommentBase;
        }
        f0.S("bll_dislike");
        return null;
    }

    @d
    public final BBSLinkListLikeCommentBase getBll_like() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27994, new Class[0], BBSLinkListLikeCommentBase.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSLinkListLikeCommentBase) patchProxyResultProxy.result;
        }
        BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase = this.f80991b;
        if (bBSLinkListLikeCommentBase != null) {
            return bBSLinkListLikeCommentBase;
        }
        f0.S("bll_like");
        return null;
    }

    public final void setBll_comment(@d BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListLikeCommentBase}, this, changeQuickRedirect, false, 27999, new Class[]{BBSLinkListLikeCommentBase.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSLinkListLikeCommentBase, "<set-?>");
        this.f80993d = bBSLinkListLikeCommentBase;
    }

    public final void setBll_dislike(@d BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListLikeCommentBase}, this, changeQuickRedirect, false, 27997, new Class[]{BBSLinkListLikeCommentBase.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSLinkListLikeCommentBase, "<set-?>");
        this.f80992c = bBSLinkListLikeCommentBase;
    }

    public final void setBll_like(@d BBSLinkListLikeCommentBase bBSLinkListLikeCommentBase) {
        if (PatchProxy.proxy(new Object[]{bBSLinkListLikeCommentBase}, this, changeQuickRedirect, false, 27995, new Class[]{BBSLinkListLikeCommentBase.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bBSLinkListLikeCommentBase, "<set-?>");
        this.f80991b = bBSLinkListLikeCommentBase;
    }

    public final void setCommentOnClickListener(@e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 28005, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        getBll_comment().setOnClickListener(onClickListener);
    }

    public final void setDarkStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getBll_comment().setDarkStyle();
        getBll_like().setDarkStyle();
        getBll_dislike().setDarkStyle();
    }

    public final void setDislikeOnClickListener(@e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 28004, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        getBll_dislike().setOnClickListener(onClickListener);
    }

    public final void setLikeOnClickListener(@e View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, 28003, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        getBll_like().setOnClickListener(onClickListener);
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 28002, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int i10 = a.f80994a[type.ordinal()];
        if (i10 == 1) {
            getBll_dislike().setVisibility(8);
            getBll_comment().setVisibility(0);
            return;
        }
        if (i10 == 2) {
            getBll_dislike().setVisibility(0);
            getBll_comment().setVisibility(8);
        } else if (i10 == 3) {
            getBll_dislike().setVisibility(8);
            getBll_comment().setVisibility(8);
        } else {
            if (i10 != 4) {
                return;
            }
            getBll_dislike().setVisibility(8);
            getBll_like().setVisibility(8);
        }
    }
}
