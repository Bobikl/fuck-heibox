package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes7.dex */
public final class AudioCapabilitiesReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f43935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f43936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f43937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final BroadcastReceiver f43938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private final b f43939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    h f43940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43941g;

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilitiesReceiver.this.c(h.d(context, intent));
        }
    }

    public final class b extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f43943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f43944b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f43943a = contentResolver;
            this.f43944b = uri;
        }

        public void a() {
            this.f43943a.registerContentObserver(this.f43944b, false, this);
        }

        public void b() {
            this.f43943a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.c(h.c(audioCapabilitiesReceiver.f43935a));
        }
    }

    public interface c {
        void a(h hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f43935a = applicationContext;
        this.f43936b = (c) com.google.android.exoplayer2.util.a.g(cVar);
        Handler handlerA = com.google.android.exoplayer2.util.u0.A();
        this.f43937c = handlerA;
        this.f43938d = com.google.android.exoplayer2.util.u0.f51536a >= 21 ? new HdmiAudioPlugBroadcastReceiver() : null;
        Uri uriE = h.e();
        this.f43939e = uriE != null ? new b(handlerA, applicationContext.getContentResolver(), uriE) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(h hVar) {
        if (!this.f43941g || hVar.equals(this.f43940f)) {
            return;
        }
        this.f43940f = hVar;
        this.f43936b.a(hVar);
    }

    public h d() {
        if (this.f43941g) {
            return (h) com.google.android.exoplayer2.util.a.g(this.f43940f);
        }
        this.f43941g = true;
        b bVar = this.f43939e;
        if (bVar != null) {
            bVar.a();
        }
        Intent intentRegisterReceiver = null;
        if (this.f43938d != null) {
            intentRegisterReceiver = this.f43935a.registerReceiver(this.f43938d, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f43937c);
        }
        h hVarD = h.d(this.f43935a, intentRegisterReceiver);
        this.f43940f = hVarD;
        return hVarD;
    }

    public void e() {
        if (this.f43941g) {
            this.f43940f = null;
            BroadcastReceiver broadcastReceiver = this.f43938d;
            if (broadcastReceiver != null) {
                this.f43935a.unregisterReceiver(broadcastReceiver);
            }
            b bVar = this.f43939e;
            if (bVar != null) {
                bVar.b();
            }
            this.f43941g = false;
        }
    }
}
