package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.w0;
import com.bumptech.glide.load.resource.bitmap.u;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: FirstFrameWaiter.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(26)
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set<Activity> f41766a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f41767b;

    /* JADX INFO: compiled from: FirstFrameWaiter.java */
    public class a implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f41768b;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FirstFrameWaiter.java */
        public class RunnableC0343a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f41770b;

            RunnableC0343a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f41770b = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                u.c().i();
                h.this.f41767b = true;
                h.b(a.this.f41768b, this.f41770b);
                h.this.f41766a.clear();
            }
        }

        a(View view) {
            this.f41768b = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            com.bumptech.glide.util.o.y(new RunnableC0343a(this));
        }
    }

    h() {
    }

    static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.i
    public void a(Activity activity) {
        if (!this.f41767b && this.f41766a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
