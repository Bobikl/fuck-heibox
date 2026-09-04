package org.apache.tools.ant.taskdefs;

import com.alibaba.fastjson.parser.JSONLexer;
import com.meituan.robust.Constants;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: CVSPass.java */
/* JADX INFO: loaded from: classes5.dex */
public class a0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f133677l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f133676k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f133678m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final char[] f133679n = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, JSONLexer.EOI, 27, 28, 29, 30, 31, 'r', 'x', '5', 'O', '`', 'm', 'H', 'l', 'F', '@', Constants.OBJECT_TYPE, 'C', 't', 'J', 'D', 'W', 'o', '4', 'K', 'w', '1', kotlin.text.y.f128593b, 'R', 'Q', '_', 'A', 'p', 'V', 'v', 'n', 'z', 'i', ')', '9', 'S', '+', lg.a.f131414g, 'f', '(', 'Y', kotlin.text.y.f128595d, 'g', '-', '2', '*', '{', '[', '#', '}', '7', '6', 'B', '|', '~', ';', IOUtils.DIR_SEPARATOR_UNIX, IOUtils.DIR_SEPARATOR_WINDOWS, 'G', 's', 'N', 'X', 'k', 'j', '8', kotlin.text.y.f128594c, 'y', 'u', 'h', 'e', 'd', 'E', 'I', 'c', '?', '^', ']', '\'', '%', n5.a.f132013h, '0', ':', 'q', ' ', 'Z', ',', 'b', kotlin.text.y.f128596e, '3', '!', 'a', kotlin.text.y.f128597f, 'M', 'T', 'P', 'U', 223, 225, 216, 187, 166, 229, kotlin.text.y.f128611t, 222, 188, 141, 249, 148, 200, 184, 136, 248, 190, 199, 170, 181, 204, 138, 232, 218, kotlin.text.y.f128610s, 255, 234, 220, 247, 213, 203, 226, 193, kotlin.text.y.f128606o, 172, 228, 252, 217, 201, 131, 230, 197, 211, 145, 238, 161, 179, kotlin.text.y.f128598g, 212, 207, 221, 254, 173, 202, 146, 224, 151, 140, 196, 205, 130, 135, 133, 143, 246, 192, 159, 244, 239, 185, 168, kotlin.text.y.f128599h, 144, 139, 165, 180, 157, 147, 186, 214, kotlin.text.y.f128607p, 227, 231, 219, kotlin.text.y.f128603l, 175, 156, 206, 198, 129, 164, 150, 210, 154, kotlin.text.y.f128608q, 134, com.google.common.base.a.N, kotlin.text.y.f128609r, 128, 158, 208, kotlin.text.y.f128600i, 132, kotlin.text.y.f128602k, 209, 149, 241, 153, 251, 237, 236, 171, 195, 243, 233, 253, 240, 194, 250, 191, 155, 142, 137, 245, 235, kotlin.text.y.f128601j, 242, 178, 152};

    public a0() {
        this.f133677l = null;
        this.f133677l = new File(System.getProperty("cygwin.user.home", System.getProperty("user.home")) + File.separatorChar + ".cvspass");
    }

    private final String i2(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            sb2.append(this.f133679n[c10]);
        }
        return sb2.toString();
    }

    @Override // org.apache.tools.ant.u2
    public final void D1() throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        IOException iOException;
        BufferedReader bufferedReader;
        if (this.f133676k == null) {
            throw new BuildException("cvsroot is required");
        }
        if (this.f133678m == null) {
            throw new BuildException("password is required");
        }
        x1("cvsRoot: " + this.f133676k, 4);
        x1("password: " + this.f133678m, 4);
        x1("passFile: " + this.f133677l, 4);
        BufferedReader bufferedReader2 = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (this.f133677l.exists()) {
                bufferedReader = new BufferedReader(new FileReader(this.f133677l));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else if (!line.startsWith(this.f133676k)) {
                            sb2.append(line);
                            sb2.append(System.lineSeparator());
                        }
                    } catch (IOException e10) {
                        iOException = e10;
                        bufferedWriter = null;
                        bufferedReader2 = bufferedReader;
                        try {
                            throw new BuildException(iOException);
                        } catch (Throwable th3) {
                            th2 = th3;
                            org.apache.tools.ant.util.j0.e(bufferedReader2);
                            org.apache.tools.ant.util.j0.f(bufferedWriter);
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        bufferedWriter = null;
                        bufferedReader2 = bufferedReader;
                        org.apache.tools.ant.util.j0.e(bufferedReader2);
                        org.apache.tools.ant.util.j0.f(bufferedWriter);
                        throw th2;
                    }
                }
            } else {
                bufferedReader = null;
            }
            String str = sb2.toString() + this.f133676k + " A" + i2(this.f133678m);
            x1("Writing -> " + str, 4);
            bufferedWriter = new BufferedWriter(new FileWriter(this.f133677l));
            try {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                org.apache.tools.ant.util.j0.e(bufferedReader);
                org.apache.tools.ant.util.j0.f(bufferedWriter);
            } catch (IOException e11) {
                iOException = e11;
                bufferedReader2 = bufferedReader;
                throw new BuildException(iOException);
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader2 = bufferedReader;
                org.apache.tools.ant.util.j0.e(bufferedReader2);
                org.apache.tools.ant.util.j0.f(bufferedWriter);
                throw th2;
            }
        } catch (IOException e12) {
            iOException = e12;
            bufferedWriter = null;
        } catch (Throwable th6) {
            th2 = th6;
            bufferedWriter = null;
        }
    }

    public void j2(String str) {
        this.f133676k = str;
    }

    public void k2(File file) {
        this.f133677l = file;
    }

    public void l2(String str) {
        this.f133678m = str;
    }
}
