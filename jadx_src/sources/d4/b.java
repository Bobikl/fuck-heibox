package d4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: InputStreamUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(i10);
        }
    }

    public static final byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            byte[] byteArray = null;
            try {
                int i10 = inputStream.read(bArr, 0, 100);
                if (i10 <= 0) {
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (OutOfMemoryError e10) {
                e10.printStackTrace();
                return byteArray;
            }
        }
    }
}
