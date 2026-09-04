package okhttp3.internal.connection;

import dl.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.k;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "isFallbackPossible", "sslSocket", "Lokhttp3/k;", "configureSecureSocket", "Ljava/io/IOException;", "e", "connectionFailed", "", "nextModeIndex", "I", "Z", "isFallback", "", "connectionSpecs", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ConnectionSpecSelector {
    private final List<k> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@d List<k> connectionSpecs) {
        f0.p(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    private final boolean isFallbackPossible(SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i10 = this.nextModeIndex; i10 < size; i10++) {
            if (this.connectionSpecs.get(i10).h(socket)) {
                return true;
            }
        }
        return false;
    }

    @d
    public final k configureSecureSocket(@d SSLSocket sslSocket) throws IOException, CloneNotSupportedException {
        k kVar;
        f0.p(sslSocket, "sslSocket");
        int i10 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i10 >= size) {
                kVar = null;
                break;
            }
            kVar = this.connectionSpecs.get(i10);
            if (kVar.h(sslSocket)) {
                this.nextModeIndex = i10 + 1;
                break;
            }
            i10++;
        }
        if (kVar != null) {
            this.isFallbackPossible = isFallbackPossible(sslSocket);
            kVar.f(sslSocket, this.isFallback);
            return kVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.isFallback);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.connectionSpecs);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        f0.m(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        f0.o(string, "java.util.Arrays.toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean connectionFailed(@d IOException e10) {
        f0.p(e10, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (e10 instanceof ProtocolException) || (e10 instanceof InterruptedIOException) || ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException) || !(e10 instanceof SSLException)) ? false : true;
    }
}
