package xyz.mylib.creator.task;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/* JADX INFO: compiled from: BaseExecuteAsyncTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b extends AsyncTask<Void, Integer, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final pl.a f141513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ol.b<Bitmap> f141514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f141515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f141516d;

    protected b(ol.b<Bitmap> bVar, int i10, pl.a<String> aVar, String str) {
        this.f141513a = aVar;
        this.f141514b = bVar;
        this.f141515c = i10;
        this.f141516d = str;
    }

    protected void b(int i10) {
        publishProgress(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        if (str != null) {
            this.f141513a.onSuccess(str);
        } else {
            this.f141513a.a("结果为空!");
        }
        this.f141513a.onFinish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        Integer num;
        pl.a aVar;
        if (numArr.length <= 0 || (num = numArr[0]) == null || (aVar = this.f141513a) == null) {
            return;
        }
        aVar.b(num.toString());
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        this.f141513a.onStart();
    }
}
