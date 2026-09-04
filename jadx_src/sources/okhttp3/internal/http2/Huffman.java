package okhttp3.internal.http2;

import bb.c;
import com.google.common.base.a;
import dl.d;
import dl.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: Huffman.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "", "symbol", "code", "codeBitCount", "Lkotlin/b2;", "addCode", "Lokio/ByteString;", "source", "Lokio/BufferedSink;", "sink", "encode", "bytes", "encodedLength", "Lokio/BufferedSource;", "", "byteCount", "decode", "", "CODES", "[I", "", "CODE_BIT_COUNTS", "[B", "Lokhttp3/internal/http2/Huffman$Node;", "root", "Lokhttp3/internal/http2/Huffman$Node;", "<init>", "()V", "Node", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Huffman {
    private static final int[] CODES;
    private static final byte[] CODE_BIT_COUNTS;
    public static final Huffman INSTANCE;
    private static final Node root;

    /* JADX INFO: compiled from: Huffman.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "()V", "symbol", "", "bits", "(II)V", "children", "", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "[Lokhttp3/internal/http2/Huffman$Node;", "getSymbol", "()I", "terminalBitCount", "getTerminalBitCount", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Node {

        @e
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public Node(int i10, int i11) {
            this.children = null;
            this.symbol = i10;
            int i12 = i11 & 7;
            this.terminalBitCount = i12 == 0 ? 8 : i12;
        }

        @e
        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }
    }

    static {
        Huffman huffman = new Huffman();
        INSTANCE = huffman;
        CODES = new int[]{c.k.f33993z5, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, c.e.W9, c.k.A5, 21, c.b.O1, c.d.f31403n, 1018, 1019, c.b.P1, c.d.f31426o, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, c.e.X9, 1020, c.k.B5, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, c.k.C5, 524272, c.k.D5, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, c.d.f31449p, 16381, c.k.E5, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {13, a.A, a.F, a.F, a.F, a.F, a.F, a.F, a.F, a.B, a.H, a.F, a.F, a.H, a.F, a.F, a.F, a.F, a.F, a.F, a.F, a.F, a.H, a.F, a.F, a.F, a.F, a.F, a.F, a.F, a.F, a.F, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, a.F, a.f56671x, a.f56673z, a.f56671x, a.f56671x, a.f56673z, a.f56673z, a.f56673z, a.A, a.f56673z, a.A, a.A, a.A, a.A, a.A, a.B, a.A, a.B, a.B, a.f56673z, a.A, a.B, a.A, a.A, a.A, a.A, a.f56672y, a.f56673z, a.A, a.f56673z, a.A, a.A, a.B, a.f56673z, a.f56672y, a.f56671x, a.f56673z, a.f56673z, a.A, a.A, a.f56672y, a.A, a.f56673z, a.f56673z, a.B, a.f56672y, a.f56673z, a.A, a.A, a.f56672y, a.f56672y, a.f56673z, a.f56672y, a.A, a.f56673z, a.A, a.A, a.f56671x, a.f56673z, a.f56673z, a.f56673z, a.A, a.f56673z, a.f56673z, a.A, a.D, a.D, a.f56671x, 19, a.f56673z, a.A, a.f56673z, a.C, a.D, a.D, a.D, a.E, a.E, a.D, a.B, a.C, 19, a.f56672y, a.D, a.E, a.E, a.D, a.E, a.B, a.f56672y, a.f56672y, a.D, a.D, a.F, a.E, a.E, a.E, a.f56671x, a.B, a.f56671x, a.f56672y, a.f56673z, a.f56672y, a.f56672y, a.A, a.f56673z, a.f56673z, a.C, a.C, a.B, a.B, a.D, a.A, a.D, a.E, a.D, a.D, a.E, a.E, a.E, a.E, a.E, a.F, a.E, a.E, a.E, a.E, a.E, a.D};
        CODE_BIT_COUNTS = bArr;
        root = new Node();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            huffman.addCode(i10, CODES[i10], CODE_BIT_COUNTS[i10]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i10, int i11, int i12) {
        Node node = new Node(i10, i12);
        Node node2 = root;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            Node[] children = node2.getChildren();
            f0.m(children);
            Node node3 = children[i13];
            if (node3 == null) {
                node3 = new Node();
                children[i13] = node3;
            }
            node2 = node3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        Node[] children2 = node2.getChildren();
        f0.m(children2);
        m.n2(children2, node, i15, (1 << i14) + i15);
    }

    public final void decode(@d BufferedSource source, long j10, @d BufferedSink sink) throws IOException {
        f0.p(source, "source");
        f0.p(sink, "sink");
        Node node = root;
        int iAnd = 0;
        int terminalBitCount = 0;
        for (long j11 = 0; j11 < j10; j11++) {
            iAnd = (iAnd << 8) | Util.and(source.readByte(), 255);
            terminalBitCount += 8;
            while (terminalBitCount >= 8) {
                int i10 = terminalBitCount - 8;
                Node[] children = node.getChildren();
                f0.m(children);
                node = children[(iAnd >>> i10) & 255];
                f0.m(node);
                if (node.getChildren() == null) {
                    sink.writeByte(node.getSymbol());
                    terminalBitCount -= node.getTerminalBitCount();
                    node = root;
                } else {
                    terminalBitCount = i10;
                }
            }
        }
        while (terminalBitCount > 0) {
            Node[] children2 = node.getChildren();
            f0.m(children2);
            Node node2 = children2[(iAnd << (8 - terminalBitCount)) & 255];
            f0.m(node2);
            if (node2.getChildren() != null || node2.getTerminalBitCount() > terminalBitCount) {
                return;
            }
            sink.writeByte(node2.getSymbol());
            terminalBitCount -= node2.getTerminalBitCount();
            node = root;
        }
    }

    public final void encode(@d ByteString source, @d BufferedSink sink) throws IOException {
        f0.p(source, "source");
        f0.p(sink, "sink");
        int size = source.size();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iAnd = Util.and(source.getByte(i11), 255);
            int i12 = CODES[iAnd];
            byte b10 = CODE_BIT_COUNTS[iAnd];
            j10 = (j10 << b10) | ((long) i12);
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    public final int encodedLength(@d ByteString bytes) {
        f0.p(bytes, "bytes");
        int size = bytes.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 += (long) CODE_BIT_COUNTS[Util.and(bytes.getByte(i10), 255)];
        }
        return (int) ((j10 + ((long) 7)) >> 3);
    }
}
