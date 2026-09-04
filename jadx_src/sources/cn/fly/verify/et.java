package cn.fly.verify;

import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public class et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f36356a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36357b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile HashSet<String> f36358c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f36359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f36361f;

    public interface a {
        void a(String str);

        boolean a(fz.b bVar);
    }

    public et(String str, String str2, int i10) {
        this.f36360e = i10;
        if (str2 == null) {
            str2 = "null";
        } else if (TextUtils.isDigitsOnly(str2)) {
            str2 = str + str2;
        }
        this.f36361f = str2;
        File fileB = gj.b(ax.f(), str);
        this.f36359d = fileB;
        if (fileB.isDirectory()) {
            return;
        }
        this.f36359d.mkdirs();
    }

    private File a(boolean z10) {
        File file;
        File[] fileArrListFiles = this.f36359d.listFiles();
        int i10 = 5;
        int i11 = 3;
        char c10 = 2;
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            file = new File(this.f36359d, a(this.f36361f, lg.a.f131412e, 1, lg.a.f131412e, 0));
        } else {
            int length = fileArrListFiles.length;
            int i12 = 0;
            int i13 = 1;
            while (i12 < length) {
                File file2 = fileArrListFiles[i12];
                String name = file2.getName();
                if (name.startsWith(this.f36361f)) {
                    String[] strArrSplit = name.split(lg.a.f131412e);
                    if (!z10 && strArrSplit.length == i11) {
                        try {
                            int i14 = Integer.parseInt(strArrSplit[c10]);
                            if (i14 < this.f36360e && !b(name)) {
                                File file3 = this.f36359d;
                                Object[] objArr = new Object[i10];
                                objArr[0] = this.f36361f;
                                objArr[1] = lg.a.f131412e;
                                objArr[2] = Integer.valueOf(i13);
                                objArr[3] = lg.a.f131412e;
                                objArr[4] = Integer.valueOf(i14 + 1);
                                File file4 = new File(file3, a(objArr));
                                return file2.renameTo(file4) ? file4 : file2;
                            }
                        } catch (Throwable th2) {
                            es.a().a(th2);
                        }
                    }
                    if (strArrSplit.length > 1) {
                        try {
                            if (Integer.parseInt(strArrSplit[1]) == i13) {
                                i13++;
                            }
                        } catch (Throwable th3) {
                            es.a().a(th3);
                        }
                    }
                }
                i12++;
                i10 = 5;
                i11 = 3;
                c10 = 2;
            }
            file = new File(this.f36359d, a(this.f36361f, lg.a.f131412e, Integer.valueOf(i13), lg.a.f131412e, 0));
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
        return file;
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            sb2.append(obj);
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        synchronized (this.f36358c) {
            if (this.f36358c.contains(str)) {
                return true;
            }
            this.f36358c.add(str);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f36358c) {
            this.f36358c.remove(str);
        }
    }

    public void a(long j10) {
        synchronized (f36357b) {
            File[] fileArrListFiles = this.f36359d.listFiles(new FilenameFilter() { // from class: cn.fly.verify.et.3
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(et.this.f36361f);
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                long length = 0;
                for (File file : fileArrListFiles) {
                    length += file.length();
                }
                if (length >= j10) {
                    for (File file2 : fileArrListFiles) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public void a(final a aVar) {
        if (aVar == null) {
            return;
        }
        synchronized (f36357b) {
            final File[] fileArrListFiles = this.f36359d.listFiles(new FilenameFilter() { // from class: cn.fly.verify.et.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return !TextUtils.isEmpty(str) && str.startsWith(et.this.f36361f);
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                fz.a(ax.g()).h().j().i().C().a(new fz.a() { // from class: cn.fly.verify.et.2
                    @Override // cn.fly.verify.fz.a
                    public void a(fz.b bVar) {
                        BufferedReader bufferedReader;
                        for (File file : fileArrListFiles) {
                            String name = file.getName();
                            if (!et.this.b(name)) {
                                FileReader fileReader = null;
                                try {
                                    FileReader fileReader2 = new FileReader(file);
                                    try {
                                        bufferedReader = new BufferedReader(fileReader2);
                                        while (true) {
                                            try {
                                                String line = bufferedReader.readLine();
                                                if (line == null) {
                                                    break;
                                                } else {
                                                    aVar.a(new String(Base64.decode(line, 2), "utf-8"));
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileReader = fileReader2;
                                                try {
                                                    es.a().a(th);
                                                    el.a(bufferedReader, fileReader);
                                                } catch (Throwable th3) {
                                                    el.a(bufferedReader, fileReader);
                                                    et.this.c(name);
                                                    throw th3;
                                                }
                                            }
                                        }
                                        if (aVar.a(bVar)) {
                                            es.a().a("[LGSM] D l", new Object[0]);
                                            file.delete();
                                        }
                                        el.a(bufferedReader, fileReader2);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bufferedReader = null;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedReader = null;
                                }
                                et.this.c(name);
                            }
                        }
                    }
                });
            }
        }
    }

    public void a(String str) throws Throwable {
        a(str, false);
    }

    public void a(String str, boolean z10) throws Throwable {
        FileWriter fileWriter;
        String name;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strEncodeToString = Base64.encodeToString(str.getBytes("utf-8"), 2);
        if (TextUtils.isEmpty(strEncodeToString)) {
            return;
        }
        synchronized (f36356a) {
            File fileA = a(z10);
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(fileA, true);
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.newLine();
                        bufferedWriter2.write(strEncodeToString);
                        el.a(bufferedWriter2, fileWriter);
                        name = fileA.getName();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter = bufferedWriter2;
                        try {
                            es.a().a(th);
                            el.a(bufferedWriter, fileWriter);
                            name = fileA.getName();
                        } catch (Throwable th3) {
                            el.a(bufferedWriter, fileWriter);
                            c(fileA.getName());
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                fileWriter = null;
            }
            c(name);
        }
    }
}
