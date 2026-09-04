package cn.fly.verify;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public class gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36807a;

    public gp(Context context) {
        this.f36807a = context;
    }

    private boolean b() {
        try {
            Object objA = gi.a(gi.a(bq.a("027ef7edekelejedemelgjemfmfdgj8jgEeghmekel9kg!ek>jOejNgFgj"), (String) null), bq.a("003=fkWgj"), "", "ro.build.tags");
            String strValueOf = objA != null ? String.valueOf(objA) : null;
            return (strValueOf != null && strValueOf.contains(bq.a("009jgVgj,j5ilfi1g^fdgj"))) || g();
        } catch (Throwable unused) {
            return false;
        }
    }

    private boolean c() {
        return "0".equals(fb.a(this.f36807a).a(bq.a("020@ekelemggelel'jCemfg,heNgjSiKemWhMelOdGfi@gQed")));
    }

    private boolean d() {
        String strA = fb.a(this.f36807a).a(bq.a("025Yekelemggelel(j*emeeYg^ekejfgej3g@edggelel2jIgjXjejg"));
        if (strA != null) {
            return TextUtils.equals(strA.toLowerCase(), "orange") || TextUtils.equals(strA.toLowerCase(), "red");
        }
        return false;
    }

    private boolean e() {
        String strA = fb.a(this.f36807a).a(bq.a("027<ekelemggelel+jAemeeggeg6gje+emedIgBeeejWdg3eigjVjejg"));
        return strA != null && TextUtils.equals(bq.a("008Keh_fhBel,d4fiXg4ed"), strA.toLowerCase());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    private boolean f() {
        Object objC;
        InputStream inputStream;
        ?? bufferedReader;
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder();
        try {
            objC = el.c(bq.a("010dej<jgWmkDekel(dm") + (iMyPid + bq.a("007m[egelehIfj]gj")));
            try {
                inputStream = (InputStream) gi.a(objC, bq.a("014 fk!gjDff,fk0eh;j>fm^j?ekIgeZeg"), (Object) null, new Object[0]);
                if (inputStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb2.append(line);
                                sb2.append("\n");
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    es.a().a(th);
                                    el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                                    if (objC != null) {
                                        gi.a(objC, bq.a("007<ed;gQgj<j!ekelfd"), (Object) null, new Object[0]);
                                    }
                                } catch (Throwable th3) {
                                    el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                                    if (objC != null) {
                                        gi.a(objC, bq.a("007<ed;gQgj<j!ekelfd"), (Object) null, new Object[0]);
                                    }
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = 0;
                    }
                } else {
                    bufferedReader = 0;
                }
                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                if (objC != null) {
                    gi.a(objC, bq.a("007<ed;gQgj<j!ekelfd"), (Object) null, new Object[0]);
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                bufferedReader = inputStream;
                es.a().a(th);
                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                if (objC != null) {
                    gi.a(objC, bq.a("007<ed;gQgj<j!ekelfd"), (Object) null, new Object[0]);
                }
                return sb2.toString().contains(bq.a("0066eg4eNfkejgjfi"));
            }
        } catch (Throwable th6) {
            th = th6;
            objC = null;
            inputStream = null;
        }
        return sb2.toString().contains(bq.a("0066eg4eNfkejgjfi"));
    }

    private boolean g() {
        try {
            if (new File(bq.a("025mRgjfdgj9jg@egMmekkm,fmehXkgDekehgj4gEekem^ek_fi")).exists()) {
                return true;
            }
            String[] strArr = {bq.a("012m'ed.ejemh[elLdehm"), bq.a("016m%ed,ejemhAel1dehmKggejFfm"), bq.a("017mCedXejemhFelRdehmHfjggej=fm"), bq.a("006m)gjggej-fm"), bq.a("008mEgjeh[mKggejLfm"), bq.a("012m*gjfdgj!jgVegAm<ggejEfm"), bq.a("017m_gjfdgj<jg^egOm(ggej0fmBem4g=fj:jm"), bq.a("021mEgjfdgjWjgLegBmVggejTfm@fgDe.ej9hNgj[e5fgRgm"), bq.a("016mTgjfdgjCjgSegJm'gjed;m?fjggejUfm"), bq.a("025m^gjfdgjVjg8eg?mEehgjek=m@gh,g7il2fggTedilekelel7jm"), bq.a("013m8gjfdgj*jgWegOmZfjggejKfm"), bq.a("013m,gjfdgjGjg+eg*m4gjggejDfm"), bq.a("012mFeeCgfPedelekRm9ggej'fm"), bq.a("006mdedig"), bq.a("005mRed[eje"), bq.a("004m'edOg2ee")};
            for (int i10 = 0; i10 < 16; i10++) {
                if (new File(strArr[i10], bq.a("0027gjeh")).exists()) {
                    return true;
                }
            }
            for (int i11 = 0; i11 < 16; i11++) {
                if (new File(strArr[i11], bq.a("007Kggehgjfdggelfj")).exists()) {
                    return true;
                }
            }
            for (int i12 = 0; i12 < 16; i12++) {
                if (new File(strArr[i12], bq.a("006=eg)e4fkejgjfi")).exists()) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            es.a().b(th2);
        }
        return false;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder("");
        try {
            if (d()) {
                sb2.append("1");
            } else {
                sb2.append("0");
            }
            if (e()) {
                sb2.append("1");
            } else {
                sb2.append("0");
            }
            if (c()) {
                sb2.append("1");
            } else {
                sb2.append("0");
            }
            if (b()) {
                sb2.append("1");
            } else {
                sb2.append("0");
            }
            if (f()) {
                sb2.append("1");
            } else {
                sb2.append("0");
            }
        } catch (Throwable unused) {
        }
        return sb2.toString();
    }
}
