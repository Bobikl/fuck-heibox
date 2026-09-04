package com.google.android.exoplayer2.offline;

/* JADX INFO: compiled from: DownloadCursor.java */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f {
    public static boolean a(g gVar) {
        return gVar.getCount() == 0 || gVar.getPosition() == gVar.getCount();
    }

    public static boolean b(g gVar) {
        return gVar.getCount() == 0 || gVar.getPosition() == -1;
    }

    public static boolean c(g gVar) {
        return gVar.getPosition() == 0 && gVar.getCount() != 0;
    }

    public static boolean d(g gVar) {
        int count = gVar.getCount();
        return gVar.getPosition() == count + (-1) && count != 0;
    }

    public static boolean e(g gVar) {
        return gVar.moveToPosition(0);
    }

    public static boolean f(g gVar) {
        return gVar.moveToPosition(gVar.getCount() - 1);
    }

    public static boolean g(g gVar) {
        return gVar.moveToPosition(gVar.getPosition() + 1);
    }

    public static boolean h(g gVar) {
        return gVar.moveToPosition(gVar.getPosition() - 1);
    }
}
