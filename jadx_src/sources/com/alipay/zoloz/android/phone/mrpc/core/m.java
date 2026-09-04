package com.alipay.zoloz.android.phone.mrpc.core;

import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: IOUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class m {
    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(i10);
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("IOUtil", "", e10);
            }
        }
    }

    public static String c(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (IOException e10) {
                        Log.e("IOUtil", "", e10);
                        inputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        Log.e("IOUtil", "", e11);
                    }
                    throw th2;
                }
            } catch (IOException e12) {
                Log.e("IOUtil", "", e12);
            }
        }
        inputStream.close();
        return sb2.toString();
    }

    public static byte[] d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            int i10 = (int) length;
            if (i10 != length) {
                throw new IOException("File size >= 2 GB");
            }
            byte[] bArr = new byte[i10];
            randomAccessFile.readFully(bArr);
            randomAccessFile.close();
            return bArr;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }
}
