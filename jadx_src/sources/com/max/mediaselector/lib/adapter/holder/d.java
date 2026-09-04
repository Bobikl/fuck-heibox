package com.max.mediaselector.lib.adapter.holder;

import android.view.View;
import android.widget.TextView;
import com.max.mediaselector.R;
import com.max.mediaselector.lib.config.PictureSelectionConfig;
import com.max.mediaselector.lib.style.SelectMainStyle;
import com.max.mediaselector.lib.utils.s;

/* JADX INFO: compiled from: CameraViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends c {
    public d(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.tvCamera);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.f75017b4.c();
        int iA = selectMainStyleC.a();
        if (s.c(iA)) {
            textView.setBackgroundColor(iA);
        }
        int iB = selectMainStyleC.b();
        if (s.c(iB)) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, iB, 0, 0);
        }
        String strC = selectMainStyleC.c();
        if (s.f(strC)) {
            textView.setText(strC);
        } else if (PictureSelectionConfig.c().f75029b == com.max.mediaselector.lib.config.h.b()) {
            textView.setText(view.getContext().getString(R.string.ps_tape));
        }
        int iF = selectMainStyleC.f();
        if (s.b(iF)) {
            textView.setTextSize(iF);
        }
        int iD = selectMainStyleC.d();
        if (s.c(iD)) {
            textView.setTextColor(iD);
        }
    }
}
