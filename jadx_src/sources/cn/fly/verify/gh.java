package cn.fly.verify;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static gh f36759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f36761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f36763e;

    private gh(Context context) {
        this.f36760b = context;
        d();
    }

    public static gh a(Context context) {
        if (f36759a == null) {
            synchronized (gh.class) {
                if (f36759a == null) {
                    f36759a = new gh(context);
                }
            }
        }
        return f36759a;
    }

    private boolean a(int i10) {
        Object objA = fz.d.a(g0.a.f118921e);
        if (objA == null) {
            return false;
        }
        if (a(objA) || b(objA)) {
            return true;
        }
        return b(i10);
    }

    private boolean a(Object obj) {
        Object objX;
        if (obj != null && fz.d.b(bq.a("035ef-edekelejedem<kgHekegejgjgjejel[f:emhkhjgegmeihmglhifhhjeifmgdgegdhj"))) {
            if (az.a().i()) {
                String strK = fz.d.k();
                objX = null;
                if (!TextUtils.isEmpty(strK) && ((strK.contains(bq.a("006i[ehZe'gh,gFej")) || strK.contains(bq.a("006-gleh7eHgh6gSej")) || strK.contains(bq.a("006;glflgehghjff"))) && Build.VERSION.SDK_INT >= 29)) {
                    objX = gi.a(obj, bq.a("015Yfk,gj<fm;g'ekeeejBdg3fmAjejg"), (Object) null, new Object[0]);
                }
            } else {
                objX = az.a().x();
            }
            if (objX != null && ((Integer) gi.a(objX, bq.a("016Ifk8gj_glghfhNgj*ghelekfigdfdHkg"), 0, new Object[0])).intValue() == 20) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str) {
        return bq.a("005>glfmhmgehm").equalsIgnoreCase(str) | (((((((bq.a("006Ehjhlgmhieigi").equalsIgnoreCase(str) | bq.a("006Lhjhlgmhieige").equalsIgnoreCase(str)) | bq.a("005Bglfmgmhmge").equalsIgnoreCase(str)) | bq.a("004]glfmhmge").equalsIgnoreCase(str)) | bq.a("005]glfmflhmge").equalsIgnoreCase(str)) | bq.a("004Uflidgdfm").equalsIgnoreCase(str)) | bq.a("005Xhjglhkhmgm").equalsIgnoreCase(str)) | bq.a("006!hjhlgmhieigk").equalsIgnoreCase(str));
    }

    private boolean b(int i10) {
        return i10 == 20;
    }

    private boolean b(Object obj) {
        if (obj != null && fz.d.b(bq.a("035efVedekelejedemHkgAekegejgjgjejel9fHemhkhjgegmeihmglhifhhjeifmgdgegdhj")) && Build.VERSION.SDK_INT >= 26) {
            Object objA = az.a().i() ? gi.a(obj, bq.a("015$fkOgjOfm*g1ekeeej$dg<fmYjejg"), (Object) null, new Object[0]) : az.a().x();
            if (objA != null && ((Integer) gi.a(objA, bq.a("010=fkNgj;fhekfmMjejg"), 0, new Object[0])).intValue() == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean b(String str) {
        return bq.a("004 ffgmhjfh").equalsIgnoreCase(str) | ((bq.a("004Afegmidge").equalsIgnoreCase(str) | bq.a("004:hjgmjehj").equalsIgnoreCase(str)) | bq.a("004Wjehmhkfm").equalsIgnoreCase(str));
    }

    private boolean c(int i10) {
        return i10 == 13;
    }

    @SuppressLint({"MissingPermission"})
    private void d() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) fz.d.a("connectivity");
            if (Build.VERSION.SDK_INT >= 26 && fz.d.b(bq.a("039efOedekelejedemHkgUekegejgjgjejel:f*emgefefehjfmfmeifhhjgdhghihkjdeifmgdgegdhj"))) {
                connectivityManager.registerDefaultNetworkCallback(e());
            } else if (fz.d.b(bq.a("039efHedekelejedem>kg^ekegejgjgjejelCfAemgefefehjfmfmeifhhjgdhghihkjdeifmgdgegdhj"))) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), e());
            } else {
                h();
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }

    private boolean d(int i10) {
        switch (i10) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    @TargetApi(21)
    private ConnectivityManager.NetworkCallback e() {
        return new ConnectivityManager.NetworkCallback() { // from class: cn.fly.verify.gh.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                super.onAvailable(network);
                gh.this.f();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                super.onCapabilitiesChanged(network, networkCapabilities);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                super.onLinkPropertiesChanged(network, linkProperties);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLosing(Network network, int i10) {
                super.onLosing(network, i10);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                super.onLost(network);
                gh.this.f();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                super.onUnavailable();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f36762d = i();
        this.f36763e = Integer.valueOf(g());
    }

    private int g() {
        if (fz.d.a(g0.a.f118921e) != null && fz.d.b(bq.a("035ef=edekelejedem9kgRekegejgjgjejel;f.emhkhjgegmeihmglhifhhjeifmgdgegdhj"))) {
            return Build.VERSION.SDK_INT >= 24 ? fe.a(this.f36760b).c() : fe.a(this.f36760b).b();
        }
        return -1;
    }

    private void h() {
        this.f36761c = new BroadcastReceiver() { // from class: cn.fly.verify.gh.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                try {
                    if (intent.getAction().equalsIgnoreCase(bq.a("036ef'edekelejedemJfgj]emNd,elQff)emfehifhfhhjfegdffhlffgdjmeifeglgefhjehj"))) {
                        gh.this.f();
                    }
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(bq.a("036ef+edekelejedemSfgjIem1d%elJff<emfehifhfhhjfegdffhlffgdjmeifeglgefhjehj"));
        el.a(this.f36761c, intentFilter);
    }

    private String i() {
        return (fz.d.b(bq.a("035ef=edekelejedem$kg*ekegejgjgjejel7f>emhkhjgegmeihmglhifhhjeifmgdgegdhj")) && az.a().i()) ? j() : c();
    }

    private String j() {
        Object objA;
        NetworkInfo activeNetworkInfo;
        try {
            if (fz.d.b(bq.a("039ef_edekelejedemKkgHekegejgjgjejel'f7emgefefehjfmfmeifhhjgdhghihkjdeifmgdgegdhj")) && (objA = fz.d.a("connectivity")) != null && (activeNetworkInfo = ((ConnectivityManager) objA).getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    int iB = fe.a(this.f36760b).b();
                    if (a(iB)) {
                        return bq.a("0026ijje");
                    }
                    if (c(iB)) {
                        return bq.a("002]imje");
                    }
                    return bq.a(d(iB) ? "0023kgje" : "002*ifje");
                }
                if (type == 1) {
                    return bq.a("004.ghejfgej");
                }
                switch (type) {
                    case 6:
                        return bq.a("005OghejegJeTfj");
                    case 7:
                        return bq.a("009:ggAh,ehMgj@elel^ji");
                    case 8:
                        return bq.a("005>edehegegfd");
                    case 9:
                        return bq.a("008gjig.ekSfgj");
                    default:
                        return String.valueOf(type);
                }
            }
        } catch (Throwable th2) {
            es.a().b(th2);
        }
        return bq.a("004fPelVfg");
    }

    public synchronized String a() {
        if (TextUtils.isEmpty(this.f36762d)) {
            this.f36762d = i();
        }
        return this.f36762d;
    }

    public synchronized int b() {
        if (this.f36763e == null) {
            this.f36763e = Integer.valueOf(g());
        }
        return this.f36763e.intValue();
    }

    @SuppressLint({"MissingPermission"})
    public String c() {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo = null;
        try {
            if (fz.d.b(bq.a("039efMedekelejedemSkg ekegejgjgjejelHf3emgefefehjfmfmeifhhjgdhghihkjdeifmgdgegdhj")) && (connectivityManager = (ConnectivityManager) fz.d.a("connectivity")) != null) {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
                if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                    String strA = bq.a("004%ghejfgej");
                    es.a().a("networkInfo: " + networkInfo2, new Object[0]);
                    return strA;
                }
                NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                if (networkInfo3 != null && networkInfo3.getState() == NetworkInfo.State.CONNECTED) {
                    String subtypeName = networkInfo3.getSubtypeName();
                    if (bq.a("002^fhhk").equalsIgnoreCase(subtypeName)) {
                        String strA2 = bq.a("002Aijje");
                        es.a().a("networkInfo: " + networkInfo3, new Object[0]);
                        return strA2;
                    }
                    if (bq.a("003Vgfgdhj").equalsIgnoreCase(subtypeName)) {
                        String strA3 = bq.a("002Eimje");
                        es.a().a("networkInfo: " + networkInfo3, new Object[0]);
                        return strA3;
                    }
                    if (a(subtypeName)) {
                        String strA4 = bq.a("0022kgje");
                        es.a().a("networkInfo: " + networkInfo3, new Object[0]);
                        return strA4;
                    }
                    if (!b(subtypeName)) {
                        es.a().a("networkInfo: " + networkInfo3, new Object[0]);
                        return subtypeName;
                    }
                    String strA5 = bq.a("002(ifje");
                    es.a().a("networkInfo: " + networkInfo3, new Object[0]);
                    return strA5;
                }
                NetworkInfo networkInfo4 = connectivityManager.getNetworkInfo(7);
                if (networkInfo4 != null && networkInfo4.getState() == NetworkInfo.State.CONNECTED) {
                    String strA6 = bq.a("009'ggPhDeh=gjVelelMji");
                    es.a().a("networkInfo: " + networkInfo4, new Object[0]);
                    return strA6;
                }
                NetworkInfo networkInfo5 = connectivityManager.getNetworkInfo(8);
                if (networkInfo5 != null && networkInfo5.getState() == NetworkInfo.State.CONNECTED) {
                    String strA7 = bq.a("005:edehegegfd");
                    es.a().a("networkInfo: " + networkInfo5, new Object[0]);
                    return strA7;
                }
                NetworkInfo networkInfo6 = connectivityManager.getNetworkInfo(9);
                if (networkInfo6 != null && networkInfo6.getState() == NetworkInfo.State.CONNECTED) {
                    String strA8 = bq.a("008gjig*ekSfgj");
                    es.a().a("networkInfo: " + networkInfo6, new Object[0]);
                    return strA8;
                }
                networkInfo = connectivityManager.getNetworkInfo(6);
                if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    String strA9 = bq.a("005Yghejeg@eCfj");
                    es.a().a("networkInfo: " + networkInfo, new Object[0]);
                    return strA9;
                }
            }
            es.a().a("networkInfo: " + networkInfo, new Object[0]);
        } catch (Throwable th2) {
            try {
                es.a().c(th2);
                es.a().a("networkInfo: " + ((Object) null), new Object[0]);
            } catch (Throwable th3) {
                es.a().a("networkInfo: " + ((Object) null), new Object[0]);
                throw th3;
            }
        }
        return bq.a("004fHel$fg");
    }
}
