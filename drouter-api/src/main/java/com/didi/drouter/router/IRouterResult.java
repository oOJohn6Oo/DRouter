package com.didi.drouter.router;

import androidx.annotation.NonNull;

/**
 * Created by gaowei on 2022/3/12
 */
public interface IRouterResult {

    void onResult(@NonNull Request request, @RouterState int state);
}
