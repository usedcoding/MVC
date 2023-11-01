package org.example.wiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    long id = 0;
    public long  create(long id, String title, String content) {
        id++;
        WiseSaying wiseSaying = new WiseSaying(id, title, content);
        wiseSayingList.add(wiseSaying);

        return id;
    }

    public List<WiseSaying> getWiseSayingListAll () {
        return wiseSayingList;
    }

    public void remove (WiseSaying wiseSaying) {
        wiseSayingList.remove(wiseSaying);
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

    public void modify(WiseSaying wiseSaying, String title, String content) {
        wiseSaying.setTitle(title);
        wiseSaying.setContent(content);
    }
}
