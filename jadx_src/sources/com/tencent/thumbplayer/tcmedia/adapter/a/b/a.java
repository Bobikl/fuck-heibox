package com.tencent.thumbplayer.tcmedia.adapter.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import com.tencent.thumbplayer.tcmedia.utils.o;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Set<String> f102265a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Set<String> f102266b = new HashSet();

    public static synchronized void a(Context context) {
        TPLogUtil.i("TPDrmCapability", "TPDrmCapability, init");
        TPLogUtil.i("TPDrmCapability", "TPDrmCapability, get shared preferences.");
        SharedPreferences sharedPreferences = context.getSharedPreferences("TP_DRM_CAPABILITY", 0);
        try {
            f102265a = sharedPreferences.getStringSet("DRM_CAPABILITY_LIST", f102265a);
        } catch (ClassCastException e10) {
            TPLogUtil.e("TPDrmCapability", e10);
        }
        f102265a.removeAll(f102266b);
        a(sharedPreferences);
    }

    private static void a(final SharedPreferences sharedPreferences) {
        o.a().d().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int[] dRMCapabilities = new int[0];
                try {
                    dRMCapabilities = TPThumbplayerCapabilityHelper.getDRMCapabilities();
                } catch (TPNativeLibraryException unused) {
                }
                TPLogUtil.i("TPDrmCapability", "TPThumbPlayerCapabilityHelper, DRM capability:" + Arrays.toString(dRMCapabilities));
                if (dRMCapabilities.length == 0) {
                    return;
                }
                HashSet hashSet = new HashSet();
                for (int i10 : dRMCapabilities) {
                    hashSet.add(String.valueOf(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapDrmType.class, i10)));
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putStringSet("DRM_CAPABILITY_LIST", hashSet);
                editorEdit.apply();
                synchronized (a.class) {
                    Set unused2 = a.f102265a = hashSet;
                    a.f102265a.removeAll(a.f102266b);
                }
            }
        });
    }

    public static synchronized boolean a(@TPCommonEnum.TP_DRM_TYPE int i10) {
        if (i10 == -1) {
            return false;
        }
        Iterator<String> it = f102265a.iterator();
        while (it.hasNext()) {
            if (com.tencent.thumbplayer.tcmedia.utils.b.a(it.next(), -1) == i10) {
                return true;
            }
        }
        return false;
    }

    public static synchronized int[] a() {
        int[] iArr;
        iArr = new int[f102265a.size()];
        int i10 = 0;
        Iterator<String> it = f102265a.iterator();
        while (it.hasNext()) {
            int i11 = i10 + 1;
            iArr[i10] = com.tencent.thumbplayer.tcmedia.utils.b.a(it.next(), -1);
            i10 = i11;
        }
        return iArr;
    }

    public static synchronized void b(@TPCommonEnum.TP_DRM_TYPE int i10) {
        if (i10 == -1) {
            return;
        }
        f102266b.add(String.valueOf(i10));
        f102265a.removeAll(f102266b);
    }
}
