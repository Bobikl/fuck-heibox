package okio.internal;

import com.google.common.base.a;
import dl.d;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import okio.Utf8;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", SpellCheckPlugin.END_INDEX_KEY, "okio"}, k = 2, mv = {1, 4, 0})
public final class _Utf8Kt {
    @d
    public static final byte[] commonAsUtf8ToByteArray(@d String commonAsUtf8ToByteArray) {
        int i10;
        int i11;
        char cCharAt;
        f0.p(commonAsUtf8ToByteArray, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[commonAsUtf8ToByteArray.length() * 4];
        int length = commonAsUtf8ToByteArray.length();
        int i12 = 0;
        while (i12 < length) {
            char cCharAt2 = commonAsUtf8ToByteArray.charAt(i12);
            if (f0.t(cCharAt2, 128) >= 0) {
                int length2 = commonAsUtf8ToByteArray.length();
                int i13 = i12;
                while (i12 < length2) {
                    char cCharAt3 = commonAsUtf8ToByteArray.charAt(i12);
                    if (f0.t(cCharAt3, 128) < 0) {
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) cCharAt3;
                        i12++;
                        while (i12 < length2 && f0.t(commonAsUtf8ToByteArray.charAt(i12), 128) < 0) {
                            bArr[i14] = (byte) commonAsUtf8ToByteArray.charAt(i12);
                            i12++;
                            i14++;
                        }
                        i13 = i14;
                    } else {
                        if (f0.t(cCharAt3, 2048) < 0) {
                            int i15 = i13 + 1;
                            bArr[i13] = (byte) ((cCharAt3 >> 6) | 192);
                            byte b10 = (byte) ((cCharAt3 & '?') | 128);
                            i10 = i15 + 1;
                            bArr[i15] = b10;
                        } else if (55296 > cCharAt3 || 57343 < cCharAt3) {
                            int i16 = i13 + 1;
                            bArr[i13] = (byte) ((cCharAt3 >> '\f') | 224);
                            int i17 = i16 + 1;
                            bArr[i16] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            byte b11 = (byte) ((cCharAt3 & '?') | 128);
                            i10 = i17 + 1;
                            bArr[i17] = b11;
                        } else {
                            if (f0.t(cCharAt3, 56319) > 0 || length2 <= (i11 = i12 + 1) || 56320 > (cCharAt = commonAsUtf8ToByteArray.charAt(i11)) || 57343 < cCharAt) {
                                i10 = i13 + 1;
                                bArr[i13] = Utf8.REPLACEMENT_BYTE;
                            } else {
                                int iCharAt = ((cCharAt3 << '\n') + commonAsUtf8ToByteArray.charAt(i11)) - 56613888;
                                int i18 = i13 + 1;
                                bArr[i13] = (byte) ((iCharAt >> 18) | 240);
                                int i19 = i18 + 1;
                                bArr[i18] = (byte) (((iCharAt >> 12) & 63) | 128);
                                int i20 = i19 + 1;
                                bArr[i19] = (byte) (((iCharAt >> 6) & 63) | 128);
                                byte b12 = (byte) ((iCharAt & 63) | 128);
                                i10 = i20 + 1;
                                bArr[i20] = b12;
                                i12 += 2;
                            }
                            i13 = i10;
                        }
                        i12++;
                        i13 = i10;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
                f0.o(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i12] = (byte) cCharAt2;
            i12++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, commonAsUtf8ToByteArray.length());
        f0.o(bArrCopyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    @d
    public static final String commonToUtf8String(@d byte[] commonToUtf8String, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        f0.p(commonToUtf8String, "$this$commonToUtf8String");
        if (i16 < 0 || i11 > commonToUtf8String.length || i16 > i11) {
            throw new ArrayIndexOutOfBoundsException("size=" + commonToUtf8String.length + " beginIndex=" + i16 + " endIndex=" + i11);
        }
        char[] cArr = new char[i11 - i16];
        int i17 = 0;
        while (i16 < i11) {
            byte b10 = commonToUtf8String[i16];
            if (b10 >= 0) {
                i12 = i17 + 1;
                cArr[i17] = (char) b10;
                i16++;
                while (i16 < i11) {
                    byte b11 = commonToUtf8String[i16];
                    if (b11 < 0) {
                        break;
                    }
                    i16++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
            } else if ((b10 >> 5) == -2) {
                int i18 = i16 + 1;
                if (i11 <= i18) {
                    i12 = i17 + 1;
                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b12 = commonToUtf8String[i18];
                    if ((b12 & 192) == 128) {
                        int i19 = (b10 << 6) ^ (b12 ^ 3968);
                        if (i19 < 128) {
                            i12 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i12 = i17 + 1;
                            cArr[i17] = (char) i19;
                        }
                        b2 b2Var = b2.f124493a;
                        i13 = 2;
                        i16 += i13;
                    } else {
                        i12 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                b2 b2Var2 = b2.f124493a;
                i13 = 1;
                i16 += i13;
            } else if ((b10 >> 4) == -2) {
                int i20 = i16 + 2;
                if (i11 <= i20) {
                    i12 = i17 + 1;
                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    b2 b2Var3 = b2.f124493a;
                    int i21 = i16 + 1;
                    if (i11 > i21) {
                        if ((commonToUtf8String[i21] & 192) == 128) {
                            i13 = 2;
                        }
                    }
                    i13 = 1;
                } else {
                    byte b13 = commonToUtf8String[i16 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = commonToUtf8String[i20];
                        if ((b14 & 192) == 128) {
                            int i22 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                            if (i22 < 2048) {
                                i12 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else if (55296 <= i22 && 57343 >= i22) {
                                i12 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else {
                                i12 = i17 + 1;
                                cArr[i17] = (char) i22;
                            }
                            b2 b2Var4 = b2.f124493a;
                            i13 = 3;
                        } else {
                            i12 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            b2 b2Var5 = b2.f124493a;
                            i13 = 2;
                        }
                    } else {
                        i12 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        b2 b2Var6 = b2.f124493a;
                        i13 = 1;
                    }
                }
                i16 += i13;
            } else {
                if ((b10 >> 3) == -2) {
                    int i23 = i16 + 3;
                    if (i11 <= i23) {
                        i14 = i17 + 1;
                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                        b2 b2Var7 = b2.f124493a;
                        int i24 = i16 + 1;
                        if (i11 > i24) {
                            if ((commonToUtf8String[i24] & 192) == 128) {
                                int i25 = i16 + 2;
                                if (i11 > i25) {
                                    if ((commonToUtf8String[i25] & 192) == 128) {
                                        i15 = 3;
                                    }
                                }
                                i15 = 2;
                            }
                        }
                        i15 = 1;
                    } else {
                        byte b15 = commonToUtf8String[i16 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = commonToUtf8String[i16 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = commonToUtf8String[i23];
                                if ((b17 & 192) == 128) {
                                    int i26 = (b10 << a.f56668u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i26 > 1114111) {
                                        i14 = i17 + 1;
                                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                    } else if ((55296 <= i26 && 57343 >= i26) || i26 < 65536 || i26 == 65533) {
                                        i14 = i17 + 1;
                                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                    } else {
                                        int i27 = i17 + 1;
                                        cArr[i17] = (char) ((i26 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                        char c10 = (char) ((i26 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                        i14 = i27 + 1;
                                        cArr[i27] = c10;
                                    }
                                    b2 b2Var8 = b2.f124493a;
                                    i15 = 4;
                                } else {
                                    i14 = i17 + 1;
                                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                    b2 b2Var9 = b2.f124493a;
                                    i15 = 3;
                                }
                            } else {
                                i14 = i17 + 1;
                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                b2 b2Var10 = b2.f124493a;
                                i15 = 2;
                            }
                        } else {
                            i14 = i17 + 1;
                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                            b2 b2Var11 = b2.f124493a;
                            i15 = 1;
                        }
                    }
                    i16 += i15;
                } else {
                    i14 = i17 + 1;
                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                    i16++;
                }
                i17 = i14;
            }
            i17 = i12;
        }
        return new String(cArr, 0, i17);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return commonToUtf8String(bArr, i10, i11);
    }
}
