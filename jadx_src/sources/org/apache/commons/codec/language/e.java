package org.apache.commons.codec.language;

import com.meituan.robust.Constants;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: ColognePhonetic.java */
/* JADX INFO: loaded from: classes5.dex */
public class e implements mj.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[][] f132980a = {new char[]{196, 'A'}, new char[]{220, 'U'}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    /* JADX INFO: compiled from: ColognePhonetic.java */
    public abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final char[] f132981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f132982b;

        public a(int i10) {
            this.f132982b = 0;
            this.f132981a = new char[i10];
            this.f132982b = 0;
        }

        public a(char[] cArr) {
            this.f132982b = 0;
            this.f132981a = cArr;
            this.f132982b = cArr.length;
        }

        protected abstract char[] a(int i10, int i11);

        public int b() {
            return this.f132982b;
        }

        public String toString() {
            return new String(a(0, this.f132982b));
        }
    }

    /* JADX INFO: compiled from: ColognePhonetic.java */
    public class b extends a {
        public b(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.e.a
        protected char[] a(int i10, int i11) {
            char[] cArr = new char[i11];
            char[] cArr2 = this.f132981a;
            System.arraycopy(cArr2, (cArr2.length - this.f132982b) + i10, cArr, 0, i11);
            return cArr;
        }

        public void c(char c10) {
            this.f132982b++;
            this.f132981a[e()] = c10;
        }

        public char d() {
            return this.f132981a[e()];
        }

        protected int e() {
            return this.f132981a.length - this.f132982b;
        }

        public char f() {
            char cD = d();
            this.f132982b--;
            return cD;
        }
    }

    /* JADX INFO: compiled from: ColognePhonetic.java */
    public class c extends a {
        public c(int i10) {
            super(i10);
        }

        @Override // org.apache.commons.codec.language.e.a
        protected char[] a(int i10, int i11) {
            char[] cArr = new char[i11];
            System.arraycopy(this.f132981a, i10, cArr, 0, i11);
            return cArr;
        }

        public void c(char c10) {
            char[] cArr = this.f132981a;
            int i10 = this.f132982b;
            cArr[i10] = c10;
            this.f132982b = i10 + 1;
        }
    }

    private static boolean b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    private String e(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (charArray[i10] > 'Z') {
                for (char[] cArr : f132980a) {
                    if (charArray[i10] == cArr[0]) {
                        charArray[i10] = cArr[1];
                        break;
                    }
                }
            }
        }
        return new String(charArray);
    }

    @Override // mj.g
    public String a(String str) {
        return c(str);
    }

    public String c(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        String strE = e(str);
        c cVar = new c(strE.length() * 2);
        b bVar = new b(strE.toCharArray());
        int iB = bVar.b();
        char c11 = '/';
        char c12 = '-';
        while (iB > 0) {
            char cF = bVar.f();
            int iB2 = bVar.b();
            char cD = iB2 > 0 ? bVar.d() : '-';
            if (b(new char[]{'A', 'E', 'I', 'J', 'O', 'U', 'Y'}, cF)) {
                c10 = '0';
            } else if (cF == 'H' || cF < 'A' || cF > 'Z') {
                if (c11 == '/') {
                    iB = iB2;
                } else {
                    c10 = '-';
                }
            } else if (cF == 'B' || (cF == 'P' && cD != 'H')) {
                c10 = '1';
            } else if ((cF == 'D' || cF == 'T') && !b(new char[]{'S', 'C', 'Z'}, cD)) {
                c10 = '2';
            } else if (b(new char[]{'W', 'F', 'P', 'V'}, cF)) {
                c10 = '3';
            } else if (b(new char[]{'G', 'K', 'Q'}, cF)) {
                c10 = '4';
            } else {
                if (cF == 'X' && !b(new char[]{'C', 'K', 'Q'}, c12)) {
                    bVar.c('S');
                    iB2++;
                } else if (cF == 'S' || cF == 'Z') {
                    c10 = '8';
                } else {
                    if (cF == 'C') {
                        if (c11 != '/' ? b(new char[]{'S', 'Z'}, c12) || !b(new char[]{'A', 'H', 'O', 'U', 'K', 'Q', 'X'}, cD) : !b(new char[]{'A', 'H', 'K', Constants.OBJECT_TYPE, 'O', 'Q', 'R', 'U', 'X'}, cD)) {
                        }
                    } else if (!b(new char[]{'T', 'D', 'X'}, cF)) {
                        if (cF == 'R') {
                            c10 = '7';
                        } else if (cF == 'L') {
                            c10 = '5';
                        } else {
                            c10 = (cF == 'M' || cF == 'N') ? '6' : cF;
                        }
                    }
                    c10 = '8';
                }
                c10 = '4';
            }
            if (c10 != '-' && ((c11 != c10 && (c10 != '0' || c11 == '/')) || c10 < '0' || c10 > '8')) {
                cVar.c(c10);
            }
            c12 = cF;
            iB = iB2;
            c11 = c10;
        }
        return cVar.toString();
    }

    public boolean d(String str, String str2) {
        return c(str).equals(c(str2));
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return a((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
    }
}
