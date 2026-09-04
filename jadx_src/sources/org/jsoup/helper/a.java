package org.jsoup.helper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.f;

/* JADX INFO: compiled from: DataUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f137835a = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f137836b = "UTF-8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f137837c = 131072;

    private a() {
    }

    static String a(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f137835a.matcher(str);
        if (matcher.find()) {
            String strTrim = matcher.group(1).trim();
            if (Charset.isSupported(strTrim)) {
                return strTrim;
            }
            String upperCase = strTrim.toUpperCase(Locale.ENGLISH);
            if (Charset.isSupported(upperCase)) {
                return upperCase;
            }
        }
        return null;
    }

    public static Document b(File file, String str, String str2) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                Document documentE = e(f(fileInputStream2), str, str2, org.jsoup.parser.d.c());
                fileInputStream2.close();
                return documentE;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Document c(InputStream inputStream, String str, String str2) throws IOException {
        return e(f(inputStream), str, str2, org.jsoup.parser.d.c());
    }

    public static Document d(InputStream inputStream, String str, String str2, org.jsoup.parser.d dVar) throws IOException {
        return e(f(inputStream), str, str2, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0059  */
    static Document e(ByteBuffer byteBuffer, String str, String str2, org.jsoup.parser.d dVar) {
        String string;
        Document document = null;
        if (str == null) {
            string = Charset.forName("UTF-8").decode(byteBuffer).toString();
            Document documentI = dVar.i(string, str2);
            f fVarS = documentI.C1("meta[http-equiv=content-type], meta[charset]").s();
            if (fVarS == null) {
                document = documentI;
            } else {
                String strA = fVarS.v("http-equiv") ? a(fVarS.g("content")) : fVarS.g("charset");
                if (strA == null || strA.length() == 0 || strA.equals("UTF-8")) {
                    document = documentI;
                } else {
                    byteBuffer.rewind();
                    string = Charset.forName(strA).decode(byteBuffer).toString();
                    str = strA;
                }
            }
        } else {
            d.i(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            string = Charset.forName(str).decode(byteBuffer).toString();
        }
        if (document != null) {
            return document;
        }
        if (string.length() > 0 && string.charAt(0) == 65279) {
            string = string.substring(1);
        }
        Document documentI2 = dVar.i(string, str2);
        documentI2.Z1().b(str);
        return documentI2;
    }

    static ByteBuffer f(InputStream inputStream) throws IOException {
        return g(inputStream, 0);
    }

    static ByteBuffer g(InputStream inputStream, int i10) throws IOException {
        d.e(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
        boolean z10 = i10 > 0;
        byte[] bArr = new byte[131072];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(131072);
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                break;
            }
            if (z10) {
                if (i11 > i10) {
                    byteArrayOutputStream.write(bArr, 0, i10);
                    break;
                }
                i10 -= i11;
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }
}
