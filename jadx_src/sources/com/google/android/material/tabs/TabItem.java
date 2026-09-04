package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.x0;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes7.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f55424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f55425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55426d;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x0 x0VarF = x0.F(context, attributeSet, R.styleable.f52889x1);
        this.f55424b = x0VarF.x(R.styleable.TabItem_android_text);
        this.f55425c = x0VarF.h(R.styleable.TabItem_android_icon);
        this.f55426d = x0VarF.u(R.styleable.TabItem_android_layout, 0);
        x0VarF.I();
    }
}
