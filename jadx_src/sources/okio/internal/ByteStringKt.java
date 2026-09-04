package okio.internal;

import androidx.constraintlayout.core.motion.utils.w;
import com.google.common.base.a;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.m;
import kotlin.jvm.internal.f0;
import kotlin.text.u;
import okio.Base64;
import okio.Buffer;
import okio.ByteString;
import okio.Platform;
import okio.Util;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0005\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0080\b\u001a\r\u0010\u000f\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0010*\u00020\u0000H\u0080\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a-\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010\u001e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u001d\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u001d\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u0017\u0010!\u001a\u00020\u0017*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010 H\u0080\b\u001a\r\u0010\"\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\u0015\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000H\u0080\b\u001a\u0011\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0010H\u0080\b\u001a\u001d\u0010&\u001a\u00020\u0000*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0080\b\u001a\r\u0010'\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a\u000f\u0010(\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b\u001a\r\u0010)\u001a\u00020\u0000*\u00020\u0001H\u0080\b\u001a$\u0010-\u001a\u00020,*\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000\u001a\u0010\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0002\u001a\r\u00101\u001a\u00020\u0001*\u00020\u0000H\u0080\b\u001a\u0018\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\bH\u0002\"\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lokio/ByteString;", "", "commonUtf8", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "commonToAsciiUppercase", "", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "commonSubstring", "pos", "", "commonGetByte", "commonGetSize", "", "commonToByteArray", "commonInternalArray", w.c.R, "other", "otherOffset", "byteCount", "", "commonRangeEquals", "prefix", "commonStartsWith", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "commonLastIndexOf", "", "commonEquals", "commonHashCode", "commonCompareTo", "data", "commonOf", "commonToByteString", "commonEncodeUtf8", "commonDecodeBase64", "commonDecodeHex", "Lokio/Buffer;", "buffer", "Lkotlin/b2;", "commonWrite", "", ak.aF, "decodeHexDigit", "commonToString", ak.aB, "codePointCount", "codePointIndexToCharIndex", "", "HEX_DIGIT_CHARS", "[C", "getHEX_DIGIT_CHARS", "()[C", "okio"}, k = 2, mv = {1, 4, 0})
public final class ByteStringKt {

