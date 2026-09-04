package okhttp3.dnsoverhttps;

import com.umeng.analytics.pro.ak;
import dl.d;
import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.x1;
import okio.Buffer;
import okio.ByteString;
import okio.Utf8;

/* JADX INFO: compiled from: DnsRecordCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u001d\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lokhttp3/dnsoverhttps/c;", "", "Lokio/Buffer;", "source", "Lkotlin/b2;", ak.aF, "", "host", "", "type", "Lokio/ByteString;", "b", "hostname", "byteString", "", "Ljava/net/InetAddress;", ak.av, "I", "SERVFAIL", "NXDOMAIN", "TYPE_A", "d", "TYPE_AAAA", "e", "TYPE_PTR", "Ljava/nio/charset/Charset;", "kotlin.jvm.PlatformType", "f", "Ljava/nio/charset/Charset;", "ASCII", "<init>", "()V", "okhttp-dnsoverhttps"}, k = 1, mv = {1, 4, 0})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final int SERVFAIL = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int NXDOMAIN = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_A = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_AAAA = 28;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int TYPE_PTR = 12;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f132512g = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final Charset ASCII = StandardCharsets.US_ASCII;

    private c() {
    }

    private final void c(Buffer buffer) throws EOFException {
        byte b10 = buffer.readByte();
        if (b10 < 0) {
            buffer.skip(1L);
            return;
        }
        while (b10 > 0) {
            buffer.skip(b10);
            b10 = buffer.readByte();
        }
    }

    @d
    public final List<InetAddress> a(@d String hostname, @d ByteString byteString) throws Exception {
        f0.p(hostname, "hostname");
        f0.p(byteString, "byteString");
        ArrayList arrayList = new ArrayList();
        Buffer buffer = new Buffer();
        buffer.write(byteString);
        buffer.readShort();
        int i10 = buffer.readShort() & x1.f128661e;
        if (!((i10 >> 15) != 0)) {
            throw new IllegalArgumentException("not a response".toString());
        }
        int i11 = i10 & 15;
        if (i11 == 3) {
            throw new UnknownHostException(hostname + ": NXDOMAIN");
        }
        if (i11 == 2) {
            throw new UnknownHostException(hostname + ": SERVFAIL");
        }
        int i12 = buffer.readShort() & x1.f128661e;
        int i13 = buffer.readShort() & x1.f128661e;
        buffer.readShort();
        buffer.readShort();
        for (int i14 = 0; i14 < i12; i14++) {
            c(buffer);
            buffer.readShort();
            buffer.readShort();
        }
        for (int i15 = 0; i15 < i13; i15++) {
            c(buffer);
            int i16 = buffer.readShort() & x1.f128661e;
            buffer.readShort();
            buffer.readInt();
            int i17 = buffer.readShort() & x1.f128661e;
            if (i16 == 1 || i16 == 28) {
                byte[] bArr = new byte[i17];
                buffer.read(bArr);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                f0.o(byAddress, "InetAddress.getByAddress(bytes)");
                arrayList.add(byAddress);
            } else {
                buffer.skip(i17);
            }
        }
        return arrayList;
    }

    @d
    public final ByteString b(@d String host, int type) {
        List<String> listE;
        f0.p(host, "host");
        Buffer buffer = new Buffer();
        buffer.writeShort(0);
        buffer.writeShort(256);
        buffer.writeShort(1);
        buffer.writeShort(0);
        buffer.writeShort(0);
        buffer.writeShort(0);
        Buffer buffer2 = new Buffer();
        List listT4 = StringsKt__StringsKt.T4(host, new char[]{lg.a.f131414g}, false, 0, 6, null);
        if (listT4.isEmpty()) {
            listE = CollectionsKt__CollectionsKt.E();
            break;
        }
        ListIterator listIterator = listT4.listIterator(listT4.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listE = CollectionsKt__CollectionsKt.E();
                break;
            }
            if (!(((String) listIterator.previous()).length() == 0)) {
                listE = CollectionsKt___CollectionsKt.E5(listT4, listIterator.nextIndex() + 1);
                break;
            }
        }
        for (String str : listE) {
            long jSize$default = Utf8.size$default(str, 0, 0, 3, null);
            if (!(jSize$default == ((long) str.length()))) {
                throw new IllegalArgumentException(("non-ascii hostname: " + host).toString());
            }
            buffer2.writeByte((int) jSize$default);
            buffer2.writeUtf8(str);
        }
        buffer2.writeByte(0);
        buffer2.copyTo(buffer, 0L, buffer2.size());
        buffer.writeShort(type);
        buffer.writeShort(1);
        return buffer.readByteString();
    }
}
