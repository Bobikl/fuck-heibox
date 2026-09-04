package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class TPDLProxyUtils {
    private static final String FILE_NAME = "TPDLProxyUtils";

    public static String byteArrayToString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "byteArrayToString failed, error:" + th2.toString());
            return "";
        }
    }

    public static String losePackageCheck(int i10) {
        String strSubstring;
        String strSubstring2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ping -c " + i10 + " www.qq.com").getInputStream()));
            strSubstring = "";
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.contains(" packet loss")) {
                        strSubstring2 = line.substring(10 + line.indexOf("received, "), line.indexOf("%") + 1);
                    }
                    if (line.contains("avg")) {
                        int iIndexOf = line.indexOf("/", 20);
                        strSubstring = line.substring(iIndexOf + 1, line.indexOf(".", iIndexOf));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            strSubstring = "";
        }
        return strSubstring2 + ";" + strSubstring;
    }

    public static int objectToInt(Object obj, int i10) {
        if (obj == null) {
            return i10;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "object to int failed, error:" + th2.toString());
            return i10;
        }
    }

    public static long objectToLong(Object obj, long j10) {
        if (obj == null) {
            return j10;
        }
        try {
            return ((Long) obj).longValue();
        } catch (Throwable th2) {
            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "object to long failed, error:" + th2.toString());
            return j10;
        }
    }

    public static String serialize(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(obj);
                    String string = byteArrayOutputStream.toString("ISO-8859-1");
                    try {
                        objectOutputStream2.close();
                    } catch (Throwable th2) {
                        TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string  objectOutputStream close, error:" + th2.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string byteArrayOutputStream close, error:" + th3.toString());
                    }
                    return string;
                } catch (Throwable th4) {
                    th = th4;
                    objectOutputStream = objectOutputStream2;
                    try {
                        TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "serialize obj, error:" + th.toString());
                        try {
                            return "";
                        } catch (Throwable th5) {
                            return "";
                        }
                    } finally {
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (Throwable th6) {
                                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string  objectOutputStream close, error:" + th6.toString());
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th7) {
                            TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "obj serialize to string byteArrayOutputStream close, error:" + th7.toString());
                        }
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            byteArrayOutputStream = null;
        }
    }

    public static Object serializeToObject(String str) {
        ObjectInputStream objectInputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (Throwable th2) {
                        TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "serialize to obj objectInputStream close, error:" + th2.toString());
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "serialize to obj byteArrayInputStream close, error:" + th3.toString());
                    }
                    return object;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "serialize to obj , error:" + th.toString());
                        return null;
                    } finally {
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable th5) {
                                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "serialize to obj objectInputStream close, error:" + th5.toString());
                            }
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th6) {
                                TPDLProxyLog.e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "serialize to obj byteArrayInputStream close, error:" + th6.toString());
                            }
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                objectInputStream = null;
            }
        } catch (Throwable th8) {
            th = th8;
            objectInputStream = null;
            byteArrayInputStream = null;
        }
    }
}
