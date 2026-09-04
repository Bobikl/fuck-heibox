package com.max.mediaselector.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import bb.c;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes2.dex */
public class EditPictureTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    public EditPictureTextView(Context context) {
        super(context);
    }

    public EditPictureTextView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditPictureTextView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void setSelectedChange() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34907na, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        if (qe.a.g() > 0) {
            setEnabled(true);
            int iT = selectMainStyleC.T();
            if (s.c(iT)) {
                setBackgroundResource(iT);
            } else {
                setBackgroundResource(R.drawable.ps_ic_trans_1px);
            }
            int iD0 = selectMainStyleC.d0();
            if (s.b(iD0)) {
                setTextSize(iD0);
            }
            int iC0 = selectMainStyleC.c0();
            if (s.c(iC0)) {
                setTextColor(iC0);
                return;
            } else {
                setTextColor(d.f(getContext(), R.color.ps_color_fa632d));
                return;
            }
        }
        setEnabled(false);
        int iU = selectMainStyleC.U();
        if (s.c(iU)) {
            setBackgroundResource(iU);
        } else {
            setBackgroundResource(R.drawable.ps_ic_trans_1px);
        }
        int iX = selectMainStyleC.X();
        if (s.c(iX)) {
            setTextColor(iX);
        } else {
            setTextColor(d.f(getContext(), R.color.ps_color_9b));
        }
        int iA0 = selectMainStyleC.a0();
        if (s.b(iA0)) {
            setTextSize(iA0);
        }
    }
}
