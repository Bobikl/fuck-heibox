package okhttp3.internal.http2;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.Progress;
import com.max.xiaoheihe.module.account.MeHomeActivity;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import dl.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import xh.e;
import xh.i;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "()V", "NAME_TO_FIRST_INDEX", "", "Lokio/ByteString;", "", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", "", "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Hpack {
    public static final Hpack INSTANCE;

    @d
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;

    @d
    private static final Header[] STATIC_HEADER_TABLE;

    /* JADX INFO: compiled from: Hpack.kt */
    @Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010$\u001a\u00020.\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0010R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*¨\u00061"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lkotlin/b2;", "adjustDynamicTableByteCount", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", UCropPlusActivity.ARG_INDEX, "readIndexedHeader", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lokio/ByteString;", "getName", "", "isStaticHeader", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "readByte", "", "getAndResetHeaderList", "maxDynamicTableByteCount", "readHeaders", "firstByte", "prefixMask", "readInt", "readByteString", "", "headerList", "Ljava/util/List;", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "I", "headerCount", "dynamicTableByteCount", "headerTableSizeSetting", "Lokio/Source;", "<init>", "(Lokio/Source;II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Reader {

        @d
        @e
        public Header[] dynamicTable;

        @e
        public int dynamicTableByteCount;

        @e
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final BufferedSource source;

        @i
        public Reader(@d Source source, int i10) {
            this(source, i10, 0, 4, null);
        }

        @i
        public Reader(@d Source source, int i10, int i11) {
            f0.p(source, "source");
            this.headerTableSizeSetting = i10;
            this.maxDynamicTableByteCount = i11;
            this.headerList = new ArrayList();
            this.source = Okio.buffer(source);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Reader(Source source, int i10, int i11, int i12, u uVar) {
            this(source, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        private final void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private final void clearDynamicTable() {
            m.w2(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    f0.m(header);
                    int i12 = header.hpackSize;
                    bytesToRecover -= i12;
                    this.dynamicTableByteCount -= i12;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final ByteString getName(int index) throws IOException {
            if (isStaticHeader(index)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int iDynamicTableIndex = dynamicTableIndex(index - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    Header header = headerArr[iDynamicTableIndex];
                    f0.m(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private final void insertIntoDynamicTable(int i10, Header header) {
            this.headerList.add(header);
            int i11 = header.hpackSize;
            if (i10 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i10)];
                f0.m(header2);
                i11 -= header2.hpackSize;
            }
            int i12 = this.maxDynamicTableByteCount;
            if (i11 > i12) {
                clearDynamicTable();
                return;
            }
            int iEvictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i11) - i12);
            if (i10 == -1) {
                int i13 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i13 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i14 = this.nextHeaderIndex;
                this.nextHeaderIndex = i14 - 1;
                this.dynamicTable[i14] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i10 + dynamicTableIndex(i10) + iEvictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i11;
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i10) throws IOException {
            if (isStaticHeader(i10)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i10]);
                return;
            }
            int iDynamicTableIndex = dynamicTableIndex(i10 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (iDynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (iDynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[iDynamicTableIndex];
                    f0.m(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i10) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i10), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i10) throws IOException {
            this.headerList.add(new Header(getName(i10), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        @d
        public final List<Header> getAndResetHeaderList() {
            List<Header> listQ5 = CollectionsKt___CollectionsKt.Q5(this.headerList);
            this.headerList.clear();
            return listQ5;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        @d
        public final ByteString readByteString() throws IOException {
            int i10 = readByte();
            boolean z10 = (i10 & 128) == 128;
            long j10 = readInt(i10, 127);
            if (!z10) {
                return this.source.readByteString(j10);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(this.source, j10, buffer);
            return buffer.readByteString();
        }

        public final void readHeaders() throws IOException {
            while (!this.source.exhausted()) {
                int iAnd = Util.and(this.source.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                if ((iAnd & 128) == 128) {
                    readIndexedHeader(readInt(iAnd, 127) - 1);
                } else if (iAnd == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((iAnd & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(iAnd, 63) - 1);
                } else if ((iAnd & 32) == 32) {
                    int i10 = readInt(iAnd, 31);
                    this.maxDynamicTableByteCount = i10;
                    if (i10 < 0 || i10 > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (iAnd == 16 || iAnd == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(iAnd, 15) - 1);
                }
            }
        }

        public final int readInt(int firstByte, int prefixMask) throws IOException {
            int i10 = firstByte & prefixMask;
            if (i10 < prefixMask) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = readByte();
                if ((i12 & 128) == 0) {
                    return prefixMask + (i12 << i11);
                }
                prefixMask += (i12 & 127) << i11;
                i11 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: Hpack.kt */
    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0019\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010#\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "Lkotlin/b2;", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "adjustDynamicTableByteCount", "", "headerBlock", "writeHeaders", "value", "prefixMask", "bits", "writeInt", "Lokio/ByteString;", "data", "writeByteString", "headerTableSizeSetting", "resizeHeaderTable", "smallestHeaderTableSizeSetting", "I", "", "emitDynamicTableSizeUpdate", "Z", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "useCompression", "Lokio/Buffer;", "out", "Lokio/Buffer;", "<init>", "(IZLokio/Buffer;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Writer {

        @d
        @e
        public Header[] dynamicTable;

        @e
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;

        @e
        public int headerCount;

        @e
        public int headerTableSizeSetting;

        @e
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        @i
        public Writer(int i10, @d Buffer buffer) {
            this(i10, false, buffer, 2, null);
        }

        @i
        public Writer(int i10, boolean z10, @d Buffer out) {
            f0.p(out, "out");
            this.headerTableSizeSetting = i10;
            this.useCompression = z10;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i10;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i10, boolean z10, Buffer buffer, int i11, u uVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, buffer);
        }

        @i
        public Writer(@d Buffer buffer) {
            this(0, false, buffer, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i10 = this.maxDynamicTableByteCount;
            int i11 = this.dynamicTableByteCount;
            if (i10 < i11) {
                if (i10 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i11 - i10);
                }
            }
        }

        private final void clearDynamicTable() {
            m.w2(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i10;
            int i11 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i10 = this.nextHeaderIndex;
                    if (length < i10 || bytesToRecover <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    f0.m(header);
                    bytesToRecover -= header.hpackSize;
                    int i12 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    f0.m(header2);
                    this.dynamicTableByteCount = i12 - header2.hpackSize;
                    this.headerCount--;
                    i11++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i10 + 1, headerArr, i10 + 1 + i11, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i13 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i13 + 1, i13 + 1 + i11, (Object) null);
                this.nextHeaderIndex += i11;
            }
            return i11;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i10 = header.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.nextHeaderIndex;
            this.nextHeaderIndex = i13 - 1;
            this.dynamicTable[i13] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void resizeHeaderTable(int i10) {
            this.headerTableSizeSetting = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.maxDynamicTableByteCount;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(@d ByteString data) throws IOException {
            f0.p(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.size()) {
                    Buffer buffer = new Buffer();
                    huffman.encode(data, buffer);
                    ByteString byteString = buffer.readByteString();
                    writeInt(byteString.size(), 127, 128);
                    this.out.write(byteString);
                    return;
                }
            }
            writeInt(data.size(), 127, 0);
            this.out.write(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        public final void writeHeaders(@d List<Header> headerBlock) throws IOException {
            int length;
            int length2;
            f0.p(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i10 = this.smallestHeaderTableSizeSetting;
                if (i10 < this.maxDynamicTableByteCount) {
                    writeInt(i10, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                Header header = headerBlock.get(i11);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    length2 = num.intValue() + 1;
                    if (2 > length2 || 7 < length2) {
                        length = length2;
                        length2 = -1;
                    } else if (f0.g(hpack.getSTATIC_HEADER_TABLE()[length2 - 1].value, byteString)) {
                        length = length2;
                    } else if (f0.g(hpack.getSTATIC_HEADER_TABLE()[length2].value, byteString)) {
                        length2++;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i12 = this.nextHeaderIndex + 1; i12 < length3; i12++) {
                        Header header2 = this.dynamicTable[i12];
                        f0.m(header2);
                        if (f0.g(header2.name, asciiLowercase)) {
                            Header header3 = this.dynamicTable[i12];
                            f0.m(header3);
                            if (f0.g(header3.value, byteString)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i12 - this.nextHeaderIndex);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else if (asciiLowercase.startsWith(Header.PSEUDO_PREFIX) && (!f0.g(Header.TARGET_AUTHORITY, asciiLowercase))) {
                    writeInt(length, 15, 0);
                    writeByteString(byteString);
                } else {
                    writeInt(length, 63, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public final void writeInt(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.out.writeByte(i10 | i12);
                return;
            }
            this.out.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.out.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.out.writeByte(i13);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, "http"), new Header(byteString3, "https"), new Header(byteString4, "200"), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, "404"), new Header(byteString4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", HttpHeaders.f64741i), new Header("accept-language", ""), new Header(f.f39674w, ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header(f.f39676y, ""), new Header(f.f39673v, ""), new Header(f.f39663p, ""), new Header("content-language", ""), new Header(f.f39659n, ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header(Progress.L, ""), new Header(f.A, ""), new Header("expect", ""), new Header(f.f39675x, ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header(f.f39677z, ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header(f.f39672u, ""), new Header("proxy-authorization", ""), new Header(k0.f48802q, ""), new Header(MeHomeActivity.O, ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header(f.B, ""), new Header("strict-transport-security", ""), new Header(f.f39657m, ""), new Header("user-agent", ""), new Header("vary", ""), new Header(SocializeProtocolConstants.PROTOCOL_KEY_VERIFY_MEDIA, ""), new Header(f.f39671t, "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<ByteString, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i10].name)) {
                linkedHashMap.put(headerArr2[i10].name, Integer.valueOf(i10));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        f0.o(mapUnmodifiableMap, "Collections.unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    @d
    public final ByteString checkLowercase(@d ByteString name) throws IOException {
        f0.p(name, "name");
        int size = name.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte b12 = name.getByte(i10);
            if (b10 <= b12 && b11 >= b12) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @d
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @d
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
