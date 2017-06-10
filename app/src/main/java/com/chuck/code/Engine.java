package com.chuck.code;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/9/17 下午2:01
 * 描述:
 */
public interface Engine {
    @GET("raoshengdian//app/public/crowdfunding/queryCrowdFundingPublicList.spm")
    Call<Action1> loadInitDatas(@Query("currentPage") String currentPage, @Query("pageSize") String pageSize,@Query("cfpuType") String cfpuType);
//
//    @GET("refreshlayout/api/newdata{pageNumber}.json")
//    Call<List<RefreshModel>> loadNewData(@Path("pageNumber") int pageNumber);
//
//    @GET("refreshlayout/api/moredata{pageNumber}.json")
//    Call<List<RefreshModel>> loadMoreData(@Path("pageNumber") int pageNumber);
//
//    @GET("refreshlayout/api/staggered_default.json")
//    Call<List<StaggeredModel>> loadDefaultStaggeredData();
//
//    @GET("refreshlayout/api/staggered_new{pageNumber}.json")
//    Call<List<StaggeredModel>> loadNewStaggeredData(@Path("pageNumber") int pageNumber);
//
//    @GET("refreshlayout/api/staggered_more{pageNumber}.json")
//    Call<List<StaggeredModel>> loadMoreStaggeredData(@Path("pageNumber") int pageNumber);
//
//    @GET("banner/api/5item.json")
//    Call<BannerModel> getBannerModel();
}