package com.bun.miitmdid;

import android.os.AsyncTask;
import com.bun.lib.MsaIdInterface;

/* JADX INFO: loaded from: classes6.dex */
public class f0 extends AsyncTask<Void, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f42080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MsaIdInterface f42081b;

    public f0(MsaIdInterface msaIdInterface, h0 h0Var) {
        this.f42081b = msaIdInterface;
        this.f42080a = h0Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public native Boolean doInBackground(Void... voidArr);

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public native void onPostExecute(Boolean bool);
}
