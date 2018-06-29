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
    //ResponseBody需要返回JSON
    @ResponseBody
    public String getMusicSrc(String songId) {
        return musics.get(songId);
    }
    //PostConstruct先执行初始化
    @PostConstruct
    public void init(){
        musics.put("35847388",
                "http://m10.music.126.net/20180629211754/0f78394ad9529a8ac1cd03f8751f6cbf/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");

        musics.put("16435049",
                "http://m10.music.126.net/20180629211914/f6a1c2a2881c6419bac8c5b9b4c88025/ymusic/0cce/0768/52ed/db86bd40d6ba02bc4dc09cc942216662.mp3");
    }
}
