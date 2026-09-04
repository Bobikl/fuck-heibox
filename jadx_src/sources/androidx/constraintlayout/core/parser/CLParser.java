package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParser {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f18051d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18053b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18054c;

    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18055a;

        static {
            int[] iArr = new int[TYPE.values().length];
            f18055a = iArr;
            try {
                iArr[TYPE.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18055a[TYPE.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18055a[TYPE.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18055a[TYPE.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18055a[TYPE.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18055a[TYPE.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public CLParser(String str) {
        this.f18052a = str;
    }

    private c a(c cVar, int i10, TYPE type, boolean z10, char[] cArr) {
        c cVarK0;
        if (f18051d) {
            System.out.println("CREATE " + type + " at " + cArr[i10]);
        }
        switch (a.f18055a[type.ordinal()]) {
            case 1:
                cVarK0 = f.k0(cArr);
                i10++;
                break;
            case 2:
                cVarK0 = androidx.constraintlayout.core.parser.a.D(cArr);
                i10++;
                break;
            case 3:
                cVarK0 = g.B(cArr);
                break;
            case 4:
                cVarK0 = e.B(cArr);
                break;
            case 5:
                cVarK0 = d.D(cArr);
                break;
            case 6:
                cVarK0 = CLToken.B(cArr);
                break;
            default:
                cVarK0 = null;
                break;
        }
        if (cVarK0 == null) {
            return null;
        }
        cVarK0.w(this.f18054c);
        if (z10) {
            cVarK0.x(i10);
        }
        if (cVar instanceof b) {
            cVarK0.u((b) cVar);
        }
        return cVarK0;
    }

    private c b(int i10, char c10, c cVar, char[] cArr) throws CLParsingException {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ') {
            return cVar;
        }
        if (c10 == '\"' || c10 == '\'') {
            return cVar instanceof f ? a(cVar, i10, TYPE.KEY, true, cArr) : a(cVar, i10, TYPE.STRING, true, cArr);
        }
        if (c10 == '[') {
            return a(cVar, i10, TYPE.ARRAY, true, cArr);
        }
        if (c10 != ']') {
            if (c10 == '{') {
                return a(cVar, i10, TYPE.OBJECT, true, cArr);
            }
            if (c10 != '}') {
                switch (c10) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        return a(cVar, i10, TYPE.NUMBER, true, cArr);
                    case ',':
                    case ':':
                        return cVar;
                    case '/':
                        int i11 = i10 + 1;
                        if (i11 >= cArr.length || cArr[i11] != '/') {
                            return cVar;
                        }
                        this.f18053b = true;
                        return cVar;
                    default:
                        if (!(cVar instanceof b) || (cVar instanceof f)) {
                            return a(cVar, i10, TYPE.KEY, true, cArr);
                        }
                        c cVarA = a(cVar, i10, TYPE.TOKEN, true, cArr);
                        CLToken cLToken = (CLToken) cVarA;
                        if (cLToken.G(c10, i10)) {
                            return cVarA;
                        }
                        throw new CLParsingException("incorrect token <" + c10 + "> at line " + this.f18054c, cLToken);
                }
            }
        }
        cVar.v(i10 - 1);
        c cVarE = cVar.e();
        cVarE.v(i10);
        return cVarE;
    }

    public static f d(String str) throws CLParsingException {
        return new CLParser(str).c();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x014c A[EDGE_INSN: B:106:0x014c->B:116:? BREAK  A[LOOP:1: B:14:0x0036->B:86:0x0146], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x011b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    public f c() throws CLParsingException {
        boolean z10;
        long j10;
        char c10;
        long j11;
        CLToken cLToken;
        long j12;
        char[] charArray = this.f18052a.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        this.f18054c = 1;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char c11 = charArray[i11];
            if (c11 == '{') {
                break;
            }
            if (c11 == '\n') {
                this.f18054c++;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        f fVarK0 = f.k0(charArray);
        fVarK0.w(this.f18054c);
        fVarK0.x(i11);
        int i12 = i11 + 1;
        c cVarE = fVarK0;
        while (i12 < length) {
            char c12 = charArray[i12];
            if (c12 == '\n') {
                this.f18054c += i10;
            }
            if (this.f18053b) {
                if (c12 == '\n') {
                    this.f18053b = z11;
                    if (cVarE == null) {
                        break;
                        break;
                    }
                    if (cVarE.q()) {
                        cVarE = b(i12, c12, cVarE, charArray);
                    } else if (cVarE instanceof f) {
                        if (c12 == '}') {
                            cVarE.v(i12 - 1);
                        } else {
                            cVarE = b(i12, c12, cVarE, charArray);
                        }
                    } else if (cVarE instanceof androidx.constraintlayout.core.parser.a) {
                        z10 = cVarE instanceof g;
                        if (z10) {
                            j12 = cVarE.f18069c;
                            if (charArray[(int) j12] == c12) {
                                cVarE.x(j12 + 1);
                                cVarE.v(i12 - 1);
                            }
                        } else {
                            if (cVarE instanceof CLToken) {
                                cLToken = (CLToken) cVarE;
                                if (!cLToken.G(c12, i12)) {
                                    throw new CLParsingException("parsing incorrect token " + cLToken.b() + " at line " + this.f18054c, cLToken);
                                }
                            }
                            if (cVarE instanceof d) {
                                j10 = cVarE.f18069c;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    cVarE.x(j10 + 1);
                                    cVarE.v(i12 - 1);
                                } else {
                                    cVarE.x(j10 + 1);
                                    cVarE.v(i12 - 1);
                                }
                            } else {
                                j10 = cVarE.f18069c;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    cVarE.x(j10 + 1);
                                    cVarE.v(i12 - 1);
                                } else {
                                    cVarE.x(j10 + 1);
                                    cVarE.v(i12 - 1);
                                }
                            }
                            if (!cVarE.q()) {
                                j11 = i12 - 1;
                                cVarE.v(j11);
                                if (c12 != '}') {
                                    cVarE = cVarE.e();
                                    cVarE.v(j11);
                                    if (cVarE instanceof d) {
                                        cVarE = cVarE.e();
                                        cVarE.v(j11);
                                    }
                                } else {
                                    cVarE = cVarE.e();
                                    cVarE.v(j11);
                                    if (cVarE instanceof d) {
                                        cVarE = cVarE.e();
                                        cVarE.v(j11);
                                    }
                                }
                            }
                        }
                    } else if (c12 == ']') {
                        cVarE.v(i12 - 1);
                    } else {
                        cVarE = b(i12, c12, cVarE, charArray);
                    }
                    if (!cVarE.q()) {
                    }
                } else {
                    continue;
                }
            } else {
                if (cVarE == null) {
                    break;
                }
                if (cVarE.q()) {
                    cVarE = b(i12, c12, cVarE, charArray);
                } else if (cVarE instanceof f) {
                    if (c12 == '}') {
                        cVarE.v(i12 - 1);
                    } else {
                        cVarE = b(i12, c12, cVarE, charArray);
                    }
                } else if (cVarE instanceof androidx.constraintlayout.core.parser.a) {
                    z10 = cVarE instanceof g;
                    if (z10) {
                        j12 = cVarE.f18069c;
                        if (charArray[(int) j12] == c12) {
                            cVarE.x(j12 + 1);
                            cVarE.v(i12 - 1);
                        }
                    } else {
                        if (cVarE instanceof CLToken) {
                            cLToken = (CLToken) cVarE;
                            if (!cLToken.G(c12, i12)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.b() + " at line " + this.f18054c, cLToken);
                            }
                        }
                        if ((cVarE instanceof d) || z10) {
                            j10 = cVarE.f18069c;
                            c10 = charArray[(int) j10];
                            if ((c10 != '\'' || c10 == '\"') && c10 == c12) {
                                cVarE.x(j10 + 1);
                                cVarE.v(i12 - 1);
                            }
                        }
                        if (!cVarE.q() && (c12 == '}' || c12 == ']' || c12 == ',' || c12 == ' ' || c12 == '\t' || c12 == '\r' || c12 == '\n' || c12 == ':')) {
                            j11 = i12 - 1;
                            cVarE.v(j11);
                            if (c12 != '}' || c12 == ']') {
                                cVarE = cVarE.e();
                                cVarE.v(j11);
                                if (cVarE instanceof d) {
                                    cVarE = cVarE.e();
                                    cVarE.v(j11);
                                }
                            }
                        }
                    }
                } else if (c12 == ']') {
                    cVarE.v(i12 - 1);
                } else {
                    cVarE = b(i12, c12, cVarE, charArray);
                }
                if (!cVarE.q() && (!(cVarE instanceof d) || ((d) cVarE).f18065i.size() > 0)) {
                    cVarE = cVarE.e();
                }
            }
            i12++;
            i10 = 1;
            z11 = false;
        }
        while (cVarE != null && !cVarE.q()) {
            if (cVarE instanceof g) {
                cVarE.x(((int) cVarE.f18069c) + 1);
            }
            cVarE.v(length - 1);
            cVarE = cVarE.e();
        }
        if (f18051d) {
            System.out.println("Root: " + fVarK0.A());
        }
        return fVarK0;
    }
}
