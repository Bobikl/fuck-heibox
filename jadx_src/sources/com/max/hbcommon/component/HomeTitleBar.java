package com.max.hbcommon.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.max.hbcommon.R;
import com.max.hbcustomview.EZTabLayout;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes9.dex */
public class HomeTitleBar extends Toolbar {
    public static ChangeQuickRedirect changeQuickRedirect;
    private LayoutInflater T;
    private Toolbar U;
    private EZTabLayout V;
    private ViewGroup W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ImageView f67126a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ImageView f67127b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ImageView f67128c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private ImageView f67129p1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private TextView f67130x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private ImageView f67131y1;

    public HomeTitleBar(Context context) {
        super(context);
        this.U = null;
        P(context);
    }

    public HomeTitleBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = null;
        P(context);
    }

    public HomeTitleBar(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.U = null;
        P(context);
    }

    private void O(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Hb, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.T = layoutInflaterFrom;
        Toolbar toolbar = (Toolbar) layoutInflaterFrom.inflate(R.layout.title_bar_homepage, this);
        this.U = toolbar;
        this.V = (EZTabLayout) toolbar.findViewById(R.id.tl_home);
        this.W = (ViewGroup) this.U.findViewById(R.id.vg_title_root);
        this.f67126a0 = (ImageView) this.U.findViewById(R.id.iv_home_msg);
        this.f67130x1 = (TextView) this.U.findViewById(R.id.tv_title);
        this.f67127b0 = (ImageView) this.U.findViewById(R.id.iv_home_search);
        this.f67128c0 = (ImageView) this.U.findViewById(R.id.iv_home_scan);
        this.f67129p1 = (ImageView) this.U.findViewById(R.id.iv_point_home_msg);
        setContentInsetsAbsolute(0, 0);
    }

    private void P(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.d.Gb, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        O(context);
    }

    public void Q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Jb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f67131y1;
        if (imageView != null) {
            imageView.setVisibility(0);
            return;
        }
        this.f67131y1 = TitleBar.R(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 62.0f), ViewUtils.f(getContext(), 16.0f));
        layoutParams.addRule(13);
        this.f67131y1.setLayoutParams(layoutParams);
        this.W.addView(this.f67131y1);
    }

    public ImageView getIv_home_msg() {
        return this.f67126a0;
    }

    public ImageView getIv_home_scan() {
        return this.f67128c0;
    }

    public ImageView getIv_home_search() {
        return this.f67127b0;
    }

    public ImageView getIv_point_home_msg() {
        return this.f67129p1;
    }

    public EZTabLayout getTl_home() {
        return this.V;
    }

    public TextView getTv_title() {
        return this.f67130x1;
    }

    public ViewGroup getVg_title_root() {
        return this.W;
    }

    public void setMaxStyle(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Ib, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int iE = androidx.core.content.res.i.e(getResources(), R.color.white, null);
        EZTabLayout eZTabLayout = this.V;
        eZTabLayout.f68416p = iE;
        eZTabLayout.f68415o = iE;
        this.W.setBackgroundResource(R.color.max_main_color);
        this.f67130x1.setTextColor(iE);
        this.f67126a0.setColorFilter(iE);
        this.f67127b0.setColorFilter(iE);
        this.f67128c0.setColorFilter(iE);
        if (z10) {
            Q();
        }
    }
}
