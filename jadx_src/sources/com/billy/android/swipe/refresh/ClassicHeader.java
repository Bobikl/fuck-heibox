package com.billy.android.swipe.refresh;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.f;
import com.billy.android.swipe.R;
import com.billy.android.swipe.b;
import com.billy.android.swipe.d;

/* JADX INFO: loaded from: classes6.dex */
public class ClassicHeader extends RelativeLayout implements d.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f40510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f40511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObjectAnimator f40513e;

    public ClassicHeader(Context context) {
        super(context);
        if (isInEditMode()) {
            d(false);
        }
    }

    public ClassicHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            d(false);
        }
    }

    public ClassicHeader(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (isInEditMode()) {
            d(false);
        }
    }

    @TargetApi(21)
    public ClassicHeader(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        if (isInEditMode()) {
            d(false);
        }
    }

    public void a() {
        g();
        setText(R.string.ssr_footer_refreshing);
    }

    public void b(boolean z10, float f10) {
        if (z10) {
            setText(f10 >= 1.0f ? R.string.ssr_header_release : R.string.ssr_header_pulling);
        } else if (f10 <= 0.0f) {
            f();
        }
    }

    @Override // com.billy.android.swipe.d.InterfaceC0319d
    public void c() {
    }

    @Override // com.billy.android.swipe.d.InterfaceC0319d
    public void d(boolean z10) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (z10) {
            LayoutInflater.from(getContext()).inflate(R.layout.ssr_classic_header_footer_horizontal, this);
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(b.b(60, getContext()), -1);
            }
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.ssr_classic_header_footer, this);
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, b.b(60, getContext()));
            }
        }
        setLayoutParams(layoutParams);
        if (getBackground() == null) {
            setBackgroundColor(-1118482);
        }
        ImageView imageView = (ImageView) findViewById(R.id.ssr_classics_progress);
        this.f40511c = imageView;
        imageView.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.ssr_classics_title);
        this.f40510b = textView;
        textView.setText(R.string.ssr_header_pulling);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40511c, f.f18721i, 0.0f, 3600.0f);
        this.f40513e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(5000L);
        this.f40513e.setInterpolator(null);
        this.f40513e.setRepeatCount(-1);
        this.f40513e.setRepeatMode(1);
    }

    @Override // com.billy.android.swipe.d.InterfaceC0319d
    public void e() {
    }

    public void f() {
        this.f40513e.cancel();
        this.f40511c.setVisibility(8);
    }

    public void g() {
        this.f40513e.start();
        this.f40511c.setVisibility(0);
    }

    @Override // com.billy.android.swipe.d.InterfaceC0319d
    public View getView() {
        return this;
    }

    public long onFinish(boolean z10) {
        f();
        setText(z10 ? R.string.ssr_header_finish : R.string.ssr_header_failed);
        return 500L;
    }

    public void setText(int i10) {
        TextView textView;
        if (this.f40512d == i10 || (textView = this.f40510b) == null) {
            return;
        }
        this.f40512d = i10;
        textView.setText(i10);
    }
}
