package com.max.xiaoheihe.view.richtext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.o;
import com.google.gson.Gson;
import com.max.hbcustomview.spans.g;
import com.max.hbcustomview.spans.h;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
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
import kotlin.jvm.internal.u;
import kotlin.k;

/* JADX INFO: compiled from: RichTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@k(message = "RichTextView已弃用，请使用RichViewGroup")
@o(parameters = 0)
public final class RichTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f96093e = "text";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f96094f = "spacer";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final String f96095g = "image";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final String f96096h = "line";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f96097i = "spacer";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f96098j = "image";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    public static final String f96099k = "line";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private RichAttributeModelObj f96100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    public static final a f96091c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f96092d = 8;

    /* JADX INFO: compiled from: RichTextView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RichTextView.kt */
    public static final class b implements com.max.hbimage.b.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f96102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AttrObj f96103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f96104d;

        b(SpannableStringBuilder spannableStringBuilder, AttrObj attrObj, int i10) {
            this.f96102b = spannableStringBuilder;
            this.f96103c = attrObj;
            this.f96104d = i10;
        }

        @Override // com.max.hbimage.b.q
        public void a(@e Drawable drawable) {
            if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 49660, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
                return;
            }
            RichTextView.f(RichTextView.this, this.f96102b, this.f96103c, drawable, this.f96104d);
        }

        @Override // com.max.hbimage.b.q
        public /* synthetic */ void b(Drawable drawable) {
            com.max.hbimage.d.a(this, drawable);
        }

        @Override // com.max.hbimage.b.q
        public void onLoadFailed(@e Drawable drawable) {
        }
    }

    /* JADX INFO: compiled from: RichTextView.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RichAttributeModelObj f96106c;

        c(RichAttributeModelObj richAttributeModelObj) {
            this.f96106c = richAttributeModelObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 49661, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = RichTextView.this.getContext();
            f0.o(context, "context");
            com.max.xiaoheihe.base.router.b.k0(context, this.f96106c.getProtocol());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextView(@d Context context) {
        super(context);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextView(@d Context context, @d AttributeSet attrs) {
        super(context, attrs);
        f0.p(context, "context");
        f0.p(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichTextView(@d Context context, @d AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        f0.p(context, "context");
        f0.p(attrs, "attrs");
        setIncludeFontPadding(false);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final /* synthetic */ void f(RichTextView richTextView, SpannableStringBuilder spannableStringBuilder, AttrObj attrObj, Drawable drawable, int i10) {
        if (PatchProxy.proxy(new Object[]{richTextView, spannableStringBuilder, attrObj, drawable, new Integer(i10)}, null, changeQuickRedirect, true, 49659, new Class[]{RichTextView.class, SpannableStringBuilder.class, AttrObj.class, Drawable.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        richTextView.g(spannableStringBuilder, attrObj, drawable, i10);
    }

    private final void g(SpannableStringBuilder spannableStringBuilder, AttrObj attrObj, Drawable drawable, int i10) {
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder, attrObj, drawable, new Integer(i10)}, this, changeQuickRedirect, false, 49657, new Class[]{SpannableStringBuilder.class, AttrObj.class, Drawable.class, Integer.TYPE}, Void.TYPE).isSupported || drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, ViewUtils.f(getContext(), n.p(attrObj.getWidth())), ViewUtils.f(getContext(), n.p(attrObj.getHeight())));
        String offset = attrObj.getOffset();
        spannableStringBuilder.setSpan(offset == null || offset.length() == 0 ? new com.max.hbcustomview.spans.a(drawable) : new h(drawable, ViewUtils.f(getContext(), n.p(attrObj.getOffset()))), i10, i10 + 5, 33);
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void h(SpannableStringBuilder spannableStringBuilder, AttrObj attrObj, int i10) {
        String type;
        if (PatchProxy.proxy(new Object[]{spannableStringBuilder, attrObj, new Integer(i10)}, this, changeQuickRedirect, false, 49656, new Class[]{SpannableStringBuilder.class, AttrObj.class, Integer.TYPE}, Void.TYPE).isSupported || attrObj == null || (type = attrObj.getType()) == null) {
            return;
        }
        switch (type.hashCode()) {
            case -896192468:
                if (type.equals("spacer")) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ViewUtils.f(getContext(), n.p(attrObj.getWidth())), 1, Bitmap.Config.ARGB_8888);
                    f0.o(bitmapCreateBitmap, "createBitmap(\n          …888\n                    )");
                    spannableStringBuilder.setSpan(new ImageSpan(getContext(), bitmapCreateBitmap), i10, i10 + 6, 33);
                    break;
                }
                break;
            case 3321844:
                if (type.equals("line")) {
                    int iF = ViewUtils.f(getContext(), attrObj.getWidth() != null ? n.p(attrObj.getWidth()) : 0.5f);
                    int iF2 = ViewUtils.f(getContext(), n.p(attrObj.getHeight()));
                    int iE1 = attrObj.getColor() != null ? com.max.xiaoheihe.utils.d.e1(attrObj.getColor()) : getContext().getResources().getColor(R.color.divider_primary_1_color);
                    Drawable drawableX = ViewUtils.x(0, iE1, iE1);
                    drawableX.setBounds(0, 0, iF, iF2);
                    String offset = attrObj.getOffset();
                    spannableStringBuilder.setSpan(offset == null || offset.length() == 0 ? new com.max.hbcustomview.spans.a(drawableX) : new h(drawableX, ViewUtils.f(getContext(), n.p(attrObj.getOffset()))), i10, i10 + 4, 33);
                    break;
                }
                break;
            case 3556653:
                if (type.equals("text")) {
                    String text = attrObj.getText();
                    if (!(text == null || text.length() == 0)) {
                        int iE2 = com.max.xiaoheihe.utils.d.e1(attrObj.getColor());
                        int iQ = n.q(attrObj.getFont_size());
                        Typeface typefaceN = UiKitUtil.n(attrObj.getFont_name(), false, 2, null);
                        String text2 = attrObj.getText();
                        f0.m(text2);
                        int length = text2.length() + i10;
                        String background_color = attrObj.getBackground_color();
                        if (!(background_color == null || background_color.length() == 0)) {
                            int iE3 = com.max.xiaoheihe.utils.d.e1(attrObj.getBackground_color());
                            Paint paint = new Paint();
                            paint.setTextSize(ViewUtils.f(getContext(), iQ));
                            paint.setTypeface(getTypeface());
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(iE3), i10, length, 17);
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(iE2), i10, length, 17);
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(iQ, true), i10, length, 17);
                        spannableStringBuilder.setSpan(new g(typefaceN), i10, length, 17);
                        String underline_color = attrObj.getUnderline_color();
                        if (!(underline_color == null || underline_color.length() == 0)) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 17);
                        }
                        if (!com.max.hbcommon.utils.c.u(attrObj.getStrike_style())) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, length, 17);
                        }
                    }
                }
                break;
            case 100313435:
                if (type.equals("image")) {
                    String image = attrObj.getImage();
                    if (!(image == null || image.length() == 0) && n.q(attrObj.getWidth()) > 0 && n.q(attrObj.getHeight()) > 0) {
                        g(spannableStringBuilder, attrObj, getContext().getResources().getDrawable(R.drawable.common_default_placeholder_375x210), i10);
                        com.max.hbimage.b.W(getContext(), ViewUtils.f(getContext(), n.p(attrObj.getWidth())), ViewUtils.f(getContext(), n.p(attrObj.getHeight())), attrObj.getImage(), new b(spannableStringBuilder, attrObj, i10));
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void i(List<AttrObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 49655, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
            return;
        }
        String str = "";
        for (AttrObj attrObj : list) {
            String type = attrObj.getType();
            if (type != null) {
                switch (type.hashCode()) {
                    case -896192468:
                        if (type.equals("spacer")) {
                            str = str + "spacer";
                        }
                        break;
                    case 3321844:
                        if (type.equals("line")) {
                            str = str + "line";
                        }
                        break;
                    case 3556653:
                        if (type.equals("text")) {
                            str = str + attrObj.getText();
                        }
                        break;
                    case 100313435:
                        if (type.equals("image")) {
                            str = str + "image";
                        }
                        break;
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = 0;
        for (AttrObj attrObj2 : list) {
            h(spannableStringBuilder, attrObj2, length);
            String type2 = attrObj2.getType();
            if (type2 != null) {
                switch (type2.hashCode()) {
                    case -896192468:
                        if (type2.equals("spacer")) {
                            length += 6;
                        }
                        break;
                    case 3321844:
                        if (type2.equals("line")) {
                            length += 4;
                        }
                        break;
                    case 3556653:
                        if (type2.equals("text")) {
                            String text = attrObj2.getText();
                            length += text != null ? text.length() : 0;
                        }
                        break;
                    case 100313435:
                        if (type2.equals("image")) {
                            length += 5;
                        }
                        break;
                }
            }
        }
        setText(spannableStringBuilder);
    }

    @e
    public final RichAttributeModelObj getMRichTextObj() {
        return this.f96100b;
    }

    public final boolean j() {
        List<AttrObj> attrs;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49658, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        RichAttributeModelObj richAttributeModelObj = this.f96100b;
        if (richAttributeModelObj == null || (attrs = richAttributeModelObj.getAttrs()) == null) {
            return false;
        }
        Iterator<AttrObj> it = attrs.iterator();
        while (it.hasNext()) {
            if (f0.g("text", it.next().getType())) {
                return true;
            }
        }
        return false;
    }

    public final void setMRichTextObj(@e RichAttributeModelObj richAttributeModelObj) {
        this.f96100b = richAttributeModelObj;
    }

    public final void setRichText(@e RichAttributeModelObj richAttributeModelObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{richAttributeModelObj}, this, changeQuickRedirect, false, 49654, new Class[]{RichAttributeModelObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (richAttributeModelObj != null) {
            richAttributeModelObj = (RichAttributeModelObj) com.max.hbutils.utils.k.a(q.P(com.max.hbutils.utils.k.p(richAttributeModelObj), getContext()), RichAttributeModelObj.class);
        }
        this.f96100b = richAttributeModelObj;
        if (richAttributeModelObj != null) {
            String background_color = richAttributeModelObj.getBackground_color();
            int iE1 = background_color != null ? com.max.xiaoheihe.utils.d.e1(background_color) : 0;
            String border_color = richAttributeModelObj.getBorder_color();
            if (border_color != null && border_color.length() != 0) {
                z10 = false;
            }
            int iE2 = !z10 ? com.max.xiaoheihe.utils.d.e1(richAttributeModelObj.getBorder_color()) : iE1;
            float fP = richAttributeModelObj.getBorder_width() != null ? n.p(richAttributeModelObj.getBorder_width()) : 0.0f;
            String corner_radius = richAttributeModelObj.getCorner_radius();
            setBackground(q.O(q.v(getContext(), iE1, corner_radius != null ? n.p(corner_radius) : 0.0f), getContext(), iE2, fP));
            String text_alignment = richAttributeModelObj.getText_alignment();
            if (text_alignment != null) {
                if (f0.g(text_alignment, "0")) {
                    setGravity(3);
                } else if (f0.g(text_alignment, "1")) {
                    setGravity(17);
                }
            }
            InsetObj inset = richAttributeModelObj.getInset();
            if (inset != null) {
                setPadding(ViewUtils.f(getContext(), inset.getLeft()), ViewUtils.f(getContext(), inset.getTop()), ViewUtils.f(getContext(), inset.getRight()), ViewUtils.f(getContext(), inset.getBottom()));
            }
            if (n.q(richAttributeModelObj.getNumber_of_lines()) > 0) {
                setMaxLines(n.q(richAttributeModelObj.getNumber_of_lines()));
            } else {
                setMaxHeight(Integer.MAX_VALUE);
            }
            if (!com.max.hbcommon.utils.c.u(richAttributeModelObj.getProtocol())) {
                setOnClickListener(new c(richAttributeModelObj));
            }
            i(richAttributeModelObj.getAttrs());
        }
    }

    public final void setRichText(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49653, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        setRichText((RichAttributeModelObj) new Gson().fromJson(str, RichAttributeModelObj.class));
    }
}
