package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.text.y;
import n5.a;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public final class SerializeWriter extends Writer {
    private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
    private static final ThreadLocal<byte[]> bytesBufLocal = new ThreadLocal<>();
    static final int nonDirectFeatures = ((((((((SerializerFeature.UseSingleQuotes.mask | 0) | SerializerFeature.BrowserCompatible.mask) | SerializerFeature.PrettyFormat.mask) | SerializerFeature.WriteEnumUsingToString.mask) | SerializerFeature.WriteNonStringValueAsString.mask) | SerializerFeature.WriteSlashAsSpecial.mask) | SerializerFeature.IgnoreErrorGetter.mask) | SerializerFeature.WriteClassName.mask) | SerializerFeature.NotWriteDefaultValue.mask;
    protected boolean beanToArray;
    protected boolean browserSecure;
    protected char[] buf;
    protected int count;
    protected boolean disableCircularReferenceDetect;
    protected int features;
    protected char keySeperator;
    protected int maxBufSize;
    protected boolean notWriteDefaultValue;
    protected boolean quoteFieldNames;
    protected long sepcialBits;
    protected boolean sortField;
    protected boolean useSingleQuotes;
    protected boolean writeDirect;
    protected boolean writeEnumUsingName;
    protected boolean writeEnumUsingToString;
    protected boolean writeNonStringValueAsString;
    private final Writer writer;

    public SerializeWriter() {
        this((Writer) null);
    }

    public SerializeWriter(int i10) {
        this((Writer) null, i10);
    }

    public SerializeWriter(Writer writer) {
        this(writer, JSON.DEFAULT_GENERATE_FEATURE, SerializerFeature.EMPTY);
    }

    public SerializeWriter(Writer writer, int i10) {
        this.maxBufSize = -1;
        this.writer = writer;
        if (i10 > 0) {
            this.buf = new char[i10];
            computeFeatures();
        } else {
            throw new IllegalArgumentException("Negative initial size: " + i10);
        }
    }

    public SerializeWriter(Writer writer, int i10, SerializerFeature... serializerFeatureArr) {
        this.maxBufSize = -1;
        this.writer = writer;
        ThreadLocal<char[]> threadLocal = bufLocal;
        char[] cArr = threadLocal.get();
        this.buf = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        } else {
            this.buf = new char[2048];
        }
        for (SerializerFeature serializerFeature : serializerFeatureArr) {
            i10 |= serializerFeature.getMask();
        }
        this.features = i10;
        computeFeatures();
    }

    public SerializeWriter(Writer writer, SerializerFeature... serializerFeatureArr) {
        this(writer, 0, serializerFeatureArr);
    }

    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
        this((Writer) null, serializerFeatureArr);
    }

    private int encodeToUTF8(OutputStream outputStream) throws IOException {
        int i10 = (int) (((double) this.count) * 3.0d);
        ThreadLocal<byte[]> threadLocal = bytesBufLocal;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[8192];
            threadLocal.set(bArr);
        }
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        int iEncodeUTF8 = IOUtils.encodeUTF8(this.buf, 0, this.count, bArr);
        outputStream.write(bArr, 0, iEncodeUTF8);
        return iEncodeUTF8;
    }

    private byte[] encodeToUTF8Bytes() {
        int i10 = (int) (((double) this.count) * 3.0d);
        ThreadLocal<byte[]> threadLocal = bytesBufLocal;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[8192];
            threadLocal.set(bArr);
        }
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        int iEncodeUTF8 = IOUtils.encodeUTF8(this.buf, 0, this.count, bArr);
        byte[] bArr2 = new byte[iEncodeUTF8];
        System.arraycopy(bArr, 0, bArr2, 0, iEncodeUTF8);
        return bArr2;
    }

    private void writeEnumFieldValue(char c10, String str, String str2) {
        if (this.useSingleQuotes) {
            writeFieldValue(c10, str, str2);
        } else {
            writeFieldValueStringWithDoubleQuote(c10, str, str2);
        }
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
        byte[] bArr = IOUtils.specicalFlags_singleQuotes;
        int length = str.length();
        boolean z10 = true;
        int i10 = this.count + length + 1;
        int i11 = 0;
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                if (length == 0) {
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < length) {
                        char cCharAt = str.charAt(i12);
                        if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    write(39);
                }
                while (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 >= bArr.length || bArr[cCharAt2] == 0) {
                        write(cCharAt2);
                    } else {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt2]);
                    }
                    i11++;
                }
                if (z10) {
                    write(39);
                }
                write(58);
                return;
            }
            expandCapacity(i10);
        }
        if (length == 0) {
            int i13 = this.count;
            if (i13 + 3 > this.buf.length) {
                expandCapacity(i13 + 3);
            }
            char[] cArr = this.buf;
            int i14 = this.count;
            int i15 = i14 + 1;
            cArr[i14] = '\'';
            int i16 = i15 + 1;
            cArr[i15] = '\'';
            this.count = i16 + 1;
            cArr[i16] = ':';
            return;
        }
        int i17 = this.count;
        int i18 = i17 + length;
        str.getChars(0, length, this.buf, i17);
        this.count = i10;
        int i19 = i17;
        boolean z11 = false;
        while (i19 < i18) {
            char[] cArr2 = this.buf;
            char c10 = cArr2[i19];
            if (c10 < bArr.length && bArr[c10] != 0) {
                if (z11) {
                    i10++;
                    if (i10 > cArr2.length) {
                        expandCapacity(i10);
                    }
                    this.count = i10;
                    char[] cArr3 = this.buf;
                    int i20 = i19 + 1;
                    System.arraycopy(cArr3, i20, cArr3, i19 + 2, i18 - i19);
                    char[] cArr4 = this.buf;
                    cArr4[i19] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr4[i20] = IOUtils.replaceChars[c10];
                    i18++;
                    i19 = i20;
                } else {
                    i10 += 3;
                    if (i10 > cArr2.length) {
                        expandCapacity(i10);
                    }
                    this.count = i10;
                    char[] cArr5 = this.buf;
                    int i21 = i19 + 1;
                    System.arraycopy(cArr5, i21, cArr5, i19 + 3, (i18 - i19) - 1);
                    char[] cArr6 = this.buf;
                    System.arraycopy(cArr6, i11, cArr6, 1, i19);
                    char[] cArr7 = this.buf;
                    cArr7[i17] = '\'';
                    cArr7[i21] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    int i22 = i21 + 1;
                    cArr7[i22] = IOUtils.replaceChars[c10];
                    i18 += 2;
                    cArr7[this.count - 2] = '\'';
                    i19 = i22;
                    z11 = true;
                }
            }
            i19++;
            i11 = 0;
        }
        this.buf[i10 - 1] = ':';
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence) {
        String string = charSequence == null ? "null" : charSequence.toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i10, i11).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.writer != null && this.count > 0) {
            flush();
        }
        char[] cArr = this.buf;
        if (cArr.length <= 131072) {
            bufLocal.set(cArr);
        }
        this.buf = null;
    }

    protected void computeFeatures() {
        long j10;
        int i10 = this.features;
        boolean z10 = (SerializerFeature.QuoteFieldNames.mask & i10) != 0;
        this.quoteFieldNames = z10;
        boolean z11 = (SerializerFeature.UseSingleQuotes.mask & i10) != 0;
        this.useSingleQuotes = z11;
        this.sortField = (SerializerFeature.SortField.mask & i10) != 0;
        this.disableCircularReferenceDetect = (SerializerFeature.DisableCircularReferenceDetect.mask & i10) != 0;
        boolean z12 = (SerializerFeature.BeanToArray.mask & i10) != 0;
        this.beanToArray = z12;
        this.writeNonStringValueAsString = (SerializerFeature.WriteNonStringValueAsString.mask & i10) != 0;
        this.notWriteDefaultValue = (SerializerFeature.NotWriteDefaultValue.mask & i10) != 0;
        boolean z13 = (SerializerFeature.WriteEnumUsingName.mask & i10) != 0;
        this.writeEnumUsingName = z13;
        this.writeEnumUsingToString = (SerializerFeature.WriteEnumUsingToString.mask & i10) != 0;
        this.writeDirect = z10 && (nonDirectFeatures & i10) == 0 && (z12 || z13);
        this.keySeperator = z11 ? '\'' : y.f128593b;
        boolean z14 = (SerializerFeature.BrowserSecure.mask & i10) != 0;
        this.browserSecure = z14;
        if (z14) {
            j10 = 5764610843043954687L;
        } else {
            j10 = (i10 & SerializerFeature.WriteSlashAsSpecial.mask) != 0 ? 140758963191807L : 21474836479L;
        }
        this.sepcialBits = j10;
    }

    public void config(SerializerFeature serializerFeature, boolean z10) {
        if (z10) {
            int mask = this.features | serializerFeature.getMask();
            this.features = mask;
            SerializerFeature serializerFeature2 = SerializerFeature.WriteEnumUsingToString;
            if (serializerFeature == serializerFeature2) {
                this.features = (~SerializerFeature.WriteEnumUsingName.getMask()) & mask;
            } else if (serializerFeature == SerializerFeature.WriteEnumUsingName) {
                this.features = (~serializerFeature2.getMask()) & mask;
            }
        } else {
            this.features = (~serializerFeature.getMask()) & this.features;
        }
        computeFeatures();
    }

    public void expandCapacity(int i10) {
        int i11 = this.maxBufSize;
        if (i11 != -1 && i10 >= i11) {
            throw new JSONException("serialize exceeded MAX_OUTPUT_LENGTH=" + this.maxBufSize + ", minimumCapacity=" + i10);
        }
        char[] cArr = this.buf;
        int length = cArr.length + (cArr.length >> 1) + 1;
        if (length >= i10) {
            i10 = length;
        }
        char[] cArr2 = new char[i10];
        System.arraycopy(cArr, 0, cArr2, 0, this.count);
        this.buf = cArr2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        Writer writer = this.writer;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.buf, 0, this.count);
            this.writer.flush();
            this.count = 0;
        } catch (IOException e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    public int getBufferLength() {
        return this.buf.length;
    }

    public int getMaxBufSize() {
        return this.maxBufSize;
    }

    public boolean isEnabled(int i10) {
        return (i10 & this.features) != 0;
    }

    public boolean isEnabled(SerializerFeature serializerFeature) {
        return (serializerFeature.mask & this.features) != 0;
    }

    public boolean isNotWriteDefaultValue() {
        return this.notWriteDefaultValue;
    }

    public boolean isSortField() {
        return this.sortField;
    }

    public void setMaxBufSize(int i10) {
        if (i10 >= this.buf.length) {
            this.maxBufSize = i10;
            return;
        }
        throw new JSONException("must > " + this.buf.length);
    }

    public int size() {
        return this.count;
    }

    public byte[] toBytes(String str) {
        return toBytes((str == null || "UTF-8".equals(str)) ? IOUtils.UTF8 : Charset.forName(str));
    }

    public byte[] toBytes(Charset charset) {
        if (this.writer == null) {
            return charset == IOUtils.UTF8 ? encodeToUTF8Bytes() : new String(this.buf, 0, this.count).getBytes(charset);
        }
        throw new UnsupportedOperationException("writer not null");
    }

    public char[] toCharArray() {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        int i10 = this.count;
        char[] cArr = new char[i10];
        System.arraycopy(this.buf, 0, cArr, 0, i10);
        return cArr;
    }

    public char[] toCharArrayForSpringWebSocket() {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        int i10 = this.count;
        char[] cArr = new char[i10 - 2];
        System.arraycopy(this.buf, 1, cArr, 0, i10 - 2);
        return cArr;
    }

    public String toString() {
        return new String(this.buf, 0, this.count);
    }

    @Override // java.io.Writer
    public void write(int i10) {
        int i11 = 1;
        int i12 = this.count + 1;
        if (i12 <= this.buf.length) {
            i11 = i12;
        } else if (this.writer == null) {
            expandCapacity(i12);
            i11 = i12;
        } else {
            flush();
        }
        this.buf[this.count] = (char) i10;
        this.count = i11;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            writeNull();
        } else {
            write(str, 0, str.length());
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        int i12;
        int i13 = this.count + i11;
        if (i13 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i13);
            } else {
                while (true) {
                    char[] cArr = this.buf;
                    int length = cArr.length;
                    int i14 = this.count;
                    int i15 = length - i14;
                    i12 = i10 + i15;
                    str.getChars(i10, i12, cArr, i14);
                    this.count = this.buf.length;
                    flush();
                    i11 -= i15;
                    if (i11 <= this.buf.length) {
                        break;
                    } else {
                        i10 = i12;
                    }
                }
                i13 = i11;
                i10 = i12;
            }
        }
        str.getChars(i10, i11 + i10, this.buf, this.count);
        this.count = i13;
    }

    public void write(List<String> list) {
        boolean z10;
        int i10;
        if (list.isEmpty()) {
            write(t.f132643o);
            return;
        }
        int i11 = this.count;
        int size = list.size();
        int i12 = i11;
        int i13 = 0;
        while (i13 < size) {
            String str = list.get(i13);
            if (str == null) {
                z10 = true;
            } else {
                int length = str.length();
                z10 = false;
                for (int i14 = 0; i14 < length; i14++) {
                    char cCharAt = str.charAt(i14);
                    z10 = cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\\';
                    if (z10) {
                        break;
                    }
                }
            }
            if (z10) {
                this.count = i11;
                write(91);
                for (int i15 = 0; i15 < list.size(); i15++) {
                    String str2 = list.get(i15);
                    if (i15 != 0) {
                        write(44);
                    }
                    if (str2 == null) {
                        write("null");
                    } else {
                        writeStringWithDoubleQuote(str2, (char) 0);
                    }
                }
                write(93);
                return;
            }
            int length2 = str.length() + i12 + 3;
            if (i13 == list.size() - 1) {
                length2++;
            }
            if (length2 > this.buf.length) {
                this.count = i12;
                expandCapacity(length2);
            }
            if (i13 == 0) {
                i10 = i12 + 1;
                this.buf[i12] = '[';
            } else {
                i10 = i12 + 1;
                this.buf[i12] = ',';
            }
            int i16 = i10 + 1;
            this.buf[i10] = y.f128593b;
            str.getChars(0, str.length(), this.buf, i16);
            int length3 = i16 + str.length();
            this.buf[length3] = y.f128593b;
            i13++;
            i12 = length3 + 1;
        }
        this.buf[i12] = ']';
        this.count = i12 + 1;
    }

    public void write(boolean z10) {
        if (z10) {
            write("true");
        } else {
            write("false");
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > cArr.length || i11 < 0 || (i12 = i10 + i11) > cArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        int i13 = this.count + i11;
        if (i13 > this.buf.length) {
            if (this.writer == null) {
                expandCapacity(i13);
            } else {
                do {
                    char[] cArr2 = this.buf;
                    int length = cArr2.length;
                    int i14 = this.count;
                    int i15 = length - i14;
                    System.arraycopy(cArr, i10, cArr2, i14, i15);
                    this.count = this.buf.length;
                    flush();
                    i11 -= i15;
                    i10 += i15;
                } while (i11 > this.buf.length);
                i13 = i11;
            }
        }
        System.arraycopy(cArr, i10, this.buf, this.count, i11);
        this.count = i13;
    }

    public void writeByteArray(byte[] bArr) {
        if (isEnabled(SerializerFeature.WriteClassName.mask)) {
            writeHex(bArr);
            return;
        }
        int length = bArr.length;
        boolean z10 = this.useSingleQuotes;
        char c10 = z10 ? '\'' : y.f128593b;
        if (length == 0) {
            write(z10 ? "''" : "\"\"");
            return;
        }
        char[] cArr = IOUtils.CA;
        int i10 = (length / 3) * 3;
        int i11 = length - 1;
        int i12 = this.count;
        int i13 = (((i11 / 3) + 1) << 2) + i12 + 2;
        if (i13 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                int i14 = 0;
                while (i14 < i10) {
                    int i15 = i14 + 1;
                    int i16 = i15 + 1;
                    int i17 = ((bArr[i14] & 255) << 16) | ((bArr[i15] & 255) << 8) | (bArr[i16] & 255);
                    write(cArr[(i17 >>> 18) & 63]);
                    write(cArr[(i17 >>> 12) & 63]);
                    write(cArr[(i17 >>> 6) & 63]);
                    write(cArr[i17 & 63]);
                    i14 = i16 + 1;
                }
                int i18 = length - i10;
                if (i18 > 0) {
                    int i19 = ((bArr[i10] & 255) << 10) | (i18 == 2 ? (bArr[i11] & 255) << 2 : 0);
                    write(cArr[i19 >> 12]);
                    write(cArr[(i19 >>> 6) & 63]);
                    write(i18 == 2 ? cArr[i19 & 63] : '=');
                    write(61);
                }
                write(c10);
                return;
            }
            expandCapacity(i13);
        }
        this.count = i13;
        int i20 = i12 + 1;
        this.buf[i12] = c10;
        int i21 = 0;
        while (i21 < i10) {
            int i22 = i21 + 1;
            int i23 = i22 + 1;
            int i24 = ((bArr[i21] & 255) << 16) | ((bArr[i22] & 255) << 8);
            int i25 = i23 + 1;
            int i26 = i24 | (bArr[i23] & 255);
            char[] cArr2 = this.buf;
            int i27 = i20 + 1;
            cArr2[i20] = cArr[(i26 >>> 18) & 63];
            int i28 = i27 + 1;
            cArr2[i27] = cArr[(i26 >>> 12) & 63];
            int i29 = i28 + 1;
            cArr2[i28] = cArr[(i26 >>> 6) & 63];
            i20 = i29 + 1;
            cArr2[i29] = cArr[i26 & 63];
            i21 = i25;
        }
        int i30 = length - i10;
        if (i30 > 0) {
            int i31 = ((bArr[i10] & 255) << 10) | (i30 == 2 ? (bArr[i11] & 255) << 2 : 0);
            char[] cArr3 = this.buf;
            cArr3[i13 - 5] = cArr[i31 >> 12];
            cArr3[i13 - 4] = cArr[(i31 >>> 6) & 63];
            cArr3[i13 - 3] = i30 == 2 ? cArr[i31 & 63] : '=';
            cArr3[i13 - 2] = a.f132013h;
        }
        this.buf[i13 - 1] = c10;
    }

    public void writeDouble(double d10, boolean z10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            writeNull();
            return;
        }
        String string = Double.toString(d10);
        if (isEnabled(SerializerFeature.WriteNullNumberAsZero) && string.endsWith(".0")) {
            string = string.substring(0, string.length() - 2);
        }
        write(string);
        if (z10 && isEnabled(SerializerFeature.WriteClassName)) {
            write(68);
        }
    }

    public void writeEnum(Enum<?> r10) {
        if (r10 == null) {
            writeNull();
            return;
        }
        String string = null;
        if (this.writeEnumUsingName && !this.writeEnumUsingToString) {
            string = r10.name();
        } else if (this.writeEnumUsingToString) {
            string = r10.toString();
        }
        if (string == null) {
            writeInt(r10.ordinal());
            return;
        }
        int i10 = isEnabled(SerializerFeature.UseSingleQuotes) ? 39 : 34;
        write(i10);
        write(string);
        write(i10);
    }

    public void writeFieldName(String str) {
        writeFieldName(str, false);
    }

    public void writeFieldName(String str, boolean z10) {
        if (str == null) {
            write("null:");
            return;
        }
        if (this.useSingleQuotes) {
            if (!this.quoteFieldNames) {
                writeKeyWithSingleQuoteIfHasSpecial(str);
                return;
            } else {
                writeStringWithSingleQuote(str);
                write(58);
                return;
            }
        }
        if (this.quoteFieldNames) {
            writeStringWithDoubleQuote(str, ':');
            return;
        }
        boolean z11 = true;
        boolean z12 = str.length() == 0;
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                z11 = z12;
                break;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt < '@' && (this.sepcialBits & (1 << cCharAt)) != 0) || cCharAt == '\\') {
                break;
            } else {
                i10++;
            }
        }
        if (z11) {
            writeStringWithDoubleQuote(str, ':');
        } else {
            write(str);
            write(58);
        }
    }

    public void writeFieldNameDirect(String str) {
        int length = str.length();
        int i10 = this.count + length + 3;
        if (i10 > this.buf.length) {
            expandCapacity(i10);
        }
        int i11 = this.count;
        char[] cArr = this.buf;
        cArr[i11] = y.f128593b;
        str.getChars(0, length, cArr, i11 + 1);
        this.count = i10;
        char[] cArr2 = this.buf;
        cArr2[i10 - 2] = y.f128593b;
        cArr2[i10 - 1] = ':';
    }

    public void writeFieldValue(char c10, String str, char c11) {
        write(c10);
        writeFieldName(str);
        if (c11 == 0) {
            writeString("\u0000");
        } else {
            writeString(Character.toString(c11));
        }
    }

    public void writeFieldValue(char c10, String str, double d10) {
        write(c10);
        writeFieldName(str);
        writeDouble(d10, false);
    }

    public void writeFieldValue(char c10, String str, float f10) {
        write(c10);
        writeFieldName(str);
        writeFloat(f10, false);
    }

    public void writeFieldValue(char c10, String str, int i10) {
        if (i10 == Integer.MIN_VALUE || !this.quoteFieldNames) {
            write(c10);
            writeFieldName(str);
            writeInt(i10);
            return;
        }
        int iStringSize = i10 < 0 ? IOUtils.stringSize(-i10) + 1 : IOUtils.stringSize(i10);
        int length = str.length();
        int i11 = this.count + length + 4 + iStringSize;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeFieldName(str);
                writeInt(i10);
                return;
            }
            expandCapacity(i11);
        }
        int i12 = this.count;
        this.count = i11;
        char[] cArr = this.buf;
        cArr[i12] = c10;
        int i13 = i12 + length + 1;
        cArr[i12 + 1] = this.keySeperator;
        str.getChars(0, length, cArr, i12 + 2);
        char[] cArr2 = this.buf;
        cArr2[i13 + 1] = this.keySeperator;
        cArr2[i13 + 2] = ':';
        IOUtils.getChars(i10, this.count, cArr2);
    }

    public void writeFieldValue(char c10, String str, long j10) {
        if (j10 == Long.MIN_VALUE || !this.quoteFieldNames) {
            write(c10);
            writeFieldName(str);
            writeLong(j10);
            return;
        }
        int iStringSize = j10 < 0 ? IOUtils.stringSize(-j10) + 1 : IOUtils.stringSize(j10);
        int length = str.length();
        int i10 = this.count + length + 4 + iStringSize;
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeFieldName(str);
                writeLong(j10);
                return;
            }
            expandCapacity(i10);
        }
        int i11 = this.count;
        this.count = i10;
        char[] cArr = this.buf;
        cArr[i11] = c10;
        int i12 = i11 + length + 1;
        cArr[i11 + 1] = this.keySeperator;
        str.getChars(0, length, cArr, i11 + 2);
        char[] cArr2 = this.buf;
        cArr2[i12 + 1] = this.keySeperator;
        cArr2[i12 + 2] = ':';
        IOUtils.getChars(j10, this.count, cArr2);
    }

    public void writeFieldValue(char c10, String str, Enum<?> r10) {
        if (r10 == null) {
            write(c10);
            writeFieldName(str);
            writeNull();
        } else if (this.writeEnumUsingName && !this.writeEnumUsingToString) {
            writeEnumFieldValue(c10, str, r10.name());
        } else if (this.writeEnumUsingToString) {
            writeEnumFieldValue(c10, str, r10.toString());
        } else {
            writeFieldValue(c10, str, r10.ordinal());
        }
    }

    public void writeFieldValue(char c10, String str, String str2) {
        if (!this.quoteFieldNames) {
            write(c10);
            writeFieldName(str);
            if (str2 == null) {
                writeNull();
                return;
            } else {
                writeString(str2);
                return;
            }
        }
        if (this.useSingleQuotes) {
            write(c10);
            writeFieldName(str);
            if (str2 == null) {
                writeNull();
                return;
            } else {
                writeString(str2);
                return;
            }
        }
        if (!isEnabled(SerializerFeature.BrowserCompatible)) {
            writeFieldValueStringWithDoubleQuoteCheck(c10, str, str2);
            return;
        }
        write(c10);
        writeStringWithDoubleQuote(str, ':');
        writeStringWithDoubleQuote(str2, (char) 0);
    }

    public void writeFieldValue(char c10, String str, BigDecimal bigDecimal) {
        write(c10);
        writeFieldName(str);
        if (bigDecimal == null) {
            writeNull();
        } else {
            write(bigDecimal.toString());
        }
    }

    public void writeFieldValue(char c10, String str, boolean z10) {
        if (!this.quoteFieldNames) {
            write(c10);
            writeFieldName(str);
            write(z10);
            return;
        }
        int i10 = z10 ? 4 : 5;
        int length = str.length();
        int i11 = this.count + length + 4 + i10;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeString(str);
                write(58);
                write(z10);
                return;
            }
            expandCapacity(i11);
        }
        int i12 = this.count;
        this.count = i11;
        char[] cArr = this.buf;
        cArr[i12] = c10;
        int i13 = i12 + length + 1;
        cArr[i12 + 1] = this.keySeperator;
        str.getChars(0, length, cArr, i12 + 2);
        this.buf[i13 + 1] = this.keySeperator;
        if (z10) {
            System.arraycopy(":true".toCharArray(), 0, this.buf, i13 + 2, 5);
        } else {
            System.arraycopy(":false".toCharArray(), 0, this.buf, i13 + 2, 6);
        }
    }

    public void writeFieldValueStringWithDoubleQuote(char c10, String str, String str2) {
        int length = str.length();
        int i10 = this.count;
        int length2 = str2.length();
        int i11 = i10 + length + length2 + 6;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            expandCapacity(i11);
        }
        char[] cArr = this.buf;
        int i12 = this.count;
        cArr[i12] = c10;
        int i13 = i12 + 2;
        int i14 = i13 + length;
        cArr[i12 + 1] = y.f128593b;
        str.getChars(0, length, cArr, i13);
        this.count = i11;
        char[] cArr2 = this.buf;
        cArr2[i14] = y.f128593b;
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        cArr2[i15] = ':';
        cArr2[i16] = y.f128593b;
        str2.getChars(0, length2, cArr2, i16 + 1);
        this.buf[this.count - 1] = y.f128593b;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    public void writeFieldValueStringWithDoubleQuoteCheck(char c10, String str, String str2) {
        int length;
        int i10;
        int i11;
        int length2 = str.length();
        int i12 = this.count;
        if (str2 == null) {
            i10 = i12 + length2 + 8;
            length = 4;
        } else {
            length = str2.length();
            i10 = i12 + length2 + length + 6;
        }
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                write(c10);
                writeStringWithDoubleQuote(str, ':');
                writeStringWithDoubleQuote(str2, (char) 0);
                return;
            }
            expandCapacity(i10);
        }
        char[] cArr = this.buf;
        int i13 = this.count;
        cArr[i13] = c10;
        int i14 = i13 + 2;
        int i15 = i14 + length2;
        cArr[i13 + 1] = y.f128593b;
        str.getChars(0, length2, cArr, i14);
        this.count = i10;
        char[] cArr2 = this.buf;
        cArr2[i15] = y.f128593b;
        int i16 = i15 + 1;
        int i17 = i16 + 1;
        cArr2[i16] = ':';
        if (str2 == null) {
            int i18 = i17 + 1;
            cArr2[i17] = 'n';
            int i19 = i18 + 1;
            cArr2[i18] = 'u';
            cArr2[i19] = 'l';
            cArr2[i19 + 1] = 'l';
            return;
        }
        int i20 = i17 + 1;
        cArr2[i17] = y.f128593b;
        int i21 = i20 + length;
        str2.getChars(0, length, cArr2, i20);
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = 0;
        char c11 = 0;
        for (int i26 = i20; i26 < i21; i26++) {
            char c12 = this.buf[i26];
            if (c12 < ']') {
                if ((c12 < '@' && (this.sepcialBits & (1 << c12)) != 0) || c12 == '\\') {
                    i25++;
                    if (c12 == '(' || c12 == ')' || c12 == '<' || c12 == '>') {
                        i10 += 4;
                    } else {
                        byte[] bArr = IOUtils.specicalFlags_doubleQuotes;
                        if (c12 < bArr.length && bArr[c12] == 4) {
                            i10 += 4;
                        }
                    }
                    i22 = -1;
                    if (i23 == -1) {
                        i23 = i26;
                        i24 = i23;
                    } else {
                        i24 = i26;
                    }
                    c11 = c12;
                } else {
                    i22 = -1;
                }
            } else if (c12 >= 127 && (c12 == 8232 || c12 == 8233 || c12 < 160)) {
                if (i23 == i22) {
                    i23 = i26;
                }
                i25++;
                i10 += 4;
                i24 = i26;
                c11 = c12;
            }
        }
        if (i25 > 0) {
            int i27 = i10 + i25;
            if (i27 > this.buf.length) {
                expandCapacity(i27);
            }
            this.count = i27;
            if (i25 == 1) {
                if (c11 == 8232) {
                    int i28 = i24 + 1;
                    char[] cArr3 = this.buf;
                    System.arraycopy(cArr3, i28, cArr3, i24 + 6, (i21 - i24) - 1);
                    char[] cArr4 = this.buf;
                    cArr4[i24] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr4[i28] = 'u';
                    int i29 = i28 + 1;
                    cArr4[i29] = '2';
                    int i30 = i29 + 1;
                    cArr4[i30] = '0';
                    int i31 = i30 + 1;
                    cArr4[i31] = '2';
                    cArr4[i31 + 1] = '8';
                } else if (c11 == 8233) {
                    int i32 = i24 + 1;
                    char[] cArr5 = this.buf;
                    System.arraycopy(cArr5, i32, cArr5, i24 + 6, (i21 - i24) - 1);
                    char[] cArr6 = this.buf;
                    cArr6[i24] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr6[i32] = 'u';
                    int i33 = i32 + 1;
                    cArr6[i33] = '2';
                    int i34 = i33 + 1;
                    cArr6[i34] = '0';
                    int i35 = i34 + 1;
                    cArr6[i35] = '2';
                    cArr6[i35 + 1] = '9';
                } else if (c11 == '(' || c11 == ')' || c11 == '<' || c11 == '>') {
                    int i36 = i24 + 1;
                    char[] cArr7 = this.buf;
                    System.arraycopy(cArr7, i36, cArr7, i24 + 6, (i21 - i24) - 1);
                    char[] cArr8 = this.buf;
                    cArr8[i24] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    int i37 = i36 + 1;
                    cArr8[i36] = 'u';
                    int i38 = i37 + 1;
                    char[] cArr9 = IOUtils.DIGITS;
                    cArr8[i37] = cArr9[(c11 >>> '\f') & 15];
                    int i39 = i38 + 1;
                    cArr8[i38] = cArr9[(c11 >>> '\b') & 15];
                    cArr8[i39] = cArr9[(c11 >>> 4) & 15];
                    cArr8[i39 + 1] = cArr9[c11 & 15];
                } else {
                    byte[] bArr2 = IOUtils.specicalFlags_doubleQuotes;
                    if (c11 >= bArr2.length || bArr2[c11] != 4) {
                        int i40 = i24 + 1;
                        char[] cArr10 = this.buf;
                        System.arraycopy(cArr10, i40, cArr10, i24 + 2, (i21 - i24) - 1);
                        char[] cArr11 = this.buf;
                        cArr11[i24] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        cArr11[i40] = IOUtils.replaceChars[c11];
                    } else {
                        int i41 = i24 + 1;
                        char[] cArr12 = this.buf;
                        System.arraycopy(cArr12, i41, cArr12, i24 + 6, (i21 - i24) - 1);
                        char[] cArr13 = this.buf;
                        cArr13[i24] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        int i42 = i41 + 1;
                        cArr13[i41] = 'u';
                        int i43 = i42 + 1;
                        char[] cArr14 = IOUtils.DIGITS;
                        cArr13[i42] = cArr14[(c11 >>> '\f') & 15];
                        int i44 = i43 + 1;
                        cArr13[i43] = cArr14[(c11 >>> '\b') & 15];
                        cArr13[i44] = cArr14[(c11 >>> 4) & 15];
                        cArr13[i44 + 1] = cArr14[c11 & 15];
                    }
                }
            } else if (i25 > 1) {
                for (int i45 = i23 - i20; i45 < str2.length(); i45++) {
                    char cCharAt = str2.charAt(i45);
                    if (this.browserSecure) {
                        if (cCharAt != '(' && cCharAt != ')') {
                            if (cCharAt == '<' || cCharAt == '>') {
                            }
                        }
                        char[] cArr15 = this.buf;
                        int i46 = i23 + 1;
                        cArr15[i23] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        int i47 = i46 + 1;
                        cArr15[i46] = 'u';
                        int i48 = i47 + 1;
                        char[] cArr16 = IOUtils.DIGITS;
                        cArr15[i47] = cArr16[(cCharAt >>> '\f') & 15];
                        int i49 = i48 + 1;
                        cArr15[i48] = cArr16[(cCharAt >>> '\b') & 15];
                        int i50 = i49 + 1;
                        cArr15[i49] = cArr16[(cCharAt >>> 4) & 15];
                        i23 = i50 + 1;
                        cArr15[i50] = cArr16[cCharAt & 15];
                    }
                    byte[] bArr3 = IOUtils.specicalFlags_doubleQuotes;
                    if ((cCharAt >= bArr3.length || bArr3[cCharAt] == 0) && !(cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        if (cCharAt == 8232 || cCharAt == 8233) {
                            char[] cArr17 = this.buf;
                            int i51 = i23 + 1;
                            cArr17[i23] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            int i52 = i51 + 1;
                            cArr17[i51] = 'u';
                            int i53 = i52 + 1;
                            char[] cArr18 = IOUtils.DIGITS;
                            cArr17[i52] = cArr18[(cCharAt >>> '\f') & 15];
                            int i54 = i53 + 1;
                            cArr17[i53] = cArr18[(cCharAt >>> '\b') & 15];
                            int i55 = i54 + 1;
                            cArr17[i54] = cArr18[(cCharAt >>> 4) & 15];
                            i23 = i55 + 1;
                            cArr17[i55] = cArr18[cCharAt & 15];
                        } else {
                            this.buf[i23] = cCharAt;
                            i23++;
                        }
                    } else {
                        char[] cArr19 = this.buf;
                        int i56 = i23 + 1;
                        cArr19[i23] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        if (bArr3[cCharAt] == 4) {
                            int i57 = i56 + 1;
                            cArr19[i56] = 'u';
                            int i58 = i57 + 1;
                            char[] cArr20 = IOUtils.DIGITS;
                            cArr19[i57] = cArr20[(cCharAt >>> '\f') & 15];
                            int i59 = i58 + 1;
                            cArr19[i58] = cArr20[(cCharAt >>> '\b') & 15];
                            int i60 = i59 + 1;
                            cArr19[i59] = cArr20[(cCharAt >>> 4) & 15];
                            i11 = i60 + 1;
                            cArr19[i60] = cArr20[cCharAt & 15];
                        } else {
                            i11 = i56 + 1;
                            cArr19[i56] = IOUtils.replaceChars[cCharAt];
                        }
                        i23 = i11;
                    }
                }
            }
        }
        this.buf[this.count - 1] = y.f128593b;
    }

    public void writeFloat(float f10, boolean z10) {
        if (Float.isNaN(f10) || Float.isInfinite(f10)) {
            writeNull();
            return;
        }
        String string = Float.toString(f10);
        if (isEnabled(SerializerFeature.WriteNullNumberAsZero) && string.endsWith(".0")) {
            string = string.substring(0, string.length() - 2);
        }
        write(string);
        if (z10 && isEnabled(SerializerFeature.WriteClassName)) {
            write(70);
        }
    }

    public void writeHex(byte[] bArr) {
        int i10 = 2;
        int length = this.count + (bArr.length * 2) + 3;
        int i11 = 0;
        if (length > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[bArr.length + 3];
                cArr[0] = 'x';
                cArr[1] = '\'';
                while (i11 < bArr.length) {
                    int i12 = bArr[i11] & 255;
                    int i13 = i12 >> 4;
                    int i14 = i12 & 15;
                    int i15 = i10 + 1;
                    cArr[i10] = (char) (i13 + (i13 < 10 ? 48 : 55));
                    i10 = i15 + 1;
                    cArr[i15] = (char) (i14 + (i14 < 10 ? 48 : 55));
                    i11++;
                }
                cArr[i10] = '\'';
                try {
                    this.writer.write(cArr);
                    return;
                } catch (IOException e10) {
                    throw new JSONException("writeBytes error.", e10);
                }
            }
            expandCapacity(length);
        }
        char[] cArr2 = this.buf;
        int i16 = this.count;
        int i17 = i16 + 1;
        cArr2[i16] = 'x';
        this.count = i17 + 1;
        cArr2[i17] = '\'';
        while (i11 < bArr.length) {
            int i18 = bArr[i11] & 255;
            int i19 = i18 >> 4;
            int i20 = i18 & 15;
            char[] cArr3 = this.buf;
            int i21 = this.count;
            int i22 = i21 + 1;
            this.count = i22;
            cArr3[i21] = (char) (i19 + (i19 < 10 ? 48 : 55));
            this.count = i22 + 1;
            cArr3[i22] = (char) (i20 + (i20 < 10 ? 48 : 55));
            i11++;
        }
        char[] cArr4 = this.buf;
        int i23 = this.count;
        this.count = i23 + 1;
        cArr4[i23] = '\'';
    }

    public void writeInt(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int iStringSize = i10 < 0 ? IOUtils.stringSize(-i10) + 1 : IOUtils.stringSize(i10);
        int i11 = this.count + iStringSize;
        if (i11 > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[iStringSize];
                IOUtils.getChars(i10, iStringSize, cArr);
                write(cArr, 0, iStringSize);
                return;
            }
            expandCapacity(i11);
        }
        IOUtils.getChars(i10, i11, this.buf);
        this.count = i11;
    }

    public void writeLong(long j10) {
        boolean z10 = isEnabled(SerializerFeature.BrowserCompatible) && !isEnabled(SerializerFeature.WriteClassName) && (j10 > 9007199254740991L || j10 < -9007199254740991L);
        if (j10 == Long.MIN_VALUE) {
            if (z10) {
                write("\"-9223372036854775808\"");
                return;
            } else {
                write("-9223372036854775808");
                return;
            }
        }
        int iStringSize = j10 < 0 ? IOUtils.stringSize(-j10) + 1 : IOUtils.stringSize(j10);
        int i10 = this.count + iStringSize;
        if (z10) {
            i10 += 2;
        }
        if (i10 > this.buf.length) {
            if (this.writer != null) {
                char[] cArr = new char[iStringSize];
                IOUtils.getChars(j10, iStringSize, cArr);
                if (!z10) {
                    write(cArr, 0, iStringSize);
                    return;
                }
                write(34);
                write(cArr, 0, iStringSize);
                write(34);
                return;
            }
            expandCapacity(i10);
        }
        if (z10) {
            char[] cArr2 = this.buf;
            cArr2[this.count] = y.f128593b;
            int i11 = i10 - 1;
            IOUtils.getChars(j10, i11, cArr2);
            this.buf[i11] = y.f128593b;
        } else {
            IOUtils.getChars(j10, i10, this.buf);
        }
        this.count = i10;
    }

    public void writeNull() {
        write("null");
    }

    public void writeNull(int i10, int i11) {
        if ((i10 & i11) == 0 && (this.features & i11) == 0) {
            writeNull();
            return;
        }
        if (i11 == SerializerFeature.WriteNullListAsEmpty.mask) {
            write(t.f132643o);
            return;
        }
        if (i11 == SerializerFeature.WriteNullStringAsEmpty.mask) {
            writeString("");
            return;
        }
        if (i11 == SerializerFeature.WriteNullBooleanAsFalse.mask) {
            write("false");
        } else if (i11 == SerializerFeature.WriteNullNumberAsZero.mask) {
            write(48);
        } else {
            writeNull();
        }
    }

    public void writeNull(SerializerFeature serializerFeature) {
        writeNull(0, serializerFeature.mask);
    }

    public void writeString(String str) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(str);
        } else {
            writeStringWithDoubleQuote(str, (char) 0);
        }
    }

    public void writeString(String str, char c10) {
        if (!this.useSingleQuotes) {
            writeStringWithDoubleQuote(str, c10);
        } else {
            writeStringWithSingleQuote(str);
            write(c10);
        }
    }

    public void writeString(char[] cArr) {
        if (this.useSingleQuotes) {
            writeStringWithSingleQuote(cArr);
        } else {
            writeStringWithDoubleQuote(new String(cArr), (char) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    public void writeStringWithDoubleQuote(String str, char c10) {
        if (str == null) {
            writeNull();
            if (c10 != 0) {
                write(c10);
                return;
            }
            return;
        }
        int length = str.length();
        int i10 = this.count + length + 2;
        if (c10 != 0) {
            i10++;
        }
        int length2 = this.buf.length;
        char c11 = y.f128597f;
        if (i10 > length2) {
            if (this.writer != null) {
                write(34);
                int i11 = 0;
                while (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    if (isEnabled(SerializerFeature.BrowserSecure) && (cCharAt == '(' || cCharAt == ')' || cCharAt == '<' || cCharAt == c11)) {
                        write(92);
                        write(117);
                        char[] cArr = IOUtils.DIGITS;
                        write(cArr[(cCharAt >>> '\f') & 15]);
                        write(cArr[(cCharAt >>> '\b') & 15]);
                        write(cArr[(cCharAt >>> 4) & 15]);
                        write(cArr[cCharAt & 15]);
                    } else if (!isEnabled(SerializerFeature.BrowserCompatible)) {
                        byte[] bArr = IOUtils.specicalFlags_doubleQuotes;
                        if ((cCharAt >= bArr.length || bArr[cCharAt] == 0) && !(cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                            write(cCharAt);
                        } else {
                            write(92);
                            if (bArr[cCharAt] == 4) {
                                write(117);
                                char[] cArr2 = IOUtils.DIGITS;
                                write(cArr2[(cCharAt >>> '\f') & 15]);
                                write(cArr2[(cCharAt >>> '\b') & 15]);
                                write(cArr2[(cCharAt >>> 4) & 15]);
                                write(cArr2[cCharAt & 15]);
                            } else {
                                write(IOUtils.replaceChars[cCharAt]);
                            }
                        }
                    } else if (cCharAt == '\b' || cCharAt == '\f' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\"' || cCharAt == '/' || cCharAt == '\\') {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt]);
                    } else if (cCharAt < ' ') {
                        write(92);
                        write(117);
                        write(48);
                        write(48);
                        char[] cArr3 = IOUtils.ASCII_CHARS;
                        int i12 = cCharAt * 2;
                        write(cArr3[i12]);
                        write(cArr3[i12 + 1]);
                    } else if (cCharAt >= 127) {
                        write(92);
                        write(117);
                        char[] cArr4 = IOUtils.DIGITS;
                        write(cArr4[(cCharAt >>> '\f') & 15]);
                        write(cArr4[(cCharAt >>> '\b') & 15]);
                        write(cArr4[(cCharAt >>> 4) & 15]);
                        write(cArr4[cCharAt & 15]);
                    } else {
                        write(cCharAt);
                    }
                    i11++;
                    c11 = y.f128597f;
                }
                write(34);
                if (c10 != 0) {
                    write(c10);
                    return;
                }
                return;
            }
            expandCapacity(i10);
        }
        int i13 = this.count;
        int i14 = i13 + 1;
        int i15 = i14 + length;
        char[] cArr5 = this.buf;
        cArr5[i13] = y.f128593b;
        str.getChars(0, length, cArr5, i14);
        this.count = i10;
        int i16 = -1;
        if (isEnabled(SerializerFeature.BrowserCompatible)) {
            for (int i17 = i14; i17 < i15; i17++) {
                char c12 = this.buf[i17];
                if (c12 == '\"' || c12 == '/' || c12 == '\\' || c12 == '\b' || c12 == '\f' || c12 == '\n' || c12 == '\r' || c12 == '\t') {
                    i10++;
                } else {
                    if (c12 < ' ' || c12 >= 127) {
                        i10 += 5;
                    }
                }
                i16 = i17;
            }
            if (i10 > this.buf.length) {
                expandCapacity(i10);
            }
            this.count = i10;
            while (i16 >= i14) {
                char[] cArr6 = this.buf;
                char c13 = cArr6[i16];
                if (c13 == '\b' || c13 == '\f' || c13 == '\n' || c13 == '\r' || c13 == '\t') {
                    int i18 = i16 + 1;
                    System.arraycopy(cArr6, i18, cArr6, i16 + 2, (i15 - i16) - 1);
                    char[] cArr7 = this.buf;
                    cArr7[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr7[i18] = IOUtils.replaceChars[c13];
                } else {
                    if (c13 == '\"' || c13 == '/' || c13 == '\\') {
                        int i19 = i16 + 1;
                        System.arraycopy(cArr6, i19, cArr6, i16 + 2, (i15 - i16) - 1);
                        char[] cArr8 = this.buf;
                        cArr8[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        cArr8[i19] = c13;
                    } else {
                        if (c13 < ' ') {
                            int i20 = i16 + 1;
                            System.arraycopy(cArr6, i20, cArr6, i16 + 6, (i15 - i16) - 1);
                            char[] cArr9 = this.buf;
                            cArr9[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            cArr9[i20] = 'u';
                            cArr9[i16 + 2] = '0';
                            cArr9[i16 + 3] = '0';
                            char[] cArr10 = IOUtils.ASCII_CHARS;
                            int i21 = c13 * 2;
                            cArr9[i16 + 4] = cArr10[i21];
                            cArr9[i16 + 5] = cArr10[i21 + 1];
                        } else if (c13 >= 127) {
                            int i22 = i16 + 1;
                            System.arraycopy(cArr6, i22, cArr6, i16 + 6, (i15 - i16) - 1);
                            char[] cArr11 = this.buf;
                            cArr11[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            cArr11[i22] = 'u';
                            char[] cArr12 = IOUtils.DIGITS;
                            cArr11[i16 + 2] = cArr12[(c13 >>> '\f') & 15];
                            cArr11[i16 + 3] = cArr12[(c13 >>> '\b') & 15];
                            cArr11[i16 + 4] = cArr12[(c13 >>> 4) & 15];
                            cArr11[i16 + 5] = cArr12[c13 & 15];
                        }
                        i15 += 5;
                    }
                    i16--;
                }
                i15++;
                i16--;
            }
            if (c10 == 0) {
                this.buf[this.count - 1] = y.f128593b;
                return;
            }
            char[] cArr13 = this.buf;
            int i23 = this.count;
            cArr13[i23 - 2] = y.f128593b;
            cArr13[i23 - 1] = c10;
            return;
        }
        int i24 = 0;
        char c14 = 0;
        int i25 = -1;
        int i26 = -1;
        for (int i27 = i14; i27 < i15; i27++) {
            char c15 = this.buf[i27];
            if (c15 < ']') {
                if ((c15 < '@' && (this.sepcialBits & (1 << c15)) != 0) || c15 == '\\') {
                    i24++;
                    if (c15 == '(' || c15 == ')' || c15 == '<' || c15 == '>') {
                        i10 += 4;
                    } else {
                        byte[] bArr2 = IOUtils.specicalFlags_doubleQuotes;
                        if (c15 < bArr2.length && bArr2[c15] == 4) {
                            i10 += 4;
                        }
                    }
                    i16 = -1;
                    if (i25 == -1) {
                        i25 = i27;
                        i26 = i25;
                    } else {
                        i26 = i27;
                    }
                    c14 = c15;
                } else {
                    i16 = -1;
                }
            } else if (c15 >= 127 && (c15 == 8232 || c15 == 8233 || c15 < 160)) {
                if (i25 == i16) {
                    i25 = i27;
                }
                i24++;
                i10 += 4;
                i26 = i27;
                c14 = c15;
            }
        }
        if (i24 > 0) {
            int i28 = i10 + i24;
            if (i28 > this.buf.length) {
                expandCapacity(i28);
            }
            this.count = i28;
            if (i24 == 1) {
                if (c14 == 8232) {
                    int i29 = i26 + 1;
                    char[] cArr14 = this.buf;
                    System.arraycopy(cArr14, i29, cArr14, i26 + 6, (i15 - i26) - 1);
                    char[] cArr15 = this.buf;
                    cArr15[i26] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr15[i29] = 'u';
                    int i30 = i29 + 1;
                    cArr15[i30] = '2';
                    int i31 = i30 + 1;
                    cArr15[i31] = '0';
                    int i32 = i31 + 1;
                    cArr15[i32] = '2';
                    cArr15[i32 + 1] = '8';
                } else if (c14 == 8233) {
                    int i33 = i26 + 1;
                    char[] cArr16 = this.buf;
                    System.arraycopy(cArr16, i33, cArr16, i26 + 6, (i15 - i26) - 1);
                    char[] cArr17 = this.buf;
                    cArr17[i26] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr17[i33] = 'u';
                    int i34 = i33 + 1;
                    cArr17[i34] = '2';
                    int i35 = i34 + 1;
                    cArr17[i35] = '0';
                    int i36 = i35 + 1;
                    cArr17[i36] = '2';
                    cArr17[i36 + 1] = '9';
                } else if (c14 == '(' || c14 == ')' || c14 == '<' || c14 == '>') {
                    int i37 = i26 + 1;
                    char[] cArr18 = this.buf;
                    System.arraycopy(cArr18, i37, cArr18, i26 + 6, (i15 - i26) - 1);
                    char[] cArr19 = this.buf;
                    cArr19[i26] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr19[i37] = 'u';
                    int i38 = i37 + 1;
                    char[] cArr20 = IOUtils.DIGITS;
                    cArr19[i38] = cArr20[(c14 >>> '\f') & 15];
                    int i39 = i38 + 1;
                    cArr19[i39] = cArr20[(c14 >>> '\b') & 15];
                    int i40 = i39 + 1;
                    cArr19[i40] = cArr20[(c14 >>> 4) & 15];
                    cArr19[i40 + 1] = cArr20[c14 & 15];
                } else {
                    byte[] bArr3 = IOUtils.specicalFlags_doubleQuotes;
                    if (c14 >= bArr3.length || bArr3[c14] != 4) {
                        int i41 = i26 + 1;
                        char[] cArr21 = this.buf;
                        System.arraycopy(cArr21, i41, cArr21, i26 + 2, (i15 - i26) - 1);
                        char[] cArr22 = this.buf;
                        cArr22[i26] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        cArr22[i41] = IOUtils.replaceChars[c14];
                    } else {
                        int i42 = i26 + 1;
                        char[] cArr23 = this.buf;
                        System.arraycopy(cArr23, i42, cArr23, i26 + 6, (i15 - i26) - 1);
                        char[] cArr24 = this.buf;
                        cArr24[i26] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        int i43 = i42 + 1;
                        cArr24[i42] = 'u';
                        int i44 = i43 + 1;
                        char[] cArr25 = IOUtils.DIGITS;
                        cArr24[i43] = cArr25[(c14 >>> '\f') & 15];
                        int i45 = i44 + 1;
                        cArr24[i44] = cArr25[(c14 >>> '\b') & 15];
                        cArr24[i45] = cArr25[(c14 >>> 4) & 15];
                        cArr24[i45 + 1] = cArr25[c14 & 15];
                    }
                }
            } else if (i24 > 1) {
                for (int i46 = i25 - i14; i46 < str.length(); i46++) {
                    char cCharAt2 = str.charAt(i46);
                    if (this.browserSecure) {
                        if (cCharAt2 != '(' && cCharAt2 != ')') {
                            if (cCharAt2 == '<' || cCharAt2 == '>') {
                            }
                        }
                        char[] cArr26 = this.buf;
                        int i47 = i25 + 1;
                        cArr26[i25] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        int i48 = i47 + 1;
                        cArr26[i47] = 'u';
                        int i49 = i48 + 1;
                        char[] cArr27 = IOUtils.DIGITS;
                        cArr26[i48] = cArr27[(cCharAt2 >>> '\f') & 15];
                        int i50 = i49 + 1;
                        cArr26[i49] = cArr27[(cCharAt2 >>> '\b') & 15];
                        int i51 = i50 + 1;
                        cArr26[i50] = cArr27[(cCharAt2 >>> 4) & 15];
                        i25 = i51 + 1;
                        cArr26[i51] = cArr27[cCharAt2 & 15];
                    }
                    byte[] bArr4 = IOUtils.specicalFlags_doubleQuotes;
                    if ((cCharAt2 >= bArr4.length || bArr4[cCharAt2] == 0) && !(cCharAt2 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        if (cCharAt2 == 8232 || cCharAt2 == 8233) {
                            char[] cArr28 = this.buf;
                            int i52 = i25 + 1;
                            cArr28[i25] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            int i53 = i52 + 1;
                            cArr28[i52] = 'u';
                            int i54 = i53 + 1;
                            char[] cArr29 = IOUtils.DIGITS;
                            cArr28[i53] = cArr29[(cCharAt2 >>> '\f') & 15];
                            int i55 = i54 + 1;
                            cArr28[i54] = cArr29[(cCharAt2 >>> '\b') & 15];
                            int i56 = i55 + 1;
                            cArr28[i55] = cArr29[(cCharAt2 >>> 4) & 15];
                            i25 = i56 + 1;
                            cArr28[i56] = cArr29[cCharAt2 & 15];
                        } else {
                            this.buf[i25] = cCharAt2;
                            i25++;
                        }
                    } else {
                        char[] cArr30 = this.buf;
                        int i57 = i25 + 1;
                        cArr30[i25] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        if (bArr4[cCharAt2] == 4) {
                            int i58 = i57 + 1;
                            cArr30[i57] = 'u';
                            int i59 = i58 + 1;
                            char[] cArr31 = IOUtils.DIGITS;
                            cArr30[i58] = cArr31[(cCharAt2 >>> '\f') & 15];
                            int i60 = i59 + 1;
                            cArr30[i59] = cArr31[(cCharAt2 >>> '\b') & 15];
                            int i61 = i60 + 1;
                            cArr30[i60] = cArr31[(cCharAt2 >>> 4) & 15];
                            i25 = i61 + 1;
                            cArr30[i61] = cArr31[cCharAt2 & 15];
                        } else {
                            i25 = i57 + 1;
                            cArr30[i57] = IOUtils.replaceChars[cCharAt2];
                        }
                    }
                }
            }
        }
        if (c10 == 0) {
            this.buf[this.count - 1] = y.f128593b;
            return;
        }
        char[] cArr32 = this.buf;
        int i62 = this.count;
        cArr32[i62 - 2] = y.f128593b;
        cArr32[i62 - 1] = c10;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    public void writeStringWithDoubleQuote(char[] cArr, char c10) {
        int i10;
        int i11;
        if (cArr == null) {
            writeNull();
            if (c10 != 0) {
                write(c10);
                return;
            }
            return;
        }
        int length = cArr.length;
        int i12 = this.count + length + 2;
        if (c10 != 0) {
            i12++;
        }
        int length2 = this.buf.length;
        char c11 = y.f128597f;
        if (i12 > length2) {
            if (this.writer != null) {
                write(34);
                int i13 = 0;
                while (i13 < cArr.length) {
                    char c12 = cArr[i13];
                    if (isEnabled(SerializerFeature.BrowserSecure) && (c12 == '(' || c12 == ')' || c12 == '<' || c12 == c11)) {
                        write(92);
                        write(117);
                        char[] cArr2 = IOUtils.DIGITS;
                        write(cArr2[(c12 >>> '\f') & 15]);
                        write(cArr2[(c12 >>> '\b') & 15]);
                        write(cArr2[(c12 >>> 4) & 15]);
                        write(cArr2[c12 & 15]);
                    } else if (!isEnabled(SerializerFeature.BrowserCompatible)) {
                        byte[] bArr = IOUtils.specicalFlags_doubleQuotes;
                        if ((c12 >= bArr.length || bArr[c12] == 0) && !(c12 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                            write(c12);
                        } else {
                            write(92);
                            if (bArr[c12] == 4) {
                                write(117);
                                char[] cArr3 = IOUtils.DIGITS;
                                write(cArr3[(c12 >>> '\f') & 15]);
                                write(cArr3[(c12 >>> '\b') & 15]);
                                write(cArr3[(c12 >>> 4) & 15]);
                                write(cArr3[c12 & 15]);
                            } else {
                                write(IOUtils.replaceChars[c12]);
                            }
                        }
                    } else if (c12 == '\b' || c12 == '\f' || c12 == '\n' || c12 == '\r' || c12 == '\t' || c12 == '\"' || c12 == '/' || c12 == '\\') {
                        write(92);
                        write(IOUtils.replaceChars[c12]);
                    } else if (c12 < ' ') {
                        write(92);
                        write(117);
                        write(48);
                        write(48);
                        char[] cArr4 = IOUtils.ASCII_CHARS;
                        int i14 = c12 * 2;
                        write(cArr4[i14]);
                        write(cArr4[i14 + 1]);
                    } else if (c12 >= 127) {
                        write(92);
                        write(117);
                        char[] cArr5 = IOUtils.DIGITS;
                        write(cArr5[(c12 >>> '\f') & 15]);
                        write(cArr5[(c12 >>> '\b') & 15]);
                        write(cArr5[(c12 >>> 4) & 15]);
                        write(cArr5[c12 & 15]);
                    } else {
                        write(c12);
                    }
                    i13++;
                    c11 = y.f128597f;
                }
                write(34);
                if (c10 != 0) {
                    write(c10);
                    return;
                }
                return;
            }
            expandCapacity(i12);
        }
        int i15 = this.count;
        int i16 = i15 + 1;
        int i17 = length + i16;
        char[] cArr6 = this.buf;
        cArr6[i15] = y.f128593b;
        System.arraycopy(cArr, 0, cArr6, i16, cArr.length);
        this.count = i12;
        int i18 = -1;
        if (isEnabled(SerializerFeature.BrowserCompatible)) {
            for (int i19 = i16; i19 < i17; i19++) {
                char c13 = this.buf[i19];
                if (c13 == '\"' || c13 == '/' || c13 == '\\' || c13 == '\b' || c13 == '\f' || c13 == '\n' || c13 == '\r' || c13 == '\t') {
                    i12++;
                } else {
                    if (c13 < ' ' || c13 >= 127) {
                        i12 += 5;
                    }
                }
                i18 = i19;
            }
            if (i12 > this.buf.length) {
                expandCapacity(i12);
            }
            this.count = i12;
            while (i18 >= i16) {
                char[] cArr7 = this.buf;
                char c14 = cArr7[i18];
                if (c14 == '\b' || c14 == '\f' || c14 == '\n' || c14 == '\r' || c14 == '\t') {
                    int i20 = i18 + 1;
                    System.arraycopy(cArr7, i20, cArr7, i18 + 2, (i17 - i18) - 1);
                    char[] cArr8 = this.buf;
                    cArr8[i18] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr8[i20] = IOUtils.replaceChars[c14];
                } else {
                    if (c14 == '\"' || c14 == '/' || c14 == '\\') {
                        int i21 = i18 + 1;
                        System.arraycopy(cArr7, i21, cArr7, i18 + 2, (i17 - i18) - 1);
                        char[] cArr9 = this.buf;
                        cArr9[i18] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        cArr9[i21] = c14;
                    } else {
                        if (c14 < ' ') {
                            int i22 = i18 + 1;
                            System.arraycopy(cArr7, i22, cArr7, i18 + 6, (i17 - i18) - 1);
                            char[] cArr10 = this.buf;
                            cArr10[i18] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            cArr10[i22] = 'u';
                            cArr10[i18 + 2] = '0';
                            cArr10[i18 + 3] = '0';
                            char[] cArr11 = IOUtils.ASCII_CHARS;
                            int i23 = c14 * 2;
                            cArr10[i18 + 4] = cArr11[i23];
                            cArr10[i18 + 5] = cArr11[i23 + 1];
                        } else if (c14 >= 127) {
                            int i24 = i18 + 1;
                            System.arraycopy(cArr7, i24, cArr7, i18 + 6, (i17 - i18) - 1);
                            char[] cArr12 = this.buf;
                            cArr12[i18] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            cArr12[i24] = 'u';
                            char[] cArr13 = IOUtils.DIGITS;
                            cArr12[i18 + 2] = cArr13[(c14 >>> '\f') & 15];
                            cArr12[i18 + 3] = cArr13[(c14 >>> '\b') & 15];
                            cArr12[i18 + 4] = cArr13[(c14 >>> 4) & 15];
                            cArr12[i18 + 5] = cArr13[c14 & 15];
                        }
                        i17 += 5;
                    }
                    i18--;
                }
                i17++;
                i18--;
            }
            if (c10 == 0) {
                this.buf[this.count - 1] = y.f128593b;
                return;
            }
            char[] cArr14 = this.buf;
            int i25 = this.count;
            cArr14[i25 - 2] = y.f128593b;
            cArr14[i25 - 1] = c10;
            return;
        }
        int i26 = i16;
        int i27 = -1;
        int i28 = 0;
        char c15 = 0;
        int i29 = -1;
        while (i26 < i17) {
            char c16 = this.buf[i26];
            if (c16 >= ']') {
                if (c16 >= 127 && (c16 == 8232 || c16 == 8233 || c16 < 160)) {
                    if (i29 == i18) {
                        i29 = i26;
                    }
                    i28++;
                    i12 += 4;
                    i27 = i26;
                    c15 = c16;
                }
                int i30 = i29;
                i11 = i18;
                i10 = i30;
            } else {
                int i31 = i29;
                if ((c16 < '@' && (this.sepcialBits & (1 << c16)) != 0) || c16 == '\\') {
                    i28++;
                    if (c16 == '(' || c16 == ')' || c16 == '<' || c16 == '>') {
                        i12 += 4;
                    } else {
                        byte[] bArr2 = IOUtils.specicalFlags_doubleQuotes;
                        if (c16 < bArr2.length && bArr2[c16] == 4) {
                            i12 += 4;
                        }
                    }
                    i10 = i31;
                    i11 = -1;
                    if (i10 == -1) {
                        i10 = i26;
                        i27 = i10;
                    } else {
                        i27 = i26;
                    }
                    c15 = c16;
                } else {
                    i10 = i31;
                    i11 = -1;
                }
            }
            i26++;
            int i32 = i11;
            i29 = i10;
            i18 = i32;
        }
        int i33 = i29;
        if (i28 > 0) {
            int i34 = i12 + i28;
            if (i34 > this.buf.length) {
                expandCapacity(i34);
            }
            this.count = i34;
            if (i28 == 1) {
                if (c15 == 8232) {
                    int i35 = i27 + 1;
                    char[] cArr15 = this.buf;
                    System.arraycopy(cArr15, i35, cArr15, i27 + 6, (i17 - i27) - 1);
                    char[] cArr16 = this.buf;
                    cArr16[i27] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr16[i35] = 'u';
                    int i36 = i35 + 1;
                    cArr16[i36] = '2';
                    int i37 = i36 + 1;
                    cArr16[i37] = '0';
                    int i38 = i37 + 1;
                    cArr16[i38] = '2';
                    cArr16[i38 + 1] = '8';
                } else if (c15 == 8233) {
                    int i39 = i27 + 1;
                    char[] cArr17 = this.buf;
                    System.arraycopy(cArr17, i39, cArr17, i27 + 6, (i17 - i27) - 1);
                    char[] cArr18 = this.buf;
                    cArr18[i27] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr18[i39] = 'u';
                    int i40 = i39 + 1;
                    cArr18[i40] = '2';
                    int i41 = i40 + 1;
                    cArr18[i41] = '0';
                    int i42 = i41 + 1;
                    cArr18[i42] = '2';
                    cArr18[i42 + 1] = '9';
                } else if (c15 == '(' || c15 == ')' || c15 == '<' || c15 == '>') {
                    int i43 = i27 + 1;
                    char[] cArr19 = this.buf;
                    System.arraycopy(cArr19, i43, cArr19, i27 + 6, (i17 - i27) - 1);
                    char[] cArr20 = this.buf;
                    cArr20[i27] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr20[i43] = 'u';
                    int i44 = i43 + 1;
                    char[] cArr21 = IOUtils.DIGITS;
                    cArr20[i44] = cArr21[(c15 >>> '\f') & 15];
                    int i45 = i44 + 1;
                    cArr20[i45] = cArr21[(c15 >>> '\b') & 15];
                    int i46 = i45 + 1;
                    cArr20[i46] = cArr21[(c15 >>> 4) & 15];
                    cArr20[i46 + 1] = cArr21[c15 & 15];
                } else {
                    byte[] bArr3 = IOUtils.specicalFlags_doubleQuotes;
                    if (c15 >= bArr3.length || bArr3[c15] != 4) {
                        int i47 = i27 + 1;
                        char[] cArr22 = this.buf;
                        System.arraycopy(cArr22, i47, cArr22, i27 + 2, (i17 - i27) - 1);
                        char[] cArr23 = this.buf;
                        cArr23[i27] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        cArr23[i47] = IOUtils.replaceChars[c15];
                    } else {
                        int i48 = i27 + 1;
                        char[] cArr24 = this.buf;
                        System.arraycopy(cArr24, i48, cArr24, i27 + 6, (i17 - i27) - 1);
                        char[] cArr25 = this.buf;
                        cArr25[i27] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        int i49 = i48 + 1;
                        cArr25[i48] = 'u';
                        int i50 = i49 + 1;
                        char[] cArr26 = IOUtils.DIGITS;
                        cArr25[i49] = cArr26[(c15 >>> '\f') & 15];
                        int i51 = i50 + 1;
                        cArr25[i50] = cArr26[(c15 >>> '\b') & 15];
                        cArr25[i51] = cArr26[(c15 >>> 4) & 15];
                        cArr25[i51 + 1] = cArr26[c15 & 15];
                    }
                }
            } else if (i28 > 1) {
                for (int i52 = i33 - i16; i52 < cArr.length; i52++) {
                    char c17 = cArr[i52];
                    if (this.browserSecure) {
                        if (c17 != '(' && c17 != ')') {
                            if (c17 == '<' || c17 == '>') {
                            }
                        }
                        char[] cArr27 = this.buf;
                        int i53 = i33 + 1;
                        cArr27[i33] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        int i54 = i53 + 1;
                        cArr27[i53] = 'u';
                        int i55 = i54 + 1;
                        char[] cArr28 = IOUtils.DIGITS;
                        cArr27[i54] = cArr28[(c17 >>> '\f') & 15];
                        int i56 = i55 + 1;
                        cArr27[i55] = cArr28[(c17 >>> '\b') & 15];
                        int i57 = i56 + 1;
                        cArr27[i56] = cArr28[(c17 >>> 4) & 15];
                        i33 = i57 + 1;
                        cArr27[i57] = cArr28[c17 & 15];
                    }
                    byte[] bArr4 = IOUtils.specicalFlags_doubleQuotes;
                    if ((c17 >= bArr4.length || bArr4[c17] == 0) && !(c17 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        if (c17 == 8232 || c17 == 8233) {
                            char[] cArr29 = this.buf;
                            int i58 = i33 + 1;
                            cArr29[i33] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                            int i59 = i58 + 1;
                            cArr29[i58] = 'u';
                            int i60 = i59 + 1;
                            char[] cArr30 = IOUtils.DIGITS;
                            cArr29[i59] = cArr30[(c17 >>> '\f') & 15];
                            int i61 = i60 + 1;
                            cArr29[i60] = cArr30[(c17 >>> '\b') & 15];
                            int i62 = i61 + 1;
                            cArr29[i61] = cArr30[(c17 >>> 4) & 15];
                            i33 = i62 + 1;
                            cArr29[i62] = cArr30[c17 & 15];
                        } else {
                            this.buf[i33] = c17;
                            i33++;
                        }
                    } else {
                        char[] cArr31 = this.buf;
                        int i63 = i33 + 1;
                        cArr31[i33] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                        if (bArr4[c17] == 4) {
                            int i64 = i63 + 1;
                            cArr31[i63] = 'u';
                            int i65 = i64 + 1;
                            char[] cArr32 = IOUtils.DIGITS;
                            cArr31[i64] = cArr32[(c17 >>> '\f') & 15];
                            int i66 = i65 + 1;
                            cArr31[i65] = cArr32[(c17 >>> '\b') & 15];
                            int i67 = i66 + 1;
                            cArr31[i66] = cArr32[(c17 >>> 4) & 15];
                            i33 = i67 + 1;
                            cArr31[i67] = cArr32[c17 & 15];
                        } else {
                            i33 = i63 + 1;
                            cArr31[i63] = IOUtils.replaceChars[c17];
                        }
                    }
                }
            }
        }
        if (c10 == 0) {
            this.buf[this.count - 1] = y.f128593b;
            return;
        }
        char[] cArr33 = this.buf;
        int i68 = this.count;
        cArr33[i68 - 2] = y.f128593b;
        cArr33[i68 - 1] = c10;
    }

    protected void writeStringWithSingleQuote(String str) {
        int i10 = 0;
        if (str == null) {
            int i11 = this.count + 4;
            if (i11 > this.buf.length) {
                expandCapacity(i11);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i11;
            return;
        }
        int length = str.length();
        int i12 = this.count + length + 2;
        if (i12 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i10 < str.length()) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt <= '\r' || cCharAt == '\\' || cCharAt == '\'' || (cCharAt == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        write(92);
                        write(IOUtils.replaceChars[cCharAt]);
                    } else {
                        write(cCharAt);
                    }
                    i10++;
                }
                write(39);
                return;
            }
            expandCapacity(i12);
        }
        int i13 = this.count;
        int i14 = i13 + 1;
        int i15 = i14 + length;
        char[] cArr = this.buf;
        cArr[i13] = '\'';
        str.getChars(0, length, cArr, i14);
        this.count = i12;
        int i16 = -1;
        char c10 = 0;
        for (int i17 = i14; i17 < i15; i17++) {
            char c11 = this.buf[i17];
            if (c11 <= '\r' || c11 == '\\' || c11 == '\'' || (c11 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                i10++;
                i16 = i17;
                c10 = c11;
            }
        }
        int i18 = i12 + i10;
        if (i18 > this.buf.length) {
            expandCapacity(i18);
        }
        this.count = i18;
        if (i10 == 1) {
            char[] cArr2 = this.buf;
            int i19 = i16 + 1;
            System.arraycopy(cArr2, i19, cArr2, i16 + 2, (i15 - i16) - 1);
            char[] cArr3 = this.buf;
            cArr3[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr3[i19] = IOUtils.replaceChars[c10];
        } else if (i10 > 1) {
            char[] cArr4 = this.buf;
            int i20 = i16 + 1;
            System.arraycopy(cArr4, i20, cArr4, i16 + 2, (i15 - i16) - 1);
            char[] cArr5 = this.buf;
            cArr5[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr5[i20] = IOUtils.replaceChars[c10];
            int i21 = i15 + 1;
            for (int i22 = i20 - 2; i22 >= i14; i22--) {
                char c12 = this.buf[i22];
                if (c12 <= '\r' || c12 == '\\' || c12 == '\'' || (c12 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                    char[] cArr6 = this.buf;
                    int i23 = i22 + 1;
                    System.arraycopy(cArr6, i23, cArr6, i22 + 2, (i21 - i22) - 1);
                    char[] cArr7 = this.buf;
                    cArr7[i22] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr7[i23] = IOUtils.replaceChars[c12];
                    i21++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    protected void writeStringWithSingleQuote(char[] cArr) {
        int i10 = 0;
        if (cArr == null) {
            int i11 = this.count + 4;
            if (i11 > this.buf.length) {
                expandCapacity(i11);
            }
            "null".getChars(0, 4, this.buf, this.count);
            this.count = i11;
            return;
        }
        int length = cArr.length;
        int i12 = this.count + length + 2;
        if (i12 > this.buf.length) {
            if (this.writer != null) {
                write(39);
                while (i10 < cArr.length) {
                    char c10 = cArr[i10];
                    if (c10 <= '\r' || c10 == '\\' || c10 == '\'' || (c10 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                        write(92);
                        write(IOUtils.replaceChars[c10]);
                    } else {
                        write(c10);
                    }
                    i10++;
                }
                write(39);
                return;
            }
            expandCapacity(i12);
        }
        int i13 = this.count;
        int i14 = i13 + 1;
        int i15 = length + i14;
        char[] cArr2 = this.buf;
        cArr2[i13] = '\'';
        System.arraycopy(cArr, 0, cArr2, i14, cArr.length);
        this.count = i12;
        int i16 = -1;
        char c11 = 0;
        for (int i17 = i14; i17 < i15; i17++) {
            char c12 = this.buf[i17];
            if (c12 <= '\r' || c12 == '\\' || c12 == '\'' || (c12 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                i10++;
                i16 = i17;
                c11 = c12;
            }
        }
        int i18 = i12 + i10;
        if (i18 > this.buf.length) {
            expandCapacity(i18);
        }
        this.count = i18;
        if (i10 == 1) {
            char[] cArr3 = this.buf;
            int i19 = i16 + 1;
            System.arraycopy(cArr3, i19, cArr3, i16 + 2, (i15 - i16) - 1);
            char[] cArr4 = this.buf;
            cArr4[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr4[i19] = IOUtils.replaceChars[c11];
        } else if (i10 > 1) {
            char[] cArr5 = this.buf;
            int i20 = i16 + 1;
            System.arraycopy(cArr5, i20, cArr5, i16 + 2, (i15 - i16) - 1);
            char[] cArr6 = this.buf;
            cArr6[i16] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
            cArr6[i20] = IOUtils.replaceChars[c11];
            int i21 = i15 + 1;
            for (int i22 = i20 - 2; i22 >= i14; i22--) {
                char c13 = this.buf[i22];
                if (c13 <= '\r' || c13 == '\\' || c13 == '\'' || (c13 == '/' && isEnabled(SerializerFeature.WriteSlashAsSpecial))) {
                    char[] cArr7 = this.buf;
                    int i23 = i22 + 1;
                    System.arraycopy(cArr7, i23, cArr7, i22 + 2, (i21 - i22) - 1);
                    char[] cArr8 = this.buf;
                    cArr8[i22] = com.tencent.qcloud.core.util.IOUtils.DIR_SEPARATOR_WINDOWS;
                    cArr8[i23] = IOUtils.replaceChars[c13];
                    i21++;
                }
            }
        }
        this.buf[this.count - 1] = '\'';
    }

    public void writeTo(OutputStream outputStream, String str) throws IOException {
        writeTo(outputStream, Charset.forName(str));
    }

    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
        writeToEx(outputStream, charset);
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        writer.write(this.buf, 0, this.count);
    }

    public int writeToEx(OutputStream outputStream, Charset charset) throws IOException {
        if (this.writer != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        if (charset == IOUtils.UTF8) {
            return encodeToUTF8(outputStream);
        }
        byte[] bytes = new String(this.buf, 0, this.count).getBytes(charset);
        outputStream.write(bytes);
        return bytes.length;
    }
}
