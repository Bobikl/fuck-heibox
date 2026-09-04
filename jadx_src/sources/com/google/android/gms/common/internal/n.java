package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
@Deprecated
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f52534b = new g("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static n f52535c = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f52536a = new ConcurrentHashMap();

    @z8.d0
    protected n() {
    }

    @androidx.annotation.n0
    @v8.a
    public static n a() {
        return f52535c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    @androidx.annotation.n0
    @v8.a
    @Deprecated
    public String b(@androidx.annotation.n0 String str) throws Throwable {
        ?? r10;
        String property;
        p.i(str, "Please provide a valid libraryName");
        if (this.f52536a.containsKey(str)) {
            return (String) this.f52536a.get(str);
        }
        Properties properties = new Properties();
        ?? r11 = 0;
        r11 = 0;
        r11 = 0;
        InputStream inputStream = null;
        try {
            try {
                InputStream resourceAsStream = n.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        f52534b.l("LibraryVersion", str + " version is " + property);
                    } else {
                        f52534b.n("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                    if (resourceAsStream != null) {
                        r11 = property;
                        z8.q.b(resourceAsStream);
                    }
                } catch (IOException e10) {
                    e = e10;
                    ?? r12 = r11;
                    inputStream = resourceAsStream;
                    r10 = r12;
                    f52534b.f("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    if (inputStream != null) {
                        z8.q.b(inputStream);
                    }
                    r11 = r10;
                } catch (Throwable th2) {
                    th = th2;
                    r11 = resourceAsStream;
                    if (r11 != 0) {
                        z8.q.b(r11);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
            r10 = 0;
        }
        if (r11 == 0) {
            f52534b.c("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r11 = "UNKNOWN";
        }
        this.f52536a.put(str, r11);
        return r11;
    }
}
