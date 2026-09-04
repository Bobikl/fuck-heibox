package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.util.y;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f46818a = new a();

    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class a implements c {
        a() {
        }

        @Override // com.google.android.exoplayer2.metadata.c
        public boolean a(a2 a2Var) {
            String str = a2Var.f43593m;
            return y.f51591p0.equals(str) || y.C0.equals(str) || y.A0.equals(str) || y.F0.equals(str) || y.G0.equals(str);
        }

        @Override // com.google.android.exoplayer2.metadata.c
        public b b(a2 a2Var) {
            String str = a2Var.f43593m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new com.google.android.exoplayer2.metadata.dvbsi.a();
                    case "application/x-icy":
                        return new com.google.android.exoplayer2.metadata.icy.a();
                    case "application/id3":
                        return new com.google.android.exoplayer2.metadata.id3.b();
                    case "application/x-emsg":
                        return new com.google.android.exoplayer2.metadata.emsg.a();
                    case "application/x-scte35":
                        return new com.google.android.exoplayer2.metadata.scte35.a();
                }
            }
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(strValueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    }

    boolean a(a2 a2Var);

    b b(a2 a2Var);
}
