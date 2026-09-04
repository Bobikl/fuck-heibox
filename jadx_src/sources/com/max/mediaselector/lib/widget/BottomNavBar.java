package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.d;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.BottomNavBarStyle;
import com.max.mediaselector.lib.utils.h;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class BottomNavBar extends RelativeLayout implements View.OnClickListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected TextView f75569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected TextView f75570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected PictureSelectionConfig f75571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a f75572e;

    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public BottomNavBar(Context context) {
        super(context);
        d();
    }

    public BottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public BottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d();
    }

    private void a() {
    }

    public void b() {
    }

    public void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34723fa, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.ps_bottom_nav_bar, this);
    }

    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34700ea, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c();
        setClickable(true);
        setFocusable(true);
        this.f75571d = PictureSelectionConfig.c();
        this.f75569b = (TextView) findViewById(R.id.ps_tv_preview);
        this.f75570c = (TextView) findViewById(R.id.ps_tv_editor);
        this.f75569b.setOnClickListener(this);
        this.f75570c.setVisibility(8);
        setBackgroundColor(d.f(getContext(), R.color.text_primary_1_not_change_color));
        b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, c.m.f34792ia, new Class[]{View.class}, Void.TYPE).isSupported || this.f75572e == null || view.getId() != R.id.ps_tv_preview) {
            return;
        }
        this.f75572e.d();
    }

    public void setBottomNavBarStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34746ga, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f75571d.f75033d) {
            setVisibility(8);
            return;
        }
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.f75017b4.b();
        int iF = bottomNavBarStyleB.f();
        if (s.b(iF)) {
            getLayoutParams().height = iF;
        } else {
            getLayoutParams().height = h.a(getContext(), 46.0f);
        }
        int iD = bottomNavBarStyleB.d();
        if (s.c(iD)) {
            setBackgroundColor(iD);
        }
        int iP = bottomNavBarStyleB.p();
        if (s.c(iP)) {
            this.f75569b.setTextColor(iP);
        }
        int iR = bottomNavBarStyleB.r();
        if (s.b(iR)) {
            this.f75569b.setTextSize(iR);
        }
        String strO = bottomNavBarStyleB.o();
        if (s.f(strO)) {
            this.f75569b.setText(strO);
        }
        String strA = bottomNavBarStyleB.a();
        if (s.f(strA)) {
            this.f75570c.setText(strA);
        }
        int iC = bottomNavBarStyleB.c();
        if (s.b(iC)) {
            this.f75570c.setTextSize(iC);
        }
        int iB = bottomNavBarStyleB.b();
        if (s.c(iB)) {
            this.f75570c.setTextColor(iB);
        }
    }

    public void setOnBottomNavBarListener(a aVar) {
        this.f75572e = aVar;
    }

    public void setOriginalCheck() {
    }

    public void setSelectedChange() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34769ha, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a();
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.f75017b4.b();
        if (qe.a.g() <= 0) {
            this.f75569b.setEnabled(false);
            int iP = bottomNavBarStyleB.p();
            if (s.c(iP)) {
                this.f75569b.setTextColor(iP);
            } else {
                this.f75569b.setTextColor(d.f(getContext(), R.color.ps_color_9b));
            }
            String strO = bottomNavBarStyleB.o();
            if (s.f(strO)) {
                this.f75569b.setText(strO);
                return;
            } else {
                this.f75569b.setText(getContext().getString(R.string.ps_preview));
                return;
            }
        }
        this.f75569b.setEnabled(true);
        int iV = bottomNavBarStyleB.v();
        if (s.c(iV)) {
            this.f75569b.setTextColor(iV);
        } else {
            this.f75569b.setTextColor(d.f(getContext(), R.color.ps_color_fa632d));
        }
        String strU = bottomNavBarStyleB.u();
        if (!s.f(strU)) {
            this.f75569b.setText(getContext().getString(R.string.ps_preview_num, Integer.valueOf(qe.a.g())));
        } else if (s.e(strU)) {
            this.f75569b.setText(String.format(strU, Integer.valueOf(qe.a.g()), Integer.valueOf(this.f75571d.f75041l)));
        } else {
            this.f75569b.setText(strU);
        }
    }
}
