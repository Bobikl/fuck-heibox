package com.tencent.thumbplayer.tcmedia.adapter;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f102330a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f102336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f102337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f102338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f102339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f102340k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TPProgramInfo f102344o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102342m = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, d> f102331b = new HashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, a> f102332c = new HashMap(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f102335f = new h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, TPOptionalParam> f102334e = new HashMap(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<Integer, TPTrackInfo> f102341l = new HashMap(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<TPTrackInfo> f102343n = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<C1014c> f102333d = new ArrayList<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f102346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<TPOptionalParam> f102347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, String> f102348d;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f102349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f102350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f102351c;
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.c$c, reason: collision with other inner class name */
    public static class C1014c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f102352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f102353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TPTrackInfo f102354c;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f102355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f102356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f102357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map<String, String> f102358d;
    }

    private void a(String str, String str2) {
        this.f102342m++;
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.trackType = 2;
        tPTrackInfo.name = str2;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.f102343n.add(tPTrackInfo);
    }

    private void a(String str, String str2, String str3) {
        this.f102342m++;
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.trackType = 3;
        tPTrackInfo.name = str3;
        tPTrackInfo.isSelected = false;
        tPTrackInfo.isExclusive = true;
        tPTrackInfo.isInternal = false;
        this.f102343n.add(tPTrackInfo);
    }

    public TPTrackInfo a(int i10) {
        return this.f102341l.get(Integer.valueOf(i10));
    }

    public void a() {
        this.f102331b.clear();
        this.f102332c.clear();
        this.f102337h = false;
        this.f102338i = 1.0f;
        this.f102339j = "";
        this.f102340k = 1.0f;
        this.f102341l.clear();
        this.f102330a = null;
        this.f102334e.clear();
        this.f102335f = new h();
        this.f102336g = null;
        this.f102344o = null;
        this.f102342m = -1;
        this.f102343n.clear();
        this.f102333d.clear();
    }

    public void a(float f10) {
        this.f102338i = f10;
    }

    public void a(int i10, long j10, TPTrackInfo tPTrackInfo) {
        this.f102341l.put(Integer.valueOf(tPTrackInfo.getTrackType()), tPTrackInfo);
        if (i10 < 0 || i10 >= this.f102343n.size()) {
            TPLogUtil.w("TPPlaybackParams", "track Index:" + i10 + " is invalid, trackInfoList size:" + this.f102343n.size());
            return;
        }
        C1014c c1014c = new C1014c();
        c1014c.f102352a = i10;
        c1014c.f102353b = j10;
        for (TPTrackInfo tPTrackInfo2 : this.f102343n) {
            if (tPTrackInfo2.trackType == tPTrackInfo.trackType) {
                if ((TextUtils.isEmpty(tPTrackInfo2.name) && TextUtils.isEmpty(tPTrackInfo.name)) || tPTrackInfo2.name.equals(tPTrackInfo.name)) {
                    tPTrackInfo2.isSelected = true;
                    c1014c.f102354c = tPTrackInfo2;
                } else {
                    tPTrackInfo2.isSelected = false;
                }
            }
        }
        this.f102333d.add(c1014c);
    }

    public void a(AssetFileDescriptor assetFileDescriptor) {
        this.f102335f.a(assetFileDescriptor);
    }

    public void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f102335f.a(parcelFileDescriptor);
    }

    public void a(Surface surface) {
        this.f102330a = surface;
    }

    public void a(SurfaceHolder surfaceHolder) {
        this.f102330a = surfaceHolder;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar, Map<String, String> map) {
        this.f102335f.a(eVar);
        this.f102335f.a(map);
    }

    public void a(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam != null) {
            this.f102334e.put(Integer.valueOf(tPOptionalParam.getKey()), tPOptionalParam);
        }
    }

    public void a(TPProgramInfo tPProgramInfo) {
        this.f102344o = tPProgramInfo;
    }

    public void a(ITPMediaAsset iTPMediaAsset) {
        this.f102335f.a(iTPMediaAsset);
    }

    public void a(String str) {
        this.f102339j = str;
    }

    public void a(String str, Map<String, String> map) {
        this.f102335f.a(str);
        this.f102335f.a(map);
    }

    public void a(String str, Map<String, String> map, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        d dVar = new d();
        dVar.f102355a = str;
        dVar.f102358d = map;
        dVar.f102356b = str2;
        dVar.f102357c = str3;
        this.f102331b.put(str, dVar);
        a(str, str2, str3);
    }

    public void a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a aVar = new a();
        aVar.f102345a = str;
        aVar.f102348d = map;
        aVar.f102346b = str2;
        aVar.f102347c = list;
        this.f102332c.put(str, aVar);
        a(str, str2);
    }

    public void a(boolean z10) {
        this.f102337h = z10;
    }

    public void a(boolean z10, long j10, long j11) {
        if (this.f102336g == null) {
            this.f102336g = new b();
        }
        b bVar = this.f102336g;
        bVar.f102349a = z10;
        bVar.f102350b = j10;
        bVar.f102351c = j11;
    }

    public TPOptionalParam b(int i10) {
        return this.f102334e.get(Integer.valueOf(i10));
    }

    public ArrayList<TPTrackInfo> b() {
        return this.f102343n;
    }

    public void b(float f10) {
        this.f102340k = f10;
    }

    public void b(int i10, long j10, TPTrackInfo tPTrackInfo) {
        this.f102341l.remove(Integer.valueOf(tPTrackInfo.getTrackType()));
        if (i10 < 0 || i10 >= this.f102343n.size()) {
            TPLogUtil.w("TPPlaybackParams", "track Index:" + i10 + " is invalid, trackInfoList size:" + this.f102343n.size());
            return;
        }
        for (TPTrackInfo tPTrackInfo2 : this.f102343n) {
            if (tPTrackInfo2.trackType == tPTrackInfo.trackType && ((TextUtils.isEmpty(tPTrackInfo2.name) && TextUtils.isEmpty(tPTrackInfo.name)) || tPTrackInfo2.name.equals(tPTrackInfo.name))) {
                tPTrackInfo2.isSelected = false;
                break;
            }
        }
        for (C1014c c1014c : this.f102333d) {
            TPTrackInfo tPTrackInfo3 = c1014c.f102354c;
            if (tPTrackInfo3 != null && tPTrackInfo3.equals(tPTrackInfo)) {
                this.f102333d.remove(c1014c);
                return;
            }
        }
    }

    public void b(String str) {
        this.f102335f.a(str);
    }

    public void b(boolean z10) {
        if (this.f102336g == null) {
            this.f102336g = new b();
        }
        b bVar = this.f102336g;
        bVar.f102349a = z10;
        bVar.f102350b = 0L;
        bVar.f102351c = -1L;
    }

    public ArrayList<C1014c> c() {
        return this.f102333d;
    }

    public Object d() {
        return this.f102330a;
    }

    public h e() {
        return this.f102335f;
    }

    public boolean f() {
        h hVar = this.f102335f;
        return hVar != null && hVar.h();
    }

    public boolean g() {
        return this.f102337h;
    }

    public float h() {
        return this.f102338i;
    }

    public String i() {
        return this.f102339j;
    }

    public float j() {
        return this.f102340k;
    }

    public b k() {
        return this.f102336g;
    }

    public TPProgramInfo l() {
        return this.f102344o;
    }

    public List<d> m() {
        ArrayList arrayList = new ArrayList(this.f102331b.size());
        Iterator<Map.Entry<String, d>> it = this.f102331b.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public List<a> n() {
        ArrayList arrayList = new ArrayList(this.f102332c.size());
        Iterator<Map.Entry<String, a>> it = this.f102332c.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public List<TPOptionalParam> o() {
        ArrayList arrayList = new ArrayList(this.f102334e.size());
        Iterator<Map.Entry<Integer, TPOptionalParam>> it = this.f102334e.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public boolean p() {
        return e() != null && e().g() == 2;
    }
}
