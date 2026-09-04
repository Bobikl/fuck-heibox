package com.max.xiaoheihe.network;

import androidx.constraintlayout.core.motion.utils.w;
import com.google.gson.JsonObject;
import com.lzy.okgo.model.Progress;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.question.QuestionListObj;
import com.max.hbminiprogram.bean.MiniProgramMenuInfoObj;
import com.max.hbminiprogram.bean.MiniProgramPageObj;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.AdsInfosObj;
import com.max.xiaoheihe.bean.AnimationResultList;
import com.max.xiaoheihe.bean.FeedbackFailedReasonListObj;
import com.max.xiaoheihe.bean.GeneralSearchResultObj;
import com.max.xiaoheihe.bean.JsListObj;
import com.max.xiaoheihe.bean.ResultObj;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.Resultx;
import com.max.xiaoheihe.bean.SearchGameListObj;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.SteamNativeListObj;
import com.max.xiaoheihe.bean.SwitchProxyObj;
import com.max.xiaoheihe.bean.ToolCardResultObj;
import com.max.xiaoheihe.bean.WebPackageResultObj;
import com.max.xiaoheihe.bean.WebUrlCheckResult;
import com.max.xiaoheihe.bean.WhiteHostnamesResult;
import com.max.xiaoheihe.bean.account.AccountStateObj;
import com.max.xiaoheihe.bean.account.AppClientStaticObj;
import com.max.xiaoheihe.bean.account.AuthInfoObj;
import com.max.xiaoheihe.bean.account.AuthorInfoObj;
import com.max.xiaoheihe.bean.account.AvatarDecorCategoriesObj;
import com.max.xiaoheihe.bean.account.BindGameDetailProtocolObj;
import com.max.xiaoheihe.bean.account.BindGameInfosObj;
import com.max.xiaoheihe.bean.account.BindProtocolObj;
import com.max.xiaoheihe.bean.account.CheckVersionObj;
import com.max.xiaoheihe.bean.account.FollowingListObj;
import com.max.xiaoheihe.bean.account.FriendRankResultObj;
import com.max.xiaoheihe.bean.account.GetRegisterCodeObj;
import com.max.xiaoheihe.bean.account.HeyboxFriendListObj;
import com.max.xiaoheihe.bean.account.HomeDataObj;
import com.max.xiaoheihe.bean.account.InterestProfileObj;
import com.max.xiaoheihe.bean.account.InterestProfileTopicResult;
import com.max.xiaoheihe.bean.account.MyGameListObj;
import com.max.xiaoheihe.bean.account.OnlineStateObj;
import com.max.xiaoheihe.bean.account.OnlineStateSettingResultObj;
import com.max.xiaoheihe.bean.account.PayPwdConfigObj;
import com.max.xiaoheihe.bean.account.ProfileEditorSettingsObj;
import com.max.xiaoheihe.bean.account.ProtocalResultObj;
import com.max.xiaoheihe.bean.account.PushStateGroupWrapperObjV4;
import com.max.xiaoheihe.bean.account.PushStateObj;
import com.max.xiaoheihe.bean.account.SignInResultObj;
import com.max.xiaoheihe.bean.account.TaskResultObj;
import com.max.xiaoheihe.bean.account.TimestampResultObj;
import com.max.xiaoheihe.bean.account.TipsStateObj;
import com.max.xiaoheihe.bean.account.UnloginStatsObj;
import com.max.xiaoheihe.bean.account.UpdateObj;
import com.max.xiaoheihe.bean.account.User;
import com.max.xiaoheihe.bean.account.UserGroupInfo;
import com.max.xiaoheihe.bean.account.UserMedalResultV2;
import com.max.xiaoheihe.bean.account.UserPermissionObj;
import com.max.xiaoheihe.bean.account.UserProfileResultObj;
import com.max.xiaoheihe.bean.account.VerifyInfoObj;
import com.max.xiaoheihe.bean.account.steaminfo.BindSteamUrlResult;
import com.max.xiaoheihe.bean.account.steaminfo.SignListResultObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamApiKeySettingObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamApiStateObj;
import com.max.xiaoheihe.bean.account.steaminfo.SteamPublicSettingObj;
import com.max.xiaoheihe.bean.ads.OverallAdInfo;
import com.max.xiaoheihe.bean.bbs.ActColumnObj;
import com.max.xiaoheihe.bean.bbs.BBSAchieveResult;
import com.max.xiaoheihe.bean.bbs.BBSCreateCommentResult;
import com.max.xiaoheihe.bean.bbs.BBSFloorCommentObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowedMomentsObj;
import com.max.xiaoheihe.bean.bbs.BBSFollowingResult;
import com.max.xiaoheihe.bean.bbs.BBSLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkSubObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkTreeObj;
import com.max.xiaoheihe.bean.bbs.BBSOfficialMessagesObj;
import com.max.xiaoheihe.bean.bbs.BBSPrivacySettingsObj;
import com.max.xiaoheihe.bean.bbs.BBSSubCommentsObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicBannerResult;
import com.max.xiaoheihe.bean.bbs.BBSTopicIndexObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicLinksObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenusObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicSubTagResult;
import com.max.xiaoheihe.bean.bbs.BBSUserAwardListResult;
import com.max.xiaoheihe.bean.bbs.BBSUserLinkListResult;
import com.max.xiaoheihe.bean.bbs.BBSUserListObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgResult;
import com.max.xiaoheihe.bean.bbs.BBSUserMsgsObj;
import com.max.xiaoheihe.bean.bbs.BBSUserNotifyObj;
import com.max.xiaoheihe.bean.bbs.BBSUserRelationsObj;
import com.max.xiaoheihe.bean.bbs.BbsRecommendObj;
import com.max.xiaoheihe.bean.bbs.BlockListObj;
import com.max.xiaoheihe.bean.bbs.CollectionFavTabList;
import com.max.xiaoheihe.bean.bbs.CollectionFolder;
import com.max.xiaoheihe.bean.bbs.CollectionFolderDetailObj;
import com.max.xiaoheihe.bean.bbs.CollectionFolderDetailObjV2;
import com.max.xiaoheihe.bean.bbs.CollectionFolders;
import com.max.xiaoheihe.bean.bbs.ComboObj;
import com.max.xiaoheihe.bean.bbs.ConceptHashtagIndex;
import com.max.xiaoheihe.bean.bbs.ConceptTopicIndex;
import com.max.xiaoheihe.bean.bbs.FeedBackObj;
import com.max.xiaoheihe.bean.bbs.FeedBackResultObj;
import com.max.xiaoheihe.bean.bbs.FeedbackPromptObj;
import com.max.xiaoheihe.bean.bbs.ForbidHistoryObj;
import com.max.xiaoheihe.bean.bbs.ForbidListObj;
import com.max.xiaoheihe.bean.bbs.ForbidReasonResult;
import com.max.xiaoheihe.bean.bbs.GameCommentsObj;
import com.max.xiaoheihe.bean.bbs.GamesInfoResultObj;
import com.max.xiaoheihe.bean.bbs.HashtagLinkListResultObj;
import com.max.xiaoheihe.bean.bbs.HashtagRankingResultObj;
import com.max.xiaoheihe.bean.bbs.ImageCacheObj;
import com.max.xiaoheihe.bean.bbs.ImageOriginalInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkBatteryInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkLabelsResult;
import com.max.xiaoheihe.bean.bbs.LocalHtmlObj;
import com.max.xiaoheihe.bean.bbs.PostExposureCountResult;
import com.max.xiaoheihe.bean.bbs.PostExposureRatioResult;
import com.max.xiaoheihe.bean.bbs.PostModuleListObj;
import com.max.xiaoheihe.bean.bbs.ProfileEventResult;
import com.max.xiaoheihe.bean.bbs.RecUsersResult;
import com.max.xiaoheihe.bean.bbs.RecallFeedsResult;
import com.max.xiaoheihe.bean.bbs.RecommendSettingsObj;
import com.max.xiaoheihe.bean.bbs.SearchLinkResult;
import com.max.xiaoheihe.bean.bbs.SearchWikiListObj;
import com.max.xiaoheihe.bean.bbs.TemplateHashtagResultObj;
import com.max.xiaoheihe.bean.bbs.TopicListInfoObj;
import com.max.xiaoheihe.bean.bbs.TopicListObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionResultObj;
import com.max.xiaoheihe.bean.bbs.TopicSelectionSearchResultObj;
import com.max.xiaoheihe.bean.bbs.UserPostLimitsObj;
import com.max.xiaoheihe.bean.bbs.WikiRankingResultObj;
import com.max.xiaoheihe.bean.bbs.WikiRelatedLinkObj;
import com.max.xiaoheihe.bean.bbs.post_edit.PostCompilationsObj;
import com.max.xiaoheihe.bean.bbs.webwithnative.RecommendStateList;
import com.max.xiaoheihe.bean.cert.AppCertResultObj;
import com.max.xiaoheihe.bean.chat.GroupUserObj;
import com.max.xiaoheihe.bean.chat.MessageResultObj;
import com.max.xiaoheihe.bean.chat.MsgSettingObj;
import com.max.xiaoheihe.bean.chat.RoomListObj;
import com.max.xiaoheihe.bean.chat.StrangerMsgListResultObj;
import com.max.xiaoheihe.bean.chat.StrangerMsgStateObj;
import com.max.xiaoheihe.bean.dynamicso.DynamicList;
import com.max.xiaoheihe.bean.favour.FavourLinksResult;
import com.max.xiaoheihe.bean.favour.FavourWikiResult;
import com.max.xiaoheihe.bean.favour.HistoryVisitedResult;
import com.max.xiaoheihe.bean.game.AllRecommendGameCategoryObj;
import com.max.xiaoheihe.bean.game.AutoAcceptGameParamsObj;
import com.max.xiaoheihe.bean.game.BindGameParamsObj;
import com.max.xiaoheihe.bean.game.CalendarGameCountObj;
import com.max.xiaoheihe.bean.game.CalendarGameGroupListObj;
import com.max.xiaoheihe.bean.game.CalendarGameGroupObj;
import com.max.xiaoheihe.bean.game.ConsoleCattessePriceHistoryObj;
import com.max.xiaoheihe.bean.game.CopyedTokenResult;
import com.max.xiaoheihe.bean.game.FreshmanDiscountObj;
import com.max.xiaoheihe.bean.game.GameBindInfoObj;
import com.max.xiaoheihe.bean.game.GameBundlesListObj;
import com.max.xiaoheihe.bean.game.GameCommentResultObj;
import com.max.xiaoheihe.bean.game.GameCompilationDetailObj;
import com.max.xiaoheihe.bean.game.GameDetailsObj;
import com.max.xiaoheihe.bean.game.GameDeveloperObj;
import com.max.xiaoheihe.bean.game.GameDiscountListObj;
import com.max.xiaoheihe.bean.game.GameDiscountListResultObj;
import com.max.xiaoheihe.bean.game.GameDurationObj;
import com.max.xiaoheihe.bean.game.GameGlobalPricesObj;
import com.max.xiaoheihe.bean.game.GameLangListObj;
import com.max.xiaoheihe.bean.game.GameListHeaderObj;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.bean.game.GameMobileBundlesCategoryObj;
import com.max.xiaoheihe.bean.game.GameMobileBundlesObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.game.GamePlatformPriceObj;
import com.max.xiaoheihe.bean.game.GamePlayStatObj;
import com.max.xiaoheihe.bean.game.GamePurchaseConditionObj;
import com.max.xiaoheihe.bean.game.GamePurchaseOrderProgressObj;
import com.max.xiaoheihe.bean.game.GamePurchaseParamsObj;
import com.max.xiaoheihe.bean.game.GamePurchaseResultObj;
import com.max.xiaoheihe.bean.game.GameShotListObj;
import com.max.xiaoheihe.bean.game.GameShotPictureFolderListObj;
import com.max.xiaoheihe.bean.game.GameStoreObj;
import com.max.xiaoheihe.bean.game.GameTagsObj;
import com.max.xiaoheihe.bean.game.GetGameHistoryListObj;
import com.max.xiaoheihe.bean.game.MobileGameDetailsObj;
import com.max.xiaoheihe.bean.game.MobileGameListObj;
import com.max.xiaoheihe.bean.game.MorelikeGameObj;
import com.max.xiaoheihe.bean.game.MultiDimensionListResult;
import com.max.xiaoheihe.bean.game.PlayerLeaderboardsObj;
import com.max.xiaoheihe.bean.game.PlayerListObj;
import com.max.xiaoheihe.bean.game.PriceHistoryResult;
import com.max.xiaoheihe.bean.game.QueryPackageListObj;
import com.max.xiaoheihe.bean.game.RollGameListObj;
import com.max.xiaoheihe.bean.game.ShareGameCommentDataObj;
import com.max.xiaoheihe.bean.game.SteamReviewInfo;
import com.max.xiaoheihe.bean.game.calendar.FilterGroupListObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2HeroListObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchDetailObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2MatchListObj;
import com.max.xiaoheihe.bean.game.dota2.Dota2TeammateListObj;
import com.max.xiaoheihe.bean.game.epic.EpicAddFreeObj;
import com.max.xiaoheihe.bean.game.epic.EpicDetailInfo;
import com.max.xiaoheihe.bean.game.epic.EpicLoginParam;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewCalendarListListObj;
import com.max.xiaoheihe.bean.game.gameoverview.GameOverviewListObj;
import com.max.xiaoheihe.bean.game.ow.OWPlayerOverviewObj;
import com.max.xiaoheihe.bean.game.pick.OwnGamePlatfObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGFamousResultObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGMatchListObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGPlayerOverviewObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGRankResultObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGSearchObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGStatsDetailObj;
import com.max.xiaoheihe.bean.game.pubg.PUBGWeaponMasteryObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendV2Result;
import com.max.xiaoheihe.bean.game.recommend.NewcomerCouponReceiveResult;
import com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj;
import com.max.xiaoheihe.bean.game.vote.VoteQuestionListObj;
import com.max.xiaoheihe.bean.game.xbox.XboxFriendInfoWrapper;
import com.max.xiaoheihe.bean.game.xbox.XboxPresenceInfo;
import com.max.xiaoheihe.bean.hotfix.HotFixPatchResultObj;
import com.max.xiaoheihe.bean.mall.MallAvatarDecorOptionsObj;
import com.max.xiaoheihe.bean.mall.MallBalanceOrderStateObj;
import com.max.xiaoheihe.bean.mall.MallBundlesObj;
import com.max.xiaoheihe.bean.mall.MallHeaderObj;
import com.max.xiaoheihe.bean.mall.MallOrderCancelTipObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallOrderInfoObj;
import com.max.xiaoheihe.bean.mall.MallOrderStateObj;
import com.max.xiaoheihe.bean.mall.MallOrdersObj;
import com.max.xiaoheihe.bean.mall.MallPayExtraInfo;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.mall.MallPrepareStateObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallProductsObj;
import com.max.xiaoheihe.bean.mall.MallProxyDataObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseParamsObj;
import com.max.xiaoheihe.bean.mall.MallPurchaseResultObj;
import com.max.xiaoheihe.bean.mall.MallSalesObj;
import com.max.xiaoheihe.bean.mall.MallSkuObj;
import com.max.xiaoheihe.bean.mall.MallSteamInfoObj;
import com.max.xiaoheihe.bean.mall.MallSteamOrderObj;
import com.max.xiaoheihe.bean.mall.MemberBulletinResultObj;
import com.max.xiaoheihe.bean.mall.NewcomerNotifyObj;
import com.max.xiaoheihe.bean.mall.PayLinkObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardList;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.bean.mall.cart.CartDetailObj;
import com.max.xiaoheihe.bean.mall.cart.MallCartOrderDetailObj;
import com.max.xiaoheihe.bean.mall.cart.SteamPurchaseOrderDetailObj;
import com.max.xiaoheihe.bean.mall.purchase.PayPriceResultObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchaseParamResultObj;
import com.max.xiaoheihe.bean.mall.purchase.PurchasePreviewResultObj;
import com.max.xiaoheihe.bean.mall.purchase.UseBuyPurchaseDialogObj;
import com.max.xiaoheihe.bean.news.ConceptFeedsResult;
import com.max.xiaoheihe.bean.news.FavourOptionsResult;
import com.max.xiaoheihe.bean.news.LinkListResultObj;
import com.max.xiaoheihe.bean.news.NewsFavourResultObj;
import com.max.xiaoheihe.bean.news.SubjectDetailResultOjb;
import com.max.xiaoheihe.bean.news.SubjectListResult;
import com.max.xiaoheihe.bean.news.TopicsSearchResult;
import com.max.xiaoheihe.bean.proxy.ProxyListObj;
import com.max.xiaoheihe.bean.proxy.ProxyParamsObj;
import com.max.xiaoheihe.bean.story.StoryModeListObj;
import com.max.xiaoheihe.bean.trade.AliCertifyResult;
import com.max.xiaoheihe.bean.trade.BindFailedInfoObj;
import com.max.xiaoheihe.bean.trade.MallTradeHomeObj;
import com.max.xiaoheihe.bean.trade.TradeAssistantResult;
import com.max.xiaoheihe.bean.trade.TradeBargainDetailObj;
import com.max.xiaoheihe.bean.trade.TradeBargainHistoryResult;
import com.max.xiaoheihe.bean.trade.TradeBatchBuyResult;
import com.max.xiaoheihe.bean.trade.TradeMallFollowInfo;
import com.max.xiaoheihe.bean.trade.TradeOfferDetailResult;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseInfoObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseInventoryResult;
import com.max.xiaoheihe.bean.trade.TradePurchaseParamObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseResult;
import com.max.xiaoheihe.bean.trade.TradeQuickPriceResult;
import com.max.xiaoheihe.bean.trade.TradeRequstResult;
import com.max.xiaoheihe.bean.trade.TradeSaleSettingsObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.bean.trade.TradeSteamParams;
import com.max.xiaoheihe.bean.trade.TradeSteamSettingObj;
import com.max.xiaoheihe.bean.trade.TradeSupplyCheckResult;
import com.max.xiaoheihe.bean.trade.TradeTipsStateObj;
import com.max.xiaoheihe.bean.trade.TradeWechatDataObj;
import com.max.xiaoheihe.bean.upload.COSUploadInfoObj;
import com.max.xiaoheihe.module.account.FastTestABTestResult;
import com.max.xiaoheihe.module.account.FastTestDemandResult;
import com.max.xiaoheihe.module.account.SendToFriendActivity;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.max.xiaoheihe.module.bbs.HotNewsStyleActivity;
import com.max.xiaoheihe.module.bbs.UserNotifyListActivity;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.favour.FavourCollectionContentFragment;
import com.max.xiaoheihe.module.game.EpicAddFreeGamesV2Activity;
import com.max.xiaoheihe.module.game.GameCenterActivity;
import com.max.xiaoheihe.module.game.GameCommentSuccessActivity;
import com.max.xiaoheihe.module.game.GameDetailFragment;
import com.max.xiaoheihe.module.game.component.dota2.Dota2HeroTitleView;
import com.max.xiaoheihe.module.game.d0;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialListObj;
import com.max.xiaoheihe.module.game.heybox.gamematerial.bean.GameMaterialObj;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankActivity;
import com.max.xiaoheihe.module.littleprogram.fragment.dota2.Dota2MatchDetailFragment;
import com.max.xiaoheihe.module.mall.MallPurchaseDetailDialogFragment;
import com.starlightc.ucropplus.ui.ModuleListFragment;
import com.taobao.aranger.constant.Constants;
import com.tencent.open.SocialConstants;
import io.reactivex.z;
import java.util.List;
import java.util.Map;
import ll.j;
import ll.l;
import ll.o;
import ll.r;
import ll.t;
import ll.u;
import ll.y;
import okhttp3.b0;

