package cn.fly.verify;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public class fh {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f36484a;

        public a(Object obj) {
            this.f36484a = obj;
        }

        public float a() {
            return ((Float) gi.a(this.f36484a, ei.a("011%ej8fiRfdHcc+dgdj1dcDec"), Float.valueOf(0.0f), new Object[0])).floatValue();
        }

        public float a(Object obj) {
            if (obj != null) {
                try {
                    return ((Float) gi.a(this.f36484a, ei.a("010(dcdifiKidecfEfcdk"), new Object[]{obj}, (Class<?>[]) new Class[]{Class.forName(ei.a("025de?dcdjdkdidcdl5g2dk,cdiJdidkCe)dlfedk+cdi]didkSe"))})).floatValue();
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
            return 0.0f;
        }

        public double b() {
            return ((Double) gi.a(this.f36484a, ei.a("011TejPfi;fe2di5di=iMdgdc)f"), Double.valueOf(0.0d), new Object[0])).doubleValue();
        }

        public double c() {
            return ((Double) gi.a(this.f36484a, ei.a("0124ejAfi>fedk[e?ejdi6i<dgdc6f"), Double.valueOf(0.0d), new Object[0])).doubleValue();
        }

        public long d() {
            return ((Long) gi.a(this.f36484a, ei.a("007Xej>fi^fcdidfOf"), 0L, new Object[0])).longValue();
        }

        public String e() {
            return (String) gi.a(this.f36484a, ei.a("011+ej-fiAgldjdkdddidcOf4dj"), (Object) null, new Object[0]);
        }

        public double f() {
            return ((Double) gi.a(this.f36484a, ei.a("011TejXfiTfd_gi diSi;dgdc1f"), Double.valueOf(0.0d), new Object[0])).doubleValue();
        }

        public float g() {
            return ((Float) gi.a(this.f36484a, ei.a("010]ej9fi(fjBfdEdjdiSe<ej"), Float.valueOf(0.0f), new Object[0])).floatValue();
        }

        public float h() {
            return ((Float) gi.a(this.f36484a, ei.a("008+ej:fi4elTjffBdc"), Float.valueOf(0.0f), new Object[0])).floatValue();
        }

        public boolean i() {
            if (Build.VERSION.SDK_INT >= 26) {
                return ((Boolean) gi.a(this.f36484a, ei.a("019hd,figk0f>dj;i6di+cdg fd*cc]dgdjOdc)ec"), Boolean.FALSE, new Object[0])).booleanValue();
            }
            return false;
        }

        public float j() {
            if (Build.VERSION.SDK_INT >= 26) {
                return ((Float) gi.a(this.f36484a, ei.a("025-ej)fi_gk%f]djBi8di+cdg)fd[cc0dgdj0dc?echcUfifIdjfi"), Float.valueOf(0.0f), new Object[0])).floatValue();
            }
            return 0.0f;
        }
    }

    private static Parcelable.Creator<?> a() throws Throwable {
        return (Parcelable.Creator) gi.c(gi.a(ei.a("025deRdcdjdkdidcdl9g'dk1cdiMdidk$e[dlfedk@cdiGdidk^e")), ei.a("007@edgjgifdfcghgj"));
    }

    public static Object a(Context context, String str) throws Throwable {
        int i10;
        int i11;
        Object objA;
        Parcel parcel;
        Parcel parcel2;
        if (!dt.f() || !gr.a().a(str)) {
            return null;
        }
        int i12 = Build.VERSION.SDK_INT;
        ex exVarA = ex.a(context);
        if (i12 >= 31) {
            Object objA2 = exVarA.a(ei.a("036de(dcdjdkdidcdl*g0dk6cdi?didkDeGdlfeEd*fi2iZfedk*cdiYdidkCe6gj'fFdedg_f;fiIi") + "$" + ei.a("007[fjdgdi,g,dcVf>dj"));
            if (objA2 != null) {
                i10 = 0;
                i11 = 1;
                objA = exVarA.a(ei.a("036deVdcdjdkdidcdl?gDdk2cdi!didk%eCdlfeNdCfiBi[fedk<cdiUdidkAeHgjCf8dedgLf?fiXi") + "$" + ei.a("0074fjdgdi@gFdc9f:dj"), objA2, ei.a("005Tffdgdi,g[dc"), (Class[]) null, (Object[]) null, (Object) null);
            } else {
                i10 = 0;
                i11 = 1;
                objA = null;
            }
        } else {
            i10 = 0;
            i11 = 1;
            objA = exVarA.a(ei.a("032deRdcdjdkdidcdlIgIdk(cdi1didkFe?dlfedk)cdi.didk(e2gjAf<dedgSf5fi2i"), (Object) null, ei.a("028c6dj+fdif]gcdjdkdffl'fjYdj$fcdifWdcgldjdkdddidc(f]dj"), new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE}, new Object[]{str, 0, 0, Boolean.TRUE}, (Object) null);
        }
        Object obj = objA;
        int iIntValue = ((Integer) exVarA.a(ei.a("033deMdcdjdkdidcdl0g*dkRcdi?didk7e-dleefedk3cdiXdidk5eQhc<ded[ejLf;dj") + "$" + ei.a("004>el6i(dgff"), ei.a("027)fcgjfdegelfdedfceeghegdhej9fi=feCdWfi8iPfedkFcdi1didk=e"), null, -1)).intValue();
        String strA = ei.a("025de(dcdjdkdidcdldkfidlel2f7djdddi7cf%hc(ded.ej(fGdj");
        String strA2 = ei.a("010NejJfiEel-f<djdddiIcf");
        Class[] clsArr = new Class[i11];
        clsArr[i10] = String.class;
        Object[] objArr = new Object[i11];
        objArr[i10] = ei.a("008gAdk.cdiRdidk]e");
        IBinder iBinder = (IBinder) exVarA.a(strA, (Object) null, strA2, clsArr, objArr, (Object) null);
        if (obj == null || iBinder == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ei.a("033de%dcdjdkdidcdlQgNdk$cdi4didkGe*dleefedk3cdiFdidkUe!hc.dedAejOf<dj"));
            if (i12 >= 31) {
                parcelObtain.writeString(str);
                parcelObtain.writeTypedObject((Parcelable) obj, i10);
                parcel = parcelObtain2;
                parcel2 = parcelObtain;
            } else {
                parcelObtain.writeInt(i11);
                Class<?> cls = obj.getClass();
                String strA3 = ei.a("013_fgdjdiZifVfcdkgl(d,dj?cfg");
                Class[] clsArr2 = new Class[2];
                clsArr2[i10] = Parcel.class;
                clsArr2[i11] = Integer.TYPE;
                Object[] objArr2 = new Object[2];
                objArr2[i10] = parcelObtain;
                objArr2[i11] = Integer.valueOf(i10);
                parcel = parcelObtain2;
                parcel2 = parcelObtain;
                try {
                    exVarA.a(cls, obj, strA3, clsArr2, objArr2, (Object) null);
                } catch (Throwable th2) {
                    th = th2;
                    ex.a(context).b(context);
                    parcel.recycle();
                    parcel2.recycle();
                    throw th;
                }
            }
            parcel2.writeString(context.getPackageName());
            if (i12 >= 30) {
                parcel2.writeString(context.getAttributionTag());
            }
            iBinder.transact(iIntValue, parcel2, parcel, i10);
            parcel.readException();
            Object typedObject = parcel.readTypedObject(a());
            ex.a(context).b(context);
            parcel.recycle();
            parcel2.recycle();
            return typedObject;
        } catch (Throwable th3) {
            th = th3;
            parcel = parcelObtain2;
            parcel2 = parcelObtain;
        }
    }

    public static Object a(Context context, String str, long j10) throws Throwable {
        int i10;
        Object objA;
        Parcel parcel;
        Parcel parcel2;
        Object objA2;
        Object objA3;
        char c10;
        if (!dt.e() || !gr.a().a(str)) {
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        ex exVarA = ex.a(context);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Object[] objArr = new Object[1];
        if (i11 >= 31) {
            Object objA4 = exVarA.a(ei.a("032de@dcdjdkdidcdlCgMdkMcdi didk%e,dlfedkBcdiKdidkSe(gjNf@dedg%fRfi5i") + "$" + ei.a("007ZfjdgdiAgQdc8f]dj"), new Class[]{Long.TYPE}, new Object[]{0L});
            if (objA4 != null) {
                i10 = 0;
                objA = exVarA.a(ei.a("032deZdcdjdkdidcdlXgLdk%cdi4didk5eGdlfedk(cdi>didk-e9gjCfCdedg%f(fi*i") + "$" + ei.a("007OfjdgdiMg+dc]fYdj"), objA4, ei.a("005MffdgdiZgYdc"), (Class[]) null, (Object[]) null, (Object) null);
            } else {
                i10 = 0;
                objA = null;
            }
        } else {
            i10 = 0;
            objA = exVarA.a(ei.a("032deHdcdjdkdidcdl<g5dkLcdiWdidkDe@dlfedkBcdiZdidkSe-gj:f$dedgZf^fi[i"), (Object) null, ei.a("028c3dj.fdif0gcdjdkdffl2fjEdj@fcdifUdcgldjdkdddidcMf=dj"), new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE}, new Object[]{str, 0, 0, Boolean.TRUE}, (Object) null);
        }
        Object obj = objA;
        String strA = ei.a("025deSdcdjdkdidcdldkfidlel*f_djdddi8cf5hcOded%ejTfQdj");
        String strA2 = ei.a("010MejYfi@elLf9djdddiJcf");
        Class[] clsArr = new Class[1];
        clsArr[i10] = String.class;
        Object[] objArr2 = new Object[1];
        objArr2[i10] = ei.a("008g2dk@cdiEdidkQe");
        IBinder iBinder = (IBinder) exVarA.a(strA, (Object) null, strA2, clsArr, objArr2, (Object) null);
        if (obj == null || iBinder == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ei.a("033de9dcdjdkdidcdl'gQdk]cdiEdidk+eEdleefedk'cdiRdidkXe5hc7ded7ej1f)dj"));
            if (i11 >= 31) {
                parcelObtain.writeString(str);
                parcelObtain.writeTypedObject((Parcelable) obj, i10);
                Consumer consumer = new Consumer() { // from class: cn.fly.verify.fh.1
                    @Override // java.util.function.Consumer
                    public void accept(Object obj2) {
                        try {
                            objArr[0] = obj2;
                        } catch (Throwable th2) {
                            try {
                                es.a().a(th2);
                            } finally {
                                countDownLatch.countDown();
                            }
                        }
                    }
                };
                String str2 = ei.a("032de_dcdjdkdidcdl4gJdkTcdi6didk]e3dlfedkAcdi!didk)eVhc2dedYej1f7dj") + "$" + ei.a("027Wid4fi-eddgdjdjSfeiLfedkAcdiGdidkYe.fcdjNde9fiOj]dkdjQi");
                Class[] clsArr2 = new Class[3];
                clsArr2[i10] = Executor.class;
                clsArr2[1] = Consumer.class;
                clsArr2[2] = CancellationSignal.class;
                Object[] objArr3 = new Object[3];
                objArr3[i10] = Executors.newSingleThreadExecutor();
                objArr3[1] = consumer;
                objArr3[2] = null;
                Object objA5 = exVarA.a(str2, clsArr2, objArr3);
                String strA3 = ei.a("012iLdkgj[fcfBdiddTfXdjeedc");
                Class[] clsArr3 = new Class[1];
                clsArr3[i10] = Object.class;
                Object[] objArr4 = new Object[1];
                objArr4[i10] = consumer;
                try {
                    String str3 = (String) exVarA.a(AppOpsManager.class, (Object) null, strA3, clsArr3, objArr4, (Object) null);
                    if (TextUtils.isEmpty(str3)) {
                        parcel = parcelObtain2;
                    } else {
                        parcelObtain.writeStrongInterface((IInterface) objA5);
                        parcelObtain.writeString(context.getPackageName());
                        parcelObtain.writeString(context.getAttributionTag());
                        parcelObtain.writeString(str3);
                        parcel = parcelObtain2;
                        try {
                            iBinder.transact(((Integer) exVarA.a(ei.a("033de9dcdjdkdidcdlOg2dkGcdi5didkNe^dleefedk3cdiZdidk<eXhc^dedZejYfVdj") + "$" + ei.a("004Wel]iPdgff"), ei.a("030Tfcgjfdegelfdedfceeghegdhej(fi)eddgdjdjXfeiBfedkScdiJdidk,e"), null, -1)).intValue(), parcelObtain, parcel, 0);
                        } catch (Throwable th2) {
                            th = th2;
                            parcel2 = parcelObtain;
                            parcel.recycle();
                            parcel2.recycle();
                            ex.a(context).b(context);
                            throw th;
                        }
                    }
                    parcel2 = parcelObtain;
                    c10 = 0;
                    parcel.readException();
                    countDownLatch.await(j10, TimeUnit.MILLISECONDS);
                    Object obj2 = objArr[c10];
                    parcel.recycle();
                    parcel2.recycle();
                    ex.a(context).b(context);
                    return obj2;
                } catch (Throwable th3) {
                    th = th3;
                    parcel = parcelObtain2;
                }
            } else {
                parcel = parcelObtain2;
                try {
                    parcelObtain.writeInt(1);
                    try {
                        exVarA.a(obj.getClass(), obj, ei.a("013Vfgdjdi?if!fcdkgl1dHdj7cfg"), new Class[]{Parcel.class, Integer.TYPE}, new Object[]{parcelObtain, 0}, (Object) null);
                        HashMap map = new HashMap();
                        final int iIdentityHashCode = System.identityHashCode(map);
                        try {
                            map.put(ei.a("017;dkJe$fedk%cdiAdidk>e(ed*hdeFej=fQdc"), new gi.a<Object[], Object>() { // from class: cn.fly.verify.fh.2
                                @Override // cn.fly.verify.gi.a
                                public Object a(Object[] objArr5) {
                                    if (objArr5 != null) {
                                        try {
                                            if (objArr5.length > 0) {
                                                es.a().a("[212] oncge" + objArr5[0], new Object[0]);
                                                Object obj3 = objArr5[0];
                                                if (!(obj3 instanceof List) || ((List) obj3).size() <= 0) {
                                                    objArr[0] = objArr5[0];
                                                } else {
                                                    List list = (List) objArr5[0];
                                                    objArr[0] = list.get(list.size() - 1);
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                es.a().a(th4);
                                            } finally {
                                                countDownLatch.countDown();
                                            }
                                        }
                                    }
                                    return null;
                                }
                            });
                            map.put("equals", new gi.a<Object[], Object>() { // from class: cn.fly.verify.fh.3
                                @Override // cn.fly.verify.gi.a
                                public Object a(Object[] objArr5) {
                                    if (objArr5 != null) {
                                        Object obj3 = objArr5[0];
                                        if (obj3 != null) {
                                            return Boolean.valueOf(obj3.hashCode() == iIdentityHashCode);
                                        }
                                    }
                                    return Boolean.FALSE;
                                }
                            });
                            map.put(ei.a("008hdXfiRhOeddkdcFf"), new gi.a<Object[], Object>() { // from class: cn.fly.verify.fh.4
                                @Override // cn.fly.verify.gi.a
                                public Object a(Object[] objArr5) {
                                    return Integer.valueOf(iIdentityHashCode);
                                }
                            });
                            objA2 = gi.a(map, (Class<?>[]) new Class[]{Class.forName(ei.a("033de8dcdjdkdidcdlTgEdk+cdiGdidk+e3dlfedk>cdi^didk>e(fedifiYifef5dj"))});
                        } catch (Throwable th4) {
                            es.a().a(th4);
                            objA2 = null;
                        }
                        if (Build.VERSION.SDK_INT >= 30) {
                            objA3 = exVarA.a(ei.a("032deRdcdjdkdidcdl^g-dk[cdi!didkKe6dlfedkKcdi4didk[e3hc!dedHej1fRdj") + "$" + ei.a("025GfedkYcdiSdidkEeMfedifi3ifef4djfcdjLde_fi^jPdkdjOi"), new Class[]{Class.forName(ei.a("032de-dcdjdkdidcdl_gRdk0cdi<didk,e,dlfedk!cdi>didk2eHhcAded!ej>f>dj")), Class.forName(ei.a("033de<dcdjdkdidcdl.gKdkMcdi4didk(eOdlfedkKcdi?didkNe]fedifi3ifefBdj"))}, new Object[]{fz.d.a(ei.a("008gRdk!cdi?didk9e")), objA2});
                            exVarA.a(objA3.getClass(), objA3, ei.a("008EdjSf'ejdifi8ifZdj"), new Class[]{Executor.class}, new Object[]{Executors.newSingleThreadExecutor()}, (Object) null);
                        } else {
                            objA3 = exVarA.a(ei.a("032de,dcdjdkdidcdlMgFdk9cdi didk%e6dlfedk.cdi'didk2eQhcGded2ej8f7dj") + "$" + ei.a("017Ifedifi7ifefVdjfcdj(deLfi>j(dkdjLi"), new Class[]{Class.forName(ei.a("032de4dcdjdkdidcdl-gOdkVcdi-didkLe!dlfedkQcdiKdidkGe(hc^ded3ejEf=dj")), Class.forName(ei.a("033de=dcdjdkdidcdl!g'dkRcdiSdidkSeEdlfedkIcdi_didkMeCfedifi3ifef!dj")), Looper.class}, new Object[]{fz.d.a(ei.a("008gYdk>cdi!didk=e")), objA2, bq.a().c()});
                        }
                        parcel2 = parcelObtain;
                        try {
                            parcel2.writeStrongBinder((IBinder) objA3);
                            parcel2.writeInt(0);
                            parcel2.writeString(context.getPackageName());
                            c10 = 0;
                            iBinder.transact(((Integer) exVarA.a(ei.a("033deCdcdjdkdidcdl>gSdk2cdi0didkEeCdleefedkYcdi5didk,e'hcAded-ejSf3dj") + "$" + ei.a("004=el*iDdgff"), ei.a("034EfcgjfdegelfdedfceeghegdhdjIf'dedg0f]fi)iHfedk8cdiQdidk3e$ek^jKdc,difVfi"), null, -1)).intValue(), parcel2, parcel, 0);
                            parcel.readException();
                            countDownLatch.await(j10, TimeUnit.MILLISECONDS);
                            Object obj3 = objArr[c10];
                            parcel.recycle();
                            parcel2.recycle();
                            ex.a(context).b(context);
                            return obj3;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        parcel2 = parcelObtain;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    parcel2 = parcelObtain;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            parcel = parcelObtain2;
        }
        parcel2 = parcelObtain;
        parcel.recycle();
        parcel2.recycle();
        ex.a(context).b(context);
        throw th;
    }
}
