package com.huawei.agconnect.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.huawei.agconnect.core.ServiceRegistrar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60177a;

    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    c(Context context) {
        this.f60177a = context;
    }

    private <T extends ServiceRegistrar> T a(String str) {
        StringBuilder sb2;
        String string;
        try {
            Class<?> cls = Class.forName(str);
            if (ServiceRegistrar.class.isAssignableFrom(cls)) {
                return (T) Class.forName(str).newInstance();
            }
            Log.e("ServiceRegistrarParser", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e10) {
            string = "Can not found service class, " + e10.getMessage();
            Log.e("ServiceRegistrarParser", string);
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("instantiate service class exception ");
            sb2.append(e.getLocalizedMessage());
            string = sb2.toString();
            Log.e("ServiceRegistrarParser", string);
            return null;
        } catch (InstantiationException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("instantiate service class exception ");
            sb2.append(e.getLocalizedMessage());
            string = sb2.toString();
            Log.e("ServiceRegistrarParser", string);
            return null;
        }
    }

    private List<String> b() {
        StringBuilder sb2;
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = c();
        if (bundleC == null) {
            return arrayList;
        }
        HashMap map = new HashMap(10);
        for (String message : bundleC.keySet()) {
            if ("com.huawei.agconnect.core.ServiceRegistrar".equals(bundleC.getString(message))) {
                String[] strArrSplit = message.split(":");
                if (strArrSplit.length == 2) {
                    try {
                        map.put(strArrSplit[0], Integer.valueOf(strArrSplit[1]));
                    } catch (NumberFormatException e10) {
                        sb2 = new StringBuilder();
                        sb2.append("registrar configuration format error:");
                        message = e10.getMessage();
                        sb2.append(message);
                        Log.e("ServiceRegistrarParser", sb2.toString());
                    }
                } else if (strArrSplit.length == 1) {
                    map.put(strArrSplit[0], 1000);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("registrar configuration error, ");
                    sb2.append(message);
                    Log.e("ServiceRegistrarParser", sb2.toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(map.entrySet());
        Collections.sort(arrayList2, new a());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    private Bundle c() {
        PackageManager packageManager = this.f60177a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f60177a, (Class<?>) ServiceDiscovery.class), 128);
            if (serviceInfo != null) {
                return serviceInfo.metaData;
            }
            Log.e("ServiceRegistrarParser", "Can not found ServiceDiscovery service.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ServiceRegistrarParser", "get ServiceDiscovery exception." + e10.getLocalizedMessage());
        }
    }

    public List<Service> a() {
        Log.i("ServiceRegistrarParser", "getServices");
        List<String> listB = b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            ServiceRegistrar serviceRegistrarA = a(it.next());
            if (serviceRegistrarA != null) {
                serviceRegistrarA.initialize(this.f60177a);
                List<Service> services = serviceRegistrarA.getServices(this.f60177a);
                if (services != null) {
                    arrayList.addAll(services);
                }
            }
        }
        Log.i("ServiceRegistrarParser", "services:" + Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
