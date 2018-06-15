package com.qingguatang.java5minute.course7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicControl {

    private static final Map<String,String> musics = new HashMap<>();
    @RequestMapping(value = "/song/music")
    //ResponseBody需要返回
    @ResponseBody
    public String getMusicSrc(String songId) {
        return musics.get(songId);
    }
    //PostConstruct先执行初始化
    @PostConstruct
    public void init(){
        musics.put("35847388",
                "http://m10.music.126.net/20180615212709/0caf9c838359ee818bfc99736e76e2e1/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");
    }
}
