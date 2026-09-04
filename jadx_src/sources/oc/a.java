package oc;

import com.max.hbexpression.bean.EmojisListResultObj;
import com.max.hbutils.bean.Result;
import io.reactivex.z;
import ll.f;
import ll.t;

/* JADX INFO: compiled from: ApiService.java */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    @f("bbs/app/api/emojis/list")
    z<Result<EmojisListResultObj>> a(@t("emoji_version") String str);
}
