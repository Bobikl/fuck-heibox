package oa;

import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.basebbs.bean.video.VideoInfoResult;
import com.max.hbutils.bean.Result;
import io.reactivex.z;
import java.util.Map;
import ll.c;
import ll.e;
import ll.f;
import ll.j;
import ll.o;
import ll.t;
import ll.u;
import ll.y;
import okhttp3.d0;

/* JADX INFO: compiled from: ApiService.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    @f
    z<d0> a(@j Map<String, String> map, @y String str, @u Map<String, String> map2);

    @e
    @o("bbs/app/api/video/detail")
    z<Result<VideoInfoObj>> b(@t("link") String str, @c("info") String str2);

    @f("bbs/app/api/video/info")
    z<VideoInfoResult<String>> c(@t("link_id") String str);
}
