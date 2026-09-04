package com.max.hbsearch.adapter;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbsearch.R;
import com.max.hbsearch.bean.HotSearchListItemImage;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: HotSearchListItemAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final /* synthetic */ void a(ImageView imageView, Integer num) {
        if (PatchProxy.proxy(new Object[]{imageView, num}, null, changeQuickRedirect, true, bb.c.k.J6, new Class[]{ImageView.class, Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        c(imageView, num);
    }

    public static final /* synthetic */ void b(TextView textView, int i10, int i11) {
        Object[] objArr = {textView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.I6, new Class[]{TextView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        d(textView, i10, i11);
    }

    private static final void c(ImageView imageView, Integer num) {
        if (PatchProxy.proxy(new Object[]{imageView, num}, null, changeQuickRedirect, true, bb.c.k.G6, new Class[]{ImageView.class, Integer.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int code = HotSearchListItemImage.ImageStyle.LandscapeImage.getCode();
        if (num != null && num.intValue() == code) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = ViewUtils.f(imageView.getContext(), 36.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(imageView.getContext(), 20.0f);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setBackground(new ColorDrawable(0));
        } else {
            int code2 = HotSearchListItemImage.ImageStyle.SquareImage.getCode();
            if (num != null && num.intValue() == code2) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = ViewUtils.f(imageView.getContext(), 28.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(imageView.getContext(), 28.0f);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setBackground(new ColorDrawable(0));
            } else {
                int code3 = HotSearchListItemImage.ImageStyle.SquareInLandscapeImage.getCode();
                if (num != null && num.intValue() == code3) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = ViewUtils.f(imageView.getContext(), 36.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(imageView.getContext(), 20.0f);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView.setBackground(new ColorDrawable(imageView.getContext().getColor(R.color.divider_secondary_2_color)));
                }
            }
        }
        imageView.setLayoutParams(layoutParams2);
    }

    private static final void d(TextView textView, int i10, int i11) {
        Object[] objArr = {textView, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.H6, new Class[]{TextView.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        textView.getPaint().setShader(new LinearGradient(0.0f, textView.getHeight(), textView.getWidth(), 0.0f, i10, i11, Shader.TileMode.CLAMP));
    }
}
