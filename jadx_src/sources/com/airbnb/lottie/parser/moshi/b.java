package com.airbnb.lottie.parser.moshi;

import androidx.annotation.p0;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends JsonReader {
    private static final int A = 6;
    private static final int B = 7;
    private static final int C = 8;
    private static final int D = 9;
    private static final int E = 10;
    private static final int F = 11;
    private static final int G = 12;
    private static final int H = 13;
    private static final int I = 14;
    private static final int J = 15;
    private static final int K = 16;
    private static final int L = 17;
    private static final int M = 18;
    private static final int N = 0;
    private static final int O = 1;
    private static final int P = 2;
    private static final int Q = 3;
    private static final int R = 4;
    private static final int S = 5;
    private static final int T = 6;
    private static final int U = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f37768o = -922337203685477580L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final ByteString f37769p = ByteString.encodeUtf8("'\\");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ByteString f37770q = ByteString.encodeUtf8("\"\\");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ByteString f37771r = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ByteString f37772s = ByteString.encodeUtf8("\n\r");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ByteString f37773t = ByteString.encodeUtf8("*/");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f37774u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f37775v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f37776w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f37777x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f37778y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f37779z = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final BufferedSource f37780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Buffer f37781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37782k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37784m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private String f37785n;

    b(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.f37780i = bufferedSource;
        this.f37781j = bufferedSource.getBufferField();
        q(6);
    }

    private void A() throws IOException {
        if (!this.f37724f) {
            throw z("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int C() throws IOException {
        int[] iArr = this.f37721c;
        int i10 = this.f37720b;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iL = L(true);
            this.f37781j.readByte();
            if (iL != 44) {
                if (iL != 59) {
                    if (iL != 93) {
                        throw z("Unterminated array");
                    }
                    this.f37782k = 4;
                    return 4;
                }
                A();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iL2 = L(true);
                    this.f37781j.readByte();
                    if (iL2 != 44) {
                        if (iL2 != 59) {
                            if (iL2 != 125) {
                                throw z("Unterminated object");
                            }
                            this.f37782k = 2;
                            return 2;
                        }
                        A();
                    }
                }
                int iL3 = L(true);
                if (iL3 == 34) {
                    this.f37781j.readByte();
                    this.f37782k = 13;
                    return 13;
                }
                if (iL3 == 39) {
                    this.f37781j.readByte();
                    A();
                    this.f37782k = 12;
                    return 12;
                }
                if (iL3 != 125) {
                    A();
                    if (!K((char) iL3)) {
                        throw z("Expected name");
                    }
                    this.f37782k = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw z("Expected name");
                }
                this.f37781j.readByte();
                this.f37782k = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iL4 = L(true);
                this.f37781j.readByte();
                if (iL4 != 58) {
                    if (iL4 != 61) {
                        throw z("Expected ':'");
                    }
                    A();
                    if (this.f37780i.request(1L) && this.f37781j.getByte(0L) == 62) {
                        this.f37781j.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (L(false) == -1) {
                    this.f37782k = 18;
                    return 18;
                }
                A();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iL5 = L(true);
        if (iL5 == 34) {
            this.f37781j.readByte();
            this.f37782k = 9;
            return 9;
        }
        if (iL5 == 39) {
            A();
            this.f37781j.readByte();
            this.f37782k = 8;
            return 8;
        }
        if (iL5 != 44 && iL5 != 59) {
            if (iL5 == 91) {
                this.f37781j.readByte();
                this.f37782k = 3;
                return 3;
            }
            if (iL5 != 93) {
                if (iL5 == 123) {
                    this.f37781j.readByte();
                    this.f37782k = 1;
                    return 1;
                }
                int iO = O();
                if (iO != 0) {
                    return iO;
                }
                int iP = P();
                if (iP != 0) {
                    return iP;
                }
                if (!K(this.f37781j.getByte(0L))) {
                    throw z("Expected value");
                }
                A();
                this.f37782k = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f37781j.readByte();
                this.f37782k = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw z("Unexpected value");
        }
        A();
        this.f37782k = 7;
        return 7;
    }

    private int I(String str, JsonReader.a aVar) {
        int length = aVar.f37726a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f37726a[i10])) {
                this.f37782k = 0;
                this.f37722d[this.f37720b - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private int J(String str, JsonReader.a aVar) {
        int length = aVar.f37726a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f37726a[i10])) {
                this.f37782k = 0;
                int[] iArr = this.f37723e;
                int i11 = this.f37720b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    private boolean K(int i10) throws IOException {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A();
        return false;
    }

    private int L(boolean z10) throws IOException {
        int i10;
        byte b10;
        while (true) {
            int i11 = 0;
            while (true) {
                i10 = i11 + 1;
                if (!this.f37780i.request(i10)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                b10 = this.f37781j.getByte(i11);
                if (b10 == 10 || b10 == 32 || b10 == 13 || b10 == 9) {
                    i11 = i10;
                }
            }
            this.f37781j.skip(i10 - 1);
            if (b10 == 47) {
                if (!this.f37780i.request(2L)) {
                    return b10;
                }
                A();
                byte b11 = this.f37781j.getByte(1L);
                if (b11 == 42) {
                    this.f37781j.readByte();
                    this.f37781j.readByte();
                    if (!S()) {
                        throw z("Unterminated comment");
                    }
                } else {
                    if (b11 != 47) {
                        return b10;
                    }
                    this.f37781j.readByte();
                    this.f37781j.readByte();
                    V();
                }
            } else {
                if (b10 != 35) {
                    return b10;
                }
                A();
                V();
            }
        }
    }

    private String M(ByteString byteString) throws IOException {
        StringBuilder sb2 = null;
        while (true) {
            long jIndexOfElement = this.f37780i.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw z("Unterminated string");
            }
            if (this.f37781j.getByte(jIndexOfElement) != 92) {
                if (sb2 == null) {
                    String utf8 = this.f37781j.readUtf8(jIndexOfElement);
                    this.f37781j.readByte();
                    return utf8;
                }
                sb2.append(this.f37781j.readUtf8(jIndexOfElement));
                this.f37781j.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f37781j.readUtf8(jIndexOfElement));
            this.f37781j.readByte();
            sb2.append(Q());
        }
    }

    private String N() throws IOException {
        long jIndexOfElement = this.f37780i.indexOfElement(f37771r);
        return jIndexOfElement != -1 ? this.f37781j.readUtf8(jIndexOfElement) : this.f37781j.readUtf8();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int O() throws IOException {
        int i10;
        String str;
        String str2;
        byte b10 = this.f37781j.getByte(0L);
        if (b10 == 116 || b10 == 84) {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (b10 == 102 || b10 == 70) {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (b10 != 110 && b10 != 78) {
                return 0;
            }
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f37780i.request(i12)) {
                return 0;
            }
            byte b11 = this.f37781j.getByte(i11);
            if (b11 != str.charAt(i11) && b11 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f37780i.request(length + 1) && K(this.f37781j.getByte(length))) {
            return 0;
        }
        this.f37781j.skip(length);
        this.f37782k = i10;
        return i10;
    }

    private int P() throws IOException {
        char c10;
        boolean z10 = true;
        int i10 = 0;
        long j10 = 0;
        boolean z11 = true;
        int i11 = 0;
        char c11 = 0;
        boolean z12 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f37780i.request(i12)) {
                break;
            }
            byte b10 = this.f37781j.getByte(i11);
            if (b10 != 43) {
                if (b10 == 69 || b10 == 101) {
                    if (c11 != 2 && c11 != 4) {
                        return i10;
                    }
                    c11 = 5;
                } else if (b10 == 45) {
                    c10 = 6;
                    if (c11 == 0) {
                        c11 = 1;
                        z12 = true;
                    } else if (c11 != 5) {
                        return i10;
                    }
                } else if (b10 == 46) {
                    c10 = 3;
                    if (c11 != 2) {
                        return i10;
                    }
                } else {
                    if (b10 < 48 || b10 > 57) {
                        if (!K(b10)) {
                            break;
                        }
                        return 0;
                    }
                    if (c11 == z10 || c11 == 0) {
                        j10 = -(b10 - 48);
                        c11 = 2;
                    } else if (c11 == 2) {
                        if (j10 == 0) {
                            return i10;
                        }
                        long j11 = (10 * j10) - ((long) (b10 - 48));
                        z11 &= j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10);
                        j10 = j11;
                    } else if (c11 == 3) {
                        i10 = 0;
                        c11 = 4;
                    } else if (c11 == 5 || c11 == 6) {
                        i10 = 0;
                        c11 = 7;
                    }
                    i10 = 0;
                }
                i11 = i12;
                z10 = true;
            } else {
                c10 = 6;
                if (c11 != 5) {
                    return i10;
                }
            }
            c11 = c10;
            i11 = i12;
            z10 = true;
        }
        if (c11 == 2 && z11 && ((j10 != Long.MIN_VALUE || z12) && (j10 != 0 || !z12))) {
            if (!z12) {
                j10 = -j10;
            }
            this.f37783l = j10;
            this.f37781j.skip(i11);
            this.f37782k = 16;
            return 16;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        }
        this.f37784m = i11;
        this.f37782k = 17;
        return 17;
    }

    private char Q() throws IOException {
        int i10;
        int i11;
        if (!this.f37780i.request(1L)) {
            throw z("Unterminated escape sequence");
        }
        byte b10 = this.f37781j.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            if (this.f37724f) {
                return (char) b10;
            }
            throw z("Invalid escape sequence: \\" + ((char) b10));
        }
        if (!this.f37780i.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte b11 = this.f37781j.getByte(i12);
            char c11 = (char) (c10 << 4);
            if (b11 < 48 || b11 > 57) {
                if (b11 >= 97 && b11 <= 102) {
                    i10 = b11 - 97;
                } else {
                    if (b11 < 65 || b11 > 70) {
                        throw z("\\u" + this.f37781j.readUtf8(4L));
                    }
                    i10 = b11 - 65;
                }
                i11 = i10 + 10;
            } else {
                i11 = b11 - 48;
            }
            c10 = (char) (c11 + i11);
        }
        this.f37781j.skip(4L);
        return c10;
    }

    private void R(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.f37780i.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw z("Unterminated string");
            }
            if (this.f37781j.getByte(jIndexOfElement) != 92) {
                this.f37781j.skip(jIndexOfElement + 1);
                return;
            } else {
                this.f37781j.skip(jIndexOfElement + 1);
                Q();
            }
        }
    }

    private boolean S() throws IOException {
        BufferedSource bufferedSource = this.f37780i;
        ByteString byteString = f37773t;
        long jIndexOf = bufferedSource.indexOf(byteString);
        boolean z10 = jIndexOf != -1;
        Buffer buffer = this.f37781j;
        buffer.skip(z10 ? jIndexOf + ((long) byteString.size()) : buffer.size());
        return z10;
    }

    private void V() throws IOException {
        long jIndexOfElement = this.f37780i.indexOfElement(f37772s);
        Buffer buffer = this.f37781j;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    private void W() throws IOException {
        long jIndexOfElement = this.f37780i.indexOfElement(f37771r);
        Buffer buffer = this.f37781j;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void b() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 3) {
            q(1);
            this.f37723e[this.f37720b - 1] = 0;
            this.f37782k = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + p() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void c() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 1) {
            q(3);
            this.f37782k = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + p() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f37782k = 0;
        this.f37721c[0] = 8;
        this.f37720b = 1;
        this.f37781j.clear();
        this.f37780i.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + p() + " at path " + getPath());
        }
        int i10 = this.f37720b - 1;
        this.f37720b = i10;
        int[] iArr = this.f37723e;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f37782k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void e() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + p() + " at path " + getPath());
        }
        int i10 = this.f37720b - 1;
        this.f37720b = i10;
        this.f37722d[i10] = null;
        int[] iArr = this.f37723e;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f37782k = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean f() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        return (iC == 2 || iC == 4 || iC == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean g() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 5) {
            this.f37782k = 0;
            int[] iArr = this.f37723e;
            int i10 = this.f37720b - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iC == 6) {
            this.f37782k = 0;
            int[] iArr2 = this.f37723e;
            int i11 = this.f37720b - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + p() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double i() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 16) {
            this.f37782k = 0;
            int[] iArr = this.f37723e;
            int i10 = this.f37720b - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f37783l;
        }
        if (iC == 17) {
            this.f37785n = this.f37781j.readUtf8(this.f37784m);
        } else if (iC == 9) {
            this.f37785n = M(f37770q);
        } else if (iC == 8) {
            this.f37785n = M(f37769p);
        } else if (iC == 10) {
            this.f37785n = N();
        } else if (iC != 11) {
            throw new JsonDataException("Expected a double but was " + p() + " at path " + getPath());
        }
        this.f37782k = 11;
        try {
            double d10 = Double.parseDouble(this.f37785n);
            if (this.f37724f || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f37785n = null;
                this.f37782k = 0;
                int[] iArr2 = this.f37723e;
                int i11 = this.f37720b - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f37785n + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int k() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 16) {
            long j10 = this.f37783l;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f37782k = 0;
                int[] iArr = this.f37723e;
                int i11 = this.f37720b - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new JsonDataException("Expected an int but was " + this.f37783l + " at path " + getPath());
        }
        if (iC == 17) {
            this.f37785n = this.f37781j.readUtf8(this.f37784m);
        } else if (iC == 9 || iC == 8) {
            String strM = iC == 9 ? M(f37770q) : M(f37769p);
            this.f37785n = strM;
            try {
                int i12 = Integer.parseInt(strM);
                this.f37782k = 0;
                int[] iArr2 = this.f37723e;
                int i13 = this.f37720b - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iC != 11) {
            throw new JsonDataException("Expected an int but was " + p() + " at path " + getPath());
        }
        this.f37782k = 11;
        try {
            double d10 = Double.parseDouble(this.f37785n);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f37785n = null;
                this.f37782k = 0;
                int[] iArr3 = this.f37723e;
                int i15 = this.f37720b - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f37785n + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f37785n + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String m() throws IOException {
        String strM;
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 14) {
            strM = N();
        } else if (iC == 13) {
            strM = M(f37770q);
        } else if (iC == 12) {
            strM = M(f37769p);
        } else {
            if (iC != 15) {
                throw new JsonDataException("Expected a name but was " + p() + " at path " + getPath());
            }
            strM = this.f37785n;
        }
        this.f37782k = 0;
        this.f37722d[this.f37720b - 1] = strM;
        return strM;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String n() throws IOException {
        String utf8;
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 10) {
            utf8 = N();
        } else if (iC == 9) {
            utf8 = M(f37770q);
        } else if (iC == 8) {
            utf8 = M(f37769p);
        } else if (iC == 11) {
            utf8 = this.f37785n;
            this.f37785n = null;
        } else if (iC == 16) {
            utf8 = Long.toString(this.f37783l);
        } else {
            if (iC != 17) {
                throw new JsonDataException("Expected a string but was " + p() + " at path " + getPath());
            }
            utf8 = this.f37781j.readUtf8(this.f37784m);
        }
        this.f37782k = 0;
        int[] iArr = this.f37723e;
        int i10 = this.f37720b - 1;
        iArr[i10] = iArr[i10] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token p() throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        switch (iC) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int r(JsonReader.a aVar) throws IOException {
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC < 12 || iC > 15) {
            return -1;
        }
        if (iC == 15) {
            return I(this.f37785n, aVar);
        }
        int iSelect = this.f37780i.select(aVar.f37727b);
        if (iSelect != -1) {
            this.f37782k = 0;
            this.f37722d[this.f37720b - 1] = aVar.f37726a[iSelect];
            return iSelect;
        }
        String str = this.f37722d[this.f37720b - 1];
        String strM = m();
        int I2 = I(strM, aVar);
        if (I2 == -1) {
            this.f37782k = 15;
            this.f37785n = strM;
            this.f37722d[this.f37720b - 1] = str;
        }
        return I2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void s() throws IOException {
        if (this.f37725g) {
            throw new JsonDataException("Cannot skip unexpected " + p() + " at " + getPath());
        }
        int iC = this.f37782k;
        if (iC == 0) {
            iC = C();
        }
        if (iC == 14) {
            W();
        } else if (iC == 13) {
            R(f37770q);
        } else if (iC == 12) {
            R(f37769p);
        } else if (iC != 15) {
            throw new JsonDataException("Expected a name but was " + p() + " at path " + getPath());
        }
        this.f37782k = 0;
        this.f37722d[this.f37720b - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void t() throws IOException {
        if (this.f37725g) {
            throw new JsonDataException("Cannot skip unexpected " + p() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iC = this.f37782k;
            if (iC == 0) {
                iC = C();
            }
            if (iC == 3) {
                q(1);
            } else {
                if (iC == 1) {
                    q(3);
                } else if (iC == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + p() + " at path " + getPath());
                    }
                    this.f37720b--;
                } else if (iC == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new JsonDataException("Expected a value but was " + p() + " at path " + getPath());
                    }
                    this.f37720b--;
                } else if (iC == 14 || iC == 10) {
                    W();
                } else if (iC == 9 || iC == 13) {
                    R(f37770q);
                } else if (iC == 8 || iC == 12) {
                    R(f37769p);
                } else if (iC == 17) {
                    this.f37781j.skip(this.f37784m);
                } else if (iC == 18) {
                    throw new JsonDataException("Expected a value but was " + p() + " at path " + getPath());
                }
                this.f37782k = 0;
            }
            i10++;
            this.f37782k = 0;
        } while (i10 != 0);
        int[] iArr = this.f37723e;
        int i11 = this.f37720b;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f37722d[i11 - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f37780i + ")";
    }
}
