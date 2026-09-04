package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentLabelBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivClose;

    @n0
    public final ImageView ivConfirm;

    @n0
    public final RadioButton rbArrow;

    @n0
    public final RadioButton rbCircle;

    @n0
    public final RadioButton rbRec;

    /* JADX INFO: renamed from: rg, reason: collision with root package name */
    @n0
    public final RadioGroup f98058rg;

    @n0
    private final LinearLayout rootView;

    @n0
    public final RecyclerView rvColor;

    @n0
    public final TextView tvTitle;

    @n0
    public final RelativeLayout vgTab;

    @n0
    public final LinearLayout vgUndo;

    private FragmentLabelBinding(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 RadioButton radioButton, @n0 RadioButton radioButton2, @n0 RadioButton radioButton3, @n0 RadioGroup radioGroup, @n0 RecyclerView recyclerView, @n0 TextView textView, @n0 RelativeLayout relativeLayout, @n0 LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.ivClose = imageView;
        this.ivConfirm = imageView2;
        this.rbArrow = radioButton;
        this.rbCircle = radioButton2;
        this.rbRec = radioButton3;
        this.f98058rg = radioGroup;
        this.rvColor = recyclerView;
        this.tvTitle = textView;
        this.vgTab = relativeLayout;
        this.vgUndo = linearLayout2;
    }

    @n0
    public static FragmentLabelBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49917, new Class[]{View.class}, FragmentLabelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentLabelBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_confirm;
            ImageView imageView2 = (ImageView) d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.rb_arrow;
                RadioButton radioButton = (RadioButton) d.a(view, i10);
                if (radioButton != null) {
                    i10 = R.id.rb_circle;
                    RadioButton radioButton2 = (RadioButton) d.a(view, i10);
                    if (radioButton2 != null) {
                        i10 = R.id.rb_rec;
                        RadioButton radioButton3 = (RadioButton) d.a(view, i10);
                        if (radioButton3 != null) {
                            i10 = R.id.f98053rg;
                            RadioGroup radioGroup = (RadioGroup) d.a(view, i10);
                            if (radioGroup != null) {
                                i10 = R.id.rv_color;
                                RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
                                if (recyclerView != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView = (TextView) d.a(view, i10);
                                    if (textView != null) {
                                        i10 = R.id.vg_tab;
                                        RelativeLayout relativeLayout = (RelativeLayout) d.a(view, i10);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_undo;
                                            LinearLayout linearLayout = (LinearLayout) d.a(view, i10);
                                            if (linearLayout != null) {
                                                return new FragmentLabelBinding((LinearLayout) view, imageView, imageView2, radioButton, radioButton2, radioButton3, radioGroup, recyclerView, textView, relativeLayout, linearLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentLabelBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49915, new Class[]{LayoutInflater.class}, FragmentLabelBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentLabelBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentLabelBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49916, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentLabelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentLabelBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_label, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49918, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
