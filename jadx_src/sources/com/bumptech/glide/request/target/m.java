package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: PreloadTarget.java */
/* JADX INFO: loaded from: classes6.dex */
public final class m<Z> extends e<Z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41923c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Handler f41924d = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.j f41925b;

    /* JADX INFO: compiled from: PreloadTarget.java */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).a();
            return true;
        }
    }

    private m(com.bumptech.glide.j jVar, int i10, int i11) {
        super(i10, i11);
        this.f41925b = jVar;
    }

    public static <Z> m<Z> b(com.bumptech.glide.j jVar, int i10, int i11) {
        return new m<>(jVar, i10, i11);
    }

    void a() {
        this.f41925b.q(this);
    }

    @Override // com.bumptech.glide.request.target.p
    public void onLoadCleared(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void onResourceReady(@n0 Z z10, @p0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        com.bumptech.glide.request.e request = getRequest();
        if (request == null || !request.isComplete()) {
            return;
        }
        f41924d.obtainMessage(1, this).sendToTarget();
    }
}
