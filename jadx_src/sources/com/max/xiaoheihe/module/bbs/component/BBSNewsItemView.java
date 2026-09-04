package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbcustomview.roundedview.HBRoundedCornerImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.news.viewholderbinder.h0;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSNewsItemView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSNewsItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f80813m = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f80814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f80815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HBLineHeightTextView f80816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f80817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f80818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f80819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f80820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f80821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f80822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f80823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f80824l;

    public BBSNewsItemView(@e Context context) {
        this(context, null);
    }

    public BBSNewsItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSNewsItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSNewsItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27638, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        f0.o(context, "context");
        HBRoundedCornerImageView hBRoundedCornerImageView = new HBRoundedCornerImageView(context, null, 0, 6, null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 125.0f), ViewUtils.f(getContext(), 70.0f));
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 12.0f);
        hBRoundedCornerImageView.setCornerRadius(ViewUtils.n(getContext(), layoutParams.width, layoutParams.height, ViewUtils.ViewType.IMAGE));
        setIv_img(hBRoundedCornerImageView);
        getIv_img().setId(R.id.iv_img);
        getIv_img().setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(getIv_img(), layoutParams);
        setTv_internal_tag(new TextView(getContext()));
        getTv_internal_tag().setId(R.id.tv_internal_tag);
        getTv_internal_tag().setText("内网可见");
        getTv_internal_tag().setTextSize(1, 8.0f);
        getTv_internal_tag().setTextColor(getContext().getResources().getColor(R.color.red));
        getTv_internal_tag().setBackgroundResource(R.drawable.bg_internal_tag);
        getTv_internal_tag().setPadding(ViewUtils.f(getContext(), 2.0f), ViewUtils.f(getContext(), 2.0f), ViewUtils.f(getContext(), 2.0f), ViewUtils.f(getContext(), 2.0f));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(6, R.id.iv_img);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 12.0f);
        getTv_internal_tag().setVisibility(8);
        addView(getTv_internal_tag(), layoutParams2);
        setIv_video_play(new ImageView(getContext()));
        getIv_video_play().setId(R.id.iv_video_play);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 38.0f), ViewUtils.f(getContext(), 30.0f));
        layoutParams3.addRule(5, R.id.iv_img);
        layoutParams3.addRule(7, R.id.iv_img);
        layoutParams3.addRule(15);
        getIv_video_play().setImageResource(R.drawable.ic_media_play_btn_large);
        getIv_video_play().setVisibility(8);
        addView(getIv_video_play(), layoutParams3);
        Context context2 = getContext();
        f0.o(context2, "context");
        setTv_title(new HBLineHeightTextView(context2));
        getTv_title().setId(R.id.tv_title);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = ViewUtils.f(getContext(), 12.0f);
        layoutParams4.topMargin = ViewUtils.f(getContext(), 13.0f);
        layoutParams4.rightMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams4.addRule(0, R.id.iv_img);
        getTv_title().setEllipsize(TextUtils.TruncateAt.END);
        getTv_title().setCustomLineHeight(ViewUtils.f(getContext(), 23.0f));
        getTv_title().setIncludeFontPadding(false);
        getTv_title().setMaxLines(2);
        getTv_title().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        getTv_title().setTextSize(1, 15.0f);
        getTv_title().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        addView(getTv_title(), layoutParams4);
        View viewInflate = View.inflate(getContext(), R.layout.layout_concept_feeds_item_bottombar, null);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(12);
        layoutParams5.leftMargin = ViewUtils.f(getContext(), 12.0f);
        layoutParams5.rightMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams5.bottomMargin = ViewUtils.f(getContext(), 13.0f);
        layoutParams5.addRule(0, R.id.iv_img);
        addView(viewInflate, layoutParams5);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_desc);
        f0.o(viewFindViewById, "bottom_bar.findViewById(R.id.tv_desc)");
        setTv_desc((TextView) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(R.id.iv_not_interested);
        f0.o(viewFindViewById2, "bottom_bar.findViewById(R.id.iv_not_interested)");
        setIv_not_interested((ImageView) viewFindViewById2);
        View viewFindViewById3 = viewInflate.findViewById(R.id.ll_comment);
        f0.o(viewFindViewById3, "bottom_bar.findViewById(R.id.ll_comment)");
        setLl_comment((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = viewInflate.findViewById(R.id.iv_comment);
        f0.o(viewFindViewById4, "bottom_bar.findViewById(R.id.iv_comment)");
        setIv_comment((ImageView) viewFindViewById4);
        View viewFindViewById5 = viewInflate.findViewById(R.id.tv_comment);
        f0.o(viewFindViewById5, "bottom_bar.findViewById(R.id.tv_comment)");
        setTv_comment((TextView) viewFindViewById5);
        View viewFindViewById6 = viewInflate.findViewById(R.id.ll_rich_tags);
        f0.o(viewFindViewById6, "bottom_bar.findViewById(R.id.ll_rich_tags)");
        setLl_rich_tags((LinearLayout) viewFindViewById6);
        View viewInflate2 = View.inflate(getContext(), R.layout.divider_concept, null);
        f0.o(viewInflate2, "inflate(context, R.layout.divider_concept, null)");
        setDivider(viewInflate2);
        getDivider().setId(R.id.divider);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f));
        layoutParams6.addRule(12);
        getDivider().setVisibility(8);
        addView(getDivider(), layoutParams6);
    }

    public final void b(@e List<RichAttributeModelObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 27645, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        getLl_rich_tags().removeAllViews();
        if (c.w(list)) {
            getLl_rich_tags().setVisibility(8);
            return;
        }
        getLl_rich_tags().setVisibility(0);
        f0.m(list);
        Iterator<RichAttributeModelObj> it = list.iterator();
        while (it.hasNext()) {
            RichViewGroup richViewGroupS0 = r1.s0(getContext(), it.next());
            if (richViewGroupS0 != null) {
                getLl_rich_tags().addView(richViewGroupS0);
            }
        }
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27644, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_internal_tag().setVisibility(z10 ? 0 : 8);
    }

    @d
    public final View getDivider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27636, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f80824l;
        if (view != null) {
            return view;
        }
        f0.S(SearchHelper.E);
        return null;
    }

    @d
    public final ImageView getIv_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27628, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80820h;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_comment");
        return null;
    }

    @d
    public final ImageView getIv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27616, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80814b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_img");
        return null;
    }

    @d
    public final ImageView getIv_not_interested() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27624, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80818f;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_not_interested");
        return null;
    }

    @d
    public final ImageView getIv_video_play() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27618, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80815c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_video_play");
        return null;
    }

    @d
    public final LinearLayout getLl_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27626, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80819g;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_comment");
        return null;
    }

    @d
    public final LinearLayout getLl_rich_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27632, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80822j;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_rich_tags");
        return null;
    }

    @d
    public final TextView getTv_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27630, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80821i;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_comment");
        return null;
    }

    @d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27622, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80817e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @d
    public final TextView getTv_internal_tag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27634, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80823k;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_internal_tag");
        return null;
    }

    @d
    public final HBLineHeightTextView getTv_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27620, new Class[0], HBLineHeightTextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (HBLineHeightTextView) patchProxyResultProxy.result;
        }
        HBLineHeightTextView hBLineHeightTextView = this.f80816d;
        if (hBLineHeightTextView != null) {
            return hBLineHeightTextView;
        }
        f0.S("tv_title");
        return null;
    }

    public final void setComment(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27642, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_comment().setText(str);
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27641, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setDivider(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 27637, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f80824l = view;
    }

    public final void setImgRadius(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 27643, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView iv_img = getIv_img();
        HBRoundedCornerImageView hBRoundedCornerImageView = iv_img instanceof HBRoundedCornerImageView ? (HBRoundedCornerImageView) iv_img : null;
        if (hBRoundedCornerImageView == null) {
            return;
        }
        hBRoundedCornerImageView.setCornerRadius(i10);
    }

    public final void setIv_comment(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27629, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80820h = imageView;
    }

    public final void setIv_img(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27617, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80814b = imageView;
    }

    public final void setIv_not_interested(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27625, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80818f = imageView;
    }

    public final void setIv_video_play(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27619, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80815c = imageView;
    }

    public final void setLl_comment(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27627, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80819g = linearLayout;
    }

    public final void setLl_rich_tags(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27633, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80822j = linearLayout;
    }

    public final void setTagTitle(@e String str, @e String str2, int i10) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Integer(i10)}, this, changeQuickRedirect, false, 27640, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        h0.f91435i.d(getTv_title(), str, str2, i10);
    }

    public final void setTitle(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27639, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_title().setText(str);
    }

    public final void setTv_comment(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27631, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80821i = textView;
    }

    public final void setTv_desc(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27623, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80817e = textView;
    }

    public final void setTv_internal_tag(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27635, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80823k = textView;
    }

    public final void setTv_title(@d HBLineHeightTextView hBLineHeightTextView) {
        if (PatchProxy.proxy(new Object[]{hBLineHeightTextView}, this, changeQuickRedirect, false, 27621, new Class[]{HBLineHeightTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hBLineHeightTextView, "<set-?>");
        this.f80816d = hBLineHeightTextView;
    }
}
