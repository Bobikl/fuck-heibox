package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.y;

/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49631a = new a();

    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    public class a implements i {
        a() {
        }

        @Override // com.google.android.exoplayer2.text.i
        public boolean a(a2 a2Var) {
            String str = a2Var.f43593m;
            return "text/vtt".equals(str) || y.f51573g0.equals(str) || y.f51599t0.equals(str) || y.f51603v0.equals(str) || y.f51597s0.equals(str) || y.f51601u0.equals(str) || y.f51593q0.equals(str) || y.f51605w0.equals(str) || y.f51595r0.equals(str) || y.D0.equals(str) || y.f51611z0.equals(str) || y.f51575h0.equals(str);
        }

        @Override // com.google.android.exoplayer2.text.i
        public h b(a2 a2Var) {
            String str = a2Var.f43593m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new com.google.android.exoplayer2.text.dvb.a(a2Var.f43595o);
                    case "application/pgs":
                        return new com.google.android.exoplayer2.text.pgs.a();
                    case "application/x-mp4-vtt":
                        return new com.google.android.exoplayer2.text.webvtt.a();
                    case "text/vtt":
                        return new com.google.android.exoplayer2.text.webvtt.h();
                    case "application/x-quicktime-tx3g":
                        return new com.google.android.exoplayer2.text.tx3g.a(a2Var.f43595o);
                    case "text/x-ssa":
                        return new com.google.android.exoplayer2.text.ssa.a(a2Var.f43595o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new com.google.android.exoplayer2.text.cea.a(str, a2Var.E, com.google.android.exoplayer2.text.cea.a.A);
                    case "text/x-exoplayer-cues":
                        return new e();
                    case "application/cea-708":
                        return new com.google.android.exoplayer2.text.cea.c(a2Var.E, a2Var.f43595o);
                    case "application/x-subrip":
                        return new com.google.android.exoplayer2.text.subrip.a();
                    case "application/ttml+xml":
                        return new com.google.android.exoplayer2.text.ttml.c();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(a2 a2Var);

    h b(a2 a2Var);
}
