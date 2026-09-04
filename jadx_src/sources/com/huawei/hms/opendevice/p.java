package com.huawei.hms.opendevice;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.huawei.secure.android.common.util.IOUtil;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: StreamUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p {
    public static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = inputStream.read();
        while (-1 != i10) {
            byteArrayOutputStream.write(i10);
            i10 = inputStream.read();
        }
        String string = byteArrayOutputStream.toString("UTF-8");
        a((Closeable) inputStream);
        IOUtil.closeSecure((OutputStream) byteArrayOutputStream);
        return string;
    }

    public static String a(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        File file = new File(str);
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        } catch (FileNotFoundException unused) {
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", "file not exist.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                        } catch (IOException unused2) {
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", "read value IOException.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            throw th;
                        }
                    }
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException unused5) {
            inputStreamReader = null;
        } catch (IOException unused6) {
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
        return sb2.toString();
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HMSLog.w("StreamUtil", "close IOException");
            }
        }
    }

    public static void a(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() == null) {
            HMSLog.e("StreamUtil", "parent file is null.");
            throw new IOException("parent file is null");
        }
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            HMSLog.e("StreamUtil", "make parent dirs failed.");
            throw new IOException("make parent dirs failed");
        }
        if (file.createNewFile()) {
            return;
        }
        HMSLog.e("StreamUtil", "create file failed.");
        throw new IOException("create file failed");
    }

    public static void a(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Throwable unused) {
                HMSLog.w("StreamUtil", "close HttpsURLConnection Exception");
            }
        }
    }
}
