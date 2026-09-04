package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: SearchView.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.jvm.internal.t0({"SMAP\nSearchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchView.kt\ncom/max/hbcommon/component/SearchView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,273:1\n65#2,16:274\n93#2,3:290\n*S KotlinDebug\n*F\n+ 1 SearchView.kt\ncom/max/hbcommon/component/SearchView\n*L\n201#1:274,16\n201#1:290,3\n*E\n"})
public final class SearchView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FrameLayout f67172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f67173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f67174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f67175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f67176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f67177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.l
    private int f67178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.l
    private int f67179i;

    /* JADX INFO: compiled from: TextView.kt */
    @kotlin.jvm.internal.t0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchView.kt\ncom/max/hbcommon/component/SearchView\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n202#2,8:98\n71#3:106\n77#4:107\n*E\n"})
    public static final class a implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@dl.e Editable editable) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, bb.c.d.Ue, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (editable != null && editable.length() != 0) {
                z10 = false;
            }
            if (z10) {
                SearchView searchView = SearchView.this;
                searchView.setSearchIconColor(searchView.f67178h);
            } else {
                SearchView searchView2 = SearchView.this;
                searchView2.setSearchIconColor(searchView2.f67179i);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public SearchView(@dl.e Context context) {
        this(context, null);
    }

    public SearchView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SearchView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        d();
        h(attributeSet);
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ke, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVg_scan(new FrameLayout(getContext()));
        FrameLayout vg_scan = getVg_scan();
        int i10 = R.id.vg_scan;
        vg_scan.setId(i10);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        getVg_scan().setPadding(0, 0, ViewUtils.f(getContext(), 10.0f), 0);
        getVg_scan().setVisibility(8);
        addView(getVg_scan(), layoutParams);
        setIv_search_scan(new ImageView(getContext()));
        getIv_search_scan().setId(R.id.iv_search_scan);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        getIv_search_scan().setImageResource(R.drawable.common_scan);
        ImageView iv_search_scan = getIv_search_scan();
        Resources resources = getContext().getResources();
        int i11 = R.color.text_primary_1_color;
        iv_search_scan.setColorFilter(resources.getColor(i11));
        getVg_scan().addView(getIv_search_scan(), layoutParams2);
        setLayoutSearch(new LinearLayout(getContext()));
        getLayoutSearch().setGravity(16);
        getLayoutSearch().setOrientation(0);
        getLayoutSearch().setFocusable(true);
        getLayoutSearch().setFocusableInTouchMode(true);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(1, i10);
        addView(getLayoutSearch(), layoutParams3);
        setIv_search_icon(new ImageView(getContext()));
        getIv_search_icon().setImageResource(R.drawable.common_search_line_24x24);
        getLayoutSearch().addView(getIv_search_icon());
        setEt_search(new EditText(getContext()));
        getEt_search().setId(R.id.et_search_edit);
        getEt_search().setSingleLine(true);
        getEt_search().setMaxLines(1);
        getEt_search().setBackground(null);
        getEt_search().setFocusable(true);
        getEt_search().setFocusableInTouchMode(true);
        getEt_search().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        getEt_search().setTextColor(getContext().getResources().getColor(i11));
        EditText et_search = getEt_search();
        Resources resources2 = getContext().getResources();
        int i12 = R.color.text_secondary_2_color;
        et_search.setHintTextColor(resources2.getColor(i12));
        getEt_search().setGravity(19);
        getEt_search().setTextSize(1, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams4.setMarginEnd(ViewUtils.f(getContext(), 35.0f));
        getLayoutSearch().addView(getEt_search(), layoutParams4);
        setIv_title_del(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 26.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = ViewUtils.f(getContext(), 5.0f);
        int iF2 = ViewUtils.f(getContext(), 5.0f);
        getIv_title_del().setPadding(iF2, iF2, iF2, iF2);
        getIv_title_del().setImageResource(R.drawable.remove_input);
        getIv_title_del().setVisibility(8);
        getIv_title_del().setColorFilter(getContext().getResources().getColor(i12));
        getIv_title_del().setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchView.e(this.f67824b, view);
            }
        });
        addView(getIv_title_del(), layoutParams5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SearchView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.Te, new Class[]{SearchView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.getEt_search().setText("");
    }

    private final void f(TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.d.Pe, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        String string = typedArray.getString(R.styleable.SearchView_svSearchHint);
        if (string == null) {
            string = getContext().getResources().getString(R.string.search_all_hint);
        }
        kotlin.jvm.internal.f0.m(string);
        setSearchHint(string);
        getEt_search().setTextSize(ViewUtils.i0(getContext(), typedArray.getDimension(R.styleable.SearchView_svTextSize, ViewUtils.f(getContext(), 12.0f))));
        float dimension = typedArray.getDimension(R.styleable.SearchView_svTextMarginLeft, ViewUtils.f(getContext(), 8.0f));
        ViewGroup.LayoutParams layoutParams = getEt_search().getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) dimension;
        getEt_search().setPadding(0, 0, 0, 0);
        getEt_search().addTextChangedListener(new a());
    }

    private final void g(TypedArray typedArray) {
        if (PatchProxy.proxy(new Object[]{typedArray}, this, changeQuickRedirect, false, bb.c.d.Ne, new Class[]{TypedArray.class}, Void.TYPE).isSupported) {
            return;
        }
        int dimension = (int) typedArray.getDimension(R.styleable.SearchView_svSearchIconSize, ViewUtils.f(getContext(), 14.0f));
        getIv_search_icon().getLayoutParams().width = dimension;
        getIv_search_icon().getLayoutParams().height = dimension;
        float dimension2 = typedArray.getDimension(R.styleable.SearchView_svIconMarginLeft, ViewUtils.f(getContext(), 8.0f));
        ViewGroup.LayoutParams layoutParams = getIv_search_icon().getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) dimension2;
        this.f67178h = typedArray.getColor(R.styleable.SearchView_svIconHintColor, getContext().getResources().getColor(R.color.text_secondary_2_color));
        this.f67179i = typedArray.getColor(R.styleable.SearchView_svIconColor, getContext().getResources().getColor(R.color.text_primary_1_color));
        setSearchIconColor(this.f67178h);
    }

    private final void h(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Le, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.R2);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        getLayoutSearch().setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.SearchView_svBackground, R.drawable.divider_color_concept_4dp));
        g(typedArrayObtainStyledAttributes);
        f(typedArrayObtainStyledAttributes);
    }

    @dl.d
    public final EditText getEt_search() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ce, new Class[0], EditText.class);
        if (patchProxyResultProxy.isSupported) {
            return (EditText) patchProxyResultProxy.result;
        }
        EditText editText = this.f67174d;
        if (editText != null) {
            return editText;
        }
        kotlin.jvm.internal.f0.S("et_search");
        return null;
    }

    @dl.d
    public final ImageView getIv_search_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ee, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67175e;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_search_icon");
        return null;
    }

    @dl.d
    public final ImageView getIv_search_scan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ae, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67173c;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_search_scan");
        return null;
    }

    @dl.d
    public final ImageView getIv_title_del() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ge, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67176f;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_title_del");
        return null;
    }

    @dl.d
    public final LinearLayout getLayoutSearch() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ie, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f67177g;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.f0.S("layoutSearch");
        return null;
    }

    @dl.d
    public final FrameLayout getVg_scan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31663ye, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f67172b;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.f0.S("vg_scan");
        return null;
    }

    @qa.a(note = "是否展示扫描按钮")
    public final void i(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Qe, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVg_scan().setVisibility(z10 ? 0 : 8);
    }

    @Override // android.view.View
    public void setBackground(@dl.e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.Se, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getLayoutSearch().setBackground(drawable);
    }

    public final void setEt_search(@dl.d EditText editText) {
        if (PatchProxy.proxy(new Object[]{editText}, this, changeQuickRedirect, false, bb.c.d.De, new Class[]{EditText.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(editText, "<set-?>");
        this.f67174d = editText;
    }

    public final void setIv_search_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Fe, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67175e = imageView;
    }

    public final void setIv_search_scan(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Be, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67173c = imageView;
    }

    public final void setIv_title_del(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.He, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67176f = imageView;
    }

    public final void setLayoutSearch(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, bb.c.d.Je, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linearLayout, "<set-?>");
        this.f67177g = linearLayout;
    }

    public final void setMaxStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Re, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getLayoutSearch().setBackground(com.max.hbutils.utils.q.o(getContext(), R.color.white_alpha5, 4.0f));
        int iE = androidx.core.content.res.i.e(getResources(), R.color.white, null);
        getEt_search().setTextColor(iE);
        getEt_search().setHintTextColor(getContext().getResources().getColor(R.color.text_secondary_1_not_change_color));
        getIv_search_icon().setColorFilter(iE);
        getIv_search_scan().setColorFilter(iE);
    }

    @qa.a(note = "设置Hint文字")
    public final void setSearchHint(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Me, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getEt_search().setHint(str);
    }

    public final void setSearchIconColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Oe, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getIv_search_icon().setColorFilter(i10);
    }

    public final void setVg_scan(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, bb.c.d.f31685ze, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(frameLayout, "<set-?>");
        this.f67172b = frameLayout;
    }
}
