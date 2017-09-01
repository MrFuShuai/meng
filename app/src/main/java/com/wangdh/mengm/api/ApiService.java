package com.wangdh.mengm.api;
import com.wangdh.mengm.bean.CelebratedDictum;
import com.wangdh.mengm.bean.CookBooksData;
import com.wangdh.mengm.bean.CookBookslistData;
import com.wangdh.mengm.bean.FunnyPicturesData;
import com.wangdh.mengm.bean.HealthitemData;
import com.wangdh.mengm.bean.JokeData;
import com.wangdh.mengm.bean.MeizhiData;
import com.wangdh.mengm.bean.NewListData;
import com.wangdh.mengm.bean.VideoData;
import com.wangdh.mengm.bean.WeChatListData;
import com.wangdh.mengm.bean.WechatImage;
import com.wangdh.mengm.ui.activity.FunnyPicturesActivity;

import java.util.Map;
import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * wdh
 */

public interface ApiService {

    @GET("http://api.avatardata.cn/MingRenMingYan/Random?key=7bc718abfae24a7294810102ac7538c3")
    Flowable<CelebratedDictum> splashRxjava();

    @GET("https://way.jd.com/jisuapi/get")
    Flowable<NewListData> newListDataRxjava(@QueryMap Map<String, String> params);

    @GET("https://way.jd.com/jisuapi/recipe_class")
    Flowable<CookBooksData> cookbooksRxjava(@Query("appkey") String key);

    @GET("https://way.jd.com/jisuapi/byclass")
    Flowable<CookBookslistData> cookbooksListRxjava(@QueryMap Map<String, String> params);

    @GET("90-86?showapi_appid=44640&showapi_sign=f255043723fe40839e61f6a40a6b0741")
    Flowable<HealthitemData> healthRxjava();

    @GET("582-2")
    Flowable<WeChatListData> weCharListDataRxjava(@QueryMap Map<String, String> params);

    //必应壁纸，n=1显示一张，2显示2张...
    @GET("http://www.bing.com/HPImageArchive.aspx?format=js&idx=0&n=1")
    Flowable<WechatImage> wecharImageRxjava();

    @GET("341-1")
    Flowable<JokeData> jokeRxjava(@QueryMap Map<String, String> params);

    @GET("{type}")
    Flowable<FunnyPicturesData> FunnyPicturesRxjava(@Path("type") String type, @QueryMap Map<String, String> params);

    @GET("http://gank.io/api/data/{type}/20/{page}")
    Flowable<MeizhiData> MeiZhiRxjava(@Path("type") String type,@Path("page") int page);

    @GET("255-1")
    Flowable<VideoData> videoRxjava(@QueryMap Map<String, String> params);
}
