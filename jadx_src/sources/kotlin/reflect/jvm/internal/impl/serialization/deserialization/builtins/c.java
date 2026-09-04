package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import dl.d;
import dl.e;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BuiltInsResourceLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    @e
    public final InputStream a(@d String path) throws IOException {
        f0.p(path, "path");
        ClassLoader classLoader = c.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
