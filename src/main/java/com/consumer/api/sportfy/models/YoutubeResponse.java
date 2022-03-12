package com.consumer.api.youtube.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class YoutubeResponse {

    private MostPopularVideosResponse popularVideos;

}
