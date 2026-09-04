package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: Metaphone.java */
/* JADX INFO: loaded from: classes5.dex */
public class g implements mj.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f132996b = "AEIOU";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f132997c = "EIY";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f132998d = "CSPTG";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f132999a = 4;

    private boolean c(int i10, int i11) {
        return i11 + 1 == i10;
    }

    private boolean e(StringBuffer stringBuffer, int i10, char c10) {
        return i10 >= 0 && i10 < stringBuffer.length() - 1 && stringBuffer.charAt(i10 + 1) == c10;
    }

    private boolean f(StringBuffer stringBuffer, int i10, char c10) {
        return i10 > 0 && i10 < stringBuffer.length() && stringBuffer.charAt(i10 - 1) == c10;
    }

    private boolean g(StringBuffer stringBuffer, int i10) {
        return f132996b.indexOf(stringBuffer.charAt(i10)) >= 0;
    }

    private boolean i(StringBuffer stringBuffer, int i10, String str) {
        if (i10 < 0 || (str.length() + i10) - 1 >= stringBuffer.length()) {
            return false;
        }
        return stringBuffer.substring(i10, str.length() + i10).equals(str);
    }

    @Override // mj.g
    public String a(String str) {
        return h(str);
    }

    public int b() {
        return this.f132999a;
    }

    public boolean d(String str, String str2) {
        return h(str).equals(h(str2));
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return h((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    /* JADX WARN: Code duplicated, block: B:131:0x020f  */
    public String h(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return str.toUpperCase(Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(Locale.ENGLISH).toCharArray();
        StringBuffer stringBuffer = new StringBuffer(40);
        StringBuffer stringBuffer2 = new StringBuffer(10);
        int i10 = 0;
        char c10 = charArray[0];
        if (c10 != 'A') {
            if (c10 == 'G' || c10 == 'K' || c10 == 'P') {
                if (charArray[1] == 'N') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c10 == 'W') {
                char c11 = charArray[1];
                if (c11 == 'R') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else if (c11 == 'H') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                    stringBuffer.setCharAt(0, 'W');
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c10 != 'X') {
                stringBuffer.append(charArray);
            } else {
                charArray[0] = 'S';
                stringBuffer.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            stringBuffer.append(charArray, 1, charArray.length - 1);
        } else {
            stringBuffer.append(charArray);
        }
        int length = stringBuffer.length();
        while (stringBuffer2.length() < b() && i10 < length) {
            char cCharAt = stringBuffer.charAt(i10);
            if (cCharAt == 'C' || !f(stringBuffer, i10, cCharAt)) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        if (i10 == 0) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'B':
                        if (!f(stringBuffer, i10, 'M') || !c(length, i10)) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'C':
                        if (!f(stringBuffer, i10, 'S') || c(length, i10) || f132997c.indexOf(stringBuffer.charAt(i10 + 1)) < 0) {
                            if (i(stringBuffer, i10, "CIA")) {
                                stringBuffer2.append('X');
                            } else if (!c(length, i10) && f132997c.indexOf(stringBuffer.charAt(i10 + 1)) >= 0) {
                                stringBuffer2.append('S');
                            } else if ((f(stringBuffer, i10, 'S') && e(stringBuffer, i10, 'H')) || !e(stringBuffer, i10, 'H')) {
                                stringBuffer2.append('K');
                            } else if (i10 == 0 && length >= 3 && g(stringBuffer, 2)) {
                                stringBuffer2.append('K');
                            } else {
                                stringBuffer2.append('X');
                            }
                        }
                        break;
                    case 'D':
                        if (!c(length, i10 + 1) && e(stringBuffer, i10, 'G')) {
                            int i11 = i10 + 2;
                            if (f132997c.indexOf(stringBuffer.charAt(i11)) < 0) {
                                stringBuffer2.append('T');
                            } else {
                                stringBuffer2.append('J');
                                i10 = i11;
                            }
                        } else {
                            stringBuffer2.append('T');
                        }
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'R':
                        stringBuffer2.append(cCharAt);
                        break;
                    case 'G':
                        int i12 = i10 + 1;
                        if ((!c(length, i12) || !e(stringBuffer, i10, 'H')) && ((c(length, i12) || !e(stringBuffer, i10, 'H') || g(stringBuffer, i10 + 2)) && (i10 <= 0 || (!i(stringBuffer, i10, "GN") && !i(stringBuffer, i10, "GNED"))))) {
                            boolean zF = f(stringBuffer, i10, 'G');
                            if (c(length, i10) || f132997c.indexOf(stringBuffer.charAt(i12)) < 0 || zF) {
                                stringBuffer2.append('K');
                            } else {
                                stringBuffer2.append('J');
                            }
                        }
                        break;
                    case 'H':
                        if (!c(length, i10) && ((i10 <= 0 || f132998d.indexOf(stringBuffer.charAt(i10 - 1)) < 0) && g(stringBuffer, i10 + 1))) {
                            stringBuffer2.append('H');
                        }
                        break;
                    case 'K':
                        if (i10 <= 0 || !f(stringBuffer, i10, 'C')) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'P':
                        if (!e(stringBuffer, i10, 'H')) {
                            stringBuffer2.append(cCharAt);
                        } else {
                            stringBuffer2.append('F');
                        }
                        break;
                    case 'Q':
                        stringBuffer2.append('K');
                        break;
                    case 'S':
                        if (i(stringBuffer, i10, "SH") || i(stringBuffer, i10, "SIO") || i(stringBuffer, i10, "SIA")) {
                            stringBuffer2.append('X');
                        } else {
                            stringBuffer2.append('S');
                        }
                        break;
                    case 'T':
                        if (i(stringBuffer, i10, "TIA") || i(stringBuffer, i10, "TIO")) {
                            stringBuffer2.append('X');
                        } else if (!i(stringBuffer, i10, "TCH")) {
                            if (!i(stringBuffer, i10, "TH")) {
                                stringBuffer2.append('T');
                            } else {
                                stringBuffer2.append('0');
                            }
                        }
                        break;
                    case 'V':
                        stringBuffer2.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!c(length, i10) && g(stringBuffer, i10 + 1)) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'X':
                        stringBuffer2.append('K');
                        stringBuffer2.append('S');
                        break;
                    case 'Z':
                        stringBuffer2.append('S');
                        break;
                }
                i10++;
            } else {
                i10++;
            }
            if (stringBuffer2.length() > b()) {
                stringBuffer2.setLength(b());
            }
        }
        return stringBuffer2.toString();
    }

    public void j(int i10) {
        this.f132999a = i10;
    }
}
