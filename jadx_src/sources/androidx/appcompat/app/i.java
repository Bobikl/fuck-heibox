package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.R;

/* JADX INFO: compiled from: AppCompatDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends androidx.activity.k implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f1801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.core.view.p.a f1802f;

    public i(@n0 Context context) {
        this(context, 0);
    }

    public i(@n0 Context context, int i10) {
        super(context, h(context, i10));
        this.f1802f = new androidx.core.view.p.a() { // from class: androidx.appcompat.app.h
            @Override // androidx.core.view.p.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f1800b.i(keyEvent);
            }
        };
        e eVarF = f();
        eVarF.R(h(context, i10));
        eVarF.z(null);
    }

    protected i(@n0 Context context, boolean z10, @p0 DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f1802f = new androidx.core.view.p.a() { // from class: androidx.appcompat.app.h
            @Override // androidx.core.view.p.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f1800b.i(keyEvent);
            }
        };
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    private static int h(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void addContentView(@n0 View view, ViewGroup.LayoutParams layoutParams) {
        f().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.p.e(this.f1802f, getWindow().getDecorView(), this, keyEvent);
    }

    @n0
    public e f() {
        if (this.f1801e == null) {
            this.f1801e = e.j(this, this);
        }
        return this.f1801e;
    }

    @Override // android.app.Dialog
    @p0
    public <T extends View> T findViewById(@d0 int i10) {
        return (T) f().n(i10);
    }

    public ActionBar g() {
        return f().s();
    }

    boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        f().v();
    }

    public boolean j(int i10) {
        return f().I(i10);
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        f().u();
        super.onCreate(bundle);
        f().z(bundle);
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStop() {
        super.onStop();
        f().F();
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    @p0
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void setContentView(@i0 int i10) {
        f().K(i10);
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void setContentView(@n0 View view) {
        f().L(view);
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void setContentView(@n0 View view, ViewGroup.LayoutParams layoutParams) {
        f().M(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        f().S(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().S(charSequence);
    }
}
