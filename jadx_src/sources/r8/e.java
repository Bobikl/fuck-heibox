package r8;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.source.rtsp.k;
import com.google.android.exoplayer2.util.e0;

/* JADX INFO: compiled from: RtpPayloadReader.java */
/* JADX INFO: loaded from: classes7.dex */
public interface e {

    /* JADX INFO: compiled from: RtpPayloadReader.java */
    public interface a {
        e a(k kVar);
    }

    void a(long j10, long j11);

    void b(m mVar, int i10);

    void c(long j10, int i10);

    void d(e0 e0Var, long j10, int i10, boolean z10) throws ParserException;
}
