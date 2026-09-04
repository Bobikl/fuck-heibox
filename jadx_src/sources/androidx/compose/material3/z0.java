package androidx.compose.material3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/z0;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/b2;", "b", ak.aF, "Landroid/view/View;", "p0", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onGlobalLayout", ak.av, "Landroid/view/View;", sd.b.f139384b, "", "d", "Z", "isListeningToGlobalLayout", "Lkotlin/Function0;", "onGlobalLayoutCallback", "<init>", "(Landroid/view/View;Lyh/a;)V", "material3_release"}, k = 1, mv = {1, 7, 1})
public final class z0 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final yh.a<kotlin.b2> f12193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isListeningToGlobalLayout;

    public z0(@dl.d View view, @dl.d yh.a<kotlin.b2> onGlobalLayoutCallback) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.view = view;
        this.f12193c = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    private final void b() {
        if (this.isListeningToGlobalLayout || !this.view.isAttachedToWindow()) {
            return;
        }
        this.view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.isListeningToGlobalLayout = true;
    }

    private final void c() {
        if (this.isListeningToGlobalLayout) {
            this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.isListeningToGlobalLayout = false;
        }
    }

    public final void a() {
        c();
        this.view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f12193c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@dl.d View p10) {
        kotlin.jvm.internal.f0.p(p10, "p0");
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@dl.d View p10) {
        kotlin.jvm.internal.f0.p(p10, "p0");
        c();
    }
}
