package com.alibaba.fastjson.asm;

import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import lg.a;
import okhttp3.t;

/* JADX INFO: loaded from: classes6.dex */
public class Type {
    private final char[] buf;
    private final int len;
    private final int off;
    protected final int sort;
    public static final Type VOID_TYPE = new Type(0, null, 1443168256, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
    public static final Type CHAR_TYPE = new Type(2, null, 1124075009, 1);
    public static final Type BYTE_TYPE = new Type(3, null, 1107297537, 1);
    public static final Type SHORT_TYPE = new Type(4, null, 1392510721, 1);
    public static final Type INT_TYPE = new Type(5, null, 1224736769, 1);
    public static final Type FLOAT_TYPE = new Type(6, null, 1174536705, 1);
    public static final Type LONG_TYPE = new Type(7, null, 1241579778, 1);
    public static final Type DOUBLE_TYPE = new Type(8, null, 1141048066, 1);

    private Type(int i10, char[] cArr, int i11, int i12) {
        this.sort = i10;
        this.buf = cArr;
        this.off = i11;
        this.len = i12;
    }

    static Type[] getArgumentTypes(String str) {
        char[] charArray = str.toCharArray();
        int i10 = 1;
        int i11 = 0;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char c10 = charArray[i12];
            if (c10 == ')') {
                break;
            }
            if (c10 == 'L') {
                while (true) {
                    i12 = i13 + 1;
                    if (charArray[i13] == ';') {
                        break;
                    }
                    i13 = i12;
                }
                i11++;
            } else {
                if (c10 != '[') {
                    i11++;
                }
                i12 = i13;
            }
        }
        Type[] typeArr = new Type[i11];
        int i14 = 0;
        while (charArray[i10] != ')') {
            Type type = getType(charArray, i10);
            typeArr[i14] = type;
            i10 += type.len + (type.sort == 10 ? 2 : 0);
            i14++;
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int i10;
        int i11 = 1;
        int i12 = 1;
        int i13 = 1;
        while (true) {
            i10 = i12 + 1;
            char cCharAt = str.charAt(i12);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt == 'L') {
                while (true) {
                    i12 = i10 + 1;
                    if (str.charAt(i10) == ';') {
                        break;
                    }
                    i10 = i12;
                }
                i13++;
            } else {
                i13 = (cCharAt == 'D' || cCharAt == 'J') ? i13 + 2 : i13 + 1;
                i12 = i10;
            }
        }
        char cCharAt2 = str.charAt(i10);
        int i14 = i13 << 2;
        if (cCharAt2 == 'V') {
            i11 = 0;
        } else if (cCharAt2 == 'D' || cCharAt2 == 'J') {
            i11 = 2;
        }
        return i14 | i11;
    }

    private int getDimensions() {
        int i10 = 1;
        while (this.buf[this.off + i10] == '[') {
            i10++;
        }
        return i10;
    }

    public static Type getType(String str) {
        return getType(str.toCharArray(), 0);
    }

    private static Type getType(char[] cArr, int i10) {
        char c10;
        char c11 = cArr[i10];
        if (c11 == 'F') {
            return FLOAT_TYPE;
        }
        if (c11 == 'S') {
            return SHORT_TYPE;
        }
        if (c11 == 'V') {
            return VOID_TYPE;
        }
        if (c11 == 'I') {
            return INT_TYPE;
        }
        if (c11 == 'J') {
            return LONG_TYPE;
        }
        if (c11 == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (c11 != '[') {
            switch (c11) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    int i11 = 1;
                    while (cArr[i10 + i11] != ';') {
                        i11++;
                    }
                    return new Type(10, cArr, i10 + 1, i11 - 1);
            }
        }
        int i12 = 1;
        while (true) {
            c10 = cArr[i10 + i12];
            if (c10 != '[') {
                break;
            }
            i12++;
        }
        if (c10 == 'L') {
            do {
                i12++;
            } while (cArr[i10 + i12] != ';');
        }
        return new Type(9, cArr, i10, i12 + 1);
    }

    protected String getClassName() {
        switch (this.sort) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return Constants.CHAR;
            case 3:
                return Constants.BYTE;
            case 4:
                return Constants.SHORT;
            case 5:
                return Constants.INT;
            case 6:
                return "float";
            case 7:
                return Constants.LONG;
            case 8:
                return Constants.DOUBLE;
            case 9:
                StringBuffer stringBuffer = new StringBuffer(getType(this.buf, this.off + getDimensions()).getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    stringBuffer.append(t.f132643o);
                }
                return stringBuffer.toString();
            default:
                return new String(this.buf, this.off, this.len).replace(IOUtils.DIR_SEPARATOR_UNIX, a.f131414g);
        }
    }

    String getDescriptor() {
        return new String(this.buf, this.off, this.len);
    }

    public String getInternalName() {
        return new String(this.buf, this.off, this.len);
    }
}
