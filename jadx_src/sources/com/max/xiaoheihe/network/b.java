package com.max.xiaoheihe.network;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.AddCollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.bean.bbs.post_edit.RecommendedTopicItems;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.favour.FavourCollectionContentFragment;
import java.util.List;
import java.util.Map;
import ll.o;
import ll.t;
import ll.u;

/* JADX INFO: compiled from: CoroutineHeyBoxService.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface b extends com.max.hbcommon.network.c {
    @ll.e
    @dl.e
    @o("bbs/app/profile/fav/folder/add")
    Object Aa(@dl.d @ll.c("name") String str, @dl.d kotlin.coroutines.c<? super Result<AddCollectionFolder>> cVar);

    @ll.e
    @dl.e
    @o("bbs/app/profile/fav/folder/move")
    Object M0(@dl.e @ll.c(FavourCollectionContentFragment.f83664o) String str, @dl.e @ll.c("link_id") String str2, @dl.e @t("enable_new_style_collect") Integer num, @dl.d kotlin.coroutines.c<? super Result<Object>> cVar);

    @ll.e
    @dl.e
    @o("bbs/app/api/post_editor/topic_selection/outside_recommend")
    Object P5(@dl.e @t("appids") String str, @dl.d @ll.c("title") String str2, @dl.d @ll.c("text") String str3, @dl.d kotlin.coroutines.c<? super Result<RecommendedTopicItems>> cVar);

    @ll.e
    @dl.e
    @o("bbs/app/link/favour")
    Object ma(@dl.d @ll.c("link_id") String str, @dl.d @ll.c("favour_type") String str2, @dl.e @ll.c(FavourCollectionContentFragment.f83664o) String str3, @dl.d @u Map<String, String> map, @dl.d kotlin.coroutines.c<? super Result<Object>> cVar);

    @ll.f("game/get_game_name/")
    @dl.e
    Object p6(@dl.d @t("gameids") String str, @dl.d kotlin.coroutines.c<? super Result<List<GameObj>>> cVar);

    @ll.f("bbs/app/profile/fav/folders")
    @dl.e
    Object w5(@dl.d kotlin.coroutines.c<? super Result<CollectionFolders>> cVar);
}
