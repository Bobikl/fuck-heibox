package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class SymbolTable {
    private final int indexMask;
    private final String[] symbols;

    public SymbolTable(int i10) {
        this.indexMask = i10 - 1;
        this.symbols = new String[i10];
        addSymbol("$ref", 0, 4, 1185263);
        String str = JSON.DEFAULT_TYPE_KEY;
        addSymbol(str, 0, str.length(), JSON.DEFAULT_TYPE_KEY.hashCode());
    }

    public static int hash(char[] cArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            i13 = (i13 * 31) + cArr[i10];
            i12++;
            i10++;
        }
        return i13;
    }

    private static String subString(String str, int i10, int i11) {
        char[] cArr = new char[i11];
        str.getChars(i10, i11 + i10, cArr, 0);
        return new String(cArr);
    }

    public String addSymbol(String str, int i10, int i11, int i12) {
        return addSymbol(str, i10, i11, i12, false);
    }

    public String addSymbol(String str, int i10, int i11, int i12, boolean z10) {
        int i13 = this.indexMask & i12;
        String str2 = this.symbols[i13];
        if (str2 == null) {
            if (i11 != str.length()) {
                str = subString(str, i10, i11);
            }
            String strIntern = str.intern();
            this.symbols[i13] = strIntern;
            return strIntern;
        }
        if (i12 == str2.hashCode() && i11 == str2.length() && str.startsWith(str2, i10)) {
            return str2;
        }
        String strSubString = subString(str, i10, i11);
        if (z10) {
            this.symbols[i13] = strSubString;
        }
        return strSubString;
    }

    public String addSymbol(char[] cArr, int i10, int i11) {
        return addSymbol(cArr, i10, i11, hash(cArr, i10, i11));
    }

    public String addSymbol(char[] cArr, int i10, int i11, int i12) {
        int i13 = this.indexMask & i12;
        String str = this.symbols[i13];
        if (str == null) {
            String strIntern = new String(cArr, i10, i11).intern();
            this.symbols[i13] = strIntern;
            return strIntern;
        }
        boolean z10 = false;
        if (i12 == str.hashCode() && i11 == str.length()) {
            for (int i14 = 0; i14 < i11; i14++) {
                if (cArr[i10 + i14] == str.charAt(i14)) {
                }
            }
            z10 = true;
        }
        return z10 ? str : new String(cArr, i10, i11);
    }
}
