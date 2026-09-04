package com.huawei.secure.android.common.ssl.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class c extends AsyncTask<Context, Integer, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f63049b = 432000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63050c = "lastCheckTime";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63048a = c.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f63051d = false;

    @SuppressLint({"NewApi"})
    public static void a() {
        if (b()) {
            e.c(f63048a, "checkUpgradeBks, execute check task");
            new c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, ContextUtil.getInstance());
        }
    }

    private static boolean b() {
        if (f63051d) {
            return false;
        }
        Context contextUtil = ContextUtil.getInstance();
        if (contextUtil == null) {
            e.e(f63048a, "checkUpgradeBks, context is null");
            return false;
        }
        f63051d = true;
        long jA = g.a(f63050c, 0L, contextUtil);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jA > 432000000) {
            g.b(f63050c, jCurrentTimeMillis, contextUtil);
            return true;
        }
        e.c(f63048a, "checkUpgradeBks, ignore");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Context... contextArr) {
        InputStream bksFromTss;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            bksFromTss = BksUtil.getBksFromTss(contextArr[0]);
        } catch (Exception e10) {
            e.b(f63048a, "doInBackground: exception : " + e10.getMessage());
            bksFromTss = null;
        }
        e.a(f63048a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (bksFromTss == null) {
            return Boolean.FALSE;
        }
        d.a(bksFromTss);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            e.c(f63048a, "onPostExecute: upate done");
        } else {
            e.b(f63048a, "onPostExecute: upate failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        e.c(f63048a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        e.a(f63048a, "onPreExecute");
    }
}
