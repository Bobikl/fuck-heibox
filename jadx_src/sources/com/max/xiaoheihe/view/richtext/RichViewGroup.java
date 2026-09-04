package com.max.xiaoheihe.view.richtext;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.google.gson.Gson;
import com.max.hbcommon.utils.c;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.router.b;
import com.max.xiaoheihe.bean.AttrObj;
import com.max.xiaoheihe.bean.InsetObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RichViewGroup.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class RichViewGroup extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f96107c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private RichAttributeModelObj f96108b;

    /* JADX INFO: compiled from: RichViewGroup.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RichAttributeModelObj f96110c;

        a(RichAttributeModelObj richAttributeModelObj) {
            this.f96110c = richAttributeModelObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49667, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = RichViewGroup.this.getContext();
            f0.o(context, "context");
            b.k0(context, this.f96110c.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichViewGroup(@d Context context) {
        super(context);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichViewGroup(@d Context context, @d AttributeSet attrs) {
        super(context, attrs);
        f0.p(context, "context");
        f0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichViewGroup(@d Context context, @d AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        f0.p(context, "context");
        f0.p(attrs, "attrs");
    }

    private final View a(AttrObj attrObj) {
        String type;
        String text;
        String text2;
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attrObj}, this, changeQuickRedirect, false, 49666, new Class[]{AttrObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (attrObj == null || (type = attrObj.getType()) == null) {
            return null;
        }
        switch (type) {
            case "spacer":
                View view = new View(getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(Math.max(1, ViewUtils.f(getContext(), n.p(attrObj.getWidth()))), Math.max(1, ViewUtils.f(getContext(), n.p(attrObj.getHeight())))));
                return view;
            case "line":
                View view2 = new View(getContext());
                int iF = ViewUtils.f(getContext(), attrObj.getWidth() != null ? n.p(attrObj.getWidth()) : 0.5f);
                int iF2 = ViewUtils.f(getContext(), n.p(attrObj.getHeight()));
                int iE1 = attrObj.getColor() != null ? com.max.xiaoheihe.utils.d.e1(attrObj.getColor()) : getContext().getResources().getColor(R.color.divider_primary_1_color);
                Drawable drawableX = ViewUtils.x(0, iE1, iE1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF2);
                view2.setBackground(drawableX);
                String offset = attrObj.getOffset();
                if (offset != null && offset.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = ViewUtils.f(getContext(), n.p(attrObj.getOffset()));
                }
                view2.setLayoutParams(layoutParams);
                return view2;
            case "text":
                String text3 = attrObj.getText();
                if (text3 == null || text3.length() == 0) {
                    return null;
                }
                TextView textView = new TextView(getContext());
                int iE2 = com.max.xiaoheihe.utils.d.e1(attrObj.getColor());
                float fP = n.p(attrObj.getFont_size());
                Typeface typefaceN = UiKitUtil.n(attrObj.getFont_name(), false, 2, null);
                String background_color = attrObj.getBackground_color();
                if (!(background_color == null || background_color.length() == 0)) {
                    textView.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(attrObj.getBackground_color()));
                }
                textView.setTextColor(iE2);
                textView.setTextSize(1, fP);
                textView.setTypeface(typefaceN);
                textView.setIncludeFontPadding(false);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(attrObj.getText());
                String underline_color = attrObj.getUnderline_color();
                if (underline_color != null && underline_color.length() != 0) {
                    z10 = false;
                }
                if (!z10 && (text2 = attrObj.getText()) != null) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), 0, text2.length(), 17);
                }
                if (!c.u(attrObj.getStrike_style()) && (text = attrObj.getText()) != null) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, text.length(), 17);
                }
                textView.setText(spannableStringBuilder);
                int iF3 = ViewUtils.f(getContext(), n.p(attrObj.getLine_height()));
                if (iF3 <= 0) {
                    iF3 = -2;
                }
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, iF3);
                layoutParams2.topMargin = ViewUtils.f(getContext(), n.p(attrObj.getOffset()));
                RichAttributeModelObj richAttributeModelObj = this.f96108b;
                if (f0.g("1", richAttributeModelObj != null ? richAttributeModelObj.getText_alignment() : null)) {
                    textView.setGravity(8388627);
                } else {
                    textView.setGravity(8388691);
                }
                textView.setLayoutParams(layoutParams2);
                return textView;
            case "image":
                String image = attrObj.getImage();
                if ((image == null || image.length() == 0) || n.q(attrObj.getWidth()) <= 0 || n.q(attrObj.getHeight()) <= 0) {
                    return null;
                }
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), n.p(attrObj.getWidth())), ViewUtils.f(getContext(), n.p(attrObj.getHeight())));
                String offset2 = attrObj.getOffset();
                if (offset2 != null && offset2.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    layoutParams3.topMargin = 0;
                } else {
                    layoutParams3.topMargin = ViewUtils.f(getContext(), n.p(attrObj.getOffset()));
                }
                float fP2 = n.p(attrObj.getCorner_radius());
                com.max.hbimage.b.d0(!c.u(attrObj.getImage_new()) ? attrObj.getImage_new() : attrObj.getImage(), imageView, fP2 > 0.0f ? ViewUtils.f(getContext(), fP2) : 0);
                imageView.setLayoutParams(layoutParams3);
                imageView.clearColorFilter();
                String image_color = attrObj.getImage_color();
                if (image_color != null) {
                    imageView.setColorFilter(com.max.xiaoheihe.utils.d.e1(image_color));
                }
                return imageView;
            default:
                return null;
        }
    }

    private final void b(List<AttrObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 49665, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        Iterator<AttrObj> it = list.iterator();
        while (it.hasNext()) {
            View viewA = a(it.next());
            if (viewA != null) {
                addView(viewA);
            }
        }
    }

    public static /* synthetic */ void setRichText$default(RichViewGroup richViewGroup, RichAttributeModelObj richAttributeModelObj, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{richViewGroup, richAttributeModelObj, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 49664, new Class[]{RichViewGroup.class, RichAttributeModelObj.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        richViewGroup.setRichText(richAttributeModelObj, z10);
    }

    @e
    public final RichAttributeModelObj getMRichTextObj() {
        return this.f96108b;
    }

    public final void setMRichTextObj(@e RichAttributeModelObj richAttributeModelObj) {
        this.f96108b = richAttributeModelObj;
    }

    public final void setRichText(@e RichAttributeModelObj richAttributeModelObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{richAttributeModelObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 49663, new Class[]{RichAttributeModelObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        removeAllViews();
        if (richAttributeModelObj != null) {
            richAttributeModelObj = (RichAttributeModelObj) k.a(q.Q(k.p(richAttributeModelObj), getContext(), z10), RichAttributeModelObj.class);
        }
        this.f96108b = richAttributeModelObj;
        if (richAttributeModelObj != null) {
            String background_color = richAttributeModelObj.getBackground_color();
            int iE1 = background_color != null ? com.max.xiaoheihe.utils.d.e1(background_color) : 0;
            String border_color = richAttributeModelObj.getBorder_color();
            int iE2 = !(border_color == null || border_color.length() == 0) ? com.max.xiaoheihe.utils.d.e1(richAttributeModelObj.getBorder_color()) : iE1;
            float fP = richAttributeModelObj.getBorder_width() != null ? n.p(richAttributeModelObj.getBorder_width()) : 0.0f;
            String corner_radius = richAttributeModelObj.getCorner_radius();
            setBackground(q.O(q.v(getContext(), iE1, corner_radius != null ? n.p(corner_radius) : 0.0f), getContext(), iE2, fP));
            setGravity(16);
            String text_alignment = richAttributeModelObj.getText_alignment();
            if (text_alignment != null) {
                if (f0.g(text_alignment, "0")) {
                    setGravity(80);
                } else if (f0.g(text_alignment, "1")) {
                    setGravity(16);
                }
            }
            InsetObj inset = richAttributeModelObj.getInset();
            if (inset != null) {
                setPadding(ViewUtils.f(getContext(), inset.getLeft()), ViewUtils.f(getContext(), inset.getTop()), ViewUtils.f(getContext(), inset.getRight()), ViewUtils.f(getContext(), inset.getBottom()));
            }
            String height = richAttributeModelObj.getHeight();
            if (height != null) {
                if (getLayoutParams() == null) {
                    setLayoutParams(new ViewGroup.LayoutParams(-2, ViewUtils.f(getContext(), Float.parseFloat(height))));
                } else {
                    getLayoutParams().height = ViewUtils.f(getContext(), Float.parseFloat(height));
                }
            }
            if (c.u(richAttributeModelObj.getProtocol())) {
                callOnClick();
            } else {
                setOnClickListener(new a(richAttributeModelObj));
            }
            b(richAttributeModelObj.getAttrs());
        }
    }

    public final void setRichText(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49662, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        setRichText$default(this, (RichAttributeModelObj) new Gson().fromJson(str, RichAttributeModelObj.class), false, 2, null);
    }
}
