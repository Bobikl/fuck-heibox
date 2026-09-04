package org.apache.tools.ant.taskdefs;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: KeySubst.java */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class k3 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f134414k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f134415l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f134416m = androidx.webkit.b.f28327e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Hashtable<String, String> f134417n = new Hashtable<>();

    public static void i2(String[] strArr) {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put("VERSION", "1.0.3");
            hashtable.put("b", "ffff");
            System.out.println(j2("$f ${VERSION} f ${b} jj $", hashtable));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String j2(String str, Hashtable<String, String> hashtable) throws BuildException {
        StringBuffer stringBuffer = new StringBuffer();
        int length = 0;
        while (true) {
            int iIndexOf = str.indexOf("${", length);
            if (iIndexOf <= -1) {
                stringBuffer.append(str.substring(length));
                return stringBuffer.toString();
            }
            int i10 = iIndexOf + 3;
            String strSubstring = str.substring(iIndexOf + 2, str.indexOf(z5.g.f141884d, i10));
            stringBuffer.append((CharSequence) str, length, iIndexOf);
            if (hashtable.containsKey(strSubstring)) {
                stringBuffer.append(hashtable.get(strSubstring));
            } else {
                stringBuffer.append("${");
                stringBuffer.append(strSubstring);
                stringBuffer.append(z5.g.f141884d);
            }
            length = strSubstring.length() + i10;
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th2;
        BufferedReader bufferedReader;
        IOException e10;
        log("!! KeySubst is deprecated. Use Filter + Copy instead. !!");
        log("Performing Substitutions");
        if (this.f134414k == null || this.f134415l == null) {
            log("Source and destinations must not be null");
            return;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f134414k));
            try {
                this.f134415l.delete();
                bufferedWriter = new BufferedWriter(new FileWriter(this.f134415l));
                try {
                    try {
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            if (!line.isEmpty()) {
                                bufferedWriter.write(j2(line, this.f134417n));
                            }
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.flush();
                    } catch (IOException e11) {
                        e10 = e11;
                        x1(org.apache.tools.ant.util.j2.b(e10), 0);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    org.apache.tools.ant.util.j0.f(bufferedWriter);
                    org.apache.tools.ant.util.j0.e(bufferedReader);
                    throw th2;
                }
            } catch (IOException e12) {
                bufferedWriter = null;
                e10 = e12;
            } catch (Throwable th4) {
                bufferedWriter = null;
                th2 = th4;
                org.apache.tools.ant.util.j0.f(bufferedWriter);
                org.apache.tools.ant.util.j0.e(bufferedReader);
                throw th2;
            }
        } catch (IOException e13) {
            bufferedWriter = null;
            e10 = e13;
            bufferedReader = null;
        } catch (Throwable th5) {
            bufferedWriter = null;
            th2 = th5;
            bufferedReader = null;
        }
        org.apache.tools.ant.util.j0.f(bufferedWriter);
        org.apache.tools.ant.util.j0.e(bufferedReader);
    }

    public void k2(File file) {
        this.f134415l = file;
    }

    public void l2(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, this.f134416m, false);
        while (stringTokenizer.hasMoreTokens()) {
            StringTokenizer stringTokenizer2 = new StringTokenizer(stringTokenizer.nextToken().trim(), ContainerUtils.KEY_VALUE_DELIMITER, false);
            this.f134417n.put(stringTokenizer2.nextToken(), stringTokenizer2.nextToken());
        }
    }

    public void m2(String str) {
        this.f134416m = str;
    }

    public void n2(File file) {
        this.f134414k = file;
    }
}
