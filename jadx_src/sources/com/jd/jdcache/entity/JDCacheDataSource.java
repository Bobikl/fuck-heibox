package com.jd.jdcache.entity;

import androidx.annotation.Keep;
import com.jd.jdcache.JDCacheParamsProvider;
import com.jd.jdcache.c;
import com.jd.jdcache.util.UrlHelper;
import dl.d;
import dl.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: JDCacheDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheDataSource.kt\ncom/jd/jdcache/entity/JDCacheDataSource\n+ 2 CollectionHelper.kt\ncom/jd/jdcache/util/CollectionHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n11#2,3:98\n14#2,4:102\n18#2,3:107\n11#2,3:113\n14#2,4:117\n18#2,3:122\n11#2,3:125\n14#2,4:129\n18#2,3:134\n1855#3:101\n1856#3:106\n1620#3,3:110\n1855#3:116\n1856#3:121\n1855#3:128\n1856#3:133\n*S KotlinDebug\n*F\n+ 1 JDCacheDataSource.kt\ncom/jd/jdcache/entity/JDCacheDataSource\n*L\n79#1:98,3\n79#1:102,4\n79#1:107,3\n87#1:113,3\n87#1:117,4\n87#1:122,3\n93#1:125,3\n93#1:129,4\n93#1:134,3\n79#1:101\n79#1:106\n84#1:110,3\n87#1:116\n87#1:121\n93#1:128\n93#1:133\n*E\n"})
@Keep
public final class JDCacheDataSource {

    @d
    private JDCacheFileDetail localFileDirDetail;

    @e
    private HashMap<String, JDCacheLocalResp> localFileMap;

    public JDCacheDataSource(@d JDCacheFileDetail localFileDirDetail, @e HashMap<String, JDCacheLocalResp> map) {
        f0.p(localFileDirDetail, "localFileDirDetail");
        this.localFileDirDetail = localFileDirDetail;
        this.localFileMap = map;
    }

    public /* synthetic */ JDCacheDataSource(JDCacheFileDetail jDCacheFileDetail, HashMap map, int i10, u uVar) {
        this(jDCacheFileDetail, (i10 & 2) != 0 ? null : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public JDCacheDataSource(@d String offlineDirPath, boolean z10, @e List<JDCacheLocalResp> list, @e List<Triple<String, String, String>> list2, @e String str) {
        File file;
        String cacheDir;
        f0.p(offlineDirPath, "offlineDirPath");
        if (z10) {
            JDCacheParamsProvider jDCacheParamsProviderD = c.f64138a.d();
            if (jDCacheParamsProviderD != null && (cacheDir = jDCacheParamsProviderD.getCacheDir()) != null) {
                String str2 = cacheDir + File.separator + offlineDirPath;
                file = str2 != null ? new File(str2) : file;
            }
            throw new RuntimeException("Cache dir need to be set by JDCacheParamsProvider");
        }
        file = new File(offlineDirPath);
        this(new JDCacheFileDetail(file), null, 2, 0 == true ? 1 : 0);
        if (list != null) {
            setSourceList1(list);
        } else if (list2 != null) {
            setSourceList2(list2);
        } else if (str != null) {
            setSourceStr(str);
        }
    }

    public /* synthetic */ JDCacheDataSource(String str, boolean z10, List list, List list2, String str2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JDCacheDataSource copy$default(JDCacheDataSource jDCacheDataSource, JDCacheFileDetail jDCacheFileDetail, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jDCacheFileDetail = jDCacheDataSource.localFileDirDetail;
        }
        if ((i10 & 2) != 0) {
            map = jDCacheDataSource.localFileMap;
        }
        return jDCacheDataSource.copy(jDCacheFileDetail, map);
    }

    private final void setSourceList1(List<JDCacheLocalResp> list) {
        Map map = null;
        Collection collectionB = com.jd.jdcache.util.c.b(CollectionsKt___CollectionsKt.T5(list), false, 1, null);
        if (!(collectionB == null || collectionB.isEmpty())) {
            map = (Map) HashMap.class.newInstance();
            for (Object obj : collectionB) {
                String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((JDCacheLocalResp) obj).getUrl());
                if (strUrlToKey != null) {
                    f0.m(map);
                    map.put(strUrlToKey, obj);
                }
            }
        }
        this.localFileMap = (HashMap) map;
    }

    private final void setSourceList2(List<Triple<String, String, String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            arrayList.add(new JDCacheLocalResp((String) triple.a(), (String) triple.b(), null, (String) triple.c(), null, false, 52, null));
        }
        Map map = null;
        Collection collectionB = com.jd.jdcache.util.c.b(arrayList, false, 1, null);
        if (!(collectionB == null || collectionB.isEmpty())) {
            map = (Map) HashMap.class.newInstance();
            for (Object obj : collectionB) {
                String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((JDCacheLocalResp) obj).getUrl());
                if (strUrlToKey != null) {
                    f0.m(map);
                    map.put(strUrlToKey, obj);
                }
            }
        }
        this.localFileMap = (HashMap) map;
    }

    private final void setSourceStr(String str) {
        Map map = null;
        Collection collectionB = com.jd.jdcache.util.c.b(JDCacheLocalRespKt.jsonArrayParse(str), false, 1, null);
        if (!(collectionB == null || collectionB.isEmpty())) {
            map = (Map) HashMap.class.newInstance();
            for (Object obj : collectionB) {
                String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((JDCacheLocalResp) obj).getUrl());
                if (strUrlToKey != null) {
                    f0.m(map);
                    map.put(strUrlToKey, obj);
                }
            }
        }
        this.localFileMap = (HashMap) map;
    }

    @d
    public final JDCacheFileDetail component1() {
        return this.localFileDirDetail;
    }

    @e
    public final HashMap<String, JDCacheLocalResp> component2() {
        return this.localFileMap;
    }

    @d
    public final JDCacheDataSource copy(@d JDCacheFileDetail localFileDirDetail, @e HashMap<String, JDCacheLocalResp> map) {
        f0.p(localFileDirDetail, "localFileDirDetail");
        return new JDCacheDataSource(localFileDirDetail, map);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JDCacheDataSource)) {
            return false;
        }
        JDCacheDataSource jDCacheDataSource = (JDCacheDataSource) obj;
        return f0.g(this.localFileDirDetail, jDCacheDataSource.localFileDirDetail) && f0.g(this.localFileMap, jDCacheDataSource.localFileMap);
    }

    @d
    public final JDCacheFileDetail getLocalFileDirDetail() {
        return this.localFileDirDetail;
    }

    @e
    public final HashMap<String, JDCacheLocalResp> getLocalFileMap() {
        return this.localFileMap;
    }

    public int hashCode() {
        int iHashCode = this.localFileDirDetail.hashCode() * 31;
        HashMap<String, JDCacheLocalResp> map = this.localFileMap;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setLocalFileDirDetail(@d JDCacheFileDetail jDCacheFileDetail) {
        f0.p(jDCacheFileDetail, "<set-?>");
        this.localFileDirDetail = jDCacheFileDetail;
    }

    public final void setLocalFileMap(@e HashMap<String, JDCacheLocalResp> map) {
        this.localFileMap = map;
    }

    @d
    public String toString() {
        return "JDCacheDataSource(localFileDirDetail=" + this.localFileDirDetail + ", localFileMap=" + this.localFileMap + ')';
    }
}
