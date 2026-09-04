package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.core.content.d;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.BottomNavBarStyle;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.max.mediaselector.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class CompleteSelectView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f75573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f75574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animation f75575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PictureSelectionConfig f75576e;

    public CompleteSelectView(Context context) {
        super(context);
        b();
    }

    public CompleteSelectView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public CompleteSelectView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    private void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34815ja, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a();
        setOrientation(0);
        this.f75573b = (TextView) findViewById(R.id.ps_tv_select_num);
        this.f75574c = (TextView) findViewById(R.id.ps_tv_complete);
        setGravity(16);
        this.f75575d = AnimationUtils.loadAnimation(getContext(), R.anim.ps_anim_modal_in);
        this.f75576e = PictureSelectionConfig.c();
    }

    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34838ka, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.ps_complete_selected_layout, this);
    }

    public void setCompleteSelectViewStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34861la, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.lib.style.a aVar = PictureSelectionConfig.f75017b4;
        SelectMainStyle selectMainStyleC = aVar.c();
        if (s.c(selectMainStyleC.U())) {
            setBackgroundResource(selectMainStyleC.U());
        }
        String strW = selectMainStyleC.W();
        if (s.f(strW)) {
            if (s.e(strW)) {
                this.f75574c.setText(String.format(strW, Integer.valueOf(qe.a.g()), Integer.valueOf(this.f75576e.f75041l)));
            } else {
                this.f75574c.setText(strW);
            }
        }
        int iA0 = selectMainStyleC.a0();
        if (s.b(iA0)) {
            this.f75574c.setTextSize(iA0);
        }
        int iX = selectMainStyleC.X();
        if (s.c(iX)) {
            this.f75574c.setTextColor(iX);
        }
        BottomNavBarStyle bottomNavBarStyleB = aVar.b();
        if (bottomNavBarStyleB.A()) {
            int iW = bottomNavBarStyleB.w();
            if (s.c(iW)) {
                this.f75573b.setBackgroundResource(iW);
            }
            int iZ = bottomNavBarStyleB.z();
            if (s.b(iZ)) {
                this.f75573b.setTextSize(iZ);
            }
            int iY = bottomNavBarStyleB.y();
            if (s.c(iY)) {
                this.f75573b.setTextColor(iY);
            }
        }
    }

    public void setSelectedChange(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.f34884ma, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.mediaselector.lib.style.a aVar = PictureSelectionConfig.f75017b4;
        SelectMainStyle selectMainStyleC = aVar.c();
        if (qe.a.g() > 0) {
            setEnabled(true);
            int iT = selectMainStyleC.T();
            if (s.c(iT)) {
                setBackgroundResource(iT);
            } else {
                setBackgroundResource(R.drawable.ps_ic_trans_1px);
            }
            String strB0 = selectMainStyleC.b0();
            if (!s.f(strB0)) {
                this.f75574c.setText(getContext().getString(R.string.ps_completed));
            } else if (s.e(strB0)) {
                this.f75574c.setText(String.format(strB0, Integer.valueOf(qe.a.g()), Integer.valueOf(this.f75576e.f75041l)));
            } else {
                this.f75574c.setText(strB0);
            }
            int iD0 = selectMainStyleC.d0();
            if (s.b(iD0)) {
                this.f75574c.setTextSize(iD0);
            }
            int iC0 = selectMainStyleC.c0();
            if (s.c(iC0)) {
                this.f75574c.setTextColor(iC0);
            } else {
                this.f75574c.setTextColor(d.f(getContext(), R.color.ps_color_fa632d));
            }
            if (!aVar.b().A()) {
                this.f75573b.setVisibility(8);
                return;
            }
            if (this.f75573b.getVisibility() == 8 || this.f75573b.getVisibility() == 4) {
                this.f75573b.setVisibility(0);
            }
            if (TextUtils.equals(u.l(Integer.valueOf(qe.a.g())), this.f75573b.getText())) {
                return;
            }
            this.f75573b.setText(u.l(Integer.valueOf(qe.a.g())));
            this.f75573b.startAnimation(this.f75575d);
            return;
        }
        if (z10 && selectMainStyleC.g0()) {
            setEnabled(true);
            int iT2 = selectMainStyleC.T();
            if (s.c(iT2)) {
                setBackgroundResource(iT2);
            } else {
                setBackgroundResource(R.drawable.ps_ic_trans_1px);
            }
            int iC1 = selectMainStyleC.c0();
            if (s.c(iC1)) {
                this.f75574c.setTextColor(iC1);
            } else {
                this.f75574c.setTextColor(d.f(getContext(), R.color.ps_color_9b));
            }
        } else {
            setEnabled(false);
            int iU = selectMainStyleC.U();
            if (s.c(iU)) {
                setBackgroundResource(iU);
            } else {
                setBackgroundResource(R.drawable.ps_ic_trans_1px);
            }
            int iX = selectMainStyleC.X();
            if (s.c(iX)) {
                this.f75574c.setTextColor(iX);
            } else {
                this.f75574c.setTextColor(d.f(getContext(), R.color.ps_color_9b));
            }
        }
        this.f75573b.setVisibility(8);
        String strW = selectMainStyleC.W();
        if (!s.f(strW)) {
            this.f75574c.setText(getContext().getString(R.string.ps_please_select));
        } else if (s.e(strW)) {
            this.f75574c.setText(String.format(strW, Integer.valueOf(qe.a.g()), Integer.valueOf(this.f75576e.f75041l)));
        } else {
            this.f75574c.setText(strW);
        }
        int iA0 = selectMainStyleC.a0();
        if (s.b(iA0)) {
            this.f75574c.setTextSize(iA0);
        }
    }
}
