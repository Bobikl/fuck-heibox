package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.IOUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import kotlin.text.y;

/* JADX INFO: loaded from: classes6.dex */
public final class JSONScanner extends JSONLexerBase {
    private final int len;
    private final String text;

    public JSONScanner(String str) {
        this(str, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONScanner(String str, int i10) {
        super(i10);
        this.text = str;
        this.len = str.length();
        this.bp = -1;
        next();
        if (this.f37888ch == 65279) {
            next();
        }
    }

    public JSONScanner(char[] cArr, int i10) {
        this(cArr, i10, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONScanner(char[] cArr, int i10, int i11) {
        this(new String(cArr, 0, i10), i11);
    }

    static boolean charArrayCompare(String str, int i10, char[] cArr) {
        int length = cArr.length;
        if (length + i10 > str.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (cArr[i11] != str.charAt(i10 + i11)) {
                return false;
            }
        }
        return true;
    }

    static boolean checkDate(char c10, char c11, char c12, char c13, char c14, char c15, int i10, int i11) {
        if (c10 >= '1' && c10 <= '3' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            if (c14 == '0') {
                if (c15 < '1' || c15 > '9') {
                    return false;
                }
            } else if (c14 != '1' || (c15 != '0' && c15 != '1' && c15 != '2')) {
                return false;
            }
            if (i10 == 48) {
                return i11 >= 49 && i11 <= 57;
            }
            if (i10 != 49 && i10 != 50) {
                return i10 == 51 && (i11 == 48 || i11 == 49);
            }
            if (i11 >= 48 && i11 <= 57) {
                return true;
            }
        }
        return false;
    }

    private boolean checkTime(char c10, char c11, char c12, char c13, char c14, char c15) {
        if (c10 == '0') {
            if (c11 < '0' || c11 > '9') {
                return false;
            }
        } else {
            if (c10 != '1') {
                if (c10 == '2' && c11 >= '0' && c11 <= '4') {
                }
                return false;
            }
            if (c11 < '0' || c11 > '9') {
                return false;
            }
        }
        if (c12 < '0' || c12 > '5') {
            if (c12 != '6' || c13 != '0') {
                return false;
            }
        } else if (c13 < '0' || c13 > '9') {
            return false;
        }
        if (c14 < '0' || c14 > '5') {
            return c14 == '6' && c15 == '0';
        }
        return c15 >= '0' && c15 <= '9';
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x0209  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b6 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:163:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:171:0x031a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x031c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0339  */
    /* JADX WARN: Code duplicated, block: B:177:0x033d A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:179:0x033f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0355  */
    /* JADX WARN: Code duplicated, block: B:190:0x0369  */
    /* JADX WARN: Code duplicated, block: B:192:0x036c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0382  */
    /* JADX WARN: Code duplicated, block: B:199:0x0398 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:212:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:245:0x045d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0474 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:256:0x0478  */
    /* JADX WARN: Code duplicated, block: B:258:0x0491  */
    /* JADX WARN: Code duplicated, block: B:265:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:352:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0156  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0171  */
    /* JADX WARN: Code duplicated, block: B:88:0x017d  */
    private boolean scanISO8601DateIfMatch(boolean z10, int i10) {
        char c10;
        int i11;
        char cCharAt;
        char c11;
        char c12;
        char c13;
        int i12;
        int i13;
        int i14;
        int i15;
        char c14;
        char c15;
        char cCharAt2;
        char c16;
        char c17;
        int i16;
        char cCharAt3;
        int i17;
        char c18;
        char c19;
        char cCharAt4;
        int i18;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        char cCharAt9;
        char cCharAt10;
        char cCharAt11;
        int i19;
        char cCharAt12;
        int i20;
        int i21;
        char cCharAt13;
        char cCharAt14;
        char cCharAt15;
        char c20;
        char cCharAt16;
        char cCharAt17;
        char cCharAt18;
        char cCharAt19;
        if (i10 < 8) {
            return false;
        }
        char cCharAt20 = charAt(this.bp);
        char cCharAt21 = charAt(this.bp + 1);
        char cCharAt22 = charAt(this.bp + 2);
        int i22 = 3;
        char cCharAt23 = charAt(this.bp + 3);
        char cCharAt24 = charAt(this.bp + 4);
        char cCharAt25 = charAt(this.bp + 5);
        char cCharAt26 = charAt(this.bp + 6);
        char cCharAt27 = charAt(this.bp + 7);
        if (!z10 && i10 > 13) {
            char cCharAt28 = charAt((this.bp + i10) - 1);
            char cCharAt29 = charAt((this.bp + i10) - 2);
            if (cCharAt20 == '/' && cCharAt21 == 'D' && cCharAt22 == 'a' && cCharAt23 == 't' && cCharAt24 == 'e' && cCharAt25 == '(' && cCharAt28 == '/' && cCharAt29 == ')') {
                int i23 = -1;
                for (int i24 = 6; i24 < i10; i24++) {
                    char cCharAt30 = charAt(this.bp + i24);
                    if (cCharAt30 != '+') {
                        if (cCharAt30 < '0' || cCharAt30 > '9') {
                            break;
                        }
                    } else {
                        i23 = i24;
                    }
                }
                if (i23 == -1) {
                    return false;
                }
                int i25 = this.bp;
                int i26 = i25 + 6;
                long j10 = Long.parseLong(subString(i26, (i25 + i23) - i26));
                Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
                this.calendar = calendar;
                calendar.setTimeInMillis(j10);
                this.token = 5;
                return true;
            }
        }
        if (i10 == 8 || i10 == 14) {
            c10 = '9';
            i11 = 14;
        } else {
            if (i10 == 16) {
                char cCharAt31 = charAt(this.bp + 10);
                if (cCharAt31 == 'T') {
                    c10 = '9';
                    i11 = 14;
                } else if (cCharAt31 != ' ') {
                    if (i10 == 17) {
                    }
                    if (i10 < 9) {
                        return false;
                    }
                    cCharAt3 = charAt(this.bp + 8);
                    cCharAt3 = charAt(this.bp + 9);
                    if (cCharAt24 == '-') {
                        if (cCharAt24 == '-') {
                            if (cCharAt22 != '.') {
                                if (cCharAt24 == 24180) {
                                }
                                if (cCharAt27 != 26376) {
                                }
                                if (cCharAt3 != 26085) {
                                }
                                cCharAt3 = cCharAt3;
                                cCharAt23 = cCharAt23;
                                cCharAt20 = cCharAt20;
                                i17 = 10;
                                c18 = '0';
                                c19 = cCharAt26;
                                cCharAt22 = cCharAt22;
                            } else {
                                if (cCharAt24 == 24180) {
                                }
                                if (cCharAt27 != 26376) {
                                }
                                if (cCharAt3 != 26085) {
                                }
                                cCharAt3 = cCharAt3;
                                cCharAt23 = cCharAt23;
                                cCharAt20 = cCharAt20;
                                i17 = 10;
                                c18 = '0';
                                c19 = cCharAt26;
                                cCharAt22 = cCharAt22;
                            }
                        } else if (cCharAt22 != '.') {
                            if (cCharAt24 == 24180) {
                            }
                            if (cCharAt27 != 26376) {
                            }
                            if (cCharAt3 != 26085) {
                            }
                            cCharAt3 = cCharAt3;
                            cCharAt23 = cCharAt23;
                            cCharAt20 = cCharAt20;
                            i17 = 10;
                            c18 = '0';
                            c19 = cCharAt26;
                            cCharAt22 = cCharAt22;
                        } else {
                            if (cCharAt24 == 24180) {
                            }
                            if (cCharAt27 != 26376) {
                            }
                            if (cCharAt3 != 26085) {
                            }
                            cCharAt3 = cCharAt3;
                            cCharAt23 = cCharAt23;
                            cCharAt20 = cCharAt20;
                            i17 = 10;
                            c18 = '0';
                            c19 = cCharAt26;
                            cCharAt22 = cCharAt22;
                        }
                    } else if (cCharAt24 == '-') {
                        if (cCharAt22 != '.') {
                            if (cCharAt24 == 24180) {
                            }
                            if (cCharAt27 != 26376) {
                            }
                            if (cCharAt3 != 26085) {
                            }
                            cCharAt3 = cCharAt3;
                            cCharAt23 = cCharAt23;
                            cCharAt20 = cCharAt20;
                            i17 = 10;
                            c18 = '0';
                            c19 = cCharAt26;
                            cCharAt22 = cCharAt22;
                        } else {
                            if (cCharAt24 == 24180) {
                            }
                            if (cCharAt27 != 26376) {
                            }
                            if (cCharAt3 != 26085) {
                            }
                            cCharAt3 = cCharAt3;
                            cCharAt23 = cCharAt23;
                            cCharAt20 = cCharAt20;
                            i17 = 10;
                            c18 = '0';
                            c19 = cCharAt26;
                            cCharAt22 = cCharAt22;
                        }
                    } else if (cCharAt22 != '.') {
                        if (cCharAt24 == 24180) {
                        }
                        if (cCharAt27 != 26376) {
                        }
                        if (cCharAt3 != 26085) {
                        }
                        cCharAt3 = cCharAt3;
                        cCharAt23 = cCharAt23;
                        cCharAt20 = cCharAt20;
                        i17 = 10;
                        c18 = '0';
                        c19 = cCharAt26;
                        cCharAt22 = cCharAt22;
                    } else {
                        if (cCharAt24 == 24180) {
                        }
                        if (cCharAt27 != 26376) {
                        }
                        if (cCharAt3 != 26085) {
                        }
                        cCharAt3 = cCharAt3;
                        cCharAt23 = cCharAt23;
                        cCharAt20 = cCharAt20;
                        i17 = 10;
                        c18 = '0';
                        c19 = cCharAt26;
                        cCharAt22 = cCharAt22;
                    }
                    if (!checkDate(cCharAt20, cCharAt21, cCharAt22, cCharAt23, cCharAt25, c19, c18, cCharAt3)) {
                        return false;
                    }
                    setCalendar(cCharAt20, cCharAt21, cCharAt22, cCharAt23, cCharAt25, c19, c18, cCharAt3);
                    cCharAt4 = charAt(this.bp + i17);
                    if (cCharAt4 == 'T') {
                    }
                    i18 = i17 + 9;
                    if (i10 >= i18) {
                        return false;
                    }
                    cCharAt5 = charAt(this.bp + i17 + 1);
                    cCharAt6 = charAt(this.bp + i17 + 2);
                    cCharAt7 = charAt(this.bp + i17 + 4);
                    cCharAt8 = charAt(this.bp + i17 + 5);
                    cCharAt9 = charAt(this.bp + i17 + 7);
                    cCharAt10 = charAt(this.bp + i17 + 8);
                    if (!checkTime(cCharAt5, cCharAt6, cCharAt7, cCharAt8, cCharAt9, cCharAt10)) {
                        return false;
                    }
                    setTime(cCharAt5, cCharAt6, cCharAt7, cCharAt8, cCharAt9, cCharAt10);
                    cCharAt11 = charAt(this.bp + i17 + 9);
                    if (cCharAt11 != '.') {
                        this.calendar.set(14, 0);
                        int i27 = this.bp + i18;
                        this.bp = i27;
                        this.f37888ch = charAt(i27);
                        this.token = 5;
                        if (cCharAt11 == 'Z') {
                            return true;
                        }
                        return true;
                    }
                    i19 = i17 + 11;
                    if (i10 >= i19) {
                        return false;
                    }
                    int i28 = cCharAt12 - '0';
                    if (i10 > i19) {
                        i20 = 1;
                    } else {
                        i20 = 1;
                    }
                    if (i20 == 2) {
                        i21 = i20;
                    } else {
                        i21 = i20;
                    }
                    this.calendar.set(14, i28);
                    cCharAt13 = charAt(this.bp + i17 + 10 + i21);
                    if (cCharAt13 != '+') {
                        cCharAt14 = charAt(this.bp + i17 + 10 + i21 + 1);
                        if (cCharAt14 >= '0') {
                            return false;
                        }
                        return false;
                    }
                    cCharAt14 = charAt(this.bp + i17 + 10 + i21 + 1);
                    if (cCharAt14 >= '0') {
                        return false;
                    }
                    return false;
                    int i29 = i17 + 10 + i21 + i22;
                    cCharAt17 = charAt(this.bp + i29);
                    if (cCharAt17 == 26) {
                    }
                    int i30 = this.bp + i29;
                    this.bp = i30;
                    this.f37888ch = charAt(i30);
                    this.token = 5;
                    return true;
                }
            } else if (i10 == 17 || charAt(this.bp + 6) == '-') {
                if (i10 < 9) {
                    return false;
                }
                cCharAt3 = charAt(this.bp + 8);
                cCharAt3 = charAt(this.bp + 9);
                if ((cCharAt24 == '-' || cCharAt27 != '-') && !(cCharAt24 == '/' && cCharAt27 == '/')) {
                    if (cCharAt24 == '-' || cCharAt26 != '-') {
                        if ((cCharAt22 != '.' && cCharAt25 == '.') || (cCharAt22 == '-' && cCharAt25 == '-')) {
                            cCharAt21 = cCharAt27;
                            cCharAt23 = cCharAt3;
                            cCharAt25 = cCharAt23;
                            c18 = cCharAt20;
                            cCharAt3 = cCharAt21;
                            i17 = 10;
                            c19 = cCharAt24;
                            cCharAt20 = cCharAt26;
                            cCharAt22 = cCharAt3;
                        } else {
                            if (cCharAt24 == 24180 && cCharAt24 != 45380) {
                                return false;
                            }
                            if (cCharAt27 != 26376 || cCharAt27 == 50900) {
                                if (cCharAt3 != 26085 || cCharAt3 == 51068) {
                                    cCharAt3 = cCharAt3;
                                    cCharAt23 = cCharAt23;
                                    cCharAt20 = cCharAt20;
                                    i17 = 10;
                                    c18 = '0';
                                } else {
                                    if (charAt(this.bp + 10) != 26085 && charAt(this.bp + 10) != 51068) {
                                        return false;
                                    }
                                    i17 = 11;
                                }
                                c19 = cCharAt26;
                                cCharAt22 = cCharAt22;
                            } else {
                                if (cCharAt26 != 26376 && cCharAt26 != 50900) {
                                    return false;
                                }
                                if (cCharAt3 == 26085 || cCharAt3 == 51068) {
                                    cCharAt22 = cCharAt22;
                                    c19 = cCharAt25;
                                    cCharAt3 = cCharAt27;
                                    cCharAt23 = cCharAt23;
                                    cCharAt20 = cCharAt20;
                                    cCharAt21 = cCharAt21;
                                    i17 = 10;
                                    cCharAt25 = '0';
                                    c18 = '0';
                                } else {
                                    if (cCharAt3 != 26085 && cCharAt3 != 51068) {
                                        return false;
                                    }
                                    i17 = 10;
                                    cCharAt25 = '0';
                                    c19 = cCharAt25;
                                    cCharAt21 = cCharAt21;
                                    c18 = cCharAt27;
                                    cCharAt23 = cCharAt23;
                                }
                            }
                        }
                    } else if (cCharAt3 == ' ') {
                        cCharAt22 = cCharAt22;
                        c19 = cCharAt25;
                        cCharAt3 = cCharAt27;
                        cCharAt23 = cCharAt23;
                        cCharAt20 = cCharAt20;
                        cCharAt21 = cCharAt21;
                        cCharAt25 = '0';
                        c18 = '0';
                        i17 = 8;
                    } else {
                        cCharAt25 = '0';
                        i17 = 9;
                        c19 = cCharAt25;
                        cCharAt21 = cCharAt21;
                        c18 = cCharAt27;
                        cCharAt23 = cCharAt23;
                    }
                    if (!checkDate(cCharAt20, cCharAt21, cCharAt22, cCharAt23, cCharAt25, c19, c18, cCharAt3)) {
                        return false;
                    }
                    setCalendar(cCharAt20, cCharAt21, cCharAt22, cCharAt23, cCharAt25, c19, c18, cCharAt3);
                    cCharAt4 = charAt(this.bp + i17);
                    if (cCharAt4 == 'T' && (cCharAt4 != ' ' || z10)) {
                        if (cCharAt4 == '\"' || cCharAt4 == 26 || cCharAt4 == 26085 || cCharAt4 == 51068) {
                            this.calendar.set(11, 0);
                            this.calendar.set(12, 0);
                            this.calendar.set(13, 0);
                            this.calendar.set(14, 0);
                            int i31 = this.bp + i17;
                            this.bp = i31;
                            this.f37888ch = charAt(i31);
                            this.token = 5;
                            return true;
                        }
                        if ((cCharAt4 != '+' && cCharAt4 != '-') || this.len != i17 + 6 || charAt(this.bp + i17 + 3) != ':' || charAt(this.bp + i17 + 4) != '0' || charAt(this.bp + i17 + 5) != '0') {
                            return false;
                        }
                        setTime('0', '0', '0', '0', '0', '0');
                        this.calendar.set(14, 0);
                        setTimeZone(cCharAt4, charAt(this.bp + i17 + 1), charAt(this.bp + i17 + 2));
                        return true;
                    }
                    i18 = i17 + 9;
                    if (i10 >= i18 || charAt(this.bp + i17 + 3) != ':' || charAt(this.bp + i17 + 6) != ':') {
                        return false;
                    }
                    cCharAt5 = charAt(this.bp + i17 + 1);
                    cCharAt6 = charAt(this.bp + i17 + 2);
                    cCharAt7 = charAt(this.bp + i17 + 4);
                    cCharAt8 = charAt(this.bp + i17 + 5);
                    cCharAt9 = charAt(this.bp + i17 + 7);
                    cCharAt10 = charAt(this.bp + i17 + 8);
                    if (!checkTime(cCharAt5, cCharAt6, cCharAt7, cCharAt8, cCharAt9, cCharAt10)) {
                        return false;
                    }
                    setTime(cCharAt5, cCharAt6, cCharAt7, cCharAt8, cCharAt9, cCharAt10);
                    cCharAt11 = charAt(this.bp + i17 + 9);
                    if (cCharAt11 != '.') {
                        this.calendar.set(14, 0);
                        int i210 = this.bp + i18;
                        this.bp = i210;
                        this.f37888ch = charAt(i210);
                        this.token = 5;
                        if (cCharAt11 == 'Z' || this.calendar.getTimeZone().getRawOffset() == 0) {
                            return true;
                        }
                        String[] availableIDs = TimeZone.getAvailableIDs(0);
                        if (availableIDs.length <= 0) {
                            return true;
                        }
                        this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
                        return true;
                    }
                    i19 = i17 + 11;
                    if (i10 >= i19 || (cCharAt12 = charAt(this.bp + i17 + 10)) < '0' || cCharAt12 > '9') {
                        return false;
                    }
                    int i211 = cCharAt12 - '0';
                    if (i10 > i19 || (cCharAt19 = charAt(this.bp + i17 + 11)) < '0' || cCharAt19 > '9') {
                        i20 = 1;
                    } else {
                        i211 = (i211 * 10) + (cCharAt19 - '0');
                        i20 = 2;
                    }
                    if (i20 == 2 || (cCharAt18 = charAt(this.bp + i17 + 12)) < '0' || cCharAt18 > '9') {
                        i21 = i20;
                    } else {
                        i211 = (i211 * 10) + (cCharAt18 - '0');
                        i21 = 3;
                    }
                    this.calendar.set(14, i211);
                    cCharAt13 = charAt(this.bp + i17 + 10 + i21);
                    if (cCharAt13 != '+' || cCharAt13 == '-') {
                        cCharAt14 = charAt(this.bp + i17 + 10 + i21 + 1);
                        if (cCharAt14 >= '0' || cCharAt14 > '1' || (cCharAt15 = charAt(this.bp + i17 + 10 + i21 + 2)) < '0' || cCharAt15 > '9') {
                            return false;
                        }
                        char cCharAt32 = charAt(this.bp + i17 + 10 + i21 + 3);
                        if (cCharAt32 == ':') {
                            char cCharAt33 = charAt(this.bp + i17 + 10 + i21 + 4);
                            if ((cCharAt33 != '0' && cCharAt33 != '3') || (cCharAt16 = charAt(this.bp + i17 + 10 + i21 + 5)) != '0') {
                                return false;
                            }
                            c20 = cCharAt33;
                            i22 = 6;
                        } else {
                            if (cCharAt32 == '0') {
                                char cCharAt34 = charAt(this.bp + i17 + 10 + i21 + 4);
                                if (cCharAt34 != '0' && cCharAt34 != '3') {
                                    return false;
                                }
                                c20 = cCharAt34;
                                i22 = 5;
                            } else {
                                c20 = '0';
                            }
                            cCharAt16 = '0';
                        }
                        setTimeZone(cCharAt13, cCharAt14, cCharAt15, c20, cCharAt16);
                    } else if (cCharAt13 == 'Z') {
                        if (this.calendar.getTimeZone().getRawOffset() != 0) {
                            String[] availableIDs2 = TimeZone.getAvailableIDs(0);
                            if (availableIDs2.length > 0) {
                                this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs2[0]));
                            }
                        }
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    int i212 = i17 + 10 + i21 + i22;
                    cCharAt17 = charAt(this.bp + i212);
                    if (cCharAt17 == 26 && cCharAt17 != '\"') {
                        return false;
                    }
                    int i32 = this.bp + i212;
                    this.bp = i32;
                    this.f37888ch = charAt(i32);
                    this.token = 5;
                    return true;
                }
                i17 = 10;
                c18 = cCharAt3;
                c19 = cCharAt26;
                cCharAt22 = cCharAt22;
                if (!checkDate(cCharAt20, cCharAt21, cCharAt22, cCharAt23, cCharAt25, c19, c18, cCharAt3)) {
                    return false;
                }
                setCalendar(cCharAt20, cCharAt21, cCharAt22, cCharAt23, cCharAt25, c19, c18, cCharAt3);
                cCharAt4 = charAt(this.bp + i17);
                if (cCharAt4 == 'T') {
                }
                i18 = i17 + 9;
                if (i10 >= i18) {
                    return false;
                }
                cCharAt5 = charAt(this.bp + i17 + 1);
                cCharAt6 = charAt(this.bp + i17 + 2);
                cCharAt7 = charAt(this.bp + i17 + 4);
                cCharAt8 = charAt(this.bp + i17 + 5);
                cCharAt9 = charAt(this.bp + i17 + 7);
                cCharAt10 = charAt(this.bp + i17 + 8);
                if (!checkTime(cCharAt5, cCharAt6, cCharAt7, cCharAt8, cCharAt9, cCharAt10)) {
                    return false;
                }
                setTime(cCharAt5, cCharAt6, cCharAt7, cCharAt8, cCharAt9, cCharAt10);
                cCharAt11 = charAt(this.bp + i17 + 9);
                if (cCharAt11 != '.') {
                    this.calendar.set(14, 0);
                    int i213 = this.bp + i18;
                    this.bp = i213;
                    this.f37888ch = charAt(i213);
                    this.token = 5;
                    if (cCharAt11 == 'Z') {
                        return true;
                    }
                    return true;
                }
                i19 = i17 + 11;
                if (i10 >= i19) {
                    return false;
                }
                int i214 = cCharAt12 - '0';
                if (i10 > i19) {
                    i20 = 1;
                } else {
                    i20 = 1;
                }
                if (i20 == 2) {
                    i21 = i20;
                } else {
                    i21 = i20;
                }
                this.calendar.set(14, i214);
                cCharAt13 = charAt(this.bp + i17 + 10 + i21);
                if (cCharAt13 != '+') {
                    cCharAt14 = charAt(this.bp + i17 + 10 + i21 + 1);
                    if (cCharAt14 >= '0') {
                        return false;
                    }
                    return false;
                }
                cCharAt14 = charAt(this.bp + i17 + 10 + i21 + 1);
                if (cCharAt14 >= '0') {
                    return false;
                }
                return false;
                int i215 = i17 + 10 + i21 + i22;
                cCharAt17 = charAt(this.bp + i215);
                if (cCharAt17 == 26) {
                }
                int i33 = this.bp + i215;
                this.bp = i33;
                this.f37888ch = charAt(i33);
                this.token = 5;
                return true;
            }
            c10 = '9';
            i11 = 14;
        }
        if (z10) {
            return false;
        }
        char cCharAt35 = charAt(this.bp + 8);
        boolean z11 = cCharAt24 == '-' && cCharAt27 == '-';
        boolean z12 = z11 && i10 == 16;
        boolean z13 = z11 && i10 == 17;
        if (z13 || z12) {
            cCharAt = charAt(this.bp + 9);
            c11 = cCharAt25;
            c12 = cCharAt26;
            c13 = cCharAt35;
        } else {
            c11 = cCharAt24;
            c12 = cCharAt25;
            c13 = cCharAt26;
            cCharAt = cCharAt27;
        }
        int i34 = i11;
        if (!checkDate(cCharAt20, cCharAt21, cCharAt22, cCharAt23, c11, c12, c13, cCharAt)) {
            return false;
        }
        setCalendar(cCharAt20, cCharAt21, cCharAt22, cCharAt23, c11, c12, c13, cCharAt);
        if (i10 != 8) {
            char cCharAt36 = charAt(this.bp + 9);
            char cCharAt37 = charAt(this.bp + 10);
            char cCharAt38 = charAt(this.bp + 11);
            char cCharAt39 = charAt(this.bp + 12);
            char cCharAt40 = charAt(this.bp + 13);
            if ((z13 && cCharAt37 == 'T' && cCharAt40 == ':' && charAt(this.bp + 16) == 'Z') || (z12 && ((cCharAt37 == ' ' || cCharAt37 == 'T') && cCharAt40 == ':'))) {
                char cCharAt41 = charAt(this.bp + i34);
                cCharAt2 = charAt(this.bp + 15);
                c15 = cCharAt41;
                cCharAt35 = cCharAt38;
                c14 = cCharAt39;
                c16 = '0';
                c17 = '0';
            } else {
                c14 = cCharAt36;
                c15 = cCharAt37;
                cCharAt2 = cCharAt38;
                c16 = cCharAt39;
                c17 = cCharAt40;
            }
            if (!checkTime(cCharAt35, c14, c15, cCharAt2, c16, c17)) {
                return false;
            }
            if (i10 != 17 || z13) {
                i16 = 0;
            } else {
                char cCharAt42 = charAt(this.bp + i34);
                char cCharAt43 = charAt(this.bp + 15);
                char cCharAt44 = charAt(this.bp + 16);
                if (cCharAt42 < '0' || cCharAt42 > c10 || cCharAt43 < '0' || cCharAt43 > c10 || cCharAt44 < '0' || cCharAt44 > c10) {
                    return false;
                }
                i16 = ((cCharAt42 - '0') * 100) + ((cCharAt43 - '0') * 10) + (cCharAt44 - '0');
            }
            i13 = ((c16 - '0') * 10) + (c17 - '0');
            i15 = ((cCharAt35 - '0') * 10) + (c14 - '0');
            i14 = i16;
            i12 = ((c15 - '0') * 10) + (cCharAt2 - '0');
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        this.calendar.set(11, i15);
        this.calendar.set(12, i12);
        this.calendar.set(13, i13);
        this.calendar.set(i34, i14);
        this.token = 5;
        return true;
    }

    private void setCalendar(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        this.calendar = calendar;
        calendar.set(1, ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0'));
        this.calendar.set(2, (((c14 - '0') * 10) + (c15 - '0')) - 1);
        this.calendar.set(5, ((c16 - '0') * 10) + (c17 - '0'));
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final String addSymbol(int i10, int i11, int i12, SymbolTable symbolTable) {
        return symbolTable.addSymbol(this.text, i10, i11, i12);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    protected final void arrayCopy(int i10, char[] cArr, int i11, int i12) {
        this.text.getChars(i10, i12 + i10, cArr, i11);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public byte[] bytesValue() {
        if (this.token != 26) {
            return IOUtils.decodeBase64(this.text, this.np + 1, this.sp);
        }
        int i10 = this.np + 1;
        int i11 = this.sp;
        if (i11 % 2 != 0) {
            throw new JSONException("illegal state. " + i11);
        }
        int i12 = i11 / 2;
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 2) + i10;
            char cCharAt = this.text.charAt(i14);
            char cCharAt2 = this.text.charAt(i14 + 1);
            char c10 = '0';
            int i15 = cCharAt - (cCharAt <= '9' ? '0' : '7');
            if (cCharAt2 > '9') {
                c10 = '7';
            }
            bArr[i13] = (byte) ((i15 << 4) | (cCharAt2 - c10));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final boolean charArrayCompare(char[] cArr) {
        return charArrayCompare(this.text, this.bp, cArr);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char charAt(int i10) {
        return i10 >= this.len ? JSONLexer.EOI : this.text.charAt(i10);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    protected final void copyTo(int i10, int i11, char[] cArr) {
        this.text.getChars(i10, i11 + i10, cArr, 0);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final BigDecimal decimalValue() {
        char cCharAt = charAt((this.np + this.sp) - 1);
        int i10 = this.sp;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i10--;
        }
        int i11 = this.np;
        char[] cArr = this.sbuf;
        if (i10 < cArr.length) {
            this.text.getChars(i11, i11 + i10, cArr, 0);
            return new BigDecimal(this.sbuf, 0, i10);
        }
        char[] cArr2 = new char[i10];
        this.text.getChars(i11, i10 + i11, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final int indexOf(char c10, int i10) {
        return this.text.indexOf(c10, i10);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public String info() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("pos ");
        sb2.append(this.bp);
        sb2.append(", json : ");
        sb2.append(this.text.length() < 65536 ? this.text : this.text.substring(0, 65536));
        return sb2.toString();
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean isEOF() {
        int i10 = this.bp;
        int i11 = this.len;
        if (i10 != i11) {
            return this.f37888ch == 26 && i10 + 1 == i11;
        }
        return true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean matchField2(char[] cArr) {
        while (JSONLexerBase.isWhitespace(this.f37888ch)) {
            next();
        }
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return false;
        }
        int length = this.bp + cArr.length;
        int i10 = length + 1;
        char cCharAt = this.text.charAt(length);
        while (JSONLexerBase.isWhitespace(cCharAt)) {
            cCharAt = this.text.charAt(i10);
            i10++;
        }
        if (cCharAt != ':') {
            this.matchStat = -2;
            return false;
        }
        this.bp = i10;
        this.f37888ch = charAt(i10);
        return true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Collection<String> newCollectionByType(Class<?> cls) {
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final char next() {
        int i10 = this.bp + 1;
        this.bp = i10;
        char cCharAt = i10 >= this.len ? JSONLexer.EOI : this.text.charAt(i10);
        this.f37888ch = cCharAt;
        return cCharAt;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final String numberString() {
        char cCharAt = charAt((this.np + this.sp) - 1);
        int i10 = this.sp;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i10--;
        }
        return subString(this.np, i10);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Date scanDate(char c10) {
        char cCharAt;
        long j10;
        Date date;
        int i10;
        boolean z10 = false;
        this.matchStat = 0;
        int i11 = this.bp;
        char c11 = this.f37888ch;
        int i12 = i11 + 1;
        char cCharAt2 = charAt(i11);
        if (cCharAt2 == '\"') {
            int iIndexOf = indexOf(y.f128593b, i12);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            this.bp = i12;
            if (!scanISO8601DateIfMatch(false, iIndexOf - i12)) {
                this.bp = i11;
                this.f37888ch = c11;
                this.matchStat = -1;
                return null;
            }
            date = this.calendar.getTime();
            cCharAt = charAt(iIndexOf + 1);
            this.bp = i11;
            while (cCharAt != ',' && cCharAt != ']') {
                if (!JSONLexerBase.isWhitespace(cCharAt)) {
                    this.bp = i11;
                    this.f37888ch = c11;
                    this.matchStat = -1;
                    return null;
                }
                iIndexOf++;
                cCharAt = charAt(iIndexOf + 1);
            }
            this.bp = iIndexOf + 1;
            this.f37888ch = cCharAt;
        } else {
            char c12 = '9';
            char c13 = '0';
            if (cCharAt2 != '-' && (cCharAt2 < '0' || cCharAt2 > '9')) {
                if (cCharAt2 == 'n') {
                    int i13 = i12 + 1;
                    if (charAt(i12) == 'u') {
                        int i14 = i13 + 1;
                        if (charAt(i13) == 'l') {
                            int i15 = i14 + 1;
                            if (charAt(i14) == 'l') {
                                cCharAt = charAt(i15);
                                this.bp = i15;
                                date = null;
                            }
                        }
                    }
                }
                this.bp = i11;
                this.f37888ch = c11;
                this.matchStat = -1;
                return null;
            }
            if (cCharAt2 == '-') {
                cCharAt2 = charAt(i12);
                i12++;
                z10 = true;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                cCharAt = cCharAt2;
                j10 = 0;
            } else {
                j10 = cCharAt2 - '0';
                while (true) {
                    i10 = i12 + 1;
                    cCharAt = charAt(i12);
                    if (cCharAt < c13 || cCharAt > c12) {
                        break;
                    }
                    j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                    i12 = i10;
                    c12 = '9';
                    c13 = '0';
                }
                if (cCharAt == ',' || cCharAt == ']') {
                    this.bp = i10 - 1;
                }
            }
            if (j10 < 0) {
                this.bp = i11;
                this.f37888ch = c11;
                this.matchStat = -1;
                return null;
            }
            if (z10) {
                j10 = -j10;
            }
            date = new Date(j10);
        }
        if (cCharAt == ',') {
            int i16 = this.bp + 1;
            this.bp = i16;
            this.f37888ch = charAt(i16);
            this.matchStat = 3;
            return date;
        }
        int i17 = this.bp + 1;
        this.bp = i17;
        char cCharAt3 = charAt(i17);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i18 = this.bp + 1;
            this.bp = i18;
            this.f37888ch = charAt(i18);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i19 = this.bp + 1;
            this.bp = i19;
            this.f37888ch = charAt(i19);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i20 = this.bp + 1;
            this.bp = i20;
            this.f37888ch = charAt(i20);
        } else {
            if (cCharAt3 != 26) {
                this.bp = i11;
                this.f37888ch = c11;
                this.matchStat = -1;
                return null;
            }
            this.f37888ch = JSONLexer.EOI;
            this.token = 20;
        }
        this.matchStat = 4;
        return date;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00c4 -> B:52:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public double scanDouble(char r22) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONScanner.scanDouble(char):double");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c A[LOOP:0: B:78:0x00ed->B:103:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    /* JADX WARN: Code duplicated, block: B:96:0x0153  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159 A[LOOP:1: B:84:0x0111->B:98:0x0159, LOOP_END] */
    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public boolean scanFieldBoolean(char[] cArr) {
        char cCharAt;
        boolean z10;
        char cCharAt2;
        this.matchStat = 0;
        if (!charArrayCompare(this.text, this.bp, cArr)) {
            this.matchStat = -2;
            return false;
        }
        int i10 = this.bp;
        int length = cArr.length + i10;
        int i11 = length + 1;
        char cCharAt3 = charAt(length);
        boolean z11 = cCharAt3 == '\"';
        if (z11) {
            int i12 = i11 + 1;
            char cCharAt4 = charAt(i11);
            i11 = i12;
            cCharAt3 = cCharAt4;
        }
        if (cCharAt3 != 't') {
            if (cCharAt3 == 'f') {
                int i13 = i11 + 1;
                if (charAt(i11) != 'a') {
                    this.matchStat = -1;
                    return false;
                }
                int i14 = i13 + 1;
                if (charAt(i13) != 'l') {
                    this.matchStat = -1;
                    return false;
                }
                int i15 = i14 + 1;
                if (charAt(i14) != 's') {
                    this.matchStat = -1;
                    return false;
                }
                int i16 = i15 + 1;
                if (charAt(i15) != 'e') {
                    this.matchStat = -1;
                    return false;
                }
                if (z11) {
                    int i17 = i16 + 1;
                    if (charAt(i16) != '\"') {
                        this.matchStat = -1;
                        return false;
                    }
                    i16 = i17;
                }
                this.bp = i16;
                cCharAt = charAt(i16);
            } else if (cCharAt3 == '1') {
                if (z11) {
                    int i18 = i11 + 1;
                    if (charAt(i11) != '\"') {
                        this.matchStat = -1;
                        return false;
                    }
                    i11 = i18;
                }
                this.bp = i11;
                cCharAt = charAt(i11);
            } else {
                if (cCharAt3 != '0') {
                    this.matchStat = -1;
                    return false;
                }
                if (z11) {
                    int i19 = i11 + 1;
                    if (charAt(i11) != '\"') {
                        this.matchStat = -1;
                        return false;
                    }
                    i11 = i19;
                }
                this.bp = i11;
                cCharAt = charAt(i11);
            }
            z10 = false;
            while (cCharAt != ',') {
                if (cCharAt == '}') {
                    int i20 = this.bp + 1;
                    this.bp = i20;
                    cCharAt2 = charAt(i20);
                    while (cCharAt2 != ',') {
                        if (cCharAt2 == ']') {
                            this.token = 15;
                            int i21 = this.bp + 1;
                            this.bp = i21;
                            this.f37888ch = charAt(i21);
                        } else if (cCharAt2 == '}') {
                            this.token = 13;
                            int i22 = this.bp + 1;
                            this.bp = i22;
                            this.f37888ch = charAt(i22);
                        } else if (cCharAt2 == 26) {
                            this.token = 20;
                        } else {
                            if (JSONLexerBase.isWhitespace(cCharAt2)) {
                                this.matchStat = -1;
                                return false;
                            }
                            int i23 = this.bp + 1;
                            this.bp = i23;
                            cCharAt2 = charAt(i23);
                        }
                        this.matchStat = 4;
                        return z10;
                    }
                    this.token = 16;
                    int i24 = this.bp + 1;
                    this.bp = i24;
                    this.f37888ch = charAt(i24);
                    this.matchStat = 4;
                    return z10;
                }
                if (JSONLexerBase.isWhitespace(cCharAt)) {
                    this.bp = i10;
                    charAt(i10);
                    this.matchStat = -1;
                    return false;
                }
                int i25 = this.bp + 1;
                this.bp = i25;
                cCharAt = charAt(i25);
            }
            int i26 = this.bp + 1;
            this.bp = i26;
            this.f37888ch = charAt(i26);
            this.matchStat = 3;
            this.token = 16;
            return z10;
        }
        int i27 = i11 + 1;
        if (charAt(i11) != 'r') {
            this.matchStat = -1;
            return false;
        }
        int i28 = i27 + 1;
        if (charAt(i27) != 'u') {
            this.matchStat = -1;
            return false;
        }
        int i29 = i28 + 1;
        if (charAt(i28) != 'e') {
            this.matchStat = -1;
            return false;
        }
        if (z11) {
            int i30 = i29 + 1;
            if (charAt(i29) != '\"') {
                this.matchStat = -1;
                return false;
            }
            i29 = i30;
        }
        this.bp = i29;
        cCharAt = charAt(i29);
        z10 = true;
        while (cCharAt != ',') {
            if (cCharAt == '}') {
                int i210 = this.bp + 1;
                this.bp = i210;
                cCharAt2 = charAt(i210);
                while (cCharAt2 != ',') {
                    if (cCharAt2 == ']') {
                        this.token = 15;
                        int i211 = this.bp + 1;
                        this.bp = i211;
                        this.f37888ch = charAt(i211);
                    } else if (cCharAt2 == '}') {
                        this.token = 13;
                        int i212 = this.bp + 1;
                        this.bp = i212;
                        this.f37888ch = charAt(i212);
                    } else if (cCharAt2 == 26) {
                        this.token = 20;
                    } else {
                        if (JSONLexerBase.isWhitespace(cCharAt2)) {
                            this.matchStat = -1;
                            return false;
                        }
                        int i213 = this.bp + 1;
                        this.bp = i213;
                        cCharAt2 = charAt(i213);
                    }
                    this.matchStat = 4;
                    return z10;
                }
                this.token = 16;
                int i214 = this.bp + 1;
                this.bp = i214;
                this.f37888ch = charAt(i214);
                this.matchStat = 4;
                return z10;
            }
            if (JSONLexerBase.isWhitespace(cCharAt)) {
                this.bp = i10;
                charAt(i10);
                this.matchStat = -1;
                return false;
            }
            int i215 = this.bp + 1;
            this.bp = i215;
            cCharAt = charAt(i215);
        }
        int i216 = this.bp + 1;
        this.bp = i216;
        this.f37888ch = charAt(i216);
        this.matchStat = 3;
        this.token = 16;
        return z10;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Date scanFieldDate(char[] cArr) {
        char cCharAt;
        long j10;
        char cCharAt2;
        Date date;
        int i10;
        boolean z10 = false;
        this.matchStat = 0;
        int i11 = this.bp;
        char c10 = this.f37888ch;
        if (!charArrayCompare(this.text, i11, cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = this.bp + cArr.length;
        int i12 = length + 1;
        char cCharAt3 = charAt(length);
        if (cCharAt3 == '\"') {
            int iIndexOf = indexOf(y.f128593b, i12);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            this.bp = i12;
            if (!scanISO8601DateIfMatch(false, iIndexOf - i12)) {
                this.bp = i11;
                this.matchStat = -1;
                return null;
            }
            date = this.calendar.getTime();
            cCharAt2 = charAt(iIndexOf + 1);
            this.bp = i11;
            while (cCharAt2 != ',' && cCharAt2 != '}') {
                if (!JSONLexerBase.isWhitespace(cCharAt2)) {
                    this.matchStat = -1;
                    return null;
                }
                iIndexOf++;
                cCharAt2 = charAt(iIndexOf + 1);
            }
            this.bp = iIndexOf + 1;
            this.f37888ch = cCharAt2;
        } else {
            char c11 = '9';
            char c12 = '0';
            if (cCharAt3 != '-' && (cCharAt3 < '0' || cCharAt3 > '9')) {
                this.matchStat = -1;
                return null;
            }
            if (cCharAt3 == '-') {
                cCharAt3 = charAt(i12);
                i12++;
                z10 = true;
            }
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                cCharAt = cCharAt3;
                j10 = 0;
            } else {
                j10 = cCharAt3 - '0';
                while (true) {
                    i10 = i12 + 1;
                    cCharAt = charAt(i12);
                    if (cCharAt < c12 || cCharAt > c11) {
                        break;
                    }
                    j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                    i12 = i10;
                    c11 = '9';
                    c12 = '0';
                }
                if (cCharAt == ',' || cCharAt == '}') {
                    this.bp = i10 - 1;
                }
            }
            if (j10 < 0) {
                this.matchStat = -1;
                return null;
            }
            if (z10) {
                j10 = -j10;
            }
            cCharAt2 = cCharAt;
            date = new Date(j10);
        }
        if (cCharAt2 == ',') {
            int i13 = this.bp + 1;
            this.bp = i13;
            this.f37888ch = charAt(i13);
            this.matchStat = 3;
            this.token = 16;
            return date;
        }
        int i14 = this.bp + 1;
        this.bp = i14;
        char cCharAt4 = charAt(i14);
        if (cCharAt4 == ',') {
            this.token = 16;
            int i15 = this.bp + 1;
            this.bp = i15;
            this.f37888ch = charAt(i15);
        } else if (cCharAt4 == ']') {
            this.token = 15;
            int i16 = this.bp + 1;
            this.bp = i16;
            this.f37888ch = charAt(i16);
        } else if (cCharAt4 == '}') {
            this.token = 13;
            int i17 = this.bp + 1;
            this.bp = i17;
            this.f37888ch = charAt(i17);
        } else {
            if (cCharAt4 != 26) {
                this.bp = i11;
                this.f37888ch = c10;
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
        }
        this.matchStat = 4;
        return date;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public int scanFieldInt(char[] cArr) {
        int i10;
        char cCharAt;
        this.matchStat = 0;
        int i11 = this.bp;
        char c10 = this.f37888ch;
        if (!charArrayCompare(this.text, i11, cArr)) {
            this.matchStat = -2;
            return 0;
        }
        int length = this.bp + cArr.length;
        int i12 = length + 1;
        char cCharAt2 = charAt(length);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(i12);
            i12++;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(i12);
            i12++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i13 = cCharAt2 - '0';
        while (true) {
            i10 = i12 + 1;
            cCharAt = charAt(i12);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i13 = (i13 * 10) + (cCharAt - '0');
            i12 = i10;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0;
        }
        if (i13 < 0) {
            this.matchStat = -1;
            return 0;
        }
        if (z10) {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0;
            }
            int i14 = i10 + 1;
            char cCharAt3 = charAt(i10);
            i10 = i14;
            cCharAt = cCharAt3;
        }
        while (cCharAt != ',' && cCharAt != '}') {
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return 0;
            }
            int i15 = i10 + 1;
            char cCharAt4 = charAt(i10);
            i10 = i15;
            cCharAt = cCharAt4;
        }
        int i16 = i10 - 1;
        this.bp = i16;
        if (cCharAt == ',') {
            int i17 = i16 + 1;
            this.bp = i17;
            this.f37888ch = charAt(i17);
            this.matchStat = 3;
            this.token = 16;
            return z11 ? -i13 : i13;
        }
        if (cCharAt == '}') {
            int i18 = i16 + 1;
            this.bp = i18;
            char cCharAt5 = charAt(i18);
            while (true) {
                if (cCharAt5 == ',') {
                    this.token = 16;
                    int i19 = this.bp + 1;
                    this.bp = i19;
                    this.f37888ch = charAt(i19);
                    break;
                }
                if (cCharAt5 == ']') {
                    this.token = 15;
                    int i20 = this.bp + 1;
                    this.bp = i20;
                    this.f37888ch = charAt(i20);
                    break;
                }
                if (cCharAt5 == '}') {
                    this.token = 13;
                    int i21 = this.bp + 1;
                    this.bp = i21;
                    this.f37888ch = charAt(i21);
                    break;
                }
                if (cCharAt5 == 26) {
                    this.token = 20;
                    break;
                }
                if (!JSONLexerBase.isWhitespace(cCharAt5)) {
                    this.bp = i11;
                    this.f37888ch = c10;
                    this.matchStat = -1;
                    return 0;
                }
                int i22 = this.bp + 1;
                this.bp = i22;
                cCharAt5 = charAt(i22);
            }
            this.matchStat = 4;
        }
        return z11 ? -i13 : i13;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldLong(char[] cArr) {
        boolean z10;
        int i10;
        char cCharAt;
        this.matchStat = 0;
        int i11 = this.bp;
        char c10 = this.f37888ch;
        if (!charArrayCompare(this.text, i11, cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = this.bp + cArr.length;
        int i12 = length + 1;
        char cCharAt2 = charAt(length);
        boolean z11 = cCharAt2 == '\"';
        if (z11) {
            cCharAt2 = charAt(i12);
            i12++;
        }
        if (cCharAt2 == '-') {
            z10 = true;
            cCharAt2 = charAt(i12);
            i12++;
        } else {
            z10 = false;
        }
        if (cCharAt2 >= '0') {
            char c11 = '9';
            if (cCharAt2 <= '9') {
                long j10 = cCharAt2 - '0';
                while (true) {
                    i10 = i12 + 1;
                    cCharAt = charAt(i12);
                    if (cCharAt < '0' || cCharAt > c11) {
                        break;
                    }
                    j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                    i12 = i10;
                    c11 = '9';
                }
                if (cCharAt == '.') {
                    this.matchStat = -1;
                    return 0L;
                }
                if (z11) {
                    if (cCharAt != '\"') {
                        this.matchStat = -1;
                        return 0L;
                    }
                    int i13 = i10 + 1;
                    char cCharAt3 = charAt(i10);
                    i10 = i13;
                    cCharAt = cCharAt3;
                }
                if (cCharAt == ',' || cCharAt == '}') {
                    this.bp = i10 - 1;
                }
                if (!(j10 >= 0 || (j10 == Long.MIN_VALUE && z10))) {
                    this.bp = i11;
                    this.f37888ch = c10;
                    this.matchStat = -1;
                    return 0L;
                }
                while (cCharAt != ',') {
                    if (cCharAt == '}') {
                        int i14 = this.bp + 1;
                        this.bp = i14;
                        char cCharAt4 = charAt(i14);
                        while (true) {
                            if (cCharAt4 == ',') {
                                this.token = 16;
                                int i15 = this.bp + 1;
                                this.bp = i15;
                                this.f37888ch = charAt(i15);
                                break;
                            }
                            if (cCharAt4 == ']') {
                                this.token = 15;
                                int i16 = this.bp + 1;
                                this.bp = i16;
                                this.f37888ch = charAt(i16);
                                break;
                            }
                            if (cCharAt4 == '}') {
                                this.token = 13;
                                int i17 = this.bp + 1;
                                this.bp = i17;
                                this.f37888ch = charAt(i17);
                                break;
                            }
                            if (cCharAt4 == 26) {
                                this.token = 20;
                                break;
                            }
                            if (!JSONLexerBase.isWhitespace(cCharAt4)) {
                                this.bp = i11;
                                this.f37888ch = c10;
                                this.matchStat = -1;
                                return 0L;
                            }
                            int i18 = this.bp + 1;
                            this.bp = i18;
                            cCharAt4 = charAt(i18);
                        }
                        this.matchStat = 4;
                        return z10 ? -j10 : j10;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt)) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.bp = i10;
                    int i19 = i10 + 1;
                    char cCharAt5 = charAt(i10);
                    i10 = i19;
                    cCharAt = cCharAt5;
                }
                int i20 = this.bp + 1;
                this.bp = i20;
                this.f37888ch = charAt(i20);
                this.matchStat = 3;
                this.token = 16;
                return z10 ? -j10 : j10;
            }
        }
        this.bp = i11;
        this.f37888ch = c10;
        this.matchStat = -1;
        return 0L;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public String scanFieldString(char[] cArr) {
        this.matchStat = 0;
        int i10 = this.bp;
        char c10 = this.f37888ch;
        while (!charArrayCompare(this.text, this.bp, cArr)) {
            if (!JSONLexerBase.isWhitespace(this.f37888ch)) {
                this.matchStat = -2;
                return stringDefaultValue();
            }
            next();
        }
        int length = this.bp + cArr.length;
        int i11 = length + 1;
        if (charAt(length) != '\"') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int iIndexOf = indexOf(y.f128593b, i11);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        String strSubString = subString(i11, iIndexOf - i11);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i12 = 0;
                for (int i13 = iIndexOf - 1; i13 >= 0 && charAt(i13) == '\\'; i13--) {
                    i12++;
                }
                if (i12 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
            }
            int i14 = this.bp;
            int length2 = iIndexOf - ((cArr.length + i14) + 1);
            strSubString = JSONLexerBase.readString(sub_chars(i14 + cArr.length + 1, length2), length2);
        }
        char cCharAt = charAt(iIndexOf + 1);
        while (cCharAt != ',' && cCharAt != '}') {
            if (!JSONLexerBase.isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            iIndexOf++;
            cCharAt = charAt(iIndexOf + 1);
        }
        int i15 = iIndexOf + 1;
        this.bp = i15;
        this.f37888ch = cCharAt;
        if (cCharAt == ',') {
            int i16 = i15 + 1;
            this.bp = i16;
            this.f37888ch = charAt(i16);
            this.matchStat = 3;
            return strSubString;
        }
        int i17 = i15 + 1;
        this.bp = i17;
        char cCharAt2 = charAt(i17);
        if (cCharAt2 == ',') {
            this.token = 16;
            int i18 = this.bp + 1;
            this.bp = i18;
            this.f37888ch = charAt(i18);
        } else if (cCharAt2 == ']') {
            this.token = 15;
            int i19 = this.bp + 1;
            this.bp = i19;
            this.f37888ch = charAt(i19);
        } else if (cCharAt2 == '}') {
            this.token = 13;
            int i20 = this.bp + 1;
            this.bp = i20;
            this.f37888ch = charAt(i20);
        } else {
            if (cCharAt2 != 26) {
                this.bp = i10;
                this.f37888ch = c10;
                this.matchStat = -1;
                return stringDefaultValue();
            }
            this.token = 20;
        }
        this.matchStat = 4;
        return strSubString;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public Collection<String> scanFieldStringArray(char[] cArr, Class<?> cls) {
        char cCharAt;
        int i10;
        int i11;
        char cCharAt2;
        int i12 = 0;
        this.matchStat = 0;
        if (!charArrayCompare(this.text, this.bp, cArr)) {
            this.matchStat = -2;
            return null;
        }
        Collection<String> collectionNewCollectionByType = newCollectionByType(cls);
        int length = this.bp + cArr.length;
        int i13 = length + 1;
        if (charAt(length) == '[') {
            int i14 = i13 + 1;
            char cCharAt3 = charAt(i13);
            while (true) {
                if (cCharAt3 == '\"') {
                    int iIndexOf = indexOf(y.f128593b, i14);
                    if (iIndexOf == -1) {
                        throw new JSONException("unclosed str");
                    }
                    String strSubString = subString(i14, iIndexOf - i14);
                    if (strSubString.indexOf(92) != -1) {
                        while (true) {
                            int i15 = i12;
                            for (int i16 = iIndexOf - 1; i16 >= 0 && charAt(i16) == '\\'; i16--) {
                                i15++;
                            }
                            if (i15 % 2 == 0) {
                                break;
                            }
                            iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
                            i12 = 0;
                        }
                        int i17 = iIndexOf - i14;
                        strSubString = JSONLexerBase.readString(sub_chars(i14, i17), i17);
                    }
                    int i18 = iIndexOf + 1;
                    i11 = i18 + 1;
                    cCharAt2 = charAt(i18);
                    collectionNewCollectionByType.add(strSubString);
                } else {
                    if (cCharAt3 != 'n' || !this.text.startsWith("ull", i14)) {
                        if (cCharAt3 != ']' || collectionNewCollectionByType.size() != 0) {
                            this.matchStat = -1;
                            return null;
                        }
                        i10 = i14 + 1;
                        cCharAt = charAt(i14);
                        break;
                    }
                    int i19 = i14 + 3;
                    i11 = i19 + 1;
                    cCharAt2 = charAt(i19);
                    collectionNewCollectionByType.add(null);
                }
                if (cCharAt2 != ',') {
                    if (cCharAt2 != ']') {
                        this.matchStat = -1;
                        return null;
                    }
                    i10 = i11 + 1;
                    cCharAt = charAt(i11);
                    while (JSONLexerBase.isWhitespace(cCharAt)) {
                        cCharAt = charAt(i10);
                        i10++;
                    }
                    break;
                }
                i14 = i11 + 1;
                cCharAt3 = charAt(i11);
                i12 = 0;
            }
        } else {
            if (!this.text.startsWith("ull", i13)) {
                this.matchStat = -1;
                return null;
            }
            int i20 = i13 + 3;
            collectionNewCollectionByType = null;
            cCharAt = charAt(i20);
            i10 = i20 + 1;
        }
        this.bp = i10;
        if (cCharAt == ',') {
            this.f37888ch = charAt(i10);
            this.matchStat = 3;
            return collectionNewCollectionByType;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        char cCharAt4 = charAt(i10);
        while (cCharAt4 != ',') {
            if (cCharAt4 == ']') {
                this.token = 15;
                int i21 = this.bp + 1;
                this.bp = i21;
                this.f37888ch = charAt(i21);
            } else if (cCharAt4 == '}') {
                this.token = 13;
                int i22 = this.bp + 1;
                this.bp = i22;
                this.f37888ch = charAt(i22);
            } else if (cCharAt4 == 26) {
                this.token = 20;
                this.f37888ch = cCharAt4;
            } else {
                boolean z10 = false;
                while (JSONLexerBase.isWhitespace(cCharAt4)) {
                    int i23 = i10 + 1;
                    char cCharAt5 = charAt(i10);
                    this.bp = i23;
                    z10 = true;
                    cCharAt4 = cCharAt5;
                    i10 = i23;
                }
                if (!z10) {
                    this.matchStat = -1;
                    return null;
                }
            }
            this.matchStat = 4;
            return collectionNewCollectionByType;
        }
        this.token = 16;
        int i24 = this.bp + 1;
        this.bp = i24;
        this.f37888ch = charAt(i24);
        this.matchStat = 4;
        return collectionNewCollectionByType;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public String[] scanFieldStringArray(char[] cArr, int i10, SymbolTable symbolTable) {
        int i11;
        char cCharAt;
        int i12 = this.bp;
        char c10 = this.f37888ch;
        while (JSONLexerBase.isWhitespace(this.f37888ch)) {
            next();
        }
        if (cArr != null) {
            this.matchStat = 0;
            if (!charArrayCompare(cArr)) {
                this.matchStat = -2;
                return null;
            }
            int length = this.bp + cArr.length;
            int i13 = length + 1;
            char cCharAt2 = this.text.charAt(length);
            while (JSONLexerBase.isWhitespace(cCharAt2)) {
                cCharAt2 = this.text.charAt(i13);
                i13++;
            }
            if (cCharAt2 != ':') {
                this.matchStat = -1;
                return null;
            }
            i11 = i13 + 1;
            cCharAt = this.text.charAt(i13);
            while (JSONLexerBase.isWhitespace(cCharAt)) {
                cCharAt = this.text.charAt(i11);
                i11++;
            }
        } else {
            i11 = this.bp + 1;
            cCharAt = this.f37888ch;
        }
        if (cCharAt != '[') {
            if (cCharAt != 'n' || !this.text.startsWith("ull", this.bp + 1)) {
                this.matchStat = -1;
                return null;
            }
            int i14 = this.bp + 4;
            this.bp = i14;
            this.f37888ch = this.text.charAt(i14);
            return null;
        }
        this.bp = i11;
        this.f37888ch = this.text.charAt(i11);
        String[] strArr = i10 >= 0 ? new String[i10] : new String[4];
        int i15 = 0;
        while (true) {
            if (JSONLexerBase.isWhitespace(this.f37888ch)) {
                next();
            } else {
                if (this.f37888ch != '\"') {
                    this.bp = i12;
                    this.f37888ch = c10;
                    this.matchStat = -1;
                    return null;
                }
                String strScanSymbol = scanSymbol(symbolTable, y.f128593b);
                if (i15 == strArr.length) {
                    String[] strArr2 = new String[strArr.length + (strArr.length >> 1) + 1];
                    System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                    strArr = strArr2;
                }
                int i16 = i15 + 1;
                strArr[i15] = strScanSymbol;
                while (JSONLexerBase.isWhitespace(this.f37888ch)) {
                    next();
                }
                if (this.f37888ch != ',') {
                    if (strArr.length != i16) {
                        String[] strArr3 = new String[i16];
                        System.arraycopy(strArr, 0, strArr3, 0, i16);
                        strArr = strArr3;
                    }
                    while (JSONLexerBase.isWhitespace(this.f37888ch)) {
                        next();
                    }
                    if (this.f37888ch == ']') {
                        next();
                        return strArr;
                    }
                    this.bp = i12;
                    this.f37888ch = c10;
                    this.matchStat = -1;
                    return null;
                }
                next();
                i15 = i16;
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public long scanFieldSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(this.text, this.bp, cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = this.bp + cArr.length;
        int i10 = length + 1;
        if (charAt(length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j10 = -3750763034362895579L;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt = charAt(i10);
            if (cCharAt == '\"') {
                this.bp = i11;
                char cCharAt2 = charAt(i11);
                this.f37888ch = cCharAt2;
                while (cCharAt2 != ',') {
                    if (cCharAt2 == '}') {
                        next();
                        skipWhitespace();
                        char current = getCurrent();
                        if (current == ',') {
                            this.token = 16;
                            int i12 = this.bp + 1;
                            this.bp = i12;
                            this.f37888ch = charAt(i12);
                        } else if (current == ']') {
                            this.token = 15;
                            int i13 = this.bp + 1;
                            this.bp = i13;
                            this.f37888ch = charAt(i13);
                        } else if (current == '}') {
                            this.token = 13;
                            int i14 = this.bp + 1;
                            this.bp = i14;
                            this.f37888ch = charAt(i14);
                        } else {
                            if (current != 26) {
                                this.matchStat = -1;
                                return 0L;
                            }
                            this.token = 20;
                        }
                        this.matchStat = 4;
                        return j10;
                    }
                    if (!JSONLexerBase.isWhitespace(cCharAt2)) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    int i15 = this.bp + 1;
                    this.bp = i15;
                    cCharAt2 = charAt(i15);
                }
                int i16 = this.bp + 1;
                this.bp = i16;
                this.f37888ch = charAt(i16);
                this.matchStat = 3;
                return j10;
            }
            if (i11 > this.len) {
                this.matchStat = -1;
                return 0L;
            }
            j10 = (j10 ^ ((long) cCharAt)) * 1099511628211L;
            i10 = i11;
        }
    }

    public boolean scanISO8601DateIfMatch() {
        return scanISO8601DateIfMatch(true);
    }

    public boolean scanISO8601DateIfMatch(boolean z10) {
        return scanISO8601DateIfMatch(z10, this.len - this.bp);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final int scanInt(char c10) {
        int i10;
        char cCharAt;
        this.matchStat = 0;
        int i11 = this.bp;
        int i12 = i11 + 1;
        char cCharAt2 = charAt(i11);
        while (JSONLexerBase.isWhitespace(cCharAt2)) {
            int i13 = i12 + 1;
            char cCharAt3 = charAt(i12);
            i12 = i13;
            cCharAt2 = cCharAt3;
        }
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            int i14 = i12 + 1;
            char cCharAt4 = charAt(i12);
            i12 = i14;
            cCharAt2 = cCharAt4;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            int i15 = i12 + 1;
            char cCharAt5 = charAt(i12);
            i12 = i15;
            cCharAt2 = cCharAt5;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i16 = cCharAt2 - '0';
            while (true) {
                i10 = i12 + 1;
                cCharAt = charAt(i12);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i16 = (i16 * 10) + (cCharAt - '0');
                i12 = i10;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0;
            }
            if (z10) {
                if (cCharAt != '\"') {
                    this.matchStat = -1;
                    return 0;
                }
                char cCharAt6 = charAt(i10);
                i10++;
                cCharAt = cCharAt6;
            }
            if (i16 < 0) {
                this.matchStat = -1;
                return 0;
            }
            while (cCharAt != c10) {
                if (!JSONLexerBase.isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return z11 ? -i16 : i16;
                }
                cCharAt = charAt(i10);
                i10++;
            }
            this.bp = i10;
            this.f37888ch = charAt(i10);
            this.matchStat = 3;
            this.token = 16;
            return z11 ? -i16 : i16;
        }
        if (cCharAt2 == 'n') {
            int i17 = i12 + 1;
            if (charAt(i12) == 'u') {
                int i18 = i17 + 1;
                if (charAt(i17) == 'l') {
                    int i19 = i18 + 1;
                    if (charAt(i18) == 'l') {
                        this.matchStat = 5;
                        int i20 = i19 + 1;
                        char cCharAt7 = charAt(i19);
                        if (z10 && cCharAt7 == '\"') {
                            int i21 = i20 + 1;
                            char cCharAt8 = charAt(i20);
                            i20 = i21;
                            cCharAt7 = cCharAt8;
                        }
                        while (cCharAt7 != ',') {
                            if (cCharAt7 == ']') {
                                this.bp = i20;
                                this.f37888ch = charAt(i20);
                                this.matchStat = 5;
                                this.token = 15;
                                return 0;
                            }
                            if (!JSONLexerBase.isWhitespace(cCharAt7)) {
                                this.matchStat = -1;
                                return 0;
                            }
                            int i22 = i20 + 1;
                            char cCharAt9 = charAt(i20);
                            i20 = i22;
                            cCharAt7 = cCharAt9;
                        }
                        this.bp = i20;
                        this.f37888ch = charAt(i20);
                        this.matchStat = 5;
                        this.token = 16;
                        return 0;
                    }
                }
            }
        }
        this.matchStat = -1;
        return 0;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char c10) {
        int i10;
        char cCharAt;
        boolean z10 = false;
        this.matchStat = 0;
        int i11 = this.bp;
        int i12 = i11 + 1;
        char cCharAt2 = charAt(i11);
        boolean z11 = cCharAt2 == '\"';
        if (z11) {
            int i13 = i12 + 1;
            char cCharAt3 = charAt(i12);
            i12 = i13;
            cCharAt2 = cCharAt3;
        }
        boolean z12 = cCharAt2 == '-';
        if (z12) {
            int i14 = i12 + 1;
            char cCharAt4 = charAt(i12);
            i12 = i14;
            cCharAt2 = cCharAt4;
        }
        char c11 = '0';
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            long j10 = cCharAt2 - '0';
            while (true) {
                i10 = i12 + 1;
                cCharAt = charAt(i12);
                if (cCharAt < c11 || cCharAt > '9') {
                    break;
                }
                j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                i12 = i10;
                c11 = '0';
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0L;
            }
            if (z11) {
                if (cCharAt != '\"') {
                    this.matchStat = -1;
                    return 0L;
                }
                cCharAt = charAt(i10);
                i10++;
            }
            if (j10 >= 0 || (j10 == Long.MIN_VALUE && z12)) {
                z10 = true;
            }
            if (!z10) {
                this.matchStat = -1;
                return 0L;
            }
            while (cCharAt != c10) {
                if (!JSONLexerBase.isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return j10;
                }
                cCharAt = charAt(i10);
                i10++;
            }
            this.bp = i10;
            this.f37888ch = charAt(i10);
            this.matchStat = 3;
            this.token = 16;
            return z12 ? -j10 : j10;
        }
        if (cCharAt2 == 'n') {
            int i15 = i12 + 1;
            if (charAt(i12) == 'u') {
                int i16 = i15 + 1;
                if (charAt(i15) == 'l') {
                    int i17 = i16 + 1;
                    if (charAt(i16) == 'l') {
                        this.matchStat = 5;
                        int i18 = i17 + 1;
                        char cCharAt5 = charAt(i17);
                        if (z11 && cCharAt5 == '\"') {
                            int i19 = i18 + 1;
                            char cCharAt6 = charAt(i18);
                            i18 = i19;
                            cCharAt5 = cCharAt6;
                        }
                        while (cCharAt5 != ',') {
                            if (cCharAt5 == ']') {
                                this.bp = i18;
                                this.f37888ch = charAt(i18);
                                this.matchStat = 5;
                                this.token = 15;
                                return 0L;
                            }
                            if (!JSONLexerBase.isWhitespace(cCharAt5)) {
                                this.matchStat = -1;
                                return 0L;
                            }
                            int i20 = i18 + 1;
                            char cCharAt7 = charAt(i18);
                            i18 = i20;
                            cCharAt5 = cCharAt7;
                        }
                        this.bp = i18;
                        this.f37888ch = charAt(i18);
                        this.matchStat = 5;
                        this.token = 16;
                        return 0L;
                    }
                }
            }
        }
        this.matchStat = -1;
        return 0L;
    }

    protected void setTime(char c10, char c11, char c12, char c13, char c14, char c15) {
        this.calendar.set(11, ((c10 - '0') * 10) + (c11 - '0'));
        this.calendar.set(12, ((c12 - '0') * 10) + (c13 - '0'));
        this.calendar.set(13, ((c14 - '0') * 10) + (c15 - '0'));
    }

    protected void setTimeZone(char c10, char c11, char c12) {
        setTimeZone(c10, c11, c12, '0', '0');
    }

    protected void setTimeZone(char c10, char c11, char c12, char c13, char c14) {
        int i10 = ((((c11 - '0') * 10) + (c12 - '0')) * 3600 * 1000) + ((((c13 - '0') * 10) + (c14 - '0')) * 60 * 1000);
        if (c10 == '-') {
            i10 = -i10;
        }
        if (this.calendar.getTimeZone().getRawOffset() != i10) {
            String[] availableIDs = TimeZone.getAvailableIDs(i10);
            if (availableIDs.length > 0) {
                this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase, com.alibaba.fastjson.parser.JSONLexer
    public final String stringVal() {
        return !this.hasSpecial ? subString(this.np + 1, this.sp) : new String(this.sbuf, 0, this.sp);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final String subString(int i10, int i11) {
        if (!ASMUtils.IS_ANDROID) {
            return this.text.substring(i10, i11 + i10);
        }
        char[] cArr = this.sbuf;
        if (i11 < cArr.length) {
            this.text.getChars(i10, i10 + i11, cArr, 0);
            return new String(this.sbuf, 0, i11);
        }
        char[] cArr2 = new char[i11];
        this.text.getChars(i10, i11 + i10, cArr2, 0);
        return new String(cArr2);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexerBase
    public final char[] sub_chars(int i10, int i11) {
        if (ASMUtils.IS_ANDROID) {
            char[] cArr = this.sbuf;
            if (i11 < cArr.length) {
                this.text.getChars(i10, i11 + i10, cArr, 0);
                return this.sbuf;
            }
        }
        char[] cArr2 = new char[i11];
        this.text.getChars(i10, i11 + i10, cArr2, 0);
        return cArr2;
    }
}
