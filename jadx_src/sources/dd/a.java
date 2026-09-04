package dd;

import com.max.hbqrcode.bean.QRRedirectObj;
import com.max.hbutils.bean.Result;
import io.reactivex.z;
import ll.c;
import ll.e;
import ll.o;
import ll.t;

/* JADX INFO: compiled from: ApiService.java */
/* JADX INFO: loaded from: classes12.dex */
public interface a {
    @e
    @o("account/qr_redirect/")
    z<Result<QRRedirectObj>> a(@c("code") String str, @t("h_src") String str2);
}
