package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.google.android.exoplayer2.j;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.text.y;

/* JADX INFO: loaded from: classes6.dex */
public abstract class JSONLexerBase implements JSONLexer, Closeable {
    protected static final int INT_MULTMIN_RADIX_TEN = -214748364;
    protected static final long MULTMIN_RADIX_TEN = -922337203685477580L;
    protected int bp;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    protected char f37888ch;
    protected int eofPos;
    protected int features;
    protected boolean hasSpecial;
    protected int np;
    protected int pos;
    protected char[] sbuf;
    protected int sp;
    protected String stringDefaultValue;
    protected int token;
    private static final ThreadLocal<char[]> SBUF_LOCAL = new ThreadLocal<>();
    protected static final char[] typeFieldName = ("\"" + JSON.DEFAULT_TYPE_KEY + "\":\"").toCharArray();
    protected static final int[] digits = new int[103];
    protected Calendar calendar = null;
    protected TimeZone timeZone = JSON.defaultTimeZone;
    protected Locale locale = JSON.defaultLocale;
    public int matchStat = 0;

    static {
        for (int i10 = 48; i10 <= 57; i10++) {
            digits[i10] = i10 - 48;
        }
        for (int i11 = 97; i11 <= 102; i11++) {
            digits[i11] = (i11 - 97) + 10;
        }
        for (int i12 = 65; i12 <= 70; i12++) {
            digits[i12] = (i12 - 65) + 10;
        }
    }

    public JSONLexerBase(int i10) {
        this.stringDefaultValue = null;
        this.features = i10;
        if ((i10 & Feature.InitStringFieldAsEmpty.mask) != 0) {
            this.stringDefaultValue = "";
        }
        char[] cArr = SBUF_LOCAL.get();
        this.sbuf = cArr;
        if (cArr == null) {
            this.sbuf = new char[512];
        }
    }

