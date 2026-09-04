package com.billy.android.swipe.refresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.billy.android.swipe.R;
import com.billy.android.swipe.d;

/* JADX INFO: loaded from: classes6.dex */
public class ClassicFooter extends ClassicHeader implements d.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40509f;

    public ClassicFooter(Context context) {
        super(context);
    }

    public ClassicFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClassicFooter(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(21)
    public ClassicFooter(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // com.billy.android.swipe.refresh.ClassicHeader, com.billy.android.swipe.d.InterfaceC0319d
    public void a() {
        if (this.f40509f) {
            return;
        }
        g();
        setText(R.string.ssr_footer_refreshing);
    }

    @Override // com.billy.android.swipe.refresh.ClassicHeader, com.billy.android.swipe.d.InterfaceC0319d
    public void b(boolean z10, float f10) {
        if (this.f40509f) {
            f();
        } else if (z10) {
            setText(f10 >= 1.0f ? R.string.ssr_footer_release : R.string.ssr_footer_pulling);
        } else if (f10 <= 0.0f) {
            f();
        }
    }

    @Override // com.billy.android.swipe.refresh.ClassicHeader, com.billy.android.swipe.d.InterfaceC0319d
    public long onFinish(boolean z10) {
        f();
        if (this.f40509f) {
            return 500L;
        }
        setText(z10 ? R.string.ssr_footer_finish : R.string.ssr_footer_failed);
        return 500L;
    }

    @Override // com.billy.android.swipe.d.f
    public void setNoMoreData(boolean z10) {
        this.f40509f = z10;
        setText(R.string.ssr_footer_no_more_data);
    }
}
