package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f106729a;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<BaseService> f106730a;

        public a(WeakReference<BaseService> weakReference) {
            this.f106730a = weakReference;
        }

        public void a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what != 1001 || (weakReference = this.f106730a) == null || (baseService = weakReference.get()) == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.c("TimeoutHandler " + baseService.toString() + " kill self");
            if (!baseService.mo87a()) {
                baseService.stopSelf();
            } else {
                com.xiaomi.channel.commonutils.logger.b.c("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract boolean mo87a();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        super.onStart(intent, i10);
        if (this.f106729a == null) {
            this.f106729a = new a(new WeakReference(this));
        }
        this.f106729a.a();
    }
}
