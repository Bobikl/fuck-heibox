package com.max.hbcommon.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbcommon.bean.NewFilterObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FilterCheckedListView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FilterCheckedListView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f67001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f67002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private a f67003d;

    /* JADX INFO: compiled from: FilterCheckedListView.kt */
    public interface a {
        void a(@dl.d NewFilterObj newFilterObj);

        void b();
    }

    public FilterCheckedListView(@dl.e Context context) {
        this(context, null);
    }

    public FilterCheckedListView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterCheckedListView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FilterCheckedListView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        d();
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31434o7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        horizontalScrollView.setFillViewport(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        int i10 = R.id.tv_reset;
        layoutParams.addRule(0, i10);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 12.0f);
        addView(horizontalScrollView, layoutParams);
        setLl_items(new LinearLayout(getContext()));
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        getLl_items().setGravity(16);
        horizontalScrollView.addView(getLl_items(), layoutParams2);
        setTv_reset(new TextView(getContext()));
        getTv_reset().setId(i10);
        getTv_reset().setTextSize(1, 13.0f);
        getTv_reset().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        getTv_reset().setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams3.addRule(15);
        layoutParams3.addRule(11);
        int iF = ViewUtils.f(getContext(), 11.0f);
        getTv_reset().setPadding(iF, 0, iF, 0);
        getTv_reset().setText(R.string.reset);
        addView(getTv_reset(), layoutParams3);
        getTv_reset().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterCheckedListView.e(this.f67715b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(FilterCheckedListView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31524s7, new Class[]{FilterCheckedListView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.h();
        a aVar = this$0.f67003d;
        if (aVar != null) {
            aVar.b();
        }
    }

    private final View f(final NewFilterObj newFilterObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{newFilterObj}, this, changeQuickRedirect, false, bb.c.d.f31480q7, new Class[]{NewFilterObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        final LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackgroundResource(R.drawable.btn_divider_bg_tile_border_2dp);
        TextView textView = new TextView(getContext());
        textView.setText(newFilterObj.getDesc());
        textView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        textView.setTextSize(1, 12.0f);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ViewUtils.f(getContext(), 24.0f));
        layoutParams.leftMargin = ViewUtils.f(getContext(), 6.0f);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.special_close_small_line_24x24);
        imageView.setColorFilter(getContext().getResources().getColor(R.color.text_secondary_2_color));
        int iF = ViewUtils.f(getContext(), 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF, iF);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 4.0f);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 4.0f);
        linearLayout.addView(imageView, layoutParams2);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterCheckedListView.g(this.f67711b, linearLayout, newFilterObj, view);
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(FilterCheckedListView this$0, LinearLayout ll2, NewFilterObj filter, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, ll2, filter, view}, null, changeQuickRedirect, true, bb.c.d.f31546t7, new Class[]{FilterCheckedListView.class, LinearLayout.class, NewFilterObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(ll2, "$ll");
        kotlin.jvm.internal.f0.p(filter, "$filter");
        this$0.getLl_items().removeView(ll2);
        a aVar = this$0.f67003d;
        if (aVar != null) {
            aVar.a(filter);
        }
    }

    public final void c(@dl.e NewFilterObj newFilterObj) {
        if (PatchProxy.proxy(new Object[]{newFilterObj}, this, changeQuickRedirect, false, bb.c.d.f31457p7, new Class[]{NewFilterObj.class}, Void.TYPE).isSupported || newFilterObj == null) {
            return;
        }
        View viewF = f(newFilterObj);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 6.0f);
        getLl_items().addView(viewF, layoutParams);
    }

    @dl.d
    public final LinearLayout getLl_items() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31388m7, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f67002c;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.f0.S("ll_items");
        return null;
    }

    @dl.e
    public final a getMListener() {
        return this.f67003d;
    }

    @dl.d
    public final TextView getTv_reset() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31342k7, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67001b;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_reset");
        return null;
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31502r7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getLl_items().removeAllViews();
    }

    public final void setLl_items(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, bb.c.d.f31411n7, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linearLayout, "<set-?>");
        this.f67002c = linearLayout;
    }

    public final void setMListener(@dl.e a aVar) {
        this.f67003d = aVar;
    }

    public final void setTv_reset(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.f31365l7, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67001b = textView;
    }
}
