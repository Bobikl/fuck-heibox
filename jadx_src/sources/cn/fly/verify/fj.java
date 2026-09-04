package cn.fly.verify;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.core.app.o0;
import com.taobao.accs.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes6.dex */
public class fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile IBinder f36574a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f36575b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile int f36576c = Integer.MIN_VALUE;

    private static int a(Context context) throws Throwable {
        int i10 = f36575b;
        if (i10 != 0) {
            return i10;
        }
        int iIntValue = ((Integer) ex.a(context).a(bq.a("034ef edekelejedemZdMelCfjgfjVemDk9egemffhmWed>fi@e4fkZg0id0efeBfk]gAek") + "$" + bq.a("0049fmJjYehgg"), bq.a("026)gdhkgefhfmgefegdffhifheifk^gj.hm=edEfiIeHfk<gAffFf;fgel"), null, 0)).intValue();
        f36575b = iIntValue;
        return iIntValue;
    }

    private static int a(Context context, String str, String[] strArr, File file, File file2, File file3, HandlerThread handlerThread) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Object objA;
        FileOutputStream fileOutputStream3 = null;
        try {
            IBinder iBinder = (IBinder) ex.a(context).a(bq.a("025ef5edekelejedemelgjemfmMg7ekeeejFdgIidEefeIfk_g.ek"), (Object) null, bq.a("010Ofk0gj^fmQg[ekeeej$dg"), new Class[]{String.class}, new Object[]{str}, (Object) null);
            if (iBinder == null || (objA = ex.a(context).a(bq.a("024ef>edekelejedemelgjemfm9ighh0fe?ehhIgg,edFfi"))) == null) {
                el.a(null, null, null);
                return -1;
            }
            FileOutputStream fileOutputStream4 = new FileOutputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    fileOutputStream2 = new FileOutputStream(file3);
                    try {
                        ex.a(context).a(IBinder.class, iBinder, bq.a("012VgjNighh+feelegegSefUed"), new Class[]{FileDescriptor.class, FileDescriptor.class, FileDescriptor.class, String[].class, Class.forName(bq.a("024ef!edekelejedemelgjemfmMighhXfeUehh(gg,ed9fi")), ResultReceiver.class}, new Object[]{fileOutputStream4.getFD(), fileOutputStream.getFD(), fileOutputStream2.getFD(), strArr, objA, new ResultReceiver(new Handler(handlerThread.getLooper()))}, (Object) null);
                        el.a(fileOutputStream4, fileOutputStream, fileOutputStream2);
                        return 0;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream3 = fileOutputStream4;
                        el.a(fileOutputStream3, fileOutputStream, fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                fileOutputStream2 = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            fileOutputStream2 = null;
        }
        el.a(fileOutputStream3, fileOutputStream, fileOutputStream2);
        throw th;
    }

    public static Object a(Context context, String str, int i10) throws Throwable {
        return a(context, str, i10, c(), a(context));
    }

    private static Object a(Context context, String str, int i10, int i11, int i12) throws Throwable {
        if (f36574a == null) {
            f36574a = (IBinder) ex.a(context).a(bq.a("025ef7edekelejedemelgjemfmSg,ekeeej3dg6idJefeNfk;gOek"), (Object) null, bq.a("010Zfk<gjHfm2g ekeeejMdg"), new Class[]{String.class}, new Object[]{bq.a("007kedWfiZe<fkTg")}, (Object) null);
        }
        if (f36574a == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(bq.a("034ef%edekelejedem=d-el2fjgfj*em)kUegemffhm^edCfi]e+fkEg_idDefe2fkVgSek"));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeInt(i11);
            f36574a.transact(i12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readTypedObject(b());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            ex.a(context).b(context);
        }
    }

    public static Set<String> a(Context context, int i10) {
        Set<String> setA;
        HandlerThread handlerThread = new HandlerThread(ep.f36338a + "XPL-1");
        handlerThread.start();
        Set<String> set = null;
        try {
            try {
                if (i10 != 1) {
                    if (i10 == 4 && !bq.a("005Feg<gSejheeh").equalsIgnoreCase(fc.a(context).d().m()) && a()) {
                        setA = a(context, handlerThread);
                    }
                    handlerThread.quitSafely();
                    return set;
                }
                setA = a(context, true, handlerThread);
                set = setA;
                handlerThread.quitSafely();
            } catch (Throwable th2) {
                try {
                    es.a().a(th2);
                    handlerThread.quitSafely();
                } catch (Throwable th3) {
                    try {
                        handlerThread.quitSafely();
                    } catch (Throwable th4) {
                        es.a().a(th4);
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            es.a().a(th5);
        }
        return set;
    }

    public static Set<String> a(Context context, HandlerThread handlerThread) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader = null;
        if (dt.b()) {
            File file = new File(context.getFilesDir(), ".tmp11");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, bq.a("0024ej>f") + System.currentTimeMillis());
            File file3 = new File(file, "out" + System.currentTimeMillis());
            File file4 = new File(file, o0.N0 + System.currentTimeMillis());
            if (file3.exists()) {
                file3.delete();
            }
            try {
                a(context, bq.a("007kedXfi)eBfk8g"), new String[]{bq.a("004h.ejgjSj"), Constants.KEY_PACKAGES}, file2, file3, file4, handlerThread);
                if (!file3.exists() || file3.length() <= 0) {
                    el.a(null, null, null);
                    file2.delete();
                    file3.delete();
                    file4.delete();
                } else {
                    HashSet hashSet = new HashSet();
                    fileInputStream = new FileInputStream(file3);
                    try {
                        inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                String strA = bq.a("008kedQfiTe?fkXgl");
                                for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                                    String strTrim = line.trim();
                                    if (strTrim.length() > strA.length() && strTrim.substring(0, strA.length()).equalsIgnoreCase(strA)) {
                                        String strTrim2 = strTrim.substring(strA.length()).trim();
                                        if (!TextUtils.isEmpty(strTrim2)) {
                                            hashSet.add(strTrim2);
                                        }
                                    }
                                }
                                el.a(bufferedReader2, inputStreamReader, fileInputStream);
                                file2.delete();
                                file3.delete();
                                file4.delete();
                                return hashSet;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                inputStreamReader = null;
            }
            el.a(bufferedReader, inputStreamReader, fileInputStream);
            file2.delete();
            file3.delete();
            file4.delete();
            throw th;
        }
        return null;
    }

    public static Set<String> a(Context context, boolean z10, HandlerThread handlerThread) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader = null;
        if (dt.b()) {
            File file = new File(context.getFilesDir(), ".tmp11");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, bq.a("002_ejTf") + System.currentTimeMillis());
            File file3 = new File(file, "out" + System.currentTimeMillis());
            File file4 = new File(file, o0.N0 + System.currentTimeMillis());
            if (file3.exists()) {
                file3.delete();
            }
            try {
                if (z10) {
                    a(context, bq.a("007kedPfi!e,fkEg"), new String[]{bq.a("016Zefeh?g[ekfdil1edjDejeeejIj=ej gTgj"), "-a", bq.a("026efGedekelejedemejTfjgfj0em-edj]ejel$fNemidgefffh"), "--user", "0"}, file2, file3, file4, handlerThread);
                } else {
                    a(context, bq.a("007ked+fi%eNfkMg"), new String[]{bq.a("0168efeh8g0ekfdilPedj@ejeeejZj?ejGgFgj"), "-a", bq.a("026efRedekelejedemejIfjgfj em4edj,ejel_fSemidgefffh"), "-c", bq.a("032ef8edekelejedemej>fjgfjRem_dejgIfkelekfdemgfgeflfhfeglhjhk"), "--user", "0"}, file2, file3, file4, handlerThread);
                }
                if (!file3.exists() || file3.length() <= 0) {
                    el.a(null, null, null);
                    file2.delete();
                    file3.delete();
                    file4.delete();
                } else {
                    HashSet hashSet = new HashSet();
                    fileInputStream = new FileInputStream(file3);
                    try {
                        inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                String strA = bq.a("012ked]fiAe!fkUg@fhHeOegBg7jj");
                                for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                                    String strTrim = line.trim();
                                    if (strTrim.length() > strA.length() && strTrim.substring(0, strA.length()).equalsIgnoreCase(strA)) {
                                        String strTrim2 = strTrim.substring(strA.length()).trim();
                                        if (!TextUtils.isEmpty(strTrim2)) {
                                            hashSet.add(strTrim2);
                                        }
                                    }
                                }
                                el.a(bufferedReader2, inputStreamReader, fileInputStream);
                                file2.delete();
                                file3.delete();
                                file4.delete();
                                return hashSet;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamReader = null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
                inputStreamReader = null;
            }
            el.a(bufferedReader, inputStreamReader, fileInputStream);
            file2.delete();
            file3.delete();
            file4.delete();
            throw th;
        }
        return null;
    }

    public static boolean a() {
        try {
            if (!bq.a("006iBehOe-gh+g.ej").equalsIgnoreCase(fz.d.k())) {
                return true;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final int[] iArr = new int[1];
            fz.a(ax.g()).D().a(new fz.a() { // from class: cn.fly.verify.fj.1
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) {
                    String strC = bVar.C();
                    if (strC == null) {
                        strC = "";
                    }
                    iArr[0] = "3.0.0.200".compareTo(strC);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            return iArr[0] > 0;
        } catch (Throwable th2) {
            es.a().a(th2);
            return true;
        }
    }

    private static Parcelable.Creator<?> b() throws Throwable {
        return (Parcelable.Creator) gi.c(gi.a(bq.a("030efJedekelejedem1d@elJfjgfjFemXk3egemhm.edVfiTeDfk>g%ff$f.fgel")), bq.a("007Dfehkhjgegdhihk"));
    }

    private static int c() {
        if (f36576c != Integer.MIN_VALUE) {
            return f36576c;
        }
        try {
            int iIntValue = ((Integer) gi.a(gi.a(bq.a("021ef:edekelejedemelgjemflgjDg,ekgl efQedOhg")), bq.a("009$fk@gjPflgjIgEekffed"), new Object[]{Integer.valueOf(Process.myUid())}, (Class<?>[]) new Class[]{Integer.TYPE})).intValue();
            f36576c = iIntValue;
            return iIntValue;
        } catch (Throwable th2) {
            es.a().a(th2);
            return 0;
        }
    }
}
