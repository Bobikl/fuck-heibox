package com.max.xiaoheihe.network;

import com.max.network.entities.ApiResponse;
import com.max.network.interfaces.ApiService;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import java.util.Map;
import ll.u;

/* JADX INFO: compiled from: HBServiceApi.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface d extends ApiService {
    @ll.f("bbs/app/profile/post/limits")
    @dl.e
    Object a(@u @dl.e Map<String, String> map, @dl.d kotlin.coroutines.c<? super ApiResponse<UserPostLimitsObj>> cVar);
}
