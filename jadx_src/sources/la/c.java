package la;

import android.os.StatFs;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static byte[] A(InputStream inputStream) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, bb.c.b.f31017wb, new Class[]{InputStream.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        T(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] B(Reader reader) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader}, null, changeQuickRedirect, true, bb.c.b.f31039xb, new Class[]{Reader.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        X(reader, byteArrayOutputStream);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] C(Reader reader, String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader, str}, null, changeQuickRedirect, true, bb.c.b.f31061yb, new Class[]{Reader.class, String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Y(reader, byteArrayOutputStream, str);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] D(CharSequence charSequence) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, null, changeQuickRedirect, true, bb.c.b.f30973ub, new Class[]{CharSequence.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        return charSequence == null ? new byte[0] : charSequence.toString().getBytes();
    }

    public static byte[] E(CharSequence charSequence, String str) throws UnsupportedEncodingException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence, str}, null, changeQuickRedirect, true, bb.c.b.f30995vb, new Class[]{CharSequence.class, String.class}, byte[].class);
        if (patchProxyResultProxy.isSupported) {
            return (byte[]) patchProxyResultProxy.result;
        }
        return charSequence == null ? new byte[0] : charSequence.toString().getBytes(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ByteArrayOutputStream, java.io.Closeable, java.io.OutputStream] */
    public static byte[] F(Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, bb.c.b.f30929sb, new Class[]{Object.class}, byte[].class);
        ?? byteArrayOutputStream = patchProxyResultProxy.isSupported;
        if (byteArrayOutputStream != 0) {
            return (byte[]) patchProxyResultProxy.result;
        }
        Closeable closeable = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        c(objectOutputStream);
                        c(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e10) {
                        e = e10;
                        d.i(e);
                        c(objectOutputStream);
                        c(byteArrayOutputStream);
                        return null;
                    }
                } catch (IOException e11) {
                    e = e11;
                    objectOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    c(closeable);
                    c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
            }
        } catch (IOException e12) {
            e = e12;
            byteArrayOutputStream = 0;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = 0;
        }
    }

    public static char[] G(InputStream inputStream) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, bb.c.b.Ab, new Class[]{InputStream.class}, char[].class);
        if (patchProxyResultProxy.isSupported) {
            return (char[]) patchProxyResultProxy.result;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        V(inputStream, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static char[] H(InputStream inputStream, String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, str}, null, changeQuickRedirect, true, bb.c.b.Bb, new Class[]{InputStream.class, String.class}, char[].class);
        if (patchProxyResultProxy.isSupported) {
            return (char[]) patchProxyResultProxy.result;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        W(inputStream, charArrayWriter, str);
        return charArrayWriter.toCharArray();
    }

    public static char[] I(Reader reader) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader}, null, changeQuickRedirect, true, bb.c.b.Cb, new Class[]{Reader.class}, char[].class);
        if (patchProxyResultProxy.isSupported) {
            return (char[]) patchProxyResultProxy.result;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        Z(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static char[] J(CharSequence charSequence) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, null, changeQuickRedirect, true, bb.c.b.f31083zb, new Class[]{CharSequence.class}, char[].class);
        if (patchProxyResultProxy.isSupported) {
            return (char[]) patchProxyResultProxy.result;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        c0(charSequence, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream K(CharSequence charSequence) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence}, null, changeQuickRedirect, true, bb.c.b.f30655gb, new Class[]{CharSequence.class}, InputStream.class);
        return patchProxyResultProxy.isSupported ? (InputStream) patchProxyResultProxy.result : new ByteArrayInputStream(charSequence.toString().getBytes());
    }

    public static InputStream L(CharSequence charSequence, String str) throws UnsupportedEncodingException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{charSequence, str}, null, changeQuickRedirect, true, bb.c.b.f30678hb, new Class[]{CharSequence.class, String.class}, InputStream.class);
        return patchProxyResultProxy.isSupported ? (InputStream) patchProxyResultProxy.result : new ByteArrayInputStream(charSequence.toString().getBytes(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static Object M(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, bb.c.b.f30951tb, new Class[]{byte[].class}, Object.class);
        ?? byteArrayInputStream = patchProxyResultProxy.isSupported;
        if (byteArrayInputStream != 0) {
            return patchProxyResultProxy.result;
        }
        try {
            if (bArr == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object object = objectInputStream.readObject();
                        c(objectInputStream);
                        c(byteArrayInputStream);
                        return object;
                    } catch (Exception e10) {
                        e = e10;
                        d.i(e);
                        c(objectInputStream);
                        c(byteArrayInputStream);
                        return null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = 0;
                    c(bArr);
                    c(byteArrayInputStream);
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                objectInputStream = null;
                byteArrayInputStream = 0;
            } catch (Throwable th3) {
                byteArrayInputStream = 0;
                th = th3;
                bArr = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static String N(InputStream inputStream) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, bb.c.b.f30793mb, new Class[]{InputStream.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new String(A(inputStream));
    }

    public static String O(InputStream inputStream, String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, str}, null, changeQuickRedirect, true, bb.c.b.f30816nb, new Class[]{InputStream.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new String(A(inputStream), str);
    }

    public static String P(Reader reader) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader}, null, changeQuickRedirect, true, bb.c.b.f30839ob, new Class[]{Reader.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new String(B(reader));
    }

    public static String Q(Reader reader, String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader, str}, null, changeQuickRedirect, true, bb.c.b.f30862pb, new Class[]{Reader.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new String(B(reader), str);
    }

    public static String R(byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, null, changeQuickRedirect, true, bb.c.b.f30885qb, new Class[]{byte[].class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : new String(bArr);
    }

    public static String S(byte[] bArr, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr, str}, null, changeQuickRedirect, true, bb.c.b.f30907rb, new Class[]{byte[].class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static void T(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{inputStream, outputStream}, null, changeQuickRedirect, true, bb.c.b.Pb, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static void U(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{inputStream, outputStream, str}, null, changeQuickRedirect, true, bb.c.b.Tb, new Class[]{InputStream.class, OutputStream.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        X(new InputStreamReader(inputStream, str), outputStream);
    }

    public static void V(InputStream inputStream, Writer writer) throws IOException {
        if (PatchProxy.proxy(new Object[]{inputStream, writer}, null, changeQuickRedirect, true, bb.c.b.Rb, new Class[]{InputStream.class, Writer.class}, Void.TYPE).isSupported) {
            return;
        }
        Z(new InputStreamReader(inputStream), writer);
    }

    public static void W(InputStream inputStream, Writer writer, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{inputStream, writer, str}, null, changeQuickRedirect, true, bb.c.b.Ub, new Class[]{InputStream.class, Writer.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        Z(new InputStreamReader(inputStream, str), writer);
    }

    public static void X(Reader reader, OutputStream outputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{reader, outputStream}, null, changeQuickRedirect, true, bb.c.b.Qb, new Class[]{Reader.class, OutputStream.class}, Void.TYPE).isSupported) {
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        Z(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void Y(Reader reader, OutputStream outputStream, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{reader, outputStream, str}, null, changeQuickRedirect, true, bb.c.b.Sb, new Class[]{Reader.class, OutputStream.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        Z(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void Z(Reader reader, Writer writer) throws IOException {
        if (PatchProxy.proxy(new Object[]{reader, writer}, null, changeQuickRedirect, true, bb.c.b.Vb, new Class[]{Reader.class, Writer.class}, Void.TYPE).isSupported) {
            return;
        }
        char[] cArr = new char[4096];
        while (true) {
            int i10 = reader.read(cArr);
            if (-1 == i10) {
                return;
            } else {
                writer.write(cArr, 0, i10);
            }
        }
    }

    public static boolean a(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30563cc, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : new File(str).canRead();
    }

    public static void a0(CharSequence charSequence, OutputStream outputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{charSequence, outputStream}, null, changeQuickRedirect, true, bb.c.b.Nb, new Class[]{CharSequence.class, OutputStream.class}, Void.TYPE).isSupported || charSequence == null) {
            return;
        }
        outputStream.write(charSequence.toString().getBytes());
    }

    public static boolean b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30540bc, new Class[]{String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : new File(str).canWrite();
    }

    public static void b0(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{charSequence, outputStream, str}, null, changeQuickRedirect, true, 768, new Class[]{CharSequence.class, OutputStream.class, String.class}, Void.TYPE).isSupported || charSequence == null) {
            return;
        }
        outputStream.write(charSequence.toString().getBytes(str));
    }

    public static void c(Closeable closeable) {
        if (PatchProxy.proxy(new Object[]{closeable}, null, changeQuickRedirect, true, bb.c.b.f30609eb, new Class[]{Closeable.class}, Void.TYPE).isSupported || closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e10) {
            d.i(e10);
        }
    }

    public static void c0(CharSequence charSequence, Writer writer) throws IOException {
        if (PatchProxy.proxy(new Object[]{charSequence, writer}, null, changeQuickRedirect, true, bb.c.b.Mb, new Class[]{CharSequence.class, Writer.class}, Void.TYPE).isSupported || charSequence == null) {
            return;
        }
        writer.write(charSequence.toString());
    }

    public static boolean d(InputStream inputStream, InputStream inputStream2) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, inputStream2}, null, changeQuickRedirect, true, bb.c.b.Wb, new Class[]{InputStream.class, InputStream.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BufferedInputStream bufferedInputStreamW = w(inputStream);
        BufferedInputStream bufferedInputStreamW2 = w(inputStream2);
        for (int i10 = bufferedInputStreamW.read(); -1 != i10; i10 = bufferedInputStreamW.read()) {
            if (i10 != bufferedInputStreamW2.read()) {
                return false;
            }
        }
        return bufferedInputStreamW2.read() == -1;
    }

    public static void d0(byte[] bArr, OutputStream outputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{bArr, outputStream}, null, changeQuickRedirect, true, bb.c.b.Gb, new Class[]{byte[].class, OutputStream.class}, Void.TYPE).isSupported || bArr == null) {
            return;
        }
        outputStream.write(bArr);
    }

    public static boolean e(Reader reader, Reader reader2) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader, reader2}, null, changeQuickRedirect, true, bb.c.b.Xb, new Class[]{Reader.class, Reader.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BufferedReader bufferedReaderY = y(reader);
        BufferedReader bufferedReaderY2 = y(reader2);
        for (int i10 = bufferedReaderY.read(); -1 != i10; i10 = bufferedReaderY.read()) {
            if (i10 != bufferedReaderY2.read()) {
                return false;
            }
        }
        return bufferedReaderY2.read() == -1;
    }

    public static void e0(byte[] bArr, Writer writer) throws IOException {
        if (PatchProxy.proxy(new Object[]{bArr, writer}, null, changeQuickRedirect, true, bb.c.b.Hb, new Class[]{byte[].class, Writer.class}, Void.TYPE).isSupported || bArr == null) {
            return;
        }
        writer.write(new String(bArr));
    }

    public static boolean f(Reader reader, Reader reader2) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader, reader2}, null, changeQuickRedirect, true, bb.c.b.Yb, new Class[]{Reader.class, Reader.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        BufferedReader bufferedReaderY = y(reader);
        BufferedReader bufferedReaderY2 = y(reader2);
        String line = bufferedReaderY.readLine();
        String line2 = bufferedReaderY2.readLine();
        while (line != null && line2 != null && line.equals(line2)) {
            line = bufferedReaderY.readLine();
            line2 = bufferedReaderY2.readLine();
        }
        if (line != null) {
            return line2 == null || line.equals(line2);
        }
        return false;
    }

    public static void f0(byte[] bArr, Writer writer, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{bArr, writer, str}, null, changeQuickRedirect, true, bb.c.b.Ib, new Class[]{byte[].class, Writer.class, String.class}, Void.TYPE).isSupported || bArr == null) {
            return;
        }
        writer.write(new String(bArr, str));
    }

    public static boolean g(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.b.f30702ic, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (file.exists()) {
            if (file.isFile()) {
                return true;
            }
            o(file);
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static void g0(char[] cArr, OutputStream outputStream) throws IOException {
        if (PatchProxy.proxy(new Object[]{cArr, outputStream}, null, changeQuickRedirect, true, bb.c.b.Kb, new Class[]{char[].class, OutputStream.class}, Void.TYPE).isSupported || cArr == null) {
            return;
        }
        outputStream.write(new String(cArr).getBytes());
    }

    public static boolean h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30679hc, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return g(new File(str));
    }

    public static void h0(char[] cArr, OutputStream outputStream, String str) throws IOException {
        if (PatchProxy.proxy(new Object[]{cArr, outputStream, str}, null, changeQuickRedirect, true, 765, new Class[]{char[].class, OutputStream.class, String.class}, Void.TYPE).isSupported || cArr == null) {
            return;
        }
        outputStream.write(new String(cArr).getBytes(str));
    }

    public static boolean i(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.b.f30610ec, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            file.delete();
        }
        return file.mkdirs();
    }

    public static void i0(char[] cArr, Writer writer) throws IOException {
        if (PatchProxy.proxy(new Object[]{cArr, writer}, null, changeQuickRedirect, true, bb.c.b.Jb, new Class[]{char[].class, Writer.class}, Void.TYPE).isSupported || cArr == null) {
            return;
        }
        writer.write(cArr);
    }

    public static boolean j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30587dc, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return i(new File(str));
    }

    public static boolean k(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.b.f30748kc, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (file.exists()) {
            o(file);
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean l(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30725jc, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return k(new File(str));
    }

    public static boolean m(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.b.f30656gc, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return o(file) && i(file);
    }

    public static boolean n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30633fc, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return p(str) && j(str);
    }

    public static boolean o(File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.b.f30794mc, new Class[]{File.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        o(file2);
                    }
                }
                file.delete();
            }
        }
        return true;
    }

    public static boolean p(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30771lc, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return o(new File(str));
    }

    public static void q(Flushable flushable) {
        if (PatchProxy.proxy(new Object[]{flushable}, null, changeQuickRedirect, true, bb.c.b.f30632fb, new Class[]{Flushable.class}, Void.TYPE).isSupported || flushable == null) {
            return;
        }
        try {
            flushable.flush();
        } catch (Exception e10) {
            d.i(e10);
        }
    }

    public static long r(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.Zb, new Class[]{String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            return s(new StatFs(str), "getBlockSizeLong", "getAvailableBlocksLong");
        } catch (Exception e10) {
            d.i(e10);
            return 0L;
        }
    }

    private static long s(StatFs statFs, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{statFs, str, str2}, null, changeQuickRedirect, true, bb.c.b.f30517ac, new Class[]{StatFs.class, String.class, String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            Method method = statFs.getClass().getMethod(str, new Class[0]);
            method.setAccessible(true);
            Method method2 = statFs.getClass().getMethod(str2, new Class[0]);
            method2.setAccessible(true);
            return ((Long) method.invoke(statFs, new Object[0])).longValue() * ((Long) method2.invoke(statFs, new Object[0])).longValue();
        } catch (Throwable th2) {
            d.i(th2);
            return 0L;
        }
    }

    public static List<String> t(InputStream inputStream) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, bb.c.b.Eb, new Class[]{InputStream.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : v(new InputStreamReader(inputStream));
    }

    public static List<String> u(InputStream inputStream, String str) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream, str}, null, changeQuickRedirect, true, bb.c.b.Db, new Class[]{InputStream.class, String.class}, List.class);
        return patchProxyResultProxy.isSupported ? (List) patchProxyResultProxy.result : v(new InputStreamReader(inputStream, str));
    }

    public static List<String> v(Reader reader) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader}, null, changeQuickRedirect, true, bb.c.b.Fb, new Class[]{Reader.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        BufferedReader bufferedReaderY = y(reader);
        ArrayList arrayList = new ArrayList();
        for (String line = bufferedReaderY.readLine(); line != null; line = bufferedReaderY.readLine()) {
            arrayList.add(line);
        }
        return arrayList;
    }

    public static BufferedInputStream w(InputStream inputStream) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inputStream}, null, changeQuickRedirect, true, bb.c.b.f30701ib, new Class[]{InputStream.class}, BufferedInputStream.class);
        if (patchProxyResultProxy.isSupported) {
            return (BufferedInputStream) patchProxyResultProxy.result;
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
    }

    public static BufferedOutputStream x(OutputStream outputStream) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{outputStream}, null, changeQuickRedirect, true, bb.c.b.f30724jb, new Class[]{OutputStream.class}, BufferedOutputStream.class);
        if (patchProxyResultProxy.isSupported) {
            return (BufferedOutputStream) patchProxyResultProxy.result;
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream);
    }

    public static BufferedReader y(Reader reader) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{reader}, null, changeQuickRedirect, true, bb.c.b.f30747kb, new Class[]{Reader.class}, BufferedReader.class);
        if (patchProxyResultProxy.isSupported) {
            return (BufferedReader) patchProxyResultProxy.result;
        }
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static BufferedWriter z(Writer writer) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{writer}, null, changeQuickRedirect, true, bb.c.b.f30770lb, new Class[]{Writer.class}, BufferedWriter.class);
        if (patchProxyResultProxy.isSupported) {
            return (BufferedWriter) patchProxyResultProxy.result;
        }
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer);
    }
}
