package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: FragmentHostCallback.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t<E> extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final Activity f23850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    private final Context f23851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    private final Handler f23852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final FragmentManager f23854f;

    t(@androidx.annotation.p0 Activity activity, @androidx.annotation.n0 Context context, @androidx.annotation.n0 Handler handler, int i10) {
        this.f23854f = new e0();
        this.f23850b = activity;
        this.f23851c = (Context) androidx.core.util.o.m(context, "context == null");
        this.f23852d = (Handler) androidx.core.util.o.m(handler, "handler == null");
        this.f23853e = i10;
    }

    public t(@androidx.annotation.n0 Context context, @androidx.annotation.n0 Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
    }

    t(@androidx.annotation.n0 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @Override // androidx.fragment.app.q
    @androidx.annotation.p0
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.q
    public boolean d() {
        return true;
    }

    @androidx.annotation.p0
    Activity e() {
        return this.f23850b;
    }

    @androidx.annotation.n0
    Context f() {
        return this.f23851c;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Handler g() {
        return this.f23852d;
    }

    public void h(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
    }

    @androidx.annotation.p0
    public abstract E i();

    @androidx.annotation.n0
    public LayoutInflater j() {
        return LayoutInflater.from(this.f23851c);
    }

    public int k() {
        return this.f23853e;
    }

    public boolean l() {
        return true;
    }

    @Deprecated
    public void m(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 String[] strArr, int i10) {
    }

    public boolean n(@androidx.annotation.n0 Fragment fragment) {
        return true;
    }

    public boolean o(@androidx.annotation.n0 String str) {
        return false;
    }

    public void p(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Intent intent, int i10) {
        q(fragment, intent, i10, null);
    }

    public void q(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.d.w(this.f23851c, intent, bundle);
    }

    @Deprecated
    public void r(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.R(this.f23850b, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void s() {
    }
}
