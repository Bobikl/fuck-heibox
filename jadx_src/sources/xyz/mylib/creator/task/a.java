package xyz.mylib.creator.task;

import android.graphics.Bitmap;
import java.io.File;
import ol.d;

/* JADX INFO: compiled from: AvcExecuteAsyncTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends b implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f141512e;

    private a(ol.b<Bitmap> bVar, int i10, pl.a<String> aVar, String str, int i11) {
        super(bVar, i10, aVar, str);
        this.f141512e = i11;
    }

    public static void f(ol.b<Bitmap> bVar, int i10, pl.a aVar, String str) {
        g(bVar, i10, aVar, str, 0);
    }

    public static void g(ol.b<Bitmap> bVar, int i10, pl.a aVar, String str, int i11) {
        try {
            new a(bVar, i10, aVar, str, i11).execute(new Void[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            aVar.a(e10.getMessage());
        }
    }

    @Override // ol.d
    public void a(int i10) {
        b(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        new xyz.mylib.creator.encoder.b(this.f141514b, this.f141515c, new File(this.f141516d), this.f141512e, this).m();
        return "";
    }
}
