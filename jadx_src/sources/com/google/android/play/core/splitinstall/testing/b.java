package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import androidx.annotation.p0;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitinstall.f1;
import com.google.android.play.core.splitinstall.h1;
import com.google.android.play.core.splitinstall.internal.w0;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private static a f56405a;

    private b() {
    }

    public static a a(Context context) {
        try {
            File fileA = h1.a(context).A();
            if (fileA == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (fileA.exists()) {
                return b(context, fileA);
            }
            throw new LocalTestingException(String.format("Local testing directory not found: %s", fileA));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized a b(Context context, File file) {
        a aVar = f56405a;
        if (aVar == null) {
            f56405a = c(context, file);
        } else if (!aVar.s().getAbsolutePath().equals(file.getAbsolutePath())) {
            throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f56405a.s().getAbsolutePath(), file.getAbsolutePath()));
        }
        return f56405a;
    }

    public static a c(Context context, final File file) {
        com.google.android.play.core.splitcompat.a.a(context);
        return new a(context, file, new f1(context, context.getPackageName()), new w0() { // from class: com.google.android.play.core.splitinstall.testing.v
            @Override // com.google.android.play.core.splitinstall.internal.w0
            public final Object zza() {
                return d.a(file);
            }
        });
    }
}
