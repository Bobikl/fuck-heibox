package com.hihonor.push.sdk;

import android.content.Context;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f60050e = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f60051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f60052b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f60053c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f60054d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f60055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HonorPushCallback f60056b;

        public a(Runnable runnable, HonorPushCallback honorPushCallback) {
            this.f60055a = runnable;
            this.f60056b = honorPushCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l.this.f60052b) {
                this.f60055a.run();
                return;
            }
            HonorPushCallback honorPushCallback = this.f60056b;
            if (honorPushCallback != null) {
                HonorPushErrorEnum honorPushErrorEnum = HonorPushErrorEnum.ERROR_NOT_INITIALIZED;
                honorPushCallback.onFailure(honorPushErrorEnum.getErrorCode(), honorPushErrorEnum.getMessage());
            }
        }
    }

    public Context a() {
        return this.f60051a.get();
    }

    public final void a(Runnable runnable, HonorPushCallback<?> honorPushCallback) {
        b1.a(new a(runnable, honorPushCallback));
    }

    public boolean a(Context context) {
        return HonorPushErrorEnum.SUCCESS.statusCode == b.b(context);
    }
}