    public static boolean isWhitespace(char c10) {
        return c10 <= ' ' && (c10 == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == '\f' || c10 == '\b');
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    public static String readString(char[] cArr, int i10) {
        int i11;
        char[] cArr2 = new char[i10];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            char c10 = cArr[i12];
            if (c10 != '\\') {
                cArr2[i13] = c10;
                i13++;
            } else {
                i12++;
                char c11 = cArr[i12];
                if (c11 == '\"') {
                    i11 = i13 + 1;
                    cArr2[i13] = y.f128593b;
                } else if (c11 == '\'') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\'';
                } else if (c11 == 'F') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\f';
                } else if (c11 == '\\') {
                    i11 = i13 + 1;
                    cArr2[i13] = IOUtils.DIR_SEPARATOR_WINDOWS;
                } else if (c11 == 'b') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\b';
                } else if (c11 == 'f') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\f';
                } else if (c11 == 'n') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\n';
                } else if (c11 == 'r') {
                    i11 = i13 + 1;
                    cArr2[i13] = '\r';
                } else if (c11 != 'x') {
                    switch (c11) {
                        case '/':
                            i11 = i13 + 1;
                            cArr2[i13] = IOUtils.DIR_SEPARATOR_UNIX;
                            break;
                        case '0':
                            i11 = i13 + 1;
                            cArr2[i13] = 0;
                            break;
                        case '1':
                            i11 = i13 + 1;
                            cArr2[i13] = 1;
                            break;
                        case '2':
                            i11 = i13 + 1;
                            cArr2[i13] = 2;
                            break;
                        case '3':
                            i11 = i13 + 1;
                            cArr2[i13] = 3;
                            break;
                        case '4':
                            i11 = i13 + 1;
                            cArr2[i13] = 4;
                            break;
                        case '5':
                            i11 = i13 + 1;
                            cArr2[i13] = 5;
                            break;
                        case '6':
                            i11 = i13 + 1;
                            cArr2[i13] = 6;
                            break;
                        case '7':
                            i11 = i13 + 1;
                            cArr2[i13] = 7;
                            break;
                        default:
                            switch (c11) {
                                case 't':
                                    i11 = i13 + 1;
                                    cArr2[i13] = '\t';
                                    break;
                                case 'u':
                                    i11 = i13 + 1;
                                    int i14 = i12 + 1;
                                    int i15 = i14 + 1;
                                    int i16 = i15 + 1;
                                    i12 = i16 + 1;
                                    cArr2[i13] = (char) Integer.parseInt(new String(new char[]{cArr[i14], cArr[i15], cArr[i16], cArr[i12]}), 16);
                                    break;
                                case 'v':
                                    i11 = i13 + 1;
                                    cArr2[i13] = 11;
                                    break;
                                default:
                                    throw new JSONException("unclosed.str.lit");
                            }
                            break;
                    }
                } else {
                    i11 = i13 + 1;
                    int[] iArr = digits;
                    int i17 = i12 + 1;
                    int i18 = iArr[cArr[i17]] * 16;
                    i12 = i17 + 1;
                    cArr2[i13] = (char) (i18 + iArr[cArr[i12]]);
                }
                i13 = i11;
            }
            i12++;
        }
        return new String(cArr2, 0, i13);
    }

    private void scanStringSingleQuote() {
        this.np = this.bp;
        this.hasSpecial = false;
        while (true) {
            char next = next();
            if (next == '\'') {
                this.token = 4;
                next();
                return;
            }
            if (next == 26) {
                if (isEOF()) {
                    throw new JSONException("unclosed single-quote string");
                }
                putChar(JSONLexer.EOI);
            } else if (next == '\\') {
                if (!this.hasSpecial) {
                    this.hasSpecial = true;
                    int i10 = this.sp;
                    char[] cArr = this.sbuf;
                    if (i10 > cArr.length) {
                        char[] cArr2 = new char[i10 * 2];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.sbuf = cArr2;
                    }
                    copyTo(this.np + 1, this.sp, this.sbuf);
                }
                char next2 = next();
                if (next2 == '\"') {
                    putChar(y.f128593b);
                } else if (next2 != '\'') {
                    if (next2 != 'F') {
                        if (next2 == '\\') {
                            putChar(IOUtils.DIR_SEPARATOR_WINDOWS);
                        } else if (next2 == 'b') {
                            putChar('\b');
                        } else if (next2 != 'f') {
                            if (next2 == 'n') {
                                putChar('\n');
                            } else if (next2 == 'r') {
                                putChar('\r');
                            } else if (next2 != 'x') {
                                switch (next2) {
                                    case '/':
                                        putChar(IOUtils.DIR_SEPARATOR_UNIX);
                                        break;
                                    case '0':
                                        putChar((char) 0);
                                        break;
                                    case '1':
                                        putChar((char) 1);
                                        break;
                                    case '2':
                                        putChar((char) 2);
                                        break;
                                    case '3':
                                        putChar((char) 3);
                                        break;
                                    case '4':
                                        putChar((char) 4);
                                        break;
                                    case '5':
                                        putChar((char) 5);
                                        break;
                                    case '6':
                                        putChar((char) 6);
                                        break;
                                    case '7':
                                        putChar((char) 7);
                                        break;
                                    default:
                                        switch (next2) {
                                            case 't':
                                                putChar('\t');
                                                break;
                                            case 'u':
                                                putChar((char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16));
                                                break;
                                            case 'v':
                                                putChar((char) 11);
                                                break;
                                            default:
                                                this.f37888ch = next2;
                                                throw new JSONException("unclosed single-quote string");
                                        }
                                        break;
                                }
                            } else {
                                int[] iArr = digits;
                                putChar((char) ((iArr[next()] * 16) + iArr[next()]));
                            }
                        }
                    }
                    putChar('\f');
                } else {
                    putChar('\'');
                }
            } else if (this.hasSpecial) {
                int i11 = this.sp;
                char[] cArr3 = this.sbuf;
                if (i11 == cArr3.length) {
                    putChar(next);
                } else {
                    this.sp = i11 + 1;
                    cArr3[i11] = next;
                }
            } else {
                this.sp++;
            }
        }
    }

    public abstract String addSymbol(int i10, int i11, int i12, SymbolTable symbolTable);

    protected abstract void arrayCopy(int i10, char[] cArr, int i11, int i12);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract byte[] bytesValue();

    protected abstract boolean charArrayCompare(char[] cArr);

    public abstract char charAt(int i10);

    @Override // com.alibaba.fastjson.parser.JSONLexer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        char[] cArr = this.sbuf;
        if (cArr.length <= 8192) {
            SBUF_LOCAL.set(cArr);
        }
        this.sbuf = null;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void config(Feature feature, boolean z10) {
        int iConfig = Feature.config(this.features, feature, z10);
        this.features = iConfig;
        if ((iConfig & Feature.InitStringFieldAsEmpty.mask) != 0) {
            this.stringDefaultValue = "";
        }
    }

    protected abstract void copyTo(int i10, int i11, char[] cArr);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final Number decimalValue(boolean z10) {
        char cCharAt = charAt((this.np + this.sp) - 1);
        try {
            if (cCharAt == 'F') {
                return Float.valueOf(Float.parseFloat(numberString()));
            }
            if (cCharAt == 'D') {
                return Double.valueOf(Double.parseDouble(numberString()));
            }
            return z10 ? decimalValue() : Double.valueOf(doubleValue());
        } catch (NumberFormatException e10) {
            throw new JSONException(e10.getMessage() + ", " + info());
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract BigDecimal decimalValue();

    public double doubleValue() {
        return Double.parseDouble(numberString());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public float floatValue() {
        char cCharAt;
        String strNumberString = numberString();
        float f10 = Float.parseFloat(strNumberString);
        if ((f10 != 0.0f && f10 != Float.POSITIVE_INFINITY) || (cCharAt = strNumberString.charAt(0)) <= '0' || cCharAt > '9') {
            return f10;
        }
        throw new JSONException("float overflow : " + strNumberString);
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final char getCurrent() {
        return this.f37888ch;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int getFeatures() {
        return this.features;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public Locale getLocale() {
        return this.locale;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public abstract int indexOf(char c10, int i10);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String info() {
        return "";
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int intValue() {
        int i10;
        boolean z10;
        int i11 = 0;
        if (this.np == -1) {
            this.np = 0;
        }
        int i12 = this.np;
        int i13 = this.sp + i12;
        if (charAt(i12) == '-') {
            i10 = Integer.MIN_VALUE;
            i12++;
            z10 = true;
        } else {
            i10 = -2147483647;
            z10 = false;
        }
        if (i12 < i13) {
            i11 = -(charAt(i12) - '0');
            i12++;
        }
        while (i12 < i13) {
            int i14 = i12 + 1;
            char cCharAt = charAt(i12);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i12 = i14;
                break;
            }
            int i15 = cCharAt - '0';
            if (i11 < -214748364) {
                throw new NumberFormatException(numberString());
            }
            int i16 = i11 * 10;
            if (i16 < i10 + i15) {
                throw new NumberFormatException(numberString());
            }
            i11 = i16 - i15;
            i12 = i14;
        }
        if (!z10) {
            return -i11;
        }
        if (i12 > this.np + 1) {
            return i11;
        }
        throw new NumberFormatException(numberString());
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final Number integerValue() throws NumberFormatException {
        long j10;
        long j11;
        boolean z10 = false;
        if (this.np == -1) {
            this.np = 0;
        }
        int i10 = this.np;
        int i11 = this.sp + i10;
        char c10 = ' ';
        char cCharAt = charAt(i11 - 1);
        if (cCharAt == 'B') {
            i11--;
            c10 = 'B';
        } else if (cCharAt == 'L') {
            i11--;
            c10 = 'L';
        } else if (cCharAt == 'S') {
            i11--;
            c10 = 'S';
        }
        if (charAt(this.np) == '-') {
            j10 = Long.MIN_VALUE;
            i10++;
            z10 = true;
        } else {
            j10 = j.f46377b;
        }
        long j12 = -922337203685477580L;
        if (i10 < i11) {
            j11 = -(charAt(i10) - '0');
            i10++;
        } else {
            j11 = 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            int iCharAt = charAt(i10) - '0';
            if (j11 < j12) {
                return new BigInteger(numberString());
            }
            long j13 = j11 * 10;
            long j14 = iCharAt;
            if (j13 < j10 + j14) {
                return new BigInteger(numberString());
            }
            j11 = j13 - j14;
            i10 = i12;
            j12 = -922337203685477580L;
        }
        if (!z10) {
            long j15 = -j11;
            if (j15 > 2147483647L || c10 == 'L') {
                return Long.valueOf(j15);
            }
            if (c10 == 'S') {
                return Short.valueOf((short) j15);
            }
            return c10 == 'B' ? Byte.valueOf((byte) j15) : Integer.valueOf((int) j15);
        }
        if (i10 <= this.np + 1) {
            throw new NumberFormatException(numberString());
        }
        if (j11 < -2147483648L || c10 == 'L') {
            return Long.valueOf(j11);
        }
        if (c10 == 'S') {
            return Short.valueOf((short) j11);
        }
        return c10 == 'B' ? Byte.valueOf((byte) j11) : Integer.valueOf((int) j11);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean isBlankInput() {
        int i10 = 0;
        while (true) {
            char cCharAt = charAt(i10);
            if (cCharAt == 26) {
                this.token = 20;
                return true;
            }
            if (!isWhitespace(cCharAt)) {
                return false;
            }
            i10++;
        }
    }

    public abstract boolean isEOF();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(int i10) {
        return (i10 & this.features) != 0;
    }

    public final boolean isEnabled(int i10, int i11) {
        return ((this.features & i11) == 0 && (i10 & i11) == 0) ? false : true;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isEnabled(Feature feature) {
        return isEnabled(feature.mask);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final boolean isRef() {
        return this.sp == 4 && charAt(this.np + 1) == '$' && charAt(this.np + 2) == 'r' && charAt(this.np + 3) == 'e' && charAt(this.np + 4) == 'f';
    }

    protected void lexError(String str, Object... objArr) {
        this.token = 1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005b -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final long longValue() throws NumberFormatException {
        long j10;
        long j11;
        int i10;
        char cCharAt;
        boolean z10 = false;
        if (this.np == -1) {
            this.np = 0;
        }
        int i11 = this.np;
        int i12 = this.sp + i11;
        if (charAt(i11) == '-') {
            j10 = Long.MIN_VALUE;
            i11++;
            z10 = true;
        } else {
            j10 = j.f46377b;
        }
        if (i11 >= i12) {
            j11 = 0;
            if (i11 < i12) {
                i10 = i11 + 1;
                cCharAt = charAt(i11);
                if (cCharAt != 'L' || cCharAt == 'S' || cCharAt == 'B') {
                    i11 = i10;
                } else {
                    int i13 = cCharAt - '0';
                    if (j11 < -922337203685477580L) {
                        throw new NumberFormatException(numberString());
                    }
                    long j12 = j11 * 10;
                    long j13 = i13;
                    if (j12 < j10 + j13) {
                        throw new NumberFormatException(numberString());
                    }
                    j11 = j12 - j13;
                }
            }
            if (z10) {
                return -j11;
            }
            if (i11 > this.np + 1) {
                return j11;
            }
            throw new NumberFormatException(numberString());
        }
        i10 = i11 + 1;
        j11 = -(charAt(i11) - '0');
        i11 = i10;
        if (i11 < i12) {
            i10 = i11 + 1;
            cCharAt = charAt(i11);
            if (cCharAt != 'L') {
            }
            i11 = i10;
        }
        if (z10) {
            return -j11;
        }
        if (i11 > this.np + 1) {
            return j11;
        }
        throw new NumberFormatException(numberString());
    }

    public final boolean matchField(char[] cArr) {
        while (!charArrayCompare(cArr)) {
            if (!isWhitespace(this.f37888ch)) {
                return false;
            }
            next();
        }
        int length = this.bp + cArr.length;
        this.bp = length;
        char cCharAt = charAt(length);
        this.f37888ch = cCharAt;
        if (cCharAt == '{') {
            next();
            this.token = 12;
        } else if (cCharAt == '[') {
            next();
            this.token = 14;
        } else if (cCharAt == 'S' && charAt(this.bp + 1) == 'e' && charAt(this.bp + 2) == 't' && charAt(this.bp + 3) == '[') {
            int i10 = this.bp + 3;
            this.bp = i10;
            this.f37888ch = charAt(i10);
            this.token = 21;
        } else {
            nextToken();
        }
        return true;
    }

    public boolean matchField2(char[] cArr) {
        throw new UnsupportedOperationException();
    }

    public final int matchStat() {
        return this.matchStat;
    }

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

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract char next();

    public final void nextIdent() {
        while (isWhitespace(this.f37888ch)) {
            next();
        }
        char c10 = this.f37888ch;
        if (c10 == '_' || c10 == '$' || Character.isLetter(c10)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken() {
        this.sp = 0;
        while (true) {
            this.pos = this.bp;
            char c10 = this.f37888ch;
            if (c10 == '/') {
                skipComment();
            } else {
                if (c10 == '\"') {
                    scanString();
                    return;
                }
                if (c10 == ',') {
                    next();
                    this.token = 16;
                    return;
                }
                if (c10 >= '0' && c10 <= '9') {
                    scanNumber();
                    return;
                }
                if (c10 == '-') {
                    scanNumber();
                    return;
                }
                switch (c10) {
                    case '\b':
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                        next();
                        break;
                    case '\'':
                        if (!isEnabled(Feature.AllowSingleQuotes)) {
                            throw new JSONException("Feature.AllowSingleQuotes is false");
                        }
                        scanStringSingleQuote();
                        return;
                    case '(':
                        next();
                        this.token = 10;
                        return;
                    case ')':
                        next();
                        this.token = 11;
                        return;
                    case '+':
                        next();
                        scanNumber();
                        return;
                    case '.':
                        next();
                        this.token = 25;
                        return;
                    case ':':
                        next();
                        this.token = 17;
                        return;
                    case ';':
                        next();
                        this.token = 24;
                        return;
                    case 'N':
                    case 'S':
                    case 'T':
                    case 'u':
                        scanIdent();
                        return;
                    case '[':
                        next();
                        this.token = 14;
                        return;
                    case ']':
                        next();
                        this.token = 15;
                        return;
                    case 'f':
                        scanFalse();
                        return;
                    case 'n':
                        scanNullOrNew();
                        return;
                    case 't':
                        scanTrue();
                        return;
                    case 'x':
                        scanHex();
                        return;
                    case '{':
                        next();
                        this.token = 12;
                        return;
                    case '}':
                        next();
                        this.token = 13;
                        return;
                    default:
                        if (isEOF()) {
                            if (this.token == 20) {
                                throw new JSONException("EOF error");
                            }
                            this.token = 20;
                            int i10 = this.eofPos;
                            this.bp = i10;
                            this.pos = i10;
                            return;
                        }
                        char c11 = this.f37888ch;
                        if (c11 > 31 && c11 != 127) {
                            lexError("illegal.char", String.valueOf((int) c11));
                            next();
                            return;
                        }
                        next();
                        break;
                        break;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0073 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextToken(int i10) {
        this.sp = 0;
        while (true) {
            if (i10 == 2) {
                char c10 = this.f37888ch;
                if (c10 >= '0' && c10 <= '9') {
                    this.pos = this.bp;
                    scanNumber();
                    return;
                }
                if (c10 == '\"') {
                    this.pos = this.bp;
                    scanString();
                    return;
                } else if (c10 == '[') {
                    this.token = 14;
                    next();
                    return;
                } else if (c10 == '{') {
                    this.token = 12;
                    next();
                    return;
                }
            } else if (i10 == 4) {
                char c11 = this.f37888ch;
                if (c11 == '\"') {
                    this.pos = this.bp;
                    scanString();
                    return;
                }
                if (c11 >= '0' && c11 <= '9') {
                    this.pos = this.bp;
                    scanNumber();
                    return;
                } else if (c11 == '[') {
                    this.token = 14;
                    next();
                    return;
                } else if (c11 == '{') {
                    this.token = 12;
                    next();
                    return;
                }
            } else if (i10 == 12) {
                char c12 = this.f37888ch;
                if (c12 == '{') {
                    this.token = 12;
                    next();
                    return;
                } else if (c12 == '[') {
                    this.token = 14;
                    next();
                    return;
                }
            } else {
                if (i10 == 18) {
                    nextIdent();
                    return;
                }
                if (i10 != 20) {
                    switch (i10) {
                        case 14:
                            char c13 = this.f37888ch;
                            if (c13 == '[') {
                                this.token = 14;
                                next();
                            } else if (c13 == '{') {
                                this.token = 12;
                                next();
                            }
                            break;
                        case 15:
                            if (this.f37888ch == ']') {
                                this.token = 15;
                                next();
                            }
                            if (this.f37888ch == 26) {
                                this.token = 20;
                            }
                            break;
                        case 16:
                            char c14 = this.f37888ch;
                            if (c14 == ',') {
                                this.token = 16;
                                next();
                            } else if (c14 == '}') {
                                this.token = 13;
                                next();
                            } else if (c14 == ']') {
                                this.token = 15;
                                next();
                            } else if (c14 == 26) {
                                this.token = 20;
                            }
                            break;
                    }
                    return;
                }
                if (this.f37888ch == 26) {
                    this.token = 20;
                    return;
                }
            }
            char c15 = this.f37888ch;
            if (c15 != ' ' && c15 != '\n' && c15 != '\r' && c15 != '\t' && c15 != '\f' && c15 != '\b') {
                nextToken();
                return;
            }
            next();
        }
    }

    public final void nextTokenWithChar(char c10) {
        this.sp = 0;
        while (true) {
            char c11 = this.f37888ch;
            if (c11 == c10) {
                next();
                nextToken();
                return;
            }
            if (c11 != ' ' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != '\f' && c11 != '\b') {
                throw new JSONException("not match " + c10 + " - " + this.f37888ch + ", info : " + info());
            }
            next();
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon() {
        nextTokenWithChar(':');
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void nextTokenWithColon(int i10) {
        nextTokenWithChar(':');
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract String numberString();

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int pos() {
        return this.pos;
    }

    protected final void putChar(char c10) {
        int i10 = this.sp;
        char[] cArr = this.sbuf;
        if (i10 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.sbuf = cArr2;
        }
        char[] cArr3 = this.sbuf;
        int i11 = this.sp;
        this.sp = i11 + 1;
        cArr3[i11] = c10;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void resetStringPosition() {
        this.sp = 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc A[SYNTHETIC] */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public boolean scanBoolean(char c10) {
        boolean z10 = false;
        this.matchStat = 0;
        char cCharAt = charAt(this.bp + 0);
        int i10 = 5;
        if (cCharAt != 't') {
            if (cCharAt == 'f') {
                if (charAt(this.bp + 1) != 'a' || charAt(this.bp + 1 + 1) != 'l' || charAt(this.bp + 1 + 2) != 's' || charAt(this.bp + 1 + 3) != 'e') {
                    this.matchStat = -1;
                    return false;
                }
                cCharAt = charAt(this.bp + 5);
                i10 = 6;
            } else if (cCharAt == '1') {
                cCharAt = charAt(this.bp + 1);
                i10 = 2;
            } else if (cCharAt == '0') {
                cCharAt = charAt(this.bp + 1);
                i10 = 2;
            } else {
                i10 = 1;
            }
            while (cCharAt != c10) {
                if (isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return z10;
                }
                int i11 = i10 + 1;
                cCharAt = charAt(this.bp + i10);
                i10 = i11;
            }
            int i12 = this.bp + i10;
            this.bp = i12;
            this.f37888ch = charAt(i12);
            this.matchStat = 3;
            return z10;
        }
        if (charAt(this.bp + 1) != 'r' || charAt(this.bp + 1 + 1) != 'u' || charAt(this.bp + 1 + 2) != 'e') {
            this.matchStat = -1;
            return false;
        }
        cCharAt = charAt(this.bp + 4);
        z10 = true;
        while (cCharAt != c10) {
            if (isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return z10;
            }
            int i13 = i10 + 1;
            cCharAt = charAt(this.bp + i10);
            i10 = i13;
        }
        int i14 = this.bp + i10;
        this.bp = i14;
        this.f37888ch = charAt(i14);
        this.matchStat = 3;
        return z10;
    }

    public Date scanDate(char c10) {
        long j10;
        int i10;
        Date date;
        boolean z10 = false;
        this.matchStat = 0;
        char cCharAt = charAt(this.bp + 0);
        int i11 = 5;
        if (cCharAt == '\"') {
            int iIndexOf = indexOf(y.f128593b, this.bp + 1);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            int i12 = this.bp + 1;
            String strSubString = subString(i12, iIndexOf - i12);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i13 = 0;
                    for (int i14 = iIndexOf - 1; i14 >= 0 && charAt(i14) == '\\'; i14--) {
                        i13++;
                    }
                    if (i13 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
                }
                int i15 = this.bp;
                int i16 = iIndexOf - (i15 + 1);
                strSubString = readString(sub_chars(i15 + 1, i16), i16);
            }
            int i17 = this.bp;
            int i18 = (iIndexOf - (i17 + 1)) + 1 + 1;
            int i19 = i18 + 1;
            cCharAt = charAt(i17 + i18);
            JSONScanner jSONScanner = new JSONScanner(strSubString);
            try {
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    this.matchStat = -1;
                    jSONScanner.close();
                    return null;
                }
                date = jSONScanner.getCalendar().getTime();
                jSONScanner.close();
                i11 = i19;
            } catch (Throwable th2) {
                jSONScanner.close();
                throw th2;
            }
        } else {
            char c11 = '9';
            int i20 = 2;
            if (cCharAt == '-' || (cCharAt >= '0' && cCharAt <= '9')) {
                if (cCharAt == '-') {
                    cCharAt = charAt(this.bp + 1);
                    z10 = true;
                } else {
                    i20 = 1;
                }
                if (cCharAt < '0' || cCharAt > '9') {
                    j10 = 0;
                    i10 = i20;
                } else {
                    j10 = cCharAt - '0';
                    while (true) {
                        i10 = i20 + 1;
                        cCharAt = charAt(this.bp + i20);
                        if (cCharAt < '0' || cCharAt > c11) {
                            break;
                        }
                        j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                        i20 = i10;
                        c11 = '9';
                    }
                }
                if (j10 < 0) {
                    this.matchStat = -1;
                    return null;
                }
                if (z10) {
                    j10 = -j10;
                }
                date = new Date(j10);
                i11 = i10;
            } else {
                if (cCharAt != 'n' || charAt(this.bp + 1) != 'u' || charAt(this.bp + 1 + 1) != 'l' || charAt(this.bp + 1 + 2) != 'l') {
                    this.matchStat = -1;
                    return null;
                }
                this.matchStat = 5;
                cCharAt = charAt(this.bp + 4);
                date = null;
            }
        }
        if (cCharAt == ',') {
            int i21 = this.bp + i11;
            this.bp = i21;
            this.f37888ch = charAt(i21);
            this.matchStat = 3;
            this.token = 16;
            return date;
        }
        if (cCharAt != ']') {
            this.matchStat = -1;
            return null;
        }
        int i22 = i11 + 1;
        char cCharAt2 = charAt(this.bp + i11);
        if (cCharAt2 == ',') {
            this.token = 16;
            int i23 = this.bp + i22;
            this.bp = i23;
            this.f37888ch = charAt(i23);
        } else if (cCharAt2 == ']') {
            this.token = 15;
            int i24 = this.bp + i22;
            this.bp = i24;
            this.f37888ch = charAt(i24);
        } else if (cCharAt2 == '}') {
            this.token = 13;
            int i25 = this.bp + i22;
            this.bp = i25;
            this.f37888ch = charAt(i25);
        } else {
            if (cCharAt2 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.bp += i22 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return date;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00b1 -> B:50:0x009f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public java.math.BigDecimal scanDecimal(char r19) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanDecimal(char):java.math.BigDecimal");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00c9 -> B:53:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public double scanDouble(char r21) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanDouble(char):double");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public Enum<?> scanEnum(Class<?> cls, SymbolTable symbolTable, char c10) {
        String strScanSymbolWithSeperator = scanSymbolWithSeperator(symbolTable, c10);
        if (strScanSymbolWithSeperator == null) {
            return null;
        }
        return Enum.valueOf(cls, strScanSymbolWithSeperator);
    }

    public final void scanFalse() {
        if (this.f37888ch != 'f') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f37888ch != 'a') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f37888ch != 'l') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f37888ch != 's') {
            throw new JSONException("error parse false");
        }
        next();
        if (this.f37888ch != 'e') {
            throw new JSONException("error parse false");
        }
        next();
        char c10 = this.f37888ch;
        if (c10 != ' ' && c10 != ',' && c10 != '}' && c10 != ']' && c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != 26 && c10 != '\f' && c10 != '\b' && c10 != ':' && c10 != '/') {
            throw new JSONException("scan false error");
        }
        this.token = 7;
    }

    public BigInteger scanFieldBigInteger(char[] cArr) {
        int i10;
        char cCharAt;
        int length;
        int i11;
        BigInteger bigIntegerValueOf;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length2 = cArr.length;
        int i12 = length2 + 1;
        char cCharAt2 = charAt(this.bp + length2);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.bp + i12);
            i12++;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.bp + i12);
            i12++;
        }
        if (cCharAt2 >= '0') {
            char c10 = '9';
            if (cCharAt2 <= '9') {
                long j10 = cCharAt2 - '0';
                while (true) {
                    i10 = i12 + 1;
                    cCharAt = charAt(this.bp + i12);
                    if (cCharAt < '0' || cCharAt > c10) {
                        break;
                    }
                    j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                    i12 = i10;
                    c10 = '9';
                }
                if (!z10) {
                    int i13 = this.bp;
                    length = cArr.length + i13;
                    i11 = ((i13 + i10) - length) - 1;
                } else {
                    if (cCharAt != '\"') {
                        this.matchStat = -1;
                        return null;
                    }
                    int i14 = i10 + 1;
                    cCharAt = charAt(this.bp + i10);
                    int i15 = this.bp;
                    length = cArr.length + i15 + 1;
                    i11 = ((i15 + i14) - length) - 2;
                    i10 = i14;
                }
                if (i11 < 20 || (z11 && i11 < 21)) {
                    if (z11) {
                        j10 = -j10;
                    }
                    bigIntegerValueOf = BigInteger.valueOf(j10);
                } else {
                    bigIntegerValueOf = new BigInteger(subString(length, i11));
                }
                if (cCharAt == ',') {
                    int i16 = this.bp + i10;
                    this.bp = i16;
                    this.f37888ch = charAt(i16);
                    this.matchStat = 3;
                    this.token = 16;
                    return bigIntegerValueOf;
                }
                if (cCharAt != '}') {
                    this.matchStat = -1;
                    return null;
                }
                int i17 = i10 + 1;
                char cCharAt3 = charAt(this.bp + i10);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i18 = this.bp + i17;
                    this.bp = i18;
                    this.f37888ch = charAt(i18);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i19 = this.bp + i17;
                    this.bp = i19;
                    this.f37888ch = charAt(i19);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i20 = this.bp + i17;
                    this.bp = i20;
                    this.f37888ch = charAt(i20);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return null;
                    }
                    this.token = 20;
                    this.bp += i17 - 1;
                    this.f37888ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return bigIntegerValueOf;
            }
        }
        if (cCharAt2 != 'n' || charAt(this.bp + i12) != 'u' || charAt(this.bp + i12 + 1) != 'l' || charAt(this.bp + i12 + 2) != 'l') {
            this.matchStat = -1;
            return null;
        }
        this.matchStat = 5;
        int i21 = i12 + 3;
        int i22 = i21 + 1;
        char cCharAt4 = charAt(this.bp + i21);
        if (z10 && cCharAt4 == '\"') {
            cCharAt4 = charAt(this.bp + i22);
            i22++;
        }
        while (cCharAt4 != ',') {
            if (cCharAt4 == '}') {
                int i23 = this.bp + i22;
                this.bp = i23;
                this.f37888ch = charAt(i23);
                this.matchStat = 5;
                this.token = 13;
                return null;
            }
            if (!isWhitespace(cCharAt4)) {
                this.matchStat = -1;
                return null;
            }
            cCharAt4 = charAt(this.bp + i22);
            i22++;
        }
        int i24 = this.bp + i22;
        this.bp = i24;
        this.f37888ch = charAt(i24);
        this.matchStat = 5;
        this.token = 16;
        return null;
    }

    public boolean scanFieldBoolean(char[] cArr) {
        boolean z10;
        int i10;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return false;
        }
        int length = cArr.length;
        int i11 = length + 1;
        char cCharAt = charAt(this.bp + length);
        if (cCharAt == 't') {
            int i12 = i11 + 1;
            if (charAt(this.bp + i11) != 'r') {
                this.matchStat = -1;
                return false;
            }
            int i13 = i12 + 1;
            if (charAt(this.bp + i12) != 'u') {
                this.matchStat = -1;
                return false;
            }
            i10 = i13 + 1;
            if (charAt(this.bp + i13) != 'e') {
                this.matchStat = -1;
                return false;
            }
            z10 = true;
        } else {
            if (cCharAt != 'f') {
                this.matchStat = -1;
                return false;
            }
            int i14 = i11 + 1;
            if (charAt(this.bp + i11) != 'a') {
                this.matchStat = -1;
                return false;
            }
            int i15 = i14 + 1;
            if (charAt(this.bp + i14) != 'l') {
                this.matchStat = -1;
                return false;
            }
            int i16 = i15 + 1;
            if (charAt(this.bp + i15) != 's') {
                this.matchStat = -1;
                return false;
            }
            int i17 = i16 + 1;
            if (charAt(this.bp + i16) != 'e') {
                this.matchStat = -1;
                return false;
            }
            z10 = false;
            i10 = i17;
        }
        int i18 = i10 + 1;
        char cCharAt2 = charAt(this.bp + i10);
        if (cCharAt2 == ',') {
            int i19 = this.bp + i18;
            this.bp = i19;
            this.f37888ch = charAt(i19);
            this.matchStat = 3;
            this.token = 16;
            return z10;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return false;
        }
        int i20 = i18 + 1;
        char cCharAt3 = charAt(this.bp + i18);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i21 = this.bp + i20;
            this.bp = i21;
            this.f37888ch = charAt(i21);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i22 = this.bp + i20;
            this.bp = i22;
            this.f37888ch = charAt(i22);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i23 = this.bp + i20;
            this.bp = i23;
            this.f37888ch = charAt(i23);
        } else {
            if (cCharAt3 != 26) {
                this.matchStat = -1;
                return false;
            }
            this.token = 20;
            this.bp += i20 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return z10;
    }

    public Date scanFieldDate(char[] cArr) {
        int i10;
        long j10;
        Date date;
        int i11;
        char cCharAt;
        boolean z10 = false;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i12 = length + 1;
        char cCharAt2 = charAt(this.bp + length);
        if (cCharAt2 == '\"') {
            int iIndexOf = indexOf(y.f128593b, this.bp + cArr.length + 1);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            int length2 = this.bp + cArr.length + 1;
            String strSubString = subString(length2, iIndexOf - length2);
            if (strSubString.indexOf(92) != -1) {
                while (true) {
                    int i13 = 0;
                    for (int i14 = iIndexOf - 1; i14 >= 0 && charAt(i14) == '\\'; i14--) {
                        i13++;
                    }
                    if (i13 % 2 == 0) {
                        break;
                    }
                    iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
                }
                int i15 = this.bp;
                int length3 = iIndexOf - ((cArr.length + i15) + 1);
                strSubString = readString(sub_chars(i15 + cArr.length + 1, length3), length3);
            }
            int i16 = this.bp;
            int length4 = i12 + (iIndexOf - ((cArr.length + i16) + 1)) + 1;
            i10 = length4 + 1;
            cCharAt2 = charAt(i16 + length4);
            JSONScanner jSONScanner = new JSONScanner(strSubString);
            try {
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    this.matchStat = -1;
                    jSONScanner.close();
                    return null;
                }
                date = jSONScanner.getCalendar().getTime();
                jSONScanner.close();
            } catch (Throwable th2) {
                jSONScanner.close();
                throw th2;
            }
        } else {
            if (cCharAt2 != '-' && (cCharAt2 < '0' || cCharAt2 > '9')) {
                this.matchStat = -1;
                return null;
            }
            if (cCharAt2 == '-') {
                cCharAt2 = charAt(this.bp + i12);
                i12++;
                z10 = true;
            }
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                i10 = i12;
                j10 = 0;
            } else {
                j10 = cCharAt2 - '0';
                while (true) {
                    i11 = i12 + 1;
                    cCharAt = charAt(this.bp + i12);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                    i12 = i11;
                }
                cCharAt2 = cCharAt;
                i10 = i11;
            }
            if (j10 < 0) {
                this.matchStat = -1;
                return null;
            }
            if (z10) {
                j10 = -j10;
            }
            date = new Date(j10);
        }
        if (cCharAt2 == ',') {
            int i17 = this.bp + i10;
            this.bp = i17;
            this.f37888ch = charAt(i17);
            this.matchStat = 3;
            return date;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return null;
        }
        int i18 = i10 + 1;
        char cCharAt3 = charAt(this.bp + i10);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i19 = this.bp + i18;
            this.bp = i19;
            this.f37888ch = charAt(i19);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i20 = this.bp + i18;
            this.bp = i20;
            this.f37888ch = charAt(i20);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i21 = this.bp + i18;
            this.bp = i21;
            this.f37888ch = charAt(i21);
        } else {
            if (cCharAt3 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.bp += i18 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return date;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00be -> B:52:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.math.BigDecimal scanFieldDecimal(char[] r19) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldDecimal(char[]):java.math.BigDecimal");
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00de -> B:55:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final double scanFieldDouble(char[] r24) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexerBase.scanFieldDouble(char[]):double");
    }

    public final float scanFieldFloat(char[] cArr) {
        int i10;
        char cCharAt;
        int i11;
        int length;
        int i12;
        float f10;
        char cCharAt2;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0.0f;
        }
        int length2 = cArr.length;
        int i13 = length2 + 1;
        char cCharAt3 = charAt(this.bp + length2);
        boolean z10 = cCharAt3 == '\"';
        if (z10) {
            cCharAt3 = charAt(this.bp + i13);
            i13++;
        }
        boolean z11 = cCharAt3 == '-';
        if (z11) {
            cCharAt3 = charAt(this.bp + i13);
            i13++;
        }
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            if (cCharAt3 != 'n' || charAt(this.bp + i13) != 'u' || charAt(this.bp + i13 + 1) != 'l' || charAt(this.bp + i13 + 2) != 'l') {
                this.matchStat = -1;
                return 0.0f;
            }
            this.matchStat = 5;
            int i14 = i13 + 3;
            int i15 = i14 + 1;
            char cCharAt4 = charAt(this.bp + i14);
            if (z10 && cCharAt4 == '\"') {
                cCharAt4 = charAt(this.bp + i15);
                i15++;
            }
            while (cCharAt4 != ',') {
                if (cCharAt4 == '}') {
                    int i16 = this.bp + i15;
                    this.bp = i16;
                    this.f37888ch = charAt(i16);
                    this.matchStat = 5;
                    this.token = 13;
                    return 0.0f;
                }
                if (!isWhitespace(cCharAt4)) {
                    this.matchStat = -1;
                    return 0.0f;
                }
                cCharAt4 = charAt(this.bp + i15);
                i15++;
            }
            int i17 = this.bp + i15;
            this.bp = i17;
            this.f37888ch = charAt(i17);
            this.matchStat = 5;
            this.token = 16;
            return 0.0f;
        }
        int i18 = cCharAt3 - '0';
        while (true) {
            i10 = i13 + 1;
            cCharAt = charAt(this.bp + i13);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i18 = (i18 * 10) + (cCharAt - '0');
            i13 = i10;
        }
        if (cCharAt == '.') {
            int i19 = i10 + 1;
            char cCharAt5 = charAt(this.bp + i10);
            if (cCharAt5 < '0' || cCharAt5 > '9') {
                this.matchStat = -1;
                return 0.0f;
            }
            i18 = (i18 * 10) + (cCharAt5 - '0');
            int i20 = 10;
            while (true) {
                i10 = i19 + 1;
                cCharAt2 = charAt(this.bp + i19);
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    break;
                }
                i18 = (i18 * 10) + (cCharAt2 - '0');
                i20 *= 10;
                i19 = i10;
            }
            i11 = i20;
            cCharAt = cCharAt2;
        } else {
            i11 = 1;
        }
        boolean z12 = cCharAt == 'e' || cCharAt == 'E';
        if (z12) {
            int i21 = i10 + 1;
            cCharAt = charAt(this.bp + i10);
            if (cCharAt == '+' || cCharAt == '-') {
                int i22 = i21 + 1;
                cCharAt = charAt(this.bp + i21);
                i10 = i22;
            } else {
                i10 = i21;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                int i23 = i10 + 1;
                cCharAt = charAt(this.bp + i10);
                i10 = i23;
            }
        }
        if (!z10) {
            int i24 = this.bp;
            length = cArr.length + i24;
            i12 = ((i24 + i10) - length) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0.0f;
            }
            int i25 = i10 + 1;
            char cCharAt6 = charAt(this.bp + i10);
            int i26 = this.bp;
            length = cArr.length + i26 + 1;
            i12 = ((i26 + i25) - length) - 2;
            i10 = i25;
            cCharAt = cCharAt6;
        }
        if (z12 || i12 >= 17) {
            f10 = Float.parseFloat(subString(length, i12));
        } else {
            f10 = i18 / i11;
            if (z11) {
                f10 = -f10;
            }
        }
        if (cCharAt == ',') {
            int i27 = this.bp + i10;
            this.bp = i27;
            this.f37888ch = charAt(i27);
            this.matchStat = 3;
            this.token = 16;
            return f10;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return 0.0f;
        }
        int i28 = i10 + 1;
        char cCharAt7 = charAt(this.bp + i10);
        if (cCharAt7 == ',') {
            this.token = 16;
            int i29 = this.bp + i28;
            this.bp = i29;
            this.f37888ch = charAt(i29);
        } else if (cCharAt7 == ']') {
            this.token = 15;
            int i30 = this.bp + i28;
            this.bp = i30;
            this.f37888ch = charAt(i30);
        } else if (cCharAt7 == '}') {
            this.token = 13;
            int i31 = this.bp + i28;
            this.bp = i31;
            this.f37888ch = charAt(i31);
        } else {
            if (cCharAt7 != 26) {
                this.matchStat = -1;
                return 0.0f;
            }
            this.bp += i28 - 1;
            this.token = 20;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return f10;
    }

    public final float[] scanFieldFloatArray(char[] cArr) {
        int i10;
        char cCharAt;
        int i11;
        float f10;
        float[] fArr;
        char c10;
        boolean z10;
        char cCharAt2;
        boolean z11 = false;
        this.matchStat = 0;
        float[] fArr2 = null;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i12 = length + 1;
        if (charAt(this.bp + length) != '[') {
            this.matchStat = -2;
            return null;
        }
        int i13 = i12 + 1;
        char cCharAt3 = charAt(this.bp + i12);
        float[] fArr3 = new float[16];
        int i14 = 0;
        while (true) {
            int i15 = this.bp;
            int i16 = (i15 + i13) - 1;
            boolean z12 = cCharAt3 == '-' ? true : z11;
            if (z12) {
                int i17 = i13 + 1;
                char cCharAt4 = charAt(i15 + i13);
                i13 = i17;
                cCharAt3 = cCharAt4;
            }
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                break;
            }
            int i18 = cCharAt3 - '0';
            while (true) {
                i10 = i13 + 1;
                cCharAt = charAt(this.bp + i13);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i18 = (i18 * 10) + (cCharAt - '0');
                i13 = i10;
            }
            if (cCharAt == '.' ? true : z11) {
                int i19 = i10 + 1;
                char cCharAt5 = charAt(this.bp + i10);
                if (cCharAt5 < '0' || cCharAt5 > '9') {
                    this.matchStat = -1;
                    return fArr2;
                }
                i18 = (i18 * 10) + (cCharAt5 - '0');
                int i20 = 10;
                while (true) {
                    i10 = i19 + 1;
                    cCharAt2 = charAt(this.bp + i19);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i18 = (i18 * 10) + (cCharAt2 - '0');
                    i20 *= 10;
                    i19 = i10;
                }
                int i21 = i20;
                cCharAt = cCharAt2;
                i11 = i21;
            } else {
                i11 = 1;
            }
            boolean z13 = cCharAt == 'e' || cCharAt == 'E';
            if (z13) {
                int i22 = i10 + 1;
                cCharAt = charAt(this.bp + i10);
                if (cCharAt == '+' || cCharAt == '-') {
                    int i23 = i22 + 1;
                    cCharAt = charAt(this.bp + i22);
                    i10 = i23;
                } else {
                    i10 = i22;
                }
                while (cCharAt >= '0' && cCharAt <= '9') {
                    int i24 = i10 + 1;
                    cCharAt = charAt(this.bp + i10);
                    i10 = i24;
                }
            }
            int i25 = ((this.bp + i10) - i16) - 1;
            if (z13 || i25 >= 10) {
                f10 = Float.parseFloat(subString(i16, i25));
            } else {
                f10 = i18 / i11;
                if (z12) {
                    f10 = -f10;
                }
            }
            if (i14 >= fArr3.length) {
                float[] fArr4 = new float[(fArr3.length * 3) / 2];
                System.arraycopy(fArr3, 0, fArr4, 0, i14);
                fArr3 = fArr4;
            }
            int i26 = i14 + 1;
            fArr3[i14] = f10;
            if (cCharAt == ',') {
                i13 = i10 + 1;
                c10 = 16;
                z10 = false;
                cCharAt3 = charAt(this.bp + i10);
                fArr = null;
            } else {
                if (cCharAt == ']') {
                    int i27 = i10 + 1;
                    char cCharAt6 = charAt(this.bp + i10);
                    if (i26 != fArr3.length) {
                        float[] fArr5 = new float[i26];
                        System.arraycopy(fArr3, 0, fArr5, 0, i26);
                        fArr3 = fArr5;
                    }
                    if (cCharAt6 == ',') {
                        this.bp += i27 - 1;
                        next();
                        this.matchStat = 3;
                        this.token = 16;
                        return fArr3;
                    }
                    if (cCharAt6 != '}') {
                        this.matchStat = -1;
                        return null;
                    }
                    int i28 = i27 + 1;
                    char cCharAt7 = charAt(this.bp + i27);
                    if (cCharAt7 == ',') {
                        this.token = 16;
                        this.bp += i28 - 1;
                        next();
                    } else if (cCharAt7 == ']') {
                        this.token = 15;
                        this.bp += i28 - 1;
                        next();
                    } else if (cCharAt7 == '}') {
                        this.token = 13;
                        this.bp += i28 - 1;
                        next();
                    } else {
                        if (cCharAt7 != 26) {
                            this.matchStat = -1;
                            return null;
                        }
                        this.bp += i28 - 1;
                        this.token = 20;
                        this.f37888ch = JSONLexer.EOI;
                    }
                    this.matchStat = 4;
                    return fArr3;
                }
                fArr = null;
                c10 = 16;
                z10 = false;
                cCharAt3 = cCharAt;
                i13 = i10;
            }
            i14 = i26;
            fArr2 = fArr;
            z11 = z10;
        }
        float[] fArr6 = fArr2;
        this.matchStat = -1;
        return fArr6;
    }

    public final float[][] scanFieldFloatArray2(char[] cArr) {
        int i10;
        char cCharAt;
        int i11;
        float f10;
        int i12;
        int i13;
        float[][] fArr;
        int i14;
        char c10;
        float[][] fArr2;
        int i15;
        char cCharAt2;
        int i16 = 0;
        this.matchStat = 0;
        float[][] fArr3 = null;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i17 = length + 1;
        char c11 = '[';
        if (charAt(this.bp + length) != '[') {
            this.matchStat = -2;
            return null;
        }
        int i18 = i17 + 1;
        char cCharAt3 = charAt(this.bp + i17);
        int i19 = 16;
        float[][] fArr4 = new float[16][];
        int i20 = 0;
        loop0: while (true) {
            if (cCharAt3 == c11) {
                int i21 = i18 + 1;
                char cCharAt4 = charAt(this.bp + i18);
                float[] fArr5 = new float[i19];
                int i22 = i16;
                while (true) {
                    int i23 = this.bp;
                    int i24 = (i23 + i21) - 1;
                    int i25 = cCharAt4 == '-' ? 1 : i16;
                    if (i25 != 0) {
                        int i26 = i21 + 1;
                        char cCharAt5 = charAt(i23 + i21);
                        i21 = i26;
                        cCharAt4 = cCharAt5;
                    }
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        break loop0;
                    }
                    int i27 = cCharAt4 - '0';
                    while (true) {
                        i10 = i21 + 1;
                        cCharAt = charAt(this.bp + i21);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i27 = (i27 * 10) + (cCharAt - '0');
                        i21 = i10;
                    }
                    if (cCharAt == '.') {
                        int i28 = i10 + 1;
                        char cCharAt6 = charAt(this.bp + i10);
                        if (cCharAt6 < '0' || cCharAt6 > '9') {
                            this.matchStat = -1;
                            return fArr3;
                        }
                        i27 = (i27 * 10) + (cCharAt6 - '0');
                        int i29 = 10;
                        while (true) {
                            i10 = i28 + 1;
                            cCharAt2 = charAt(this.bp + i28);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                break;
                            }
                            i27 = (i27 * 10) + (cCharAt2 - '0');
                            i29 *= 10;
                            i28 = i10;
                        }
                        i11 = i29;
                        cCharAt = cCharAt2;
                    } else {
                        i11 = 1;
                    }
                    boolean z10 = cCharAt == 'e' || cCharAt == 'E';
                    if (z10) {
                        int i30 = i10 + 1;
                        cCharAt = charAt(this.bp + i10);
                        if (cCharAt == '+' || cCharAt == '-') {
                            int i31 = i30 + 1;
                            cCharAt = charAt(this.bp + i30);
                            i10 = i31;
                        } else {
                            i10 = i30;
                        }
                        while (cCharAt >= '0' && cCharAt <= '9') {
                            int i32 = i10 + 1;
                            cCharAt = charAt(this.bp + i10);
                            i10 = i32;
                        }
                    }
                    int i33 = ((this.bp + i10) - i24) - 1;
                    if (z10 || i33 >= 10) {
                        f10 = Float.parseFloat(subString(i24, i33));
                    } else {
                        f10 = i27 / i11;
                        if (i25 != 0) {
                            f10 = -f10;
                        }
                    }
                    if (i22 >= fArr5.length) {
                        float[] fArr6 = new float[(fArr5.length * 3) / 2];
                        System.arraycopy(fArr5, 0, fArr6, 0, i22);
                        fArr5 = fArr6;
                    }
                    int i34 = i22 + 1;
                    fArr5[i22] = f10;
                    if (cCharAt == ',') {
                        i21 = i10 + 1;
                        c10 = 16;
                        fArr2 = null;
                        i15 = 0;
                        cCharAt4 = charAt(this.bp + i10);
                    } else {
                        if (cCharAt == ']') {
                            int i35 = i10 + 1;
                            char cCharAt7 = charAt(this.bp + i10);
                            if (i34 != fArr5.length) {
                                float[] fArr7 = new float[i34];
                                i12 = 0;
                                System.arraycopy(fArr5, 0, fArr7, 0, i34);
                                fArr5 = fArr7;
                            } else {
                                i12 = 0;
                            }
                            if (i20 >= fArr4.length) {
                                fArr4 = new float[(fArr4.length * 3) / 2][];
                                System.arraycopy(fArr5, i12, fArr4, i12, i34);
                            }
                            int i36 = i20 + 1;
                            fArr4[i20] = fArr5;
                            if (cCharAt7 == ',') {
                                i18 = i35 + 1;
                                i13 = 16;
                                fArr = null;
                                i14 = 0;
                                cCharAt3 = charAt(this.bp + i35);
                            } else {
                                if (cCharAt7 == ']') {
                                    int i37 = i35 + 1;
                                    char cCharAt8 = charAt(this.bp + i35);
                                    if (i36 != fArr4.length) {
                                        float[][] fArr8 = new float[i36][];
                                        System.arraycopy(fArr4, 0, fArr8, 0, i36);
                                        fArr4 = fArr8;
                                    }
                                    if (cCharAt8 == ',') {
                                        this.bp += i37 - 1;
                                        next();
                                        this.matchStat = 3;
                                        this.token = 16;
                                        return fArr4;
                                    }
                                    if (cCharAt8 != '}') {
                                        this.matchStat = -1;
                                        return null;
                                    }
                                    int i38 = i37 + 1;
                                    char cCharAt9 = charAt(this.bp + i37);
                                    if (cCharAt9 == ',') {
                                        this.token = 16;
                                        this.bp += i38 - 1;
                                        next();
                                    } else if (cCharAt9 == ']') {
                                        this.token = 15;
                                        this.bp += i38 - 1;
                                        next();
                                    } else if (cCharAt9 == '}') {
                                        this.token = 13;
                                        this.bp += i38 - 1;
                                        next();
                                    } else {
                                        if (cCharAt9 != 26) {
                                            this.matchStat = -1;
                                            return null;
                                        }
                                        this.bp += i38 - 1;
                                        this.token = 20;
                                        this.f37888ch = JSONLexer.EOI;
                                    }
                                    this.matchStat = 4;
                                    return fArr4;
                                }
                                i13 = 16;
                                fArr = null;
                                i14 = 0;
                                cCharAt3 = cCharAt7;
                                i18 = i35;
                            }
                            i20 = i36;
                            fArr3 = fArr;
                            i16 = i14;
                            i19 = i13;
                            c11 = '[';
                            break;
                        }
                        c10 = 16;
                        fArr2 = null;
                        i15 = 0;
                        cCharAt4 = cCharAt;
                        i21 = i10;
                    }
                    i16 = i15;
                    i22 = i34;
                    fArr3 = fArr2;
                }
            }
        }
        float[][] fArr9 = fArr3;
        this.matchStat = -1;
        return fArr9;
    }

    public int scanFieldInt(char[] cArr) {
        int i10;
        char cCharAt;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0;
        }
        int length = cArr.length;
        int i11 = length + 1;
        char cCharAt2 = charAt(this.bp + length);
        boolean z10 = cCharAt2 == '-';
        if (z10) {
            cCharAt2 = charAt(this.bp + i11);
            i11++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i12 = cCharAt2 - '0';
        while (true) {
            i10 = i11 + 1;
            cCharAt = charAt(this.bp + i11);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i12 = (i12 * 10) + (cCharAt - '0');
            i11 = i10;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0;
        }
        if ((i12 < 0 || i10 > cArr.length + 14) && !(i12 == Integer.MIN_VALUE && i10 == 17 && z10)) {
            this.matchStat = -1;
            return 0;
        }
        if (cCharAt == ',') {
            int i13 = this.bp + i10;
            this.bp = i13;
            this.f37888ch = charAt(i13);
            this.matchStat = 3;
            this.token = 16;
            return z10 ? -i12 : i12;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return 0;
        }
        int i14 = i10 + 1;
        char cCharAt3 = charAt(this.bp + i10);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i15 = this.bp + i14;
            this.bp = i15;
            this.f37888ch = charAt(i15);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i16 = this.bp + i14;
            this.bp = i16;
            this.f37888ch = charAt(i16);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i17 = this.bp + i14;
            this.bp = i17;
            this.f37888ch = charAt(i17);
        } else {
            if (cCharAt3 != 26) {
                this.matchStat = -1;
                return 0;
            }
            this.token = 20;
            this.bp += i14 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return z10 ? -i12 : i12;
    }

    public final int[] scanFieldIntArray(char[] cArr) {
        boolean z10;
        int i10;
        char cCharAt;
        int i11;
        int i12;
        char cCharAt2;
        this.matchStat = 0;
        int[] iArr = null;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i13 = length + 1;
        if (charAt(this.bp + length) != '[') {
            this.matchStat = -2;
            return null;
        }
        int i14 = i13 + 1;
        char cCharAt3 = charAt(this.bp + i13);
        int[] iArr2 = new int[16];
        if (cCharAt3 == ']') {
            i12 = i14 + 1;
            cCharAt2 = charAt(this.bp + i14);
            i11 = 0;
        } else {
            int i15 = 0;
            while (true) {
                if (cCharAt3 == '-') {
                    cCharAt3 = charAt(this.bp + i14);
                    i14++;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    int[] iArr3 = iArr;
                    this.matchStat = -1;
                    return iArr3;
                }
                int i16 = cCharAt3 - '0';
                while (true) {
                    i10 = i14 + 1;
                    cCharAt = charAt(this.bp + i14);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i16 = (i16 * 10) + (cCharAt - '0');
                    i14 = i10;
                }
                if (i15 >= iArr2.length) {
                    int[] iArr4 = new int[(iArr2.length * 3) / 2];
                    System.arraycopy(iArr2, 0, iArr4, 0, i15);
                    iArr2 = iArr4;
                }
                i11 = i15 + 1;
                if (z10) {
                    i16 = -i16;
                }
                iArr2[i15] = i16;
                if (cCharAt == ',') {
                    char cCharAt4 = charAt(this.bp + i10);
                    i10++;
                    cCharAt = cCharAt4;
                } else if (cCharAt == ']') {
                    i12 = i10 + 1;
                    cCharAt2 = charAt(this.bp + i10);
                    break;
                }
                i15 = i11;
                iArr = null;
                cCharAt3 = cCharAt;
                i14 = i10;
            }
        }
        if (i11 != iArr2.length) {
            int[] iArr5 = new int[i11];
            System.arraycopy(iArr2, 0, iArr5, 0, i11);
            iArr2 = iArr5;
        }
        if (cCharAt2 == ',') {
            this.bp += i12 - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return iArr2;
        }
        if (cCharAt2 != '}') {
            this.matchStat = -1;
            return null;
        }
        int i17 = i12 + 1;
        char cCharAt5 = charAt(this.bp + i12);
        if (cCharAt5 == ',') {
            this.token = 16;
            this.bp += i17 - 1;
            next();
        } else if (cCharAt5 == ']') {
            this.token = 15;
            this.bp += i17 - 1;
            next();
        } else if (cCharAt5 == '}') {
            this.token = 13;
            this.bp += i17 - 1;
            next();
        } else {
            if (cCharAt5 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.bp += i17 - 1;
            this.token = 20;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return iArr2;
    }

    public long scanFieldLong(char[] cArr) {
        boolean z10;
        int i10;
        char cCharAt;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i11 = length + 1;
        char cCharAt2 = charAt(this.bp + length);
        if (cCharAt2 == '-') {
            cCharAt2 = charAt(this.bp + i11);
            i11++;
            z10 = true;
        } else {
            z10 = false;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            this.matchStat = -1;
            return 0L;
        }
        long j10 = cCharAt2 - '0';
        while (true) {
            i10 = i11 + 1;
            cCharAt = charAt(this.bp + i11);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j10 = (j10 * 10) + ((long) (cCharAt - '0'));
            i11 = i10;
        }
        if (cCharAt == '.') {
            this.matchStat = -1;
            return 0L;
        }
        if (!(i10 - cArr.length < 21 && (j10 >= 0 || (j10 == Long.MIN_VALUE && z10)))) {
            this.matchStat = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i12 = this.bp + i10;
            this.bp = i12;
            this.f37888ch = charAt(i12);
            this.matchStat = 3;
            this.token = 16;
            return z10 ? -j10 : j10;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return 0L;
        }
        int i13 = i10 + 1;
        char cCharAt3 = charAt(this.bp + i10);
        if (cCharAt3 == ',') {
            this.token = 16;
            int i14 = this.bp + i13;
            this.bp = i14;
            this.f37888ch = charAt(i14);
        } else if (cCharAt3 == ']') {
            this.token = 15;
            int i15 = this.bp + i13;
            this.bp = i15;
            this.f37888ch = charAt(i15);
        } else if (cCharAt3 == '}') {
            this.token = 13;
            int i16 = this.bp + i13;
            this.bp = i16;
            this.f37888ch = charAt(i16);
        } else {
            if (cCharAt3 != 26) {
                this.matchStat = -1;
                return 0L;
            }
            this.token = 20;
            this.bp += i13 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return z10 ? -j10 : j10;
    }

    public String scanFieldString(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return stringDefaultValue();
        }
        int length = cArr.length;
        int i10 = length + 1;
        if (charAt(this.bp + length) != '\"') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int iIndexOf = indexOf(y.f128593b, this.bp + cArr.length + 1);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        int length2 = this.bp + cArr.length + 1;
        String strSubString = subString(length2, iIndexOf - length2);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i11 = 0;
                for (int i12 = iIndexOf - 1; i12 >= 0 && charAt(i12) == '\\'; i12--) {
                    i11++;
                }
                if (i11 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
            }
            int i13 = this.bp;
            int length3 = iIndexOf - ((cArr.length + i13) + 1);
            strSubString = readString(sub_chars(i13 + cArr.length + 1, length3), length3);
        }
        int i14 = this.bp;
        int length4 = i10 + (iIndexOf - ((cArr.length + i14) + 1)) + 1;
        int i15 = length4 + 1;
        char cCharAt = charAt(i14 + length4);
        if (cCharAt == ',') {
            int i16 = this.bp + i15;
            this.bp = i16;
            this.f37888ch = charAt(i16);
            this.matchStat = 3;
            return strSubString;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return stringDefaultValue();
        }
        int i17 = i15 + 1;
        char cCharAt2 = charAt(this.bp + i15);
        if (cCharAt2 == ',') {
            this.token = 16;
            int i18 = this.bp + i17;
            this.bp = i18;
            this.f37888ch = charAt(i18);
        } else if (cCharAt2 == ']') {
            this.token = 15;
            int i19 = this.bp + i17;
            this.bp = i19;
            this.f37888ch = charAt(i19);
        } else if (cCharAt2 == '}') {
            this.token = 13;
            int i20 = this.bp + i17;
            this.bp = i20;
            this.f37888ch = charAt(i20);
        } else {
            if (cCharAt2 != 26) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            this.token = 20;
            this.bp += i17 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return strSubString;
    }

    public Collection<String> scanFieldStringArray(char[] cArr, Class<?> cls) {
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        Collection<String> collectionNewCollectionByType = newCollectionByType(cls);
        int length = cArr.length;
        int i12 = length + 1;
        if (charAt(this.bp + length) != '[') {
            this.matchStat = -1;
            return null;
        }
        int i13 = i12 + 1;
        char cCharAt3 = charAt(this.bp + i12);
        while (true) {
            if (cCharAt3 == '\"') {
                int iIndexOf = indexOf(y.f128593b, this.bp + i13);
                if (iIndexOf == -1) {
                    throw new JSONException("unclosed str");
                }
                int i14 = this.bp + i13;
                String strSubString = subString(i14, iIndexOf - i14);
                if (strSubString.indexOf(92) != -1) {
                    while (true) {
                        int i15 = 0;
                        for (int i16 = iIndexOf - 1; i16 >= 0 && charAt(i16) == '\\'; i16--) {
                            i15++;
                        }
                        if (i15 % 2 == 0) {
                            break;
                        }
                        iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
                    }
                    int i17 = this.bp;
                    int i18 = iIndexOf - (i17 + i13);
                    strSubString = readString(sub_chars(i17 + i13, i18), i18);
                }
                int i19 = this.bp;
                int i20 = i13 + (iIndexOf - (i19 + i13)) + 1;
                i11 = i20 + 1;
                cCharAt2 = charAt(i19 + i20);
                collectionNewCollectionByType.add(strSubString);
            } else {
                if (cCharAt3 != 'n' || charAt(this.bp + i13) != 'u' || charAt(this.bp + i13 + 1) != 'l' || charAt(this.bp + i13 + 2) != 'l') {
                    if (cCharAt3 != ']' || collectionNewCollectionByType.size() != 0) {
                        throw new JSONException("illega str");
                    }
                    cCharAt = charAt(this.bp + i13);
                    i10 = i13 + 1;
                    break;
                }
                int i21 = i13 + 3;
                int i22 = i21 + 1;
                cCharAt2 = charAt(this.bp + i21);
                collectionNewCollectionByType.add(null);
                i11 = i22;
            }
            if (cCharAt2 != ',') {
                if (cCharAt2 != ']') {
                    this.matchStat = -1;
                    return null;
                }
                i10 = i11 + 1;
                cCharAt = charAt(this.bp + i11);
                break;
            }
            int i23 = i11 + 1;
            cCharAt3 = charAt(this.bp + i11);
            i13 = i23;
        }
        if (cCharAt == ',') {
            int i24 = this.bp + i10;
            this.bp = i24;
            this.f37888ch = charAt(i24);
            this.matchStat = 3;
            return collectionNewCollectionByType;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i25 = i10 + 1;
        char cCharAt4 = charAt(this.bp + i10);
        if (cCharAt4 == ',') {
            this.token = 16;
            int i26 = this.bp + i25;
            this.bp = i26;
            this.f37888ch = charAt(i26);
        } else if (cCharAt4 == ']') {
            this.token = 15;
            int i27 = this.bp + i25;
            this.bp = i27;
            this.f37888ch = charAt(i27);
        } else if (cCharAt4 == '}') {
            this.token = 13;
            int i28 = this.bp + i25;
            this.bp = i28;
            this.f37888ch = charAt(i28);
        } else {
            if (cCharAt4 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.bp += i25 - 1;
            this.token = 20;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return collectionNewCollectionByType;
    }

    public String[] scanFieldStringArray(char[] cArr, int i10, SymbolTable symbolTable) {
        throw new UnsupportedOperationException();
    }

    public long scanFieldSymbol(char[] cArr) {
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return 0L;
        }
        int length = cArr.length;
        int i10 = length + 1;
        if (charAt(this.bp + length) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j10 = -3750763034362895579L;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt = charAt(this.bp + i10);
            if (cCharAt == '\"') {
                int i12 = i11 + 1;
                char cCharAt2 = charAt(this.bp + i11);
                if (cCharAt2 == ',') {
                    int i13 = this.bp + i12;
                    this.bp = i13;
                    this.f37888ch = charAt(i13);
                    this.matchStat = 3;
                    return j10;
                }
                if (cCharAt2 != '}') {
                    this.matchStat = -1;
                    return 0L;
                }
                int i14 = i12 + 1;
                char cCharAt3 = charAt(this.bp + i12);
                if (cCharAt3 == ',') {
                    this.token = 16;
                    int i15 = this.bp + i14;
                    this.bp = i15;
                    this.f37888ch = charAt(i15);
                } else if (cCharAt3 == ']') {
                    this.token = 15;
                    int i16 = this.bp + i14;
                    this.bp = i16;
                    this.f37888ch = charAt(i16);
                } else if (cCharAt3 == '}') {
                    this.token = 13;
                    int i17 = this.bp + i14;
                    this.bp = i17;
                    this.f37888ch = charAt(i17);
                } else {
                    if (cCharAt3 != 26) {
                        this.matchStat = -1;
                        return 0L;
                    }
                    this.token = 20;
                    this.bp += i14 - 1;
                    this.f37888ch = JSONLexer.EOI;
                }
                this.matchStat = 4;
                return j10;
            }
            j10 = (j10 ^ ((long) cCharAt)) * 1099511628211L;
            if (cCharAt == '\\') {
                this.matchStat = -1;
                return 0L;
            }
            i10 = i11;
        }
    }

    public UUID scanFieldUUID(char[] cArr) {
        char cCharAt;
        int i10;
        UUID uuid;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        this.matchStat = 0;
        if (!charArrayCompare(cArr)) {
            this.matchStat = -2;
            return null;
        }
        int length = cArr.length;
        int i24 = length + 1;
        char cCharAt2 = charAt(this.bp + length);
        char c10 = 4;
        if (cCharAt2 != '\"') {
            if (cCharAt2 == 'n') {
                int i25 = i24 + 1;
                if (charAt(this.bp + i24) == 'u') {
                    int i26 = i25 + 1;
                    if (charAt(this.bp + i25) == 'l') {
                        int i27 = i26 + 1;
                        if (charAt(this.bp + i26) == 'l') {
                            cCharAt = charAt(this.bp + i27);
                            i10 = i27 + 1;
                            uuid = null;
                        }
                    }
                }
            }
            this.matchStat = -1;
            return null;
        }
        int iIndexOf = indexOf(y.f128593b, this.bp + cArr.length + 1);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        int length2 = this.bp + cArr.length + 1;
        int i28 = iIndexOf - length2;
        char c11 = 'F';
        char c12 = 'f';
        char c13 = 'A';
        char c14 = '0';
        if (i28 == 36) {
            int i29 = 0;
            long j10 = 0;
            while (i29 < 8) {
                char cCharAt3 = charAt(length2 + i29);
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    if (cCharAt3 >= 'a' && cCharAt3 <= 'f') {
                        i22 = cCharAt3 - 'a';
                    } else {
                        if (cCharAt3 < 'A' || cCharAt3 > c11) {
                            this.matchStat = -2;
                            return null;
                        }
                        i22 = cCharAt3 - 'A';
                    }
                    i23 = i22 + 10;
                } else {
                    i23 = cCharAt3 - '0';
                }
                j10 = (j10 << 4) | ((long) i23);
                i29++;
                iIndexOf = iIndexOf;
                c11 = 'F';
            }
            int i30 = iIndexOf;
            int i31 = 9;
            int i32 = 13;
            while (i31 < i32) {
                char cCharAt4 = charAt(length2 + i31);
                if (cCharAt4 < '0' || cCharAt4 > '9') {
                    if (cCharAt4 >= 'a' && cCharAt4 <= 'f') {
                        i20 = cCharAt4 - 'a';
                    } else {
                        if (cCharAt4 < c13 || cCharAt4 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i20 = cCharAt4 - 'A';
                    }
                    i21 = i20 + 10;
                } else {
                    i21 = cCharAt4 - '0';
                }
                j10 = (j10 << c10) | ((long) i21);
                i31++;
                i32 = 13;
                c13 = 'A';
                c10 = 4;
            }
            long j11 = j10;
            for (int i33 = 14; i33 < 18; i33++) {
                char cCharAt5 = charAt(length2 + i33);
                if (cCharAt5 < '0' || cCharAt5 > '9') {
                    if (cCharAt5 >= 'a' && cCharAt5 <= 'f') {
                        i18 = cCharAt5 - 'a';
                    } else {
                        if (cCharAt5 < 'A' || cCharAt5 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i18 = cCharAt5 - 'A';
                    }
                    i19 = i18 + 10;
                } else {
                    i19 = cCharAt5 - '0';
                }
                j11 = (j11 << 4) | ((long) i19);
            }
            long j12 = 0;
            for (int i34 = 19; i34 < 23; i34++) {
                char cCharAt6 = charAt(length2 + i34);
                if (cCharAt6 < '0' || cCharAt6 > '9') {
                    if (cCharAt6 >= 'a' && cCharAt6 <= 'f') {
                        i16 = cCharAt6 - 'a';
                    } else {
                        if (cCharAt6 < 'A' || cCharAt6 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i16 = cCharAt6 - 'A';
                    }
                    i17 = i16 + 10;
                } else {
                    i17 = cCharAt6 - '0';
                }
                j12 = (j12 << 4) | ((long) i17);
            }
            int i35 = 24;
            long j13 = j12;
            int i36 = 36;
            while (i35 < i36) {
                char cCharAt7 = charAt(length2 + i35);
                if (cCharAt7 < c14 || cCharAt7 > '9') {
                    if (cCharAt7 >= 'a' && cCharAt7 <= c12) {
                        i14 = cCharAt7 - 'a';
                    } else {
                        if (cCharAt7 < 'A' || cCharAt7 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i14 = cCharAt7 - 'A';
                    }
                    i15 = i14 + 10;
                } else {
                    i15 = cCharAt7 - '0';
                }
                j13 = (j13 << 4) | ((long) i15);
                i35++;
                i24 = i24;
                i36 = 36;
                c14 = '0';
                c12 = 'f';
            }
            uuid = new UUID(j11, j13);
            int i37 = this.bp;
            int length3 = i24 + (i30 - ((cArr.length + i37) + 1)) + 1;
            i10 = length3 + 1;
            cCharAt = charAt(i37 + length3);
        } else {
            if (i28 != 32) {
                this.matchStat = -1;
                return null;
            }
            long j14 = 0;
            for (int i38 = 0; i38 < 16; i38++) {
                char cCharAt8 = charAt(length2 + i38);
                if (cCharAt8 < '0' || cCharAt8 > '9') {
                    if (cCharAt8 >= 'a' && cCharAt8 <= 'f') {
                        i12 = cCharAt8 - 'a';
                    } else {
                        if (cCharAt8 < 'A' || cCharAt8 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i12 = cCharAt8 - 'A';
                    }
                    i13 = i12 + 10;
                } else {
                    i13 = cCharAt8 - '0';
                }
                j14 = (j14 << 4) | ((long) i13);
            }
            int i39 = 16;
            long j15 = 0;
            for (int i40 = 32; i39 < i40; i40 = 32) {
                char cCharAt9 = charAt(length2 + i39);
                if (cCharAt9 < '0' || cCharAt9 > '9') {
                    if (cCharAt9 >= 'a' && cCharAt9 <= 'f') {
                        i11 = (cCharAt9 - 'a') + 10;
                    } else {
                        if (cCharAt9 < 'A' || cCharAt9 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i11 = (cCharAt9 - 'A') + 10;
                    }
                    j15 = (j15 << 4) | ((long) i11);
                    i39++;
                } else {
                    i11 = cCharAt9 - '0';
                }
                j15 = (j15 << 4) | ((long) i11);
                i39++;
            }
            uuid = new UUID(j14, j15);
            int i41 = this.bp;
            int length4 = i24 + (iIndexOf - ((cArr.length + i41) + 1)) + 1;
            i10 = length4 + 1;
            cCharAt = charAt(i41 + length4);
        }
        if (cCharAt == ',') {
            int i42 = this.bp + i10;
            this.bp = i42;
            this.f37888ch = charAt(i42);
            this.matchStat = 3;
            return uuid;
        }
        if (cCharAt != '}') {
            this.matchStat = -1;
            return null;
        }
        int i43 = i10 + 1;
        char cCharAt10 = charAt(this.bp + i10);
        if (cCharAt10 == ',') {
            this.token = 16;
            int i44 = this.bp + i43;
            this.bp = i44;
            this.f37888ch = charAt(i44);
        } else if (cCharAt10 == ']') {
            this.token = 15;
            int i45 = this.bp + i43;
            this.bp = i45;
            this.f37888ch = charAt(i45);
        } else if (cCharAt10 == '}') {
            this.token = 13;
            int i46 = this.bp + i43;
            this.bp = i46;
            this.f37888ch = charAt(i46);
        } else {
            if (cCharAt10 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.bp += i43 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return uuid;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final float scanFloat(char c10) {
        int i10;
        int i11;
        char cCharAt;
        int i12;
        int i13;
        float f10;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.bp + 0);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.bp + 1);
            i10 = 2;
        } else {
            i10 = 1;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.bp + i10);
            i10++;
        }
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            if (cCharAt2 != 'n' || charAt(this.bp + i10) != 'u' || charAt(this.bp + i10 + 1) != 'l' || charAt(this.bp + i10 + 2) != 'l') {
                this.matchStat = -1;
                return 0.0f;
            }
            this.matchStat = 5;
            int i14 = i10 + 3;
            int i15 = i14 + 1;
            char cCharAt3 = charAt(this.bp + i14);
            if (z10 && cCharAt3 == '\"') {
                cCharAt3 = charAt(this.bp + i15);
                i15++;
            }
            while (cCharAt3 != ',') {
                if (cCharAt3 == ']') {
                    int i16 = this.bp + i15;
                    this.bp = i16;
                    this.f37888ch = charAt(i16);
                    this.matchStat = 5;
                    this.token = 15;
                    return 0.0f;
                }
                if (!isWhitespace(cCharAt3)) {
                    this.matchStat = -1;
                    return 0.0f;
                }
                cCharAt3 = charAt(this.bp + i15);
                i15++;
            }
            int i17 = this.bp + i15;
            this.bp = i17;
            this.f37888ch = charAt(i17);
            this.matchStat = 5;
            this.token = 16;
            return 0.0f;
        }
        long j10 = cCharAt2 - '0';
        while (true) {
            i11 = i10 + 1;
            cCharAt = charAt(this.bp + i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j10 = (j10 * 10) + ((long) (cCharAt - '0'));
            i10 = i11;
        }
        long j11 = 1;
        if (cCharAt == '.') {
            int i18 = i11 + 1;
            char cCharAt4 = charAt(this.bp + i11);
            if (cCharAt4 < '0' || cCharAt4 > '9') {
                this.matchStat = -1;
                return 0.0f;
            }
            j10 = (j10 * 10) + ((long) (cCharAt4 - '0'));
            j11 = 10;
            while (true) {
                i11 = i18 + 1;
                cCharAt = charAt(this.bp + i18);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                j11 *= 10;
                i18 = i11;
            }
        }
        long j12 = j11;
        boolean z12 = cCharAt == 'e' || cCharAt == 'E';
        if (z12) {
            int i19 = i11 + 1;
            char cCharAt5 = charAt(this.bp + i11);
            if (cCharAt5 == '+' || cCharAt5 == '-') {
                int i20 = i19 + 1;
                cCharAt = charAt(this.bp + i19);
                i11 = i20;
            } else {
                i11 = i19;
                cCharAt = cCharAt5;
            }
            while (cCharAt >= '0' && cCharAt <= '9') {
                int i21 = i11 + 1;
                cCharAt = charAt(this.bp + i11);
                i11 = i21;
            }
        }
        if (!z10) {
            i12 = this.bp;
            i13 = ((i12 + i11) - i12) - 1;
        } else {
            if (cCharAt != '\"') {
                this.matchStat = -1;
                return 0.0f;
            }
            int i22 = i11 + 1;
            cCharAt = charAt(this.bp + i11);
            int i23 = this.bp;
            i12 = i23 + 1;
            i13 = ((i23 + i22) - i12) - 2;
            i11 = i22;
        }
        if (z12 || i13 >= 17) {
            f10 = Float.parseFloat(subString(i12, i13));
        } else {
            f10 = j10 / j12;
            if (z11) {
                f10 = -f10;
            }
        }
        if (cCharAt != c10) {
            this.matchStat = -1;
            return f10;
        }
        int i24 = this.bp + i11;
        this.bp = i24;
        this.f37888ch = charAt(i24);
        this.matchStat = 3;
        this.token = 16;
        return f10;
    }

    public final void scanHex() {
        char next;
        if (this.f37888ch != 'x') {
            throw new JSONException("illegal state. " + this.f37888ch);
        }
        next();
        if (this.f37888ch != '\'') {
            throw new JSONException("illegal state. " + this.f37888ch);
        }
        this.np = this.bp;
        next();
        while (true) {
            next = next();
            if ((next < '0' || next > '9') && (next < 'A' || next > 'F')) {
                break;
            } else {
                this.sp++;
            }
        }
        if (next == '\'') {
            this.sp++;
            next();
            this.token = 26;
        } else {
            throw new JSONException("illegal state. " + next);
        }
    }

    public final void scanIdent() {
        this.np = this.bp - 1;
        this.hasSpecial = false;
        do {
            this.sp++;
            next();
        } while (Character.isLetterOrDigit(this.f37888ch));
        String strStringVal = stringVal();
        if ("null".equalsIgnoreCase(strStringVal)) {
            this.token = 8;
            return;
        }
        if ("new".equals(strStringVal)) {
            this.token = 9;
            return;
        }
        if ("true".equals(strStringVal)) {
            this.token = 6;
            return;
        }
        if ("false".equals(strStringVal)) {
            this.token = 7;
            return;
        }
        if ("undefined".equals(strStringVal)) {
            this.token = 23;
            return;
        }
        if ("Set".equals(strStringVal)) {
            this.token = 21;
        } else if ("TreeSet".equals(strStringVal)) {
            this.token = 22;
        } else {
            this.token = 18;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public int scanInt(char c10) {
        int i10;
        int i11;
        char cCharAt;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.bp + 0);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.bp + 1);
            i10 = 2;
        } else {
            i10 = 1;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.bp + i10);
            i10++;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            int i12 = cCharAt2 - '0';
            while (true) {
                i11 = i10 + 1;
                cCharAt = charAt(this.bp + i10);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i12 = (i12 * 10) + (cCharAt - '0');
                i10 = i11;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0;
            }
            if (i12 < 0) {
                this.matchStat = -1;
                return 0;
            }
            while (cCharAt != c10) {
                if (!isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return z11 ? -i12 : i12;
                }
                char cCharAt3 = charAt(this.bp + i11);
                i11++;
                cCharAt = cCharAt3;
            }
            int i13 = this.bp + i11;
            this.bp = i13;
            this.f37888ch = charAt(i13);
            this.matchStat = 3;
            this.token = 16;
            return z11 ? -i12 : i12;
        }
        if (cCharAt2 != 'n' || charAt(this.bp + i10) != 'u' || charAt(this.bp + i10 + 1) != 'l' || charAt(this.bp + i10 + 2) != 'l') {
            this.matchStat = -1;
            return 0;
        }
        this.matchStat = 5;
        int i14 = i10 + 3;
        int i15 = i14 + 1;
        char cCharAt4 = charAt(this.bp + i14);
        if (z10 && cCharAt4 == '\"') {
            int i16 = i15 + 1;
            cCharAt4 = charAt(this.bp + i15);
            i15 = i16;
        }
        while (cCharAt4 != ',') {
            if (cCharAt4 == ']') {
                int i17 = this.bp + i15;
                this.bp = i17;
                this.f37888ch = charAt(i17);
                this.matchStat = 5;
                this.token = 15;
                return 0;
            }
            if (!isWhitespace(cCharAt4)) {
                this.matchStat = -1;
                return 0;
            }
            int i18 = i15 + 1;
            cCharAt4 = charAt(this.bp + i15);
            i15 = i18;
        }
        int i19 = this.bp + i15;
        this.bp = i19;
        this.f37888ch = charAt(i19);
        this.matchStat = 5;
        this.token = 16;
        return 0;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public long scanLong(char c10) {
        int i10;
        int i11;
        char cCharAt;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.bp + 0);
        boolean z10 = cCharAt2 == '\"';
        if (z10) {
            cCharAt2 = charAt(this.bp + 1);
            i10 = 2;
        } else {
            i10 = 1;
        }
        boolean z11 = cCharAt2 == '-';
        if (z11) {
            cCharAt2 = charAt(this.bp + i10);
            i10++;
        }
        if (cCharAt2 >= '0' && cCharAt2 <= '9') {
            long j10 = cCharAt2 - '0';
            while (true) {
                i11 = i10 + 1;
                cCharAt = charAt(this.bp + i10);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                j10 = (j10 * 10) + ((long) (cCharAt - '0'));
                i10 = i11;
            }
            if (cCharAt == '.') {
                this.matchStat = -1;
                return 0L;
            }
            if (!(j10 >= 0 || (j10 == Long.MIN_VALUE && z11))) {
                throw new NumberFormatException(subString(this.bp, i11 - 1));
            }
            if (z10) {
                if (cCharAt != '\"') {
                    this.matchStat = -1;
                    return 0L;
                }
                cCharAt = charAt(this.bp + i11);
                i11++;
            }
            while (cCharAt != c10) {
                if (!isWhitespace(cCharAt)) {
                    this.matchStat = -1;
                    return j10;
                }
                cCharAt = charAt(this.bp + i11);
                i11++;
            }
            int i12 = this.bp + i11;
            this.bp = i12;
            this.f37888ch = charAt(i12);
            this.matchStat = 3;
            this.token = 16;
            return z11 ? -j10 : j10;
        }
        if (cCharAt2 != 'n' || charAt(this.bp + i10) != 'u' || charAt(this.bp + i10 + 1) != 'l' || charAt(this.bp + i10 + 2) != 'l') {
            this.matchStat = -1;
            return 0L;
        }
        this.matchStat = 5;
        int i13 = i10 + 3;
        int i14 = i13 + 1;
        char cCharAt3 = charAt(this.bp + i13);
        if (z10 && cCharAt3 == '\"') {
            int i15 = i14 + 1;
            cCharAt3 = charAt(this.bp + i14);
            i14 = i15;
        }
        while (cCharAt3 != ',') {
            if (cCharAt3 == ']') {
                int i16 = this.bp + i14;
                this.bp = i16;
                this.f37888ch = charAt(i16);
                this.matchStat = 5;
                this.token = 15;
                return 0L;
            }
            if (!isWhitespace(cCharAt3)) {
                this.matchStat = -1;
                return 0L;
            }
            int i17 = i14 + 1;
            cCharAt3 = charAt(this.bp + i14);
            i14 = i17;
        }
        int i18 = this.bp + i14;
        this.bp = i18;
        this.f37888ch = charAt(i18);
        this.matchStat = 5;
        this.token = 16;
        return 0L;
    }

    public final void scanNullOrNew() {
        if (this.f37888ch != 'n') {
            throw new JSONException("error parse null or new");
        }
        next();
        char c10 = this.f37888ch;
        if (c10 != 'u') {
            if (c10 != 'e') {
                throw new JSONException("error parse new");
            }
            next();
            if (this.f37888ch != 'w') {
                throw new JSONException("error parse new");
            }
            next();
            char c11 = this.f37888ch;
            if (c11 != ' ' && c11 != ',' && c11 != '}' && c11 != ']' && c11 != '\n' && c11 != '\r' && c11 != '\t' && c11 != 26 && c11 != '\f' && c11 != '\b') {
                throw new JSONException("scan new error");
            }
            this.token = 9;
            return;
        }
        next();
        if (this.f37888ch != 'l') {
            throw new JSONException("error parse null");
        }
        next();
        if (this.f37888ch != 'l') {
            throw new JSONException("error parse null");
        }
        next();
        char c12 = this.f37888ch;
        if (c12 != ' ' && c12 != ',' && c12 != '}' && c12 != ']' && c12 != '\n' && c12 != '\r' && c12 != '\t' && c12 != 26 && c12 != '\f' && c12 != '\b') {
            throw new JSONException("scan null error");
        }
        this.token = 8;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanNumber() {
        char c10;
        char c11;
        this.np = this.bp;
        boolean z10 = true;
        if (this.f37888ch == '-') {
            this.sp++;
            next();
        }
        while (true) {
            c10 = this.f37888ch;
            if (c10 < '0' || c10 > '9') {
                break;
            }
            this.sp++;
            next();
        }
        boolean z11 = false;
        if (c10 == '.') {
            this.sp++;
            next();
            while (true) {
                char c12 = this.f37888ch;
                if (c12 < '0' || c12 > '9') {
                    break;
                }
                this.sp++;
                next();
            }
            z11 = true;
        }
        char c13 = this.f37888ch;
        if (c13 != 'L' && c13 != 'S' && c13 != 'B') {
            if (c13 == 'F' || c13 == 'D') {
                this.sp++;
                next();
            } else if (c13 == 'e' || c13 == 'E') {
                this.sp++;
                next();
                char c14 = this.f37888ch;
                if (c14 == '+' || c14 == '-') {
                    this.sp++;
                    next();
                }
                while (true) {
                    c11 = this.f37888ch;
                    if (c11 < '0' || c11 > '9') {
                        break;
                    }
                    this.sp++;
                    next();
                }
                if (c11 == 'D' || c11 == 'F') {
                    this.sp++;
                    next();
                }
            }
            if (z10) {
                this.token = 3;
            } else {
                this.token = 2;
            }
        }
        this.sp++;
        next();
        z10 = z11;
        if (z10) {
            this.token = 3;
        } else {
            this.token = 2;
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanString(char c10) {
        this.matchStat = 0;
        char cCharAt = charAt(this.bp + 0);
        if (cCharAt == 'n') {
            if (charAt(this.bp + 1) != 'u' || charAt(this.bp + 1 + 1) != 'l' || charAt(this.bp + 1 + 2) != 'l') {
                this.matchStat = -1;
                return null;
            }
            if (charAt(this.bp + 4) != c10) {
                this.matchStat = -1;
                return null;
            }
            int i10 = this.bp + 5;
            this.bp = i10;
            this.f37888ch = charAt(i10);
            this.matchStat = 3;
            return null;
        }
        int i11 = 1;
        while (cCharAt != '\"') {
            if (!isWhitespace(cCharAt)) {
                this.matchStat = -1;
                return stringDefaultValue();
            }
            cCharAt = charAt(this.bp + i11);
            i11++;
        }
        int i12 = this.bp + i11;
        int iIndexOf = indexOf(y.f128593b, i12);
        if (iIndexOf == -1) {
            throw new JSONException("unclosed str");
        }
        String strSubString = subString(this.bp + i11, iIndexOf - i12);
        if (strSubString.indexOf(92) != -1) {
            while (true) {
                int i13 = 0;
                for (int i14 = iIndexOf - 1; i14 >= 0 && charAt(i14) == '\\'; i14--) {
                    i13++;
                }
                if (i13 % 2 == 0) {
                    break;
                }
                iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
            }
            int i15 = iIndexOf - i12;
            strSubString = readString(sub_chars(this.bp + 1, i15), i15);
        }
        int i16 = i11 + (iIndexOf - i12) + 1;
        int i17 = i16 + 1;
        char cCharAt2 = charAt(this.bp + i16);
        while (cCharAt2 != c10) {
            if (!isWhitespace(cCharAt2)) {
                this.matchStat = -1;
                return strSubString;
            }
            cCharAt2 = charAt(this.bp + i17);
            i17++;
        }
        int i18 = this.bp + i17;
        this.bp = i18;
        this.f37888ch = charAt(i18);
        this.matchStat = 3;
        return strSubString;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void scanString() {
        this.np = this.bp;
        this.hasSpecial = false;
        while (true) {
            char next = next();
            if (next == '\"') {
                this.token = 4;
                this.f37888ch = next();
                return;
            }
            if (next == 26) {
                if (isEOF()) {
                    throw new JSONException("unclosed string : " + next);
                }
                putChar(JSONLexer.EOI);
            } else if (next == '\\') {
                if (!this.hasSpecial) {
                    this.hasSpecial = true;
                    int i10 = this.sp;
                    char[] cArr = this.sbuf;
                    if (i10 >= cArr.length) {
                        int length = cArr.length * 2;
                        if (i10 <= length) {
                            i10 = length;
                        }
                        char[] cArr2 = new char[i10];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.sbuf = cArr2;
                    }
                    copyTo(this.np + 1, this.sp, this.sbuf);
                }
                char next2 = next();
                if (next2 == '\"') {
                    putChar(y.f128593b);
                } else if (next2 != '\'') {
                    if (next2 != 'F') {
                        if (next2 == '\\') {
                            putChar(IOUtils.DIR_SEPARATOR_WINDOWS);
                        } else if (next2 == 'b') {
                            putChar('\b');
                        } else if (next2 != 'f') {
                            if (next2 == 'n') {
                                putChar('\n');
                            } else if (next2 == 'r') {
                                putChar('\r');
                            } else if (next2 != 'x') {
                                switch (next2) {
                                    case '/':
                                        putChar(IOUtils.DIR_SEPARATOR_UNIX);
                                        break;
                                    case '0':
                                        putChar((char) 0);
                                        break;
                                    case '1':
                                        putChar((char) 1);
                                        break;
                                    case '2':
                                        putChar((char) 2);
                                        break;
                                    case '3':
                                        putChar((char) 3);
                                        break;
                                    case '4':
                                        putChar((char) 4);
                                        break;
                                    case '5':
                                        putChar((char) 5);
                                        break;
                                    case '6':
                                        putChar((char) 6);
                                        break;
                                    case '7':
                                        putChar((char) 7);
                                        break;
                                    default:
                                        switch (next2) {
                                            case 't':
                                                putChar('\t');
                                                break;
                                            case 'u':
                                                putChar((char) Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16));
                                                break;
                                            case 'v':
                                                putChar((char) 11);
                                                break;
                                            default:
                                                this.f37888ch = next2;
                                                throw new JSONException("unclosed string : " + next2);
                                        }
                                        break;
                                }
                            } else {
                                char next3 = next();
                                char next4 = next();
                                int[] iArr = digits;
                                putChar((char) ((iArr[next3] * 16) + iArr[next4]));
                            }
                        }
                    }
                    putChar('\f');
                } else {
                    putChar('\'');
                }
            } else if (this.hasSpecial) {
                int i11 = this.sp;
                char[] cArr3 = this.sbuf;
                if (i11 == cArr3.length) {
                    putChar(next);
                } else {
                    this.sp = i11 + 1;
                    cArr3[i11] = next;
                }
            } else {
                this.sp++;
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void scanStringArray(Collection<String> collection, char c10) {
        int i10;
        char cCharAt;
        int i11;
        char cCharAt2;
        this.matchStat = 0;
        char cCharAt3 = charAt(this.bp + 0);
        char c11 = 'u';
        char c12 = 'n';
        if (cCharAt3 == 'n' && charAt(this.bp + 1) == 'u' && charAt(this.bp + 1 + 1) == 'l' && charAt(this.bp + 1 + 2) == 'l' && charAt(this.bp + 1 + 3) == c10) {
            int i12 = this.bp + 5;
            this.bp = i12;
            this.f37888ch = charAt(i12);
            this.matchStat = 5;
            return;
        }
        if (cCharAt3 != '[') {
            this.matchStat = -1;
            return;
        }
        char cCharAt4 = charAt(this.bp + 1);
        int i13 = 2;
        while (true) {
            if (cCharAt4 == c12 && charAt(this.bp + i13) == c11 && charAt(this.bp + i13 + 1) == 'l' && charAt(this.bp + i13 + 2) == 'l') {
                int i14 = i13 + 3;
                i10 = i14 + 1;
                cCharAt = charAt(this.bp + i14);
                collection.add(null);
            } else {
                if (cCharAt4 == ']' && collection.size() == 0) {
                    i11 = i13 + 1;
                    cCharAt2 = charAt(this.bp + i13);
                    break;
                }
                if (cCharAt4 != '\"') {
                    this.matchStat = -1;
                    return;
                }
                int i15 = this.bp + i13;
                int iIndexOf = indexOf(y.f128593b, i15);
                if (iIndexOf == -1) {
                    throw new JSONException("unclosed str");
                }
                String strSubString = subString(this.bp + i13, iIndexOf - i15);
                if (strSubString.indexOf(92) != -1) {
                    while (true) {
                        int i16 = 0;
                        for (int i17 = iIndexOf - 1; i17 >= 0 && charAt(i17) == '\\'; i17--) {
                            i16++;
                        }
                        if (i16 % 2 == 0) {
                            break;
                        } else {
                            iIndexOf = indexOf(y.f128593b, iIndexOf + 1);
                        }
                    }
                    int i18 = iIndexOf - i15;
                    strSubString = readString(sub_chars(this.bp + i13, i18), i18);
                }
                int i19 = this.bp;
                int i20 = i13 + (iIndexOf - (i19 + i13)) + 1;
                i10 = i20 + 1;
                cCharAt = charAt(i19 + i20);
                collection.add(strSubString);
            }
            if (cCharAt != ',') {
                if (cCharAt == ']') {
                    i11 = i10 + 1;
                    cCharAt2 = charAt(this.bp + i10);
                    break;
                } else {
                    this.matchStat = -1;
                    return;
                }
            }
            i13 = i10 + 1;
            cCharAt4 = charAt(this.bp + i10);
            c11 = 'u';
            c12 = 'n';
        }
        if (cCharAt2 != c10) {
            this.matchStat = -1;
            return;
        }
        int i21 = this.bp + i11;
        this.bp = i21;
        this.f37888ch = charAt(i21);
        this.matchStat = 3;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbol(SymbolTable symbolTable) {
        skipWhitespace();
        char c10 = this.f37888ch;
        if (c10 == '\"') {
            return scanSymbol(symbolTable, y.f128593b);
        }
        if (c10 == '\'') {
            if (isEnabled(Feature.AllowSingleQuotes)) {
                return scanSymbol(symbolTable, '\'');
            }
            throw new JSONException("syntax error");
        }
        if (c10 == '}') {
            next();
            this.token = 13;
            return null;
        }
        if (c10 == ',') {
            next();
            this.token = 16;
            return null;
        }
        if (c10 == 26) {
            this.token = 20;
            return null;
        }
        if (isEnabled(Feature.AllowUnQuotedFieldNames)) {
            return scanSymbolUnQuoted(symbolTable);
        }
        throw new JSONException("syntax error");
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbol(SymbolTable symbolTable, char c10) {
        String strAddSymbol;
        this.np = this.bp;
        this.sp = 0;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            char next = next();
            if (next == c10) {
                this.token = 4;
                if (z10) {
                    strAddSymbol = symbolTable.addSymbol(this.sbuf, 0, this.sp, i10);
                } else {
                    int i11 = this.np;
                    strAddSymbol = addSymbol(i11 == -1 ? 0 : i11 + 1, this.sp, i10, symbolTable);
                }
                this.sp = 0;
                next();
                return strAddSymbol;
            }
            if (next == 26) {
                throw new JSONException("unclosed.str");
            }
            if (next == '\\') {
                if (!z10) {
                    int i12 = this.sp;
                    char[] cArr = this.sbuf;
                    if (i12 >= cArr.length) {
                        int length = cArr.length * 2;
                        if (i12 <= length) {
                            i12 = length;
                        }
                        char[] cArr2 = new char[i12];
                        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                        this.sbuf = cArr2;
                    }
                    arrayCopy(this.np + 1, this.sbuf, 0, this.sp);
                    z10 = true;
                }
                char next2 = next();
                if (next2 == '\"') {
                    i10 = (i10 * 31) + 34;
                    putChar(y.f128593b);
                } else if (next2 != '\'') {
                    if (next2 != 'F') {
                        if (next2 == '\\') {
                            i10 = (i10 * 31) + 92;
                            putChar(IOUtils.DIR_SEPARATOR_WINDOWS);
                        } else if (next2 == 'b') {
                            i10 = (i10 * 31) + 8;
                            putChar('\b');
                        } else if (next2 != 'f') {
                            if (next2 == 'n') {
                                i10 = (i10 * 31) + 10;
                                putChar('\n');
                            } else if (next2 == 'r') {
                                i10 = (i10 * 31) + 13;
                                putChar('\r');
                            } else if (next2 != 'x') {
                                switch (next2) {
                                    case '/':
                                        i10 = (i10 * 31) + 47;
                                        putChar(IOUtils.DIR_SEPARATOR_UNIX);
                                        break;
                                    case '0':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 0);
                                        break;
                                    case '1':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 1);
                                        break;
                                    case '2':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 2);
                                        break;
                                    case '3':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 3);
                                        break;
                                    case '4':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 4);
                                        break;
                                    case '5':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 5);
                                        break;
                                    case '6':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 6);
                                        break;
                                    case '7':
                                        i10 = (i10 * 31) + next2;
                                        putChar((char) 7);
                                        break;
                                    default:
                                        switch (next2) {
                                            case 't':
                                                i10 = (i10 * 31) + 9;
                                                putChar('\t');
                                                break;
                                            case 'u':
                                                int i13 = Integer.parseInt(new String(new char[]{next(), next(), next(), next()}), 16);
                                                i10 = (i10 * 31) + i13;
                                                putChar((char) i13);
                                                break;
                                            case 'v':
                                                i10 = (i10 * 31) + 11;
                                                putChar((char) 11);
                                                break;
                                            default:
                                                this.f37888ch = next2;
                                                throw new JSONException("unclosed.str.lit");
                                        }
                                        break;
                                }
                            } else {
                                char next3 = next();
                                this.f37888ch = next3;
                                char next4 = next();
                                this.f37888ch = next4;
                                int[] iArr = digits;
                                char c11 = (char) ((iArr[next3] * 16) + iArr[next4]);
                                i10 = (i10 * 31) + c11;
                                putChar(c11);
                            }
                        }
                    }
                    i10 = (i10 * 31) + 12;
                    putChar('\f');
                } else {
                    i10 = (i10 * 31) + 39;
                    putChar('\'');
                }
            } else {
                i10 = (i10 * 31) + next;
                if (z10) {
                    int i14 = this.sp;
                    char[] cArr3 = this.sbuf;
                    if (i14 == cArr3.length) {
                        putChar(next);
                    } else {
                        this.sp = i14 + 1;
                        cArr3[i14] = next;
                    }
                } else {
                    this.sp++;
                }
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        if (this.token == 1 && this.pos == 0 && this.bp == 1) {
            this.bp = 0;
        }
        boolean[] zArr = com.alibaba.fastjson.util.IOUtils.firstIdentifierFlags;
        int i10 = this.f37888ch;
        if (!(i10 >= zArr.length || zArr[i10])) {
            throw new JSONException("illegal identifier : " + this.f37888ch + info());
        }
        boolean[] zArr2 = com.alibaba.fastjson.util.IOUtils.identifierFlags;
        this.np = this.bp;
        this.sp = 1;
        while (true) {
            char next = next();
            if (next < zArr2.length && !zArr2[next]) {
                break;
            }
            i10 = (i10 * 31) + next;
            this.sp++;
        }
        this.f37888ch = charAt(this.bp);
        this.token = 18;
        if (this.sp == 4 && i10 == 3392903 && charAt(this.np) == 'n' && charAt(this.np + 1) == 'u' && charAt(this.np + 2) == 'l' && charAt(this.np + 3) == 'l') {
            return null;
        }
        return symbolTable == null ? subString(this.np, this.sp) : addSymbol(this.np, this.sp, i10, symbolTable);
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public String scanSymbolWithSeperator(SymbolTable symbolTable, char c10) {
        int i10 = 0;
        this.matchStat = 0;
        char cCharAt = charAt(this.bp + 0);
        if (cCharAt == 'n') {
            if (charAt(this.bp + 1) != 'u' || charAt(this.bp + 1 + 1) != 'l' || charAt(this.bp + 1 + 2) != 'l') {
                this.matchStat = -1;
                return null;
            }
            if (charAt(this.bp + 4) != c10) {
                this.matchStat = -1;
                return null;
            }
            int i11 = this.bp + 5;
            this.bp = i11;
            this.f37888ch = charAt(i11);
            this.matchStat = 3;
            return null;
        }
        if (cCharAt != '\"') {
            this.matchStat = -1;
            return null;
        }
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = charAt(this.bp + i12);
            if (cCharAt2 == '\"') {
                int i14 = this.bp;
                int i15 = i14 + 0 + 1;
                String strAddSymbol = addSymbol(i15, ((i14 + i13) - i15) - 1, i10, symbolTable);
                int i16 = i13 + 1;
                char cCharAt3 = charAt(this.bp + i13);
                while (cCharAt3 != c10) {
                    if (!isWhitespace(cCharAt3)) {
                        this.matchStat = -1;
                        return strAddSymbol;
                    }
                    cCharAt3 = charAt(this.bp + i16);
                    i16++;
                }
                int i17 = this.bp + i16;
                this.bp = i17;
                this.f37888ch = charAt(i17);
                this.matchStat = 3;
                return strAddSymbol;
            }
            i10 = (i10 * 31) + cCharAt2;
            if (cCharAt2 == '\\') {
                this.matchStat = -1;
                return null;
            }
            i12 = i13;
        }
    }

    public final void scanTrue() {
        if (this.f37888ch != 't') {
            throw new JSONException("error parse true");
        }
        next();
        if (this.f37888ch != 'r') {
            throw new JSONException("error parse true");
        }
        next();
        if (this.f37888ch != 'u') {
            throw new JSONException("error parse true");
        }
        next();
        if (this.f37888ch != 'e') {
            throw new JSONException("error parse true");
        }
        next();
        char c10 = this.f37888ch;
        if (c10 != ' ' && c10 != ',' && c10 != '}' && c10 != ']' && c10 != '\n' && c10 != '\r' && c10 != '\t' && c10 != 26 && c10 != '\f' && c10 != '\b' && c10 != ':' && c10 != '/') {
            throw new JSONException("scan true error");
        }
        this.token = 6;
    }

    public final int scanType(String str) {
        this.matchStat = 0;
        char[] cArr = typeFieldName;
        if (!charArrayCompare(cArr)) {
            return -2;
        }
        int length = this.bp + cArr.length;
        int length2 = str.length();
        for (int i10 = 0; i10 < length2; i10++) {
            if (str.charAt(i10) != charAt(length + i10)) {
                return -1;
            }
        }
        int i11 = length + length2;
        if (charAt(i11) != '\"') {
            return -1;
        }
        int i12 = i11 + 1;
        char cCharAt = charAt(i12);
        this.f37888ch = cCharAt;
        if (cCharAt == ',') {
            int i13 = i12 + 1;
            this.f37888ch = charAt(i13);
            this.bp = i13;
            this.token = 16;
            return 3;
        }
        if (cCharAt == '}') {
            i12++;
            char cCharAt2 = charAt(i12);
            this.f37888ch = cCharAt2;
            if (cCharAt2 == ',') {
                this.token = 16;
                i12++;
                this.f37888ch = charAt(i12);
            } else if (cCharAt2 == ']') {
                this.token = 15;
                i12++;
                this.f37888ch = charAt(i12);
            } else if (cCharAt2 == '}') {
                this.token = 13;
                i12++;
                this.f37888ch = charAt(i12);
            } else {
                if (cCharAt2 != 26) {
                    return -1;
                }
                this.token = 20;
            }
            this.matchStat = 4;
        }
        this.bp = i12;
        return this.matchStat;
    }

    public UUID scanUUID(char c10) {
        int i10;
        char cCharAt;
        UUID uuid;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        this.matchStat = 0;
        char cCharAt2 = charAt(this.bp + 0);
        int i24 = 13;
        char c11 = 4;
        if (cCharAt2 == '\"') {
            int iIndexOf = indexOf(y.f128593b, this.bp + 1);
            if (iIndexOf == -1) {
                throw new JSONException("unclosed str");
            }
            int i25 = this.bp + 1;
            int i26 = iIndexOf - i25;
            char c12 = 'f';
            char c13 = 'A';
            char c14 = 'a';
            if (i26 == 36) {
                int i27 = 0;
                long j10 = 0;
                while (i27 < 8) {
                    char cCharAt3 = charAt(i25 + i27);
                    if (cCharAt3 < '0' || cCharAt3 > '9') {
                        if (cCharAt3 >= 'a' && cCharAt3 <= c12) {
                            i22 = cCharAt3 - 'a';
                        } else {
                            if (cCharAt3 < 'A' || cCharAt3 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i22 = cCharAt3 - 'A';
                        }
                        i23 = i22 + 10;
                    } else {
                        i23 = cCharAt3 - '0';
                    }
                    j10 = (j10 << 4) | ((long) i23);
                    i27++;
                    c12 = 'f';
                }
                int i28 = 9;
                while (i28 < i24) {
                    char cCharAt4 = charAt(i25 + i28);
                    if (cCharAt4 < '0' || cCharAt4 > '9') {
                        if (cCharAt4 >= 'a' && cCharAt4 <= 'f') {
                            i20 = cCharAt4 - 'a';
                        } else {
                            if (cCharAt4 < c13 || cCharAt4 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i20 = cCharAt4 - 'A';
                        }
                        i21 = i20 + 10;
                    } else {
                        i21 = cCharAt4 - '0';
                    }
                    j10 = (j10 << 4) | ((long) i21);
                    i28++;
                    i24 = 13;
                    c13 = 'A';
                }
                long j11 = j10;
                for (int i29 = 14; i29 < 18; i29++) {
                    char cCharAt5 = charAt(i25 + i29);
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        if (cCharAt5 >= 'a' && cCharAt5 <= 'f') {
                            i18 = cCharAt5 - 'a';
                        } else {
                            if (cCharAt5 < 'A' || cCharAt5 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i18 = cCharAt5 - 'A';
                        }
                        i19 = i18 + 10;
                    } else {
                        i19 = cCharAt5 - '0';
                    }
                    j11 = (j11 << 4) | ((long) i19);
                }
                int i30 = 19;
                long j12 = 0;
                while (i30 < 23) {
                    char cCharAt6 = charAt(i25 + i30);
                    if (cCharAt6 < '0' || cCharAt6 > '9') {
                        if (cCharAt6 >= c14 && cCharAt6 <= 'f') {
                            i16 = cCharAt6 - 'a';
                        } else {
                            if (cCharAt6 < 'A' || cCharAt6 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i16 = cCharAt6 - 'A';
                        }
                        i17 = i16 + 10;
                    } else {
                        i17 = cCharAt6 - '0';
                    }
                    j12 = (j12 << c11) | ((long) i17);
                    i30++;
                    c14 = 'a';
                    c11 = 4;
                }
                long j13 = j12;
                for (int i31 = 24; i31 < 36; i31++) {
                    char cCharAt7 = charAt(i25 + i31);
                    if (cCharAt7 < '0' || cCharAt7 > '9') {
                        if (cCharAt7 >= 'a' && cCharAt7 <= 'f') {
                            i14 = cCharAt7 - 'a';
                        } else {
                            if (cCharAt7 < 'A' || cCharAt7 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i14 = cCharAt7 - 'A';
                        }
                        i15 = i14 + 10;
                    } else {
                        i15 = cCharAt7 - '0';
                    }
                    j13 = (j13 << 4) | ((long) i15);
                }
                uuid = new UUID(j11, j13);
                int i32 = this.bp;
                int i33 = 1 + (iIndexOf - (i32 + 1)) + 1;
                i10 = i33 + 1;
                cCharAt = charAt(i32 + i33);
            } else {
                if (i26 != 32) {
                    this.matchStat = -1;
                    return null;
                }
                long j14 = 0;
                for (int i34 = 0; i34 < 16; i34++) {
                    char cCharAt8 = charAt(i25 + i34);
                    if (cCharAt8 < '0' || cCharAt8 > '9') {
                        if (cCharAt8 >= 'a' && cCharAt8 <= 'f') {
                            i12 = cCharAt8 - 'a';
                        } else {
                            if (cCharAt8 < 'A' || cCharAt8 > 'F') {
                                this.matchStat = -2;
                                return null;
                            }
                            i12 = cCharAt8 - 'A';
                        }
                        i13 = i12 + 10;
                    } else {
                        i13 = cCharAt8 - '0';
                    }
                    j14 = (j14 << 4) | ((long) i13);
                }
                int i35 = 16;
                long j15 = 0;
                for (int i36 = 32; i35 < i36; i36 = 32) {
                    char cCharAt9 = charAt(i25 + i35);
                    if (cCharAt9 >= '0' && cCharAt9 <= '9') {
                        i11 = cCharAt9 - '0';
                    } else if (cCharAt9 >= 'a' && cCharAt9 <= 'f') {
                        i11 = (cCharAt9 - 'a') + 10;
                    } else {
                        if (cCharAt9 < 'A' || cCharAt9 > 'F') {
                            this.matchStat = -2;
                            return null;
                        }
                        i11 = (cCharAt9 - 'A') + 10;
                    }
                    j15 = (j15 << 4) | ((long) i11);
                    i35++;
                }
                uuid = new UUID(j14, j15);
                int i37 = this.bp;
                int i38 = 1 + (iIndexOf - (i37 + 1)) + 1;
                i10 = i38 + 1;
                cCharAt = charAt(i37 + i38);
            }
        } else {
            if (cCharAt2 != 'n' || charAt(this.bp + 1) != 'u' || charAt(this.bp + 2) != 'l' || charAt(this.bp + 3) != 'l') {
                this.matchStat = -1;
                return null;
            }
            i10 = 5;
            cCharAt = charAt(this.bp + 4);
            uuid = null;
        }
        if (cCharAt == ',') {
            int i39 = this.bp + i10;
            this.bp = i39;
            this.f37888ch = charAt(i39);
            this.matchStat = 3;
            return uuid;
        }
        if (cCharAt != ']') {
            this.matchStat = -1;
            return null;
        }
        int i40 = i10 + 1;
        char cCharAt10 = charAt(this.bp + i10);
        if (cCharAt10 == ',') {
            this.token = 16;
            int i41 = this.bp + i40;
            this.bp = i41;
            this.f37888ch = charAt(i41);
        } else if (cCharAt10 == ']') {
            this.token = 15;
            int i42 = this.bp + i40;
            this.bp = i42;
            this.f37888ch = charAt(i42);
        } else if (cCharAt10 == '}') {
            this.token = 13;
            int i43 = this.bp + i40;
            this.bp = i43;
            this.f37888ch = charAt(i43);
        } else {
            if (cCharAt10 != 26) {
                this.matchStat = -1;
                return null;
            }
            this.token = 20;
            this.bp += i40 - 1;
            this.f37888ch = JSONLexer.EOI;
        }
        this.matchStat = 4;
        return uuid;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public void setToken(int i10) {
        this.token = i10;
    }

    protected void skipComment() {
        char c10;
        next();
        char c11 = this.f37888ch;
        if (c11 == '/') {
            do {
                next();
                c10 = this.f37888ch;
                if (c10 == '\n') {
                    next();
                    return;
                }
            } while (c10 != 26);
            return;
        }
        if (c11 != '*') {
            throw new JSONException("invalid comment");
        }
        next();
        while (true) {
            char c12 = this.f37888ch;
            if (c12 == 26) {
                return;
            }
            if (c12 == '*') {
                next();
                if (this.f37888ch == '/') {
                    next();
                    return;
                }
            } else {
                next();
            }
        }
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final void skipWhitespace() {
        while (true) {
            char c10 = this.f37888ch;
            if (c10 > '/') {
                return;
            }
            if (c10 == ' ' || c10 == '\r' || c10 == '\n' || c10 == '\t' || c10 == '\f' || c10 == '\b') {
                next();
            } else if (c10 != '/') {
                return;
            } else {
                skipComment();
            }
        }
    }

    public final String stringDefaultValue() {
        return this.stringDefaultValue;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public abstract String stringVal();

    public abstract String subString(int i10, int i11);

    protected abstract char[] sub_chars(int i10, int i11);

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final int token() {
        return this.token;
    }

    @Override // com.alibaba.fastjson.parser.JSONLexer
    public final String tokenName() {
        return JSONToken.name(this.token);
    }
}
