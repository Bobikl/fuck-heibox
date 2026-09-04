package com.jd.jdcache.match.impl;

import com.jd.jdcache.entity.JDCacheDataSource;
import com.jd.jdcache.entity.JDCacheLocalResp;
import com.jd.jdcache.entity.JDCacheLocalRespKt;
import com.jd.jdcache.util.FileHelperKt;
import com.jd.jdcache.util.UrlHelper;
import dl.e;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: HBMapResourceMatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nHBMapResourceMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBMapResourceMatcher.kt\ncom/jd/jdcache/match/impl/HBMapResourceMatcher$readResMapFromJsonFile$job$1\n+ 2 CollectionHelper.kt\ncom/jd/jdcache/util/CollectionHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n11#2,3:82\n14#2,4:86\n18#2,3:91\n1855#3:85\n1856#3:90\n*S KotlinDebug\n*F\n+ 1 HBMapResourceMatcher.kt\ncom/jd/jdcache/match/impl/HBMapResourceMatcher$readResMapFromJsonFile$job$1\n*L\n72#1:82,3\n72#1:86,4\n72#1:91,3\n72#1:85\n72#1:90\n*E\n"})
@d(c = "com.jd.jdcache.match.impl.HBMapResourceMatcher$readResMapFromJsonFile$job$1", f = "HBMapResourceMatcher.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class HBMapResourceMatcher$readResMapFromJsonFile$job$1 extends SuspendLambda implements l<c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f64148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f64149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ HBMapResourceMatcher f64150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HBMapResourceMatcher$readResMapFromJsonFile$job$1(String str, HBMapResourceMatcher hBMapResourceMatcher, c<? super HBMapResourceMatcher$readResMapFromJsonFile$job$1> cVar) {
        super(1, cVar);
        this.f64149c = str;
        this.f64150d = hBMapResourceMatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@dl.d c<?> cVar) {
        return new HBMapResourceMatcher$readResMapFromJsonFile$job$1(this.f64149c, this.f64150d, cVar);
    }

    @Override // yh.l
    @e
    public final Object invoke(@e c<? super b2> cVar) {
        return ((HBMapResourceMatcher$readResMapFromJsonFile$job$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        List list;
        Object objH = b.h();
        int i10 = this.f64148b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            File file = new File(this.f64149c);
            this.f64148b = 1;
            obj = FileHelperKt.b(file, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        String str = (String) obj;
        JDCacheDataSource dataSource = this.f64150d.getDataSource();
        if (dataSource != null) {
            List<JDCacheLocalResp> listJsonArrayParse = JDCacheLocalRespKt.jsonArrayParse(str);
            HashMap<String, JDCacheLocalResp> map = null;
            Map map2 = null;
            map = null;
            if (listJsonArrayParse != null && (list = (List) com.jd.jdcache.util.c.b(listJsonArrayParse, false, 1, null)) != null) {
                if (!list.isEmpty()) {
                    map2 = (Map) HashMap.class.newInstance();
                    for (Object obj2 : list) {
                        String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((JDCacheLocalResp) obj2).getUrl());
                        if (strUrlToKey != null) {
                            f0.m(map2);
                            map2.put(strUrlToKey, obj2);
                        }
                    }
                }
                map = (HashMap) map2;
            }
            dataSource.setLocalFileMap(map);
        }
        return b2.f124493a;
    }
}
