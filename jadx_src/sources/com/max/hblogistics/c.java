package com.max.hblogistics;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.bean.address.AddressInfosObj;
import com.max.hblogistics.bean.address.AdminRegionObj;
import com.max.hblogistics.bean.address.AdminRegionsObj;
import com.max.hblogistics.bean.logistics.ExpressDetailObj;
import com.max.hbutils.bean.Result;
import io.reactivex.z;
import ll.o;

/* JADX INFO: compiled from: ApiService.java */
/* JADX INFO: loaded from: classes11.dex */
public interface c {
    @o("mall/physical/user/address/")
    z<Result<AddressInfosObj>> a();

    @ll.e
    @o("mall/physical/order/logistics/detail/")
    z<Result<ExpressDetailObj>> b(@ll.c("order_id") String str, @ll.c("source") String str2);

    @ll.e
    @o("mall/physical/pca/detail/")
    z<Result<AdminRegionsObj>> c(@ll.c("pca_version") String str);

    @ll.e
    @o("mall/physical/user/address/del/")
    z<Result> d(@ll.c("id") String str);

    @ll.e
    @o("mall/physical/user/address/modify/")
    z<Result> e(@ll.c("name") String str, @ll.c(g0.a.f118921e) String str2, @ll.c("is_default") String str3, @ll.c(AdminRegionObj.TYPE_PROVINCE) String str4, @ll.c(AdminRegionObj.TYPE_CITY) String str5, @ll.c(AdminRegionObj.TYPE_DISTRICT) String str6, @ll.c("code") String str7, @ll.c("detail") String str8, @ll.c("id") String str9);

    @ll.e
    @o("mall/physical/user/address/add/")
    z<Result<KeyDescObj>> f(@ll.c("name") String str, @ll.c(g0.a.f118921e) String str2, @ll.c("is_default") String str3, @ll.c(AdminRegionObj.TYPE_PROVINCE) String str4, @ll.c(AdminRegionObj.TYPE_CITY) String str5, @ll.c(AdminRegionObj.TYPE_DISTRICT) String str6, @ll.c("code") String str7, @ll.c("detail") String str8);
}
