package com.frame.http;

import com.frame.joke.model.Back;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by xuning on 17/3/2.
 */

public interface HttpServers {

    @GET("/joke/content/list.from")
    Observable<Back> load(@QueryMap Map<String, String> map);
}
