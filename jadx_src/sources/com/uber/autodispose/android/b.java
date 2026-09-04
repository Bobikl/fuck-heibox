package com.uber.autodispose.android;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.uber.autodispose.OutsideScopeException;
import io.reactivex.g;

/* JADX INFO: compiled from: DetachEventCompletable.java */
/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f104061b;

    /* JADX INFO: compiled from: DetachEventCompletable.java */
    public static final class a extends io.reactivex.android.a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f104062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.d f104063d;

        a(View view, io.reactivex.d dVar) {
            this.f104062c = view;
            this.f104063d = dVar;
        }

        @Override // io.reactivex.android.a
        protected void a() {
            this.f104062c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (isDisposed()) {
                return;
            }
            this.f104063d.onComplete();
        }
    }

    b(View view) {
        this.f104061b = view;
    }

    @Override // io.reactivex.g
    public void d(io.reactivex.d dVar) {
        a aVar = new a(this.f104061b, dVar);
        dVar.onSubscribe(aVar);
        if (!com.uber.autodispose.android.internal.b.b()) {
            dVar.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        if (!(this.f104061b.isAttachedToWindow() || this.f104061b.getWindowToken() != null)) {
            dVar.onError(new OutsideScopeException("View is not attached!"));
            return;
        }
        this.f104061b.addOnAttachStateChangeListener(aVar);
        if (aVar.isDisposed()) {
            this.f104061b.removeOnAttachStateChangeListener(aVar);
        }
    }
}
