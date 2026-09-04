package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: AudioFocusManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44374j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44375k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44376l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44377m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f44378n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f44379o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f44380p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44381q = "AudioFocusManager";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f44382r = 0.2f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f44383s = 1.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f44384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f44385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private InterfaceC0372c f44386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.android.exoplayer2.audio.f f44387d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f44389f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f44391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44392i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f44390g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44388e = 0;

    /* JADX INFO: compiled from: AudioFocusManager.java */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f44393b;

        public a(Handler handler) {
            this.f44393b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            c.this.i(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.f44393b.post(new Runnable() { // from class: com.google.android.exoplayer2.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44361b.b(i10);
                }
            });
        }
    }

    /* JADX INFO: compiled from: AudioFocusManager.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioFocusManager.java */
    public interface InterfaceC0372c {
        void Q(float f10);

        void T(int i10);
    }

    public c(Context context, Handler handler, InterfaceC0372c interfaceC0372c) {
        this.f44384a = (AudioManager) com.google.android.exoplayer2.util.a.g((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f44386c = interfaceC0372c;
        this.f44385b = new a(handler);
    }

    private void a() {
        this.f44384a.abandonAudioFocus(this.f44385b);
    }

    private void b() {
        if (this.f44388e == 0) {
            return;
        }
        if (com.google.android.exoplayer2.util.u0.f51536a >= 26) {
            c();
        } else {
            a();
        }
        o(0);
    }

    @androidx.annotation.w0(26)
    private void c() {
        AudioFocusRequest audioFocusRequest = this.f44391h;
        if (audioFocusRequest != null) {
            this.f44384a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private static int e(@androidx.annotation.p0 com.google.android.exoplayer2.audio.f fVar) {
        if (fVar == null) {
            return 0;
        }
        int i10 = fVar.f44122d;
        switch (i10) {
            case 0:
                com.google.android.exoplayer2.util.u.m(f44381q, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (fVar.f44120b == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unidentified audio usage: ");
                sb2.append(i10);
                com.google.android.exoplayer2.util.u.m(f44381q, sb2.toString());
                return 0;
            case 16:
                return com.google.android.exoplayer2.util.u0.f51536a >= 19 ? 4 : 2;
        }
    }

    private void f(int i10) {
        InterfaceC0372c interfaceC0372c = this.f44386c;
        if (interfaceC0372c != null) {
            interfaceC0372c.T(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !r()) {
                o(3);
                return;
            } else {
                f(0);
                o(2);
                return;
            }
        }
        if (i10 == -1) {
            f(-1);
            b();
        } else if (i10 == 1) {
            o(1);
            f(1);
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Unknown focus change type: ");
            sb2.append(i10);
            com.google.android.exoplayer2.util.u.m(f44381q, sb2.toString());
        }
    }

    private int k() {
        if (this.f44388e == 1) {
            return 1;
        }
        if ((com.google.android.exoplayer2.util.u0.f51536a >= 26 ? m() : l()) == 1) {
            o(1);
            return 1;
        }
        o(0);
        return -1;
    }

    private int l() {
        return this.f44384a.requestAudioFocus(this.f44385b, com.google.android.exoplayer2.util.u0.q0(((com.google.android.exoplayer2.audio.f) com.google.android.exoplayer2.util.a.g(this.f44387d)).f44122d), this.f44389f);
    }

    @androidx.annotation.w0(26)
    private int m() {
        AudioFocusRequest audioFocusRequest = this.f44391h;
        if (audioFocusRequest == null || this.f44392i) {
            this.f44391h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f44389f) : new AudioFocusRequest.Builder(this.f44391h)).setAudioAttributes(((com.google.android.exoplayer2.audio.f) com.google.android.exoplayer2.util.a.g(this.f44387d)).c()).setWillPauseWhenDucked(r()).setOnAudioFocusChangeListener(this.f44385b).build();
            this.f44392i = false;
        }
        return this.f44384a.requestAudioFocus(this.f44391h);
    }

    private void o(int i10) {
        if (this.f44388e == i10) {
            return;
        }
        this.f44388e = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f44390g == f10) {
            return;
        }
        this.f44390g = f10;
        InterfaceC0372c interfaceC0372c = this.f44386c;
        if (interfaceC0372c != null) {
            interfaceC0372c.Q(f10);
        }
    }

    private boolean p(int i10) {
        return i10 == 1 || this.f44389f != 1;
    }

    private boolean r() {
        com.google.android.exoplayer2.audio.f fVar = this.f44387d;
        return fVar != null && fVar.f44120b == 1;
    }

    @androidx.annotation.j1
    AudioManager.OnAudioFocusChangeListener g() {
        return this.f44385b;
    }

    public float h() {
        return this.f44390g;
    }

    public void j() {
        this.f44386c = null;
        b();
    }

    public void n(@androidx.annotation.p0 com.google.android.exoplayer2.audio.f fVar) {
        if (com.google.android.exoplayer2.util.u0.c(this.f44387d, fVar)) {
            return;
        }
        this.f44387d = fVar;
        int iE = e(fVar);
        this.f44389f = iE;
        boolean z10 = true;
        if (iE != 1 && iE != 0) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int q(boolean z10, int i10) {
        if (p(i10)) {
            b();
            return z10 ? 1 : -1;
        }
        if (z10) {
            return k();
        }
        return -1;
    }
}
