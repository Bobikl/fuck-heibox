package z8;

import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.p0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private static String f141954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f141955b;

    private x() {
    }

    @v8.a
    @p0
    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (f141954a == null) {
            int iMyPid = f141955b;
            if (iMyPid == 0) {
                iMyPid = Process.myPid();
                f141955b = iMyPid;
            }
            String strTrim = null;
            strTrim = null;
            strTrim = null;
            BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    String str = "/proc/" + iMyPid + "/cmdline";
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader.readLine();
                            com.google.android.gms.common.internal.p.l(line);
                            strTrim = line.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            q.b(bufferedReader2);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th3;
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                q.b(bufferedReader);
            }
            f141954a = strTrim;
        }
        return f141954a;
    }
}
