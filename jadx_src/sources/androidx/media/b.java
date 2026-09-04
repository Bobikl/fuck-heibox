package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: compiled from: AudioFocusRequestCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final AudioAttributesCompat f24572g = new AudioAttributesCompat.d().e(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f24574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f24575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioAttributesCompat f24576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f24578f;

    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    @w0(26)
    public static class a {
        private a() {
        }

        @u
        static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* JADX INFO: renamed from: androidx.media.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    public static final class C0184b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f24580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f24581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AudioAttributesCompat f24582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24583e;

        public C0184b(int i10) {
            this.f24582d = b.f24572g;
            d(i10);
        }

        public C0184b(@n0 b bVar) {
            this.f24582d = b.f24572g;
            if (bVar == null) {
                throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
            }
            this.f24579a = bVar.e();
            this.f24580b = bVar.f();
            this.f24581c = bVar.d();
            this.f24582d = bVar.b();
            this.f24583e = bVar.g();
        }

        private static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }

        public b a() {
            if (this.f24580b != null) {
                return new b(this.f24579a, this.f24580b, this.f24581c, this.f24582d, this.f24583e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @n0
        public C0184b c(@n0 AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f24582d = audioAttributesCompat;
            return this;
        }

        @n0
        public C0184b d(int i10) {
            if (b(i10)) {
                this.f24579a = i10;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i10);
        }

        @n0
        public C0184b e(@n0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        @n0
        public C0184b f(@n0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @n0 Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f24580b = onAudioFocusChangeListener;
            this.f24581c = handler;
            return this;
        }

        @n0
        public C0184b g(boolean z10) {
            this.f24583e = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: AudioFocusRequestCompat.java */
    public static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f24584d = 2782386;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f24585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f24586c;

        c(@n0 AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, @n0 Handler handler) {
            this.f24586c = onAudioFocusChangeListener;
            this.f24585b = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != f24584d) {
                return false;
            }
            this.f24586c.onAudioFocusChange(message.arg1);
            return true;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i10) {
            Handler handler = this.f24585b;
            handler.sendMessage(Message.obtain(handler, f24584d, i10, 0));
        }
    }

    b(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z10) {
        this.f24573a = i10;
        this.f24575c = handler;
        this.f24576d = audioAttributesCompat;
        this.f24577e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f24574b = onAudioFocusChangeListener;
        } else {
            this.f24574b = new c(onAudioFocusChangeListener, handler);
        }
        if (i11 >= 26) {
            this.f24578f = a.a(i10, a(), z10, this.f24574b, handler);
        } else {
            this.f24578f = null;
        }
    }

    @w0(21)
    AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f24576d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.c();
        }
        return null;
    }

    @n0
    public AudioAttributesCompat b() {
        return this.f24576d;
    }

    @w0(26)
    AudioFocusRequest c() {
        return (AudioFocusRequest) this.f24578f;
    }

    @n0
    public Handler d() {
        return this.f24575c;
    }

    public int e() {
        return this.f24573a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24573a == bVar.f24573a && this.f24577e == bVar.f24577e && androidx.core.util.j.a(this.f24574b, bVar.f24574b) && androidx.core.util.j.a(this.f24575c, bVar.f24575c) && androidx.core.util.j.a(this.f24576d, bVar.f24576d);
    }

    @n0
    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f24574b;
    }

    public boolean g() {
        return this.f24577e;
    }

    public int hashCode() {
        return androidx.core.util.j.b(Integer.valueOf(this.f24573a), this.f24574b, this.f24575c, this.f24576d, Boolean.valueOf(this.f24577e));
    }
}
