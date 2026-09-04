package com.flyco.tablayout.utils;

import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import com.flyco.tablayout.widget.MsgView;

/* JADX INFO: loaded from: classes6.dex */
public class UnreadMsgUtils {
    public static void setSize(MsgView msgView, int i10) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        msgView.setLayoutParams(layoutParams);
    }

    public static void show(MsgView msgView, int i10) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        DisplayMetrics displayMetrics = msgView.getResources().getDisplayMetrics();
        msgView.setVisibility(0);
        if (i10 <= 0) {
            msgView.setStrokeWidth(0);
            msgView.setText("");
            float f10 = displayMetrics.density;
            layoutParams.width = (int) (f10 * 5.0f);
            layoutParams.height = (int) (f10 * 5.0f);
            msgView.setLayoutParams(layoutParams);
            return;
        }
        float f11 = displayMetrics.density;
        layoutParams.height = (int) (f11 * 18.0f);
        if (i10 > 0 && i10 < 10) {
            layoutParams.width = (int) (f11 * 18.0f);
            msgView.setText(i10 + "");
        } else if (i10 <= 9 || i10 >= 100) {
            layoutParams.width = -2;
            msgView.setPadding((int) (f11 * 6.0f), 0, (int) (f11 * 6.0f), 0);
            msgView.setText("99+");
        } else {
            layoutParams.width = -2;
            msgView.setPadding((int) (f11 * 6.0f), 0, (int) (f11 * 6.0f), 0);
            msgView.setText(i10 + "");
        }
        msgView.setLayoutParams(layoutParams);
    }
}
