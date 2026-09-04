package okio;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import dl.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.b;
import kotlin.collections.w;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.m;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0017B!\b\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lokio/Options;", "Lkotlin/collections/b;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", UCropPlusActivity.ARG_INDEX, "get", "", "byteStrings", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "", "trie", "[I", "getTrie$okio", "()[I", "getSize", "()I", UiKitSpanObj.TYPE_SIZE, "<init>", "([Lokio/ByteString;[I)V", "Companion", "okio"}, k = 1, mv = {1, 4, 0})
public final class Options extends b<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @d
    private final ByteString[] byteStrings;

    @d
    private final int[] trie;

    /* JADX INFO: compiled from: Options.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lokio/Options$Companion;", "", "", "nodeOffset", "Lokio/Buffer;", "node", "", "byteStringOffset", "", "Lokio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lkotlin/b2;", "buildTrieRecursive", "", "Lokio/Options;", "of", "([Lokio/ByteString;)Lokio/Options;", "getIntCount", "(Lokio/Buffer;)J", "intCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final void buildTrieRecursive(long j10, Buffer buffer, int i10, List<? extends ByteString> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            int i16 = i10;
            if (!(i11 < i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (!(list.get(i17).size() >= i16)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i11);
            ByteString byteString2 = list.get(i12 - 1);
            int i18 = -1;
            if (i16 == byteString.size()) {
                int iIntValue = list2.get(i11).intValue();
                int i19 = i11 + 1;
                ByteString byteString3 = list.get(i19);
                i13 = i19;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.getByte(i16) == byteString2.getByte(i16)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i20 = 0;
                for (int i21 = i16; i21 < iMin && byteString.getByte(i21) == byteString2.getByte(i21); i21++) {
                    i20++;
                }
                long intCount = j10 + getIntCount(buffer) + ((long) 2) + ((long) i20) + 1;
                buffer.writeInt(-i20);
                buffer.writeInt(i14);
                int i22 = i16 + i20;
                while (i16 < i22) {
                    buffer.writeInt(byteString.getByte(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (!(i22 == list.get(i13).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    buffer.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i22, list, i13, i12, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i23 = 1;
            for (int i24 = i13 + 1; i24 < i12; i24++) {
                if (list.get(i24 - 1).getByte(i16) != list.get(i24).getByte(i16)) {
                    i23++;
                }
            }
            long intCount2 = j10 + getIntCount(buffer) + ((long) 2) + ((long) (i23 * 2));
            buffer.writeInt(i23);
            buffer.writeInt(i14);
            for (int i25 = i13; i25 < i12; i25++) {
                byte b10 = list.get(i25).getByte(i16);
                if (i25 == i13 || b10 != list.get(i25 - 1).getByte(i16)) {
                    buffer.writeInt(b10 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i13 < i12) {
                byte b11 = list.get(i13).getByte(i16);
                int i26 = i13 + 1;
                int i27 = i26;
                while (true) {
                    if (i27 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (b11 != list.get(i27).getByte(i16)) {
                            i15 = i27;
                            break;
                        }
                        i27++;
                    }
                }
                if (i26 == i15 && i16 + 1 == list.get(i13).size()) {
                    buffer.writeInt(list2.get(i13).intValue());
                } else {
                    buffer.writeInt(((int) (intCount2 + getIntCount(buffer3))) * i18);
                    buildTrieRecursive(intCount2, buffer3, i16 + 1, list, i13, i15, list2);
                }
                buffer3 = buffer3;
                i13 = i15;
                i18 = -1;
            }
            buffer.writeAll(buffer3);
        }

        static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            companion.buildTrieRecursive((i13 & 1) != 0 ? 0L : j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / ((long) 4);
        }

        @d
        @m
        public final Options of(@d ByteString... byteStrings) throws IOException {
            f0.p(byteStrings, "byteStrings");
            int i10 = 0;
            u uVar = null;
            if (byteStrings.length == 0) {
                return new Options(new ByteString[0], new int[]{0, -1}, uVar);
            }
            List listUz = ArraysKt___ArraysKt.uz(byteStrings);
            w.j0(listUz);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Integer[] numArr = (Integer[]) array;
            List listP = CollectionsKt__CollectionsKt.P((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                listP.set(CollectionsKt__CollectionsKt.x(listUz, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (!(((ByteString) listUz.get(0)).size() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i13 = 0;
            while (i13 < listUz.size()) {
                ByteString byteString2 = (ByteString) listUz.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listUz.size()) {
                    ByteString byteString3 = (ByteString) listUz.get(i15);
                    if (!byteString3.startsWith(byteString2)) {
                        break;
                    }
                    if (!(byteString3.size() != byteString2.size())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString3).toString());
                    }
                    if (((Number) listP.get(i15)).intValue() > ((Number) listP.get(i13)).intValue()) {
                        listUz.remove(i15);
                        listP.remove(i15);
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            Buffer buffer = new Buffer();
            buildTrieRecursive$default(this, 0L, buffer, 0, listUz, 0, 0, listP, 53, null);
            int[] iArr = new int[(int) getIntCount(buffer)];
            while (!buffer.exhausted()) {
                iArr[i10] = buffer.readInt();
                i10++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            f0.o(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new Options((ByteString[]) objArrCopyOf, iArr, uVar);
        }
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, u uVar) {
        this(byteStringArr, iArr);
    }

    @d
    @m
    public static final Options of(@d ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // kotlin.collections.b, java.util.List
    @d
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    @d
    /* JADX INFO: renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String() {
        return this.byteStrings.length;
    }

    @d
    /* JADX INFO: renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf(byteString);
    }

    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }
}
