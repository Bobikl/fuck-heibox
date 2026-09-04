package com.tencent.qmsp.oaid2;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes4.dex */
public class t extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f101656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f101657b;

    public t(q qVar, s sVar) {
        this.f101656a = qVar;
        this.f101657b = sVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Void... voidArr) {
        boolean zC;
        s sVar;
        if (this.f101656a == null) {
            return Boolean.FALSE;
        }
        int i10 = 0;
        while (true) {
            try {
                zC = this.f101656a.c();
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
        if (zC && (sVar = this.f101657b) != null) {
            sVar.a(true);
        }
        return Boolean.valueOf(zC);
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
    }
}
