package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public class n implements q3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f47012j = 5000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f47013k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47014l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f47015m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f47016n = 50;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f47017o = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.mediacodec.k f47019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f47021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f47022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.mediacodec.p f47023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f47025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47026i;

    /* JADX INFO: compiled from: DefaultRenderersFactory.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public n(Context context) {
        this.f47018a = context;
        this.f47019b = new com.google.android.exoplayer2.mediacodec.k();
        this.f47020c = 0;
        this.f47021d = 5000L;
        this.f47023f = com.google.android.exoplayer2.mediacodec.p.f46808a;
    }

    @Deprecated
    public n(Context context, int i10) {
        this(context, i10, 5000L);
    }

    @Deprecated
    public n(Context context, int i10, long j10) {
        this.f47018a = context;
        this.f47020c = i10;
        this.f47021d = j10;
        this.f47023f = com.google.android.exoplayer2.mediacodec.p.f46808a;
        this.f47019b = new com.google.android.exoplayer2.mediacodec.k();
    }

    @Override // com.google.android.exoplayer2.q3
    public m3[] a(Handler handler, com.google.android.exoplayer2.video.y yVar, com.google.android.exoplayer2.audio.t tVar, com.google.android.exoplayer2.text.m mVar, com.google.android.exoplayer2.metadata.e eVar) {
        ArrayList<m3> arrayList = new ArrayList<>();
        h(this.f47018a, this.f47020c, this.f47023f, this.f47022e, handler, yVar, this.f47021d, arrayList);
        AudioSink audioSinkC = c(this.f47018a, this.f47024g, this.f47025h, this.f47026i);
        if (audioSinkC != null) {
            b(this.f47018a, this.f47020c, this.f47023f, this.f47022e, audioSinkC, handler, tVar, arrayList);
        }
        g(this.f47018a, mVar, handler.getLooper(), this.f47020c, arrayList);
        e(this.f47018a, eVar, handler.getLooper(), this.f47020c, arrayList);
        d(this.f47018a, this.f47020c, arrayList);
        f(this.f47018a, handler, this.f47020c, arrayList);
        return (m3[]) arrayList.toArray(new m3[0]);
    }

    protected void b(Context context, int i10, com.google.android.exoplayer2.mediacodec.p pVar, boolean z10, AudioSink audioSink, Handler handler, com.google.android.exoplayer2.audio.t tVar, ArrayList<m3> arrayList) {
        int i11;
        int i12;
        arrayList.add(new com.google.android.exoplayer2.audio.m0(context, this.f47019b, pVar, z10, handler, tVar, audioSink));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (m3) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.t.class, AudioSink.class).newInstance(handler, tVar, audioSink));
                    com.google.android.exoplayer2.util.u.h(f47017o, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating Opus extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (m3) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.t.class, AudioSink.class).newInstance(handler, tVar, audioSink));
                    com.google.android.exoplayer2.util.u.h(f47017o, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i12, (m3) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.t.class, AudioSink.class).newInstance(handler, tVar, audioSink));
                com.google.android.exoplayer2.util.u.h(f47017o, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating FLAC extension", e12);
        }
    }

    @androidx.annotation.p0
    protected AudioSink c(Context context, boolean z10, boolean z11, boolean z12) {
        return new DefaultAudioSink(com.google.android.exoplayer2.audio.h.c(context), new DefaultAudioSink.d(new AudioProcessor[0]), z10, z11, z12 ? 1 : 0);
    }

    protected void d(Context context, int i10, ArrayList<m3> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.video.spherical.b());
    }

    protected void e(Context context, com.google.android.exoplayer2.metadata.e eVar, Looper looper, int i10, ArrayList<m3> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.f(eVar, looper));
    }

    protected void f(Context context, Handler handler, int i10, ArrayList<m3> arrayList) {
    }

    protected void g(Context context, com.google.android.exoplayer2.text.m mVar, Looper looper, int i10, ArrayList<m3> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.text.n(mVar, looper));
    }

    protected void h(Context context, int i10, com.google.android.exoplayer2.mediacodec.p pVar, boolean z10, Handler handler, com.google.android.exoplayer2.video.y yVar, long j10, ArrayList<m3> arrayList) {
        int i11;
        arrayList.add(new com.google.android.exoplayer2.video.h(context, this.f47019b, pVar, j10, z10, handler, yVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (m3) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.google.android.exoplayer2.video.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
                    com.google.android.exoplayer2.util.u.h(f47017o, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i11, (m3) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.google.android.exoplayer2.video.y.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, yVar, 50));
            com.google.android.exoplayer2.util.u.h(f47017o, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    public n i(boolean z10) {
        this.f47019b.b(z10);
        return this;
    }

    public n j() {
        this.f47019b.c();
        return this;
    }

    public n k() {
        this.f47019b.d();
        return this;
    }

    public n l(long j10) {
        this.f47021d = j10;
        return this;
    }

    public n m(boolean z10) {
        this.f47024g = z10;
        return this;
    }

    public n n(boolean z10) {
        this.f47026i = z10;
        return this;
    }

    public n o(boolean z10) {
        this.f47025h = z10;
        return this;
    }

    public n p(boolean z10) {
        this.f47022e = z10;
        return this;
    }

    public n q(int i10) {
        this.f47020c = i10;
        return this;
    }

    public n r(com.google.android.exoplayer2.mediacodec.p pVar) {
        this.f47023f = pVar;
        return this;
    }
}
