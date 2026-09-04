package com.tencent.qmsp.sdk.g.d;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes4.dex */
public class d extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f101986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f101987b;

    public d(a aVar, c cVar) {
        this.f101986a = aVar;
        this.f101987b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        boolean zC;
        c cVar;
        if (this.f101986a == null) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            try {
                zC = this.f101986a.c();
                if (zC) {
                    break;
                }
                Thread.sleep(10L);
                i10++;
                if (i10 >= 30) {
                    break;
                }
            } catch (InterruptedException unused) {
            }
        }
        if (zC && (cVar = this.f101987b) != null) {
            cVar.a(true);
        }
        return Boolean.valueOf(zC);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
    }
}
