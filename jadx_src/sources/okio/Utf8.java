package okio;

import com.google.common.base.a;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.meituan.robust.Constants;
import dl.d;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import xh.h;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "Utf8")
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b\u001a4\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0013\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0015\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0016\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eH\u0080\bø\u0001\u0000\"\u0014\u0010\u0019\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001e\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001e\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"", "", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "", UiKitSpanObj.TYPE_SIZE, "(Ljava/lang/String;II)J", "utf8Size", "codePoint", "", "isIsoControl", "", Constants.BYTE, "isUtf8Continuation", "Lkotlin/Function1;", "Lkotlin/b2;", "yield", "processUtf8Bytes", "", "processUtf8CodePoints", "", "processUtf16Chars", "process2Utf8Bytes", "process3Utf8Bytes", "process4Utf8Bytes", "REPLACEMENT_BYTE", "B", "REPLACEMENT_CHARACTER", "C", "REPLACEMENT_CODE_POINT", "I", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "okio"}, k = 2, mv = {1, 4, 0})
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i10) {
        return (i10 >= 0 && 31 >= i10) || (127 <= i10 && 159 >= i10);
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@d byte[] process2Utf8Bytes, int i10, int i11, @d l<? super Integer, b2> yield) {
        f0.p(process2Utf8Bytes, "$this$process2Utf8Bytes");
        f0.p(yield, "yield");
        int i12 = i10 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b10 = process2Utf8Bytes[i10];
        byte b11 = process2Utf8Bytes[i12];
        if (!((b11 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(@d byte[] process3Utf8Bytes, int i10, int i11, @d l<? super Integer, b2> yield) {
        f0.p(process3Utf8Bytes, "$this$process3Utf8Bytes");
        f0.p(yield, "yield");
        int i12 = i10 + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((process3Utf8Bytes[i13] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = process3Utf8Bytes[i10];
        byte b11 = process3Utf8Bytes[i10 + 1];
        if (!((b11 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = process3Utf8Bytes[i12];
        if (!((b12 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 <= i14 && 57343 >= i14) {
            yield.invoke(numValueOf);
            return 3;
        }
        yield.invoke(Integer.valueOf(i14));
        return 3;
    }

    public static final int process4Utf8Bytes(@d byte[] process4Utf8Bytes, int i10, int i11, @d l<? super Integer, b2> yield) {
        f0.p(process4Utf8Bytes, "$this$process4Utf8Bytes");
        f0.p(yield, "yield");
        int i12 = i10 + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i11 <= i12) {
            yield.invoke(numValueOf);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((process4Utf8Bytes[i13] & 192) == 128) {
                    int i14 = i10 + 2;
                    if (i11 > i14) {
                        if ((process4Utf8Bytes[i14] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = process4Utf8Bytes[i10];
        byte b11 = process4Utf8Bytes[i10 + 1];
        if (!((b11 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b12 = process4Utf8Bytes[i10 + 2];
        if (!((b12 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b13 = process4Utf8Bytes[i12];
        if (!((b13 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << a.f56668u);
        if (i15 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i15 && 57343 >= i15) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i15 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i15));
        return 4;
    }

    public static final void processUtf16Chars(@d byte[] processUtf16Chars, int i10, int i11, @d l<? super Character, b2> yield) {
        int i12;
        f0.p(processUtf16Chars, "$this$processUtf16Chars");
        f0.p(yield, "yield");
        int i13 = i10;
        while (i13 < i11) {
            byte b10 = processUtf16Chars[i13];
            if (b10 >= 0) {
                yield.invoke(Character.valueOf((char) b10));
                i13++;
                while (i13 < i11) {
                    byte b11 = processUtf16Chars[i13];
                    if (b11 < 0) {
                        break;
                    }
                    i13++;
                    yield.invoke(Character.valueOf((char) b11));
                }
            } else {
                if ((b10 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i11 > i14) {
                        byte b12 = processUtf16Chars[i14];
                        if ((b12 & 192) == 128) {
                            int i15 = (b10 << 6) ^ (b12 ^ 3968);
                            yield.invoke(Character.valueOf(i15 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i15));
                            b2 b2Var = b2.f124493a;
                            i12 = 2;
                            i13 += i12;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    b2 b2Var2 = b2.f124493a;
                    i12 = 1;
                    i13 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i11 <= i16) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        b2 b2Var3 = b2.f124493a;
                        int i17 = i13 + 1;
                        if (i11 > i17) {
                            if ((processUtf16Chars[i17] & 192) == 128) {
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b13 = processUtf16Chars[i13 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = processUtf16Chars[i16];
                            if ((b14 & 192) == 128) {
                                int i18 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                yield.invoke(Character.valueOf((i18 >= 2048 && (55296 > i18 || 57343 < i18)) ? (char) i18 : (char) REPLACEMENT_CODE_POINT));
                                b2 b2Var4 = b2.f124493a;
                                i12 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                b2 b2Var5 = b2.f124493a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            b2 b2Var6 = b2.f124493a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i11 <= i19) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        b2 b2Var7 = b2.f124493a;
                        int i20 = i13 + 1;
                        if (i11 > i20) {
                            if ((processUtf16Chars[i20] & 192) == 128) {
                                int i21 = i13 + 2;
                                if (i11 > i21) {
                                    if ((processUtf16Chars[i21] & 192) == 128) {
                                        i12 = 3;
                                    }
                                }
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b15 = processUtf16Chars[i13 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = processUtf16Chars[i13 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = processUtf16Chars[i19];
                                if ((b17 & 192) == 128) {
                                    int i22 = (b10 << a.f56668u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i22 <= 1114111 && ((55296 > i22 || 57343 < i22) && i22 >= 65536 && i22 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i22 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        yield.invoke(Character.valueOf((char) ((i22 & 1023) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    b2 b2Var8 = b2.f124493a;
                                    i12 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    b2 b2Var9 = b2.f124493a;
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                b2 b2Var10 = b2.f124493a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            b2 b2Var11 = b2.f124493a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i13++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(@d String processUtf8Bytes, int i10, int i11, @d l<? super Byte, b2> yield) {
        int i12;
        char cCharAt;
        f0.p(processUtf8Bytes, "$this$processUtf8Bytes");
        f0.p(yield, "yield");
        while (i10 < i11) {
            char cCharAt2 = processUtf8Bytes.charAt(i10);
            if (f0.t(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i10++;
                while (i10 < i11 && f0.t(processUtf8Bytes.charAt(i10), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) processUtf8Bytes.charAt(i10)));
                    i10++;
                }
            } else {
                if (f0.t(cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || 57343 < cCharAt2) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (f0.t(cCharAt2, 56319) > 0 || i11 <= (i12 = i10 + 1) || 56320 > (cCharAt = processUtf8Bytes.charAt(i12)) || 57343 < cCharAt) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + processUtf8Bytes.charAt(i12)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i10 += 2;
                }
                i10++;
            }
        }
    }

    public static final void processUtf8CodePoints(@d byte[] processUtf8CodePoints, int i10, int i11, @d l<? super Integer, b2> yield) {
        int i12;
        f0.p(processUtf8CodePoints, "$this$processUtf8CodePoints");
        f0.p(yield, "yield");
        int i13 = i10;
        while (i13 < i11) {
            byte b10 = processUtf8CodePoints[i13];
            if (b10 >= 0) {
                yield.invoke(Integer.valueOf(b10));
                i13++;
                while (i13 < i11) {
                    byte b11 = processUtf8CodePoints[i13];
                    if (b11 < 0) {
                        break;
                    }
                    i13++;
                    yield.invoke(Integer.valueOf(b11));
                }
            } else {
                if ((b10 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i11 > i14) {
                        byte b12 = processUtf8CodePoints[i14];
                        if ((b12 & 192) == 128) {
                            int i15 = (b10 << 6) ^ (b12 ^ 3968);
                            yield.invoke(i15 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i15));
                            b2 b2Var = b2.f124493a;
                            i12 = 2;
                            i13 += i12;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    b2 b2Var2 = b2.f124493a;
                    i12 = 1;
                    i13 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i11 <= i16) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        b2 b2Var3 = b2.f124493a;
                        int i17 = i13 + 1;
                        if (i11 > i17) {
                            if ((processUtf8CodePoints[i17] & 192) == 128) {
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b13 = processUtf8CodePoints[i13 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = processUtf8CodePoints[i16];
                            if ((b14 & 192) == 128) {
                                int i18 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                yield.invoke((i18 >= 2048 && (55296 > i18 || 57343 < i18)) ? Integer.valueOf(i18) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                b2 b2Var4 = b2.f124493a;
                                i12 = 3;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                b2 b2Var5 = b2.f124493a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            b2 b2Var6 = b2.f124493a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i11 <= i19) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        b2 b2Var7 = b2.f124493a;
                        int i20 = i13 + 1;
                        if (i11 > i20) {
                            if ((processUtf8CodePoints[i20] & 192) == 128) {
                                int i21 = i13 + 2;
                                if (i11 > i21) {
                                    if ((processUtf8CodePoints[i21] & 192) == 128) {
                                        i12 = 3;
                                    }
                                }
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b15 = processUtf8CodePoints[i13 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = processUtf8CodePoints[i13 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = processUtf8CodePoints[i19];
                                if ((b17 & 192) == 128) {
                                    int i22 = (b10 << a.f56668u) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    yield.invoke((i22 <= 1114111 && (55296 > i22 || 57343 < i22) && i22 >= 65536) ? Integer.valueOf(i22) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    b2 b2Var8 = b2.f124493a;
                                    i12 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    b2 b2Var9 = b2.f124493a;
                                    i12 = 3;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                b2 b2Var10 = b2.f124493a;
                                i12 = 2;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            b2 b2Var11 = b2.f124493a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i13++;
                }
            }
        }
    }

    @h(name = UiKitSpanObj.TYPE_SIZE)
    @i
    public static final long size(@d String str) {
        return size$default(str, 0, 0, 3, null);
    }

    @h(name = UiKitSpanObj.TYPE_SIZE)
    @i
    public static final long size(@d String str, int i10) {
        return size$default(str, i10, 0, 2, null);
    }

    @h(name = UiKitSpanObj.TYPE_SIZE)
    @i
    public static final long size(@d String utf8Size, int i10, int i11) {
        int i12;
        f0.p(utf8Size, "$this$utf8Size");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= utf8Size.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + utf8Size.length()).toString());
        }
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = utf8Size.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char cCharAt2 = i13 < i11 ? utf8Size.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i13;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i12;
            }
            i10++;
        }
        return j10;
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }
}
