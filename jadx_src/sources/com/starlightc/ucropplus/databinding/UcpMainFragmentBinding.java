package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class UcpMainFragmentBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final TextView btnNext;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final LinearLayout vgButtons;

    @n0
    public final LinearLayout vgCutting;

    @n0
    public final LinearLayout vgLabel;

    @n0
    public final LinearLayout vgModule;

    @n0
    public final LinearLayout vgSticker;

    @n0
    public final LinearLayout vgText;

    private UcpMainFragmentBinding(@n0 RelativeLayout relativeLayout, @n0 TextView textView, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 LinearLayout linearLayout4, @n0 LinearLayout linearLayout5, @n0 LinearLayout linearLayout6) {
        this.rootView = relativeLayout;
        this.btnNext = textView;
        this.vgButtons = linearLayout;
        this.vgCutting = linearLayout2;
        this.vgLabel = linearLayout3;
        this.vgModule = linearLayout4;
        this.vgSticker = linearLayout5;
        this.vgText = linearLayout6;
    }

    @n0
    public static UcpMainFragmentBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50005, new Class[]{View.class}, UcpMainFragmentBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpMainFragmentBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.btn_next;
        TextView textView = (TextView) d.a(view, i10);
        if (textView != null) {
            i10 = R.id.vg_buttons;
            LinearLayout linearLayout = (LinearLayout) d.a(view, i10);
            if (linearLayout != null) {
                i10 = R.id.vg_cutting;
                LinearLayout linearLayout2 = (LinearLayout) d.a(view, i10);
                if (linearLayout2 != null) {
                    i10 = R.id.vg_label;
                    LinearLayout linearLayout3 = (LinearLayout) d.a(view, i10);
                    if (linearLayout3 != null) {
                        i10 = R.id.vg_module;
                        LinearLayout linearLayout4 = (LinearLayout) d.a(view, i10);
                        if (linearLayout4 != null) {
                            i10 = R.id.vg_sticker;
                            LinearLayout linearLayout5 = (LinearLayout) d.a(view, i10);
                            if (linearLayout5 != null) {
                                i10 = R.id.vg_text;
                                LinearLayout linearLayout6 = (LinearLayout) d.a(view, i10);
                                if (linearLayout6 != null) {
                                    return new UcpMainFragmentBinding((RelativeLayout) view, textView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
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
    public static UcpMainFragmentBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 50003, new Class[]{LayoutInflater.class}, UcpMainFragmentBinding.class);
        return patchProxyResultProxy.isSupported ? (UcpMainFragmentBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcpMainFragmentBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50004, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcpMainFragmentBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpMainFragmentBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucp_main_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50006, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
