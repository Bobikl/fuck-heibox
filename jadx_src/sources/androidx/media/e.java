package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: compiled from: AudioManagerCompat.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f24587a = "AudioManCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24588b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24589c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24590d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24591e = 4;

    /* JADX INFO: compiled from: AudioManagerCompat.java */
    @w0(26)
    public static class a {
        private a() {
        }

        @u
        static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        @u
        static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* JADX INFO: compiled from: AudioManagerCompat.java */
    @w0(28)
    public static class b {
        private b() {
        }

        @u
        static int a(AudioManager audioManager, int i10) {
            return audioManager.getStreamMinVolume(i10);
        }
    }

    private e() {
    }

    public static int a(@n0 AudioManager audioManager, @n0 androidx.media.b bVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (bVar != null) {
            return Build.VERSION.SDK_INT >= 26 ? a.a(audioManager, bVar.c()) : audioManager.abandonAudioFocus(bVar.f());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    @f0(from = 0)
    public static int b(@n0 AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    @f0(from = 0)
    public static int c(@n0 AudioManager audioManager, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(audioManager, i10);
        }
        return 0;
    }

    public static int d(@n0 AudioManager audioManager, @n0 androidx.media.b bVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (bVar != null) {
            return Build.VERSION.SDK_INT >= 26 ? a.b(audioManager, bVar.c()) : audioManager.requestAudioFocus(bVar.f(), bVar.b().j(), bVar.e());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
