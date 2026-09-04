package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.e1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.a0;
import androidx.lifecycle.y;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ComponentDialog.kt */
/* JADX INFO: loaded from: classes.dex */
public class k extends Dialog implements y, s, androidx.savedstate.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private a0 f1483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final androidx.savedstate.c f1484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final OnBackPressedDispatcher f1485d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public k(@dl.d Context context) {
        this(context, 0, 2, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public k(@dl.d Context context, @e1 int i10) {
        super(context, i10);
        f0.p(context, "context");
        this.f1484c = androidx.savedstate.c.f27397d.a(this);
        this.f1485d = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                k.e(this.f1482b);
            }
        });
    }

    public /* synthetic */ k(Context context, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final a0 b() {
        a0 a0Var = this.f1483b;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this);
        this.f1483b = a0Var2;
        return a0Var2;
    }

    public static /* synthetic */ void c() {
    }

    private final void d() {
        Window window = getWindow();
        f0.m(window);
        View decorView = window.getDecorView();
        f0.o(decorView, "window!!.decorView");
        ViewTreeLifecycleOwner.b(decorView, this);
        Window window2 = getWindow();
        f0.m(window2);
        View decorView2 = window2.getDecorView();
        f0.o(decorView2, "window!!.decorView");
        ViewTreeOnBackPressedDispatcherOwner.b(decorView2, this);
        Window window3 = getWindow();
        f0.m(window3);
        View decorView3 = window3.getDecorView();
        f0.o(decorView3, "window!!.decorView");
        ViewTreeSavedStateRegistryOwner.b(decorView3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k this$0) {
        f0.p(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@dl.d View view, @dl.e ViewGroup.LayoutParams layoutParams) {
        f0.p(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.y
    @dl.d
    public Lifecycle getLifecycle() {
        return b();
    }

    @Override // androidx.activity.s
    @dl.d
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f1485d;
    }

    @Override // androidx.savedstate.d
    @dl.d
    public androidx.savedstate.b getSavedStateRegistry() {
        return this.f1484c.b();
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    public void onBackPressed() {
        this.f1485d.f();
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    protected void onCreate(@dl.e Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f1485d;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            f0.o(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.g(onBackInvokedDispatcher);
        }
        this.f1484c.d(bundle);
        b().l(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    @dl.d
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        f0.o(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f1484c.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    protected void onStart() {
        super.onStart();
        b().l(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    @androidx.annotation.i
    protected void onStop() {
        b().l(Lifecycle.Event.ON_DESTROY);
        this.f1483b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(@dl.d View view) {
        f0.p(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@dl.d View view, @dl.e ViewGroup.LayoutParams layoutParams) {
        f0.p(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