/* JADX INFO: compiled from: HeyBoxService.java */
/* JADX INFO: loaded from: classes12.dex */
public interface e extends com.max.hbcommon.network.c {
    @ll.e
    @o("mall/trade/purchase/supply/register_orders")
    z<Result<MallOrderInfoObj>> A(@ll.c("pcs_id") String str, @ll.c("data") String str2);

    @ll.f("game/r6/get_player_leaderboards/")
    z<Result<PlayerLeaderboardsObj>> A0(@u Map<String, String> map);

    @ll.f("mall/steam_purchase/order/state")
    z<Result<MallSteamOrderObj>> A1(@t("order_id") String str, @t("refresh") String str2);

    @ll.f("account/psn_game_list")
    z<Result<MyGameListObj>> A2(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("sort") String str2, @t("q") String str3);

    @ll.f("mall/trade/purchase/param")
    z<Result<TradePurchaseParamObj>> A3(@t("spu_id") String str);

    @ll.e
    @o("mall/trade/buyer_upload")
    z<Result> A4(@t("order_id") String str, @ll.c("data") String str2, @ll.c("key") String str3, @ll.c("sid") String str4, @t("time_") String str5);

    @ll.f("game/mobile/recommend/")
    z<Result<List<GameObj>>> A5(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/feedback/post")
    z<Result> A6(@ll.c("divice_info") String str, @ll.c("text") String str2, @ll.c("img_str") String str3);

    @ll.f("game/mobile/bundles/")
    z<Result<GameMobileBundlesObj>> A7();

    @ll.e
    @o("heybox/open/user/certification")
    z<Result<VerifyInfoObj>> A8(@ll.c("id_card") String str, @ll.c("name") String str2, @ll.c("for_mob") String str3, @ll.c("referer_path") String str4);

    @ll.f("mall/trade/get_trade_state")
    z<Result<StateObj>> A9();

    @ll.e
    @o("bbs/app/comment/set/bottom")
    z<Result> Ab(@ll.c("comment_id") String str, @t("h_src") String str2);

    @ll.e
    @o("bbs/app/profile/warning")
    z<Result> B(@ll.c("userid") String str, @ll.c("comment") String str2, @ll.c("obj_id") String str3, @ll.c("obj_type") String str4, @ll.c("reason") String str5);

    @ll.f("account/bind_game_id/")
    z<Result<StateObj>> B0(@t("game_id") String str, @t(ChannelsDetailActivity.V3) String str2, @t("server_id") String str3);

    @ll.e
    @o("game/h5_activity/token_info")
    z<Result<CopyedTokenResult>> B1(@ll.c("token") String str);

    @ll.f("account/client/dynamic_so")
    z<Result<DynamicList>> B2(@t("cpu_type") String str, @t(Constants.PARAM_KEYS) String str2);

    @ll.f("mall/newcomer/notify")
    z<Result<NewcomerNotifyObj>> B3();

    @ll.f("bbs/app/link/list/v2")
    z<Result<BBSLinkListResultObj>> B4(@t("h_src") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("q_userid") String str2, @t("topic_id") String str3, @t("type_filter") String str4, @t("sort_filter") String str5);

    @ll.f("game/destiny2/get_player_leaderboards/")
    z<Result<PlayerLeaderboardsObj>> B5(@u Map<String, String> map);

    @ll.f("bbs/app/story_mode/list")
    z<Result<StoryModeListObj>> B6(@t("init_item_id") String str, @u Map<String, String> map);

    @ll.e
    @o("account/personal_profile/pay_password/update/")
    z<Result> B7(@ll.c("pwd") String str);

    @ll.f("mall/trade/web/sale_skus")
    z<Result<TradeSteamInventoryResult>> B8(@t("spu_id") String str, @t(BBSTopicObj.VIRTUAL_TAG_MORE) String str2, @t("price_max") String str3);

    @ll.f("game/pubg/weaspon/mastery/list")
    z<Result<PUBGWeaponMasteryObj>> B9(@t("nickname") String str, @t("player_id") String str2);

    @ll.e
    @o("bbs/app/api/link/post")
    z<Result<ResultVerifyInfoObj>> Ba(@j Map<String, String> map, @t("auth_code") String str, @ll.c(PictureVideoEditPostFragment.Y3) String str2, @ll.d Map<String, String> map2);

    @ll.e
    @o("store/create_roll_room/")
    z<Result> Bb(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("maxnews/app/setup/favour")
    z<Result<NewsFavourResultObj>> C(@t("news_list_group") String str, @t("news_list_type") String str2, @t("key") String str3);

    @ll.f("game/get_game_monthly_player/")
    z<Result<GamePlayStatObj>> C0(@t(d0.f87248t) String str);

    @ll.e
    @o("account/get_pwd_code/")
    z<Result<GetRegisterCodeObj>> C2(@ll.c("phone_num") String str);

    @ll.e
    @o("bbs/app/comment/cy/operation")
    z<Result> C3(@ll.c("comment_id") String str, @ll.c("op") String str2);

    @ll.f("mall/trade/spu/follow_info")
    z<Result<TradeMallFollowInfo>> C4(@t("spu_id") String str);

    @ll.e
    @o("account/follow_developer/")
    z<Result> C5(@ll.c("dvpid") String str);

    @ll.f("mall/history_free_app")
    z<Result<GetGameHistoryListObj>> C6(@t("platform") String str, @t("offset_time") String str2);

    @ll.e
    @o("app/client/report_installed_package_list")
    z<Result> C7(@ll.c("package_list") String str);

    @ll.f("bbs/app/profile/fav/folder/v2/links")
    z<Result<CollectionFolderDetailObj>> C8(@t("exclude_folder_id") String str, @t(w.c.R) Integer num, @t("limit") Integer num2, @t("enable_new_style_collect") Integer num3);

    @ll.f("game/developers/")
    z<Result<GameListObj>> C9(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("mall/upload/steam_info/")
    z<Result> Ca(@t("order_id") String str, @ll.c("data") String str2, @ll.c("key") String str3, @ll.c("sid") String str4, @t("time_") String str5);

    @ll.e
    @o("/fast_test/change_abtest_info")
    z<Result> Cb(@ll.c("abtest_key") String str, @ll.c("target_group") String str2);

    @ll.f("chat/access_friend_invite/")
    z<Result> D(@t("invite_id") String str, @t("state") String str2);

    @ll.f("bbs/app/link/edit/info")
    z<Result<BBSLinkTreeObj>> D0(@t("link_id") String str);

    @ll.f("account/privacy/version/")
    z<Result<JsonObject>> D1(@t("type") String str);

    @ll.e
    @o("mall/steam_purchase/order/register")
    z<Result<MallSteamOrderObj>> D2(@ll.c("package_id") String str, @ll.c("pay_method") String str2, @ll.c("set_country") String str3);

    @ll.f("game/get_similar_games/")
    z<Result<GameListObj>> D3(@t(d0.f87248t) String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/topic/categories")
    z<Result<ConceptTopicIndex>> D4();

    @ll.f("bbs/app/profile/fav/folder/v2/links")
    z<Result<CollectionFolderDetailObjV2>> D5(@t(FavourCollectionContentFragment.f83664o) String str, @t(w.c.R) Integer num, @t("limit") Integer num2, @t("enable_new_style_collect") Integer num3);

    @ll.e
    @o("chatroom/friend/user_del_friend")
    z<Result> D6(@ll.c("friend_id") String str);

    @ll.f("account/xbox_game_list")
    z<Result<MyGameListObj>> D7(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("sort") String str2, @t("q") String str3);

    @ll.e
    @o("bbs/app/comment/report")
    z<Result> D8(@ll.c("comment_id") String str, @ll.c("report_reason") String str2, @ll.c("report_desc") String str3, @t("h_src") String str4);

    @ll.f("mall/trade/update_inventory")
    z<Result> D9();

    @ll.e
    @o("bbs/app/link/game/comment/up")
    z<Result> Da(@ll.c("link_id") String str, @ll.c("support_type") String str2, @ll.c("h_src") String str3);

    @ll.f("mall/trade/sell/wait_deliver")
    z<Result<TradeSteamInventoryResult>> Db(@t("q") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("wiki/get/article/related/link")
    z<Result<WikiRelatedLinkObj>> E(@t("article_id") String str, @t("wiki_id") String str2, @t("name") String str3, @t("link_id") String str4);

    @ll.f("mall/order/cashier/preview")
    z<Result<PurchasePreviewResultObj>> E0(@t("sku_id") String str, @t("cat_value") String str2, @t("item_num") int i10, @t("is_grouping") boolean z10, @t(GameDetailFragment.S4) String str3, @t("grouping_purchase") boolean z11);

    @ll.f("account/game_list/")
    z<Result<MyGameListObj>> E2(@t("userid") String str, @t("steam_id") String str2, @t(w.c.R) int i10, @t("limit") int i11, @t("sort") String str3, @t("q") String str4);

    @ll.f("bbs/app/link/set/unreportable")
    z<Result> E3(@t("link_id") String str);

    @ll.f("bbs/app/api/at/search")
    z<Result<BBSUserRelationsObj>> E4(@t("q") String str);

    @ll.f("bbs/app/hashtag/template/center")
    z<Result<TemplateHashtagResultObj>> E5();

    @ll.f("bbs/tool/get_recommend_state")
    z<Result<RecommendStateList>> E6(@t("link_id") String str, @t(EpicAddFreeGamesV2Activity.f84073y1) String str2);

    @ll.f("bbs/app/profile/privacy/settings")
    z<Result<BBSPrivacySettingsObj>> E7();

    @ll.f("bbs/app/feeds/news")
    z<Result<ConceptFeedsResult>> E8(@t(w.c.R) int i10, @t("limit") int i11, @t("tag") String str, @t("lastval") String str2, @u Map<String, String> map);

    @ll.f("mall/purchase/bundle/")
    z<Result<MallBundlesObj>> E9(@t("appid") String str, @t("package_id") String str2, @t("spu_id") String str3, @t("h_src") String str4);

    @ll.f("mall/trade/bargain/order/history")
    z<Result<TradeBargainHistoryResult>> Ea(@t("q") String str, @t("is_seller") String str2, @t("order_type") String str3, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/trade/steam_inventory")
    z<Result<TradeSteamInventoryResult>> Eb(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/link/share/click")
    z<Result> F(@t("h_src") String str, @t("link_id") String str2, @u Map<String, String> map);

    @ll.f("bbs/app/profile/history/visit")
    z<Result<HistoryVisitedResult>> F0(@t("type") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("chat/user/get_user_info/")
    z<Result<GroupUserObj>> F2(@t("userid") String str);

    @ll.e
    @o("account/login_code/")
    z<Result<User>> F3(@ll.c("phone_num") String str, @t("code") String str2, @t("referrer") String str3);

    @ll.f("game/game_compilation_detail/")
    z<Result<GameCompilationDetailObj>> F4(@t("id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/gift/order/progress")
    z<Result<MallOrderStateObj>> F5(@t("order_id") String str);

    @ll.f("game/subscribe_game/")
    z<Result> F6(@t("appid") String str, @t("phonenum") String str2, @t("allow_auto_download") String str3);

    @ll.e
    @o("bbs/app/author/article/battery/charging")
    z<Result> F7(@ll.c("link_id") String str, @ll.c("battery_inc") String str2, @t("h_src") String str3);

    @ll.f("account/home_v2/")
    z<Result<HomeDataObj>> F8();

    @ll.f("game/ow/ow_famous_player/")
    z<Result<PlayerListObj>> F9();

    @ll.f("game/ow/get_player_overview/")
    z<Result<OWPlayerOverviewObj>> Fa(@t("player_id") String str, @t("user_id") String str2, @t("season") String str3);

    @ll.f("mall/check/pay/")
    z<Result<MallPayInfoObj>> Fb(@t("order_id") String str, @t("coupon_id") String str2, @t("purchase_code") String str3, @t("coin") String str4, @t(com.max.xiaoheihe.module.mall.i.M) String str5, @t("deduct_coin") String str6, @u Map<String, String> map);

    @ll.e
    @o("bbs/app/link/releasing/vote")
    z<Result> G(@ll.c("link_id") String str, @ll.c("is_admin") String str2);

    @ll.f("account/unlogin_stats/")
    z<Result<UnloginStatsObj>> G0();

    @ll.e
    @o("bbs/app/link/publish/related/news")
    z<Result> G1(@ll.c("link_id") String str, @ll.c("show") int i10, @ll.c("publish_time") String str2);

    @ll.f("bbs/app/profile/bbs/comment/list")
    z<BBSUserMsgResult<List<BBSUserMsgObj>>> G2(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("only_cy") String str2, @t("filter_type") String str3);

    @ll.e
    @o("maxnews/app/setup/favour")
    z<Result> G4(@ll.c(EpicAddFreeGamesV2Activity.f84073y1) String str, @ll.c("exclude_ids") String str2, @ll.c("auto_rank") String str3);

    @ll.f("bbs/app/api/app_exposure/ratio/get")
    z<Result<PostExposureRatioResult>> G5(@t("link_id") String str);

    @ll.f("game/steam/screenshot/overview")
    z<Result<GameShotPictureFolderListObj>> G6(@t("user_id") String str, @t("steam_id") String str2, @t("platform") String str3);

    @ll.f("account/refresh_steam_stats/")
    z<Result<UpdateObj>> G7(@t("type") String str, @t("steam_id") String str2, @t("userid") String str3);

    @ll.e
    @o("account/check_account_state/")
    z<Result<AccountStateObj>> G8(@ll.c("wechat_id") String str, @ll.c("phone_num") String str2);

    @ll.e
    @o("bbs/app/comment/top/add")
    z<Result> G9(@ll.c("comment_id") String str);

    @ll.f("game/pubg/get_updating_state/")
    z<Result<StateObj>> Ga(@t("player_id") String str, @t("region") String str2, @t("season") String str3, @t("fpp") String str4);

    @ll.f("account/following_list/")
    z<Result<FollowingListObj>> Gb(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @u Map<String, String> map);

    @ll.e
    @o("account/max/old_pkey_login/")
    z<Result<User>> H(@ll.c("max_id") String str, @ll.c("maxjia_pkey") String str2);

    @ll.f("chat/set_message_setting/")
    z<Result<MsgSettingObj>> H0(@t("level") String str);

    @ll.e
    @o("account/android_playtime_report")
    z<Result> H1(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("bbs/app/api/follow/alert")
    z<Result<TimestampResultObj>> H2();

    @ll.f("mall/check_account/steam/prepare")
    z<Result<MallPrepareStateObj>> H3();

    @ll.f("bbs/app/feedback/list")
    z<FeedBackResultObj<List<FeedBackObj>>> H4(@t("newer") String str, @t("older") String str2);

    @ll.f("game/get_player_achievements_for_game/")
    z<Result<GameObj>> H5(@t("steam_id64") String str, @t(d0.f87248t) String str2, @t(w.c.R) int i10, @t("limit") int i11, @t("sort_type") String str3);

    @ll.e
    @o("account/follow_game/")
    z<Result> H6(@ll.c(d0.f87248t) String str, @ll.c("app_push_status") String str2);

    @ll.f("chatroom/account/get_user_some_info")
    z<Result<OnlineStateObj>> H7();

    @ll.f("account/steam_friends_v2/")
    z<Result<FriendRankResultObj>> H8(@t("userid") String str, @t("steam_id") String str2);

    @ll.e
    @o("mall/trade/batch/register")
    z<Result<MallOrderInfoObj>> H9(@ll.c("data") String str);

    @ll.e
    @o("mall/physical/order/confirm/receipt/")
    z<Result> Ha(@ll.c("order_id") String str);

    @ll.f("game/mini_app/main_page")
    z<Result<MiniProgramPageObj>> Hb(@t("mini_app_id") String str);

    @ll.f("game/steam_bind_failed_reason")
    z<Result<FeedbackFailedReasonListObj>> I();

    @ll.f("store/get_game_package_price/")
    z<Result<GamePurchaseParamsObj>> I0(@t("appid") String str, @u Map<String, String> map);

    @ll.f("game/console/get_game_detail/")
    z<Result<GameDetailsObj>> I1(@t("h_src") String str, @t("appid") String str2, @t(com.max.xiaoheihe.module.mall.i.G) String str3);

    @ll.f("mall/trade/spu/unfollow")
    z<Result> I2(@t("spu_id") String str);

    @ll.f("bbs/app/api/post_tools")
    z<Result<PostModuleListObj>> I3(@t("post_tools_use_thumb") String str, @t("h_src") String str2, @t("is_template_v2") int i10);

    @ll.f("account/client/animation")
    z<Result<AnimationResultList>> I4();

    @ll.f("game/rec_wall")
    z<Result<RecommendBoardList>> I5(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("account/max/modify_pwd_with_code/")
    z<Result> I6(@ll.c("phone_num") String str, @ll.c("pwd") String str2, @t("sid") String str3);

    @ll.f("mall/member/bulletin")
    z<Result<MemberBulletinResultObj>> I7();

    @ll.e
    @o("account/submit_user_platform")
    z<Result> I8(@ll.c("platform_list") String str);

    @ll.f("bbs/app/profile/award/list")
    z<BBSUserAwardListResult> I9(@t("news_comment_id") String str, @t("link_id") String str2, @t("comment_id") String str3, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/mobile/get_game_detail/")
    z<Result<MobileGameDetailsObj>> Ia(@t("h_src") String str, @t("appid") String str2);

    @ll.f("maxnews/topic/list")
    z<Result<SubjectListResult>> Ib(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/link/favour")
    z<Result> J(@t("h_src") String str, @ll.c("link_id") String str2, @ll.c("newsid") String str3, @ll.c("favour_type") String str4, @ll.c(FavourCollectionContentFragment.f83664o) String str5, @u Map<String, String> map);

    @ll.f("mall/order/detail/v2/")
    z<Result<MallOrderDetailObj>> J0(@t("order_id") String str);

    @ll.f("bbs/app/hashtag/ranking")
    z<Result<HashtagRankingResultObj>> J1();

    @ll.f("mall/order/purchase/param")
    z<Result<PurchaseParamResultObj>> J3(@t("appid") String str, @t("sku_id") String str2, @t(com.max.xiaoheihe.module.mall.i.G) String str3, @t("is_grouping") boolean z10, @t(GameDetailFragment.S4) String str4);

    @ll.f("game/pubg/get_player_matches/")
    z<Result<PUBGMatchListObj>> J4(@t("nickname") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("season") String str2, @t("region") String str3, @t("all") int i12, @t("player_id") String str4);

    @ll.f("bbs/app/link/labels")
    z<Result<LinkLabelsResult>> J5();

    @ll.f("task/sign_v3/get_sign_state")
    z<Result<SignInResultObj>> J6();

    @ll.e
    @o("bbs/app/profile/follow/user")
    z<Result> J7(@ll.c("following_id") String str, @ll.c("follows") String str2);

    @ll.e
    @o("chatroom/settings/update_friend_setting")
    z<Result> J8(@ll.c(x5.a.f141077v) String str, @ll.c("value") String str2, @ll.c("to_user_id") String str3);

    @ll.f("game/all_recommend/game_comments/")
    z<Result<AllRecommendGameCategoryObj>> J9(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("account/max/login/")
    z<Result<User>> Jb(@ll.c("phone_num") String str, @ll.c("web_id") String str2, @ll.c("pwd") String str3);

    @ll.f("account/get_refreshing_state/")
    z<Result<UpdateObj>> K(@t("type") String str, @t(d0.f87248t) String str2, @t("userid") String str3);

    @ll.f("chat/message_setting/")
    z<Result<MsgSettingObj>> K0();

    @ll.f("pay/mall/unifiedorder")
    z<Result<PayOrderObj>> K1(@t("pay_type") String str, @u Map<String, String> map);

    @ll.f("account/friend_list_v2/")
    z<Result<FriendRankResultObj>> K2(@t("key") String str, @t("userid") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/hashtag/search")
    z<Result<HashtagRankingResultObj>> K3(@t("q") String str, @t("type") String str2, @t(r5.e.f138812l) String str3);

    @ll.f("mall/steam_info/")
    z<Result<MallSteamInfoObj>> K4(@t("order_id") String str);

    @ll.f("game/get_game_bundles/")
    z<Result<GameBundlesListObj>> K5(@t(d0.f87248t) String str, @u Map<String, String> map, @t("sort_type") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/get_game_prices/history/v2")
    z<Result<PriceHistoryResult>> K6(@t("appid") String str, @t(com.max.xiaoheihe.module.mall.i.G) String str2, @t("cc") String str3, @t("package_id") String str4, @t("days") String str5);

    @ll.f("mall/trade/bargain/order/detail")
    z<Result<TradeBargainHistoryResult>> K7(@t("order_id") String str);

    @ll.e
    @o("account/max/get_pwd_sid/")
    z<Result> K8(@ll.c("phone_num") String str, @t("code") String str2);

    @ll.e
    @o("mall/free_package/upload")
    z<Result> K9(@t("platform") String str, @ll.c("data") String str2, @ll.c("key") String str3, @ll.c("sid") String str4, @t("time_") String str5);

    @ll.f("mall/trade/purchase/supply/inventory")
    z<Result<TradePurchaseInventoryResult>> Ka(@t("pcs_id") String str);

    @ll.f("pay/mall/unifiedorder")
    z<Result<PayOrderObj>> Kb(@t("order_id") String str, @t("order_type") String str2, @t("pay_type") String str3, @t("pay_price") String str4, @t("coupon_id") String str5, @t("purchase_code") String str6, @t("deduct_coin") String str7);

    @ll.f("bbs/app/api/sources/get_additional_pkg_url")
    z<Result<ImageCacheObj>> L(@t("key") String str, @t("pkg_v") String str2);

    @ll.f("game/xbox/v2/presence_info")
    z<Result<XboxPresenceInfo>> L0(@t("xuid") String str);

    @ll.f("mall/trade/purchase/supply/order_detail")
    z<Result<TradePurchaseInfoObj>> L1(@t("pcs_id") String str);

    @ll.f("game/epic/friends_info")
    z<Result<EpicDetailInfo>> L2(@t("user_id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/trade/check_order_to")
    z<Result<TradeOfferStateObj>> L3(@t("toid") String str);

    @ll.f("game/console/get_game_lang/")
    z<Result<GameLangListObj>> L4(@t("appid") String str, @t("platform") String str2);

    @ll.f("account/my_comment_list")
    z<Result<MyGameListObj>> L5(@t("userid") String str, @t("platform") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/profile/build/relation")
    z<Result> L6(@ll.c("userid") String str, @ll.c("relation_type") String str2);

    @ll.f("mall/header/")
    z<Result<MallHeaderObj>> L7();

    @ll.f("mall/trade/sku/follow_info")
    z<Result<TradeMallFollowInfo>> L8(@t("sku_id") String str);

    @ll.f("mall/coupon/center/get_all/")
    z<Result> L9(@u Map<String, String> map);

    @ll.f("game/steam/screenshot/list")
    z<Result<GameShotListObj>> La(@t("user_id") String str, @t("steam_id") String str2, @t("app_id") String str3, @t("platform") String str4, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("wiki/ranking")
    z<Result<WikiRankingResultObj>> Lb();

    @ll.f("game/dota2/player/follow")
    z<Result> M1(@t("user_id") String str, @t("steam_id") String str2, @t("state") String str3);

    @ll.f("pay/withdraw/ali_certify/query")
    z<Result<TradeOfferStateObj>> M2(@t("certify_id") String str, @t("goto_certify_manager") boolean z10, @u Map<String, Object> map);

    @ll.f("mall/trade/steam_settings")
    z<Result<TradeSteamSettingObj>> M3();

    @ll.f("maxnews/app/reset/favour")
    z<Result> M4();

    @ll.f("game/get_wiki_share_info/")
    z<Result<KeyDescObj>> M5(@t("wiki_id") String str);

    @ll.f("store/roll/check_in_white_list/")
    z<Result> M6();

    @ll.e
    @o("bbs/app/api/post_info_legal")
    z<Result> M7(@j Map<String, String> map, @t("auth_code") String str, @ll.c(PictureVideoEditPostFragment.Y3) String str2, @ll.d Map<String, String> map2, @ll.c(PostPageFactory.f81484t) String str3);

    @ll.e
    @o("bbs/app/link/like/combo")
    z<Result<ComboObj>> M8(@ll.c("link_id") String str, @t("h_src") String str2);

    @ll.f("game/release_calendar/filters")
    z<Result<FilterGroupListObj>> M9();

    @ll.f("bbs/app/profile/preference")
    z<Result<InterestProfileObj>> Ma();

    @ll.f("mall/trade/bargain/pay")
    z<Result<MallPayInfoObj>> Mb(@t("order_id") String str, @t("pay_type") String str2, @t("pay_price") String str3);

    @ll.e
    @o("account/recommend/block/topic/remove")
    z<Result> N(@ll.c("topic_id") String str);

    @ll.f("game/dota2/player/calendars")
    z<Result<GameOverviewCalendarListListObj>> N0(@t("user_id") String str, @t("steam_id") String str2);

    @ll.f("account/get_bind_protocol")
    z<Result<BindProtocolObj>> N1(@t(ChannelsDetailActivity.V3) String str);

    @ll.e
    @o("bbs/app/link/set/comment/disable")
    z<Result> N2(@ll.c("link_id") String str, @ll.c("disable_comment") String str2);

    @ll.f("bbs/notify/list")
    z<Result<List<BBSUserNotifyObj>>> N3(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/author/article/battery")
    z<Result<LinkBatteryInfoObj>> N4(@t("link_id") String str);

    @ll.f("mall/trade/tradeoffer/detail")
    z<Result<TradeOfferDetailResult>> N5(@t("toid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/mobile/get_auto_download_list")
    z<Result<MobileGameListObj>> N6();

    @ll.e
    @o("account/wechat/login/v3/")
    z<Result<User>> N7(@ll.d Map<String, String> map);

    @ll.e
    @o("mall/trade/sell/put_on")
    z<Result<TradeRequstResult>> N8(@ll.c("data") String str);

    @ll.e
    @o("bbs/app/profile/delete/history/visit")
    z<Result> N9(@ll.c("id") String str, @ll.c("type") String str2, @ll.c("opt") String str3);

    @ll.f("chatroom/mobile/friends/audio")
    z<Result<RoomListObj>> Na();

    @ll.e
    @o("mall/register/orders/")
    z<Result<MallPurchaseResultObj>> Nb(@ll.c("data") String str, @t("h_src") String str2);

    @ll.f("app/client/certificate")
    z<Result<AppCertResultObj>> O(@t("cert_type") String str, @t("md5") String str2);

    @ll.f("bbs/app/profile/relations")
    z<Result<BBSUserRelationsObj>> O0(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/final/price/")
    z<Result<MallPriceObj>> O1(@t("order_id") String str, @t("coupon_id") String str2, @t("purchase_code") String str3, @t("deduct_coin") String str4);

    @ll.f("game/get_game_infos/")
    z<Result<GamesInfoResultObj>> O2(@t("appids") String str);

    @ll.f("mall/trade/sell/trade_assistant")
    z<Result<TradeAssistantResult>> O3();

    @ll.f("chat/stranger_messages/")
    z<Result<StrangerMsgListResultObj>> O4(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/notify/official_msg_v2/list")
    z<Result<BBSOfficialMessagesObj>> O5(@t(UserNotifyListActivity.O) String str, @t(w.c.R) int i10, @t("limit") int i11, @t("last_val") String str2);

    @ll.e
    @o("mall/trade/sell/pull_off")
    z<Result> O6(@ll.c("data") String str);

    @ll.f("game/impression/questions")
    z<Result<QuestionListObj>> O7(@t("appid") String str);

    @ll.e
    @o("bbs/app/profile/recommend/settings")
    z<Result<RecommendSettingsObj>> O8(@ll.c("enabled") String str);

    @ll.f("game/get_game_detail/")
    z<Result<GameDetailsObj>> O9(@t("h_src") String str, @t("appid") String str2, @t("sku_id") String str3, @t(com.max.xiaoheihe.module.mall.i.G) String str4);

    @ll.e
    @o("chat/send_message/")
    z<Result> Oa(@t("userid") String str, @ll.c("text") String str2, @ll.c(SocialConstants.PARAM_IMG_URL) String str3);

    @ll.e
    @o("bbs/app/profile/fav/folder/add")
    z<Result> Ob(@ll.c("name") String str);

    @ll.f("mall/check/purchase_code/")
    z<Result<KeyDescObj>> P(@t("purchase_code") String str, @t("order_id") String str2, @t("coupon_id") String str3);

    @ll.f("game/pubg/famous_player_list/")
    z<Result<PUBGFamousResultObj>> P0(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/release_calendar/game_list")
    z<Result<CalendarGameGroupListObj>> P1(@t("month_timestamp") String str, @u Map<String, String> map);

    @ll.e
    @o("bbs/app/link/user_top_link")
    z<Result> P2(@ll.c("link_id") String str, @ll.c("action") String str2);

    @ll.f("bbs/app/api/post_editor/topic_selection/search")
    z<Result<TopicSelectionSearchResultObj>> P3(@t("q") String str, @t("only_hashtag") int i10);

    @ll.f("bbs/app/user/discount_message_v2")
    z<Result<GameDiscountListResultObj>> P4(@t("last_timestamp") String str);

    @ll.f("store/auto_accept_game_params/")
    z<Result<AutoAcceptGameParamsObj>> P6(@t("order_id") String str);

    @ll.f("game/comment/share_data")
    z<Result<ShareGameCommentDataObj>> P7(@t("appid") String str, @t("userid") String str2, @t(GameCommentSuccessActivity.W) String str3);

    @ll.f("bbs/app/link/drafts")
    z<Result<BBSLinkListResultObj>> P8(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/privacy/recommend/switch/get")
    z<Result<JsonObject>> P9();

    @ll.f("game/switch/bind_type")
    z<Result<KeyDescObj>> Pa(@t("userid") String str);

    @ll.f("account/version_control_info/")
    z<Result<CheckVersionObj>> Pb();

    @ll.f("account/style_conf/change")
    z<Result<TipsStateObj>> Q();

    @ll.e
    @o("bbs/app/profile/privacy/settings")
    z<Result> Q0(@ll.c(com.tekartik.sqflite.b.f98586e) String str, @ll.c("filter_options") String str2);

    @ll.f("mall/trade/spu/follow")
    z<Result> Q1(@t("spu_id") String str);

    @ll.e
    @o("bbs/app/profile/topic/settings")
    z<Result> Q2(@ll.c("topic_ids") String str);

    @ll.f("bbs/app/topic/sub/categories")
    z<Result<BBSTopicSubTagResult>> Q3(@t("topic_id") String str);

    @ll.f("account/personal_profile/config/get/")
    z<Result<PayPwdConfigObj>> Q5();

    @ll.f("bbs/app/profile/following/simple_list")
    z<Result<BBSFollowingResult<String>>> Q6(@t("userid") String str);

    @ll.f("mall/trade/remind_deliver")
    z<Result> Q7(@t("order_id") String str);

    @ll.f("mall/trade/sale/modify")
    z<Result> Q8(@t("key") String str, @t("value") String str2, @t("auto_start") String str3, @t("auto_stop") String str4);

    @ll.e
    @o("bbs/app/profile/fav/folder/del")
    z<Result> Q9(@ll.c(FavourCollectionContentFragment.f83664o) String str, @t("enable_new_style_collect") Integer num);

    @ll.f("mall/activite/proxy/")
    z<Result<MallProxyDataObj>> Qa(@t("order_id") String str);

    @ll.f("bbs/app/topic/categories_v2")
    z<Result<ConceptHashtagIndex>> Qb();

    @ll.e
    @o("bbs/app/profile/delete/relation")
    z<Result> R(@ll.c("userid") String str, @ll.c("relation_type") String str2);

    @ll.f("store/get_game_purchase_param_v4/")
    z<Result<GamePurchaseParamsObj>> R0(@t("appid") String str, @t(com.max.xiaoheihe.module.mall.i.G) String str2, @t("h_src") String str3, @t("sku_id") String str4);

    @ll.f("mall/trade/sku/follow")
    z<Result> R1(@t("sku_id") String str);

    @o("account/manual_refresh_steam_screenshot")
    z<Result> R2(@t("steam_id") String str);

    @ll.f
    z<okhttp3.d0> R3(@j Map<String, String> map, @y String str);

    @ll.f("store/whish/list/")
    z<Result<GameStoreObj>> R4(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("mall/trade/sell/change_price")
    z<Result<TradeQuickPriceResult>> R5(@ll.c("data") String str);

    @ll.f("bbs/app/profile/history/search")
    z<Result<HistoryVisitedResult>> R6(@t("query") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/steam_purchase/order/detail")
    z<Result<SteamPurchaseOrderDetailObj>> R7(@t("order_id") String str);

    @ll.e
    @o("mall/trade/order_skus/check")
    z<Result<TradeOfferStateObj>> R8(@ll.c("data") String str);

    @ll.f("bbs/app/api/send/link/notify")
    z<Result> R9(@t("link_id") String str);

    @ll.f("game/dota2/player/followed_match_list")
    z<Result<Dota2MatchListObj>> Ra(@t("user_id") String str, @t("steam_id") String str2, @t("add_self") String str3);

    @ll.f("mall/pay/")
    z<Result<MallOrderDetailObj>> Rb(@t("order_id") String str, @t("coupon_id") String str2, @t("purchase_code") String str3, @t("coin") String str4, @t("deduct_coin") String str5, @t("out_order_id") String str6, @t("pay_type") String str7, @u Map<String, String> map);

    @ll.f("mall/trade/batch/param")
    z<Result<TradePurchaseParamObj>> S(@t("spu_id") String str);

    @ll.f("mall/orders/")
    z<Result<MallOrdersObj>> S0(@t("filter") String str, @u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/owned_game/game_list")
    z<Result<SearchGameListObj>> S1(@t(ChannelsDetailActivity.V3) String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/steam_api_key/setting_page")
    z<Result<SteamApiKeySettingObj>> S2();

    @ll.f("bbs/app/max/tag_list")
    z<Result<NewsFavourResultObj>> S3();

    @ll.e
    @o("bbs/app/profile/fav/folder/edit")
    z<Result> S4(@ll.c(FavourCollectionContentFragment.f83664o) String str, @ll.c("name") String str2);

    @ll.f("bbs/app/link/game/comments")
    z<Result<GameCommentsObj>> S5(@t("appid") String str, @t("sort_type") String str2, @t(r5.e.f138812l) String str3, @t(w.c.R) int i10, @t("limit") int i11, @u Map<String, String> map, @t(ChannelsDetailActivity.f79598h4) String str4);

    @ll.e
    @o("bbs/app/link/feedback")
    z<Result> S6(@ll.c("link_id") String str, @ll.c("reasons") String str2, @ll.c("cates") String str3, @t("h_src") String str4, @ll.c("location") String str5, @ll.c("event_ids") String str6);

    @ll.f("mall/cart/order/get_type")
    z<Result<KeyDescObj>> S7(@t("order_id") String str);

    @ll.f("mall/pay/")
    z<Result<MallOrderDetailObj>> S8(@t("order_id") String str, @t("coupon_id") String str2, @t("purchase_code") String str3, @t("coin") String str4, @t("deduct_coin") String str5, @t("out_order_id") String str6, @t("pay_type") String str7);

    @ll.f("game/get_games_with_tag/")
    z<Result<GameListObj>> S9(@t("tag_id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/profile/achieve/list_v3")
    z<Result<UserMedalResultV2>> Sa(@t("userid") String str);

    @ll.e
    @o("account/recommend/block/topic/add")
    z<Result> Sb(@ll.c("topic_id") String str);

    @ll.e
    @o("account/modify_pwd_without_pwd/")
    z<Result> T(@ll.c("pwd") String str);

    @ll.f("bbs/app/api/general/search/v1")
    z<Result<GeneralSearchResultObj>> T0(@t("q") String str, @t("search_type") String str2, @t("quick_from") String str3, @u Map<String, String> map);

    @ll.e
    @o("account/get_phonenum_sid/")
    z<Result> T1(@ll.c("phone_num") String str, @t("code") String str2);

    @ll.e
    @o("account/written_off_account/")
    z<Result> T3(@ll.c("phone_num") String str, @t("sid") String str2);

    @ll.f("bbs/app/api/search/topic")
    z<Result<TopicListObj>> T4(@t("q") String str, @t("related_topic_id") String str2, @t("is_new_style") String str3);

    @ll.f("/fast_test/get_abtest_info")
    z<Result<FastTestABTestResult>> T5(@t("abtest_key") String str);

    @ll.f("store/switch/proxy/")
    z<Result<SwitchProxyObj>> T6();

    @ll.f("game/csgo/5e/get_player_leaderboards")
    z<Result<PlayerLeaderboardsObj>> T8(@u Map<String, String> map);

    @ll.f("account/cut")
    z<Result> T9(@t("cut_heybox_id") String str);

    @ll.f("mall/check/pay/")
    z<Result<MallPayInfoObj>> Ta(@t("order_id") String str, @t("coupon_id") String str2, @t("purchase_code") String str3, @t("coin") String str4, @t(com.max.xiaoheihe.module.mall.i.M) String str5, @t("deduct_coin") String str6);

    @ll.f("account/game_servers/")
    z<Result<GameBindInfoObj>> Tb();

    @ll.f("account/bind/_dev/quick_unbind")
    z<Result> U(@t(ChannelsDetailActivity.V3) String str);

    @ll.f("game/xbox/v2/game_score_rank")
    z<Result<XboxFriendInfoWrapper>> U0(@t("xuid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/api/article_collection/get_collection_list")
    z<Result<PostCompilationsObj>> U1(@t("owner_id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/cart/add_to_cart")
    z<Result<CartDetailObj>> U2(@t("sku_id") String str, @t("count") String str2, @t("cat_value") String str3, @t(com.max.xiaoheihe.module.mall.i.I) String str4, @t(com.max.xiaoheihe.module.mall.i.H) String str5, @t("inc_count") String str6);

    @ll.f("game/epic/free_package_pick_up_failed_reason")
    z<Result<FeedbackFailedReasonListObj>> U3();

    @ll.f("account/epic_game_list")
    z<Result<MyGameListObj>> U4(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("q") String str2);

    @l
    @o("account/update_profile/")
    z<Result<User>> U5(@r Map<String, b0> map);

    @ll.f("bbs/app/profile/user/link/list")
    z<BBSUserLinkListResult> U6(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("link_tag") String str2, @t("list_type") String str3, @t("lastval") String str4, @t("no_banner") int i12);

    @ll.f("task/replenish_sign/")
    z<Result> U7(@t(Progress.L) String str);

    @ll.e
    @o("account/max/get_pwd_code/")
    z<Result<GetRegisterCodeObj>> U8(@ll.c("phone_num") String str);

    @ll.f("mall/trade/batch/check")
    z<Result<TradeSupplyCheckResult>> U9(@t("order_id") String str);

    @ll.f("bbs/app/link/favour/search")
    z<Result<CollectionFolder>> Ua(@t("keyword") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("maxnews/app/favour/options")
    z<FavourOptionsResult> Ub(@t("first") String str);

    @ll.f("mall/trade/bargain/sku/setting")
    z<Result> V(@t("sku_id") String str, @t("estimate_price") String str2, @t("bargain_enable") String str3);

    @ll.f("store/register_order/")
    z<Result<GamePurchaseResultObj>> V0(@t("appid") String str, @t(com.umeng.analytics.pro.d.aw) String str2, @u Map<String, String> map);

    @ll.e
    @o("account/login_phonenum/")
    z<Result<User>> V1(@ll.c("token") String str, @ll.c(com.umeng.analytics.pro.d.M) String str2, @ll.d Map<String, String> map);

    @ll.f("bbs/app/actcol/link/list")
    z<Result<ActColumnObj>> V3(@t("col_id") String str, @t(ModuleListFragment.ARG_TAB_ID) String str2, @t(w.c.R) Integer num, @t("limit") Integer num2, @t("lastval") String str3);

    @ll.e
    @o("bbs/app/comment/create")
    z<BBSCreateCommentResult<BBSFloorCommentObj>> V4(@t("h_src") String str, @j Map<String, String> map, @ll.c("link_id") String str2, @ll.c("text") String str3, @ll.c("root_id") String str4, @ll.c("reply_id") String str5, @ll.c("imgs") String str6, @ll.c("is_cy") String str7, @ll.c("recommend_state") String str8, @t("auth_code") String str9, @u Map<String, String> map2);

    @ll.f("bbs/app/profile/bbs/comment/list")
    z<BBSUserMsgResult<List<BBSUserMsgObj>>> V5(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("only_cy") String str2);

    @ll.e
    @o("bbs/app/profile/follow/user")
    z<Result> V6(@ll.c("following_id") String str, @ll.c("follows") String str2, @t("h_src") String str3);

    @ll.f("mall/change/address")
    z<Result> V7(@t("order_id") String str, @t(com.max.xiaoheihe.module.mall.i.M) String str2);

    @ll.e
    @o("mall/steam_purchase/upload")
    z<Result> V8(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("mall/trade/batch/send")
    z<Result<MallOrderInfoObj>> V9(@t("order_id") String str);

    @ll.f("game/game_developer_info/")
    z<Result<GameDeveloperObj>> Va(@t("dvpid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/bind_game_id/")
    z<Result<StateObj>> Vb(@t("game_id") String str, @t(ChannelsDetailActivity.V3) String str2, @t("code") String str3);

    @ll.f("bbs/app/api/static_resource")
    z<Result> W(@t("resource_version") String str);

    @ll.f("game/release_calendar/game_list/single_day")
    z<Result<CalendarGameGroupObj>> W0(@t("day_timestamp") String str, @u Map<String, String> map);

    @ll.e
    @o("mall/cart/order/register")
    z<Result<MallPurchaseResultObj>> W1(@ll.c("data") String str, @t("h_src") String str2, @t("is_grouping") boolean z10, @t(GameDetailFragment.S4) String str3, @t("grouping_purchase") boolean z11);

    @ll.f("bbs/app/profile/events")
    z<Result<ProfileEventResult>> W2(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("lastval") String str2, @t("no_banner") int i12);

    @ll.f("bbs/app/feeds")
    z<Result<ConceptFeedsResult>> W3(@t("pull") int i10, @t("use_history") String str, @t("lastval") String str2, @t("unexposed") String str3, @t("last_pull") String str4, @t("is_first") String str5, @t("search_recall") String str6, @t("refresh_type") String str7);

    @ll.f("bbs/app/comment/sub/comments")
    z<Result<BBSSubCommentsObj>> W4(@t(PostPageFactory.f81471g) String str, @t("lastval") String str2, @t("h_src") String str3);

    @ll.f("bbs/app/topic/sub/categories/v2")
    z<Result<BBSTopicSubTagResult>> W5(@t("topic_id") String str);

    @ll.f("mall/cart/order/send_to_pc")
    z<Result> W6(@t("kid") int i10);

    @ll.f("mall/activate/data/?key=addfreelicense_epic")
    z<Result<EpicAddFreeObj>> W7();

    @ll.f("bbs/notify/official_messages/list")
    z<Result<BBSOfficialMessagesObj>> W8(@t("sender_id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/hot_news/main_list")
    z<Result<BBSLinkListResultObj>> W9();

    @ll.e
    @o("account/get_pwd_sid/")
    z<Result> Wa(@ll.c("phone_num") String str, @t("code") String str2);

    @ll.e
    @o("game/mini_app/add")
    z<Result> Wb(@ll.c("mini_app_id") String str);

    @ll.e
    @o("account/login/")
    z<Result<User>> X(@ll.c("phone_num") String str, @ll.c("pwd") String str2);

    @ll.f("task/sign_v2/sign")
    z<Result> X0();

    @ll.f("game/get_feedback_reason")
    z<ForbidReasonResult<ForbidListObj>> X1(@u Map<String, String> map);

    @ll.f("mall/balance/order/progress")
    z<Result<MallBalanceOrderStateObj>> X2(@t("order_id") String str);

    @ll.f("mall/cart/order/cancel")
    z<Result> X3(@t("order_id") String str);

    @ll.f("heybox/open/user/authorize/login")
    z<Result<JsonObject>> X4(@t("appkey") String str);

    @ll.f("store/get_order_progress/")
    z<Result<GamePurchaseOrderProgressObj>> X5(@t("order_id") String str);

    @ll.e
    @o("bbs/app/profile/fav/folder/clean")
    z<Result> X6(@ll.c(FavourCollectionContentFragment.f83664o) String str, @t("enable_new_style_collect") Integer num);

    @ll.e
    @o("account/recommend/block/user/remove")
    z<Result> X7(@ll.c("user_id") String str);

    @ll.f("chat/get_message_list/")
    z<Result<MessageResultObj>> X8(@t("userid") String str, @t("newer") String str2, @t("older") String str3);

    @ll.e
    @o("bbs/app/api/link/view_limit")
    z<Result> X9(@ll.c("link_id") String str, @ll.c("view_limit") String str2);

    @ll.f("account/ad/get_overall_ad_info/")
    z<Result<OverallAdInfo>> Xa(@t("identification") String str);

    @ll.e
    @o("bbs/app/link/set/label")
    z<Result> Xb(@ll.c("link_id") String str, @ll.c("label_id") String str2);

    @ll.e
    @o("game/mobile/event_log")
    z<Result> Y(@ll.c("event_type") String str, @ll.c("appid") String str2, @ll.c("last_release_time") String str3);

    @ll.f("game/get_game_global_prices/v3")
    z<Result<GameGlobalPricesObj>> Y0(@t("appid") String str, @t(com.max.xiaoheihe.module.mall.i.G) String str2, @t("package_id") String str3);

    @ll.f("mall/steam_purchase/order/pay_url")
    z<Result<PayLinkObj>> Y1(@t("order_id") String str);

    @ll.f("game/epic/login")
    z<Result<EpicLoginParam>> Y3();

    @ll.f("bbs/app/hashtag/chosen_link/list")
    z<Result<BBSLinkListResultObj>> Y4(@t(HotNewsStyleActivity.R) int i10);

    @ll.e
    @o("chatroom/settings/update_account_setting")
    z<Result> Y5(@ll.c(x5.a.f141077v) String str, @ll.c("value") String str2);

    @ll.e
    @o("bbs/app/profile/follow/topic")
    z<Result> Y6(@ll.c("topic_id") String str);

    @ll.e
    @o("bbs/app/api/qcloud/cos/upload/info")
    z<Result<COSUploadInfoObj>> Y7(@ll.d Map<String, String> map);

    @ll.f("bbs/app/profile/forbid/history")
    z<Result<ForbidHistoryObj>> Y8(@t("userid") String str);

    @ll.f("account/invite_code/")
    z<Result> Y9(@t("code") String str);

    @ll.f("mall/quick_purchase/")
    z<Result<GamePurchaseResultObj>> Ya(@t("sku_id") String str);

    @ll.f("game/pubg/get_stats_detail/")
    z<Result<PUBGStatsDetailObj>> Yb(@t("nickname") String str, @t("season") String str2, @t("region") String str3, @t("fpp") String str4, @t("mode") String str5, @t("player_id") String str6);

    @ll.f("mall/trade/bargain/sku/detail")
    z<Result<TradeBargainDetailObj>> Z(@t("sku_id") String str);

    @ll.f("store/confirm_order/")
    z<Result> Z0(@t("order_id") String str);

    @ll.e
    @o("bbs/app/feedback/post/v2")
    z<Result> Z1(@ll.c("divice_info") String str, @ll.c("text") String str2, @ll.c("img_str") String str3, @ll.c("video_url") String str4, @ll.c("faq_id") String str5, @ll.c("faq_group_id") String str6, @ll.c("order_id") String str7, @ll.c("wiki_id") String str8, @ll.c("article_id") String str9, @ll.c("topic_id") String str10);

    @ll.f("bbs/app/link/moments")
    z<Result<BBSFollowedMomentObj>> Z2(@t(MallPurchaseDetailDialogFragment.f89680x1) String str, @t("userid") String str2, @t("content_type") String str3, @t("appid") String str4);

    @ll.f("infra/ip/location/info")
    z<Result<JsonObject>> Z4();

    @ll.f("heybox/open/user/is_certificated")
    z<Result> Z5(@t("for_mob") String str);

    @ll.f("mall/assign/keys/")
    z<Result<EncryptionParamsObj>> Z6(@t("order_id") String str);

    @ll.f("bbs/app/profile/achieve/list")
    z<Result<BBSAchieveResult>> Z7(@t("userid") String str, @t("only_event") String str2);

    @ll.f("mall/trade/purchase/supply/check")
    z<Result<TradeSupplyCheckResult>> Z8(@t("order_id") String str);

    @ll.f("bbs/app/user/message")
    z<BBSUserMsgResult<BBSUserMsgsObj>> Z9(@t("list_type") String str, @t("message_type") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("game/destiny2/upload_bg_info/")
    z<Result> Za(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.e
    @o("mall/steam/proxy/config")
    z<Result<ProxyListObj>> Zb(@ll.c("type") String str, @ll.c("url") String str2);

    @ll.e
    @o("account/unfollow_developer/")
    z<Result> a0(@ll.c("dvpid") String str);

    @ll.f("bbs/app/feedback/faq/input_prompt")
    z<Result<FeedbackPromptObj>> a1(@t("faq_id") String str);

    @ll.f("mall/cart/items")
    z<Result<CartDetailObj>> a2();

    @ll.f("game/ow/achievements/")
    z<Result<OWPlayerOverviewObj>> a3(@t("player_id") String str);

    @ll.e
    @o("bbs/app/api/post_editor/topic_selection/index")
    z<Result<TopicSelectionResultObj>> a4(@t("appids") String str, @t("is_new_style") String str2, @t("title") String str3, @ll.c("text") String str4);

    @ll.e
    @o("bbs/app/link/report")
    z<Result> a5(@ll.c("link_id") String str, @ll.c("report_reason") String str2, @ll.c("report_desc") String str3, @t("h_src") String str4);

    @ll.f("bbs/app/profile/follower/list")
    z<BBSFollowingResult> a6(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/profile/fav/folder/move")
    z<Result> a7(@ll.c(FavourCollectionContentFragment.f83664o) String str, @ll.c("link_id") String str2, @t("enable_new_style_collect") Integer num);

    @ll.f("account/binded_game_home")
    z<Result<BindGameDetailProtocolObj>> a8(@t(ChannelsDetailActivity.V3) String str, @t("userid") String str2, @t("player_id") String str3);

    @ll.e
    @o("mall/check_account/steam/upload")
    z<Result> a9(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("maxnews/topic/news/list")
    z<Result<SubjectDetailResultOjb>> aa(@t("id") String str, @t("news_type") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/material/material_link_list")
    retrofit2.b<Result<GameMaterialListObj>> ab(@t("topic_id") String str, @t("filter_key") String str2, @t("sort_key") String str3, @t("size_key") String str4, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/avatar/decoration/mall/purchase/params/")
    z<Result<MallAvatarDecorOptionsObj>> ac(@t("decoid") String str);

    @ll.f("pay/ali_trade_app_pay/")
    z<Result<PayOrderObj>> b(@t("currency") String str, @t(GameObj.KEY_POINT_PRICE) String str2);

    @ll.f("bbs/app/api/topic/index")
    z<Result<BBSTopicIndexObj>> b0(@t("type") String str, @t(BBSLinkObj.LIST_TYPE_MOMENT) String str2, @t(com.max.hbcache.c.f66127i0) String str3, @t("h_src") String str4, @t("is_new_style") String str5);

    @ll.f("mall/purchase/params/")
    z<Result<MallPurchaseParamsObj>> b1(@t("sku_id") String str, @t("h_src") String str2);

    @ll.f
    z<Result<LocalHtmlObj>> b2(@y String str, @t("local_html_version") String str2);

    @ll.e
    @o("bbs/app/link/delete")
    z<Result> b3(@ll.c("link_id") String str);

    @ll.e
    @o("bbs/app/api/qcloud/cos/upload/callback")
    z<Result<COSUploadInfoObj>> b4(@ll.c(Constants.PARAM_KEYS) String str, @ll.c("request_ids") String str2);

    @ll.f("game/material/recommend_material_links")
    z<Result<GameMaterialListObj>> b5(@t("link_id") String str);

    @ll.f("bbs/app/profile/post/limits")
    z<Result<UserPostLimitsObj>> b6(@u Map<String, String> map);

    @ll.f("bbs/app/link/ranking/list")
    z<Result<BBSLinkListResultObj>> b8();

    @ll.f("bbs/app/topic/max/feeds")
    z<Result<BbsRecommendObj>> b9(@t(w.c.R) int i10, @t("limit") int i11, @t("lastval") String str);

    @ll.e
    @o("account/get_phonenum_code/")
    z<Result> ba(@ll.c("phone_num") String str);

    @ll.e
    @o("chatroom/v1/account/heybox_edit_remarks")
    z<Result> bb(@ll.c("to_user_id") String str, @ll.c("remarks") String str2);

    @ll.f("app/client/hot_fix")
    z<Result<HotFixPatchResultObj>> c();

    @ll.f("game/dota2/player/match_list")
    z<Result<Dota2MatchListObj>> c0(@t("user_id") String str, @t("steam_id") String str2, @t(Dota2MatchDetailFragment.F) String str3, @t("limit") int i10, @u Map<String, String> map);

    @ll.f("task/sign_v3/sign")
    z<Result<SignInResultObj>> c1();

    @ll.f("bbs/app/link/steam/game/import_review?")
    z<Result> c2(@t("appid") String str);

    @ll.f("mall/trade/cancel_order")
    z<Result> c3(@t("order_id") String str);

    @ll.f("bbs/app/api/app_exposure/count/get")
    z<Result<PostExposureCountResult>> c4(@t("link_id") String str);

    @ll.e
    @o("bbs/app/api/video-link/post")
    z<Result<ResultVerifyInfoObj>> c5(@j Map<String, String> map, @t("auth_code") String str, @ll.c(PictureVideoEditPostFragment.Y3) String str2, @ll.d Map<String, String> map2);

    @ll.f(ad.c.f1235o)
    z<Result<AppClientStaticObj>> c6();

    @ll.f("mall/cart/del_cart")
    z<Result> c7(@t(com.max.xiaoheihe.module.mall.i.H) String str);

    @ll.f("mall/trade/sell/on_sale")
    z<Result<TradeSteamInventoryResult>> c8(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("store/auto_confirm_upload/")
    z<Result> c9(@t("order_id") String str);

    @ll.f("mall/balance/confirm/notify")
    z<Result> ca(@t("order_id") String str, @t("op") String str2);

    @ll.e
    @o("account/follow_game/")
    z<Result> cb(@ll.c(d0.f87248t) String str);

    @ll.e
    @o("bbs/notify/official_messages_v2/delete")
    z<Result> d(@ll.c(UserNotifyListActivity.O) String str, @ll.c("latest_msg_id") String str2);

    @ll.e
    @o("game/save_steam_bind_failed_reason")
    z<Result> d0(@ll.c("reason") String str);

    @ll.e
    @o("account/get_login_code/")
    z<Result<GetRegisterCodeObj>> d1(@ll.c("phone_num") String str);

    @ll.f("mall/sales/")
    z<Result<MallSalesObj>> d2();

    @ll.f("account/avatar/decoration/mall/purchase/check/")
    z<Result<MallPayInfoObj>> d3(@t("decoid") String str, @t("purchase_days") String str2);

    @ll.e
    @o("bbs/app/comment/delete")
    z<Result> d4(@ll.c("comment_id") String str, @u Map<String, String> map);

    @ll.f("bbs/app/api/topic/index")
    z<Result<BBSTopicIndexObj>> d5(@t("type") String str, @t(BBSLinkObj.LIST_TYPE_MOMENT) String str2, @t("is_post") String str3, @t(com.max.hbcache.c.f66127i0) String str4, @t("appids") String str5);

    @ll.f
    z<Resultx<SteamNativeListObj>> d6(@y String str);

    @ll.f("bbs/app/api/user/permission")
    z<Result<UserPermissionObj>> d7();

    @ll.f("bbs/app/feeds/news/visitor")
    z<Result<LinkListResultObj>> d8(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/get_push_state_v4")
    z<Result<PushStateGroupWrapperObjV4>> d9();

    @ll.f("account/unbind_game_id/")
    z<Result<Object>> da(@t(ChannelsDetailActivity.V3) String str);

    @ll.f("bbs/app/link/change/category")
    z<Result> db(@t("link_id") String str, @t("cate_id") String str2);

    @ll.f("bbs/app/comment/elect/as/hot")
    z<Result> e(@t("comment_id") String str);

    @ll.e
    @o("bbs/app/profile/achieve/settings")
    z<Result> e0(@ll.c("medal_id") String str, @ll.c("ope") String str2);

    @ll.e
    @o("bbs/app/link/set/recommend")
    z<Result> e1(@ll.c("link_id") String str, @ll.c(org.apache.tools.ant.taskdefs.optional.j2ee.c.f135155a) String str2);

    @ll.e
    @o("maxnews/app/init/favour")
    z<Result> e2(@ll.c(EpicAddFreeGamesV2Activity.f84073y1) String str, @ll.c("exclude_ids") String str2);

    @ll.f("bbs/app/profile/preference_v5/topic_list")
    z<Result<InterestProfileTopicResult>> e3(@t("group_keys") String str);

    @ll.f("game/get_publisher_games/")
    z<Result<GameListObj>> e4(@t(d0.f87248t) String str, @t("type") String str2, @t("name") String str3, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/profile/editor/settings")
    z<Result<ProfileEditorSettingsObj>> e5();

    @ll.f("game/search/")
    z<Result<GameListObj>> e6(@t("q") String str, @t("filter") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/owned_game/menu")
    z<Result<OwnGamePlatfObj>> e7();

    @ll.e
    @o("account/steam_api_key/update")
    z<Result<SteamApiStateObj>> e8(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("bbs/app/profile/recommend/following")
    z<Result<RecUsersResult>> e9(@t(com.max.hbsearch.l.W) String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("store/get_order_detail/")
    z<Result<GamePurchaseResultObj>> ea(@t("order_id") String str);

    @ll.e
    @o("account/change_account")
    z<Result> eb(@ll.c("account_id") String str, @ll.c("platform") String str2);

    @ll.f("bbs/app/profile/cancel/forbid")
    z<Result> f(@t("userid") String str);

    @ll.f("bbs/app/profile/following/list")
    z<BBSFollowingResult> f0(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/sku/replenish/notify")
    z<Result> f1(@t("state") String str, @t("sku_id") String str2);

    @ll.f("game/release_games/")
    z<Result<GameListObj>> f2(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/trade/check_order_state")
    z<Result<TradeOfferStateObj>> f3(@t("order_id") String str);

    @ll.f("bbs/app/profile/favour/list?type=link")
    z<Result<FavourLinksResult>> f4(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/api/app_exposure/ratio/set")
    z<Result> f5(@ll.c("ratio") String str, @ll.c("link_id") String str2);

    @ll.e
    @o("bbs/app/profile/follow/user/cancel")
    z<Result> f6(@ll.c("following_id") String str);

    @ll.f("mall/trade/purchase/receive")
    z<Result<TradeSteamInventoryResult>> f7(@t("q") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("mall/trade/sell/get_quick_price")
    z<Result<TradeQuickPriceResult>> f8(@ll.c("data") String str);

    @ll.f("bbs/app/topic/feeds/news")
    z<Result<ConceptFeedsResult>> f9(@t("topic_id") String str, @u Map<String, String> map, @t("lastval") String str2);

    @ll.f("mall/trade/home")
    z<Result<MallTradeHomeObj>> fa();

    @ll.f("account/bind_game_id/")
    z<Result<StateObj>> fb(@t("game_id") String str, @t(ChannelsDetailActivity.V3) String str2);

    @ll.e
    @o("account/personal_profile/avatar/update/")
    z<Result> g(@ll.c(com.max.xiaoheihe.module.upload.g.f93525b) String str);

    @ll.f("account/third_login/steam/get_authorize_url")
    z<Result<BindSteamUrlResult>> g0(@t(ChannelsDetailActivity.V3) String str, @t("bs_version") String str2);

    @ll.e
    @o("account/verify_phonenum_code/")
    z<Result> g1(@ll.c("phone_num") String str, @t("code") String str2);

    @ll.f("app/client/query_package_list")
    z<Result<QueryPackageListObj>> g2();

    @ll.f("game/dota2/player/overview")
    z<Result<GameOverviewListObj>> g3(@t("user_id") String str, @t("steam_id") String str2, @u Map<String, String> map);

    @ll.f("store/hosts_to_ip/")
    z<Result<SteamWalletJsObj>> g4();

    @ll.f("bbs/app/profile/favour/list?type=wiki")
    z<Result<FavourWikiResult>> g5(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("mall/report/assign/state/")
    z<Result> g6(@t("order_id") String str, @ll.c("data") String str2, @ll.c("key") String str3, @ll.c("sid") String str4, @t("time_") String str5);

    @ll.f("game/mini_app/menu_info")
    z<Result<MiniProgramMenuInfoObj>> g7(@t("mini_app_id") String str);

    @ll.f("bbs/app/api/original/image")
    z<Result<ImageOriginalInfoObj>> g8(@t("url") String str);

    @ll.f("game/dota2/match_detail")
    z<Result<Dota2MatchDetailObj>> g9(@t(Dota2MatchDetailFragment.F) String str, @t("user_id") String str2, @t("steam_id") String str3);

    @ll.f("game/impression/detail")
    z<Result<VoteQuestionListObj>> ga(@t("appid") String str);

    @ll.f("chatroom/settings/get_account_settings")
    z<Result<OnlineStateSettingResultObj>> gb();

    @ll.f("mall/trade/update_order_to")
    z<Result> h(@t("toid") String str);

    @ll.f("bbs/app/topic/related/topics")
    z<Result<TopicListObj>> h1(@t("topic_ids") String str);

    @ll.f("bbs/app/search")
    z<Result<SearchLinkResult>> h2(@t("q") String str, @t("topic_id") String str2, @t("filter") String str3, @t("sort_filter") String str4, @u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/api/post_editor/topic_selection/related_hashtag")
    z<Result<TopicSelectionResultObj>> h3(@t("topic_ids") String str, @t("title") String str2, @ll.c("text") String str3);

    @ll.f("game/game_compilation/")
    z<Result<List<GameListHeaderObj>>> h4(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/csgo/b5/get_player_leaderboards/")
    z<Result<PlayerLeaderboardsObj>> h5(@u Map<String, String> map);

    @ll.f("mall/newcomer/receive_coupon")
    z<Result<NewcomerCouponReceiveResult>> h6();

    @ll.f("mall/activate/data/")
    z<Result<SteamWalletJsObj>> h7(@t("key") String str);

    @ll.f("bbs/app/topic/search")
    z<Result<TopicsSearchResult>> h8(@t("q") String str);

    @ll.f("bbs/notify/developer_messages")
    z<Result<List<BBSUserNotifyObj>>> h9(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("game/steam/upload")
    z<Result> ha(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("chatroom/friend/get_user_friend_list_without_room")
    z<Result<HeyboxFriendListObj>> hb();

    @ll.f("game/remove_game_tag/")
    z<Result> i(@t("appid") String str, @t("tag_id") String str2);

    @ll.f("mall/search/")
    z<Result<MallProductsObj>> i0(@t("q") String str, @t(w.c.R) int i10, @t("limit") int i11, @t(com.max.hbsearch.l.W) String str2);

    @ll.f("mall/trade/purchase/supply/orders")
    z<Result<TradePurchaseResult>> i1(@t("filter") String str, @t("q") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/pubg/get_player_matches/")
    z<Result<PUBGMatchListObj>> i2(@t("nickname") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("season") String str2, @t("region") String str3, @t("fpp") String str4, @t("mode") String str5, @t("player_id") String str6);

    @ll.f("pay/order/extra_info")
    z<Result<MallPayExtraInfo>> i3(@t("order_id") String str);

    @ll.e
    @o("game/send_feedback")
    z<Result> i4(@ll.c("appid") String str, @ll.c("name") String str2, @ll.c("report_reason") String str3, @ll.c("report_desc") String str4);

    @ll.f("account/info/")
    z<Result<HomeDataObj>> i5();

    @ll.f("store/get_roll_room_joined_users/")
    z<Result<BBSUserListObj>> i6(@t("room_id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/get_game_prices/history")
    z<Result<PriceHistoryResult>> i7(@t("appid") String str, @t(com.max.xiaoheihe.module.mall.i.G) String str2, @t("region") String str3, @t("days") String str4);

    @ll.f("bbs/app/profile/user/profile")
    z<Result<UserProfileResultObj>> i8(@t("userid") String str);

    @ll.f("store/hosts_to_ip/")
    z<Result<ProxyParamsObj>> i9(@t("url") String str);

    @ll.f("mall/trade/list")
    z<Result<TradeSteamInventoryResult>> ia(@t("page") String str, @t("include_filter") String str2, @u Map<String, String> map, @t("sort_type") String str3, @t(GameObj.KEY_POINT_PRICE) String str4, @t("q") String str5, @t("lastval") String str6, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("/task/list_v2/")
    z<Result<TaskResultObj>> ib();

    @ll.f("bbs/app/comment/pull/down/from/hot")
    z<Result> j(@t("comment_id") String str);

    @ll.f("mall/cart/order/detail")
    z<Result<MallCartOrderDetailObj>> j0(@t("order_id") String str);

    @ll.f("game/switch/jp/games/data")
    z<Result<MyGameListObj>> j2(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("sort") String str2, @t("request_source") String str3, @t("q") String str4);

    @ll.e
    @o("mall/trade/steam_upload")
    z<Result> j3(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("store/purchase_game_v3/")
    z<Result<GamePurchaseResultObj>> j4(@t("order_id") String str, @u Map<String, String> map, @t("coin") String str2);

    @ll.e
    @o("game/mini_app/remove")
    z<Result> j5(@ll.c("mini_app_id") String str);

    @ll.f("mall/final/price/")
    z<Result<MallPriceObj>> j6(@t("order_id") String str, @t("coupon_id") String str2, @t("purchase_code") String str3, @t("deduct_coin") String str4, @u Map<String, String> map);

    @ll.f("account/following_list/")
    z<Result<FollowingListObj>> j7(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("account/get_async_js")
    z<Result<JsListObj>> j8();

    @ll.f("game/pubg/get_player_overview/")
    z<Result<PUBGPlayerOverviewObj>> j9(@t("player_id") String str, @t("user_id") String str2, @t("region") String str3, @t("season") String str4, @t("fpp") String str5);

    @ll.f("store/refuse_order/")
    z<Result> ja(@t("order_id") String str);

    @ll.f("account/unbind_game_id/")
    z<Result<Object>> jb(@t(ChannelsDetailActivity.V3) String str, @t("account_id") String str2);

    @ll.e
    @o("account/show_console_game_first")
    z<Result> k(@ll.c("show_console_game_first") String str);

    @ll.f("chat/del_message/")
    z<Result<StrangerMsgStateObj>> k0(@t("userid") String str);

    @ll.f("mall/trade/wechat/data")
    z<Result<TradeWechatDataObj>> k1();

    @ll.f("game/release_calendar/game_count")
    z<Result<CalendarGameCountObj>> k2(@u Map<String, String> map);

    @ll.f("chatroom/v2/account/ws_id")
    z<Result> k3();

    @ll.e
    @o("account/privacy/recommend/switch/set")
    z<Result> k4(@ll.c("state") String str);

    @ll.f("task/sign_list/")
    z<Result<SignListResultObj>> k5();

    @ll.e
    @o("chatroom/v2/msg/user")
    z<Result> k6(@t("to_user_id") String str, @ll.c("msg") String str2, @ll.c(SendToFriendActivity.R) String str3);

    @ll.f("mall/trade/update_trade_state")
    z<Result<KeyDescObj>> k7();

    @ll.f("game/dota2/player/hero_list")
    z<Result<Dota2HeroListObj>> k8(@t("user_id") String str, @t("steam_id") String str2, @t("order_by") String str3);

    @ll.f("account/cleared_game_list")
    z<Result<MyGameListObj>> k9(@t("userid") String str, @t("platform") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/hashtag/link/list")
    z<Result<HashtagLinkListResultObj>> ka(@t(com.max.hbsearch.l.f72324c0) String str, @t("hashtag_name") String str2, @t("sort_filter") String str3, @t("lastval") String str4, @t(w.c.R) int i10, @t("limit") int i11, @t("quick_from") String str5, @u Map<String, String> map, @t("is_first") int i12);

    @ll.f("game/material/home")
    retrofit2.b<Result<GameMaterialObj>> kb(@t("topic_id") String str);

    @ll.f("bbs/app/api/at/recent")
    z<Result<BBSLinkSubObj>> l();

    @ll.f("mall/balance/purchase/recheck")
    z<Result> l0();

    @ll.f("mall/trade/tips_states")
    z<Result<TradeTipsStateObj>> l1();

    @ll.f("account/set_push_state/")
    z<Result> l2(@t("push_type") String str, @t("state") String str2);

    @ll.f("store/get_all_active_roll_room/")
    z<Result<RollGameListObj>> l3(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/link/boutique/apply")
    z<Result> l4(@t("link_id") String str);

    @ll.e
    @o("bbs/app/post_card/record")
    z<Result> l5(@ll.c("card_type") String str, @ll.c("ope_type") String str2);

    @ll.f("task/replenish_sign_coin/")
    z<Result> l6(@t(Progress.L) String str);

    @ll.f("account/get_auth_info/")
    z<Result<List<AuthInfoObj>>> l7();

    @ll.f("game/unsubscribe_game/")
    z<Result> l8(@t("appid") String str);

    @ll.e
    @o("account/register/")
    z<Result<User>> l9(@ll.c("phone_num") String str, @ll.c("pwd") String str2, @t("sid") String str3, @t("referrer") String str4);

    @ll.e
    @o("bbs/app/api/link/post")
    z<Result<ResultVerifyInfoObj>> la(@j Map<String, String> map, @ll.c("title") String str, @ll.c("text") String str2, @ll.c("game_impression") String str3, @ll.c(GameCommentSuccessActivity.W) int i10, @ll.c("link_tag") String str4, @ll.c("post_type") String str5, @ll.c("parent_id") String str6, @ll.c("topic_ids") String str7, @ll.c("cate_id") String str8, @ll.c("edit") String str9, @ll.c("link_id") String str10, @ll.c("appid") String str11, @ll.c(GameObj.KEY_POINT_SCORE) String str12, @t("auth_code") String str13, @ll.c("tags") String str14, @ll.c("multidimensional_score_map") String str15);

    @ll.f("game/ow/hero_list/")
    z<Result<OWPlayerOverviewObj>> lb(@t("player_id") String str, @t("season") String str2);

    @ll.f("account/avatar/decoration/mall/purchase/pay/")
    z<Result> m(@t("orderid") String str, @t(com.umeng.analytics.pro.d.aw) String str2);

    @ll.f("game/edit_game_tag/")
    z<Result> m0(@t("appid") String str, @t("tags") String str2);

    @ll.e
    @o("bbs/notify/official_messages/delete")
    z<Result> m1(@ll.c("sender_id") String str);

    @ll.e
    @o("bbs/app/api/concept-link/post")
    z<Result<ResultVerifyInfoObj>> m2(@j Map<String, String> map, @t("auth_code") String str, @ll.c(PictureVideoEditPostFragment.Y3) String str2, @ll.d Map<String, String> map2);

    @ll.f("account/setting/show_friend_code/")
    z<Result> m3(@t("show") String str);

    @ll.e
    @o("bbs/app/api/link/sync_steam")
    z<Result<UserPostLimitsObj>> m4(@ll.c("link_id") String str, @ll.c("type") String str2, @ll.c("from") String str3);

    @ll.e
    @o("bbs/app/profile/follow/user/cancel")
    z<Result> m5(@ll.c("following_id") String str, @t("h_src") String str2);

    @ll.f("account/avatar/decoration/mall/")
    z<Result<AvatarDecorCategoriesObj>> m6(@t("key") String str);

    @ll.f("game/all_recommend/v2")
    z<Result<GameRecommendV2Result>> m7(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/trade/get_bind_failed_info")
    z<Result<BindFailedInfoObj>> m8();

    @ll.f("bbs/app/link/steam/game/ignore_review")
    z<Result> m9(@t("appid") String str);

    @ll.e
    @o("account/avatar/decoration/wearing")
    z<Result> mb(@ll.c("decoration_id") String str);

    @ll.f("store/purchase_code/")
    z<Result<KeyDescObj>> n0(@t("appid") String str, @t("purchase_code") String str2, @u Map<String, String> map);

    @ll.e
    @o("bbs/app/link/set/special_type")
    z<Result<ResultObj>> n1(@ll.c("link_id") String str, @ll.c("special_type") String str2, @ll.c(GameCenterActivity.S) String str3);

    @ll.f("mall/newcomer/receive_lucky")
    z<Result<FreshmanDiscountObj>> n2(@t("appid") String str);

    @ll.f("account/bind/_dev/quick_bind")
    z<Result> n3(@t(ChannelsDetailActivity.V3) String str);

    @ll.f("game/get_hot_game_tag/")
    z<Result<GameTagsObj>> n4(@t("appid") String str);

    @ll.e
    @o("bbs/app/profile/follow/topic/cancel")
    z<Result> n5(@ll.c("topic_id") String str);

    @ll.f("bbs/app/profile/forbid")
    z<Result> n6(@t("userid") String str, @t("forbid_reason") String str2, @t("forbid_time") String str3, @t("forbid_type") String str4, @t("forbid_obj_id") String str5, @t("forbid_obj_type") String str6, @t("comment") String str7);

    @ll.e
    @o("account/unbind_wechat_account/")
    z<Result> n7(@ll.c("wechat_id") String str);

    @ll.f("account/user_group")
    z<Result<UserGroupInfo>> n8();

    @ll.f("bbs/app/profile/fav/tab_list")
    z<Result<CollectionFavTabList>> n9();

    @ll.f("pay/withdraw/ali_certify/get_url")
    z<Result<AliCertifyResult>> na(@t("biz_code") String str, @t("goto_certify_manager") boolean z10, @u Map<String, Object> map);

    @ll.f("game/subscribe_game/")
    z<Result> nb(@t("appid") String str, @t("phonenum") String str2);

    @ll.f("account/tips_state/")
    z<Result<TipsStateObj>> o();

    @ll.f("game/link/card_data")
    z<Result<ToolCardResultObj>> o0(@t(PictureVideoEditPostFragment.f82341j4) String str);

    @ll.f("mall/trade/sell/pay")
    z<Result<MallOrderDetailObj>> o1(@t("order_id") String str, @t("out_order_id") String str2, @t("pay_type") String str3);

    @ll.f("game/xbox/v2/friend_list")
    z<Result<XboxFriendInfoWrapper>> o2(@t("xuid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("account/resolve_clipboard/")
    z<Result<ProtocalResultObj>> o3(@ll.c("content") String str);

    @ll.f("game/mobile/bundles/all/")
    z<Result<GameMobileBundlesCategoryObj>> o4(@t("sort_type") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/member/bulletin/callback")
    z<Result> o5();

    @ll.f("mall/trade/bargain/order/accept")
    z<Result<MallOrderInfoObj>> o6(@t("order_id") String str);

    @ll.f("account/setting/game_card/")
    z<Result> o7(@t("game") String str, @t("show") String str2);

    @ll.f("chatroom/account/search_user")
    z<Result<HeyboxFriendListObj>> o8(@t("q") String str);

    @ll.f("mall/trade/sell/check/pay")
    z<Result<MallPayInfoObj>> o9(@t("order_id") String str, @t("coin") String str2);

    @ll.f("account/check_white_url/")
    z<Result<WebUrlCheckResult>> oa(@t("url") String str);

    @ll.f("bbs/app/api/notify/alert")
    z<Result<TimestampResultObj>> ob();

    @ll.e
    @o("bbs/app/comment/image/delete")
    z<Result> p(@ll.c("comment_id") String str);

    @ll.f("game/pubg/get_player_share_matches/")
    z<Result<PUBGMatchListObj>> p0(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/feeds/search_recall")
    z<Result<RecallFeedsResult>> p1();

    @ll.f("account/personal_profile/pay_without_pwd/update/")
    z<Result> p2(@t("op") String str);

    @ll.e
    @o("account/personal_profile/pay_password/verify/")
    z<Result> p3(@ll.c("pwd") String str);

    @ll.f("game/get_game_playtime_detail")
    z<Result<GameDurationObj>> p4(@t("appid") String str);

    @ll.f("bbs/app/topic/menu")
    z<Result<BBSTopicMenusObj>> p5(@t("user_id") String str, @t("topic_id") String str2, @t("appid") String str3, @t("h_src") String str4);

    @ll.f("game/dota2/player/teammates")
    z<Result<Dota2TeammateListObj>> p7(@t("user_id") String str, @t("steam_id") String str2, @t("order_by") String str3, @t("teammate") boolean z10);

    @ll.e
    @o("bbs/app/comment/support")
    z<Result> p8(@t("h_src") String str, @ll.c("comment_id") String str2, @ll.c("support_type") String str3, @u Map<String, String> map);

    @ll.f("game/ow/search/")
    z<Result<PlayerListObj>> p9(@t("q") String str);

    @ll.e
    @o("account/recommend/block/user/add")
    z<Result> pa(@ll.c("user_id") String str);

    @ll.f("mall/gift/friends/confirm")
    z<Result> pb();

    @ll.f("/mall/cart/order/show_cdkeys")
    z<Result> q(@t("order_id") String str);

    @ll.f("mall/trade/purchase/pull_off")
    z<Result> q0(@t("pcs_id") String str);

    @ll.f("game/dota2/player/hero_overview")
    z<Result<GameOverviewListObj>> q1(@t("hero_id") String str, @t("user_id") String str2, @t("steam_id") String str3, @t(Dota2MatchDetailFragment.F) String str4, @t(Dota2HeroTitleView.f87119l) String str5, @t("count") String str6, @u Map<String, String> map);

    @ll.f("account/add_to_cart/push_state")
    z<Result<PushStateObj>> q2();

    @ll.f("task/clean_sign")
    z<Result> q3();

    @ll.f("mall/trade/update_state")
    z<Result<UpdateObj>> q4();

    @ll.f("bbs/app/link/author_info")
    z<Result<AuthorInfoObj>> q5(@t("user_id") String str, @t("link_id") String str2, @t("comment_id") String str3);

    @ll.e
    @o("account/mobile_upload_log/")
    z<Result> q6(@ll.c("log_url") String str);

    @ll.f("bbs/app/api/get/forbid_reason")
    z<ForbidReasonResult<List<String>>> q7(@t("object_type") String str, @t("link_id") String str2, @t("userid") String str3);

    @ll.f("game/pubg/search/")
    z<Result<PUBGSearchObj>> q8(@t("q") String str);

    @ll.f("pay/withdraw/ali_certify/get_info")
    z<Result<VerifyInfoObj>> q9();

    @ll.f("mall/trade/purchase/put_on")
    z<Result<MallOrderInfoObj>> qa(@t("spu_id") String str, @t(GameObj.KEY_POINT_PRICE) String str2, @t("count") String str3);

    @ll.e
    @o("bbs/app/profile/modify/forbid/info")
    z<Result> qb(@ll.c("link_id") String str, @ll.c("comment") String str2, @ll.c("forbid_reason") String str3);

    @ll.f("store/set_roll_room_desc_valid/")
    z<Result> r(@t("room_id") String str);

    @ll.f("game/get_game_global_prices/v2")
    z<Result<GameGlobalPricesObj>> r0(@t("appid") String str, @t(com.max.xiaoheihe.module.mall.i.G) String str2);

    @ll.f("bbs/app/hashtag/concept/feeds")
    z<Result<BBSTopicLinksObj>> r1(@t("topic_id") String str, @t("hashtag_name") String str2, @u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11, @t("lastval") String str3);

    @ll.f("game/owned_game/hot_list")
    z<Result<SearchGameListObj>> r2(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/link/favour")
    z<Result> r3(@t("h_src") String str, @ll.c("link_id") String str2, @ll.c("newsid") String str3, @ll.c("favour_type") String str4, @u Map<String, String> map);

    @ll.f("game/pubg/get_player_friends_v2/")
    z<Result<PUBGRankResultObj>> r4(@t(w.c.R) int i10, @t("limit") int i11, @t("nickname") String str, @t("season") String str2, @t("mode") String str3, @t("region") String str4, @t(PUBGFriendRankActivity.Y) String str5, @t("player_id") String str6);

    @ll.f("account/bind_game_state/")
    z<Result<StateObj>> r5(@t("game_id") String str, @t(ChannelsDetailActivity.V3) String str2, @t("server_id") String str3);

    @ll.f("mall/trade/sku/unfollow")
    z<Result> r6(@t("sku_id") String str);

    @ll.f("account/heybox_home_v2/")
    z<Result<HomeDataObj>> r7(@t("userid") String str);

    @ll.f("store/check_buy_game_condition/")
    z<Result<GamePurchaseConditionObj>> r8(@t("appid") String str, @u Map<String, String> map);

    @ll.e
    @o("store/join_roll_room/")
    z<Result> r9(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("game/epic/game_info")
    z<Result<EpicDetailInfo>> ra(@t("user_id") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("account/modify_pwd_with_old_pwd/")
    z<Result> rb(@ll.c("old_pwd") String str, @ll.c("pwd") String str2);

    @ll.f("bbs/app/link/tree")
    z<Result<BBSLinkTreeObj>> s(@t("h_src") String str, @t("link_id") String str2, @t("page") String str3, @t("limit") String str4, @t("is_first") String str5, @t("sort_filter") String str6, @t("owner_only") String str7, @t("hide_cy") String str8, @t("check_commented") String str9, @u Map<String, String> map);

    @ll.f("mall/steam_purchase/cancel_order")
    z<Result> s0(@t("order_id") String str);

    @ll.f("store/purchase_share/")
    z<Result<GamePurchaseResultObj>> s1(@t("order_id") String str);

    @ll.e
    @o("game/jsdata")
    z<Result<BaseProxyParamObj>> s2(@t("key") String str, @ll.d Map<String, Object> map);

    @ll.f("mall/assign/prepare/")
    z<Result<StateObj>> s3(@t("order_id") String str);

    @ll.e
    @o("bbs/app/link/game/comment/up")
    z<Result> s4(@ll.c("link_id") String str, @ll.c("support_type") String str2, @ll.c("h_src") String str3, @ll.c("tagid") String str4);

    @ll.e
    @o("bbs/app/link/remove/img")
    z<Result> s5(@ll.c("link_id") String str, @ll.c("img_url") String str2);

    @ll.f("account/game_list/")
    z<Result<MyGameListObj>> s6(@t("userid") String str, @t("steam_id") String str2, @t(w.c.R) int i10, @t("limit") int i11, @t("sort") String str3);

    @ll.f("mall/trade/bargain/order/cancel")
    z<Result> s7(@t("order_id") String str);

    @ll.f("bbs/app/profile/fav/folder/links")
    z<Result<CollectionFolderDetailObj>> s8(@t(FavourCollectionContentFragment.f83664o) String str, @t(w.c.R) Integer num, @t("limit") Integer num2, @t("recent") String str2);

    @ll.f("game/steam/wishlist/refresh")
    z<Result> s9(@t("appid") String str);

    @ll.e
    @o("bbs/app/api/recommend/feedback")
    z<Result> sa(@ll.c("userid") String str, @t("h_src") String str2);

    @ll.f("game/console/switch/cassette/price_history")
    z<Result<ConsoleCattessePriceHistoryObj>> sb(@t("appid") String str);

    @ll.f("game/dota2/player/related_list")
    z<Result<Dota2TeammateListObj>> t(@t("user_id") String str, @t("steam_id") String str2, @t(w.c.R) int i10, @t("limit") int i11, @t("type") String str3);

    @ll.f("account/get_bind_url/")
    z<Result<BindGameParamsObj>> t0(@t(ChannelsDetailActivity.V3) String str);

    @ll.f("game/all_recommend/games/")
    z<Result<AllRecommendGameCategoryObj>> t1(@t("show_type") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/sku_info/")
    z<Result<MallSkuObj>> t2(@t("sku_id") String str);

    @ll.f("bbs/app/topic/feeds")
    z<Result<BBSTopicLinksObj>> t3(@t("topic_id") String str, @u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11, @t("lastval") String str2);

    @ll.f("account/bind_game_state/")
    z<Result<StateObj>> t4(@t("game_id") String str, @t(ChannelsDetailActivity.V3) String str2, @t("server_id") String str3, @u Map<String, String> map);

    @ll.f("chat/user_message_setting/")
    z<Result<StrangerMsgStateObj>> t5(@t("userid") String str);

    @ll.f("mall/trade/web/sale_skus")
    z<Result<TradeSteamInventoryResult>> t6(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/trade/order_detail")
    z<Result<MallOrderDetailObj>> t7(@t("order_id") String str);

    @ll.f("store/cancel_order/")
    z<Result> t8(@t("order_id") String str);

    @ll.f("mall/trade/steam_params")
    z<Result<TradeSteamParams>> t9(@t("key") String str);

    @ll.e
    @o("bbs/app/api/article_collection/create_or_update")
    z<Result<JsonObject>> ta(@ll.c(SocialConstants.PARAM_APP_DESC) String str, @ll.c("title") String str2, @ll.c("image_url") String str3);

    @ll.f("mall/trade/bargain/check/pay")
    z<Result<MallPayInfoObj>> tb(@t("sku_id") String str, @t("current_price") String str2, @t("pay_price") String str3);

    @ll.f("mall/trade/sale/settings")
    z<Result<TradeSaleSettingsObj>> u();

    @ll.f("game/console/get_game_prices/")
    z<Result<GamePlatformPriceObj>> u0(@t("appid") String str, @u Map<String, String> map);

    @ll.f("bbs/app/api/delete/user/posts")
    z<ForbidReasonResult<List<String>>> u1(@t("userid") String str);

    @ll.f("game/mobile/get_collection_game_list")
    z<Result<GameObj>> u2(@t(w.c.R) int i10, @t("limit") int i11, @t("collection_id") String str);

    @ll.f("account/get_ads_info_v2")
    z<Result<AdsInfosObj>> u3();

    @ll.f("bbs/app/feeds/banner")
    z<Result<BBSTopicBannerResult>> u4();

    @ll.e
    @o("bbs/app/profile/report")
    z<Result> u6(@ll.c("userid") String str, @ll.c("report_reason") String str2, @ll.c("report_desc") String str3);

    @ll.f("mall/balance/purchase/prepare")
    z<Result<MallPrepareStateObj>> u8();

    @ll.f("mall/order/cashier/pay/price")
    z<Result<PayPriceResultObj>> u9(@t("sku_id") String str, @t("cat_value") String str2, @t("item_num") int i10, @t("coupon_id") String str3, @t("deduct_coin") long j10, @t("is_grouping") boolean z10, @t(GameDetailFragment.S4) String str4, @t("grouping_purchase") boolean z11);

    @ll.e
    @o("account/replace_bind_phonenum/")
    z<Result> ua(@ll.c("phone_num_new") String str, @ll.c("phone_num") String str2, @t("sid") String str3, @t("sid_new") String str4);

    @ll.e
    @o("game/epic/save_free_package_pick_up_failed_reason")
    z<Result> ub(@ll.c("reason") String str);

    @ll.f("bbs/app/profile/fav/folders")
    z<Result<CollectionFolders>> v(@t("enable_new_style_collect") Integer num);

    @ll.e
    @o("mall/trade/order_skus/update")
    z<Result> v0(@ll.c("data") String str);

    @ll.f("mall/steam_purchase/prepare")
    z<Result<MallPrepareStateObj>> v1(@t("cost_coin") String str, @t("package_id") String str2);

    @ll.e
    @o("mall/trade/bargain/order/decline")
    z<Result<MallOrderInfoObj>> v2(@ll.c("order_id") String str, @ll.c("bargain_enable") String str2, @ll.c("sku_id") String str3);

    @ll.f("game/ow/leaderboards/")
    z<Result<PlayerLeaderboardsObj>> v3(@u Map<String, String> map);

    @ll.f("bbs/app/link/game/comment/mine")
    z<Result<GameCommentResultObj>> v4(@t("appid") String str);

    @ll.f("account/get_white_hostnames/")
    z<Result<WhiteHostnamesResult>> v5(@t("white_hostnames_version") String str);

    @ll.e
    @o("rc/box_data/callback")
    z<Result> v6(@ll.c("box_data") String str);

    @ll.f("fast_test/get_demand_list")
    z<Result<FastTestDemandResult>> v7();

    @ll.e
    @o("mall/cart/order/register")
    z<Result<MallPurchaseResultObj>> v8(@ll.c("data") String str, @t("h_src") String str2);

    @ll.f("bbs/app/hashtag/template/src/detail")
    z<Result<KeyDescObj>> v9(@t(com.max.hbsearch.l.W) String str);

    @ll.f("game/dota2/player/career_record")
    z<Result<Dota2MatchListObj>> va(@t("user_id") String str, @t("steam_id") String str2, @u Map<String, String> map);

    @ll.e
    @o("account/modify_pwd_with_code/")
    z<Result> vb(@ll.c("phone_num") String str, @ll.c("pwd") String str2, @t("sid") String str3);

    @ll.f("bbs/app/link/steam/game/user_review")
    z<Result<SteamReviewInfo>> w(@t("appid") String str);

    @ll.f("account/web/package/fetch/v2")
    z<Result<WebPackageResultObj>> w0(@t("key") String str);

    @ll.f("wiki/search_wiki/")
    z<Result<SearchWikiListObj>> w1(@t("query") String str, @t("wiki_id") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.e
    @o("bbs/app/hot_news/remove_from_hot_news")
    z<Result> w2(@ll.c("link_id") String str);

    @ll.f("chatroom/friend/get_recommend_friends")
    z<Result<HeyboxFriendListObj>> w3(@t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/profile/subscribed/events")
    z<Result<BBSFollowedMomentsObj>> w4(@t(w.c.R) int i10, @t("limit") int i11, @t("lastval") String str, @u Map<String, String> map);

    @ll.f("game/pubg/get_player_leaderboards/")
    z<Result<PlayerLeaderboardsObj>> w6(@u Map<String, String> map);

    @ll.f("game/get_game_list_v3/")
    z<Result<GameListObj>> w7(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/profile/events/search")
    z<Result<ProfileEventResult>> w8(@t("search_heybox_id") String str, @t("query") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/cancel/orders/")
    z<Result> w9(@t("order_id") String str);

    @ll.e
    @o("account/bind_wechat_account/")
    z<Result> wa(@ll.d Map<String, String> map);

    @ll.f("mall/trade/sell/pay")
    z<Result<MallOrderDetailObj>> wb(@t("order_id") String str, @t("pay_type") String str2, @t(GameObj.KEY_POINT_PRICE) String str3, @t("count") String str4, @t("spu_id") String str5);

    @ll.e
    @o("bbs/app/comment/top/del")
    z<Result> x(@ll.c("comment_id") String str);

    @ll.e
    @o("bbs/app/profile/preference_v5/set_fav_options")
    z<Result> x0(@ll.c(EpicAddFreeGamesV2Activity.f84073y1) String str, @ll.c("type") String str2);

    @ll.e
    @o("game/ow/upload_data/")
    z<Result> x1(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.e
    @o("account/bind_phonenum/")
    z<Result> x2(@ll.c("phone_num") String str, @ll.c("pwd") String str2, @t("sid") String str3);

    @ll.e
    @o("account/unfollow_game/")
    z<Result> x3(@ll.c(d0.f87248t) String str);

    @ll.f("game/get_game_infos/")
    z<Result<GamesInfoResultObj>> x4(@t("appids") String str, @t("from") String str2);

    @ll.f("account/logout")
    z<Result> x5();

    @ll.f("game/apex/get_player_leaderboards/")
    z<Result<PlayerLeaderboardsObj>> x6(@u Map<String, String> map);

    @ll.f("account/recommend/block/list")
    z<Result<BlockListObj>> x7();

    @ll.f("account/game_infos")
    z<Result<BindGameInfosObj>> x9();

    @ll.f("mall/trade/orders")
    z<Result<TradeSteamInventoryResult>> xa(@t("filter") String str, @t("q") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("game/multidimensional_score/dimension_list")
    z<Result<MultiDimensionListResult>> xb(@t("appid") String str);

    @ll.f("game/csgo/get_player_leaderboards")
    z<Result<PlayerLeaderboardsObj>> y(@u Map<String, String> map);

    @ll.e
    @o("bbs/app/link/put-to-bottom")
    z<Result> y0(@ll.c("link_id") String str);

    @ll.f("mall/trade/follows")
    z<Result<TradeSteamInventoryResult>> y1(@t("filter") String str, @t("q") String str2);

    @ll.f("store/present_coupon/")
    z<Result> y2(@t("userid") String str, @t("coupon_id") String str2);

    @ll.f("bbs/app/topic/list_infos")
    z<Result<TopicListInfoObj>> y3(@t("topic_ids") String str);

    @ll.f("mall/trade/batch/buy")
    z<Result<TradeBatchBuyResult>> y4(@t("order_id") String str);

    @ll.f("account/public_steam_settings/")
    z<Result<SteamPublicSettingObj>> y5();

    @ll.f("bbs/app/link/related/recommend")
    z<Result<BBSLinkListResultObj>> y6(@t("link_id") String str, @t("h_src") String str2);

    @ll.e
    @o("chatroom/friend/user_add_friend")
    z<Result> y7(@ll.c("friend_id") String str);

    @ll.f("mall/order/cashier/available")
    z<Result<UseBuyPurchaseDialogObj>> y8(@t("appid") String str, @t("sku_id") String str2);

    @ll.f("mall/trade/search")
    z<Result<TradeSteamInventoryResult>> y9(@t("q") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("store/auto_register_cdkey/")
    z<Result<AutoAcceptGameParamsObj>> ya(@t("order_id") String str);

    @ll.e
    @o("mall/trade/sell/change_on")
    z<Result<TradeRequstResult>> yb(@ll.c("data") String str);

    @ll.f("game/morelike/app")
    z<Result<MorelikeGameObj>> z0(@t("appid") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("bbs/app/waterfall/feeds")
    z<Result<ConceptFeedsResult>> z1(@t("topic_id") String str, @t("pull") int i10, @t("use_history") String str2, @t("lastval") String str3);

    @ll.e
    @o("bbs/app/profile/award/link")
    z<Result> z2(@t("h_src") String str, @ll.c("link_id") String str2, @ll.c("award_type") String str3, @u Map<String, String> map);

    @ll.f("mall/list/")
    z<Result<MallProductsObj>> z3(@u Map<String, String> map, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/retain_msg")
    z<Result<MallOrderCancelTipObj>> z4(@t("order_id") String str);

    @ll.e
    @o("mall/balance/upload/steam/info")
    z<Result> z5(@ll.c("data") String str, @ll.c("key") String str2, @ll.c("sid") String str3, @t("time_") String str4);

    @ll.f("bbs/app/profile/events")
    z<Result<ProfileEventResult>> z6(@t("userid") String str, @t(w.c.R) int i10, @t("limit") int i11, @t("lastval") String str2, @t("from_source") String str3);

    @ll.f("mall/trade/purchase/supply/send")
    z<Result> z7(@t("order_id") String str, @t("need_merge") String str2);

    @ll.f("bbs/app/user/discount_msg_detail")
    z<Result<GameDiscountListObj>> z8(@t("platform") String str, @t("timestamp") String str2, @t(w.c.R) int i10, @t("limit") int i11);

    @ll.f("mall/cart/order/exchange_cdkey")
    z<Result<GamePurchaseResultObj>> z9(@t("coupon_id") String str);

    @ll.e
    @o("bbs/app/api/app_exposure/count/set")
    z<Result> za(@ll.c("exposure_cnt") String str, @ll.c("link_id") String str2);

    @ll.f("game/get_game_bundle_detail/")
    z<Result<GameListObj>> zb(@t("bundle_id") String str, @t(w.c.R) int i10, @t("limit") int i11);
}
