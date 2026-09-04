package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.max.hbutils.utils.w;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class Dashboard extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final StringBuilder f102090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f102091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f102092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SimpleDateFormat f102093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScrollView f102094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f102095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f102096g;

    public Dashboard(Context context) {
        this(context, null);
    }

    public Dashboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102090a = new StringBuilder();
        this.f102093d = new SimpleDateFormat(w.f73602i, Locale.ENGLISH);
        this.f102095f = 3000;
        this.f102096g = false;
        setOrientation(1);
        setVisibility(8);
    }

    private void a() {
        if (this.f102091b != null) {
            return;
        }
        this.f102091b = new TextView(getContext());
        this.f102092c = new TextView(getContext());
        this.f102094e = new ScrollView(getContext());
        this.f102091b.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f102091b.setTextColor(-49023);
        this.f102091b.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f102094e.setPadding(0, 10, 0, 0);
        this.f102094e.setLayoutParams(layoutParams);
        this.f102094e.setVerticalScrollBarEnabled(true);
        this.f102094e.setScrollbarFadingEnabled(true);
        this.f102092c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f102092c.setTextColor(-49023);
        this.f102094e.addView(this.f102092c);
        addView(this.f102091b);
        addView(this.f102094e);
        if (this.f102090a.length() <= 0) {
            this.f102090a.append("liteav sdk version:\n");
        }
        this.f102092c.setText(this.f102090a.toString());
    }

    public final void a(int i10, int i11, int i12, int i13) {
        TextView textView = this.f102091b;
        if (textView != null) {
            textView.setPadding(i10, i11, i12, 0);
        }
        ScrollView scrollView = this.f102094e;
        if (scrollView != null) {
            scrollView.setPadding(i10, 0, i12, i13);
        }
    }

    public void setEventTextSize(float f10) {
        TextView textView = this.f102092c;
        if (textView != null) {
            textView.setTextSize(f10);
        }
    }

    public void setMessageMaxLength(int i10) {
        this.f102095f = i10;
    }

    public void setShowLevel(int i10) {
        if (i10 == 0) {
            TextView textView = this.f102091b;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f102094e;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i10 != 1) {
            a();
            this.f102091b.setVisibility(0);
            this.f102094e.setVisibility(0);
            setVisibility(0);
            return;
        }
        a();
        this.f102091b.setVisibility(0);
        this.f102094e.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusText(CharSequence charSequence) {
        TextView textView = this.f102091b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setStatusTextSize(float f10) {
        TextView textView = this.f102091b;
        if (textView != null) {
            textView.setTextSize(f10);
        }
    }
}
