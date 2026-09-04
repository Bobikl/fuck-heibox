package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.commentimagepainter.sharecard.ShareCardDrawUtilsKt;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.RectObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkImagePositionObj;
import com.max.xiaoheihe.module.bbs.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: BBSLinkImageContentViewV2.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSLinkImageContentViewV2 extends ConstraintLayout {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public TextView J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BBSLinkImageContentViewV2(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BBSLinkImageContentViewV2(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BBSLinkImageContentViewV2(@d Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BBSLinkImageContentViewV2(@d Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.p(context, "context");
        D();
    }

    private final void C(BBSLinkImagePositionObj bBSLinkImagePositionObj, List<String> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{bBSLinkImagePositionObj, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27601, new Class[]{BBSLinkImagePositionObj.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!c.u(bBSLinkImagePositionObj.getImg_cnt())) {
            getTv_img_cnt().setText((char) 20849 + bBSLinkImagePositionObj.getImg_cnt() + (char) 24352);
        } else if (list.size() > 10) {
            getTv_img_cnt().setText(getContext().getResources().getString(R.string.more_than_ten_images));
        } else {
            TextView tv_img_cnt = getTv_img_cnt();
            v0 v0Var = v0.f124986a;
            String string = getContext().getResources().getString(R.string.img_count_format);
            f0.o(string, "context.resources.getStr….string.img_count_format)");
            String str = String.format(string, Arrays.copyOf(new Object[]{list.size() + ""}, 1));
            f0.o(str, "format(format, *args)");
            tv_img_cnt.setText(str);
        }
        float fH0 = ViewUtils.h0(getContext(), ViewUtils.n(getContext(), ViewUtils.L(getContext()) / 3, ViewUtils.L(getContext()) / 3, ViewUtils.ViewType.IMAGE));
        int iF = ViewUtils.f(getContext(), 0.5f);
        if ("1".equals(bBSLinkImagePositionObj.getMore_img())) {
            getTv_img_cnt().setBackgroundDrawable(q.H(getContext(), R.color.black_alpha50, fH0));
            ViewGroup.LayoutParams layoutParams = getTv_img_cnt().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.f19300h = 0;
            layoutParams2.f19306k = -1;
            layoutParams2.setMargins(iF, iF, iF, iF);
        } else {
            getTv_img_cnt().setBackgroundDrawable(q.u(getContext(), R.color.black_alpha50, fH0));
            ViewGroup.LayoutParams layoutParams3 = getTv_img_cnt().getLayoutParams();
            f0.n(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.f19300h = -1;
            layoutParams4.f19306k = 0;
            layoutParams4.setMargins(iF, iF, iF, iF);
        }
        if (!c.u(bBSLinkImagePositionObj.getImg_number_right_expression())) {
            ViewGroup.LayoutParams layoutParams5 = getTv_img_cnt().getLayoutParams();
            f0.n(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            float fL = ViewUtils.L(getContext());
            Resources resources = getContext().getResources();
            f0.o(resources, "context.resources");
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams5)).rightMargin = (int) (((fL - ShareCardDrawUtilsKt.d(24.0f, resources)) - UiKitUtil.f73232a.c(bBSLinkImagePositionObj.getImg_number_right_expression())) + iF);
        }
        getTv_img_cnt().setVisibility(0);
        addView(getTv_img_cnt());
    }

    private final void D() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27597, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setTv_img_cnt(new TextView(getContext()));
        getTv_img_cnt().setId(R.id.tv_img_cnt);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f19298g = 0;
        int iF = ViewUtils.f(getContext(), 4.0f);
        int iF2 = ViewUtils.f(getContext(), 2.5f);
        getTv_img_cnt().setPadding(iF, iF2, iF, iF2);
        getTv_img_cnt().setTextColor(getContext().getResources().getColor(R.color.white));
        getTv_img_cnt().setTextSize(1, 10.0f);
        bb.d.d(getTv_img_cnt(), 2);
        getTv_img_cnt().setIncludeFontPadding(false);
        getTv_img_cnt().setVisibility(8);
        addView(getTv_img_cnt(), layoutParams);
    }

    private final ImageView E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27598, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        int iN = ViewUtils.n(getContext(), ViewUtils.L(getContext()) / 3, ViewUtils.L(getContext()) / 3, ViewUtils.ViewType.IMAGE);
        int iF = ViewUtils.f(getContext(), 0.5f);
        int color = getContext().getResources().getColor(R.color.divider_secondary_1_color);
        QMUIRadiusImageView qMUIRadiusImageView = new QMUIRadiusImageView(getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f19300h = 0;
        layoutParams.f19292d = 0;
        qMUIRadiusImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        qMUIRadiusImageView.setCornerRadius(iN);
        qMUIRadiusImageView.setBorderWidth(iF);
        qMUIRadiusImageView.setBorderColor(color);
        addView(qMUIRadiusImageView, layoutParams);
        return qMUIRadiusImageView;
    }

    private final void F(RectObj rectObj, ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{rectObj, imageView}, this, changeQuickRedirect, false, 27599, new Class[]{RectObj.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = ViewUtils.f(getContext(), n.p(rectObj.getWidth()));
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(getContext(), n.p(rectObj.getHeight()));
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = ViewUtils.f(getContext(), n.p(rectObj.getLeft()));
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(getContext(), n.p(rectObj.getTop()));
    }

    @d
    public final TextView getTv_img_cnt() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27595, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_img_cnt");
        return null;
    }

    public final void setImages(@d BBSLinkImagePositionObj positionObj, @e List<String> list, boolean z10) {
        if (PatchProxy.proxy(new Object[]{positionObj, list, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27600, new Class[]{BBSLinkImagePositionObj.class, List.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(positionObj, "positionObj");
        if (list == null) {
            return;
        }
        removeView(getTv_img_cnt());
        String strH3 = CollectionsKt___CollectionsKt.h3(list, ";", null, null, 0, null, null, 62, null);
        int iMax = Math.max(positionObj.getImgs().size(), getChildCount());
        for (int i10 = 0; i10 < iMax; i10++) {
            View childAt = getChildAt(i10);
            ImageView imageViewE = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (imageViewE == null) {
                imageViewE = E();
            }
            imageViewE.setVisibility(0);
            if (i10 < positionObj.getImgs().size()) {
                F(positionObj.getImgs().get(i10), imageViewE);
                b.A(list.get(i10), imageViewE, strH3, -1, i10, z10);
            } else {
                imageViewE.setVisibility(8);
            }
        }
        if (list.size() > positionObj.getImgs().size()) {
            C(positionObj, list, z10);
        }
    }

    public final void setTv_img_cnt(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27596, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.J = textView;
    }
}
