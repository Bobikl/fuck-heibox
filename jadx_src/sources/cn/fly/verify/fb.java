package cn.fly.verify;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellInfo;
import android.telephony.NeighboringCellInfo;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class fb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static fb f36443b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f36444a;

    private fb(Context context) {
        this.f36444a = context.getApplicationContext();
    }

    public static synchronized fb a(Context context) {
        if (f36443b == null && context != null) {
            f36443b = new fb(context);
        }
        return f36443b;
    }

    private ArrayList<HashMap<String, String>> a(Set<String> set) {
        if (dt.b() && set != null && !set.isEmpty()) {
            HashMap<String, Object> map = new HashMap<>();
            for (String str : set) {
                map.put(str, fc.a(this.f36444a).d().b(true, 0, str, 0));
            }
            if (!map.isEmpty()) {
                return a(map);
            }
        }
        return new ArrayList<>();
    }

    private HashMap<String, Object> a(File file) {
        return a(fc.a(this.f36444a).d().l(), gj.b(file));
    }

    private HashMap<String, Object> a(Object obj) {
        Throwable th2;
        String string;
        int iR;
        int iT;
        int iL;
        int i10;
        int iP;
        int iY;
        long jQ;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        StringBuilder sb2;
        int iJ;
        long jK;
        int i15;
        StringBuilder sb3;
        int i16 = Build.VERSION.SDK_INT;
        Object objG = gn.a.g(obj);
        HashMap<String, Object> map = new HashMap<>();
        String strW = null;
        int i17 = -1;
        long jX = -1;
        if (!gn.a.b(obj)) {
            if (gn.a.c(obj)) {
                int iM = gn.a.m(objG);
                int iN = gn.a.n(objG);
                int iO = gn.a.o(objG);
                iP = gn.a.p(objG);
                iY = -1;
                jQ = gn.a.q(objG);
                i14 = 2;
                i13 = iO;
                iL = -1;
                i11 = -1;
                i12 = iN;
                i10 = iM;
                string = null;
            } else if (gn.a.d(obj)) {
                strW = String.valueOf(gn.a.h(objG));
                int i18 = gn.a.i(objG);
                if (i18 < 10) {
                    sb2 = new StringBuilder();
                    sb2.append("0");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("");
                }
                sb2.append(i18);
                string = sb2.toString();
                iJ = gn.a.j(objG);
                jK = gn.a.k(objG);
                iL = gn.a.l(objG);
                i15 = 3;
            } else {
                if (gn.a.e(obj)) {
                    strW = String.valueOf(gn.a.h(objG));
                    int i19 = gn.a.i(objG);
                    if (i19 < 10) {
                        str = "0" + i19;
                    } else {
                        str = "" + i19;
                    }
                    iR = gn.a.r(objG);
                    long jS = gn.a.s(objG);
                    int iT2 = gn.a.t(objG);
                    iY = i16 >= 24 ? gn.a.u(objG) : -1;
                    string = str;
                    i10 = -1;
                    iP = -1;
                    jQ = jS;
                    i14 = 4;
                    i11 = iT2;
                    iL = -1;
                    i13 = -1;
                } else if (gn.a.f(obj)) {
                    try {
                        String strV = gn.a.v(objG);
                        try {
                            strW = gn.a.w(objG);
                            iR = gn.a.r(objG);
                            try {
                                jX = gn.a.x(objG);
                                iT = gn.a.t(objG);
                                try {
                                    iY = gn.a.y(objG);
                                    string = strW;
                                    iP = -1;
                                    jQ = jX;
                                    i14 = 5;
                                    strW = strV;
                                    i11 = iT;
                                    iL = -1;
                                    i10 = -1;
                                    i13 = -1;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    string = strW;
                                    strW = strV;
                                    es.a().a(th2);
                                    iL = -1;
                                    i10 = -1;
                                    iP = -1;
                                    iY = -1;
                                    jQ = jX;
                                    i17 = iR;
                                    i11 = iT;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                string = strW;
                                iT = -1;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            string = strW;
                            iR = -1;
                            iT = -1;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        string = null;
                        iR = -1;
                        iT = -1;
                    }
                } else {
                    string = null;
                    iL = -1;
                    i10 = -1;
                    i12 = -1;
                    i13 = -1;
                    iP = -1;
                    iY = -1;
                    jQ = -1;
                    i14 = -1;
                    i11 = -1;
                }
                i17 = iR;
                i12 = i13;
            }
            map.put(ei.a("003gdc"), Integer.valueOf(i17));
            map.put(ei.a("004cfgg"), Long.valueOf(jQ));
            map.put(ei.a("003jMfiMc"), Integer.valueOf(iL));
            map.put(ei.a("003_fididc"), Integer.valueOf(i10));
            map.put(ei.a("003e)didc"), Integer.valueOf(i12));
            map.put(ei.a("003gdi"), Integer.valueOf(i13));
            map.put(ei.a("003g=dkMe"), Integer.valueOf(iP));
            map.put("mcc", strW);
            map.put(DispatchConstants.MNC, string);
            map.put(ei.a("004iCecEjf"), Integer.valueOf(i14));
            map.put("pci", Integer.valueOf(i11));
            map.put("xarfcn", Integer.valueOf(iY));
            return map;
        }
        strW = String.valueOf(gn.a.h(objG));
        int i20 = gn.a.i(objG);
        if (i20 < 10) {
            sb3 = new StringBuilder();
            sb3.append("0");
        } else {
            sb3 = new StringBuilder();
            sb3.append("");
        }
        sb3.append(i20);
        string = sb3.toString();
        iJ = gn.a.j(objG);
        jK = gn.a.k(objG);
        iL = gn.a.l(objG);
        i15 = 1;
        i13 = -1;
        iP = -1;
        iY = -1;
        jQ = jK;
        i17 = iJ;
        i14 = i15;
        i10 = -1;
        i12 = -1;
        i11 = -1;
        map.put(ei.a("003gdc"), Integer.valueOf(i17));
        map.put(ei.a("004cfgg"), Long.valueOf(jQ));
        map.put(ei.a("003jMfiMc"), Integer.valueOf(iL));
        map.put(ei.a("003_fididc"), Integer.valueOf(i10));
        map.put(ei.a("003e)didc"), Integer.valueOf(i12));
        map.put(ei.a("003gdi"), Integer.valueOf(i13));
        map.put(ei.a("003g=dkMe"), Integer.valueOf(iP));
        map.put("mcc", strW);
        map.put(DispatchConstants.MNC, string);
        map.put(ei.a("004iCecEjf"), Integer.valueOf(i14));
        map.put("pci", Integer.valueOf(i11));
        map.put("xarfcn", Integer.valueOf(iY));
        return map;
    }

    private HashMap<String, Object> a(String str, byte[] bArr) {
        try {
            return ge.a(ga.a(str, bArr));
        } catch (Throwable th2) {
            es.a().a(th2);
            return new HashMap<>();
        }
    }

    private boolean a(ApplicationInfo applicationInfo) {
        int i10 = applicationInfo.flags;
        return ((i10 & 1) == 1) || ((i10 & 128) != 0);
    }

    private Set<String> aA() {
        HashSet hashSet = new HashSet();
        if (dt.b()) {
            for (int i10 = 10000; i10 <= 13000; i10++) {
                String[] strArr = (String[]) gi.a(this.f36444a.getPackageManager(), "getPackagesForUid", new Object[]{Integer.valueOf(i10)}, (Class<?>[]) new Class[]{Integer.TYPE}, (Object) null);
                if (strArr != null && !TextUtils.isEmpty(strArr[0]) && !strArr[0].startsWith(ei.a("035c9dkdfdlejdkdkej:gfNdl:de^dcdjdkdidcdl=iSdjdi0chEdjdkdf5fg3diffdj7d%djec"))) {
                    hashSet.add(strArr[0]);
                }
            }
        }
        return hashSet;
    }

    private boolean aB() {
        try {
            return ((Boolean) gi.a(gi.a(ei.a("016deAdcdjdkdidcdldkfidlfl*fQffdgej")), ei.a("019Xdififl.f=ffdgejej:f3djeddk_eefcifGdc"), new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private String at() {
        try {
            return ga.b(ga.a(((Object) null) + ":" + ((Object) null) + ":" + fc.a(this.f36444a).d().l()));
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    private String au() {
        HashMap map;
        HashMap<String, Object> mapAv = av();
        if (mapAv == null || (map = (HashMap) mapAv.get(ei.a("010Idc^f0dddi.cfLee*e_efdk"))) == null) {
            return null;
        }
        try {
            return ga.b(ga.a(((Object) null) + ":" + ((Object) null) + ":" + ((String) map.get(ei.a("005UdfdkdcDfg")))));
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    private HashMap<String, Object> av() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        HashMap<String, Object> mapA;
        File fileA = gj.a(this.f36444a, ei.a("014c@dkdfdf3l0dcfffi>l8dldcdgdidc"), true);
        if (fileA.exists() && fileA.length() > 0) {
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream);
                    try {
                        mapA = (HashMap) objectInputStream.readObject();
                        el.a(objectInputStream, fileInputStream);
                    } catch (Throwable unused) {
                        el.a(objectInputStream, fileInputStream);
                        mapA = null;
                    }
                } catch (Throwable unused2) {
                    objectInputStream = null;
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
                objectInputStream = null;
            }
            if (mapA == null || mapA.isEmpty()) {
                mapA = a(fileA);
            }
            if (!mapA.isEmpty()) {
                return (HashMap) mapA.get(ei.a("010Ndc3f:dddiPcfVee6e^efdk"));
            }
        }
        return null;
    }

    private String aw() {
        ObjectInputStream objectInputStream;
        FileInputStream fileInputStream;
        File fileA;
        File file = new File(t(), ei.a("0089elBhd9dj)f?elflic"));
        if (file.exists()) {
            File file2 = new File(file, ei.a("003(dldceh"));
            if (file2.exists() && (fileA = gj.a(this.f36444a, ei.a("003Vdldceh"))) != null && file2.renameTo(fileA)) {
                file2.delete();
            }
        }
        File fileA2 = gj.a(this.f36444a, ei.a("003Sdldceh"));
        String strValueOf = null;
        if (fileA2 != null && !fileA2.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileA2);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    if (object != null && (object instanceof char[])) {
                        strValueOf = String.valueOf((char[]) object);
                    }
                    el.a(objectInputStream, fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        es.a().a(th);
                        el.a(objectInputStream, fileInputStream);
                    } catch (Throwable th3) {
                        el.a(objectInputStream, fileInputStream);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            objectInputStream = null;
            fileInputStream = null;
        }
        return strValueOf;
    }

    private HashMap<String, String> ax() {
        try {
            return (HashMap) gj.a(gj.b(this.f36444a, ei.a("004Udl de,fi")).getAbsolutePath());
        } catch (Throwable th2) {
            es.a().b(th2);
            gj.b(this.f36444a, ei.a("004(dl-de;fi")).delete();
            return null;
        }
    }

    private Set<String> ay() {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th2;
        Object objC;
        HashSet hashSet = new HashSet();
        if (dt.b() && !ei.a("005$df*fKdigddg").equalsIgnoreCase(c()) && fj.a()) {
            try {
                try {
                    objC = el.c(ei.a("016j0dfifVg9difiYi2ifVjdcDeh4d3ejAfJfi"));
                    try {
                        inputStream = (InputStream) gi.a(objC, ei.a("0144ej8fiQee9ej<dgEi.elWiBdj(fdUdf"), new Object[0]);
                        try {
                            inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                            try {
                                bufferedReader = new BufferedReader(inputStreamReader);
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        String strTrim = line.trim();
                                        if (strTrim.length() > 8 && strTrim.substring(0, 8).equalsIgnoreCase(ei.a("008jdcRehEd$ej;fk"))) {
                                            String strTrim2 = strTrim.substring(8).trim();
                                            if (TextUtils.isEmpty(strTrim2)) {
                                                continue;
                                            } else {
                                                hashSet.add(strTrim2);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        try {
                                            es.a().b(th2);
                                            el.a(bufferedReader, inputStreamReader, inputStream);
                                            if (objC != null) {
                                                gi.a(objC, ei.a("007 dcJfKfiJiBdjdkec"), new Object[0]);
                                            }
                                            return hashSet;
                                        } catch (Throwable th4) {
                                            el.a(bufferedReader, inputStreamReader, inputStream);
                                            if (objC != null) {
                                                try {
                                                    gi.a(objC, ei.a("007 dcJfKfiJiBdjdkec"), new Object[0]);
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                                el.a(bufferedReader, inputStreamReader, inputStream);
                                if (objC != null) {
                                    gi.a(objC, ei.a("007 dcJfKfiJiBdjdkec"), new Object[0]);
                                }
                            } catch (Throwable th5) {
                                bufferedReader = null;
                                th2 = th5;
                            }
                        } catch (Throwable th6) {
                            bufferedReader = null;
                            th2 = th6;
                            inputStreamReader = null;
                        }
                    } catch (Throwable th7) {
                        inputStreamReader = null;
                        bufferedReader = null;
                        th2 = th7;
                        inputStream = null;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th8) {
                inputStream = null;
                inputStreamReader = null;
                bufferedReader = null;
                th2 = th8;
                objC = null;
            }
        }
        return hashSet;
    }

    private Set<String> az() {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th2;
        Object objC;
        HashSet hashSet = new HashSet();
        if (dt.b()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    objC = el.c(ei.a("032c<dfdcif:jdc,eh dGejHf+ifdedgUfRdjechk$dci5didddiGi=diRfEfiifhkSdWif") + ei.a("026de^dcdjdkdidcdldi6eifeiTdlJdci%didk!e6dlhcfdeeeg") + " " + ei.a("008ShkhkdgfiHf-djiffh"));
                    try {
                        inputStream = (InputStream) gi.a(objC, ei.a("014 ejOfiYee7ejUdgLi-elEi[djTfdFdf"), new Object[0]);
                        if (inputStream != null) {
                            try {
                                inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                                try {
                                    bufferedReader = new BufferedReader(inputStreamReader);
                                    try {
                                        String strA = ei.a("012jdcFehCdVej]fGeg,dRdfUfNii");
                                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                                            String strTrim = line.trim();
                                            if (strTrim.length() > strA.length() && strTrim.substring(0, strA.length()).equalsIgnoreCase(strA)) {
                                                String strTrim2 = strTrim.substring(strA.length()).trim();
                                                if (!TextUtils.isEmpty(strTrim2)) {
                                                    hashSet.add(strTrim2);
                                                }
                                            }
                                        }
                                        bufferedReader2 = bufferedReader;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        try {
                                            es.a().b(th2);
                                            el.a(bufferedReader, inputStreamReader, inputStream);
                                            if (objC != null) {
                                                gi.a(objC, ei.a("007WdcTfKfi_iHdjdkec"), new Object[0]);
                                            }
                                            return hashSet;
                                        } catch (Throwable th4) {
                                            el.a(bufferedReader, inputStreamReader, inputStream);
                                            if (objC != null) {
                                                try {
                                                    gi.a(objC, ei.a("007WdcTfKfi_iHdjdkec"), new Object[0]);
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    bufferedReader = null;
                                    th2 = th5;
                                }
                            } catch (Throwable th6) {
                                bufferedReader = null;
                                th2 = th6;
                                inputStreamReader = null;
                            }
                        } else {
                            inputStreamReader = null;
                        }
                        el.a(bufferedReader2, inputStreamReader, inputStream);
                        if (objC != null) {
                            gi.a(objC, ei.a("007WdcTfKfi_iHdjdkec"), new Object[0]);
                        }
                    } catch (Throwable th7) {
                        inputStreamReader = null;
                        bufferedReader = null;
                        th2 = th7;
                        inputStream = null;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th8) {
                inputStream = null;
                inputStreamReader = null;
                bufferedReader = null;
                th2 = th8;
                objC = null;
            }
        }
        return hashSet;
    }

    private int b(Context context) {
        String strY = Y();
        if (TextUtils.isEmpty(strY)) {
            return -1;
        }
        return strY.equals(fk.f(fc.a(context).d().a(o(), 0), o())) ? 1 : 0;
    }

    private ArrayList<HashMap<String, String>> b(int i10) {
        Context context;
        Set<String> setA;
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        int i11 = 1;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    setA = az();
                } else if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                        setA = i10 != 5 ? null : aA();
                    } else {
                        context = this.f36444a;
                    }
                } else {
                    setA = ay();
                }
                if (setA != null && !setA.isEmpty()) {
                    arrayList = a(setA);
                }
                es.a().a("DH PD: ap " + arrayList.size() + " tpe " + i10, new Object[0]);
                return arrayList;
            }
            context = this.f36444a;
            setA = fj.a(context, i11);
            if (setA != null) {
                arrayList = a(setA);
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        es.a().a("DH PD: ap " + arrayList.size() + " tpe " + i10, new Object[0]);
        return arrayList;
    }

    private void b(HashMap<String, String> map) {
        if (map != null) {
            gj.a(gj.b(this.f36444a, ei.a("004Zdl^deQfi")).getAbsolutePath(), (Object) map);
        }
    }

    private void f(String str) {
        FileOutputStream fileOutputStream;
        File fileA = gj.a(this.f36444a, ei.a("003Ndldceh"));
        if (fileA != null && fileA.exists()) {
            fileA.delete();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileA);
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream2.writeObject(str.toCharArray());
                    objectOutputStream2.flush();
                    el.a(objectOutputStream2, fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    try {
                        es.a().a(th);
                        el.a(objectOutputStream, fileOutputStream);
                    } catch (Throwable th3) {
                        el.a(objectOutputStream, fileOutputStream);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ab A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b4, blocks: (B:28:0x0085, B:39:0x00ab), top: B:48:0x0009 }] */
    private boolean g(String str) {
        Object objC;
        InputStream inputStream;
        Closeable closeable;
        boolean z10 = true;
        BufferedReader bufferedReader = null;
        try {
            try {
                objC = el.c(ei.a("002j<fi"));
                try {
                    inputStream = (InputStream) gi.a(objC, ei.a("014Qej3fi_ee<ejXdg$iEel-i_djZfdQdf"), new Object[0]);
                    try {
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            try {
                                Pattern patternCompile = Pattern.compile("^\\s*(\\S+)\\s+(\\d+)\\s+(\\d+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+(\\d+)\\s+(\\w)\\s+(.+)$");
                                z10 = true;
                                while (true) {
                                    try {
                                        String line = bufferedReader2.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        Matcher matcher = patternCompile.matcher(line);
                                        if (matcher.matches()) {
                                            String strGroup = matcher.group(2);
                                            String strGroup2 = matcher.group(3);
                                            String strGroup3 = matcher.group(6);
                                            String strC = fz.d.c();
                                            if ((TextUtils.equals(strC, strGroup3) && (TextUtils.equals(strGroup, str) || TextUtils.equals(strGroup2, str))) || (strGroup3 != null && strGroup3.contains(strC) && TextUtils.equals(str, strGroup))) {
                                                z10 = false;
                                            }
                                        }
                                    } catch (Throwable unused) {
                                        bufferedReader = bufferedReader2;
                                        closeable = inputStreamReader;
                                        el.a(bufferedReader, closeable, inputStream);
                                        if (objC != null) {
                                            gi.a(objC, ei.a("007SdcUfOfiDiBdjdkec"), new Object[0]);
                                        }
                                        return z10;
                                    }
                                }
                                el.a(bufferedReader2, inputStreamReader, inputStream);
                                if (objC != null) {
                                    gi.a(objC, ei.a("007SdcUfOfiDiBdjdkec"), new Object[0]);
                                }
                            } catch (Throwable unused2) {
                                z10 = true;
                            }
                        } catch (Throwable unused3) {
                            z10 = true;
                            closeable = inputStreamReader;
                        }
                    } catch (Throwable unused4) {
                        z10 = true;
                        closeable = null;
                    }
                } catch (Throwable unused5) {
                    inputStream = null;
                    closeable = inputStream;
                    el.a(bufferedReader, closeable, inputStream);
                    if (objC != null) {
                        gi.a(objC, ei.a("007SdcUfOfiDiBdjdkec"), new Object[0]);
                    }
                    return z10;
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            objC = null;
            inputStream = null;
        }
        return z10;
    }

    public static Context x() {
        return el.a();
    }

    public boolean A() {
        Object objA;
        if (dt.d() && az.a().e() && fz.d.b(ei.a("036deVdcdjdkdidcdlAjfBdjdfdififididkLeCdledfkfdegidgidhgfeegceedhelfcfdfcgi")) && (objA = fz.d.a(ei.a("004Efgdiefdi"))) != null) {
            return ((Boolean) gi.a(objA, ei.a("009$fi,idLdj0i[el[cde"), Boolean.FALSE, new Object[0])).booleanValue();
        }
        return false;
    }

    public HashMap<String, Object> B() {
        HashMap<String, Object> map = new HashMap<>();
        try {
            FileReader fileReader = new FileReader(ei.a("013lj.djdkTclcjEdgdiWe[efdk"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList arrayList = new ArrayList();
            map.put(ei.a("010jCdjdk*cf,fifidkdjfi"), arrayList);
            loop0: while (true) {
                HashMap map2 = null;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break loop0;
                    }
                    if (TextUtils.isEmpty(line)) {
                        break;
                    }
                    String strTrim = line.trim();
                    if (strTrim.startsWith(ei.a("009j*djdkKcfTfifidkdj"))) {
                        if (map2 != null) {
                            arrayList.add(map2);
                        }
                        map2 = new HashMap();
                    }
                    String[] strArrSplit = strTrim.split(":");
                    if (strArrSplit.length > 1) {
                        if (map2 == null) {
                            map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                        } else {
                            map2.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                        }
                    }
                }
                if (map2 != null) {
                    arrayList.add(map2);
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return map;
    }

    public ArrayList<ArrayList<String>> C() {
        ArrayList<ArrayList<String>> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT < 28) {
            try {
                FileReader fileReader = new FileReader(ei.a("017lj djdkAcliiEecEl*dcdjdidd^f djfi"));
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!TextUtils.isEmpty(line)) {
                        String[] strArrSplit = line.trim().split(" ");
                        if (strArrSplit.length > 1) {
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            for (String str : strArrSplit) {
                                if (!TextUtils.isEmpty(str)) {
                                    arrayList2.add(str.trim());
                                }
                            }
                            arrayList.add(arrayList2);
                        }
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th2) {
                es.a().a(th2.getMessage(), new Object[0]);
            }
        }
        return arrayList;
    }

    public String D() {
        String strA = fe.a(this.f36444a).a(ei.a("014%djdkdleh6fZdj5efg3dldeHfIdfdg"), "0");
        return strA == null ? "0" : strA;
    }

    public HashMap<String, HashMap<String, Long>> E() {
        HashMap<String, HashMap<String, Long>> map = new HashMap<>();
        String[] strArr = {ei.a("006=fidcWcdFdjdc"), ei.a("004IdcFdid")};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            HashMap<String, Long> map2 = new HashMap<>();
            map2.put("available", -1L);
            map2.put(ei.a("0042efdj6ff"), -1L);
            map2.put(ei.a("005iMdk2idg"), -1L);
            map.put(str, map2);
        }
        HashMap map3 = new HashMap();
        String strT = t();
        if (strT != null) {
            map3.put(ei.a("006LfidcWcdFdjdc"), new StatFs(strT));
        }
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory != null) {
            map3.put(ei.a("004Vdc'did"), new StatFs(dataDirectory.getPath()));
        }
        for (Map.Entry entry : map3.entrySet()) {
            StatFs statFs = (StatFs) entry.getValue();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            long freeBlocksLong = statFs.getFreeBlocksLong() * statFs.getBlockSizeLong();
            long blockCountLong = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            HashMap<String, Long> map4 = map.get(entry.getKey());
            map4.put("available", Long.valueOf(availableBlocksLong));
            map4.put(ei.a("004<efdjZff"), Long.valueOf(freeBlocksLong));
            map4.put(ei.a("005iJdkKidg"), Long.valueOf(blockCountLong));
        }
        return map;
    }

    public HashMap<String, Long> F() {
        HashMap<String, Long> map = new HashMap<>();
        map.put("available", -1L);
        map.put(ei.a("005iBdkCidg"), -1L);
        map.put(ei.a("005Ddififedkfg"), -1L);
        map.put(ei.a("009ih<dj9f'fi^h.dkXg*dc"), -1L);
        Object objA = fz.d.a(ei.a("008dciZdidddiIiDec"));
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        gi.a(objA, ei.a("013Cej-fiFhcQf5dfdkdjecee-eTefdk"), (Object) null, memoryInfo);
        map.put("available", Long.valueOf(memoryInfo.availMem));
        map.put(ei.a("005i6dk1idg"), Long.valueOf(memoryInfo.totalMem));
        map.put(ei.a("005Jdififedkfg"), Long.valueOf(memoryInfo.lowMemory ? 1L : 0L));
        map.put(ei.a("009ih2djXfSfiCh4dkAg?dc"), Long.valueOf(memoryInfo.threshold));
        return map;
    }

    public String G() {
        return gs.a().b();
    }

    public boolean H() {
        BufferedReader bufferedReader;
        Throwable th2;
        String[] strArr = {ei.a("020cHdkdfdl$i+dk4jChgdkLheKfgdgdldf.d4ejdifieh"), ei.a("024SdidkdlejdiPihHdgffdl,h7dgfiehecdcejdldf6dBejdifieh"), ei.a("032JdcSfKdldjdkffdddl8deGdcdjdkdidcdlei^j=dkfiEfRdcdldi;e7fi*idggf=dj"), ei.a("028*dkdjejdldf5f)dkfg*cdi8dl(fMdceiAj,dkfi2f2dcdldfGded5ej=fPdj"), ei.a("027OdfdkYf-dlfi'h9digddgehdgdldjSfRdcdidj+fciNfi0i'dkdjPd%ejDf"), ei.a("018:df;fXdlfgIfJdifi]hBdgdlehVf'dj2efgZfidg"), ei.a("027LdidkdlejdiVihMdgffdlddddffhefhhhfhdldf6dhOdkfi<h@dkhgdk"), ei.a("013Lfkdkdkehdlgedidggfdgdlgg*j"), "club.youppgd.adhook", ei.a("027>di)c]dgdlVe3dg?ggji+djdlCdjjg2difi$iZdc@fifciZdkdj"), ei.a("032=didkdlejdiMihTdgffdl2hTdgfiehecdcejdldf]f?dfdkdjecdcBfifci]dkdj"), ei.a("034cMdkdfdlejdiOih4dgffdl@cdjeiFdjdi3jEfidlehHfGdj<efg;efVgdQfi0hfKdj")};
        for (int i10 = 0; i10 < 12; i10++) {
            try {
                if (fc.a(this.f36444a).d().a(strArr[i10], 0) != null) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            throw new Exception("msk");
        } catch (Throwable th3) {
            for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                if (stackTraceElement.getClassName().contains(ei.a("035(dc$f!dldjdkffdddl3deHdcdjdkdidcdleiTjEdkfi>fVdcdlggRjAdkfiAfAdcfjdjdidcej8f"))) {
                    return true;
                }
            }
            try {
                try {
                    ClassLoader.getSystemClassLoader().loadClass(ei.a("0368dc5f'dldjdkffdddlAde;dcdjdkdidcdleiXjWdkfiVfXdcdlgg.j:dkfi:fKdcfk8fgjfUdjfi")).newInstance();
                    try {
                        ClassLoader.getSystemClassLoader().loadClass(ei.a("035Vdc4fIdldjdkffdddl deGdcdjdkdidcdlei j[dkfiLf'dcdlgg=jZdkfiCf*dcfjdjdidcejZf")).newInstance();
                    } catch (IllegalAccessException | InstantiationException unused2) {
                    }
                    return true;
                } catch (Throwable unused3) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(ei.a("006ljJdjdkScl") + Process.myPid() + ei.a("005l4dfWdj8fi")));
                        boolean zContains = false;
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null || zContains) {
                                    break;
                                }
                                zContains = line.toLowerCase().contains(ei.a("006Sei9jMdkfi[f?dc"));
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    es.a().a(th2);
                                    el.a(bufferedReader);
                                    return false;
                                } catch (Throwable th5) {
                                    el.a(bufferedReader);
                                    throw th5;
                                }
                            }
                        }
                        el.a(bufferedReader);
                        return zContains;
                    } catch (Throwable th6) {
                        bufferedReader = null;
                        th2 = th6;
                    }
                }
            } catch (IllegalAccessException | InstantiationException unused4) {
                return true;
            }
        }
    }

    public boolean I() {
        return (this.f36444a.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public boolean J() {
        try {
            return Settings.Secure.getInt(this.f36444a.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean K() {
        try {
            return Settings.Secure.getInt(this.f36444a.getContentResolver(), "development_settings_enabled", 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean L() {
        Intent intentA = el.a((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return intentA != null && intentA.getIntExtra("plugged", -1) == 2;
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        ApplicationInfo applicationInfoA = fc.a(this.f36444a).d().a(false, fz.d.c(), 1);
        return (applicationInfoA == null || (applicationInfoA.flags & 2) == 0) ? false : true;
    }

    public boolean O() {
        int i10;
        try {
            String property = System.getProperty(ei.a("014hiijQdlBj]djdkeiecfkdkfi+i"));
            String property2 = System.getProperty(ei.a("014hiijWdlOj;djdkeiecgldkdj]i"));
            if (property2 == null) {
                property2 = "-1";
            }
            try {
                i10 = Integer.parseInt(property2);
            } catch (Throwable unused) {
                i10 = -1;
            }
            return (TextUtils.isEmpty(property) || i10 == -1) ? false : true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public boolean P() {
        return (Build.VERSION.SDK_INT >= 29) && (fc.a(this.f36444a).d().ak().targetSdkVersion >= 29);
    }

    public String Q() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (!TextUtils.isEmpty(id2)) {
                return id2;
            }
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(this.f36444a.getContentResolver(), configuration);
            Locale locale = configuration.locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            return Calendar.getInstance(locale).getTimeZone().getID();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String R() {
        return fc.a(this.f36444a).d().a(ei.a("015,djdkdlffdgdi!g:dcdlefXgd8dddkdj"));
    }

    public String S() {
        return fc.a(this.f36444a).d().a(ei.a("020%ejfidfdldd1fZdjfididkGe:dlff;d fi%fRff*deWdc"));
    }

    public String T() {
        return fc.a(this.f36444a).d().a(ei.a("016Zdjdkdl@jKdjdkdcdg9ciLdlffdk'dRdjdc"));
    }

    public String U() {
        return fc.a(this.f36444a).d().a(ei.a("017SdjdkdlffdkMdWdjdcdlYjgdi!efdkdjdf"));
    }

    public int V() {
        if (dt.i()) {
            return gh.a(this.f36444a).b();
        }
        return -1;
    }

    public String W() {
        return Build.BRAND;
    }

    public boolean X() {
        return b(this.f36444a) != 0;
    }

    public String Y() {
        String processName = "";
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
            } else {
                Method declaredMethod = Class.forName(ei.a("026de>dcdjdkdidcdlJdjj2dlfdHciSdidddi@i%ecfcTh=djPfd4dc"), false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (objInvoke instanceof String) {
                    processName = (String) objInvoke;
                }
            }
        } catch (Throwable th2) {
            es.a().a("getProcessName: " + th2, new Object[0]);
        }
        return processName;
    }

    public long Z() {
        Object objB = fc.a(this.f36444a).d().b(false, 0, o(), 0);
        if (objB != null) {
            return fk.e(objB, fz.d.c());
        }
        return 0L;
    }

    public String a(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis() ^ SystemClock.elapsedRealtime();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(jCurrentTimeMillis);
        SecureRandom secureRandom = new SecureRandom();
        for (int i11 = 0; i11 < i10; i11++) {
            if (ei.a("004chdAdj").equalsIgnoreCase(ei.a(secureRandom.nextInt(2) % 2 == 0 ? "004chdQdj" : "003eTdgdf"))) {
                stringBuffer.insert(i11 + 1, (char) (secureRandom.nextInt(26) + 97));
            } else {
                stringBuffer.insert(stringBuffer.length(), secureRandom.nextInt(10));
            }
        }
        return stringBuffer.toString().substring(0, 40);
    }

    public String a(String str) {
        return fe.a(this.f36444a).a(str);
    }

    public String a(boolean z10) {
        String strAu = au();
        if (!z10 && (TextUtils.isEmpty(strAu) || strAu.length() < 40)) {
            strAu = at();
        }
        if (!TextUtils.isEmpty(strAu) && strAu.length() >= 40) {
            return strAu.trim();
        }
        String strAw = aw();
        if (!TextUtils.isEmpty(strAw) && strAw.length() >= 40) {
            return strAw.trim();
        }
        if (TextUtils.isEmpty(strAw) || strAw.length() < 40) {
            strAw = a(40);
        }
        if (strAw == null) {
            return strAw;
        }
        String strTrim = strAw.trim();
        f(strTrim);
        return strTrim;
    }

    public ArrayList<HashMap<String, String>> a(ArrayList<HashMap<String, String>> arrayList, int i10) {
        try {
            es.a().a("DH PD: fabt " + i10, new Object[0]);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<HashMap<String, String>> arrayList2 = new ArrayList<>();
            for (HashMap<String, String> map : arrayList) {
                boolean zEquals = TextUtils.equals("1", map.get(ei.a("005;dififiecfi")));
                if (i10 != 1 || !zEquals) {
                    if (i10 != 2 || zEquals) {
                        HashMap<String, String> map2 = new HashMap<>(map);
                        map2.remove(ei.a("005,dififiecfi"));
                        arrayList2.add(map2);
                    }
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    public ArrayList<HashMap<String, String>> a(HashMap<String, Object> map) {
        String string;
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        if (dt.b()) {
            try {
                PackageManager packageManager = this.f36444a.getPackageManager();
                boolean z10 = false;
                HashMap<String, String> mapAx = ax();
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            HashMap<String, String> map2 = new HashMap<>();
                            ApplicationInfo applicationInfoA = fk.a(value, key);
                            if (applicationInfoA != null) {
                                String str = "1";
                                if (a(applicationInfoA)) {
                                    map2.put(ei.a("005[dififiecfi"), "1");
                                } else {
                                    map2.put(ei.a("0050dififiecfi"), "0");
                                }
                                map2.put(ei.a("003j@ehej"), key);
                                CharSequence text = null;
                                if (mapAx != null) {
                                    string = mapAx.get(ga.b(key));
                                } else {
                                    mapAx = new HashMap<>();
                                    string = null;
                                }
                                if (TextUtils.isEmpty(string)) {
                                    try {
                                        try {
                                            text = fk.g(applicationInfoA, key);
                                        } catch (Throwable unused) {
                                        }
                                    } catch (Throwable unused2) {
                                        int iC = fk.c(applicationInfoA, key);
                                        if (iC > 0) {
                                            text = packageManager.getText(key, iC, applicationInfoA);
                                        }
                                    }
                                    string = text == null ? key : text.toString();
                                    mapAx.put(ga.b(key), string);
                                    z10 = true;
                                }
                                map2.put(ei.a("004ed>df%f"), string);
                                map2.put(ei.a("007Udd1f'djfididkFe"), fk.c(value, key));
                                String strA = ei.a("006fed6ffOgf");
                                if (!fk.e(applicationInfoA, key)) {
                                    str = "0";
                                }
                                map2.put(strA, str);
                                map2.put(ei.a("016GefdidjfiYiZeeOeFfi7idgg7fcdidf1f"), String.valueOf(fk.d(value, key)));
                                map2.put(ei.a("014gd=fiRi5ek^j9dcSdifZfcdidf@f"), String.valueOf(fk.e(value, key)));
                                arrayList.add(map2);
                            }
                        }
                    }
                    if (z10) {
                        b(mapAx);
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return arrayList;
    }

    public List a(int i10, int i11, boolean z10, boolean z11) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return gr.a().a(this.f36444a, i10, i11, z10, z11);
        }
        es.a().a("glctn can not be called from Main Thread", new Object[0]);
        return null;
    }

    public void a(final BlockingQueue<Boolean> blockingQueue) {
        if (dt.d() && az.a().e()) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: cn.fly.verify.fb.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        el.a(this);
                        if (ei.a("029de.dcdjdkdidcdl]efi=dlfgdiefdidleledfdegdhgjgielekfefcel").equals(intent.getAction())) {
                            blockingQueue.put(Boolean.TRUE);
                        }
                    } catch (Throwable th2) {
                        es.a().a(th2);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ei.a("029deJdcdjdkdidcdl+efiWdlfgdiefdidleledfdegdhgjgielekfefcel"));
            el.a(broadcastReceiver, intentFilter);
        }
    }

    public synchronized boolean a() {
        String strD;
        strD = el.d();
        return strD != null && strD.length() == 5 && (strD.charAt(3) == '1' || strD.charAt(4) == '1');
    }

    public String aa() {
        return Build.DEVICE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public String ab() {
        Object objC;
        InputStream inputStream;
        ?? bufferedReader;
        String line;
        ?? r10;
        try {
            objC = el.c(ei.a("021cdi[ifEljBdjdk$clIfi2fg3ef.lcZejdjdkdgUj"));
            try {
                inputStream = (InputStream) gi.a(objC, ei.a("0144ej4fiLeeMej[dg'i elGi$dj^fd]df"), (Object) null, new Object[0]);
                if (inputStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        try {
                            line = bufferedReader.readLine();
                            r10 = bufferedReader;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                es.a().a(th);
                                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                                if (objC != null) {
                                    return null;
                                }
                                gi.a(objC, ei.a("007FdcYf^fiKi(djdkec"), (Object) null, new Object[0]);
                                return null;
                            } catch (Throwable th3) {
                                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                                if (objC != null) {
                                    gi.a(objC, ei.a("007FdcYf^fiKi(djdkec"), (Object) null, new Object[0]);
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = 0;
                    }
                } else {
                    r10 = 0;
                    line = null;
                }
                el.a((Closeable[]) new Closeable[]{r10, inputStream});
                if (objC != null) {
                    gi.a(objC, ei.a("007FdcYf^fiKi(djdkec"), (Object) null, new Object[0]);
                }
                return line;
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                bufferedReader = inputStream;
                es.a().a(th);
                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                if (objC != null) {
                    return null;
                }
                gi.a(objC, ei.a("007FdcYf^fiKi(djdkec"), (Object) null, new Object[0]);
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
            objC = null;
            inputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.BufferedReader] */
    public String ac() {
        Object objC;
        InputStream inputStream;
        ?? bufferedReader;
        try {
            objC = el.c(ei.a("017cdi6ifQlj,djdk)clcj]dgdiKeIefdk"));
            try {
                inputStream = (InputStream) gi.a(objC, ei.a("014UejLfi$ee9ej?dgBi1elIi^djEfdEdf"), (Object) null, new Object[0]);
                if (inputStream == null) {
                    el.a(null, inputStream);
                    if (objC == null) {
                        return "";
                    }
                    gi.a(objC, ei.a("007[dc(fSfiYiNdjdkec"), (Object) null, new Object[0]);
                    return "";
                }
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            stringBuffer.append(line);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                es.a().a(th);
                                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                                if (objC != null) {
                                    return "";
                                }
                                gi.a(objC, ei.a("007[dc(fSfiYiNdjdkec"), (Object) null, new Object[0]);
                                return "";
                            } catch (Throwable th3) {
                                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                                if (objC != null) {
                                    gi.a(objC, ei.a("007[dc(fSfiYiNdjdkec"), (Object) null, new Object[0]);
                                }
                                throw th3;
                            }
                        }
                    }
                    bufferedReader.close();
                    String lowerCase = stringBuffer.toString().toLowerCase();
                    el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                    if (objC != null) {
                        gi.a(objC, ei.a("007[dc(fSfiYiNdjdkec"), (Object) null, new Object[0]);
                    }
                    return lowerCase;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = 0;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                bufferedReader = inputStream;
                es.a().a(th);
                el.a((Closeable[]) new Closeable[]{bufferedReader, inputStream});
                if (objC != null) {
                    return "";
                }
                gi.a(objC, ei.a("007[dc(fSfiYiNdjdkec"), (Object) null, new Object[0]);
                return "";
            }
        } catch (Throwable th6) {
            th = th6;
            objC = null;
            inputStream = null;
        }
    }

    public String ad() {
        return cc.b(this.f36444a);
    }

    public HashMap<String, Object> ae() {
        return cc.a(this.f36444a);
    }

    public long af() {
        return Build.TIME;
    }

    public double ag() {
        return gj.e(this.f36444a);
    }

    public int ah() {
        return gj.f(this.f36444a);
    }

    public boolean ai() {
        return ei.a("0073fkMd%djdfdk4e.ec").equalsIgnoreCase((String) gi.a(gi.a(ei.a("025cFdkdfdlAhEdgHd4fgWf)didlfiecfi4if:dfdlfjdgdiRgHdcgiei"), (String) null), ei.a("010;ej_fi[ghfifjdjDdeVdc"), (Object) null, new Object[0]));
    }

    public String aj() {
        return fc.a(this.f36444a).d().a(ei.a("028hMfgdhfiCc dlffdgdiZgNdcdl:jgdi.efdkdjdfdldd f?djfididkZe"));
    }

    public String ak() {
        String strGroup = null;
        try {
            String strAq = fc.a(this.f36444a).d().aq();
            String strA = fc.a(this.f36444a).d().a("ro.build.ver.physical");
            if (!TextUtils.isEmpty(strA) && strA.contains(strAq)) {
                Matcher matcher = Pattern.compile(strAq + "(\\.\\d+)?").matcher(strA);
                while (matcher.find()) {
                    strGroup = matcher.group();
                }
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return strGroup;
    }

    public int al() {
        try {
            return Settings.Secure.getInt(this.f36444a.getContentResolver(), ei.a("015j>dgdj=fJdhdfdkdcUf_dhfi=idif"));
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    public int am() {
        try {
            return Settings.Secure.getInt(this.f36444a.getContentResolver(), ei.a("024j%dgdjDf dhPfehdecfQdcdhdfdkdcFf-dhfiXidif"));
        } catch (Settings.SettingNotFoundException unused) {
            return -1;
        }
    }

    public Object an() {
        Object objP;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int i10;
        int i11;
        Object objA;
        HashMap map = null;
        if (dt.h()) {
            if (az.a().f()) {
                objP = (!fz.d.b(ei.a("041deJdcdjdkdidcdlPjf%djdfdififididk6e?dlfdededgieleldhedghfdgjelgidhfeghedfdfceegheg")) || (objA = fz.d.a(ei.a("005jhNdk9ef"))) == null) ? null : gi.a(objA, ei.a("015Tej6fi edUfggGfedkIcdiHdidk_e"), (Object) null, new Object[0]);
            } else {
                objP = az.a().p();
            }
            if (objP != null) {
                map = new HashMap();
                int i12 = -1;
                if (ei.a("016TeddcdfYd=edTfgg8fedkPcdiFdidk$e").equals(objP.getClass().getSimpleName())) {
                    map.put(ei.a("0169eddcdf>d;edUfggJfedk!cdiJdidk(e"), 1);
                    int iIntValue6 = ((Integer) gj.a(gi.a(objP, ei.a("0228ej9fi%fj=d:fi'fJelAidi7didk^e(feMdi2di<i9dgdc>f"), -1, new Object[0]), -1)).intValue();
                    int iIntValue7 = ((Integer) gj.a(gi.a(objP, ei.a("023@ejGfiUfjNdTfiSfNel,idiPdidk-e^fedkOeXejdi*iFdgdcTf"), -1, new Object[0]), -1)).intValue();
                    iIntValue4 = ((Integer) gj.a(gi.a(objP, ei.a("016Sej?fiTfj2dSfi]f?elKidiRdidkYeLeedc"), -1, new Object[0]), -1)).intValue();
                    iIntValue5 = ((Integer) gj.a(gi.a(objP, ei.a("011+ej2fi+elecfi=if6dfeedc"), -1, new Object[0]), -1)).intValue();
                    iIntValue3 = ((Integer) gj.a(gi.a(objP, ei.a("012@ej7fi(eg,fiQfgdkdjeheedc"), -1, new Object[0]), -1)).intValue();
                    iIntValue2 = -1;
                    i10 = iIntValue7;
                    i11 = iIntValue6;
                    iIntValue = -1;
                } else {
                    map.put(ei.a("016GeddcdfQd+ed1fgg:fedkGcdi,didk;e"), -1);
                    iIntValue = ((Integer) gj.a(gi.a(objP, ei.a("006Yej1fiOglfiDc"), -1, new Object[0]), -1)).intValue();
                    int iIntValue8 = ((Integer) gj.a(gi.a(objP, ei.a("006UejSfi3fe7dc"), -1, new Object[0]), -1)).intValue();
                    iIntValue2 = ((Integer) gj.a(gi.a(objP, ei.a("0061ej1fiHeddidc"), -1, new Object[0]), -1)).intValue();
                    iIntValue3 = -1;
                    iIntValue4 = -1;
                    iIntValue5 = -1;
                    i10 = -1;
                    i12 = iIntValue8;
                    i11 = -1;
                }
                map.put(ei.a("003gdc"), Integer.valueOf(i12));
                map.put(ei.a("004cfgg"), Integer.valueOf(iIntValue2));
                map.put(ei.a("003j1fiEc"), Integer.valueOf(iIntValue));
                map.put(ei.a("003Nffdidc"), Integer.valueOf(iIntValue4));
                map.put(ei.a("0037fididc"), Integer.valueOf(iIntValue5));
                map.put(ei.a("003ePdidc"), Integer.valueOf(iIntValue3));
                map.put(ei.a("003gdi"), Integer.valueOf(i11));
                map.put(ei.a("003g dkOe"), Integer.valueOf(i10));
            }
        }
        return map;
    }

    public String ao() {
        LocaleList localeList;
        Locale locale;
        if (Build.VERSION.SDK_INT < 33 || (localeList = (LocaleList) gi.a(fz.d.a("locale"), "getApplicationLocales", (Object) null, new Object[0])) == null || localeList.isEmpty() || (locale = localeList.get(0)) == null) {
            return null;
        }
        return locale.getLanguage();
    }

    public int ap() {
        if (Build.VERSION.SDK_INT < 34) {
            return 0;
        }
        try {
            return ((Integer) gi.a(this.f36444a.getSystemService(Class.forName("android.app.GrammaticalInflectionManager")), "getApplicationGrammaticalGender", new Object[0])).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public boolean aq() {
        String strSubstring;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(ei.a("006lj*djdk1cl") + Process.myPid() + ei.a("007l7fi*idi7dgfi"), "r");
            strSubstring = "0";
            while (true) {
                try {
                    String line = randomAccessFile2.readLine();
                    if (line == null) {
                        break;
                    }
                    String strReplace = line.trim().replace("\t", "").trim().replace(" ", "");
                    if (strReplace.contains(ei.a("010Efcdj*dcf?djgldidcMk"))) {
                        strSubstring = strReplace.substring(10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    try {
                        es.a().a(th);
                        el.a(randomAccessFile);
                    } catch (Throwable th3) {
                        el.a(randomAccessFile);
                        throw th3;
                    }
                }
            }
            el.a(randomAccessFile2);
        } catch (Throwable th4) {
            th = th4;
            strSubstring = "0";
        }
        if (TextUtils.isEmpty(strSubstring) || TextUtils.equals("0", strSubstring)) {
            return false;
        }
        return g(strSubstring);
    }

    public ArrayList<HashMap<String, Object>> ar() {
        List<CellInfo> listQ;
        Object objA;
        int i10 = Build.VERSION.SDK_INT;
        ArrayList<HashMap<String, Object>> arrayList = null;
        if (dt.h()) {
            if (az.a().f()) {
                es.a().a("gtci: direct", new Object[0]);
                listQ = (((i10 >= 29 || !fz.d.b(ei.a("041deFdcdjdkdidcdlWjfIdjdfdififididkPeJdlfdededgieleldhedghfdgjelgidhfeghedfdfceegheg"))) && (i10 < 29 || !fz.d.b(ei.a("039dePdcdjdkdidcdl%jf_djdfdififididkWeSdlfdededgieleldhgceeeggidhfeghedfdfceegheg")))) || (objA = fz.d.a(ei.a("005jhHdkNef"))) == null) ? null : (List) gi.a(objA, "getAllCellInfo", (Object) null, new Object[0]);
            } else {
                es.a().a("gtci: mcc", new Object[0]);
                listQ = az.a().q();
            }
            if (listQ != null && !listQ.isEmpty()) {
                arrayList = new ArrayList<>();
                for (CellInfo cellInfo : listQ) {
                    if (gn.a.a(cellInfo)) {
                        arrayList.add(a(cellInfo));
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(a(listQ.get(0)));
                }
            }
        }
        return arrayList;
    }

    public boolean as() {
        return aB() || aq();
    }

    public String b() {
        String str = Build.MODEL;
        return !TextUtils.isEmpty(str) ? str.trim() : str;
    }

    public String b(String str) {
        Signature[] signatureArrB;
        try {
            Object objB = str.equals(fz.d.c()) ? fc.a(this.f36444a).d().b(false, 0, str, 64) : fc.a(this.f36444a).d().a(false, 0, str, 64);
            if (objB == null || (signatureArrB = fk.b(objB, str)) == null || signatureArrB.length <= 0) {
                return null;
            }
            return ga.d(signatureArrB[0].toByteArray());
        } catch (Exception e10) {
            es.a().b(e10);
            return null;
        }
    }

    public String c() {
        return Build.MANUFACTURER;
    }

    public String c(String str) {
        ApplicationInfo applicationInfoA;
        CharSequence charSequenceG;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str) || (applicationInfoA = fc.a(this.f36444a).d().a(str, 1)) == null || (charSequenceG = fk.g(applicationInfoA, str)) == null) {
                return null;
            }
            return charSequenceG.toString();
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String d() {
        try {
            String str = fc.a(this.f36444a).d().l() + "|" + f() + "|" + c() + "|" + l() + "|" + k();
            String strA = a(false);
            if (strA == null) {
                strA = "";
            } else if (strA.length() > 16) {
                strA = strA.substring(0, 16);
            }
            return ga.e(str, strA);
        } catch (Throwable th2) {
            es.a().b(th2);
            return "";
        }
    }

    public boolean d(String str) throws Throwable {
        gi.a(ei.a("023de=dcdjdkdidcdl8cJdk5eifeiWdleddkCeif]ei.i"), (String) null);
        Integer num = (Integer) gi.a(this.f36444a, ei.a("019chfcKehel*fgSefgl5fCdjdfdififididk1e"), -1, str);
        return (num != null ? num.intValue() : -1) == 0;
    }

    public String e() {
        return fc.a(this.f36444a).d().l() + "|" + f() + "|" + c() + "|" + l() + "|" + k();
    }

    public boolean e(String str) {
        return fc.a(this.f36444a).d().a(true, str, 0) != null;
    }

    public int f() {
        return Build.VERSION.SDK_INT;
    }

    public String g() {
        return Build.VERSION.RELEASE;
    }

    public String h() {
        return Locale.getDefault().getLanguage();
    }

    public String i() {
        return this.f36444a.getResources().getConfiguration().locale.getLanguage();
    }

    public String j() {
        return Locale.getDefault().getCountry();
    }

    public String k() {
        StringBuilder sb2;
        int i10;
        int[] iArrB = gj.b(this.f36444a);
        if (this.f36444a.getResources().getConfiguration().orientation == 1) {
            sb2 = new StringBuilder();
            sb2.append(iArrB[0]);
            sb2.append("x");
            i10 = iArrB[1];
        } else {
            sb2 = new StringBuilder();
            sb2.append(iArrB[1]);
            sb2.append("x");
            i10 = iArrB[0];
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public String l() {
        Object objA = fz.d.a(ei.a("005jh%dkPef"));
        if (objA == null || !dt.i()) {
            return "-1";
        }
        String strV = az.a().i() ? (String) gi.a(objA, ei.a("014Rej!fi?eldidfgh=jf.djVdiDdkdj"), (Object) null, new Object[0]) : az.a().v();
        return TextUtils.isEmpty(strV) ? "-1" : strV;
    }

    public String m() {
        Object objA = fz.d.a(ei.a("005jhEdk)ef"));
        if (objA == null || !dt.i()) {
            return null;
        }
        String strU = az.a().i() ? (String) gi.a(objA, ei.a("018%ej?fiPeldidfgh,jf>dj di$dkdjegQd4df0f"), (Object) null, new Object[0]) : az.a().u();
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        return strU;
    }

    public String n() {
        return gh.a(this.f36444a).a();
    }

    public String o() {
        return this.f36444a.getPackageName();
    }

    public String p() {
        try {
            ApplicationInfo applicationInfoAk = fc.a(this.f36444a).d().ak();
            String strC = fz.d.c();
            String strB = fk.b(applicationInfoAk, strC);
            if (strB != null) {
                if (Build.VERSION.SDK_INT < 25 || strB.endsWith(".*")) {
                    return strB;
                }
                gi.a(strB, (String) null);
            }
            int iC = fk.c(applicationInfoAk, strC);
            return iC > 0 ? this.f36444a.getString(iC) : String.valueOf(fk.d(applicationInfoAk, strC));
        } catch (Throwable th2) {
            es.a().b(th2);
            return "";
        }
    }

    public int q() {
        try {
            int iIntValue = ((Integer) bc.a(null, ei.a("011]dd=f6djfididkVe@eddkdcZf"), Integer.class, 0)).intValue();
            if (iIntValue > 0) {
                return iIntValue;
            }
            Object objB = fc.a(this.f36444a).d().b(false, 0, o(), 0);
            return Build.VERSION.SDK_INT >= 28 ? (int) fk.g(objB, fz.d.c()) : fk.f(objB, fz.d.c());
        } catch (Throwable th2) {
            es.a().a(th2);
            return 0;
        }
    }

    public String r() {
        try {
            String str = (String) bc.a(null, ei.a("011QddNf_djfididkBe?eg?d*dfKf"), String.class, null);
            return !TextUtils.isEmpty(str) ? str : fk.c(fc.a(this.f36444a).d().b(false, 0, o(), 0), fz.d.c());
        } catch (Throwable th2) {
            es.a().a(th2);
            return "1.0";
        }
    }

    public ArrayList<HashMap<String, String>> s() {
        if (!az.a().g()) {
            List<PackageInfo> listS = az.a().s();
            if (listS == null || listS.isEmpty()) {
                return new ArrayList<>();
            }
            HashMap<String, Object> map = new HashMap<>();
            for (PackageInfo packageInfo : listS) {
                map.put(packageInfo.packageName, packageInfo);
            }
            return a(map);
        }
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            if (Build.VERSION.SDK_INT <= 25) {
                return a(ay());
            }
            ArrayList arrayList2 = (ArrayList) by.a(ei.a("004dgPdkOg"), (Object) null);
            if (arrayList2 == null || arrayList2.size() == 0) {
                arrayList2 = new ArrayList(Arrays.asList("1", "2"));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList = b(Integer.parseInt(String.valueOf(arrayList2.get(i10))));
                if (arrayList != null && !arrayList.isEmpty() && arrayList.size() > 1) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            es.a().a(th2);
            return new ArrayList<>();
        }
    }

    public String t() {
        return ((Build.VERSION.SDK_INT < 29 || fc.a(this.f36444a).d().ak().targetSdkVersion < 29 || !"mounted".equals(Environment.getExternalStorageState())) ? this.f36444a.getFilesDir() : this.f36444a.getExternalFilesDir(null)).getAbsolutePath();
    }

    public String u() throws Throwable {
        return null;
    }

    public ArrayList<HashMap<String, Object>> v() {
        if (!dt.h()) {
            return null;
        }
        try {
            if (!d(ei.a("041de9dcdjdkdidcdl*jf9djdfdififididkWe(dlfdededgieleldhedghfdgjelgidhfeghedfdfceegheg")) || P()) {
                return null;
            }
            List arrayList = new ArrayList();
            if (az.a().f()) {
                Object objA = fz.d.a(ei.a("005jhMdk)ef"));
                if (objA != null) {
                    arrayList = (List) gi.a(objA, ei.a("022JejMfiBeg%f)diej:h;ffdkdjdiJe%ejed>fgg_ee6e4efdk"), new Object[0]);
                }
            } else {
                List<NeighboringCellInfo> listR = az.a().r();
                if (listR != null && !listR.isEmpty()) {
                    arrayList.addAll(listR);
                }
            }
            if (arrayList == null || arrayList.size() <= 0) {
                return null;
            }
            ArrayList<HashMap<String, Object>> arrayList2 = new ArrayList<>();
            for (Object obj : arrayList) {
                int iIntValue = ((Integer) gj.a(gi.a(obj, ei.a("006SejGfiWeddidc"), new Object[0]), -1)).intValue();
                int iIntValue2 = ((Integer) gj.a(gi.a(obj, ei.a("006(ej9fi8feWdc"), new Object[0]), -1)).intValue();
                int iIntValue3 = ((Integer) gj.a(gi.a(obj, ei.a("007)ej%fiPgjfifidi"), new Object[0]), -1)).intValue();
                int iIntValue4 = ((Integer) gj.a(gi.a(obj, ei.a("006Uej9fi-glfiEc"), new Object[0]), -1)).intValue();
                int iIntValue5 = ((Integer) gj.a(gi.a(obj, ei.a("014*ej6fi1egSfiJfgdkdjehfcecAjf"), new Object[0]), -1)).intValue();
                if (iIntValue != -1 && iIntValue2 != -1) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put(ei.a("004cfgg"), Integer.valueOf(iIntValue));
                    map.put(ei.a("003gdc"), Integer.valueOf(iIntValue2));
                    map.put(ei.a("004Xdjfifidi"), Integer.valueOf(iIntValue3));
                    map.put(ei.a("003jBfiIc"), Integer.valueOf(iIntValue4));
                    map.put(ei.a("011efiTfgdkdjehfcecFjf"), Integer.valueOf(iIntValue5));
                    arrayList2.add(map);
                }
            }
            if (arrayList2.size() > 0) {
                return arrayList2;
            }
            return null;
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    public String w() {
        String str;
        String strA = ei.a("009Lekegflgigceeeggifl");
        UiModeManager uiModeManager = (UiModeManager) fz.d.a("uimode");
        if (uiModeManager == null) {
            return strA;
        }
        switch (uiModeManager.getCurrentModeType()) {
            case 1:
                str = "005)egghdhekee";
                break;
            case 2:
                str = "004Kflgielic";
                break;
            case 3:
                str = "003Wedfdgj";
                break;
            case 4:
                str = "010]fcgifegigkeeeleegheg";
                break;
            case 5:
                str = "0092fdglglfeeefdegedgi";
                break;
            case 6:
                str = "0052gffdfcedfk";
                break;
            case 7:
                str = "009Hgkgjfkgifdflelgifc";
                break;
            default:
                str = "009Oekegflgigceeeggifl";
                break;
        }
        return ei.a(str);
    }

    public HashMap<String, Object> y() {
        Object objN;
        if (dt.c()) {
            try {
                if (d(ei.a("036de)dcdjdkdidcdl[jf>djdfdififididkKeDdlfdededgieleldhgfeegceedhelfcfdfcgi"))) {
                    if (az.a().e()) {
                        Object objA = fz.d.a(ei.a("004Qfgdiefdi"));
                        objN = objA != null ? gi.a(objA, ei.a("017%ej%fiJeddk6eefciUdidk2e<ee,eBefdk"), new Object[0]) : null;
                    } else {
                        objN = az.a().n();
                    }
                    if (objN != null) {
                        HashMap<String, Object> map = new HashMap<>();
                        map.put("bsmt", (String) gi.a(objN, ei.a("008Aej@fiKfjeleleefl"), (Object) null, new Object[0]));
                        String str = (String) gi.a(objN, ei.a("007?ej:fiKeleleefl"), (Object) null, new Object[0]);
                        map.put("ssmt", str == null ? null : str.replace("\"", ""));
                        try {
                            map.put(ei.a("006h7didcdc<fe"), Boolean.valueOf(((Boolean) gi.a(objN, ei.a("013<ejKfiYfkdidcdcHfeQeleleefl"), new Object[0])).booleanValue()));
                        } catch (Throwable unused) {
                        }
                        try {
                            map.put("spmt", Integer.valueOf(((Integer) gi.a(objN, ei.a("012BejYfi%fedi3eBehelKjff]dc"), new Object[0])).intValue()));
                        } catch (Throwable unused2) {
                        }
                        try {
                            map.put(ei.a("009efi@fgdkdjeheedc"), Integer.valueOf(((Integer) gi.a(objN, ei.a("012?ej!fiRegXfi fgdkdjeheedc"), new Object[0])).intValue()));
                        } catch (Throwable unused3) {
                        }
                        try {
                            map.put(ei.a("005gf3dd;fg"), Integer.valueOf(((Integer) gi.a(objN, ei.a("007<ej,fi>gjfifidi"), new Object[0])).intValue()));
                        } catch (Throwable unused4) {
                        }
                        try {
                            map.put(ei.a("009*efdjRfKdedg*fec)ec"), Integer.valueOf(((Integer) gi.a(objN, ei.a("012Lej%fi<gcdjDf-dedgEfec^ec"), new Object[0])).intValue()));
                        } catch (Throwable unused5) {
                        }
                        return map;
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return null;
    }

    public ArrayList<HashMap<String, Object>> z() {
        List list;
        String[] strArrSplit;
        String strA;
        Object objA;
        String str;
        if (dt.d()) {
            try {
                if (d(ei.a("036deOdcdjdkdidcdlFjf7djdfdififididk;eUdlfdededgieleldhgfeegceedhelfcfdfcgi"))) {
                    if (az.a().e()) {
                        Object objA2 = fz.d.a(ei.a("0040fgdiefdi"));
                        if (objA2 == null) {
                            return null;
                        }
                        list = (List) gi.a(objA2, ei.a("014Gej2fiCel1cde-gj)f%fidg.giPfi"), new Object[0]);
                    } else {
                        List<ScanResult> listO = az.a().o();
                        if (listO != null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(listO);
                            list = arrayList;
                        } else {
                            list = null;
                        }
                    }
                    if (list == null) {
                        return null;
                    }
                    if (Build.VERSION.SDK_INT > 27) {
                        strArrSplit = ei.a("086]eleleefljhfjeleleefljh=cdjd@ffdiKg(diRiQdi2f*fijh_gfDdd!fgNjhefdj f3dedg6fecVecjhVchdeefg[gfdidc(ihCjhEcfeif4djgcdj-f4defhjhDcfeif_djgcdjTf%dehfjhIi didf_fKfi,idYdf'j").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        strA = ei.a("0317dd)feBdgHf)egJdIdfPf@jhifdkGjf0dj3diWdkdjgcdjdi^fe!dcDg3eceg:dHdf:f");
                    } else {
                        strArrSplit = "SSID,BSSID,hessid,anqpDomainId,capabilities,level,frequency,channelWidth,centerFreq0,centerFreq1,timestamp,seen,isAutoJoinCandidate,numIpConfigFailures,blackListTimestamp,untrusted,numConnection,numUsage,distanceCm,distanceSdCm,flags".split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        strA = ei.a("039FfgdiefdielfididcjhddUfeFdg5f4eg7dDdf.f?jhdkEjf%djWdi0dkdjgcdjdi^feWdcSgUeceg(dAdf,f");
                    }
                    String[] strArrSplit2 = strA.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    ArrayList<HashMap<String, Object>> arrayList2 = new ArrayList<>();
                    for (Object obj : list) {
                        HashMap<String, Object> map = new HashMap<>();
                        String str2 = null;
                        for (String str3 : strArrSplit) {
                            String strTrim = str3.trim();
                            if (ei.a("004 eleleefl").equals(strTrim)) {
                                str2 = (String) gi.a(obj, strTrim, (Object) null);
                                if (TextUtils.isEmpty(str2)) {
                                    break;
                                }
                                map.put(strTrim, str2);
                            } else {
                                if (ei.a("012cdjd-ffdi[gEdiMiAdiQfEfi").equals(strTrim)) {
                                    str = (String) gi.a(obj, strTrim, (Object) null);
                                    if (str != null && str.contains("[IBSS]")) {
                                        objA = str;
                                        objA = str;
                                        str2 = null;
                                        break;
                                    }
                                } else {
                                    objA = gi.a(obj, strTrim, (Object) null);
                                }
                                objA = str;
                                objA = str;
                                objA = str;
                                map.put(strTrim, objA);
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            for (String str4 : strArrSplit2) {
                                try {
                                    String strTrim2 = str4.trim();
                                    Object objA3 = gi.a(obj, strTrim2);
                                    map.put(strTrim2, objA3 == null ? null : objA3.toString());
                                } catch (Throwable unused) {
                                }
                            }
                            try {
                                map.put(ei.a("021$difihdfhhehfhfhc6cJgjfcfcgj5fOfi.j)dkNeCdc(fQdj"), gi.a(obj, ei.a("018.difihdfhhehfhfdfBc-gj8f:fiQjIdkFe1dc>f_dj"), new Object[0]));
                            } catch (Throwable unused2) {
                            }
                            try {
                                if (Build.VERSION.SDK_INT < 28) {
                                    List list2 = (List) gi.a(obj, ei.a("009deAdeQj,fediKef:fi"));
                                    map.put(ei.a("009de3de*j:fediOefMfi"), list2 == null ? null : new ArrayList(list2));
                                }
                            } catch (Throwable unused3) {
                            }
                            arrayList2.add(map);
                        }
                    }
                    return arrayList2;
                }
            } catch (Throwable th2) {
                es.a().b(th2);
            }
        }
        return null;
    }
}