    @d
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:138:0x0132  */
    /* JADX WARN: Code duplicated, block: B:141:0x0138  */
    /* JADX WARN: Code duplicated, block: B:143:0x013c  */
    /* JADX WARN: Code duplicated, block: B:144:0x013f  */
    /* JADX WARN: Code duplicated, block: B:209:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:212:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:214:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:215:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:228:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x006f  */
    /* JADX WARN: Code duplicated, block: B:81:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00be  */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i10) {
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int length = bArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < length) {
            byte b11 = bArr[i16];
            if (b11 >= 0) {
                int i19 = i18 + 1;
                if (i18 == i10) {
                    return i17;
                }
                if (b11 != 10 && b11 != 13) {
                    if (!((b11 >= 0 && 31 >= b11) || (127 <= b11 && 159 >= b11))) {
                    }
                    return -1;
                }
                if (b11 == 65533) {
                    return -1;
                }
                i17 += b11 < 65536 ? 1 : 2;
                i16++;
                while (true) {
                    i18 = i19;
                    if (i16 >= length || (b10 = bArr[i16]) < 0) {
                        break;
                    }
                    i16++;
                    i19 = i18 + 1;
                    if (i18 == i10) {
                        return i17;
                    }
                    if (b10 != 10 && b10 != 13) {
                        if (!((b10 >= 0 && 31 >= b10) || (127 <= b10 && 159 >= b10))) {
                            if (b10 == 65533) {
                                if (b10 < 65536) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                i17 += i11;
                            }
                        }
                    } else if (b10 == 65533) {
                        if (b10 < 65536) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        i17 += i11;
                    }
                    return -1;
                }
            }
            if ((b11 >> 5) == -2) {
                int i20 = i16 + 1;
                if (length <= i20) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                byte b12 = bArr[i20];
                if (!((b12 & 192) == 128)) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                int i21 = (b12 ^ 3968) ^ (b11 << 6);
                if (i21 < 128) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                i12 = i18 + 1;
                if (i18 == i10) {
                    return i17;
                }
                if (i21 != 10 && i21 != 13) {
                    if (!((i21 >= 0 && 31 >= i21) || (127 <= i21 && 159 >= i21))) {
                        if (i21 == 65533) {
                            if (i21 < 65536) {
                                i15 = 1;
                            } else {
                                i15 = 2;
                            }
                            i17 += i15;
                            b2 b2Var = b2.f124493a;
                            i16 += 2;
                        }
                    }
                } else if (i21 == 65533) {
                    if (i21 < 65536) {
                        i15 = 1;
                    } else {
                        i15 = 2;
                    }
                    i17 += i15;
                    b2 b2Var2 = b2.f124493a;
                    i16 += 2;
                }
                return -1;
            }
            if ((b11 >> 4) == -2) {
                int i22 = i16 + 2;
                if (length <= i22) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                byte b13 = bArr[i16 + 1];
                if (!((b13 & 192) == 128)) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                byte b14 = bArr[i22];
                if (!((b14 & 192) == 128)) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                int i23 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                if (i23 < 2048) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                if (55296 <= i23 && 57343 >= i23) {
                    if (i18 == i10) {
                        return i17;
                    }
                    return -1;
                }
                i12 = i18 + 1;
                if (i18 == i10) {
                    return i17;
                }
                if (i23 != 10 && i23 != 13) {
                    if (!((i23 >= 0 && 31 >= i23) || (127 <= i23 && 159 >= i23))) {
                        if (i23 == 65533) {
                            if (i23 < 65536) {
                                i14 = 1;
                            } else {
                                i14 = 2;
                            }
                            i17 += i14;
                            b2 b2Var3 = b2.f124493a;
                            i16 += 3;
                        }
                    }
                } else if (i23 == 65533) {
                    if (i23 < 65536) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    i17 += i14;
                    b2 b2Var4 = b2.f124493a;
                    i16 += 3;
                }
                return -1;
            }
            if ((b11 >> 3) != -2) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            int i24 = i16 + 3;
            if (length <= i24) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            byte b15 = bArr[i16 + 1];
            if (!((b15 & 192) == 128)) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            byte b16 = bArr[i16 + 2];
            if (!((b16 & 192) == 128)) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            byte b17 = bArr[i24];
            if (!((b17 & 192) == 128)) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            int i25 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << a.f56668u);
            if (i25 > 1114111) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            if (55296 <= i25 && 57343 >= i25) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            if (i25 < 65536) {
                if (i18 == i10) {
                    return i17;
                }
                return -1;
            }
            i12 = i18 + 1;
            if (i18 == i10) {
                return i17;
            }
            if (i25 != 10 && i25 != 13) {
                if (!((i25 >= 0 && 31 >= i25) || (127 <= i25 && 159 >= i25))) {
                    if (i25 == 65533) {
                        if (i25 < 65536) {
                            i13 = 1;
                        } else {
                            i13 = 2;
                        }
                        i17 += i13;
                        b2 b2Var5 = b2.f124493a;
                        i16 += 4;
                    }
                }
            } else if (i25 == 65533) {
                if (i25 < 65536) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                i17 += i13;
                b2 b2Var6 = b2.f124493a;
                i16 += 4;
            }
            return -1;
            i18 = i12;
        }
        return i17;
    }

    @d
    public static final String commonBase64(@d ByteString commonBase64) {
        f0.p(commonBase64, "$this$commonBase64");
        return Base64.encodeBase64$default(commonBase64.getData(), null, 1, null);
    }

    @d
    public static final String commonBase64Url(@d ByteString commonBase64Url) {
        f0.p(commonBase64Url, "$this$commonBase64Url");
        return Base64.encodeBase64(commonBase64Url.getData(), Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(@d ByteString commonCompareTo, @d ByteString other) {
        f0.p(commonCompareTo, "$this$commonCompareTo");
        f0.p(other, "other");
        int size = commonCompareTo.size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = commonCompareTo.getByte(i10) & 255;
            int i12 = other.getByte(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    @e
    public static final ByteString commonDecodeBase64(@d String commonDecodeBase64) {
        f0.p(commonDecodeBase64, "$this$commonDecodeBase64");
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(commonDecodeBase64);
        if (bArrDecodeBase64ToArray != null) {
            return new ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    @d
    public static final ByteString commonDecodeHex(@d String commonDecodeHex) {
        f0.p(commonDecodeHex, "$this$commonDecodeHex");
        if (!(commonDecodeHex.length() % 2 == 0)) {
            throw new IllegalArgumentException(("Unexpected hex string: " + commonDecodeHex).toString());
        }
        int length = commonDecodeHex.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((decodeHexDigit(commonDecodeHex.charAt(i11)) << 4) + decodeHexDigit(commonDecodeHex.charAt(i11 + 1)));
        }
        return new ByteString(bArr);
    }

    @d
    public static final ByteString commonEncodeUtf8(@d String commonEncodeUtf8) {
        f0.p(commonEncodeUtf8, "$this$commonEncodeUtf8");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(commonEncodeUtf8));
        byteString.setUtf8$okio(commonEncodeUtf8);
        return byteString;
    }

    public static final boolean commonEndsWith(@d ByteString commonEndsWith, @d ByteString suffix) {
        f0.p(commonEndsWith, "$this$commonEndsWith");
        f0.p(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.size(), suffix, 0, suffix.size());
    }

    public static final boolean commonEndsWith(@d ByteString commonEndsWith, @d byte[] suffix) {
        f0.p(commonEndsWith, "$this$commonEndsWith");
        f0.p(suffix, "suffix");
        return commonEndsWith.rangeEquals(commonEndsWith.size() - suffix.length, suffix, 0, suffix.length);
    }

    public static final boolean commonEquals(@d ByteString commonEquals, @e Object obj) {
        f0.p(commonEquals, "$this$commonEquals");
        if (obj == commonEquals) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == commonEquals.getData().length && byteString.rangeEquals(0, commonEquals.getData(), 0, commonEquals.getData().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(@d ByteString commonGetByte, int i10) {
        f0.p(commonGetByte, "$this$commonGetByte");
        return commonGetByte.getData()[i10];
    }

    public static final int commonGetSize(@d ByteString commonGetSize) {
        f0.p(commonGetSize, "$this$commonGetSize");
        return commonGetSize.getData().length;
    }

    public static final int commonHashCode(@d ByteString commonHashCode) {
        f0.p(commonHashCode, "$this$commonHashCode");
        int hashCode = commonHashCode.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int iHashCode = Arrays.hashCode(commonHashCode.getData());
        commonHashCode.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @d
    public static final String commonHex(@d ByteString commonHex) {
        f0.p(commonHex, "$this$commonHex");
        char[] cArr = new char[commonHex.getData().length * 2];
        int i10 = 0;
        for (byte b10 : commonHex.getData()) {
            int i11 = i10 + 1;
            cArr[i10] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return new String(cArr);
    }

    public static final int commonIndexOf(@d ByteString commonIndexOf, @d byte[] other, int i10) {
        f0.p(commonIndexOf, "$this$commonIndexOf");
        f0.p(other, "other");
        int length = commonIndexOf.getData().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!Util.arrayRangeEquals(commonIndexOf.getData(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @d
    public static final byte[] commonInternalArray(@d ByteString commonInternalArray) {
        f0.p(commonInternalArray, "$this$commonInternalArray");
        return commonInternalArray.getData();
    }

    public static final int commonLastIndexOf(@d ByteString commonLastIndexOf, @d ByteString other, int i10) {
        f0.p(commonLastIndexOf, "$this$commonLastIndexOf");
        f0.p(other, "other");
        return commonLastIndexOf.lastIndexOf(other.internalArray$okio(), i10);
    }

    public static final int commonLastIndexOf(@d ByteString commonLastIndexOf, @d byte[] other, int i10) {
        f0.p(commonLastIndexOf, "$this$commonLastIndexOf");
        f0.p(other, "other");
        for (int iMin = Math.min(i10, commonLastIndexOf.getData().length - other.length); iMin >= 0; iMin--) {
            if (Util.arrayRangeEquals(commonLastIndexOf.getData(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @d
    public static final ByteString commonOf(@d byte[] data) {
        f0.p(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(bArrCopyOf);
    }

    public static final boolean commonRangeEquals(@d ByteString commonRangeEquals, int i10, @d ByteString other, int i11, int i12) {
        f0.p(commonRangeEquals, "$this$commonRangeEquals");
        f0.p(other, "other");
        return other.rangeEquals(i11, commonRangeEquals.getData(), i10, i12);
    }

    public static final boolean commonRangeEquals(@d ByteString commonRangeEquals, int i10, @d byte[] other, int i11, int i12) {
        f0.p(commonRangeEquals, "$this$commonRangeEquals");
        f0.p(other, "other");
        return i10 >= 0 && i10 <= commonRangeEquals.getData().length - i12 && i11 >= 0 && i11 <= other.length - i12 && Util.arrayRangeEquals(commonRangeEquals.getData(), i10, other, i11, i12);
    }

    public static final boolean commonStartsWith(@d ByteString commonStartsWith, @d ByteString prefix) {
        f0.p(commonStartsWith, "$this$commonStartsWith");
        f0.p(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.size());
    }

    public static final boolean commonStartsWith(@d ByteString commonStartsWith, @d byte[] prefix) {
        f0.p(commonStartsWith, "$this$commonStartsWith");
        f0.p(prefix, "prefix");
        return commonStartsWith.rangeEquals(0, prefix, 0, prefix.length);
    }

    @d
    public static final ByteString commonSubstring(@d ByteString commonSubstring, int i10, int i11) {
        f0.p(commonSubstring, "$this$commonSubstring");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (i11 <= commonSubstring.getData().length) {
            if (i11 - i10 >= 0) {
                return (i10 == 0 && i11 == commonSubstring.getData().length) ? commonSubstring : new ByteString(m.G1(commonSubstring.getData(), i10, i11));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + commonSubstring.getData().length + ')').toString());
    }

    @d
    public static final ByteString commonToAsciiLowercase(@d ByteString commonToAsciiLowercase) {
        byte b10;
        f0.p(commonToAsciiLowercase, "$this$commonToAsciiLowercase");
        for (int i10 = 0; i10 < commonToAsciiLowercase.getData().length; i10++) {
            byte b11 = commonToAsciiLowercase.getData()[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] data = commonToAsciiLowercase.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return commonToAsciiLowercase;
    }

    @d
    public static final ByteString commonToAsciiUppercase(@d ByteString commonToAsciiUppercase) {
        byte b10;
        f0.p(commonToAsciiUppercase, "$this$commonToAsciiUppercase");
        for (int i10 = 0; i10 < commonToAsciiUppercase.getData().length; i10++) {
            byte b11 = commonToAsciiUppercase.getData()[i10];
            byte b12 = (byte) 97;
            if (b11 >= b12 && b11 <= (b10 = (byte) 122)) {
                byte[] data = commonToAsciiUppercase.getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b11 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b13 = bArrCopyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        bArrCopyOf[i11] = (byte) (b13 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return commonToAsciiUppercase;
    }

    @d
    public static final byte[] commonToByteArray(@d ByteString commonToByteArray) {
        f0.p(commonToByteArray, "$this$commonToByteArray");
        byte[] data = commonToByteArray.getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    @d
    public static final ByteString commonToByteString(@d byte[] commonToByteString, int i10, int i11) {
        f0.p(commonToByteString, "$this$commonToByteString");
        Util.checkOffsetAndCount(commonToByteString.length, i10, i11);
        return new ByteString(m.G1(commonToByteString, i10, i11 + i10));
    }

    @d
    public static final String commonToString(@d ByteString byteString) {
        ByteString commonToString = byteString;
        f0.p(commonToString, "$this$commonToString");
        if (byteString.getData().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            if (strUtf8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strL2 = u.l2(u.l2(u.l2(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strL2 + ']';
            }
            return "[size=" + byteString.getData().length + " text=" + strL2 + "…]";
        }
        if (byteString.getData().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(byteString.getData().length);
        sb2.append(" hex=");
        if (64 <= byteString.getData().length) {
            if (64 != byteString.getData().length) {
                commonToString = new ByteString(m.G1(byteString.getData(), 0, 64));
            }
            sb2.append(commonToString.hex());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData().length + ')').toString());
    }

    @d
    public static final String commonUtf8(@d ByteString commonUtf8) {
        f0.p(commonUtf8, "$this$commonUtf8");
        String utf8 = commonUtf8.getUtf8();
        if (utf8 != null) {
            return utf8;
        }
        String utf8String = Platform.toUtf8String(commonUtf8.internalArray$okio());
        commonUtf8.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(@d ByteString commonWrite, @d Buffer buffer, int i10, int i11) {
        f0.p(commonWrite, "$this$commonWrite");
        f0.p(buffer, "buffer");
        buffer.write(commonWrite.getData(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    @d
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }
}
