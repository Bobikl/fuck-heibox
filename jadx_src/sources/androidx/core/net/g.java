package androidx.core.net;

import android.net.TrafficStats;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.n0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: compiled from: TrafficStatsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: compiled from: TrafficStatsCompat.java */
    @w0(24)
    public static class a {
        private a() {
        }

        @u
        static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @u
        static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private g() {
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i10) {
        TrafficStats.incrementOperationCount(i10);
    }

    @Deprecated
    public static void d(int i10, int i11) {
        TrafficStats.incrementOperationCount(i10, i11);
    }

    @Deprecated
    public static void e(int i10) {
        TrafficStats.setThreadStatsTag(i10);
    }

    public static void f(@n0 DatagramSocket datagramSocket) throws SocketException {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(datagramSocket);
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorFromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.tagSocket(new c(datagramSocket, parcelFileDescriptorFromDatagramSocket.getFileDescriptor()));
        parcelFileDescriptorFromDatagramSocket.detachFd();
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@n0 DatagramSocket datagramSocket) throws SocketException {
        if (Build.VERSION.SDK_INT >= 24) {
            a.b(datagramSocket);
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorFromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.untagSocket(new c(datagramSocket, parcelFileDescriptorFromDatagramSocket.getFileDescriptor()));
        parcelFileDescriptorFromDatagramSocket.detachFd();
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
