package z7;

import java.io.File;

/* JADX INFO: compiled from: BackupUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static void a(File file, b8.b bVar) {
        String name = file.getName();
        String parent = file.getParent();
        int iB = bVar.b();
        if (iB <= 0) {
            if (iB == 0) {
                for (int i10 = 1; i10 < Integer.MAX_VALUE; i10++) {
                    File file2 = new File(parent, bVar.a(name, i10));
                    if (!file2.exists()) {
                        file.renameTo(file2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        File file3 = new File(parent, bVar.a(name, iB));
        if (file3.exists()) {
            file3.delete();
        }
        for (int i11 = iB - 1; i11 > 0; i11--) {
            File file4 = new File(parent, bVar.a(name, i11));
            if (file4.exists()) {
                file4.renameTo(new File(parent, bVar.a(name, i11 + 1)));
            }
        }
        file.renameTo(new File(parent, bVar.a(name, 1)));
    }

    public static void b(b8.b bVar) {
        int iB = bVar.b();
        if (iB < 0) {
            throw new IllegalArgumentException("Max backup index should not be less than 0");
        }
        if (iB != Integer.MAX_VALUE) {
            return;
        }
        throw new IllegalArgumentException("Max backup index too big: " + iB);
    }
}
