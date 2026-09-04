package org.json.alipay.zoloz;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes5.dex */
public class JSONTokener {
    private int index;
    private char lastChar;
    private Reader reader;
    private boolean useLastChar;

    public JSONTokener(Reader reader) {
        this.reader = reader.markSupported() ? reader : new BufferedReader(reader);
        this.useLastChar = false;
        this.index = 0;
    }

    public JSONTokener(String str) {
        this(new StringReader(str));
    }

    public static int dehexchar(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    public void back() throws JSONException {
        int i10;
        if (this.useLastChar || (i10 = this.index) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.index = i10 - 1;
        this.useLastChar = true;
    }

    public boolean more() throws JSONException {
        if (next() == 0) {
            return false;
        }
        back();
        return true;
    }

    public char next() throws JSONException {
        if (this.useLastChar) {
            this.useLastChar = false;
            char c10 = this.lastChar;
            if (c10 != 0) {
                this.index++;
            }
            return c10;
        }
        try {
            int i10 = this.reader.read();
            if (i10 <= 0) {
                this.lastChar = (char) 0;
                return (char) 0;
            }
            this.index++;
            char c11 = (char) i10;
            this.lastChar = c11;
            return c11;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }

    public char next(char c10) throws JSONException {
        char next = next();
        if (next == c10) {
            return next;
        }
        throw syntaxError("Expected '" + c10 + "' and instead saw '" + next + "'");
    }

    public String next(int i10) throws JSONException {
        if (i10 == 0) {
            return "";
        }
        char[] cArr = new char[i10];
        int i11 = 0;
        if (this.useLastChar) {
            this.useLastChar = false;
            cArr[0] = this.lastChar;
            i11 = 1;
        }
        while (i11 < i10) {
            try {
                int i12 = this.reader.read(cArr, i11, i10 - i11);
                if (i12 == -1) {
                    break;
                }
                i11 += i12;
            } catch (IOException e10) {
                throw new JSONException(e10);
            }
        }
        this.index += i11;
        if (i11 < i10) {
            throw syntaxError("Substring bounds error");
        }
        this.lastChar = cArr[i10 - 1];
        return new String(cArr);
    }

    public char nextClean() throws JSONException {
        char next;
        char next2;
        while (true) {
            char next3 = next();
            if (next3 == '/') {
                char next4 = next();
                if (next4 == '*') {
                    while (true) {
                        char next5 = next();
                        if (next5 == 0) {
                            throw syntaxError("Unclosed comment");
                        }
                        if (next5 == '*') {
                            if (next() == '/') {
                                break;
                            }
                            back();
                        }
                    }
                } else {
                    if (next4 != '/') {
                        back();
                        return IOUtils.DIR_SEPARATOR_UNIX;
                    }
                    do {
                        next = next();
                        if (next == '\n' || next == '\r') {
                            break;
                        }
                    } while (next != 0);
                }
            } else if (next3 == '#') {
                do {
                    next2 = next();
                    if (next2 == '\n' || next2 == '\r') {
                        break;
                    }
                } while (next2 != 0);
            } else if (next3 == 0 || next3 > ' ') {
                return next3;
            }
        }
    }

    public String nextString(char c10) throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            char next = next();
            if (next == 0 || next == '\n' || next == '\r') {
                break;
            }
            if (next == '\\') {
                char next2 = next();
                if (next2 == 'b') {
                    stringBuffer.append('\b');
                } else if (next2 == 'f') {
                    stringBuffer.append('\f');
                } else if (next2 == 'n') {
                    stringBuffer.append('\n');
                } else if (next2 == 'r') {
                    stringBuffer.append('\r');
                } else if (next2 == 'x') {
                    stringBuffer.append((char) Integer.parseInt(next(2), 16));
                } else if (next2 == 't') {
                    stringBuffer.append('\t');
                } else if (next2 != 'u') {
                    stringBuffer.append(next2);
                } else {
                    stringBuffer.append((char) Integer.parseInt(next(4), 16));
                }
            } else {
                if (next == c10) {
                    return stringBuffer.toString();
                }
                stringBuffer.append(next);
            }
        }
        throw syntaxError("Unterminated string");
    }

    public String nextTo(char c10) throws JSONException {
        char next;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            next = next();
            if (next == c10 || next == 0 || next == '\n' || next == '\r') {
                break;
            }
            stringBuffer.append(next);
        }
        if (next != 0) {
            back();
        }
        return stringBuffer.toString().trim();
    }

    public String nextTo(String str) throws JSONException {
        char next;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            next = next();
            if (str.indexOf(next) >= 0 || next == 0 || next == '\n' || next == '\r') {
                break;
            }
            stringBuffer.append(next);
        }
        if (next != 0) {
            back();
        }
        return stringBuffer.toString().trim();
    }

    public Object nextValue() throws JSONException {
        char cNextClean = nextClean();
        if (cNextClean != '\"') {
            if (cNextClean != '[') {
                if (cNextClean == '{') {
                    back();
                    return new JSONObject(this);
                }
                if (cNextClean != '\'') {
                    if (cNextClean != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char next = cNextClean;
                        while (next >= ' ' && ",:]}/\\\"[{;=#".indexOf(next) < 0) {
                            stringBuffer.append(next);
                            next = next();
                        }
                        back();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw syntaxError("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase("null")) {
                            return JSONObject.NULL;
                        }
                        if ((cNextClean < '0' || cNextClean > '9') && cNextClean != '.' && cNextClean != '-' && cNextClean != '+') {
                            return strTrim;
                        }
                        if (cNextClean == '0') {
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
            back();
            return new JSONArray(this);
        }
        return nextString(cNextClean);
    }

    public char skipTo(char c10) throws JSONException {
        char next;
        try {
            int i10 = this.index;
            this.reader.mark(Integer.MAX_VALUE);
            do {
                next = next();
                if (next == 0) {
                    this.reader.reset();
                    this.index = i10;
                    return next;
                }
            } while (next != c10);
            back();
            return next;
        } catch (IOException e10) {
            throw new JSONException(e10);
        }
    }

    public JSONException syntaxError(String str) {
        return new JSONException(str + toString());
    }

    public String toString() {
        return " at character " + this.index;
    }
}
