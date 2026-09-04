package r8;

import androidx.annotation.p0;
import com.google.android.exoplayer2.source.rtsp.k;

/* JADX INFO: compiled from: DefaultRtpPayloadReaderFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements e.a {
    @Override // r8.e.a
    @p0
    public e a(k kVar) {
        String str = (String) com.google.android.exoplayer2.util.a.g(kVar.f48796c.f43593m);
        str.hashCode();
        switch (str) {
            case "audio/mp4a-latm":
                return new b(kVar);
            case "audio/ac3":
                return new c(kVar);
            case "video/avc":
                return new d(kVar);
            default:
                return null;
        }
    }
}
