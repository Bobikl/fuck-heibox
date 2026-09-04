package com.alibaba.fastjson.asm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public class ClassReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f37887b;
    public final int header;
    private final int[] items;
    private final int maxStringLength;
    private boolean readAnnotations;
    private final String[] strings;

    public ClassReader(InputStream inputStream, boolean z10) throws IOException {
        int i10;
        this.readAnnotations = z10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i11 = inputStream.read(bArr);
            i10 = 0;
            if (i11 == -1) {
                break;
            } else if (i11 > 0) {
                byteArrayOutputStream.write(bArr, 0, i11);
            }
        }
        inputStream.close();
        this.f37887b = byteArrayOutputStream.toByteArray();
        int[] iArr = new int[readUnsignedShort(8)];
        this.items = iArr;
        int length = iArr.length;
        this.strings = new String[length];
        int i12 = 10;
        int i13 = 1;
        while (i13 < length) {
            int i14 = i12 + 1;
            this.items[i13] = i14;
            byte b10 = this.f37887b[i12];
            int unsignedShort = 5;
            if (b10 == 1) {
                unsignedShort = readUnsignedShort(i14) + 3;
                if (unsignedShort > i10) {
                    i10 = unsignedShort;
                }
            } else if (b10 == 15) {
                unsignedShort = 4;
            } else if (b10 != 18 && b10 != 3 && b10 != 4) {
                if (b10 != 5 && b10 != 6) {
                    switch (b10) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            break;
                        default:
                            unsignedShort = 3;
                            break;
                    }
                } else {
                    unsignedShort = 9;
                    i13++;
                }
            }
            i12 += unsignedShort;
            i13++;
        }
        this.maxStringLength = i10;
        this.header = i12;
    }

    private int getAttributes() {
        int i10 = this.header;
        int unsignedShort = i10 + 8 + (readUnsignedShort(i10 + 6) * 2);
        for (int unsignedShort2 = readUnsignedShort(unsignedShort); unsignedShort2 > 0; unsignedShort2--) {
            for (int unsignedShort3 = readUnsignedShort(unsignedShort + 8); unsignedShort3 > 0; unsignedShort3--) {
                unsignedShort += readInt(unsignedShort + 12) + 6;
            }
            unsignedShort += 8;
        }
        int i11 = unsignedShort + 2;
        for (int unsignedShort4 = readUnsignedShort(i11); unsignedShort4 > 0; unsignedShort4--) {
            for (int unsignedShort5 = readUnsignedShort(i11 + 8); unsignedShort5 > 0; unsignedShort5--) {
                i11 += readInt(i11 + 12) + 6;
            }
            i11 += 8;
        }
        return i11 + 2;
    }

    private int readInt(int i10) {
        byte[] bArr = this.f37887b;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int readMethod(TypeCollector typeCollector, char[] cArr, int i10) {
        int unsignedShort = readUnsignedShort(i10);
        String utf8 = readUTF8(i10 + 2, cArr);
        String utf9 = readUTF8(i10 + 4, cArr);
        int i11 = i10 + 8;
        int i12 = 0;
        int i13 = 0;
        for (int unsignedShort2 = readUnsignedShort(i10 + 6); unsignedShort2 > 0; unsignedShort2--) {
            String utf10 = readUTF8(i11, cArr);
            int i14 = readInt(i11 + 2);
            int i15 = i11 + 6;
            if (utf10.equals("Code")) {
                i13 = i15;
            }
            i11 = i15 + i14;
        }
        MethodCollector methodCollectorVisitMethod = typeCollector.visitMethod(unsignedShort, utf8, utf9);
        if (methodCollectorVisitMethod != null && i13 != 0) {
            int i16 = i13 + 8 + readInt(i13 + 4);
            int i17 = i16 + 2;
            for (int unsignedShort3 = readUnsignedShort(i16); unsignedShort3 > 0; unsignedShort3--) {
                i17 += 8;
            }
            int i18 = i17 + 2;
            int i19 = 0;
            for (int unsignedShort4 = readUnsignedShort(i17); unsignedShort4 > 0; unsignedShort4--) {
                String utf11 = readUTF8(i18, cArr);
                if (utf11.equals("LocalVariableTable")) {
                    i12 = i18 + 6;
                } else if (utf11.equals("LocalVariableTypeTable")) {
                    i19 = i18 + 6;
                }
                i18 += readInt(i18 + 2) + 6;
            }
            if (i12 != 0) {
                if (i19 != 0) {
                    int unsignedShort5 = readUnsignedShort(i19) * 3;
                    int i20 = i19 + 2;
                    int[] iArr = new int[unsignedShort5];
                    while (unsignedShort5 > 0) {
                        int i21 = unsignedShort5 - 1;
                        iArr[i21] = i20 + 6;
                        int i22 = i21 - 1;
                        iArr[i22] = readUnsignedShort(i20 + 8);
                        unsignedShort5 = i22 - 1;
                        iArr[unsignedShort5] = readUnsignedShort(i20);
                        i20 += 10;
                    }
                }
                int i23 = i12 + 2;
                for (int unsignedShort6 = readUnsignedShort(i12); unsignedShort6 > 0; unsignedShort6--) {
                    methodCollectorVisitMethod.visitLocalVariable(readUTF8(i23 + 4, cArr), readUnsignedShort(i23 + 8));
                    i23 += 10;
                }
            }
        }
        return i11;
    }

    private String readUTF(int i10, int i11, char[] cArr) {
        int i12;
        int i13 = i11 + i10;
        byte[] bArr = this.f37887b;
        int i14 = 0;
        char c10 = 0;
        char c11 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            if (c10 == 0) {
                int i16 = b10 & 255;
                if (i16 < 128) {
                    cArr[i14] = (char) i16;
                    i14++;
                } else if (i16 >= 224 || i16 <= 191) {
                    c11 = (char) (i16 & 15);
                    c10 = 2;
                } else {
                    i12 = i16 & 31;
                    c11 = (char) i12;
                    c10 = 1;
                }
            } else if (c10 == 1) {
                cArr[i14] = (char) ((b10 & Utf8.REPLACEMENT_BYTE) | (c11 << 6));
                i14++;
                c10 = 0;
            } else if (c10 == 2) {
                i12 = (b10 & Utf8.REPLACEMENT_BYTE) | (c11 << 6);
                c11 = (char) i12;
                c10 = 1;
            }
            i10 = i15;
        }
        return new String(cArr, 0, i14);
    }

    private String readUTF8(int i10, char[] cArr) {
        int unsignedShort = readUnsignedShort(i10);
        String[] strArr = this.strings;
        String str = strArr[unsignedShort];
        if (str != null) {
            return str;
        }
        int i11 = this.items[unsignedShort];
        String utf = readUTF(i11 + 2, readUnsignedShort(i11), cArr);
        strArr[unsignedShort] = utf;
        return utf;
    }

    private int readUnsignedShort(int i10) {
        byte[] bArr = this.f37887b;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public void accept(TypeCollector typeCollector) {
        int i10;
        char[] cArr = new char[this.maxStringLength];
        if (!this.readAnnotations) {
            i10 = 0;
            break;
        }
        int attributes = getAttributes();
        int unsignedShort = readUnsignedShort(attributes);
        while (true) {
            if (unsignedShort <= 0) {
                i10 = 0;
                break;
            } else if ("RuntimeVisibleAnnotations".equals(readUTF8(attributes + 2, cArr))) {
                i10 = attributes + 8;
                break;
            } else {
                attributes += readInt(attributes + 4) + 6;
                unsignedShort--;
            }
        }
        int i11 = this.header;
        int i12 = this.items[readUnsignedShort(i11 + 4)];
        int unsignedShort2 = readUnsignedShort(i11 + 6);
        int i13 = i11 + 8;
        for (int i14 = 0; i14 < unsignedShort2; i14++) {
            i13 += 2;
        }
        int i15 = i13 + 2;
        int i16 = i15;
        for (int unsignedShort3 = readUnsignedShort(i13); unsignedShort3 > 0; unsignedShort3--) {
            i16 += 8;
            for (int unsignedShort4 = readUnsignedShort(i16 + 6); unsignedShort4 > 0; unsignedShort4--) {
                i16 += readInt(i16 + 2) + 6;
            }
        }
        int i17 = i16 + 2;
        for (int unsignedShort5 = readUnsignedShort(i16); unsignedShort5 > 0; unsignedShort5--) {
            i17 += 8;
            for (int unsignedShort6 = readUnsignedShort(i17 + 6); unsignedShort6 > 0; unsignedShort6--) {
                i17 += readInt(i17 + 2) + 6;
            }
        }
        int i18 = i17 + 2;
        for (int unsignedShort7 = readUnsignedShort(i17); unsignedShort7 > 0; unsignedShort7--) {
            i18 += readInt(i18 + 2) + 6;
        }
        if (i10 != 0) {
            int i19 = i10 + 2;
            for (int unsignedShort8 = readUnsignedShort(i10); unsignedShort8 > 0; unsignedShort8--) {
                typeCollector.visitAnnotation(readUTF8(i19, cArr));
            }
        }
        for (int unsignedShort9 = readUnsignedShort(i13); unsignedShort9 > 0; unsignedShort9--) {
            i15 += 8;
            for (int unsignedShort10 = readUnsignedShort(i15 + 6); unsignedShort10 > 0; unsignedShort10--) {
                i15 += readInt(i15 + 2) + 6;
            }
        }
        int method = i15 + 2;
        for (int unsignedShort11 = readUnsignedShort(i15); unsignedShort11 > 0; unsignedShort11--) {
            method = readMethod(typeCollector, cArr, method);
        }
    }
}
