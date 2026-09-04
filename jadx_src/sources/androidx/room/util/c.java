package androidx.room.util;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FileUtil.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "FileUtil")
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Ljava/nio/channels/ReadableByteChannel;", "input", "Ljava/nio/channels/FileChannel;", "output", "Lkotlin/b2;", ak.av, "room-runtime_release"}, k = 2, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class c {
    @SuppressLint({"LambdaLast"})
    public static final void a(@dl.d ReadableByteChannel input, @dl.d FileChannel output) throws IOException {
        f0.p(input, "input");
        f0.p(output, "output");
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(input);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(output);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i10 = inputStreamNewInputStream.read(bArr);
                    if (i10 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i10);
                    }
                }
            } else {
                output.transferFrom(input, 0L, Long.MAX_VALUE);
            }
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
