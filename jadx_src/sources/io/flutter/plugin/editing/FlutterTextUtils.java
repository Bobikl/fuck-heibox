package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes4.dex */
public class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0138 A[PHI: r2 r4
  0x0138: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:58:0x00b9, B:81:0x0113] A[DONT_GENERATE, DONT_INLINE]
  0x0138: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:58:0x00b9, B:81:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    public int getOffsetAfter(CharSequence charSequence, int i10) {
        int iCharCount;
        int length = charSequence.length();
        int i11 = length - 1;
        if (i10 >= i11) {
            return length;
        }
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int iCharCount2 = Character.charCount(iCodePointAt);
        int iCharCount3 = i10 + iCharCount2;
        int i12 = 0;
        if (iCharCount3 == 0) {
            return 0;
        }
        if (iCodePointAt == 10) {
            if (Character.codePointAt(charSequence, iCharCount3) == 13) {
                iCharCount2++;
            }
            return i10 + iCharCount2;
        }
        if (isRegionalIndicatorSymbol(iCodePointAt)) {
            if (iCharCount3 >= i11 || !isRegionalIndicatorSymbol(Character.codePointAt(charSequence, iCharCount3))) {
                return iCharCount3;
            }
            int iCharCount4 = i10;
            while (iCharCount4 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i10))) {
                iCharCount4 -= Character.charCount(Character.codePointBefore(charSequence, i10));
                i12++;
            }
            if (i12 % 2 == 0) {
                iCharCount2 += 2;
            }
            return i10 + iCharCount2;
        }
        if (isKeycapBase(iCodePointAt)) {
            iCharCount2 += Character.charCount(iCodePointAt);
        }
        if (iCodePointAt == 8419) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount3);
            int iCharCount5 = iCharCount3 + Character.charCount(iCodePointBefore);
            if (iCharCount5 < length && isVariationSelector(iCodePointBefore)) {
                int iCodePointAt2 = Character.codePointAt(charSequence, iCharCount5);
                if (isKeycapBase(iCodePointAt2)) {
                    iCharCount2 += Character.charCount(iCodePointBefore) + Character.charCount(iCodePointAt2);
                }
            } else if (isKeycapBase(iCodePointBefore)) {
                iCharCount2 += Character.charCount(iCodePointBefore);
            }
            return i10 + iCharCount2;
        }
        if (isEmoji(iCodePointAt)) {
            boolean z10 = false;
            int i13 = 0;
            do {
                if (z10) {
                    iCharCount2 += Character.charCount(iCodePointAt) + i13 + 1;
                    z10 = false;
                }
                if (isEmojiModifier(iCodePointAt)) {
                    break;
                }
                if (iCharCount3 < length) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
                    iCharCount3 += Character.charCount(iCodePointAt);
                    if (iCodePointAt != 8419) {
                        if (!isEmojiModifier(iCodePointAt)) {
                            if (!isVariationSelector(iCodePointAt)) {
                                if (iCodePointAt == 8205) {
                                    iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
                                    iCharCount3 += Character.charCount(iCodePointAt);
                                    if (iCharCount3 >= length || !isVariationSelector(iCodePointAt)) {
                                        i13 = 0;
                                    } else {
                                        iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
                                        int iCharCount6 = Character.charCount(iCodePointAt);
                                        iCharCount3 += Character.charCount(iCodePointAt);
                                        i13 = iCharCount6;
                                    }
                                    z10 = true;
                                } else {
                                    i13 = 0;
                                }
                                if (iCharCount3 < length || !z10) {
                                    break;
                                }
                            } else {
                                iCharCount = Character.charCount(iCodePointAt);
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt);
                        }
                        iCharCount2 += iCharCount + 0;
                        break;
                    }
                    int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount3);
                    int iCharCount7 = iCharCount3 + Character.charCount(iCodePointBefore2);
                    if (iCharCount7 < length && isVariationSelector(iCodePointBefore2)) {
                        int iCodePointAt3 = Character.codePointAt(charSequence, iCharCount7);
                        if (isKeycapBase(iCodePointAt3)) {
                            iCharCount2 += Character.charCount(iCodePointBefore2) + Character.charCount(iCodePointAt3);
                        }
                    } else if (isKeycapBase(iCodePointBefore2)) {
                        iCharCount2 += Character.charCount(iCodePointBefore2);
                    }
                    return i10 + iCharCount2;
                }
                i13 = 0;
                if (iCharCount3 < length) {
                    break;
                }
            } while (isEmoji(iCodePointAt));
        }
        return i10 + iCharCount2;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[PHI: r2 r4
  0x0149: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:80:0x0117, B:82:0x0124] A[DONT_GENERATE, DONT_INLINE]
  0x0149: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:80:0x0117, B:82:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    public int getOffsetBefore(CharSequence charSequence, int i10) {
        int iCodePointBefore;
        int iCharCount;
        int iCharCount2;
        int iCharCount3 = 0;
        int i11 = 1;
        if (i10 <= 1 || (iCharCount2 = i10 - (iCharCount = Character.charCount((iCodePointBefore = Character.codePointBefore(charSequence, i10))))) == 0) {
            return 0;
        }
        if (iCodePointBefore == 10) {
            if (Character.codePointBefore(charSequence, iCharCount2) == 13) {
                iCharCount++;
            }
            return i10 - iCharCount;
        }
        if (isRegionalIndicatorSymbol(iCodePointBefore)) {
            int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount2);
            int iCharCount4 = iCharCount2 - Character.charCount(iCodePointBefore2);
            while (iCharCount4 > 0 && isRegionalIndicatorSymbol(iCodePointBefore2)) {
                iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount4);
                iCharCount4 -= Character.charCount(iCodePointBefore2);
                i11++;
            }
            if (i11 % 2 == 0) {
                iCharCount += 2;
            }
            return i10 - iCharCount;
        }
        if (iCodePointBefore == 8419) {
            int iCodePointBefore3 = Character.codePointBefore(charSequence, iCharCount2);
            int iCharCount5 = iCharCount2 - Character.charCount(iCodePointBefore3);
            if (iCharCount5 > 0 && isVariationSelector(iCodePointBefore3)) {
                int iCodePointBefore4 = Character.codePointBefore(charSequence, iCharCount5);
                if (isKeycapBase(iCodePointBefore4)) {
                    iCharCount += Character.charCount(iCodePointBefore3) + Character.charCount(iCodePointBefore4);
                }
            } else if (isKeycapBase(iCodePointBefore3)) {
                iCharCount += Character.charCount(iCodePointBefore3);
            }
            return i10 - iCharCount;
        }
        if (iCodePointBefore == 917631) {
            iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
            int iCharCount6 = Character.charCount(iCodePointBefore);
            while (true) {
                iCharCount2 -= iCharCount6;
                if (iCharCount2 <= 0 || !isTagSpecChar(iCodePointBefore)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointBefore);
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                iCharCount6 = Character.charCount(iCodePointBefore);
            }
            if (!isEmoji(iCodePointBefore)) {
                return i10 - 2;
            }
            iCharCount += Character.charCount(iCodePointBefore);
        }
        if (isVariationSelector(iCodePointBefore)) {
            iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
            if (!isEmoji(iCodePointBefore)) {
                return i10 - iCharCount;
            }
            iCharCount += Character.charCount(iCodePointBefore);
            iCharCount2 -= iCharCount;
        }
        if (isEmoji(iCodePointBefore)) {
            boolean z10 = false;
            int i12 = 0;
            do {
                if (z10) {
                    iCharCount += Character.charCount(iCodePointBefore) + i12 + 1;
                    z10 = false;
                }
                if (!isEmojiModifier(iCodePointBefore)) {
                    if (iCharCount2 > 0) {
                        iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                        iCharCount2 -= Character.charCount(iCodePointBefore);
                        if (iCodePointBefore == 8205) {
                            iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                            iCharCount2 -= Character.charCount(iCodePointBefore);
                            if (iCharCount2 <= 0 || !isVariationSelector(iCodePointBefore)) {
                                i12 = 0;
                            } else {
                                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                                int iCharCount7 = Character.charCount(iCodePointBefore);
                                iCharCount2 -= Character.charCount(iCodePointBefore);
                                i12 = iCharCount7;
                            }
                            z10 = true;
                        } else {
                            i12 = 0;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (iCharCount2 == 0 || !z10) {
                        break;
                    }
                } else {
                    int iCodePointBefore5 = Character.codePointBefore(charSequence, iCharCount2);
                    int iCharCount8 = iCharCount2 - Character.charCount(iCodePointBefore5);
                    if (iCharCount8 > 0 && isVariationSelector(iCodePointBefore5)) {
                        iCodePointBefore5 = Character.codePointBefore(charSequence, iCharCount8);
                        if (!isEmoji(iCodePointBefore5)) {
                            return i10 - iCharCount;
                        }
                        iCharCount3 = Character.charCount(iCodePointBefore5);
                        Character.charCount(iCodePointBefore5);
                    }
                    if (!isEmojiModifierBase(iCodePointBefore5)) {
                        break;
                    }
                    iCharCount += iCharCount3 + Character.charCount(iCodePointBefore5);
                    break;
                }
            } while (isEmoji(iCodePointBefore));
        }
        return i10 - iCharCount;
    }

    public boolean isEmoji(int i10) {
        return this.flutterJNI.isCodePointEmoji(i10);
    }

    public boolean isEmojiModifier(int i10) {
        return this.flutterJNI.isCodePointEmojiModifier(i10);
    }

    public boolean isEmojiModifierBase(int i10) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i10);
    }

    public boolean isKeycapBase(int i10) {
        return (48 <= i10 && i10 <= 57) || i10 == 35 || i10 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i10) {
        return this.flutterJNI.isCodePointRegionalIndicator(i10);
    }

    public boolean isTagSpecChar(int i10) {
        return 917536 <= i10 && i10 <= 917630;
    }

    public boolean isVariationSelector(int i10) {
        return this.flutterJNI.isCodePointVariantSelector(i10);
    }
}
