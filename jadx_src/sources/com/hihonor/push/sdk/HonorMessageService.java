package com.hihonor.push.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import com.hihonor.push.sdk.common.data.DownMsgType;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HonorMessageService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f59990c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f59991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f59992b;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<HonorMessageService> f59993a;

        public a(Looper looper, HonorMessageService honorMessageService) {
            super(looper);
            this.f59993a = new WeakReference<>(honorMessageService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            HonorMessageService honorMessageService = this.f59993a.get();
            if (honorMessageService == null) {
                Log.w("HonorMessageService", "service is null for release");
                return;
            }
            Log.i("HonorMessageService", "handle message for broadcast.");
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                int i10 = HonorMessageService.f59990c;
                honorMessageService.a(intent);
            }
        }
    }

    public HonorMessageService() {
        a aVar = new a(Looper.getMainLooper(), this);
        this.f59991a = aVar;
        this.f59992b = new Messenger(aVar);
    }

    public final void a(Intent intent) {
        try {
            if (TextUtils.equals(intent.getStringExtra("event_type"), DownMsgType.RECEIVE_TOKEN)) {
                String stringExtra = intent.getStringExtra("push_token");
                Context contextA = l.f60050e.a();
                d dVar = d.f60011b;
                if (!TextUtils.equals(stringExtra, dVar.b(contextA))) {
                    dVar.a(contextA, stringExtra);
                }
                Log.i("HonorMessageService", "onNewToken");
                onNewToken(stringExtra);
            } else {
                Log.i("HonorMessageService", "parse remote data start.");
                a1 a1VarA = b.a(new q0(intent));
                com.hihonor.push.sdk.a aVar = new com.hihonor.push.sdk.a(this);
                a1VarA.getClass();
                a1VarA.a(new t0(o0.f60063c.f60064a, aVar));
            }
            Log.i("HonorMessageService", "dispatch message end.");
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f59992b.getBinder();
    }

    public void onMessageReceived(HonorPushDataMsg honorPushDataMsg) {
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        Log.i("HonorMessageService", "handle message for service.");
        a(intent);
        return 2;
    }
}
