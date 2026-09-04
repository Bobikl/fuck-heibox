package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.meituan.robust.Constants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import z5.f;

/* JADX INFO: loaded from: classes6.dex */
public final class MultiDexExtractor implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f24655h = "MultiDex";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f24656i = "classes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f24657j = ".dex";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f24658k = ".classes";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f24659l = ".zip";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f24660m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f24661n = "multidex.version";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f24662o = "timestamp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f24663p = "crc";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f24664q = "dex.number";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f24665r = "dex.crc.";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f24666s = "dex.time.";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f24667t = 16384;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f24668u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f24669v = "MultiDex.lock";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f24670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f24671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f24672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RandomAccessFile f24673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FileChannel f24674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FileLock f24675g;

    public static class ExtractedDex extends File {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f24676b;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.f24676b = -1L;
        }
    }

    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(MultiDexExtractor.f24669v);
        }
    }

    MultiDexExtractor(File file, File file2) throws IOException {
        Log.i(f24655h, "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f24670b = file;
        this.f24672d = file2;
        this.f24671c = f(file);
        File file3 = new File(file2, f24669v);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f24673e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f24674f = channel;
            try {
                Log.i(f24655h, "Blocking on lock " + file3.getPath());
                this.f24675g = channel.lock();
                Log.i(f24655h, file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                b(this.f24674f);
                throw e;
            } catch (Error e11) {
                e = e11;
                b(this.f24674f);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                b(this.f24674f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e13) {
            b(this.f24673e);
            throw e13;
        }
    }

    private void a() {
        File[] fileArrListFiles = this.f24672d.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w(f24655h, "Failed to list secondary dex dir content (" + this.f24672d.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i(f24655h, "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i(f24655h, "Deleted old file " + file.getPath());
            } else {
                Log.w(f24655h, "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w(f24655h, "Failed to close resource", e10);
        }
    }

    private static void c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i(f24655h, "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry(Constants.CLASSES_DEX_NAME);
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i(f24655h, "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    b(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            b(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    private static SharedPreferences d(Context context) {
        return context.getSharedPreferences(f24661n, 4);
    }

    private static long e(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long f(File file) throws IOException {
        long jC = d.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean g(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesD = d(context);
        if (sharedPreferencesD.getLong(str + "timestamp", -1L) == e(file)) {
            if (sharedPreferencesD.getLong(str + f24663p, -1L) == j10) {
                return false;
            }
        }
        return true;
    }

    private List<ExtractedDex> k(Context context, String str) throws IOException {
        Log.i(f24655h, "loading existing secondary dex files");
        String str2 = this.f24670b.getName() + f24658k;
        SharedPreferences sharedPreferencesD = d(context);
        int i10 = sharedPreferencesD.getInt(str + f24664q, 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            ExtractedDex extractedDex = new ExtractedDex(this.f24672d, str2 + i11 + ".zip");
            if (!extractedDex.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
            }
            extractedDex.f24676b = f(extractedDex);
            long j10 = sharedPreferencesD.getLong(str + f24665r + i11, -1L);
            long j11 = sharedPreferencesD.getLong(str + f24666s + i11, -1L);
            long jLastModified = extractedDex.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesD;
                if (j10 == extractedDex.f24676b) {
                    arrayList.add(extractedDex);
                    i11++;
                    sharedPreferencesD = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + extractedDex.f24676b);
        }
        return arrayList;
    }

    private List<ExtractedDex> m() throws IOException {
        boolean z10;
        String str = this.f24670b.getName() + f24658k;
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f24670b);
        try {
            ZipEntry entry = zipFile.getEntry(f24656i + 2 + f24657j);
            int i10 = 2;
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f24672d, str + i10 + ".zip");
                arrayList.add(extractedDex);
                Log.i(f24655h, "Extraction is needed for file " + extractedDex);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    c(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.f24676b = f(extractedDex);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w(f24655h, "Failed to read crc from " + extractedDex.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : f.f141859j);
                    sb2.append(" '");
                    sb2.append(extractedDex.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(extractedDex.length());
                    sb2.append(" - crc: ");
                    sb2.append(extractedDex.f24676b);
                    Log.i(f24655h, sb2.toString());
                    if (!z10) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w(f24655h, "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry(f24656i + i10 + f24657j);
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w(f24655h, "Failed to close resource", e11);
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
                throw th2;
            } catch (IOException e12) {
                Log.w(f24655h, "Failed to close resource", e12);
                throw th2;
            }
        }
    }

    private static void n(Context context, String str, long j10, long j11, List<ExtractedDex> list) {
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(str + f24663p, j11);
        editorEdit.putInt(str + f24664q, list.size() + 1);
        int i10 = 2;
        for (ExtractedDex extractedDex : list) {
            editorEdit.putLong(str + f24665r + i10, extractedDex.f24676b);
            editorEdit.putLong(str + f24666s + i10, extractedDex.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24675g.release();
        this.f24674f.close();
        this.f24673e.close();
    }

    List<? extends File> i(Context context, String str, boolean z10) throws IOException {
        List<ExtractedDex> listM;
        List<ExtractedDex> listK;
        Log.i(f24655h, "MultiDexExtractor.load(" + this.f24670b.getPath() + ", " + z10 + ", " + str + ")");
        if (!this.f24675g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !g(context, this.f24670b, this.f24671c, str)) {
            try {
                listK = k(context, str);
            } catch (IOException e10) {
                Log.w(f24655h, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listM = m();
                n(context, str, e(this.f24670b), this.f24671c, listM);
                listK = listM;
            }
            Log.i(f24655h, "load found " + listK.size() + " secondary dex files");
            return listK;
        }
        if (z10) {
            Log.i(f24655h, "Forced extraction must be performed.");
        } else {
            Log.i(f24655h, "Detected that extraction must be performed.");
        }
        listM = m();
        n(context, str, e(this.f24670b), this.f24671c, listM);
        listK = listM;
        Log.i(f24655h, "load found " + listK.size() + " secondary dex files");
        return listK;
    }
}
