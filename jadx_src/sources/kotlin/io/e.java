package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String string = sb2.toString();
        f0.o(string, "sb.toString()");
        return string;
    }
}
