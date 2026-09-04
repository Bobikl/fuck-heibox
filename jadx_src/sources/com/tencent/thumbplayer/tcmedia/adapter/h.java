package com.tencent.thumbplayer.tcmedia.adapter;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f102402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ParcelFileDescriptor f102404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AssetFileDescriptor f102405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f102406e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ITPMediaAsset f102407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.thumbplayer.tcmedia.adapter.a.e f102408g;

    protected h() {
    }

    public String a() {
        return this.f102402a;
    }

    protected void a(AssetFileDescriptor assetFileDescriptor) {
        this.f102402a = null;
        this.f102403b = 4;
        this.f102406e.clear();
        this.f102404c = null;
        this.f102405d = assetFileDescriptor;
    }

    protected void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f102402a = null;
        this.f102403b = 1;
        this.f102406e.clear();
        this.f102404c = parcelFileDescriptor;
        this.f102405d = null;
    }

    public void a(com.tencent.thumbplayer.tcmedia.adapter.a.e eVar) {
        this.f102402a = null;
        this.f102403b = 3;
        this.f102404c = null;
        this.f102405d = null;
        this.f102408g = eVar;
    }

    protected void a(ITPMediaAsset iTPMediaAsset) {
        this.f102402a = null;
        this.f102403b = 2;
        this.f102406e.clear();
        this.f102404c = null;
        this.f102405d = null;
        this.f102407f = iTPMediaAsset;
    }

    protected void a(String str) {
        this.f102402a = str;
        this.f102403b = 0;
        this.f102404c = null;
        this.f102405d = null;
    }

    protected void a(Map<String, String> map) {
        this.f102406e.clear();
        Map<String, String> map2 = this.f102406e;
        if (map == null) {
            map = new HashMap<>(0);
        }
        map2.putAll(map);
    }

    public Map<String, String> b() {
        return this.f102406e;
    }

    public ParcelFileDescriptor c() {
        return this.f102404c;
    }

    public AssetFileDescriptor d() {
        return this.f102405d;
    }

    public ITPMediaAsset e() {
        return this.f102407f;
    }

    public com.tencent.thumbplayer.tcmedia.adapter.a.e f() {
        return this.f102408g;
    }

    public int g() {
        return this.f102403b;
    }

    protected boolean h() {
        return (TextUtils.isEmpty(this.f102402a) && this.f102404c == null && this.f102405d == null && this.f102407f == null && this.f102408g == null) ? false : true;
    }
}
