package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import mb.u1;

/* JADX INFO: compiled from: VoteShowItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class VoteShowItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ProgressBar f67193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f67194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f67195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f67196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f67197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u1 f67198g;

    public VoteShowItemView(@dl.e Context context) {
        this(context, null);
    }

    public VoteShowItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoteShowItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public VoteShowItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Vg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Context context = getContext();
        kotlin.jvm.internal.f0.o(context, "getContext(...)");
        u1 u1VarC = u1.c(kb.c.d(context));
        kotlin.jvm.internal.f0.o(u1VarC, "inflate(...)");
        setVoteShowItemBinding(u1VarC);
        ProgressBar pgPercent = getVoteShowItemBinding().f131789c;
        kotlin.jvm.internal.f0.o(pgPercent, "pgPercent");
        setPg_percent(pgPercent);
        TextView tvDesc = getVoteShowItemBinding().f131790d;
        kotlin.jvm.internal.f0.o(tvDesc, "tvDesc");
        setTv_desc(tvDesc);
        TextView tvPercent = getVoteShowItemBinding().f131792f;
        kotlin.jvm.internal.f0.o(tvPercent, "tvPercent");
        setTv_percent(tvPercent);
        TextView tvNum = getVoteShowItemBinding().f131791e;
        kotlin.jvm.internal.f0.o(tvNum, "tvNum");
        setTv_num(tvNum);
        ImageView ivItemChecked = getVoteShowItemBinding().f131788b;
        kotlin.jvm.internal.f0.o(ivItemChecked, "ivItemChecked");
        setIv_item_checked(ivItemChecked);
        addView(getVoteShowItemBinding().b());
    }

    public final void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31121ah, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getVoteShowItemBinding().f131793g.setVisibility(z10 ? 0 : 8);
    }

    @dl.d
    public final ImageView getIv_item_checked() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Rg, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67197f;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_item_checked");
        return null;
    }

    @dl.d
    public final ProgressBar getPg_percent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Jg, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f67193b;
        if (progressBar != null) {
            return progressBar;
        }
        kotlin.jvm.internal.f0.S("pg_percent");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Lg, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67194c;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Pg, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67196e;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_num");
        return null;
    }

    @dl.d
    public final TextView getTv_percent() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ng, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67195d;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_percent");
        return null;
    }

    @dl.d
    public final u1 getVoteShowItemBinding() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Tg, new Class[0], u1.class);
        if (patchProxyResultProxy.isSupported) {
            return (u1) patchProxyResultProxy.result;
        }
        u1 u1Var = this.f67198g;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.f0.S("voteShowItemBinding");
        return null;
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Zg, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getIv_item_checked().setVisibility(0);
            TextView tv_desc = getTv_desc();
            Resources resources = getContext().getResources();
            int i10 = R.color.click_blue;
            tv_desc.setTextColor(resources.getColor(i10));
            getTv_percent().setTextColor(getContext().getResources().getColor(i10));
            return;
        }
        getIv_item_checked().setVisibility(8);
        TextView tv_desc2 = getTv_desc();
        Resources resources2 = getContext().getResources();
        int i11 = R.color.text_primary_1_color;
        tv_desc2.setTextColor(resources2.getColor(i11));
        getTv_percent().setTextColor(getContext().getResources().getColor(i11));
    }

    public final void setIv_item_checked(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Sg, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67197f = imageView;
    }

    public final void setNum(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Yg, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_num().setText(str);
    }

    public final void setPercent(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.d.Xg, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getPg_percent().setProgress((int) (1000.0f - ((f10 > 0.0f ? Math.max(2.0f, f10) : f10) * 10.0f)));
        getTv_percent().setText(com.max.hbutils.utils.n.m(Float.valueOf(f10)) + '%');
    }

    public final void setPg_percent(@dl.d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, bb.c.d.Kg, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(progressBar, "<set-?>");
        this.f67193b = progressBar;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Mg, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67194c = textView;
    }

    public final void setTv_num(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Qg, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67196e = textView;
    }

    public final void setTv_percent(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.Og, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67195d = textView;
    }

    public final void setVoteDesc(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Wg, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setVoteShowItemBinding(@dl.d u1 u1Var) {
        if (PatchProxy.proxy(new Object[]{u1Var}, this, changeQuickRedirect, false, bb.c.d.Ug, new Class[]{u1.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(u1Var, "<set-?>");
        this.f67198g = u1Var;
    }
}
