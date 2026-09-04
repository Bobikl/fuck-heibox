package com.umeng.socialize.c.b;

import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: ImageFormat.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f106182a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f106183b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f106184c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f106185d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f106186e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f106187f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f106188g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f106189h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106190i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f106191j = 9;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f106192k = 10;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f106193l = 11;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f106194m = {"jpeg", "gif", "png", "bmp", "pcx", "iff", "ras", "pbm", "pgm", "ppm", "psd", "swf"};

    public static String a(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr);
                try {
                    int i10 = byteArrayInputStream2.read();
                    int i11 = byteArrayInputStream2.read();
                    if (i10 == 71 && i11 == 73) {
                        String str = f106194m[1];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e10) {
                            SLog.error(UmengText.IMAGE.CLOSE, e10);
                        }
                        return str;
                    }
                    if (i10 == 137 && i11 == 80) {
                        String str2 = f106194m[2];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e11) {
                            SLog.error(UmengText.IMAGE.CLOSE, e11);
                        }
                        return str2;
                    }
                    if (i10 == 255 && i11 == 216) {
                        String str3 = f106194m[0];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e12) {
                            SLog.error(UmengText.IMAGE.CLOSE, e12);
                        }
                        return str3;
                    }
                    if (i10 == 66 && i11 == 77) {
                        String str4 = f106194m[3];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e13) {
                            SLog.error(UmengText.IMAGE.CLOSE, e13);
                        }
                        return str4;
                    }
                    if (i10 == 10 && i11 < 6) {
                        String str5 = f106194m[4];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e14) {
                            SLog.error(UmengText.IMAGE.CLOSE, e14);
                        }
                        return str5;
                    }
                    if (i10 == 70 && i11 == 79) {
                        String str6 = f106194m[5];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e15) {
                            SLog.error(UmengText.IMAGE.CLOSE, e15);
                        }
                        return str6;
                    }
                    if (i10 == 89 && i11 == 166) {
                        String str7 = f106194m[6];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e16) {
                            SLog.error(UmengText.IMAGE.CLOSE, e16);
                        }
                        return str7;
                    }
                    if (i10 == 80 && i11 >= 49 && i11 <= 54) {
                        int i12 = i11 - 48;
                        if (i12 < 1 || i12 > 6) {
                            try {
                                byteArrayInputStream2.close();
                            } catch (IOException e17) {
                                SLog.error(UmengText.IMAGE.CLOSE, e17);
                            }
                            return "";
                        }
                        String str8 = f106194m[new int[]{7, 8, 9}[(i12 - 1) % 3]];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e18) {
                            SLog.error(UmengText.IMAGE.CLOSE, e18);
                        }
                        return str8;
                    }
                    if (i10 == 56 && i11 == 66) {
                        String str9 = f106194m[10];
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e19) {
                            SLog.error(UmengText.IMAGE.CLOSE, e19);
                        }
                        return str9;
                    }
                    if (i10 != 70 || i11 != 87) {
                        try {
                            byteArrayInputStream2.close();
                        } catch (IOException e20) {
                            SLog.error(UmengText.IMAGE.CLOSE, e20);
                        }
                        return "";
                    }
                    String str10 = f106194m[11];
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException e21) {
                        SLog.error(UmengText.IMAGE.CLOSE, e21);
                    }
                    return str10;
                } catch (Exception e22) {
                    e = e22;
                    byteArrayInputStream = byteArrayInputStream2;
                    SLog.error(UmengText.IMAGE.CHECK_FORMAT_ERROR, e);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e23) {
                            SLog.error(UmengText.IMAGE.CLOSE, e23);
                        }
                    }
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e24) {
                            SLog.error(UmengText.IMAGE.CLOSE, e24);
                        }
                    }
                    throw th;
                }
            } catch (Exception e25) {
                e = e25;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
