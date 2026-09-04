package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes7.dex */
public final class StreamVolumeManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f43555i = "StreamVolumeManager";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f43556j = "android.media.VOLUME_CHANGED_ACTION";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f43557k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f43559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f43560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f43561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private VolumeChangeReceiver f43562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f43564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f43565h;

    public final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = StreamVolumeManager.this.f43559b;
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.v3
                @Override // java.lang.Runnable
                public final void run() {
                    StreamVolumeManager.b(streamVolumeManager);
                }
            });
        }
    }

    public interface b {
        void G(int i10);

        void O(int i10, boolean z10);
    }

    public StreamVolumeManager(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f43558a = applicationContext;
        this.f43559b = handler;
        this.f43560c = bVar;
        AudioManager audioManager = (AudioManager) com.google.android.exoplayer2.util.a.k((AudioManager) applicationContext.getSystemService("audio"));
        this.f43561d = audioManager;
        this.f43563f = 3;
        this.f43564g = h(audioManager, 3);
        this.f43565h = f(audioManager, this.f43563f);
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(f43556j));
            this.f43562e = volumeChangeReceiver;
        } catch (RuntimeException e10) {
            com.google.android.exoplayer2.util.u.n(f43555i, "Error registering stream volume receiver", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.o();
    }

    private static boolean f(AudioManager audioManager, int i10) {
        if (com.google.android.exoplayer2.util.u0.f51536a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return h(audioManager, i10) == 0;
    }

    private static int h(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i10);
            com.google.android.exoplayer2.util.u.n(f43555i, sb2.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int iH = h(this.f43561d, this.f43563f);
        boolean zF = f(this.f43561d, this.f43563f);
        if (this.f43564g == iH && this.f43565h == zF) {
            return;
        }
        this.f43564g = iH;
        this.f43565h = zF;
        this.f43560c.O(iH, zF);
    }

    public void c() {
        if (this.f43564g <= e()) {
            return;
        }
        this.f43561d.adjustStreamVolume(this.f43563f, -1, 1);
        o();
    }

    public int d() {
        return this.f43561d.getStreamMaxVolume(this.f43563f);
    }

    public int e() {
        if (com.google.android.exoplayer2.util.u0.f51536a >= 28) {
            return this.f43561d.getStreamMinVolume(this.f43563f);
        }
        return 0;
    }

    public int g() {
        return this.f43564g;
    }

    public void i() {
        if (this.f43564g >= d()) {
            return;
        }
        this.f43561d.adjustStreamVolume(this.f43563f, 1, 1);
        o();
    }

    public boolean j() {
        return this.f43565h;
    }

    public void k() {
        VolumeChangeReceiver volumeChangeReceiver = this.f43562e;
        if (volumeChangeReceiver != null) {
            try {
                this.f43558a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e10) {
                com.google.android.exoplayer2.util.u.n(f43555i, "Error unregistering stream volume receiver", e10);
            }
            this.f43562e = null;
        }
    }

    public void l(boolean z10) {
        if (com.google.android.exoplayer2.util.u0.f51536a >= 23) {
            this.f43561d.adjustStreamVolume(this.f43563f, z10 ? -100 : 100, 1);
        } else {
            this.f43561d.setStreamMute(this.f43563f, z10);
        }
        o();
    }

    public void m(int i10) {
        if (this.f43563f == i10) {
            return;
        }
        this.f43563f = i10;
        o();
        this.f43560c.G(i10);
    }

    public void n(int i10) {
        if (i10 < e() || i10 > d()) {
            return;
        }
        this.f43561d.setStreamVolume(this.f43563f, i10, 1);
        o();
    }
}
