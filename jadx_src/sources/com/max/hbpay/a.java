package com.max.hbpay;

import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbutils.bean.Result;
import io.reactivex.z;
import ll.f;
import ll.t;

/* JADX INFO: compiled from: ApiService.java */
/* JADX INFO: loaded from: classes11.dex */
public interface a {
    @f("pay/wx_order_query/")
    z<Result<WeixinQueryObj>> a(@t(h5.b.A0) String str, @t("refresh") String str2);

    @f("pay/lianlian_order_query")
    z<Result<WeixinQueryObj>> b(@t(h5.b.A0) String str, @t("refresh") String str2);

    @f("pay/ali_order_query/")
    z<Result<WeixinQueryObj>> c(@t(h5.b.A0) String str, @t("refresh") String str2);
}
