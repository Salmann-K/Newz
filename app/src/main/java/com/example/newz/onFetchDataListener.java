package com.example.newz;

import com.example.newz.Models.NewsHeadlines;

import java.util.List;

public interface onFetchDataListener<NewsApiResponse>{

    void onFetchData(List<NewsHeadlines> list,String message);
    void onError(String message);
}
