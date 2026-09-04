package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.i1;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f21840h = 500;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f21841i = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f21842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f21843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f21844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f21845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f21846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f21847g;

    public ContentLoadingProgressBar(@n0 Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21842b = -1L;
        this.f21843c = false;
        this.f21844d = false;
        this.f21845e = false;
        this.f21846f = new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f21929b.g();
            }
        };
        this.f21847g = new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f21930b.h();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i1
    public void f() {
        this.f21845e = true;
        removeCallbacks(this.f21847g);
        this.f21844d = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f21842b;
        long j11 = jCurrentTimeMillis - j10;
        if (j11 >= 500 || j10 == -1) {
            setVisibility(8);
        } else {
            if (this.f21843c) {
                return;
            }
            postDelayed(this.f21846f, 500 - j11);
            this.f21843c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f21843c = false;
        this.f21842b = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f21844d = false;
        if (this.f21845e) {
            return;
        }
        this.f21842b = System.currentTimeMillis();
        setVisibility(0);
    }

    private void i() {
        removeCallbacks(this.f21846f);
        removeCallbacks(this.f21847g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i1
    public void k() {
        this.f21842b = -1L;
        this.f21845e = false;
        removeCallbacks(this.f21846f);
        this.f21843c = false;
        if (this.f21844d) {
            return;
        }
        postDelayed(this.f21847g, 500L);
        this.f21844d = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f21928b.f();
            }
        });
    }

    public void j() {
        post(new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f21927b.k();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }
}
