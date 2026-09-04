package nd;

import com.max.hbsearch.bean.SearchFoundObj;
import com.max.hbsearch.bean.SearchHotWelcomeObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.bean.SearchSuggestionV2Result;
import com.max.hbutils.bean.Result;
import dl.d;
import dl.e;
import io.reactivex.z;
import ll.f;
import ll.t;

/* JADX INFO: compiled from: ApiService.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface a {
    @f("bbs/app/api/search/found")
    @e
    z<Result<SearchFoundObj>> a(@e @t("key") String str, @t("force_refresh") boolean z10, @e @t("last_query") String str2);

    @f("bbs/app/api/search/welcome_page/v2")
    @d
    z<Result<SearchHotWelcomeObj>> b(@e @t("key") String str, @e @t("topic_id") String str2);

    @f("bbs/app/api/search/suggestion/v2")
    @e
    z<Result<SearchSuggestionV2Result>> c(@e @t("q") String str);

    @f("bbs/app/api/search/hot_words")
    @e
    z<Result<SearchHotwordsObj>> d(@e @t("key") String str, @e @t("topic_id") String str2);

    @f("bbs/app/api/search/welcome_page")
    @e
    z<Result<SearchHotwordsObj>> e(@e @t("key") String str, @e @t("topic_id") String str2);
}
