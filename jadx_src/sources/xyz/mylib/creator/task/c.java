package xyz.mylib.creator.task;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: GIFExecuteAsyncTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends AsyncTask<Void, Integer, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pl.a f141517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ol.b<Bitmap> f141518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f141519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f141520d;

    private c(ol.b<Bitmap> bVar, int i10, pl.a<String> aVar, String str) {
        this.f141517a = aVar;
        this.f141518b = bVar;
        this.f141519c = i10;
        this.f141520d = str;
    }

    private void a(int i10) {
        publishProgress(Integer.valueOf(i10));
    }

    public static void c(ol.b<Bitmap> bVar, int i10, pl.a aVar, String str) {
        try {
            new c(bVar, i10, aVar, str).execute(new Void[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
            aVar.a(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00c4: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:51:0x00c4 */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) throws Throwable {
        FileOutputStream fileOutputStream;
        OutputStream outputStream;
        int i10 = 0;
        a(0);
        OutputStream outputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(this.f141520d);
                try {
                    xyz.mylib.creator.encoder.a aVar = new xyz.mylib.creator.encoder.a();
                    aVar.o(fileOutputStream);
                    aVar.l(0);
                    aVar.i(this.f141519c);
                    a(2);
                    if (this.f141518b.size() > 0) {
                        if (isCancelled()) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            return null;
                        }
                        while (this.f141518b.hasNext()) {
                            Bitmap next = this.f141518b.next();
                            aVar.a(next);
                            ol.b<Bitmap> bVar = this.f141518b;
                            if (bVar instanceof ol.c) {
                                ((ol.c) bVar).a(next);
                            }
                            a(((i10 * 90) / this.f141518b.size()) + 2);
                            i10++;
                        }
                    }
                    a(92);
                    aVar.d();
                    a(95);
                    fileOutputStream.flush();
                    a(98);
                    try {
                        fileOutputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    a(100);
                    return this.f141520d;
                } catch (FileNotFoundException e12) {
                    e = e12;
                    e.printStackTrace();
                    this.f141517a.a(e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    return null;
                } catch (IOException e14) {
                    e = e14;
                    e.printStackTrace();
                    this.f141517a.a(e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = outputStream;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e17) {
            e = e17;
            fileOutputStream = null;
        } catch (IOException e18) {
            e = e18;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        if (str != null) {
            this.f141517a.onSuccess(str);
        } else {
            this.f141517a.a("结果为空!");
        }
        ol.b<Bitmap> bVar = this.f141518b;
        if (bVar instanceof ol.c) {
            ((ol.c) bVar).finish();
        }
        this.f141517a.onFinish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        Integer num;
        pl.a aVar;
        if (numArr.length <= 0 || (num = numArr[0]) == null || (aVar = this.f141517a) == null) {
            return;
        }
        aVar.b(num.toString());
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        this.f141517a.onStart();
        ol.b<Bitmap> bVar = this.f141518b;
        if (bVar instanceof ol.c) {
            ((ol.c) bVar).prepare();
        }
    }
}
