package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes7.dex */
public final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioBecomingNoisyReceiver f43492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43493c;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f43494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f43495c;

        public AudioBecomingNoisyReceiver(Handler handler, a aVar) {
            this.f43495c = handler;
            this.f43494b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f43495c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f43493c) {
                this.f43494b.A();
            }
        }
    }

    public interface a {
        void A();
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, a aVar) {
        this.f43491a = context.getApplicationContext();
        this.f43492b = new AudioBecomingNoisyReceiver(handler, aVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f43493c) {
            this.f43491a.registerReceiver(this.f43492b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f43493c = true;
        } else {
            if (z10 || !this.f43493c) {
                return;
            }
            this.f43491a.unregisterReceiver(this.f43492b);
            this.f43493c = false;
        }
    }
}
