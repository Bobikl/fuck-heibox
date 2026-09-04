package org.json.alipay;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Reader f137822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f137823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f137824d;

    public c(Reader reader) {
        this.f137822b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f137824d = false;
        this.f137821a = 0;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    private String a(int i10) throws JSONException {
        if (i10 == 0) {
            return "";
        }
        char[] cArr = new char[i10];
        int i11 = 0;
        if (this.f137824d) {
            this.f137824d = false;
            cArr[0] = this.f137823c;
            i11 = 1;
        }
        while (i11 < i10) {
            try {
                int i12 = this.f137822b.read(cArr, i11, i10 - i11);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
            } catch (IOException e10) {
                throw new JSONException(e10);
            }
        }
        this.f137821a += i11;
        if (i11 < i10) {
            throw a("Substring bounds error");
        }
        this.f137823c = cArr[i10 - 1];
        return new String(cArr);
    }

    public final JSONException a(String str) {
        return new JSONException(str + toString());
    }

    public final void a() {
        int i10;
        if (this.f137824d || (i10 = this.f137821a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f137821a = i10 - 1;
        this.f137824d = true;
    }

    public final char b() throws JSONException {
        if (this.f137824d) {
            this.f137824d = false;
            char c10 = this.f137823c;
            if (c10 != 0) {
                this.f137821a++;
            }
            return c10;
        }
        try {
            int i10 = this.f137822b.read();
            if (i10 <= 0) {
                this.f137823c = (char) 0;
                return (char) 0;
            }
            this.f137821a++;
            char c11 = (char) i10;
            this.f137823c = c11;
            return c11;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }

    public final char c() {
        char cB;
        char cB2;
        while (true) {
            char cB3 = b();
            if (cB3 == '/') {
                char cB4 = b();
                if (cB4 == '*') {
                    while (true) {
                        char cB5 = b();
                        if (cB5 == 0) {
                            throw a("Unclosed comment");
                        }
                        if (cB5 == '*') {
                            if (b() == '/') {
                                break;
                            }
                            a();
                        }
                    }
                } else {
                    if (cB4 != '/') {
                        a();
                        return IOUtils.DIR_SEPARATOR_UNIX;
                    }
                    do {
                        cB = b();
                        if (cB == '\n' || cB == '\r') {
                            break;
                        }
                    } while (cB != 0);
                }
            } else if (cB3 == '#') {
                do {
                    cB2 = b();
                    if (cB2 == '\n' || cB2 == '\r') {
                        break;
                    }
                } while (cB2 != 0);
            } else if (cB3 == 0 || cB3 > ' ') {
                return cB3;
            }
        }
    }

    public final Object d() {
        String strA;
        char c10 = c();
        if (c10 != '\"') {
            if (c10 != '[') {
                if (c10 == '{') {
                    a();
                    return new b(this);
                }
                if (c10 != '\'') {
                    if (c10 != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char cB = c10;
                        while (cB >= ' ' && ",:]}/\\\"[{;=#".indexOf(cB) < 0) {
                            stringBuffer.append(cB);
                            cB = b();
                        }
                        a();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw a("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase("null")) {
                            return b.f137819a;
                        }
                        if ((c10 < '0' || c10 > '9') && c10 != '.' && c10 != '-' && c10 != '+') {
                            return strTrim;
                        }
                        if (c10 == '0') {
                            try {
                                return (strTrim.length() <= 2 || !(strTrim.charAt(1) == 'x' || strTrim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(strTrim, 8)) : new Integer(Integer.parseInt(strTrim.substring(2), 16));
                            } catch (Exception unused) {
                            }
                        }
                        try {
                            try {
                                try {
                                    return new Integer(strTrim);
                                } catch (Exception unused2) {
                                    return new Double(strTrim);
                                }
                            } catch (Exception unused3) {
                                return new Long(strTrim);
                            }
                        } catch (Exception unused4) {
                            return strTrim;
                        }
                    }
                }
            }
            a();
            return new a(this);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        while (true) {
            char cB2 = b();
            if (cB2 == 0 || cB2 == '\n' || cB2 == '\r') {
                break;
            }
            if (cB2 == '\\') {
                cB2 = b();
                if (cB2 == 'b') {
                    stringBuffer2.append('\b');
                } else if (cB2 == 'f') {
                    cB2 = '\f';
                } else if (cB2 == 'n') {
                    stringBuffer2.append('\n');
                } else if (cB2 != 'r') {
                    if (cB2 == 'x') {
                        strA = a(2);
                    } else if (cB2 == 't') {
                        cB2 = '\t';
                    } else if (cB2 == 'u') {
                        strA = a(4);
                    }
                    cB2 = (char) Integer.parseInt(strA, 16);
                } else {
                    stringBuffer2.append('\r');
                }
            } else if (cB2 == c10) {
                return stringBuffer2.toString();
            }
            stringBuffer2.append(cB2);
        }
        throw a("Unterminated string");
    }

    public final String toString() {
        return " at character " + this.f137821a;
    }
}
