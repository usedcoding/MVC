package org.example.wiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    long lastId = 0;
    List<WiseSaying> wiseSayingList = new ArrayList<>();


    public long create(String title, String content) {

        lastId++;
        WiseSaying wiseSaying = new WiseSaying(lastId, title, content);
        wiseSayingList.add(wiseSaying);

        return lastId;
    }

    public List<WiseSaying> getWiseSayingListAll() {
        return wiseSayingList;
    }



    public void remove(WiseSaying wiseSaying) {
       wiseSayingList.remove(wiseSaying);

    }

    public void modify(WiseSaying wiseSaying, String title, String content) {
        wiseSaying.setTitle(title);
        wiseSaying.setContent(content);
    }

    public WiseSaying wiseSayingFindById(long id) {
        for(int i = 0; i < wiseSayingList.size(); i++) {
            WiseSaying wiseSaying = wiseSayingList.get(i);
            if(wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }
}
